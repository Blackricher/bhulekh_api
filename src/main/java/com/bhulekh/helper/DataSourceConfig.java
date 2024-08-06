package com.bhulekh.helper;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(
    basePackages = "com.bhulekh.repository",
    transactionManagerRef = "transactionManager",
    entityManagerFactoryRef = "entityManager"
)
@EnableTransactionManagement
public class DataSourceConfig {

    @Bean
    @Primary
    public AbstractRoutingDataSource routingDataSource() {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DatabaseContext.DB1, primaryDataSource());
        targetDataSources.put(DatabaseContext.DB2, secondaryDataSource());
        targetDataSources.put(DatabaseContext.DB3, thirdDataSource());
        targetDataSources.put(DatabaseContext.DB4, fourthDataSource());
        targetDataSources.put(DatabaseContext.DB5, fifthDataSource());
        targetDataSources.put(DatabaseContext.DB6, sixthDataSource());

        AbstractRoutingDataSource routingDataSource = new AbstractRoutingDataSource() {
            @Override
            protected Object determineCurrentLookupKey() {
                return DataBaseContextHolder.getCurrentDb();
            }
        };

        routingDataSource.setDefaultTargetDataSource(primaryDataSource());
        routingDataSource.setTargetDataSources(targetDataSources);

        return routingDataSource;
    }

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "db1.datasource")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "db2.datasource")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "db3.datasource")
    public DataSource thirdDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "db4.datasource")
    public DataSource fourthDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "db5.datasource")
    public DataSource fifthDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "db6.datasource")
    public DataSource sixthDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "entityManager")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(routingDataSource());
        bean.setPackagesToScan("com.bhulekh.entity");

        JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        bean.setJpaVendorAdapter(adapter);

        Map<String, Object> props = new HashMap<>();
        props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        props.put("hibernate.show_sql", "true");
        bean.setJpaPropertyMap(props);

        return bean;
    }

    @Bean(name = "transactionManager")
    public JpaTransactionManager transactionManager(
            @Autowired @Qualifier("entityManager") LocalContainerEntityManagerFactoryBean entityManagerFactoryBean) {
        return new JpaTransactionManager(entityManagerFactoryBean.getObject());
    }
}

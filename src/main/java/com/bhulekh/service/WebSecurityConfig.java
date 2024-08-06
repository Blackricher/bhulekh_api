//package com.bhulekh.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.access.channel.ChannelProcessingFilter;
//
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .addFilterBefore(ipFilter(), ChannelProcessingFilter.class)
//            .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//            .csrf().disable(); // Disable CSRF protection
//    }
//
//    @Bean
//    public IPFilter ipFilter() {
//        return new IPFilter();
//    }
//}

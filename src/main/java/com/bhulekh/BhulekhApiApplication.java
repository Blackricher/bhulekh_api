package com.bhulekh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;


//@EnableSwagger2
@SpringBootApplication
@ServletComponentScan
@EnableAsync
public class BhulekhApiApplication extends SpringBootServletInitializer {

	@Override

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(BhulekhApiApplication.class);

	}
	
	public static void main(String[] args) {
		SpringApplication.run(BhulekhApiApplication.class, args);
	}
	
	

	

}

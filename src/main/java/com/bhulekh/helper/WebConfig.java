package com.bhulekh.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Autowired
	private RequestInterceptor dataSourceInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	//	registry.addInterceptor(dataSourceInterceptor).excludePathPatterns("/api/authenticate").addPathPatterns("/**");
		registry.addInterceptor(dataSourceInterceptor).excludePathPatterns("/api/authenticate")
				.addPathPatterns("/api/**");
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}
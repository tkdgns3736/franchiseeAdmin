package com.pinple.store.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.pinple.store.interceptor.AuthenticationInterceptor;




@Configuration
public class WebConfigurer implements WebMvcConfigurer{

	

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new AuthenticationInterceptor()).addPathPatterns("/**").excludePathPatterns("/js/**","/favicon.ico/**","/assets/**","/js/**", "/css/**", "/json/**","/favicon.ico/**");
	}
}

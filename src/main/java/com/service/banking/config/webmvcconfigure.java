package com.service.banking.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webmvcconfigure implements WebMvcConfigurer {
	
	  @Override
	    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
	        PageableHandlerMethodArgumentResolver resolver = new PageableHandlerMethodArgumentResolver();
	        resolver.setOneIndexedParameters(true);
	        argumentResolvers.add(resolver);
	        WebMvcConfigurer.super.addArgumentResolvers(argumentResolvers);
	    }
	
	

}

package com.woniu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// 允许客户端跨域请求
				registry.addMapping("/**")
					.allowedOrigins("*")
					.allowedMethods("*") 
					.allowedHeaders("*")
					.allowCredentials(true)
					.maxAge(60);
	}
	
}

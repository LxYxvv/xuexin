package com.example.xuexin.config;

import com.example.xuexin.interceptor.NotLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new NotLoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/user/login");
    }
}

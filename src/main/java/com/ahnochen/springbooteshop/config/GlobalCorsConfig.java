package com.ahnochen.springbooteshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class GlobalCorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
        corsRegistry.addMapping("/**")
//                .allowedOriginPattern("*")
                .allowedMethods("POST","GET","PUT","DELETE")
                .maxAge(10000)
                .allowedHeaders("*")
                .allowCredentials(false);
    }
}
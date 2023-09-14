package com.example.customer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/customers")  // Configure the specific URL pattern to allow CORS
            .allowedOrigins("http://localhost:4200")  // Specify the allowed origin
            .allowedMethods("GET", "POST", "PUT", "DELETE")  // Specify the allowed HTTP methods
            .allowedHeaders("*");  // Specify the allowed headers
    }
}


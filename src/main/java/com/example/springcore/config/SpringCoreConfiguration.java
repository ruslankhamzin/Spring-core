package com.example.springcore.config;

import com.example.springcore.service.SpringCoreService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCoreConfiguration {
    @Bean
    public SpringCoreService springCoreService() {
        return new SpringCoreService();
    }
}

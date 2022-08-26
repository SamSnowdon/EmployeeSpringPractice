package com.employees.demo.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class Config {
    @Bean
    public RestTemplate getRestAPI(){
        return new RestTemplateBuilder().build();
    }
}

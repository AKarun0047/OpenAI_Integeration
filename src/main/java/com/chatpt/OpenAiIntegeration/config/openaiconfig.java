package com.chatpt.OpenAiIntegeration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class openaiconfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

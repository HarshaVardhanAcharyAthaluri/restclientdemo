package com.harshatrainings.secondservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestConfig {

    @Bean
    public RestClient serviceOneClient() {
        return RestClient.builder()
                .baseUrl("http://localhost:8081")
                .build();
    }

}

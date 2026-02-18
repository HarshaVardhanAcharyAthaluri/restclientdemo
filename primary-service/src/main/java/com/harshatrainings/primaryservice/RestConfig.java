package com.harshatrainings.primaryservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestConfig {

    @Bean
    public RestClient serviceOneClient() {
        return RestClient.builder()
                .baseUrl("http://localhost:9090")
                .build();
    }


}

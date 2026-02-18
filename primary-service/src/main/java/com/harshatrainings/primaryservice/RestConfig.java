package com.harshatrainings.primaryservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestConfig {


// Restclient Builder avilable in HttpCLient Dependency. add httclient starter to use
    //to build without http client dependency check secondary service
    @Bean
    public RestClient restClient(RestClient.Builder builder) {
        return builder
                .baseUrl("http://localhost:9090")
                .build();
    }


}

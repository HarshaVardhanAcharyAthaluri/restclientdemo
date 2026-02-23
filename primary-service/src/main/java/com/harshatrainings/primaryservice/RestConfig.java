package com.harshatrainings.primaryservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestClient;

@Configuration
public class RestConfig {

    @Bean("lbclient")
    @LoadBalanced
    public RestClient.Builder lbRestClientBuilder() {
        return RestClient.builder();
    }

    @Bean
    @Primary
    public RestClient.Builder directRestClientBuilder() {
        return RestClient.builder();
    }

    @Bean
    @Primary
    public RestClient serviceRestClient(
            @Qualifier("lbclient") RestClient.Builder builder) {
        return builder.baseUrl("http://second-service").build();
    }




}

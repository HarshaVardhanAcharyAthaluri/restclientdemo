package com.harshatrainings.primaryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PrimaryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimaryServiceApplication.class, args);
    }

}

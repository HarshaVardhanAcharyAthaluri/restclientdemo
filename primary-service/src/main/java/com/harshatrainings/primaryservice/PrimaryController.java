package com.harshatrainings.primaryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class PrimaryController {


    @Autowired
    private  RestClient restClient;


    @GetMapping("/greet")
    public String greet(){
        return restClient.get().uri("/msg").retrieve().body(String.class);
    }

}

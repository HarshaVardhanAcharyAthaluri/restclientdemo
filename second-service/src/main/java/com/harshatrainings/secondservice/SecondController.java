package com.harshatrainings.secondservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class SecondController {


    @GetMapping("/msg")
    public String sendMsg(){
        return "Hello World!!!!";
    }


}

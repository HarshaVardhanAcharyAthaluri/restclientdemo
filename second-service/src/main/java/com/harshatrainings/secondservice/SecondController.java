package com.harshatrainings.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @GetMapping("/msg")
    public String sendMsg(){
        return "Message from SecondController";
    }


}

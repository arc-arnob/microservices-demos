package com.serviceb.servicebzuuldemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceb")
public class ServiceBController {
    
    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "welcomeMessage from service b called";
    }
    
}

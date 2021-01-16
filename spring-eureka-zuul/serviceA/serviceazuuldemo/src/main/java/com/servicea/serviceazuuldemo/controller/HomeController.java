package com.servicea.serviceazuuldemo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicea")
public class HomeController {

    @GetMapping("/welcome")
    public String getWelcomeMessage(){
        return "Welcome method of service A";
    }

    @GetMapping("/lists")
    public String getListOfStrings(){
        return "getListOfString Method called";
    }

    
}

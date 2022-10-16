package com.clickatell.poc.greeting.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class GreetingAppController {

    @GetMapping("/")
    public String greeting(){
	return "Spring is here!";
    }


    @GetMapping("/health")
    public String health(){
        return "HEALTH CHECK OK!";
    }

}

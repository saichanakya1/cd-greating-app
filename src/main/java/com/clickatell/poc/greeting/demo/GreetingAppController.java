package com.clickatell.poc.greeting.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingAppController {

    @RequestMapping("/")
    public String greeting(){
	return "Spring is here!";
    }

}

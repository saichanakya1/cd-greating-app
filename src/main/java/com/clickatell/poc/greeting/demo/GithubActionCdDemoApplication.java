package com.clickatell.poc.greeting.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubActionCdDemoApplication {

    // call run() inside main() method 
    public static void main(String[] args) {
	SpringApplication.run(GithubActionCdDemoApplication.class, args);
    }

    @GetMapping("/home")
    public String home(){
        return "Spring is here!";
    }

}

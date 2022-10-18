package com.clickatell.poc.greeting.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class GithubActionCdDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    GithubActionCdDemoApplication githubActionCdDemoApplication;

    @Test
    void home() {
        assertEquals( "Spring is here!", githubActionCdDemoApplication.home());
    }

}

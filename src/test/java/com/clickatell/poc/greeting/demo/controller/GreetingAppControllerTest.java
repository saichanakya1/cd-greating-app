package com.clickatell.poc.greeting.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class GreetingAppControllerTest {

    @Autowired
    GreetingAppController greetingAppController;

    @Test
    void health() {
        assertEquals( "HEALTH CHECK OK!", greetingAppController.health());
    }

    @Test
    void greeting() {
        assertEquals( "Spring is here!", greetingAppController.greeting());
    }
}

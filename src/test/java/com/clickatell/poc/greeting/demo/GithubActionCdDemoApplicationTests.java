package com.clickatell.poc.greeting.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GithubActionCdDemoApplicationTests {

    @Autowired
    GithubActionCdDemoApplication githubActionCdDemoApplication;

    @Test
    void contextLoads() {
        assertThat(githubActionCdDemoApplication).isNotNull();;
    }

}

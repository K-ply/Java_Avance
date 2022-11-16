package com.example.demo;

import com.example.demo.controller.PingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PingApplicationTests {
    @Autowired
    private PingController pingcontroller;
    @Test
    public void Ping() throws Exception {
        String body = this.pingcontroller.ping();
        assertThat(body).isEqualTo("Good!");
    }
}

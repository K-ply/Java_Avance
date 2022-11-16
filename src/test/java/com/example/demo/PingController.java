package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RestController

public class PingController {

    @GetMapping("/ping")
    public String ping(){
        return "Good!";
    }
}

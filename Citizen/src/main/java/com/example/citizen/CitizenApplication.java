package com.example.citizen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CitizenApplication {

    public static void main(String[] args) {
        SpringApplication.run(CitizenApplication.class, args);
    }

}

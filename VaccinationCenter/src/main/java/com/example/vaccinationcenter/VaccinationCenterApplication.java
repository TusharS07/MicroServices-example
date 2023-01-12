package com.example.vaccinationcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class VaccinationCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(VaccinationCenterApplication.class, args);
        System.out.println("Started");
    }

}

package com.example.citizen.configure;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CitizensConfig {

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

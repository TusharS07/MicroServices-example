package com.example.vaccinationcenter.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Employee_Payroll").apiInfo(apiInfo()).select().build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Vaccination Data", "Vaccination Data.", "1.0", "Terms of Service", new Contact("Tushar Salunkhe" ,"https://github.com/TusharS07", "tushars1289@gmail.com"), "Apache License Version 2.0", "https://www.apache.org/licenses/", Collections.emptyList());

    }

}

package com.example.citizen.exception;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = CitizensException.class)
    public String citizenAlreadyExist(CitizensException citizensException) {
        return citizensException.getMessage();

    }
}

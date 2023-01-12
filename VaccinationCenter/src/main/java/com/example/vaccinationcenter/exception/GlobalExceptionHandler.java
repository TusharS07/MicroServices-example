package com.example.vaccinationcenter.exception;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = CenterException.class)
    public String centerAlreadyExist(CenterException centerException) {
        return centerException.getMessage();

    }
}

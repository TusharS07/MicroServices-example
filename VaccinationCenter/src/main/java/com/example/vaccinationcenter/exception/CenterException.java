package com.example.vaccinationcenter.exception;

public class CenterException extends RuntimeException{
    String message;

    public CenterException(String message) {
        this.message = message;
    }

    public CenterException(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

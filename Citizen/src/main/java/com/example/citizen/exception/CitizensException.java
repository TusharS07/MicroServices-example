package com.example.citizen.exception;

public class CitizensException extends RuntimeException{
    String message;

    public CitizensException(String message) {
        this.message = message;
    }

    public CitizensException(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

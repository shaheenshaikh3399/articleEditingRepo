package com.example.userservice.exception;

public class GlobalExceptionHandler extends RuntimeException {

    public GlobalExceptionHandler(String message) {
        super(message);
    }
}

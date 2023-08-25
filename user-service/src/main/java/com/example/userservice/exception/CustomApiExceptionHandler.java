package com.example.userservice.exception;

import com.example.userservice.dto.CustomApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomApiExceptionHandler {

    @ExceptionHandler(GlobalExceptionHandler.class)
    public ResponseEntity<CustomApiResponse> customApiExceptionHandler(GlobalExceptionHandler ex){
        return new ResponseEntity<CustomApiResponse>(
                CustomApiResponse.builder()
                        .message(ex.getMessage())
                        .success(true)
                        .build(), HttpStatus.BAD_REQUEST
        );
    }

}

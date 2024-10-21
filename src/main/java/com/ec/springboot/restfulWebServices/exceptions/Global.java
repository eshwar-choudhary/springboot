package com.ec.springboot.restfulWebServices.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Global {

    @ExceptionHandler(ProductNotFound.class)
    public ResponseEntity<Object> handleProductNotFound(ProductNotFound ex) {
        return new ResponseEntity<>("Error: " + ex.getMessage(), HttpStatus.NOT_FOUND);
    }

}

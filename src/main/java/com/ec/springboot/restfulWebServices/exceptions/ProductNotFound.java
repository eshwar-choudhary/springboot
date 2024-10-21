package com.ec.springboot.restfulWebServices.exceptions;

public class ProductNotFound extends RuntimeException {

    public ProductNotFound(String message) {
        super(message);
    }
}

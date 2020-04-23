package com.company;

public class NoEntityException extends Exception {

    public NoEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public NoEntityException(){}
}

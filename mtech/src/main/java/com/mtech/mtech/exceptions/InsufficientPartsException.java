package com.mtech.mtech.exceptions;

public class InsufficientPartsException extends RuntimeException {

    public InsufficientPartsException(String message) {
        super(message);
    }

    public InsufficientPartsException(String message, Throwable cause) {
        super(message, cause);
    }
}
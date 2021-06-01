package com.upendiproject.localanimalapi.exception;

public class LocalAnimalApiException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public LocalAnimalApiException(String message, Throwable t) {
        super(message, t);
    }

    public LocalAnimalApiException(String message) {
        super(message);
    }
}

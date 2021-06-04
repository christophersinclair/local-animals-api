package com.upendiproject.localanimalapi.exception;

public class UserAlreadyExistsException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UserAlreadyExistsException(String message, Throwable t) { super(message, t); }

    public UserAlreadyExistsException(String message) { super(message); }
}

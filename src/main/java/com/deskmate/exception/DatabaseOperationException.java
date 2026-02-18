package com.deskmate.exception;

@SuppressWarnings("serial")
public class DatabaseOperationException extends RuntimeException {
    public DatabaseOperationException(String message, Throwable cause) { super(message, cause); }
}

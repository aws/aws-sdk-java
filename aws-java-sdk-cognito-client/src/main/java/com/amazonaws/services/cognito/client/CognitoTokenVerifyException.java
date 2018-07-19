package com.amazonaws.services.cognito.client;

public class CognitoTokenVerifyException extends Exception {

    public CognitoTokenVerifyException(String message) {
        super(message);
    }

    public CognitoTokenVerifyException(String message, Throwable cause) {
        super(message, cause);
    }
}

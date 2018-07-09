package com.amazonaws.services.cognito.client;

public interface CognitoTokenVerifier<T> {

    /**
     * Verifies the Cognito Token
     *
     * @throws CognitoTokenVerifyException Failed validation
     * @return payload of verified Cognito token
     */
    T verify(String token) throws CognitoTokenVerifyException;
}

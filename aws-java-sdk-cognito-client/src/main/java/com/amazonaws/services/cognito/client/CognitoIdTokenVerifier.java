package com.amazonaws.services.cognito.client;

public class CognitoIdTokenVerifier implements CognitoTokenVerifier<CognitoIdToken> {

    private final CognitoTokenVerifier<String> verifier;

    public static CognitoIdTokenVerifier getInstance(CognitoClientInfo info) {
        return new CognitoIdTokenVerifier(CognitoIdTokenRawVerifier
                .getInstance(info));
    }

    private CognitoIdTokenVerifier(CognitoTokenVerifier<String> verifier) {
        this.verifier = verifier;
    }

    public CognitoIdToken verify(String idToken) throws CognitoTokenVerifyException {
        String jsonToken = verifier.verify(idToken);
        return CognitoJsonModule.toObject(jsonToken, CognitoIdToken.class);
    }
}

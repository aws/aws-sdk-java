package com.amazonaws.services.cognito.client;

public class CognitoAccessTokenVerifier implements CognitoTokenVerifier<CognitoAccessToken> {

    private CognitoTokenVerifier<String> verifier;

    public static CognitoAccessTokenVerifier getInstance(CognitoClientInfo clientInfo) {
        return new CognitoAccessTokenVerifier(CognitoAccessTokenRawVerifier
                .getInstance(clientInfo));
    }

    private CognitoAccessTokenVerifier(CognitoTokenVerifier<String> verifier) {
        this.verifier = verifier;
    }

    public CognitoAccessToken verify(String idToken) throws CognitoTokenVerifyException {
        String jsonToken = verifier.verify(idToken);
        return CognitoJsonModule.toObject(jsonToken, CognitoAccessToken.class);
    }
}

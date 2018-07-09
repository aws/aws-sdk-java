package com.amazonaws.services.cognito.client;

import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.JwtConsumer;

public class CognitoIdTokenRawVerifier implements CognitoTokenVerifier<String> {

    private final JwtConsumer jwtConsumer;

    public static CognitoIdTokenRawVerifier getInstance(CognitoClientInfo info) {
        JwtConsumer jwtConsumer = CognitoTokenVerifiers.getConsumerBuilder(info)
                .setExpectedAudience(info.userPoolClientId())
                .build();
        return new CognitoIdTokenRawVerifier(jwtConsumer);
    }

    private CognitoIdTokenRawVerifier(JwtConsumer jwtConsumer) {
        this.jwtConsumer = jwtConsumer;
    }

    public String verify(String idToken) throws CognitoTokenVerifyException {
        JwtClaims jwtClaims = CognitoTokenVerifiers.verifyClaims(jwtConsumer, idToken);
        CognitoTokenVerifiers.expectedTokenUse(jwtClaims, CognitoTokenUse.id);
        return jwtClaims.getRawJson();
    }
}

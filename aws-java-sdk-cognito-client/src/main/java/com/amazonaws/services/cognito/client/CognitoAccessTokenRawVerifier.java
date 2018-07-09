package com.amazonaws.services.cognito.client;

import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.JwtConsumer;

public class CognitoAccessTokenRawVerifier implements CognitoTokenVerifier<String> {

    private final CognitoClientInfo clientInfo;
    private final JwtConsumer jwtConsumer;

    public static CognitoAccessTokenRawVerifier getInstance(CognitoClientInfo clientInfo) {
        JwtConsumer jwtConsumer = CognitoTokenVerifiers.getConsumerBuilder(clientInfo)
                .build();
        return new CognitoAccessTokenRawVerifier(jwtConsumer, clientInfo);
    }

    private CognitoAccessTokenRawVerifier(JwtConsumer jwtConsumer, CognitoClientInfo clientInfo) {
        this.jwtConsumer = jwtConsumer;
        this.clientInfo = clientInfo;
    }

    public String verify(String idToken) throws CognitoTokenVerifyException {
        JwtClaims jwtClaims = CognitoTokenVerifiers.verifyClaims(jwtConsumer, idToken);
        CognitoTokenVerifiers.expectedTokenUse(jwtClaims, CognitoTokenUse.access);
        CognitoTokenVerifiers.expectedClaim(jwtClaims, CognitoTokenConstants.CLIENT_ID, clientInfo.userPoolClientId());
        return jwtClaims.getRawJson();
    }
}

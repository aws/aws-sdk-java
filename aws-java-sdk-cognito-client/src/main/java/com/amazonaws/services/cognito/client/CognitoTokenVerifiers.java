package com.amazonaws.services.cognito.client;

import org.jose4j.jwa.AlgorithmConstraints;
import org.jose4j.jwk.HttpsJwks;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.jose4j.keys.resolvers.HttpsJwksVerificationKeyResolver;

class CognitoTokenVerifiers {
    private CognitoTokenVerifiers() {
        // not intended for instantiation
    }

    public static JwtConsumerBuilder getConsumerBuilder(CognitoClientInfo info) {
        HttpsJwks httpsJkws = new HttpsJwks(info.getJwksUrl());
        HttpsJwksVerificationKeyResolver httpsJwksKeyResolver = new HttpsJwksVerificationKeyResolver(httpsJkws);
        return new JwtConsumerBuilder()
                .setRequireExpirationTime()
                .setAllowedClockSkewInSeconds(30)
                .setRequireSubject()
                .setExpectedIssuer(info.getIssuer())
                .setVerificationKeyResolver(httpsJwksKeyResolver)
                .setJwsAlgorithmConstraints(
                        new AlgorithmConstraints(AlgorithmConstraints.ConstraintType.WHITELIST,
                                AlgorithmIdentifiers.RSA_USING_SHA256));
    }

    public static JwtClaims verifyClaims(JwtConsumer jwtConsumer, String idToken) throws CognitoTokenVerifyException {
        try {
            return jwtConsumer.processToClaims(idToken);
        } catch (InvalidJwtException e) {
            throw new CognitoTokenVerifyException(e.getMessage(), e);
        }
    }

    public static void expectedTokenUse(JwtClaims jwtClaims, CognitoTokenUse use) throws CognitoTokenVerifyException {
        expectedClaim(jwtClaims, CognitoTokenConstants.TOKEN_USE, use.name());
    }

    // TODO add to jose4j
    public static void expectedClaim(JwtClaims jwtClaims, String key, String value) throws CognitoTokenVerifyException {
        try {
            String actualValue = jwtClaims.getStringClaimValue(key);
            if (actualValue == null || !actualValue.equals(value)) {
                String message = "JWT had wrong " + key + ": " + actualValue;
                throw new CognitoTokenVerifyException(message);
            }
        } catch (MalformedClaimException e) {
            throw new CognitoTokenVerifyException(e.getMessage(), e);
        }
    }
}

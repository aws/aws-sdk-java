package com.amazonaws.services.cognito.client;

import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;
import org.jose4j.lang.JoseException;

public class CognitoHttpJwksServer {
    private final HttpJwksServerRule jwksServerRule;

    public CognitoHttpJwksServer(HttpJwksServerRule jwksServerRule) {
        this.jwksServerRule = jwksServerRule;
    }

    public String getJwksUrl() {
        return jwksServerRule.getJwksUrl();
    }

    public String getJwt(CognitoIdToken token) {
        JwtClaims claims = convert(token);
        try {
            return jwksServerRule.getJwt(claims);
        } catch (JoseException e) {
            throw new RuntimeException(e);
        }
    }

    static JwtClaims convert(CognitoIdToken token) {
        JwtClaims claims = new JwtClaims();
        claims.setIssuer(token.issuer());
        claims.setAudience(token.audience());
        claims.setExpirationTime(NumericDate.fromSeconds(token.expirationTime().getEpochSecond()));
        claims.setGeneratedJwtId();
        claims.setIssuedAt(NumericDate.fromSeconds(token.issuedAtTime().getEpochSecond()));
        claims.setNotBeforeMinutesInThePast(2);
        claims.setSubject(token.subject().toString());
        claims.setClaim(CognitoTokenConstants.AUTH_TIME, token.authenticationTime().getEpochSecond());
        claims.setClaim(CognitoTokenConstants.EMAIL, token.email());
        claims.setClaim(CognitoTokenConstants.EMAIL_VERIFIED,token.emailVerified());
        claims.setClaim(CognitoTokenConstants.EVENT_ID, token.eventId());
        claims.setClaim(CognitoTokenConstants.TOKEN_USE, token.tokenUse());
        claims.setClaim(CognitoTokenConstants.COGNITO_USERNAME, token.cognitoUsername());
        return claims;
    }
}

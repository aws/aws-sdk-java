package com.amazonaws.services.cognito.client;

import org.jose4j.jwt.consumer.ErrorCodes;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class CognitoIdTokenVerifierTest {

    @Rule
    public JoseTestRules.CognitoJwksRule jwksRule = JoseTestRules.testCognitoJwksServer();

    @Ignore
    @Test
    public void testActual() throws CognitoTokenVerifyException {
        CognitoClientInfo info = CognitoClientInfo.builder()
                .userPoolRegion("us-west-2")
                .userPoolId("us-west-2_xxxxxx")
                .userPoolClientId("aaaaaaaaaaaaaaaaaaaaaaaaaa")
                .build();
        CognitoIdTokenVerifier verifier = CognitoIdTokenVerifier.getInstance(info);
        CognitoIdToken token = verifier.verify("11111111111.22222222222.33333333333");
        System.out.println(token);
    }

    @Test
    public void testValid() throws CognitoTokenVerifyException {
        CognitoIdToken expected = CognitoTokenTestItems.validIdToken();
        String jwt = jwksRule.jwksServer.getJwt(expected);
        CognitoIdTokenVerifier verifier = CognitoIdTokenVerifier.getInstance(CognitoClientInfo.builder()
                .userPoolClientId(expected.audience())
                .issuer(expected.issuer())
                .jwksUrl(jwksRule.jwksServer.getJwksUrl())
                .build());
        CognitoIdToken actual = verifier.verify(jwt);
        assertEquals(expected, actual);
    }

    @Test
    public void testExpired() {
        CognitoIdToken expired = CognitoTokenTestItems.expiredIdToken();
        String jwt = jwksRule.jwksServer.getJwt(expired);
        CognitoIdTokenRawVerifier verifier = CognitoIdTokenRawVerifier.getInstance(CognitoClientInfo.builder()
                .userPoolClientId(expired.audience())
                .issuer(expired.issuer())
                .jwksUrl(jwksRule.jwksServer.getJwksUrl())
                .build());
        try {
            verifier.verify(jwt);
            fail("Expired token expected");
        } catch (CognitoTokenVerifyException e) {
            assertTrue(InvalidJwtException.class.isAssignableFrom(e.getCause().getClass()));
            InvalidJwtException jwtException = (InvalidJwtException) e.getCause();
            assertTrue(jwtException.hasExpired());
        }
    }

    @Test
    public void testInvalidAudience() {
        CognitoIdToken expected = CognitoTokenTestItems.validIdToken();
        String jwt = jwksRule.jwksServer.getJwt(expected);
        CognitoIdTokenRawVerifier verifier = CognitoIdTokenRawVerifier.getInstance(CognitoClientInfo.builder()
                .userPoolClientId("non-matching-client-id")
                .issuer(expected.issuer())
                .jwksUrl(jwksRule.jwksServer.getJwksUrl())
                .build());
        try {
            verifier.verify(jwt);
            fail("Non matching audience token expected");
        } catch (CognitoTokenVerifyException e) {
            assertTrue(InvalidJwtException.class.isAssignableFrom(e.getCause().getClass()));
            InvalidJwtException jwtException = (InvalidJwtException) e.getCause();
            assertTrue(jwtException.hasErrorCode(ErrorCodes.AUDIENCE_INVALID));
        }
    }

    @Test
    public void testInvalidIssuer() {
        CognitoIdToken expected = CognitoTokenTestItems.validIdToken();
        String jwt = jwksRule.jwksServer.getJwt(expected);
        CognitoIdTokenRawVerifier verifier = CognitoIdTokenRawVerifier.getInstance(CognitoClientInfo.builder()
                .userPoolClientId(expected.audience())
                .issuer("non-matching-issuer")
                .jwksUrl(jwksRule.jwksServer.getJwksUrl())
                .build());
        try {
            verifier.verify(jwt);
            fail("Non matching issuer token expected");
        } catch (CognitoTokenVerifyException e) {
            assertTrue(InvalidJwtException.class.isAssignableFrom(e.getCause().getClass()));
            InvalidJwtException jwtException = (InvalidJwtException) e.getCause();
            assertTrue(jwtException.hasErrorCode(ErrorCodes.ISSUER_INVALID));
        }
    }

    @Test
    public void testInvalidTokenUse() {
        CognitoIdToken expected = CognitoIdToken.builder()
                .from(CognitoTokenTestItems.validIdToken())
                .tokenUse(CognitoTokenUse.access)
                .build();
        String jwt = jwksRule.jwksServer.getJwt(expected);
        CognitoIdTokenRawVerifier verifier = CognitoIdTokenRawVerifier.getInstance(CognitoClientInfo.builder()
                .userPoolClientId(expected.audience())
                .issuer(expected.issuer())
                .jwksUrl(jwksRule.jwksServer.getJwksUrl())
                .build());
        try {
            verifier.verify(jwt);
            fail("id token_use expected");
        } catch (CognitoTokenVerifyException e) {
            assertThat(e.getMessage(), containsString(CognitoTokenConstants.TOKEN_USE));
        }
    }
}

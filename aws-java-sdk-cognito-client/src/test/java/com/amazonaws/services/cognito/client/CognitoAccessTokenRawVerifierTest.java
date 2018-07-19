package com.amazonaws.services.cognito.client;

import org.junit.Ignore;
import org.junit.Test;

public class CognitoAccessTokenRawVerifierTest {

    @Ignore
    @Test
    public void testActual() throws CognitoTokenVerifyException {
        CognitoClientInfo info = CognitoClientInfo.builder()
                .userPoolRegion("us-west-2")
                .userPoolId("us-west-2_xxxxxx")
                .userPoolClientId("aaaaaaaaaaaaaaaaaaaaaaaaaa")
                .build();
        CognitoAccessTokenVerifier verifier = CognitoAccessTokenVerifier.getInstance(info);
        CognitoAccessToken token = verifier.verify("11111111111.22222222222.33333333333");
        System.out.println(token);
    }
}

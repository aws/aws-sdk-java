package com.amazonaws.services.cognito.client;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class CognitoTokenTestItems {

    private CognitoTokenTestItems() {
        // not intended for instantiation
    }

    public static CognitoIdToken expiredIdToken() {
        Instant past = Instant.now().minus(1, ChronoUnit.MINUTES).truncatedTo(ChronoUnit.SECONDS);
        return CognitoIdToken.builder()
                .from(validIdToken())
                .expirationTime(past)
                .build();
    }

    public static CognitoIdToken validIdToken() {
        Instant now = Instant.now().truncatedTo(ChronoUnit.SECONDS);
        Instant future = Instant.now().plus(10, ChronoUnit.MINUTES).truncatedTo(ChronoUnit.SECONDS);
        return CognitoIdToken.builder()
                .audience("myClientId")
                .authenticationTime(now)
                .email("mail@example.com")
                .emailVerified(true)
                .eventId(UUID.randomUUID())
                .expirationTime(future)
                .issuedAtTime(now)
                .issuer("myIssuer")
                .subject(UUID.randomUUID())
                .tokenUse(CognitoTokenUse.id)
                .cognitoUsername("cognitoUsername")
                .build();
    }
}

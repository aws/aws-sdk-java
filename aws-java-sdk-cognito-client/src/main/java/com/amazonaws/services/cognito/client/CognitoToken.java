package com.amazonaws.services.cognito.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jose4j.jwt.ReservedClaimNames;

import java.time.Instant;
import java.util.UUID;

public interface CognitoToken {

    @JsonProperty(ReservedClaimNames.SUBJECT)
    UUID subject();

    @JsonProperty(ReservedClaimNames.ISSUER)
    String issuer();

    @JsonProperty(ReservedClaimNames.EXPIRATION_TIME)
    Instant expirationTime();

    @JsonProperty(ReservedClaimNames.ISSUED_AT)
    Instant issuedAtTime();

    @JsonProperty(CognitoTokenConstants.AUTH_TIME)
    Instant authenticationTime();

    @JsonProperty(CognitoTokenConstants.EVENT_ID)
    UUID eventId();

    @JsonProperty(CognitoTokenConstants.TOKEN_USE)
    CognitoTokenUse tokenUse();
}

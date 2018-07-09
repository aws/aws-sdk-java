package com.amazonaws.services.cognito.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jose4j.jwt.ReservedClaimNames;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, jdkOnly = true)
@JsonDeserialize(builder = CognitoIdToken.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface CognitoIdToken extends CognitoToken {

    @JsonProperty(ReservedClaimNames.AUDIENCE)
    String audience();

    @JsonProperty(CognitoTokenConstants.EMAIL)
    String email();

    @JsonProperty(CognitoTokenConstants.EMAIL_VERIFIED)
    Boolean emailVerified();

    @JsonProperty(CognitoTokenConstants.COGNITO_USERNAME)
    String cognitoUsername();

    @JsonCreator
    static Builder builder() {
        return new Builder();
    }

    final class Builder extends ImmutableCognitoIdToken.Builder {
        Builder() {}
    }
}

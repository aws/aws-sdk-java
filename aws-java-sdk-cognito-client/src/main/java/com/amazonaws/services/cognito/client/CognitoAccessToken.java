package com.amazonaws.services.cognito.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, jdkOnly = true)
@JsonDeserialize(builder = CognitoAccessToken.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface CognitoAccessToken extends CognitoToken {

    @JsonProperty(CognitoTokenConstants.CLIENT_ID)
    String clientId();

    @JsonProperty(CognitoTokenConstants.DEVICE_KEY)
    String deviceKey();

    @JsonProperty(CognitoTokenConstants.SCOPE)
    String scope();

    @JsonProperty(CognitoTokenConstants.USERNAME)
    String username();

    @JsonCreator
    static Builder builder() {
        return new Builder();
    }

    final class Builder extends ImmutableCognitoAccessToken.Builder {
        Builder() {}
    }
}

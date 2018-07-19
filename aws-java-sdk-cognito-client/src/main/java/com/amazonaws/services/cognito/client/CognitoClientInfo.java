package com.amazonaws.services.cognito.client;

import com.google.common.base.Preconditions;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE, jdkOnly = true)
public interface CognitoClientInfo {

    String userPoolClientId();
    Optional<String> userPoolRegion();
    Optional<String> userPoolId();
    Optional<String> jwksUrl();
    Optional<String> issuer();

    @Value.Check
    default void check() {
        boolean componentsPresent = userPoolRegion().isPresent() && userPoolId().isPresent();
        Preconditions.checkState(jwksUrl().isPresent() || componentsPresent,
                "Set jwksUrl or both userPoolRegion and userPoolId");
        Preconditions.checkState(issuer().isPresent() || componentsPresent,
                "Set issuer or both userPoolRegion and userPoolId");
    }

    default String getJwksUrl() {
        if (jwksUrl().isPresent()) {
            return jwksUrl().get();
        } else {
            return String.format(CognitoTokenConstants.COGNITO_JWKS_FORMAT, userPoolRegion().get(), userPoolId().get());
        }
    }

    default String getIssuer() {
        if (issuer().isPresent()) {
            return issuer().get();
        } else {
            return String.format(CognitoTokenConstants.COGNITO_ISSUER_FORMAT, userPoolRegion().get(), userPoolId().get());
        }
    }

    static Builder builder() {
        return new Builder();
    }

    final class Builder extends ImmutableCognitoClientInfo.Builder {
        Builder() {}
    }
}



package com.amazonaws.auth.profile.internal;

import com.amazonaws.annotation.SdkInternalApi;

@SdkInternalApi
public enum CredentialSourceType {
    EC2_INSTANCE_METADATA,
    ECS_CONTAINER,
    ENVIRONMENT;

    public static CredentialSourceType parse(String value) {
        if (value.equalsIgnoreCase("Ec2InstanceMetadata")) {
            return EC2_INSTANCE_METADATA;
        } else if (value.equalsIgnoreCase("EcsContainer")) {
            return ECS_CONTAINER;
        } else if (value.equalsIgnoreCase("Environment")) {
            return ENVIRONMENT;
        }

        throw new IllegalArgumentException(String.format("%s is not a valid credential_source", value));
    }
}

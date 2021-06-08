/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.nimblestudio.model;

import javax.annotation.Generated;

/**
 * <p>
 * The status code.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum StudioStatusCode {

    STUDIO_CREATED("STUDIO_CREATED"),
    STUDIO_DELETED("STUDIO_DELETED"),
    STUDIO_UPDATED("STUDIO_UPDATED"),
    STUDIO_CREATE_IN_PROGRESS("STUDIO_CREATE_IN_PROGRESS"),
    STUDIO_UPDATE_IN_PROGRESS("STUDIO_UPDATE_IN_PROGRESS"),
    STUDIO_DELETE_IN_PROGRESS("STUDIO_DELETE_IN_PROGRESS"),
    STUDIO_WITH_LAUNCH_PROFILES_NOT_DELETED("STUDIO_WITH_LAUNCH_PROFILES_NOT_DELETED"),
    STUDIO_WITH_STUDIO_COMPONENTS_NOT_DELETED("STUDIO_WITH_STUDIO_COMPONENTS_NOT_DELETED"),
    STUDIO_WITH_STREAMING_IMAGES_NOT_DELETED("STUDIO_WITH_STREAMING_IMAGES_NOT_DELETED"),
    AWS_SSO_NOT_ENABLED("AWS_SSO_NOT_ENABLED"),
    AWS_SSO_ACCESS_DENIED("AWS_SSO_ACCESS_DENIED"),
    ROLE_NOT_OWNED_BY_STUDIO_OWNER("ROLE_NOT_OWNED_BY_STUDIO_OWNER"),
    ROLE_COULD_NOT_BE_ASSUMED("ROLE_COULD_NOT_BE_ASSUMED"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    ENCRYPTION_KEY_NOT_FOUND("ENCRYPTION_KEY_NOT_FOUND"),
    ENCRYPTION_KEY_ACCESS_DENIED("ENCRYPTION_KEY_ACCESS_DENIED"),
    AWS_SSO_CONFIGURATION_REPAIRED("AWS_SSO_CONFIGURATION_REPAIRED"),
    AWS_SSO_CONFIGURATION_REPAIR_IN_PROGRESS("AWS_SSO_CONFIGURATION_REPAIR_IN_PROGRESS");

    private String value;

    private StudioStatusCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return StudioStatusCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static StudioStatusCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (StudioStatusCode enumEntry : StudioStatusCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

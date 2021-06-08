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
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LaunchProfileStatusCode {

    LAUNCH_PROFILE_CREATED("LAUNCH_PROFILE_CREATED"),
    LAUNCH_PROFILE_UPDATED("LAUNCH_PROFILE_UPDATED"),
    LAUNCH_PROFILE_DELETED("LAUNCH_PROFILE_DELETED"),
    LAUNCH_PROFILE_CREATE_IN_PROGRESS("LAUNCH_PROFILE_CREATE_IN_PROGRESS"),
    LAUNCH_PROFILE_UPDATE_IN_PROGRESS("LAUNCH_PROFILE_UPDATE_IN_PROGRESS"),
    LAUNCH_PROFILE_DELETE_IN_PROGRESS("LAUNCH_PROFILE_DELETE_IN_PROGRESS"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    STREAMING_IMAGE_NOT_FOUND("STREAMING_IMAGE_NOT_FOUND"),
    STREAMING_IMAGE_NOT_READY("STREAMING_IMAGE_NOT_READY"),
    LAUNCH_PROFILE_WITH_STREAM_SESSIONS_NOT_DELETED("LAUNCH_PROFILE_WITH_STREAM_SESSIONS_NOT_DELETED"),
    ENCRYPTION_KEY_ACCESS_DENIED("ENCRYPTION_KEY_ACCESS_DENIED"),
    ENCRYPTION_KEY_NOT_FOUND("ENCRYPTION_KEY_NOT_FOUND"),
    INVALID_SUBNETS_PROVIDED("INVALID_SUBNETS_PROVIDED");

    private String value;

    private LaunchProfileStatusCode(String value) {
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
     * @return LaunchProfileStatusCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LaunchProfileStatusCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LaunchProfileStatusCode enumEntry : LaunchProfileStatusCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

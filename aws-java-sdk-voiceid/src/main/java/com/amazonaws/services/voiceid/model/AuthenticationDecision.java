/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.voiceid.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AuthenticationDecision {

    ACCEPT("ACCEPT"),
    REJECT("REJECT"),
    NOT_ENOUGH_SPEECH("NOT_ENOUGH_SPEECH"),
    SPEAKER_NOT_ENROLLED("SPEAKER_NOT_ENROLLED"),
    SPEAKER_OPTED_OUT("SPEAKER_OPTED_OUT"),
    SPEAKER_ID_NOT_PROVIDED("SPEAKER_ID_NOT_PROVIDED"),
    SPEAKER_EXPIRED("SPEAKER_EXPIRED");

    private String value;

    private AuthenticationDecision(String value) {
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
     * @return AuthenticationDecision corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AuthenticationDecision fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AuthenticationDecision enumEntry : AuthenticationDecision.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

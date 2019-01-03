/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ChallengeNameType {

    SMS_MFA("SMS_MFA"),
    SOFTWARE_TOKEN_MFA("SOFTWARE_TOKEN_MFA"),
    SELECT_MFA_TYPE("SELECT_MFA_TYPE"),
    MFA_SETUP("MFA_SETUP"),
    PASSWORD_VERIFIER("PASSWORD_VERIFIER"),
    CUSTOM_CHALLENGE("CUSTOM_CHALLENGE"),
    DEVICE_SRP_AUTH("DEVICE_SRP_AUTH"),
    DEVICE_PASSWORD_VERIFIER("DEVICE_PASSWORD_VERIFIER"),
    ADMIN_NO_SRP_AUTH("ADMIN_NO_SRP_AUTH"),
    NEW_PASSWORD_REQUIRED("NEW_PASSWORD_REQUIRED");

    private String value;

    private ChallengeNameType(String value) {
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
     * @return ChallengeNameType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ChallengeNameType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ChallengeNameType enumEntry : ChallengeNameType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

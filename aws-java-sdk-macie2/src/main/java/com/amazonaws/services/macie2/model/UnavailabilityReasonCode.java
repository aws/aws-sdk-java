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
package com.amazonaws.services.macie2.model;

import javax.annotation.Generated;

/**
 * <p>
 * Specifies why occurrences of sensitive data can't be retrieved for a finding. Possible values are:
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum UnavailabilityReasonCode {

    OBJECT_EXCEEDS_SIZE_QUOTA("OBJECT_EXCEEDS_SIZE_QUOTA"),
    UNSUPPORTED_OBJECT_TYPE("UNSUPPORTED_OBJECT_TYPE"),
    UNSUPPORTED_FINDING_TYPE("UNSUPPORTED_FINDING_TYPE"),
    INVALID_CLASSIFICATION_RESULT("INVALID_CLASSIFICATION_RESULT"),
    OBJECT_UNAVAILABLE("OBJECT_UNAVAILABLE");

    private String value;

    private UnavailabilityReasonCode(String value) {
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
     * @return UnavailabilityReasonCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static UnavailabilityReasonCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (UnavailabilityReasonCode enumEntry : UnavailabilityReasonCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

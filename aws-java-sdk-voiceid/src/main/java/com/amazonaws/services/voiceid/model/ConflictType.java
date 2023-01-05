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
public enum ConflictType {

    ANOTHER_ACTIVE_STREAM("ANOTHER_ACTIVE_STREAM"),
    DOMAIN_NOT_ACTIVE("DOMAIN_NOT_ACTIVE"),
    CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT("CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT"),
    ENROLLMENT_ALREADY_EXISTS("ENROLLMENT_ALREADY_EXISTS"),
    SPEAKER_NOT_SET("SPEAKER_NOT_SET"),
    SPEAKER_OPTED_OUT("SPEAKER_OPTED_OUT"),
    CONCURRENT_CHANGES("CONCURRENT_CHANGES"),
    DOMAIN_LOCKED_FROM_ENCRYPTION_UPDATES("DOMAIN_LOCKED_FROM_ENCRYPTION_UPDATES");

    private String value;

    private ConflictType(String value) {
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
     * @return ConflictType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ConflictType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ConflictType enumEntry : ConflictType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

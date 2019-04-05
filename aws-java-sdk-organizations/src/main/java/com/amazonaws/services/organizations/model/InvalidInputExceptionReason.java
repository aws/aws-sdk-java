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
package com.amazonaws.services.organizations.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum InvalidInputExceptionReason {

    INVALID_PARTY_TYPE_TARGET("INVALID_PARTY_TYPE_TARGET"),
    INVALID_SYNTAX_ORGANIZATION_ARN("INVALID_SYNTAX_ORGANIZATION_ARN"),
    INVALID_SYNTAX_POLICY_ID("INVALID_SYNTAX_POLICY_ID"),
    INVALID_ENUM("INVALID_ENUM"),
    INVALID_LIST_MEMBER("INVALID_LIST_MEMBER"),
    MAX_LENGTH_EXCEEDED("MAX_LENGTH_EXCEEDED"),
    MAX_VALUE_EXCEEDED("MAX_VALUE_EXCEEDED"),
    MIN_LENGTH_EXCEEDED("MIN_LENGTH_EXCEEDED"),
    MIN_VALUE_EXCEEDED("MIN_VALUE_EXCEEDED"),
    IMMUTABLE_POLICY("IMMUTABLE_POLICY"),
    INVALID_PATTERN("INVALID_PATTERN"),
    INVALID_PATTERN_TARGET_ID("INVALID_PATTERN_TARGET_ID"),
    INPUT_REQUIRED("INPUT_REQUIRED"),
    INVALID_NEXT_TOKEN("INVALID_NEXT_TOKEN"),
    MAX_LIMIT_EXCEEDED_FILTER("MAX_LIMIT_EXCEEDED_FILTER"),
    MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS("MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS"),
    INVALID_FULL_NAME_TARGET("INVALID_FULL_NAME_TARGET"),
    UNRECOGNIZED_SERVICE_PRINCIPAL("UNRECOGNIZED_SERVICE_PRINCIPAL"),
    INVALID_ROLE_NAME("INVALID_ROLE_NAME");

    private String value;

    private InvalidInputExceptionReason(String value) {
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
     * @return InvalidInputExceptionReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InvalidInputExceptionReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InvalidInputExceptionReason enumEntry : InvalidInputExceptionReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

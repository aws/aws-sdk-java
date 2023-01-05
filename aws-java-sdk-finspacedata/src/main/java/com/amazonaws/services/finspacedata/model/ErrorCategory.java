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
package com.amazonaws.services.finspacedata.model;

import javax.annotation.Generated;

/**
 * Changeset Error Category
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ErrorCategory {

    VALIDATION("VALIDATION"),
    SERVICE_QUOTA_EXCEEDED("SERVICE_QUOTA_EXCEEDED"),
    ACCESS_DENIED("ACCESS_DENIED"),
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
    THROTTLING("THROTTLING"),
    INTERNAL_SERVICE_EXCEPTION("INTERNAL_SERVICE_EXCEPTION"),
    CANCELLED("CANCELLED"),
    USER_RECOVERABLE("USER_RECOVERABLE");

    private String value;

    private ErrorCategory(String value) {
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
     * @return ErrorCategory corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ErrorCategory fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ErrorCategory enumEntry : ErrorCategory.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

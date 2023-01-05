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
package com.amazonaws.services.transfer.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ExecutionErrorType {

    PERMISSION_DENIED("PERMISSION_DENIED"),
    CUSTOM_STEP_FAILED("CUSTOM_STEP_FAILED"),
    THROTTLED("THROTTLED"),
    ALREADY_EXISTS("ALREADY_EXISTS"),
    NOT_FOUND("NOT_FOUND"),
    BAD_REQUEST("BAD_REQUEST"),
    TIMEOUT("TIMEOUT"),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR");

    private String value;

    private ExecutionErrorType(String value) {
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
     * @return ExecutionErrorType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ExecutionErrorType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ExecutionErrorType enumEntry : ExecutionErrorType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

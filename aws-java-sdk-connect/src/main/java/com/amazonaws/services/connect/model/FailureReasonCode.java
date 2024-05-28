/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum FailureReasonCode {

    INVALID_ATTRIBUTE_KEY("INVALID_ATTRIBUTE_KEY"),
    INVALID_CUSTOMER_ENDPOINT("INVALID_CUSTOMER_ENDPOINT"),
    INVALID_SYSTEM_ENDPOINT("INVALID_SYSTEM_ENDPOINT"),
    INVALID_QUEUE("INVALID_QUEUE"),
    MISSING_CAMPAIGN("MISSING_CAMPAIGN"),
    MISSING_CUSTOMER_ENDPOINT("MISSING_CUSTOMER_ENDPOINT"),
    MISSING_QUEUE_ID_AND_SYSTEM_ENDPOINT("MISSING_QUEUE_ID_AND_SYSTEM_ENDPOINT"),
    REQUEST_THROTTLED("REQUEST_THROTTLED"),
    IDEMPOTENCY_EXCEPTION("IDEMPOTENCY_EXCEPTION"),
    INTERNAL_ERROR("INTERNAL_ERROR");

    private String value;

    private FailureReasonCode(String value) {
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
     * @return FailureReasonCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static FailureReasonCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FailureReasonCode enumEntry : FailureReasonCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

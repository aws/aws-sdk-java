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
package com.amazonaws.services.synthetics.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CanaryStateReasonCode {

    INVALID_PERMISSIONS("INVALID_PERMISSIONS"),
    CREATE_PENDING("CREATE_PENDING"),
    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_FAILED("CREATE_FAILED"),
    UPDATE_PENDING("UPDATE_PENDING"),
    UPDATE_IN_PROGRESS("UPDATE_IN_PROGRESS"),
    UPDATE_COMPLETE("UPDATE_COMPLETE"),
    ROLLBACK_COMPLETE("ROLLBACK_COMPLETE"),
    ROLLBACK_FAILED("ROLLBACK_FAILED"),
    DELETE_IN_PROGRESS("DELETE_IN_PROGRESS"),
    DELETE_FAILED("DELETE_FAILED"),
    SYNC_DELETE_IN_PROGRESS("SYNC_DELETE_IN_PROGRESS");

    private String value;

    private CanaryStateReasonCode(String value) {
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
     * @return CanaryStateReasonCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CanaryStateReasonCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CanaryStateReasonCode enumEntry : CanaryStateReasonCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

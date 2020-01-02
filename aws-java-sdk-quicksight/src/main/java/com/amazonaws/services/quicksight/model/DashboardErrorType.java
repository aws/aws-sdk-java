/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DashboardErrorType {

    DATA_SET_NOT_FOUND("DATA_SET_NOT_FOUND"),
    INTERNAL_FAILURE("INTERNAL_FAILURE"),
    PARAMETER_VALUE_INCOMPATIBLE("PARAMETER_VALUE_INCOMPATIBLE"),
    PARAMETER_TYPE_INVALID("PARAMETER_TYPE_INVALID"),
    PARAMETER_NOT_FOUND("PARAMETER_NOT_FOUND"),
    COLUMN_TYPE_MISMATCH("COLUMN_TYPE_MISMATCH"),
    COLUMN_GEOGRAPHIC_ROLE_MISMATCH("COLUMN_GEOGRAPHIC_ROLE_MISMATCH"),
    COLUMN_REPLACEMENT_MISSING("COLUMN_REPLACEMENT_MISSING");

    private String value;

    private DashboardErrorType(String value) {
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
     * @return DashboardErrorType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DashboardErrorType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DashboardErrorType enumEntry : DashboardErrorType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

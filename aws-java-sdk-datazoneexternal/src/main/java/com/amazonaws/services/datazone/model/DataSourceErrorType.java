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
package com.amazonaws.services.datazone.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DataSourceErrorType {

    ACCESS_DENIED_EXCEPTION("ACCESS_DENIED_EXCEPTION"),
    CONFLICT_EXCEPTION("CONFLICT_EXCEPTION"),
    INTERNAL_SERVER_EXCEPTION("INTERNAL_SERVER_EXCEPTION"),
    RESOURCE_NOT_FOUND_EXCEPTION("RESOURCE_NOT_FOUND_EXCEPTION"),
    SERVICE_QUOTA_EXCEEDED_EXCEPTION("SERVICE_QUOTA_EXCEEDED_EXCEPTION"),
    THROTTLING_EXCEPTION("THROTTLING_EXCEPTION"),
    VALIDATION_EXCEPTION("VALIDATION_EXCEPTION");

    private String value;

    private DataSourceErrorType(String value) {
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
     * @return DataSourceErrorType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DataSourceErrorType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DataSourceErrorType enumEntry : DataSourceErrorType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

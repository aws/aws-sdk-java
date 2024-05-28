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
public enum EnvironmentStatus {

    ACTIVE("ACTIVE"),
    CREATING("CREATING"),
    UPDATING("UPDATING"),
    DELETING("DELETING"),
    CREATE_FAILED("CREATE_FAILED"),
    UPDATE_FAILED("UPDATE_FAILED"),
    DELETE_FAILED("DELETE_FAILED"),
    VALIDATION_FAILED("VALIDATION_FAILED"),
    SUSPENDED("SUSPENDED"),
    DISABLED("DISABLED"),
    EXPIRED("EXPIRED"),
    DELETED("DELETED"),
    INACCESSIBLE("INACCESSIBLE");

    private String value;

    private EnvironmentStatus(String value) {
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
     * @return EnvironmentStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EnvironmentStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EnvironmentStatus enumEntry : EnvironmentStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

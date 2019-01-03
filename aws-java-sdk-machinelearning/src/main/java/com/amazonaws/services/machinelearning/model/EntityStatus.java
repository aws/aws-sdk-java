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
package com.amazonaws.services.machinelearning.model;

import javax.annotation.Generated;

/**
 * <p>
 * Object status with the following possible values:
 * </p>
 * <ul>
 * <li><code>PENDING</code></li>
 * <li><code>INPROGRESS</code></li>
 * <li><code>FAILED</code></li>
 * <li><code>COMPLETED</code></li>
 * <li><code>DELETED</code></li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EntityStatus {

    PENDING("PENDING"),
    INPROGRESS("INPROGRESS"),
    FAILED("FAILED"),
    COMPLETED("COMPLETED"),
    DELETED("DELETED");

    private String value;

    private EntityStatus(String value) {
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
     * @return EntityStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EntityStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EntityStatus enumEntry : EntityStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

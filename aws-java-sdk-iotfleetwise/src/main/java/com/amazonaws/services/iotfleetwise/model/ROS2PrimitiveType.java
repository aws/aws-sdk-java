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
package com.amazonaws.services.iotfleetwise.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ROS2PrimitiveType {

    BOOL("BOOL"),
    BYTE("BYTE"),
    CHAR("CHAR"),
    FLOAT32("FLOAT32"),
    FLOAT64("FLOAT64"),
    INT8("INT8"),
    UINT8("UINT8"),
    INT16("INT16"),
    UINT16("UINT16"),
    INT32("INT32"),
    UINT32("UINT32"),
    INT64("INT64"),
    UINT64("UINT64"),
    STRING("STRING"),
    WSTRING("WSTRING");

    private String value;

    private ROS2PrimitiveType(String value) {
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
     * @return ROS2PrimitiveType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ROS2PrimitiveType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ROS2PrimitiveType enumEntry : ROS2PrimitiveType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

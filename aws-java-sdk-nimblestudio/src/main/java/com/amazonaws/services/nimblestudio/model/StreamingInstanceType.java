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
package com.amazonaws.services.nimblestudio.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum StreamingInstanceType {

    G4dnXlarge("g4dn.xlarge"),
    G4dn2xlarge("g4dn.2xlarge"),
    G4dn4xlarge("g4dn.4xlarge"),
    G4dn8xlarge("g4dn.8xlarge"),
    G4dn12xlarge("g4dn.12xlarge"),
    G4dn16xlarge("g4dn.16xlarge"),
    G34xlarge("g3.4xlarge"),
    G3sXlarge("g3s.xlarge"),
    G5Xlarge("g5.xlarge"),
    G52xlarge("g5.2xlarge"),
    G54xlarge("g5.4xlarge"),
    G58xlarge("g5.8xlarge"),
    G516xlarge("g5.16xlarge");

    private String value;

    private StreamingInstanceType(String value) {
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
     * @return StreamingInstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static StreamingInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (StreamingInstanceType enumEntry : StreamingInstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

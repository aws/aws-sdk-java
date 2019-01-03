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
package com.amazonaws.services.greengrass.model;

import javax.annotation.Generated;

/**
 * Specifies whether the Lambda function runs in a Greengrass container (default) or without containerization. Unless
 * your scenario requires that you run without containerization, we recommend that you run in a Greengrass container.
 * Omit this value to run the Lambda function with the default containerization for the group.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum FunctionIsolationMode {

    GreengrassContainer("GreengrassContainer"),
    NoContainer("NoContainer");

    private String value;

    private FunctionIsolationMode(String value) {
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
     * @return FunctionIsolationMode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static FunctionIsolationMode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FunctionIsolationMode enumEntry : FunctionIsolationMode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

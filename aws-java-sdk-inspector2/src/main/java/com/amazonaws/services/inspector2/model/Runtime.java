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
package com.amazonaws.services.inspector2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Runtime {

    NODEJS("NODEJS"),
    NODEJS_12_X("NODEJS_12_X"),
    NODEJS_14_X("NODEJS_14_X"),
    NODEJS_16_X("NODEJS_16_X"),
    JAVA_8("JAVA_8"),
    JAVA_8_AL2("JAVA_8_AL2"),
    JAVA_11("JAVA_11"),
    PYTHON_3_7("PYTHON_3_7"),
    PYTHON_3_8("PYTHON_3_8"),
    PYTHON_3_9("PYTHON_3_9"),
    UNSUPPORTED("UNSUPPORTED"),
    NODEJS_18_X("NODEJS_18_X"),
    GO_1_X("GO_1_X");

    private String value;

    private Runtime(String value) {
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
     * @return Runtime corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Runtime fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Runtime enumEntry : Runtime.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

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
package com.amazonaws.services.devopsguru.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LogAnomalyType {

    KEYWORD("KEYWORD"),
    KEYWORD_TOKEN("KEYWORD_TOKEN"),
    FORMAT("FORMAT"),
    HTTP_CODE("HTTP_CODE"),
    BLOCK_FORMAT("BLOCK_FORMAT"),
    NUMERICAL_POINT("NUMERICAL_POINT"),
    NUMERICAL_NAN("NUMERICAL_NAN"),
    NEW_FIELD_NAME("NEW_FIELD_NAME");

    private String value;

    private LogAnomalyType(String value) {
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
     * @return LogAnomalyType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LogAnomalyType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LogAnomalyType enumEntry : LogAnomalyType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

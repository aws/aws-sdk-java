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
package com.amazonaws.services.cleanrooms.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ScalarFunctions {

    ABS("ABS"),
    CAST("CAST"),
    CEILING("CEILING"),
    COALESCE("COALESCE"),
    CONVERT("CONVERT"),
    CURRENT_DATE("CURRENT_DATE"),
    DATEADD("DATEADD"),
    EXTRACT("EXTRACT"),
    FLOOR("FLOOR"),
    GETDATE("GETDATE"),
    LN("LN"),
    LOG("LOG"),
    LOWER("LOWER"),
    ROUND("ROUND"),
    RTRIM("RTRIM"),
    SQRT("SQRT"),
    SUBSTRING("SUBSTRING"),
    TO_CHAR("TO_CHAR"),
    TO_DATE("TO_DATE"),
    TO_NUMBER("TO_NUMBER"),
    TO_TIMESTAMP("TO_TIMESTAMP"),
    TRIM("TRIM"),
    TRUNC("TRUNC"),
    UPPER("UPPER");

    private String value;

    private ScalarFunctions(String value) {
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
     * @return ScalarFunctions corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ScalarFunctions fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ScalarFunctions enumEntry : ScalarFunctions.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

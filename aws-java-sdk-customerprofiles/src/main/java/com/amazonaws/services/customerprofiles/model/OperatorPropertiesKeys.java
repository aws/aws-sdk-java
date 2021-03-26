/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OperatorPropertiesKeys {

    VALUE("VALUE"),
    VALUES("VALUES"),
    DATA_TYPE("DATA_TYPE"),
    UPPER_BOUND("UPPER_BOUND"),
    LOWER_BOUND("LOWER_BOUND"),
    SOURCE_DATA_TYPE("SOURCE_DATA_TYPE"),
    DESTINATION_DATA_TYPE("DESTINATION_DATA_TYPE"),
    VALIDATION_ACTION("VALIDATION_ACTION"),
    MASK_VALUE("MASK_VALUE"),
    MASK_LENGTH("MASK_LENGTH"),
    TRUNCATE_LENGTH("TRUNCATE_LENGTH"),
    MATH_OPERATION_FIELDS_ORDER("MATH_OPERATION_FIELDS_ORDER"),
    CONCAT_FORMAT("CONCAT_FORMAT"),
    SUBFIELD_CATEGORY_MAP("SUBFIELD_CATEGORY_MAP");

    private String value;

    private OperatorPropertiesKeys(String value) {
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
     * @return OperatorPropertiesKeys corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static OperatorPropertiesKeys fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OperatorPropertiesKeys enumEntry : OperatorPropertiesKeys.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

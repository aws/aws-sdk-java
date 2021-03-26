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
public enum S3ConnectorOperator {

    PROJECTION("PROJECTION"),
    LESS_THAN("LESS_THAN"),
    GREATER_THAN("GREATER_THAN"),
    BETWEEN("BETWEEN"),
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
    EQUAL_TO("EQUAL_TO"),
    NOT_EQUAL_TO("NOT_EQUAL_TO"),
    ADDITION("ADDITION"),
    MULTIPLICATION("MULTIPLICATION"),
    DIVISION("DIVISION"),
    SUBTRACTION("SUBTRACTION"),
    MASK_ALL("MASK_ALL"),
    MASK_FIRST_N("MASK_FIRST_N"),
    MASK_LAST_N("MASK_LAST_N"),
    VALIDATE_NON_NULL("VALIDATE_NON_NULL"),
    VALIDATE_NON_ZERO("VALIDATE_NON_ZERO"),
    VALIDATE_NON_NEGATIVE("VALIDATE_NON_NEGATIVE"),
    VALIDATE_NUMERIC("VALIDATE_NUMERIC"),
    NO_OP("NO_OP");

    private String value;

    private S3ConnectorOperator(String value) {
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
     * @return S3ConnectorOperator corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static S3ConnectorOperator fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (S3ConnectorOperator enumEntry : S3ConnectorOperator.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

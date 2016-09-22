/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.waf.model;

/**
 * 
 */
public enum ParameterExceptionField {

    CHANGE_ACTION("CHANGE_ACTION"),
    WAF_ACTION("WAF_ACTION"),
    PREDICATE_TYPE("PREDICATE_TYPE"),
    IPSET_TYPE("IPSET_TYPE"),
    BYTE_MATCH_FIELD_TYPE("BYTE_MATCH_FIELD_TYPE"),
    SQL_INJECTION_MATCH_FIELD_TYPE("SQL_INJECTION_MATCH_FIELD_TYPE"),
    BYTE_MATCH_TEXT_TRANSFORMATION("BYTE_MATCH_TEXT_TRANSFORMATION"),
    BYTE_MATCH_POSITIONAL_CONSTRAINT("BYTE_MATCH_POSITIONAL_CONSTRAINT"),
    SIZE_CONSTRAINT_COMPARISON_OPERATOR("SIZE_CONSTRAINT_COMPARISON_OPERATOR");

    private String value;

    private ParameterExceptionField(String value) {
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
     * @return ParameterExceptionField corresponding to the value
     */
    public static ParameterExceptionField fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ParameterExceptionField enumEntry : ParameterExceptionField.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

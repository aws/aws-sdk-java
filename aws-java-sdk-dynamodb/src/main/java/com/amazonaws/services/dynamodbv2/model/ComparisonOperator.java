/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodbv2.model;

/**
 * 
 */
public enum ComparisonOperator {

    EQ("EQ"),
    NE("NE"),
    IN("IN"),
    LE("LE"),
    LT("LT"),
    GE("GE"),
    GT("GT"),
    BETWEEN("BETWEEN"),
    NOT_NULL("NOT_NULL"),
    NULL("NULL"),
    CONTAINS("CONTAINS"),
    NOT_CONTAINS("NOT_CONTAINS"),
    BEGINS_WITH("BEGINS_WITH");

    private String value;

    private ComparisonOperator(String value) {
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
     * @return ComparisonOperator corresponding to the value
     */
    public static ComparisonOperator fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("EQ".equals(value)) {
            return EQ;
        } else if ("NE".equals(value)) {
            return NE;
        } else if ("IN".equals(value)) {
            return IN;
        } else if ("LE".equals(value)) {
            return LE;
        } else if ("LT".equals(value)) {
            return LT;
        } else if ("GE".equals(value)) {
            return GE;
        } else if ("GT".equals(value)) {
            return GT;
        } else if ("BETWEEN".equals(value)) {
            return BETWEEN;
        } else if ("NOT_NULL".equals(value)) {
            return NOT_NULL;
        } else if ("NULL".equals(value)) {
            return NULL;
        } else if ("CONTAINS".equals(value)) {
            return CONTAINS;
        } else if ("NOT_CONTAINS".equals(value)) {
            return NOT_CONTAINS;
        } else if ("BEGINS_WITH".equals(value)) {
            return BEGINS_WITH;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}
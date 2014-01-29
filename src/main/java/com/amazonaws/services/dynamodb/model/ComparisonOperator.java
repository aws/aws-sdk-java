/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;

/**
 * Comparison Operator
 * @deprecated Use {@link com.amazonaws.services.dynamodbv2.model.ComparisonOperator} instead.
 */
@Deprecated
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
     *            real value
     * @return ComparisonOperator corresponding to the value
     */
    public static ComparisonOperator fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("EQ".equals(value)) {
            return ComparisonOperator.EQ;
        } else if ("NE".equals(value)) {
            return ComparisonOperator.NE;
        } else if ("IN".equals(value)) {
            return ComparisonOperator.IN;
        } else if ("LE".equals(value)) {
            return ComparisonOperator.LE;
        } else if ("LT".equals(value)) {
            return ComparisonOperator.LT;
        } else if ("GE".equals(value)) {
            return ComparisonOperator.GE;
        } else if ("GT".equals(value)) {
            return ComparisonOperator.GT;
        } else if ("BETWEEN".equals(value)) {
            return ComparisonOperator.BETWEEN;
        } else if ("NOT_NULL".equals(value)) {
            return ComparisonOperator.NOT_NULL;
        } else if ("NULL".equals(value)) {
            return ComparisonOperator.NULL;
        } else if ("CONTAINS".equals(value)) {
            return ComparisonOperator.CONTAINS;
        } else if ("NOT_CONTAINS".equals(value)) {
            return ComparisonOperator.NOT_CONTAINS;
        } else if ("BEGINS_WITH".equals(value)) {
            return ComparisonOperator.BEGINS_WITH;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    
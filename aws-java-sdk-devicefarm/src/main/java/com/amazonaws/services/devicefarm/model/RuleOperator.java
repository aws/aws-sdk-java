/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.devicefarm.model;

/**
 * 
 */
public enum RuleOperator {

    EQUALS("EQUALS"),
    LESS_THAN("LESS_THAN"),
    GREATER_THAN("GREATER_THAN"),
    IN("IN"),
    NOT_IN("NOT_IN");

    private String value;

    private RuleOperator(String value) {
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
     * @return RuleOperator corresponding to the value
     */
    public static RuleOperator fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("EQUALS".equals(value)) {
            return EQUALS;
        } else if ("LESS_THAN".equals(value)) {
            return LESS_THAN;
        } else if ("GREATER_THAN".equals(value)) {
            return GREATER_THAN;
        } else if ("IN".equals(value)) {
            return IN;
        } else if ("NOT_IN".equals(value)) {
            return NOT_IN;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}
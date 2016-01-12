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

package com.amazonaws.services.waf.model;

/**
 * 
 */
public enum MatchFieldType {

    URI("URI"),
    QUERY_STRING("QUERY_STRING"),
    HEADER("HEADER"),
    METHOD("METHOD");

    private String value;

    private MatchFieldType(String value) {
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
     * @return MatchFieldType corresponding to the value
     */
    public static MatchFieldType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("URI".equals(value)) {
            return URI;
        } else if ("QUERY_STRING".equals(value)) {
            return QUERY_STRING;
        } else if ("HEADER".equals(value)) {
            return HEADER;
        } else if ("METHOD".equals(value)) {
            return METHOD;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}
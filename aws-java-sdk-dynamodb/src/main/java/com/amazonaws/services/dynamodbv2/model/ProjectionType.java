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
public enum ProjectionType {

    ALL("ALL"),
    KEYS_ONLY("KEYS_ONLY"),
    INCLUDE("INCLUDE");

    private String value;

    private ProjectionType(String value) {
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
     * @return ProjectionType corresponding to the value
     */
    public static ProjectionType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ALL".equals(value)) {
            return ALL;
        } else if ("KEYS_ONLY".equals(value)) {
            return KEYS_ONLY;
        } else if ("INCLUDE".equals(value)) {
            return INCLUDE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}
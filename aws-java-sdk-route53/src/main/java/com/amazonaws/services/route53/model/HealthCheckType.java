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

package com.amazonaws.services.route53.model;

/**
 * 
 */
public enum HealthCheckType {

    HTTP("HTTP"),
    HTTPS("HTTPS"),
    HTTP_STR_MATCH("HTTP_STR_MATCH"),
    HTTPS_STR_MATCH("HTTPS_STR_MATCH"),
    TCP("TCP"),
    CALCULATED("CALCULATED");

    private String value;

    private HealthCheckType(String value) {
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
     * @return HealthCheckType corresponding to the value
     */
    public static HealthCheckType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("HTTP".equals(value)) {
            return HTTP;
        } else if ("HTTPS".equals(value)) {
            return HTTPS;
        } else if ("HTTP_STR_MATCH".equals(value)) {
            return HTTP_STR_MATCH;
        } else if ("HTTPS_STR_MATCH".equals(value)) {
            return HTTPS_STR_MATCH;
        } else if ("TCP".equals(value)) {
            return TCP;
        } else if ("CALCULATED".equals(value)) {
            return CALCULATED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}
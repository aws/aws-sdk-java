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

package com.amazonaws.services.opsworks.model;

/**
 * 
 */
public enum AppType {

    AwsFlowRuby("aws-flow-ruby"),
    Java("java"),
    Rails("rails"),
    Php("php"),
    Nodejs("nodejs"),
    Static("static"),
    Other("other");

    private String value;

    private AppType(String value) {
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
     * @return AppType corresponding to the value
     */
    public static AppType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("aws-flow-ruby".equals(value)) {
            return AwsFlowRuby;
        } else if ("java".equals(value)) {
            return Java;
        } else if ("rails".equals(value)) {
            return Rails;
        } else if ("php".equals(value)) {
            return Php;
        } else if ("nodejs".equals(value)) {
            return Nodejs;
        } else if ("static".equals(value)) {
            return Static;
        } else if ("other".equals(value)) {
            return Other;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}
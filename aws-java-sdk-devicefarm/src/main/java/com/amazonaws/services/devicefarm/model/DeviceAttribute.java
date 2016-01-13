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
public enum DeviceAttribute {

    ARN("ARN"),
    PLATFORM("PLATFORM"),
    FORM_FACTOR("FORM_FACTOR"),
    MANUFACTURER("MANUFACTURER");

    private String value;

    private DeviceAttribute(String value) {
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
     * @return DeviceAttribute corresponding to the value
     */
    public static DeviceAttribute fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ARN".equals(value)) {
            return ARN;
        } else if ("PLATFORM".equals(value)) {
            return PLATFORM;
        } else if ("FORM_FACTOR".equals(value)) {
            return FORM_FACTOR;
        } else if ("MANUFACTURER".equals(value)) {
            return MANUFACTURER;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}
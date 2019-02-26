/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeviceAttribute {

    ARN("ARN"),
    PLATFORM("PLATFORM"),
    FORM_FACTOR("FORM_FACTOR"),
    MANUFACTURER("MANUFACTURER"),
    REMOTE_ACCESS_ENABLED("REMOTE_ACCESS_ENABLED"),
    REMOTE_DEBUG_ENABLED("REMOTE_DEBUG_ENABLED"),
    APPIUM_VERSION("APPIUM_VERSION"),
    INSTANCE_ARN("INSTANCE_ARN"),
    INSTANCE_LABELS("INSTANCE_LABELS"),
    FLEET_TYPE("FLEET_TYPE"),
    OS_VERSION("OS_VERSION"),
    MODEL("MODEL"),
    AVAILABILITY("AVAILABILITY");

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
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeviceAttribute fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeviceAttribute enumEntry : DeviceAttribute.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

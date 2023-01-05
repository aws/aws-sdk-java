/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.panorama.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeviceReportedStatus {

    STOPPING("STOPPING"),
    STOPPED("STOPPED"),
    STOP_ERROR("STOP_ERROR"),
    REMOVAL_FAILED("REMOVAL_FAILED"),
    REMOVAL_IN_PROGRESS("REMOVAL_IN_PROGRESS"),
    STARTING("STARTING"),
    RUNNING("RUNNING"),
    INSTALL_ERROR("INSTALL_ERROR"),
    LAUNCHED("LAUNCHED"),
    LAUNCH_ERROR("LAUNCH_ERROR"),
    INSTALL_IN_PROGRESS("INSTALL_IN_PROGRESS");

    private String value;

    private DeviceReportedStatus(String value) {
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
     * @return DeviceReportedStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeviceReportedStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeviceReportedStatus enumEntry : DeviceReportedStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

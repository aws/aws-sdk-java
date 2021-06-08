/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * The status of the action to synchronize the device configuration. If you change the configuration of the input device
 * (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not update itself
 * immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not updated its
 * configuration.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeviceSettingsSyncState {

    SYNCED("SYNCED"),
    SYNCING("SYNCING");

    private String value;

    private DeviceSettingsSyncState(String value) {
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
     * @return DeviceSettingsSyncState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeviceSettingsSyncState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeviceSettingsSyncState enumEntry : DeviceSettingsSyncState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

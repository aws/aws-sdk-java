/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivsrealtime.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EventName {

    JOINED("JOINED"),
    LEFT("LEFT"),
    PUBLISH_STARTED("PUBLISH_STARTED"),
    PUBLISH_STOPPED("PUBLISH_STOPPED"),
    SUBSCRIBE_STARTED("SUBSCRIBE_STARTED"),
    SUBSCRIBE_STOPPED("SUBSCRIBE_STOPPED"),
    PUBLISH_ERROR("PUBLISH_ERROR"),
    SUBSCRIBE_ERROR("SUBSCRIBE_ERROR"),
    JOIN_ERROR("JOIN_ERROR");

    private String value;

    private EventName(String value) {
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
     * @return EventName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EventName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EventName enumEntry : EventName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

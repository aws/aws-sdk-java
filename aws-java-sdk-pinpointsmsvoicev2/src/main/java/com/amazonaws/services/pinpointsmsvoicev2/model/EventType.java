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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EventType {

    ALL("ALL"),
    TEXT_ALL("TEXT_ALL"),
    TEXT_SENT("TEXT_SENT"),
    TEXT_PENDING("TEXT_PENDING"),
    TEXT_QUEUED("TEXT_QUEUED"),
    TEXT_SUCCESSFUL("TEXT_SUCCESSFUL"),
    TEXT_DELIVERED("TEXT_DELIVERED"),
    TEXT_INVALID("TEXT_INVALID"),
    TEXT_INVALID_MESSAGE("TEXT_INVALID_MESSAGE"),
    TEXT_UNREACHABLE("TEXT_UNREACHABLE"),
    TEXT_CARRIER_UNREACHABLE("TEXT_CARRIER_UNREACHABLE"),
    TEXT_BLOCKED("TEXT_BLOCKED"),
    TEXT_CARRIER_BLOCKED("TEXT_CARRIER_BLOCKED"),
    TEXT_SPAM("TEXT_SPAM"),
    TEXT_UNKNOWN("TEXT_UNKNOWN"),
    TEXT_TTL_EXPIRED("TEXT_TTL_EXPIRED"),
    VOICE_ALL("VOICE_ALL"),
    VOICE_INITIATED("VOICE_INITIATED"),
    VOICE_RINGING("VOICE_RINGING"),
    VOICE_ANSWERED("VOICE_ANSWERED"),
    VOICE_COMPLETED("VOICE_COMPLETED"),
    VOICE_BUSY("VOICE_BUSY"),
    VOICE_NO_ANSWER("VOICE_NO_ANSWER"),
    VOICE_FAILED("VOICE_FAILED"),
    VOICE_TTL_EXPIRED("VOICE_TTL_EXPIRED");

    private String value;

    private EventType(String value) {
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
     * @return EventType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EventType enumEntry : EventType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

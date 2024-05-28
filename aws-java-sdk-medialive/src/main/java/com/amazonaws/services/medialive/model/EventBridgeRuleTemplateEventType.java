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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * The type of event to match with the rule.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EventBridgeRuleTemplateEventType {

    MEDIALIVE_MULTIPLEX_ALERT("MEDIALIVE_MULTIPLEX_ALERT"),
    MEDIALIVE_MULTIPLEX_STATE_CHANGE("MEDIALIVE_MULTIPLEX_STATE_CHANGE"),
    MEDIALIVE_CHANNEL_ALERT("MEDIALIVE_CHANNEL_ALERT"),
    MEDIALIVE_CHANNEL_INPUT_CHANGE("MEDIALIVE_CHANNEL_INPUT_CHANGE"),
    MEDIALIVE_CHANNEL_STATE_CHANGE("MEDIALIVE_CHANNEL_STATE_CHANGE"),
    MEDIAPACKAGE_INPUT_NOTIFICATION("MEDIAPACKAGE_INPUT_NOTIFICATION"),
    MEDIAPACKAGE_KEY_PROVIDER_NOTIFICATION("MEDIAPACKAGE_KEY_PROVIDER_NOTIFICATION"),
    MEDIAPACKAGE_HARVEST_JOB_NOTIFICATION("MEDIAPACKAGE_HARVEST_JOB_NOTIFICATION"),
    SIGNAL_MAP_ACTIVE_ALARM("SIGNAL_MAP_ACTIVE_ALARM"),
    MEDIACONNECT_ALERT("MEDIACONNECT_ALERT"),
    MEDIACONNECT_SOURCE_HEALTH("MEDIACONNECT_SOURCE_HEALTH"),
    MEDIACONNECT_OUTPUT_HEALTH("MEDIACONNECT_OUTPUT_HEALTH"),
    MEDIACONNECT_FLOW_STATUS_CHANGE("MEDIACONNECT_FLOW_STATUS_CHANGE");

    private String value;

    private EventBridgeRuleTemplateEventType(String value) {
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
     * @return EventBridgeRuleTemplateEventType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EventBridgeRuleTemplateEventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EventBridgeRuleTemplateEventType enumEntry : EventBridgeRuleTemplateEventType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

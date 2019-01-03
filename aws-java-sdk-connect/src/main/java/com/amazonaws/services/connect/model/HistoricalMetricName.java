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
package com.amazonaws.services.connect.model;

import javax.annotation.Generated;

/**
 * <p>
 * A list of historical metric names.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum HistoricalMetricName {

    CONTACTS_QUEUED("CONTACTS_QUEUED"),
    CONTACTS_HANDLED("CONTACTS_HANDLED"),
    CONTACTS_ABANDONED("CONTACTS_ABANDONED"),
    CONTACTS_CONSULTED("CONTACTS_CONSULTED"),
    CONTACTS_AGENT_HUNG_UP_FIRST("CONTACTS_AGENT_HUNG_UP_FIRST"),
    CONTACTS_HANDLED_INCOMING("CONTACTS_HANDLED_INCOMING"),
    CONTACTS_HANDLED_OUTBOUND("CONTACTS_HANDLED_OUTBOUND"),
    CONTACTS_HOLD_ABANDONS("CONTACTS_HOLD_ABANDONS"),
    CONTACTS_TRANSFERRED_IN("CONTACTS_TRANSFERRED_IN"),
    CONTACTS_TRANSFERRED_OUT("CONTACTS_TRANSFERRED_OUT"),
    CONTACTS_TRANSFERRED_IN_FROM_QUEUE("CONTACTS_TRANSFERRED_IN_FROM_QUEUE"),
    CONTACTS_TRANSFERRED_OUT_FROM_QUEUE("CONTACTS_TRANSFERRED_OUT_FROM_QUEUE"),
    CONTACTS_MISSED("CONTACTS_MISSED"),
    CALLBACK_CONTACTS_HANDLED("CALLBACK_CONTACTS_HANDLED"),
    API_CONTACTS_HANDLED("API_CONTACTS_HANDLED"),
    OCCUPANCY("OCCUPANCY"),
    HANDLE_TIME("HANDLE_TIME"),
    AFTER_CONTACT_WORK_TIME("AFTER_CONTACT_WORK_TIME"),
    QUEUED_TIME("QUEUED_TIME"),
    ABANDON_TIME("ABANDON_TIME"),
    QUEUE_ANSWER_TIME("QUEUE_ANSWER_TIME"),
    HOLD_TIME("HOLD_TIME"),
    INTERACTION_TIME("INTERACTION_TIME"),
    INTERACTION_AND_HOLD_TIME("INTERACTION_AND_HOLD_TIME"),
    SERVICE_LEVEL("SERVICE_LEVEL");

    private String value;

    private HistoricalMetricName(String value) {
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
     * @return HistoricalMetricName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static HistoricalMetricName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (HistoricalMetricName enumEntry : HistoricalMetricName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

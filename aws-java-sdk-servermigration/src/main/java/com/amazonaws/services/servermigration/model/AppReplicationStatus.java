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
package com.amazonaws.services.servermigration.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AppReplicationStatus {

    READY_FOR_CONFIGURATION("READY_FOR_CONFIGURATION"),
    CONFIGURATION_IN_PROGRESS("CONFIGURATION_IN_PROGRESS"),
    CONFIGURATION_INVALID("CONFIGURATION_INVALID"),
    READY_FOR_REPLICATION("READY_FOR_REPLICATION"),
    VALIDATION_IN_PROGRESS("VALIDATION_IN_PROGRESS"),
    REPLICATION_PENDING("REPLICATION_PENDING"),
    REPLICATION_IN_PROGRESS("REPLICATION_IN_PROGRESS"),
    REPLICATED("REPLICATED"),
    DELTA_REPLICATION_IN_PROGRESS("DELTA_REPLICATION_IN_PROGRESS"),
    DELTA_REPLICATED("DELTA_REPLICATED"),
    DELTA_REPLICATION_FAILED("DELTA_REPLICATION_FAILED"),
    REPLICATION_FAILED("REPLICATION_FAILED"),
    REPLICATION_STOPPING("REPLICATION_STOPPING"),
    REPLICATION_STOP_FAILED("REPLICATION_STOP_FAILED"),
    REPLICATION_STOPPED("REPLICATION_STOPPED");

    private String value;

    private AppReplicationStatus(String value) {
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
     * @return AppReplicationStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AppReplicationStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AppReplicationStatus enumEntry : AppReplicationStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

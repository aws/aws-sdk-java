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
package com.amazonaws.services.mgn.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DataReplicationErrorString {

    AGENT_NOT_SEEN("AGENT_NOT_SEEN"),
    SNAPSHOTS_FAILURE("SNAPSHOTS_FAILURE"),
    NOT_CONVERGING("NOT_CONVERGING"),
    UNSTABLE_NETWORK("UNSTABLE_NETWORK"),
    FAILED_TO_CREATE_SECURITY_GROUP("FAILED_TO_CREATE_SECURITY_GROUP"),
    FAILED_TO_LAUNCH_REPLICATION_SERVER("FAILED_TO_LAUNCH_REPLICATION_SERVER"),
    FAILED_TO_BOOT_REPLICATION_SERVER("FAILED_TO_BOOT_REPLICATION_SERVER"),
    FAILED_TO_AUTHENTICATE_WITH_SERVICE("FAILED_TO_AUTHENTICATE_WITH_SERVICE"),
    FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE("FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE"),
    FAILED_TO_CREATE_STAGING_DISKS("FAILED_TO_CREATE_STAGING_DISKS"),
    FAILED_TO_ATTACH_STAGING_DISKS("FAILED_TO_ATTACH_STAGING_DISKS"),
    FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT("FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT"),
    FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER("FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER"),
    FAILED_TO_START_DATA_TRANSFER("FAILED_TO_START_DATA_TRANSFER");

    private String value;

    private DataReplicationErrorString(String value) {
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
     * @return DataReplicationErrorString corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DataReplicationErrorString fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DataReplicationErrorString enumEntry : DataReplicationErrorString.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

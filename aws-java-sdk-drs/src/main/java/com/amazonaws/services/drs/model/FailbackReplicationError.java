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
package com.amazonaws.services.drs.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum FailbackReplicationError {

    AGENT_NOT_SEEN("AGENT_NOT_SEEN"),
    FAILBACK_CLIENT_NOT_SEEN("FAILBACK_CLIENT_NOT_SEEN"),
    NOT_CONVERGING("NOT_CONVERGING"),
    UNSTABLE_NETWORK("UNSTABLE_NETWORK"),
    FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION("FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION"),
    FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT("FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT"),
    FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE("FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE"),
    FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE("FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE"),
    FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION("FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION"),
    FAILED_GETTING_REPLICATION_STATE("FAILED_GETTING_REPLICATION_STATE"),
    SNAPSHOTS_FAILURE("SNAPSHOTS_FAILURE"),
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

    private FailbackReplicationError(String value) {
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
     * @return FailbackReplicationError corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static FailbackReplicationError fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FailbackReplicationError enumEntry : FailbackReplicationError.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

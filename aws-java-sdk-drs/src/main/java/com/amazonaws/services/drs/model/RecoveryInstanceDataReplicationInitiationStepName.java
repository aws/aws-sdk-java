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
public enum RecoveryInstanceDataReplicationInitiationStepName {

    LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE("LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE"),
    COMPLETE_VOLUME_MAPPING("COMPLETE_VOLUME_MAPPING"),
    ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION("ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION"),
    DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT("DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT"),
    CONFIGURE_REPLICATION_SOFTWARE("CONFIGURE_REPLICATION_SOFTWARE"),
    PAIR_AGENT_WITH_REPLICATION_SOFTWARE("PAIR_AGENT_WITH_REPLICATION_SOFTWARE"),
    ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION("ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION"),
    WAIT("WAIT"),
    CREATE_SECURITY_GROUP("CREATE_SECURITY_GROUP"),
    LAUNCH_REPLICATION_SERVER("LAUNCH_REPLICATION_SERVER"),
    BOOT_REPLICATION_SERVER("BOOT_REPLICATION_SERVER"),
    AUTHENTICATE_WITH_SERVICE("AUTHENTICATE_WITH_SERVICE"),
    DOWNLOAD_REPLICATION_SOFTWARE("DOWNLOAD_REPLICATION_SOFTWARE"),
    CREATE_STAGING_DISKS("CREATE_STAGING_DISKS"),
    ATTACH_STAGING_DISKS("ATTACH_STAGING_DISKS"),
    PAIR_REPLICATION_SERVER_WITH_AGENT("PAIR_REPLICATION_SERVER_WITH_AGENT"),
    CONNECT_AGENT_TO_REPLICATION_SERVER("CONNECT_AGENT_TO_REPLICATION_SERVER"),
    START_DATA_TRANSFER("START_DATA_TRANSFER");

    private String value;

    private RecoveryInstanceDataReplicationInitiationStepName(String value) {
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
     * @return RecoveryInstanceDataReplicationInitiationStepName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static RecoveryInstanceDataReplicationInitiationStepName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (RecoveryInstanceDataReplicationInitiationStepName enumEntry : RecoveryInstanceDataReplicationInitiationStepName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

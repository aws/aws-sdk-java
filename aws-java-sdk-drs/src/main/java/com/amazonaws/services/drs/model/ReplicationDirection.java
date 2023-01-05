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
 * <p>
 * Replication direction designates if this is a failover replication, or a failback replication. When a DRS agent is
 * installed on an instance, the replication direction is failover. In cases where a recovery launch was made in the
 * recovery location and a new recovery instance was created, and then a failback replication was initiated from that
 * recovery instance back to the origin location, then the replication direction will be failback.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ReplicationDirection {

    FAILOVER("FAILOVER"),
    FAILBACK("FAILBACK");

    private String value;

    private ReplicationDirection(String value) {
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
     * @return ReplicationDirection corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ReplicationDirection fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ReplicationDirection enumEntry : ReplicationDirection.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

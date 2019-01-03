/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

/**
 * Replication status for delete markers in CRR configuration V2. When status is {@link #ENABLED} then delete markers
 * are replicated, when status is {@link #DISABLED} then they are not replicated.
 */
public enum DeleteMarkerReplicationStatus {

    ENABLED("Enabled"),
    DISABLED("Disabled");

    private final String value;

    DeleteMarkerReplicationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DeleteMarkerReplicationStatus corresponding to the value
     * @throws IllegalArgumentException If the specified value does not map to one of the known values in this enum.
     */
    public static DeleteMarkerReplicationStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeleteMarkerReplicationStatus enumEntry : DeleteMarkerReplicationStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

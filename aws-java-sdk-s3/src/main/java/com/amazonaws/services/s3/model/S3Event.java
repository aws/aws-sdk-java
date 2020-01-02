/*
 * Copyright 2014-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

/**
 * A enum class for all Amazon S3 events.
 */
public enum S3Event {
    ReducedRedundancyLostObject("s3:ReducedRedundancyLostObject"),

    ObjectCreated("s3:ObjectCreated:*"),

    ObjectCreatedByPut("s3:ObjectCreated:Put"),

    ObjectCreatedByPost("s3:ObjectCreated:Post"),

    ObjectCreatedByCopy("s3:ObjectCreated:Copy"),

    ObjectCreatedByCompleteMultipartUpload("s3:ObjectCreated:CompleteMultipartUpload"),

    ObjectRemoved("s3:ObjectRemoved:*"),

    ObjectRemovedDelete("s3:ObjectRemoved:Delete"),

    ObjectRemovedDeleteMarkerCreated("s3:ObjectRemoved:DeleteMarkerCreated"),

    ObjectRestorePost("s3:ObjectRestore:Post"),

    ObjectRestoreCompleted("s3:ObjectRestore:Completed"),

    Replication("s3:Replication:*"),

    ReplicationOperationFailed("s3:Replication:OperationFailedReplication"),

    ReplicationOperationNotTracked("s3:Replication:OperationNotTracked"),

    ReplicationOperationMissedThreshold("s3:Replication:OperationMissedThreshold"),

    ReplicationOperationReplicatedAfterThreshold("s3:Replication:OperationReplicationAfterThreshold")
    ;

    private final String event;
    private static final String S3_PREFIX = "s3:";

    private S3Event(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return this.event;
    }

    /**
     *
     * @param value
     *        real value
     * @return S3Event corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static S3Event fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (S3Event enumEntry : S3Event.values()) {
            if (enumEntry.toString().equals(value) || enumEntry.toString().equals(S3_PREFIX.concat(value))) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
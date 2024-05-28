/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The date partitioning source for S3 Server Access Logging. This field can be specified in
 * {@link com.amazonaws.services.s3.model.PartitionedPrefix} If EventTime is specified, the log file prefix will be
 * based on the timestamp of the S3 event. If DeliveryTime is specified, the log file prefix will be based on the time
 * when the log file was delivered to S3. The default setting is EventTime.
 */
public enum PartitionDateSource {
    EVENT_TIME("EventTime"),

    DELIVERY_TIME("DeliveryTime");

    private String value;

    PartitionDateSource(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static PartitionDateSource parsePartitionDateSource(String str) {
        for (PartitionDateSource partitionDateSource : PartitionDateSource.values()) {
            if (partitionDateSource.value.equals(str)) {
                return partitionDateSource;
            }
        }
        return null;
    }
}

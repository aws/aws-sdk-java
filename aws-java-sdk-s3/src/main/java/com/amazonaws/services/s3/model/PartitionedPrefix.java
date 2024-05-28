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
 * The bucket logging prefix type for S3 Server Access Logging. This field must be specified in
 * {@link com.amazonaws.services.s3.TargetObjectKeyFormat}. The default setting is Simple. When Partitioned is
 * specified, you can specify the {@link com.amazonaws.services.s3.model.PartitionDateSource}, with EventTime being
 * the default.
 */
public class PartitionedPrefix {
    private PartitionDateSource partitionDateSource;

    public PartitionedPrefix() {
    }

    public PartitionedPrefix(PartitionDateSource partitionDateSource) {
        this.partitionDateSource = partitionDateSource;
    }

    public PartitionDateSource getPartitionDateSource() {
        return partitionDateSource;
    }

    public void setPartitionDateSource(PartitionDateSource partitionDateSource) {
        this.partitionDateSource = partitionDateSource;
    }

    public PartitionedPrefix withPartitionDateSource(PartitionDateSource partitionDateSource) {
        setPartitionDateSource(partitionDateSource);
        return this;
    }

    public String getPartitionDateSourceAsString() {
        return partitionDateSource.toString();
    }

    public void setPartitionDateSource(String partitionDateSource) {
        this.partitionDateSource = PartitionDateSource.parsePartitionDateSource(partitionDateSource);
    }

    public PartitionedPrefix withPartitionDateSource(String partitionDateSource) {
        setPartitionDateSource(partitionDateSource);
        return this;
    }

    public String toString() {
        String result = "PartitionedPrefix";
        if (partitionDateSource != null) {
            result += ",partitionDateSource=" + getPartitionDateSourceAsString();
        }
        return result;
    }
}

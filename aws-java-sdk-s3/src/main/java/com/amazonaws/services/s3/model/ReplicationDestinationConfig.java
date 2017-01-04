/*
 * Copyright 2015-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.Serializable;

import com.amazonaws.util.json.Jackson;

/**
 * Destination configuration for an Amazon S3 bucket replication rule.
 * Configurations in addition to destination bucket ARN may be added in future.
 */
public class ReplicationDestinationConfig implements Serializable {

    /**
     * The ARN of the Amazon S3 bucket where the replicas are sent.
     */
    private String bucketARN;

    /**
     * Storage class for the replica. If not specified, Amazon S3
     * uses the storage class of the source object to create object replica.
     */
    private String storageClass;

    /**
     * Returns the Amazon S3 bucket ARN where the replicas are present.
     */
    public String getBucketARN() {
        return bucketARN;
    }

    /**
     * Sets the destination bucket ARN for the replication rule.
     *
     * @throws IllegalArgumentException
     *             if the bucket arn is null.
     */
    public void setBucketARN(String bucketARN) {
        if (bucketARN == null) {
            throw new IllegalArgumentException("Bucket name cannot be null");
        }
        this.bucketARN = bucketARN;
    }

    /**
     * Sets the destination bucket ARN for the replication rule. Returns the
     * updated object.
     *
     * @throws IllegalArgumentException
     *             if the bucket arn is null.
     * @return the updated {@link ReplicationDestinationConfig} object
     */
    public ReplicationDestinationConfig withBucketARN(String bucketARN) {
        setBucketARN(bucketARN);
        return this;
    }

    /**
     * Sets the storage class for the replication destination. If not specified,
     * Amazon S3 uses the storage class of the source object to create object replica.
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * Sets the storage class for the replication destination. If not specified,
     * Amazon S3 uses the storage class of the source object to create object replica.
     */
    public void setStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass == null ? (String)null : storageClass.toString());
    }

    /**
     * Sets the storage class for the replication destination. If not specified,
     * Amazon S3 uses the storage class of the source object to create object replica.
     * Returns the updated object.
     *
     * @return the updated {@link ReplicationDestinationConfig} object
     */
    public ReplicationDestinationConfig withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Sets the storage class for the replication destination. If not specified,
     * Amazon S3 uses the storage class of the source object to create object replica.
     * Returns the updated object.
     *
     * @return the updated {@link ReplicationDestinationConfig} object
     */
    public ReplicationDestinationConfig withStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass == null ? (String)null : storageClass.toString());
        return this;
    }

    /**
     * Returns the storage class associated with the replication destination
     * configuration.
     */
    public String getStorageClass() {
        return storageClass;
    }

    @Override
    public String toString() {
        return Jackson.toJsonString(this);
    }
}

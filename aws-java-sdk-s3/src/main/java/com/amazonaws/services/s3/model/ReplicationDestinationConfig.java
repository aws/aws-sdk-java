/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Account ID of the destination bucket.
     * Currently this is only being verified if Access Control Translation is enabled.
     */
    private String account;

    /**
     * Storage class for the replica. If not specified, Amazon S3
     * uses the storage class of the source object to create object replica.
     */
    private String storageClass;

    private AccessControlTranslation accessControlTranslation;

    private EncryptionConfiguration encryptionConfiguration;

    private ReplicationTime replicationTime;

    private Metrics metrics;

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
     * Returns The account ID of the destination bucket.
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the account ID of the destination bucket. This is only being verified if Access Control Translation is enabled.
     *
     * @param account New account id.
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Sets the account ID of the destination bucket. This is only being verified if Access Control Translation is enabled.
     *
     * @param account New account id.
     * @return This object for method chaining.
     */
    public ReplicationDestinationConfig withAccount(String account) {
        setAccount(account);
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

    /**
     * @return The access control translation.
     */
    public AccessControlTranslation getAccessControlTranslation() {
        return accessControlTranslation;
    }

    /**
     * Sets the access control translation.
     *
     * @param accessControlTranslation New access control translation.
     */
    public void setAccessControlTranslation(AccessControlTranslation accessControlTranslation) {
        this.accessControlTranslation = accessControlTranslation;
    }

    /**
     * Sets the access control translation.
     *
     * @param accessControlTranslation New access control translation.
     * @return This object for method chaining.
     */
    public ReplicationDestinationConfig withAccessControlTranslation(AccessControlTranslation accessControlTranslation) {
        setAccessControlTranslation(accessControlTranslation);
        return this;
    }

    /**
     * @return Container for information regarding encryption based configuration for replicas
     */
    public EncryptionConfiguration getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * Sets the container for information regarding encryption based configuration for replicas
     *
     * @param encryptionConfiguration New encryption configuration.
     */
    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * Sets the container for information regarding encryption based configuration for replicas
     *
     * @param encryptionConfiguration New encryption configuration.
     * @return This object for method chaining.
     */
    public ReplicationDestinationConfig withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * Return a container specifying the time when all objects and operations on objects are replicated. Must be
     * specified together with a <code>Metrics</code> block.
     */
    public ReplicationTime getReplicationTime() {
        return replicationTime;
    }

    /**
     * Set a container specifying the time when all objects and operations on objects are replicated. Must be
     * specified together with a <code>Metrics</code> block.
     *
     * @param replicationTime The replication time.
     */
    public void setReplicationTime(ReplicationTime replicationTime) {
        this.replicationTime = replicationTime;
    }

    /**
     * Set a container specifying the time when all objects and operations on objects are replicated. Must be
     * specified together with a <code>Metrics</code> block.
     *
     * @param replicationTime The replication time.
     * @return This object for method chaining.
     */
    public ReplicationDestinationConfig withReplicationTime(ReplicationTime replicationTime) {
        setReplicationTime(replicationTime);
        return this;
    }

    /**
     * Return a container specifying replication metrics-related information including whether emitting metrics and
     * Amazon S3 events for replication are enabled. In addition, contains configurations related to specific metrics
     * or events. Must be specified together with a <code>ReplicationTime</code> block. <code>ReplicationTime</code>
     * block.
     */
    public Metrics getMetrics() {
        return metrics;
    }

    /**
     * Set a container specifying replication metrics-related information including whether emitting metrics and
     * Amazon S3 events for replication are enabled. In addition, contains configurations related to specific metrics
     * or events. Must be specified together with a <code>ReplicationTime</code> block. <code>ReplicationTime</code>
     * block.
     *
     * @param metrics The metrics information.
     */
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    /**
     * Set a container specifying replication metrics-related information including whether emitting metrics and
     * Amazon S3 events for replication are enabled. In addition, contains configurations related to specific metrics
     * or events. Must be specified together with a <code>ReplicationTime</code> block. <code>ReplicationTime</code>
     * block.
     *
     * @param metrics The metrics information.
     * @return This object for method chaining.
     */
    public ReplicationDestinationConfig withMetrics(Metrics metrics) {
        setMetrics(metrics);
        return this;
    }

    @Override
    public String toString() {
        return Jackson.toJsonString(this);
    }

}

/*
 * Copyright 2015-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.util.json.Jackson;

public class SetBucketReplicationConfigurationRequest extends
        AmazonWebServiceRequest implements Serializable{

    /**
     * The name of Amazon S3 bucket to which the replication configuration is
     * set.
     */
    private String bucketName;

    /**
     * Replication configuration for an Amazon S3 bucket.
     */
    private BucketReplicationConfiguration replicationConfiguration;

    /**
     * Creates a new SetReplicationConfigurationRequest.
     */
    public SetBucketReplicationConfigurationRequest() { }

    /**
     * Creates a new SetReplicationConfigurationRequest.
     *
     * @param bucketName
     *            The name of Amazon S3 bucket to which the replication
     *            configuration is set.
     * @param replicationConfiguration
     *            Replication configuration for an Amazon S3 bucket.
     */
    public SetBucketReplicationConfigurationRequest(String bucketName,
            BucketReplicationConfiguration replicationConfiguration) {
        this.bucketName = bucketName;
        this.replicationConfiguration = replicationConfiguration;
    }

    /**
     * Returns the name of Amazon S3 bucket.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of Amazon S3 bucket for replication configuration.
     *
     * @param bucketName
     *            The name of Amazon S3 bucket to which the replication
     *            configuration is set.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of Amazon S3 bucket for replication configuration. Returns
     * the updated object. .
     *
     * @param bucketName
     *            The name of Amazon S3 bucket to which the replication
     *            configuration is set.
     * @return The updated {@link SetBucketReplicationConfigurationRequest}
     *         object.
     */
    public SetBucketReplicationConfigurationRequest withBucketName(
            String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the replication configuration of an Amazon S3 bucket.
     *
     * @return the replication configuration of an Amazon S3 bucket.
     */
    public BucketReplicationConfiguration getReplicationConfiguration() {
        return replicationConfiguration;
    }

    /**
     * Sets the replication configuration for an Amazon S3 bucket.
     *
     * @param replicationConfiguration
     *            the replication configuration for an Amazon S3 bucket.
     */
    public void setReplicationConfiguration(
            BucketReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
    }

    /**
     * Sets the replication configuration for an Amazon S3 bucket. Returns the
     * updated object. .
     *
     * @param replicationConfiguration
     *            the replication configuration for an Amazon S3 bucket.
     * @return The updated {@link SetBucketReplicationConfigurationRequest}
     *         object.
     */
    public SetBucketReplicationConfigurationRequest withReplicationConfiguration(
            BucketReplicationConfiguration replicationConfiguration) {
        setReplicationConfiguration(replicationConfiguration);
        return this;
    }

    @Override
    public String toString() {
        return Jackson.toJsonString(this);
    }
}

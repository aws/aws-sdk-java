/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Request object to delete an S3 Intelligent-Tiering configuration.
 */
public class DeleteBucketIntelligentTieringConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    private String bucketName;
    private String id;

    public DeleteBucketIntelligentTieringConfigurationRequest() { }

    public DeleteBucketIntelligentTieringConfigurationRequest(String bucketName, String id) {
        this.bucketName = bucketName;
        this.id = id;
    }

    /**
     * Returns the name of the bucket from which an S3 Intelligent-Tiering configuration is deleted.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket from which an S3 Intelligent-Tiering configuration is deleted.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket from which an S3 Intelligent-Tiering configuration is deleted
     * and returns this object for method chaining.
     */
    public DeleteBucketIntelligentTieringConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the identifier used to represent an S3 Intelligent-Tiering configuration.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the identifier used to represent an S3 Intelligent-Tiering configuration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the identifier used to represent an S3 Intelligent-Tiering configuration
     * and returns this object for method chaining.
     */
    public DeleteBucketIntelligentTieringConfigurationRequest withId(String id) {
        setId(id);
        return this;
    }
}

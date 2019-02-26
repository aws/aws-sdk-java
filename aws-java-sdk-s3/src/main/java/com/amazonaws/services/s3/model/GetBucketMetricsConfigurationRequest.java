/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;

/**
 * Request object to retrieve metrics configuration from a bucket.
 */
public class GetBucketMetricsConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;
    private String id;

    public GetBucketMetricsConfigurationRequest() {
    }

    public GetBucketMetricsConfigurationRequest(String bucketName, String id) {
        this.bucketName = bucketName;
        this.id = id;
    }

    /**
     * Returns the name of the bucket containing the metrics configuration to retrieve.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the metrics configuration to retrieve.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket containing the metrics configuration to retrieve
     * and returns this object for method chaining.
     */
    public GetBucketMetricsConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the ID used to identify the metrics configuration.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID used to identify the metrics configuration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the ID used to identify the metrics configuration and
     * returns {@link GetBucketMetricsConfigurationRequest} object for method chaining.
     */
    public GetBucketMetricsConfigurationRequest withId(String id) {
        setId(id);
        return this;
    }
}

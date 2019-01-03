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
 * Request object to get an analytics configuration.
 */
public class GetBucketAnalyticsConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    private String bucketName;
    private String id;

    public GetBucketAnalyticsConfigurationRequest() { }

    public GetBucketAnalyticsConfigurationRequest(String bucketName, String id) {
        this.bucketName = bucketName;
        this.id = id;
    }

    /**
     * Returns the name of the bucket from which an analytics configuration is to be retrieved.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket from which an analytics configuration is to be retrieved.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket from which an analytics configuration is to be retrieved
     * and returns this object for method chaining.
     */
    public GetBucketAnalyticsConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the identifier used to represent an analytics configuration.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the identifier used to represent an analytics configuration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the identifier used to represent an analytics configuration
     * and returns this object for method chaining.
     */
    public GetBucketAnalyticsConfigurationRequest withId(String id) {
        setId(id);
        return this;
    }
}

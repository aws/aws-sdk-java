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
 * Request object to list the metrics configurations of a bucket.
 */
public class ListBucketMetricsConfigurationsRequest extends AmazonWebServiceRequest implements Serializable {

    /** The name of the Amazon S3 bucket to list the metrics configurations. */
    private String bucketName;

    /**
     * Optional parameter which allows list to be continued from a specific point.
     * ContinuationToken is provided in truncated list results.
     */
    private String continuationToken;

    /**
     * Gets the name of the bucket containing the metrics configurations to retrieve.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the metrics configurations to retrieve.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket containing the metrics configurations to retrieve
     * and returns {@link ListBucketMetricsConfigurationsRequest} object for
     * method chaining.
     */
    public ListBucketMetricsConfigurationsRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the optional continuation token.  Continuation token allows a list to be
     * continued from a specific point. ContinuationToken is provided in truncated list results.
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * Sets the optional continuation token.  Continuation token allows a list to be
     * continued from a specific point. ContinuationToken is provided in truncated list results.
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * Sets the optional continuation token.  Continuation token allows a list to be
     * continued from a specific point. ContinuationToken is provided in truncated list results.
     *
     * Returns the {@link ListBucketMetricsConfigurationsRequest} object enabling
     * method chaining.
     */
    public ListBucketMetricsConfigurationsRequest withContinuationToken(String continuationToken) {
        setContinuationToken(continuationToken);
        return this;
    }
}

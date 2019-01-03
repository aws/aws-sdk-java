/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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
 * Generic request container for web service requests on buckets.
 */
public class GenericBucketRequest extends AmazonWebServiceRequest implements Serializable {

    private String bucketName;

    /**
     * Create a generic request for a bucket operation.
     * 
     * @param bucketName
     *            The name of the target bucket.
     */
    public GenericBucketRequest(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * @deprecated Use getBucketName() instead.
     */
    @Deprecated
    public String getBucket() {
        return bucketName;
    }

    /**
     * Returns the name of the target bucket.
     * 
     * @return The name of the target bucket
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the target bucket.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the target bucket, and returns this updated request
     * object so that additional method calls can be chained together.
     * 
     * @return This updated request object so that additional method calls can
     *         be chained together.
     */
    public GenericBucketRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

}

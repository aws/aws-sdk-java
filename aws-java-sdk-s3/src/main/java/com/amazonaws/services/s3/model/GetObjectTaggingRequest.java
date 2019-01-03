/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;

/**
 * Request object for the parameters to get the tags for an object.
 */
public class GetObjectTaggingRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;
    private String key;
    private String versionId;

    /**
     * Construct an instance of this object.
     *
     * @param bucketName
     *            The name of the bucket.
     * @param key
     *            The object key.
     * @param versionId
     *            The version of the object.
     */
    public GetObjectTaggingRequest(String bucketName, String key, String versionId) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = versionId;
    }

    /**
     * Construct an instance of this object.
     *
     * @param bucketName
     *            The name of the bucket.
     * @param key
     *            The object key.
     */
    public GetObjectTaggingRequest(String bucketName, String key) {
        this(bucketName, key, null);
    }

    /**
     * @return The bucket name.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Set the bucket name.
     *
     * @param bucketName The bucket name.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Set the bucket name.
     *
     * @param bucketName the bucket name.
     *
     * @return This object for chaining.
     */
    public GetObjectTaggingRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * @return The object key.
     */
    public String getKey() {
        return key;
    }

    /**
     * Set the object key.
     *
     * @param key The object key.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Set the object key.
     *
     * @param key The object key.
     *
     * @return This object for chaining.
     */
    public GetObjectTaggingRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * @return The version of the object.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Set object version.
     *
     * @param versionId The object version.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Set object version.
     *
     * @param versionId The object version.
     *
     * @return This object for chaining.
     */
    public GetObjectTaggingRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }
}

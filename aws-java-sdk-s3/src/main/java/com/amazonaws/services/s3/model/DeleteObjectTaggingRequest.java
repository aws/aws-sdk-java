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
 * Request object for the parameters to delete the tags for an object.
 */
public class DeleteObjectTaggingRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;
    private String key;
    private String versionId;

    /**
     * Constructs an instance of this object.
     *
     * @param bucketName
     *            The bucket name.
     * @param key
     *            The object key.
     */
    public DeleteObjectTaggingRequest(String bucketName, String key) {
        this.bucketName = bucketName;
        this.key = key;
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
     * @param bucketName
     *            The bucket name.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Set the bucket name.
     *
     * @param bucketName
     *            The bucket name.
     *
     * @return This object for chaining.
     */
    public DeleteObjectTaggingRequest withBucketName(String bucketName) {
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
     * @param key
     *            The object key.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Set the object key.
     *
     * @param key
     *            The object key.
     *
     * @return This object for chaining.
     */
    public DeleteObjectTaggingRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * @return The version of the object whose tags are to be deleted.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Set version of the object whose tages are to be deleted.
     *
     * @param versionId The object version.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Set version of the object whose tages are to be deleted.
     *
     * @param versionId
     *            The object version.
     *
     * @return This object for chaining.
     */
    public DeleteObjectTaggingRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }
}

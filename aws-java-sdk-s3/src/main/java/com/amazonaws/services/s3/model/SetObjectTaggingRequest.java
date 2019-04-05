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
 * Request object for the parameters to set the tags for an object.
 */
public class SetObjectTaggingRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;
    private String key;
    private String versionId;
    private ObjectTagging tagging;

    /**
     * Constructs an instance of this object.
     *
     * @param bucketName
     *            The bucket name.
     * @param key
     *            The object key.
     * @param tagging
     *            The set of tags to set for the specified object.
     */
    public SetObjectTaggingRequest(String bucketName, String key, ObjectTagging tagging) {
        this(bucketName, key, null, tagging);
    }

    /**
     * Constructs an instance of this object.
     *
     * @param bucketName
     *            The bucket name.
     * @param key
     *            The object key.
     * @param versionId
     *            The version of the object.
     * @param tagging
     *            The set of tags to set for the specified object.
     */
    public SetObjectTaggingRequest(String bucketName, String key, String versionId, ObjectTagging tagging) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = versionId;
        this.tagging = tagging;
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
    public SetObjectTaggingRequest withBucketName(String bucketName) {
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
    public SetObjectTaggingRequest withKey(String key) {
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
    public SetObjectTaggingRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * @return The set of tags to set for the specified object.
     */
    public ObjectTagging getTagging() {
        return tagging;
    }

    /**
     * Set the object tagging.
     *
     * @param tagging The object tagging.
     */
    public void setTagging(ObjectTagging tagging) {
        this.tagging = tagging;
    }

    /**
     * Set the object tagging.
     *
     * @param tagging The object tagging.
     *
     * @return This object for chaining.
     */
    public SetObjectTaggingRequest withTagging(ObjectTagging tagging) {
        setTagging(tagging);
        return this;
    }
}

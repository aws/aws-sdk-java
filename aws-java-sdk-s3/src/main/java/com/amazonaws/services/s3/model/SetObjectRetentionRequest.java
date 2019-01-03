/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Places an Object Retention configuration on an object.
 */
public class SetObjectRetentionRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucket;
    private String key;
    private ObjectLockRetention retention;
    private boolean isRequesterPays;
    private String versionId;
    private boolean bypassGovernanceRetention;

    /**
     * The S3 Bucket.
     */
    public String getBucketName() {
        return bucket;
    }

    /**
     * The S3 Bucket.
     */
    public SetObjectRetentionRequest withBucketName(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * The S3 Bucket.
     */
    public void setBucketName(String bucket) {
        withBucketName(bucket);
    }

    /**
     * The Object Key.
     */
    public String getKey() {
        return key;
    }

    /**
     * The Object Key.
     */
    public SetObjectRetentionRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The Object Key.
     */
    public void setKey(String key) {
        withKey(key);
    }

    /**
     * The container element for the Object Retention configuration.
     */
    public ObjectLockRetention getRetention() {
        return retention;
    }

    /**
     * The container element for the Object Retention configuration.
     */
    public SetObjectRetentionRequest withRetention(ObjectLockRetention retention) {
        this.retention = retention;
        return this;
    }

    /**
     * The container element for the Object Retention configuration.
     */
    public void setRetention(ObjectLockRetention retention) {
        withRetention(retention);
    }

    /**
     * Returns true if the user has enabled Requester Pays option when
     * downloading an object from Requester Pays Bucket; else false.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to read an
     * object from it without Requester Pays enabled will result in a 403 error
     * and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
     *
     * @return true if the user has enabled Requester Pays option for
     *         downloading an object from Requester Pays Bucket.
     */
    public boolean isRequesterPays() {
        return isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket. It returns this
     * updated GetObjectRequest object so that additional method calls can be
     * chained together.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket.
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     *
     * @return The updated GetObjectRequest object.
     */
    public SetObjectRetentionRequest withRequesterPays(boolean isRequesterPays) {
        this.isRequesterPays = isRequesterPays;
        return this;
    }

    /**
     * Used for downloading an Amazon S3 Object from a Requester Pays Bucket. If
     * set the requester is charged for downloading the data from the bucket.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to read an
     * object from it without Requester Pays enabled will result in a 403 error
     * and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     */
    public void setRequesterPays(boolean isRequesterPays) {
        withRequesterPays(isRequesterPays);
    }

    /**
     * The Object Version ID.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * The Object Version ID.
     */
    public SetObjectRetentionRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * The Object Version ID.
     */
    public void setVersionId(String versionId) {
        withVersionId(versionId);
    }

    public boolean getBypassGovernanceRetention() {
        return bypassGovernanceRetention;
    }

    public SetObjectRetentionRequest withBypassGovernanceRetention(boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
        return this;
    }

    public void setBypassGovernanceRetention(boolean bypassGovernanceRetention) {
        withBypassGovernanceRetention(bypassGovernanceRetention);
    }
}

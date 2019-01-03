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
 * Applies a Legal Hold configuration to the specified object.
 */
public class SetObjectLegalHoldRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucket;
    private String key;
    private ObjectLockLegalHold legalHold;
    private boolean isRequesterPays;
    private String versionId;

    /**
     * The S3 Bucket.
     */
    public String getBucketName() {
        return bucket;
    }

    /**
     * The S3 Bucket.
     */
    public SetObjectLegalHoldRequest withBucketName(String bucket) {
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
    public SetObjectLegalHoldRequest withKey(String key) {
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
     * Container element for the Legal Hold configuration you want to apply to the specified object.
     */
    public ObjectLockLegalHold getLegalHold() {
        return legalHold;
    }

    /**
     * Container element for the Legal Hold configuration you want to apply to the specified object.
     */
    public SetObjectLegalHoldRequest withLegalHold(ObjectLockLegalHold legalHold) {
        this.legalHold = legalHold;
        return this;
    }

    /**
     * Container element for the Legal Hold configuration you want to apply to the specified object.
     */
    public void setLegalHold(ObjectLockLegalHold legalHold) {
        withLegalHold(legalHold);
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
    public SetObjectLegalHoldRequest withRequesterPays(boolean isRequesterPays) {
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
        this.isRequesterPays = isRequesterPays;
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
    public SetObjectLegalHoldRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * The Object Version ID.
     */
    public void setVersionId(String versionId) {
        withVersionId(versionId);
    }
}

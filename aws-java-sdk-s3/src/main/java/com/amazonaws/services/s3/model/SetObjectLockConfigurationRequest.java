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
 * Places an Object Lock configuration on the specified bucket. The rule specified in the Object Lock configuration will be
 * applied by default to every new object placed in the specified bucket.
 */
public class SetObjectLockConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucket;
    private ObjectLockConfiguration objectLockConfiguration;
    private boolean isRequesterPays;
    private String token;

    /**
     * The S3 Bucket.
     */
    public String getBucketName() {
        return bucket;
    }

    /**
     * The S3 Bucket.
     */
    public SetObjectLockConfigurationRequest withBucketName(String bucket) {
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
     * The Object Lock configuration that you want to apply to the specified bucket.
     */
    public ObjectLockConfiguration getObjectLockConfiguration() {
        return objectLockConfiguration;
    }

    /**
     * The Object Lock configuration that you want to apply to the specified bucket.
     */
    public SetObjectLockConfigurationRequest withObjectLockConfiguration(ObjectLockConfiguration objectLockConfiguration) {
        this.objectLockConfiguration = objectLockConfiguration;
        return this;
    }

    /**
     * The Object Lock configuration that you want to apply to the specified bucket.
     */
    public void setObjectLockConfiguration(ObjectLockConfiguration objectLockConfiguration) {
        withObjectLockConfiguration(objectLockConfiguration);
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
    public SetObjectLockConfigurationRequest withRequesterPays(boolean isRequesterPays) {
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

    public String getToken() {
        return token;
    }

    public SetObjectLockConfigurationRequest withToken(String token) {
        this.token = token;
        return this;
    }

    public void setToken(String token) {
        withToken(token);
    }
}

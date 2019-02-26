/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3Client;

/**
 * <p>
 * Provides options for deleting a specified object in a specified bucket.
 * Once deleted, the object
 * can only be restored if versioning was enabled when the object was deleted.
 * </p>
 * <p>
 * Note: If deleting an object that does not exist, Amazon S3 returns
 * a success message, not an error message.
 * </p>
 *
 * @see AmazonS3Client#deleteObject(String, String)
 * @see AmazonS3Client#deleteObject(DeleteObjectRequest)
 */
public class DeleteObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the Amazon S3 bucket containing the object to delete.
     */
    private String bucketName;

    /**
     * The key of the object to delete.
     */
    private String key;

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    /**
     * Constructs a new
     * {@link DeleteObjectRequest},
     * specifying the object's bucket name and key.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object to
     *            delete.
     * @param key
     *            The key of the object to delete.
     */
    public DeleteObjectRequest(String bucketName, String key) {
        setBucketName(bucketName);
        setKey(key);
    }


    /**
     * Gets the name of the Amazon S3 bucket containing the object to
     * delete.
     *
     * @return The name of the Amazon S3 bucket containing the object to
     *         delete.
     *
     * @see DeleteObjectRequest#setBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket containing the object to delete.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object to
     *            delete.
     * @see DeleteObjectRequest#getBucketName()
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket containing the object to delete
     * and returns this object, enabling additional method calls to be chained
     * together.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object to
     *            delete.
     *
     * @return The updated {@link DeleteObjectRequest}
     *         object, enabling additional method
     *         calls to be chained together.
     */
    public DeleteObjectRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the key of the object to delete.
     *
     * @return The key of the object to delete.
     *
     * @see DeleteObjectRequest#setKey(String)
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key of the object to delete.
     *
     * @param key
     *            The key of the object to delete.
     *
     * @see DeleteObjectRequest#getKey()
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key of the object to delete and returns this object, enabling
     * additional method calls to be chained together.
     *
     * @param key
     *            The key of the object to delete.
     *
     * @return The updated {@link DeleteObjectRequest} object, enabling additional method
     *         calls to chained together.
     */
    public DeleteObjectRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * Returns true if the user has enabled Requester Pays option when
     * conducting this operation from Requester Pays Bucket; else false.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
     *
     * @return true if the user has enabled Requester Pays option for
     *         conducting this operation from Requester Pays Bucket.
     */
    public boolean isRequesterPays() {
        return isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket.
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
     */
    public void setRequesterPays(boolean isRequesterPays) {
        this.isRequesterPays = isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket. It returns this
     * updated DeleteObjectRequest object so that additional method calls can be
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
     * @return The updated DeleteObjectRequest object.
     */
    public DeleteObjectRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

}

/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Request object containing all the options for restoring an object, which was transitioned to the Amazon Glacier
 * from S3 when it was expired.
 * </p>
 * <p>
 * All <code>RestoreObjectRequest</code> must specify a bucket name and key,
 * along with expiration time.
 * </p>
 *
 * @see RestoreObjectRequest#RestoreObjectRequest(String, String, int)
 * @see RestoreObjectRequest#RestoreObjectRequest(String, String)
 */
public class RestoreObjectRequest extends AmazonWebServiceRequest {

    /**
     * The time, in days, between when an object is restored to the bucket and
     * when it expires.
     */
    private int expirationInDays;

    /**
     * The name of the bucket containing the reference to the object to restore
     * which is now stored in Amazon Glacier.
     */
    private String bucketName;

    /**
     * The key, the name of the reference to the object to restore, which is now
     * stored in Amazon Glacier.
     */
    private String key;

    /**
     * <p>
     * Constructs a new RestoreObjectRequest.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the reference to the object
     *            to restore which is now stored in Amazon Glacier.
     * @param key
     *            The key, the name of the reference to the object to restore, which
     *            is now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#RestoreObjectRequest(String, String, int)
     */
    public RestoreObjectRequest(String bucketName, String key) {
        this(bucketName, key, -1);
    }

    /**
     * <p>
     * Constructs a new RestoreObjectRequest.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the reference to the object
     *            to restore which is now stored in Amazon Glacier.
     * @param key
     *            The key, the name of the reference to the object to restore, which
     *            is now stored in Amazon Glacier.
     * @param expirationInDays
     *            The time, in days, between when an object is restored to the
     *            bucket and when it expires
     *
     * @see RestoreObjectRequest#RestoreObjectRequest(String, String)
     */
    public RestoreObjectRequest(String bucketName, String key, int expirationInDays) {
        this.bucketName = bucketName;
        this.key = key;
        this.expirationInDays = expirationInDays;
    }

    /**
     * Returns the name of the bucket containing the reference to the object to
     * restore which is now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#setBucketName(String)
     * @see RestoreObjectRequest#withBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the reference to the object to
     * restore which is now stored in Amazon Glacier, and returns a reference
     * to this object(RestoreObjectRequest) for method chaining.
     *
     * @see RestoreObjectRequest#setBucketName(String)
     * @see RestoreObjectRequest#getBucketName()
     */
    public RestoreObjectRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Sets the name of the bucket containing the reference to the object to
     * restore which is now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#getBucketName()
     * @see RestoreObjectRequest#withBucketName(String)
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Gets the key, the name of the reference to the object to restore, which is
     * now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#setKey(String)
     * @see RestoreObjectRequest#withKey(String)
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key, the name of the reference to the object to restore, which
     * is now stored in Amazon Glacier.
     *
     * @see RestoreObjectRequest#getKey()
     * @see RestoreObjectRequest#withKey(String)
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key, the name of the reference to the object to restore, which
     * is now stored in Amazon Glacier. returns a reference to this object(RestoreObjectRequest)
     * for method chaining.
     *
     * @see RestoreObjectRequest#getKey()
     * @see RestoreObjectRequest#setKey(String)
     */
    public RestoreObjectRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Sets the time, in days, between when an object is uploaded to the bucket
     * and when it expires.
     */
    public void setExpirationInDays(int expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    /**
     * Returns the time in days from an object's creation to its expiration.
     */
    public int getExpirationInDays() {
        return expirationInDays;
    }

    /**
     * Sets the time, in days, between when an object is uploaded to the bucket
     * and when it expires, and returns a reference to this object(RestoreObjectRequest) for method
     * chaining.
     */
    public RestoreObjectRequest withExpirationInDays(int expirationInDays) {
        this.expirationInDays = expirationInDays;
        return this;
    }

}

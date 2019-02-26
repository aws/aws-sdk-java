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
import java.util.Date;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.SSEResultBase;

/**
 * Contains the data returned by Amazon S3 from the <code>putObject</code>
 * operation.
 * <p>
 * Use this class to access information about the new object created from the
 * <code>putObject</code> request, such as its ETag and optional version ID.
 * <p>
 * This class also contains the MD5 hash of the object content calculated on the
 * client-side.
 *
 * @see AmazonS3Client#putObject(String, String, java.io.File)
 * @see AmazonS3Client#putObject(String, String, java.io.InputStream,
 *      ObjectMetadata)
 * @see AmazonS3Client#putObject(PutObjectRequest)
 */
public class PutObjectResult extends SSEResultBase
        implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult, Serializable {

    /**
     * The version ID of the new, uploaded object. This field will only be
     * present if object versioning has been enabled for the bucket to which the
     * object was uploaded.
     */
    private String versionId;

    /** The ETag value of the new object */
    private String eTag;

    /** The time this object expires, or null if it has no expiration */
    private Date expirationTime;

    /** The expiration rule for this object */
    private String expirationTimeRuleId;

    /** The content MD5 */
    private String contentMd5;

    /** The metadata returned as a result of PutObject operation.*/
    private ObjectMetadata metadata;

    /**
     * Indicate if the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterCharged;

    /**
     * Gets the optional version ID of the newly uploaded object. This field will
     * be set only if object versioning is enabled for the bucket the
     * object was uploaded to.
     *
     * @return The optional version ID of the newly uploaded object.
     *
     * @see PutObjectResult#setVersionId(String)
     */
    @Override
    public String getVersionId() {
        return versionId;
    }


    /**
     * Sets the optional version ID of the newly uploaded object.
     *
     * @param versionId
     *            The optional version ID of the newly uploaded object.
     *
     * @see PutObjectResult#getVersionId()
     */
    @Override
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Gets the server-side ETag value for the newly created object.
     *
     * @return The server-side ETag value for the new object.
     *
     * @see PutObjectResult#setETag(String)
     */
    public String getETag() {
        return eTag;
    }

    /**
     * Sets the ETag value for the new object that was created from the
     * associated <code>putObject</code> request.
     *
     * @param eTag
     *            The ETag value for the new object.
     *
     * @see PutObjectResult#getETag()
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * Returns the expiration time for this object, or null if it doesn't expire.
     */
    public Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the expiration time for the object.
     *
     * @param expirationTime
     *            The expiration time for the object.
     */
    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * Returns the {@link BucketLifecycleConfiguration} rule ID for this
     * object's expiration, or null if it doesn't expire.
     */
    public String getExpirationTimeRuleId() {
        return expirationTimeRuleId;
    }

    /**
     * Sets the {@link BucketLifecycleConfiguration} rule ID for this object's
     * expiration
     *
     * @param expirationTimeRuleId
     *            The rule ID for this object's expiration
     */
    public void setExpirationTimeRuleId(String expirationTimeRuleId) {
        this.expirationTimeRuleId = expirationTimeRuleId;
    }

    /**
     * Sets the Base64-encoded MD5 hash of the object content that was
     * calculated on the client-side.
     *
     * @param contentMd5
     *            The content MD5
     */
    public void setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
    }

    /**
     * Returns the Base64-encoded MD5 hash of the object content that was
     * calculated on the client-side. This method returns null if the MD5
     * validation is disabled and the caller didn't provide the MD5 hash in the
     * ObjectMetadata when sending the PutObjectRequest.
     */
    public String getContentMd5() {
        return contentMd5;
    }

    /**
     * Returns the metadata retrieved as a response to
     * {@link AmazonS3Client#putObject(PutObjectRequest)} operation.
     */
    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the metadata retrieved as a response to
     * {@link AmazonS3Client#putObject(PutObjectRequest)} operation.
     */
    public void setMetadata(ObjectMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean isRequesterCharged() {
        return isRequesterCharged;
    }

    @Override
    public void setRequesterCharged(boolean isRequesterCharged) {
        this.isRequesterCharged = isRequesterCharged;
    }
}

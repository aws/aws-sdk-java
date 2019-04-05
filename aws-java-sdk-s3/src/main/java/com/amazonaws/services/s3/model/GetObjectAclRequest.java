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

import java.io.Serializable;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provide options to get an object ACL.
 * </p>
 * <p>
 * Each bucket and object in Amazon S3 has an ACL that defines its access
 * control policy. When a request is made, Amazon S3 authenticates the request
 * using its standard authentication procedure and then checks the ACL to verify
 * the sender was granted access to the bucket or object. If the sender is
 * approved, the request proceeds. Otherwise, Amazon S3 returns an error.
 * </p>
 *
 * @see AmazonS3#getObjectAcl(String, String)
 * @see AmazonS3#getObjectAcl(String, String, String)
 * @see AmazonS3#getObjectAcl(GetObjectAclRequest)
 */
public class GetObjectAclRequest extends AmazonWebServiceRequest implements Serializable{

    /**
     * Builder of an S3 object identifier. This member field is never null.
     */
    private S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    public GetObjectAclRequest(String bucketName, String key) {
        this(bucketName, key, null);
    }

    public GetObjectAclRequest(String bucketName, String key, String versionId) {
        setBucketName(bucketName);
        setKey(key);
        setVersionId(versionId);
    }

    /**
     * Gets the name of the bucket containing the object whose ACL is to be retrieved.
     *
     * @return The name of the bucket containing the object whose ACL is to be retrieved.
     *
     * @see GetObjectAclRequest#setBucketName(String)
     * @see GetObjectAclRequest#withBucket(String)
     */
    public String getBucketName() {
        return s3ObjectIdBuilder.getBucket();
    }

    /**
     * Sets the name of the bucket containing the object whose ACL is to be retrieved.
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is to be retrieved.
     * @see GetObjectAclRequest#getBucketName()
     * @see GetObjectAclRequest#withBucket(String)
     */
    public void setBucketName(String bucketName) {
        s3ObjectIdBuilder.setBucket(bucketName);
    }
    /**
     * Sets the name of the bucket containing the object whose ACL is to be retrieved.
     * Returns this {@link GetObjectAclRequest}, enabling additional method
     * calls to be chained together.
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is to be retrieved.
     * @return This {@link GetObjectAclRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectAclRequest#getBucketName()
     * @see GetObjectAclRequest#setBucketName(String)
     */
    public GetObjectAclRequest withBucket(String bucketName) {
        setBucketName(bucketName);
        return this;
    }
    /**
     * Gets the key under which the object whose ACL to be retrieved is stored.
     *
     * @return The key under which the object whose ACL to be retrieved is stored.
     *
     * @see GetObjectAclRequest#setKey(String)
     * @see GetObjectAclRequest#withKey(String)
     */
    public String getKey() {
        return s3ObjectIdBuilder.getKey();
    }

    /**
     * Sets the key under which the object whose ACL to be retrieved is stored.
     *
     * @param key
     *            The key under which the object whose ACL to be retrieved is stored.
     *
     * @see GetObjectAclRequest#getKey()
     * @see GetObjectAclRequest#withKey(String)
     */
    public void setKey(String key) {
        s3ObjectIdBuilder.setKey(key);
    }

    /**
     * Sets the key under which the object whose ACL to be retrieved is stored.
     * Returns this {@link GetObjectAclRequest}, enabling additional method
     * calls to be chained together.
     *
     * @param key
     *            The key under which the object whose ACL to be retrieved is stored.
     *
     * @return This {@link GetObjectAclRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectAclRequest#getKey()
     * @see GetObjectAclRequest#setKey(String)
     */
    public GetObjectAclRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Gets the optional version ID specifying which version of the object whose ACL to
     * be retrieved. If not specified, the most recent version's ACL will be retrieved.
     * </p>
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended are given the default <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @return The optional version ID specifying which version of the object whose ACL
     *         to be retrieved. If not specified, the most recent version will be
     *         retrieved.
     *
     * @see GetObjectAclRequest#setVersionId(String)
     * @see GetObjectAclRequest#withVersionId(String)
     */
    public String getVersionId() {
        return s3ObjectIdBuilder.getVersionId();
    }

    /**
     * Sets the optional version ID specifying which version of the object whose ACL to
     * be retrieved. If not specified, the most recent version's ACL will be retrieved.
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param versionId
     *            The optional version ID specifying which version of the object whose ACL
     *            to be retrieved.
     *
     * @see GetObjectAclRequest#getVersionId()
     * @see GetObjectAclRequest#withVersionId(String)
     */
    public void setVersionId(String versionId) {
        s3ObjectIdBuilder.setVersionId(versionId);
    }

    /**
     * <p>
     * Sets the optional version ID specifying which version of the object whose ACL to be
     * retrieved and returns this {@link GetObjectAclRequest}, enabling additional method calls to be
     * chained together. If not specified, the most recent version's ACL will be
     * retrieved.
     * </p>
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default or <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param versionId
     *            The optional version ID specifying which version of the object whose ACL is
     *            to be retrieved.
     *
     * @return The updated request object, enabling additional method calls to be
     * chained together.
     *
     * @see GetObjectAclRequest#getVersionId()
     * @see GetObjectAclRequest#setVersionId(String)
     */
    public GetObjectAclRequest withVersionId(String versionId) {
        setVersionId(versionId);
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
     * updated GetObjectAclRequest object so that additional method calls can be
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
     * @return The updated GetObjectAclRequest object.
     */
    public GetObjectAclRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

}

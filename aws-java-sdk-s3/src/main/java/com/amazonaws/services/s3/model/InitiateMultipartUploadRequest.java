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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;

/**
 * The InitiateMultipartUploadRequest contains the parameters used for the
 * InitiateMultipartUpload method.
 * <p>
 * If you are initiating multipart upload for <a
 * href="http://aws.amazon.com/kms/">KMS</a>-encrypted objects, you need to
 * specify the correct region of the bucket on your client and configure AWS
 * Signature Version 4 for added security. For more information on how to do
 * this, see
 * http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify
 * -signature-version
 * </p>
 * <p>
 * Required Parameters: BucketName, Key
 *
 * @see AmazonS3#initiateMultipartUpload(InitiateMultipartUploadRequest)
 */
public class InitiateMultipartUploadRequest extends AmazonWebServiceRequest
        implements SSECustomerKeyProvider, SSEAwsKeyManagementParamsProvider, Serializable {
    /**
     * The name of the bucket in which to create the new multipart upload, and
     * hence, the eventual object created from the multipart upload.
     */
    private String bucketName;

    /**
     * The key by which to store the new multipart upload, and hence, the
     * eventual object created from the multipart upload.
     */
    private String key;

    /**
     * Additional information about the new object being created, such as
     * content type, content encoding, user metadata, etc.
     */
    public ObjectMetadata objectMetadata;

    /**
     * An optional canned Access Control List (ACL) to set permissions for the
     * new object created when the multipart upload is completed.
     */
    private CannedAccessControlList cannedACL;

    /**
     * An optional access control list to apply to the new upload. If specified,
     * cannedAcl will be ignored.
     */
    private AccessControlList accessControlList;

    /**
     * The optional storage class to use when storing this upload's data in S3.
     * If not specified, the default storage class is used.
     */
    private StorageClass storageClass;

    /**
     * The optional redirect location for the new object.
     */
    private String redirectLocation;

    /**
     * The optional customer-provided server-side encryption key to use to
     * encrypt the upload being started.
     */
    private SSECustomerKey sseCustomerKey;

    /**
     * The optional AWS Key Management system parameters to be used to encrypt
     * the the object on the server side.
     */
    private SSEAwsKeyManagementParams sseAwsKeyManagementParams;

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    private ObjectTagging tagging;

    private String objectLockMode;

    private Date objectLockRetainUntilDate;

    private String objectLockLegalHoldStatus;

    /**
     * Constructs a request to initiate a new multipart upload in the specified
     * bucket, stored by the specified key.
     *
     * @param bucketName
     *            The name of the bucket in which to create the new multipart
     *            upload, and hence, the eventual object created from the
     *            multipart upload.
     * @param key
     *            The key by which to store the new multipart upload, and hence,
     *            the eventual object created from the multipart upload.
     */
    public InitiateMultipartUploadRequest(String bucketName, String key) {
        this.bucketName = bucketName;
        this.key = key;
    }

    /**
     * Constructs a request to initiate a new multipart upload in the specified
     * bucket, stored by the specified key, and with the additional specified
     * object metadata.
     *
     * @param bucketName
     *            The name of the bucket in which to create the new multipart
     *            upload, and hence, the eventual object created from the
     *            multipart upload.
     * @param key
     *            The key by which to store the new multipart upload, and hence,
     *            the eventual object created from the multipart upload.
     * @param objectMetadata
     *            Additional information about the new object being created,
     *            such as content type, content encoding, user metadata, etc.
     */
    public InitiateMultipartUploadRequest(String bucketName, String key, ObjectMetadata objectMetadata) {
        this.bucketName = bucketName;
        this.key = key;
        this.objectMetadata = objectMetadata;
    }


    /**
     * Returns the name of the bucket in which to create the new multipart
     * upload, and hence, the eventual object created from the multipart upload.
     *
     * @return The name of the bucket in which to create the new multipart
     *         upload, and hence, the eventual object created from the multipart
     *         upload.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket in which to create the new multipart upload,
     * and hence, the eventual object created from the multipart upload.
     *
     * @param bucketName
     *            The name of the bucket in which to create the new multipart
     *            upload, and hence, the eventual object created from the
     *            multipart upload.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket in which to create the new multipart upload,
     * and hence, the eventual object created from the multipart upload.
     * <p>
     * Returns this updated InitiateMultipartUploadRequest object so that
     * additional method calls can be chained together.
     *
     * @param bucketName
     *            The name of the bucket in which to create the new multipart
     *            upload, and hence, the eventual object created from the
     *            multipart upload.
     *
     * @return This updated InitiateMultipartUploadRequest object.
     */
    public InitiateMultipartUploadRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Returns the key by which to store the new multipart upload, and hence,
     * the eventual object created from the multipart upload.
     *
     * @return The key by which to store the new multipart upload, and hence,
     *         the eventual object created from the multipart upload.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key by which to store the new multipart upload, and hence, the
     * eventual object created from the multipart upload.
     *
     * @param key
     *            The key by which to store the new multipart upload, and hence,
     *            the eventual object created from the multipart upload.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key by which to store the new multipart upload, and hence, the
     * eventual object created from the multipart upload.
     * <p>
     * Returns this updated InitiateMultipartUploadRequest object so that
     * additional method calls can be chained together.
     *
     * @param key
     *            The key by which to store the new multipart upload, and hence,
     *            the eventual object created from the multipart upload.
     *
     * @return This updated InitiateMultipartUploadRequest object.
     */
    public InitiateMultipartUploadRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns the optional canned Access Control List (ACL) to set permissions
     * for the new object created when the multipart upload is completed.
     *
     * @return The optional canned Access Control List (ACL) to set permissions
     *         for the new object created when the multipart upload is
     *         completed.
     *
     * @see CannedAccessControlList
     */
    public CannedAccessControlList getCannedACL() {
        return cannedACL;
    }

    /**
     * Sets the optional canned Access Control List (ACL) to set permissions for
     * the new object created when the multipart upload is completed.
     *
     * @param cannedACL
     *            The canned Access Control List (ACL) to set permissions for
     *            the new object created when the multipart upload is completed.
     *
     * @see CannedAccessControlList
     */
    public void setCannedACL(CannedAccessControlList cannedACL) {
        this.cannedACL = cannedACL;
    }

    /**
     * Sets the optional canned Access Control List (ACL) to set permissions for
     * the new object created when the multipart upload is completed.
     * <p>
     * Returns this updated InitiateMultipartUploadRequest object so that
     * additional method calls can be chained together.
     *
     * @param acl
     *            The optional canned Access Control List (ACL) to set
     *            permissions for the new object created when the multipart
     *            upload is completed.
     *
     * @return This updated InitiateMultipartUploadRequest object.
     */
    public InitiateMultipartUploadRequest withCannedACL(CannedAccessControlList acl) {
        this.cannedACL = acl;
        return this;
    }

    /**
     * Returns the optional access control list for the new upload. If
     * specified, cannedAcl will be ignored.
     */
    public AccessControlList getAccessControlList() {
        return accessControlList;
    }

    /**
     * Sets the optional access control list for the new upload. If specified,
     * cannedAcl will be ignored.
     *
     * @param accessControlList
     *            The access control list for the new upload.
     */
    public void setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
    }

    /**
     * Sets the optional access control list for the new upload. If specified,
     * cannedAcl will be ignored. Returns this {@link InitiateMultipartUploadRequest},
     * enabling additional method calls to be chained together.
     *
     * @param accessControlList
     *            The access control list for the new upload.
     */
    public InitiateMultipartUploadRequest withAccessControlList(AccessControlList accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * Returns the optional storage class to use when storing this upload's data
     * in S3. If not specified, the default storage class is used.
     * <p>
     * If not specified, the default is {@link StorageClass#Standard}.
     *
     * @return The optional storage class to use when storing this upload's data
     *         in S3. If not specified, the default storage class is used.
     *
     * @see StorageClass
     */
    public StorageClass getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the optional storage class to use when storing this upload's data in
     * S3. If not specified, the default storage class is used.
     * <p>
     * If not specified, the default is {@link StorageClass#Standard}.
     *
     * @param storageClass
     *            The optional storage class to use when storing this upload's
     *            data in S3. If not specified, the default storage class is
     *            used.
     *
     * @see StorageClass
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * Sets the optional storage class to use when storing this upload's data in
     * S3. If not specified, the default storage class is used.
     * <p>
     * Returns this updated InitiateMultipartUploadRequest object so that
     * additional method calls can be chained together.
     *
     * @param storageClass
     *            The optional storage class to use when storing this upload's
     *            data in S3. If not specified, the default storage class is
     *            used.
     *
     * @return This updated InitiateMultipartUploadRequest object.
     */
    public InitiateMultipartUploadRequest withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    public InitiateMultipartUploadRequest withStorageClass(String storageClass) {
        if (storageClass != null)
            this.storageClass = StorageClass.fromValue(storageClass);
        else
            this.storageClass = null;
        return this;
    }

    /**
     * Returns the additional information about the new object being created,
     * such as content type, content encoding, user metadata, etc.
     *
     * @return The additional information about the new object being created,
     *         such as content type, content encoding, user metadata, etc.
     */
    public ObjectMetadata getObjectMetadata() {
        return objectMetadata;
    }

    /**
     * Sets the additional information about the new object being created, such
     * as content type, content encoding, user metadata, etc.
     *
     * @param objectMetadata
     *            Additional information about the new object being created,
     *            such as content type, content encoding, user metadata, etc.
     */
    public void setObjectMetadata(ObjectMetadata objectMetadata) {
        this.objectMetadata = objectMetadata;
    }

    /**
     * Sets the additional information about the new object being created, such
     * as content type, content encoding, user metadata, etc.
     * <p>
     * Returns this updated InitiateMultipartUploadRequest object so that
     * additional method calls can be chained together.
     *
     * @param objectMetadata
     *            Additional information about the new object being created,
     *            such as content type, content encoding, user metadata, etc.
     *
     * @return This updated InitiateMultipartUploadRequest object.
     */
    public InitiateMultipartUploadRequest withObjectMetadata(ObjectMetadata objectMetadata) {
        setObjectMetadata(objectMetadata);
        return this;
    }

    /**
     * Sets the optional redirect location for the new object.
     *
     * @param redirectLocation
     *            The redirect location for the new object.
     */
    public void setRedirectLocation(String redirectLocation) {
        this.redirectLocation = redirectLocation;
    }

    /**
     * Gets the optional redirect location for the new object.
     */
    public String getRedirectLocation() {
        return this.redirectLocation;
    }

    /**
     * Sets the optional redirect location for the new object. Returns this
     * {@link InitiateMultipartUploadRequest}, enabling additional method calls to be chained
     * together.
     * @param redirectLocation
     *            The redirect location for the new object.
     */
    public InitiateMultipartUploadRequest withRedirectLocation(String redirectLocation) {
        this.redirectLocation = redirectLocation;
        return this;
    }

    @Override
    public SSECustomerKey getSSECustomerKey() {
        return sseCustomerKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * encrypt the upload being started.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to encrypt the upload being started.
     */
    public void setSSECustomerKey(SSECustomerKey sseKey) {
        if (sseKey != null && this.sseAwsKeyManagementParams != null) {
            throw new IllegalArgumentException(
                "Either SSECustomerKey or SSEAwsKeyManagementParams must not be set at the same time.");
        }
        this.sseCustomerKey = sseKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * encrypt the upload being started, and returns the updated
     * InitiateMultipartUploadRequest so that additional method calls may be
     * chained together.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to encrypt the upload being started.
     *
     * @return The updated request object, so that additional method calls can
     *         be chained together.
     */
    public InitiateMultipartUploadRequest withSSECustomerKey(SSECustomerKey sseKey) {
        setSSECustomerKey(sseKey);
        return this;
    }

    /**
     * Returns the AWS Key Management System parameters used to encrypt the
     * object on server side.
     */
    @Override
    public SSEAwsKeyManagementParams getSSEAwsKeyManagementParams() {
        return sseAwsKeyManagementParams;
    }

    /**
     * Sets the AWS Key Management System parameters used to encrypt the object
     * on server side.
     */
    public void setSSEAwsKeyManagementParams(SSEAwsKeyManagementParams params) {
        if (params != null && this.sseCustomerKey != null) {
            throw new IllegalArgumentException(
                "Either SSECustomerKey or SSEAwsKeyManagementParams must not be set at the same time.");
        }
        this.sseAwsKeyManagementParams = params;
    }

    /**
     * Sets the AWS Key Management System parameters used to encrypt the object
     * on server side.
     *
     * @return returns the update InitiateMultipartUploadRequest
     */
    public InitiateMultipartUploadRequest withSSEAwsKeyManagementParams(
            SSEAwsKeyManagementParams sseAwsKeyManagementParams) {
        setSSEAwsKeyManagementParams(sseAwsKeyManagementParams);
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
     * updated InitiateMultipartUploadRequest object so that additional method calls can be
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
     * @return The updated InitiateMultipartUploadRequest object.
     */
    public InitiateMultipartUploadRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

    /**
     * @return The tags for this object.
     */
    public ObjectTagging getTagging() {
        return tagging;
    }

    /**
     * Set the tags for this object.
     *
     * @param tagging
     *            The tags for this object.
     */
    public void setTagging(ObjectTagging tagging) {
        this.tagging = tagging;
    }

    /**
     * Set the tags for this object.
     *
     * @param tagging
     *            The tags for this object.
     *
     * @return The updated InitiateMultipartUploadRequest object.
     */
    public InitiateMultipartUploadRequest withTagging(ObjectTagging tagging) {
        setTagging(tagging);
        return this;
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public String getObjectLockMode() {
        return objectLockMode;
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public InitiateMultipartUploadRequest withObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
        return this;
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public InitiateMultipartUploadRequest withObjectLockMode(ObjectLockMode objectLockMode) {
        return withObjectLockMode(objectLockMode.toString());
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public void setObjectLockMode(String objectLockMode) {
        withObjectLockMode(objectLockMode);
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public void setObjectLockMode(ObjectLockMode objectLockMode) {
        setObjectLockMode(objectLockMode.toString());
    }

    /**
     * The date and time when you want this object's Object Lock to expire.
     */
    public Date getObjectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * The date and time when you want this object's Object Lock to expire.
     */
    public InitiateMultipartUploadRequest withObjectLockRetainUntilDate(Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        return this;
    }

    /**
     * The date and time when you want this object's Object Lock to expire.
     */
    public void setObjectLockRetainUntilDate(Date objectLockRetainUntilDate) {
        withObjectLockRetainUntilDate(objectLockRetainUntilDate);
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public String getObjectLockLegalHoldStatus() {
        return objectLockLegalHoldStatus;
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public InitiateMultipartUploadRequest withObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        return this;
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public InitiateMultipartUploadRequest withObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        return withObjectLockLegalHoldStatus(objectLockLegalHoldStatus.toString());
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        withObjectLockLegalHoldStatus(objectLockLegalHoldStatus);
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public void setObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        setObjectLockLegalHoldStatus(objectLockLegalHoldStatus.toString());
    }
}

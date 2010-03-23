/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.s3.AmazonS3;

/**
 * Options for deleting a specific version of an object in the specified bucket.
 * Once deleted, there is no method to restore or undelete an object version.
 * This is the only way to permanently delete object versions that are protected
 * by versioning.
 * <p>
 * Since deleting an object version is permanent and irreversible, it is a
 * privileged operation that only the owner of the bucket containing the version
 * may perform.
 * <p>
 * You can only delete a version of an object if you've enabled versioning for
 * your bucket. See
 * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
 * for more information about enabling versioning for a bucket.
 * <p>
 * Note: If you delete an object that does not exist, Amazon S3 will return a
 * success (not an error message).
 */
public class DeleteVersionRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Amazon S3 bucket containing the version to delete.
     */
    private String bucketName;

    /**
     * The key of the object version to delete.
     */
    private String key;

    /**
     * The version ID uniquely identifying which version of the object to
     * delete.
     */
    private String versionId;

    /**
     * The optional Multi-Factor Authentication information to include with this
     * request. Multi-Factor Authentication is required when deleting a version
     * from a bucket that has enabled MFA Delete in its bucket versioning
     * configuration. See
     * {@link BucketVersioningConfiguration#setMfaDeleteEnabled(Boolean)} for
     * more information on MFA Delete.
     */
    private MultiFactorAuthentication mfa;

    
    /**
     * Constructs a new DeleteVersionRequest object, ready to be executed to
     * delete the version identified by the specified version ID, in the
     * specified bucket and key.
     * 
     * @param bucketName
     *            The name of the bucket containing the version to delete.
     * @param key
     *            The key of the object version to delete.
     * @param versionId
     *            The version ID uniquely identifying the version to delete.
     */
    public DeleteVersionRequest(String bucketName, String key, String versionId) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = versionId;
    }

    /**
     * Constructs a new DeleteVersionRequest object, ready to be executed to
     * delete the version identified by the specified version ID, in the
     * specified bucket and key, with the specified Multi-Factor Authentication
     * (MFA) information. Multi-Factor Authentication is required when the MFA
     * Delete option has been enabled for a bucket's versioning configuration.
     * See {@link BucketVersioningConfiguration} for more details on MFA
     * Delete.
     * 
     * @param bucketName
     *            The name of the bucket containing the version to delete.
     * @param key
     *            The key of the object version to delete.
     * @param versionId
     *            The version ID uniquely identifying the version to delete.
     * @param mfa
     *            The Multi-Factor Authentication information to include in this
     *            request.
     */
    public DeleteVersionRequest(String bucketName, String key, String versionId, MultiFactorAuthentication mfa) {
        this(bucketName, key, versionId);
        this.mfa = mfa;
    }
    
    /**
     * Returns the name of the Amazon S3 bucket containing the version to
     * delete.
     * 
     * @return the name of the Amazon S3 bucket containing the version to
     *         delete.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket containing the version to delete.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the version to
     *            delete.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket containing the version to delete,
     * and returns this object so that additional method calls may be chained
     * together.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the version to
     *            delete.
     * 
     * @return The updated DeleteVersionRequest object so that additional method
     *         calls may be chained together.
     */
    public DeleteVersionRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the key of the version to delete.
     * 
     * @return The key of the version to delete.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key of the version to delete.
     * 
     * @param key
     *            The key of the version to delete.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key of the version to delete, and returns this object so that
     * additional method calls may be chained together.
     * 
     * @param key
     *            The key of the version to delete.
     * 
     * @return The updated DeleteVersionRequest object so that additional method
     *         calls may be chained together.
     */
    public DeleteVersionRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * Returns the version ID uniquely identifying which version of the object
     * to delete.
     * 
     * @return The version ID uniquely identifying which version of the object
     *         to delete.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the version version ID uniquely identifying which version of the
     * object to delete.
     * 
     * @param versionId
     *            The version ID uniquely identifying which version of
     *            the object to delete.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Sets the version ID uniquely identifying which version of the object to
     * delete, and returns this object so that additional method calls may be
     * chained together.
     * 
     * @param versionId
     *            The version ID uniquely identifying which version of the
     *            object to delete.
     * 
     * @return The updated DeleteVersionRequest object so that additional method
     *         calls may be chained together.
     */
    public DeleteVersionRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * Returns the optional Multi-Factor Authentication information included
     * with this request.
     * <p>
     * Multi-Factor Authentication is required when deleting an object version
     * from a bucket which has MFADelete enabled in its bucket versioning
     * configuration.
     * <p>
     * See {@link BucketVersioningConfiguration#setMfaDeleteEnabled(Boolean)}
     * for more information on MFADelete.
     * 
     * @return The optional Multi-Factor Authentication information included
     *         with this request.
     */
    public MultiFactorAuthentication getMfa() {
        return mfa;
    }

    /**
     * Sets the optional Multi-Factor Authentication information to include with
     * this request.
     * <p>
     * Multi-Factor Authentication is required when deleting an object version
     * from a bucket which has MFADelete enabled in its bucket versioning
     * configuration.
     * <p>
     * See {@link BucketVersioningConfiguration#setMfaDeleteEnabled(Boolean)}
     * for more information on MFADelete.
     * 
     * @param mfa
     *            The optional Multi-Factor Authentication information to
     *            include with this request.
     */
    public void setMfa(MultiFactorAuthentication mfa) {
        this.mfa = mfa;
    }

    /**
     * Sets the optional Multi-Factor Authentication information to include with
     * this request, and returns this object so that additional method calls may
     * be chained together.
     * <p>
     * Multi-Factor Authentication is required when deleting an object version
     * from a bucket which has MFADelete enabled in its bucket versioning
     * configuration
     * <p>
     * See {@link BucketVersioningConfiguration#setMfaDeleteEnabled(Boolean)}
     * for more information on MFADelete.
     * 
     * @param mfa
     *            The optional Multi-Factor Authentication information to
     *            include with this request.
     * 
     * @return The updated DeleteVersionRequest object so that additional method
     *         calls may be chained together.
     */
    public DeleteVersionRequest withMfa(MultiFactorAuthentication mfa) {
        setMfa(mfa);
        return this;
    }

}

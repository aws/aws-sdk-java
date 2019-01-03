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

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;

/**
 * Provides options for deleting multiple objects in a specified bucket. Once
 * deleted, the object(s) can only be restored if versioning was enabled when
 * the object(s) was deleted.You may specify up to <a href=
 * "http://docs.aws.amazon.com/AmazonS3/latest/API/multiobjectdeleteapi.html"
 * >1000 keys</a>. </p>
 *
 * @see AmazonS3#deleteObjects(DeleteObjectsRequest)
 */
public class DeleteObjectsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the Amazon S3 bucket containing the object(s) to delete.
     */
    private String bucketName;

    /**
     * Whether to enable quiet mode for the response. In quiet mode, only errors
     * are reported. Defaults to false.
     */
    private boolean quiet;

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
     * List of keys to delete, with optional versions.
     */
    private final List<KeyVersion> keys = new ArrayList<KeyVersion>();

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    private boolean bypassGovernanceRetention;

    /**
     * Constructs a new {@link DeleteObjectsRequest}, specifying the objects'
     * bucket name.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object(s) to
     *            delete.
     */
    public DeleteObjectsRequest(String bucketName) {
        setBucketName(bucketName);
    }

    /**
     * Gets the name of the Amazon S3 bucket containing the object(s) to delete.
     *
     * @return The name of the Amazon S3 bucket containing the object(s) to
     *         delete.
     * @see DeleteObjectsRequest#setBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket containing the object(s) to delete.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object(s) to
     *            delete.
     * @see DeleteObjectsRequest#getBucketName()
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket containing the object(s) to delete
     * and returns this object, enabling additional method calls to be chained
     * together.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object(s) to
     *            delete.
     * @return The updated {@link DeleteObjectsRequest} object, enabling
     *         additional method calls to be chained together.
     */
    public DeleteObjectsRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * Gets the optional Multi-Factor Authentication information included
     * with this request.
     * </p>
     * <p>
     * Multi-Factor Authentication is required when deleting an object version
     * from a bucket which has MFADelete enabled in its bucket versioning
     * configuration.
     * </p>
     * <p>
     * See {@link BucketVersioningConfiguration#setMfaDeleteEnabled(Boolean)}
     * for more information on MFADelete.
     * </p>
     *
     * @return The optional Multi-Factor Authentication information included
     *         with this request.
     */
    public MultiFactorAuthentication getMfa() {
        return mfa;
    }

    /**
     * <p>
     * Sets the optional Multi-Factor Authentication information to include with
     * this request.
     * </p>
     * <p>
     * Multi-Factor Authentication is required when deleting an object version
     * from a bucket which has MFADelete enabled in its bucket versioning
     * configuration.
     * </p>
     * <p>
     * See {@link BucketVersioningConfiguration#setMfaDeleteEnabled(Boolean)}
     * for more information on MFADelete.
     * </p>
     *
     * @param mfa
     *            The optional Multi-Factor Authentication information to
     *            include with this request.
     */
    public void setMfa(MultiFactorAuthentication mfa) {
        this.mfa = mfa;
    }

    /**
     * <p>
     * Sets the optional Multi-Factor Authentication information to include with
     * this request
     * Returns this, enabling additional method
     * calls to be chained together.
     * </p>
     * <p>
     * Multi-Factor Authentication is required when deleting an object version
     * from a bucket which has MFADelete enabled in its bucket versioning
     * configuration
     * </p>
     * <p>
     * See {@link BucketVersioningConfiguration#setMfaDeleteEnabled(Boolean)}
     * for more information on MFADelete.
     * </p>
     *
     * @param mfa
     *            The optional Multi-Factor Authentication information to
     *            include with this request.
     *
     * @return this, enabling additional method
     *         calls to be chained together.
     */
    public DeleteObjectsRequest withMfa(MultiFactorAuthentication mfa) {
        setMfa(mfa);
        return this;
    }

    /**
     * Sets the quiet element for this request. When true, only errors will be
     * returned in the service response.
     */
    public void setQuiet(boolean quiet) {
        this.quiet = quiet;
    }

    /**
     * Returns the quiet element for this request. When true, only errors will be
     * returned in the service response.
     */
    public boolean getQuiet() {
        return quiet;
    }

    /**
     * Sets the quiet element for this request. When true, only errors will be
     * returned in the service response.
     *
     * @return this, to chain multiple calls together.
     */
    public DeleteObjectsRequest withQuiet(boolean quiet) {
        this.setQuiet(quiet);
        return this;
    }

    /**
     * Sets the list of keys to delete from this bucket, clearing any existing
     * list of keys.
     *
     * @param keys
     *            The list of keys to delete from this bucket
     */
    public void setKeys(List<KeyVersion> keys) {
        this.keys.clear();
        this.keys.addAll(keys);
    }

    /**
     * Sets the list of keys to delete from this bucket, clearing any existing
     * list of keys.
     *
     * @param keys
     *            The list of keys to delete from this bucket
     *
     * @return this, to chain multiple calls togethers.
     */
    public DeleteObjectsRequest withKeys(List<KeyVersion> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * Returns the list of keys to delete from this bucket.
     */
    public List<KeyVersion> getKeys() {
        return keys;
    }

    /**
     * Convenience method to specify a set of keys without versions.
     *
     * @see DeleteObjectsRequest#withKeys(List)
     */
    public DeleteObjectsRequest withKeys(String... keys) {
        List<KeyVersion> keyVersions = new ArrayList<KeyVersion>(keys.length);
        for (String key : keys) {
            keyVersions.add(new KeyVersion(key));
        }
        setKeys(keyVersions);
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
     * updated DeleteObjectsRequest object so that additional method calls can be
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
     * @return The updated DeleteObjectsRequest object.
     */
    public DeleteObjectsRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

    /**
     * Specifies whether you want to delete this object even if it has a Governance-type Object Lock in place. You must
     * have sufficient permissions to perform this operation.
     */
    public boolean getBypassGovernanceRetention() {
        return bypassGovernanceRetention;
    }

    /**
     * Specifies whether you want to delete this object even if it has a Governance-type Object Lock in place. You must
     * have sufficient permissions to perform this operation.
     */
    public DeleteObjectsRequest withBypassGovernanceRetention(boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
        return this;
    }

    /**
     * Specifies whether you want to delete this object even if it has a Governance-type Object Lock in place. You must
     * have sufficient permissions to perform this operation.
     */
    public void setBypassGovernanceRetention(boolean bypassGovernanceRetention) {
        withBypassGovernanceRetention(bypassGovernanceRetention);
    }

    /**
     * A key to delete, with an optional version attribute.
     */
    public static class KeyVersion implements Serializable {

        private final String key;
        private final String version;

        /**
         * Constructs a key without a version.
         */
        public KeyVersion(String key) {
            this(key, null);
        }

        /**
         * Constructs a key-version pair.
         */
        public KeyVersion(String key, String version) {
            this.key = key;
            this.version = version;
        }

        public String getKey() {
            return key;
        }

        public String getVersion() {
            return version;
        }
    }
}

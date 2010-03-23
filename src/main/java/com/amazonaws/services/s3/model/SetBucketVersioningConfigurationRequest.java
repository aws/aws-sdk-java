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
import com.amazonaws.services.s3.internal.Constants;

/**
 * Options for setting the versioning configuration for a bucket.
 * <p>
 * A bucket's versioning configuration can be in one of three possible states:
 * <ul>
 * <li>{@link BucketVersioningConfiguration#OFF}
 * <li>{@link BucketVersioningConfiguration#ENABLED}
 * <li>{@link BucketVersioningConfiguration#SUSPENDED}
 * </ul>
 * <p>
 * By default, new buckets always start off in the
 * {@link BucketVersioningConfiguration#OFF off} state. Once versioning is
 * enabled for a bucket the status can never be reverted to
 * {@link BucketVersioningConfiguration#OFF off}.
 * <p>
 * Objects created before versioning was enabled or when versioning is suspended
 * will be given the default/null version ID (see
 * {@link Constants#NULL_VERSION_ID}). Note that the
 * {@link Constants#NULL_VERSION_ID} is a valid version ID and is not the same
 * as not having a version ID.
 * <p>
 * The versioning configuration of a bucket has different implications for each
 * operation performed on that bucket or for objects within that bucket. For
 * instance, when versioning is enabled, a PutObject operation creates a unique
 * object version-id for the object being uploaded. The PutObject API guarantees
 * that, if versioning is enabled for a bucket at the time of the request, the
 * new object can only be permanently deleted using the DeleteVersion operation.
 * It can never be overwritten. Additionally, PutObject guarantees that, if
 * versioning is enabled for a bucket the request, no other object will be
 * overwritten by that request. Refer to the documentation sections for each API
 * for information on how versioning status affects the semantics of that
 * particular API.
 * <p>
 * S3 is eventually consistent. It may take time for the versioning status of a
 * bucket to be propagated throughout the system.
 */
public class SetBucketVersioningConfigurationRequest extends AmazonWebServiceRequest {
    
    /**
     * The bucket whose versioning configuration is being set.
     */
    private String bucketName;

    /**
     * The new versioning configuration for the specified bucket.
     */
    private BucketVersioningConfiguration versioningConfiguration;
    
    /**
     * The optional Multi-Factor Authentication information to include with this
     * request. Multi-Factor Authentication is required when enabling or
     * disabling the MFA Delete option. See
     * {@link BucketVersioningConfiguration} for more details on MFA Delete.
     */
    private MultiFactorAuthentication mfa;
    
    /**
     * Constructs a new request to set the bucket versioning configuration of
     * the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket whose versioning configuration is being
     *            set.
     * @param configuration
     *            The new versioning configuration for the specified bucket.
     */
    public SetBucketVersioningConfigurationRequest(
            String bucketName, BucketVersioningConfiguration configuration) {
        this.bucketName = bucketName;
        this.versioningConfiguration = configuration;
    }

    /**
     * Constructs a new request to set the bucket versioning configuration of
     * the specified bucket, including the specified Multi-Factor Authentication
     * (MFA) information, which is required when changing the state of the MFA
     * Delete option.
     * 
     * @param bucketName
     *            The name of the bucket whose versioning configuration is being
     *            set.
     * @param configuration
     *            The new versioning configuration for the specified bucket.
     * @param mfa
     *            The Multi-Factor Authentication information to include in this
     *            request.
     */
    public SetBucketVersioningConfigurationRequest(
            String bucketName, BucketVersioningConfiguration configuration, 
            MultiFactorAuthentication mfa) {
        this(bucketName, configuration);
        this.mfa = mfa;
    }

    
    /**
     * Returns the name of the bucket whose versioning configuration is being
     * set.
     * 
     * @return The name of the bucket whose versioning configuration is being
     *         set.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket whose versioning configuration is being set.
     * 
     * @param bucketName
     *            The name of the bucket whose versioning configuration is being
     *            set.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket whose versioning configuration is being set,
     * and returns this object so that additional method calls may be chained
     * together.
     * 
     * @param bucketName
     *            The name of the bucket whose versioning configuration is being
     *            set.
     * 
     * @return This SetBucketVersioningConfigurationRequest object so that
     *         additional method calls may be chained together.
     */
    public SetBucketVersioningConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the new versioning configuration for the specified bucket.
     * 
     * @return The new versioning configuration for the specified bucket.
     */
    public BucketVersioningConfiguration getVersioningConfiguration() {
        return versioningConfiguration;
    }

    /**
     * Sets the new versioning configuration for the specified bucket.
     * 
     * @param versioningConfiguration
     *            The new versioning configuration for the specified bucket.
     */
    public void setVersioningConfiguration(
            BucketVersioningConfiguration versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    /**
     * Sets the new versioning configuration for the specified bucket, and
     * returns this object so that additional method calls may be chained
     * together.
     * 
     * @param versioningConfiguration
     *            The new versioning configuration for the specified bucket.
     * 
     * @return This SetBucketVersioningConfigurationRequest object so that
     *         additional method calls may be chained together.
     */
    public SetBucketVersioningConfigurationRequest withVersioningConfiguration(
            BucketVersioningConfiguration versioningConfiguration) {
        setVersioningConfiguration(versioningConfiguration);
        return this;
    }

    /**
     * Returns the optional Multi-Factor Authentication information included
     * with this request.
     * <p>
     * Multi-Factor Authentication is required when enabling or disabling MFA
     * Delete functionality for a bucket.
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
     * Multi-Factor Authentication is required when enabling or disabling MFA
     * delete functionality for a bucket.
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
     * Multi-Factor Authentication is required when enabling or disabling MFA
     * delete functionality for a bucket.
     * <p>
     * See {@link BucketVersioningConfiguration#setMfaDeleteEnabled(Boolean)}
     * for more information on MFADelete.
     * 
     * @param mfa
     *            The optional Multi-Factor Authentication information to
     *            include with this request.
     * 
     * @return The updated SetBucketVersioningConfigurationRequest object so
     *         that additional method calls may be chained together.
     */
    public SetBucketVersioningConfigurationRequest withMfa(MultiFactorAuthentication mfa) {
        setMfa(mfa);
        return this;
    }

}

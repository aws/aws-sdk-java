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
import com.amazonaws.services.s3.internal.Constants;

/**
 * <p>
 * Contains options for setting the versioning configuration for a bucket.
 * </p>
 * <p>
 * A bucket's versioning configuration can be in one of three possible states:
 * <ul>
 *  <li>{@link BucketVersioningConfiguration#OFF}
 *  <li>{@link BucketVersioningConfiguration#ENABLED}
 *  <li>{@link BucketVersioningConfiguration#SUSPENDED}
 * </ul>
 * </p>
 * <p>
 * By default, new buckets are created in the
 * {@link BucketVersioningConfiguration#OFF} state. Once versioning is
 * enabled for a bucket, its status can never be reverted to
 * {@link BucketVersioningConfiguration#OFF off}.
 * </p>
 * <p>
 * Objects created before versioning is enabled or while versioning is suspended
 * will be given the default <code>null</code> version ID (see
 * {@link Constants#NULL_VERSION_ID}). Note that the
 * <code>null</code> version ID is a valid version ID and is not the same
 * as having no version ID.
 * </p>
 * <p>
 * The versioning configuration of a bucket has different implications for each
 * operation performed on that bucket or for objects within that bucket. When 
 * versioning is enabled, a <code>PutObject</code> operation creates a unique
 * object version ID for the object being uploaded. The <code>PutObject</code> operation
 * guarantees that if versioning is enabled for a bucket at the time of the request, the
 * new object can only be permanently deleted by calling the <code>DeleteVersion</code> operation
 * and can never be overwritten.
 * </p>
 * <p>
 * Additionally, the <code>PutObject</code> operation guarantees that if
 * versioning is enabled for a bucket at the time of the request, no other object will be
 * overwritten by that request. Refer to the documentation sections for individual APIs
 * for information on how versioning status affects the semantics of that
 * particular API.
 * </p>
 * <p>
 * Amazon S3 is eventually consistent. It may take time for the versioning status of a
 * bucket to be propagated throughout the system.
 * </p>
 * 
 * @see SetBucketVersioningConfigurationRequest#SetBucketVersioningConfigurationRequest(String, BucketVersioningConfiguration)
 * @see SetBucketVersioningConfigurationRequest#SetBucketVersioningConfigurationRequest(String, BucketVersioningConfiguration, MultiFactorAuthentication)
 */
public class SetBucketVersioningConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    
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
     * Constructs a new {@link SetBucketVersioningConfigurationRequest} 
     * to set the bucket versioning configuration of
     * the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket whose versioning configuration is being
     *            set.
     * @param configuration
     *            The new versioning configuration for the specified bucket.
     *            
     * @see SetBucketVersioningConfigurationRequest#SetBucketVersioningConfigurationRequest(String, BucketVersioningConfiguration, MultiFactorAuthentication)          
     */
    public SetBucketVersioningConfigurationRequest(
            String bucketName, BucketVersioningConfiguration configuration) {
        this.bucketName = bucketName;
        this.versioningConfiguration = configuration;
    }

    /**
     * Constructs a new {@link SetBucketVersioningConfigurationRequest} 
     * to set the bucket versioning configuration of
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
     *            
     * @see SetBucketVersioningConfigurationRequest#SetBucketVersioningConfigurationRequest(String, BucketVersioningConfiguration)           
     */
    public SetBucketVersioningConfigurationRequest(
            String bucketName, BucketVersioningConfiguration configuration, 
            MultiFactorAuthentication mfa) {
        this(bucketName, configuration);
        this.mfa = mfa;
    }

    
    /**
     * Gets the name of the bucket whose versioning configuration is being
     * set.
     * 
     * @return The name of the bucket whose versioning configuration is being
     *         set.
     *         
     * @see SetBucketVersioningConfigurationRequest#setBucketName(String)
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
     *            
     * @see SetBucketVersioningConfigurationRequest#getBucketName()           
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
     * @return This {@link SetBucketVersioningConfigurationRequest} object so that
     *         additional method calls may be chained together.
     *         
     * @see SetBucketVersioningConfigurationRequest#setBucketName(String)       
     */
    public SetBucketVersioningConfigurationRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the new versioning configuration for the specified bucket.
     * 
     * @return The new versioning configuration for the specified bucket.
     * 
     * @see SetBucketVersioningConfigurationRequest#setVersioningConfiguration(BucketVersioningConfiguration)
     * @see SetBucketVersioningConfigurationRequest#withVersioningConfiguration(BucketVersioningConfiguration)
     */
    public BucketVersioningConfiguration getVersioningConfiguration() {
        return versioningConfiguration;
    }

    /**
     * Sets the new versioning configuration for the specified bucket.
     * 
     * @param versioningConfiguration
     *            The new versioning configuration for the specified bucket.
     *            
     * @see SetBucketVersioningConfigurationRequest#getVersioningConfiguration()           
     * @see SetBucketVersioningConfigurationRequest#withVersioningConfiguration(BucketVersioningConfiguration)
     */
    public void setVersioningConfiguration(
            BucketVersioningConfiguration versioningConfiguration) {
        this.versioningConfiguration = versioningConfiguration;
    }

    /**
     * Sets the new versioning configuration for the specified bucket and
     * returns this object, enabling additional method calls to be chained
     * together.
     * 
     * @param versioningConfiguration
     *            The new versioning configuration for the specified bucket.
     * 
     * @return This {@link SetBucketVersioningConfigurationRequest} object, enabling that
     *         additional method calls may be chained together.
     *         
     * @see SetBucketVersioningConfigurationRequest#getVersioningConfiguration()  
     * @see SetBucketVersioningConfigurationRequest#getVersioningConfiguration()               
     */
    public SetBucketVersioningConfigurationRequest withVersioningConfiguration(
            BucketVersioningConfiguration versioningConfiguration) {
        setVersioningConfiguration(versioningConfiguration);
        return this;
    }

    /**
     * <p>
     * Gets the optional Multi-Factor Authentication information included
     * with this request.
     * </p>
     * <p>
     * Multi-Factor Authentication is required when enabling or disabling MFA
     * Delete functionality for a bucket.
     * </p>
     * <p>
     * See {@link BucketVersioningConfiguration#setMfaDeleteEnabled(Boolean)}
     * for more information on MFADelete.
     * </p>
     * 
     * @return The optional Multi-Factor Authentication information included
     *         with this request.
     *         
     * @see SetBucketVersioningConfigurationRequest#setMfa(MultiFactorAuthentication)
     * @see SetBucketVersioningConfigurationRequest#withMfa(MultiFactorAuthentication)
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
     * @see SetBucketVersioningConfigurationRequest#getMfa()
     * @see SetBucketVersioningConfigurationRequest#withMfa(MultiFactorAuthentication)
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
     * @return The updated SetBucketVersioningConfigurationRequest object so
     *         that additional method calls may be chained together.
     *         
     * @see SetBucketVersioningConfigurationRequest#getMfa()
     * @see SetBucketVersioningConfigurationRequest#setMfa(MultiFactorAuthentication)       
     */
    public SetBucketVersioningConfigurationRequest withMfa(MultiFactorAuthentication mfa) {
        setMfa(mfa);
        return this;
    }

}

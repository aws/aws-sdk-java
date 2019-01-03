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
import com.amazonaws.services.s3.AmazonS3;

/**
 * <p>
 * Provides options for deleting a specific version of an object in the specified bucket.
 * Once deleted, there is no method to restore or undelete an object version.
 * This is the only way to permanently delete object versions that are protected
 * by versioning.
 * </p>
 * <p>
 * Because deleting an object version is permanent and irreversible, it is a
 * privileged operation that only the owner of the bucket containing the version
 * may perform.
 * </p>
 * <p>
 * An owner can only delete a version of an object if the owner has enabled versioning for
 * their bucket. 
 * For more information about enabling versioning for a bucket, see 
 * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
 * </p>
 * <p>
 * Note: When attempting to delete an object that does not exist, 
 * Amazon S3 returns a
 * success message, not an error message.
 * </p>
 */
public class DeleteVersionRequest extends AmazonWebServiceRequest implements Serializable {

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

    private boolean bypassGovernanceRetention;

    
    /**
     * Constructs a new {@link DeleteVersionRequest} object, 
     * ready to be executed to
     * delete the version identified by the specified version ID, in the
     * specified bucket and key.
     * 
     * @param bucketName
     *            The name of the bucket containing the version to delete.
     * @param key
     *            The key of the object version to delete.
     * @param versionId
     *            The version ID identifying the version to delete.
     *            
     * @see DeleteVersionRequest#DeleteVersionRequest(String, String, String, MultiFactorAuthentication)          
     */
    public DeleteVersionRequest(String bucketName, String key, String versionId) {
        this.bucketName = bucketName;
        this.key = key;
        this.versionId = versionId;
    }

    /**
     * Constructs a new {@link DeleteVersionRequest} object, 
     * ready to be executed to
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
     *            
     * @see DeleteVersionRequest#DeleteVersionRequest(String, String, String)           
     */
    public DeleteVersionRequest(String bucketName, String key, String versionId, MultiFactorAuthentication mfa) {
        this(bucketName, key, versionId);
        this.mfa = mfa;
    }
    
    /**
     * Gets the name of the Amazon S3 bucket containing the version to
     * delete.
     * 
     * @return The name of the Amazon S3 bucket containing the version to
     *         delete.
     *         
     * @see DeleteVersionRequest#setBucketName(String)
     * @see DeleteVersionRequest#withBucketName(String)        
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
     *            
     * @see DeleteVersionRequest#getBucketName()
     * @see DeleteVersionRequest#withBucketName(String)           
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket containing the version to delete.     
     * Returns this {@link DeleteVersionRequest}, enabling additional method
     * calls to be chained together.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the version to
     *            delete.
     * 
     * @return The updated {@link DeleteVersionRequest} object,
     *         enabling additional method
     *         calls to be chained together.
     *         
     * @see DeleteVersionRequest#getBucketName()   
     * @see DeleteVersionRequest#setBucketName(String)   
     */
    public DeleteVersionRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the key of the version to delete.
     * 
     * @return The key of the version to delete.
     * 
     * @see DeleteVersionRequest#setKey(String)
     * @see DeleteVersionRequest#withKey(String)
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key of the version to delete.
     * 
     * @param key
     *            The key of the version to delete.
     *            
     * @see DeleteVersionRequest#getKey()         
     * @see DeleteVersionRequest#withKey(String)     
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key of the version to delete     
     * Returns this {@link DeleteVersionRequest}, enabling additional method
     * calls to be chained together.
     * 
     * @param key
     *            The key of the version to delete.
     * 
     * @return This {@link DeleteVersionRequest}, enabling additional method
     *         calls to be chained together.
     * 
     * @see DeleteVersionRequest#getKey()        
     * @see DeleteVersionRequest#setKey(String)      
     */
    public DeleteVersionRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * Gets the version ID uniquely identifying which version of the object
     * to delete.
     * 
     * @return The version ID uniquely identifying which version of the object
     *         to delete.
     *         
     * @see DeleteVersionRequest#setVersionId(String)
     * @see DeleteVersionRequest#withVersionId(String)    
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the version ID uniquely identifying which version of the
     * object to delete.
     * 
     * @param versionId
     *            The version ID uniquely identifying which version of
     *            the object to delete.
     *            
     * @see DeleteVersionRequest#getVersionId()           
     * @see DeleteVersionRequest#withVersionId(String)                
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Sets the version ID uniquely identifying which version of the object to
     * delete
     * Returns this {@link DeleteVersionRequest}, enabling additional method
     * calls to be chained together.
     * 
     * @param versionId
     *            The version ID uniquely identifying which version of the
     *            object to delete.
     * 
     * @return This {@link DeleteVersionRequest}, enabling additional method
     *         calls to be chained together.
     *         
     * @see DeleteVersionRequest#getVersionId()
     * @see DeleteVersionRequest#setVersionId(String)         
     */
    public DeleteVersionRequest withVersionId(String versionId) {
        setVersionId(versionId);
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
     *         
     * @see DeleteVersionRequest#setMfa(MultiFactorAuthentication)
     * @see DeleteVersionRequest#withMfa(MultiFactorAuthentication)        
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
     *            
     * @see DeleteVersionRequest#getMfa()
     * @see DeleteVersionRequest#withMfa(MultiFactorAuthentication)   
     */
    public void setMfa(MultiFactorAuthentication mfa) {
        this.mfa = mfa;
    }

    /**
     * <p>
     * Sets the optional Multi-Factor Authentication information to include with
     * this request
     * Returns this {@link DeleteVersionRequest}, enabling additional method
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
     * @return This {@link DeleteVersionRequest}, enabling additional method
     *         calls to be chained together.
     *         
     * @see DeleteVersionRequest#getMfa()
     * @see DeleteVersionRequest#withMfa(MultiFactorAuthentication)           
     */
    public DeleteVersionRequest withMfa(MultiFactorAuthentication mfa) {
        setMfa(mfa);
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
    public DeleteVersionRequest withBypassGovernanceRetention(boolean bypassGovernanceRetention) {
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

}

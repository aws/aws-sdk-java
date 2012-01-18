/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;

/**
 * <p>
 * Provides options for deleting multiple objects in a specified bucket. Once
 * deleted, the object(s) can only be restored if versioning was enabled when
 * the object(s) was deleted.
 * </p>
 * 
 * @see AmazonS3#deleteObjects(DeleteObjectsRequest)
 */
public class DeleteObjectsRequest extends AmazonWebServiceRequest {

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
    private List<KeyVersion> keys = new ArrayList<DeleteObjectsRequest.KeyVersion>();

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
        List<KeyVersion> keyVersions = new LinkedList<KeyVersion>();
        for (String key : keys) {
            keyVersions.add(new KeyVersion(key));
        }
        setKeys(keyVersions);
        return this;
    }
    
    /**
     * A key to delete, with an optional version attribute.
     */
    public static class KeyVersion {

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

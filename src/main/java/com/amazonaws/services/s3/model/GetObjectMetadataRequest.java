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

/**
 * <p>
 * Provides options for obtaining 
 * the metadata for the specified Amazon S3 object without actually
 * fetching the object contents.
 * This is useful if
 * obtaining only object metadata, and avoids wasting 
 * bandwidth from retrieving the object data.
 * </p>
 * <p>
 * The object metadata contains information such as content type, content
 * disposition, etc., as well as custom user metadata that can be associated
 * with an object in Amazon S3.
 * </p>
 * <p>
 * For more information about enabling versioning for a bucket, see 
 * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
 * </p>
 * 
 * @see GetObjectMetadataRequest#GetObjectMetadataRequest(String, String)
 * @see GetObjectMetadataRequest#GetObjectMetadataRequest(String, String, String)
 * @see GetObjectRequest
 */
public class GetObjectMetadataRequest extends AmazonWebServiceRequest {

    /**
     * The name of the bucket containing the object's whose metadata is being
     * retrieved.
     */
    private String bucketName;

    /**
     * The key of the object whose metadata is being retrieved.
     */
    private String key;

    /**
     * The optional version ID of the object version whose metadata is being
     * retrieved. If not specified, the latest version will be used.
     */
    private String versionId;

    /**
     * Constructs a new 
     * {@link GetObjectMetadataRequest}
     * used to retrieve a specified
     * object's metadata.
     * 
     * @param bucketName
     *            The name of the bucket containing the object whose metadata
     *            is being retrieved.
     * @param key
     *            The key of the object whose metadata is being retrieved.
     * 
     * @see GetObjectMetadataRequest#GetObjectMetadataRequest(String bucketName, String key, String versionId)
     */
    public GetObjectMetadataRequest(String bucketName, String key) {
        setBucketName(bucketName);
        setKey(key);
    }

    /**
     * Constructs a new 
     * {@link GetObjectMetadataRequest} 
     * with basic options.
     * 
     * @param bucketName
     *            The name of the bucket containing the object whose metadata
     *            is being retrieved.
     * @param key
     *            The key of the object whose metadata is being retrieved.
     * @param versionId
     *            The version ID of the object version whose metadata is being
     *            retrieved.
     * 
     * @see GetObjectMetadataRequest#GetObjectMetadataRequest(String bucketName, String key)
     */
    public GetObjectMetadataRequest(String bucketName, String key, String versionId) {
        this(bucketName, key);
        setVersionId(versionId);
    }

    /**
     * Gets the name of the bucket containing the object whose metadata is
     * being retrieved.
     * 
     * @return The name of the bucket containing the object whose metadata is
     *         being retrieved.
     *         
     * @see GetObjectMetadataRequest#setBucketName(String bucketName)
     * @see GetObjectMetadataRequest#withBucketName(String)    
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the object whose metadata is
     * being retrieved.
     * 
     * @param bucketName
     *            The name of the bucket containing the object's whose metadata
     *            is being retrieved.
     *            
     * @see GetObjectMetadataRequest#getBucketName()
     * @see GetObjectMetadataRequest#withBucketName(String)     
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket containing the object whose metadata is
     * being retrieved.
     * Returns this {@link GetObjectMetadataRequest}, enabling additional method
     * calls to be chained together.
     * 
     * @param bucketName
     *            The name of the bucket containing the object's whose metadata
     *            is being retrieved.
     *            
     * @return This {@link GetObjectMetadataRequest}, enabling additional method
     *         calls to be chained together.
     *         
     * @see GetObjectMetadataRequest#getBucketName()
     * @see GetObjectMetadataRequest#setBucketName(String bucketName)      
     */
    public GetObjectMetadataRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the key of the object whose metadata is being retrieved.
     * 
     * @return The key of the object whose metadata is being retrieved.
     * 
     * @see GetObjectMetadataRequest#setKey(String)
     * @see GetObjectMetadataRequest#withKey(String)
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key of the object whose metadata is being retrieved.
     * 
     * @param key
     *            The key of the object whose metadata is being retrieved.
     *            
     * @see GetObjectMetadataRequest#getKey()
     * @see GetObjectMetadataRequest#withKey(String)          
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key of the object whose metadata is being retrieved.
     * Returns this {@link GetObjectMetadataRequest}, enabling additional method
     * calls to be chained together.
     * 
     * @param key
     *            The key of the object whose metadata is being retrieved.
     * 
     * @return This {@link GetObjectMetadataRequest}, enabling additional method
     *         calls to be chained together.
     *         
     * @see GetObjectMetadataRequest#getKey()  
     * @see GetObjectMetadataRequest#setKey(String)  
     */
    public GetObjectMetadataRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * Gets the optional version ID of the object version whose metadata is
     * being retrieved. If not specified, the latest version will be used.
     * 
     * @return The optional version ID of the object version whose metadata is
     *         being retrieved. If not specified, the latest version will be
     *         used.
     *         
     * @see GetObjectMetadataRequest#setVersionId(String)   
     * @see GetObjectMetadataRequest#withVersionId(String)     
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the optional version ID of the object version whose metadata is
     * being retrieved. If not specified, the latest version will be used.
     * 
     * @param versionId
     *            The optional version ID of the object version whose metadata
     *            is being retrieved. If not specified, the latest version will
     *            be used.
     *            
     * @see GetObjectMetadataRequest#getVersionId()
     * @see GetObjectMetadataRequest#withVersionId(String)            
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Sets the optional version ID of the object version whose metadata is
     * being retrieved.
     * Returns this {@link GetObjectMetadataRequest}, enabling additional method
     * calls to be chained together.
     * If not specified, the latest version will be used.
     * 
     * @param versionId
     *            The optional version ID of the object version whose metadata
     *            is being retrieved.
     * 
     * @return This {@link GetObjectMetadataRequest}, enabling additional method
     *         calls to be chained together.
     *         
     * @see GetObjectMetadataRequest#getVersionId()
     * @see GetObjectMetadataRequest#setVersionId(String)         
     */
    public GetObjectMetadataRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

}

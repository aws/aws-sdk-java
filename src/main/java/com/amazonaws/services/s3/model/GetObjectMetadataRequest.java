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
 * Retrieves the metadata for the specified Amazon S3 object (with an optional
 * version ID) without actually fetching the object contents. This is useful if
 * you're only interested in the object metadata, and don't want to waste
 * bandwidth on the object data.
 * <p>
 * The object metadata contains information such as content type, content
 * disposition, etc., as well as custom user metadata that can be associated
 * with an object in S3.
 * <p>
 * See
 * {@link com.amazonaws.services.s3.AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
 * for more information about enabling versioning for a bucket.
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
     * Constructs a new GetObjectMetadataRequest to retrieve the specified
     * object's metadata.
     * 
     * @param bucketName
     *            The name of the bucket containing the object's whose metadata
     *            is being retrieved.
     * @param key
     *            The key of the object whose metadata is being retrieved.
     */
    public GetObjectMetadataRequest(String bucketName, String key) {
        setBucketName(bucketName);
        setKey(key);
    }

    /**
     * Constructs a new GetObjectMetadataRequest to retrieve the object metadata
     * of a specific version of an object stored in Amazon S3.
     * 
     * @param bucketName
     *            The name of the bucket containing the object's whose metadata
     *            is being retrieved.
     * @param key
     *            The key of the object whose metadata is being retrieved.
     * @param versionId
     *            The version ID of the object version whose metadata is being
     *            retrieved.
     */
    public GetObjectMetadataRequest(String bucketName, String key, String versionId) {
        this(bucketName, key);
        setVersionId(versionId);
    }

    /**
     * Returns the name of the bucket containing the object's whose metadata is
     * being retrieved.
     * 
     * @return The name of the bucket containing the object's whose metadata is
     *         being retrieved.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the object's whose metadata is
     * being retrieved.
     * 
     * @param bucketName
     *            The name of the bucket containing the object's whose metadata
     *            is being retrieved.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket containing the object's whose metadata is
     * being retrieved, and returns the updated request object so that
     * additional calls may be chained together.
     * 
     * @param bucketName
     *            The name of the bucket containing the object's whose metadata
     *            is being retrieved.
     *            
     * @return The updated request object so that additional method calls may be
     *         chained together.
     */
    public GetObjectMetadataRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the key of the object whose metadata is being retrieved.
     * 
     * @return The key of the object whose metadata is being retrieved.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key of the object whose metadata is being retrieved.
     * 
     * @param key
     *            The key of the object whose metadata is being retrieved.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key of the object whose metadata is being retrieved, and returns
     * the updated request object so that additional calls may be chained
     * together.
     * 
     * @param key
     *            The key of the object whose metadata is being retrieved.
     * 
     * @return The updated request object so that additional method calls may be
     *         chained together.
     */
    public GetObjectMetadataRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * Returns the optional version ID of the object version whose metadata is
     * being retrieved. If not specified, the latest version will be used.
     * 
     * @return The optional version ID of the object version whose metadata is
     *         being retrieved. If not specified, the latest version will be
     *         used.
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
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Sets the optional version ID of the object version whose metadata is
     * being retrieved , and returns the updated request object so that
     * additional calls may be chained together.
     * <p>
     * If not specified, the latest version will be used.
     * 
     * @param versionId
     *            The optional version ID of the object version whose metadata
     *            is being retrieved.
     * 
     * @return The updated request object so that additional method calls may be
     *         chained together.
     */
    public GetObjectMetadataRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

}

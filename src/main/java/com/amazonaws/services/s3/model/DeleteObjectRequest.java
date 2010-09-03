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
 * Provides options for deleting a specified object in a specified bucket. 
 * Once deleted, the object
 * can only be restored if versioning was enabled when the object was deleted.
 * </p>
 * <p>
 * Note: If deleting an object that does not exist, Amazon S3 returns
 * a success message, not an error message.
 * </p>
 *
 * @see deleteObject(String bucketName, String key)
 * @see deleteObject(DeleteObjectRequest deleteObjectRequest)
 */
public class DeleteObjectRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Amazon S3 bucket containing the object to delete.
     */
    private String bucketName;

    /**
     * The key of the object to delete.
     */
    private String key;


    /**
     * Constructs a new 
     * {@link DeleteObjectRequest}, 
     * specifying the object's bucket name and key.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object to
     *            delete.
     * @param key
     *            The key of the object to delete.
     */
    public DeleteObjectRequest(String bucketName, String key) {
        setBucketName(bucketName);
        setKey(key);
    }


    /**
     * Gets the name of the Amazon S3 bucket containing the object to
     * delete.
     * 
     * @return The name of the Amazon S3 bucket containing the object to
     *         delete.
     *         
     * @see DeleteObjectRequest#setBucketName(String)       
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket containing the object to delete.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object to
     *            delete.
     * @see DeleteObjectRequest#getBucketName()               
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket containing the object to delete
     * and returns this object, enabling additional method calls to be chained
     * together.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object to
     *            delete.
     * 
     * @return The updated {@link DeleteObjectRequest} 
     *         object, enabling additional method
     *         calls to be chained together.
     */
    public DeleteObjectRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the key of the object to delete.
     * 
     * @return The key of the object to delete.
     * 
     * @see DeleteObjectRequest#setKey(String)
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key of the object to delete.
     * 
     * @param key
     *            The key of the object to delete.
     *            
     * @see DeleteObjectRequest#getKey()           
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key of the object to delete and returns this object, enabling
     * additional method calls to be chained together.
     * 
     * @param key
     *            The key of the object to delete.
     * 
     * @return The updated {@link DeleteObjectRequest} object, enabling additional method
     *         calls to chained together.
     */
    public DeleteObjectRequest withKey(String key) {
        setKey(key);
        return this;
    }
    
}

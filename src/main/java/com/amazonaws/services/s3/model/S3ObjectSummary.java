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

import java.util.Date;

/**
 * Summary of an object stored in an Amazon S3 bucket. Doesn't contain the
 * object's full metadata or any of the contents.
 */
public class S3ObjectSummary {

    /** The name of the bucket in which this object is stored */
    protected String bucketName;

    /** The key under which this object is stored */
    protected String key;

    /** Hex encoded MD5 hash of this object's contents, as computed by Amazon S3 */
    protected String eTag;

    /** The size of this object, in bytes */
    protected long size;

    /** The date, according to Amazon S3, when this object was last modified */
    protected Date lastModified;

    /** The class of storage used by Amazon S3 to store this object */
    protected String storageClass;
    
    /**
     * The owner of this object - can be null if the requester doesn't have
     * permission to view object ownership information
     */
    protected Owner owner;


    /**
     * Returns the name of the Amazon S3 bucket in which this object is stored.
     * 
     * @return The name of the Amazon S3 bucket in which this object is stored.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket in which this object is stored.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket in which this object is
     *            stored.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Returns the key under which this object is stored in Amazon S3.
     * 
     * @return The key under which this object is stored in Amazon S3.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key under which this object is stored in Amazon S3.
     * 
     * @param key
     *            The key under which this object is stored in Amazon S3.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Returns the hex encoded 128 bit MD5 hash of this object's contents, as
     * computed by Amazon S3.
     * 
     * @return The hex encoded 128 bit MD5 hash of this object's contents, as
     *         computed by Amazon S3.
     */
    public String getETag() {
        return eTag;
    }

    /**
     * Sets the hex encoded 128 bit MD5 hash of this object's contents, as
     * computed by Amazon S3.
     * 
     * @param eTag
     *            The hex encoded 128 bit MD5 hash of this object's contents, as
     *            computed by Amazon S3.
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * Returns the size of this object, in bytes.
     * 
     * @return The size of this object, in bytes.
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the size of this object, in bytes.
     * 
     * @param size
     *            The size of this object, in bytes.
     */
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * Returns the date, according to Amazon S3, at which this object was last
     * modified.
     * 
     * @return The date, according to Amazon S3, at which this object was last
     *         modified.
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * Sets the date, according to Amazon S3, at which this object was last
     * modified.
     * 
     * @param lastModified
     *            The date, according to Amazon S3, at which this object was
     *            last modified.
     */
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Returns the owner of this object, or null if the requester doesn't have
     * {@link Permission#ReadAcp} permission for this object (or own the bucket
     * in which it resides) and therefore doesn't have permission to see object
     * ownership.
     * 
     * @return The owner of this object, or null if the requester doesn't have
     *         permission to see object ownership.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the owner of this object.
     * 
     * @param owner
     *            The owner of this object.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Returns the type of storage used by Amazon S3 for this object.
     * 
     * @return The type of storage used by Amazon S3 for this object.
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the type of storage used by Amazon S3 for this object.
     * 
     * @param storageClass
     *            The type of storage used by Amazon S3 for this object.
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

}

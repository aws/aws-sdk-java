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

import com.amazonaws.services.s3.internal.Constants;

/**
 * Summary of a version stored in an Amazon S3 bucket. Doesn't contain the
 * version's full metadata or any of the contents.
 */
public class S3VersionSummary {
    
    /** The name of the bucket in which this version is stored */
    protected String bucketName;
    
    /** The key under which this version is stored */
    private String key;
    
    /** The version ID uniquely identifying this version of an object */
    private String versionId;
    
    /** True if this is the latest version of the associated object */
    private boolean isLatest;
    
    /** The date, according to Amazon S3, when this version was last modified */
    private Date lastModified;

    /**
     * The owner of this version of the associated object - can be null if the
     * requester doesn't have permission to view object ownership information
     */
    private Owner owner;

    /** Hex encoded MD5 hash of this version's contents, as computed by Amazon S3 */
    private String eTag;
    
    /** The size of this version, in bytes */
    private long size;
    
    /** The class of storage used by Amazon S3 to store this version */
    private String storageClass;
    
    /** True if this object represents a delete marker */
    private boolean isDeleteMarker;

    
    /**
     * Returns the name of the Amazon S3 bucket in which this version is stored.
     * 
     * @return The name of the Amazon S3 bucket in which this version is stored.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket in which this version is stored.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket in which this version is
     *            stored.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    /**
     * Returns the key under which this version is stored in Amazon S3.
     * 
     * @return The key under which this version is stored in Amazon S3.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key under which this version is stored in Amazon S3.
     * 
     * @param key
     *            The key under which this version is stored in Amazon S3.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Returns the version ID which uniquely identifies this version of an
     * object.
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default/null version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * {@link Constants#NULL_VERSION_ID} is a valid version ID and is not the
     * same as not having a version ID.
     * 
     * @return The version ID which uniquely identifies this version of an
     *         object.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the version ID which uniquely identifies this version of an object.
     * 
     * @param id
     *            The version ID which uniquely identifies this version of an
     *            object.
     */
    public void setVersionId(String id) {
        this.versionId = id;
    }

    /**
     * Returns true if this version is the latest version for the associated
     * object.
     * 
     * @return True if this version is the latest version for the associated
     *         object, otherwise false.
     */
    public boolean isLatest() {
        return this.isLatest;
    }

    /**
     * Sets whether this version is the latest version for the associated
     * object. This method is intended to be used only by the client internals
     * and developers shouldn't need to use it.
     * 
     * @param isLatest
     *            True if this version represents the latest version for the
     *            associated object in S3.
     */
    public void setIsLatest(boolean isLatest) {
        this.isLatest = isLatest;
    }

    /**
     * Returns the date, according to Amazon S3, at which this version was last
     * modified.
     * 
     * @return The date, according to Amazon S3, at which this version was last
     *         modified.
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * Sets the date, according to Amazon S3, at which this version was last
     * modified.
     * 
     * @param lastModified
     *            The date, according to Amazon S3, at which this version was
     *            last modified.
     */
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Returns the owner of this version, or null if the requester doesn't have
     * {@link Permission#ReadAcp} permission for this version (or own the bucket
     * in which it resides) and therefore doesn't have permission to see object
     * ownership.
     * 
     * @return The owner of this version, or null if the requester doesn't have
     *         permission to see object ownership for this version.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the owner of this version. This method is intended to be used only
     * by the client internals and developers shouldn't need to use it.
     * 
     * @param owner
     *            The owner of this object.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Returns true if this version represents a delete marker.
     * <p>
     * Delete markers are special types of versions that have no data associated
     * with them. Deleting an versioned object in Amazon S3 without specifying
     * an explicit version ID a new delete marker is created as the latest
     * version of that object to mark that the object was deleted, even though
     * the previous versions still exist in Amazon S3.
     * <p>
     * Delete markers have no data associated with them and therefore have no
     * associated ACL, size or storage class. Only requesters with read access
     * to a bucket can learn of their existence by listing the versions in a
     * bucket.
     * 
     * @return True if this version represents a delete marker.
     */
    public boolean isDeleteMarker() {
        return isDeleteMarker;
    }

    /**
     * Intended for internal use only in the S3 client code. Sets the value of
     * the isDeleteMarker property to record if this is a delete marker or not.
     * 
     * @param isDeleteMarker
     *            True if this version summary represents a delete marker,
     *            otherwise false if it is a regular version summary.
     */
    public void setIsDeleteMarker(boolean isDeleteMarker) {
        this.isDeleteMarker = isDeleteMarker;
    }

    /**
     * Returns the hex encoded 128 bit MD5 hash of this version's contents, as
     * computed by Amazon S3.
     * 
     * @return The hex encoded 128 bit MD5 hash of this version's contents, as
     *         computed by Amazon S3.
     */
    public String getETag() {
        return eTag;
    }

    /**
     * Sets the hex encoded 128 bit MD5 hash of this version's contents, as
     * computed by Amazon S3.
     * 
     * @param eTag
     *            The hex encoded 128 bit MD5 hash of this version's contents,
     *            as computed by Amazon S3.
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * Returns the type of storage used by Amazon S3 for this version.
     * 
     * @return The type of storage used by Amazon S3 for this version.
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the type of storage used by Amazon S3 for this version.
     * 
     * @param storageClass
     *            The type of storage used by Amazon S3 for this version.
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * Returns the size of this version, in bytes.
     * 
     * @return The size of this version, in bytes.
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the size of this version, in bytes.
     * 
     * @param size
     *            The size of this version, in bytes.
     */
    public void setSize(long size) {
        this.size = size;
    }

}

/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt 
 * for applicable license terms and NOTICE.txt for applicable notices. 
 */
package com.amazonaws.services.s3.model;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.services.s3.AmazonS3;

/**
 * Represents an object stored in Amazon S3. This object contains
 * the data content
 * and the object metadata stored by Amazon S3, such as content type,
 * content length, etc.
 *
 * @see ObjectMetadata
 */
public class S3Object implements Closeable {
    /** The key under which this object is stored */
    private String key = null;

    /** The name of the bucket in which this object is contained */
    private String bucketName = null;

    /** The metadata stored by Amazon S3 for this object */
    private ObjectMetadata metadata = new ObjectMetadata();

    /** The stream containing the contents of this object from S3 */
    private S3ObjectInputStream objectContent;
    
    /** The redirect location for this object */
    private String redirectLocation;

    /**
     * Indicates if the requester is charged for downloading the data from
     * Requester Pays Buckets.
     */
    private boolean isRequesterCharged;

    /**
     * Gets the metadata stored by Amazon S3 for this object. The
     * {@link ObjectMetadata} object includes any custom user metadata supplied by the
     * caller when the object was uploaded, as well as HTTP metadata such as
     * content length and content type.
     *
     * @return The metadata stored by Amazon S3 for this object.
     *
     * @see S3Object#getObjectContent()
     */
    public ObjectMetadata getObjectMetadata() {
        return metadata;
    }

    /**
     * Sets the object metadata for this object.
     * <p>
     * <b>NOTE:</b> This does not update the object metadata stored in Amazon
     * S3, but only updates this object in local memory. To update an object's
     * metadata in S3, use {@link AmazonS3#copyObject(CopyObjectRequest)} to
     * copy the object to a new (or the same location) and specify new object
     * metadata then.
     *
     * @param metadata The new metadata to set for this object in memory.
     */
    public void setObjectMetadata(ObjectMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Gets an input stream containing the contents of this object. Callers
     * should close this input stream as soon as possible, because the
     * object contents aren't buffered in memory and stream directly from Amazon
     * S3.
     *
     * @return An input stream containing the contents of this object.
     *
     * @see S3Object#getObjectMetadata()
     * @see S3Object#setObjectContent(InputStream)
     */
    public S3ObjectInputStream getObjectContent() {
        return objectContent;
    }

    /**
     * Sets the input stream containing this object's contents.
     *
     * @param objectContent
     *            The input stream containing this object's contents.
     *
     * @see S3Object#getObjectContent()
     */
    public void setObjectContent(S3ObjectInputStream objectContent) {
        this.objectContent = objectContent;
    }
    
    /**
     * Sets the input stream containing this object's contents.
     * 
     * @param objectContent
     *            The input stream containing this object's contents. Will get
     *            wrapped in an S3ObjectInputStream.
     * @see S3Object#getObjectContent()
     */
    public void setObjectContent(InputStream objectContent) {
        setObjectContent(new S3ObjectInputStream(objectContent,
                this.objectContent != null ? this.objectContent.getHttpRequest() : null));
    }

    /**
     * Gets the name of the bucket in which this object is contained.
     *
     * @return The name of the bucket in which this object is contained.
     *
     * @see S3Object#setBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket in which this object is contained.
     *
     * @param bucketName
     *            The name of the bucket containing this object.
     *
     * @see S3Object#getBucketName()
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Gets the key under which this object is stored.
     *
     * @return The key under which this object is stored.
     *
     * @see S3Object#setKey(String)
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key under which this object is stored.
     *
     * @param key
     *            The key under which this object is stored.
     *
     * @see S3Object#getKey()
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * Gets the redirect location for this object.
     *
     */
    public String getRedirectLocation() {
    	return this.redirectLocation;
    }
    
    /**
     * Sets the redirect location for this object.
     *
     * @param redirectLocation
     *            the redirect location for that object.
     */
    public void setRedirectLocation(String redirectLocation) {
    	this.redirectLocation = redirectLocation;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "S3Object [key=" + getKey()
            + ",bucket=" + (bucketName == null ? "<Unknown>" : bucketName)
            + "]";
    }

    /**
     * Releases any underlying system resources. If the resources
     * are already released then invoking this method has no effect.
     *
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void close() throws IOException {
        InputStream is = getObjectContent();
        if (is != null)
            is.close();
    }

    /**
     * Returns true if the user is charged for downloading the object from an
     * Requester Pays Bucket; else false.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to read an
     * object from it without Requester Pays enabled will result in a 403 error
     * and the bucket owner will be charged for the request.
     *
     * @return true if the user has been charged for the download operation from
     *         Requester Pays Bucket.
     */
    public boolean isRequesterCharged() {
        return isRequesterCharged;
    }

    /**
     * Used for downloading an Amazon S3 Object from a Requester Pays Bucket. If
     * set the requester is charged for downloading the data from the bucket.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to read an
     * object from it without Requester Pays enabled will result in a 403 error
     * and the bucket owner will be charged for the request.
     *
     * @param isRequesterCharged
     *            Indicates requester is charged for this operation.
     */
    public void setRequesterCharged(boolean isRequesterCharged) {
        this.isRequesterCharged = isRequesterCharged;
    }
}

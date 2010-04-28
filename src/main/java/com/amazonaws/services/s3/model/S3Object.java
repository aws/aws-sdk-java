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

import java.io.InputStream;

/**
 * Represents an object stored in Amazon S3, including the actual data content,
 * and the object metadata stored by Amazon S3 (such as Content-Type,
 * Content-Length, etc).
 */
public class S3Object {
    private static final long serialVersionUID = -2883501141593631181L;

    /** The key under which this object is stored */
    private String key = null;
    
    /** The name of the bucket in which this object is contained */
    private String bucketName = null;
    
    /** The metadata stored by Amazon S3 for this object */
    private ObjectMetadata metadata = new ObjectMetadata();

    /** The stream containing the contents of this object from S3 */
    private InputStream objectContent;


    /**
     * Gets the metadata stored by Amazon S3 for this object. The
     * S3ObjectMetadata object includes any custom user metadata supplied by the
     * caller when the object was uploaded, as well as HTTP metadata such as
     * Content-Length and Content-Type.
     * 
     * @return The metadata stored by Amazon S3 for this object.
     */
    public ObjectMetadata getObjectMetadata() {
        return metadata;
    }

    /**
     * Gets an input stream containing the contents of this object. Callers
     * should be sure to close this input stream as soon as possible, since the
     * object contents aren't buffered in memory and stream directly from Amazon
     * S3.
     * 
     * @return An input stream containing the contents of this object.
     */
    public InputStream getObjectContent() {
        return objectContent;
    }

    /**
     * Sets the input stream containing this object's contents.
     * 
     * @param objectContent
     *            The input stream containing this object's contents.
     */
    public void setObjectContent(InputStream objectContent) {
        this.objectContent = objectContent;
    }

    /**
     * Gets the name of the bucket in which this object is contained.
     * 
     * @return The name of the bucket in which this object is contained.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket in which this object is contained.
     * 
     * @param bucketName
     *            The name of the bucket containing this object.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Gets the key under which this object is stored.
     * 
     * @return The key under which this object is stored.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key under which this object is stored.
     * 
     * @param key
     *            The key under which this object is stored.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "S3Object [key=" + getKey() 
            + ",bucket=" + (bucketName == null ? "<Unknown>" : bucketName)  
            + "]";
    }
}

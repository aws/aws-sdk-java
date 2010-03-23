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

import com.amazonaws.services.s3.AmazonS3Client;

/**
 * Contains the data returned by Amazon S3 from the copy object operation.
 * Callers can of course ignore this result if they don't need any of the data,
 * otherwise they can access information about the new object created from the
 * copy object operation, such as its ETag and last modification date.
 * 
 * @see AmazonS3Client#copyObject(String, String, String, String)
 * @see AmazonS3Client#copyObject(com.amazonaws.services.s3.model.CopyObjectRequest)
 */
public class CopyObjectResult {

    /** The ETag value of the new object */
    private String etag;
    
    /** The last modified date for the new object */
    private Date lastModifiedDate;

    /**
     * The version ID of the new, copied object. This field will only be present
     * if object versioning has been enabled for the bucket to which the object
     * was copied.
     */
    private String versionId;

    
    /**
     * Returns the ETag value for the new object that was created in the
     * associated copy object request.
     * 
     * @return The ETag value for the new object.
     */
    public String getETag() {
        return etag;
    }

    /**
     * Sets the ETag value for the new object that was created from the
     * associated copy object request.
     * 
     * @param etag
     *            The ETag value for the new object.
     */
    public void setETag(String etag) {
        this.etag = etag;
    }

    /**
     * Returns the last modified date for the object that was created in the
     * associated copy object request.
     * 
     * @return The last modified date for the new object.
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the last modified date for the object that was created in the
     * associated copy object request.
     * 
     * @param lastModifiedDate
     *            The last modified date for the new object.
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Returns the version ID of the new, copied object. This field will only be
     * present if object versioning has been enabled for the bucket to which the
     * object was copied.
     * 
     * @return The version ID of the new, copied object.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the version ID of the new, copied object.
     * 
     * @param versionId
     *            The version ID of the new, copied object.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

}

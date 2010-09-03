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
 * <p>
 * Contains the data returned by Amazon S3 from the 
 * {@link AmazonS3#copyObject(CopyObjectRequest copyObjectRequest)} call.
 * This result may be ignored if not needed; otherwise, use this result
 * to access information about the new object created from the copyObject call.
 * </p>
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
     * Gets the ETag value for the new object that was created in the
     * associated {@link CopyObjectRequest}.
     * 
     * @return The ETag value for the new object.
     * 
     * @see CopyObjectResult#setETag(String)
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
     *            
     * @see CopyObjectResult#getETag()           
     */
    public void setETag(String etag) {
        this.etag = etag;
    }

    /**
     * Gets the date the newly copied object was last modified.
     * 
     * @return The date the newly copied object was last modified.
     * 
     * @see CopyObjectResult#setLastModifiedDate(Date)
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the date the newly copied object was last modified.
     * 
     * @param lastModifiedDate
     *            The date the new, copied object was last modified.
     *            
     * @see CopyObjectResult#getLastModifiedDate()          
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets the version ID of the newly copied object. This field is only
     * present if object versioning has been enabled for the bucket the
     * object was copied to.
     * 
     * @return The version ID of the newly copied object.
     * 
     * @see CopyObjectResult#setVersionId(String)
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the version ID of the newly copied object.
     * 
     * @param versionId
     *            The version ID of the newly copied object.
     *            
     * @see CopyObjectResult#getVersionId()
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

}

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

import com.amazonaws.services.s3.AmazonS3;

/**
 * Contains the data returned by Amazon S3 from the put object operation.
 * Callers can ignore this result object if they don't need any of the data,
 * otherwise they can access information about the new object created from the
 * put object request, such as it's ETag and optional versionId.
 * 
 * @see AmazonS3#putObject(String, String, java.io.File)
 * @see AmazonS3#putObject(String, String, java.io.InputStream, S3ObjectMetadata)
 * @see AmazonS3#putObject(PutObjectRequest)
 */
public class PutObjectResult {

    /**
     * The version ID of the new, uploaded object. This field will only be
     * present if object versioning has been enabled for the bucket to which the
     * object was uploaded.
     */
    private String versionId;

    /** The ETag value of the new object */
    private String eTag;

    /**
     * Returns the version ID of the new, uploaded object. This field will only
     * be present if object versioning has been enabled for the bucket to which
     * the object was uploaded.
     * 
     * @return The optional version ID of the new, uploaded object.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the version ID of the new, uploaded object.
     * 
     * @param versionId
     *            The optional version ID of the new, uploaded object.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Returns the ETag value for the new object that was created in the
     * associated put object request.
     * 
     * @return The ETag value for the new object.
     */
    public String getETag() {
        return eTag;
    }

    /**
     * Sets the ETag value for the new object that was created from the
     * associated put object request.
     * 
     * @param eTag
     *            The ETag value for the new object.
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }
    
}

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
 * Contains the results of initiating a multipart upload, particularly the
 * unique ID of the new multipart upload.
 *
 * @see AmazonS3#initiateMultipartUpload(InitiateMultipartUploadRequest)
 */
public class InitiateMultipartUploadResult {

    /** The name of the bucket in which the new multipart upload was initiated */
    private String bucketName;

    /** The object key for which the multipart upload was initiated */
    private String key;

    /** The unique ID of the new multipart upload */
    private String uploadId;


    /**
     * Returns the name of the bucket in which the new multipart upload was
     * initiated.
     *
     * @return The name of the bucket in which the new multipart upload was
     *         initiated.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket in which the new multipart upload was
     * initiated.
     *
     * @param bucketName
     *            The name of the bucket in which the new multipart upload was
     *            initiated.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Returns the object key for which the multipart upload was initiated.
     *
     * @return The object key for which the multipart upload was initiated.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the object key for which the multipart upload was initiated.
     *
     * @param key
     *            The object key for which the multipart upload was initiated.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Returns the initiated multipart upload ID.
     *
     * @return the initiated multipart upload ID.
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the initiated multipart upload ID.
     *
     * @param uploadId
     *            The initiated multipart upload ID.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

}

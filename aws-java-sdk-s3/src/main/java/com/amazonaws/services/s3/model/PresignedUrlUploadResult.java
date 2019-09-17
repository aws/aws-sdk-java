/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.s3.AmazonS3Client;
import java.io.Serializable;

/**
 * Contains the data returned by Amazon S3 from the {@link AmazonS3#upload(PresignedUrlUploadRequest)} operation.
 * <p>
 * Use this class to access metadata about the new object created from the {@link AmazonS3#upload(PresignedUrlUploadRequest)}
 * operation. This class also contains the MD5 hash of the object content calculated on the client-side.
 * <p>
 *
 * @see AmazonS3Client#upload(PresignedUrlUploadRequest)
 */
public class PresignedUrlUploadResult implements Serializable {

    /** The metadata returned as a result of upload operation.*/
    private ObjectMetadata metadata;

    /** The content MD5 */
    private String contentMd5;

    /**
     * Sets the Base64-encoded MD5 hash of the object content that was
     * calculated on the client-side.
     *
     * @param contentMd5 The content MD5
     */
    public void setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
    }

    /**
     * Sets the Base64-encoded MD5 hash of the object content that was
     * calculated on the client-side.
     *
     * @param contentMd5 The content MD5
     * @return This object for method chaining
     */
    public PresignedUrlUploadResult withContentMd5(String contentMd5) {
        setContentMd5(contentMd5);
        return this;
    }

    /**
     * Returns the Base64-encoded MD5 hash of the object content that was
     * calculated on the client-side. This method returns null if the MD5
     * validation is disabled and the caller didn't provide the MD5 hash in the
     * ObjectMetadata when sending the PutObjectRequest.
     */
    public String getContentMd5() {
        return contentMd5;
    }

    /**
     * Returns the metadata retrieved as a response to {@link AmazonS3Client#upload(PresignedUrlUploadRequest)} operation.
     */
    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the metadata retrieved as a response to {@link AmazonS3Client#upload(PresignedUrlUploadRequest)} operation.
     */
    public void setMetadata(ObjectMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Sets the metadata retrieved as a response to {@link AmazonS3Client#upload(PresignedUrlUploadRequest)} operation.
     * @param metadata object metadata returned by S3
     * @return This object for method chaining
     */
    public PresignedUrlUploadResult withMetadata(ObjectMetadata metadata) {
        setMetadata(metadata);
        return this;
    }
}

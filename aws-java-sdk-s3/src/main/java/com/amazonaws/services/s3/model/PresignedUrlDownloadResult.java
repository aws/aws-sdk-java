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

/**
 * Class that contains the data returned by Amazon S3 from the {@link AmazonS3#download(PresignedUrlDownloadRequest)} operation.
 *
 * This class currently exposes {@link S3Object} which represents an object stored in Amazon S3. This object contains
 * the data content and the object metadata stored by Amazon S3, such as content type, content length, etc.
 */
public final class PresignedUrlDownloadResult {

    private S3Object s3Object;

    /**
     * @return the {@link S3Object} stored in Amazon S3
     */
    public S3Object getS3Object() {
        return s3Object;
    }

    /**
     * @param s3Object sets the {@link S3Object} returned from Amazon S3 for the
     * {@link AmazonS3#download(PresignedUrlDownloadRequest)} operation.
     */
    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * @param s3Object sets the {@link S3Object} returned from Amazon S3 for the
     * {@link AmazonS3#download(PresignedUrlDownloadRequest)} operation.
     */
    public PresignedUrlDownloadResult withS3Object(S3Object s3Object) {
        setS3Object(s3Object);
        return this;
    }
}

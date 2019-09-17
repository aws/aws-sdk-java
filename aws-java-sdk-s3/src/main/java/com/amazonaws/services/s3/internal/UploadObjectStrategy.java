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

package com.amazonaws.services.s3.internal;

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;

/**
 * Interface to define behavior to plug into template for uploading an object in {@link AmazonS3Client}.
 *
 * This is not intended to be used by SDK users. Breaking changes can be introduced.
 *
 * @param <RequestT> Request object type
 * @param <ResponseT> Response object type
 * @see {@link AmazonS3Client.PutObjectStrategy}, {@link AmazonS3Client.PresignedUrlUploadStrategy}
 */
@SdkInternalApi
public interface UploadObjectStrategy<RequestT, ResponseT> {

    /**
     * Implement the behavior for making a http call to the S3 service.
     */
    ObjectMetadata invokeServiceCall(Request<RequestT> request);

    /**
     * Create and return the result object using the object metadata and content md5
     */
    ResponseT createResult(ObjectMetadata metadata, String contentMd5);

    /**
     * @return Suffix string to append to the md5 validation failure message
     */
    String md5ValidationErrorSuffix();
}

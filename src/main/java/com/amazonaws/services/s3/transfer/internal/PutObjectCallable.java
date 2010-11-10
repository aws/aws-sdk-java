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
package com.amazonaws.services.s3.transfer.internal;

import java.util.concurrent.Callable;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.transfer.model.UploadResult;

public class PutObjectCallable implements Callable<UploadResult> {
    private final PutObjectRequest putObjectRequest;
    private final AmazonS3 s3;

    public PutObjectCallable(AmazonS3 s3, PutObjectRequest putObjectRequest) {
        this.s3 = s3;
        this.putObjectRequest = putObjectRequest;
    }

    public UploadResult call() throws Exception {
        PutObjectResult putObjectResult = s3.putObject(putObjectRequest);

        UploadResult uploadResult = new UploadResult();
        uploadResult.setBucketName(putObjectRequest.getBucketName());
        uploadResult.setKey(putObjectRequest.getKey());
        uploadResult.setETag(putObjectResult.getETag());
        uploadResult.setVersionId(putObjectResult.getVersionId());
        return uploadResult;
    }
}
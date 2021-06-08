/*
 * Copyright 2015-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.UploadObjectRequest;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * An Abstract class that users needs to extend instead of {@link AmazonS3EncryptionV2}
 * interface. This abstract class is provided so we don't break any customers
 * when we introduce new methods in {@link AmazonS3EncryptionV2} interface.
 */
public abstract class AbstractAmazonS3EncryptionV2 extends AbstractAmazonS3 implements AmazonS3EncryptionV2 {

    @Override
    public PutObjectResult putInstructionFile(PutInstructionFileRequest req) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public CompleteMultipartUploadResult uploadObject(final UploadObjectRequest req) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

}

/*
 * Copyright 2019-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.s3.transfer.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Encryption;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.SkipMd5CheckStrategy;
import com.amazonaws.services.s3.model.PresignedUrlDownloadRequest;
import com.amazonaws.services.s3.model.S3Object;

@SdkInternalApi
public class PresignedUrlRetryableDownloadTaskImpl implements ServiceUtils.RetryableS3DownloadTask {

    private final AmazonS3 s3;
    private final PresignedUrlDownloadImpl download;
    private final PresignedUrlDownloadRequest request;
    private final SkipMd5CheckStrategy skipMd5CheckStrategy = SkipMd5CheckStrategy.INSTANCE;

    public PresignedUrlRetryableDownloadTaskImpl(AmazonS3 s3, PresignedUrlDownloadImpl download,
                                                 PresignedUrlDownloadRequest request) {
        this.s3 = s3;
        this.download = download;
        this.request = request;
    }

    @Override
    public S3Object getS3ObjectStream() {
        S3Object s3Object = s3.download(request).getS3Object();
        download.setS3Object(s3Object);
        return s3Object;
    }

    @Override
    public boolean needIntegrityCheck() {
        return !(s3 instanceof AmazonS3Encryption) &&
               !skipMd5CheckStrategy.skipClientSideValidationPerRequest(request);
    }
}

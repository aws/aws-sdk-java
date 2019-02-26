/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.util.ValidationUtils;

/**
 * Wraps the normal {@link AwsSyncClientParams} and {@link S3ClientOptions} in a single object.
 */
@Immutable
@SdkInternalApi
class AmazonS3ClientParamsWrapper extends AmazonS3ClientParams {

    private final AwsSyncClientParams clientParams;
    private final S3ClientOptions s3ClientOptions;

    public AmazonS3ClientParamsWrapper(AwsSyncClientParams delegate, S3ClientOptions s3ClientOptions) {
        this.clientParams = ValidationUtils.assertNotNull(delegate, "delegate");
        this.s3ClientOptions = s3ClientOptions;
    }

    @Override
    public AwsSyncClientParams getClientParams() {
        return clientParams;
    }

    @Override
    public S3ClientOptions getS3ClientOptions() {
        return s3ClientOptions;
    }
}

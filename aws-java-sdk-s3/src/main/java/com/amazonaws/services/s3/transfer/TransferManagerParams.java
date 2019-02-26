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
package com.amazonaws.services.s3.transfer;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.AmazonS3;

import java.util.concurrent.ExecutorService;

/**
 * Internal class to wrap all params needed by {@link TransferManager}. Used by {@link
 * TransferManagerBuilder}.
 */
@SdkInternalApi
class TransferManagerParams {

    private AmazonS3 s3Client;
    private ExecutorService executorService;
    private Boolean shutDownThreadPools;
    private TransferManagerConfiguration configuration;

    public AmazonS3 getS3Client() {
        return s3Client;
    }

    public TransferManagerParams withS3Client(AmazonS3 s3Client) {
        this.s3Client = s3Client;
        return this;
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public TransferManagerParams withExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public Boolean getShutDownThreadPools() {
        return shutDownThreadPools;
    }

    public TransferManagerParams withShutDownThreadPools(Boolean shutDownThreadPools) {
        this.shutDownThreadPools = shutDownThreadPools;
        return this;
    }

    public TransferManagerConfiguration getConfiguration() {
        return configuration;
    }

    public TransferManagerParams withTransferManagerConfiguration(
            TransferManagerConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

}

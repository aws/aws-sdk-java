/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemakerfeaturestoreruntime;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakerfeaturestoreruntime.model.*;

/**
 * Abstract implementation of {@code AmazonSageMakerFeatureStoreRuntimeAsync}. Convenient method forms pass through to
 * the corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSageMakerFeatureStoreRuntimeAsync extends AbstractAmazonSageMakerFeatureStoreRuntime implements
        AmazonSageMakerFeatureStoreRuntimeAsync {

    protected AbstractAmazonSageMakerFeatureStoreRuntimeAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetRecordResult> batchGetRecordAsync(BatchGetRecordRequest request) {

        return batchGetRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetRecordResult> batchGetRecordAsync(BatchGetRecordRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetRecordRequest, BatchGetRecordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRecordResult> deleteRecordAsync(DeleteRecordRequest request) {

        return deleteRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecordResult> deleteRecordAsync(DeleteRecordRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRecordRequest, DeleteRecordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRecordResult> getRecordAsync(GetRecordRequest request) {

        return getRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordResult> getRecordAsync(GetRecordRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRecordRequest, GetRecordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(PutRecordRequest request) {

        return putRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(PutRecordRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

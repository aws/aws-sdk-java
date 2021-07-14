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
package com.amazonaws.services.healthlake;

import javax.annotation.Generated;

import com.amazonaws.services.healthlake.model.*;

/**
 * Abstract implementation of {@code AmazonHealthLakeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonHealthLakeAsync extends AbstractAmazonHealthLake implements AmazonHealthLakeAsync {

    protected AbstractAmazonHealthLakeAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateFHIRDatastoreResult> createFHIRDatastoreAsync(CreateFHIRDatastoreRequest request) {

        return createFHIRDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFHIRDatastoreResult> createFHIRDatastoreAsync(CreateFHIRDatastoreRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFHIRDatastoreRequest, CreateFHIRDatastoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFHIRDatastoreResult> deleteFHIRDatastoreAsync(DeleteFHIRDatastoreRequest request) {

        return deleteFHIRDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFHIRDatastoreResult> deleteFHIRDatastoreAsync(DeleteFHIRDatastoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFHIRDatastoreRequest, DeleteFHIRDatastoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFHIRDatastoreResult> describeFHIRDatastoreAsync(DescribeFHIRDatastoreRequest request) {

        return describeFHIRDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFHIRDatastoreResult> describeFHIRDatastoreAsync(DescribeFHIRDatastoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFHIRDatastoreRequest, DescribeFHIRDatastoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFHIRExportJobResult> describeFHIRExportJobAsync(DescribeFHIRExportJobRequest request) {

        return describeFHIRExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFHIRExportJobResult> describeFHIRExportJobAsync(DescribeFHIRExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFHIRExportJobRequest, DescribeFHIRExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFHIRImportJobResult> describeFHIRImportJobAsync(DescribeFHIRImportJobRequest request) {

        return describeFHIRImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFHIRImportJobResult> describeFHIRImportJobAsync(DescribeFHIRImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFHIRImportJobRequest, DescribeFHIRImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFHIRDatastoresResult> listFHIRDatastoresAsync(ListFHIRDatastoresRequest request) {

        return listFHIRDatastoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFHIRDatastoresResult> listFHIRDatastoresAsync(ListFHIRDatastoresRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFHIRDatastoresRequest, ListFHIRDatastoresResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFHIRExportJobsResult> listFHIRExportJobsAsync(ListFHIRExportJobsRequest request) {

        return listFHIRExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFHIRExportJobsResult> listFHIRExportJobsAsync(ListFHIRExportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFHIRExportJobsRequest, ListFHIRExportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFHIRImportJobsResult> listFHIRImportJobsAsync(ListFHIRImportJobsRequest request) {

        return listFHIRImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFHIRImportJobsResult> listFHIRImportJobsAsync(ListFHIRImportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFHIRImportJobsRequest, ListFHIRImportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartFHIRExportJobResult> startFHIRExportJobAsync(StartFHIRExportJobRequest request) {

        return startFHIRExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFHIRExportJobResult> startFHIRExportJobAsync(StartFHIRExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartFHIRExportJobRequest, StartFHIRExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartFHIRImportJobResult> startFHIRImportJobAsync(StartFHIRImportJobRequest request) {

        return startFHIRImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFHIRImportJobResult> startFHIRImportJobAsync(StartFHIRImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartFHIRImportJobRequest, StartFHIRImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

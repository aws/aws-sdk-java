/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bcmdataexports;

import javax.annotation.Generated;

import com.amazonaws.services.bcmdataexports.model.*;

/**
 * Abstract implementation of {@code AWSBCMDataExportsAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBCMDataExportsAsync extends AbstractAWSBCMDataExports implements AWSBCMDataExportsAsync {

    protected AbstractAWSBCMDataExportsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateExportResult> createExportAsync(CreateExportRequest request) {

        return createExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExportResult> createExportAsync(CreateExportRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateExportRequest, CreateExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(DeleteExportRequest request) {

        return deleteExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(DeleteExportRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteExportRequest, DeleteExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetExecutionResult> getExecutionAsync(GetExecutionRequest request) {

        return getExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExecutionResult> getExecutionAsync(GetExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetExecutionRequest, GetExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest request) {

        return getExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest request,
            com.amazonaws.handlers.AsyncHandler<GetExportRequest, GetExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest request) {

        return getTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTableRequest, GetTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest request) {

        return listExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest request) {

        return listExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExportsRequest, ListExportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request) {

        return listTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<UpdateExportResult> updateExportAsync(UpdateExportRequest request) {

        return updateExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExportResult> updateExportAsync(UpdateExportRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateExportRequest, UpdateExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

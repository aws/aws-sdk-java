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
package com.amazonaws.services.timestreamwrite;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamwrite.model.*;

/**
 * Abstract implementation of {@code AmazonTimestreamWriteAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonTimestreamWriteAsync extends AbstractAmazonTimestreamWrite implements AmazonTimestreamWriteAsync {

    protected AbstractAmazonTimestreamWriteAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(CreateDatabaseRequest request) {

        return createDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(CreateDatabaseRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatabaseRequest, CreateDatabaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest request) {

        return createTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(DeleteDatabaseRequest request) {

        return deleteDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(DeleteDatabaseRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatabaseRequest, DeleteDatabaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest request) {

        return deleteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDatabaseResult> describeDatabaseAsync(DescribeDatabaseRequest request) {

        return describeDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatabaseResult> describeDatabaseAsync(DescribeDatabaseRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDatabaseRequest, DescribeDatabaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request) {

        return describeEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest request) {

        return describeTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request) {

        return listDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(UpdateDatabaseRequest request) {

        return updateDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(UpdateDatabaseRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDatabaseRequest, UpdateDatabaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest request) {

        return updateTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<WriteRecordsResult> writeRecordsAsync(WriteRecordsRequest request) {

        return writeRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WriteRecordsResult> writeRecordsAsync(WriteRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<WriteRecordsRequest, WriteRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

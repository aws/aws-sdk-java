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
package com.amazonaws.services.timestreamquery;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamquery.model.*;

/**
 * Abstract implementation of {@code AmazonTimestreamQueryAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonTimestreamQueryAsync extends AbstractAmazonTimestreamQuery implements AmazonTimestreamQueryAsync {

    protected AbstractAmazonTimestreamQueryAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest request) {

        return cancelQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelQueryRequest, CancelQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateScheduledQueryResult> createScheduledQueryAsync(CreateScheduledQueryRequest request) {

        return createScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduledQueryResult> createScheduledQueryAsync(CreateScheduledQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateScheduledQueryRequest, CreateScheduledQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledQueryResult> deleteScheduledQueryAsync(DeleteScheduledQueryRequest request) {

        return deleteScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledQueryResult> deleteScheduledQueryAsync(DeleteScheduledQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduledQueryRequest, DeleteScheduledQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountSettingsResult> describeAccountSettingsAsync(DescribeAccountSettingsRequest request) {

        return describeAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountSettingsResult> describeAccountSettingsAsync(DescribeAccountSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountSettingsRequest, DescribeAccountSettingsResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeScheduledQueryResult> describeScheduledQueryAsync(DescribeScheduledQueryRequest request) {

        return describeScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledQueryResult> describeScheduledQueryAsync(DescribeScheduledQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledQueryRequest, DescribeScheduledQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExecuteScheduledQueryResult> executeScheduledQueryAsync(ExecuteScheduledQueryRequest request) {

        return executeScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteScheduledQueryResult> executeScheduledQueryAsync(ExecuteScheduledQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<ExecuteScheduledQueryRequest, ExecuteScheduledQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListScheduledQueriesResult> listScheduledQueriesAsync(ListScheduledQueriesRequest request) {

        return listScheduledQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScheduledQueriesResult> listScheduledQueriesAsync(ListScheduledQueriesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListScheduledQueriesRequest, ListScheduledQueriesResult> asyncHandler) {

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
    public java.util.concurrent.Future<PrepareQueryResult> prepareQueryAsync(PrepareQueryRequest request) {

        return prepareQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PrepareQueryResult> prepareQueryAsync(PrepareQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<PrepareQueryRequest, PrepareQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request) {

        return queryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request, com.amazonaws.handlers.AsyncHandler<QueryRequest, QueryResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest request) {

        return updateAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduledQueryResult> updateScheduledQueryAsync(UpdateScheduledQueryRequest request) {

        return updateScheduledQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduledQueryResult> updateScheduledQueryAsync(UpdateScheduledQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateScheduledQueryRequest, UpdateScheduledQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

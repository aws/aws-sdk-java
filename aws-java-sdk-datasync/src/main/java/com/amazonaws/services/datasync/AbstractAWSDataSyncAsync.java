/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;

/**
 * Abstract implementation of {@code AWSDataSyncAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSDataSyncAsync extends AbstractAWSDataSync implements AWSDataSyncAsync {

    protected AbstractAWSDataSyncAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelTaskExecutionResult> cancelTaskExecutionAsync(CancelTaskExecutionRequest request) {

        return cancelTaskExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelTaskExecutionResult> cancelTaskExecutionAsync(CancelTaskExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelTaskExecutionRequest, CancelTaskExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest request) {

        return createAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAgentRequest, CreateAgentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLocationEfsResult> createLocationEfsAsync(CreateLocationEfsRequest request) {

        return createLocationEfsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLocationEfsResult> createLocationEfsAsync(CreateLocationEfsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLocationEfsRequest, CreateLocationEfsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLocationNfsResult> createLocationNfsAsync(CreateLocationNfsRequest request) {

        return createLocationNfsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLocationNfsResult> createLocationNfsAsync(CreateLocationNfsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLocationNfsRequest, CreateLocationNfsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLocationS3Result> createLocationS3Async(CreateLocationS3Request request) {

        return createLocationS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLocationS3Result> createLocationS3Async(CreateLocationS3Request request,
            com.amazonaws.handlers.AsyncHandler<CreateLocationS3Request, CreateLocationS3Result> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest request) {

        return createTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTaskRequest, CreateTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest request) {

        return deleteAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentRequest, DeleteAgentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLocationResult> deleteLocationAsync(DeleteLocationRequest request) {

        return deleteLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLocationResult> deleteLocationAsync(DeleteLocationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLocationRequest, DeleteLocationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskResult> deleteTaskAsync(DeleteTaskRequest request) {

        return deleteTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskResult> deleteTaskAsync(DeleteTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTaskRequest, DeleteTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentResult> describeAgentAsync(DescribeAgentRequest request) {

        return describeAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentResult> describeAgentAsync(DescribeAgentRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAgentRequest, DescribeAgentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationEfsResult> describeLocationEfsAsync(DescribeLocationEfsRequest request) {

        return describeLocationEfsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationEfsResult> describeLocationEfsAsync(DescribeLocationEfsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationEfsRequest, DescribeLocationEfsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationNfsResult> describeLocationNfsAsync(DescribeLocationNfsRequest request) {

        return describeLocationNfsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationNfsResult> describeLocationNfsAsync(DescribeLocationNfsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationNfsRequest, DescribeLocationNfsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationS3Result> describeLocationS3Async(DescribeLocationS3Request request) {

        return describeLocationS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationS3Result> describeLocationS3Async(DescribeLocationS3Request request,
            com.amazonaws.handlers.AsyncHandler<DescribeLocationS3Request, DescribeLocationS3Result> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(DescribeTaskRequest request) {

        return describeTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(DescribeTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTaskRequest, DescribeTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskExecutionResult> describeTaskExecutionAsync(DescribeTaskExecutionRequest request) {

        return describeTaskExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskExecutionResult> describeTaskExecutionAsync(DescribeTaskExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTaskExecutionRequest, DescribeTaskExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest request) {

        return listAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAgentsRequest, ListAgentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLocationsResult> listLocationsAsync(ListLocationsRequest request) {

        return listLocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLocationsResult> listLocationsAsync(ListLocationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLocationsRequest, ListLocationsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTaskExecutionsResult> listTaskExecutionsAsync(ListTaskExecutionsRequest request) {

        return listTaskExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTaskExecutionsResult> listTaskExecutionsAsync(ListTaskExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTaskExecutionsRequest, ListTaskExecutionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest request) {

        return listTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartTaskExecutionResult> startTaskExecutionAsync(StartTaskExecutionRequest request) {

        return startTaskExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTaskExecutionResult> startTaskExecutionAsync(StartTaskExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartTaskExecutionRequest, StartTaskExecutionResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest request) {

        return updateAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentRequest, UpdateAgentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(UpdateTaskRequest request) {

        return updateTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(UpdateTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTaskRequest, UpdateTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

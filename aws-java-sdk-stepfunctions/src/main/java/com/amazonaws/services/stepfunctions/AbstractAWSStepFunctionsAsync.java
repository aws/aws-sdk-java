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
package com.amazonaws.services.stepfunctions;

import javax.annotation.Generated;

import com.amazonaws.services.stepfunctions.model.*;

/**
 * Abstract implementation of {@code AWSStepFunctionsAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSStepFunctionsAsync extends AbstractAWSStepFunctions implements AWSStepFunctionsAsync {

    protected AbstractAWSStepFunctionsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateActivityResult> createActivityAsync(CreateActivityRequest request) {

        return createActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateActivityResult> createActivityAsync(CreateActivityRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateActivityRequest, CreateActivityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStateMachineResult> createStateMachineAsync(CreateStateMachineRequest request) {

        return createStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStateMachineResult> createStateMachineAsync(CreateStateMachineRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStateMachineRequest, CreateStateMachineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteActivityResult> deleteActivityAsync(DeleteActivityRequest request) {

        return deleteActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteActivityResult> deleteActivityAsync(DeleteActivityRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteActivityRequest, DeleteActivityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStateMachineResult> deleteStateMachineAsync(DeleteStateMachineRequest request) {

        return deleteStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStateMachineResult> deleteStateMachineAsync(DeleteStateMachineRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStateMachineRequest, DeleteStateMachineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeActivityResult> describeActivityAsync(DescribeActivityRequest request) {

        return describeActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActivityResult> describeActivityAsync(DescribeActivityRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeActivityRequest, DescribeActivityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest request) {

        return describeExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeExecutionRequest, DescribeExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStateMachineResult> describeStateMachineAsync(DescribeStateMachineRequest request) {

        return describeStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStateMachineResult> describeStateMachineAsync(DescribeStateMachineRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStateMachineRequest, DescribeStateMachineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStateMachineForExecutionResult> describeStateMachineForExecutionAsync(
            DescribeStateMachineForExecutionRequest request) {

        return describeStateMachineForExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStateMachineForExecutionResult> describeStateMachineForExecutionAsync(
            DescribeStateMachineForExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStateMachineForExecutionRequest, DescribeStateMachineForExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetActivityTaskResult> getActivityTaskAsync(GetActivityTaskRequest request) {

        return getActivityTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetActivityTaskResult> getActivityTaskAsync(GetActivityTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<GetActivityTaskRequest, GetActivityTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetExecutionHistoryResult> getExecutionHistoryAsync(GetExecutionHistoryRequest request) {

        return getExecutionHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExecutionHistoryResult> getExecutionHistoryAsync(GetExecutionHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetExecutionHistoryRequest, GetExecutionHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListActivitiesResult> listActivitiesAsync(ListActivitiesRequest request) {

        return listActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActivitiesResult> listActivitiesAsync(ListActivitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListActivitiesRequest, ListActivitiesResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListStateMachinesResult> listStateMachinesAsync(ListStateMachinesRequest request) {

        return listStateMachinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStateMachinesResult> listStateMachinesAsync(ListStateMachinesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStateMachinesRequest, ListStateMachinesResult> asyncHandler) {

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
    public java.util.concurrent.Future<SendTaskFailureResult> sendTaskFailureAsync(SendTaskFailureRequest request) {

        return sendTaskFailureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTaskFailureResult> sendTaskFailureAsync(SendTaskFailureRequest request,
            com.amazonaws.handlers.AsyncHandler<SendTaskFailureRequest, SendTaskFailureResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendTaskHeartbeatResult> sendTaskHeartbeatAsync(SendTaskHeartbeatRequest request) {

        return sendTaskHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTaskHeartbeatResult> sendTaskHeartbeatAsync(SendTaskHeartbeatRequest request,
            com.amazonaws.handlers.AsyncHandler<SendTaskHeartbeatRequest, SendTaskHeartbeatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendTaskSuccessResult> sendTaskSuccessAsync(SendTaskSuccessRequest request) {

        return sendTaskSuccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTaskSuccessResult> sendTaskSuccessAsync(SendTaskSuccessRequest request,
            com.amazonaws.handlers.AsyncHandler<SendTaskSuccessRequest, SendTaskSuccessResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartExecutionResult> startExecutionAsync(StartExecutionRequest request) {

        return startExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExecutionResult> startExecutionAsync(StartExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartExecutionRequest, StartExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopExecutionResult> stopExecutionAsync(StopExecutionRequest request) {

        return stopExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopExecutionResult> stopExecutionAsync(StopExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StopExecutionRequest, StopExecutionResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateStateMachineResult> updateStateMachineAsync(UpdateStateMachineRequest request) {

        return updateStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStateMachineResult> updateStateMachineAsync(UpdateStateMachineRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStateMachineRequest, UpdateStateMachineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

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
package com.amazonaws.services.datapipeline;

import javax.annotation.Generated;

import com.amazonaws.services.datapipeline.model.*;

/**
 * Abstract implementation of {@code DataPipelineAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractDataPipelineAsync extends AbstractDataPipeline implements DataPipelineAsync {

    protected AbstractDataPipelineAsync() {
    }

    @Override
    public java.util.concurrent.Future<ActivatePipelineResult> activatePipelineAsync(ActivatePipelineRequest request) {

        return activatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivatePipelineResult> activatePipelineAsync(ActivatePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<ActivatePipelineRequest, ActivatePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest request) {

        return createPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeactivatePipelineResult> deactivatePipelineAsync(DeactivatePipelineRequest request) {

        return deactivatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivatePipelineResult> deactivatePipelineAsync(DeactivatePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<DeactivatePipelineRequest, DeactivatePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest request) {

        return deletePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeObjectsResult> describeObjectsAsync(DescribeObjectsRequest request) {

        return describeObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeObjectsResult> describeObjectsAsync(DescribeObjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeObjectsRequest, DescribeObjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePipelinesResult> describePipelinesAsync(DescribePipelinesRequest request) {

        return describePipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePipelinesResult> describePipelinesAsync(DescribePipelinesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePipelinesRequest, DescribePipelinesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EvaluateExpressionResult> evaluateExpressionAsync(EvaluateExpressionRequest request) {

        return evaluateExpressionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EvaluateExpressionResult> evaluateExpressionAsync(EvaluateExpressionRequest request,
            com.amazonaws.handlers.AsyncHandler<EvaluateExpressionRequest, EvaluateExpressionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(GetPipelineDefinitionRequest request) {

        return getPipelineDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(GetPipelineDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPipelineDefinitionRequest, GetPipelineDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest request) {

        return listPipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListPipelines operation.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync() {

        return listPipelinesAsync(new ListPipelinesRequest());
    }

    /**
     * Simplified method form for invoking the ListPipelines operation with an AsyncHandler.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {

        return listPipelinesAsync(new ListPipelinesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PollForTaskResult> pollForTaskAsync(PollForTaskRequest request) {

        return pollForTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PollForTaskResult> pollForTaskAsync(PollForTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<PollForTaskRequest, PollForTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(PutPipelineDefinitionRequest request) {

        return putPipelineDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(PutPipelineDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutPipelineDefinitionRequest, PutPipelineDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<QueryObjectsResult> queryObjectsAsync(QueryObjectsRequest request) {

        return queryObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryObjectsResult> queryObjectsAsync(QueryObjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<QueryObjectsRequest, QueryObjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReportTaskProgressResult> reportTaskProgressAsync(ReportTaskProgressRequest request) {

        return reportTaskProgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReportTaskProgressResult> reportTaskProgressAsync(ReportTaskProgressRequest request,
            com.amazonaws.handlers.AsyncHandler<ReportTaskProgressRequest, ReportTaskProgressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(ReportTaskRunnerHeartbeatRequest request) {

        return reportTaskRunnerHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(ReportTaskRunnerHeartbeatRequest request,
            com.amazonaws.handlers.AsyncHandler<ReportTaskRunnerHeartbeatRequest, ReportTaskRunnerHeartbeatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetStatusResult> setStatusAsync(SetStatusRequest request) {

        return setStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetStatusResult> setStatusAsync(SetStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<SetStatusRequest, SetStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetTaskStatusResult> setTaskStatusAsync(SetTaskStatusRequest request) {

        return setTaskStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTaskStatusResult> setTaskStatusAsync(SetTaskStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<SetTaskStatusRequest, SetTaskStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(ValidatePipelineDefinitionRequest request) {

        return validatePipelineDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(ValidatePipelineDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<ValidatePipelineDefinitionRequest, ValidatePipelineDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

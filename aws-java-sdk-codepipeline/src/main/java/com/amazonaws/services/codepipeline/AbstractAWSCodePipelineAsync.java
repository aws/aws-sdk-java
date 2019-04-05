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
package com.amazonaws.services.codepipeline;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;

/**
 * Abstract implementation of {@code AWSCodePipelineAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodePipelineAsync extends AbstractAWSCodePipeline implements AWSCodePipelineAsync {

    protected AbstractAWSCodePipelineAsync() {
    }

    @Override
    public java.util.concurrent.Future<AcknowledgeJobResult> acknowledgeJobAsync(AcknowledgeJobRequest request) {

        return acknowledgeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcknowledgeJobResult> acknowledgeJobAsync(AcknowledgeJobRequest request,
            com.amazonaws.handlers.AsyncHandler<AcknowledgeJobRequest, AcknowledgeJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AcknowledgeThirdPartyJobResult> acknowledgeThirdPartyJobAsync(AcknowledgeThirdPartyJobRequest request) {

        return acknowledgeThirdPartyJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcknowledgeThirdPartyJobResult> acknowledgeThirdPartyJobAsync(AcknowledgeThirdPartyJobRequest request,
            com.amazonaws.handlers.AsyncHandler<AcknowledgeThirdPartyJobRequest, AcknowledgeThirdPartyJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCustomActionTypeResult> createCustomActionTypeAsync(CreateCustomActionTypeRequest request) {

        return createCustomActionTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomActionTypeResult> createCustomActionTypeAsync(CreateCustomActionTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCustomActionTypeRequest, CreateCustomActionTypeResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteCustomActionTypeResult> deleteCustomActionTypeAsync(DeleteCustomActionTypeRequest request) {

        return deleteCustomActionTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomActionTypeResult> deleteCustomActionTypeAsync(DeleteCustomActionTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomActionTypeRequest, DeleteCustomActionTypeResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest request) {

        return deleteWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWebhookRequest, DeleteWebhookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterWebhookWithThirdPartyResult> deregisterWebhookWithThirdPartyAsync(
            DeregisterWebhookWithThirdPartyRequest request) {

        return deregisterWebhookWithThirdPartyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterWebhookWithThirdPartyResult> deregisterWebhookWithThirdPartyAsync(
            DeregisterWebhookWithThirdPartyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterWebhookWithThirdPartyRequest, DeregisterWebhookWithThirdPartyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableStageTransitionResult> disableStageTransitionAsync(DisableStageTransitionRequest request) {

        return disableStageTransitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableStageTransitionResult> disableStageTransitionAsync(DisableStageTransitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableStageTransitionRequest, DisableStageTransitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableStageTransitionResult> enableStageTransitionAsync(EnableStageTransitionRequest request) {

        return enableStageTransitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableStageTransitionResult> enableStageTransitionAsync(EnableStageTransitionRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableStageTransitionRequest, EnableStageTransitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetJobDetailsResult> getJobDetailsAsync(GetJobDetailsRequest request) {

        return getJobDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobDetailsResult> getJobDetailsAsync(GetJobDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetJobDetailsRequest, GetJobDetailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest request) {

        return getPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPipelineRequest, GetPipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPipelineExecutionResult> getPipelineExecutionAsync(GetPipelineExecutionRequest request) {

        return getPipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineExecutionResult> getPipelineExecutionAsync(GetPipelineExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPipelineExecutionRequest, GetPipelineExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPipelineStateResult> getPipelineStateAsync(GetPipelineStateRequest request) {

        return getPipelineStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineStateResult> getPipelineStateAsync(GetPipelineStateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPipelineStateRequest, GetPipelineStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetThirdPartyJobDetailsResult> getThirdPartyJobDetailsAsync(GetThirdPartyJobDetailsRequest request) {

        return getThirdPartyJobDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetThirdPartyJobDetailsResult> getThirdPartyJobDetailsAsync(GetThirdPartyJobDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetThirdPartyJobDetailsRequest, GetThirdPartyJobDetailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListActionExecutionsResult> listActionExecutionsAsync(ListActionExecutionsRequest request) {

        return listActionExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActionExecutionsResult> listActionExecutionsAsync(ListActionExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListActionExecutionsRequest, ListActionExecutionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListActionTypesResult> listActionTypesAsync(ListActionTypesRequest request) {

        return listActionTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActionTypesResult> listActionTypesAsync(ListActionTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListActionTypesRequest, ListActionTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPipelineExecutionsResult> listPipelineExecutionsAsync(ListPipelineExecutionsRequest request) {

        return listPipelineExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelineExecutionsResult> listPipelineExecutionsAsync(ListPipelineExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPipelineExecutionsRequest, ListPipelineExecutionsResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<ListWebhooksResult> listWebhooksAsync(ListWebhooksRequest request) {

        return listWebhooksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWebhooksResult> listWebhooksAsync(ListWebhooksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWebhooksRequest, ListWebhooksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PollForJobsResult> pollForJobsAsync(PollForJobsRequest request) {

        return pollForJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PollForJobsResult> pollForJobsAsync(PollForJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<PollForJobsRequest, PollForJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PollForThirdPartyJobsResult> pollForThirdPartyJobsAsync(PollForThirdPartyJobsRequest request) {

        return pollForThirdPartyJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PollForThirdPartyJobsResult> pollForThirdPartyJobsAsync(PollForThirdPartyJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<PollForThirdPartyJobsRequest, PollForThirdPartyJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutActionRevisionResult> putActionRevisionAsync(PutActionRevisionRequest request) {

        return putActionRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutActionRevisionResult> putActionRevisionAsync(PutActionRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutActionRevisionRequest, PutActionRevisionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutApprovalResultResult> putApprovalResultAsync(PutApprovalResultRequest request) {

        return putApprovalResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutApprovalResultResult> putApprovalResultAsync(PutApprovalResultRequest request,
            com.amazonaws.handlers.AsyncHandler<PutApprovalResultRequest, PutApprovalResultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutJobFailureResultResult> putJobFailureResultAsync(PutJobFailureResultRequest request) {

        return putJobFailureResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutJobFailureResultResult> putJobFailureResultAsync(PutJobFailureResultRequest request,
            com.amazonaws.handlers.AsyncHandler<PutJobFailureResultRequest, PutJobFailureResultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutJobSuccessResultResult> putJobSuccessResultAsync(PutJobSuccessResultRequest request) {

        return putJobSuccessResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutJobSuccessResultResult> putJobSuccessResultAsync(PutJobSuccessResultRequest request,
            com.amazonaws.handlers.AsyncHandler<PutJobSuccessResultRequest, PutJobSuccessResultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutThirdPartyJobFailureResultResult> putThirdPartyJobFailureResultAsync(PutThirdPartyJobFailureResultRequest request) {

        return putThirdPartyJobFailureResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutThirdPartyJobFailureResultResult> putThirdPartyJobFailureResultAsync(PutThirdPartyJobFailureResultRequest request,
            com.amazonaws.handlers.AsyncHandler<PutThirdPartyJobFailureResultRequest, PutThirdPartyJobFailureResultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutThirdPartyJobSuccessResultResult> putThirdPartyJobSuccessResultAsync(PutThirdPartyJobSuccessResultRequest request) {

        return putThirdPartyJobSuccessResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutThirdPartyJobSuccessResultResult> putThirdPartyJobSuccessResultAsync(PutThirdPartyJobSuccessResultRequest request,
            com.amazonaws.handlers.AsyncHandler<PutThirdPartyJobSuccessResultRequest, PutThirdPartyJobSuccessResultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutWebhookResult> putWebhookAsync(PutWebhookRequest request) {

        return putWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutWebhookResult> putWebhookAsync(PutWebhookRequest request,
            com.amazonaws.handlers.AsyncHandler<PutWebhookRequest, PutWebhookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterWebhookWithThirdPartyResult> registerWebhookWithThirdPartyAsync(RegisterWebhookWithThirdPartyRequest request) {

        return registerWebhookWithThirdPartyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterWebhookWithThirdPartyResult> registerWebhookWithThirdPartyAsync(RegisterWebhookWithThirdPartyRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterWebhookWithThirdPartyRequest, RegisterWebhookWithThirdPartyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RetryStageExecutionResult> retryStageExecutionAsync(RetryStageExecutionRequest request) {

        return retryStageExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetryStageExecutionResult> retryStageExecutionAsync(RetryStageExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<RetryStageExecutionRequest, RetryStageExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(StartPipelineExecutionRequest request) {

        return startPipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(StartPipelineExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartPipelineExecutionRequest, StartPipelineExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest request) {

        return updatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

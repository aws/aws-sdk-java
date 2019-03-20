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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCodePipeline}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodePipeline implements AWSCodePipeline {

    protected AbstractAWSCodePipeline() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AcknowledgeJobResult acknowledgeJob(AcknowledgeJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AcknowledgeThirdPartyJobResult acknowledgeThirdPartyJob(AcknowledgeThirdPartyJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCustomActionTypeResult createCustomActionType(CreateCustomActionTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePipelineResult createPipeline(CreatePipelineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCustomActionTypeResult deleteCustomActionType(DeleteCustomActionTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePipelineResult deletePipeline(DeletePipelineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteWebhookResult deleteWebhook(DeleteWebhookRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterWebhookWithThirdPartyResult deregisterWebhookWithThirdParty(DeregisterWebhookWithThirdPartyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableStageTransitionResult disableStageTransition(DisableStageTransitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableStageTransitionResult enableStageTransition(EnableStageTransitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetJobDetailsResult getJobDetails(GetJobDetailsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPipelineResult getPipeline(GetPipelineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPipelineExecutionResult getPipelineExecution(GetPipelineExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPipelineStateResult getPipelineState(GetPipelineStateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetThirdPartyJobDetailsResult getThirdPartyJobDetails(GetThirdPartyJobDetailsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListActionExecutionsResult listActionExecutions(ListActionExecutionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListActionTypesResult listActionTypes(ListActionTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPipelineExecutionsResult listPipelineExecutions(ListPipelineExecutionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPipelinesResult listPipelines(ListPipelinesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListWebhooksResult listWebhooks(ListWebhooksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PollForJobsResult pollForJobs(PollForJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PollForThirdPartyJobsResult pollForThirdPartyJobs(PollForThirdPartyJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutActionRevisionResult putActionRevision(PutActionRevisionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutApprovalResultResult putApprovalResult(PutApprovalResultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutJobFailureResultResult putJobFailureResult(PutJobFailureResultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutJobSuccessResultResult putJobSuccessResult(PutJobSuccessResultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutThirdPartyJobFailureResultResult putThirdPartyJobFailureResult(PutThirdPartyJobFailureResultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutThirdPartyJobSuccessResultResult putThirdPartyJobSuccessResult(PutThirdPartyJobSuccessResultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutWebhookResult putWebhook(PutWebhookRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterWebhookWithThirdPartyResult registerWebhookWithThirdParty(RegisterWebhookWithThirdPartyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RetryStageExecutionResult retryStageExecution(RetryStageExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartPipelineExecutionResult startPipelineExecution(StartPipelineExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdatePipelineResult updatePipeline(UpdatePipelineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}

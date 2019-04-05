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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code DataPipeline}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractDataPipeline implements DataPipeline {

    protected AbstractDataPipeline() {
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
    public ActivatePipelineResult activatePipeline(ActivatePipelineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePipelineResult createPipeline(CreatePipelineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeactivatePipelineResult deactivatePipeline(DeactivatePipelineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePipelineResult deletePipeline(DeletePipelineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeObjectsResult describeObjects(DescribeObjectsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePipelinesResult describePipelines(DescribePipelinesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EvaluateExpressionResult evaluateExpression(EvaluateExpressionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPipelineDefinitionResult getPipelineDefinition(GetPipelineDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPipelinesResult listPipelines(ListPipelinesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPipelinesResult listPipelines() {
        return listPipelines(new ListPipelinesRequest());
    }

    @Override
    public PollForTaskResult pollForTask(PollForTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutPipelineDefinitionResult putPipelineDefinition(PutPipelineDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public QueryObjectsResult queryObjects(QueryObjectsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReportTaskProgressResult reportTaskProgress(ReportTaskProgressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReportTaskRunnerHeartbeatResult reportTaskRunnerHeartbeat(ReportTaskRunnerHeartbeatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetStatusResult setStatus(SetStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetTaskStatusResult setTaskStatus(SetTaskStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ValidatePipelineDefinitionResult validatePipelineDefinition(ValidatePipelineDefinitionRequest request) {
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

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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSStepFunctions}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSStepFunctions implements AWSStepFunctions {

    protected AbstractAWSStepFunctions() {
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
    public CreateActivityResult createActivity(CreateActivityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStateMachineResult createStateMachine(CreateStateMachineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteActivityResult deleteActivity(DeleteActivityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteStateMachineResult deleteStateMachine(DeleteStateMachineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeActivityResult describeActivity(DescribeActivityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeExecutionResult describeExecution(DescribeExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStateMachineResult describeStateMachine(DescribeStateMachineRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStateMachineForExecutionResult describeStateMachineForExecution(DescribeStateMachineForExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetActivityTaskResult getActivityTask(GetActivityTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetExecutionHistoryResult getExecutionHistory(GetExecutionHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListActivitiesResult listActivities(ListActivitiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListExecutionsResult listExecutions(ListExecutionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStateMachinesResult listStateMachines(ListStateMachinesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendTaskFailureResult sendTaskFailure(SendTaskFailureRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendTaskHeartbeatResult sendTaskHeartbeat(SendTaskHeartbeatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendTaskSuccessResult sendTaskSuccess(SendTaskSuccessRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartExecutionResult startExecution(StartExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopExecutionResult stopExecution(StopExecutionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateStateMachineResult updateStateMachine(UpdateStateMachineRequest request) {
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

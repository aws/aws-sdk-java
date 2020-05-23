/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSDataSync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSDataSync implements AWSDataSync {

    protected AbstractAWSDataSync() {
    }

    @Override
    public CancelTaskExecutionResult cancelTaskExecution(CancelTaskExecutionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateAgentResult createAgent(CreateAgentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateLocationEfsResult createLocationEfs(CreateLocationEfsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateLocationFsxWindowsResult createLocationFsxWindows(CreateLocationFsxWindowsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateLocationNfsResult createLocationNfs(CreateLocationNfsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateLocationS3Result createLocationS3(CreateLocationS3Request request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateLocationSmbResult createLocationSmb(CreateLocationSmbRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateTaskResult createTask(CreateTaskRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteAgentResult deleteAgent(DeleteAgentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteLocationResult deleteLocation(DeleteLocationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteTaskResult deleteTask(DeleteTaskRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAgentResult describeAgent(DescribeAgentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLocationEfsResult describeLocationEfs(DescribeLocationEfsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLocationFsxWindowsResult describeLocationFsxWindows(DescribeLocationFsxWindowsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLocationNfsResult describeLocationNfs(DescribeLocationNfsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLocationS3Result describeLocationS3(DescribeLocationS3Request request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeLocationSmbResult describeLocationSmb(DescribeLocationSmbRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeTaskResult describeTask(DescribeTaskRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeTaskExecutionResult describeTaskExecution(DescribeTaskExecutionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAgentsResult listAgents(ListAgentsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListLocationsResult listLocations(ListLocationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTaskExecutionsResult listTaskExecutions(ListTaskExecutionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTasksResult listTasks(ListTasksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartTaskExecutionResult startTaskExecution(StartTaskExecutionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateAgentResult updateAgent(UpdateAgentRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateTaskResult updateTask(UpdateTaskRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

}

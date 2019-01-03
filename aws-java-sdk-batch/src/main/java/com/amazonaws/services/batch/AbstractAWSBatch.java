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
package com.amazonaws.services.batch;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSBatch}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBatch implements AWSBatch {

    protected AbstractAWSBatch() {
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
    public CancelJobResult cancelJob(CancelJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateComputeEnvironmentResult createComputeEnvironment(CreateComputeEnvironmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateJobQueueResult createJobQueue(CreateJobQueueRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteComputeEnvironmentResult deleteComputeEnvironment(DeleteComputeEnvironmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteJobQueueResult deleteJobQueue(DeleteJobQueueRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterJobDefinitionResult deregisterJobDefinition(DeregisterJobDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeComputeEnvironmentsResult describeComputeEnvironments(DescribeComputeEnvironmentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeJobDefinitionsResult describeJobDefinitions(DescribeJobDefinitionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeJobQueuesResult describeJobQueues(DescribeJobQueuesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeJobsResult describeJobs(DescribeJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterJobDefinitionResult registerJobDefinition(RegisterJobDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SubmitJobResult submitJob(SubmitJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TerminateJobResult terminateJob(TerminateJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateComputeEnvironmentResult updateComputeEnvironment(UpdateComputeEnvironmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateJobQueueResult updateJobQueue(UpdateJobQueueRequest request) {
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

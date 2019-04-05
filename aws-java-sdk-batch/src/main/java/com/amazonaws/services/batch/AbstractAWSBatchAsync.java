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

/**
 * Abstract implementation of {@code AWSBatchAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBatchAsync extends AbstractAWSBatch implements AWSBatchAsync {

    protected AbstractAWSBatchAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request) {

        return cancelJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateComputeEnvironmentResult> createComputeEnvironmentAsync(CreateComputeEnvironmentRequest request) {

        return createComputeEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComputeEnvironmentResult> createComputeEnvironmentAsync(CreateComputeEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateComputeEnvironmentRequest, CreateComputeEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateJobQueueResult> createJobQueueAsync(CreateJobQueueRequest request) {

        return createJobQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobQueueResult> createJobQueueAsync(CreateJobQueueRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateJobQueueRequest, CreateJobQueueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteComputeEnvironmentResult> deleteComputeEnvironmentAsync(DeleteComputeEnvironmentRequest request) {

        return deleteComputeEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComputeEnvironmentResult> deleteComputeEnvironmentAsync(DeleteComputeEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteComputeEnvironmentRequest, DeleteComputeEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteJobQueueResult> deleteJobQueueAsync(DeleteJobQueueRequest request) {

        return deleteJobQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobQueueResult> deleteJobQueueAsync(DeleteJobQueueRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteJobQueueRequest, DeleteJobQueueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterJobDefinitionResult> deregisterJobDefinitionAsync(DeregisterJobDefinitionRequest request) {

        return deregisterJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterJobDefinitionResult> deregisterJobDefinitionAsync(DeregisterJobDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterJobDefinitionRequest, DeregisterJobDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeComputeEnvironmentsResult> describeComputeEnvironmentsAsync(DescribeComputeEnvironmentsRequest request) {

        return describeComputeEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComputeEnvironmentsResult> describeComputeEnvironmentsAsync(DescribeComputeEnvironmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeComputeEnvironmentsRequest, DescribeComputeEnvironmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJobDefinitionsResult> describeJobDefinitionsAsync(DescribeJobDefinitionsRequest request) {

        return describeJobDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobDefinitionsResult> describeJobDefinitionsAsync(DescribeJobDefinitionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobDefinitionsRequest, DescribeJobDefinitionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJobQueuesResult> describeJobQueuesAsync(DescribeJobQueuesRequest request) {

        return describeJobQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobQueuesResult> describeJobQueuesAsync(DescribeJobQueuesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobQueuesRequest, DescribeJobQueuesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest request) {

        return describeJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobsRequest, DescribeJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterJobDefinitionResult> registerJobDefinitionAsync(RegisterJobDefinitionRequest request) {

        return registerJobDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterJobDefinitionResult> registerJobDefinitionAsync(RegisterJobDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterJobDefinitionRequest, RegisterJobDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SubmitJobResult> submitJobAsync(SubmitJobRequest request) {

        return submitJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitJobResult> submitJobAsync(SubmitJobRequest request,
            com.amazonaws.handlers.AsyncHandler<SubmitJobRequest, SubmitJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateJobResult> terminateJobAsync(TerminateJobRequest request) {

        return terminateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateJobResult> terminateJobAsync(TerminateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateJobRequest, TerminateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateComputeEnvironmentResult> updateComputeEnvironmentAsync(UpdateComputeEnvironmentRequest request) {

        return updateComputeEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateComputeEnvironmentResult> updateComputeEnvironmentAsync(UpdateComputeEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateComputeEnvironmentRequest, UpdateComputeEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateJobQueueResult> updateJobQueueAsync(UpdateJobQueueRequest request) {

        return updateJobQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobQueueResult> updateJobQueueAsync(UpdateJobQueueRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateJobQueueRequest, UpdateJobQueueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

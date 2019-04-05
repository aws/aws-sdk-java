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
package com.amazonaws.services.iotjobsdataplane;

import javax.annotation.Generated;

import com.amazonaws.services.iotjobsdataplane.model.*;

/**
 * Abstract implementation of {@code AWSIoTJobsDataPlaneAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIoTJobsDataPlaneAsync extends AbstractAWSIoTJobsDataPlane implements AWSIoTJobsDataPlaneAsync {

    protected AbstractAWSIoTJobsDataPlaneAsync() {
    }

    @Override
    public java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(DescribeJobExecutionRequest request) {

        return describeJobExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(DescribeJobExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobExecutionRequest, DescribeJobExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPendingJobExecutionsResult> getPendingJobExecutionsAsync(GetPendingJobExecutionsRequest request) {

        return getPendingJobExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPendingJobExecutionsResult> getPendingJobExecutionsAsync(GetPendingJobExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPendingJobExecutionsRequest, GetPendingJobExecutionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartNextPendingJobExecutionResult> startNextPendingJobExecutionAsync(StartNextPendingJobExecutionRequest request) {

        return startNextPendingJobExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartNextPendingJobExecutionResult> startNextPendingJobExecutionAsync(StartNextPendingJobExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartNextPendingJobExecutionRequest, StartNextPendingJobExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateJobExecutionResult> updateJobExecutionAsync(UpdateJobExecutionRequest request) {

        return updateJobExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobExecutionResult> updateJobExecutionAsync(UpdateJobExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateJobExecutionRequest, UpdateJobExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

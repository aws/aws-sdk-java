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
package com.amazonaws.services.comprehendmedical;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;

/**
 * Abstract implementation of {@code AWSComprehendMedicalAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSComprehendMedicalAsync extends AbstractAWSComprehendMedical implements AWSComprehendMedicalAsync {

    protected AbstractAWSComprehendMedicalAsync() {
    }

    @Override
    public java.util.concurrent.Future<DescribeEntitiesDetectionV2JobResult> describeEntitiesDetectionV2JobAsync(DescribeEntitiesDetectionV2JobRequest request) {

        return describeEntitiesDetectionV2JobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntitiesDetectionV2JobResult> describeEntitiesDetectionV2JobAsync(DescribeEntitiesDetectionV2JobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEntitiesDetectionV2JobRequest, DescribeEntitiesDetectionV2JobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePHIDetectionJobResult> describePHIDetectionJobAsync(DescribePHIDetectionJobRequest request) {

        return describePHIDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePHIDetectionJobResult> describePHIDetectionJobAsync(DescribePHIDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePHIDetectionJobRequest, DescribePHIDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest request) {

        return detectEntitiesAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectEntitiesV2Result> detectEntitiesV2Async(DetectEntitiesV2Request request) {

        return detectEntitiesV2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectEntitiesV2Result> detectEntitiesV2Async(DetectEntitiesV2Request request,
            com.amazonaws.handlers.AsyncHandler<DetectEntitiesV2Request, DetectEntitiesV2Result> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(DetectPHIRequest request) {

        return detectPHIAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(DetectPHIRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectPHIRequest, DetectPHIResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InferICD10CMResult> inferICD10CMAsync(InferICD10CMRequest request) {

        return inferICD10CMAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InferICD10CMResult> inferICD10CMAsync(InferICD10CMRequest request,
            com.amazonaws.handlers.AsyncHandler<InferICD10CMRequest, InferICD10CMResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InferRxNormResult> inferRxNormAsync(InferRxNormRequest request) {

        return inferRxNormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InferRxNormResult> inferRxNormAsync(InferRxNormRequest request,
            com.amazonaws.handlers.AsyncHandler<InferRxNormRequest, InferRxNormResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesDetectionV2JobsResult> listEntitiesDetectionV2JobsAsync(ListEntitiesDetectionV2JobsRequest request) {

        return listEntitiesDetectionV2JobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesDetectionV2JobsResult> listEntitiesDetectionV2JobsAsync(ListEntitiesDetectionV2JobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEntitiesDetectionV2JobsRequest, ListEntitiesDetectionV2JobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPHIDetectionJobsResult> listPHIDetectionJobsAsync(ListPHIDetectionJobsRequest request) {

        return listPHIDetectionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPHIDetectionJobsResult> listPHIDetectionJobsAsync(ListPHIDetectionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPHIDetectionJobsRequest, ListPHIDetectionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartEntitiesDetectionV2JobResult> startEntitiesDetectionV2JobAsync(StartEntitiesDetectionV2JobRequest request) {

        return startEntitiesDetectionV2JobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartEntitiesDetectionV2JobResult> startEntitiesDetectionV2JobAsync(StartEntitiesDetectionV2JobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartEntitiesDetectionV2JobRequest, StartEntitiesDetectionV2JobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartPHIDetectionJobResult> startPHIDetectionJobAsync(StartPHIDetectionJobRequest request) {

        return startPHIDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPHIDetectionJobResult> startPHIDetectionJobAsync(StartPHIDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartPHIDetectionJobRequest, StartPHIDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopEntitiesDetectionV2JobResult> stopEntitiesDetectionV2JobAsync(StopEntitiesDetectionV2JobRequest request) {

        return stopEntitiesDetectionV2JobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopEntitiesDetectionV2JobResult> stopEntitiesDetectionV2JobAsync(StopEntitiesDetectionV2JobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopEntitiesDetectionV2JobRequest, StopEntitiesDetectionV2JobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopPHIDetectionJobResult> stopPHIDetectionJobAsync(StopPHIDetectionJobRequest request) {

        return stopPHIDetectionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopPHIDetectionJobResult> stopPHIDetectionJobAsync(StopPHIDetectionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopPHIDetectionJobRequest, StopPHIDetectionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

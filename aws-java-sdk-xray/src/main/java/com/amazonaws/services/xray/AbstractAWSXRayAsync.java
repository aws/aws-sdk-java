/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;

/**
 * Abstract implementation of {@code AWSXRayAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSXRayAsync extends AbstractAWSXRay implements AWSXRayAsync {

    protected AbstractAWSXRayAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetTracesResult> batchGetTracesAsync(BatchGetTracesRequest request) {

        return batchGetTracesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetTracesResult> batchGetTracesAsync(BatchGetTracesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetTracesRequest, BatchGetTracesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServiceGraphResult> getServiceGraphAsync(GetServiceGraphRequest request) {

        return getServiceGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceGraphResult> getServiceGraphAsync(GetServiceGraphRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServiceGraphRequest, GetServiceGraphResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTraceGraphResult> getTraceGraphAsync(GetTraceGraphRequest request) {

        return getTraceGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTraceGraphResult> getTraceGraphAsync(GetTraceGraphRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTraceGraphRequest, GetTraceGraphResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTraceSummariesResult> getTraceSummariesAsync(GetTraceSummariesRequest request) {

        return getTraceSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTraceSummariesResult> getTraceSummariesAsync(GetTraceSummariesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTraceSummariesRequest, GetTraceSummariesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutTelemetryRecordsResult> putTelemetryRecordsAsync(PutTelemetryRecordsRequest request) {

        return putTelemetryRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTelemetryRecordsResult> putTelemetryRecordsAsync(PutTelemetryRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutTelemetryRecordsRequest, PutTelemetryRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutTraceSegmentsResult> putTraceSegmentsAsync(PutTraceSegmentsRequest request) {

        return putTraceSegmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTraceSegmentsResult> putTraceSegmentsAsync(PutTraceSegmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutTraceSegmentsRequest, PutTraceSegmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

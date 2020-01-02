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
package com.amazonaws.services.ioteventsdata;

import javax.annotation.Generated;

import com.amazonaws.services.ioteventsdata.model.*;

/**
 * Abstract implementation of {@code AWSIoTEventsDataAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIoTEventsDataAsync extends AbstractAWSIoTEventsData implements AWSIoTEventsDataAsync {

    protected AbstractAWSIoTEventsDataAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(BatchPutMessageRequest request) {

        return batchPutMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(BatchPutMessageRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchPutMessageRequest, BatchPutMessageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateDetectorResult> batchUpdateDetectorAsync(BatchUpdateDetectorRequest request) {

        return batchUpdateDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateDetectorResult> batchUpdateDetectorAsync(BatchUpdateDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateDetectorRequest, BatchUpdateDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest request) {

        return describeDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDetectorRequest, DescribeDetectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest request) {

        return listDetectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDetectorsRequest, ListDetectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

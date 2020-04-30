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
package com.amazonaws.services.iotevents;

import javax.annotation.Generated;

import com.amazonaws.services.iotevents.model.*;

/**
 * Abstract implementation of {@code AWSIoTEventsAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIoTEventsAsync extends AbstractAWSIoTEvents implements AWSIoTEventsAsync {

    protected AbstractAWSIoTEventsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorModelResult> createDetectorModelAsync(CreateDetectorModelRequest request) {

        return createDetectorModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorModelResult> createDetectorModelAsync(CreateDetectorModelRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDetectorModelRequest, CreateDetectorModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInputResult> createInputAsync(CreateInputRequest request) {

        return createInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInputResult> createInputAsync(CreateInputRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInputRequest, CreateInputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorModelResult> deleteDetectorModelAsync(DeleteDetectorModelRequest request) {

        return deleteDetectorModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorModelResult> deleteDetectorModelAsync(DeleteDetectorModelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDetectorModelRequest, DeleteDetectorModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(DeleteInputRequest request) {

        return deleteInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(DeleteInputRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInputRequest, DeleteInputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDetectorModelResult> describeDetectorModelAsync(DescribeDetectorModelRequest request) {

        return describeDetectorModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDetectorModelResult> describeDetectorModelAsync(DescribeDetectorModelRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDetectorModelRequest, DescribeDetectorModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeInputResult> describeInputAsync(DescribeInputRequest request) {

        return describeInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInputResult> describeInputAsync(DescribeInputRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInputRequest, DescribeInputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest request) {

        return describeLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoggingOptionsRequest, DescribeLoggingOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDetectorModelVersionsResult> listDetectorModelVersionsAsync(ListDetectorModelVersionsRequest request) {

        return listDetectorModelVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDetectorModelVersionsResult> listDetectorModelVersionsAsync(ListDetectorModelVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDetectorModelVersionsRequest, ListDetectorModelVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDetectorModelsResult> listDetectorModelsAsync(ListDetectorModelsRequest request) {

        return listDetectorModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDetectorModelsResult> listDetectorModelsAsync(ListDetectorModelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDetectorModelsRequest, ListDetectorModelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInputsResult> listInputsAsync(ListInputsRequest request) {

        return listInputsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInputsResult> listInputsAsync(ListInputsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInputsRequest, ListInputsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest request) {

        return putLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutLoggingOptionsRequest, PutLoggingOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorModelResult> updateDetectorModelAsync(UpdateDetectorModelRequest request) {

        return updateDetectorModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorModelResult> updateDetectorModelAsync(UpdateDetectorModelRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorModelRequest, UpdateDetectorModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateInputResult> updateInputAsync(UpdateInputRequest request) {

        return updateInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInputResult> updateInputAsync(UpdateInputRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateInputRequest, UpdateInputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

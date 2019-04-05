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
package com.amazonaws.services.kinesisvideo;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideo.model.*;

/**
 * Abstract implementation of {@code AmazonKinesisVideoAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesisVideoAsync extends AbstractAmazonKinesisVideo implements AmazonKinesisVideoAsync {

    protected AbstractAmazonKinesisVideoAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest request) {

        return createStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest request) {

        return deleteStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request) {

        return describeStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataEndpointResult> getDataEndpointAsync(GetDataEndpointRequest request) {

        return getDataEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataEndpointResult> getDataEndpointAsync(GetDataEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataEndpointRequest, GetDataEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(ListTagsForStreamRequest request) {

        return listTagsForStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(ListTagsForStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForStreamRequest, ListTagsForStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagStreamResult> tagStreamAsync(TagStreamRequest request) {

        return tagStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagStreamResult> tagStreamAsync(TagStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<TagStreamRequest, TagStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagStreamResult> untagStreamAsync(UntagStreamRequest request) {

        return untagStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagStreamResult> untagStreamAsync(UntagStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagStreamRequest, UntagStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDataRetentionResult> updateDataRetentionAsync(UpdateDataRetentionRequest request) {

        return updateDataRetentionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataRetentionResult> updateDataRetentionAsync(UpdateDataRetentionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDataRetentionRequest, UpdateDataRetentionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(UpdateStreamRequest request) {

        return updateStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(UpdateStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStreamRequest, UpdateStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

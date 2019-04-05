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
package com.amazonaws.services.mediapackage;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;

/**
 * Abstract implementation of {@code AWSMediaPackageAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMediaPackageAsync extends AbstractAWSMediaPackage implements AWSMediaPackageAsync {

    protected AbstractAWSMediaPackageAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest request) {

        return createChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateOriginEndpointResult> createOriginEndpointAsync(CreateOriginEndpointRequest request) {

        return createOriginEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOriginEndpointResult> createOriginEndpointAsync(CreateOriginEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateOriginEndpointRequest, CreateOriginEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest request) {

        return deleteChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteOriginEndpointResult> deleteOriginEndpointAsync(DeleteOriginEndpointRequest request) {

        return deleteOriginEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOriginEndpointResult> deleteOriginEndpointAsync(DeleteOriginEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteOriginEndpointRequest, DeleteOriginEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest request) {

        return describeChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeOriginEndpointResult> describeOriginEndpointAsync(DescribeOriginEndpointRequest request) {

        return describeOriginEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOriginEndpointResult> describeOriginEndpointAsync(DescribeOriginEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOriginEndpointRequest, DescribeOriginEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request) {

        return listChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListOriginEndpointsResult> listOriginEndpointsAsync(ListOriginEndpointsRequest request) {

        return listOriginEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOriginEndpointsResult> listOriginEndpointsAsync(ListOriginEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOriginEndpointsRequest, ListOriginEndpointsResult> asyncHandler) {

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
    @Deprecated
    public java.util.concurrent.Future<RotateChannelCredentialsResult> rotateChannelCredentialsAsync(RotateChannelCredentialsRequest request) {

        return rotateChannelCredentialsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<RotateChannelCredentialsResult> rotateChannelCredentialsAsync(RotateChannelCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<RotateChannelCredentialsRequest, RotateChannelCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RotateIngestEndpointCredentialsResult> rotateIngestEndpointCredentialsAsync(
            RotateIngestEndpointCredentialsRequest request) {

        return rotateIngestEndpointCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RotateIngestEndpointCredentialsResult> rotateIngestEndpointCredentialsAsync(
            RotateIngestEndpointCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<RotateIngestEndpointCredentialsRequest, RotateIngestEndpointCredentialsResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest request) {

        return updateChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateOriginEndpointResult> updateOriginEndpointAsync(UpdateOriginEndpointRequest request) {

        return updateOriginEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOriginEndpointResult> updateOriginEndpointAsync(UpdateOriginEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateOriginEndpointRequest, UpdateOriginEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

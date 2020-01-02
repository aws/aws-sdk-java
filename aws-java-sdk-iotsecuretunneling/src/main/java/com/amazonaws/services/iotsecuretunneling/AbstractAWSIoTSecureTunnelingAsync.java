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
package com.amazonaws.services.iotsecuretunneling;

import javax.annotation.Generated;

import com.amazonaws.services.iotsecuretunneling.model.*;

/**
 * Abstract implementation of {@code AWSIoTSecureTunnelingAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIoTSecureTunnelingAsync extends AbstractAWSIoTSecureTunneling implements AWSIoTSecureTunnelingAsync {

    protected AbstractAWSIoTSecureTunnelingAsync() {
    }

    @Override
    public java.util.concurrent.Future<CloseTunnelResult> closeTunnelAsync(CloseTunnelRequest request) {

        return closeTunnelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloseTunnelResult> closeTunnelAsync(CloseTunnelRequest request,
            com.amazonaws.handlers.AsyncHandler<CloseTunnelRequest, CloseTunnelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTunnelResult> describeTunnelAsync(DescribeTunnelRequest request) {

        return describeTunnelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTunnelResult> describeTunnelAsync(DescribeTunnelRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTunnelRequest, DescribeTunnelResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTunnelsResult> listTunnelsAsync(ListTunnelsRequest request) {

        return listTunnelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTunnelsResult> listTunnelsAsync(ListTunnelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTunnelsRequest, ListTunnelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<OpenTunnelResult> openTunnelAsync(OpenTunnelRequest request) {

        return openTunnelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OpenTunnelResult> openTunnelAsync(OpenTunnelRequest request,
            com.amazonaws.handlers.AsyncHandler<OpenTunnelRequest, OpenTunnelResult> asyncHandler) {

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

}

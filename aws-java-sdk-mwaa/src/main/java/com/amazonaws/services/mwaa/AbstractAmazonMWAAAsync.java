/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mwaa;

import javax.annotation.Generated;

import com.amazonaws.services.mwaa.model.*;

/**
 * Abstract implementation of {@code AmazonMWAAAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonMWAAAsync extends AbstractAmazonMWAA implements AmazonMWAAAsync {

    protected AbstractAmazonMWAAAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateCliTokenResult> createCliTokenAsync(CreateCliTokenRequest request) {

        return createCliTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCliTokenResult> createCliTokenAsync(CreateCliTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCliTokenRequest, CreateCliTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest request) {

        return createEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWebLoginTokenResult> createWebLoginTokenAsync(CreateWebLoginTokenRequest request) {

        return createWebLoginTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWebLoginTokenResult> createWebLoginTokenAsync(CreateWebLoginTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWebLoginTokenRequest, CreateWebLoginTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {

        return deleteEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest request) {

        return getEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request) {

        return listEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler) {

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
    public java.util.concurrent.Future<PublishMetricsResult> publishMetricsAsync(PublishMetricsRequest request) {

        return publishMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishMetricsResult> publishMetricsAsync(PublishMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<PublishMetricsRequest, PublishMetricsResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

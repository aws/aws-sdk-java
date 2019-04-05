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
package com.amazonaws.services.mediatailor;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;

/**
 * Abstract implementation of {@code AWSMediaTailorAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMediaTailorAsync extends AbstractAWSMediaTailor implements AWSMediaTailorAsync {

    protected AbstractAWSMediaTailorAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(DeletePlaybackConfigurationRequest request) {

        return deletePlaybackConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(DeletePlaybackConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePlaybackConfigurationRequest, DeletePlaybackConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(GetPlaybackConfigurationRequest request) {

        return getPlaybackConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(GetPlaybackConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPlaybackConfigurationRequest, GetPlaybackConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(ListPlaybackConfigurationsRequest request) {

        return listPlaybackConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(ListPlaybackConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPlaybackConfigurationsRequest, ListPlaybackConfigurationsResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(PutPlaybackConfigurationRequest request) {

        return putPlaybackConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(PutPlaybackConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutPlaybackConfigurationRequest, PutPlaybackConfigurationResult> asyncHandler) {

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

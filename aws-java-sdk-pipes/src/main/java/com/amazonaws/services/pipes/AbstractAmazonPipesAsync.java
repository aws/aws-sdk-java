/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pipes;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;

/**
 * Abstract implementation of {@code AmazonPipesAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonPipesAsync extends AbstractAmazonPipes implements AmazonPipesAsync {

    protected AbstractAmazonPipesAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreatePipeResult> createPipeAsync(CreatePipeRequest request) {

        return createPipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePipeResult> createPipeAsync(CreatePipeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePipeRequest, CreatePipeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePipeResult> deletePipeAsync(DeletePipeRequest request) {

        return deletePipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePipeResult> deletePipeAsync(DeletePipeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePipeRequest, DeletePipeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePipeResult> describePipeAsync(DescribePipeRequest request) {

        return describePipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePipeResult> describePipeAsync(DescribePipeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePipeRequest, DescribePipeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPipesResult> listPipesAsync(ListPipesRequest request) {

        return listPipesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipesResult> listPipesAsync(ListPipesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPipesRequest, ListPipesResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartPipeResult> startPipeAsync(StartPipeRequest request) {

        return startPipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPipeResult> startPipeAsync(StartPipeRequest request,
            com.amazonaws.handlers.AsyncHandler<StartPipeRequest, StartPipeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopPipeResult> stopPipeAsync(StopPipeRequest request) {

        return stopPipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopPipeResult> stopPipeAsync(StopPipeRequest request,
            com.amazonaws.handlers.AsyncHandler<StopPipeRequest, StopPipeResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdatePipeResult> updatePipeAsync(UpdatePipeRequest request) {

        return updatePipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipeResult> updatePipeAsync(UpdatePipeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePipeRequest, UpdatePipeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

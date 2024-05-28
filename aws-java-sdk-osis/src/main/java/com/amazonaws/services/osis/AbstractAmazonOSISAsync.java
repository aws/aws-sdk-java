/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.osis;

import javax.annotation.Generated;

import com.amazonaws.services.osis.model.*;

/**
 * Abstract implementation of {@code AmazonOSISAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonOSISAsync extends AbstractAmazonOSIS implements AmazonOSISAsync {

    protected AbstractAmazonOSISAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest request) {

        return createPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest request) {

        return deletePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest request) {

        return getPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPipelineRequest, GetPipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPipelineBlueprintResult> getPipelineBlueprintAsync(GetPipelineBlueprintRequest request) {

        return getPipelineBlueprintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineBlueprintResult> getPipelineBlueprintAsync(GetPipelineBlueprintRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPipelineBlueprintRequest, GetPipelineBlueprintResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPipelineChangeProgressResult> getPipelineChangeProgressAsync(GetPipelineChangeProgressRequest request) {

        return getPipelineChangeProgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineChangeProgressResult> getPipelineChangeProgressAsync(GetPipelineChangeProgressRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPipelineChangeProgressRequest, GetPipelineChangeProgressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPipelineBlueprintsResult> listPipelineBlueprintsAsync(ListPipelineBlueprintsRequest request) {

        return listPipelineBlueprintsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelineBlueprintsResult> listPipelineBlueprintsAsync(ListPipelineBlueprintsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPipelineBlueprintsRequest, ListPipelineBlueprintsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest request) {

        return listPipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartPipelineResult> startPipelineAsync(StartPipelineRequest request) {

        return startPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPipelineResult> startPipelineAsync(StartPipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<StartPipelineRequest, StartPipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopPipelineResult> stopPipelineAsync(StopPipelineRequest request) {

        return stopPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopPipelineResult> stopPipelineAsync(StopPipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<StopPipelineRequest, StopPipelineResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest request) {

        return updatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ValidatePipelineResult> validatePipelineAsync(ValidatePipelineRequest request) {

        return validatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidatePipelineResult> validatePipelineAsync(ValidatePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<ValidatePipelineRequest, ValidatePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

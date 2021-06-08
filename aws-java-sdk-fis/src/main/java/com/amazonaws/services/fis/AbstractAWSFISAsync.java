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
package com.amazonaws.services.fis;

import javax.annotation.Generated;

import com.amazonaws.services.fis.model.*;

/**
 * Abstract implementation of {@code AWSFISAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSFISAsync extends AbstractAWSFIS implements AWSFISAsync {

    protected AbstractAWSFISAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateExperimentTemplateResult> createExperimentTemplateAsync(CreateExperimentTemplateRequest request) {

        return createExperimentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExperimentTemplateResult> createExperimentTemplateAsync(CreateExperimentTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateExperimentTemplateRequest, CreateExperimentTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteExperimentTemplateResult> deleteExperimentTemplateAsync(DeleteExperimentTemplateRequest request) {

        return deleteExperimentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExperimentTemplateResult> deleteExperimentTemplateAsync(DeleteExperimentTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteExperimentTemplateRequest, DeleteExperimentTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetActionResult> getActionAsync(GetActionRequest request) {

        return getActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetActionResult> getActionAsync(GetActionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetActionRequest, GetActionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetExperimentResult> getExperimentAsync(GetExperimentRequest request) {

        return getExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExperimentResult> getExperimentAsync(GetExperimentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetExperimentRequest, GetExperimentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetExperimentTemplateResult> getExperimentTemplateAsync(GetExperimentTemplateRequest request) {

        return getExperimentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExperimentTemplateResult> getExperimentTemplateAsync(GetExperimentTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetExperimentTemplateRequest, GetExperimentTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListActionsResult> listActionsAsync(ListActionsRequest request) {

        return listActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActionsResult> listActionsAsync(ListActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListActionsRequest, ListActionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListExperimentTemplatesResult> listExperimentTemplatesAsync(ListExperimentTemplatesRequest request) {

        return listExperimentTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExperimentTemplatesResult> listExperimentTemplatesAsync(ListExperimentTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExperimentTemplatesRequest, ListExperimentTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest request) {

        return listExperimentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExperimentsRequest, ListExperimentsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartExperimentResult> startExperimentAsync(StartExperimentRequest request) {

        return startExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExperimentResult> startExperimentAsync(StartExperimentRequest request,
            com.amazonaws.handlers.AsyncHandler<StartExperimentRequest, StartExperimentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopExperimentResult> stopExperimentAsync(StopExperimentRequest request) {

        return stopExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopExperimentResult> stopExperimentAsync(StopExperimentRequest request,
            com.amazonaws.handlers.AsyncHandler<StopExperimentRequest, StopExperimentResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateExperimentTemplateResult> updateExperimentTemplateAsync(UpdateExperimentTemplateRequest request) {

        return updateExperimentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExperimentTemplateResult> updateExperimentTemplateAsync(UpdateExperimentTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateExperimentTemplateRequest, UpdateExperimentTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

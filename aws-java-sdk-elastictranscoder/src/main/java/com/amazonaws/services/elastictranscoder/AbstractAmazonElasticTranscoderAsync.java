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
package com.amazonaws.services.elastictranscoder;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;

/**
 * Abstract implementation of {@code AmazonElasticTranscoderAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElasticTranscoderAsync extends AbstractAmazonElasticTranscoder implements AmazonElasticTranscoderAsync {

    protected AbstractAmazonElasticTranscoderAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request) {

        return cancelJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<CreatePresetResult> createPresetAsync(CreatePresetRequest request) {

        return createPresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresetResult> createPresetAsync(CreatePresetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePresetRequest, CreatePresetResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest request) {

        return deletePresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePresetRequest, DeletePresetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobsByPipelineResult> listJobsByPipelineAsync(ListJobsByPipelineRequest request) {

        return listJobsByPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsByPipelineResult> listJobsByPipelineAsync(ListJobsByPipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobsByPipelineRequest, ListJobsByPipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobsByStatusResult> listJobsByStatusAsync(ListJobsByStatusRequest request) {

        return listJobsByStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsByStatusResult> listJobsByStatusAsync(ListJobsByStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobsByStatusRequest, ListJobsByStatusResult> asyncHandler) {

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

    /**
     * Simplified method form for invoking the ListPipelines operation.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync() {

        return listPipelinesAsync(new ListPipelinesRequest());
    }

    /**
     * Simplified method form for invoking the ListPipelines operation with an AsyncHandler.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {

        return listPipelinesAsync(new ListPipelinesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest request) {

        return listPresetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListPresets operation.
     *
     * @see #listPresetsAsync(ListPresetsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync() {

        return listPresetsAsync(new ListPresetsRequest());
    }

    /**
     * Simplified method form for invoking the ListPresets operation with an AsyncHandler.
     *
     * @see #listPresetsAsync(ListPresetsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(
            com.amazonaws.handlers.AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler) {

        return listPresetsAsync(new ListPresetsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ReadJobResult> readJobAsync(ReadJobRequest request) {

        return readJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReadJobResult> readJobAsync(ReadJobRequest request,
            com.amazonaws.handlers.AsyncHandler<ReadJobRequest, ReadJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReadPipelineResult> readPipelineAsync(ReadPipelineRequest request) {

        return readPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReadPipelineResult> readPipelineAsync(ReadPipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<ReadPipelineRequest, ReadPipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReadPresetResult> readPresetAsync(ReadPresetRequest request) {

        return readPresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReadPresetResult> readPresetAsync(ReadPresetRequest request,
            com.amazonaws.handlers.AsyncHandler<ReadPresetRequest, ReadPresetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<TestRoleResult> testRoleAsync(TestRoleRequest request) {

        return testRoleAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<TestRoleResult> testRoleAsync(TestRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<TestRoleRequest, TestRoleResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(UpdatePipelineNotificationsRequest request) {

        return updatePipelineNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(UpdatePipelineNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineNotificationsRequest, UpdatePipelineNotificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(UpdatePipelineStatusRequest request) {

        return updatePipelineStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(UpdatePipelineStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineStatusRequest, UpdatePipelineStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

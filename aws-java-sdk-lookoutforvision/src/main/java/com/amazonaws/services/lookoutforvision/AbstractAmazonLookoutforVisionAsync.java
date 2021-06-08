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
package com.amazonaws.services.lookoutforvision;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutforvision.model.*;

/**
 * Abstract implementation of {@code AmazonLookoutforVisionAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonLookoutforVisionAsync extends AbstractAmazonLookoutforVision implements AmazonLookoutforVisionAsync {

    protected AbstractAmazonLookoutforVisionAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest request) {

        return createDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request) {

        return deleteDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest request) {

        return deleteModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest request) {

        return describeDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest request) {

        return describeModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeModelRequest, DescribeModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest request) {

        return describeProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetectAnomaliesResult> detectAnomaliesAsync(DetectAnomaliesRequest request) {

        return detectAnomaliesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectAnomaliesResult> detectAnomaliesAsync(DetectAnomaliesRequest request,
            com.amazonaws.handlers.AsyncHandler<DetectAnomaliesRequest, DetectAnomaliesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatasetEntriesResult> listDatasetEntriesAsync(ListDatasetEntriesRequest request) {

        return listDatasetEntriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetEntriesResult> listDatasetEntriesAsync(ListDatasetEntriesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatasetEntriesRequest, ListDatasetEntriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest request) {

        return listModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListModelsRequest, ListModelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartModelResult> startModelAsync(StartModelRequest request) {

        return startModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartModelResult> startModelAsync(StartModelRequest request,
            com.amazonaws.handlers.AsyncHandler<StartModelRequest, StartModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopModelResult> stopModelAsync(StopModelRequest request) {

        return stopModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopModelResult> stopModelAsync(StopModelRequest request,
            com.amazonaws.handlers.AsyncHandler<StopModelRequest, StopModelResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDatasetEntriesResult> updateDatasetEntriesAsync(UpdateDatasetEntriesRequest request) {

        return updateDatasetEntriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetEntriesResult> updateDatasetEntriesAsync(UpdateDatasetEntriesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetEntriesRequest, UpdateDatasetEntriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

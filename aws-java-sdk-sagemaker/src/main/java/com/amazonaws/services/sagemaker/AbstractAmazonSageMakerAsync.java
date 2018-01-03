/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;

/**
 * Abstract implementation of {@code AmazonSageMakerAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSageMakerAsync extends AbstractAmazonSageMaker implements AmazonSageMakerAsync {

    protected AbstractAmazonSageMakerAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest request) {

        return createEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(CreateEndpointConfigRequest request) {

        return createEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(CreateEndpointConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointConfigRequest, CreateEndpointConfigResult> asyncHandler) {

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
    public java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(CreateNotebookInstanceRequest request) {

        return createNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(CreateNotebookInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceRequest, CreateNotebookInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            CreatePresignedNotebookInstanceUrlRequest request) {

        return createPresignedNotebookInstanceUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            CreatePresignedNotebookInstanceUrlRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePresignedNotebookInstanceUrlRequest, CreatePresignedNotebookInstanceUrlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(CreateTrainingJobRequest request) {

        return createTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(CreateTrainingJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTrainingJobRequest, CreateTrainingJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(DeleteEndpointConfigRequest request) {

        return deleteEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(DeleteEndpointConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointConfigRequest, DeleteEndpointConfigResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(DeleteNotebookInstanceRequest request) {

        return deleteNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(DeleteNotebookInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceRequest, DeleteNotebookInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest request) {

        return describeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(DescribeEndpointConfigRequest request) {

        return describeEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(DescribeEndpointConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointConfigRequest, DescribeEndpointConfigResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(DescribeNotebookInstanceRequest request) {

        return describeNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(DescribeNotebookInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(DescribeTrainingJobRequest request) {

        return describeTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(DescribeTrainingJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTrainingJobRequest, DescribeTrainingJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(ListEndpointConfigsRequest request) {

        return listEndpointConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(ListEndpointConfigsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEndpointConfigsRequest, ListEndpointConfigsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest request) {

        return listEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEndpointsRequest, ListEndpointsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(ListNotebookInstancesRequest request) {

        return listNotebookInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(ListNotebookInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNotebookInstancesRequest, ListNotebookInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(ListTrainingJobsRequest request) {

        return listTrainingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(ListTrainingJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTrainingJobsRequest, ListTrainingJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(StartNotebookInstanceRequest request) {

        return startNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(StartNotebookInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<StartNotebookInstanceRequest, StartNotebookInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(StopNotebookInstanceRequest request) {

        return stopNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(StopNotebookInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<StopNotebookInstanceRequest, StopNotebookInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(StopTrainingJobRequest request) {

        return stopTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(StopTrainingJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopTrainingJobRequest, StopTrainingJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest request) {

        return updateEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            UpdateEndpointWeightsAndCapacitiesRequest request) {

        return updateEndpointWeightsAndCapacitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            UpdateEndpointWeightsAndCapacitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointWeightsAndCapacitiesRequest, UpdateEndpointWeightsAndCapacitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(UpdateNotebookInstanceRequest request) {

        return updateNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(UpdateNotebookInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceRequest, UpdateNotebookInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

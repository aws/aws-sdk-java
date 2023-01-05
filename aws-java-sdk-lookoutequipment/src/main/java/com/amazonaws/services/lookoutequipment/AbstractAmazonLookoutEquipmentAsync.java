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
package com.amazonaws.services.lookoutequipment;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;

/**
 * Abstract implementation of {@code AmazonLookoutEquipmentAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonLookoutEquipmentAsync extends AbstractAmazonLookoutEquipment implements AmazonLookoutEquipmentAsync {

    protected AbstractAmazonLookoutEquipmentAsync() {
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
    public java.util.concurrent.Future<CreateInferenceSchedulerResult> createInferenceSchedulerAsync(CreateInferenceSchedulerRequest request) {

        return createInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInferenceSchedulerResult> createInferenceSchedulerAsync(CreateInferenceSchedulerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInferenceSchedulerRequest, CreateInferenceSchedulerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLabelResult> createLabelAsync(CreateLabelRequest request) {

        return createLabelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLabelResult> createLabelAsync(CreateLabelRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLabelRequest, CreateLabelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLabelGroupResult> createLabelGroupAsync(CreateLabelGroupRequest request) {

        return createLabelGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLabelGroupResult> createLabelGroupAsync(CreateLabelGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLabelGroupRequest, CreateLabelGroupResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request) {

        return deleteDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInferenceSchedulerResult> deleteInferenceSchedulerAsync(DeleteInferenceSchedulerRequest request) {

        return deleteInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInferenceSchedulerResult> deleteInferenceSchedulerAsync(DeleteInferenceSchedulerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInferenceSchedulerRequest, DeleteInferenceSchedulerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelResult> deleteLabelAsync(DeleteLabelRequest request) {

        return deleteLabelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelResult> deleteLabelAsync(DeleteLabelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLabelRequest, DeleteLabelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelGroupResult> deleteLabelGroupAsync(DeleteLabelGroupRequest request) {

        return deleteLabelGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelGroupResult> deleteLabelGroupAsync(DeleteLabelGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLabelGroupRequest, DeleteLabelGroupResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeDataIngestionJobResult> describeDataIngestionJobAsync(DescribeDataIngestionJobRequest request) {

        return describeDataIngestionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataIngestionJobResult> describeDataIngestionJobAsync(DescribeDataIngestionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDataIngestionJobRequest, DescribeDataIngestionJobResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeInferenceSchedulerResult> describeInferenceSchedulerAsync(DescribeInferenceSchedulerRequest request) {

        return describeInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInferenceSchedulerResult> describeInferenceSchedulerAsync(DescribeInferenceSchedulerRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInferenceSchedulerRequest, DescribeInferenceSchedulerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLabelResult> describeLabelAsync(DescribeLabelRequest request) {

        return describeLabelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLabelResult> describeLabelAsync(DescribeLabelRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLabelRequest, DescribeLabelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLabelGroupResult> describeLabelGroupAsync(DescribeLabelGroupRequest request) {

        return describeLabelGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLabelGroupResult> describeLabelGroupAsync(DescribeLabelGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLabelGroupRequest, DescribeLabelGroupResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListDataIngestionJobsResult> listDataIngestionJobsAsync(ListDataIngestionJobsRequest request) {

        return listDataIngestionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataIngestionJobsResult> listDataIngestionJobsAsync(ListDataIngestionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataIngestionJobsRequest, ListDataIngestionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request) {

        return listDatasetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInferenceEventsResult> listInferenceEventsAsync(ListInferenceEventsRequest request) {

        return listInferenceEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInferenceEventsResult> listInferenceEventsAsync(ListInferenceEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInferenceEventsRequest, ListInferenceEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInferenceExecutionsResult> listInferenceExecutionsAsync(ListInferenceExecutionsRequest request) {

        return listInferenceExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInferenceExecutionsResult> listInferenceExecutionsAsync(ListInferenceExecutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInferenceExecutionsRequest, ListInferenceExecutionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInferenceSchedulersResult> listInferenceSchedulersAsync(ListInferenceSchedulersRequest request) {

        return listInferenceSchedulersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInferenceSchedulersResult> listInferenceSchedulersAsync(ListInferenceSchedulersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInferenceSchedulersRequest, ListInferenceSchedulersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLabelGroupsResult> listLabelGroupsAsync(ListLabelGroupsRequest request) {

        return listLabelGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLabelGroupsResult> listLabelGroupsAsync(ListLabelGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLabelGroupsRequest, ListLabelGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLabelsResult> listLabelsAsync(ListLabelsRequest request) {

        return listLabelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLabelsResult> listLabelsAsync(ListLabelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLabelsRequest, ListLabelsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListSensorStatisticsResult> listSensorStatisticsAsync(ListSensorStatisticsRequest request) {

        return listSensorStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSensorStatisticsResult> listSensorStatisticsAsync(ListSensorStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSensorStatisticsRequest, ListSensorStatisticsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartDataIngestionJobResult> startDataIngestionJobAsync(StartDataIngestionJobRequest request) {

        return startDataIngestionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataIngestionJobResult> startDataIngestionJobAsync(StartDataIngestionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDataIngestionJobRequest, StartDataIngestionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartInferenceSchedulerResult> startInferenceSchedulerAsync(StartInferenceSchedulerRequest request) {

        return startInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInferenceSchedulerResult> startInferenceSchedulerAsync(StartInferenceSchedulerRequest request,
            com.amazonaws.handlers.AsyncHandler<StartInferenceSchedulerRequest, StartInferenceSchedulerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopInferenceSchedulerResult> stopInferenceSchedulerAsync(StopInferenceSchedulerRequest request) {

        return stopInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInferenceSchedulerResult> stopInferenceSchedulerAsync(StopInferenceSchedulerRequest request,
            com.amazonaws.handlers.AsyncHandler<StopInferenceSchedulerRequest, StopInferenceSchedulerResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateInferenceSchedulerResult> updateInferenceSchedulerAsync(UpdateInferenceSchedulerRequest request) {

        return updateInferenceSchedulerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInferenceSchedulerResult> updateInferenceSchedulerAsync(UpdateInferenceSchedulerRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateInferenceSchedulerRequest, UpdateInferenceSchedulerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateLabelGroupResult> updateLabelGroupAsync(UpdateLabelGroupRequest request) {

        return updateLabelGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLabelGroupResult> updateLabelGroupAsync(UpdateLabelGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLabelGroupRequest, UpdateLabelGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

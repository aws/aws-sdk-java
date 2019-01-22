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
package com.amazonaws.services.applicationdiscovery;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;

/**
 * Abstract implementation of {@code AWSApplicationDiscoveryAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSApplicationDiscoveryAsync extends AbstractAWSApplicationDiscovery implements AWSApplicationDiscoveryAsync {

    protected AbstractAWSApplicationDiscoveryAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateConfigurationItemsToApplicationResult> associateConfigurationItemsToApplicationAsync(
            AssociateConfigurationItemsToApplicationRequest request) {

        return associateConfigurationItemsToApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateConfigurationItemsToApplicationResult> associateConfigurationItemsToApplicationAsync(
            AssociateConfigurationItemsToApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateConfigurationItemsToApplicationRequest, AssociateConfigurationItemsToApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteImportDataResult> batchDeleteImportDataAsync(BatchDeleteImportDataRequest request) {

        return batchDeleteImportDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteImportDataResult> batchDeleteImportDataAsync(BatchDeleteImportDataRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteImportDataRequest, BatchDeleteImportDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationsResult> deleteApplicationsAsync(DeleteApplicationsRequest request) {

        return deleteApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationsResult> deleteApplicationsAsync(DeleteApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationsRequest, DeleteApplicationsResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(DescribeAgentsRequest request) {

        return describeAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(DescribeAgentsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAgentsRequest, DescribeAgentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(DescribeConfigurationsRequest request) {

        return describeConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(DescribeConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationsRequest, DescribeConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeContinuousExportsResult> describeContinuousExportsAsync(DescribeContinuousExportsRequest request) {

        return describeContinuousExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContinuousExportsResult> describeContinuousExportsAsync(DescribeContinuousExportsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeContinuousExportsRequest, DescribeContinuousExportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(DescribeExportConfigurationsRequest request) {

        return describeExportConfigurationsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(DescribeExportConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeExportConfigurationsRequest, DescribeExportConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request) {

        return describeExportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeImportTasksResult> describeImportTasksAsync(DescribeImportTasksRequest request) {

        return describeImportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImportTasksResult> describeImportTasksAsync(DescribeImportTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeImportTasksRequest, DescribeImportTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateConfigurationItemsFromApplicationResult> disassociateConfigurationItemsFromApplicationAsync(
            DisassociateConfigurationItemsFromApplicationRequest request) {

        return disassociateConfigurationItemsFromApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConfigurationItemsFromApplicationResult> disassociateConfigurationItemsFromApplicationAsync(
            DisassociateConfigurationItemsFromApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateConfigurationItemsFromApplicationRequest, DisassociateConfigurationItemsFromApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(ExportConfigurationsRequest request) {

        return exportConfigurationsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(ExportConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportConfigurationsRequest, ExportConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDiscoverySummaryResult> getDiscoverySummaryAsync(GetDiscoverySummaryRequest request) {

        return getDiscoverySummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoverySummaryResult> getDiscoverySummaryAsync(GetDiscoverySummaryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDiscoverySummaryRequest, GetDiscoverySummaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request) {

        return listConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServerNeighborsResult> listServerNeighborsAsync(ListServerNeighborsRequest request) {

        return listServerNeighborsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServerNeighborsResult> listServerNeighborsAsync(ListServerNeighborsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServerNeighborsRequest, ListServerNeighborsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartContinuousExportResult> startContinuousExportAsync(StartContinuousExportRequest request) {

        return startContinuousExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContinuousExportResult> startContinuousExportAsync(StartContinuousExportRequest request,
            com.amazonaws.handlers.AsyncHandler<StartContinuousExportRequest, StartContinuousExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(StartDataCollectionByAgentIdsRequest request) {

        return startDataCollectionByAgentIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(StartDataCollectionByAgentIdsRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDataCollectionByAgentIdsRequest, StartDataCollectionByAgentIdsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartExportTaskResult> startExportTaskAsync(StartExportTaskRequest request) {

        return startExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExportTaskResult> startExportTaskAsync(StartExportTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<StartExportTaskRequest, StartExportTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartImportTaskResult> startImportTaskAsync(StartImportTaskRequest request) {

        return startImportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImportTaskResult> startImportTaskAsync(StartImportTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<StartImportTaskRequest, StartImportTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopContinuousExportResult> stopContinuousExportAsync(StopContinuousExportRequest request) {

        return stopContinuousExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopContinuousExportResult> stopContinuousExportAsync(StopContinuousExportRequest request,
            com.amazonaws.handlers.AsyncHandler<StopContinuousExportRequest, StopContinuousExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(StopDataCollectionByAgentIdsRequest request) {

        return stopDataCollectionByAgentIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(StopDataCollectionByAgentIdsRequest request,
            com.amazonaws.handlers.AsyncHandler<StopDataCollectionByAgentIdsRequest, StopDataCollectionByAgentIdsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

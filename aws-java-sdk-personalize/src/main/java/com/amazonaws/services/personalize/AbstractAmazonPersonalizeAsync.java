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
package com.amazonaws.services.personalize;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;

/**
 * Abstract implementation of {@code AmazonPersonalizeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonPersonalizeAsync extends AbstractAmazonPersonalize implements AmazonPersonalizeAsync {

    protected AbstractAmazonPersonalizeAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateBatchInferenceJobResult> createBatchInferenceJobAsync(CreateBatchInferenceJobRequest request) {

        return createBatchInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchInferenceJobResult> createBatchInferenceJobAsync(CreateBatchInferenceJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBatchInferenceJobRequest, CreateBatchInferenceJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBatchSegmentJobResult> createBatchSegmentJobAsync(CreateBatchSegmentJobRequest request) {

        return createBatchSegmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchSegmentJobResult> createBatchSegmentJobAsync(CreateBatchSegmentJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBatchSegmentJobRequest, CreateBatchSegmentJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest request) {

        return createCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<CreateDatasetExportJobResult> createDatasetExportJobAsync(CreateDatasetExportJobRequest request) {

        return createDatasetExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetExportJobResult> createDatasetExportJobAsync(CreateDatasetExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetExportJobRequest, CreateDatasetExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(CreateDatasetGroupRequest request) {

        return createDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(CreateDatasetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetGroupRequest, CreateDatasetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(CreateDatasetImportJobRequest request) {

        return createDatasetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(CreateDatasetImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetImportJobRequest, CreateDatasetImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEventTrackerResult> createEventTrackerAsync(CreateEventTrackerRequest request) {

        return createEventTrackerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventTrackerResult> createEventTrackerAsync(CreateEventTrackerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEventTrackerRequest, CreateEventTrackerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest request) {

        return createFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFilterRequest, CreateFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMetricAttributionResult> createMetricAttributionAsync(CreateMetricAttributionRequest request) {

        return createMetricAttributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMetricAttributionResult> createMetricAttributionAsync(CreateMetricAttributionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMetricAttributionRequest, CreateMetricAttributionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRecommenderResult> createRecommenderAsync(CreateRecommenderRequest request) {

        return createRecommenderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRecommenderResult> createRecommenderAsync(CreateRecommenderRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRecommenderRequest, CreateRecommenderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest request) {

        return createSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSchemaRequest, CreateSchemaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSolutionResult> createSolutionAsync(CreateSolutionRequest request) {

        return createSolutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSolutionResult> createSolutionAsync(CreateSolutionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSolutionRequest, CreateSolutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSolutionVersionResult> createSolutionVersionAsync(CreateSolutionVersionRequest request) {

        return createSolutionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSolutionVersionResult> createSolutionVersionAsync(CreateSolutionVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSolutionVersionRequest, CreateSolutionVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest request) {

        return deleteCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(DeleteDatasetGroupRequest request) {

        return deleteDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(DeleteDatasetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetGroupRequest, DeleteDatasetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEventTrackerResult> deleteEventTrackerAsync(DeleteEventTrackerRequest request) {

        return deleteEventTrackerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventTrackerResult> deleteEventTrackerAsync(DeleteEventTrackerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEventTrackerRequest, DeleteEventTrackerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest request) {

        return deleteFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFilterRequest, DeleteFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMetricAttributionResult> deleteMetricAttributionAsync(DeleteMetricAttributionRequest request) {

        return deleteMetricAttributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMetricAttributionResult> deleteMetricAttributionAsync(DeleteMetricAttributionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMetricAttributionRequest, DeleteMetricAttributionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRecommenderResult> deleteRecommenderAsync(DeleteRecommenderRequest request) {

        return deleteRecommenderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecommenderResult> deleteRecommenderAsync(DeleteRecommenderRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRecommenderRequest, DeleteRecommenderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest request) {

        return deleteSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSolutionResult> deleteSolutionAsync(DeleteSolutionRequest request) {

        return deleteSolutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSolutionResult> deleteSolutionAsync(DeleteSolutionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSolutionRequest, DeleteSolutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest request) {

        return describeAlgorithmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAlgorithmRequest, DescribeAlgorithmResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBatchInferenceJobResult> describeBatchInferenceJobAsync(DescribeBatchInferenceJobRequest request) {

        return describeBatchInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBatchInferenceJobResult> describeBatchInferenceJobAsync(DescribeBatchInferenceJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBatchInferenceJobRequest, DescribeBatchInferenceJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBatchSegmentJobResult> describeBatchSegmentJobAsync(DescribeBatchSegmentJobRequest request) {

        return describeBatchSegmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBatchSegmentJobResult> describeBatchSegmentJobAsync(DescribeBatchSegmentJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBatchSegmentJobRequest, DescribeBatchSegmentJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest request) {

        return describeCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCampaignRequest, DescribeCampaignResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeDatasetExportJobResult> describeDatasetExportJobAsync(DescribeDatasetExportJobRequest request) {

        return describeDatasetExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetExportJobResult> describeDatasetExportJobAsync(DescribeDatasetExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetExportJobRequest, DescribeDatasetExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(DescribeDatasetGroupRequest request) {

        return describeDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(DescribeDatasetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetGroupRequest, DescribeDatasetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(DescribeDatasetImportJobRequest request) {

        return describeDatasetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(DescribeDatasetImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetImportJobRequest, DescribeDatasetImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTrackerResult> describeEventTrackerAsync(DescribeEventTrackerRequest request) {

        return describeEventTrackerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTrackerResult> describeEventTrackerAsync(DescribeEventTrackerRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventTrackerRequest, DescribeEventTrackerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFeatureTransformationResult> describeFeatureTransformationAsync(DescribeFeatureTransformationRequest request) {

        return describeFeatureTransformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFeatureTransformationResult> describeFeatureTransformationAsync(DescribeFeatureTransformationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFeatureTransformationRequest, DescribeFeatureTransformationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFilterResult> describeFilterAsync(DescribeFilterRequest request) {

        return describeFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFilterResult> describeFilterAsync(DescribeFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFilterRequest, DescribeFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricAttributionResult> describeMetricAttributionAsync(DescribeMetricAttributionRequest request) {

        return describeMetricAttributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricAttributionResult> describeMetricAttributionAsync(DescribeMetricAttributionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricAttributionRequest, DescribeMetricAttributionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRecipeResult> describeRecipeAsync(DescribeRecipeRequest request) {

        return describeRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecipeResult> describeRecipeAsync(DescribeRecipeRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRecipeRequest, DescribeRecipeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommenderResult> describeRecommenderAsync(DescribeRecommenderRequest request) {

        return describeRecommenderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommenderResult> describeRecommenderAsync(DescribeRecommenderRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRecommenderRequest, DescribeRecommenderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(DescribeSchemaRequest request) {

        return describeSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(DescribeSchemaRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSchemaRequest, DescribeSchemaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSolutionResult> describeSolutionAsync(DescribeSolutionRequest request) {

        return describeSolutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSolutionResult> describeSolutionAsync(DescribeSolutionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSolutionRequest, DescribeSolutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSolutionVersionResult> describeSolutionVersionAsync(DescribeSolutionVersionRequest request) {

        return describeSolutionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSolutionVersionResult> describeSolutionVersionAsync(DescribeSolutionVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSolutionVersionRequest, DescribeSolutionVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSolutionMetricsResult> getSolutionMetricsAsync(GetSolutionMetricsRequest request) {

        return getSolutionMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolutionMetricsResult> getSolutionMetricsAsync(GetSolutionMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSolutionMetricsRequest, GetSolutionMetricsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBatchInferenceJobsResult> listBatchInferenceJobsAsync(ListBatchInferenceJobsRequest request) {

        return listBatchInferenceJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBatchInferenceJobsResult> listBatchInferenceJobsAsync(ListBatchInferenceJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBatchInferenceJobsRequest, ListBatchInferenceJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBatchSegmentJobsResult> listBatchSegmentJobsAsync(ListBatchSegmentJobsRequest request) {

        return listBatchSegmentJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBatchSegmentJobsResult> listBatchSegmentJobsAsync(ListBatchSegmentJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBatchSegmentJobsRequest, ListBatchSegmentJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest request) {

        return listCampaignsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCampaignsRequest, ListCampaignsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatasetExportJobsResult> listDatasetExportJobsAsync(ListDatasetExportJobsRequest request) {

        return listDatasetExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetExportJobsResult> listDatasetExportJobsAsync(ListDatasetExportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatasetExportJobsRequest, ListDatasetExportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(ListDatasetGroupsRequest request) {

        return listDatasetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(ListDatasetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatasetGroupsRequest, ListDatasetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(ListDatasetImportJobsRequest request) {

        return listDatasetImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(ListDatasetImportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatasetImportJobsRequest, ListDatasetImportJobsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListEventTrackersResult> listEventTrackersAsync(ListEventTrackersRequest request) {

        return listEventTrackersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventTrackersResult> listEventTrackersAsync(ListEventTrackersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventTrackersRequest, ListEventTrackersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest request) {

        return listFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFiltersRequest, ListFiltersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMetricAttributionMetricsResult> listMetricAttributionMetricsAsync(ListMetricAttributionMetricsRequest request) {

        return listMetricAttributionMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMetricAttributionMetricsResult> listMetricAttributionMetricsAsync(ListMetricAttributionMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMetricAttributionMetricsRequest, ListMetricAttributionMetricsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMetricAttributionsResult> listMetricAttributionsAsync(ListMetricAttributionsRequest request) {

        return listMetricAttributionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMetricAttributionsResult> listMetricAttributionsAsync(ListMetricAttributionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMetricAttributionsRequest, ListMetricAttributionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecipesResult> listRecipesAsync(ListRecipesRequest request) {

        return listRecipesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecipesResult> listRecipesAsync(ListRecipesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecipesRequest, ListRecipesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecommendersResult> listRecommendersAsync(ListRecommendersRequest request) {

        return listRecommendersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendersResult> listRecommendersAsync(ListRecommendersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecommendersRequest, ListRecommendersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest request) {

        return listSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSolutionVersionsResult> listSolutionVersionsAsync(ListSolutionVersionsRequest request) {

        return listSolutionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSolutionVersionsResult> listSolutionVersionsAsync(ListSolutionVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSolutionVersionsRequest, ListSolutionVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSolutionsResult> listSolutionsAsync(ListSolutionsRequest request) {

        return listSolutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSolutionsResult> listSolutionsAsync(ListSolutionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSolutionsRequest, ListSolutionsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartRecommenderResult> startRecommenderAsync(StartRecommenderRequest request) {

        return startRecommenderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRecommenderResult> startRecommenderAsync(StartRecommenderRequest request,
            com.amazonaws.handlers.AsyncHandler<StartRecommenderRequest, StartRecommenderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopRecommenderResult> stopRecommenderAsync(StopRecommenderRequest request) {

        return stopRecommenderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopRecommenderResult> stopRecommenderAsync(StopRecommenderRequest request,
            com.amazonaws.handlers.AsyncHandler<StopRecommenderRequest, StopRecommenderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopSolutionVersionCreationResult> stopSolutionVersionCreationAsync(StopSolutionVersionCreationRequest request) {

        return stopSolutionVersionCreationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopSolutionVersionCreationResult> stopSolutionVersionCreationAsync(StopSolutionVersionCreationRequest request,
            com.amazonaws.handlers.AsyncHandler<StopSolutionVersionCreationRequest, StopSolutionVersionCreationResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest request) {

        return updateCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMetricAttributionResult> updateMetricAttributionAsync(UpdateMetricAttributionRequest request) {

        return updateMetricAttributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMetricAttributionResult> updateMetricAttributionAsync(UpdateMetricAttributionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMetricAttributionRequest, UpdateMetricAttributionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRecommenderResult> updateRecommenderAsync(UpdateRecommenderRequest request) {

        return updateRecommenderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecommenderResult> updateRecommenderAsync(UpdateRecommenderRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRecommenderRequest, UpdateRecommenderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

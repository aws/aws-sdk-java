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
package com.amazonaws.services.forecast;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;

/**
 * Abstract implementation of {@code AmazonForecastAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonForecastAsync extends AbstractAmazonForecast implements AmazonForecastAsync {

    protected AbstractAmazonForecastAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAutoPredictorResult> createAutoPredictorAsync(CreateAutoPredictorRequest request) {

        return createAutoPredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAutoPredictorResult> createAutoPredictorAsync(CreateAutoPredictorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAutoPredictorRequest, CreateAutoPredictorResult> asyncHandler) {

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
    public java.util.concurrent.Future<CreateExplainabilityResult> createExplainabilityAsync(CreateExplainabilityRequest request) {

        return createExplainabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExplainabilityResult> createExplainabilityAsync(CreateExplainabilityRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateExplainabilityRequest, CreateExplainabilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateExplainabilityExportResult> createExplainabilityExportAsync(CreateExplainabilityExportRequest request) {

        return createExplainabilityExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExplainabilityExportResult> createExplainabilityExportAsync(CreateExplainabilityExportRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateExplainabilityExportRequest, CreateExplainabilityExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateForecastResult> createForecastAsync(CreateForecastRequest request) {

        return createForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateForecastResult> createForecastAsync(CreateForecastRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateForecastRequest, CreateForecastResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateForecastExportJobResult> createForecastExportJobAsync(CreateForecastExportJobRequest request) {

        return createForecastExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateForecastExportJobResult> createForecastExportJobAsync(CreateForecastExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateForecastExportJobRequest, CreateForecastExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest request) {

        return createMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMonitorRequest, CreateMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePredictorResult> createPredictorAsync(CreatePredictorRequest request) {

        return createPredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePredictorResult> createPredictorAsync(CreatePredictorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePredictorRequest, CreatePredictorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePredictorBacktestExportJobResult> createPredictorBacktestExportJobAsync(
            CreatePredictorBacktestExportJobRequest request) {

        return createPredictorBacktestExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePredictorBacktestExportJobResult> createPredictorBacktestExportJobAsync(
            CreatePredictorBacktestExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePredictorBacktestExportJobRequest, CreatePredictorBacktestExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfAnalysisResult> createWhatIfAnalysisAsync(CreateWhatIfAnalysisRequest request) {

        return createWhatIfAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfAnalysisResult> createWhatIfAnalysisAsync(CreateWhatIfAnalysisRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWhatIfAnalysisRequest, CreateWhatIfAnalysisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfForecastResult> createWhatIfForecastAsync(CreateWhatIfForecastRequest request) {

        return createWhatIfForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfForecastResult> createWhatIfForecastAsync(CreateWhatIfForecastRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWhatIfForecastRequest, CreateWhatIfForecastResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfForecastExportResult> createWhatIfForecastExportAsync(CreateWhatIfForecastExportRequest request) {

        return createWhatIfForecastExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWhatIfForecastExportResult> createWhatIfForecastExportAsync(CreateWhatIfForecastExportRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWhatIfForecastExportRequest, CreateWhatIfForecastExportResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteDatasetImportJobResult> deleteDatasetImportJobAsync(DeleteDatasetImportJobRequest request) {

        return deleteDatasetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetImportJobResult> deleteDatasetImportJobAsync(DeleteDatasetImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetImportJobRequest, DeleteDatasetImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteExplainabilityResult> deleteExplainabilityAsync(DeleteExplainabilityRequest request) {

        return deleteExplainabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExplainabilityResult> deleteExplainabilityAsync(DeleteExplainabilityRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteExplainabilityRequest, DeleteExplainabilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteExplainabilityExportResult> deleteExplainabilityExportAsync(DeleteExplainabilityExportRequest request) {

        return deleteExplainabilityExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExplainabilityExportResult> deleteExplainabilityExportAsync(DeleteExplainabilityExportRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteExplainabilityExportRequest, DeleteExplainabilityExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteForecastResult> deleteForecastAsync(DeleteForecastRequest request) {

        return deleteForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteForecastResult> deleteForecastAsync(DeleteForecastRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteForecastRequest, DeleteForecastResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteForecastExportJobResult> deleteForecastExportJobAsync(DeleteForecastExportJobRequest request) {

        return deleteForecastExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteForecastExportJobResult> deleteForecastExportJobAsync(DeleteForecastExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteForecastExportJobRequest, DeleteForecastExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest request) {

        return deleteMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePredictorResult> deletePredictorAsync(DeletePredictorRequest request) {

        return deletePredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePredictorResult> deletePredictorAsync(DeletePredictorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePredictorRequest, DeletePredictorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePredictorBacktestExportJobResult> deletePredictorBacktestExportJobAsync(
            DeletePredictorBacktestExportJobRequest request) {

        return deletePredictorBacktestExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePredictorBacktestExportJobResult> deletePredictorBacktestExportJobAsync(
            DeletePredictorBacktestExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePredictorBacktestExportJobRequest, DeletePredictorBacktestExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceTreeResult> deleteResourceTreeAsync(DeleteResourceTreeRequest request) {

        return deleteResourceTreeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceTreeResult> deleteResourceTreeAsync(DeleteResourceTreeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceTreeRequest, DeleteResourceTreeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfAnalysisResult> deleteWhatIfAnalysisAsync(DeleteWhatIfAnalysisRequest request) {

        return deleteWhatIfAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfAnalysisResult> deleteWhatIfAnalysisAsync(DeleteWhatIfAnalysisRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWhatIfAnalysisRequest, DeleteWhatIfAnalysisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfForecastResult> deleteWhatIfForecastAsync(DeleteWhatIfForecastRequest request) {

        return deleteWhatIfForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfForecastResult> deleteWhatIfForecastAsync(DeleteWhatIfForecastRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWhatIfForecastRequest, DeleteWhatIfForecastResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfForecastExportResult> deleteWhatIfForecastExportAsync(DeleteWhatIfForecastExportRequest request) {

        return deleteWhatIfForecastExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWhatIfForecastExportResult> deleteWhatIfForecastExportAsync(DeleteWhatIfForecastExportRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWhatIfForecastExportRequest, DeleteWhatIfForecastExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoPredictorResult> describeAutoPredictorAsync(DescribeAutoPredictorRequest request) {

        return describeAutoPredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoPredictorResult> describeAutoPredictorAsync(DescribeAutoPredictorRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoPredictorRequest, DescribeAutoPredictorResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeExplainabilityResult> describeExplainabilityAsync(DescribeExplainabilityRequest request) {

        return describeExplainabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExplainabilityResult> describeExplainabilityAsync(DescribeExplainabilityRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeExplainabilityRequest, DescribeExplainabilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeExplainabilityExportResult> describeExplainabilityExportAsync(DescribeExplainabilityExportRequest request) {

        return describeExplainabilityExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExplainabilityExportResult> describeExplainabilityExportAsync(DescribeExplainabilityExportRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeExplainabilityExportRequest, DescribeExplainabilityExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeForecastResult> describeForecastAsync(DescribeForecastRequest request) {

        return describeForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeForecastResult> describeForecastAsync(DescribeForecastRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeForecastRequest, DescribeForecastResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeForecastExportJobResult> describeForecastExportJobAsync(DescribeForecastExportJobRequest request) {

        return describeForecastExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeForecastExportJobResult> describeForecastExportJobAsync(DescribeForecastExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeForecastExportJobRequest, DescribeForecastExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMonitorResult> describeMonitorAsync(DescribeMonitorRequest request) {

        return describeMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMonitorResult> describeMonitorAsync(DescribeMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMonitorRequest, DescribeMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePredictorResult> describePredictorAsync(DescribePredictorRequest request) {

        return describePredictorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePredictorResult> describePredictorAsync(DescribePredictorRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePredictorRequest, DescribePredictorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePredictorBacktestExportJobResult> describePredictorBacktestExportJobAsync(
            DescribePredictorBacktestExportJobRequest request) {

        return describePredictorBacktestExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePredictorBacktestExportJobResult> describePredictorBacktestExportJobAsync(
            DescribePredictorBacktestExportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePredictorBacktestExportJobRequest, DescribePredictorBacktestExportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfAnalysisResult> describeWhatIfAnalysisAsync(DescribeWhatIfAnalysisRequest request) {

        return describeWhatIfAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfAnalysisResult> describeWhatIfAnalysisAsync(DescribeWhatIfAnalysisRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWhatIfAnalysisRequest, DescribeWhatIfAnalysisResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfForecastResult> describeWhatIfForecastAsync(DescribeWhatIfForecastRequest request) {

        return describeWhatIfForecastAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfForecastResult> describeWhatIfForecastAsync(DescribeWhatIfForecastRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWhatIfForecastRequest, DescribeWhatIfForecastResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfForecastExportResult> describeWhatIfForecastExportAsync(DescribeWhatIfForecastExportRequest request) {

        return describeWhatIfForecastExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWhatIfForecastExportResult> describeWhatIfForecastExportAsync(DescribeWhatIfForecastExportRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWhatIfForecastExportRequest, DescribeWhatIfForecastExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccuracyMetricsResult> getAccuracyMetricsAsync(GetAccuracyMetricsRequest request) {

        return getAccuracyMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccuracyMetricsResult> getAccuracyMetricsAsync(GetAccuracyMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccuracyMetricsRequest, GetAccuracyMetricsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListExplainabilitiesResult> listExplainabilitiesAsync(ListExplainabilitiesRequest request) {

        return listExplainabilitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExplainabilitiesResult> listExplainabilitiesAsync(ListExplainabilitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExplainabilitiesRequest, ListExplainabilitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListExplainabilityExportsResult> listExplainabilityExportsAsync(ListExplainabilityExportsRequest request) {

        return listExplainabilityExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExplainabilityExportsResult> listExplainabilityExportsAsync(ListExplainabilityExportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExplainabilityExportsRequest, ListExplainabilityExportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListForecastExportJobsResult> listForecastExportJobsAsync(ListForecastExportJobsRequest request) {

        return listForecastExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListForecastExportJobsResult> listForecastExportJobsAsync(ListForecastExportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListForecastExportJobsRequest, ListForecastExportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListForecastsResult> listForecastsAsync(ListForecastsRequest request) {

        return listForecastsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListForecastsResult> listForecastsAsync(ListForecastsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListForecastsRequest, ListForecastsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMonitorEvaluationsResult> listMonitorEvaluationsAsync(ListMonitorEvaluationsRequest request) {

        return listMonitorEvaluationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitorEvaluationsResult> listMonitorEvaluationsAsync(ListMonitorEvaluationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMonitorEvaluationsRequest, ListMonitorEvaluationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest request) {

        return listMonitorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMonitorsRequest, ListMonitorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPredictorBacktestExportJobsResult> listPredictorBacktestExportJobsAsync(
            ListPredictorBacktestExportJobsRequest request) {

        return listPredictorBacktestExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPredictorBacktestExportJobsResult> listPredictorBacktestExportJobsAsync(
            ListPredictorBacktestExportJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPredictorBacktestExportJobsRequest, ListPredictorBacktestExportJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPredictorsResult> listPredictorsAsync(ListPredictorsRequest request) {

        return listPredictorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPredictorsResult> listPredictorsAsync(ListPredictorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPredictorsRequest, ListPredictorsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListWhatIfAnalysesResult> listWhatIfAnalysesAsync(ListWhatIfAnalysesRequest request) {

        return listWhatIfAnalysesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfAnalysesResult> listWhatIfAnalysesAsync(ListWhatIfAnalysesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWhatIfAnalysesRequest, ListWhatIfAnalysesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfForecastExportsResult> listWhatIfForecastExportsAsync(ListWhatIfForecastExportsRequest request) {

        return listWhatIfForecastExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfForecastExportsResult> listWhatIfForecastExportsAsync(ListWhatIfForecastExportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWhatIfForecastExportsRequest, ListWhatIfForecastExportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfForecastsResult> listWhatIfForecastsAsync(ListWhatIfForecastsRequest request) {

        return listWhatIfForecastsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWhatIfForecastsResult> listWhatIfForecastsAsync(ListWhatIfForecastsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWhatIfForecastsRequest, ListWhatIfForecastsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResumeResourceResult> resumeResourceAsync(ResumeResourceRequest request) {

        return resumeResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeResourceResult> resumeResourceAsync(ResumeResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ResumeResourceRequest, ResumeResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopResourceResult> stopResourceAsync(StopResourceRequest request) {

        return stopResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopResourceResult> stopResourceAsync(StopResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<StopResourceRequest, StopResourceResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDatasetGroupResult> updateDatasetGroupAsync(UpdateDatasetGroupRequest request) {

        return updateDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetGroupResult> updateDatasetGroupAsync(UpdateDatasetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetGroupRequest, UpdateDatasetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

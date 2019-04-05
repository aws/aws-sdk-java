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
package com.amazonaws.services.machinelearning;

import javax.annotation.Generated;

import com.amazonaws.services.machinelearning.model.*;

/**
 * Abstract implementation of {@code AmazonMachineLearningAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonMachineLearningAsync extends AbstractAmazonMachineLearning implements AmazonMachineLearningAsync {

    protected AbstractAmazonMachineLearningAsync() {
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
    public java.util.concurrent.Future<CreateBatchPredictionResult> createBatchPredictionAsync(CreateBatchPredictionRequest request) {

        return createBatchPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchPredictionResult> createBatchPredictionAsync(CreateBatchPredictionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBatchPredictionRequest, CreateBatchPredictionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(CreateDataSourceFromRDSRequest request) {

        return createDataSourceFromRDSAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(CreateDataSourceFromRDSRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceFromRDSRequest, CreateDataSourceFromRDSResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(CreateDataSourceFromRedshiftRequest request) {

        return createDataSourceFromRedshiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(CreateDataSourceFromRedshiftRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceFromRedshiftRequest, CreateDataSourceFromRedshiftResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(CreateDataSourceFromS3Request request) {

        return createDataSourceFromS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(CreateDataSourceFromS3Request request,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceFromS3Request, CreateDataSourceFromS3Result> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEvaluationResult> createEvaluationAsync(CreateEvaluationRequest request) {

        return createEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEvaluationResult> createEvaluationAsync(CreateEvaluationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEvaluationRequest, CreateEvaluationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMLModelResult> createMLModelAsync(CreateMLModelRequest request) {

        return createMLModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMLModelResult> createMLModelAsync(CreateMLModelRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMLModelRequest, CreateMLModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(CreateRealtimeEndpointRequest request) {

        return createRealtimeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(CreateRealtimeEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRealtimeEndpointRequest, CreateRealtimeEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(DeleteBatchPredictionRequest request) {

        return deleteBatchPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(DeleteBatchPredictionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBatchPredictionRequest, DeleteBatchPredictionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest request) {

        return deleteDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEvaluationResult> deleteEvaluationAsync(DeleteEvaluationRequest request) {

        return deleteEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEvaluationResult> deleteEvaluationAsync(DeleteEvaluationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEvaluationRequest, DeleteEvaluationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMLModelResult> deleteMLModelAsync(DeleteMLModelRequest request) {

        return deleteMLModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMLModelResult> deleteMLModelAsync(DeleteMLModelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMLModelRequest, DeleteMLModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(DeleteRealtimeEndpointRequest request) {

        return deleteRealtimeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(DeleteRealtimeEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRealtimeEndpointRequest, DeleteRealtimeEndpointResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(DescribeBatchPredictionsRequest request) {

        return describeBatchPredictionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(DescribeBatchPredictionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBatchPredictionsRequest, DescribeBatchPredictionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeBatchPredictions operation.
     *
     * @see #describeBatchPredictionsAsync(DescribeBatchPredictionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync() {

        return describeBatchPredictionsAsync(new DescribeBatchPredictionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeBatchPredictions operation with an AsyncHandler.
     *
     * @see #describeBatchPredictionsAsync(DescribeBatchPredictionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeBatchPredictionsRequest, DescribeBatchPredictionsResult> asyncHandler) {

        return describeBatchPredictionsAsync(new DescribeBatchPredictionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync(DescribeDataSourcesRequest request) {

        return describeDataSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync(DescribeDataSourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDataSourcesRequest, DescribeDataSourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDataSources operation.
     *
     * @see #describeDataSourcesAsync(DescribeDataSourcesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync() {

        return describeDataSourcesAsync(new DescribeDataSourcesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDataSources operation with an AsyncHandler.
     *
     * @see #describeDataSourcesAsync(DescribeDataSourcesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDataSourcesRequest, DescribeDataSourcesResult> asyncHandler) {

        return describeDataSourcesAsync(new DescribeDataSourcesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync(DescribeEvaluationsRequest request) {

        return describeEvaluationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync(DescribeEvaluationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEvaluationsRequest, DescribeEvaluationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeEvaluations operation.
     *
     * @see #describeEvaluationsAsync(DescribeEvaluationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync() {

        return describeEvaluationsAsync(new DescribeEvaluationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEvaluations operation with an AsyncHandler.
     *
     * @see #describeEvaluationsAsync(DescribeEvaluationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEvaluationsRequest, DescribeEvaluationsResult> asyncHandler) {

        return describeEvaluationsAsync(new DescribeEvaluationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync(DescribeMLModelsRequest request) {

        return describeMLModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync(DescribeMLModelsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMLModelsRequest, DescribeMLModelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeMLModels operation.
     *
     * @see #describeMLModelsAsync(DescribeMLModelsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync() {

        return describeMLModelsAsync(new DescribeMLModelsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeMLModels operation with an AsyncHandler.
     *
     * @see #describeMLModelsAsync(DescribeMLModelsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMLModelsRequest, DescribeMLModelsResult> asyncHandler) {

        return describeMLModelsAsync(new DescribeMLModelsRequest(), asyncHandler);
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
    public java.util.concurrent.Future<GetBatchPredictionResult> getBatchPredictionAsync(GetBatchPredictionRequest request) {

        return getBatchPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBatchPredictionResult> getBatchPredictionAsync(GetBatchPredictionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBatchPredictionRequest, GetBatchPredictionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest request) {

        return getDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEvaluationResult> getEvaluationAsync(GetEvaluationRequest request) {

        return getEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvaluationResult> getEvaluationAsync(GetEvaluationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEvaluationRequest, GetEvaluationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMLModelResult> getMLModelAsync(GetMLModelRequest request) {

        return getMLModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLModelResult> getMLModelAsync(GetMLModelRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMLModelRequest, GetMLModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PredictResult> predictAsync(PredictRequest request) {

        return predictAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PredictResult> predictAsync(PredictRequest request,
            com.amazonaws.handlers.AsyncHandler<PredictRequest, PredictResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(UpdateBatchPredictionRequest request) {

        return updateBatchPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(UpdateBatchPredictionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateBatchPredictionRequest, UpdateBatchPredictionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest request) {

        return updateDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEvaluationResult> updateEvaluationAsync(UpdateEvaluationRequest request) {

        return updateEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEvaluationResult> updateEvaluationAsync(UpdateEvaluationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEvaluationRequest, UpdateEvaluationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMLModelResult> updateMLModelAsync(UpdateMLModelRequest request) {

        return updateMLModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMLModelResult> updateMLModelAsync(UpdateMLModelRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMLModelRequest, UpdateMLModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

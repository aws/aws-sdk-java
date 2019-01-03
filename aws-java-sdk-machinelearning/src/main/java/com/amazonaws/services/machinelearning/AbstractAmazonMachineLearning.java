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
import com.amazonaws.*;
import com.amazonaws.services.machinelearning.waiters.AmazonMachineLearningWaiters;

/**
 * Abstract implementation of {@code AmazonMachineLearning}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonMachineLearning implements AmazonMachineLearning {

    protected AbstractAmazonMachineLearning() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateBatchPredictionResult createBatchPrediction(CreateBatchPredictionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDataSourceFromRDSResult createDataSourceFromRDS(CreateDataSourceFromRDSRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDataSourceFromRedshiftResult createDataSourceFromRedshift(CreateDataSourceFromRedshiftRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDataSourceFromS3Result createDataSourceFromS3(CreateDataSourceFromS3Request request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateEvaluationResult createEvaluation(CreateEvaluationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateMLModelResult createMLModel(CreateMLModelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRealtimeEndpointResult createRealtimeEndpoint(CreateRealtimeEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBatchPredictionResult deleteBatchPrediction(DeleteBatchPredictionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteEvaluationResult deleteEvaluation(DeleteEvaluationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteMLModelResult deleteMLModel(DeleteMLModelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRealtimeEndpointResult deleteRealtimeEndpoint(DeleteRealtimeEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBatchPredictionsResult describeBatchPredictions(DescribeBatchPredictionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBatchPredictionsResult describeBatchPredictions() {
        return describeBatchPredictions(new DescribeBatchPredictionsRequest());
    }

    @Override
    public DescribeDataSourcesResult describeDataSources(DescribeDataSourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDataSourcesResult describeDataSources() {
        return describeDataSources(new DescribeDataSourcesRequest());
    }

    @Override
    public DescribeEvaluationsResult describeEvaluations(DescribeEvaluationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEvaluationsResult describeEvaluations() {
        return describeEvaluations(new DescribeEvaluationsRequest());
    }

    @Override
    public DescribeMLModelsResult describeMLModels(DescribeMLModelsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMLModelsResult describeMLModels() {
        return describeMLModels(new DescribeMLModelsRequest());
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBatchPredictionResult getBatchPrediction(GetBatchPredictionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDataSourceResult getDataSource(GetDataSourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetEvaluationResult getEvaluation(GetEvaluationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMLModelResult getMLModel(GetMLModelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PredictResult predict(PredictRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateBatchPredictionResult updateBatchPrediction(UpdateBatchPredictionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateEvaluationResult updateEvaluation(UpdateEvaluationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateMLModelResult updateMLModel(UpdateMLModelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AmazonMachineLearningWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}

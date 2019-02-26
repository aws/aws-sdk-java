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
package com.amazonaws.services.machinelearning.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.machinelearning.AmazonMachineLearning;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMachineLearningWaiters {

    /**
     * Represents the service client
     */
    private final AmazonMachineLearning client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonMachineLearningWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonMachineLearningWaiters(AmazonMachineLearning client) {
        this.client = client;
    }

    /**
     * Builds a BatchPredictionAvailable waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeBatchPredictionsRequest> batchPredictionAvailable() {

        return new WaiterBuilder<DescribeBatchPredictionsRequest, DescribeBatchPredictionsResult>()
                .withSdkFunction(new DescribeBatchPredictionsFunction(client))
                .withAcceptors(new BatchPredictionAvailable.IsCOMPLETEDMatcher(), new BatchPredictionAvailable.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a MLModelAvailable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeMLModelsRequest> mLModelAvailable() {

        return new WaiterBuilder<DescribeMLModelsRequest, DescribeMLModelsResult>().withSdkFunction(new DescribeMLModelsFunction(client))
                .withAcceptors(new MLModelAvailable.IsCOMPLETEDMatcher(), new MLModelAvailable.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a DataSourceAvailable waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeDataSourcesRequest> dataSourceAvailable() {

        return new WaiterBuilder<DescribeDataSourcesRequest, DescribeDataSourcesResult>().withSdkFunction(new DescribeDataSourcesFunction(client))
                .withAcceptors(new DataSourceAvailable.IsCOMPLETEDMatcher(), new DataSourceAvailable.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a EvaluationAvailable waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeEvaluationsRequest> evaluationAvailable() {

        return new WaiterBuilder<DescribeEvaluationsRequest, DescribeEvaluationsResult>().withSdkFunction(new DescribeEvaluationsFunction(client))
                .withAcceptors(new EvaluationAvailable.IsCOMPLETEDMatcher(), new EvaluationAvailable.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}

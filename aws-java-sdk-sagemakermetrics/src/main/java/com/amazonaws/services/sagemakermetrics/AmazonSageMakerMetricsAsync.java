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
package com.amazonaws.services.sagemakermetrics;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakermetrics.model.*;

/**
 * Interface for accessing SageMaker Metrics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakermetrics.AbstractAmazonSageMakerMetricsAsync} instead.
 * </p>
 * <p>
 * <p>
 * Contains all data plane API operations and data types for Amazon SageMaker Metrics. Use these APIs to put and
 * retrieve (get) features related to your training run.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_metrics_BatchPutMetrics.html">BatchPutMetrics</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSageMakerMetricsAsync extends AmazonSageMakerMetrics {

    /**
     * <p>
     * Used to ingest training metrics into SageMaker. These metrics can be visualized in SageMaker Studio and retrieved
     * with the <code>GetMetrics</code> API.
     * </p>
     * 
     * @param batchPutMetricsRequest
     * @return A Java Future containing the result of the BatchPutMetrics operation returned by the service.
     * @sample AmazonSageMakerMetricsAsync.BatchPutMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-metrics-2022-09-30/BatchPutMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutMetricsResult> batchPutMetricsAsync(BatchPutMetricsRequest batchPutMetricsRequest);

    /**
     * <p>
     * Used to ingest training metrics into SageMaker. These metrics can be visualized in SageMaker Studio and retrieved
     * with the <code>GetMetrics</code> API.
     * </p>
     * 
     * @param batchPutMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutMetrics operation returned by the service.
     * @sample AmazonSageMakerMetricsAsyncHandler.BatchPutMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-metrics-2022-09-30/BatchPutMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutMetricsResult> batchPutMetricsAsync(BatchPutMetricsRequest batchPutMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutMetricsRequest, BatchPutMetricsResult> asyncHandler);

}

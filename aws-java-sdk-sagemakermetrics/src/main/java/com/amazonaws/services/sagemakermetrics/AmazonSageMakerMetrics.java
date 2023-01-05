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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.sagemakermetrics.model.*;

/**
 * Interface for accessing SageMaker Metrics.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakermetrics.AbstractAmazonSageMakerMetrics} instead.
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
public interface AmazonSageMakerMetrics {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "metrics.sagemaker";

    /**
     * <p>
     * Used to ingest training metrics into SageMaker. These metrics can be visualized in SageMaker Studio and retrieved
     * with the <code>GetMetrics</code> API.
     * </p>
     * 
     * @param batchPutMetricsRequest
     * @return Result of the BatchPutMetrics operation returned by the service.
     * @sample AmazonSageMakerMetrics.BatchPutMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-metrics-2022-09-30/BatchPutMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    BatchPutMetricsResult batchPutMetrics(BatchPutMetricsRequest batchPutMetricsRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}

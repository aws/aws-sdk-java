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
package com.amazonaws.services.pi;

import javax.annotation.Generated;

import com.amazonaws.services.pi.model.*;

/**
 * Interface for accessing AWS PI asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pi.AbstractAWSPIAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Performance Insights enables you to monitor and explore different dimensions of database load based on data
 * captured from a running RDS instance. The guide provides detailed information about Performance Insights data types,
 * parameters and errors. For more information about Performance Insights capabilities see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon RDS Performance
 * Insights </a> in the <i>Amazon RDS User Guide</i>.
 * </p>
 * <p>
 * The AWS Performance Insights API provides visibility into the performance of your RDS instance, when Performance
 * Insights is enabled for supported engine types. While Amazon CloudWatch provides the authoritative source for AWS
 * service vended monitoring metrics, AWS Performance Insights offers a domain-specific view of database load measured
 * as Average Active Sessions and provided to API consumers as a 2-dimensional time-series dataset. The time dimension
 * of the data provides DB load data for each time point in the queried time range, and each time point decomposes
 * overall load in relation to the requested dimensions, such as SQL, Wait-event, User or Host, measured at that time
 * point.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPIAsync extends AWSPI {

    /**
     * <p>
     * For a specific time period, retrieve the top <code>N</code> dimension keys for a metric.
     * </p>
     * 
     * @param describeDimensionKeysRequest
     * @return A Java Future containing the result of the DescribeDimensionKeys operation returned by the service.
     * @sample AWSPIAsync.DescribeDimensionKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DescribeDimensionKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDimensionKeysResult> describeDimensionKeysAsync(DescribeDimensionKeysRequest describeDimensionKeysRequest);

    /**
     * <p>
     * For a specific time period, retrieve the top <code>N</code> dimension keys for a metric.
     * </p>
     * 
     * @param describeDimensionKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDimensionKeys operation returned by the service.
     * @sample AWSPIAsyncHandler.DescribeDimensionKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DescribeDimensionKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDimensionKeysResult> describeDimensionKeysAsync(DescribeDimensionKeysRequest describeDimensionKeysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDimensionKeysRequest, DescribeDimensionKeysResult> asyncHandler);

    /**
     * <p>
     * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific
     * dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
     * </p>
     * 
     * @param getResourceMetricsRequest
     * @return A Java Future containing the result of the GetResourceMetrics operation returned by the service.
     * @sample AWSPIAsync.GetResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceMetricsResult> getResourceMetricsAsync(GetResourceMetricsRequest getResourceMetricsRequest);

    /**
     * <p>
     * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific
     * dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
     * </p>
     * 
     * @param getResourceMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceMetrics operation returned by the service.
     * @sample AWSPIAsyncHandler.GetResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceMetricsResult> getResourceMetricsAsync(GetResourceMetricsRequest getResourceMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceMetricsRequest, GetResourceMetricsResult> asyncHandler);

}

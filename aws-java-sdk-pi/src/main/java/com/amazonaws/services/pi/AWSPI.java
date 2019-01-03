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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pi.model.*;

/**
 * Interface for accessing AWS PI.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pi.AbstractAWSPI} instead.
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
public interface AWSPI {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "pi";

    /**
     * <p>
     * For a specific time period, retrieve the top <code>N</code> dimension keys for a metric.
     * </p>
     * 
     * @param describeDimensionKeysRequest
     * @return Result of the DescribeDimensionKeys operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.DescribeDimensionKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DescribeDimensionKeys" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDimensionKeysResult describeDimensionKeys(DescribeDimensionKeysRequest describeDimensionKeysRequest);

    /**
     * <p>
     * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific
     * dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
     * </p>
     * 
     * @param getResourceMetricsRequest
     * @return Result of the GetResourceMetrics operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.GetResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourceMetricsResult getResourceMetrics(GetResourceMetricsRequest getResourceMetricsRequest);

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

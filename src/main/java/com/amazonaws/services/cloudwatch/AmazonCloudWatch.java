/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch;

import com.amazonaws.*;
import com.amazonaws.services.cloudwatch.model.*;

/**
 * Interface for accessing AmazonCloudWatch.
 * 
 */
public interface AmazonCloudWatch {

    /**
     * Overrides the default endpoint for this client ("https://monitoring.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
    /**
     *
     * @param listMetricsRequest Container for the necessary parameters to
     *           execute the ListMetrics service method on AmazonCloudWatch.
     * 
     * @return The response from the ListMetrics service method, as returned
     *         by AmazonCloudWatch.
     * 
     * @throws InvalidParameterValueException
     * @throws InternalServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param getMetricStatisticsRequest Container for the necessary
     *           parameters to execute the GetMetricStatistics service method on
     *           AmazonCloudWatch.
     * 
     * @return The response from the GetMetricStatistics service method, as
     *         returned by AmazonCloudWatch.
     * 
     * @throws InvalidParameterValueException
     * @throws InternalServiceException
     * @throws InvalidParameterCombinationException
     * @throws MissingRequiredParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetMetricStatisticsResult getMetricStatistics(GetMetricStatisticsRequest getMetricStatisticsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * 
     * @return The response from the ListMetrics service method, as returned
     *         by AmazonCloudWatch.
     * 
     * @throws InvalidParameterValueException
     * @throws InternalServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListMetricsResult listMetrics() throws AmazonServiceException, AmazonClientException;
    
}
        
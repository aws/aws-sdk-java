/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.cloudwatch.model.*;

/**
 * Interface for accessing AmazonCloudWatch asynchronously,
 * using Java Futures.
 *  
 */       
public interface AmazonCloudWatchAsync extends AmazonCloudWatch {
    /**
     *
     * @param listMetricsRequest Container for the necessary parameters to
     *           execute the ListMetrics operation on AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         ListMetrics service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListMetricsResult> listMetricsAsync(ListMetricsRequest listMetricsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param getMetricStatisticsRequest Container for the necessary
     *           parameters to execute the GetMetricStatistics operation on
     *           AmazonCloudWatch.
     * 
     * @return A Java Future object containing the response from the
     *         GetMetricStatistics service method, as returned by AmazonCloudWatch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudWatch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetMetricStatisticsResult> getMetricStatisticsAsync(GetMetricStatisticsRequest getMetricStatisticsRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        
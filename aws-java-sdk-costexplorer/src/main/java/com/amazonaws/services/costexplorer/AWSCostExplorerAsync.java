/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;

/**
 * Interface for accessing AWS Cost Explorer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.costexplorer.AbstractAWSCostExplorerAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Cost Explorer API allows you to programmatically query your cost and usage data. You can query for aggregated
 * data such as total monthly costs or total daily usage. You can also query for granular data, such as the number of
 * daily write operations for DynamoDB database tables in your production environment.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The Cost Explorer API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://ce.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCostExplorerAsync extends AWSCostExplorer {

    /**
     * <p>
     * Retrieve cost and usage metrics for your account. You can specify which cost and usage-related metric, such as
     * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You can also filter
     * and group your data by various dimensions, such as <code>AWS Service</code> or <code>AvailabilityZone</code>, in
     * a specific time range. See the <code>GetDimensionValues</code> action for a complete list of the valid
     * dimensions. Master accounts in an organization have access to all member accounts.
     * </p>
     * 
     * @param getCostAndUsageRequest
     * @return A Java Future containing the result of the GetCostAndUsage operation returned by the service.
     * @sample AWSCostExplorerAsync.GetCostAndUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCostAndUsageResult> getCostAndUsageAsync(GetCostAndUsageRequest getCostAndUsageRequest);

    /**
     * <p>
     * Retrieve cost and usage metrics for your account. You can specify which cost and usage-related metric, such as
     * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You can also filter
     * and group your data by various dimensions, such as <code>AWS Service</code> or <code>AvailabilityZone</code>, in
     * a specific time range. See the <code>GetDimensionValues</code> action for a complete list of the valid
     * dimensions. Master accounts in an organization have access to all member accounts.
     * </p>
     * 
     * @param getCostAndUsageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCostAndUsage operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetCostAndUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCostAndUsageResult> getCostAndUsageAsync(GetCostAndUsageRequest getCostAndUsageRequest,
            com.amazonaws.handlers.AsyncHandler<GetCostAndUsageRequest, GetCostAndUsageResult> asyncHandler);

    /**
     * <p>
     * You can use <code>GetDimensionValues</code> to retrieve all available filter values for a specific filter over a
     * period of time. You can search the dimension values for an arbitrary string.
     * </p>
     * 
     * @param getDimensionValuesRequest
     * @return A Java Future containing the result of the GetDimensionValues operation returned by the service.
     * @sample AWSCostExplorerAsync.GetDimensionValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetDimensionValues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDimensionValuesResult> getDimensionValuesAsync(GetDimensionValuesRequest getDimensionValuesRequest);

    /**
     * <p>
     * You can use <code>GetDimensionValues</code> to retrieve all available filter values for a specific filter over a
     * period of time. You can search the dimension values for an arbitrary string.
     * </p>
     * 
     * @param getDimensionValuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDimensionValues operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetDimensionValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetDimensionValues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDimensionValuesResult> getDimensionValuesAsync(GetDimensionValuesRequest getDimensionValuesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDimensionValuesRequest, GetDimensionValuesResult> asyncHandler);

    /**
     * <p>
     * You can retrieve the Reservation utilization for your account. Master accounts in an organization have access to
     * their associated member accounts. You can filter data by dimensions in a time period. You can use
     * <code>GetDimensionValues</code> to determine the possible dimension values. Currently, you can group only by
     * <code>SUBSCRIPTION_ID</code>.
     * </p>
     * 
     * @param getReservationUtilizationRequest
     * @return A Java Future containing the result of the GetReservationUtilization operation returned by the service.
     * @sample AWSCostExplorerAsync.GetReservationUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationUtilization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetReservationUtilizationResult> getReservationUtilizationAsync(
            GetReservationUtilizationRequest getReservationUtilizationRequest);

    /**
     * <p>
     * You can retrieve the Reservation utilization for your account. Master accounts in an organization have access to
     * their associated member accounts. You can filter data by dimensions in a time period. You can use
     * <code>GetDimensionValues</code> to determine the possible dimension values. Currently, you can group only by
     * <code>SUBSCRIPTION_ID</code>.
     * </p>
     * 
     * @param getReservationUtilizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReservationUtilization operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetReservationUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationUtilization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetReservationUtilizationResult> getReservationUtilizationAsync(
            GetReservationUtilizationRequest getReservationUtilizationRequest,
            com.amazonaws.handlers.AsyncHandler<GetReservationUtilizationRequest, GetReservationUtilizationResult> asyncHandler);

    /**
     * <p>
     * You can query for available tag keys and tag values for a specified period. You can search the tag values for an
     * arbitrary string.
     * </p>
     * 
     * @param getTagsRequest
     * @return A Java Future containing the result of the GetTags operation returned by the service.
     * @sample AWSCostExplorerAsync.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * You can query for available tag keys and tag values for a specified period. You can search the tag values for an
     * arbitrary string.
     * </p>
     * 
     * @param getTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTags operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest getTagsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler);

}

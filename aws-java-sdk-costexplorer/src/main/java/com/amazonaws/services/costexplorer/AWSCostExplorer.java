/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.costexplorer.model.*;

/**
 * Interface for accessing AWS Cost Explorer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.costexplorer.AbstractAWSCostExplorer} instead.
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
public interface AWSCostExplorer {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ce";

    /**
     * <p>
     * Retrieve cost and usage metrics for your account. You can specify which cost and usage-related metric, such as
     * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You can also filter
     * and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a specific time
     * range. See the <code>GetDimensionValues</code> action for a complete list of the valid dimensions. Master
     * accounts in an organization have access to all member accounts.
     * </p>
     * 
     * @param getCostAndUsageRequest
     * @return Result of the GetCostAndUsage operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetCostAndUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsage" target="_top">AWS API
     *      Documentation</a>
     */
    GetCostAndUsageResult getCostAndUsage(GetCostAndUsageRequest getCostAndUsageRequest);

    /**
     * <p>
     * You can use <code>GetDimensionValues</code> to retrieve all available filter values for a specific filter over a
     * period of time. You can search the dimension values for an arbitrary string.
     * </p>
     * 
     * @param getDimensionValuesRequest
     * @return Result of the GetDimensionValues operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetDimensionValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetDimensionValues" target="_top">AWS API
     *      Documentation</a>
     */
    GetDimensionValuesResult getDimensionValues(GetDimensionValuesRequest getDimensionValuesRequest);

    /**
     * <p>
     * Retrieve the reservation coverage for your account. An organization's master account has access to the associated
     * member accounts. For any time period, you can filter data about reservation usage by the following dimensions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * To determine valid values for a dimension, use the <code>GetDimensionValues</code> operation.
     * </p>
     * 
     * @param getReservationCoverageRequest
     *        You can query for how much of your instance usage was covered by a reservation.
     * @return Result of the GetReservationCoverage operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetReservationCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    GetReservationCoverageResult getReservationCoverage(GetReservationCoverageRequest getReservationCoverageRequest);

    /**
     * <p>
     * You can retrieve the Reservation utilization for your account. Master accounts in an organization have access to
     * their associated member accounts. You can filter data by dimensions in a time period. You can use
     * <code>GetDimensionValues</code> to determine the possible dimension values. Currently, you can group only by
     * <code>SUBSCRIPTION_ID</code>.
     * </p>
     * 
     * @param getReservationUtilizationRequest
     * @return Result of the GetReservationUtilization operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetReservationUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationUtilization" target="_top">AWS
     *      API Documentation</a>
     */
    GetReservationUtilizationResult getReservationUtilization(GetReservationUtilizationRequest getReservationUtilizationRequest);

    /**
     * <p>
     * You can query for available tag keys and tag values for a specified period. You can search the tag values for an
     * arbitrary string.
     * </p>
     * 
     * @param getTagsRequest
     * @return Result of the GetTags operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest);

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

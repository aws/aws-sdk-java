/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * You can use the Cost Explorer API to programmatically query your cost and usage data. You can query for aggregated
 * data such as total monthly costs or total daily usage. You can also query for granular data. This might include the
 * number of daily write operations for Amazon DynamoDB database tables in your production environment.
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
 * <code>https://ce.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about the costs that are associated with the Cost Explorer API, see <a
 * href="http://aws.amazon.com/aws-cost-management/pricing/">Amazon Web Services Cost Management Pricing</a>.
 * </p>
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
     * Creates a new cost anomaly detection monitor with the requested type and monitor specification.
     * </p>
     * 
     * @param createAnomalyMonitorRequest
     * @return Result of the CreateAnomalyMonitor operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.CreateAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAnomalyMonitorResult createAnomalyMonitor(CreateAnomalyMonitorRequest createAnomalyMonitorRequest);

    /**
     * <p>
     * Adds an alert subscription to a cost anomaly detection monitor. You can use each subscription to define
     * subscribers with email or SNS notifications. Email subscribers can set an absolute or percentage threshold and a
     * time frequency for receiving notifications.
     * </p>
     * 
     * @param createAnomalySubscriptionRequest
     * @return Result of the CreateAnomalySubscription operation returned by the service.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.CreateAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAnomalySubscriptionResult createAnomalySubscription(CreateAnomalySubscriptionRequest createAnomalySubscriptionRequest);

    /**
     * <p>
     * Creates a new Cost Category with the requested name and rules.
     * </p>
     * 
     * @param createCostCategoryDefinitionRequest
     * @return Result of the CreateCostCategoryDefinition operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You've reached the limit on the number of resources you can create, or exceeded the size of an individual
     *         resource.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.CreateCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCostCategoryDefinitionResult createCostCategoryDefinition(CreateCostCategoryDefinitionRequest createCostCategoryDefinitionRequest);

    /**
     * <p>
     * Deletes a cost anomaly monitor.
     * </p>
     * 
     * @param deleteAnomalyMonitorRequest
     * @return Result of the DeleteAnomalyMonitor operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @sample AWSCostExplorer.DeleteAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAnomalyMonitorResult deleteAnomalyMonitor(DeleteAnomalyMonitorRequest deleteAnomalyMonitorRequest);

    /**
     * <p>
     * Deletes a cost anomaly subscription.
     * </p>
     * 
     * @param deleteAnomalySubscriptionRequest
     * @return Result of the DeleteAnomalySubscription operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownSubscriptionException
     *         The cost anomaly subscription does not exist for the account.
     * @sample AWSCostExplorer.DeleteAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAnomalySubscriptionResult deleteAnomalySubscription(DeleteAnomalySubscriptionRequest deleteAnomalySubscriptionRequest);

    /**
     * <p>
     * Deletes a Cost Category. Expenses from this month going forward will no longer be categorized with this Cost
     * Category.
     * </p>
     * 
     * @param deleteCostCategoryDefinitionRequest
     * @return Result of the DeleteCostCategoryDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.DeleteCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCostCategoryDefinitionResult deleteCostCategoryDefinition(DeleteCostCategoryDefinitionRequest deleteCostCategoryDefinitionRequest);

    /**
     * <p>
     * Returns the name, Amazon Resource Name (ARN), rules, definition, and effective dates of a Cost Category that's
     * defined in the account.
     * </p>
     * <p>
     * You have the option to use <code>EffectiveOn</code> to return a Cost Category that's active on a specific date.
     * If there's no <code>EffectiveOn</code> specified, you see a Cost Category that's effective on the current date.
     * If Cost Category is still effective, <code>EffectiveEnd</code> is omitted in the response.
     * </p>
     * 
     * @param describeCostCategoryDefinitionRequest
     * @return Result of the DescribeCostCategoryDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.DescribeCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DescribeCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCostCategoryDefinitionResult describeCostCategoryDefinition(DescribeCostCategoryDefinitionRequest describeCostCategoryDefinitionRequest);

    /**
     * <p>
     * Retrieves all of the cost anomalies detected on your account during the time period that's specified by the
     * <code>DateInterval</code> object. Anomalies are available for up to 90 days.
     * </p>
     * 
     * @param getAnomaliesRequest
     * @return Result of the GetAnomalies operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetAnomalies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalies" target="_top">AWS API
     *      Documentation</a>
     */
    GetAnomaliesResult getAnomalies(GetAnomaliesRequest getAnomaliesRequest);

    /**
     * <p>
     * Retrieves the cost anomaly monitor definitions for your account. You can filter using a list of cost anomaly
     * monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param getAnomalyMonitorsRequest
     * @return Result of the GetAnomalyMonitors operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetAnomalyMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalyMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    GetAnomalyMonitorsResult getAnomalyMonitors(GetAnomalyMonitorsRequest getAnomalyMonitorsRequest);

    /**
     * <p>
     * Retrieves the cost anomaly subscription objects for your account. You can filter using a list of cost anomaly
     * monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param getAnomalySubscriptionsRequest
     * @return Result of the GetAnomalySubscriptions operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownSubscriptionException
     *         The cost anomaly subscription does not exist for the account.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetAnomalySubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalySubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    GetAnomalySubscriptionsResult getAnomalySubscriptions(GetAnomalySubscriptionsRequest getAnomalySubscriptionsRequest);

    /**
     * <p>
     * Retrieves estimated usage records for hourly granularity or resource-level data at daily granularity.
     * </p>
     * 
     * @param getApproximateUsageRecordsRequest
     * @return Result of the GetApproximateUsageRecords operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.GetApproximateUsageRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetApproximateUsageRecords" target="_top">AWS
     *      API Documentation</a>
     */
    GetApproximateUsageRecordsResult getApproximateUsageRecords(GetApproximateUsageRecordsRequest getApproximateUsageRecordsRequest);

    /**
     * <p>
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric that you
     * want the request to return. For example, you can specify <code>BlendedCosts</code> or <code>UsageQuantity</code>.
     * You can also filter and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>,
     * in a specific time range. For a complete list of valid dimensions, see the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Management account in an organization in Organizations have access to all
     * member accounts.
     * </p>
     * <p>
     * For information about filter limitations, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-limits.html">Quotas and
     * restrictions</a> in the <i>Billing and Cost Management User Guide</i>.
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
     * @throws RequestChangedException
     *         Your request parameters changed between pages. Try again with the old parameters or without a pagination
     *         token.
     * @sample AWSCostExplorer.GetCostAndUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsage" target="_top">AWS API
     *      Documentation</a>
     */
    GetCostAndUsageResult getCostAndUsage(GetCostAndUsageRequest getCostAndUsageRequest);

    /**
     * <p>
     * Retrieves cost and usage metrics with resources for your account. You can specify which cost and usage-related
     * metric, such as <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You
     * can also filter and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a
     * specific time range. For a complete list of valid dimensions, see the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Management account in an organization in Organizations have access to all
     * member accounts.
     * </p>
     * <p>
     * Hourly granularity is only available for EC2-Instances (Elastic Compute Cloud) resource-level data. All other
     * resource-level data is available at daily granularity.
     * </p>
     * <note>
     * <p>
     * This is an opt-in only feature. You can enable this feature from the Cost Explorer Settings page. For information
     * about how to access the Settings page, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-access.html">Controlling Access for Cost
     * Explorer</a> in the <i>Billing and Cost Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getCostAndUsageWithResourcesRequest
     * @return Result of the GetCostAndUsageWithResources operation returned by the service.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws RequestChangedException
     *         Your request parameters changed between pages. Try again with the old parameters or without a pagination
     *         token.
     * @sample AWSCostExplorer.GetCostAndUsageWithResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsageWithResources"
     *      target="_top">AWS API Documentation</a>
     */
    GetCostAndUsageWithResourcesResult getCostAndUsageWithResources(GetCostAndUsageWithResourcesRequest getCostAndUsageWithResourcesRequest);

    /**
     * <p>
     * Retrieves an array of Cost Category names and values incurred cost.
     * </p>
     * <note>
     * <p>
     * If some Cost Category names and values are not associated with any cost, they will not be returned by this API.
     * </p>
     * </note>
     * 
     * @param getCostCategoriesRequest
     * @return Result of the GetCostCategories operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws RequestChangedException
     *         Your request parameters changed between pages. Try again with the old parameters or without a pagination
     *         token.
     * @sample AWSCostExplorer.GetCostCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostCategories" target="_top">AWS API
     *      Documentation</a>
     */
    GetCostCategoriesResult getCostCategories(GetCostCategoriesRequest getCostCategoriesRequest);

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period
     * that you select, based on your past costs.
     * </p>
     * 
     * @param getCostForecastRequest
     * @return Result of the GetCostForecast operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.GetCostForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostForecast" target="_top">AWS API
     *      Documentation</a>
     */
    GetCostForecastResult getCostForecast(GetCostForecastRequest getCostForecastRequest);

    /**
     * <p>
     * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension
     * values for an arbitrary string.
     * </p>
     * 
     * @param getDimensionValuesRequest
     * @return Result of the GetDimensionValues operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws RequestChangedException
     *         Your request parameters changed between pages. Try again with the old parameters or without a pagination
     *         token.
     * @sample AWSCostExplorer.GetDimensionValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetDimensionValues" target="_top">AWS API
     *      Documentation</a>
     */
    GetDimensionValuesResult getDimensionValues(GetDimensionValuesRequest getDimensionValuesRequest);

    /**
     * <p>
     * Retrieves the reservation coverage for your account, which you can use to see how much of your Amazon Elastic
     * Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a
     * reservation. An organization's management account can see the coverage of the associated member accounts. This
     * supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data about
     * reservation usage by the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION
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
     * OPERATING_SYSTEM
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
     * SERVICE
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG
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
     *        You can use the following request parameters to query for how much of your instance usage a reservation
     *        covered.
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
     * Gets recommendations for reservation purchases. These recommendations might help you to reduce your costs.
     * Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing.
     * </p>
     * <p>
     * Amazon Web Services generates your recommendations by identifying your On-Demand usage during a specific time
     * period and collecting your usage into categories that are eligible for a reservation. After Amazon Web Services
     * has these categories, it simulates every combination of reservations in each category of usage to identify the
     * best number of each type of Reserved Instance (RI) to purchase to maximize your estimated savings.
     * </p>
     * <p>
     * For example, Amazon Web Services automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family
     * usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to
     * the c4 family usage. Amazon Web Services recommends the smallest size instance in an instance family. This makes
     * it easier to purchase a size-flexible Reserved Instance (RI). Amazon Web Services also shows the equal number of
     * normalized units. This way, you can purchase any instance size that you want. For this example, your RI
     * recommendation is for <code>c4.large</code> because that is the smallest size instance in the c4 instance family.
     * </p>
     * 
     * @param getReservationPurchaseRecommendationRequest
     * @return Result of the GetReservationPurchaseRecommendation operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetReservationPurchaseRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationPurchaseRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    GetReservationPurchaseRecommendationResult getReservationPurchaseRecommendation(
            GetReservationPurchaseRecommendationRequest getReservationPurchaseRecommendationRequest);

    /**
     * <p>
     * Retrieves the reservation utilization for your account. Management account in an organization have access to
     * member accounts. You can filter data by dimensions in a time period. You can use <code>GetDimensionValues</code>
     * to determine the possible dimension values. Currently, you can group only by <code>SUBSCRIPTION_ID</code>.
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
     * Creates recommendations that help you save cost by identifying idle and underutilized Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are generated to either downsize or terminate instances, along with providing savings detail and
     * metrics. For more information about calculation and function, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-rightsizing.html">Optimizing Your Cost with
     * Rightsizing Recommendations</a> in the <i>Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param getRightsizingRecommendationRequest
     * @return Result of the GetRightsizingRecommendation operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetRightsizingRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetRightsizingRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    GetRightsizingRecommendationResult getRightsizingRecommendation(GetRightsizingRecommendationRequest getRightsizingRecommendationRequest);

    /**
     * <p>
     * Retrieves the details for a Savings Plan recommendation. These details include the hourly data-points that
     * construct the cost, coverage, and utilization charts.
     * </p>
     * 
     * @param getSavingsPlanPurchaseRecommendationDetailsRequest
     * @return Result of the GetSavingsPlanPurchaseRecommendationDetails operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.GetSavingsPlanPurchaseRecommendationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlanPurchaseRecommendationDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetSavingsPlanPurchaseRecommendationDetailsResult getSavingsPlanPurchaseRecommendationDetails(
            GetSavingsPlanPurchaseRecommendationDetailsRequest getSavingsPlanPurchaseRecommendationDetailsRequest);

    /**
     * <p>
     * Retrieves the Savings Plans covered for your account. This enables you to see how much of your cost is covered by
     * a Savings Plan. An organization’s management account can see the coverage of the associated member accounts. This
     * supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data for
     * Savings Plans usage with the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To determine valid values for a dimension, use the <code>GetDimensionValues</code> operation.
     * </p>
     * 
     * @param getSavingsPlansCoverageRequest
     * @return Result of the GetSavingsPlansCoverage operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetSavingsPlansCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    GetSavingsPlansCoverageResult getSavingsPlansCoverage(GetSavingsPlansCoverageRequest getSavingsPlansCoverageRequest);

    /**
     * <p>
     * Retrieves the Savings Plans recommendations for your account. First use
     * <code>StartSavingsPlansPurchaseRecommendationGeneration</code> to generate a new set of recommendations, and then
     * use <code>GetSavingsPlansPurchaseRecommendation</code> to retrieve them.
     * </p>
     * 
     * @param getSavingsPlansPurchaseRecommendationRequest
     * @return Result of the GetSavingsPlansPurchaseRecommendation operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetSavingsPlansPurchaseRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansPurchaseRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    GetSavingsPlansPurchaseRecommendationResult getSavingsPlansPurchaseRecommendation(
            GetSavingsPlansPurchaseRecommendationRequest getSavingsPlansPurchaseRecommendationRequest);

    /**
     * <p>
     * Retrieves the Savings Plans utilization for your account across date ranges with daily or monthly granularity.
     * Management account in an organization have access to member accounts. You can use <code>GetDimensionValues</code>
     * in <code>SAVINGS_PLANS</code> to determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * You can't group by any dimension values for <code>GetSavingsPlansUtilization</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationRequest
     * @return Result of the GetSavingsPlansUtilization operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.GetSavingsPlansUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilization" target="_top">AWS
     *      API Documentation</a>
     */
    GetSavingsPlansUtilizationResult getSavingsPlansUtilization(GetSavingsPlansUtilizationRequest getSavingsPlansUtilizationRequest);

    /**
     * <p>
     * Retrieves attribute data along with aggregate utilization and savings data for a given time period. This doesn't
     * support granular or grouped data (daily/monthly) in response. You can't retrieve data by dates in a single
     * response similar to <code>GetSavingsPlanUtilization</code>, but you have the option to make multiple calls to
     * <code>GetSavingsPlanUtilizationDetails</code> by providing individual dates. You can use
     * <code>GetDimensionValues</code> in <code>SAVINGS_PLANS</code> to determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * <code>GetSavingsPlanUtilizationDetails</code> internally groups data by <code>SavingsPlansArn</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationDetailsRequest
     * @return Result of the GetSavingsPlansUtilizationDetails operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetSavingsPlansUtilizationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilizationDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetSavingsPlansUtilizationDetailsResult getSavingsPlansUtilizationDetails(GetSavingsPlansUtilizationDetailsRequest getSavingsPlansUtilizationDetailsRequest);

    /**
     * <p>
     * Queries for available tag keys and tag values for a specified period. You can search the tag values for an
     * arbitrary string.
     * </p>
     * 
     * @param getTagsRequest
     * @return Result of the GetTags operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws RequestChangedException
     *         Your request parameters changed between pages. Try again with the old parameters or without a pagination
     *         token.
     * @sample AWSCostExplorer.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period
     * that you select, based on your past usage.
     * </p>
     * 
     * @param getUsageForecastRequest
     * @return Result of the GetUsageForecast operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws UnresolvableUsageUnitException
     *         Cost Explorer was unable to identify the usage unit. Provide <code>UsageType/UsageTypeGroup</code> filter
     *         selections that contain matching units, for example: <code>hours</code>.
     * @sample AWSCostExplorer.GetUsageForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetUsageForecast" target="_top">AWS API
     *      Documentation</a>
     */
    GetUsageForecastResult getUsageForecast(GetUsageForecastRequest getUsageForecastRequest);

    /**
     * <p>
     * Retrieves a list of your historical cost allocation tag backfill requests.
     * </p>
     * 
     * @param listCostAllocationTagBackfillHistoryRequest
     * @return Result of the ListCostAllocationTagBackfillHistory operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.ListCostAllocationTagBackfillHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostAllocationTagBackfillHistory"
     *      target="_top">AWS API Documentation</a>
     */
    ListCostAllocationTagBackfillHistoryResult listCostAllocationTagBackfillHistory(
            ListCostAllocationTagBackfillHistoryRequest listCostAllocationTagBackfillHistoryRequest);

    /**
     * <p>
     * Get a list of cost allocation tags. All inputs in the API are optional and serve as filters. By default, all cost
     * allocation tags are returned.
     * </p>
     * 
     * @param listCostAllocationTagsRequest
     * @return Result of the ListCostAllocationTags operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.ListCostAllocationTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostAllocationTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListCostAllocationTagsResult listCostAllocationTags(ListCostAllocationTagsRequest listCostAllocationTagsRequest);

    /**
     * <p>
     * Returns the name, Amazon Resource Name (ARN), <code>NumberOfRules</code> and effective dates of all Cost
     * Categories defined in the account. You have the option to use <code>EffectiveOn</code> to return a list of Cost
     * Categories that were active on a specific date. If there is no <code>EffectiveOn</code> specified, you’ll see
     * Cost Categories that are effective on the current date. If Cost Category is still effective,
     * <code>EffectiveEnd</code> is omitted in the response. <code>ListCostCategoryDefinitions</code> supports
     * pagination. The request can have a <code>MaxResults</code> range up to 100.
     * </p>
     * 
     * @param listCostCategoryDefinitionsRequest
     * @return Result of the ListCostCategoryDefinitions operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.ListCostCategoryDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostCategoryDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    ListCostCategoryDefinitionsResult listCostCategoryDefinitions(ListCostCategoryDefinitionsRequest listCostCategoryDefinitionsRequest);

    /**
     * <p>
     * Retrieves a list of your historical recommendation generations within the past 30 days.
     * </p>
     * 
     * @param listSavingsPlansPurchaseRecommendationGenerationRequest
     * @return Result of the ListSavingsPlansPurchaseRecommendationGeneration operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.ListSavingsPlansPurchaseRecommendationGeneration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListSavingsPlansPurchaseRecommendationGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    ListSavingsPlansPurchaseRecommendationGenerationResult listSavingsPlansPurchaseRecommendationGeneration(
            ListSavingsPlansPurchaseRecommendationGenerationRequest listSavingsPlansPurchaseRecommendationGenerationRequest);

    /**
     * <p>
     * Returns a list of resource tags associated with the resource specified by the Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Modifies the feedback property of a given cost anomaly.
     * </p>
     * 
     * @param provideAnomalyFeedbackRequest
     * @return Result of the ProvideAnomalyFeedback operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.ProvideAnomalyFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ProvideAnomalyFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    ProvideAnomalyFeedbackResult provideAnomalyFeedback(ProvideAnomalyFeedbackRequest provideAnomalyFeedbackRequest);

    /**
     * <p>
     * Request a cost allocation tag backfill. This will backfill the activation status (either <code>active</code> or
     * <code>inactive</code>) for all tag keys from <code>para:BackfillFrom</code> up to the when this request is made.
     * </p>
     * <p>
     * You can request a backfill once every 24 hours.
     * </p>
     * 
     * @param startCostAllocationTagBackfillRequest
     * @return Result of the StartCostAllocationTagBackfill operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BackfillLimitExceededException
     *         A request to backfill is already in progress. Once the previous request is complete, you can create
     *         another request.
     * @sample AWSCostExplorer.StartCostAllocationTagBackfill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/StartCostAllocationTagBackfill"
     *      target="_top">AWS API Documentation</a>
     */
    StartCostAllocationTagBackfillResult startCostAllocationTagBackfill(StartCostAllocationTagBackfillRequest startCostAllocationTagBackfillRequest);

    /**
     * <p>
     * Requests a Savings Plans recommendation generation. This enables you to calculate a fresh set of Savings Plans
     * recommendations that takes your latest usage data and current Savings Plans inventory into account. You can
     * refresh Savings Plans recommendations up to three times daily for a consolidated billing family.
     * </p>
     * <note>
     * <p>
     * <code>StartSavingsPlansPurchaseRecommendationGeneration</code> has no request syntax because no input parameters
     * are needed to support this operation.
     * </p>
     * </note>
     * 
     * @param startSavingsPlansPurchaseRecommendationGenerationRequest
     * @return Result of the StartSavingsPlansPurchaseRecommendationGeneration operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached the limit on the number of resources you can create, or exceeded the size of an individual
     *         resource.
     * @throws GenerationExistsException
     *         A request to generate a recommendation is already in progress.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.StartSavingsPlansPurchaseRecommendationGeneration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/StartSavingsPlansPurchaseRecommendationGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    StartSavingsPlansPurchaseRecommendationGenerationResult startSavingsPlansPurchaseRecommendationGeneration(
            StartSavingsPlansPurchaseRecommendationGenerationRequest startSavingsPlansPurchaseRecommendationGenerationRequest);

    /**
     * <p>
     * An API operation for adding one or more tags (key-value pairs) to a resource.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> operation with a resource that already has tags. If you specify a new
     * tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a
     * tag key that is already associated with the resource, the new tag value you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * Although the maximum number of array members is 200, user-tag maximum is 50. The remaining are reserved for
     * Amazon Web Services use.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws TooManyTagsException
     *         Can occur if you specify a number of tags for a resource greater than the maximum 50 user tags per
     *         resource.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a resource. Specify only tag keys in your request. Don't specify the value.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing cost anomaly monitor. The changes made are applied going forward, and doesn't change
     * anomalies detected in the past.
     * </p>
     * 
     * @param updateAnomalyMonitorRequest
     * @return Result of the UpdateAnomalyMonitor operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @sample AWSCostExplorer.UpdateAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAnomalyMonitorResult updateAnomalyMonitor(UpdateAnomalyMonitorRequest updateAnomalyMonitorRequest);

    /**
     * <p>
     * Updates an existing cost anomaly subscription. Specify the fields that you want to update. Omitted fields are
     * unchanged.
     * </p>
     * <note>
     * <p>
     * The JSON below describes the generic construct for each type. See <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_UpdateAnomalySubscription.html#API_UpdateAnomalySubscription_RequestParameters"
     * >Request Parameters</a> for possible values as they apply to <code>AnomalySubscription</code>.
     * </p>
     * </note>
     * 
     * @param updateAnomalySubscriptionRequest
     * @return Result of the UpdateAnomalySubscription operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @throws UnknownSubscriptionException
     *         The cost anomaly subscription does not exist for the account.
     * @sample AWSCostExplorer.UpdateAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAnomalySubscriptionResult updateAnomalySubscription(UpdateAnomalySubscriptionRequest updateAnomalySubscriptionRequest);

    /**
     * <p>
     * Updates status for cost allocation tags in bulk, with maximum batch size of 20. If the tag status that's updated
     * is the same as the existing tag status, the request doesn't fail. Instead, it doesn't have any effect on the tag
     * status (for example, activating the active tag).
     * </p>
     * 
     * @param updateCostAllocationTagsStatusRequest
     * @return Result of the UpdateCostAllocationTagsStatus operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.UpdateCostAllocationTagsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateCostAllocationTagsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCostAllocationTagsStatusResult updateCostAllocationTagsStatus(UpdateCostAllocationTagsStatusRequest updateCostAllocationTagsStatusRequest);

    /**
     * <p>
     * Updates an existing Cost Category. Changes made to the Cost Category rules will be used to categorize the current
     * month’s expenses and future expenses. This won’t change categorization for the previous months.
     * </p>
     * 
     * @param updateCostCategoryDefinitionRequest
     * @return Result of the UpdateCostCategoryDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws ServiceQuotaExceededException
     *         You've reached the limit on the number of resources you can create, or exceeded the size of an individual
     *         resource.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.UpdateCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCostCategoryDefinitionResult updateCostCategoryDefinition(UpdateCostCategoryDefinitionRequest updateCostCategoryDefinitionRequest);

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

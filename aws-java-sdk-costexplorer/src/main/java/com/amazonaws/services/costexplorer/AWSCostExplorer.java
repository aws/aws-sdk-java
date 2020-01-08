/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Cost Explorer API enables you to programmatically query your cost and usage data. You can query for aggregated
 * data such as total monthly costs or total daily usage. You can also query for granular data, such as the number of
 * daily write operations for Amazon DynamoDB database tables in your production environment.
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
 * For information about costs associated with the Cost Explorer API, see <a
 * href="https://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management Pricing</a>.
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
     * <important>
     * <p>
     * <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of
     * Cost Categories is subject to the Beta Service Participation terms of the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> (Section 1.10).</b> </i>
     * </p>
     * </important>
     * <p>
     * Creates a new Cost Category with the requested name and rules.
     * </p>
     * 
     * @param createCostCategoryDefinitionRequest
     * @return Result of the CreateCostCategoryDefinition operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You've reached the limit on the number of resources you can create, or exceeded the size of an individual
     *         resources.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.CreateCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCostCategoryDefinitionResult createCostCategoryDefinition(CreateCostCategoryDefinitionRequest createCostCategoryDefinitionRequest);

    /**
     * <important>
     * <p>
     * <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of
     * Cost Categories is subject to the Beta Service Participation terms of the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> (Section 1.10).</b> </i>
     * </p>
     * </important>
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
     * <important>
     * <p>
     * <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of
     * Cost Categories is subject to the Beta Service Participation terms of the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> (Section 1.10).</b> </i>
     * </p>
     * </important>
     * <p>
     * Returns the name, ARN, rules, definition, and effective dates of a Cost Category that's defined in the account.
     * </p>
     * <p>
     * You have the option to use <code>EffectiveOn</code> to return a Cost Category that is active on a specific date.
     * If there is no <code>EffectiveOn</code> specified, you’ll see a Cost Category that is effective on the current
     * date. If Cost Category is still effective, <code>EffectiveEnd</code> is omitted in the response.
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
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as
     * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You can also filter
     * and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a specific time
     * range. For a complete list of valid dimensions, see the <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Master accounts in an organization in AWS Organizations have access to all
     * member accounts.
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
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Master accounts in an organization in AWS Organizations have access to all
     * member accounts. This API is currently available for the Amazon Elastic Compute Cloud – Compute service only.
     * </p>
     * <note>
     * <p>
     * This is an opt-in only feature. You can enable this feature from the Cost Explorer Settings page. For information
     * on how to access the Settings page, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-access.html">Controlling Access for Cost
     * Explorer</a> in the <i>AWS Billing and Cost Management User Guide</i>.
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
     * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic
     * Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a
     * reservation. An organization's master account can see the coverage of the associated member accounts. For any
     * time period, you can filter data about reservation usage by the following dimensions:
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
     * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs.
     * Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing.
     * </p>
     * <p>
     * AWS generates your recommendations by identifying your On-Demand usage during a specific time period and
     * collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it
     * simulates every combination of reservations in each category of usage to identify the best number of each type of
     * RI to purchase to maximize your estimated savings.
     * </p>
     * <p>
     * For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US
     * West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family
     * usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a
     * size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size
     * that you want. For this example, your RI recommendation would be for <code>c4.large</code> because that is the
     * smallest size instance in the c4 instance family.
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
     * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member
     * accounts. You can filter data by dimensions in a time period. You can use <code>GetDimensionValues</code> to
     * determine the possible dimension values. Currently, you can group only by <code>SUBSCRIPTION_ID</code>.
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
     * Creates recommendations that helps you save cost by identifying idle and underutilized Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are generated to either downsize or terminate instances, along with providing savings detail and
     * metrics. For details on calculation and function, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-what-is.html">Optimizing Your Cost with
     * Rightsizing Recommendations</a>.
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
     * Retrieves the Savings Plans covered for your account. This enables you to see how much of your cost is covered by
     * a Savings Plan. An organization’s master account can see the coverage of the associated member accounts. For any
     * time period, you can filter data for Savings Plans usage with the following dimensions:
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
     * Retrieves your request parameters, Savings Plan Recommendations Summary and Details.
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
     * Master accounts in an organization have access to member accounts. You can use <code>GetDimensionValues</code> in
     * <code>SAVINGS_PLANS</code> to determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * You cannot group by any dimension values for <code>GetSavingsPlansUtilization</code>.
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
     * <important>
     * <p>
     * <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of
     * Cost Categories is subject to the Beta Service Participation terms of the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> (Section 1.10).</b> </i>
     * </p>
     * </important>
     * <p>
     * Returns the name, ARN and effective dates of all Cost Categories defined in the account. You have the option to
     * use <code>EffectiveOn</code> to return a list of Cost Categories that were active on a specific date. If there is
     * no <code>EffectiveOn</code> specified, you’ll see Cost Categories that are effective on the current date. If Cost
     * Category is still effective, <code>EffectiveEnd</code> is omitted in the response.
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
     * <important>
     * <p>
     * <i> <b>Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of
     * Cost Categories is subject to the Beta Service Participation terms of the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> (Section 1.10).</b> </i>
     * </p>
     * </important>
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
     *         resources.
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

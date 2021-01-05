/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * href="http://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management Pricing</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCostExplorerAsync extends AWSCostExplorer {

    /**
     * <p>
     * Creates a new cost anomaly detection monitor with the requested type and monitor specification.
     * </p>
     * 
     * @param createAnomalyMonitorRequest
     * @return A Java Future containing the result of the CreateAnomalyMonitor operation returned by the service.
     * @sample AWSCostExplorerAsync.CreateAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAnomalyMonitorResult> createAnomalyMonitorAsync(CreateAnomalyMonitorRequest createAnomalyMonitorRequest);

    /**
     * <p>
     * Creates a new cost anomaly detection monitor with the requested type and monitor specification.
     * </p>
     * 
     * @param createAnomalyMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAnomalyMonitor operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.CreateAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAnomalyMonitorResult> createAnomalyMonitorAsync(CreateAnomalyMonitorRequest createAnomalyMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAnomalyMonitorRequest, CreateAnomalyMonitorResult> asyncHandler);

    /**
     * <p>
     * Adds a subscription to a cost anomaly detection monitor. You can use each subscription to define subscribers with
     * email or SNS notifications. Email subscribers can set a dollar threshold and a time frequency for receiving
     * notifications.
     * </p>
     * 
     * @param createAnomalySubscriptionRequest
     * @return A Java Future containing the result of the CreateAnomalySubscription operation returned by the service.
     * @sample AWSCostExplorerAsync.CreateAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnomalySubscriptionResult> createAnomalySubscriptionAsync(
            CreateAnomalySubscriptionRequest createAnomalySubscriptionRequest);

    /**
     * <p>
     * Adds a subscription to a cost anomaly detection monitor. You can use each subscription to define subscribers with
     * email or SNS notifications. Email subscribers can set a dollar threshold and a time frequency for receiving
     * notifications.
     * </p>
     * 
     * @param createAnomalySubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAnomalySubscription operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.CreateAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnomalySubscriptionResult> createAnomalySubscriptionAsync(
            CreateAnomalySubscriptionRequest createAnomalySubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAnomalySubscriptionRequest, CreateAnomalySubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates a new Cost Category with the requested name and rules.
     * </p>
     * 
     * @param createCostCategoryDefinitionRequest
     * @return A Java Future containing the result of the CreateCostCategoryDefinition operation returned by the
     *         service.
     * @sample AWSCostExplorerAsync.CreateCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCostCategoryDefinitionResult> createCostCategoryDefinitionAsync(
            CreateCostCategoryDefinitionRequest createCostCategoryDefinitionRequest);

    /**
     * <p>
     * Creates a new Cost Category with the requested name and rules.
     * </p>
     * 
     * @param createCostCategoryDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCostCategoryDefinition operation returned by the
     *         service.
     * @sample AWSCostExplorerAsyncHandler.CreateCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCostCategoryDefinitionResult> createCostCategoryDefinitionAsync(
            CreateCostCategoryDefinitionRequest createCostCategoryDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCostCategoryDefinitionRequest, CreateCostCategoryDefinitionResult> asyncHandler);

    /**
     * <p>
     * Deletes a cost anomaly monitor.
     * </p>
     * 
     * @param deleteAnomalyMonitorRequest
     * @return A Java Future containing the result of the DeleteAnomalyMonitor operation returned by the service.
     * @sample AWSCostExplorerAsync.DeleteAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnomalyMonitorResult> deleteAnomalyMonitorAsync(DeleteAnomalyMonitorRequest deleteAnomalyMonitorRequest);

    /**
     * <p>
     * Deletes a cost anomaly monitor.
     * </p>
     * 
     * @param deleteAnomalyMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnomalyMonitor operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.DeleteAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnomalyMonitorResult> deleteAnomalyMonitorAsync(DeleteAnomalyMonitorRequest deleteAnomalyMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnomalyMonitorRequest, DeleteAnomalyMonitorResult> asyncHandler);

    /**
     * <p>
     * Deletes a cost anomaly subscription.
     * </p>
     * 
     * @param deleteAnomalySubscriptionRequest
     * @return A Java Future containing the result of the DeleteAnomalySubscription operation returned by the service.
     * @sample AWSCostExplorerAsync.DeleteAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnomalySubscriptionResult> deleteAnomalySubscriptionAsync(
            DeleteAnomalySubscriptionRequest deleteAnomalySubscriptionRequest);

    /**
     * <p>
     * Deletes a cost anomaly subscription.
     * </p>
     * 
     * @param deleteAnomalySubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnomalySubscription operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.DeleteAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnomalySubscriptionResult> deleteAnomalySubscriptionAsync(
            DeleteAnomalySubscriptionRequest deleteAnomalySubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnomalySubscriptionRequest, DeleteAnomalySubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes a Cost Category. Expenses from this month going forward will no longer be categorized with this Cost
     * Category.
     * </p>
     * 
     * @param deleteCostCategoryDefinitionRequest
     * @return A Java Future containing the result of the DeleteCostCategoryDefinition operation returned by the
     *         service.
     * @sample AWSCostExplorerAsync.DeleteCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCostCategoryDefinitionResult> deleteCostCategoryDefinitionAsync(
            DeleteCostCategoryDefinitionRequest deleteCostCategoryDefinitionRequest);

    /**
     * <p>
     * Deletes a Cost Category. Expenses from this month going forward will no longer be categorized with this Cost
     * Category.
     * </p>
     * 
     * @param deleteCostCategoryDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCostCategoryDefinition operation returned by the
     *         service.
     * @sample AWSCostExplorerAsyncHandler.DeleteCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCostCategoryDefinitionResult> deleteCostCategoryDefinitionAsync(
            DeleteCostCategoryDefinitionRequest deleteCostCategoryDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCostCategoryDefinitionRequest, DeleteCostCategoryDefinitionResult> asyncHandler);

    /**
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
     * @return A Java Future containing the result of the DescribeCostCategoryDefinition operation returned by the
     *         service.
     * @sample AWSCostExplorerAsync.DescribeCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DescribeCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCostCategoryDefinitionResult> describeCostCategoryDefinitionAsync(
            DescribeCostCategoryDefinitionRequest describeCostCategoryDefinitionRequest);

    /**
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCostCategoryDefinition operation returned by the
     *         service.
     * @sample AWSCostExplorerAsyncHandler.DescribeCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DescribeCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCostCategoryDefinitionResult> describeCostCategoryDefinitionAsync(
            DescribeCostCategoryDefinitionRequest describeCostCategoryDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCostCategoryDefinitionRequest, DescribeCostCategoryDefinitionResult> asyncHandler);

    /**
     * <p>
     * Retrieves all of the cost anomalies detected on your account, during the time period specified by the
     * <code>DateInterval</code> object.
     * </p>
     * 
     * @param getAnomaliesRequest
     * @return A Java Future containing the result of the GetAnomalies operation returned by the service.
     * @sample AWSCostExplorerAsync.GetAnomalies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnomaliesResult> getAnomaliesAsync(GetAnomaliesRequest getAnomaliesRequest);

    /**
     * <p>
     * Retrieves all of the cost anomalies detected on your account, during the time period specified by the
     * <code>DateInterval</code> object.
     * </p>
     * 
     * @param getAnomaliesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnomalies operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetAnomalies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnomaliesResult> getAnomaliesAsync(GetAnomaliesRequest getAnomaliesRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnomaliesRequest, GetAnomaliesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the cost anomaly monitor definitions for your account. You can filter using a list of cost anomaly
     * monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param getAnomalyMonitorsRequest
     * @return A Java Future containing the result of the GetAnomalyMonitors operation returned by the service.
     * @sample AWSCostExplorerAsync.GetAnomalyMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalyMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnomalyMonitorsResult> getAnomalyMonitorsAsync(GetAnomalyMonitorsRequest getAnomalyMonitorsRequest);

    /**
     * <p>
     * Retrieves the cost anomaly monitor definitions for your account. You can filter using a list of cost anomaly
     * monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param getAnomalyMonitorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnomalyMonitors operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetAnomalyMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalyMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnomalyMonitorsResult> getAnomalyMonitorsAsync(GetAnomalyMonitorsRequest getAnomalyMonitorsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnomalyMonitorsRequest, GetAnomalyMonitorsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the cost anomaly subscription objects for your account. You can filter using a list of cost anomaly
     * monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param getAnomalySubscriptionsRequest
     * @return A Java Future containing the result of the GetAnomalySubscriptions operation returned by the service.
     * @sample AWSCostExplorerAsync.GetAnomalySubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalySubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnomalySubscriptionsResult> getAnomalySubscriptionsAsync(GetAnomalySubscriptionsRequest getAnomalySubscriptionsRequest);

    /**
     * <p>
     * Retrieves the cost anomaly subscription objects for your account. You can filter using a list of cost anomaly
     * monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param getAnomalySubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnomalySubscriptions operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetAnomalySubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalySubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnomalySubscriptionsResult> getAnomalySubscriptionsAsync(GetAnomalySubscriptionsRequest getAnomalySubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnomalySubscriptionsRequest, GetAnomalySubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as
     * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You can also filter
     * and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a specific time
     * range. For a complete list of valid dimensions, see the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Management account in an organization in AWS Organizations have access to all
     * member accounts.
     * </p>
     * <p>
     * For information about filter limitations, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-limits.html">Quotas and
     * restrictions</a> in the <i>Billing and Cost Management User Guide</i>.
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
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as
     * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You can also filter
     * and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a specific time
     * range. For a complete list of valid dimensions, see the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Management account in an organization in AWS Organizations have access to all
     * member accounts.
     * </p>
     * <p>
     * For information about filter limitations, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-limits.html">Quotas and
     * restrictions</a> in the <i>Billing and Cost Management User Guide</i>.
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
     * Retrieves cost and usage metrics with resources for your account. You can specify which cost and usage-related
     * metric, such as <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You
     * can also filter and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a
     * specific time range. For a complete list of valid dimensions, see the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Management account in an organization in AWS Organizations have access to all
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
     * @return A Java Future containing the result of the GetCostAndUsageWithResources operation returned by the
     *         service.
     * @sample AWSCostExplorerAsync.GetCostAndUsageWithResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsageWithResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCostAndUsageWithResourcesResult> getCostAndUsageWithResourcesAsync(
            GetCostAndUsageWithResourcesRequest getCostAndUsageWithResourcesRequest);

    /**
     * <p>
     * Retrieves cost and usage metrics with resources for your account. You can specify which cost and usage-related
     * metric, such as <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You
     * can also filter and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a
     * specific time range. For a complete list of valid dimensions, see the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Management account in an organization in AWS Organizations have access to all
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCostAndUsageWithResources operation returned by the
     *         service.
     * @sample AWSCostExplorerAsyncHandler.GetCostAndUsageWithResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsageWithResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCostAndUsageWithResourcesResult> getCostAndUsageWithResourcesAsync(
            GetCostAndUsageWithResourcesRequest getCostAndUsageWithResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<GetCostAndUsageWithResourcesRequest, GetCostAndUsageWithResourcesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetCostCategories operation returned by the service.
     * @sample AWSCostExplorerAsync.GetCostCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostCategories" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCostCategoriesResult> getCostCategoriesAsync(GetCostCategoriesRequest getCostCategoriesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCostCategories operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetCostCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostCategories" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCostCategoriesResult> getCostCategoriesAsync(GetCostCategoriesRequest getCostCategoriesRequest,
            com.amazonaws.handlers.AsyncHandler<GetCostCategoriesRequest, GetCostCategoriesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period
     * that you select, based on your past costs.
     * </p>
     * 
     * @param getCostForecastRequest
     * @return A Java Future containing the result of the GetCostForecast operation returned by the service.
     * @sample AWSCostExplorerAsync.GetCostForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCostForecastResult> getCostForecastAsync(GetCostForecastRequest getCostForecastRequest);

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period
     * that you select, based on your past costs.
     * </p>
     * 
     * @param getCostForecastRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCostForecast operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetCostForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCostForecastResult> getCostForecastAsync(GetCostForecastRequest getCostForecastRequest,
            com.amazonaws.handlers.AsyncHandler<GetCostForecastRequest, GetCostForecastResult> asyncHandler);

    /**
     * <p>
     * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension
     * values for an arbitrary string.
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
     * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension
     * values for an arbitrary string.
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
     * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic
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
     * @return A Java Future containing the result of the GetReservationCoverage operation returned by the service.
     * @sample AWSCostExplorerAsync.GetReservationCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReservationCoverageResult> getReservationCoverageAsync(GetReservationCoverageRequest getReservationCoverageRequest);

    /**
     * <p>
     * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReservationCoverage operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetReservationCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReservationCoverageResult> getReservationCoverageAsync(GetReservationCoverageRequest getReservationCoverageRequest,
            com.amazonaws.handlers.AsyncHandler<GetReservationCoverageRequest, GetReservationCoverageResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetReservationPurchaseRecommendation operation returned by the
     *         service.
     * @sample AWSCostExplorerAsync.GetReservationPurchaseRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationPurchaseRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReservationPurchaseRecommendationResult> getReservationPurchaseRecommendationAsync(
            GetReservationPurchaseRecommendationRequest getReservationPurchaseRecommendationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReservationPurchaseRecommendation operation returned by the
     *         service.
     * @sample AWSCostExplorerAsyncHandler.GetReservationPurchaseRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationPurchaseRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReservationPurchaseRecommendationResult> getReservationPurchaseRecommendationAsync(
            GetReservationPurchaseRecommendationRequest getReservationPurchaseRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<GetReservationPurchaseRecommendationRequest, GetReservationPurchaseRecommendationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the reservation utilization for your account. Management account in an organization have access to
     * member accounts. You can filter data by dimensions in a time period. You can use <code>GetDimensionValues</code>
     * to determine the possible dimension values. Currently, you can group only by <code>SUBSCRIPTION_ID</code>.
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
     * Retrieves the reservation utilization for your account. Management account in an organization have access to
     * member accounts. You can filter data by dimensions in a time period. You can use <code>GetDimensionValues</code>
     * to determine the possible dimension values. Currently, you can group only by <code>SUBSCRIPTION_ID</code>.
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
     * Creates recommendations that help you save cost by identifying idle and underutilized Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are generated to either downsize or terminate instances, along with providing savings detail and
     * metrics. For details on calculation and function, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-rightsizing.html">Optimizing Your Cost with
     * Rightsizing Recommendations</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param getRightsizingRecommendationRequest
     * @return A Java Future containing the result of the GetRightsizingRecommendation operation returned by the
     *         service.
     * @sample AWSCostExplorerAsync.GetRightsizingRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetRightsizingRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRightsizingRecommendationResult> getRightsizingRecommendationAsync(
            GetRightsizingRecommendationRequest getRightsizingRecommendationRequest);

    /**
     * <p>
     * Creates recommendations that help you save cost by identifying idle and underutilized Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are generated to either downsize or terminate instances, along with providing savings detail and
     * metrics. For details on calculation and function, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-rightsizing.html">Optimizing Your Cost with
     * Rightsizing Recommendations</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param getRightsizingRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRightsizingRecommendation operation returned by the
     *         service.
     * @sample AWSCostExplorerAsyncHandler.GetRightsizingRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetRightsizingRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRightsizingRecommendationResult> getRightsizingRecommendationAsync(
            GetRightsizingRecommendationRequest getRightsizingRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<GetRightsizingRecommendationRequest, GetRightsizingRecommendationResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSavingsPlansCoverage operation returned by the service.
     * @sample AWSCostExplorerAsync.GetSavingsPlansCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSavingsPlansCoverageResult> getSavingsPlansCoverageAsync(GetSavingsPlansCoverageRequest getSavingsPlansCoverageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSavingsPlansCoverage operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetSavingsPlansCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSavingsPlansCoverageResult> getSavingsPlansCoverageAsync(GetSavingsPlansCoverageRequest getSavingsPlansCoverageRequest,
            com.amazonaws.handlers.AsyncHandler<GetSavingsPlansCoverageRequest, GetSavingsPlansCoverageResult> asyncHandler);

    /**
     * <p>
     * Retrieves your request parameters, Savings Plan Recommendations Summary and Details.
     * </p>
     * 
     * @param getSavingsPlansPurchaseRecommendationRequest
     * @return A Java Future containing the result of the GetSavingsPlansPurchaseRecommendation operation returned by
     *         the service.
     * @sample AWSCostExplorerAsync.GetSavingsPlansPurchaseRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansPurchaseRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSavingsPlansPurchaseRecommendationResult> getSavingsPlansPurchaseRecommendationAsync(
            GetSavingsPlansPurchaseRecommendationRequest getSavingsPlansPurchaseRecommendationRequest);

    /**
     * <p>
     * Retrieves your request parameters, Savings Plan Recommendations Summary and Details.
     * </p>
     * 
     * @param getSavingsPlansPurchaseRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSavingsPlansPurchaseRecommendation operation returned by
     *         the service.
     * @sample AWSCostExplorerAsyncHandler.GetSavingsPlansPurchaseRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansPurchaseRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSavingsPlansPurchaseRecommendationResult> getSavingsPlansPurchaseRecommendationAsync(
            GetSavingsPlansPurchaseRecommendationRequest getSavingsPlansPurchaseRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSavingsPlansPurchaseRecommendationRequest, GetSavingsPlansPurchaseRecommendationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the Savings Plans utilization for your account across date ranges with daily or monthly granularity.
     * Management account in an organization have access to member accounts. You can use <code>GetDimensionValues</code>
     * in <code>SAVINGS_PLANS</code> to determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * You cannot group by any dimension values for <code>GetSavingsPlansUtilization</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationRequest
     * @return A Java Future containing the result of the GetSavingsPlansUtilization operation returned by the service.
     * @sample AWSCostExplorerAsync.GetSavingsPlansUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSavingsPlansUtilizationResult> getSavingsPlansUtilizationAsync(
            GetSavingsPlansUtilizationRequest getSavingsPlansUtilizationRequest);

    /**
     * <p>
     * Retrieves the Savings Plans utilization for your account across date ranges with daily or monthly granularity.
     * Management account in an organization have access to member accounts. You can use <code>GetDimensionValues</code>
     * in <code>SAVINGS_PLANS</code> to determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * You cannot group by any dimension values for <code>GetSavingsPlansUtilization</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSavingsPlansUtilization operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetSavingsPlansUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSavingsPlansUtilizationResult> getSavingsPlansUtilizationAsync(
            GetSavingsPlansUtilizationRequest getSavingsPlansUtilizationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSavingsPlansUtilizationRequest, GetSavingsPlansUtilizationResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSavingsPlansUtilizationDetails operation returned by the
     *         service.
     * @sample AWSCostExplorerAsync.GetSavingsPlansUtilizationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilizationDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSavingsPlansUtilizationDetailsResult> getSavingsPlansUtilizationDetailsAsync(
            GetSavingsPlansUtilizationDetailsRequest getSavingsPlansUtilizationDetailsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSavingsPlansUtilizationDetails operation returned by the
     *         service.
     * @sample AWSCostExplorerAsyncHandler.GetSavingsPlansUtilizationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilizationDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSavingsPlansUtilizationDetailsResult> getSavingsPlansUtilizationDetailsAsync(
            GetSavingsPlansUtilizationDetailsRequest getSavingsPlansUtilizationDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSavingsPlansUtilizationDetailsRequest, GetSavingsPlansUtilizationDetailsResult> asyncHandler);

    /**
     * <p>
     * Queries for available tag keys and tag values for a specified period. You can search the tag values for an
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
     * Queries for available tag keys and tag values for a specified period. You can search the tag values for an
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

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period
     * that you select, based on your past usage.
     * </p>
     * 
     * @param getUsageForecastRequest
     * @return A Java Future containing the result of the GetUsageForecast operation returned by the service.
     * @sample AWSCostExplorerAsync.GetUsageForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetUsageForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUsageForecastResult> getUsageForecastAsync(GetUsageForecastRequest getUsageForecastRequest);

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period
     * that you select, based on your past usage.
     * </p>
     * 
     * @param getUsageForecastRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsageForecast operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.GetUsageForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetUsageForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUsageForecastResult> getUsageForecastAsync(GetUsageForecastRequest getUsageForecastRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsageForecastRequest, GetUsageForecastResult> asyncHandler);

    /**
     * <p>
     * Returns the name, ARN, <code>NumberOfRules</code> and effective dates of all Cost Categories defined in the
     * account. You have the option to use <code>EffectiveOn</code> to return a list of Cost Categories that were active
     * on a specific date. If there is no <code>EffectiveOn</code> specified, you’ll see Cost Categories that are
     * effective on the current date. If Cost Category is still effective, <code>EffectiveEnd</code> is omitted in the
     * response. <code>ListCostCategoryDefinitions</code> supports pagination. The request can have a
     * <code>MaxResults</code> range up to 100.
     * </p>
     * 
     * @param listCostCategoryDefinitionsRequest
     * @return A Java Future containing the result of the ListCostCategoryDefinitions operation returned by the service.
     * @sample AWSCostExplorerAsync.ListCostCategoryDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostCategoryDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCostCategoryDefinitionsResult> listCostCategoryDefinitionsAsync(
            ListCostCategoryDefinitionsRequest listCostCategoryDefinitionsRequest);

    /**
     * <p>
     * Returns the name, ARN, <code>NumberOfRules</code> and effective dates of all Cost Categories defined in the
     * account. You have the option to use <code>EffectiveOn</code> to return a list of Cost Categories that were active
     * on a specific date. If there is no <code>EffectiveOn</code> specified, you’ll see Cost Categories that are
     * effective on the current date. If Cost Category is still effective, <code>EffectiveEnd</code> is omitted in the
     * response. <code>ListCostCategoryDefinitions</code> supports pagination. The request can have a
     * <code>MaxResults</code> range up to 100.
     * </p>
     * 
     * @param listCostCategoryDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCostCategoryDefinitions operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.ListCostCategoryDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostCategoryDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCostCategoryDefinitionsResult> listCostCategoryDefinitionsAsync(
            ListCostCategoryDefinitionsRequest listCostCategoryDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCostCategoryDefinitionsRequest, ListCostCategoryDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Modifies the feedback property of a given cost anomaly.
     * </p>
     * 
     * @param provideAnomalyFeedbackRequest
     * @return A Java Future containing the result of the ProvideAnomalyFeedback operation returned by the service.
     * @sample AWSCostExplorerAsync.ProvideAnomalyFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ProvideAnomalyFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ProvideAnomalyFeedbackResult> provideAnomalyFeedbackAsync(ProvideAnomalyFeedbackRequest provideAnomalyFeedbackRequest);

    /**
     * <p>
     * Modifies the feedback property of a given cost anomaly.
     * </p>
     * 
     * @param provideAnomalyFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ProvideAnomalyFeedback operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.ProvideAnomalyFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ProvideAnomalyFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ProvideAnomalyFeedbackResult> provideAnomalyFeedbackAsync(ProvideAnomalyFeedbackRequest provideAnomalyFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<ProvideAnomalyFeedbackRequest, ProvideAnomalyFeedbackResult> asyncHandler);

    /**
     * <p>
     * Updates an existing cost anomaly monitor. The changes made are applied going forward, and does not change
     * anomalies detected in the past.
     * </p>
     * 
     * @param updateAnomalyMonitorRequest
     * @return A Java Future containing the result of the UpdateAnomalyMonitor operation returned by the service.
     * @sample AWSCostExplorerAsync.UpdateAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnomalyMonitorResult> updateAnomalyMonitorAsync(UpdateAnomalyMonitorRequest updateAnomalyMonitorRequest);

    /**
     * <p>
     * Updates an existing cost anomaly monitor. The changes made are applied going forward, and does not change
     * anomalies detected in the past.
     * </p>
     * 
     * @param updateAnomalyMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAnomalyMonitor operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.UpdateAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnomalyMonitorResult> updateAnomalyMonitorAsync(UpdateAnomalyMonitorRequest updateAnomalyMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAnomalyMonitorRequest, UpdateAnomalyMonitorResult> asyncHandler);

    /**
     * <p>
     * Updates an existing cost anomaly monitor subscription.
     * </p>
     * 
     * @param updateAnomalySubscriptionRequest
     * @return A Java Future containing the result of the UpdateAnomalySubscription operation returned by the service.
     * @sample AWSCostExplorerAsync.UpdateAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnomalySubscriptionResult> updateAnomalySubscriptionAsync(
            UpdateAnomalySubscriptionRequest updateAnomalySubscriptionRequest);

    /**
     * <p>
     * Updates an existing cost anomaly monitor subscription.
     * </p>
     * 
     * @param updateAnomalySubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAnomalySubscription operation returned by the service.
     * @sample AWSCostExplorerAsyncHandler.UpdateAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnomalySubscriptionResult> updateAnomalySubscriptionAsync(
            UpdateAnomalySubscriptionRequest updateAnomalySubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAnomalySubscriptionRequest, UpdateAnomalySubscriptionResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Cost Category. Changes made to the Cost Category rules will be used to categorize the current
     * month’s expenses and future expenses. This won’t change categorization for the previous months.
     * </p>
     * 
     * @param updateCostCategoryDefinitionRequest
     * @return A Java Future containing the result of the UpdateCostCategoryDefinition operation returned by the
     *         service.
     * @sample AWSCostExplorerAsync.UpdateCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCostCategoryDefinitionResult> updateCostCategoryDefinitionAsync(
            UpdateCostCategoryDefinitionRequest updateCostCategoryDefinitionRequest);

    /**
     * <p>
     * Updates an existing Cost Category. Changes made to the Cost Category rules will be used to categorize the current
     * month’s expenses and future expenses. This won’t change categorization for the previous months.
     * </p>
     * 
     * @param updateCostCategoryDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCostCategoryDefinition operation returned by the
     *         service.
     * @sample AWSCostExplorerAsyncHandler.UpdateCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCostCategoryDefinitionResult> updateCostCategoryDefinitionAsync(
            UpdateCostCategoryDefinitionRequest updateCostCategoryDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCostCategoryDefinitionRequest, UpdateCostCategoryDefinitionResult> asyncHandler);

}

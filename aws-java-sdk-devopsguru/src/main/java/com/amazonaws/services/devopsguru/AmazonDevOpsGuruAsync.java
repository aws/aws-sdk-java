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
package com.amazonaws.services.devopsguru;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;

/**
 * Interface for accessing Amazon DevOps Guru asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.devopsguru.AbstractAmazonDevOpsGuruAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon DevOps Guru is a fully managed service that helps you identify anomalous behavior in business critical
 * operational applications. You specify the AWS resources that you want DevOps Guru to cover, then the Amazon
 * CloudWatch metrics and AWS CloudTrail events related to those resources are analyzed. When anomalous behavior is
 * detected, DevOps Guru creates an <i>insight</i> that includes recommendations, related events, and related metrics
 * that can help you improve your operational applications. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/welcome.html">What is Amazon DevOps Guru</a>.
 * </p>
 * <p>
 * You can specify 1 or 2 Amazon Simple Notification Service topics so you are notified every time a new insight is
 * created. You can also enable DevOps Guru to generate an OpsItem in AWS Systems Manager for each insight to help you
 * manage and track your work addressing insights.
 * </p>
 * <p>
 * To learn about the DevOps Guru workflow, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/welcome.html#how-it-works">How DevOps Guru works</a>.
 * To learn about DevOps Guru concepts, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/concepts.html">Concepts in DevOps Guru</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDevOpsGuruAsync extends AmazonDevOpsGuru {

    /**
     * <p>
     * Adds a notification channel to DevOps Guru. A notification channel is used to notify you about important DevOps
     * Guru events, such as when an insight is generated.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">Permissions for
     * cross account Amazon SNS topics</a>.
     * </p>
     * <p>
     * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service customer-managed key (CMK),
     * then you must add permissions to the CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for AWS
     * KMS–encrypted Amazon SNS topics</a>.
     * </p>
     * 
     * @param addNotificationChannelRequest
     * @return A Java Future containing the result of the AddNotificationChannel operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.AddNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AddNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddNotificationChannelResult> addNotificationChannelAsync(AddNotificationChannelRequest addNotificationChannelRequest);

    /**
     * <p>
     * Adds a notification channel to DevOps Guru. A notification channel is used to notify you about important DevOps
     * Guru events, such as when an insight is generated.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">Permissions for
     * cross account Amazon SNS topics</a>.
     * </p>
     * <p>
     * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service customer-managed key (CMK),
     * then you must add permissions to the CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for AWS
     * KMS–encrypted Amazon SNS topics</a>.
     * </p>
     * 
     * @param addNotificationChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddNotificationChannel operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.AddNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AddNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddNotificationChannelResult> addNotificationChannelAsync(AddNotificationChannelRequest addNotificationChannelRequest,
            com.amazonaws.handlers.AsyncHandler<AddNotificationChannelRequest, AddNotificationChannelResult> asyncHandler);

    /**
     * <p>
     * Returns the number of open reactive insights, the number of open proactive insights, and the number of metrics
     * analyzed in your AWS account. Use these numbers to gauge the health of operations in your AWS account.
     * </p>
     * 
     * @param describeAccountHealthRequest
     * @return A Java Future containing the result of the DescribeAccountHealth operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeAccountHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountHealthResult> describeAccountHealthAsync(DescribeAccountHealthRequest describeAccountHealthRequest);

    /**
     * <p>
     * Returns the number of open reactive insights, the number of open proactive insights, and the number of metrics
     * analyzed in your AWS account. Use these numbers to gauge the health of operations in your AWS account.
     * </p>
     * 
     * @param describeAccountHealthRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountHealth operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeAccountHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountHealthResult> describeAccountHealthAsync(DescribeAccountHealthRequest describeAccountHealthRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountHealthRequest, DescribeAccountHealthResult> asyncHandler);

    /**
     * <p>
     * For the time range passed in, returns the number of open reactive insight that were created, the number of open
     * proactive insights that were created, and the Mean Time to Recover (MTTR) for all closed reactive insights.
     * </p>
     * 
     * @param describeAccountOverviewRequest
     * @return A Java Future containing the result of the DescribeAccountOverview operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeAccountOverview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountOverviewResult> describeAccountOverviewAsync(DescribeAccountOverviewRequest describeAccountOverviewRequest);

    /**
     * <p>
     * For the time range passed in, returns the number of open reactive insight that were created, the number of open
     * proactive insights that were created, and the Mean Time to Recover (MTTR) for all closed reactive insights.
     * </p>
     * 
     * @param describeAccountOverviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountOverview operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeAccountOverview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountOverviewResult> describeAccountOverviewAsync(DescribeAccountOverviewRequest describeAccountOverviewRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountOverviewRequest, DescribeAccountOverviewResult> asyncHandler);

    /**
     * <p>
     * Returns details about an anomaly that you specify using its ID.
     * </p>
     * 
     * @param describeAnomalyRequest
     * @return A Java Future containing the result of the DescribeAnomaly operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeAnomaly
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAnomaly" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyResult> describeAnomalyAsync(DescribeAnomalyRequest describeAnomalyRequest);

    /**
     * <p>
     * Returns details about an anomaly that you specify using its ID.
     * </p>
     * 
     * @param describeAnomalyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAnomaly operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeAnomaly
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAnomaly" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyResult> describeAnomalyAsync(DescribeAnomalyRequest describeAnomalyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAnomalyRequest, DescribeAnomalyResult> asyncHandler);

    /**
     * <p>
     * Returns the most recent feedback submitted in the current AWS account and Region.
     * </p>
     * 
     * @param describeFeedbackRequest
     * @return A Java Future containing the result of the DescribeFeedback operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeFeedback" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFeedbackResult> describeFeedbackAsync(DescribeFeedbackRequest describeFeedbackRequest);

    /**
     * <p>
     * Returns the most recent feedback submitted in the current AWS account and Region.
     * </p>
     * 
     * @param describeFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFeedback operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeFeedback" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFeedbackResult> describeFeedbackAsync(DescribeFeedbackRequest describeFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFeedbackRequest, DescribeFeedbackResult> asyncHandler);

    /**
     * <p>
     * Returns details about an insight that you specify using its ID.
     * </p>
     * 
     * @param describeInsightRequest
     * @return A Java Future containing the result of the DescribeInsight operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeInsight" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(DescribeInsightRequest describeInsightRequest);

    /**
     * <p>
     * Returns details about an insight that you specify using its ID.
     * </p>
     * 
     * @param describeInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInsight operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeInsight" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(DescribeInsightRequest describeInsightRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInsightRequest, DescribeInsightResult> asyncHandler);

    /**
     * <p>
     * Returns the number of open proactive insights, open reactive insights, and the Mean Time to Recover (MTTR) for
     * all closed insights in resource collections in your account. You specify the type of AWS resources collection.
     * The one type of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to
     * analyze only the AWS resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation
     * stacks.
     * </p>
     * 
     * @param describeResourceCollectionHealthRequest
     * @return A Java Future containing the result of the DescribeResourceCollectionHealth operation returned by the
     *         service.
     * @sample AmazonDevOpsGuruAsync.DescribeResourceCollectionHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceCollectionHealthResult> describeResourceCollectionHealthAsync(
            DescribeResourceCollectionHealthRequest describeResourceCollectionHealthRequest);

    /**
     * <p>
     * Returns the number of open proactive insights, open reactive insights, and the Mean Time to Recover (MTTR) for
     * all closed insights in resource collections in your account. You specify the type of AWS resources collection.
     * The one type of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to
     * analyze only the AWS resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation
     * stacks.
     * </p>
     * 
     * @param describeResourceCollectionHealthRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResourceCollectionHealth operation returned by the
     *         service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeResourceCollectionHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceCollectionHealthResult> describeResourceCollectionHealthAsync(
            DescribeResourceCollectionHealthRequest describeResourceCollectionHealthRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceCollectionHealthRequest, DescribeResourceCollectionHealthResult> asyncHandler);

    /**
     * <p>
     * Returns the integration status of services that are integrated with DevOps Guru. The one service that can be
     * integrated with DevOps Guru is AWS Systems Manager, which can be used to create an OpsItem for each generated
     * insight.
     * </p>
     * 
     * @param describeServiceIntegrationRequest
     * @return A Java Future containing the result of the DescribeServiceIntegration operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.DescribeServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceIntegrationResult> describeServiceIntegrationAsync(
            DescribeServiceIntegrationRequest describeServiceIntegrationRequest);

    /**
     * <p>
     * Returns the integration status of services that are integrated with DevOps Guru. The one service that can be
     * integrated with DevOps Guru is AWS Systems Manager, which can be used to create an OpsItem for each generated
     * insight.
     * </p>
     * 
     * @param describeServiceIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServiceIntegration operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.DescribeServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceIntegrationResult> describeServiceIntegrationAsync(
            DescribeServiceIntegrationRequest describeServiceIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceIntegrationRequest, DescribeServiceIntegrationResult> asyncHandler);

    /**
     * <p>
     * Returns an estimate of the monthly cost for DevOps Guru to analyze your AWS resources. For more information, see
     * <a href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps
     * Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
     * </p>
     * 
     * @param getCostEstimationRequest
     * @return A Java Future containing the result of the GetCostEstimation operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.GetCostEstimation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetCostEstimation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCostEstimationResult> getCostEstimationAsync(GetCostEstimationRequest getCostEstimationRequest);

    /**
     * <p>
     * Returns an estimate of the monthly cost for DevOps Guru to analyze your AWS resources. For more information, see
     * <a href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps
     * Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
     * </p>
     * 
     * @param getCostEstimationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCostEstimation operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.GetCostEstimation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetCostEstimation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCostEstimationResult> getCostEstimationAsync(GetCostEstimationRequest getCostEstimationRequest,
            com.amazonaws.handlers.AsyncHandler<GetCostEstimationRequest, GetCostEstimationResult> asyncHandler);

    /**
     * <p>
     * Returns lists AWS resources that are of the specified resource collection type. The one type of AWS resource
     * collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS
     * resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @param getResourceCollectionRequest
     * @return A Java Future containing the result of the GetResourceCollection operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.GetResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceCollectionResult> getResourceCollectionAsync(GetResourceCollectionRequest getResourceCollectionRequest);

    /**
     * <p>
     * Returns lists AWS resources that are of the specified resource collection type. The one type of AWS resource
     * collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS
     * resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @param getResourceCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceCollection operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.GetResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceCollectionResult> getResourceCollectionAsync(GetResourceCollectionRequest getResourceCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceCollectionRequest, GetResourceCollectionResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the anomalies that belong to an insight that you specify using its ID.
     * </p>
     * 
     * @param listAnomaliesForInsightRequest
     * @return A Java Future containing the result of the ListAnomaliesForInsight operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListAnomaliesForInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomaliesForInsightResult> listAnomaliesForInsightAsync(ListAnomaliesForInsightRequest listAnomaliesForInsightRequest);

    /**
     * <p>
     * Returns a list of the anomalies that belong to an insight that you specify using its ID.
     * </p>
     * 
     * @param listAnomaliesForInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnomaliesForInsight operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListAnomaliesForInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomaliesForInsightResult> listAnomaliesForInsightAsync(ListAnomaliesForInsightRequest listAnomaliesForInsightRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnomaliesForInsightRequest, ListAnomaliesForInsightResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the events emitted by the resources that are evaluated by DevOps Guru. You can use filters to
     * specify which events are returned.
     * </p>
     * 
     * @param listEventsRequest
     * @return A Java Future containing the result of the ListEvents operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEventsResult> listEventsAsync(ListEventsRequest listEventsRequest);

    /**
     * <p>
     * Returns a list of the events emitted by the resources that are evaluated by DevOps Guru. You can use filters to
     * specify which events are returned.
     * </p>
     * 
     * @param listEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEvents operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEventsResult> listEventsAsync(ListEventsRequest listEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventsRequest, ListEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of insights in your AWS account. You can specify which insights are returned by their start time
     * and status (<code>ONGOING</code>, <code>CLOSED</code>, or <code>ANY</code>).
     * </p>
     * 
     * @param listInsightsRequest
     * @return A Java Future containing the result of the ListInsights operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(ListInsightsRequest listInsightsRequest);

    /**
     * <p>
     * Returns a list of insights in your AWS account. You can specify which insights are returned by their start time
     * and status (<code>ONGOING</code>, <code>CLOSED</code>, or <code>ANY</code>).
     * </p>
     * 
     * @param listInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInsights operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(ListInsightsRequest listInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInsightsRequest, ListInsightsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of notification channels configured for DevOps Guru. Each notification channel is used to notify
     * you when DevOps Guru generates an insight that contains information about how to improve your operations. The one
     * supported notification channel is Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * 
     * @param listNotificationChannelsRequest
     * @return A Java Future containing the result of the ListNotificationChannels operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationChannelsResult> listNotificationChannelsAsync(ListNotificationChannelsRequest listNotificationChannelsRequest);

    /**
     * <p>
     * Returns a list of notification channels configured for DevOps Guru. Each notification channel is used to notify
     * you when DevOps Guru generates an insight that contains information about how to improve your operations. The one
     * supported notification channel is Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * 
     * @param listNotificationChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotificationChannels operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationChannelsResult> listNotificationChannelsAsync(ListNotificationChannelsRequest listNotificationChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotificationChannelsRequest, ListNotificationChannelsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of a specified insight's recommendations. Each recommendation includes a list of related metrics
     * and a list of related events.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest);

    /**
     * <p>
     * Returns a list of a specified insight's recommendations. Each recommendation includes a list of related metrics
     * and a list of related events.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationsRequest, ListRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Collects customer feedback about the specified insight.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest);

    /**
     * <p>
     * Collects customer feedback about the specified insight.
     * </p>
     * 
     * @param putFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler);

    /**
     * <p>
     * Removes a notification channel from DevOps Guru. A notification channel is used to notify you when DevOps Guru
     * generates an insight that contains information about how to improve your operations.
     * </p>
     * 
     * @param removeNotificationChannelRequest
     * @return A Java Future containing the result of the RemoveNotificationChannel operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(
            RemoveNotificationChannelRequest removeNotificationChannelRequest);

    /**
     * <p>
     * Removes a notification channel from DevOps Guru. A notification channel is used to notify you when DevOps Guru
     * generates an insight that contains information about how to improve your operations.
     * </p>
     * 
     * @param removeNotificationChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveNotificationChannel operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(
            RemoveNotificationChannelRequest removeNotificationChannelRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveNotificationChannelRequest, RemoveNotificationChannelResult> asyncHandler);

    /**
     * <p>
     * Returns a list of insights in your AWS account. You can specify which insights are returned by their start time,
     * one or more statuses (<code>ONGOING</code>, <code>CLOSED</code>, and <code>CLOSED</code>), one or more severities
     * (<code>LOW</code>, <code>MEDIUM</code>, and <code>HIGH</code>), and type (<code>REACTIVE</code> or
     * <code>PROACTIVE</code>).
     * </p>
     * <p>
     * Use the <code>Filters</code> parameter to specify status and severity search parameters. Use the
     * <code>Type</code> parameter to specify <code>REACTIVE</code> or <code>PROACTIVE</code> in your search.
     * </p>
     * 
     * @param searchInsightsRequest
     * @return A Java Future containing the result of the SearchInsights operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.SearchInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchInsightsResult> searchInsightsAsync(SearchInsightsRequest searchInsightsRequest);

    /**
     * <p>
     * Returns a list of insights in your AWS account. You can specify which insights are returned by their start time,
     * one or more statuses (<code>ONGOING</code>, <code>CLOSED</code>, and <code>CLOSED</code>), one or more severities
     * (<code>LOW</code>, <code>MEDIUM</code>, and <code>HIGH</code>), and type (<code>REACTIVE</code> or
     * <code>PROACTIVE</code>).
     * </p>
     * <p>
     * Use the <code>Filters</code> parameter to specify status and severity search parameters. Use the
     * <code>Type</code> parameter to specify <code>REACTIVE</code> or <code>PROACTIVE</code> in your search.
     * </p>
     * 
     * @param searchInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchInsights operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.SearchInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchInsightsResult> searchInsightsAsync(SearchInsightsRequest searchInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchInsightsRequest, SearchInsightsResult> asyncHandler);

    /**
     * <p>
     * Starts the creation of an estimate of the monthly cost to analyze your AWS resources.
     * </p>
     * 
     * @param startCostEstimationRequest
     * @return A Java Future containing the result of the StartCostEstimation operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.StartCostEstimation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/StartCostEstimation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartCostEstimationResult> startCostEstimationAsync(StartCostEstimationRequest startCostEstimationRequest);

    /**
     * <p>
     * Starts the creation of an estimate of the monthly cost to analyze your AWS resources.
     * </p>
     * 
     * @param startCostEstimationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartCostEstimation operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.StartCostEstimation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/StartCostEstimation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartCostEstimationResult> startCostEstimationAsync(StartCostEstimationRequest startCostEstimationRequest,
            com.amazonaws.handlers.AsyncHandler<StartCostEstimationRequest, StartCostEstimationResult> asyncHandler);

    /**
     * <p>
     * Updates the collection of resources that DevOps Guru analyzes. The one type of AWS resource collection supported
     * is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in
     * the stacks. You can specify up to 500 AWS CloudFormation stacks. This method also creates the IAM role required
     * for you to use DevOps Guru.
     * </p>
     * 
     * @param updateResourceCollectionRequest
     * @return A Java Future containing the result of the UpdateResourceCollection operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.UpdateResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceCollectionResult> updateResourceCollectionAsync(UpdateResourceCollectionRequest updateResourceCollectionRequest);

    /**
     * <p>
     * Updates the collection of resources that DevOps Guru analyzes. The one type of AWS resource collection supported
     * is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in
     * the stacks. You can specify up to 500 AWS CloudFormation stacks. This method also creates the IAM role required
     * for you to use DevOps Guru.
     * </p>
     * 
     * @param updateResourceCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceCollection operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.UpdateResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceCollectionResult> updateResourceCollectionAsync(UpdateResourceCollectionRequest updateResourceCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceCollectionRequest, UpdateResourceCollectionResult> asyncHandler);

    /**
     * <p>
     * Enables or disables integration with a service that can be integrated with DevOps Guru. The one service that can
     * be integrated with DevOps Guru is AWS Systems Manager, which can be used to create an OpsItem for each generated
     * insight.
     * </p>
     * 
     * @param updateServiceIntegrationRequest
     * @return A Java Future containing the result of the UpdateServiceIntegration operation returned by the service.
     * @sample AmazonDevOpsGuruAsync.UpdateServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceIntegrationResult> updateServiceIntegrationAsync(UpdateServiceIntegrationRequest updateServiceIntegrationRequest);

    /**
     * <p>
     * Enables or disables integration with a service that can be integrated with DevOps Guru. The one service that can
     * be integrated with DevOps Guru is AWS Systems Manager, which can be used to create an OpsItem for each generated
     * insight.
     * </p>
     * 
     * @param updateServiceIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceIntegration operation returned by the service.
     * @sample AmazonDevOpsGuruAsyncHandler.UpdateServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceIntegrationResult> updateServiceIntegrationAsync(UpdateServiceIntegrationRequest updateServiceIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceIntegrationRequest, UpdateServiceIntegrationResult> asyncHandler);

}

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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.devopsguru.model.*;

/**
 * Interface for accessing Amazon DevOps Guru.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.devopsguru.AbstractAmazonDevOpsGuru} instead.
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
public interface AmazonDevOpsGuru {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "devops-guru";

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
     * @return Result of the AddNotificationChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ServiceQuotaExceededException
     *         The request contains a value that exceeds a maximum quota.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.AddNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AddNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    AddNotificationChannelResult addNotificationChannel(AddNotificationChannelRequest addNotificationChannelRequest);

    /**
     * <p>
     * Returns the number of open reactive insights, the number of open proactive insights, and the number of metrics
     * analyzed in your AWS account. Use these numbers to gauge the health of operations in your AWS account.
     * </p>
     * 
     * @param describeAccountHealthRequest
     * @return Result of the DescribeAccountHealth operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeAccountHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountHealth"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountHealthResult describeAccountHealth(DescribeAccountHealthRequest describeAccountHealthRequest);

    /**
     * <p>
     * For the time range passed in, returns the number of open reactive insight that were created, the number of open
     * proactive insights that were created, and the Mean Time to Recover (MTTR) for all closed reactive insights.
     * </p>
     * 
     * @param describeAccountOverviewRequest
     * @return Result of the DescribeAccountOverview operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeAccountOverview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountOverviewResult describeAccountOverview(DescribeAccountOverviewRequest describeAccountOverviewRequest);

    /**
     * <p>
     * Returns details about an anomaly that you specify using its ID.
     * </p>
     * 
     * @param describeAnomalyRequest
     * @return Result of the DescribeAnomaly operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeAnomaly
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAnomaly" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAnomalyResult describeAnomaly(DescribeAnomalyRequest describeAnomalyRequest);

    /**
     * <p>
     * Returns the most recent feedback submitted in the current AWS account and Region.
     * </p>
     * 
     * @param describeFeedbackRequest
     * @return Result of the DescribeFeedback operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeFeedback" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeFeedbackResult describeFeedback(DescribeFeedbackRequest describeFeedbackRequest);

    /**
     * <p>
     * Returns details about an insight that you specify using its ID.
     * </p>
     * 
     * @param describeInsightRequest
     * @return Result of the DescribeInsight operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeInsight" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInsightResult describeInsight(DescribeInsightRequest describeInsightRequest);

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
     * @return Result of the DescribeResourceCollectionHealth operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeResourceCollectionHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeResourceCollectionHealthResult describeResourceCollectionHealth(DescribeResourceCollectionHealthRequest describeResourceCollectionHealthRequest);

    /**
     * <p>
     * Returns the integration status of services that are integrated with DevOps Guru. The one service that can be
     * integrated with DevOps Guru is AWS Systems Manager, which can be used to create an OpsItem for each generated
     * insight.
     * </p>
     * 
     * @param describeServiceIntegrationRequest
     * @return Result of the DescribeServiceIntegration operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeServiceIntegrationResult describeServiceIntegration(DescribeServiceIntegrationRequest describeServiceIntegrationRequest);

    /**
     * <p>
     * Returns an estimate of the monthly cost for DevOps Guru to analyze your AWS resources. For more information, see
     * <a href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps
     * Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
     * </p>
     * 
     * @param getCostEstimationRequest
     * @return Result of the GetCostEstimation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.GetCostEstimation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetCostEstimation" target="_top">AWS
     *      API Documentation</a>
     */
    GetCostEstimationResult getCostEstimation(GetCostEstimationRequest getCostEstimationRequest);

    /**
     * <p>
     * Returns lists AWS resources that are of the specified resource collection type. The one type of AWS resource
     * collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS
     * resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @param getResourceCollectionRequest
     * @return Result of the GetResourceCollection operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.GetResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceCollectionResult getResourceCollection(GetResourceCollectionRequest getResourceCollectionRequest);

    /**
     * <p>
     * Returns a list of the anomalies that belong to an insight that you specify using its ID.
     * </p>
     * 
     * @param listAnomaliesForInsightRequest
     * @return Result of the ListAnomaliesForInsight operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListAnomaliesForInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
     *      target="_top">AWS API Documentation</a>
     */
    ListAnomaliesForInsightResult listAnomaliesForInsight(ListAnomaliesForInsightRequest listAnomaliesForInsightRequest);

    /**
     * <p>
     * Returns a list of the events emitted by the resources that are evaluated by DevOps Guru. You can use filters to
     * specify which events are returned.
     * </p>
     * 
     * @param listEventsRequest
     * @return Result of the ListEvents operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListEvents" target="_top">AWS API
     *      Documentation</a>
     */
    ListEventsResult listEvents(ListEventsRequest listEventsRequest);

    /**
     * <p>
     * Returns a list of insights in your AWS account. You can specify which insights are returned by their start time
     * and status (<code>ONGOING</code>, <code>CLOSED</code>, or <code>ANY</code>).
     * </p>
     * 
     * @param listInsightsRequest
     * @return Result of the ListInsights operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    ListInsightsResult listInsights(ListInsightsRequest listInsightsRequest);

    /**
     * <p>
     * Returns a list of notification channels configured for DevOps Guru. Each notification channel is used to notify
     * you when DevOps Guru generates an insight that contains information about how to improve your operations. The one
     * supported notification channel is Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * 
     * @param listNotificationChannelsRequest
     * @return Result of the ListNotificationChannels operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    ListNotificationChannelsResult listNotificationChannels(ListNotificationChannelsRequest listNotificationChannelsRequest);

    /**
     * <p>
     * Returns a list of a specified insight's recommendations. Each recommendation includes a list of related metrics
     * and a list of related events.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return Result of the ListRecommendations operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendationsResult listRecommendations(ListRecommendationsRequest listRecommendationsRequest);

    /**
     * <p>
     * Collects customer feedback about the specified insight.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return Result of the PutFeedback operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    PutFeedbackResult putFeedback(PutFeedbackRequest putFeedbackRequest);

    /**
     * <p>
     * Removes a notification channel from DevOps Guru. A notification channel is used to notify you when DevOps Guru
     * generates an insight that contains information about how to improve your operations.
     * </p>
     * 
     * @param removeNotificationChannelRequest
     * @return Result of the RemoveNotificationChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveNotificationChannelResult removeNotificationChannel(RemoveNotificationChannelRequest removeNotificationChannelRequest);

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
     * @return Result of the SearchInsights operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.SearchInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsights" target="_top">AWS API
     *      Documentation</a>
     */
    SearchInsightsResult searchInsights(SearchInsightsRequest searchInsightsRequest);

    /**
     * <p>
     * Starts the creation of an estimate of the monthly cost to analyze your AWS resources.
     * </p>
     * 
     * @param startCostEstimationRequest
     * @return Result of the StartCostEstimation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.StartCostEstimation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/StartCostEstimation"
     *      target="_top">AWS API Documentation</a>
     */
    StartCostEstimationResult startCostEstimation(StartCostEstimationRequest startCostEstimationRequest);

    /**
     * <p>
     * Updates the collection of resources that DevOps Guru analyzes. The one type of AWS resource collection supported
     * is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in
     * the stacks. You can specify up to 500 AWS CloudFormation stacks. This method also creates the IAM role required
     * for you to use DevOps Guru.
     * </p>
     * 
     * @param updateResourceCollectionRequest
     * @return Result of the UpdateResourceCollection operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.UpdateResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourceCollectionResult updateResourceCollection(UpdateResourceCollectionRequest updateResourceCollectionRequest);

    /**
     * <p>
     * Enables or disables integration with a service that can be integrated with DevOps Guru. The one service that can
     * be integrated with DevOps Guru is AWS Systems Manager, which can be used to create an OpsItem for each generated
     * insight.
     * </p>
     * 
     * @param updateServiceIntegrationRequest
     * @return Result of the UpdateServiceIntegration operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.UpdateServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateServiceIntegrationResult updateServiceIntegration(UpdateServiceIntegrationRequest updateServiceIntegrationRequest);

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

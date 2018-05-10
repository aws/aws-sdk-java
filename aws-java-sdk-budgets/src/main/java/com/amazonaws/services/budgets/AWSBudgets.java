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
package com.amazonaws.services.budgets;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.budgets.model.*;

/**
 * Interface for accessing AWSBudgets.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.budgets.AbstractAWSBudgets} instead.
 * </p>
 * <p>
 * <p>
 * Budgets enable you to plan your service usage, service costs, and your RI utilization. You can also track how close
 * your plan is to your budgeted amount or to the free tier limits. Budgets provide you with a quick way to see your
 * usage-to-date and current estimated charges from AWS and to see how much your predicted usage accrues in charges by
 * the end of the month. Budgets also compare current estimates and charges to the amount that you indicated you want to
 * use or spend and lets you see how much of your budget has been used. AWS updates your budget status several times a
 * day. Budgets track your unblended costs, subscriptions, and refunds. You can create the following types of budgets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Cost budgets allow you to say how much you want to spend on a service.
 * </p>
 * </li>
 * <li>
 * <p>
 * Usage budgets allow you to say how many hours you want to use for one or more services.
 * </p>
 * </li>
 * <li>
 * <p>
 * RI utilization budgets allow you to define a utilization threshold and receive alerts when RIs are tracking below
 * that threshold.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can create up to 20,000 budgets per AWS master account. Your first two budgets are free of charge. Each
 * additional budget costs $0.02 per day. You can set up optional notifications that warn you if you exceed, or are
 * forecasted to exceed, your budgeted amount. You can have notifications sent to an Amazon SNS topic, to an email
 * address, or to both. For more information, see <a
 * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-sns-policy.html">Creating an Amazon SNS
 * Topic for Budget Notifications</a>. AWS Free Tier usage alerts via AWS Budgets are provided for you, and do not count
 * toward your budget limits.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The AWS Budgets API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://budgets.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about costs associated with the AWS Budgets API, see <a
 * href="https://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management Pricing</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBudgets {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "budgets";

    /**
     * Overrides the default endpoint for this client ("budgets.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "budgets.amazonaws.com") or a full URL, including the protocol (ex:
     * "budgets.amazonaws.com"). If the protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "budgets.amazonaws.com") or a full URL, including the protocol (ex:
     *        "budgets.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSBudgets#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Creates a budget and, if included, notifications and subscribers.
     * </p>
     * 
     * @param createBudgetRequest
     *        Request of CreateBudget
     * @return Result of the CreateBudget operation returned by the service.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws CreationLimitExceededException
     *         You've exceeded the notification or subscriber limit.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @sample AWSBudgets.CreateBudget
     */
    CreateBudgetResult createBudget(CreateBudgetRequest createBudgetRequest);

    /**
     * <p>
     * Creates a notification. You must create the budget before you create the associated notification.
     * </p>
     * 
     * @param createNotificationRequest
     *        Request of CreateNotification
     * @return Result of the CreateNotification operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws CreationLimitExceededException
     *         You've exceeded the notification or subscriber limit.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @sample AWSBudgets.CreateNotification
     */
    CreateNotificationResult createNotification(CreateNotificationRequest createNotificationRequest);

    /**
     * <p>
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     * </p>
     * 
     * @param createSubscriberRequest
     *        Request of CreateSubscriber
     * @return Result of the CreateSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws CreationLimitExceededException
     *         You've exceeded the notification or subscriber limit.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.CreateSubscriber
     */
    CreateSubscriberResult createSubscriber(CreateSubscriberRequest createSubscriberRequest);

    /**
     * <p>
     * Deletes a budget. You can delete your budget at any time.
     * </p>
     * <p>
     * <b>Deleting a budget also deletes the notifications and subscribers associated with that budget.</b>
     * </p>
     * 
     * @param deleteBudgetRequest
     *        Request of DeleteBudget
     * @return Result of the DeleteBudget operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.DeleteBudget
     */
    DeleteBudgetResult deleteBudget(DeleteBudgetRequest deleteBudgetRequest);

    /**
     * <p>
     * Deletes a notification.
     * </p>
     * <p>
     * <b>Deleting a notification also deletes the subscribers associated with the notification.</b>
     * </p>
     * 
     * @param deleteNotificationRequest
     *        Request of DeleteNotification
     * @return Result of the DeleteNotification operation returned by the service.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.DeleteNotification
     */
    DeleteNotificationResult deleteNotification(DeleteNotificationRequest deleteNotificationRequest);

    /**
     * <p>
     * Deletes a subscriber.
     * </p>
     * <p>
     * <b>Deleting the last subscriber to a notification also deletes the notification.</b>
     * </p>
     * 
     * @param deleteSubscriberRequest
     *        Request of DeleteSubscriber
     * @return Result of the DeleteSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.DeleteSubscriber
     */
    DeleteSubscriberResult deleteSubscriber(DeleteSubscriberRequest deleteSubscriberRequest);

    /**
     * <p>
     * Describes a budget.
     * </p>
     * 
     * @param describeBudgetRequest
     *        Request of DescribeBudget
     * @return Result of the DescribeBudget operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.DescribeBudget
     */
    DescribeBudgetResult describeBudget(DescribeBudgetRequest describeBudgetRequest);

    /**
     * <p>
     * Lists the budgets associated with an account.
     * </p>
     * 
     * @param describeBudgetsRequest
     *        Request of DescribeBudgets
     * @return Result of the DescribeBudgets operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid.
     * @throws ExpiredNextTokenException
     *         The pagination token expired.
     * @sample AWSBudgets.DescribeBudgets
     */
    DescribeBudgetsResult describeBudgets(DescribeBudgetsRequest describeBudgetsRequest);

    /**
     * <p>
     * Lists the notifications associated with a budget.
     * </p>
     * 
     * @param describeNotificationsForBudgetRequest
     *        Request of DescribeNotificationsForBudget
     * @return Result of the DescribeNotificationsForBudget operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid.
     * @throws ExpiredNextTokenException
     *         The pagination token expired.
     * @sample AWSBudgets.DescribeNotificationsForBudget
     */
    DescribeNotificationsForBudgetResult describeNotificationsForBudget(DescribeNotificationsForBudgetRequest describeNotificationsForBudgetRequest);

    /**
     * <p>
     * Lists the subscribers associated with a notification.
     * </p>
     * 
     * @param describeSubscribersForNotificationRequest
     *        Request of DescribeSubscribersForNotification
     * @return Result of the DescribeSubscribersForNotification operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid.
     * @throws ExpiredNextTokenException
     *         The pagination token expired.
     * @sample AWSBudgets.DescribeSubscribersForNotification
     */
    DescribeSubscribersForNotificationResult describeSubscribersForNotification(
            DescribeSubscribersForNotificationRequest describeSubscribersForNotificationRequest);

    /**
     * <p>
     * Updates a budget. You can change every part of a budget except for the <code>budgetName</code> and the
     * <code>calculatedSpend</code>. When a budget is modified, the <code>calculatedSpend</code> drops to zero until AWS
     * has new usage data to use for forecasting.
     * </p>
     * 
     * @param updateBudgetRequest
     *        Request of UpdateBudget
     * @return Result of the UpdateBudget operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.UpdateBudget
     */
    UpdateBudgetResult updateBudget(UpdateBudgetRequest updateBudgetRequest);

    /**
     * <p>
     * Updates a notification.
     * </p>
     * 
     * @param updateNotificationRequest
     *        Request of UpdateNotification
     * @return Result of the UpdateNotification operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @sample AWSBudgets.UpdateNotification
     */
    UpdateNotificationResult updateNotification(UpdateNotificationRequest updateNotificationRequest);

    /**
     * <p>
     * Updates a subscriber.
     * </p>
     * 
     * @param updateSubscriberRequest
     *        Request of UpdateSubscriber
     * @return Result of the UpdateSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @sample AWSBudgets.UpdateSubscriber
     */
    UpdateSubscriberResult updateSubscriber(UpdateSubscriberRequest updateSubscriberRequest);

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

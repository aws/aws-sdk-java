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

import com.amazonaws.services.budgets.model.*;

/**
 * Interface for accessing AWSBudgets asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.budgets.AbstractAWSBudgetsAsync} instead.
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
public interface AWSBudgetsAsync extends AWSBudgets {

    /**
     * <p>
     * Creates a budget and, if included, notifications and subscribers.
     * </p>
     * 
     * @param createBudgetRequest
     *        Request of CreateBudget
     * @return A Java Future containing the result of the CreateBudget operation returned by the service.
     * @sample AWSBudgetsAsync.CreateBudget
     */
    java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest createBudgetRequest);

    /**
     * <p>
     * Creates a budget and, if included, notifications and subscribers.
     * </p>
     * 
     * @param createBudgetRequest
     *        Request of CreateBudget
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBudget operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.CreateBudget
     */
    java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest createBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBudgetRequest, CreateBudgetResult> asyncHandler);

    /**
     * <p>
     * Creates a notification. You must create the budget before you create the associated notification.
     * </p>
     * 
     * @param createNotificationRequest
     *        Request of CreateNotification
     * @return A Java Future containing the result of the CreateNotification operation returned by the service.
     * @sample AWSBudgetsAsync.CreateNotification
     */
    java.util.concurrent.Future<CreateNotificationResult> createNotificationAsync(CreateNotificationRequest createNotificationRequest);

    /**
     * <p>
     * Creates a notification. You must create the budget before you create the associated notification.
     * </p>
     * 
     * @param createNotificationRequest
     *        Request of CreateNotification
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNotification operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.CreateNotification
     */
    java.util.concurrent.Future<CreateNotificationResult> createNotificationAsync(CreateNotificationRequest createNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNotificationRequest, CreateNotificationResult> asyncHandler);

    /**
     * <p>
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     * </p>
     * 
     * @param createSubscriberRequest
     *        Request of CreateSubscriber
     * @return A Java Future containing the result of the CreateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsync.CreateSubscriber
     */
    java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest createSubscriberRequest);

    /**
     * <p>
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     * </p>
     * 
     * @param createSubscriberRequest
     *        Request of CreateSubscriber
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.CreateSubscriber
     */
    java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest createSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriberRequest, CreateSubscriberResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteBudget operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteBudget
     */
    java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest deleteBudgetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBudget operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DeleteBudget
     */
    java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest deleteBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBudgetRequest, DeleteBudgetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteNotification operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteNotification
     */
    java.util.concurrent.Future<DeleteNotificationResult> deleteNotificationAsync(DeleteNotificationRequest deleteNotificationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotification operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DeleteNotification
     */
    java.util.concurrent.Future<DeleteNotificationResult> deleteNotificationAsync(DeleteNotificationRequest deleteNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationRequest, DeleteNotificationResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSubscriber operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteSubscriber
     */
    java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest deleteSubscriberRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriber operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DeleteSubscriber
     */
    java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest deleteSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriberRequest, DeleteSubscriberResult> asyncHandler);

    /**
     * <p>
     * Describes a budget.
     * </p>
     * 
     * @param describeBudgetRequest
     *        Request of DescribeBudget
     * @return A Java Future containing the result of the DescribeBudget operation returned by the service.
     * @sample AWSBudgetsAsync.DescribeBudget
     */
    java.util.concurrent.Future<DescribeBudgetResult> describeBudgetAsync(DescribeBudgetRequest describeBudgetRequest);

    /**
     * <p>
     * Describes a budget.
     * </p>
     * 
     * @param describeBudgetRequest
     *        Request of DescribeBudget
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBudget operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DescribeBudget
     */
    java.util.concurrent.Future<DescribeBudgetResult> describeBudgetAsync(DescribeBudgetRequest describeBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetRequest, DescribeBudgetResult> asyncHandler);

    /**
     * <p>
     * Lists the budgets associated with an account.
     * </p>
     * 
     * @param describeBudgetsRequest
     *        Request of DescribeBudgets
     * @return A Java Future containing the result of the DescribeBudgets operation returned by the service.
     * @sample AWSBudgetsAsync.DescribeBudgets
     */
    java.util.concurrent.Future<DescribeBudgetsResult> describeBudgetsAsync(DescribeBudgetsRequest describeBudgetsRequest);

    /**
     * <p>
     * Lists the budgets associated with an account.
     * </p>
     * 
     * @param describeBudgetsRequest
     *        Request of DescribeBudgets
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBudgets operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.DescribeBudgets
     */
    java.util.concurrent.Future<DescribeBudgetsResult> describeBudgetsAsync(DescribeBudgetsRequest describeBudgetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetsRequest, DescribeBudgetsResult> asyncHandler);

    /**
     * <p>
     * Lists the notifications associated with a budget.
     * </p>
     * 
     * @param describeNotificationsForBudgetRequest
     *        Request of DescribeNotificationsForBudget
     * @return A Java Future containing the result of the DescribeNotificationsForBudget operation returned by the
     *         service.
     * @sample AWSBudgetsAsync.DescribeNotificationsForBudget
     */
    java.util.concurrent.Future<DescribeNotificationsForBudgetResult> describeNotificationsForBudgetAsync(
            DescribeNotificationsForBudgetRequest describeNotificationsForBudgetRequest);

    /**
     * <p>
     * Lists the notifications associated with a budget.
     * </p>
     * 
     * @param describeNotificationsForBudgetRequest
     *        Request of DescribeNotificationsForBudget
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotificationsForBudget operation returned by the
     *         service.
     * @sample AWSBudgetsAsyncHandler.DescribeNotificationsForBudget
     */
    java.util.concurrent.Future<DescribeNotificationsForBudgetResult> describeNotificationsForBudgetAsync(
            DescribeNotificationsForBudgetRequest describeNotificationsForBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationsForBudgetRequest, DescribeNotificationsForBudgetResult> asyncHandler);

    /**
     * <p>
     * Lists the subscribers associated with a notification.
     * </p>
     * 
     * @param describeSubscribersForNotificationRequest
     *        Request of DescribeSubscribersForNotification
     * @return A Java Future containing the result of the DescribeSubscribersForNotification operation returned by the
     *         service.
     * @sample AWSBudgetsAsync.DescribeSubscribersForNotification
     */
    java.util.concurrent.Future<DescribeSubscribersForNotificationResult> describeSubscribersForNotificationAsync(
            DescribeSubscribersForNotificationRequest describeSubscribersForNotificationRequest);

    /**
     * <p>
     * Lists the subscribers associated with a notification.
     * </p>
     * 
     * @param describeSubscribersForNotificationRequest
     *        Request of DescribeSubscribersForNotification
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubscribersForNotification operation returned by the
     *         service.
     * @sample AWSBudgetsAsyncHandler.DescribeSubscribersForNotification
     */
    java.util.concurrent.Future<DescribeSubscribersForNotificationResult> describeSubscribersForNotificationAsync(
            DescribeSubscribersForNotificationRequest describeSubscribersForNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscribersForNotificationRequest, DescribeSubscribersForNotificationResult> asyncHandler);

    /**
     * <p>
     * Updates a budget. You can change every part of a budget except for the <code>budgetName</code> and the
     * <code>calculatedSpend</code>. When a budget is modified, the <code>calculatedSpend</code> drops to zero until AWS
     * has new usage data to use for forecasting.
     * </p>
     * 
     * @param updateBudgetRequest
     *        Request of UpdateBudget
     * @return A Java Future containing the result of the UpdateBudget operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateBudget
     */
    java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest updateBudgetRequest);

    /**
     * <p>
     * Updates a budget. You can change every part of a budget except for the <code>budgetName</code> and the
     * <code>calculatedSpend</code>. When a budget is modified, the <code>calculatedSpend</code> drops to zero until AWS
     * has new usage data to use for forecasting.
     * </p>
     * 
     * @param updateBudgetRequest
     *        Request of UpdateBudget
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBudget operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.UpdateBudget
     */
    java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest updateBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBudgetRequest, UpdateBudgetResult> asyncHandler);

    /**
     * <p>
     * Updates a notification.
     * </p>
     * 
     * @param updateNotificationRequest
     *        Request of UpdateNotification
     * @return A Java Future containing the result of the UpdateNotification operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateNotification
     */
    java.util.concurrent.Future<UpdateNotificationResult> updateNotificationAsync(UpdateNotificationRequest updateNotificationRequest);

    /**
     * <p>
     * Updates a notification.
     * </p>
     * 
     * @param updateNotificationRequest
     *        Request of UpdateNotification
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotification operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.UpdateNotification
     */
    java.util.concurrent.Future<UpdateNotificationResult> updateNotificationAsync(UpdateNotificationRequest updateNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotificationRequest, UpdateNotificationResult> asyncHandler);

    /**
     * <p>
     * Updates a subscriber.
     * </p>
     * 
     * @param updateSubscriberRequest
     *        Request of UpdateSubscriber
     * @return A Java Future containing the result of the UpdateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateSubscriber
     */
    java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest updateSubscriberRequest);

    /**
     * <p>
     * Updates a subscriber.
     * </p>
     * 
     * @param updateSubscriberRequest
     *        Request of UpdateSubscriber
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsyncHandler.UpdateSubscriber
     */
    java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest updateSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriberRequest, UpdateSubscriberResult> asyncHandler);

}

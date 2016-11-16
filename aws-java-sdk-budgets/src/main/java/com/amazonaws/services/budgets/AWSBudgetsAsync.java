/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * All public APIs for AWS Budgets
 */
public interface AWSBudgetsAsync extends AWSBudgets {

    /**
     * Create a new budget
     * 
     * @param createBudgetRequest
     *        Request of CreateBudget
     * @return A Java Future containing the result of the CreateBudget operation returned by the service.
     * @sample AWSBudgetsAsync.CreateBudget
     */
    java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest createBudgetRequest);

    /**
     * Create a new budget
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
     * Create a new Notification with subscribers for a budget
     * 
     * @param createNotificationRequest
     *        Request of CreateNotification
     * @return A Java Future containing the result of the CreateNotification operation returned by the service.
     * @sample AWSBudgetsAsync.CreateNotification
     */
    java.util.concurrent.Future<CreateNotificationResult> createNotificationAsync(CreateNotificationRequest createNotificationRequest);

    /**
     * Create a new Notification with subscribers for a budget
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
     * Create a new Subscriber for a notification
     * 
     * @param createSubscriberRequest
     *        Request of CreateSubscriber
     * @return A Java Future containing the result of the CreateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsync.CreateSubscriber
     */
    java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest createSubscriberRequest);

    /**
     * Create a new Subscriber for a notification
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
     * Delete a budget and related notifications
     * 
     * @param deleteBudgetRequest
     *        Request of DeleteBudget
     * @return A Java Future containing the result of the DeleteBudget operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteBudget
     */
    java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest deleteBudgetRequest);

    /**
     * Delete a budget and related notifications
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
     * Delete a notification and related subscribers
     * 
     * @param deleteNotificationRequest
     *        Request of DeleteNotification
     * @return A Java Future containing the result of the DeleteNotification operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteNotification
     */
    java.util.concurrent.Future<DeleteNotificationResult> deleteNotificationAsync(DeleteNotificationRequest deleteNotificationRequest);

    /**
     * Delete a notification and related subscribers
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
     * Delete a Subscriber for a notification
     * 
     * @param deleteSubscriberRequest
     *        Request of DeleteSubscriber
     * @return A Java Future containing the result of the DeleteSubscriber operation returned by the service.
     * @sample AWSBudgetsAsync.DeleteSubscriber
     */
    java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest deleteSubscriberRequest);

    /**
     * Delete a Subscriber for a notification
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
     * Get a single budget
     * 
     * @param describeBudgetRequest
     *        Request of DescribeBudget
     * @return A Java Future containing the result of the DescribeBudget operation returned by the service.
     * @sample AWSBudgetsAsync.DescribeBudget
     */
    java.util.concurrent.Future<DescribeBudgetResult> describeBudgetAsync(DescribeBudgetRequest describeBudgetRequest);

    /**
     * Get a single budget
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
     * Get all budgets for an account
     * 
     * @param describeBudgetsRequest
     *        Request of DescribeBudgets
     * @return A Java Future containing the result of the DescribeBudgets operation returned by the service.
     * @sample AWSBudgetsAsync.DescribeBudgets
     */
    java.util.concurrent.Future<DescribeBudgetsResult> describeBudgetsAsync(DescribeBudgetsRequest describeBudgetsRequest);

    /**
     * Get all budgets for an account
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
     * Get notifications of a budget
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
     * Get notifications of a budget
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
     * Get subscribers of a notification
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
     * Get subscribers of a notification
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
     * Update the information of a budget already created
     * 
     * @param updateBudgetRequest
     *        Request of UpdateBudget
     * @return A Java Future containing the result of the UpdateBudget operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateBudget
     */
    java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest updateBudgetRequest);

    /**
     * Update the information of a budget already created
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
     * Update the information about a notification already created
     * 
     * @param updateNotificationRequest
     *        Request of UpdateNotification
     * @return A Java Future containing the result of the UpdateNotification operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateNotification
     */
    java.util.concurrent.Future<UpdateNotificationResult> updateNotificationAsync(UpdateNotificationRequest updateNotificationRequest);

    /**
     * Update the information about a notification already created
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
     * Update a subscriber
     * 
     * @param updateSubscriberRequest
     *        Request of UpdateSubscriber
     * @return A Java Future containing the result of the UpdateSubscriber operation returned by the service.
     * @sample AWSBudgetsAsync.UpdateSubscriber
     */
    java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest updateSubscriberRequest);

    /**
     * Update a subscriber
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

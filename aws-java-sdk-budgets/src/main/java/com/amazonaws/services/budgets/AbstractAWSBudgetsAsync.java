/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Abstract implementation of {@code AWSBudgetsAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBudgetsAsync extends AbstractAWSBudgets implements AWSBudgetsAsync {

    protected AbstractAWSBudgetsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest request) {

        return createBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBudgetRequest, CreateBudgetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateNotificationResult> createNotificationAsync(CreateNotificationRequest request) {

        return createNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotificationResult> createNotificationAsync(CreateNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNotificationRequest, CreateNotificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest request) {

        return createSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriberRequest, CreateSubscriberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest request) {

        return deleteBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBudgetRequest, DeleteBudgetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationResult> deleteNotificationAsync(DeleteNotificationRequest request) {

        return deleteNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationResult> deleteNotificationAsync(DeleteNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationRequest, DeleteNotificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest request) {

        return deleteSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriberRequest, DeleteSubscriberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetResult> describeBudgetAsync(DescribeBudgetRequest request) {

        return describeBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetResult> describeBudgetAsync(DescribeBudgetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetRequest, DescribeBudgetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetPerformanceHistoryResult> describeBudgetPerformanceHistoryAsync(
            DescribeBudgetPerformanceHistoryRequest request) {

        return describeBudgetPerformanceHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetPerformanceHistoryResult> describeBudgetPerformanceHistoryAsync(
            DescribeBudgetPerformanceHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetPerformanceHistoryRequest, DescribeBudgetPerformanceHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetsResult> describeBudgetsAsync(DescribeBudgetsRequest request) {

        return describeBudgetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetsResult> describeBudgetsAsync(DescribeBudgetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBudgetsRequest, DescribeBudgetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationsForBudgetResult> describeNotificationsForBudgetAsync(DescribeNotificationsForBudgetRequest request) {

        return describeNotificationsForBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationsForBudgetResult> describeNotificationsForBudgetAsync(DescribeNotificationsForBudgetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationsForBudgetRequest, DescribeNotificationsForBudgetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscribersForNotificationResult> describeSubscribersForNotificationAsync(
            DescribeSubscribersForNotificationRequest request) {

        return describeSubscribersForNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscribersForNotificationResult> describeSubscribersForNotificationAsync(
            DescribeSubscribersForNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscribersForNotificationRequest, DescribeSubscribersForNotificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest request) {

        return updateBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateBudgetRequest, UpdateBudgetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationResult> updateNotificationAsync(UpdateNotificationRequest request) {

        return updateNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationResult> updateNotificationAsync(UpdateNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateNotificationRequest, UpdateNotificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest request) {

        return updateSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriberRequest, UpdateSubscriberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

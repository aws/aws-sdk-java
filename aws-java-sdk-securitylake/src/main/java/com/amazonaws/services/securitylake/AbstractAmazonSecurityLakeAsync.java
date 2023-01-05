/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake;

import javax.annotation.Generated;

import com.amazonaws.services.securitylake.model.*;

/**
 * Abstract implementation of {@code AmazonSecurityLakeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSecurityLakeAsync extends AbstractAmazonSecurityLake implements AmazonSecurityLakeAsync {

    protected AbstractAmazonSecurityLakeAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAwsLogSourceResult> createAwsLogSourceAsync(CreateAwsLogSourceRequest request) {

        return createAwsLogSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAwsLogSourceResult> createAwsLogSourceAsync(CreateAwsLogSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAwsLogSourceRequest, CreateAwsLogSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCustomLogSourceResult> createCustomLogSourceAsync(CreateCustomLogSourceRequest request) {

        return createCustomLogSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomLogSourceResult> createCustomLogSourceAsync(CreateCustomLogSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCustomLogSourceRequest, CreateCustomLogSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeResult> createDatalakeAsync(CreateDatalakeRequest request) {

        return createDatalakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeResult> createDatalakeAsync(CreateDatalakeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatalakeRequest, CreateDatalakeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeAutoEnableResult> createDatalakeAutoEnableAsync(CreateDatalakeAutoEnableRequest request) {

        return createDatalakeAutoEnableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeAutoEnableResult> createDatalakeAutoEnableAsync(CreateDatalakeAutoEnableRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatalakeAutoEnableRequest, CreateDatalakeAutoEnableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeDelegatedAdminResult> createDatalakeDelegatedAdminAsync(CreateDatalakeDelegatedAdminRequest request) {

        return createDatalakeDelegatedAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeDelegatedAdminResult> createDatalakeDelegatedAdminAsync(CreateDatalakeDelegatedAdminRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatalakeDelegatedAdminRequest, CreateDatalakeDelegatedAdminResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeExceptionsSubscriptionResult> createDatalakeExceptionsSubscriptionAsync(
            CreateDatalakeExceptionsSubscriptionRequest request) {

        return createDatalakeExceptionsSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatalakeExceptionsSubscriptionResult> createDatalakeExceptionsSubscriptionAsync(
            CreateDatalakeExceptionsSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDatalakeExceptionsSubscriptionRequest, CreateDatalakeExceptionsSubscriptionResult> asyncHandler) {

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
    public java.util.concurrent.Future<CreateSubscriptionNotificationConfigurationResult> createSubscriptionNotificationConfigurationAsync(
            CreateSubscriptionNotificationConfigurationRequest request) {

        return createSubscriptionNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionNotificationConfigurationResult> createSubscriptionNotificationConfigurationAsync(
            CreateSubscriptionNotificationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionNotificationConfigurationRequest, CreateSubscriptionNotificationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAwsLogSourceResult> deleteAwsLogSourceAsync(DeleteAwsLogSourceRequest request) {

        return deleteAwsLogSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAwsLogSourceResult> deleteAwsLogSourceAsync(DeleteAwsLogSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAwsLogSourceRequest, DeleteAwsLogSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomLogSourceResult> deleteCustomLogSourceAsync(DeleteCustomLogSourceRequest request) {

        return deleteCustomLogSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomLogSourceResult> deleteCustomLogSourceAsync(DeleteCustomLogSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomLogSourceRequest, DeleteCustomLogSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeResult> deleteDatalakeAsync(DeleteDatalakeRequest request) {

        return deleteDatalakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeResult> deleteDatalakeAsync(DeleteDatalakeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatalakeRequest, DeleteDatalakeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeAutoEnableResult> deleteDatalakeAutoEnableAsync(DeleteDatalakeAutoEnableRequest request) {

        return deleteDatalakeAutoEnableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeAutoEnableResult> deleteDatalakeAutoEnableAsync(DeleteDatalakeAutoEnableRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatalakeAutoEnableRequest, DeleteDatalakeAutoEnableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeDelegatedAdminResult> deleteDatalakeDelegatedAdminAsync(DeleteDatalakeDelegatedAdminRequest request) {

        return deleteDatalakeDelegatedAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeDelegatedAdminResult> deleteDatalakeDelegatedAdminAsync(DeleteDatalakeDelegatedAdminRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatalakeDelegatedAdminRequest, DeleteDatalakeDelegatedAdminResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeExceptionsSubscriptionResult> deleteDatalakeExceptionsSubscriptionAsync(
            DeleteDatalakeExceptionsSubscriptionRequest request) {

        return deleteDatalakeExceptionsSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatalakeExceptionsSubscriptionResult> deleteDatalakeExceptionsSubscriptionAsync(
            DeleteDatalakeExceptionsSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDatalakeExceptionsSubscriptionRequest, DeleteDatalakeExceptionsSubscriptionResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteSubscriptionNotificationConfigurationResult> deleteSubscriptionNotificationConfigurationAsync(
            DeleteSubscriptionNotificationConfigurationRequest request) {

        return deleteSubscriptionNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionNotificationConfigurationResult> deleteSubscriptionNotificationConfigurationAsync(
            DeleteSubscriptionNotificationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionNotificationConfigurationRequest, DeleteSubscriptionNotificationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeResult> getDatalakeAsync(GetDatalakeRequest request) {

        return getDatalakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeResult> getDatalakeAsync(GetDatalakeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeRequest, GetDatalakeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeAutoEnableResult> getDatalakeAutoEnableAsync(GetDatalakeAutoEnableRequest request) {

        return getDatalakeAutoEnableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeAutoEnableResult> getDatalakeAutoEnableAsync(GetDatalakeAutoEnableRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeAutoEnableRequest, GetDatalakeAutoEnableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeExceptionsExpiryResult> getDatalakeExceptionsExpiryAsync(GetDatalakeExceptionsExpiryRequest request) {

        return getDatalakeExceptionsExpiryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeExceptionsExpiryResult> getDatalakeExceptionsExpiryAsync(GetDatalakeExceptionsExpiryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeExceptionsExpiryRequest, GetDatalakeExceptionsExpiryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeExceptionsSubscriptionResult> getDatalakeExceptionsSubscriptionAsync(
            GetDatalakeExceptionsSubscriptionRequest request) {

        return getDatalakeExceptionsSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeExceptionsSubscriptionResult> getDatalakeExceptionsSubscriptionAsync(
            GetDatalakeExceptionsSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeExceptionsSubscriptionRequest, GetDatalakeExceptionsSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeStatusResult> getDatalakeStatusAsync(GetDatalakeStatusRequest request) {

        return getDatalakeStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatalakeStatusResult> getDatalakeStatusAsync(GetDatalakeStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeStatusRequest, GetDatalakeStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSubscriberResult> getSubscriberAsync(GetSubscriberRequest request) {

        return getSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriberResult> getSubscriberAsync(GetSubscriberRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSubscriberRequest, GetSubscriberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatalakeExceptionsResult> listDatalakeExceptionsAsync(ListDatalakeExceptionsRequest request) {

        return listDatalakeExceptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatalakeExceptionsResult> listDatalakeExceptionsAsync(ListDatalakeExceptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatalakeExceptionsRequest, ListDatalakeExceptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLogSourcesResult> listLogSourcesAsync(ListLogSourcesRequest request) {

        return listLogSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLogSourcesResult> listLogSourcesAsync(ListLogSourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLogSourcesRequest, ListLogSourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSubscribersResult> listSubscribersAsync(ListSubscribersRequest request) {

        return listSubscribersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscribersResult> listSubscribersAsync(ListSubscribersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSubscribersRequest, ListSubscribersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeResult> updateDatalakeAsync(UpdateDatalakeRequest request) {

        return updateDatalakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeResult> updateDatalakeAsync(UpdateDatalakeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDatalakeRequest, UpdateDatalakeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeExceptionsExpiryResult> updateDatalakeExceptionsExpiryAsync(UpdateDatalakeExceptionsExpiryRequest request) {

        return updateDatalakeExceptionsExpiryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeExceptionsExpiryResult> updateDatalakeExceptionsExpiryAsync(UpdateDatalakeExceptionsExpiryRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDatalakeExceptionsExpiryRequest, UpdateDatalakeExceptionsExpiryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeExceptionsSubscriptionResult> updateDatalakeExceptionsSubscriptionAsync(
            UpdateDatalakeExceptionsSubscriptionRequest request) {

        return updateDatalakeExceptionsSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatalakeExceptionsSubscriptionResult> updateDatalakeExceptionsSubscriptionAsync(
            UpdateDatalakeExceptionsSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDatalakeExceptionsSubscriptionRequest, UpdateDatalakeExceptionsSubscriptionResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionNotificationConfigurationResult> updateSubscriptionNotificationConfigurationAsync(
            UpdateSubscriptionNotificationConfigurationRequest request) {

        return updateSubscriptionNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionNotificationConfigurationResult> updateSubscriptionNotificationConfigurationAsync(
            UpdateSubscriptionNotificationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionNotificationConfigurationRequest, UpdateSubscriptionNotificationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

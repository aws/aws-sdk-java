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
    public java.util.concurrent.Future<CreateDataLakeResult> createDataLakeAsync(CreateDataLakeRequest request) {

        return createDataLakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeResult> createDataLakeAsync(CreateDataLakeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataLakeRequest, CreateDataLakeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeExceptionSubscriptionResult> createDataLakeExceptionSubscriptionAsync(
            CreateDataLakeExceptionSubscriptionRequest request) {

        return createDataLakeExceptionSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeExceptionSubscriptionResult> createDataLakeExceptionSubscriptionAsync(
            CreateDataLakeExceptionSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataLakeExceptionSubscriptionRequest, CreateDataLakeExceptionSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeOrganizationConfigurationResult> createDataLakeOrganizationConfigurationAsync(
            CreateDataLakeOrganizationConfigurationRequest request) {

        return createDataLakeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataLakeOrganizationConfigurationResult> createDataLakeOrganizationConfigurationAsync(
            CreateDataLakeOrganizationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataLakeOrganizationConfigurationRequest, CreateDataLakeOrganizationConfigurationResult> asyncHandler) {

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
    public java.util.concurrent.Future<CreateSubscriberNotificationResult> createSubscriberNotificationAsync(CreateSubscriberNotificationRequest request) {

        return createSubscriberNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberNotificationResult> createSubscriberNotificationAsync(CreateSubscriberNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriberNotificationRequest, CreateSubscriberNotificationResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteDataLakeResult> deleteDataLakeAsync(DeleteDataLakeRequest request) {

        return deleteDataLakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeResult> deleteDataLakeAsync(DeleteDataLakeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataLakeRequest, DeleteDataLakeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeExceptionSubscriptionResult> deleteDataLakeExceptionSubscriptionAsync(
            DeleteDataLakeExceptionSubscriptionRequest request) {

        return deleteDataLakeExceptionSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeExceptionSubscriptionResult> deleteDataLakeExceptionSubscriptionAsync(
            DeleteDataLakeExceptionSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataLakeExceptionSubscriptionRequest, DeleteDataLakeExceptionSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeOrganizationConfigurationResult> deleteDataLakeOrganizationConfigurationAsync(
            DeleteDataLakeOrganizationConfigurationRequest request) {

        return deleteDataLakeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataLakeOrganizationConfigurationResult> deleteDataLakeOrganizationConfigurationAsync(
            DeleteDataLakeOrganizationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataLakeOrganizationConfigurationRequest, DeleteDataLakeOrganizationConfigurationResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteSubscriberNotificationResult> deleteSubscriberNotificationAsync(DeleteSubscriberNotificationRequest request) {

        return deleteSubscriberNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberNotificationResult> deleteSubscriberNotificationAsync(DeleteSubscriberNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriberNotificationRequest, DeleteSubscriberNotificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterDataLakeDelegatedAdministratorResult> deregisterDataLakeDelegatedAdministratorAsync(
            DeregisterDataLakeDelegatedAdministratorRequest request) {

        return deregisterDataLakeDelegatedAdministratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterDataLakeDelegatedAdministratorResult> deregisterDataLakeDelegatedAdministratorAsync(
            DeregisterDataLakeDelegatedAdministratorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterDataLakeDelegatedAdministratorRequest, DeregisterDataLakeDelegatedAdministratorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeExceptionSubscriptionResult> getDataLakeExceptionSubscriptionAsync(
            GetDataLakeExceptionSubscriptionRequest request) {

        return getDataLakeExceptionSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeExceptionSubscriptionResult> getDataLakeExceptionSubscriptionAsync(
            GetDataLakeExceptionSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataLakeExceptionSubscriptionRequest, GetDataLakeExceptionSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeOrganizationConfigurationResult> getDataLakeOrganizationConfigurationAsync(
            GetDataLakeOrganizationConfigurationRequest request) {

        return getDataLakeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeOrganizationConfigurationResult> getDataLakeOrganizationConfigurationAsync(
            GetDataLakeOrganizationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataLakeOrganizationConfigurationRequest, GetDataLakeOrganizationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSourcesResult> getDataLakeSourcesAsync(GetDataLakeSourcesRequest request) {

        return getDataLakeSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataLakeSourcesResult> getDataLakeSourcesAsync(GetDataLakeSourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataLakeSourcesRequest, GetDataLakeSourcesResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListDataLakeExceptionsResult> listDataLakeExceptionsAsync(ListDataLakeExceptionsRequest request) {

        return listDataLakeExceptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataLakeExceptionsResult> listDataLakeExceptionsAsync(ListDataLakeExceptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataLakeExceptionsRequest, ListDataLakeExceptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataLakesResult> listDataLakesAsync(ListDataLakesRequest request) {

        return listDataLakesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataLakesResult> listDataLakesAsync(ListDataLakesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataLakesRequest, ListDataLakesResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterDataLakeDelegatedAdministratorResult> registerDataLakeDelegatedAdministratorAsync(
            RegisterDataLakeDelegatedAdministratorRequest request) {

        return registerDataLakeDelegatedAdministratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterDataLakeDelegatedAdministratorResult> registerDataLakeDelegatedAdministratorAsync(
            RegisterDataLakeDelegatedAdministratorRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterDataLakeDelegatedAdministratorRequest, RegisterDataLakeDelegatedAdministratorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDataLakeResult> updateDataLakeAsync(UpdateDataLakeRequest request) {

        return updateDataLakeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataLakeResult> updateDataLakeAsync(UpdateDataLakeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDataLakeRequest, UpdateDataLakeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDataLakeExceptionSubscriptionResult> updateDataLakeExceptionSubscriptionAsync(
            UpdateDataLakeExceptionSubscriptionRequest request) {

        return updateDataLakeExceptionSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataLakeExceptionSubscriptionResult> updateDataLakeExceptionSubscriptionAsync(
            UpdateDataLakeExceptionSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDataLakeExceptionSubscriptionRequest, UpdateDataLakeExceptionSubscriptionResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateSubscriberNotificationResult> updateSubscriberNotificationAsync(UpdateSubscriberNotificationRequest request) {

        return updateSubscriberNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberNotificationResult> updateSubscriberNotificationAsync(UpdateSubscriberNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriberNotificationRequest, UpdateSubscriberNotificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

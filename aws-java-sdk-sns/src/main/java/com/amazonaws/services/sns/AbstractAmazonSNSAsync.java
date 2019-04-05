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
package com.amazonaws.services.sns;

import javax.annotation.Generated;

import com.amazonaws.services.sns.model.*;

/**
 * Abstract implementation of {@code AmazonSNSAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSNSAsync extends AbstractAmazonSNS implements AmazonSNSAsync {

    protected AbstractAmazonSNSAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request) {

        return addPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the AddPermission operation.
     *
     * @see #addPermissionAsync(AddPermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String topicArn, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames) {

        return addPermissionAsync(new AddPermissionRequest().withTopicArn(topicArn).withLabel(label).withAWSAccountIds(aWSAccountIds)
                .withActionNames(actionNames));
    }

    /**
     * Simplified method form for invoking the AddPermission operation with an AsyncHandler.
     *
     * @see #addPermissionAsync(AddPermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String topicArn, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames, com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {

        return addPermissionAsync(
                new AddPermissionRequest().withTopicArn(topicArn).withLabel(label).withAWSAccountIds(aWSAccountIds).withActionNames(actionNames), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(CheckIfPhoneNumberIsOptedOutRequest request) {

        return checkIfPhoneNumberIsOptedOutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(CheckIfPhoneNumberIsOptedOutRequest request,
            com.amazonaws.handlers.AsyncHandler<CheckIfPhoneNumberIsOptedOutRequest, CheckIfPhoneNumberIsOptedOutResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(ConfirmSubscriptionRequest request) {

        return confirmSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(ConfirmSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token, String authenticateOnUnsubscribe) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token)
                .withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe));
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation with an AsyncHandler.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token, String authenticateOnUnsubscribe,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler) {

        return confirmSubscriptionAsync(
                new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token).withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token));
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation with an AsyncHandler.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(String topicArn, String token,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(CreatePlatformApplicationRequest request) {

        return createPlatformApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(CreatePlatformApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePlatformApplicationRequest, CreatePlatformApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(CreatePlatformEndpointRequest request) {

        return createPlatformEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(CreatePlatformEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePlatformEndpointRequest, CreatePlatformEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(CreateTopicRequest request) {

        return createTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(CreateTopicRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateTopic operation.
     *
     * @see #createTopicAsync(CreateTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(String name) {

        return createTopicAsync(new CreateTopicRequest().withName(name));
    }

    /**
     * Simplified method form for invoking the CreateTopic operation with an AsyncHandler.
     *
     * @see #createTopicAsync(CreateTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(String name,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler) {

        return createTopicAsync(new CreateTopicRequest().withName(name), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePlatformApplicationResult> deletePlatformApplicationAsync(DeletePlatformApplicationRequest request) {

        return deletePlatformApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlatformApplicationResult> deletePlatformApplicationAsync(DeletePlatformApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePlatformApplicationRequest, DeletePlatformApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(DeleteTopicRequest request) {

        return deleteTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(DeleteTopicRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRequest, DeleteTopicResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteTopic operation.
     *
     * @see #deleteTopicAsync(DeleteTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(String topicArn) {

        return deleteTopicAsync(new DeleteTopicRequest().withTopicArn(topicArn));
    }

    /**
     * Simplified method form for invoking the DeleteTopic operation with an AsyncHandler.
     *
     * @see #deleteTopicAsync(DeleteTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(String topicArn,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRequest, DeleteTopicResult> asyncHandler) {

        return deleteTopicAsync(new DeleteTopicRequest().withTopicArn(topicArn), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointAttributesResult> getEndpointAttributesAsync(GetEndpointAttributesRequest request) {

        return getEndpointAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointAttributesResult> getEndpointAttributesAsync(GetEndpointAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEndpointAttributesRequest, GetEndpointAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            GetPlatformApplicationAttributesRequest request) {

        return getPlatformApplicationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            GetPlatformApplicationAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPlatformApplicationAttributesRequest, GetPlatformApplicationAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSMSAttributesResult> getSMSAttributesAsync(GetSMSAttributesRequest request) {

        return getSMSAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSMSAttributesResult> getSMSAttributesAsync(GetSMSAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSMSAttributesRequest, GetSMSAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest request) {

        return getSubscriptionAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetSubscriptionAttributes operation.
     *
     * @see #getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(String subscriptionArn) {

        return getSubscriptionAttributesAsync(new GetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn));
    }

    /**
     * Simplified method form for invoking the GetSubscriptionAttributes operation with an AsyncHandler.
     *
     * @see #getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(String subscriptionArn,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler) {

        return getSubscriptionAttributesAsync(new GetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(GetTopicAttributesRequest request) {

        return getTopicAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(GetTopicAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetTopicAttributes operation.
     *
     * @see #getTopicAttributesAsync(GetTopicAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(String topicArn) {

        return getTopicAttributesAsync(new GetTopicAttributesRequest().withTopicArn(topicArn));
    }

    /**
     * Simplified method form for invoking the GetTopicAttributes operation with an AsyncHandler.
     *
     * @see #getTopicAttributesAsync(GetTopicAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(String topicArn,
            com.amazonaws.handlers.AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler) {

        return getTopicAttributesAsync(new GetTopicAttributesRequest().withTopicArn(topicArn), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            ListEndpointsByPlatformApplicationRequest request) {

        return listEndpointsByPlatformApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            ListEndpointsByPlatformApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEndpointsByPlatformApplicationRequest, ListEndpointsByPlatformApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(ListPhoneNumbersOptedOutRequest request) {

        return listPhoneNumbersOptedOutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(ListPhoneNumbersOptedOutRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersOptedOutRequest, ListPhoneNumbersOptedOutResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(ListPlatformApplicationsRequest request) {

        return listPlatformApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(ListPlatformApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListPlatformApplications operation.
     *
     * @see #listPlatformApplicationsAsync(ListPlatformApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync() {

        return listPlatformApplicationsAsync(new ListPlatformApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the ListPlatformApplications operation with an AsyncHandler.
     *
     * @see #listPlatformApplicationsAsync(ListPlatformApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler) {

        return listPlatformApplicationsAsync(new ListPlatformApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(ListSubscriptionsRequest request) {

        return listSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(ListSubscriptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync() {

        return listSubscriptionsAsync(new ListSubscriptionsRequest());
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation with an AsyncHandler.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {

        return listSubscriptionsAsync(new ListSubscriptionsRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(String nextToken) {

        return listSubscriptionsAsync(new ListSubscriptionsRequest().withNextToken(nextToken));
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation with an AsyncHandler.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {

        return listSubscriptionsAsync(new ListSubscriptionsRequest().withNextToken(nextToken), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest request) {

        return listSubscriptionsByTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn));
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation with an AsyncHandler.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn, String nextToken) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn).withNextToken(nextToken));
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic operation with an AsyncHandler.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(String topicArn, String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn).withNextToken(nextToken), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(ListTopicsRequest request) {

        return listTopicsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(ListTopicsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListTopics operation.
     *
     * @see #listTopicsAsync(ListTopicsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync() {

        return listTopicsAsync(new ListTopicsRequest());
    }

    /**
     * Simplified method form for invoking the ListTopics operation with an AsyncHandler.
     *
     * @see #listTopicsAsync(ListTopicsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler) {

        return listTopicsAsync(new ListTopicsRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListTopics operation.
     *
     * @see #listTopicsAsync(ListTopicsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(String nextToken) {

        return listTopicsAsync(new ListTopicsRequest().withNextToken(nextToken));
    }

    /**
     * Simplified method form for invoking the ListTopics operation with an AsyncHandler.
     *
     * @see #listTopicsAsync(ListTopicsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler) {

        return listTopicsAsync(new ListTopicsRequest().withNextToken(nextToken), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<OptInPhoneNumberResult> optInPhoneNumberAsync(OptInPhoneNumberRequest request) {

        return optInPhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptInPhoneNumberResult> optInPhoneNumberAsync(OptInPhoneNumberRequest request,
            com.amazonaws.handlers.AsyncHandler<OptInPhoneNumberRequest, OptInPhoneNumberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest request) {

        return publishAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest request,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the Publish operation.
     *
     * @see #publishAsync(PublishRequest)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn).withMessage(message));
    }

    /**
     * Simplified method form for invoking the Publish operation with an AsyncHandler.
     *
     * @see #publishAsync(PublishRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn).withMessage(message), asyncHandler);
    }

    /**
     * Simplified method form for invoking the Publish operation.
     *
     * @see #publishAsync(PublishRequest)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message, String subject) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn).withMessage(message).withSubject(subject));
    }

    /**
     * Simplified method form for invoking the Publish operation with an AsyncHandler.
     *
     * @see #publishAsync(PublishRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(String topicArn, String message, String subject,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn).withMessage(message).withSubject(subject), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the RemovePermission operation.
     *
     * @see #removePermissionAsync(RemovePermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String topicArn, String label) {

        return removePermissionAsync(new RemovePermissionRequest().withTopicArn(topicArn).withLabel(label));
    }

    /**
     * Simplified method form for invoking the RemovePermission operation with an AsyncHandler.
     *
     * @see #removePermissionAsync(RemovePermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String topicArn, String label,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {

        return removePermissionAsync(new RemovePermissionRequest().withTopicArn(topicArn).withLabel(label), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SetEndpointAttributesResult> setEndpointAttributesAsync(SetEndpointAttributesRequest request) {

        return setEndpointAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetEndpointAttributesResult> setEndpointAttributesAsync(SetEndpointAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<SetEndpointAttributesRequest, SetEndpointAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetPlatformApplicationAttributesResult> setPlatformApplicationAttributesAsync(
            SetPlatformApplicationAttributesRequest request) {

        return setPlatformApplicationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetPlatformApplicationAttributesResult> setPlatformApplicationAttributesAsync(
            SetPlatformApplicationAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<SetPlatformApplicationAttributesRequest, SetPlatformApplicationAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetSMSAttributesResult> setSMSAttributesAsync(SetSMSAttributesRequest request) {

        return setSMSAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetSMSAttributesResult> setSMSAttributesAsync(SetSMSAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<SetSMSAttributesRequest, SetSMSAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest request) {

        return setSubscriptionAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<SetSubscriptionAttributesRequest, SetSubscriptionAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the SetSubscriptionAttributes operation.
     *
     * @see #setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(String subscriptionArn, String attributeName,
            String attributeValue) {

        return setSubscriptionAttributesAsync(new SetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue));
    }

    /**
     * Simplified method form for invoking the SetSubscriptionAttributes operation with an AsyncHandler.
     *
     * @see #setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SetSubscriptionAttributesResult> setSubscriptionAttributesAsync(String subscriptionArn, String attributeName,
            String attributeValue, com.amazonaws.handlers.AsyncHandler<SetSubscriptionAttributesRequest, SetSubscriptionAttributesResult> asyncHandler) {

        return setSubscriptionAttributesAsync(new SetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(SetTopicAttributesRequest request) {

        return setTopicAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(SetTopicAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<SetTopicAttributesRequest, SetTopicAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the SetTopicAttributes operation.
     *
     * @see #setTopicAttributesAsync(SetTopicAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(String topicArn, String attributeName, String attributeValue) {

        return setTopicAttributesAsync(new SetTopicAttributesRequest().withTopicArn(topicArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue));
    }

    /**
     * Simplified method form for invoking the SetTopicAttributes operation with an AsyncHandler.
     *
     * @see #setTopicAttributesAsync(SetTopicAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SetTopicAttributesResult> setTopicAttributesAsync(String topicArn, String attributeName, String attributeValue,
            com.amazonaws.handlers.AsyncHandler<SetTopicAttributesRequest, SetTopicAttributesResult> asyncHandler) {

        return setTopicAttributesAsync(
                new SetTopicAttributesRequest().withTopicArn(topicArn).withAttributeName(attributeName).withAttributeValue(attributeValue), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(SubscribeRequest request) {

        return subscribeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(SubscribeRequest request,
            com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the Subscribe operation.
     *
     * @see #subscribeAsync(SubscribeRequest)
     */
    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(String topicArn, String protocol, String endpoint) {

        return subscribeAsync(new SubscribeRequest().withTopicArn(topicArn).withProtocol(protocol).withEndpoint(endpoint));
    }

    /**
     * Simplified method form for invoking the Subscribe operation with an AsyncHandler.
     *
     * @see #subscribeAsync(SubscribeRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(String topicArn, String protocol, String endpoint,
            com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler) {

        return subscribeAsync(new SubscribeRequest().withTopicArn(topicArn).withProtocol(protocol).withEndpoint(endpoint), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest request) {

        return unsubscribeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest request,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, UnsubscribeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the Unsubscribe operation.
     *
     * @see #unsubscribeAsync(UnsubscribeRequest)
     */
    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(String subscriptionArn) {

        return unsubscribeAsync(new UnsubscribeRequest().withSubscriptionArn(subscriptionArn));
    }

    /**
     * Simplified method form for invoking the Unsubscribe operation with an AsyncHandler.
     *
     * @see #unsubscribeAsync(UnsubscribeRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(String subscriptionArn,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, UnsubscribeResult> asyncHandler) {

        return unsubscribeAsync(new UnsubscribeRequest().withSubscriptionArn(subscriptionArn), asyncHandler);
    }

}

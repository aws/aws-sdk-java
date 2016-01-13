/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sns;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonSNS}. Convenient method forms pass
 * through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonSNS implements AmazonSNS {

    protected AbstractAmazonSNS() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void addPermission(AddPermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void addPermission(String topicArn, String label,
            java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames) {
        addPermission(new AddPermissionRequest().withTopicArn(topicArn)
                .withLabel(label).withAWSAccountIds(aWSAccountIds)
                .withActionNames(actionNames));
    }

    @Override
    public ConfirmSubscriptionResult confirmSubscription(
            ConfirmSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConfirmSubscriptionResult confirmSubscription(String topicArn,
            String token, String authenticateOnUnsubscribe) {
        return confirmSubscription(new ConfirmSubscriptionRequest()
                .withTopicArn(topicArn).withToken(token)
                .withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe));
    }

    @Override
    public ConfirmSubscriptionResult confirmSubscription(String topicArn,
            String token) {
        return confirmSubscription(new ConfirmSubscriptionRequest()
                .withTopicArn(topicArn).withToken(token));
    }

    @Override
    public CreatePlatformApplicationResult createPlatformApplication(
            CreatePlatformApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePlatformEndpointResult createPlatformEndpoint(
            CreatePlatformEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTopicResult createTopic(CreateTopicRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTopicResult createTopic(String name) {
        return createTopic(new CreateTopicRequest().withName(name));
    }

    @Override
    public void deleteEndpoint(DeleteEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deletePlatformApplication(
            DeletePlatformApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteTopic(DeleteTopicRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteTopic(String topicArn) {
        deleteTopic(new DeleteTopicRequest().withTopicArn(topicArn));
    }

    @Override
    public GetEndpointAttributesResult getEndpointAttributes(
            GetEndpointAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPlatformApplicationAttributesResult getPlatformApplicationAttributes(
            GetPlatformApplicationAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSubscriptionAttributesResult getSubscriptionAttributes(
            GetSubscriptionAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSubscriptionAttributesResult getSubscriptionAttributes(
            String subscriptionArn) {
        return getSubscriptionAttributes(new GetSubscriptionAttributesRequest()
                .withSubscriptionArn(subscriptionArn));
    }

    @Override
    public GetTopicAttributesResult getTopicAttributes(
            GetTopicAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTopicAttributesResult getTopicAttributes(String topicArn) {
        return getTopicAttributes(new GetTopicAttributesRequest()
                .withTopicArn(topicArn));
    }

    @Override
    public ListEndpointsByPlatformApplicationResult listEndpointsByPlatformApplication(
            ListEndpointsByPlatformApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPlatformApplicationsResult listPlatformApplications(
            ListPlatformApplicationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPlatformApplicationsResult listPlatformApplications() {
        return listPlatformApplications(new ListPlatformApplicationsRequest());
    }

    @Override
    public ListSubscriptionsResult listSubscriptions(
            ListSubscriptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSubscriptionsResult listSubscriptions() {
        return listSubscriptions(new ListSubscriptionsRequest());
    }

    @Override
    public ListSubscriptionsResult listSubscriptions(String nextToken) {
        return listSubscriptions(new ListSubscriptionsRequest()
                .withNextToken(nextToken));
    }

    @Override
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(
            ListSubscriptionsByTopicRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(
            String topicArn) {
        return listSubscriptionsByTopic(new ListSubscriptionsByTopicRequest()
                .withTopicArn(topicArn));
    }

    @Override
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(
            String topicArn, String nextToken) {
        return listSubscriptionsByTopic(new ListSubscriptionsByTopicRequest()
                .withTopicArn(topicArn).withNextToken(nextToken));
    }

    @Override
    public ListTopicsResult listTopics(ListTopicsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTopicsResult listTopics() {
        return listTopics(new ListTopicsRequest());
    }

    @Override
    public ListTopicsResult listTopics(String nextToken) {
        return listTopics(new ListTopicsRequest().withNextToken(nextToken));
    }

    @Override
    public PublishResult publish(PublishRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PublishResult publish(String topicArn, String message) {
        return publish(new PublishRequest().withTopicArn(topicArn).withMessage(
                message));
    }

    @Override
    public PublishResult publish(String topicArn, String message, String subject) {
        return publish(new PublishRequest().withTopicArn(topicArn)
                .withMessage(message).withSubject(subject));
    }

    @Override
    public void removePermission(RemovePermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void removePermission(String topicArn, String label) {
        removePermission(new RemovePermissionRequest().withTopicArn(topicArn)
                .withLabel(label));
    }

    @Override
    public void setEndpointAttributes(SetEndpointAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setPlatformApplicationAttributes(
            SetPlatformApplicationAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setSubscriptionAttributes(
            SetSubscriptionAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setSubscriptionAttributes(String subscriptionArn,
            String attributeName, String attributeValue) {
        setSubscriptionAttributes(new SetSubscriptionAttributesRequest()
                .withSubscriptionArn(subscriptionArn)
                .withAttributeName(attributeName)
                .withAttributeValue(attributeValue));
    }

    @Override
    public void setTopicAttributes(SetTopicAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setTopicAttributes(String topicArn, String attributeName,
            String attributeValue) {
        setTopicAttributes(new SetTopicAttributesRequest()
                .withTopicArn(topicArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue));
    }

    @Override
    public SubscribeResult subscribe(SubscribeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SubscribeResult subscribe(String topicArn, String protocol,
            String endpoint) {
        return subscribe(new SubscribeRequest().withTopicArn(topicArn)
                .withProtocol(protocol).withEndpoint(endpoint));
    }

    @Override
    public void unsubscribe(UnsubscribeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void unsubscribe(String subscriptionArn) {
        unsubscribe(new UnsubscribeRequest()
                .withSubscriptionArn(subscriptionArn));
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}

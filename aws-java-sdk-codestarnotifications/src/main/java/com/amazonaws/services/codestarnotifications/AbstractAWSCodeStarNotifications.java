/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarnotifications;

import javax.annotation.Generated;

import com.amazonaws.services.codestarnotifications.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCodeStarNotifications}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeStarNotifications implements AWSCodeStarNotifications {

    protected AbstractAWSCodeStarNotifications() {
    }

    @Override
    public CreateNotificationRuleResult createNotificationRule(CreateNotificationRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNotificationRuleResult deleteNotificationRule(DeleteNotificationRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTargetResult deleteTarget(DeleteTargetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNotificationRuleResult describeNotificationRule(DescribeNotificationRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEventTypesResult listEventTypes(ListEventTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListNotificationRulesResult listNotificationRules(ListNotificationRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTargetsResult listTargets(ListTargetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SubscribeResult subscribe(SubscribeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UnsubscribeResult unsubscribe(UnsubscribeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateNotificationRuleResult updateNotificationRule(UpdateNotificationRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}

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

/**
 * Abstract implementation of {@code AWSCodeStarNotificationsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeStarNotificationsAsync extends AbstractAWSCodeStarNotifications implements AWSCodeStarNotificationsAsync {

    protected AbstractAWSCodeStarNotificationsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateNotificationRuleResult> createNotificationRuleAsync(CreateNotificationRuleRequest request) {

        return createNotificationRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotificationRuleResult> createNotificationRuleAsync(CreateNotificationRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateNotificationRuleRequest, CreateNotificationRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationRuleResult> deleteNotificationRuleAsync(DeleteNotificationRuleRequest request) {

        return deleteNotificationRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationRuleResult> deleteNotificationRuleAsync(DeleteNotificationRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationRuleRequest, DeleteNotificationRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetResult> deleteTargetAsync(DeleteTargetRequest request) {

        return deleteTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetResult> deleteTargetAsync(DeleteTargetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTargetRequest, DeleteTargetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationRuleResult> describeNotificationRuleAsync(DescribeNotificationRuleRequest request) {

        return describeNotificationRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationRuleResult> describeNotificationRuleAsync(DescribeNotificationRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationRuleRequest, DescribeNotificationRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEventTypesResult> listEventTypesAsync(ListEventTypesRequest request) {

        return listEventTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventTypesResult> listEventTypesAsync(ListEventTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventTypesRequest, ListEventTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNotificationRulesResult> listNotificationRulesAsync(ListNotificationRulesRequest request) {

        return listNotificationRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationRulesResult> listNotificationRulesAsync(ListNotificationRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNotificationRulesRequest, ListNotificationRulesResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(ListTargetsRequest request) {

        return listTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(ListTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTargetsRequest, ListTargetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest request) {

        return unsubscribeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest request,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, UnsubscribeResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateNotificationRuleResult> updateNotificationRuleAsync(UpdateNotificationRuleRequest request) {

        return updateNotificationRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationRuleResult> updateNotificationRuleAsync(UpdateNotificationRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateNotificationRuleRequest, UpdateNotificationRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

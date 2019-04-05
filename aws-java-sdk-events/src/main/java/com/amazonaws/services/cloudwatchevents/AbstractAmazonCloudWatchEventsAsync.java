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
package com.amazonaws.services.cloudwatchevents;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;

/**
 * Abstract implementation of {@code AmazonCloudWatchEventsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCloudWatchEventsAsync extends AbstractAmazonCloudWatchEvents implements AmazonCloudWatchEventsAsync {

    protected AbstractAmazonCloudWatchEventsAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(DescribeEventBusRequest request) {

        return describeEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(DescribeEventBusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventBusRequest, DescribeEventBusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest request) {

        return describeRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest request) {

        return disableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableRuleRequest, DisableRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest request) {

        return enableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableRuleRequest, EnableRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest request) {

        return listRuleNamesByTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRuleNamesByTargetRequest, ListRuleNamesByTargetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest request) {

        return listTargetsByRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTargetsByRuleRequest, ListTargetsByRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request) {

        return putEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest request) {

        return putPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutPermissionRequest, PutPermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest request) {

        return putRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRuleRequest, PutRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest request) {

        return putTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutTargetsRequest, PutTargetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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

    @Override
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest request) {

        return removeTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTargetsRequest, RemoveTargetsResult> asyncHandler) {

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
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest request) {

        return testEventPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest request,
            com.amazonaws.handlers.AsyncHandler<TestEventPatternRequest, TestEventPatternResult> asyncHandler) {

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

}

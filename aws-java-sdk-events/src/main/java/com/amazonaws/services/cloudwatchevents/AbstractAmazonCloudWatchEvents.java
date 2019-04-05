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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonCloudWatchEvents}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCloudWatchEvents implements AmazonCloudWatchEvents {

    protected AbstractAmazonCloudWatchEvents() {
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
    public DeleteRuleResult deleteRule(DeleteRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventBusResult describeEventBus(DescribeEventBusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRuleResult describeRule(DescribeRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableRuleResult disableRule(DisableRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableRuleResult enableRule(EnableRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRuleNamesByTargetResult listRuleNamesByTarget(ListRuleNamesByTargetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRulesResult listRules(ListRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTargetsByRuleResult listTargetsByRule(ListTargetsByRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutEventsResult putEvents(PutEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutPermissionResult putPermission(PutPermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRuleResult putRule(PutRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutTargetsResult putTargets(PutTargetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemovePermissionResult removePermission(RemovePermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTargetsResult removeTargets(RemoveTargetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestEventPatternResult testEventPattern(TestEventPatternRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
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

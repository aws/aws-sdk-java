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
package com.amazonaws.services.applicationautoscaling;

import javax.annotation.Generated;

import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSApplicationAutoScaling}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSApplicationAutoScaling implements AWSApplicationAutoScaling {

    protected AbstractAWSApplicationAutoScaling() {
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
    public DeleteScalingPolicyResult deleteScalingPolicy(DeleteScalingPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteScheduledActionResult deleteScheduledAction(DeleteScheduledActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterScalableTargetResult deregisterScalableTarget(DeregisterScalableTargetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScalableTargetsResult describeScalableTargets(DescribeScalableTargetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScalingActivitiesResult describeScalingActivities(DescribeScalingActivitiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScalingPoliciesResult describeScalingPolicies(DescribeScalingPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScheduledActionsResult describeScheduledActions(DescribeScheduledActionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutScheduledActionResult putScheduledAction(PutScheduledActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterScalableTargetResult registerScalableTarget(RegisterScalableTargetRequest request) {
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

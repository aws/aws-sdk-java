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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Application Auto Scaling.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AutoscalingActions implements Action {

    /** Represents any action executed on Application Auto Scaling. */
    AllAutoscalingActions("autoscaling:*"),

    /** Action for the DeleteScalingPolicy operation. */
    DeleteScalingPolicy("autoscaling:DeleteScalingPolicy"),
    /** Action for the DeleteScheduledAction operation. */
    DeleteScheduledAction("autoscaling:DeleteScheduledAction"),
    /** Action for the DeregisterScalableTarget operation. */
    DeregisterScalableTarget("autoscaling:DeregisterScalableTarget"),
    /** Action for the DescribeScalableTargets operation. */
    DescribeScalableTargets("autoscaling:DescribeScalableTargets"),
    /** Action for the DescribeScalingActivities operation. */
    DescribeScalingActivities("autoscaling:DescribeScalingActivities"),
    /** Action for the DescribeScalingPolicies operation. */
    DescribeScalingPolicies("autoscaling:DescribeScalingPolicies"),
    /** Action for the DescribeScheduledActions operation. */
    DescribeScheduledActions("autoscaling:DescribeScheduledActions"),
    /** Action for the PutScalingPolicy operation. */
    PutScalingPolicy("autoscaling:PutScalingPolicy"),
    /** Action for the PutScheduledAction operation. */
    PutScheduledAction("autoscaling:PutScheduledAction"),
    /** Action for the RegisterScalableTarget operation. */
    RegisterScalableTarget("autoscaling:RegisterScalableTarget"),

    ;

    private final String action;

    private AutoscalingActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}

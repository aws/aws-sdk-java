/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon Auto Scaling.
 */
public enum AutoScalingActions implements Action {
    /** Represents any action executed on Amazon Auto Scaling. */
    AllAutoScalingActions("AutoScaling:*"),

    /** Action for the CreateAutoScalingGroup operation. */
    CreateAutoScalingGroup("AutoScaling:CreateAutoScalingGroup"),

    /** Action for the CreateLaunchConfiguration operation. */
    CreateLaunchConfiguration("AutoScaling:CreateLaunchConfiguration"),

    /** Action for the CreateOrUpdateScalingTrigger operation. */
    CreateOrUpdateScalingTrigger("AutoScaling:CreateOrUpdateScalingTrigger"),

    /** Action for the CreateOrUpdateTags operation. */
    CreateOrUpdateTags("AutoScaling:CreateOrUpdateTags"),

    /** Action for the DeleteAutoScalingGroup operation. */
    DeleteAutoScalingGroup("AutoScaling:DeleteAutoScalingGroup"),

    /** Action for the DeleteLaunchConfiguration operation. */
    DeleteLaunchConfiguration("AutoScaling:DeleteLaunchConfiguration"),

    /** Action for the DeleteNotificationConfiguration operation. */
    DeleteNotificationConfiguration("AutoScaling:DeleteNotificationConfiguration"),

    /** Action for the DeletePolicy operation. */
    DeletePolicy("AutoScaling:DeletePolicy"),

    /** Action for the DeleteScheduledAction operation. */
    DeleteScheduledAction("AutoScaling:DeleteScheduledAction"),

    /** Action for the DeleteTags operation. */
    DeleteTags("AutoScaling:DeleteTags"),

    /** Action for the DeleteTrigger operation. */
    DeleteTrigger("AutoScaling:DeleteTrigger"),

    /** Action for the DescribeAdjustmentTypes operation. */
    DescribeAdjustmentTypes("AutoScaling:DescribeAdjustmentTypes"),

    /** Action for the DescribeAutoScalingGroups operation. */
    DescribeAutoScalingGroups("AutoScaling:DescribeAutoScalingGroups"),

    /** Action for the DescribeAutoScalingInstances operation. */
    DescribeAutoScalingInstances("AutoScaling:DescribeAutoScalingInstances"),

    /** Action for the DescribeAutoScalingNotificationTypes operation. */
    DescribeAutoScalingNotificationTypes("AutoScaling:DescribeAutoScalingNotificationTypes"),

    /** Action for the DescribeLaunchConfigurations operation. */
    DescribeLaunchConfigurations("AutoScaling:DescribeLaunchConfigurations"),

    /** Action for the DescribeMetricCollectionTypes operation. */
    DescribeMetricCollectionTypes("AutoScaling:DescribeMetricCollectionTypes"),

    /** Action for the DescribeNotificationConfigurations operation. */
    DescribeNotificationConfigurations("AutoScaling:DescribeNotificationConfigurations"),

    /** Action for the DescribePolicies operation. */
    DescribePolicies("AutoScaling:DescribePolicies"),

    /** Action for the DescribeScalingActivities operation. */
    DescribeScalingActivities("AutoScaling:DescribeScalingActivities"),

    /** Action for the DescribeScalingProcessTypes operation. */
    DescribeScalingProcessTypes("AutoScaling:DescribeScalingProcessTypes"),

    /** Action for the DescribeScheduledActions operation. */
    DescribeScheduledActions("AutoScaling:DescribeScheduledActions"),

    /** Action for the DescribeTags operation. */
    DescribeTags("AutoScaling:DescribeTags"),

    /** Action for the DescribeTriggers operation. */
    DescribeTriggers("AutoScaling:DescribeTriggers"),

    /** Action for the DisableMetricsCollection operation. */
    DisableMetricsCollection("AutoScaling:DisableMetricsCollection"),

    /** Action for the EnableMetricsCollection operation. */
    EnableMetricsCollection("AutoScaling:EnableMetricsCollection"),

    /** Action for the ExecutePolicy operation. */
    ExecutePolicy("AutoScaling:ExecutePolicy"),

    /** Action for the PutNotificationConfiguration operation. */
    PutNotificationConfiguration("AutoScaling:PutNotificationConfiguration"),

    /** Action for the PutScalingPolicy operation. */
    PutScalingPolicy("AutoScaling:PutScalingPolicy"),

    /** Action for the PutScheduledUpdateGroupAction operation. */
    PutScheduledUpdateGroupAction("AutoScaling:PutScheduledUpdateGroupAction"),

    /** Action for the ResumeProcesses operation. */
    ResumeProcesses("AutoScaling:ResumeProcesses"),

    /** Action for the SetDesiredCapacity operation. */
    SetDesiredCapacity("AutoScaling:SetDesiredCapacity"),

    /** Action for the SetInstanceHealth operation. */
    SetInstanceHealth("AutoScaling:SetInstanceHealth"),

    /** Action for the SuspendProcesses operation. */
    SuspendProcesses("AutoScaling:SuspendProcesses"),

    /** Action for the TerminateInstanceInAutoScalingGroup operation. */
    TerminateInstanceInAutoScalingGroup("AutoScaling:TerminateInstanceInAutoScalingGroup"),

    /** Action for the UpdateAutoScalingGroup operation. */
    UpdateAutoScalingGroup("AutoScaling:UpdateAutoScalingGroup");

    private final String action;

    private AutoScalingActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}

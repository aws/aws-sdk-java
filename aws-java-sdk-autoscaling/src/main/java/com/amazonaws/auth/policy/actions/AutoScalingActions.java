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
 * The available AWS access control policy actions for Auto Scaling.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AutoScalingActions implements Action {

    /** Represents any action executed on Auto Scaling. */
    AllAutoScalingActions("autoscaling:*"),

    /** Action for the AttachInstances operation. */
    AttachInstances("autoscaling:AttachInstances"),
    /** Action for the AttachLoadBalancerTargetGroups operation. */
    AttachLoadBalancerTargetGroups("autoscaling:AttachLoadBalancerTargetGroups"),
    /** Action for the AttachLoadBalancers operation. */
    AttachLoadBalancers("autoscaling:AttachLoadBalancers"),
    /** Action for the BatchDeleteScheduledAction operation. */
    BatchDeleteScheduledAction("autoscaling:BatchDeleteScheduledAction"),
    /** Action for the BatchPutScheduledUpdateGroupAction operation. */
    BatchPutScheduledUpdateGroupAction("autoscaling:BatchPutScheduledUpdateGroupAction"),
    /** Action for the CompleteLifecycleAction operation. */
    CompleteLifecycleAction("autoscaling:CompleteLifecycleAction"),
    /** Action for the CreateAutoScalingGroup operation. */
    CreateAutoScalingGroup("autoscaling:CreateAutoScalingGroup"),
    /** Action for the CreateLaunchConfiguration operation. */
    CreateLaunchConfiguration("autoscaling:CreateLaunchConfiguration"),
    /** Action for the CreateOrUpdateTags operation. */
    CreateOrUpdateTags("autoscaling:CreateOrUpdateTags"),
    /** Action for the DeleteAutoScalingGroup operation. */
    DeleteAutoScalingGroup("autoscaling:DeleteAutoScalingGroup"),
    /** Action for the DeleteLaunchConfiguration operation. */
    DeleteLaunchConfiguration("autoscaling:DeleteLaunchConfiguration"),
    /** Action for the DeleteLifecycleHook operation. */
    DeleteLifecycleHook("autoscaling:DeleteLifecycleHook"),
    /** Action for the DeleteNotificationConfiguration operation. */
    DeleteNotificationConfiguration("autoscaling:DeleteNotificationConfiguration"),
    /** Action for the DeletePolicy operation. */
    DeletePolicy("autoscaling:DeletePolicy"),
    /** Action for the DeleteScheduledAction operation. */
    DeleteScheduledAction("autoscaling:DeleteScheduledAction"),
    /** Action for the DeleteTags operation. */
    DeleteTags("autoscaling:DeleteTags"),
    /** Action for the DescribeAccountLimits operation. */
    DescribeAccountLimits("autoscaling:DescribeAccountLimits"),
    /** Action for the DescribeAdjustmentTypes operation. */
    DescribeAdjustmentTypes("autoscaling:DescribeAdjustmentTypes"),
    /** Action for the DescribeAutoScalingGroups operation. */
    DescribeAutoScalingGroups("autoscaling:DescribeAutoScalingGroups"),
    /** Action for the DescribeAutoScalingInstances operation. */
    DescribeAutoScalingInstances("autoscaling:DescribeAutoScalingInstances"),
    /** Action for the DescribeAutoScalingNotificationTypes operation. */
    DescribeAutoScalingNotificationTypes("autoscaling:DescribeAutoScalingNotificationTypes"),
    /** Action for the DescribeLaunchConfigurations operation. */
    DescribeLaunchConfigurations("autoscaling:DescribeLaunchConfigurations"),
    /** Action for the DescribeLifecycleHookTypes operation. */
    DescribeLifecycleHookTypes("autoscaling:DescribeLifecycleHookTypes"),
    /** Action for the DescribeLifecycleHooks operation. */
    DescribeLifecycleHooks("autoscaling:DescribeLifecycleHooks"),
    /** Action for the DescribeLoadBalancerTargetGroups operation. */
    DescribeLoadBalancerTargetGroups("autoscaling:DescribeLoadBalancerTargetGroups"),
    /** Action for the DescribeLoadBalancers operation. */
    DescribeLoadBalancers("autoscaling:DescribeLoadBalancers"),
    /** Action for the DescribeMetricCollectionTypes operation. */
    DescribeMetricCollectionTypes("autoscaling:DescribeMetricCollectionTypes"),
    /** Action for the DescribeNotificationConfigurations operation. */
    DescribeNotificationConfigurations("autoscaling:DescribeNotificationConfigurations"),
    /** Action for the DescribePolicies operation. */
    DescribePolicies("autoscaling:DescribePolicies"),
    /** Action for the DescribeScalingActivities operation. */
    DescribeScalingActivities("autoscaling:DescribeScalingActivities"),
    /** Action for the DescribeScalingProcessTypes operation. */
    DescribeScalingProcessTypes("autoscaling:DescribeScalingProcessTypes"),
    /** Action for the DescribeScheduledActions operation. */
    DescribeScheduledActions("autoscaling:DescribeScheduledActions"),
    /** Action for the DescribeTags operation. */
    DescribeTags("autoscaling:DescribeTags"),
    /** Action for the DescribeTerminationPolicyTypes operation. */
    DescribeTerminationPolicyTypes("autoscaling:DescribeTerminationPolicyTypes"),
    /** Action for the DetachInstances operation. */
    DetachInstances("autoscaling:DetachInstances"),
    /** Action for the DetachLoadBalancerTargetGroups operation. */
    DetachLoadBalancerTargetGroups("autoscaling:DetachLoadBalancerTargetGroups"),
    /** Action for the DetachLoadBalancers operation. */
    DetachLoadBalancers("autoscaling:DetachLoadBalancers"),
    /** Action for the DisableMetricsCollection operation. */
    DisableMetricsCollection("autoscaling:DisableMetricsCollection"),
    /** Action for the EnableMetricsCollection operation. */
    EnableMetricsCollection("autoscaling:EnableMetricsCollection"),
    /** Action for the EnterStandby operation. */
    EnterStandby("autoscaling:EnterStandby"),
    /** Action for the ExecutePolicy operation. */
    ExecutePolicy("autoscaling:ExecutePolicy"),
    /** Action for the ExitStandby operation. */
    ExitStandby("autoscaling:ExitStandby"),
    /** Action for the PutLifecycleHook operation. */
    PutLifecycleHook("autoscaling:PutLifecycleHook"),
    /** Action for the PutNotificationConfiguration operation. */
    PutNotificationConfiguration("autoscaling:PutNotificationConfiguration"),
    /** Action for the PutScalingPolicy operation. */
    PutScalingPolicy("autoscaling:PutScalingPolicy"),
    /** Action for the PutScheduledUpdateGroupAction operation. */
    PutScheduledUpdateGroupAction("autoscaling:PutScheduledUpdateGroupAction"),
    /** Action for the RecordLifecycleActionHeartbeat operation. */
    RecordLifecycleActionHeartbeat("autoscaling:RecordLifecycleActionHeartbeat"),
    /** Action for the ResumeProcesses operation. */
    ResumeProcesses("autoscaling:ResumeProcesses"),
    /** Action for the SetDesiredCapacity operation. */
    SetDesiredCapacity("autoscaling:SetDesiredCapacity"),
    /** Action for the SetInstanceHealth operation. */
    SetInstanceHealth("autoscaling:SetInstanceHealth"),
    /** Action for the SetInstanceProtection operation. */
    SetInstanceProtection("autoscaling:SetInstanceProtection"),
    /** Action for the SuspendProcesses operation. */
    SuspendProcesses("autoscaling:SuspendProcesses"),
    /** Action for the TerminateInstanceInAutoScalingGroup operation. */
    TerminateInstanceInAutoScalingGroup("autoscaling:TerminateInstanceInAutoScalingGroup"),
    /** Action for the UpdateAutoScalingGroup operation. */
    UpdateAutoScalingGroup("autoscaling:UpdateAutoScalingGroup"),

    ;

    private final String action;

    private AutoScalingActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}

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
package com.amazonaws.services.autoscaling;

import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.*;
import com.amazonaws.services.autoscaling.waiters.AmazonAutoScalingWaiters;

/**
 * Abstract implementation of {@code AmazonAutoScaling}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonAutoScaling implements AmazonAutoScaling {

    protected AbstractAmazonAutoScaling() {
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
    public AttachInstancesResult attachInstances(AttachInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachLoadBalancerTargetGroupsResult attachLoadBalancerTargetGroups(AttachLoadBalancerTargetGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachLoadBalancersResult attachLoadBalancers() {
        return attachLoadBalancers(new AttachLoadBalancersRequest());
    }

    @Override
    public BatchDeleteScheduledActionResult batchDeleteScheduledAction(BatchDeleteScheduledActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchPutScheduledUpdateGroupActionResult batchPutScheduledUpdateGroupAction(BatchPutScheduledUpdateGroupActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CompleteLifecycleActionResult completeLifecycleAction(CompleteLifecycleActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAutoScalingGroupResult createAutoScalingGroup(CreateAutoScalingGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLaunchConfigurationResult createLaunchConfiguration(CreateLaunchConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateOrUpdateTagsResult createOrUpdateTags(CreateOrUpdateTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAutoScalingGroupResult deleteAutoScalingGroup(DeleteAutoScalingGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLaunchConfigurationResult deleteLaunchConfiguration(DeleteLaunchConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLifecycleHookResult deleteLifecycleHook(DeleteLifecycleHookRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteNotificationConfigurationResult deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteScheduledActionResult deleteScheduledAction(DeleteScheduledActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountLimitsResult describeAccountLimits() {
        return describeAccountLimits(new DescribeAccountLimitsRequest());
    }

    @Override
    public DescribeAdjustmentTypesResult describeAdjustmentTypes(DescribeAdjustmentTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAdjustmentTypesResult describeAdjustmentTypes() {
        return describeAdjustmentTypes(new DescribeAdjustmentTypesRequest());
    }

    @Override
    public DescribeAutoScalingGroupsResult describeAutoScalingGroups(DescribeAutoScalingGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAutoScalingGroupsResult describeAutoScalingGroups() {
        return describeAutoScalingGroups(new DescribeAutoScalingGroupsRequest());
    }

    @Override
    public DescribeAutoScalingInstancesResult describeAutoScalingInstances(DescribeAutoScalingInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAutoScalingInstancesResult describeAutoScalingInstances() {
        return describeAutoScalingInstances(new DescribeAutoScalingInstancesRequest());
    }

    @Override
    public DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes(DescribeAutoScalingNotificationTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes() {
        return describeAutoScalingNotificationTypes(new DescribeAutoScalingNotificationTypesRequest());
    }

    @Override
    public DescribeLaunchConfigurationsResult describeLaunchConfigurations(DescribeLaunchConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLaunchConfigurationsResult describeLaunchConfigurations() {
        return describeLaunchConfigurations(new DescribeLaunchConfigurationsRequest());
    }

    @Override
    public DescribeLifecycleHookTypesResult describeLifecycleHookTypes(DescribeLifecycleHookTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLifecycleHookTypesResult describeLifecycleHookTypes() {
        return describeLifecycleHookTypes(new DescribeLifecycleHookTypesRequest());
    }

    @Override
    public DescribeLifecycleHooksResult describeLifecycleHooks(DescribeLifecycleHooksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoadBalancerTargetGroupsResult describeLoadBalancerTargetGroups(DescribeLoadBalancerTargetGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMetricCollectionTypesResult describeMetricCollectionTypes(DescribeMetricCollectionTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeMetricCollectionTypesResult describeMetricCollectionTypes() {
        return describeMetricCollectionTypes(new DescribeMetricCollectionTypesRequest());
    }

    @Override
    public DescribeNotificationConfigurationsResult describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNotificationConfigurationsResult describeNotificationConfigurations() {
        return describeNotificationConfigurations(new DescribeNotificationConfigurationsRequest());
    }

    @Override
    public DescribePoliciesResult describePolicies(DescribePoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePoliciesResult describePolicies() {
        return describePolicies(new DescribePoliciesRequest());
    }

    @Override
    public DescribeScalingActivitiesResult describeScalingActivities(DescribeScalingActivitiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScalingActivitiesResult describeScalingActivities() {
        return describeScalingActivities(new DescribeScalingActivitiesRequest());
    }

    @Override
    public DescribeScalingProcessTypesResult describeScalingProcessTypes(DescribeScalingProcessTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScalingProcessTypesResult describeScalingProcessTypes() {
        return describeScalingProcessTypes(new DescribeScalingProcessTypesRequest());
    }

    @Override
    public DescribeScheduledActionsResult describeScheduledActions(DescribeScheduledActionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeScheduledActionsResult describeScheduledActions() {
        return describeScheduledActions(new DescribeScheduledActionsRequest());
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTagsResult describeTags() {
        return describeTags(new DescribeTagsRequest());
    }

    @Override
    public DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes(DescribeTerminationPolicyTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes() {
        return describeTerminationPolicyTypes(new DescribeTerminationPolicyTypesRequest());
    }

    @Override
    public DetachInstancesResult detachInstances(DetachInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachLoadBalancerTargetGroupsResult detachLoadBalancerTargetGroups(DetachLoadBalancerTargetGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachLoadBalancersResult detachLoadBalancers(DetachLoadBalancersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachLoadBalancersResult detachLoadBalancers() {
        return detachLoadBalancers(new DetachLoadBalancersRequest());
    }

    @Override
    public DisableMetricsCollectionResult disableMetricsCollection(DisableMetricsCollectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableMetricsCollectionResult enableMetricsCollection(EnableMetricsCollectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnterStandbyResult enterStandby(EnterStandbyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExecutePolicyResult executePolicy(ExecutePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExitStandbyResult exitStandby(ExitStandbyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutLifecycleHookResult putLifecycleHook(PutLifecycleHookRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutNotificationConfigurationResult putNotificationConfiguration(PutNotificationConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutScheduledUpdateGroupActionResult putScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RecordLifecycleActionHeartbeatResult recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResumeProcessesResult resumeProcesses(ResumeProcessesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetDesiredCapacityResult setDesiredCapacity(SetDesiredCapacityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetInstanceHealthResult setInstanceHealth(SetInstanceHealthRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SuspendProcessesResult suspendProcesses(SuspendProcessesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TerminateInstanceInAutoScalingGroupResult terminateInstanceInAutoScalingGroup(TerminateInstanceInAutoScalingGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAutoScalingGroupResult updateAutoScalingGroup(UpdateAutoScalingGroupRequest request) {
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

    @Override
    public AmazonAutoScalingWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}

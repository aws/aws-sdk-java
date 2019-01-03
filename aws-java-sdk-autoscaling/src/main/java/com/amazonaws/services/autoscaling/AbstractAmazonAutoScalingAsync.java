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

/**
 * Abstract implementation of {@code AmazonAutoScalingAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonAutoScalingAsync extends AbstractAmazonAutoScaling implements AmazonAutoScalingAsync {

    protected AbstractAmazonAutoScalingAsync() {
    }

    @Override
    public java.util.concurrent.Future<AttachInstancesResult> attachInstancesAsync(AttachInstancesRequest request) {

        return attachInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachInstancesResult> attachInstancesAsync(AttachInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachInstancesRequest, AttachInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(AttachLoadBalancerTargetGroupsRequest request) {

        return attachLoadBalancerTargetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(AttachLoadBalancerTargetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancerTargetGroupsRequest, AttachLoadBalancerTargetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(AttachLoadBalancersRequest request) {

        return attachLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(AttachLoadBalancersRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest)
     */
    @Override
    public java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync() {

        return attachLoadBalancersAsync(new AttachLoadBalancersRequest());
    }

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation with an AsyncHandler.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler) {

        return attachLoadBalancersAsync(new AttachLoadBalancersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteScheduledActionResult> batchDeleteScheduledActionAsync(BatchDeleteScheduledActionRequest request) {

        return batchDeleteScheduledActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteScheduledActionResult> batchDeleteScheduledActionAsync(BatchDeleteScheduledActionRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteScheduledActionRequest, BatchDeleteScheduledActionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchPutScheduledUpdateGroupActionResult> batchPutScheduledUpdateGroupActionAsync(
            BatchPutScheduledUpdateGroupActionRequest request) {

        return batchPutScheduledUpdateGroupActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutScheduledUpdateGroupActionResult> batchPutScheduledUpdateGroupActionAsync(
            BatchPutScheduledUpdateGroupActionRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchPutScheduledUpdateGroupActionRequest, BatchPutScheduledUpdateGroupActionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(CompleteLifecycleActionRequest request) {

        return completeLifecycleActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(CompleteLifecycleActionRequest request,
            com.amazonaws.handlers.AsyncHandler<CompleteLifecycleActionRequest, CompleteLifecycleActionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAutoScalingGroupResult> createAutoScalingGroupAsync(CreateAutoScalingGroupRequest request) {

        return createAutoScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAutoScalingGroupResult> createAutoScalingGroupAsync(CreateAutoScalingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAutoScalingGroupRequest, CreateAutoScalingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchConfigurationResult> createLaunchConfigurationAsync(CreateLaunchConfigurationRequest request) {

        return createLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchConfigurationResult> createLaunchConfigurationAsync(CreateLaunchConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchConfigurationRequest, CreateLaunchConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateOrUpdateTagsResult> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest request) {

        return createOrUpdateTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOrUpdateTagsResult> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAutoScalingGroupResult> deleteAutoScalingGroupAsync(DeleteAutoScalingGroupRequest request) {

        return deleteAutoScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAutoScalingGroupResult> deleteAutoScalingGroupAsync(DeleteAutoScalingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAutoScalingGroupRequest, DeleteAutoScalingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchConfigurationResult> deleteLaunchConfigurationAsync(DeleteLaunchConfigurationRequest request) {

        return deleteLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchConfigurationResult> deleteLaunchConfigurationAsync(DeleteLaunchConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchConfigurationRequest, DeleteLaunchConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(DeleteLifecycleHookRequest request) {

        return deleteLifecycleHookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(DeleteLifecycleHookRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLifecycleHookRequest, DeleteLifecycleHookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationConfigurationResult> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest request) {

        return deleteNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationConfigurationResult> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationConfigurationRequest, DeleteNotificationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest request) {

        return deleteScheduledActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduledActionRequest, DeleteScheduledActionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request) {

        return describeAccountLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync() {

        return describeAccountLimitsAsync(new DescribeAccountLimitsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation with an AsyncHandler.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {

        return describeAccountLimitsAsync(new DescribeAccountLimitsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest request) {

        return describeAdjustmentTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes operation.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync() {

        return describeAdjustmentTypesAsync(new DescribeAdjustmentTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes operation with an AsyncHandler.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler) {

        return describeAdjustmentTypesAsync(new DescribeAdjustmentTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest request) {

        return describeAutoScalingGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups operation.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync() {

        return describeAutoScalingGroupsAsync(new DescribeAutoScalingGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups operation with an AsyncHandler.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler) {

        return describeAutoScalingGroupsAsync(new DescribeAutoScalingGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest request) {

        return describeAutoScalingInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances operation.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync() {

        return describeAutoScalingInstancesAsync(new DescribeAutoScalingInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances operation with an AsyncHandler.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler) {

        return describeAutoScalingInstancesAsync(new DescribeAutoScalingInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest request) {

        return describeAutoScalingNotificationTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAutoScalingNotificationTypes operation.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync() {

        return describeAutoScalingNotificationTypesAsync(new DescribeAutoScalingNotificationTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAutoScalingNotificationTypes operation with an AsyncHandler.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler) {

        return describeAutoScalingNotificationTypesAsync(new DescribeAutoScalingNotificationTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest request) {

        return describeLaunchConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations operation.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync() {

        return describeLaunchConfigurationsAsync(new DescribeLaunchConfigurationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations operation with an AsyncHandler.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler) {

        return describeLaunchConfigurationsAsync(new DescribeLaunchConfigurationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest request) {

        return describeLifecycleHookTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes operation.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync() {

        return describeLifecycleHookTypesAsync(new DescribeLifecycleHookTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes operation with an AsyncHandler.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler) {

        return describeLifecycleHookTypesAsync(new DescribeLifecycleHookTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(DescribeLifecycleHooksRequest request) {

        return describeLifecycleHooksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(DescribeLifecycleHooksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHooksRequest, DescribeLifecycleHooksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            DescribeLoadBalancerTargetGroupsRequest request) {

        return describeLoadBalancerTargetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            DescribeLoadBalancerTargetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerTargetGroupsRequest, DescribeLoadBalancerTargetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest request) {

        return describeLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest request) {

        return describeMetricCollectionTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes operation.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync() {

        return describeMetricCollectionTypesAsync(new DescribeMetricCollectionTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes operation with an AsyncHandler.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler) {

        return describeMetricCollectionTypesAsync(new DescribeMetricCollectionTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest request) {

        return describeNotificationConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeNotificationConfigurations operation.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync() {

        return describeNotificationConfigurationsAsync(new DescribeNotificationConfigurationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeNotificationConfigurations operation with an AsyncHandler.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler) {

        return describeNotificationConfigurationsAsync(new DescribeNotificationConfigurationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(DescribePoliciesRequest request) {

        return describePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(DescribePoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribePolicies operation.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync() {

        return describePoliciesAsync(new DescribePoliciesRequest());
    }

    /**
     * Simplified method form for invoking the DescribePolicies operation with an AsyncHandler.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler) {

        return describePoliciesAsync(new DescribePoliciesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(DescribeScalingActivitiesRequest request) {

        return describeScalingActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(DescribeScalingActivitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeScalingActivities operation.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync() {

        return describeScalingActivitiesAsync(new DescribeScalingActivitiesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeScalingActivities operation with an AsyncHandler.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler) {

        return describeScalingActivitiesAsync(new DescribeScalingActivitiesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest request) {

        return describeScalingProcessTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes operation.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync() {

        return describeScalingProcessTypesAsync(new DescribeScalingProcessTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes operation with an AsyncHandler.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler) {

        return describeScalingProcessTypesAsync(new DescribeScalingProcessTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest request) {

        return describeScheduledActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeScheduledActions operation.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync() {

        return describeScheduledActionsAsync(new DescribeScheduledActionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeScheduledActions operation with an AsyncHandler.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler) {

        return describeScheduledActionsAsync(new DescribeScheduledActionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync() {

        return describeTagsAsync(new DescribeTagsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTags operation with an AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return describeTagsAsync(new DescribeTagsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest request) {

        return describeTerminationPolicyTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes operation.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync() {

        return describeTerminationPolicyTypesAsync(new DescribeTerminationPolicyTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes operation with an AsyncHandler.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler) {

        return describeTerminationPolicyTypesAsync(new DescribeTerminationPolicyTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(DetachInstancesRequest request) {

        return detachInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(DetachInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachInstancesRequest, DetachInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(DetachLoadBalancerTargetGroupsRequest request) {

        return detachLoadBalancerTargetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(DetachLoadBalancerTargetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancerTargetGroupsRequest, DetachLoadBalancerTargetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(DetachLoadBalancersRequest request) {

        return detachLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(DetachLoadBalancersRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest)
     */
    @Override
    public java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync() {

        return detachLoadBalancersAsync(new DetachLoadBalancersRequest());
    }

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation with an AsyncHandler.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler) {

        return detachLoadBalancersAsync(new DetachLoadBalancersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DisableMetricsCollectionResult> disableMetricsCollectionAsync(DisableMetricsCollectionRequest request) {

        return disableMetricsCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableMetricsCollectionResult> disableMetricsCollectionAsync(DisableMetricsCollectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableMetricsCollectionRequest, DisableMetricsCollectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableMetricsCollectionResult> enableMetricsCollectionAsync(EnableMetricsCollectionRequest request) {

        return enableMetricsCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableMetricsCollectionResult> enableMetricsCollectionAsync(EnableMetricsCollectionRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableMetricsCollectionRequest, EnableMetricsCollectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(EnterStandbyRequest request) {

        return enterStandbyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(EnterStandbyRequest request,
            com.amazonaws.handlers.AsyncHandler<EnterStandbyRequest, EnterStandbyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExecutePolicyResult> executePolicyAsync(ExecutePolicyRequest request) {

        return executePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecutePolicyResult> executePolicyAsync(ExecutePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<ExecutePolicyRequest, ExecutePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(ExitStandbyRequest request) {

        return exitStandbyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(ExitStandbyRequest request,
            com.amazonaws.handlers.AsyncHandler<ExitStandbyRequest, ExitStandbyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(PutLifecycleHookRequest request) {

        return putLifecycleHookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(PutLifecycleHookRequest request,
            com.amazonaws.handlers.AsyncHandler<PutLifecycleHookRequest, PutLifecycleHookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutNotificationConfigurationResult> putNotificationConfigurationAsync(PutNotificationConfigurationRequest request) {

        return putNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutNotificationConfigurationResult> putNotificationConfigurationAsync(PutNotificationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutNotificationConfigurationRequest, PutNotificationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest request) {

        return putScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutScheduledUpdateGroupActionResult> putScheduledUpdateGroupActionAsync(PutScheduledUpdateGroupActionRequest request) {

        return putScheduledUpdateGroupActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutScheduledUpdateGroupActionResult> putScheduledUpdateGroupActionAsync(PutScheduledUpdateGroupActionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutScheduledUpdateGroupActionRequest, PutScheduledUpdateGroupActionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(RecordLifecycleActionHeartbeatRequest request) {

        return recordLifecycleActionHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(RecordLifecycleActionHeartbeatRequest request,
            com.amazonaws.handlers.AsyncHandler<RecordLifecycleActionHeartbeatRequest, RecordLifecycleActionHeartbeatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResumeProcessesResult> resumeProcessesAsync(ResumeProcessesRequest request) {

        return resumeProcessesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeProcessesResult> resumeProcessesAsync(ResumeProcessesRequest request,
            com.amazonaws.handlers.AsyncHandler<ResumeProcessesRequest, ResumeProcessesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetDesiredCapacityResult> setDesiredCapacityAsync(SetDesiredCapacityRequest request) {

        return setDesiredCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDesiredCapacityResult> setDesiredCapacityAsync(SetDesiredCapacityRequest request,
            com.amazonaws.handlers.AsyncHandler<SetDesiredCapacityRequest, SetDesiredCapacityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetInstanceHealthResult> setInstanceHealthAsync(SetInstanceHealthRequest request) {

        return setInstanceHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetInstanceHealthResult> setInstanceHealthAsync(SetInstanceHealthRequest request,
            com.amazonaws.handlers.AsyncHandler<SetInstanceHealthRequest, SetInstanceHealthResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(SetInstanceProtectionRequest request) {

        return setInstanceProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(SetInstanceProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<SetInstanceProtectionRequest, SetInstanceProtectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SuspendProcessesResult> suspendProcessesAsync(SuspendProcessesRequest request) {

        return suspendProcessesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SuspendProcessesResult> suspendProcessesAsync(SuspendProcessesRequest request,
            com.amazonaws.handlers.AsyncHandler<SuspendProcessesRequest, SuspendProcessesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest request) {

        return terminateInstanceInAutoScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateInstanceInAutoScalingGroupRequest, TerminateInstanceInAutoScalingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAutoScalingGroupResult> updateAutoScalingGroupAsync(UpdateAutoScalingGroupRequest request) {

        return updateAutoScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutoScalingGroupResult> updateAutoScalingGroupAsync(UpdateAutoScalingGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAutoScalingGroupRequest, UpdateAutoScalingGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

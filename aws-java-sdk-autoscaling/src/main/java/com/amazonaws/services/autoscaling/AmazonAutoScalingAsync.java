/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.autoscaling;

import com.amazonaws.services.autoscaling.model.*;

/**
 * Interface for accessing Auto Scaling asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Auto Scaling</fullname>
 * <p>
 * Auto Scaling is designed to automatically launch or terminate EC2 instances
 * based on user-defined policies, schedules, and health checks. Use this
 * service in conjunction with the Amazon CloudWatch and Elastic Load Balancing
 * services.
 * </p>
 */
public interface AmazonAutoScalingAsync extends AmazonAutoScaling {

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Auto Scaling increases the desired capacity of
     * the group by the number of instances being attached. If the number of
     * instances being attached plus the desired capacity of the group exceeds
     * the maximum size of the group, the operation fails.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-instance-asg.html"
     * >Attach EC2 Instances to Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     * @sample AmazonAutoScalingAsync.AttachInstances
     */
    java.util.concurrent.Future<Void> attachInstancesAsync(
            AttachInstancesRequest attachInstancesRequest);

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Auto Scaling increases the desired capacity of
     * the group by the number of instances being attached. If the number of
     * instances being attached plus the desired capacity of the group exceeds
     * the maximum size of the group, the operation fails.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-instance-asg.html"
     * >Attach EC2 Instances to Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.AttachInstances
     */
    java.util.concurrent.Future<Void> attachInstancesAsync(
            AttachInstancesRequest attachInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<AttachInstancesRequest, Void> asyncHandler);

    /**
     * <p>
     * Attaches one or more load balancers to the specified Auto Scaling group.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use
     * <a>DescribeLoadBalancers</a>. To detach the load balancer from the Auto
     * Scaling group, use <a>DetachLoadBalancers</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html"
     * >Attach a Load Balancer to Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     * @return A Java Future containing the result of the AttachLoadBalancers
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.AttachLoadBalancers
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            AttachLoadBalancersRequest attachLoadBalancersRequest);

    /**
     * <p>
     * Attaches one or more load balancers to the specified Auto Scaling group.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use
     * <a>DescribeLoadBalancers</a>. To detach the load balancer from the Auto
     * Scaling group, use <a>DetachLoadBalancers</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html"
     * >Attach a Load Balancer to Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachLoadBalancers
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.AttachLoadBalancers
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            AttachLoadBalancersRequest attachLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler);

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest)
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync();

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation
     * with an AsyncHandler.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Completes the lifecycle action for the associated token initiated under
     * the given lifecycle hook with the specified result.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>Create a notification target. A target can be either an Amazon SQS
     * queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li><b>Complete the lifecycle action</b>.</li>
     * </ol>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"
     * >Auto Scaling Pending State</a> and <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"
     * >Auto Scaling Terminating State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     * @return A Java Future containing the result of the
     *         CompleteLifecycleAction operation returned by the service.
     * @sample AmazonAutoScalingAsync.CompleteLifecycleAction
     */
    java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(
            CompleteLifecycleActionRequest completeLifecycleActionRequest);

    /**
     * <p>
     * Completes the lifecycle action for the associated token initiated under
     * the given lifecycle hook with the specified result.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>Create a notification target. A target can be either an Amazon SQS
     * queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li><b>Complete the lifecycle action</b>.</li>
     * </ol>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"
     * >Auto Scaling Pending State</a> and <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"
     * >Auto Scaling Terminating State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CompleteLifecycleAction operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CompleteLifecycleAction
     */
    java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(
            CompleteLifecycleActionRequest completeLifecycleActionRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteLifecycleActionRequest, CompleteLifecycleActionResult> asyncHandler);

    /**
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, which by default
     * is 20 per region, the call fails. For information about viewing and
     * updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroup.html"
     * >Auto Scaling Groups</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     * @sample AmazonAutoScalingAsync.CreateAutoScalingGroup
     */
    java.util.concurrent.Future<Void> createAutoScalingGroupAsync(
            CreateAutoScalingGroupRequest createAutoScalingGroupRequest);

    /**
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, which by default
     * is 20 per region, the call fails. For information about viewing and
     * updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroup.html"
     * >Auto Scaling Groups</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.CreateAutoScalingGroup
     */
    java.util.concurrent.Future<Void> createAutoScalingGroupAsync(
            CreateAutoScalingGroupRequest createAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAutoScalingGroupRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, which by
     * default is 100 per region, the call fails. For information about viewing
     * and updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/LaunchConfiguration.html"
     * >Launch Configurations</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     * @sample AmazonAutoScalingAsync.CreateLaunchConfiguration
     */
    java.util.concurrent.Future<Void> createLaunchConfigurationAsync(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest);

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, which by
     * default is 100 per region, the call fails. For information about viewing
     * and updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/LaunchConfiguration.html"
     * >Launch Configurations</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.CreateLaunchConfiguration
     */
    java.util.concurrent.Future<Void> createLaunchConfigurationAsync(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchConfigurationRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * A tag is defined by its resource ID, resource type, key, value, and
     * propagate flag. The value and the propagate flag are optional parameters.
     * The only supported resource type is <code>auto-scaling-group</code>, and
     * the resource ID must be the name of the group. The
     * <code>PropagateAtLaunch</code> flag determines whether the tag is added
     * to instances launched in the group. Valid values are <code>true</code> or
     * <code>false</code>.
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation
     * overwrites the previous tag definition, and you do not get an error
     * message.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     * @sample AmazonAutoScalingAsync.CreateOrUpdateTags
     */
    java.util.concurrent.Future<Void> createOrUpdateTagsAsync(
            CreateOrUpdateTagsRequest createOrUpdateTagsRequest);

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * A tag is defined by its resource ID, resource type, key, value, and
     * propagate flag. The value and the propagate flag are optional parameters.
     * The only supported resource type is <code>auto-scaling-group</code>, and
     * the resource ID must be the name of the group. The
     * <code>PropagateAtLaunch</code> flag determines whether the tag is added
     * to instances launched in the group. Valid values are <code>true</code> or
     * <code>false</code>.
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation
     * overwrites the previous tag definition, and you do not get an error
     * message.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.CreateOrUpdateTags
     */
    java.util.concurrent.Future<Void> createOrUpdateTagsAsync(
            CreateOrUpdateTagsRequest createOrUpdateTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOrUpdateTagsRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * If the group has instances or scaling activities in progress, you must
     * specify the option to force the deletion in order for it to succeed.
     * </p>
     * <p>
     * If the group has policies, deleting the group deletes the policies, the
     * underlying alarm actions, and any alarm that no longer has an associated
     * action.
     * </p>
     * <p>
     * To remove instances from the Auto Scaling group before deleting it, call
     * <a>DetachInstances</a> with the list of instances and the option to
     * decrement the desired capacity so that Auto Scaling does not launch
     * replacement instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call
     * <a>UpdateAutoScalingGroup</a> and set the minimum size and desired
     * capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     * @sample AmazonAutoScalingAsync.DeleteAutoScalingGroup
     */
    java.util.concurrent.Future<Void> deleteAutoScalingGroupAsync(
            DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest);

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * If the group has instances or scaling activities in progress, you must
     * specify the option to force the deletion in order for it to succeed.
     * </p>
     * <p>
     * If the group has policies, deleting the group deletes the policies, the
     * underlying alarm actions, and any alarm that no longer has an associated
     * action.
     * </p>
     * <p>
     * To remove instances from the Auto Scaling group before deleting it, call
     * <a>DetachInstances</a> with the list of instances and the option to
     * decrement the desired capacity so that Auto Scaling does not launch
     * replacement instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call
     * <a>UpdateAutoScalingGroup</a> and set the minimum size and desired
     * capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.DeleteAutoScalingGroup
     */
    java.util.concurrent.Future<Void> deleteAutoScalingGroupAsync(
            DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAutoScalingGroupRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling group.
     * When this call completes, the launch configuration is no longer available
     * for use.
     * </p>
     * 
     * @param deleteLaunchConfigurationRequest
     * @sample AmazonAutoScalingAsync.DeleteLaunchConfiguration
     */
    java.util.concurrent.Future<Void> deleteLaunchConfigurationAsync(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest);

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling group.
     * When this call completes, the launch configuration is no longer available
     * for use.
     * </p>
     * 
     * @param deleteLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.DeleteLaunchConfiguration
     */
    java.util.concurrent.Future<Void> deleteLaunchConfigurationAsync(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchConfigurationRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed first
     * (<code>ABANDON</code> for launching instances, <code>CONTINUE</code> for
     * terminating instances).
     * </p>
     * 
     * @param deleteLifecycleHookRequest
     * @return A Java Future containing the result of the DeleteLifecycleHook
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteLifecycleHook
     */
    java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(
            DeleteLifecycleHookRequest deleteLifecycleHookRequest);

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed first
     * (<code>ABANDON</code> for launching instances, <code>CONTINUE</code> for
     * terminating instances).
     * </p>
     * 
     * @param deleteLifecycleHookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLifecycleHook
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteLifecycleHook
     */
    java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(
            DeleteLifecycleHookRequest deleteLifecycleHookRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLifecycleHookRequest, DeleteLifecycleHookResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @sample AmazonAutoScalingAsync.DeleteNotificationConfiguration
     */
    java.util.concurrent.Future<Void> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest);

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.DeleteNotificationConfiguration
     */
    java.util.concurrent.Future<Void> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationConfigurationRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified Auto Scaling policy.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not
     * delete the alarm, even if it no longer has an associated action.
     * </p>
     * 
     * @param deletePolicyRequest
     * @sample AmazonAutoScalingAsync.DeletePolicy
     */
    java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified Auto Scaling policy.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not
     * delete the alarm, even if it no longer has an associated action.
     * </p>
     * 
     * @param deletePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.DeletePolicy
     */
    java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @sample AmazonAutoScalingAsync.DeleteScheduledAction
     */
    java.util.concurrent.Future<Void> deleteScheduledActionAsync(
            DeleteScheduledActionRequest deleteScheduledActionRequest);

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.DeleteScheduledAction
     */
    java.util.concurrent.Future<Void> deleteScheduledActionAsync(
            DeleteScheduledActionRequest deleteScheduledActionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduledActionRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @sample AmazonAutoScalingAsync.DeleteTags
     */
    java.util.concurrent.Future<Void> deleteTagsAsync(
            DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.DeleteTags
     */
    java.util.concurrent.Future<Void> deleteTagsAsync(
            DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, Void> asyncHandler);

    /**
     * <p>
     * Describes the current Auto Scaling resource limits for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see <a
     * href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >AWS Service Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return A Java Future containing the result of the DescribeAccountLimits
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAccountLimits
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * <p>
     * Describes the current Auto Scaling resource limits for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see <a
     * href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >AWS Service Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountLimits
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAccountLimits
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest describeAccountLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest)
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync();

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation
     * with an AsyncHandler.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

    /**
     * <p>
     * Describes the policy adjustment types for use with
     * <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @return A Java Future containing the result of the
     *         DescribeAdjustmentTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAdjustmentTypes
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest);

    /**
     * <p>
     * Describes the policy adjustment types for use with
     * <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeAdjustmentTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAdjustmentTypes
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes
     * operation.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest)
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync();

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes operation
     * with an AsyncHandler.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more Auto Scaling groups. If a list of names is not
     * provided, the call describes all Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @return A Java Future containing the result of the
     *         DescribeAutoScalingGroups operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAutoScalingGroups
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest);

    /**
     * <p>
     * Describes one or more Auto Scaling groups. If a list of names is not
     * provided, the call describes all Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeAutoScalingGroups operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAutoScalingGroups
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups
     * operation.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest)
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups
     * operation with an AsyncHandler.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more Auto Scaling instances. If a list is not provided,
     * the call describes all instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @return A Java Future containing the result of the
     *         DescribeAutoScalingInstances operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAutoScalingInstances
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest);

    /**
     * <p>
     * Describes one or more Auto Scaling instances. If a list is not provided,
     * the call describes all instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeAutoScalingInstances operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAutoScalingInstances
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances
     * operation.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest)
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync();

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances
     * operation with an AsyncHandler.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler);

    /**
     * <p>
     * Describes the notification types that are supported by Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return A Java Future containing the result of the
     *         DescribeAutoScalingNotificationTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeAutoScalingNotificationTypes
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest);

    /**
     * <p>
     * Describes the notification types that are supported by Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeAutoScalingNotificationTypes operation returned by the
     *         service.
     * @sample 
     *         AmazonAutoScalingAsyncHandler.DescribeAutoScalingNotificationTypes
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the
     * DescribeAutoScalingNotificationTypes operation.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest)
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync();

    /**
     * Simplified method form for invoking the
     * DescribeAutoScalingNotificationTypes operation with an AsyncHandler.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more launch configurations. If you omit the list of
     * names, then the call describes all launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @return A Java Future containing the result of the
     *         DescribeLaunchConfigurations operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLaunchConfigurations
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest);

    /**
     * <p>
     * Describes one or more launch configurations. If you omit the list of
     * names, then the call describes all launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeLaunchConfigurations operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLaunchConfigurations
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations
     * operation.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest)
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync();

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations
     * operation with an AsyncHandler.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * 
     * @param describeLifecycleHookTypesRequest
     * @return A Java Future containing the result of the
     *         DescribeLifecycleHookTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLifecycleHookTypes
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest);

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * 
     * @param describeLifecycleHookTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeLifecycleHookTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLifecycleHookTypes
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes
     * operation.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest)
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync();

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes
     * operation with an AsyncHandler.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @return A Java Future containing the result of the DescribeLifecycleHooks
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLifecycleHooks
     */
    java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(
            DescribeLifecycleHooksRequest describeLifecycleHooksRequest);

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLifecycleHooks
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLifecycleHooks
     */
    java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(
            DescribeLifecycleHooksRequest describeLifecycleHooksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHooksRequest, DescribeLifecycleHooksResult> asyncHandler);

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return A Java Future containing the result of the DescribeLoadBalancers
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLoadBalancers
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            DescribeLoadBalancersRequest describeLoadBalancersRequest);

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancers
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLoadBalancers
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            DescribeLoadBalancersRequest describeLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Describes the available CloudWatch metrics for Auto Scaling.
     * </p>
     * <p>
     * Note that the <code>GroupStandbyInstances</code> metric is not returned
     * by default. You must explicitly request this metric when calling
     * <a>EnableMetricsCollection</a>.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @return A Java Future containing the result of the
     *         DescribeMetricCollectionTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeMetricCollectionTypes
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest);

    /**
     * <p>
     * Describes the available CloudWatch metrics for Auto Scaling.
     * </p>
     * <p>
     * Note that the <code>GroupStandbyInstances</code> metric is not returned
     * by default. You must explicitly request this metric when calling
     * <a>EnableMetricsCollection</a>.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeMetricCollectionTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeMetricCollectionTypes
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes
     * operation.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest)
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync();

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes
     * operation with an AsyncHandler.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @return A Java Future containing the result of the
     *         DescribeNotificationConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeNotificationConfigurations
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest);

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeNotificationConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeNotificationConfigurations
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the
     * DescribeNotificationConfigurations operation.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest)
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync();

    /**
     * Simplified method form for invoking the
     * DescribeNotificationConfigurations operation with an AsyncHandler.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @return A Java Future containing the result of the DescribePolicies
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribePolicies
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(
            DescribePoliciesRequest describePoliciesRequest);

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePolicies
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribePolicies
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(
            DescribePoliciesRequest describePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribePolicies operation.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest)
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync();

    /**
     * Simplified method form for invoking the DescribePolicies operation with
     * an AsyncHandler.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling
     * group. If you omit the <code>ActivityIds</code>, the call returns all
     * activities from the past six weeks. Activities are sorted by the start
     * time. Activities still in progress appear first on the list.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return A Java Future containing the result of the
     *         DescribeScalingActivities operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeScalingActivities
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest);

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling
     * group. If you omit the <code>ActivityIds</code>, the call returns all
     * activities from the past six weeks. Activities are sorted by the start
     * time. Activities still in progress appear first on the list.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeScalingActivities operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeScalingActivities
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeScalingActivities
     * operation.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest)
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync();

    /**
     * Simplified method form for invoking the DescribeScalingActivities
     * operation with an AsyncHandler.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler);

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a>
     * and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @return A Java Future containing the result of the
     *         DescribeScalingProcessTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeScalingProcessTypes
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest);

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a>
     * and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeScalingProcessTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeScalingProcessTypes
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes
     * operation.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest)
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync();

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes
     * operation with an AsyncHandler.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't
     * run. To describe the actions that have already run, use
     * <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return A Java Future containing the result of the
     *         DescribeScheduledActions operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeScheduledActions
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            DescribeScheduledActionsRequest describeScheduledActionsRequest);

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't
     * run. To describe the actions that have already run, use
     * <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeScheduledActions operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeScheduledActions
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            DescribeScheduledActionsRequest describeScheduledActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeScheduledActions
     * operation.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest)
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync();

    /**
     * Simplified method form for invoking the DescribeScheduledActions
     * operation with an AsyncHandler.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for
     * the tags for a specific Auto Scaling group. You can specify multiple
     * values for a filter. A tag must match at least one of the specified
     * values for it to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information
     * for a particular tag only if it matches all the filters. If there's no
     * match, no special message is returned.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation
     *         returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for
     * the tags for a specific Auto Scaling group. You can specify multiple
     * values for a filter. A tag must match at least one of the specified
     * values for it to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information
     * for a particular tag only if it matches all the filters. If there's no
     * match, no special message is returned.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation
     *         returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync();

    /**
     * Simplified method form for invoking the DescribeTags operation with an
     * AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Describes the termination policies supported by Auto Scaling.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @return A Java Future containing the result of the
     *         DescribeTerminationPolicyTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeTerminationPolicyTypes
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest);

    /**
     * <p>
     * Describes the termination policies supported by Auto Scaling.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeTerminationPolicyTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeTerminationPolicyTypes
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes
     * operation.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest)
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync();

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes
     * operation with an AsyncHandler.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler);

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * </p>
     * <p>
     * After the instances are detached, you can manage them independently from
     * the rest of the Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Auto
     * Scaling launches instances to replace the ones that are detached.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/detach-instance-asg.html"
     * >Detach EC2 Instances from Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     * @return A Java Future containing the result of the DetachInstances
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.DetachInstances
     */
    java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(
            DetachInstancesRequest detachInstancesRequest);

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * </p>
     * <p>
     * After the instances are detached, you can manage them independently from
     * the rest of the Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Auto
     * Scaling launches instances to replace the ones that are detached.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/detach-instance-asg.html"
     * >Detach EC2 Instances from Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachInstances
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DetachInstances
     */
    java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(
            DetachInstancesRequest detachInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DetachInstancesRequest, DetachInstancesResult> asyncHandler);

    /**
     * <p>
     * Removes one or more load balancers from the specified Auto Scaling group.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code>
     * state while deregistering the instances in the group. When all instances
     * are deregistered, then you can no longer describe the load balancer using
     * <a>DescribeLoadBalancers</a>. Note that the instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     * @return A Java Future containing the result of the DetachLoadBalancers
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.DetachLoadBalancers
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            DetachLoadBalancersRequest detachLoadBalancersRequest);

    /**
     * <p>
     * Removes one or more load balancers from the specified Auto Scaling group.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code>
     * state while deregistering the instances in the group. When all instances
     * are deregistered, then you can no longer describe the load balancer using
     * <a>DescribeLoadBalancers</a>. Note that the instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachLoadBalancers
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DetachLoadBalancers
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            DetachLoadBalancersRequest detachLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest)
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync();

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation
     * with an AsyncHandler.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Disables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @sample AmazonAutoScalingAsync.DisableMetricsCollection
     */
    java.util.concurrent.Future<Void> disableMetricsCollectionAsync(
            DisableMetricsCollectionRequest disableMetricsCollectionRequest);

    /**
     * <p>
     * Disables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.DisableMetricsCollection
     */
    java.util.concurrent.Future<Void> disableMetricsCollectionAsync(
            DisableMetricsCollectionRequest disableMetricsCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DisableMetricsCollectionRequest, Void> asyncHandler);

    /**
     * <p>
     * Enables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     * <p>
     * You can only enable metrics collection if <code>InstanceMonitoring</code>
     * in the launch configuration for the group is set to <code>True</code>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     * @sample AmazonAutoScalingAsync.EnableMetricsCollection
     */
    java.util.concurrent.Future<Void> enableMetricsCollectionAsync(
            EnableMetricsCollectionRequest enableMetricsCollectionRequest);

    /**
     * <p>
     * Enables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     * <p>
     * You can only enable metrics collection if <code>InstanceMonitoring</code>
     * in the launch configuration for the group is set to <code>True</code>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.EnableMetricsCollection
     */
    java.util.concurrent.Future<Void> enableMetricsCollectionAsync(
            EnableMetricsCollectionRequest enableMetricsCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<EnableMetricsCollectionRequest, Void> asyncHandler);

    /**
     * <p>
     * Moves the specified instances into <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"
     * >Auto Scaling InService State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     * @return A Java Future containing the result of the EnterStandby operation
     *         returned by the service.
     * @sample AmazonAutoScalingAsync.EnterStandby
     */
    java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(
            EnterStandbyRequest enterStandbyRequest);

    /**
     * <p>
     * Moves the specified instances into <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"
     * >Auto Scaling InService State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnterStandby operation
     *         returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.EnterStandby
     */
    java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(
            EnterStandbyRequest enterStandbyRequest,
            com.amazonaws.handlers.AsyncHandler<EnterStandbyRequest, EnterStandbyResult> asyncHandler);

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @sample AmazonAutoScalingAsync.ExecutePolicy
     */
    java.util.concurrent.Future<Void> executePolicyAsync(
            ExecutePolicyRequest executePolicyRequest);

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.ExecutePolicy
     */
    java.util.concurrent.Future<Void> executePolicyAsync(
            ExecutePolicyRequest executePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ExecutePolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Moves the specified instances out of <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"
     * >Auto Scaling InService State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     * @return A Java Future containing the result of the ExitStandby operation
     *         returned by the service.
     * @sample AmazonAutoScalingAsync.ExitStandby
     */
    java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(
            ExitStandbyRequest exitStandbyRequest);

    /**
     * <p>
     * Moves the specified instances out of <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"
     * >Auto Scaling InService State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExitStandby operation
     *         returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.ExitStandby
     */
    java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(
            ExitStandbyRequest exitStandbyRequest,
            com.amazonaws.handlers.AsyncHandler<ExitStandbyRequest, ExitStandbyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling Group.
     * </p>
     * <p>
     * A lifecycle hook tells Auto Scaling that you want to perform an action on
     * an instance that is not actively in service; for example, either when the
     * instance launches or before the instance terminates.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>Create a notification target. A target can be either an Amazon SQS
     * queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li><b>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</b></li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li>Complete the lifecycle action.</li>
     * </ol>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"
     * >Auto Scaling Pending State</a> and <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"
     * >Auto Scaling Terminating State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is
     * 50 per region, the call fails. For information about updating this limit,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >AWS Service Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * 
     * @param putLifecycleHookRequest
     * @return A Java Future containing the result of the PutLifecycleHook
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.PutLifecycleHook
     */
    java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(
            PutLifecycleHookRequest putLifecycleHookRequest);

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling Group.
     * </p>
     * <p>
     * A lifecycle hook tells Auto Scaling that you want to perform an action on
     * an instance that is not actively in service; for example, either when the
     * instance launches or before the instance terminates.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>Create a notification target. A target can be either an Amazon SQS
     * queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li><b>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</b></li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li>Complete the lifecycle action.</li>
     * </ol>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"
     * >Auto Scaling Pending State</a> and <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"
     * >Auto Scaling Terminating State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is
     * 50 per region, the call fails. For information about updating this limit,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >AWS Service Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * 
     * @param putLifecycleHookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLifecycleHook
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.PutLifecycleHook
     */
    java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(
            PutLifecycleHookRequest putLifecycleHookRequest,
            com.amazonaws.handlers.AsyncHandler<PutLifecycleHookRequest, PutLifecycleHookResult> asyncHandler);

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified
     * events take place. Subscribers to this topic can have messages for events
     * delivered to an endpoint such as a web server or email address.
     * </p>
     * <p>
     * For more information see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASGettingNotifications.html"
     * >Getting Notifications When Your Auto Scaling Group Changes</a> in the
     * <i>Auto Scaling Developer Guide</i>.
     * </p>
     * <p>
     * This configuration overwrites an existing configuration.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     * @sample AmazonAutoScalingAsync.PutNotificationConfiguration
     */
    java.util.concurrent.Future<Void> putNotificationConfigurationAsync(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest);

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified
     * events take place. Subscribers to this topic can have messages for events
     * delivered to an endpoint such as a web server or email address.
     * </p>
     * <p>
     * For more information see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASGettingNotifications.html"
     * >Getting Notifications When Your Auto Scaling Group Changes</a> in the
     * <i>Auto Scaling Developer Guide</i>.
     * </p>
     * <p>
     * This configuration overwrites an existing configuration.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.PutNotificationConfiguration
     */
    java.util.concurrent.Future<Void> putNotificationConfigurationAsync(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutNotificationConfigurationRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates or updates a policy for an Auto Scaling group. To update an
     * existing policy, use the existing policy name and set the parameters you
     * want to change. Any existing parameter not changed in an update to an
     * existing policy is not changed in this update request.
     * </p>
     * <p>
     * If you exceed your maximum limit of step adjustments, which by default is
     * 20 per region, the call fails. For information about updating this limit,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >AWS Service Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @return A Java Future containing the result of the PutScalingPolicy
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.PutScalingPolicy
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(
            PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a policy for an Auto Scaling group. To update an
     * existing policy, use the existing policy name and set the parameters you
     * want to change. Any existing parameter not changed in an update to an
     * existing policy is not changed in this update request.
     * </p>
     * <p>
     * If you exceed your maximum limit of step adjustments, which by default is
     * 20 per region, the call fails. For information about updating this limit,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >AWS Service Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScalingPolicy
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.PutScalingPolicy
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(
            PutScalingPolicyRequest putScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling group.
     * When updating a scheduled scaling action, if you leave a parameter
     * unspecified, the corresponding value remains unchanged in the affected
     * Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/schedule_time.html"
     * >Scheduled Scaling</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     * @sample AmazonAutoScalingAsync.PutScheduledUpdateGroupAction
     */
    java.util.concurrent.Future<Void> putScheduledUpdateGroupActionAsync(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest);

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling group.
     * When updating a scheduled scaling action, if you leave a parameter
     * unspecified, the corresponding value remains unchanged in the affected
     * Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/schedule_time.html"
     * >Scheduled Scaling</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.PutScheduledUpdateGroupAction
     */
    java.util.concurrent.Future<Void> putScheduledUpdateGroupActionAsync(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest,
            com.amazonaws.handlers.AsyncHandler<PutScheduledUpdateGroupActionRequest, Void> asyncHandler);

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with a specific
     * token. This extends the timeout by the length of time defined by the
     * <code>HeartbeatTimeout</code> parameter of <a>PutLifecycleHook</a>.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>Create a notification target. A target can be either an Amazon SQS
     * queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li><b>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</b></li>
     * <li>Complete the lifecycle action.</li>
     * </ol>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"
     * >Auto Scaling Pending State</a> and <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"
     * >Auto Scaling Terminating State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     * @return A Java Future containing the result of the
     *         RecordLifecycleActionHeartbeat operation returned by the service.
     * @sample AmazonAutoScalingAsync.RecordLifecycleActionHeartbeat
     */
    java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest);

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with a specific
     * token. This extends the timeout by the length of time defined by the
     * <code>HeartbeatTimeout</code> parameter of <a>PutLifecycleHook</a>.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>Create a notification target. A target can be either an Amazon SQS
     * queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li><b>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</b></li>
     * <li>Complete the lifecycle action.</li>
     * </ol>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"
     * >Auto Scaling Pending State</a> and <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"
     * >Auto Scaling Terminating State</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         RecordLifecycleActionHeartbeat operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.RecordLifecycleActionHeartbeat
     */
    java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest,
            com.amazonaws.handlers.AsyncHandler<RecordLifecycleActionHeartbeatRequest, RecordLifecycleActionHeartbeatResult> asyncHandler);

    /**
     * <p>
     * Resumes the specified suspended Auto Scaling processes for the specified
     * Auto Scaling group. To resume specific processes, use the
     * <code>ScalingProcesses</code> parameter. To resume all processes, omit
     * the <code>ScalingProcesses</code> parameter. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"
     * >Suspend and Resume Auto Scaling Processes</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     * @sample AmazonAutoScalingAsync.ResumeProcesses
     */
    java.util.concurrent.Future<Void> resumeProcessesAsync(
            ResumeProcessesRequest resumeProcessesRequest);

    /**
     * <p>
     * Resumes the specified suspended Auto Scaling processes for the specified
     * Auto Scaling group. To resume specific processes, use the
     * <code>ScalingProcesses</code> parameter. To resume all processes, omit
     * the <code>ScalingProcesses</code> parameter. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"
     * >Suspend and Resume Auto Scaling Processes</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.ResumeProcesses
     */
    java.util.concurrent.Future<Void> resumeProcessesAsync(
            ResumeProcessesRequest resumeProcessesRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeProcessesRequest, Void> asyncHandler);

    /**
     * <p>
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * For more information about desired capacity, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/WhatIsAutoScaling.html"
     * >What Is Auto Scaling?</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     * @sample AmazonAutoScalingAsync.SetDesiredCapacity
     */
    java.util.concurrent.Future<Void> setDesiredCapacityAsync(
            SetDesiredCapacityRequest setDesiredCapacityRequest);

    /**
     * <p>
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * For more information about desired capacity, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/WhatIsAutoScaling.html"
     * >What Is Auto Scaling?</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.SetDesiredCapacity
     */
    java.util.concurrent.Future<Void> setDesiredCapacityAsync(
            SetDesiredCapacityRequest setDesiredCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<SetDesiredCapacityRequest, Void> asyncHandler);

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     * @sample AmazonAutoScalingAsync.SetInstanceHealth
     */
    java.util.concurrent.Future<Void> setInstanceHealthAsync(
            SetInstanceHealthRequest setInstanceHealthRequest);

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.SetInstanceHealth
     */
    java.util.concurrent.Future<Void> setInstanceHealthAsync(
            SetInstanceHealthRequest setInstanceHealthRequest,
            com.amazonaws.handlers.AsyncHandler<SetInstanceHealthRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates the instance protection settings of the specified instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html#instance-protection"
     * >Instance Protection</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     * @return A Java Future containing the result of the SetInstanceProtection
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsync.SetInstanceProtection
     */
    java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(
            SetInstanceProtectionRequest setInstanceProtectionRequest);

    /**
     * <p>
     * Updates the instance protection settings of the specified instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html#instance-protection"
     * >Instance Protection</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetInstanceProtection
     *         operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.SetInstanceProtection
     */
    java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(
            SetInstanceProtectionRequest setInstanceProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<SetInstanceProtectionRequest, SetInstanceProtectionResult> asyncHandler);

    /**
     * <p>
     * Suspends the specified Auto Scaling processes for the specified Auto
     * Scaling group. To suspend specific processes, use the
     * <code>ScalingProcesses</code> parameter. To suspend all processes, omit
     * the <code>ScalingProcesses</code> parameter.
     * </p>
     * <p>
     * Note that if you suspend either the <code>Launch</code> or
     * <code>Terminate</code> process types, it can prevent other process types
     * from functioning properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use <a>ResumeProcesses</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"
     * >Suspend and Resume Auto Scaling Processes</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param suspendProcessesRequest
     * @sample AmazonAutoScalingAsync.SuspendProcesses
     */
    java.util.concurrent.Future<Void> suspendProcessesAsync(
            SuspendProcessesRequest suspendProcessesRequest);

    /**
     * <p>
     * Suspends the specified Auto Scaling processes for the specified Auto
     * Scaling group. To suspend specific processes, use the
     * <code>ScalingProcesses</code> parameter. To suspend all processes, omit
     * the <code>ScalingProcesses</code> parameter.
     * </p>
     * <p>
     * Note that if you suspend either the <code>Launch</code> or
     * <code>Terminate</code> process types, it can prevent other process types
     * from functioning properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use <a>ResumeProcesses</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"
     * >Suspend and Resume Auto Scaling Processes</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param suspendProcessesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.SuspendProcesses
     */
    java.util.concurrent.Future<Void> suspendProcessesAsync(
            SuspendProcessesRequest suspendProcessesRequest,
            com.amazonaws.handlers.AsyncHandler<SuspendProcessesRequest, Void> asyncHandler);

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired
     * group size.
     * </p>
     * <p>
     * This call simply makes a termination request. The instance is not
     * terminated immediately.
     * </p>
     * 
     * @param terminateInstanceInAutoScalingGroupRequest
     * @return A Java Future containing the result of the
     *         TerminateInstanceInAutoScalingGroup operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.TerminateInstanceInAutoScalingGroup
     */
    java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest);

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired
     * group size.
     * </p>
     * <p>
     * This call simply makes a termination request. The instance is not
     * terminated immediately.
     * </p>
     * 
     * @param terminateInstanceInAutoScalingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         TerminateInstanceInAutoScalingGroup operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.TerminateInstanceInAutoScalingGroup
     */
    java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateInstanceInAutoScalingGroupRequest, TerminateInstanceInAutoScalingGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * To update an Auto Scaling group with a launch configuration with
     * <code>InstanceMonitoring</code> set to <code>False</code>, you must first
     * disable the collection of group metrics. Otherwise, you will get an
     * error. If you have previously enabled the collection of group metrics,
     * you can disable it using <a>DisableMetricsCollection</a>.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any
     * launch configuration settings take effect on any triggers after this call
     * returns. Scaling activities that are currently in progress aren't
     * affected.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a new value for <code>MinSize</code> without specifying a
     * value for <code>DesiredCapacity</code>, and the new <code>MinSize</code>
     * is larger than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value
     * of <code>MinSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MaxSize</code> without specifying a
     * value for <code>DesiredCapacity</code>, and the new <code>MaxSize</code>
     * is smaller than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value
     * of <code>MaxSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other optional parameters are left unchanged if not specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAutoScalingGroupRequest
     * @sample AmazonAutoScalingAsync.UpdateAutoScalingGroup
     */
    java.util.concurrent.Future<Void> updateAutoScalingGroupAsync(
            UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest);

    /**
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * To update an Auto Scaling group with a launch configuration with
     * <code>InstanceMonitoring</code> set to <code>False</code>, you must first
     * disable the collection of group metrics. Otherwise, you will get an
     * error. If you have previously enabled the collection of group metrics,
     * you can disable it using <a>DisableMetricsCollection</a>.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any
     * launch configuration settings take effect on any triggers after this call
     * returns. Scaling activities that are currently in progress aren't
     * affected.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a new value for <code>MinSize</code> without specifying a
     * value for <code>DesiredCapacity</code>, and the new <code>MinSize</code>
     * is larger than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value
     * of <code>MinSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MaxSize</code> without specifying a
     * value for <code>DesiredCapacity</code>, and the new <code>MaxSize</code>
     * is smaller than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value
     * of <code>MaxSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other optional parameters are left unchanged if not specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAutoScalingGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonAutoScalingAsyncHandler.UpdateAutoScalingGroup
     */
    java.util.concurrent.Future<Void> updateAutoScalingGroupAsync(
            UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAutoScalingGroupRequest, Void> asyncHandler);

}

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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.autoscaling.model.*;

/**
 * Interface for accessing Auto Scaling.
 * <p>
 * <fullname>Auto Scaling</fullname>
 * <p>
 * Auto Scaling is designed to automatically launch or terminate EC2 instances
 * based on user-defined policies, schedules, and health checks. Use this
 * service in conjunction with the Amazon CloudWatch and Elastic Load Balancing
 * services.
 * </p>
 */
public interface AmazonAutoScaling {

    /**
     * Overrides the default endpoint for this client
     * ("https://autoscaling.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "autoscaling.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://autoscaling.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "autoscaling.amazonaws.com") or a full URL,
     *        including the protocol (ex: "https://autoscaling.amazonaws.com")
     *        of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonAutoScaling#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.AttachInstances
     */
    void attachInstances(AttachInstancesRequest attachInstancesRequest);

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
     * @return Result of the AttachLoadBalancers operation returned by the
     *         service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.AttachLoadBalancers
     */
    AttachLoadBalancersResult attachLoadBalancers(
            AttachLoadBalancersRequest attachLoadBalancersRequest);

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation.
     *
     * @see #attachLoadBalancers(AttachLoadBalancersRequest)
     */
    AttachLoadBalancersResult attachLoadBalancers();

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
     * @return Result of the CompleteLifecycleAction operation returned by the
     *         service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.CompleteLifecycleAction
     */
    CompleteLifecycleActionResult completeLifecycleAction(
            CompleteLifecycleActionRequest completeLifecycleActionRequest);

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
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration
     *         with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources
     *         (for example, groups, launch configurations, or lifecycle hooks).
     *         For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.CreateAutoScalingGroup
     */
    void createAutoScalingGroup(
            CreateAutoScalingGroupRequest createAutoScalingGroupRequest);

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
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration
     *         with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources
     *         (for example, groups, launch configurations, or lifecycle hooks).
     *         For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.CreateLaunchConfiguration
     */
    void createLaunchConfiguration(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest);

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
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources
     *         (for example, groups, launch configurations, or lifecycle hooks).
     *         For more information, see <a>DescribeAccountLimits</a>.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration
     *         with this name.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.CreateOrUpdateTags
     */
    void createOrUpdateTags(CreateOrUpdateTagsRequest createOrUpdateTagsRequest);

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
     * @throws ScalingActivityInProgressException
     *         The Auto Scaling group can't be deleted because there are scaling
     *         activities in progress.
     * @throws ResourceInUseException
     *         The Auto Scaling group or launch configuration can't be deleted
     *         because it is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteAutoScalingGroup
     */
    void deleteAutoScalingGroup(
            DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest);

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
     * @throws ResourceInUseException
     *         The Auto Scaling group or launch configuration can't be deleted
     *         because it is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteLaunchConfiguration
     */
    void deleteLaunchConfiguration(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest);

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
     * @return Result of the DeleteLifecycleHook operation returned by the
     *         service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteLifecycleHook
     */
    DeleteLifecycleHookResult deleteLifecycleHook(
            DeleteLifecycleHookRequest deleteLifecycleHookRequest);

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteNotificationConfiguration
     */
    void deleteNotificationConfiguration(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest);

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
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeletePolicy
     */
    void deletePolicy(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteScheduledAction
     */
    void deleteScheduledAction(
            DeleteScheduledActionRequest deleteScheduledActionRequest);

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteTags
     */
    void deleteTags(DeleteTagsRequest deleteTagsRequest);

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
     * @return Result of the DescribeAccountLimits operation returned by the
     *         service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAccountLimits
     */
    DescribeAccountLimitsResult describeAccountLimits(
            DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation.
     *
     * @see #describeAccountLimits(DescribeAccountLimitsRequest)
     */
    DescribeAccountLimitsResult describeAccountLimits();

    /**
     * <p>
     * Describes the policy adjustment types for use with
     * <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @return Result of the DescribeAdjustmentTypes operation returned by the
     *         service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAdjustmentTypes
     */
    DescribeAdjustmentTypesResult describeAdjustmentTypes(
            DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest);

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes
     * operation.
     *
     * @see #describeAdjustmentTypes(DescribeAdjustmentTypesRequest)
     */
    DescribeAdjustmentTypesResult describeAdjustmentTypes();

    /**
     * <p>
     * Describes one or more Auto Scaling groups. If a list of names is not
     * provided, the call describes all Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @return Result of the DescribeAutoScalingGroups operation returned by the
     *         service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingGroups
     */
    DescribeAutoScalingGroupsResult describeAutoScalingGroups(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups
     * operation.
     *
     * @see #describeAutoScalingGroups(DescribeAutoScalingGroupsRequest)
     */
    DescribeAutoScalingGroupsResult describeAutoScalingGroups();

    /**
     * <p>
     * Describes one or more Auto Scaling instances. If a list is not provided,
     * the call describes all instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @return Result of the DescribeAutoScalingInstances operation returned by
     *         the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingInstances
     */
    DescribeAutoScalingInstancesResult describeAutoScalingInstances(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances
     * operation.
     *
     * @see #describeAutoScalingInstances(DescribeAutoScalingInstancesRequest)
     */
    DescribeAutoScalingInstancesResult describeAutoScalingInstances();

    /**
     * <p>
     * Describes the notification types that are supported by Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return Result of the DescribeAutoScalingNotificationTypes operation
     *         returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingNotificationTypes
     */
    DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest);

    /**
     * Simplified method form for invoking the
     * DescribeAutoScalingNotificationTypes operation.
     *
     * @see #describeAutoScalingNotificationTypes(DescribeAutoScalingNotificationTypesRequest)
     */
    DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes();

    /**
     * <p>
     * Describes one or more launch configurations. If you omit the list of
     * names, then the call describes all launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @return Result of the DescribeLaunchConfigurations operation returned by
     *         the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLaunchConfigurations
     */
    DescribeLaunchConfigurationsResult describeLaunchConfigurations(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest);

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations
     * operation.
     *
     * @see #describeLaunchConfigurations(DescribeLaunchConfigurationsRequest)
     */
    DescribeLaunchConfigurationsResult describeLaunchConfigurations();

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * 
     * @param describeLifecycleHookTypesRequest
     * @return Result of the DescribeLifecycleHookTypes operation returned by
     *         the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLifecycleHookTypes
     */
    DescribeLifecycleHookTypesResult describeLifecycleHookTypes(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest);

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes
     * operation.
     *
     * @see #describeLifecycleHookTypes(DescribeLifecycleHookTypesRequest)
     */
    DescribeLifecycleHookTypesResult describeLifecycleHookTypes();

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @return Result of the DescribeLifecycleHooks operation returned by the
     *         service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLifecycleHooks
     */
    DescribeLifecycleHooksResult describeLifecycleHooks(
            DescribeLifecycleHooksRequest describeLifecycleHooksRequest);

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return Result of the DescribeLoadBalancers operation returned by the
     *         service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLoadBalancers
     */
    DescribeLoadBalancersResult describeLoadBalancers(
            DescribeLoadBalancersRequest describeLoadBalancersRequest);

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
     * @return Result of the DescribeMetricCollectionTypes operation returned by
     *         the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeMetricCollectionTypes
     */
    DescribeMetricCollectionTypesResult describeMetricCollectionTypes(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest);

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes
     * operation.
     *
     * @see #describeMetricCollectionTypes(DescribeMetricCollectionTypesRequest)
     */
    DescribeMetricCollectionTypesResult describeMetricCollectionTypes();

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @return Result of the DescribeNotificationConfigurations operation
     *         returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeNotificationConfigurations
     */
    DescribeNotificationConfigurationsResult describeNotificationConfigurations(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest);

    /**
     * Simplified method form for invoking the
     * DescribeNotificationConfigurations operation.
     *
     * @see #describeNotificationConfigurations(DescribeNotificationConfigurationsRequest)
     */
    DescribeNotificationConfigurationsResult describeNotificationConfigurations();

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @return Result of the DescribePolicies operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribePolicies
     */
    DescribePoliciesResult describePolicies(
            DescribePoliciesRequest describePoliciesRequest);

    /**
     * Simplified method form for invoking the DescribePolicies operation.
     *
     * @see #describePolicies(DescribePoliciesRequest)
     */
    DescribePoliciesResult describePolicies();

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling
     * group. If you omit the <code>ActivityIds</code>, the call returns all
     * activities from the past six weeks. Activities are sorted by the start
     * time. Activities still in progress appear first on the list.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return Result of the DescribeScalingActivities operation returned by the
     *         service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeScalingActivities
     */
    DescribeScalingActivitiesResult describeScalingActivities(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest);

    /**
     * Simplified method form for invoking the DescribeScalingActivities
     * operation.
     *
     * @see #describeScalingActivities(DescribeScalingActivitiesRequest)
     */
    DescribeScalingActivitiesResult describeScalingActivities();

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a>
     * and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @return Result of the DescribeScalingProcessTypes operation returned by
     *         the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeScalingProcessTypes
     */
    DescribeScalingProcessTypesResult describeScalingProcessTypes(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest);

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes
     * operation.
     *
     * @see #describeScalingProcessTypes(DescribeScalingProcessTypesRequest)
     */
    DescribeScalingProcessTypesResult describeScalingProcessTypes();

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't
     * run. To describe the actions that have already run, use
     * <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return Result of the DescribeScheduledActions operation returned by the
     *         service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeScheduledActions
     */
    DescribeScheduledActionsResult describeScheduledActions(
            DescribeScheduledActionsRequest describeScheduledActionsRequest);

    /**
     * Simplified method form for invoking the DescribeScheduledActions
     * operation.
     *
     * @see #describeScheduledActions(DescribeScheduledActionsRequest)
     */
    DescribeScheduledActionsResult describeScheduledActions();

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
     * @return Result of the DescribeTags operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeTags
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTags(DescribeTagsRequest)
     */
    DescribeTagsResult describeTags();

    /**
     * <p>
     * Describes the termination policies supported by Auto Scaling.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @return Result of the DescribeTerminationPolicyTypes operation returned
     *         by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeTerminationPolicyTypes
     */
    DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest);

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes
     * operation.
     *
     * @see #describeTerminationPolicyTypes(DescribeTerminationPolicyTypesRequest)
     */
    DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes();

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
     * @return Result of the DetachInstances operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DetachInstances
     */
    DetachInstancesResult detachInstances(
            DetachInstancesRequest detachInstancesRequest);

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
     * @return Result of the DetachLoadBalancers operation returned by the
     *         service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DetachLoadBalancers
     */
    DetachLoadBalancersResult detachLoadBalancers(
            DetachLoadBalancersRequest detachLoadBalancersRequest);

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation.
     *
     * @see #detachLoadBalancers(DetachLoadBalancersRequest)
     */
    DetachLoadBalancersResult detachLoadBalancers();

    /**
     * <p>
     * Disables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.DisableMetricsCollection
     */
    void disableMetricsCollection(
            DisableMetricsCollectionRequest disableMetricsCollectionRequest);

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
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.EnableMetricsCollection
     */
    void enableMetricsCollection(
            EnableMetricsCollectionRequest enableMetricsCollectionRequest);

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
     * @return Result of the EnterStandby operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.EnterStandby
     */
    EnterStandbyResult enterStandby(EnterStandbyRequest enterStandbyRequest);

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @throws ScalingActivityInProgressException
     *         The Auto Scaling group can't be deleted because there are scaling
     *         activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.ExecutePolicy
     */
    void executePolicy(ExecutePolicyRequest executePolicyRequest);

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
     * @return Result of the ExitStandby operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.ExitStandby
     */
    ExitStandbyResult exitStandby(ExitStandbyRequest exitStandbyRequest);

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
     * @return Result of the PutLifecycleHook operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources
     *         (for example, groups, launch configurations, or lifecycle hooks).
     *         For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.PutLifecycleHook
     */
    PutLifecycleHookResult putLifecycleHook(
            PutLifecycleHookRequest putLifecycleHookRequest);

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
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources
     *         (for example, groups, launch configurations, or lifecycle hooks).
     *         For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.PutNotificationConfiguration
     */
    void putNotificationConfiguration(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest);

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
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources
     *         (for example, groups, launch configurations, or lifecycle hooks).
     *         For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.PutScalingPolicy
     */
    PutScalingPolicyResult putScalingPolicy(
            PutScalingPolicyRequest putScalingPolicyRequest);

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
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration
     *         with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources
     *         (for example, groups, launch configurations, or lifecycle hooks).
     *         For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.PutScheduledUpdateGroupAction
     */
    void putScheduledUpdateGroupAction(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest);

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
     * @return Result of the RecordLifecycleActionHeartbeat operation returned
     *         by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.RecordLifecycleActionHeartbeat
     */
    RecordLifecycleActionHeartbeatResult recordLifecycleActionHeartbeat(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest);

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
     * @throws ResourceInUseException
     *         The Auto Scaling group or launch configuration can't be deleted
     *         because it is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.ResumeProcesses
     */
    void resumeProcesses(ResumeProcessesRequest resumeProcessesRequest);

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
     * @throws ScalingActivityInProgressException
     *         The Auto Scaling group can't be deleted because there are scaling
     *         activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.SetDesiredCapacity
     */
    void setDesiredCapacity(SetDesiredCapacityRequest setDesiredCapacityRequest);

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
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.SetInstanceHealth
     */
    void setInstanceHealth(SetInstanceHealthRequest setInstanceHealthRequest);

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
     * @return Result of the SetInstanceProtection operation returned by the
     *         service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources
     *         (for example, groups, launch configurations, or lifecycle hooks).
     *         For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.SetInstanceProtection
     */
    SetInstanceProtectionResult setInstanceProtection(
            SetInstanceProtectionRequest setInstanceProtectionRequest);

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
     * @throws ResourceInUseException
     *         The Auto Scaling group or launch configuration can't be deleted
     *         because it is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.SuspendProcesses
     */
    void suspendProcesses(SuspendProcessesRequest suspendProcessesRequest);

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
     * @return Result of the TerminateInstanceInAutoScalingGroup operation
     *         returned by the service.
     * @throws ScalingActivityInProgressException
     *         The Auto Scaling group can't be deleted because there are scaling
     *         activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.TerminateInstanceInAutoScalingGroup
     */
    TerminateInstanceInAutoScalingGroupResult terminateInstanceInAutoScalingGroup(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest);

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
     * @throws ScalingActivityInProgressException
     *         The Auto Scaling group can't be deleted because there are scaling
     *         activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource
     *         (for example, a group, instance, or load balancer).
     * @sample AmazonAutoScaling.UpdateAutoScalingGroup
     */
    void updateAutoScalingGroup(
            UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}

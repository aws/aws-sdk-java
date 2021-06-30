/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.services.autoscaling.waiters.AmazonAutoScalingWaiters;

/**
 * Interface for accessing Auto Scaling.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.autoscaling.AbstractAmazonAutoScaling} instead.
 * </p>
 * <p>
 * <fullname>Amazon EC2 Auto Scaling</fullname>
 * <p>
 * Amazon EC2 Auto Scaling is designed to automatically launch or terminate EC2 instances based on user-defined scaling
 * policies, scheduled actions, and health checks.
 * </p>
 * <p>
 * For more information about Amazon EC2 Auto Scaling, see the <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/what-is-amazon-ec2-auto-scaling.html">Amazon EC2 Auto
 * Scaling User Guide</a>. For information about granting IAM users required permissions for calls to Amazon EC2 Auto
 * Scaling, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/ec2-auto-scaling-api-permissions.html">Granting IAM
 * users required permissions for Amazon EC2 Auto Scaling resources</a> in the <i>Amazon EC2 Auto Scaling API
 * Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAutoScaling {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "autoscaling";

    /**
     * Overrides the default endpoint for this client ("https://autoscaling.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "autoscaling.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://autoscaling.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "autoscaling.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://autoscaling.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonAutoScaling#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of
     * instances being attached. If the number of instances being attached plus the desired capacity of the group
     * exceeds the maximum size of the group, the operation fails.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with
     * the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also
     * registered with the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-instance-asg.html">Attach EC2 instances to
     * your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     * @return Result of the AttachInstances operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.AttachInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachInstances" target="_top">AWS
     *      API Documentation</a>
     */
    AttachInstancesResult attachInstances(AttachInstancesRequest attachInstancesRequest);

    /**
     * <p>
     * Attaches one or more target groups to the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation is used with the following load balancer types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Application Load Balancer - Operates at the application layer (layer 7) and supports HTTP and HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * Network Load Balancer - Operates at the transport layer (layer 4) and supports TCP, TLS, and UDP.
     * </p>
     * </li>
     * <li>
     * <p>
     * Gateway Load Balancer - Operates at the network layer (layer 3).
     * </p>
     * </li>
     * </ul>
     * <p>
     * To describe the target groups for an Auto Scaling group, call the <a>DescribeLoadBalancerTargetGroups</a> API. To
     * detach the target group from the Auto Scaling group, call the <a>DetachLoadBalancerTargetGroups</a> API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerTargetGroupsRequest
     * @return Result of the AttachLoadBalancerTargetGroups operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.AttachLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    AttachLoadBalancerTargetGroupsResult attachLoadBalancerTargetGroups(AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest);

    /**
     * <note>
     * <p>
     * To attach an Application Load Balancer, Network Load Balancer, or Gateway Load Balancer, use the
     * <a>AttachLoadBalancerTargetGroups</a> API operation instead.
     * </p>
     * </note>
     * <p>
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. Amazon EC2 Auto Scaling
     * registers the running instances with these Classic Load Balancers.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, call the <a>DescribeLoadBalancers</a> API. To detach
     * the load balancer from the Auto Scaling group, call the <a>DetachLoadBalancers</a> API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     * @return Result of the AttachLoadBalancers operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.AttachLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest attachLoadBalancersRequest);

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation.
     *
     * @see #attachLoadBalancers(AttachLoadBalancersRequest)
     */
    AttachLoadBalancersResult attachLoadBalancers();

    /**
     * <p>
     * Deletes one or more scheduled actions for the specified Auto Scaling group.
     * </p>
     * 
     * @param batchDeleteScheduledActionRequest
     * @return Result of the BatchDeleteScheduledAction operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.BatchDeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchDeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDeleteScheduledActionResult batchDeleteScheduledAction(BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest);

    /**
     * <p>
     * Creates or updates one or more scheduled scaling actions for an Auto Scaling group.
     * </p>
     * 
     * @param batchPutScheduledUpdateGroupActionRequest
     * @return Result of the BatchPutScheduledUpdateGroupAction operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.BatchPutScheduledUpdateGroupAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchPutScheduledUpdateGroupAction"
     *      target="_top">AWS API Documentation</a>
     */
    BatchPutScheduledUpdateGroupActionResult batchPutScheduledUpdateGroupAction(
            BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest);

    /**
     * <p>
     * Cancels an instance refresh operation in progress. Cancellation does not roll back any replacements that have
     * already been completed, but it prevents new replacements from being started.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html">instance refresh
     * feature</a> in Amazon EC2 Auto Scaling, which helps you update instances in your Auto Scaling group after you
     * make configuration changes.
     * </p>
     * 
     * @param cancelInstanceRefreshRequest
     * @return Result of the CancelInstanceRefresh operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ActiveInstanceRefreshNotFoundException
     *         The request failed because an active instance refresh for the specified Auto Scaling group was not found.
     * @sample AmazonAutoScaling.CancelInstanceRefresh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CancelInstanceRefresh"
     *      target="_top">AWS API Documentation</a>
     */
    CancelInstanceRefreshResult cancelInstanceRefresh(CancelInstanceRefreshRequest cancelInstanceRefreshRequest);

    /**
     * <p>
     * Completes the lifecycle action for the specified token or instance with the specified result.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you finish before the timeout period ends, complete the lifecycle action.</b>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * lifecycle hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     * @return Result of the CompleteLifecycleAction operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.CompleteLifecycleAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CompleteLifecycleAction"
     *      target="_top">AWS API Documentation</a>
     */
    CompleteLifecycleActionResult completeLifecycleAction(CompleteLifecycleActionRequest completeLifecycleActionRequest);

    /**
     * <p>
     * <b>We strongly recommend using a launch template when calling this operation to ensure full functionality for
     * Amazon EC2 Auto Scaling and Amazon EC2.</b>
     * </p>
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, the call fails. To query this limit, call the
     * <a>DescribeAccountLimits</a> API. For information about updating this limit, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * service quotas</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * For introductory exercises for creating an Auto Scaling group, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/GettingStartedTutorial.html">Getting started with
     * Amazon EC2 Auto Scaling</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-register-lbs-with-asg.html">Tutorial: Set up a
     * scaled and load-balanced application</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. For more information,
     * see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroup.html">Auto Scaling groups</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>, and
     * <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However, if you
     * configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with
     * the same units that you use for weighting instances.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     * @return Result of the CreateAutoScalingGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.CreateAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAutoScalingGroupResult createAutoScalingGroup(CreateAutoScalingGroupRequest createAutoScalingGroupRequest);

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, the call fails. To query this limit, call the
     * <a>DescribeAccountLimits</a> API. For information about updating this limit, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * service quotas</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchConfiguration.html">Launch configurations</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     * @return Result of the CreateLaunchConfiguration operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.CreateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLaunchConfigurationResult createLaunchConfiguration(CreateLaunchConfigurationRequest createLaunchConfigurationRequest);

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and
     * you do not get an error message.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     * @return Result of the CreateOrUpdateTags operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @sample AmazonAutoScaling.CreateOrUpdateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateOrUpdateTags" target="_top">AWS
     *      API Documentation</a>
     */
    CreateOrUpdateTagsResult createOrUpdateTags(CreateOrUpdateTagsRequest createOrUpdateTagsRequest);

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * If the group has instances or scaling activities in progress, you must specify the option to force the deletion
     * in order for it to succeed.
     * </p>
     * <p>
     * If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm
     * that no longer has an associated action.
     * </p>
     * <p>
     * To remove instances from the Auto Scaling group before deleting it, call the <a>DetachInstances</a> API with the
     * list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling
     * does not launch replacement instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call the <a>UpdateAutoScalingGroup</a> API and
     * set the minimum size and desired capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     * @return Result of the DeleteAutoScalingGroup operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAutoScalingGroupResult deleteAutoScalingGroup(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest);

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch
     * configuration is no longer available for use.
     * </p>
     * 
     * @param deleteLaunchConfigurationRequest
     * @return Result of the DeleteLaunchConfiguration operation returned by the service.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLaunchConfigurationResult deleteLaunchConfiguration(DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest);

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed first (<code>ABANDON</code> for launching
     * instances, <code>CONTINUE</code> for terminating instances).
     * </p>
     * 
     * @param deleteLifecycleHookRequest
     * @return Result of the DeleteLifecycleHook operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteLifecycleHook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteLifecycleHook"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLifecycleHookResult deleteLifecycleHook(DeleteLifecycleHookRequest deleteLifecycleHookRequest);

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @return Result of the DeleteNotificationConfiguration operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNotificationConfigurationResult deleteNotificationConfiguration(DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest);

    /**
     * <p>
     * Deletes the specified scaling policy.
     * </p>
     * <p>
     * Deleting either a step scaling policy or a simple scaling policy deletes the underlying alarm action, but does
     * not delete the alarm, even if it no longer has an associated action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/deleting-scaling-policy.html">Deleting a scaling
     * policy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @return Result of the DeleteScheduledAction operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteScheduledActionResult deleteScheduledAction(DeleteScheduledActionRequest deleteScheduledActionRequest);

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @sample AmazonAutoScaling.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the warm pool for the specified Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html">Warm pools for
     * Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param deleteWarmPoolRequest
     * @return Result of the DeleteWarmPool operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @sample AmazonAutoScaling.DeleteWarmPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteWarmPool" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWarmPoolResult deleteWarmPool(DeleteWarmPoolRequest deleteWarmPoolRequest);

    /**
     * <p>
     * Describes the current Amazon EC2 Auto Scaling resource quotas for your account.
     * </p>
     * <p>
     * When you establish an account, the account has initial quotas on the maximum number of Auto Scaling groups and
     * launch configurations that you can create in a given Region. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * service quotas</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return Result of the DescribeAccountLimits operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation.
     *
     * @see #describeAccountLimits(DescribeAccountLimitsRequest)
     */
    DescribeAccountLimitsResult describeAccountLimits();

    /**
     * <p>
     * Describes the available adjustment types for step scaling and simple scaling policies.
     * </p>
     * <p>
     * The following adjustment types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeInCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExactCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PercentChangeInCapacity</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAdjustmentTypesRequest
     * @return Result of the DescribeAdjustmentTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAdjustmentTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAdjustmentTypes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAdjustmentTypesResult describeAdjustmentTypes(DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest);

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes operation.
     *
     * @see #describeAdjustmentTypes(DescribeAdjustmentTypesRequest)
     */
    DescribeAdjustmentTypesResult describeAdjustmentTypes();

    /**
     * <p>
     * Gets information about the Auto Scaling groups in the account and Region.
     * </p>
     * <p>
     * This operation returns information about instances in Auto Scaling groups. To retrieve information about the
     * instances in a warm pool, you must call the <a>DescribeWarmPool</a> API.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @return Result of the DescribeAutoScalingGroups operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAutoScalingGroupsResult describeAutoScalingGroups(DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups operation.
     *
     * @see #describeAutoScalingGroups(DescribeAutoScalingGroupsRequest)
     */
    DescribeAutoScalingGroupsResult describeAutoScalingGroups();

    /**
     * <p>
     * Gets information about the Auto Scaling instances in the account and Region.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @return Result of the DescribeAutoScalingInstances operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingInstances"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAutoScalingInstancesResult describeAutoScalingInstances(DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances operation.
     *
     * @see #describeAutoScalingInstances(DescribeAutoScalingInstancesRequest)
     */
    DescribeAutoScalingInstancesResult describeAutoScalingInstances();

    /**
     * <p>
     * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return Result of the DescribeAutoScalingNotificationTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingNotificationTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingNotificationTypes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest);

    /**
     * Simplified method form for invoking the DescribeAutoScalingNotificationTypes operation.
     *
     * @see #describeAutoScalingNotificationTypes(DescribeAutoScalingNotificationTypesRequest)
     */
    DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes();

    /**
     * <p>
     * Gets information about the instance refreshes for the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html">instance refresh
     * feature</a> in Amazon EC2 Auto Scaling, which helps you update instances in your Auto Scaling group after you
     * make configuration changes.
     * </p>
     * <p>
     * To help you determine the status of an instance refresh, this operation returns information about the instance
     * refreshes you previously initiated, including their status, end time, the percentage of the instance refresh that
     * is complete, and the number of instances remaining to update before the instance refresh is complete.
     * </p>
     * <p>
     * The following are the possible statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and the
     * scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     * replacements that have already been completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeInstanceRefreshesRequest
     * @return Result of the DescribeInstanceRefreshes operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeInstanceRefreshes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeInstanceRefreshes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceRefreshesResult describeInstanceRefreshes(DescribeInstanceRefreshesRequest describeInstanceRefreshesRequest);

    /**
     * <p>
     * Gets information about the launch configurations in the account and Region.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @return Result of the DescribeLaunchConfigurations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLaunchConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLaunchConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLaunchConfigurationsResult describeLaunchConfigurations(DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest);

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations operation.
     *
     * @see #describeLaunchConfigurations(DescribeLaunchConfigurationsRequest)
     */
    DescribeLaunchConfigurationsResult describeLaunchConfigurations();

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * <p>
     * The following hook types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCHING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATING</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeLifecycleHookTypesRequest
     * @return Result of the DescribeLifecycleHookTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLifecycleHookTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLifecycleHookTypes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLifecycleHookTypesResult describeLifecycleHookTypes(DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest);

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes operation.
     *
     * @see #describeLifecycleHookTypes(DescribeLifecycleHookTypesRequest)
     */
    DescribeLifecycleHookTypesResult describeLifecycleHookTypes();

    /**
     * <p>
     * Gets information about the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @return Result of the DescribeLifecycleHooks operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLifecycleHooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLifecycleHooks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLifecycleHooksResult describeLifecycleHooks(DescribeLifecycleHooksRequest describeLifecycleHooksRequest);

    /**
     * <p>
     * Gets information about the load balancer target groups for the specified Auto Scaling group.
     * </p>
     * <p>
     * To determine the availability of registered instances, use the <code>State</code> element in the response. When
     * you attach a target group to an Auto Scaling group, the initial <code>State</code> value is <code>Adding</code>.
     * The state transitions to <code>Added</code> after all Auto Scaling instances are registered with the target
     * group. If Elastic Load Balancing health checks are enabled for the Auto Scaling group, the state transitions to
     * <code>InService</code> after at least one Auto Scaling instance passes the health check. When the target group is
     * in the <code>InService</code> state, Amazon EC2 Auto Scaling can terminate and replace any instances that are
     * reported as unhealthy. If no registered instances pass the health checks, the target group doesn't enter the
     * <code>InService</code> state.
     * </p>
     * <p>
     * Target groups also have an <code>InService</code> state if you attach them in the <a>CreateAutoScalingGroup</a>
     * API call. If your target group state is <code>InService</code>, but it is not working properly, check the scaling
     * activities by calling <a>DescribeScalingActivities</a> and take any corrective actions necessary.
     * </p>
     * <p>
     * For help with failed health checks, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ts-as-healthchecks.html">Troubleshooting Amazon EC2
     * Auto Scaling: Health checks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     * @return Result of the DescribeLoadBalancerTargetGroups operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLoadBalancerTargetGroupsResult describeLoadBalancerTargetGroups(DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest);

    /**
     * <p>
     * Gets information about the load balancers for the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation describes only Classic Load Balancers. If you have Application Load Balancers, Network Load
     * Balancers, or Gateway Load Balancers, use the <a>DescribeLoadBalancerTargetGroups</a> API instead.
     * </p>
     * <p>
     * To determine the availability of registered instances, use the <code>State</code> element in the response. When
     * you attach a load balancer to an Auto Scaling group, the initial <code>State</code> value is <code>Adding</code>.
     * The state transitions to <code>Added</code> after all Auto Scaling instances are registered with the load
     * balancer. If Elastic Load Balancing health checks are enabled for the Auto Scaling group, the state transitions
     * to <code>InService</code> after at least one Auto Scaling instance passes the health check. When the load
     * balancer is in the <code>InService</code> state, Amazon EC2 Auto Scaling can terminate and replace any instances
     * that are reported as unhealthy. If no registered instances pass the health checks, the load balancer doesn't
     * enter the <code>InService</code> state.
     * </p>
     * <p>
     * Load balancers also have an <code>InService</code> state if you attach them in the <a>CreateAutoScalingGroup</a>
     * API call. If your load balancer state is <code>InService</code>, but it is not working properly, check the
     * scaling activities by calling <a>DescribeScalingActivities</a> and take any corrective actions necessary.
     * </p>
     * <p>
     * For help with failed health checks, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ts-as-healthchecks.html">Troubleshooting Amazon EC2
     * Auto Scaling: Health checks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return Result of the DescribeLoadBalancers operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest);

    /**
     * <p>
     * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * The <code>GroupStandbyInstances</code> metric is not returned by default. You must explicitly request this metric
     * when calling the <a>EnableMetricsCollection</a> API.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @return Result of the DescribeMetricCollectionTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeMetricCollectionTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeMetricCollectionTypes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMetricCollectionTypesResult describeMetricCollectionTypes(DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest);

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes operation.
     *
     * @see #describeMetricCollectionTypes(DescribeMetricCollectionTypesRequest)
     */
    DescribeMetricCollectionTypesResult describeMetricCollectionTypes();

    /**
     * <p>
     * Gets information about the Amazon SNS notifications that are configured for one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @return Result of the DescribeNotificationConfigurations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeNotificationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeNotificationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNotificationConfigurationsResult describeNotificationConfigurations(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest);

    /**
     * Simplified method form for invoking the DescribeNotificationConfigurations operation.
     *
     * @see #describeNotificationConfigurations(DescribeNotificationConfigurationsRequest)
     */
    DescribeNotificationConfigurationsResult describeNotificationConfigurations();

    /**
     * <p>
     * Gets information about the scaling policies in the account and Region.
     * </p>
     * 
     * @param describePoliciesRequest
     * @return Result of the DescribePolicies operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.DescribePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePoliciesResult describePolicies(DescribePoliciesRequest describePoliciesRequest);

    /**
     * Simplified method form for invoking the DescribePolicies operation.
     *
     * @see #describePolicies(DescribePoliciesRequest)
     */
    DescribePoliciesResult describePolicies();

    /**
     * <p>
     * Gets information about the scaling activities in the account and Region.
     * </p>
     * <p>
     * When scaling events occur, you see a record of the scaling activity in the scaling activities. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-verify-scaling-activity.html">Verifying a scaling
     * activity for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If the scaling event succeeds, the value of the <code>StatusCode</code> element in the response is
     * <code>Successful</code>. If an attempt to launch instances failed, the <code>StatusCode</code> value is
     * <code>Failed</code> or <code>Cancelled</code> and the <code>StatusMessage</code> element in the response
     * indicates the cause of the failure. For help interpreting the <code>StatusMessage</code>, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/CHAP_Troubleshooting.html">Troubleshooting Amazon EC2
     * Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return Result of the DescribeScalingActivities operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeScalingActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScalingActivities"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScalingActivitiesResult describeScalingActivities(DescribeScalingActivitiesRequest describeScalingActivitiesRequest);

    /**
     * Simplified method form for invoking the DescribeScalingActivities operation.
     *
     * @see #describeScalingActivities(DescribeScalingActivitiesRequest)
     */
    DescribeScalingActivitiesResult describeScalingActivities();

    /**
     * <p>
     * Describes the scaling process types for use with the <a>ResumeProcesses</a> and <a>SuspendProcesses</a> APIs.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @return Result of the DescribeScalingProcessTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeScalingProcessTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScalingProcessTypes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScalingProcessTypesResult describeScalingProcessTypes(DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest);

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes operation.
     *
     * @see #describeScalingProcessTypes(DescribeScalingProcessTypesRequest)
     */
    DescribeScalingProcessTypesResult describeScalingProcessTypes();

    /**
     * <p>
     * Gets information about the scheduled actions that haven't run or that have not reached their end time.
     * </p>
     * <p>
     * To describe the scaling activities for scheduled actions that have already run, call the
     * <a>DescribeScalingActivities</a> API.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return Result of the DescribeScheduledActions operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeScheduledActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScheduledActions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScheduledActionsResult describeScheduledActions(DescribeScheduledActionsRequest describeScheduledActionsRequest);

    /**
     * Simplified method form for invoking the DescribeScheduledActions operation.
     *
     * @see #describeScheduledActions(DescribeScheduledActionsRequest)
     */
    DescribeScheduledActionsResult describeScheduledActions();

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling
     * group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it
     * to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information for a particular tag only if it matches
     * all the filters. If there's no match, no special message is returned.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTags" target="_top">AWS API
     *      Documentation</a>
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
     * Describes the termination policies supported by Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling which Auto
     * Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @return Result of the DescribeTerminationPolicyTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeTerminationPolicyTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTerminationPolicyTypes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes(DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest);

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes operation.
     *
     * @see #describeTerminationPolicyTypes(DescribeTerminationPolicyTypesRequest)
     */
    DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes();

    /**
     * <p>
     * Gets information about a warm pool and its instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html">Warm pools for
     * Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeWarmPoolRequest
     * @return Result of the DescribeWarmPool operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeWarmPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeWarmPool" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeWarmPoolResult describeWarmPool(DescribeWarmPoolRequest describeWarmPoolRequest);

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * </p>
     * <p>
     * After the instances are detached, you can manage them independent of the Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to
     * replace the ones that are detached.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the
     * load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from
     * the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/detach-instance-asg.html">Detach EC2 instances from
     * your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     * @return Result of the DetachInstances operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DetachInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachInstances" target="_top">AWS
     *      API Documentation</a>
     */
    DetachInstancesResult detachInstances(DetachInstancesRequest detachInstancesRequest);

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @return Result of the DetachLoadBalancerTargetGroups operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DetachLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DetachLoadBalancerTargetGroupsResult detachLoadBalancerTargetGroups(DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest);

    /**
     * <p>
     * Detaches one or more Classic Load Balancers from the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation detaches only Classic Load Balancers. If you have Application Load Balancers, Network Load
     * Balancers, or Gateway Load Balancers, use the <a>DetachLoadBalancerTargetGroups</a> API instead.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code> state while deregistering the instances in
     * the group. When all instances are deregistered, then you can no longer describe the load balancer using the
     * <a>DescribeLoadBalancers</a> API call. The instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     * @return Result of the DetachLoadBalancers operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DetachLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    DetachLoadBalancersResult detachLoadBalancers(DetachLoadBalancersRequest detachLoadBalancersRequest);

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation.
     *
     * @see #detachLoadBalancers(DetachLoadBalancersRequest)
     */
    DetachLoadBalancersResult detachLoadBalancers();

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @return Result of the DisableMetricsCollection operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DisableMetricsCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DisableMetricsCollection"
     *      target="_top">AWS API Documentation</a>
     */
    DisableMetricsCollectionResult disableMetricsCollection(DisableMetricsCollectionRequest disableMetricsCollectionRequest);

    /**
     * <p>
     * Enables group metrics for the specified Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-monitoring.html">Monitoring CloudWatch
     * metrics for your Auto Scaling groups and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     * @return Result of the EnableMetricsCollection operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.EnableMetricsCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/EnableMetricsCollection"
     *      target="_top">AWS API Documentation</a>
     */
    EnableMetricsCollectionResult enableMetricsCollection(EnableMetricsCollectionRequest enableMetricsCollectionRequest);

    /**
     * <p>
     * Moves the specified instances into the standby state.
     * </p>
     * <p>
     * If you choose to decrement the desired capacity of the Auto Scaling group, the instances can enter standby as
     * long as the desired capacity of the Auto Scaling group after the instances are placed into standby is equal to or
     * greater than the minimum capacity of the group.
     * </p>
     * <p>
     * If you choose not to decrement the desired capacity of the Auto Scaling group, the Auto Scaling group launches
     * new instances to replace the instances on standby.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html">Temporarily removing
     * instances from your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     * @return Result of the EnterStandby operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.EnterStandby
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/EnterStandby" target="_top">AWS API
     *      Documentation</a>
     */
    EnterStandbyResult enterStandby(EnterStandbyRequest enterStandbyRequest);

    /**
     * <p>
     * Executes the specified policy. This can be useful for testing the design of your scaling policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @return Result of the ExecutePolicy operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.ExecutePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ExecutePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    ExecutePolicyResult executePolicy(ExecutePolicyRequest executePolicyRequest);

    /**
     * <p>
     * Moves the specified instances out of the standby state.
     * </p>
     * <p>
     * After you put the instances back in service, the desired capacity is incremented.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html">Temporarily removing
     * instances from your Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     * @return Result of the ExitStandby operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.ExitStandby
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ExitStandby" target="_top">AWS API
     *      Documentation</a>
     */
    ExitStandbyResult exitStandby(ExitStandbyRequest exitStandbyRequest);

    /**
     * <p>
     * Retrieves the forecast data for a predictive scaling policy.
     * </p>
     * <p>
     * Load forecasts are predictions of the hourly load values using historical load data from CloudWatch and an
     * analysis of historical trends. Capacity forecasts are represented as predicted values for the minimum capacity
     * that is needed on an hourly basis, based on the hourly load forecast.
     * </p>
     * <p>
     * A minimum of 24 hours of data is required to create the initial forecasts. However, having a full 14 days of
     * historical data results in more accurate forecasts.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-predictive-scaling.html">Predictive
     * scaling for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param getPredictiveScalingForecastRequest
     * @return Result of the GetPredictiveScalingForecast operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.GetPredictiveScalingForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/GetPredictiveScalingForecast"
     *      target="_top">AWS API Documentation</a>
     */
    GetPredictiveScalingForecastResult getPredictiveScalingForecast(GetPredictiveScalingForecastRequest getPredictiveScalingForecastRequest);

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling group.
     * </p>
     * <p>
     * A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches
     * (before it is put into service) or as the instance terminates (before it is fully terminated).
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using the
     * <a>RecordLifecycleActionHeartbeat</a> API call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action using the
     * <a>CompleteLifecycleAction</a> API call.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * lifecycle hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call
     * fails.
     * </p>
     * <p>
     * You can view the lifecycle hooks for an Auto Scaling group using the <a>DescribeLifecycleHooks</a> API call. If
     * you are no longer using a lifecycle hook, you can delete it by calling the <a>DeleteLifecycleHook</a> API.
     * </p>
     * 
     * @param putLifecycleHookRequest
     * @return Result of the PutLifecycleHook operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.PutLifecycleHook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutLifecycleHook" target="_top">AWS
     *      API Documentation</a>
     */
    PutLifecycleHookResult putLifecycleHook(PutLifecycleHookRequest putLifecycleHookRequest);

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the
     * specified topic can have messages delivered to an endpoint such as a web server or an email address.
     * </p>
     * <p>
     * This configuration overwrites any existing configuration.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html">Getting Amazon SNS
     * notifications when your Auto Scaling group scales</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of SNS topics, which is 10 per Auto Scaling group, the call fails.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     * @return Result of the PutNotificationConfiguration operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.PutNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutNotificationConfigurationResult putNotificationConfiguration(PutNotificationConfigurationRequest putNotificationConfigurationRequest);

    /**
     * <p>
     * Creates or updates a scaling policy for an Auto Scaling group. Scaling policies are used to scale an Auto Scaling
     * group based on configurable metrics. If no policies are defined, the dynamic scaling and predictive scaling
     * features are not used.
     * </p>
     * <p>
     * For more information about using dynamic scaling, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html">Target tracking
     * scaling policies</a> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html">Step and simple scaling
     * policies</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * For more information about using predictive scaling, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-predictive-scaling.html">Predictive
     * scaling for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * You can view the scaling policies for an Auto Scaling group using the <a>DescribePolicies</a> API call. If you
     * are no longer using a scaling policy, you can delete it by calling the <a>DeletePolicy</a> API.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/schedule_time.html">Scheduled scaling</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * You can view the scheduled actions for an Auto Scaling group using the <a>DescribeScheduledActions</a> API call.
     * If you are no longer using a scheduled action, you can delete it by calling the <a>DeleteScheduledAction</a> API.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     * @return Result of the PutScheduledUpdateGroupAction operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.PutScheduledUpdateGroupAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutScheduledUpdateGroupAction"
     *      target="_top">AWS API Documentation</a>
     */
    PutScheduledUpdateGroupActionResult putScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest);

    /**
     * <p>
     * Creates or updates a warm pool for the specified Auto Scaling group. A warm pool is a pool of pre-initialized EC2
     * instances that sits alongside the Auto Scaling group. Whenever your application needs to scale out, the Auto
     * Scaling group can draw on the warm pool to meet its new desired capacity. For more information and example
     * configurations, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html">Warm pools for
     * Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * This operation must be called from the Region in which the Auto Scaling group was created. This operation cannot
     * be called on an Auto Scaling group that has a mixed instances policy or a launch template or launch configuration
     * that requests Spot Instances.
     * </p>
     * <p>
     * You can view the instances in the warm pool using the <a>DescribeWarmPool</a> API call. If you are no longer
     * using a warm pool, you can delete it by calling the <a>DeleteWarmPool</a> API.
     * </p>
     * 
     * @param putWarmPoolRequest
     * @return Result of the PutWarmPool operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.PutWarmPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutWarmPool" target="_top">AWS API
     *      Documentation</a>
     */
    PutWarmPoolResult putWarmPool(PutWarmPoolRequest putWarmPoolRequest);

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the
     * timeout by the length of time defined using the <a>PutLifecycleHook</a> API call.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * lifecycle hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     * @return Result of the RecordLifecycleActionHeartbeat operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.RecordLifecycleActionHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/RecordLifecycleActionHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    RecordLifecycleActionHeartbeatResult recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest);

    /**
     * <p>
     * Resumes the specified suspended auto scaling processes, or all suspended process, for the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html">Suspending and
     * resuming scaling processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     * @return Result of the ResumeProcesses operation returned by the service.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.ResumeProcesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ResumeProcesses" target="_top">AWS
     *      API Documentation</a>
     */
    ResumeProcessesResult resumeProcesses(ResumeProcessesRequest resumeProcessesRequest);

    /**
     * <p>
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * If a scale-in activity occurs as a result of a new <code>DesiredCapacity</code> value that is lower than the
     * current size of the group, the Auto Scaling group uses its termination policy to determine which instances to
     * terminate.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-manual-scaling.html">Manual scaling</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     * @return Result of the SetDesiredCapacity operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.SetDesiredCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetDesiredCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    SetDesiredCapacityResult setDesiredCapacity(SetDesiredCapacityRequest setDesiredCapacityRequest);

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * checks for Auto Scaling instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     * @return Result of the SetInstanceHealth operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.SetInstanceHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceHealth" target="_top">AWS
     *      API Documentation</a>
     */
    SetInstanceHealthResult setInstanceHealth(SetInstanceHealthRequest setInstanceHealthRequest);

    /**
     * <p>
     * Updates the instance protection settings of the specified instances. This operation cannot be called on instances
     * in a warm pool.
     * </p>
     * <p>
     * For more information about preventing instances that are part of an Auto Scaling group from terminating on scale
     * in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of instance IDs, which is 50 per Auto Scaling group, the call fails.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     * @return Result of the SetInstanceProtection operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.SetInstanceProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceProtection"
     *      target="_top">AWS API Documentation</a>
     */
    SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest setInstanceProtectionRequest);

    /**
     * <p>
     * Starts a new instance refresh operation, which triggers a rolling replacement of previously launched instances in
     * the Auto Scaling group with a new group of instances.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html">instance refresh
     * feature</a> in Amazon EC2 Auto Scaling, which helps you update instances in your Auto Scaling group after you
     * make configuration changes.
     * </p>
     * <p>
     * If the call succeeds, it creates a new instance refresh request with a unique ID that you can use to track its
     * progress. To query its status, call the <a>DescribeInstanceRefreshes</a> API. To describe the instance refreshes
     * that have already run, call the <a>DescribeInstanceRefreshes</a> API. To cancel an instance refresh operation in
     * progress, use the <a>CancelInstanceRefresh</a> API.
     * </p>
     * 
     * @param startInstanceRefreshRequest
     * @return Result of the StartInstanceRefresh operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
     *         >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws InstanceRefreshInProgressException
     *         The request failed because an active instance refresh operation already exists for the specified Auto
     *         Scaling group.
     * @sample AmazonAutoScaling.StartInstanceRefresh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/StartInstanceRefresh"
     *      target="_top">AWS API Documentation</a>
     */
    StartInstanceRefreshResult startInstanceRefresh(StartInstanceRefreshRequest startInstanceRefreshRequest);

    /**
     * <p>
     * Suspends the specified auto scaling processes, or all processes, for the specified Auto Scaling group.
     * </p>
     * <p>
     * If you suspend either the <code>Launch</code> or <code>Terminate</code> process types, it can prevent other
     * process types from functioning properly. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html">Suspending and
     * resuming scaling processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * To resume processes that have been suspended, call the <a>ResumeProcesses</a> API.
     * </p>
     * 
     * @param suspendProcessesRequest
     * @return Result of the SuspendProcesses operation returned by the service.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.SuspendProcesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SuspendProcesses" target="_top">AWS
     *      API Documentation</a>
     */
    SuspendProcessesResult suspendProcesses(SuspendProcessesRequest suspendProcessesRequest);

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired group size. This operation cannot be called
     * on instances in a warm pool.
     * </p>
     * <p>
     * This call simply makes a termination request. The instance is not terminated immediately. When an instance is
     * terminated, the instance status changes to <code>terminated</code>. You can't connect to or start an instance
     * after you've terminated it.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to
     * replace the ones that are terminated.
     * </p>
     * <p>
     * By default, Amazon EC2 Auto Scaling balances instances across all Availability Zones. If you decrement the
     * desired capacity, your Auto Scaling group can become unbalanced between Availability Zones. Amazon EC2 Auto
     * Scaling tries to rebalance the group, and rebalancing might terminate instances in other zones. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-benefits.html#AutoScalingBehavior.InstanceUsage"
     * >Rebalancing activities</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminateInstanceInAutoScalingGroupRequest
     * @return Result of the TerminateInstanceInAutoScalingGroup operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.TerminateInstanceInAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TerminateInstanceInAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    TerminateInstanceInAutoScalingGroupResult terminateInstanceInAutoScalingGroup(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest);

    /**
     * <p>
     * <b>We strongly recommend that all Auto Scaling groups use launch templates to ensure full functionality for
     * Amazon EC2 Auto Scaling and Amazon EC2.</b>
     * </p>
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * To update an Auto Scaling group, specify the name of the group and the parameter that you want to change. Any
     * parameters that you don't specify are not changed by this update request. The new settings take effect on any
     * scaling activities after this call returns.
     * </p>
     * <p>
     * If you associate a new launch configuration or template with an Auto Scaling group, all new instances will get
     * the updated configuration. Existing instances continue to run with the configuration that they were originally
     * launched with. When you update a group to specify a mixed instances policy instead of a launch configuration or
     * template, existing instances may be replaced to match the new purchasing options that you specified in the
     * policy. For example, if the group currently has 100% On-Demand capacity and the policy specifies 50% Spot
     * capacity, this means that half of your instances will be gradually terminated and relaunched as Spot Instances.
     * When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old ones, so that
     * updating your group does not compromise the performance or availability of your application.
     * </p>
     * <p>
     * Note the following about changing <code>DesiredCapacity</code>, <code>MaxSize</code>, or <code>MinSize</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a scale-in activity occurs as a result of a new <code>DesiredCapacity</code> value that is lower than the
     * current size of the group, the Auto Scaling group uses its termination policy to determine which instances to
     * terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MinSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MinSize</code> is larger than the current size of the group, this sets the group's
     * <code>DesiredCapacity</code> to the new <code>MinSize</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MaxSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MaxSize</code> is smaller than the current size of the group, this sets the group's
     * <code>DesiredCapacity</code> to the new <code>MaxSize</code> value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To see which parameters have been set, call the <a>DescribeAutoScalingGroups</a> API. To view the scaling
     * policies for an Auto Scaling group, call the <a>DescribePolicies</a> API. If the group has scaling policies, you
     * can update them by calling the <a>PutScalingPolicy</a> API.
     * </p>
     * 
     * @param updateAutoScalingGroupRequest
     * @return Result of the UpdateAutoScalingGroup operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.UpdateAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/UpdateAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAutoScalingGroupResult updateAutoScalingGroup(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonAutoScalingWaiters waiters();

}

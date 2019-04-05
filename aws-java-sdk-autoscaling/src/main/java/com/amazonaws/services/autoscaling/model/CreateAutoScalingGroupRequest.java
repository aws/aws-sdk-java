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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateAutoScalingGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAutoScalingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group. This name must be unique within the scope of your AWS account.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the launch configuration. This parameter, a launch template, a mixed instances policy, or an EC2
     * instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg.html">Creating an Auto Scaling Group Using
     * a Launch Configuration</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * The launch template to use to launch instances. This parameter, a launch configuration, a mixed instances policy,
     * or an EC2 instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-launch-template.html">Creating an Auto
     * Scaling Group Using a Launch Template</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * The mixed instances policy to use to launch instances. This parameter, a launch template, a launch configuration,
     * or an EC2 instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups with
     * Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private MixedInstancesPolicy mixedInstancesPolicy;
    /**
     * <p>
     * The ID of the instance used to create a launch configuration for the group. This parameter, a launch
     * configuration, a launch template, or a mixed instances policy must be specified.
     * </p>
     * <p>
     * When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and associates
     * it with the group. This launch configuration derives its attributes from the specified instance, except for the
     * block device mapping.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Create an Auto Scaling
     * Group Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The minimum size of the group.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum size of the group.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This number must be greater than or equal to the
     * minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a
     * desired capacity, the default is the minimum size of the group.
     * </p>
     */
    private Integer desiredCapacity;
    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default value is <code>300</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling
     * Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Integer defaultCooldown;
    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional if you specify one or more subnets for
     * <code>VPCZoneIdentifier</code>.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into
     * EC2-Classic.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * One or more Classic Load Balancers. To specify an Application Load Balancer or a Network Load Balancer, use
     * <code>TargetGroupARNs</code> instead.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Using a Load Balancer
     * With an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> loadBalancerNames;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> targetGroupARNs;
    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. The default
     * value is <code>EC2</code>. If you configure an Auto Scaling group to use ELB health checks, it considers the
     * instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * Checks for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String healthCheckType;
    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service. During this time, any health check failures for the instance are ignored.
     * The default value is <code>0</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * Checks for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: This parameter is required if you are adding an <code>ELB</code> health check.
     * </p>
     */
    private Integer healthCheckGracePeriod;
    /**
     * <p>
     * The name of the placement group into which to launch your instances, if any. A placement group is a logical
     * grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a
     * placement group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String placementGroup;
    /**
     * <p>
     * A comma-separated list of subnet IDs for your virtual private cloud (VPC).
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you specify
     * for this parameter must reside in those Availability Zones.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a
     * VPC.
     * </p>
     */
    private String vPCZoneIdentifier;
    /**
     * <p>
     * One or more termination policies used to select the instance to terminate. These policies are executed in the
     * order that they are listed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> terminationPolicies;
    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     * <p>
     * For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean newInstancesProtectedFromScaleIn;
    /**
     * <p>
     * One or more lifecycle hooks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LifecycleHookSpecification> lifecycleHookSpecificationList;
    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling Groups
     * and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-Linked
     * Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String serviceLinkedRoleARN;

    /**
     * <p>
     * The name of the Auto Scaling group. This name must be unique within the scope of your AWS account.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group. This name must be unique within the scope of your AWS account.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group. This name must be unique within the scope of your AWS account.
     * </p>
     * 
     * @return The name of the Auto Scaling group. This name must be unique within the scope of your AWS account.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group. This name must be unique within the scope of your AWS account.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group. This name must be unique within the scope of your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the launch configuration. This parameter, a launch template, a mixed instances policy, or an EC2
     * instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg.html">Creating an Auto Scaling Group Using
     * a Launch Configuration</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. This parameter, a launch template, a mixed instances policy, or an
     *        EC2 instance must be specified.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg.html">Creating an Auto Scaling
     *        Group Using a Launch Configuration</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. This parameter, a launch template, a mixed instances policy, or an EC2
     * instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg.html">Creating an Auto Scaling Group Using
     * a Launch Configuration</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The name of the launch configuration. This parameter, a launch template, a mixed instances policy, or an
     *         EC2 instance must be specified.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg.html">Creating an Auto Scaling
     *         Group Using a Launch Configuration</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. This parameter, a launch template, a mixed instances policy, or an EC2
     * instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg.html">Creating an Auto Scaling Group Using
     * a Launch Configuration</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. This parameter, a launch template, a mixed instances policy, or an
     *        EC2 instance must be specified.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg.html">Creating an Auto Scaling
     *        Group Using a Launch Configuration</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The launch template to use to launch instances. This parameter, a launch configuration, a mixed instances policy,
     * or an EC2 instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-launch-template.html">Creating an Auto
     * Scaling Group Using a Launch Template</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use to launch instances. This parameter, a launch configuration, a mixed instances
     *        policy, or an EC2 instance must be specified.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-launch-template.html">Creating an
     *        Auto Scaling Group Using a Launch Template</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template to use to launch instances. This parameter, a launch configuration, a mixed instances policy,
     * or an EC2 instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-launch-template.html">Creating an Auto
     * Scaling Group Using a Launch Template</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The launch template to use to launch instances. This parameter, a launch configuration, a mixed instances
     *         policy, or an EC2 instance must be specified.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-launch-template.html">Creating an
     *         Auto Scaling Group Using a Launch Template</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template to use to launch instances. This parameter, a launch configuration, a mixed instances policy,
     * or an EC2 instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-launch-template.html">Creating an Auto
     * Scaling Group Using a Launch Template</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use to launch instances. This parameter, a launch configuration, a mixed instances
     *        policy, or an EC2 instance must be specified.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-launch-template.html">Creating an
     *        Auto Scaling Group Using a Launch Template</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The mixed instances policy to use to launch instances. This parameter, a launch template, a launch configuration,
     * or an EC2 instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups with
     * Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        The mixed instances policy to use to launch instances. This parameter, a launch template, a launch
     *        configuration, or an EC2 instance must be specified.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups
     *        with Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
    }

    /**
     * <p>
     * The mixed instances policy to use to launch instances. This parameter, a launch template, a launch configuration,
     * or an EC2 instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups with
     * Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The mixed instances policy to use to launch instances. This parameter, a launch template, a launch
     *         configuration, or an EC2 instance must be specified.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling
     *         Groups with Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     */

    public MixedInstancesPolicy getMixedInstancesPolicy() {
        return this.mixedInstancesPolicy;
    }

    /**
     * <p>
     * The mixed instances policy to use to launch instances. This parameter, a launch template, a launch configuration,
     * or an EC2 instance must be specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups with
     * Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        The mixed instances policy to use to launch instances. This parameter, a launch template, a launch
     *        configuration, or an EC2 instance must be specified.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups
     *        with Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        setMixedInstancesPolicy(mixedInstancesPolicy);
        return this;
    }

    /**
     * <p>
     * The ID of the instance used to create a launch configuration for the group. This parameter, a launch
     * configuration, a launch template, or a mixed instances policy must be specified.
     * </p>
     * <p>
     * When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and associates
     * it with the group. This launch configuration derives its attributes from the specified instance, except for the
     * block device mapping.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Create an Auto Scaling
     * Group Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance used to create a launch configuration for the group. This parameter, a launch
     *        configuration, a launch template, or a mixed instances policy must be specified.</p>
     *        <p>
     *        When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and
     *        associates it with the group. This launch configuration derives its attributes from the specified
     *        instance, except for the block device mapping.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Create an Auto
     *        Scaling Group Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance used to create a launch configuration for the group. This parameter, a launch
     * configuration, a launch template, or a mixed instances policy must be specified.
     * </p>
     * <p>
     * When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and associates
     * it with the group. This launch configuration derives its attributes from the specified instance, except for the
     * block device mapping.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Create an Auto Scaling
     * Group Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The ID of the instance used to create a launch configuration for the group. This parameter, a launch
     *         configuration, a launch template, or a mixed instances policy must be specified.</p>
     *         <p>
     *         When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and
     *         associates it with the group. This launch configuration derives its attributes from the specified
     *         instance, except for the block device mapping.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Create an Auto
     *         Scaling Group Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance used to create a launch configuration for the group. This parameter, a launch
     * configuration, a launch template, or a mixed instances policy must be specified.
     * </p>
     * <p>
     * When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and associates
     * it with the group. This launch configuration derives its attributes from the specified instance, except for the
     * block device mapping.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Create an Auto Scaling
     * Group Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance used to create a launch configuration for the group. This parameter, a launch
     *        configuration, a launch template, or a mixed instances policy must be specified.</p>
     *        <p>
     *        When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and
     *        associates it with the group. This launch configuration derives its attributes from the specified
     *        instance, except for the block device mapping.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Create an Auto
     *        Scaling Group Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the group.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * 
     * @return The minimum size of the group.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the group.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * 
     * @return The maximum size of the group.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This number must be greater than or equal to the
     * minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a
     * desired capacity, the default is the minimum size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the group. This number must be greater than or equal
     *        to the minimum size of the group and less than or equal to the maximum size of the group. If you do not
     *        specify a desired capacity, the default is the minimum size of the group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This number must be greater than or equal to the
     * minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a
     * desired capacity, the default is the minimum size of the group.
     * </p>
     * 
     * @return The number of EC2 instances that should be running in the group. This number must be greater than or
     *         equal to the minimum size of the group and less than or equal to the maximum size of the group. If you do
     *         not specify a desired capacity, the default is the minimum size of the group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This number must be greater than or equal to the
     * minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a
     * desired capacity, the default is the minimum size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the group. This number must be greater than or equal
     *        to the minimum size of the group and less than or equal to the maximum size of the group. If you do not
     *        specify a desired capacity, the default is the minimum size of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default value is <code>300</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling
     * Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *        start. The default value is <code>300</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling Cooldowns</a> in the
     *        <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default value is <code>300</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling
     * Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *         start. The default value is <code>300</code>.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling Cooldowns</a> in the
     *         <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default value is <code>300</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling
     * Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *        start. The default value is <code>300</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling Cooldowns</a> in the
     *        <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withDefaultCooldown(Integer defaultCooldown) {
        setDefaultCooldown(defaultCooldown);
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional if you specify one or more subnets for
     * <code>VPCZoneIdentifier</code>.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into
     * EC2-Classic.
     * </p>
     * 
     * @return One or more Availability Zones for the group. This parameter is optional if you specify one or more
     *         subnets for <code>VPCZoneIdentifier</code>.</p>
     *         <p>
     *         Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances
     *         into EC2-Classic.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional if you specify one or more subnets for
     * <code>VPCZoneIdentifier</code>.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into
     * EC2-Classic.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones for the group. This parameter is optional if you specify one or more
     *        subnets for <code>VPCZoneIdentifier</code>.</p>
     *        <p>
     *        Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances
     *        into EC2-Classic.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional if you specify one or more subnets for
     * <code>VPCZoneIdentifier</code>.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into
     * EC2-Classic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones for the group. This parameter is optional if you specify one or more
     *        subnets for <code>VPCZoneIdentifier</code>.</p>
     *        <p>
     *        Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances
     *        into EC2-Classic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional if you specify one or more subnets for
     * <code>VPCZoneIdentifier</code>.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into
     * EC2-Classic.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones for the group. This parameter is optional if you specify one or more
     *        subnets for <code>VPCZoneIdentifier</code>.</p>
     *        <p>
     *        Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances
     *        into EC2-Classic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * One or more Classic Load Balancers. To specify an Application Load Balancer or a Network Load Balancer, use
     * <code>TargetGroupARNs</code> instead.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Using a Load Balancer
     * With an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return One or more Classic Load Balancers. To specify an Application Load Balancer or a Network Load Balancer,
     *         use <code>TargetGroupARNs</code> instead.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Using a Load
     *         Balancer With an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
            loadBalancerNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return loadBalancerNames;
    }

    /**
     * <p>
     * One or more Classic Load Balancers. To specify an Application Load Balancer or a Network Load Balancer, use
     * <code>TargetGroupARNs</code> instead.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Using a Load Balancer
     * With an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param loadBalancerNames
     *        One or more Classic Load Balancers. To specify an Application Load Balancer or a Network Load Balancer,
     *        use <code>TargetGroupARNs</code> instead.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Using a Load
     *        Balancer With an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        this.loadBalancerNames = new com.amazonaws.internal.SdkInternalList<String>(loadBalancerNames);
    }

    /**
     * <p>
     * One or more Classic Load Balancers. To specify an Application Load Balancer or a Network Load Balancer, use
     * <code>TargetGroupARNs</code> instead.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Using a Load Balancer
     * With an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerNames(java.util.Collection)} or {@link #withLoadBalancerNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param loadBalancerNames
     *        One or more Classic Load Balancers. To specify an Application Load Balancer or a Network Load Balancer,
     *        use <code>TargetGroupARNs</code> instead.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Using a Load
     *        Balancer With an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (this.loadBalancerNames == null) {
            setLoadBalancerNames(new com.amazonaws.internal.SdkInternalList<String>(loadBalancerNames.length));
        }
        for (String ele : loadBalancerNames) {
            this.loadBalancerNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Classic Load Balancers. To specify an Application Load Balancer or a Network Load Balancer, use
     * <code>TargetGroupARNs</code> instead.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Using a Load Balancer
     * With an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param loadBalancerNames
     *        One or more Classic Load Balancers. To specify an Application Load Balancer or a Network Load Balancer,
     *        use <code>TargetGroupARNs</code> instead.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Using a Load
     *        Balancer With an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the target groups.
     */

    public java.util.List<String> getTargetGroupARNs() {
        if (targetGroupARNs == null) {
            targetGroupARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return targetGroupARNs;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups.
     */

    public void setTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        if (targetGroupARNs == null) {
            this.targetGroupARNs = null;
            return;
        }

        this.targetGroupARNs = new com.amazonaws.internal.SdkInternalList<String>(targetGroupARNs);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroupARNs(java.util.Collection)} or {@link #withTargetGroupARNs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withTargetGroupARNs(String... targetGroupARNs) {
        if (this.targetGroupARNs == null) {
            setTargetGroupARNs(new com.amazonaws.internal.SdkInternalList<String>(targetGroupARNs.length));
        }
        for (String ele : targetGroupARNs) {
            this.targetGroupARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        setTargetGroupARNs(targetGroupARNs);
        return this;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. The default
     * value is <code>EC2</code>. If you configure an Auto Scaling group to use ELB health checks, it considers the
     * instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * Checks for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. The
     *        default value is <code>EC2</code>. If you configure an Auto Scaling group to use ELB health checks, it
     *        considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health
     *        checks.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health Checks for Auto
     *        Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. The default
     * value is <code>EC2</code>. If you configure an Auto Scaling group to use ELB health checks, it considers the
     * instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * Checks for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. The
     *         default value is <code>EC2</code>. If you configure an Auto Scaling group to use ELB health checks, it
     *         considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health
     *         checks.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health Checks for Auto
     *         Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. The default
     * value is <code>EC2</code>. If you configure an Auto Scaling group to use ELB health checks, it considers the
     * instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * Checks for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. The
     *        default value is <code>EC2</code>. If you configure an Auto Scaling group to use ELB health checks, it
     *        considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health
     *        checks.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health Checks for Auto
     *        Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withHealthCheckType(String healthCheckType) {
        setHealthCheckType(healthCheckType);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service. During this time, any health check failures for the instance are ignored.
     * The default value is <code>0</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * Checks for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: This parameter is required if you are adding an <code>ELB</code> health check.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an
     *        EC2 instance that has come into service. During this time, any health check failures for the instance are
     *        ignored. The default value is <code>0</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health Checks for Auto
     *        Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        Conditional: This parameter is required if you are adding an <code>ELB</code> health check.
     */

    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service. During this time, any health check failures for the instance are ignored.
     * The default value is <code>0</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * Checks for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: This parameter is required if you are adding an <code>ELB</code> health check.
     * </p>
     * 
     * @return The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of
     *         an EC2 instance that has come into service. During this time, any health check failures for the instance
     *         are ignored. The default value is <code>0</code>.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health Checks for Auto
     *         Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
     *         <p>
     *         Conditional: This parameter is required if you are adding an <code>ELB</code> health check.
     */

    public Integer getHealthCheckGracePeriod() {
        return this.healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service. During this time, any health check failures for the instance are ignored.
     * The default value is <code>0</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * Checks for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: This parameter is required if you are adding an <code>ELB</code> health check.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an
     *        EC2 instance that has come into service. During this time, any health check failures for the instance are
     *        ignored. The default value is <code>0</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health Checks for Auto
     *        Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        Conditional: This parameter is required if you are adding an <code>ELB</code> health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        setHealthCheckGracePeriod(healthCheckGracePeriod);
        return this;
    }

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if any. A placement group is a logical
     * grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a
     * placement group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param placementGroup
     *        The name of the placement group into which to launch your instances, if any. A placement group is a
     *        logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability
     *        Zones and a placement group. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if any. A placement group is a logical
     * grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a
     * placement group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The name of the placement group into which to launch your instances, if any. A placement group is a
     *         logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability
     *         Zones and a placement group. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *         the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getPlacementGroup() {
        return this.placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if any. A placement group is a logical
     * grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a
     * placement group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param placementGroup
     *        The name of the placement group into which to launch your instances, if any. A placement group is a
     *        logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability
     *        Zones and a placement group. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withPlacementGroup(String placementGroup) {
        setPlacementGroup(placementGroup);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of subnet IDs for your virtual private cloud (VPC).
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you specify
     * for this parameter must reside in those Availability Zones.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a
     * VPC.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        A comma-separated list of subnet IDs for your virtual private cloud (VPC).</p>
     *        <p>
     *        If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you
     *        specify for this parameter must reside in those Availability Zones.
     *        </p>
     *        <p>
     *        Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances
     *        into a VPC.
     */

    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet IDs for your virtual private cloud (VPC).
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you specify
     * for this parameter must reside in those Availability Zones.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a
     * VPC.
     * </p>
     * 
     * @return A comma-separated list of subnet IDs for your virtual private cloud (VPC).</p>
     *         <p>
     *         If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you
     *         specify for this parameter must reside in those Availability Zones.
     *         </p>
     *         <p>
     *         Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances
     *         into a VPC.
     */

    public String getVPCZoneIdentifier() {
        return this.vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet IDs for your virtual private cloud (VPC).
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you specify
     * for this parameter must reside in those Availability Zones.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a
     * VPC.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        A comma-separated list of subnet IDs for your virtual private cloud (VPC).</p>
     *        <p>
     *        If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you
     *        specify for this parameter must reside in those Availability Zones.
     *        </p>
     *        <p>
     *        Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances
     *        into a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withVPCZoneIdentifier(String vPCZoneIdentifier) {
        setVPCZoneIdentifier(vPCZoneIdentifier);
        return this;
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to terminate. These policies are executed in the
     * order that they are listed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return One or more termination policies used to select the instance to terminate. These policies are executed in
     *         the order that they are listed.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *         Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     */

    public java.util.List<String> getTerminationPolicies() {
        if (terminationPolicies == null) {
            terminationPolicies = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return terminationPolicies;
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to terminate. These policies are executed in the
     * order that they are listed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        One or more termination policies used to select the instance to terminate. These policies are executed in
     *        the order that they are listed.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *        Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>.
     */

    public void setTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        if (terminationPolicies == null) {
            this.terminationPolicies = null;
            return;
        }

        this.terminationPolicies = new com.amazonaws.internal.SdkInternalList<String>(terminationPolicies);
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to terminate. These policies are executed in the
     * order that they are listed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminationPolicies(java.util.Collection)} or {@link #withTerminationPolicies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param terminationPolicies
     *        One or more termination policies used to select the instance to terminate. These policies are executed in
     *        the order that they are listed.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *        Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withTerminationPolicies(String... terminationPolicies) {
        if (this.terminationPolicies == null) {
            setTerminationPolicies(new com.amazonaws.internal.SdkInternalList<String>(terminationPolicies.length));
        }
        for (String ele : terminationPolicies) {
            this.terminationPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to terminate. These policies are executed in the
     * order that they are listed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        One or more termination policies used to select the instance to terminate. These policies are executed in
     *        the order that they are listed.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *        Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        setTerminationPolicies(terminationPolicies);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     * <p>
     * For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *        scaling in.</p>
     *        <p>
     *        For more information about preventing instances from terminating on scale in, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *        >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
        this.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     * <p>
     * For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *         scaling in.</p>
     *         <p>
     *         For more information about preventing instances from terminating on scale in, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *         >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean getNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     * <p>
     * For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *        scaling in.</p>
     *        <p>
     *        For more information about preventing instances from terminating on scale in, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *        >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
        setNewInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     * <p>
     * For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *         scaling in.</p>
     *         <p>
     *         For more information about preventing instances from terminating on scale in, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *         >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean isNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * One or more lifecycle hooks.
     * </p>
     * 
     * @return One or more lifecycle hooks.
     */

    public java.util.List<LifecycleHookSpecification> getLifecycleHookSpecificationList() {
        if (lifecycleHookSpecificationList == null) {
            lifecycleHookSpecificationList = new com.amazonaws.internal.SdkInternalList<LifecycleHookSpecification>();
        }
        return lifecycleHookSpecificationList;
    }

    /**
     * <p>
     * One or more lifecycle hooks.
     * </p>
     * 
     * @param lifecycleHookSpecificationList
     *        One or more lifecycle hooks.
     */

    public void setLifecycleHookSpecificationList(java.util.Collection<LifecycleHookSpecification> lifecycleHookSpecificationList) {
        if (lifecycleHookSpecificationList == null) {
            this.lifecycleHookSpecificationList = null;
            return;
        }

        this.lifecycleHookSpecificationList = new com.amazonaws.internal.SdkInternalList<LifecycleHookSpecification>(lifecycleHookSpecificationList);
    }

    /**
     * <p>
     * One or more lifecycle hooks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleHookSpecificationList(java.util.Collection)} or
     * {@link #withLifecycleHookSpecificationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lifecycleHookSpecificationList
     *        One or more lifecycle hooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLifecycleHookSpecificationList(LifecycleHookSpecification... lifecycleHookSpecificationList) {
        if (this.lifecycleHookSpecificationList == null) {
            setLifecycleHookSpecificationList(new com.amazonaws.internal.SdkInternalList<LifecycleHookSpecification>(lifecycleHookSpecificationList.length));
        }
        for (LifecycleHookSpecification ele : lifecycleHookSpecificationList) {
            this.lifecycleHookSpecificationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more lifecycle hooks.
     * </p>
     * 
     * @param lifecycleHookSpecificationList
     *        One or more lifecycle hooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLifecycleHookSpecificationList(java.util.Collection<LifecycleHookSpecification> lifecycleHookSpecificationList) {
        setLifecycleHookSpecificationList(lifecycleHookSpecificationList);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling Groups
     * and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return One or more tags.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto
     *         Scaling Groups and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling Groups
     * and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param tags
     *        One or more tags.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling
     *        Groups and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling Groups
     * and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling
     *        Groups and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling Groups
     * and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param tags
     *        One or more tags.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling
     *        Groups and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-Linked
     * Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param serviceLinkedRoleARN
     *        The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *        AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     *        AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html"
     *        >Service-Linked Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-Linked
     * Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *         AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     *         AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html"
     *         >Service-Linked Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getServiceLinkedRoleARN() {
        return this.serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-Linked
     * Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param serviceLinkedRoleARN
     *        The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *        AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     *        AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html"
     *        >Service-Linked Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        setServiceLinkedRoleARN(serviceLinkedRoleARN);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: ").append(getLaunchConfigurationName()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getMixedInstancesPolicy() != null)
            sb.append("MixedInstancesPolicy: ").append(getMixedInstancesPolicy()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: ").append(getDesiredCapacity()).append(",");
        if (getDefaultCooldown() != null)
            sb.append("DefaultCooldown: ").append(getDefaultCooldown()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getLoadBalancerNames() != null)
            sb.append("LoadBalancerNames: ").append(getLoadBalancerNames()).append(",");
        if (getTargetGroupARNs() != null)
            sb.append("TargetGroupARNs: ").append(getTargetGroupARNs()).append(",");
        if (getHealthCheckType() != null)
            sb.append("HealthCheckType: ").append(getHealthCheckType()).append(",");
        if (getHealthCheckGracePeriod() != null)
            sb.append("HealthCheckGracePeriod: ").append(getHealthCheckGracePeriod()).append(",");
        if (getPlacementGroup() != null)
            sb.append("PlacementGroup: ").append(getPlacementGroup()).append(",");
        if (getVPCZoneIdentifier() != null)
            sb.append("VPCZoneIdentifier: ").append(getVPCZoneIdentifier()).append(",");
        if (getTerminationPolicies() != null)
            sb.append("TerminationPolicies: ").append(getTerminationPolicies()).append(",");
        if (getNewInstancesProtectedFromScaleIn() != null)
            sb.append("NewInstancesProtectedFromScaleIn: ").append(getNewInstancesProtectedFromScaleIn()).append(",");
        if (getLifecycleHookSpecificationList() != null)
            sb.append("LifecycleHookSpecificationList: ").append(getLifecycleHookSpecificationList()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getServiceLinkedRoleARN() != null)
            sb.append("ServiceLinkedRoleARN: ").append(getServiceLinkedRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAutoScalingGroupRequest == false)
            return false;
        CreateAutoScalingGroupRequest other = (CreateAutoScalingGroupRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getMixedInstancesPolicy() == null ^ this.getMixedInstancesPolicy() == null)
            return false;
        if (other.getMixedInstancesPolicy() != null && other.getMixedInstancesPolicy().equals(this.getMixedInstancesPolicy()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        if (other.getDefaultCooldown() == null ^ this.getDefaultCooldown() == null)
            return false;
        if (other.getDefaultCooldown() != null && other.getDefaultCooldown().equals(this.getDefaultCooldown()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null)
            return false;
        if (other.getLoadBalancerNames() != null && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false)
            return false;
        if (other.getTargetGroupARNs() == null ^ this.getTargetGroupARNs() == null)
            return false;
        if (other.getTargetGroupARNs() != null && other.getTargetGroupARNs().equals(this.getTargetGroupARNs()) == false)
            return false;
        if (other.getHealthCheckType() == null ^ this.getHealthCheckType() == null)
            return false;
        if (other.getHealthCheckType() != null && other.getHealthCheckType().equals(this.getHealthCheckType()) == false)
            return false;
        if (other.getHealthCheckGracePeriod() == null ^ this.getHealthCheckGracePeriod() == null)
            return false;
        if (other.getHealthCheckGracePeriod() != null && other.getHealthCheckGracePeriod().equals(this.getHealthCheckGracePeriod()) == false)
            return false;
        if (other.getPlacementGroup() == null ^ this.getPlacementGroup() == null)
            return false;
        if (other.getPlacementGroup() != null && other.getPlacementGroup().equals(this.getPlacementGroup()) == false)
            return false;
        if (other.getVPCZoneIdentifier() == null ^ this.getVPCZoneIdentifier() == null)
            return false;
        if (other.getVPCZoneIdentifier() != null && other.getVPCZoneIdentifier().equals(this.getVPCZoneIdentifier()) == false)
            return false;
        if (other.getTerminationPolicies() == null ^ this.getTerminationPolicies() == null)
            return false;
        if (other.getTerminationPolicies() != null && other.getTerminationPolicies().equals(this.getTerminationPolicies()) == false)
            return false;
        if (other.getNewInstancesProtectedFromScaleIn() == null ^ this.getNewInstancesProtectedFromScaleIn() == null)
            return false;
        if (other.getNewInstancesProtectedFromScaleIn() != null
                && other.getNewInstancesProtectedFromScaleIn().equals(this.getNewInstancesProtectedFromScaleIn()) == false)
            return false;
        if (other.getLifecycleHookSpecificationList() == null ^ this.getLifecycleHookSpecificationList() == null)
            return false;
        if (other.getLifecycleHookSpecificationList() != null
                && other.getLifecycleHookSpecificationList().equals(this.getLifecycleHookSpecificationList()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getServiceLinkedRoleARN() == null ^ this.getServiceLinkedRoleARN() == null)
            return false;
        if (other.getServiceLinkedRoleARN() != null && other.getServiceLinkedRoleARN().equals(this.getServiceLinkedRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getMixedInstancesPolicy() == null) ? 0 : getMixedInstancesPolicy().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode + ((getDefaultCooldown() == null) ? 0 : getDefaultCooldown().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupARNs() == null) ? 0 : getTargetGroupARNs().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckType() == null) ? 0 : getHealthCheckType().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckGracePeriod() == null) ? 0 : getHealthCheckGracePeriod().hashCode());
        hashCode = prime * hashCode + ((getPlacementGroup() == null) ? 0 : getPlacementGroup().hashCode());
        hashCode = prime * hashCode + ((getVPCZoneIdentifier() == null) ? 0 : getVPCZoneIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTerminationPolicies() == null) ? 0 : getTerminationPolicies().hashCode());
        hashCode = prime * hashCode + ((getNewInstancesProtectedFromScaleIn() == null) ? 0 : getNewInstancesProtectedFromScaleIn().hashCode());
        hashCode = prime * hashCode + ((getLifecycleHookSpecificationList() == null) ? 0 : getLifecycleHookSpecificationList().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getServiceLinkedRoleARN() == null) ? 0 : getServiceLinkedRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public CreateAutoScalingGroupRequest clone() {
        return (CreateAutoScalingGroupRequest) super.clone();
    }

}

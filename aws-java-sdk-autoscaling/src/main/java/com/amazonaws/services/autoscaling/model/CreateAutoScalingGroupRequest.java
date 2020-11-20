/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The name of the Auto Scaling group. This name must be unique per Region per account.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the launch configuration to use to launch instances.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * Parameters used to specify the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html">launch
     * template</a> and version to use to launch instances.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * <note>
     * <p>
     * The launch template that is specified must be configured for use with an Auto Scaling group. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a launch
     * template for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * </note>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * An embedded object that specifies a mixed instances policy. The required parameters must be specified. If
     * optional parameters are unspecified, their default values are used.
     * </p>
     * <p>
     * The policy includes parameters that not only define the distribution of On-Demand Instances and Spot Instances,
     * the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill
     * On-Demand and Spot capacities, but also the parameters that specify the instance configuration information—the
     * launch template and instance types. The policy can also include a weight for each instance type and different
     * launch templates for individual instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling groups with
     * multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     */
    private MixedInstancesPolicy mixedInstancesPolicy;
    /**
     * <p>
     * The ID of the instance used to base the launch configuration on. If specified, Amazon EC2 Auto Scaling uses the
     * configuration values from the specified instance to create a new launch configuration. To get the instance ID,
     * use the Amazon EC2 <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a>
     * API operation. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Creating an Auto
     * Scaling group using an EC2 instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * <note>
     * <p>
     * With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above
     * <code>MaxSize</code> to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never go
     * above <code>MaxSize</code> by more than your largest instance weight (weights that define how many units each
     * instance contributes to the desired capacity of the group).
     * </p>
     * </note>
     */
    private Integer maxSize;
    /**
     * <p>
     * The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and the
     * capacity it attempts to maintain. It can scale beyond this capacity if you configure auto scaling. This number
     * must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the
     * group. If you do not specify a desired capacity, the default is the minimum size of the group.
     * </p>
     */
    private Integer desiredCapacity;
    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default value is <code>300</code>. This setting applies when using simple scaling policies, but not when using
     * other scaling policies or scheduled scaling. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon EC2 Auto
     * Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Integer defaultCooldown;
    /**
     * <p>
     * A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is optional
     * if you specify one or more subnets for <code>VPCZoneIdentifier</code>.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into
     * EC2-Classic.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers and
     * Network Load Balancers, specify <code>TargetGroupARNs</code> instead.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> loadBalancerNames;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are
     * registered as targets in a target group, and traffic is routed to the target group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> targetGroupARNs;
    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> (default) and <code>ELB</code>.
     * If you configure an Auto Scaling group to use load balancer (ELB) health checks, it considers the instance
     * unhealthy if it fails either the EC2 status checks or the load balancer health checks. For more information, see
     * <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health checks for Auto Scaling
     * instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String healthCheckType;
    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service. During this time, any health check failures for the instance are ignored.
     * The default value is <code>0</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html#health-check-grace-period">Health
     * check grace period</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: Required if you are adding an <code>ELB</code> health check.
     * </p>
     */
    private Integer healthCheckGracePeriod;
    /**
     * <p>
     * The name of an existing placement group into which to launch your instances, if any. A placement group is a
     * logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones
     * and a placement group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String placementGroup;
    /**
     * <p>
     * A comma-separated list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling group
     * can be created. If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets
     * that you specify for this parameter must reside in those Availability Zones.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a
     * VPC.
     * </p>
     */
    private String vPCZoneIdentifier;
    /**
     * <p>
     * A policy or a list of policies that are used to select the instance to terminate. These policies are executed in
     * the order that you list them. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling which Auto
     * Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> terminationPolicies;
    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in. For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean newInstancesProtectedFromScaleIn;
    /**
     * <p>
     * Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you turn on
     * Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies
     * that a Spot Instance is at an elevated risk of interruption. After launching a new instance, it then terminates
     * an old instance. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/capacity-rebalance.html">Amazon EC2 Auto Scaling
     * Capacity Rebalancing</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean capacityRebalance;
    /**
     * <p>
     * One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling launches
     * or terminates instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LifecycleHookSpecification> lifecycleHookSpecificationList;
    /**
     * <p>
     * One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the tags in a
     * launch template but use caution. If the launch template specifies an instance tag with a key that is also
     * specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that instance tag with the
     * value specified by the Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-linked
     * roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String serviceLinkedRoleARN;
    /**
     * <p>
     * The maximum amount of time, in seconds, that an instance can be in service. The default is null. If specified,
     * the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). For more information, see
     * <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html">Replacing Auto
     * Scaling instances based on maximum instance lifetime</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Integer maxInstanceLifetime;

    /**
     * <p>
     * The name of the Auto Scaling group. This name must be unique per Region per account.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group. This name must be unique per Region per account.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group. This name must be unique per Region per account.
     * </p>
     * 
     * @return The name of the Auto Scaling group. This name must be unique per Region per account.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group. This name must be unique per Region per account.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group. This name must be unique per Region per account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the launch configuration to use to launch instances.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration to use to launch instances. </p>
     *        <p>
     *        Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     *        <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     *        <code>InstanceId</code>).
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration to use to launch instances.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * 
     * @return The name of the launch configuration to use to launch instances. </p>
     *         <p>
     *         Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     *         <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     *         <code>InstanceId</code>).
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration to use to launch instances.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration to use to launch instances. </p>
     *        <p>
     *        Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     *        <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     *        <code>InstanceId</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * Parameters used to specify the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html">launch
     * template</a> and version to use to launch instances.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * <note>
     * <p>
     * The launch template that is specified must be configured for use with an Auto Scaling group. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a launch
     * template for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * </note>
     * 
     * @param launchTemplate
     *        Parameters used to specify the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html"
     *        >launch template</a> and version to use to launch instances. </p>
     *        <p>
     *        Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     *        <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     *        <code>InstanceId</code>).
     *        </p>
     *        <note>
     *        <p>
     *        The launch template that is specified must be configured for use with an Auto Scaling group. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a launch
     *        template for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * Parameters used to specify the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html">launch
     * template</a> and version to use to launch instances.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * <note>
     * <p>
     * The launch template that is specified must be configured for use with an Auto Scaling group. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a launch
     * template for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * </note>
     * 
     * @return Parameters used to specify the <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html"
     *         >launch template</a> and version to use to launch instances. </p>
     *         <p>
     *         Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     *         <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     *         <code>InstanceId</code>).
     *         </p>
     *         <note>
     *         <p>
     *         The launch template that is specified must be configured for use with an Auto Scaling group. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a
     *         launch template for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * Parameters used to specify the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html">launch
     * template</a> and version to use to launch instances.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * <note>
     * <p>
     * The launch template that is specified must be configured for use with an Auto Scaling group. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a launch
     * template for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * </note>
     * 
     * @param launchTemplate
     *        Parameters used to specify the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html"
     *        >launch template</a> and version to use to launch instances. </p>
     *        <p>
     *        Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     *        <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     *        <code>InstanceId</code>).
     *        </p>
     *        <note>
     *        <p>
     *        The launch template that is specified must be configured for use with an Auto Scaling group. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a launch
     *        template for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * An embedded object that specifies a mixed instances policy. The required parameters must be specified. If
     * optional parameters are unspecified, their default values are used.
     * </p>
     * <p>
     * The policy includes parameters that not only define the distribution of On-Demand Instances and Spot Instances,
     * the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill
     * On-Demand and Spot capacities, but also the parameters that specify the instance configuration information—the
     * launch template and instance types. The policy can also include a weight for each instance type and different
     * launch templates for individual instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling groups with
     * multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        An embedded object that specifies a mixed instances policy. The required parameters must be specified. If
     *        optional parameters are unspecified, their default values are used.</p>
     *        <p>
     *        The policy includes parameters that not only define the distribution of On-Demand Instances and Spot
     *        Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance
     *        types to fulfill On-Demand and Spot capacities, but also the parameters that specify the instance
     *        configuration information—the launch template and instance types. The policy can also include a weight for
     *        each instance type and different launch templates for individual instance types. For more information, see
     *        <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling
     *        groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     *        <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     *        <code>InstanceId</code>).
     */

    public void setMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
    }

    /**
     * <p>
     * An embedded object that specifies a mixed instances policy. The required parameters must be specified. If
     * optional parameters are unspecified, their default values are used.
     * </p>
     * <p>
     * The policy includes parameters that not only define the distribution of On-Demand Instances and Spot Instances,
     * the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill
     * On-Demand and Spot capacities, but also the parameters that specify the instance configuration information—the
     * launch template and instance types. The policy can also include a weight for each instance type and different
     * launch templates for individual instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling groups with
     * multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * 
     * @return An embedded object that specifies a mixed instances policy. The required parameters must be specified. If
     *         optional parameters are unspecified, their default values are used.</p>
     *         <p>
     *         The policy includes parameters that not only define the distribution of On-Demand Instances and Spot
     *         Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance
     *         types to fulfill On-Demand and Spot capacities, but also the parameters that specify the instance
     *         configuration information—the launch template and instance types. The policy can also include a weight
     *         for each instance type and different launch templates for individual instance types. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling
     *         groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     *         <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     *         <code>InstanceId</code>).
     */

    public MixedInstancesPolicy getMixedInstancesPolicy() {
        return this.mixedInstancesPolicy;
    }

    /**
     * <p>
     * An embedded object that specifies a mixed instances policy. The required parameters must be specified. If
     * optional parameters are unspecified, their default values are used.
     * </p>
     * <p>
     * The policy includes parameters that not only define the distribution of On-Demand Instances and Spot Instances,
     * the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill
     * On-Demand and Spot capacities, but also the parameters that specify the instance configuration information—the
     * launch template and instance types. The policy can also include a weight for each instance type and different
     * launch templates for individual instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling groups with
     * multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     * <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     * <code>InstanceId</code>).
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        An embedded object that specifies a mixed instances policy. The required parameters must be specified. If
     *        optional parameters are unspecified, their default values are used.</p>
     *        <p>
     *        The policy includes parameters that not only define the distribution of On-Demand Instances and Spot
     *        Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance
     *        types to fulfill On-Demand and Spot capacities, but also the parameters that specify the instance
     *        configuration information—the launch template and instance types. The policy can also include a weight for
     *        each instance type and different launch templates for individual instance types. For more information, see
     *        <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling
     *        groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        Conditional: You must specify either a launch template (<code>LaunchTemplate</code> or
     *        <code>MixedInstancesPolicy</code>) or a launch configuration (<code>LaunchConfigurationName</code> or
     *        <code>InstanceId</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        setMixedInstancesPolicy(mixedInstancesPolicy);
        return this;
    }

    /**
     * <p>
     * The ID of the instance used to base the launch configuration on. If specified, Amazon EC2 Auto Scaling uses the
     * configuration values from the specified instance to create a new launch configuration. To get the instance ID,
     * use the Amazon EC2 <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a>
     * API operation. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Creating an Auto
     * Scaling group using an EC2 instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance used to base the launch configuration on. If specified, Amazon EC2 Auto Scaling
     *        uses the configuration values from the specified instance to create a new launch configuration. To get the
     *        instance ID, use the Amazon EC2 <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html"
     *        >DescribeInstances</a> API operation. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Creating an
     *        Auto Scaling group using an EC2 instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance used to base the launch configuration on. If specified, Amazon EC2 Auto Scaling uses the
     * configuration values from the specified instance to create a new launch configuration. To get the instance ID,
     * use the Amazon EC2 <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a>
     * API operation. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Creating an Auto
     * Scaling group using an EC2 instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The ID of the instance used to base the launch configuration on. If specified, Amazon EC2 Auto Scaling
     *         uses the configuration values from the specified instance to create a new launch configuration. To get
     *         the instance ID, use the Amazon EC2 <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html"
     *         >DescribeInstances</a> API operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Creating an
     *         Auto Scaling group using an EC2 instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance used to base the launch configuration on. If specified, Amazon EC2 Auto Scaling uses the
     * configuration values from the specified instance to create a new launch configuration. To get the instance ID,
     * use the Amazon EC2 <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a>
     * API operation. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Creating an Auto
     * Scaling group using an EC2 instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance used to base the launch configuration on. If specified, Amazon EC2 Auto Scaling
     *        uses the configuration values from the specified instance to create a new launch configuration. To get the
     *        instance ID, use the Amazon EC2 <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html"
     *        >DescribeInstances</a> API operation. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html">Creating an
     *        Auto Scaling group using an EC2 instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * <note>
     * <p>
     * With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above
     * <code>MaxSize</code> to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never go
     * above <code>MaxSize</code> by more than your largest instance weight (weights that define how many units each
     * instance contributes to the desired capacity of the group).
     * </p>
     * </note>
     * 
     * @param maxSize
     *        The maximum size of the group.</p> <note>
     *        <p>
     *        With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above
     *        <code>MaxSize</code> to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never
     *        go above <code>MaxSize</code> by more than your largest instance weight (weights that define how many
     *        units each instance contributes to the desired capacity of the group).
     *        </p>
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * <note>
     * <p>
     * With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above
     * <code>MaxSize</code> to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never go
     * above <code>MaxSize</code> by more than your largest instance weight (weights that define how many units each
     * instance contributes to the desired capacity of the group).
     * </p>
     * </note>
     * 
     * @return The maximum size of the group.</p> <note>
     *         <p>
     *         With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above
     *         <code>MaxSize</code> to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will
     *         never go above <code>MaxSize</code> by more than your largest instance weight (weights that define how
     *         many units each instance contributes to the desired capacity of the group).
     *         </p>
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * <note>
     * <p>
     * With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above
     * <code>MaxSize</code> to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never go
     * above <code>MaxSize</code> by more than your largest instance weight (weights that define how many units each
     * instance contributes to the desired capacity of the group).
     * </p>
     * </note>
     * 
     * @param maxSize
     *        The maximum size of the group.</p> <note>
     *        <p>
     *        With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above
     *        <code>MaxSize</code> to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never
     *        go above <code>MaxSize</code> by more than your largest instance weight (weights that define how many
     *        units each instance contributes to the desired capacity of the group).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and the
     * capacity it attempts to maintain. It can scale beyond this capacity if you configure auto scaling. This number
     * must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the
     * group. If you do not specify a desired capacity, the default is the minimum size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and the
     *        capacity it attempts to maintain. It can scale beyond this capacity if you configure auto scaling. This
     *        number must be greater than or equal to the minimum size of the group and less than or equal to the
     *        maximum size of the group. If you do not specify a desired capacity, the default is the minimum size of
     *        the group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and the
     * capacity it attempts to maintain. It can scale beyond this capacity if you configure auto scaling. This number
     * must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the
     * group. If you do not specify a desired capacity, the default is the minimum size of the group.
     * </p>
     * 
     * @return The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and
     *         the capacity it attempts to maintain. It can scale beyond this capacity if you configure auto scaling.
     *         This number must be greater than or equal to the minimum size of the group and less than or equal to the
     *         maximum size of the group. If you do not specify a desired capacity, the default is the minimum size of
     *         the group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and the
     * capacity it attempts to maintain. It can scale beyond this capacity if you configure auto scaling. This number
     * must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the
     * group. If you do not specify a desired capacity, the default is the minimum size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and the
     *        capacity it attempts to maintain. It can scale beyond this capacity if you configure auto scaling. This
     *        number must be greater than or equal to the minimum size of the group and less than or equal to the
     *        maximum size of the group. If you do not specify a desired capacity, the default is the minimum size of
     *        the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default value is <code>300</code>. This setting applies when using simple scaling policies, but not when using
     * other scaling policies or scheduled scaling. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon EC2 Auto
     * Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *        start. The default value is <code>300</code>. This setting applies when using simple scaling policies, but
     *        not when using other scaling policies or scheduled scaling. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon
     *        EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default value is <code>300</code>. This setting applies when using simple scaling policies, but not when using
     * other scaling policies or scheduled scaling. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon EC2 Auto
     * Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *         start. The default value is <code>300</code>. This setting applies when using simple scaling policies,
     *         but not when using other scaling policies or scheduled scaling. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon
     *         EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default value is <code>300</code>. This setting applies when using simple scaling policies, but not when using
     * other scaling policies or scheduled scaling. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon EC2 Auto
     * Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *        start. The default value is <code>300</code>. This setting applies when using simple scaling policies, but
     *        not when using other scaling policies or scheduled scaling. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon
     *        EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withDefaultCooldown(Integer defaultCooldown) {
        setDefaultCooldown(defaultCooldown);
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is optional
     * if you specify one or more subnets for <code>VPCZoneIdentifier</code>.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into
     * EC2-Classic.
     * </p>
     * 
     * @return A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is
     *         optional if you specify one or more subnets for <code>VPCZoneIdentifier</code>.</p>
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
     * A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is optional
     * if you specify one or more subnets for <code>VPCZoneIdentifier</code>.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into
     * EC2-Classic.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is
     *        optional if you specify one or more subnets for <code>VPCZoneIdentifier</code>.</p>
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
     * A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is optional
     * if you specify one or more subnets for <code>VPCZoneIdentifier</code>.
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
     *        A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is
     *        optional if you specify one or more subnets for <code>VPCZoneIdentifier</code>.</p>
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
     * A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is optional
     * if you specify one or more subnets for <code>VPCZoneIdentifier</code>.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into
     * EC2-Classic.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is
     *        optional if you specify one or more subnets for <code>VPCZoneIdentifier</code>.</p>
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
     * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers and
     * Network Load Balancers, specify <code>TargetGroupARNs</code> instead.
     * </p>
     * 
     * @return A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers
     *         and Network Load Balancers, specify <code>TargetGroupARNs</code> instead.
     */

    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
            loadBalancerNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return loadBalancerNames;
    }

    /**
     * <p>
     * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers and
     * Network Load Balancers, specify <code>TargetGroupARNs</code> instead.
     * </p>
     * 
     * @param loadBalancerNames
     *        A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers
     *        and Network Load Balancers, specify <code>TargetGroupARNs</code> instead.
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
     * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers and
     * Network Load Balancers, specify <code>TargetGroupARNs</code> instead.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerNames(java.util.Collection)} or {@link #withLoadBalancerNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param loadBalancerNames
     *        A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers
     *        and Network Load Balancers, specify <code>TargetGroupARNs</code> instead.
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
     * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers and
     * Network Load Balancers, specify <code>TargetGroupARNs</code> instead.
     * </p>
     * 
     * @param loadBalancerNames
     *        A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers
     *        and Network Load Balancers, specify <code>TargetGroupARNs</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are
     * registered as targets in a target group, and traffic is routed to the target group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances
     *         are registered as targets in a target group, and traffic is routed to the target group. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     *         Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public java.util.List<String> getTargetGroupARNs() {
        if (targetGroupARNs == null) {
            targetGroupARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return targetGroupARNs;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are
     * registered as targets in a target group, and traffic is routed to the target group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances
     *        are registered as targets in a target group, and traffic is routed to the target group. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     *        Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are
     * registered as targets in a target group, and traffic is routed to the target group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroupARNs(java.util.Collection)} or {@link #withTargetGroupARNs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances
     *        are registered as targets in a target group, and traffic is routed to the target group. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     *        Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are
     * registered as targets in a target group, and traffic is routed to the target group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     * Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances
     *        are registered as targets in a target group, and traffic is routed to the target group. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html">Elastic Load
     *        Balancing and Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        setTargetGroupARNs(targetGroupARNs);
        return this;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> (default) and <code>ELB</code>.
     * If you configure an Auto Scaling group to use load balancer (ELB) health checks, it considers the instance
     * unhealthy if it fails either the EC2 status checks or the load balancer health checks. For more information, see
     * <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health checks for Auto Scaling
     * instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are <code>EC2</code> (default) and
     *        <code>ELB</code>. If you configure an Auto Scaling group to use load balancer (ELB) health checks, it
     *        considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health
     *        checks. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health checks for Auto
     *        Scaling instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> (default) and <code>ELB</code>.
     * If you configure an Auto Scaling group to use load balancer (ELB) health checks, it considers the instance
     * unhealthy if it fails either the EC2 status checks or the load balancer health checks. For more information, see
     * <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health checks for Auto Scaling
     * instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The service to use for the health checks. The valid values are <code>EC2</code> (default) and
     *         <code>ELB</code>. If you configure an Auto Scaling group to use load balancer (ELB) health checks, it
     *         considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health
     *         checks. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health checks for Auto
     *         Scaling instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> (default) and <code>ELB</code>.
     * If you configure an Auto Scaling group to use load balancer (ELB) health checks, it considers the instance
     * unhealthy if it fails either the EC2 status checks or the load balancer health checks. For more information, see
     * <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health checks for Auto Scaling
     * instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are <code>EC2</code> (default) and
     *        <code>ELB</code>. If you configure an Auto Scaling group to use load balancer (ELB) health checks, it
     *        considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health
     *        checks. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health checks for Auto
     *        Scaling instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * The default value is <code>0</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html#health-check-grace-period">Health
     * check grace period</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: Required if you are adding an <code>ELB</code> health check.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an
     *        EC2 instance that has come into service. During this time, any health check failures for the instance are
     *        ignored. The default value is <code>0</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html#health-check-grace-period"
     *        >Health check grace period</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        Conditional: Required if you are adding an <code>ELB</code> health check.
     */

    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service. During this time, any health check failures for the instance are ignored.
     * The default value is <code>0</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html#health-check-grace-period">Health
     * check grace period</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: Required if you are adding an <code>ELB</code> health check.
     * </p>
     * 
     * @return The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of
     *         an EC2 instance that has come into service. During this time, any health check failures for the instance
     *         are ignored. The default value is <code>0</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html#health-check-grace-period"
     *         >Health check grace period</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *         <p>
     *         Conditional: Required if you are adding an <code>ELB</code> health check.
     */

    public Integer getHealthCheckGracePeriod() {
        return this.healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service. During this time, any health check failures for the instance are ignored.
     * The default value is <code>0</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html#health-check-grace-period">Health
     * check grace period</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Conditional: Required if you are adding an <code>ELB</code> health check.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an
     *        EC2 instance that has come into service. During this time, any health check failures for the instance are
     *        ignored. The default value is <code>0</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html#health-check-grace-period"
     *        >Health check grace period</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        Conditional: Required if you are adding an <code>ELB</code> health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        setHealthCheckGracePeriod(healthCheckGracePeriod);
        return this;
    }

    /**
     * <p>
     * The name of an existing placement group into which to launch your instances, if any. A placement group is a
     * logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones
     * and a placement group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param placementGroup
     *        The name of an existing placement group into which to launch your instances, if any. A placement group is
     *        a logical grouping of instances within a single Availability Zone. You cannot specify multiple
     *        Availability Zones and a placement group. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * <p>
     * The name of an existing placement group into which to launch your instances, if any. A placement group is a
     * logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones
     * and a placement group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The name of an existing placement group into which to launch your instances, if any. A placement group is
     *         a logical grouping of instances within a single Availability Zone. You cannot specify multiple
     *         Availability Zones and a placement group. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *         the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getPlacementGroup() {
        return this.placementGroup;
    }

    /**
     * <p>
     * The name of an existing placement group into which to launch your instances, if any. A placement group is a
     * logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones
     * and a placement group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param placementGroup
     *        The name of an existing placement group into which to launch your instances, if any. A placement group is
     *        a logical grouping of instances within a single Availability Zone. You cannot specify multiple
     *        Availability Zones and a placement group. For more information, see <a
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
     * A comma-separated list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling group
     * can be created. If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets
     * that you specify for this parameter must reside in those Availability Zones.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a
     * VPC.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        A comma-separated list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling
     *        group can be created. If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>,
     *        the subnets that you specify for this parameter must reside in those Availability Zones.</p>
     *        <p>
     *        Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances
     *        into a VPC.
     */

    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling group
     * can be created. If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets
     * that you specify for this parameter must reside in those Availability Zones.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a
     * VPC.
     * </p>
     * 
     * @return A comma-separated list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto
     *         Scaling group can be created. If you specify <code>VPCZoneIdentifier</code> with
     *         <code>AvailabilityZones</code>, the subnets that you specify for this parameter must reside in those
     *         Availability Zones.</p>
     *         <p>
     *         Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances
     *         into a VPC.
     */

    public String getVPCZoneIdentifier() {
        return this.vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling group
     * can be created. If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets
     * that you specify for this parameter must reside in those Availability Zones.
     * </p>
     * <p>
     * Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a
     * VPC.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        A comma-separated list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling
     *        group can be created. If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>,
     *        the subnets that you specify for this parameter must reside in those Availability Zones.</p>
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
     * A policy or a list of policies that are used to select the instance to terminate. These policies are executed in
     * the order that you list them. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling which Auto
     * Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return A policy or a list of policies that are used to select the instance to terminate. These policies are
     *         executed in the order that you list them. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *         which Auto Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User
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
     * A policy or a list of policies that are used to select the instance to terminate. These policies are executed in
     * the order that you list them. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling which Auto
     * Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        A policy or a list of policies that are used to select the instance to terminate. These policies are
     *        executed in the order that you list them. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *        which Auto Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User
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
     * A policy or a list of policies that are used to select the instance to terminate. These policies are executed in
     * the order that you list them. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling which Auto
     * Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminationPolicies(java.util.Collection)} or {@link #withTerminationPolicies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param terminationPolicies
     *        A policy or a list of policies that are used to select the instance to terminate. These policies are
     *        executed in the order that you list them. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *        which Auto Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User
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
     * A policy or a list of policies that are used to select the instance to terminate. These policies are executed in
     * the order that you list them. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling which Auto
     * Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        A policy or a list of policies that are used to select the instance to terminate. These policies are
     *        executed in the order that you list them. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *        which Auto Scaling instances terminate during scale in</a> in the <i>Amazon EC2 Auto Scaling User
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
     * in. For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *        scaling in. For more information about preventing instances from terminating on scale in, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *        >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
        this.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in. For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *         scaling in. For more information about preventing instances from terminating on scale in, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *         >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean getNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in. For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *        scaling in. For more information about preventing instances from terminating on scale in, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *        >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
        setNewInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in. For more information about preventing instances from terminating on scale in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *         scaling in. For more information about preventing instances from terminating on scale in, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *         >Instance scale-in protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean isNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you turn on
     * Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies
     * that a Spot Instance is at an elevated risk of interruption. After launching a new instance, it then terminates
     * an old instance. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/capacity-rebalance.html">Amazon EC2 Auto Scaling
     * Capacity Rebalancing</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param capacityRebalance
     *        Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you
     *        turn on Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon
     *        EC2 notifies that a Spot Instance is at an elevated risk of interruption. After launching a new instance,
     *        it then terminates an old instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/capacity-rebalance.html">Amazon EC2 Auto
     *        Scaling Capacity Rebalancing</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setCapacityRebalance(Boolean capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    /**
     * <p>
     * Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you turn on
     * Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies
     * that a Spot Instance is at an elevated risk of interruption. After launching a new instance, it then terminates
     * an old instance. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/capacity-rebalance.html">Amazon EC2 Auto Scaling
     * Capacity Rebalancing</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you
     *         turn on Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon
     *         EC2 notifies that a Spot Instance is at an elevated risk of interruption. After launching a new instance,
     *         it then terminates an old instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/capacity-rebalance.html">Amazon EC2 Auto
     *         Scaling Capacity Rebalancing</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean getCapacityRebalance() {
        return this.capacityRebalance;
    }

    /**
     * <p>
     * Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you turn on
     * Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies
     * that a Spot Instance is at an elevated risk of interruption. After launching a new instance, it then terminates
     * an old instance. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/capacity-rebalance.html">Amazon EC2 Auto Scaling
     * Capacity Rebalancing</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param capacityRebalance
     *        Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you
     *        turn on Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon
     *        EC2 notifies that a Spot Instance is at an elevated risk of interruption. After launching a new instance,
     *        it then terminates an old instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/capacity-rebalance.html">Amazon EC2 Auto
     *        Scaling Capacity Rebalancing</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withCapacityRebalance(Boolean capacityRebalance) {
        setCapacityRebalance(capacityRebalance);
        return this;
    }

    /**
     * <p>
     * Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you turn on
     * Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies
     * that a Spot Instance is at an elevated risk of interruption. After launching a new instance, it then terminates
     * an old instance. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/capacity-rebalance.html">Amazon EC2 Auto Scaling
     * Capacity Rebalancing</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you
     *         turn on Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon
     *         EC2 notifies that a Spot Instance is at an elevated risk of interruption. After launching a new instance,
     *         it then terminates an old instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/capacity-rebalance.html">Amazon EC2 Auto
     *         Scaling Capacity Rebalancing</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean isCapacityRebalance() {
        return this.capacityRebalance;
    }

    /**
     * <p>
     * One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling launches
     * or terminates instances.
     * </p>
     * 
     * @return One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling
     *         launches or terminates instances.
     */

    public java.util.List<LifecycleHookSpecification> getLifecycleHookSpecificationList() {
        if (lifecycleHookSpecificationList == null) {
            lifecycleHookSpecificationList = new com.amazonaws.internal.SdkInternalList<LifecycleHookSpecification>();
        }
        return lifecycleHookSpecificationList;
    }

    /**
     * <p>
     * One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling launches
     * or terminates instances.
     * </p>
     * 
     * @param lifecycleHookSpecificationList
     *        One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling
     *        launches or terminates instances.
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
     * One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling launches
     * or terminates instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleHookSpecificationList(java.util.Collection)} or
     * {@link #withLifecycleHookSpecificationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lifecycleHookSpecificationList
     *        One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling
     *        launches or terminates instances.
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
     * One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling launches
     * or terminates instances.
     * </p>
     * 
     * @param lifecycleHookSpecificationList
     *        One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling
     *        launches or terminates instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withLifecycleHookSpecificationList(java.util.Collection<LifecycleHookSpecification> lifecycleHookSpecificationList) {
        setLifecycleHookSpecificationList(lifecycleHookSpecificationList);
        return this;
    }

    /**
     * <p>
     * One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the tags in a
     * launch template but use caution. If the launch template specifies an instance tag with a key that is also
     * specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that instance tag with the
     * value specified by the Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances
     *         it launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify
     *         the tags in a launch template but use caution. If the launch template specifies an instance tag with a
     *         key that is also specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of
     *         that instance tag with the value specified by the Auto Scaling group. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto
     *         Scaling groups and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the tags in a
     * launch template but use caution. If the launch template specifies an instance tag with a key that is also
     * specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that instance tag with the
     * value specified by the Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param tags
     *        One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances
     *        it launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the
     *        tags in a launch template but use caution. If the launch template specifies an instance tag with a key
     *        that is also specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that
     *        instance tag with the value specified by the Auto Scaling group. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling
     *        groups and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the tags in a
     * launch template but use caution. If the launch template specifies an instance tag with a key that is also
     * specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that instance tag with the
     * value specified by the Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances
     *        it launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the
     *        tags in a launch template but use caution. If the launch template specifies an instance tag with a key
     *        that is also specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that
     *        instance tag with the value specified by the Auto Scaling group. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling
     *        groups and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the tags in a
     * launch template but use caution. If the launch template specifies an instance tag with a key that is also
     * specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that instance tag with the
     * value specified by the Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling groups
     * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param tags
     *        One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances
     *        it launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the
     *        tags in a launch template but use caution. If the launch template specifies an instance tag with a key
     *        that is also specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that
     *        instance tag with the value specified by the Auto Scaling group. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling
     *        groups and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-linked
     * roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param serviceLinkedRoleARN
     *        The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *        AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     *        AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html"
     *        >Service-linked roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-linked
     * roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *         AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     *         AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html"
     *         >Service-linked roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getServiceLinkedRoleARN() {
        return this.serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-linked
     * roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param serviceLinkedRoleARN
     *        The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *        AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named
     *        AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html"
     *        >Service-linked roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        setServiceLinkedRoleARN(serviceLinkedRoleARN);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that an instance can be in service. The default is null. If specified,
     * the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). For more information, see
     * <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html">Replacing Auto
     * Scaling instances based on maximum instance lifetime</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param maxInstanceLifetime
     *        The maximum amount of time, in seconds, that an instance can be in service. The default is null. If
     *        specified, the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html">Replacing Auto
     *        Scaling instances based on maximum instance lifetime</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setMaxInstanceLifetime(Integer maxInstanceLifetime) {
        this.maxInstanceLifetime = maxInstanceLifetime;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that an instance can be in service. The default is null. If specified,
     * the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). For more information, see
     * <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html">Replacing Auto
     * Scaling instances based on maximum instance lifetime</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The maximum amount of time, in seconds, that an instance can be in service. The default is null. If
     *         specified, the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html">Replacing
     *         Auto Scaling instances based on maximum instance lifetime</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     */

    public Integer getMaxInstanceLifetime() {
        return this.maxInstanceLifetime;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that an instance can be in service. The default is null. If specified,
     * the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). For more information, see
     * <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html">Replacing Auto
     * Scaling instances based on maximum instance lifetime</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param maxInstanceLifetime
     *        The maximum amount of time, in seconds, that an instance can be in service. The default is null. If
     *        specified, the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html">Replacing Auto
     *        Scaling instances based on maximum instance lifetime</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoScalingGroupRequest withMaxInstanceLifetime(Integer maxInstanceLifetime) {
        setMaxInstanceLifetime(maxInstanceLifetime);
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
        if (getCapacityRebalance() != null)
            sb.append("CapacityRebalance: ").append(getCapacityRebalance()).append(",");
        if (getLifecycleHookSpecificationList() != null)
            sb.append("LifecycleHookSpecificationList: ").append(getLifecycleHookSpecificationList()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getServiceLinkedRoleARN() != null)
            sb.append("ServiceLinkedRoleARN: ").append(getServiceLinkedRoleARN()).append(",");
        if (getMaxInstanceLifetime() != null)
            sb.append("MaxInstanceLifetime: ").append(getMaxInstanceLifetime());
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
        if (other.getCapacityRebalance() == null ^ this.getCapacityRebalance() == null)
            return false;
        if (other.getCapacityRebalance() != null && other.getCapacityRebalance().equals(this.getCapacityRebalance()) == false)
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
        if (other.getMaxInstanceLifetime() == null ^ this.getMaxInstanceLifetime() == null)
            return false;
        if (other.getMaxInstanceLifetime() != null && other.getMaxInstanceLifetime().equals(this.getMaxInstanceLifetime()) == false)
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
        hashCode = prime * hashCode + ((getCapacityRebalance() == null) ? 0 : getCapacityRebalance().hashCode());
        hashCode = prime * hashCode + ((getLifecycleHookSpecificationList() == null) ? 0 : getLifecycleHookSpecificationList().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getServiceLinkedRoleARN() == null) ? 0 : getServiceLinkedRoleARN().hashCode());
        hashCode = prime * hashCode + ((getMaxInstanceLifetime() == null) ? 0 : getMaxInstanceLifetime().hashCode());
        return hashCode;
    }

    @Override
    public CreateAutoScalingGroupRequest clone() {
        return (CreateAutoScalingGroupRequest) super.clone();
    }

}

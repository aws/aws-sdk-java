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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/UpdateAutoScalingGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAutoScalingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the launch configuration. If you specify this parameter, you can't specify a launch template or a
     * mixed instances policy.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * The launch template and version to use to specify the updates. If you specify this parameter, you can't specify a
     * launch configuration or a mixed instances policy.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * The mixed instances policy to use to specify the updates. If you specify this parameter, you can't specify a
     * launch configuration or a launch template.
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
     * The minimum size of the Auto Scaling group.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater than or
     * equal to the minimum size of the group and less than or equal to the maximum size of the group.
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
     * One or more Availability Zones for the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. If you
     * configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either
     * the EC2 status checks or the load balancer health checks.
     * </p>
     */
    private String healthCheckType;
    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service. The default value is <code>0</code>.
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
     * A comma-separated list of subnet IDs, if you are launching into a VPC.
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you specify
     * for this parameter must reside in those Availability Zones.
     * </p>
     */
    private String vPCZoneIdentifier;
    /**
     * <p>
     * A standalone termination policy or a list of termination policies used to select the instance to terminate. The
     * policies are executed in the order that they are listed.
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
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-Linked
     * Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String serviceLinkedRoleARN;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the launch configuration. If you specify this parameter, you can't specify a launch template or a
     * mixed instances policy.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. If you specify this parameter, you can't specify a launch template
     *        or a mixed instances policy.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. If you specify this parameter, you can't specify a launch template or a
     * mixed instances policy.
     * </p>
     * 
     * @return The name of the launch configuration. If you specify this parameter, you can't specify a launch template
     *         or a mixed instances policy.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. If you specify this parameter, you can't specify a launch template or a
     * mixed instances policy.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. If you specify this parameter, you can't specify a launch template
     *        or a mixed instances policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The launch template and version to use to specify the updates. If you specify this parameter, you can't specify a
     * launch configuration or a mixed instances policy.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template and version to use to specify the updates. If you specify this parameter, you can't
     *        specify a launch configuration or a mixed instances policy.
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template and version to use to specify the updates. If you specify this parameter, you can't specify a
     * launch configuration or a mixed instances policy.
     * </p>
     * 
     * @return The launch template and version to use to specify the updates. If you specify this parameter, you can't
     *         specify a launch configuration or a mixed instances policy.
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template and version to use to specify the updates. If you specify this parameter, you can't specify a
     * launch configuration or a mixed instances policy.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template and version to use to specify the updates. If you specify this parameter, you can't
     *        specify a launch configuration or a mixed instances policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The mixed instances policy to use to specify the updates. If you specify this parameter, you can't specify a
     * launch configuration or a launch template.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups with
     * Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        The mixed instances policy to use to specify the updates. If you specify this parameter, you can't specify
     *        a launch configuration or a launch template. </p>
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
     * The mixed instances policy to use to specify the updates. If you specify this parameter, you can't specify a
     * launch configuration or a launch template.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups with
     * Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The mixed instances policy to use to specify the updates. If you specify this parameter, you can't
     *         specify a launch configuration or a launch template. </p>
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
     * The mixed instances policy to use to specify the updates. If you specify this parameter, you can't specify a
     * launch configuration or a launch template.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups with
     * Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        The mixed instances policy to use to specify the updates. If you specify this parameter, you can't specify
     *        a launch configuration or a launch template. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups
     *        with Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        setMixedInstancesPolicy(mixedInstancesPolicy);
        return this;
    }

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the Auto Scaling group.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     * 
     * @return The minimum size of the Auto Scaling group.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the Auto Scaling group.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     * 
     * @return The maximum size of the Auto Scaling group.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater than or
     * equal to the minimum size of the group and less than or equal to the maximum size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater
     *        than or equal to the minimum size of the group and less than or equal to the maximum size of the group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater than or
     * equal to the minimum size of the group and less than or equal to the maximum size of the group.
     * </p>
     * 
     * @return The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater
     *         than or equal to the minimum size of the group and less than or equal to the maximum size of the group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater than or
     * equal to the minimum size of the group and less than or equal to the maximum size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater
     *        than or equal to the minimum size of the group and less than or equal to the maximum size of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withDesiredCapacity(Integer desiredCapacity) {
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

    public UpdateAutoScalingGroupRequest withDefaultCooldown(Integer defaultCooldown) {
        setDefaultCooldown(defaultCooldown);
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones for the group.
     * </p>
     * 
     * @return One or more Availability Zones for the group.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * One or more Availability Zones for the group.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones for the group.
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
     * One or more Availability Zones for the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withAvailabilityZones(String... availabilityZones) {
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
     * One or more Availability Zones for the group.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. If you
     * configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either
     * the EC2 status checks or the load balancer health checks.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. If
     *        you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it
     *        fails either the EC2 status checks or the load balancer health checks.
     */

    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. If you
     * configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either
     * the EC2 status checks or the load balancer health checks.
     * </p>
     * 
     * @return The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. If
     *         you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it
     *         fails either the EC2 status checks or the load balancer health checks.
     */

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. If you
     * configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either
     * the EC2 status checks or the load balancer health checks.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>. If
     *        you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it
     *        fails either the EC2 status checks or the load balancer health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withHealthCheckType(String healthCheckType) {
        setHealthCheckType(healthCheckType);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service. The default value is <code>0</code>.
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
     *        EC2 instance that has come into service. The default value is <code>0</code>.</p>
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
     * instance that has come into service. The default value is <code>0</code>.
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
     *         an EC2 instance that has come into service. The default value is <code>0</code>.</p>
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
     * instance that has come into service. The default value is <code>0</code>.
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
     *        EC2 instance that has come into service. The default value is <code>0</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health Checks for Auto
     *        Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        Conditional: This parameter is required if you are adding an <code>ELB</code> health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
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

    public UpdateAutoScalingGroupRequest withPlacementGroup(String placementGroup) {
        setPlacementGroup(placementGroup);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of subnet IDs, if you are launching into a VPC.
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you specify
     * for this parameter must reside in those Availability Zones.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        A comma-separated list of subnet IDs, if you are launching into a VPC.</p>
     *        <p>
     *        If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you
     *        specify for this parameter must reside in those Availability Zones.
     */

    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet IDs, if you are launching into a VPC.
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you specify
     * for this parameter must reside in those Availability Zones.
     * </p>
     * 
     * @return A comma-separated list of subnet IDs, if you are launching into a VPC.</p>
     *         <p>
     *         If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you
     *         specify for this parameter must reside in those Availability Zones.
     */

    public String getVPCZoneIdentifier() {
        return this.vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet IDs, if you are launching into a VPC.
     * </p>
     * <p>
     * If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you specify
     * for this parameter must reside in those Availability Zones.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        A comma-separated list of subnet IDs, if you are launching into a VPC.</p>
     *        <p>
     *        If you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, the subnets that you
     *        specify for this parameter must reside in those Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withVPCZoneIdentifier(String vPCZoneIdentifier) {
        setVPCZoneIdentifier(vPCZoneIdentifier);
        return this;
    }

    /**
     * <p>
     * A standalone termination policy or a list of termination policies used to select the instance to terminate. The
     * policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return A standalone termination policy or a list of termination policies used to select the instance to
     *         terminate. The policies are executed in the order that they are listed.</p>
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
     * A standalone termination policy or a list of termination policies used to select the instance to terminate. The
     * policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        A standalone termination policy or a list of termination policies used to select the instance to
     *        terminate. The policies are executed in the order that they are listed.</p>
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
     * A standalone termination policy or a list of termination policies used to select the instance to terminate. The
     * policies are executed in the order that they are listed.
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
     *        A standalone termination policy or a list of termination policies used to select the instance to
     *        terminate. The policies are executed in the order that they are listed.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *        Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withTerminationPolicies(String... terminationPolicies) {
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
     * A standalone termination policy or a list of termination policies used to select the instance to terminate. The
     * policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        A standalone termination policy or a list of termination policies used to select the instance to
     *        terminate. The policies are executed in the order that they are listed.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling
     *        Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withTerminationPolicies(java.util.Collection<String> terminationPolicies) {
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

    public UpdateAutoScalingGroupRequest withNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
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
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-Linked
     * Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param serviceLinkedRoleARN
     *        The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *        AWS services on your behalf. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html"
     *        >Service-Linked Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-Linked
     * Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *         AWS services on your behalf. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html"
     *         >Service-Linked Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getServiceLinkedRoleARN() {
        return this.serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html">Service-Linked
     * Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param serviceLinkedRoleARN
     *        The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *        AWS services on your behalf. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html"
     *        >Service-Linked Roles</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withServiceLinkedRoleARN(String serviceLinkedRoleARN) {
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

        if (obj instanceof UpdateAutoScalingGroupRequest == false)
            return false;
        UpdateAutoScalingGroupRequest other = (UpdateAutoScalingGroupRequest) obj;
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
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode + ((getDefaultCooldown() == null) ? 0 : getDefaultCooldown().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckType() == null) ? 0 : getHealthCheckType().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckGracePeriod() == null) ? 0 : getHealthCheckGracePeriod().hashCode());
        hashCode = prime * hashCode + ((getPlacementGroup() == null) ? 0 : getPlacementGroup().hashCode());
        hashCode = prime * hashCode + ((getVPCZoneIdentifier() == null) ? 0 : getVPCZoneIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTerminationPolicies() == null) ? 0 : getTerminationPolicies().hashCode());
        hashCode = prime * hashCode + ((getNewInstancesProtectedFromScaleIn() == null) ? 0 : getNewInstancesProtectedFromScaleIn().hashCode());
        hashCode = prime * hashCode + ((getServiceLinkedRoleARN() == null) ? 0 : getServiceLinkedRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAutoScalingGroupRequest clone() {
        return (UpdateAutoScalingGroupRequest) super.clone();
    }

}

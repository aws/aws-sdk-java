/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for UpdateAutoScalingGroup.
 * </p>
 */
public class UpdateAutoScalingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     */
    private String launchConfigurationName;
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
     * default is 300.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/autoscaling/latest/userguide/Cooldown.html">Auto
     * Scaling Cooldowns</a> in the <i>Auto Scaling User Guide</i>.
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
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>.
     * </p>
     */
    private String healthCheckType;
    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking the health status of an EC2 instance that
     * has come into service. The default is 0.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/healthcheck.html">Health Checks</a> in the <i>Auto
     * Scaling User Guide</i>.
     * </p>
     */
    private Integer healthCheckGracePeriod;
    /**
     * <p>
     * The name of the placement group into which you'll launch your instances, if any. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String placementGroup;
    /**
     * <p>
     * The ID of the subnet, if you are launching into a VPC. You can specify several subnets in a comma-separated list.
     * </p>
     * <p>
     * When you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, ensure that the subnets'
     * Availability Zones match the values you specify for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/asg-in-vpc.html">Launching Auto Scaling Instances
     * in a VPC</a> in the <i>Auto Scaling User Guide</i>.
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
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> terminationPolicies;
    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
     * </p>
     */
    private Boolean newInstancesProtectedFromScaleIn;

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
     * The name of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @return The name of the launch configuration.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
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
     * default is 300.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/autoscaling/latest/userguide/Cooldown.html">Auto
     * Scaling Cooldowns</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *        start. The default is 300.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/Cooldown.html">Auto Scaling Cooldowns</a> in
     *        the <i>Auto Scaling User Guide</i>.
     */

    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default is 300.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/autoscaling/latest/userguide/Cooldown.html">Auto
     * Scaling Cooldowns</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *         start. The default is 300.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/autoscaling/latest/userguide/Cooldown.html">Auto Scaling Cooldowns</a>
     *         in the <i>Auto Scaling User Guide</i>.
     */

    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The
     * default is 300.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/autoscaling/latest/userguide/Cooldown.html">Auto
     * Scaling Cooldowns</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *        start. The default is 300.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/Cooldown.html">Auto Scaling Cooldowns</a> in
     *        the <i>Auto Scaling User Guide</i>.
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
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>.
     */

    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>.
     * </p>
     * 
     * @return The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>.
     */

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are <code>EC2</code> and <code>ELB</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withHealthCheckType(String healthCheckType) {
        setHealthCheckType(healthCheckType);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking the health status of an EC2 instance that
     * has come into service. The default is 0.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/healthcheck.html">Health Checks</a> in the <i>Auto
     * Scaling User Guide</i>.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Auto Scaling waits before checking the health status of an EC2
     *        instance that has come into service. The default is 0.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/healthcheck.html">Health Checks</a> in the
     *        <i>Auto Scaling User Guide</i>.
     */

    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking the health status of an EC2 instance that
     * has come into service. The default is 0.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/healthcheck.html">Health Checks</a> in the <i>Auto
     * Scaling User Guide</i>.
     * </p>
     * 
     * @return The amount of time, in seconds, that Auto Scaling waits before checking the health status of an EC2
     *         instance that has come into service. The default is 0.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/autoscaling/latest/userguide/healthcheck.html">Health Checks</a> in the
     *         <i>Auto Scaling User Guide</i>.
     */

    public Integer getHealthCheckGracePeriod() {
        return this.healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking the health status of an EC2 instance that
     * has come into service. The default is 0.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/healthcheck.html">Health Checks</a> in the <i>Auto
     * Scaling User Guide</i>.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Auto Scaling waits before checking the health status of an EC2
     *        instance that has come into service. The default is 0.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/healthcheck.html">Health Checks</a> in the
     *        <i>Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        setHealthCheckGracePeriod(healthCheckGracePeriod);
        return this;
    }

    /**
     * <p>
     * The name of the placement group into which you'll launch your instances, if any. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param placementGroup
     *        The name of the placement group into which you'll launch your instances, if any. For more information, see
     *        <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which you'll launch your instances, if any. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The name of the placement group into which you'll launch your instances, if any. For more information,
     *         see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement
     *         Groups</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getPlacementGroup() {
        return this.placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which you'll launch your instances, if any. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param placementGroup
     *        The name of the placement group into which you'll launch your instances, if any. For more information, see
     *        <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withPlacementGroup(String placementGroup) {
        setPlacementGroup(placementGroup);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet, if you are launching into a VPC. You can specify several subnets in a comma-separated list.
     * </p>
     * <p>
     * When you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, ensure that the subnets'
     * Availability Zones match the values you specify for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/asg-in-vpc.html">Launching Auto Scaling Instances
     * in a VPC</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        The ID of the subnet, if you are launching into a VPC. You can specify several subnets in a
     *        comma-separated list.</p>
     *        <p>
     *        When you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, ensure that the
     *        subnets' Availability Zones match the values you specify for <code>AvailabilityZones</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/asg-in-vpc.html">Launching Auto Scaling
     *        Instances in a VPC</a> in the <i>Auto Scaling User Guide</i>.
     */

    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    /**
     * <p>
     * The ID of the subnet, if you are launching into a VPC. You can specify several subnets in a comma-separated list.
     * </p>
     * <p>
     * When you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, ensure that the subnets'
     * Availability Zones match the values you specify for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/asg-in-vpc.html">Launching Auto Scaling Instances
     * in a VPC</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The ID of the subnet, if you are launching into a VPC. You can specify several subnets in a
     *         comma-separated list.</p>
     *         <p>
     *         When you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, ensure that the
     *         subnets' Availability Zones match the values you specify for <code>AvailabilityZones</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/autoscaling/latest/userguide/asg-in-vpc.html">Launching Auto Scaling
     *         Instances in a VPC</a> in the <i>Auto Scaling User Guide</i>.
     */

    public String getVPCZoneIdentifier() {
        return this.vPCZoneIdentifier;
    }

    /**
     * <p>
     * The ID of the subnet, if you are launching into a VPC. You can specify several subnets in a comma-separated list.
     * </p>
     * <p>
     * When you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, ensure that the subnets'
     * Availability Zones match the values you specify for <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/asg-in-vpc.html">Launching Auto Scaling Instances
     * in a VPC</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        The ID of the subnet, if you are launching into a VPC. You can specify several subnets in a
     *        comma-separated list.</p>
     *        <p>
     *        When you specify <code>VPCZoneIdentifier</code> with <code>AvailabilityZones</code>, ensure that the
     *        subnets' Availability Zones match the values you specify for <code>AvailabilityZones</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/asg-in-vpc.html">Launching Auto Scaling
     *        Instances in a VPC</a> in the <i>Auto Scaling User Guide</i>.
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
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return A standalone termination policy or a list of termination policies used to select the instance to
     *         terminate. The policies are executed in the order that they are listed.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html">Controlling
     *         Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Auto Scaling User Guide</i>.
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
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        A standalone termination policy or a list of termination policies used to select the instance to
     *        terminate. The policies are executed in the order that they are listed.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html">Controlling
     *        Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Auto Scaling User Guide</i>.
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
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Auto Scaling User Guide</i>.
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
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html">Controlling
     *        Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Auto Scaling User Guide</i>.
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
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html">Controlling Which
     * Instances Auto Scaling Terminates During Scale In</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        A standalone termination policy or a list of termination policies used to select the instance to
     *        terminate. The policies are executed in the order that they are listed.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html">Controlling
     *        Which Instances Auto Scaling Terminates During Scale In</a> in the <i>Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        setTerminationPolicies(terminationPolicies);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
     */

    public void setNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
        this.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling
     *         in.
     */

    public Boolean getNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAutoScalingGroupRequest withNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
        setNewInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling
     *         in.
     */

    public Boolean isNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() + ",");
        if (getMinSize() != null)
            sb.append("MinSize: " + getMinSize() + ",");
        if (getMaxSize() != null)
            sb.append("MaxSize: " + getMaxSize() + ",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: " + getDesiredCapacity() + ",");
        if (getDefaultCooldown() != null)
            sb.append("DefaultCooldown: " + getDefaultCooldown() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getHealthCheckType() != null)
            sb.append("HealthCheckType: " + getHealthCheckType() + ",");
        if (getHealthCheckGracePeriod() != null)
            sb.append("HealthCheckGracePeriod: " + getHealthCheckGracePeriod() + ",");
        if (getPlacementGroup() != null)
            sb.append("PlacementGroup: " + getPlacementGroup() + ",");
        if (getVPCZoneIdentifier() != null)
            sb.append("VPCZoneIdentifier: " + getVPCZoneIdentifier() + ",");
        if (getTerminationPolicies() != null)
            sb.append("TerminationPolicies: " + getTerminationPolicies() + ",");
        if (getNewInstancesProtectedFromScaleIn() != null)
            sb.append("NewInstancesProtectedFromScaleIn: " + getNewInstancesProtectedFromScaleIn());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode());
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
        return hashCode;
    }

    @Override
    public UpdateAutoScalingGroupRequest clone() {
        return (UpdateAutoScalingGroupRequest) super.clone();
    }
}

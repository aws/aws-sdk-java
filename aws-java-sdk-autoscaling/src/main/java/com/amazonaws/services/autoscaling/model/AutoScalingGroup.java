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

/**
 * <p>
 * Describes an Auto Scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AutoScalingGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupARN;
    /**
     * <p>
     * The name of the associated launch configuration.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * The launch template for the group.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * The mixed instances policy for the group.
     * </p>
     */
    private MixedInstancesPolicy mixedInstancesPolicy;
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
     * The desired size of the group.
     * </p>
     */
    private Integer desiredCapacity;
    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
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
     * One or more load balancers associated with the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> loadBalancerNames;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups for your load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> targetGroupARNs;
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
     * instance that has come into service.
     * </p>
     */
    private Integer healthCheckGracePeriod;
    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Instance> instances;
    /**
     * <p>
     * The date and time the group was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SuspendedProcess> suspendedProcesses;
    /**
     * <p>
     * The name of the placement group into which to launch your instances, if any.
     * </p>
     */
    private String placementGroup;
    /**
     * <p>
     * One or more subnet IDs, if applicable, separated by commas.
     * </p>
     */
    private String vPCZoneIdentifier;
    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EnabledMetric> enabledMetrics;
    /**
     * <p>
     * The current state of the group when <a>DeleteAutoScalingGroup</a> is in progress.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags for the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagDescription> tags;
    /**
     * <p>
     * The termination policies for the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> terminationPolicies;
    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     */
    private Boolean newInstancesProtectedFromScaleIn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf.
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

    public AutoScalingGroup withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupARN
     *        The Amazon Resource Name (ARN) of the Auto Scaling group.
     */

    public void setAutoScalingGroupARN(String autoScalingGroupARN) {
        this.autoScalingGroupARN = autoScalingGroupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Auto Scaling group.
     */

    public String getAutoScalingGroupARN() {
        return this.autoScalingGroupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupARN
     *        The Amazon Resource Name (ARN) of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withAutoScalingGroupARN(String autoScalingGroupARN) {
        setAutoScalingGroupARN(autoScalingGroupARN);
        return this;
    }

    /**
     * <p>
     * The name of the associated launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the associated launch configuration.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the associated launch configuration.
     * </p>
     * 
     * @return The name of the associated launch configuration.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the associated launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the associated launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The launch template for the group.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template for the group.
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template for the group.
     * </p>
     * 
     * @return The launch template for the group.
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template for the group.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The mixed instances policy for the group.
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        The mixed instances policy for the group.
     */

    public void setMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
    }

    /**
     * <p>
     * The mixed instances policy for the group.
     * </p>
     * 
     * @return The mixed instances policy for the group.
     */

    public MixedInstancesPolicy getMixedInstancesPolicy() {
        return this.mixedInstancesPolicy;
    }

    /**
     * <p>
     * The mixed instances policy for the group.
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        The mixed instances policy for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        setMixedInstancesPolicy(mixedInstancesPolicy);
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

    public AutoScalingGroup withMinSize(Integer minSize) {
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

    public AutoScalingGroup withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The desired size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired size of the group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The desired size of the group.
     * </p>
     * 
     * @return The desired size of the group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The desired size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired size of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *        start.
     */

    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *         start.
     */

    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes before another scaling activity can
     *        start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withDefaultCooldown(Integer defaultCooldown) {
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

    public AutoScalingGroup withAvailabilityZones(String... availabilityZones) {
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

    public AutoScalingGroup withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * One or more load balancers associated with the group.
     * </p>
     * 
     * @return One or more load balancers associated with the group.
     */

    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
            loadBalancerNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return loadBalancerNames;
    }

    /**
     * <p>
     * One or more load balancers associated with the group.
     * </p>
     * 
     * @param loadBalancerNames
     *        One or more load balancers associated with the group.
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
     * One or more load balancers associated with the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerNames(java.util.Collection)} or {@link #withLoadBalancerNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param loadBalancerNames
     *        One or more load balancers associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withLoadBalancerNames(String... loadBalancerNames) {
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
     * One or more load balancers associated with the group.
     * </p>
     * 
     * @param loadBalancerNames
     *        One or more load balancers associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups for your load balancer.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the target groups for your load balancer.
     */

    public java.util.List<String> getTargetGroupARNs() {
        if (targetGroupARNs == null) {
            targetGroupARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return targetGroupARNs;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups for your load balancer.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups for your load balancer.
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
     * The Amazon Resource Names (ARN) of the target groups for your load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroupARNs(java.util.Collection)} or {@link #withTargetGroupARNs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups for your load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withTargetGroupARNs(String... targetGroupARNs) {
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
     * The Amazon Resource Names (ARN) of the target groups for your load balancer.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups for your load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        setTargetGroupARNs(targetGroupARNs);
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

    public AutoScalingGroup withHealthCheckType(String healthCheckType) {
        setHealthCheckType(healthCheckType);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an
     *        EC2 instance that has come into service.
     */

    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service.
     * </p>
     * 
     * @return The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of
     *         an EC2 instance that has come into service.
     */

    public Integer getHealthCheckGracePeriod() {
        return this.healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2
     * instance that has come into service.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an
     *        EC2 instance that has come into service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        setHealthCheckGracePeriod(healthCheckGracePeriod);
        return this;
    }

    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     * 
     * @return The EC2 instances associated with the group.
     */

    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<Instance>();
        }
        return instances;
    }

    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     * 
     * @param instances
     *        The EC2 instances associated with the group.
     */

    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<Instance>(instances);
    }

    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        The EC2 instances associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withInstances(Instance... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<Instance>(instances.length));
        }
        for (Instance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 instances associated with the group.
     * </p>
     * 
     * @param instances
     *        The EC2 instances associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The date and time the group was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the group was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the group was created.
     * </p>
     * 
     * @return The date and time the group was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the group was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     * 
     * @return The suspended processes associated with the group.
     */

    public java.util.List<SuspendedProcess> getSuspendedProcesses() {
        if (suspendedProcesses == null) {
            suspendedProcesses = new com.amazonaws.internal.SdkInternalList<SuspendedProcess>();
        }
        return suspendedProcesses;
    }

    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     * 
     * @param suspendedProcesses
     *        The suspended processes associated with the group.
     */

    public void setSuspendedProcesses(java.util.Collection<SuspendedProcess> suspendedProcesses) {
        if (suspendedProcesses == null) {
            this.suspendedProcesses = null;
            return;
        }

        this.suspendedProcesses = new com.amazonaws.internal.SdkInternalList<SuspendedProcess>(suspendedProcesses);
    }

    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuspendedProcesses(java.util.Collection)} or {@link #withSuspendedProcesses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param suspendedProcesses
     *        The suspended processes associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withSuspendedProcesses(SuspendedProcess... suspendedProcesses) {
        if (this.suspendedProcesses == null) {
            setSuspendedProcesses(new com.amazonaws.internal.SdkInternalList<SuspendedProcess>(suspendedProcesses.length));
        }
        for (SuspendedProcess ele : suspendedProcesses) {
            this.suspendedProcesses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The suspended processes associated with the group.
     * </p>
     * 
     * @param suspendedProcesses
     *        The suspended processes associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withSuspendedProcesses(java.util.Collection<SuspendedProcess> suspendedProcesses) {
        setSuspendedProcesses(suspendedProcesses);
        return this;
    }

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if any.
     * </p>
     * 
     * @param placementGroup
     *        The name of the placement group into which to launch your instances, if any.
     */

    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if any.
     * </p>
     * 
     * @return The name of the placement group into which to launch your instances, if any.
     */

    public String getPlacementGroup() {
        return this.placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which to launch your instances, if any.
     * </p>
     * 
     * @param placementGroup
     *        The name of the placement group into which to launch your instances, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withPlacementGroup(String placementGroup) {
        setPlacementGroup(placementGroup);
        return this;
    }

    /**
     * <p>
     * One or more subnet IDs, if applicable, separated by commas.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        One or more subnet IDs, if applicable, separated by commas.
     */

    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    /**
     * <p>
     * One or more subnet IDs, if applicable, separated by commas.
     * </p>
     * 
     * @return One or more subnet IDs, if applicable, separated by commas.
     */

    public String getVPCZoneIdentifier() {
        return this.vPCZoneIdentifier;
    }

    /**
     * <p>
     * One or more subnet IDs, if applicable, separated by commas.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        One or more subnet IDs, if applicable, separated by commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withVPCZoneIdentifier(String vPCZoneIdentifier) {
        setVPCZoneIdentifier(vPCZoneIdentifier);
        return this;
    }

    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     * 
     * @return The metrics enabled for the group.
     */

    public java.util.List<EnabledMetric> getEnabledMetrics() {
        if (enabledMetrics == null) {
            enabledMetrics = new com.amazonaws.internal.SdkInternalList<EnabledMetric>();
        }
        return enabledMetrics;
    }

    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     * 
     * @param enabledMetrics
     *        The metrics enabled for the group.
     */

    public void setEnabledMetrics(java.util.Collection<EnabledMetric> enabledMetrics) {
        if (enabledMetrics == null) {
            this.enabledMetrics = null;
            return;
        }

        this.enabledMetrics = new com.amazonaws.internal.SdkInternalList<EnabledMetric>(enabledMetrics);
    }

    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledMetrics(java.util.Collection)} or {@link #withEnabledMetrics(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param enabledMetrics
     *        The metrics enabled for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withEnabledMetrics(EnabledMetric... enabledMetrics) {
        if (this.enabledMetrics == null) {
            setEnabledMetrics(new com.amazonaws.internal.SdkInternalList<EnabledMetric>(enabledMetrics.length));
        }
        for (EnabledMetric ele : enabledMetrics) {
            this.enabledMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics enabled for the group.
     * </p>
     * 
     * @param enabledMetrics
     *        The metrics enabled for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withEnabledMetrics(java.util.Collection<EnabledMetric> enabledMetrics) {
        setEnabledMetrics(enabledMetrics);
        return this;
    }

    /**
     * <p>
     * The current state of the group when <a>DeleteAutoScalingGroup</a> is in progress.
     * </p>
     * 
     * @param status
     *        The current state of the group when <a>DeleteAutoScalingGroup</a> is in progress.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the group when <a>DeleteAutoScalingGroup</a> is in progress.
     * </p>
     * 
     * @return The current state of the group when <a>DeleteAutoScalingGroup</a> is in progress.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the group when <a>DeleteAutoScalingGroup</a> is in progress.
     * </p>
     * 
     * @param status
     *        The current state of the group when <a>DeleteAutoScalingGroup</a> is in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The tags for the group.
     * </p>
     * 
     * @return The tags for the group.
     */

    public java.util.List<TagDescription> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<TagDescription>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the group.
     * </p>
     * 
     * @param tags
     *        The tags for the group.
     */

    public void setTags(java.util.Collection<TagDescription> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<TagDescription>(tags);
    }

    /**
     * <p>
     * The tags for the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withTags(TagDescription... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<TagDescription>(tags.length));
        }
        for (TagDescription ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the group.
     * </p>
     * 
     * @param tags
     *        The tags for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withTags(java.util.Collection<TagDescription> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The termination policies for the group.
     * </p>
     * 
     * @return The termination policies for the group.
     */

    public java.util.List<String> getTerminationPolicies() {
        if (terminationPolicies == null) {
            terminationPolicies = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return terminationPolicies;
    }

    /**
     * <p>
     * The termination policies for the group.
     * </p>
     * 
     * @param terminationPolicies
     *        The termination policies for the group.
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
     * The termination policies for the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminationPolicies(java.util.Collection)} or {@link #withTerminationPolicies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param terminationPolicies
     *        The termination policies for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withTerminationPolicies(String... terminationPolicies) {
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
     * The termination policies for the group.
     * </p>
     * 
     * @param terminationPolicies
     *        The termination policies for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        setTerminationPolicies(terminationPolicies);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *        scaling in.
     */

    public void setNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
        this.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *         scaling in.
     */

    public Boolean getNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *        scaling in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
        setNewInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling
     * in.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when
     *         scaling in.
     */

    public Boolean isNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf.
     * </p>
     * 
     * @param serviceLinkedRoleARN
     *        The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *        AWS services on your behalf.
     */

    public void setServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *         AWS services on your behalf.
     */

    public String getServiceLinkedRoleARN() {
        return this.serviceLinkedRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS
     * services on your behalf.
     * </p>
     * 
     * @param serviceLinkedRoleARN
     *        The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other
     *        AWS services on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroup withServiceLinkedRoleARN(String serviceLinkedRoleARN) {
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
        if (getAutoScalingGroupARN() != null)
            sb.append("AutoScalingGroupARN: ").append(getAutoScalingGroupARN()).append(",");
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
        if (getLoadBalancerNames() != null)
            sb.append("LoadBalancerNames: ").append(getLoadBalancerNames()).append(",");
        if (getTargetGroupARNs() != null)
            sb.append("TargetGroupARNs: ").append(getTargetGroupARNs()).append(",");
        if (getHealthCheckType() != null)
            sb.append("HealthCheckType: ").append(getHealthCheckType()).append(",");
        if (getHealthCheckGracePeriod() != null)
            sb.append("HealthCheckGracePeriod: ").append(getHealthCheckGracePeriod()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getSuspendedProcesses() != null)
            sb.append("SuspendedProcesses: ").append(getSuspendedProcesses()).append(",");
        if (getPlacementGroup() != null)
            sb.append("PlacementGroup: ").append(getPlacementGroup()).append(",");
        if (getVPCZoneIdentifier() != null)
            sb.append("VPCZoneIdentifier: ").append(getVPCZoneIdentifier()).append(",");
        if (getEnabledMetrics() != null)
            sb.append("EnabledMetrics: ").append(getEnabledMetrics()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof AutoScalingGroup == false)
            return false;
        AutoScalingGroup other = (AutoScalingGroup) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getAutoScalingGroupARN() == null ^ this.getAutoScalingGroupARN() == null)
            return false;
        if (other.getAutoScalingGroupARN() != null && other.getAutoScalingGroupARN().equals(this.getAutoScalingGroupARN()) == false)
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
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getSuspendedProcesses() == null ^ this.getSuspendedProcesses() == null)
            return false;
        if (other.getSuspendedProcesses() != null && other.getSuspendedProcesses().equals(this.getSuspendedProcesses()) == false)
            return false;
        if (other.getPlacementGroup() == null ^ this.getPlacementGroup() == null)
            return false;
        if (other.getPlacementGroup() != null && other.getPlacementGroup().equals(this.getPlacementGroup()) == false)
            return false;
        if (other.getVPCZoneIdentifier() == null ^ this.getVPCZoneIdentifier() == null)
            return false;
        if (other.getVPCZoneIdentifier() != null && other.getVPCZoneIdentifier().equals(this.getVPCZoneIdentifier()) == false)
            return false;
        if (other.getEnabledMetrics() == null ^ this.getEnabledMetrics() == null)
            return false;
        if (other.getEnabledMetrics() != null && other.getEnabledMetrics().equals(this.getEnabledMetrics()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getAutoScalingGroupARN() == null) ? 0 : getAutoScalingGroupARN().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getMixedInstancesPolicy() == null) ? 0 : getMixedInstancesPolicy().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode + ((getDefaultCooldown() == null) ? 0 : getDefaultCooldown().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupARNs() == null) ? 0 : getTargetGroupARNs().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckType() == null) ? 0 : getHealthCheckType().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckGracePeriod() == null) ? 0 : getHealthCheckGracePeriod().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getSuspendedProcesses() == null) ? 0 : getSuspendedProcesses().hashCode());
        hashCode = prime * hashCode + ((getPlacementGroup() == null) ? 0 : getPlacementGroup().hashCode());
        hashCode = prime * hashCode + ((getVPCZoneIdentifier() == null) ? 0 : getVPCZoneIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnabledMetrics() == null) ? 0 : getEnabledMetrics().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTerminationPolicies() == null) ? 0 : getTerminationPolicies().hashCode());
        hashCode = prime * hashCode + ((getNewInstancesProtectedFromScaleIn() == null) ? 0 : getNewInstancesProtectedFromScaleIn().hashCode());
        hashCode = prime * hashCode + ((getServiceLinkedRoleARN() == null) ? 0 : getServiceLinkedRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingGroup clone() {
        try {
            return (AutoScalingGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

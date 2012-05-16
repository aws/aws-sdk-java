/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#updateAutoScalingGroup(UpdateAutoScalingGroupRequest) UpdateAutoScalingGroup operation}.
 * <p>
 * Updates the configuration for the specified AutoScalingGroup.
 * </p>
 * <p>
 * <b>NOTE:</b> To update an Auto Scaling group with a launch configuration that has the InstanceMonitoring flag set to False, you must first ensure that
 * collection of group metrics is disabled. Otherwise, calls to UpdateAutoScalingGroup will fail. If you have previously enabled group metrics
 * collection, you can disable collection of all group metrics by calling DisableMetricsCollection.
 * </p>
 * <p>
 * The new settings are registered upon the completion of this call. Any launch configuration settings take effect on any triggers after this call
 * returns. Triggers that are currently in progress aren't affected.
 * </p>
 * <p>
 * <b>NOTE:</b> If the new values are specified for the MinSize or MaxSize parameters, then there will be an implicit call to SetDesiredCapacity to set
 * the group to the new MaxSize. All optional parameters are left unchanged if not passed in the request.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#updateAutoScalingGroup(UpdateAutoScalingGroupRequest)
 */
public class UpdateAutoScalingGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of the launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * The minimum size of the Auto Scaling group.
     */
    private Integer minSize;

    /**
     * The maximum size of the Auto Scaling group.
     */
    private Integer maxSize;

    /**
     * The desired capacity for the Auto Scaling group.
     */
    private Integer desiredCapacity;

    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     */
    private Integer defaultCooldown;

    /**
     * Availability Zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<String> availabilityZones;

    /**
     * The service of interest for the health status check, either "EC2" for
     * Amazon EC2 or "ELB" for Elastic Load Balancing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String healthCheckType;

    /**
     * The length of time that Auto Scaling waits before checking an
     * instance's health status. The grace period begins when an instance
     * comes into service.
     */
    private Integer healthCheckGracePeriod;

    /**
     * The name of the cluster placement group, if applicable. For more
     * information, go to <a
     * webservices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     * Using Cluster Instances</a> in the Amazon EC2 User Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String placementGroup;

    /**
     * The subnet identifier for the Amazon VPC connection, if applicable.
     * You can specify several subnets in a comma-separated list. <p> When
     * you specify <code>VPCZoneIdentifier</code> with
     * <code>AvailabilityZones</code>, ensure that the subnets' Availability
     * Zones match the values you specify for <code>AvailabilityZones</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String vPCZoneIdentifier;

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The name of the launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the launch configuration.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }
    
    
    /**
     * The minimum size of the Auto Scaling group.
     *
     * @return The minimum size of the Auto Scaling group.
     */
    public Integer getMinSize() {
        return minSize;
    }
    
    /**
     * The minimum size of the Auto Scaling group.
     *
     * @param minSize The minimum size of the Auto Scaling group.
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }
    
    /**
     * The minimum size of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minSize The minimum size of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    
    
    /**
     * The maximum size of the Auto Scaling group.
     *
     * @return The maximum size of the Auto Scaling group.
     */
    public Integer getMaxSize() {
        return maxSize;
    }
    
    /**
     * The maximum size of the Auto Scaling group.
     *
     * @param maxSize The maximum size of the Auto Scaling group.
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }
    
    /**
     * The maximum size of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxSize The maximum size of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    
    
    /**
     * The desired capacity for the Auto Scaling group.
     *
     * @return The desired capacity for the Auto Scaling group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The desired capacity for the Auto Scaling group.
     *
     * @param desiredCapacity The desired capacity for the Auto Scaling group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The desired capacity for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The desired capacity for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     *
     * @return The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     */
    public Integer getDefaultCooldown() {
        return defaultCooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     *
     * @param defaultCooldown The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     */
    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultCooldown The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    
    
    /**
     * Availability Zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Availability Zones for the group.
     */
    public java.util.List<String> getAvailabilityZones() {
        
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * Availability Zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Availability Zones for the group.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * Availability Zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Availability Zones for the group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * Availability Zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Availability Zones for the group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

        return this;
    }
    
    /**
     * The service of interest for the health status check, either "EC2" for
     * Amazon EC2 or "ELB" for Elastic Load Balancing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The service of interest for the health status check, either "EC2" for
     *         Amazon EC2 or "ELB" for Elastic Load Balancing.
     */
    public String getHealthCheckType() {
        return healthCheckType;
    }
    
    /**
     * The service of interest for the health status check, either "EC2" for
     * Amazon EC2 or "ELB" for Elastic Load Balancing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service of interest for the health status check, either "EC2" for
     *         Amazon EC2 or "ELB" for Elastic Load Balancing.
     */
    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }
    
    /**
     * The service of interest for the health status check, either "EC2" for
     * Amazon EC2 or "ELB" for Elastic Load Balancing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service of interest for the health status check, either "EC2" for
     *         Amazon EC2 or "ELB" for Elastic Load Balancing.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    
    
    /**
     * The length of time that Auto Scaling waits before checking an
     * instance's health status. The grace period begins when an instance
     * comes into service.
     *
     * @return The length of time that Auto Scaling waits before checking an
     *         instance's health status. The grace period begins when an instance
     *         comes into service.
     */
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }
    
    /**
     * The length of time that Auto Scaling waits before checking an
     * instance's health status. The grace period begins when an instance
     * comes into service.
     *
     * @param healthCheckGracePeriod The length of time that Auto Scaling waits before checking an
     *         instance's health status. The grace period begins when an instance
     *         comes into service.
     */
    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }
    
    /**
     * The length of time that Auto Scaling waits before checking an
     * instance's health status. The grace period begins when an instance
     * comes into service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheckGracePeriod The length of time that Auto Scaling waits before checking an
     *         instance's health status. The grace period begins when an instance
     *         comes into service.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
        return this;
    }
    
    
    /**
     * The name of the cluster placement group, if applicable. For more
     * information, go to <a
     * webservices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     * Using Cluster Instances</a> in the Amazon EC2 User Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the cluster placement group, if applicable. For more
     *         information, go to <a
     *         webservices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     *         Using Cluster Instances</a> in the Amazon EC2 User Guide.
     */
    public String getPlacementGroup() {
        return placementGroup;
    }
    
    /**
     * The name of the cluster placement group, if applicable. For more
     * information, go to <a
     * webservices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     * Using Cluster Instances</a> in the Amazon EC2 User Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param placementGroup The name of the cluster placement group, if applicable. For more
     *         information, go to <a
     *         webservices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     *         Using Cluster Instances</a> in the Amazon EC2 User Guide.
     */
    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }
    
    /**
     * The name of the cluster placement group, if applicable. For more
     * information, go to <a
     * webservices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     * Using Cluster Instances</a> in the Amazon EC2 User Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param placementGroup The name of the cluster placement group, if applicable. For more
     *         information, go to <a
     *         webservices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     *         Using Cluster Instances</a> in the Amazon EC2 User Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }
    
    
    /**
     * The subnet identifier for the Amazon VPC connection, if applicable.
     * You can specify several subnets in a comma-separated list. <p> When
     * you specify <code>VPCZoneIdentifier</code> with
     * <code>AvailabilityZones</code>, ensure that the subnets' Availability
     * Zones match the values you specify for <code>AvailabilityZones</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The subnet identifier for the Amazon VPC connection, if applicable.
     *         You can specify several subnets in a comma-separated list. <p> When
     *         you specify <code>VPCZoneIdentifier</code> with
     *         <code>AvailabilityZones</code>, ensure that the subnets' Availability
     *         Zones match the values you specify for <code>AvailabilityZones</code>.
     */
    public String getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }
    
    /**
     * The subnet identifier for the Amazon VPC connection, if applicable.
     * You can specify several subnets in a comma-separated list. <p> When
     * you specify <code>VPCZoneIdentifier</code> with
     * <code>AvailabilityZones</code>, ensure that the subnets' Availability
     * Zones match the values you specify for <code>AvailabilityZones</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier The subnet identifier for the Amazon VPC connection, if applicable.
     *         You can specify several subnets in a comma-separated list. <p> When
     *         you specify <code>VPCZoneIdentifier</code> with
     *         <code>AvailabilityZones</code>, ensure that the subnets' Availability
     *         Zones match the values you specify for <code>AvailabilityZones</code>.
     */
    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }
    
    /**
     * The subnet identifier for the Amazon VPC connection, if applicable.
     * You can specify several subnets in a comma-separated list. <p> When
     * you specify <code>VPCZoneIdentifier</code> with
     * <code>AvailabilityZones</code>, ensure that the subnets' Availability
     * Zones match the values you specify for <code>AvailabilityZones</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier The subnet identifier for the Amazon VPC connection, if applicable.
     *         You can specify several subnets in a comma-separated list. <p> When
     *         you specify <code>VPCZoneIdentifier</code> with
     *         <code>AvailabilityZones</code>, ensure that the subnets' Availability
     *         Zones match the values you specify for <code>AvailabilityZones</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (autoScalingGroupName != null) sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        if (launchConfigurationName != null) sb.append("LaunchConfigurationName: " + launchConfigurationName + ", ");
        if (minSize != null) sb.append("MinSize: " + minSize + ", ");
        if (maxSize != null) sb.append("MaxSize: " + maxSize + ", ");
        if (desiredCapacity != null) sb.append("DesiredCapacity: " + desiredCapacity + ", ");
        if (defaultCooldown != null) sb.append("DefaultCooldown: " + defaultCooldown + ", ");
        if (availabilityZones != null) sb.append("AvailabilityZones: " + availabilityZones + ", ");
        if (healthCheckType != null) sb.append("HealthCheckType: " + healthCheckType + ", ");
        if (healthCheckGracePeriod != null) sb.append("HealthCheckGracePeriod: " + healthCheckGracePeriod + ", ");
        if (placementGroup != null) sb.append("PlacementGroup: " + placementGroup + ", ");
        if (vPCZoneIdentifier != null) sb.append("VPCZoneIdentifier: " + vPCZoneIdentifier + ", ");
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof UpdateAutoScalingGroupRequest == false) return false;
        UpdateAutoScalingGroupRequest other = (UpdateAutoScalingGroupRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null) return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false) return false; 
        if (other.getMinSize() == null ^ this.getMinSize() == null) return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false) return false; 
        if (other.getMaxSize() == null ^ this.getMaxSize() == null) return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false) return false; 
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null) return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false) return false; 
        if (other.getDefaultCooldown() == null ^ this.getDefaultCooldown() == null) return false;
        if (other.getDefaultCooldown() != null && other.getDefaultCooldown().equals(this.getDefaultCooldown()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.getHealthCheckType() == null ^ this.getHealthCheckType() == null) return false;
        if (other.getHealthCheckType() != null && other.getHealthCheckType().equals(this.getHealthCheckType()) == false) return false; 
        if (other.getHealthCheckGracePeriod() == null ^ this.getHealthCheckGracePeriod() == null) return false;
        if (other.getHealthCheckGracePeriod() != null && other.getHealthCheckGracePeriod().equals(this.getHealthCheckGracePeriod()) == false) return false; 
        if (other.getPlacementGroup() == null ^ this.getPlacementGroup() == null) return false;
        if (other.getPlacementGroup() != null && other.getPlacementGroup().equals(this.getPlacementGroup()) == false) return false; 
        if (other.getVPCZoneIdentifier() == null ^ this.getVPCZoneIdentifier() == null) return false;
        if (other.getVPCZoneIdentifier() != null && other.getVPCZoneIdentifier().equals(this.getVPCZoneIdentifier()) == false) return false; 
        return true;
    }
    
}
    
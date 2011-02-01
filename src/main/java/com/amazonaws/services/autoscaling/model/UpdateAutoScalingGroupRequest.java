/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <b>NOTE:</b> To update an Auto Scaling group with a launch
 * configuration that has the InstanceMonitoring.enabled flag set to
 * false, you must first ensure that collection of group metrics is
 * disabled. Otherwise, calls to UpdateAutoScalingGroup will fail. If you
 * have previously enabled group metrics collection, you can disable
 * collection of all group metrics by calling DisableMetricsCollection.
 * </p>
 * <p>
 * The new settings are registered upon the completion of this call. Any
 * launch configuration settings take effect on any triggers after this
 * call returns. Triggers that are currently in progress aren't affected.
 * </p>
 * <p>
 * <b>NOTE:</b> If the new values are specified for the MinSize or
 * MaxSize parameters, then there will be an implicit call to
 * SetDesiredCapacity to set the group to the new MaxSize. All optional
 * parameters are left unchanged if not passed in the request.
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
     * Availability zones for the group.
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
     * The identifier for the VPC connection, if applicable.
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
     * Availability zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Availability zones for the group.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * Availability zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Availability zones for the group.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * Availability zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Availability zones for the group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withAvailabilityZones(String... availabilityZones) {
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * Availability zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Availability zones for the group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateAutoScalingGroupRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;

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
     * The identifier for the VPC connection, if applicable.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The identifier for the VPC connection, if applicable.
     */
    public String getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }
    
    /**
     * The identifier for the VPC connection, if applicable.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier The identifier for the VPC connection, if applicable.
     */
    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }
    
    /**
     * The identifier for the VPC connection, if applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier The identifier for the VPC connection, if applicable.
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
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("LaunchConfigurationName: " + launchConfigurationName + ", ");
        sb.append("MinSize: " + minSize + ", ");
        sb.append("MaxSize: " + maxSize + ", ");
        sb.append("DesiredCapacity: " + desiredCapacity + ", ");
        sb.append("DefaultCooldown: " + defaultCooldown + ", ");
        sb.append("AvailabilityZones: " + availabilityZones + ", ");
        sb.append("HealthCheckType: " + healthCheckType + ", ");
        sb.append("HealthCheckGracePeriod: " + healthCheckGracePeriod + ", ");
        sb.append("PlacementGroup: " + placementGroup + ", ");
        sb.append("VPCZoneIdentifier: " + vPCZoneIdentifier + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
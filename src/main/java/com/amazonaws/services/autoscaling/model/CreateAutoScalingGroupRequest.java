/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#createAutoScalingGroup(CreateAutoScalingGroupRequest) CreateAutoScalingGroup operation}.
 * <p>
 * Creates a new Auto Scaling group with the specified name. Once the
 * creation request is completed, the AutoScalingGroup is ready to be
 * used in other calls.
 * </p>
 * <p>
 * <b>NOTE:</b> The client must not have already used up their entire
 * quota of AutoScaling groups in order for this call to be successful.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#createAutoScalingGroup(CreateAutoScalingGroupRequest)
 */
public class CreateAutoScalingGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of the launch configuration to use with the Auto Scaling
     * group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     */
    private Integer cooldown;

    /**
     * A list of availability zones for the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<String> availabilityZones;

    /**
     * A list of LoadBalancers to use.
     */
    private java.util.List<String> loadBalancerNames;

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
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
     * <b>Length: </b>1 - 100<br/>
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
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The name of the launch configuration to use with the Auto Scaling
     * group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the launch configuration to use with the Auto Scaling
     *         group.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration to use with the Auto Scaling
     * group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration to use with the Auto Scaling
     *         group.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration to use with the Auto Scaling
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration to use with the Auto Scaling
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withLaunchConfigurationName(String launchConfigurationName) {
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
    public CreateAutoScalingGroupRequest withMinSize(Integer minSize) {
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
    public CreateAutoScalingGroupRequest withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     *
     * @return The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     */
    public Integer getCooldown() {
        return cooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     *
     * @param cooldown The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cooldown The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    
    
    /**
     * A list of availability zones for the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A list of availability zones for the Auto Scaling group.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * A list of availability zones for the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones A list of availability zones for the Auto Scaling group.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * A list of availability zones for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones A list of availability zones for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withAvailabilityZones(String... availabilityZones) {
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of availability zones for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones A list of availability zones for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;

        return this;
    }
    
    /**
     * A list of LoadBalancers to use.
     *
     * @return A list of LoadBalancers to use.
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
            loadBalancerNames = new java.util.ArrayList<String>();
        }
        return loadBalancerNames;
    }
    
    /**
     * A list of LoadBalancers to use.
     *
     * @param loadBalancerNames A list of LoadBalancers to use.
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>();
        if (loadBalancerNames != null) {
            loadBalancerNamesCopy.addAll(loadBalancerNames);
        }
        this.loadBalancerNames = loadBalancerNamesCopy;
    }
    
    /**
     * A list of LoadBalancers to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of LoadBalancers to use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withLoadBalancerNames(String... loadBalancerNames) {
        for (String value : loadBalancerNames) {
            getLoadBalancerNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of LoadBalancers to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of LoadBalancers to use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>();
        if (loadBalancerNames != null) {
            loadBalancerNamesCopy.addAll(loadBalancerNames);
        }
        this.loadBalancerNames = loadBalancerNamesCopy;

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
        sb.append("Cooldown: " + cooldown + ", ");
        sb.append("AvailabilityZones: " + availabilityZones + ", ");
        sb.append("LoadBalancerNames: " + loadBalancerNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
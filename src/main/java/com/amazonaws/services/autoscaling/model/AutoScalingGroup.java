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

/**
 * <p>
 * The AutoScalingGroup data type.
 * </p>
 */
public class AutoScalingGroup {

    /**
     * Specifies the name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * Specifies the name of the associated <a>LaunchConfiguration</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * Contains the minimum size of the AutoScalingGroup.
     */
    private Integer minSize;

    /**
     * Contains the maximum size of the AutoScalingGroup.
     */
    private Integer maxSize;

    /**
     * Specifies the desired capacity for the AutoScalingGroup.
     */
    private Integer desiredCapacity;

    /**
     * The number of seconds after a scaling activity completes before any
     * further scaling activities can start.
     */
    private Integer cooldown;

    /**
     * Contains a list of availability zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<String> availabilityZones;

    /**
     * 
     */
    private java.util.List<String> loadBalancerNames;

    /**
     * Provides a summary list of EC2 instances.
     */
    private java.util.List<Instance> instances;

    /**
     * Specifies the date and time the Auto Scaling group was created.
     */
    private java.util.Date createdTime;

    /**
     * Specifies the name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the name of the group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * Specifies the name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName Specifies the name of the group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * Specifies the name of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName Specifies the name of the group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * Specifies the name of the associated <a>LaunchConfiguration</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the name of the associated <a>LaunchConfiguration</a>.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * Specifies the name of the associated <a>LaunchConfiguration</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName Specifies the name of the associated <a>LaunchConfiguration</a>.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * Specifies the name of the associated <a>LaunchConfiguration</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName Specifies the name of the associated <a>LaunchConfiguration</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }
    
    
    /**
     * Contains the minimum size of the AutoScalingGroup.
     *
     * @return Contains the minimum size of the AutoScalingGroup.
     */
    public Integer getMinSize() {
        return minSize;
    }
    
    /**
     * Contains the minimum size of the AutoScalingGroup.
     *
     * @param minSize Contains the minimum size of the AutoScalingGroup.
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }
    
    /**
     * Contains the minimum size of the AutoScalingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minSize Contains the minimum size of the AutoScalingGroup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    
    
    /**
     * Contains the maximum size of the AutoScalingGroup.
     *
     * @return Contains the maximum size of the AutoScalingGroup.
     */
    public Integer getMaxSize() {
        return maxSize;
    }
    
    /**
     * Contains the maximum size of the AutoScalingGroup.
     *
     * @param maxSize Contains the maximum size of the AutoScalingGroup.
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }
    
    /**
     * Contains the maximum size of the AutoScalingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxSize Contains the maximum size of the AutoScalingGroup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    
    
    /**
     * Specifies the desired capacity for the AutoScalingGroup.
     *
     * @return Specifies the desired capacity for the AutoScalingGroup.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * Specifies the desired capacity for the AutoScalingGroup.
     *
     * @param desiredCapacity Specifies the desired capacity for the AutoScalingGroup.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * Specifies the desired capacity for the AutoScalingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity Specifies the desired capacity for the AutoScalingGroup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    
    
    /**
     * The number of seconds after a scaling activity completes before any
     * further scaling activities can start.
     *
     * @return The number of seconds after a scaling activity completes before any
     *         further scaling activities can start.
     */
    public Integer getCooldown() {
        return cooldown;
    }
    
    /**
     * The number of seconds after a scaling activity completes before any
     * further scaling activities can start.
     *
     * @param cooldown The number of seconds after a scaling activity completes before any
     *         further scaling activities can start.
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }
    
    /**
     * The number of seconds after a scaling activity completes before any
     * further scaling activities can start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cooldown The number of seconds after a scaling activity completes before any
     *         further scaling activities can start.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    
    
    /**
     * Contains a list of availability zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Contains a list of availability zones for the group.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * Contains a list of availability zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Contains a list of availability zones for the group.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * Contains a list of availability zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Contains a list of availability zones for the group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withAvailabilityZones(String... availabilityZones) {
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of availability zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Contains a list of availability zones for the group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;

        return this;
    }
    
    /**
     * 
     *
     * @return 
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
            loadBalancerNames = new java.util.ArrayList<String>();
        }
        return loadBalancerNames;
    }
    
    /**
     * 
     *
     * @param loadBalancerNames 
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>();
        if (loadBalancerNames != null) {
            loadBalancerNamesCopy.addAll(loadBalancerNames);
        }
        this.loadBalancerNames = loadBalancerNamesCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withLoadBalancerNames(String... loadBalancerNames) {
        for (String value : loadBalancerNames) {
            getLoadBalancerNames().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>();
        if (loadBalancerNames != null) {
            loadBalancerNamesCopy.addAll(loadBalancerNames);
        }
        this.loadBalancerNames = loadBalancerNamesCopy;

        return this;
    }
    
    /**
     * Provides a summary list of EC2 instances.
     *
     * @return Provides a summary list of EC2 instances.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new java.util.ArrayList<Instance>();
        }
        return instances;
    }
    
    /**
     * Provides a summary list of EC2 instances.
     *
     * @param instances Provides a summary list of EC2 instances.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;
    }
    
    /**
     * Provides a summary list of EC2 instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Provides a summary list of EC2 instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withInstances(Instance... instances) {
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * Provides a summary list of EC2 instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Provides a summary list of EC2 instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;

        return this;
    }
    
    /**
     * Specifies the date and time the Auto Scaling group was created.
     *
     * @return Specifies the date and time the Auto Scaling group was created.
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }
    
    /**
     * Specifies the date and time the Auto Scaling group was created.
     *
     * @param createdTime Specifies the date and time the Auto Scaling group was created.
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }
    
    /**
     * Specifies the date and time the Auto Scaling group was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTime Specifies the date and time the Auto Scaling group was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
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
        sb.append("Cooldown: " + cooldown + ", ");
        sb.append("AvailabilityZones: " + availabilityZones + ", ");
        sb.append("LoadBalancerNames: " + loadBalancerNames + ", ");
        sb.append("Instances: " + instances + ", ");
        sb.append("CreatedTime: " + createdTime + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
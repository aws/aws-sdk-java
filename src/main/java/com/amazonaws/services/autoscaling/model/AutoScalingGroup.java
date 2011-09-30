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
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupARN;

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
    private Integer defaultCooldown;

    /**
     * Contains a list of availability zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<String> availabilityZones;

    /**
     * A list of load balancers associated with this Auto Scaling group.
     */
    private java.util.List<String> loadBalancerNames;

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
     * Provides a summary list of EC2 instances.
     */
    private java.util.List<Instance> instances;

    /**
     * Specifies the date and time the Auto Scaling group was created.
     */
    private java.util.Date createdTime;

    /**
     * Suspended processes associated with this Auto Scaling group.
     */
    private java.util.List<SuspendedProcess> suspendedProcesses;

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
     * A list of metrics enabled for this Auto Scaling group.
     */
    private java.util.List<EnabledMetric> enabledMetrics;

    /**
     * A list of status conditions for the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String status;

    /**
     * Specifies the name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
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
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public String getAutoScalingGroupARN() {
        return autoScalingGroupARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupARN The Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public void setAutoScalingGroupARN(String autoScalingGroupARN) {
        this.autoScalingGroupARN = autoScalingGroupARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupARN The Amazon Resource Name (ARN) of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withAutoScalingGroupARN(String autoScalingGroupARN) {
        this.autoScalingGroupARN = autoScalingGroupARN;
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
    public Integer getDefaultCooldown() {
        return defaultCooldown;
    }
    
    /**
     * The number of seconds after a scaling activity completes before any
     * further scaling activities can start.
     *
     * @param defaultCooldown The number of seconds after a scaling activity completes before any
     *         further scaling activities can start.
     */
    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }
    
    /**
     * The number of seconds after a scaling activity completes before any
     * further scaling activities can start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultCooldown The number of seconds after a scaling activity completes before any
     *         further scaling activities can start.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
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
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>());
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
     * A list of load balancers associated with this Auto Scaling group.
     *
     * @return A list of load balancers associated with this Auto Scaling group.
     */
    public java.util.List<String> getLoadBalancerNames() {
        
        if (loadBalancerNames == null) {
            loadBalancerNames = new java.util.ArrayList<String>();
        }
        return loadBalancerNames;
    }
    
    /**
     * A list of load balancers associated with this Auto Scaling group.
     *
     * @param loadBalancerNames A list of load balancers associated with this Auto Scaling group.
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>();
        if (loadBalancerNames != null) {
            loadBalancerNamesCopy.addAll(loadBalancerNames);
        }
        this.loadBalancerNames = loadBalancerNamesCopy;
    }
    
    /**
     * A list of load balancers associated with this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of load balancers associated with this Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) setLoadBalancerNames(new java.util.ArrayList<String>());
        for (String value : loadBalancerNames) {
            getLoadBalancerNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of load balancers associated with this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of load balancers associated with this Auto Scaling group.
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
    public AutoScalingGroup withHealthCheckType(String healthCheckType) {
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
    public AutoScalingGroup withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
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
        if (getInstances() == null) setInstances(new java.util.ArrayList<Instance>());
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
     * Suspended processes associated with this Auto Scaling group.
     *
     * @return Suspended processes associated with this Auto Scaling group.
     */
    public java.util.List<SuspendedProcess> getSuspendedProcesses() {
        
        if (suspendedProcesses == null) {
            suspendedProcesses = new java.util.ArrayList<SuspendedProcess>();
        }
        return suspendedProcesses;
    }
    
    /**
     * Suspended processes associated with this Auto Scaling group.
     *
     * @param suspendedProcesses Suspended processes associated with this Auto Scaling group.
     */
    public void setSuspendedProcesses(java.util.Collection<SuspendedProcess> suspendedProcesses) {
        java.util.List<SuspendedProcess> suspendedProcessesCopy = new java.util.ArrayList<SuspendedProcess>();
        if (suspendedProcesses != null) {
            suspendedProcessesCopy.addAll(suspendedProcesses);
        }
        this.suspendedProcesses = suspendedProcessesCopy;
    }
    
    /**
     * Suspended processes associated with this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suspendedProcesses Suspended processes associated with this Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withSuspendedProcesses(SuspendedProcess... suspendedProcesses) {
        if (getSuspendedProcesses() == null) setSuspendedProcesses(new java.util.ArrayList<SuspendedProcess>());
        for (SuspendedProcess value : suspendedProcesses) {
            getSuspendedProcesses().add(value);
        }
        return this;
    }
    
    /**
     * Suspended processes associated with this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suspendedProcesses Suspended processes associated with this Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withSuspendedProcesses(java.util.Collection<SuspendedProcess> suspendedProcesses) {
        java.util.List<SuspendedProcess> suspendedProcessesCopy = new java.util.ArrayList<SuspendedProcess>();
        if (suspendedProcesses != null) {
            suspendedProcessesCopy.addAll(suspendedProcesses);
        }
        this.suspendedProcesses = suspendedProcessesCopy;

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
    public AutoScalingGroup withPlacementGroup(String placementGroup) {
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
    public AutoScalingGroup withVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }
    
    
    /**
     * A list of metrics enabled for this Auto Scaling group.
     *
     * @return A list of metrics enabled for this Auto Scaling group.
     */
    public java.util.List<EnabledMetric> getEnabledMetrics() {
        
        if (enabledMetrics == null) {
            enabledMetrics = new java.util.ArrayList<EnabledMetric>();
        }
        return enabledMetrics;
    }
    
    /**
     * A list of metrics enabled for this Auto Scaling group.
     *
     * @param enabledMetrics A list of metrics enabled for this Auto Scaling group.
     */
    public void setEnabledMetrics(java.util.Collection<EnabledMetric> enabledMetrics) {
        java.util.List<EnabledMetric> enabledMetricsCopy = new java.util.ArrayList<EnabledMetric>();
        if (enabledMetrics != null) {
            enabledMetricsCopy.addAll(enabledMetrics);
        }
        this.enabledMetrics = enabledMetricsCopy;
    }
    
    /**
     * A list of metrics enabled for this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabledMetrics A list of metrics enabled for this Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withEnabledMetrics(EnabledMetric... enabledMetrics) {
        if (getEnabledMetrics() == null) setEnabledMetrics(new java.util.ArrayList<EnabledMetric>());
        for (EnabledMetric value : enabledMetrics) {
            getEnabledMetrics().add(value);
        }
        return this;
    }
    
    /**
     * A list of metrics enabled for this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabledMetrics A list of metrics enabled for this Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withEnabledMetrics(java.util.Collection<EnabledMetric> enabledMetrics) {
        java.util.List<EnabledMetric> enabledMetricsCopy = new java.util.ArrayList<EnabledMetric>();
        if (enabledMetrics != null) {
            enabledMetricsCopy.addAll(enabledMetrics);
        }
        this.enabledMetrics = enabledMetricsCopy;

        return this;
    }
    
    /**
     * A list of status conditions for the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A list of status conditions for the Auto Scaling group.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * A list of status conditions for the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param status A list of status conditions for the Auto Scaling group.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * A list of status conditions for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param status A list of status conditions for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingGroup withStatus(String status) {
        this.status = status;
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
        sb.append("AutoScalingGroupARN: " + autoScalingGroupARN + ", ");
        sb.append("LaunchConfigurationName: " + launchConfigurationName + ", ");
        sb.append("MinSize: " + minSize + ", ");
        sb.append("MaxSize: " + maxSize + ", ");
        sb.append("DesiredCapacity: " + desiredCapacity + ", ");
        sb.append("DefaultCooldown: " + defaultCooldown + ", ");
        sb.append("AvailabilityZones: " + availabilityZones + ", ");
        sb.append("LoadBalancerNames: " + loadBalancerNames + ", ");
        sb.append("HealthCheckType: " + healthCheckType + ", ");
        sb.append("HealthCheckGracePeriod: " + healthCheckGracePeriod + ", ");
        sb.append("Instances: " + instances + ", ");
        sb.append("CreatedTime: " + createdTime + ", ");
        sb.append("SuspendedProcesses: " + suspendedProcesses + ", ");
        sb.append("PlacementGroup: " + placementGroup + ", ");
        sb.append("VPCZoneIdentifier: " + vPCZoneIdentifier + ", ");
        sb.append("EnabledMetrics: " + enabledMetrics + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
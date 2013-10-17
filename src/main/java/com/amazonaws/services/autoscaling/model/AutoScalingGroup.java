/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * The AutoScalingGroup data type.
 * </p>
 */
public class AutoScalingGroup implements Serializable {

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
     * Contains the minimum size of the Auto Scaling group.
     */
    private Integer minSize;

    /**
     * Contains the maximum size of the Auto Scaling group.
     */
    private Integer maxSize;

    /**
     * Specifies the desired capacity for the Auto Scaling group.
     */
    private Integer desiredCapacity;

    /**
     * The number of seconds after a scaling activity completes before any
     * further scaling activities can start.
     */
    private Integer defaultCooldown;

    /**
     * Contains a list of Availability Zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * A list of load balancers associated with this Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNames;

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
     * Provides a summary list of Amazon EC2 instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instances;

    /**
     * Specifies the date and time the Auto Scaling group was created.
     */
    private java.util.Date createdTime;

    /**
     * Suspended processes associated with this Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SuspendedProcess> suspendedProcesses;

    /**
     * The name of the cluster placement group, if applicable. For more
     * information, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
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
     * A list of metrics enabled for this Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EnabledMetric> enabledMetrics;

    /**
     * The current state of the Auto Scaling group when a
     * <a>DeleteAutoScalingGroup</a> action is in progress.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String status;

    /**
     * A list of tags for the Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription> tags;

    /**
     * A standalone termination policy or a list of termination policies for
     * this Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPolicies;

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
     * Contains the minimum size of the Auto Scaling group.
     *
     * @return Contains the minimum size of the Auto Scaling group.
     */
    public Integer getMinSize() {
        return minSize;
    }
    
    /**
     * Contains the minimum size of the Auto Scaling group.
     *
     * @param minSize Contains the minimum size of the Auto Scaling group.
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }
    
    /**
     * Contains the minimum size of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minSize Contains the minimum size of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * Contains the maximum size of the Auto Scaling group.
     *
     * @return Contains the maximum size of the Auto Scaling group.
     */
    public Integer getMaxSize() {
        return maxSize;
    }
    
    /**
     * Contains the maximum size of the Auto Scaling group.
     *
     * @param maxSize Contains the maximum size of the Auto Scaling group.
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }
    
    /**
     * Contains the maximum size of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxSize Contains the maximum size of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * Specifies the desired capacity for the Auto Scaling group.
     *
     * @return Specifies the desired capacity for the Auto Scaling group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * Specifies the desired capacity for the Auto Scaling group.
     *
     * @param desiredCapacity Specifies the desired capacity for the Auto Scaling group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * Specifies the desired capacity for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity Specifies the desired capacity for the Auto Scaling group.
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
     * Contains a list of Availability Zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Contains a list of Availability Zones for the group.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * Contains a list of Availability Zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Contains a list of Availability Zones for the group.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * Contains a list of Availability Zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Contains a list of Availability Zones for the group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of Availability Zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones Contains a list of Availability Zones for the group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

        return this;
    }

    /**
     * A list of load balancers associated with this Auto Scaling group.
     *
     * @return A list of load balancers associated with this Auto Scaling group.
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
              loadBalancerNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              loadBalancerNames.setAutoConstruct(true);
        }
        return loadBalancerNames;
    }
    
    /**
     * A list of load balancers associated with this Auto Scaling group.
     *
     * @param loadBalancerNames A list of load balancers associated with this Auto Scaling group.
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(loadBalancerNames.size());
        loadBalancerNamesCopy.addAll(loadBalancerNames);
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
        if (getLoadBalancerNames() == null) setLoadBalancerNames(new java.util.ArrayList<String>(loadBalancerNames.length));
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
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(loadBalancerNames.size());
            loadBalancerNamesCopy.addAll(loadBalancerNames);
            this.loadBalancerNames = loadBalancerNamesCopy;
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
     * Provides a summary list of Amazon EC2 instances.
     *
     * @return Provides a summary list of Amazon EC2 instances.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * Provides a summary list of Amazon EC2 instances.
     *
     * @param instances Provides a summary list of Amazon EC2 instances.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * Provides a summary list of Amazon EC2 instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Provides a summary list of Amazon EC2 instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withInstances(Instance... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<Instance>(instances.length));
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * Provides a summary list of Amazon EC2 instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Provides a summary list of Amazon EC2 instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
            instancesCopy.addAll(instances);
            this.instances = instancesCopy;
        }

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
              suspendedProcesses = new com.amazonaws.internal.ListWithAutoConstructFlag<SuspendedProcess>();
              suspendedProcesses.setAutoConstruct(true);
        }
        return suspendedProcesses;
    }
    
    /**
     * Suspended processes associated with this Auto Scaling group.
     *
     * @param suspendedProcesses Suspended processes associated with this Auto Scaling group.
     */
    public void setSuspendedProcesses(java.util.Collection<SuspendedProcess> suspendedProcesses) {
        if (suspendedProcesses == null) {
            this.suspendedProcesses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SuspendedProcess> suspendedProcessesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SuspendedProcess>(suspendedProcesses.size());
        suspendedProcessesCopy.addAll(suspendedProcesses);
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
        if (getSuspendedProcesses() == null) setSuspendedProcesses(new java.util.ArrayList<SuspendedProcess>(suspendedProcesses.length));
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
        if (suspendedProcesses == null) {
            this.suspendedProcesses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SuspendedProcess> suspendedProcessesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SuspendedProcess>(suspendedProcesses.size());
            suspendedProcessesCopy.addAll(suspendedProcesses);
            this.suspendedProcesses = suspendedProcessesCopy;
        }

        return this;
    }

    /**
     * The name of the cluster placement group, if applicable. For more
     * information, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     * Using Cluster Instances</a> in the Amazon EC2 User Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the cluster placement group, if applicable. For more
     *         information, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     *         Using Cluster Instances</a> in the Amazon EC2 User Guide.
     */
    public String getPlacementGroup() {
        return placementGroup;
    }
    
    /**
     * The name of the cluster placement group, if applicable. For more
     * information, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     * Using Cluster Instances</a> in the Amazon EC2 User Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param placementGroup The name of the cluster placement group, if applicable. For more
     *         information, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
     *         Using Cluster Instances</a> in the Amazon EC2 User Guide.
     */
    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }
    
    /**
     * The name of the cluster placement group, if applicable. For more
     * information, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
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
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">
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
              enabledMetrics = new com.amazonaws.internal.ListWithAutoConstructFlag<EnabledMetric>();
              enabledMetrics.setAutoConstruct(true);
        }
        return enabledMetrics;
    }
    
    /**
     * A list of metrics enabled for this Auto Scaling group.
     *
     * @param enabledMetrics A list of metrics enabled for this Auto Scaling group.
     */
    public void setEnabledMetrics(java.util.Collection<EnabledMetric> enabledMetrics) {
        if (enabledMetrics == null) {
            this.enabledMetrics = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EnabledMetric> enabledMetricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EnabledMetric>(enabledMetrics.size());
        enabledMetricsCopy.addAll(enabledMetrics);
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
        if (getEnabledMetrics() == null) setEnabledMetrics(new java.util.ArrayList<EnabledMetric>(enabledMetrics.length));
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
        if (enabledMetrics == null) {
            this.enabledMetrics = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EnabledMetric> enabledMetricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EnabledMetric>(enabledMetrics.size());
            enabledMetricsCopy.addAll(enabledMetrics);
            this.enabledMetrics = enabledMetricsCopy;
        }

        return this;
    }

    /**
     * The current state of the Auto Scaling group when a
     * <a>DeleteAutoScalingGroup</a> action is in progress.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The current state of the Auto Scaling group when a
     *         <a>DeleteAutoScalingGroup</a> action is in progress.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current state of the Auto Scaling group when a
     * <a>DeleteAutoScalingGroup</a> action is in progress.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param status The current state of the Auto Scaling group when a
     *         <a>DeleteAutoScalingGroup</a> action is in progress.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current state of the Auto Scaling group when a
     * <a>DeleteAutoScalingGroup</a> action is in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param status The current state of the Auto Scaling group when a
     *         <a>DeleteAutoScalingGroup</a> action is in progress.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * A list of tags for the Auto Scaling group.
     *
     * @return A list of tags for the Auto Scaling group.
     */
    public java.util.List<TagDescription> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags for the Auto Scaling group.
     *
     * @param tags A list of tags for the Auto Scaling group.
     */
    public void setTags(java.util.Collection<TagDescription> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withTags(TagDescription... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<TagDescription>(tags.length));
        for (TagDescription value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withTags(java.util.Collection<TagDescription> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * A standalone termination policy or a list of termination policies for
     * this Auto Scaling group.
     *
     * @return A standalone termination policy or a list of termination policies for
     *         this Auto Scaling group.
     */
    public java.util.List<String> getTerminationPolicies() {
        if (terminationPolicies == null) {
              terminationPolicies = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              terminationPolicies.setAutoConstruct(true);
        }
        return terminationPolicies;
    }
    
    /**
     * A standalone termination policy or a list of termination policies for
     * this Auto Scaling group.
     *
     * @param terminationPolicies A standalone termination policy or a list of termination policies for
     *         this Auto Scaling group.
     */
    public void setTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        if (terminationPolicies == null) {
            this.terminationPolicies = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(terminationPolicies.size());
        terminationPoliciesCopy.addAll(terminationPolicies);
        this.terminationPolicies = terminationPoliciesCopy;
    }
    
    /**
     * A standalone termination policy or a list of termination policies for
     * this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies A standalone termination policy or a list of termination policies for
     *         this Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withTerminationPolicies(String... terminationPolicies) {
        if (getTerminationPolicies() == null) setTerminationPolicies(new java.util.ArrayList<String>(terminationPolicies.length));
        for (String value : terminationPolicies) {
            getTerminationPolicies().add(value);
        }
        return this;
    }
    
    /**
     * A standalone termination policy or a list of termination policies for
     * this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies A standalone termination policy or a list of termination policies for
     *         this Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AutoScalingGroup withTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        if (terminationPolicies == null) {
            this.terminationPolicies = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(terminationPolicies.size());
            terminationPoliciesCopy.addAll(terminationPolicies);
            this.terminationPolicies = terminationPoliciesCopy;
        }

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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getAutoScalingGroupARN() != null) sb.append("AutoScalingGroupARN: " + getAutoScalingGroupARN() + ",");
        if (getLaunchConfigurationName() != null) sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() + ",");
        if (getMinSize() != null) sb.append("MinSize: " + getMinSize() + ",");
        if (getMaxSize() != null) sb.append("MaxSize: " + getMaxSize() + ",");
        if (getDesiredCapacity() != null) sb.append("DesiredCapacity: " + getDesiredCapacity() + ",");
        if (getDefaultCooldown() != null) sb.append("DefaultCooldown: " + getDefaultCooldown() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getLoadBalancerNames() != null) sb.append("LoadBalancerNames: " + getLoadBalancerNames() + ",");
        if (getHealthCheckType() != null) sb.append("HealthCheckType: " + getHealthCheckType() + ",");
        if (getHealthCheckGracePeriod() != null) sb.append("HealthCheckGracePeriod: " + getHealthCheckGracePeriod() + ",");
        if (getInstances() != null) sb.append("Instances: " + getInstances() + ",");
        if (getCreatedTime() != null) sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getSuspendedProcesses() != null) sb.append("SuspendedProcesses: " + getSuspendedProcesses() + ",");
        if (getPlacementGroup() != null) sb.append("PlacementGroup: " + getPlacementGroup() + ",");
        if (getVPCZoneIdentifier() != null) sb.append("VPCZoneIdentifier: " + getVPCZoneIdentifier() + ",");
        if (getEnabledMetrics() != null) sb.append("EnabledMetrics: " + getEnabledMetrics() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getTerminationPolicies() != null) sb.append("TerminationPolicies: " + getTerminationPolicies() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroupARN() == null) ? 0 : getAutoScalingGroupARN().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode()); 
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode()); 
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode()); 
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultCooldown() == null) ? 0 : getDefaultCooldown().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode()); 
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AutoScalingGroup == false) return false;
        AutoScalingGroup other = (AutoScalingGroup)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getAutoScalingGroupARN() == null ^ this.getAutoScalingGroupARN() == null) return false;
        if (other.getAutoScalingGroupARN() != null && other.getAutoScalingGroupARN().equals(this.getAutoScalingGroupARN()) == false) return false; 
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
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null) return false;
        if (other.getLoadBalancerNames() != null && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false) return false; 
        if (other.getHealthCheckType() == null ^ this.getHealthCheckType() == null) return false;
        if (other.getHealthCheckType() != null && other.getHealthCheckType().equals(this.getHealthCheckType()) == false) return false; 
        if (other.getHealthCheckGracePeriod() == null ^ this.getHealthCheckGracePeriod() == null) return false;
        if (other.getHealthCheckGracePeriod() != null && other.getHealthCheckGracePeriod().equals(this.getHealthCheckGracePeriod()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null) return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false) return false; 
        if (other.getSuspendedProcesses() == null ^ this.getSuspendedProcesses() == null) return false;
        if (other.getSuspendedProcesses() != null && other.getSuspendedProcesses().equals(this.getSuspendedProcesses()) == false) return false; 
        if (other.getPlacementGroup() == null ^ this.getPlacementGroup() == null) return false;
        if (other.getPlacementGroup() != null && other.getPlacementGroup().equals(this.getPlacementGroup()) == false) return false; 
        if (other.getVPCZoneIdentifier() == null ^ this.getVPCZoneIdentifier() == null) return false;
        if (other.getVPCZoneIdentifier() != null && other.getVPCZoneIdentifier().equals(this.getVPCZoneIdentifier()) == false) return false; 
        if (other.getEnabledMetrics() == null ^ this.getEnabledMetrics() == null) return false;
        if (other.getEnabledMetrics() != null && other.getEnabledMetrics().equals(this.getEnabledMetrics()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getTerminationPolicies() == null ^ this.getTerminationPolicies() == null) return false;
        if (other.getTerminationPolicies() != null && other.getTerminationPolicies().equals(this.getTerminationPolicies()) == false) return false; 
        return true;
    }
    
}
    
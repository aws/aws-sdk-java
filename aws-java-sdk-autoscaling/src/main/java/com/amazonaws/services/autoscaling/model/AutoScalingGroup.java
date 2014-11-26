/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an Auto Scaling group.
 * </p>
 */
public class AutoScalingGroup implements Serializable {

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The Amazon Resource Name (ARN) of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupARN;

    /**
     * The name of the associated launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * The minimum size of the group.
     */
    private Integer minSize;

    /**
     * The maximum size of the group.
     */
    private Integer maxSize;

    /**
     * The size of the group.
     */
    private Integer desiredCapacity;

    /**
     * The number of seconds after a scaling activity completes before any
     * further scaling activities can start.
     */
    private Integer defaultCooldown;

    /**
     * One or more Availability Zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * One or more load balancers associated with the group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNames;

    /**
     * The service of interest for the health status check, which can be
     * either <code>EC2</code> for Amazon EC2 or <code>ELB</code> for Elastic
     * Load Balancing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String healthCheckType;

    /**
     * The amount of time that Auto Scaling waits before checking an
     * instance's health status. The grace period begins when an instance
     * comes into service.
     */
    private Integer healthCheckGracePeriod;

    /**
     * The EC2 instances associated with the group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instances;

    /**
     * The date and time the group was created.
     */
    private java.util.Date createdTime;

    /**
     * The suspended processes associated with the group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SuspendedProcess> suspendedProcesses;

    /**
     * The name of the placement group into which you'll launch your
     * instances, if any. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement
     * Groups</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String placementGroup;

    /**
     * One or more subnet IDs, if applicable, separated by commas. <p>If you
     * specify <code>VPCZoneIdentifier</code> and
     * <code>AvailabilityZones</code>, ensure that the Availability Zones of
     * the subnets match the values for <code>AvailabilityZones</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String vPCZoneIdentifier;

    /**
     * The metrics enabled for this Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EnabledMetric> enabledMetrics;

    /**
     * The current state of the Auto Scaling group when a
     * <a>DeleteAutoScalingGroup</a> action is in progress.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String status;

    /**
     * The tags for the Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription> tags;

    /**
     * The termination policies for this Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPolicies;

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon Resource Name (ARN) of the group.
     */
    public String getAutoScalingGroupARN() {
        return autoScalingGroupARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupARN The Amazon Resource Name (ARN) of the group.
     */
    public void setAutoScalingGroupARN(String autoScalingGroupARN) {
        this.autoScalingGroupARN = autoScalingGroupARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupARN The Amazon Resource Name (ARN) of the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withAutoScalingGroupARN(String autoScalingGroupARN) {
        this.autoScalingGroupARN = autoScalingGroupARN;
        return this;
    }

    /**
     * The name of the associated launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the associated launch configuration.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The name of the associated launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the associated launch configuration.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The name of the associated launch configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the associated launch configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * The minimum size of the group.
     *
     * @return The minimum size of the group.
     */
    public Integer getMinSize() {
        return minSize;
    }
    
    /**
     * The minimum size of the group.
     *
     * @param minSize The minimum size of the group.
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }
    
    /**
     * The minimum size of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minSize The minimum size of the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * The maximum size of the group.
     *
     * @return The maximum size of the group.
     */
    public Integer getMaxSize() {
        return maxSize;
    }
    
    /**
     * The maximum size of the group.
     *
     * @param maxSize The maximum size of the group.
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }
    
    /**
     * The maximum size of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxSize The maximum size of the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * The size of the group.
     *
     * @return The size of the group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The size of the group.
     *
     * @param desiredCapacity The size of the group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The size of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The size of the group.
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
     * One or more Availability Zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return One or more Availability Zones for the group.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * One or more Availability Zones for the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones One or more Availability Zones for the group.
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
     * One or more Availability Zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones One or more Availability Zones for the group.
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
     * One or more Availability Zones for the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones One or more Availability Zones for the group.
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
     * One or more load balancers associated with the group.
     *
     * @return One or more load balancers associated with the group.
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
              loadBalancerNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              loadBalancerNames.setAutoConstruct(true);
        }
        return loadBalancerNames;
    }
    
    /**
     * One or more load balancers associated with the group.
     *
     * @param loadBalancerNames One or more load balancers associated with the group.
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
     * One or more load balancers associated with the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames One or more load balancers associated with the group.
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
     * One or more load balancers associated with the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames One or more load balancers associated with the group.
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
     * The service of interest for the health status check, which can be
     * either <code>EC2</code> for Amazon EC2 or <code>ELB</code> for Elastic
     * Load Balancing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The service of interest for the health status check, which can be
     *         either <code>EC2</code> for Amazon EC2 or <code>ELB</code> for Elastic
     *         Load Balancing.
     */
    public String getHealthCheckType() {
        return healthCheckType;
    }
    
    /**
     * The service of interest for the health status check, which can be
     * either <code>EC2</code> for Amazon EC2 or <code>ELB</code> for Elastic
     * Load Balancing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service of interest for the health status check, which can be
     *         either <code>EC2</code> for Amazon EC2 or <code>ELB</code> for Elastic
     *         Load Balancing.
     */
    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }
    
    /**
     * The service of interest for the health status check, which can be
     * either <code>EC2</code> for Amazon EC2 or <code>ELB</code> for Elastic
     * Load Balancing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service of interest for the health status check, which can be
     *         either <code>EC2</code> for Amazon EC2 or <code>ELB</code> for Elastic
     *         Load Balancing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    /**
     * The amount of time that Auto Scaling waits before checking an
     * instance's health status. The grace period begins when an instance
     * comes into service.
     *
     * @return The amount of time that Auto Scaling waits before checking an
     *         instance's health status. The grace period begins when an instance
     *         comes into service.
     */
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }
    
    /**
     * The amount of time that Auto Scaling waits before checking an
     * instance's health status. The grace period begins when an instance
     * comes into service.
     *
     * @param healthCheckGracePeriod The amount of time that Auto Scaling waits before checking an
     *         instance's health status. The grace period begins when an instance
     *         comes into service.
     */
    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }
    
    /**
     * The amount of time that Auto Scaling waits before checking an
     * instance's health status. The grace period begins when an instance
     * comes into service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheckGracePeriod The amount of time that Auto Scaling waits before checking an
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
     * The EC2 instances associated with the group.
     *
     * @return The EC2 instances associated with the group.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * The EC2 instances associated with the group.
     *
     * @param instances The EC2 instances associated with the group.
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
     * The EC2 instances associated with the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The EC2 instances associated with the group.
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
     * The EC2 instances associated with the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The EC2 instances associated with the group.
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
     * The date and time the group was created.
     *
     * @return The date and time the group was created.
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }
    
    /**
     * The date and time the group was created.
     *
     * @param createdTime The date and time the group was created.
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }
    
    /**
     * The date and time the group was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTime The date and time the group was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * The suspended processes associated with the group.
     *
     * @return The suspended processes associated with the group.
     */
    public java.util.List<SuspendedProcess> getSuspendedProcesses() {
        if (suspendedProcesses == null) {
              suspendedProcesses = new com.amazonaws.internal.ListWithAutoConstructFlag<SuspendedProcess>();
              suspendedProcesses.setAutoConstruct(true);
        }
        return suspendedProcesses;
    }
    
    /**
     * The suspended processes associated with the group.
     *
     * @param suspendedProcesses The suspended processes associated with the group.
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
     * The suspended processes associated with the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suspendedProcesses The suspended processes associated with the group.
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
     * The suspended processes associated with the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suspendedProcesses The suspended processes associated with the group.
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
     * The name of the placement group into which you'll launch your
     * instances, if any. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement
     * Groups</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the placement group into which you'll launch your
     *         instances, if any. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement
     *         Groups</a>.
     */
    public String getPlacementGroup() {
        return placementGroup;
    }
    
    /**
     * The name of the placement group into which you'll launch your
     * instances, if any. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement
     * Groups</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param placementGroup The name of the placement group into which you'll launch your
     *         instances, if any. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement
     *         Groups</a>.
     */
    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }
    
    /**
     * The name of the placement group into which you'll launch your
     * instances, if any. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement
     * Groups</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param placementGroup The name of the placement group into which you'll launch your
     *         instances, if any. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement
     *         Groups</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }

    /**
     * One or more subnet IDs, if applicable, separated by commas. <p>If you
     * specify <code>VPCZoneIdentifier</code> and
     * <code>AvailabilityZones</code>, ensure that the Availability Zones of
     * the subnets match the values for <code>AvailabilityZones</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return One or more subnet IDs, if applicable, separated by commas. <p>If you
     *         specify <code>VPCZoneIdentifier</code> and
     *         <code>AvailabilityZones</code>, ensure that the Availability Zones of
     *         the subnets match the values for <code>AvailabilityZones</code>.
     */
    public String getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }
    
    /**
     * One or more subnet IDs, if applicable, separated by commas. <p>If you
     * specify <code>VPCZoneIdentifier</code> and
     * <code>AvailabilityZones</code>, ensure that the Availability Zones of
     * the subnets match the values for <code>AvailabilityZones</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier One or more subnet IDs, if applicable, separated by commas. <p>If you
     *         specify <code>VPCZoneIdentifier</code> and
     *         <code>AvailabilityZones</code>, ensure that the Availability Zones of
     *         the subnets match the values for <code>AvailabilityZones</code>.
     */
    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }
    
    /**
     * One or more subnet IDs, if applicable, separated by commas. <p>If you
     * specify <code>VPCZoneIdentifier</code> and
     * <code>AvailabilityZones</code>, ensure that the Availability Zones of
     * the subnets match the values for <code>AvailabilityZones</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier One or more subnet IDs, if applicable, separated by commas. <p>If you
     *         specify <code>VPCZoneIdentifier</code> and
     *         <code>AvailabilityZones</code>, ensure that the Availability Zones of
     *         the subnets match the values for <code>AvailabilityZones</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }

    /**
     * The metrics enabled for this Auto Scaling group.
     *
     * @return The metrics enabled for this Auto Scaling group.
     */
    public java.util.List<EnabledMetric> getEnabledMetrics() {
        if (enabledMetrics == null) {
              enabledMetrics = new com.amazonaws.internal.ListWithAutoConstructFlag<EnabledMetric>();
              enabledMetrics.setAutoConstruct(true);
        }
        return enabledMetrics;
    }
    
    /**
     * The metrics enabled for this Auto Scaling group.
     *
     * @param enabledMetrics The metrics enabled for this Auto Scaling group.
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
     * The metrics enabled for this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabledMetrics The metrics enabled for this Auto Scaling group.
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
     * The metrics enabled for this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabledMetrics The metrics enabled for this Auto Scaling group.
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * The tags for the Auto Scaling group.
     *
     * @return The tags for the Auto Scaling group.
     */
    public java.util.List<TagDescription> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The tags for the Auto Scaling group.
     *
     * @param tags The tags for the Auto Scaling group.
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
     * The tags for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags for the Auto Scaling group.
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
     * The tags for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags for the Auto Scaling group.
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
     * The termination policies for this Auto Scaling group.
     *
     * @return The termination policies for this Auto Scaling group.
     */
    public java.util.List<String> getTerminationPolicies() {
        if (terminationPolicies == null) {
              terminationPolicies = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              terminationPolicies.setAutoConstruct(true);
        }
        return terminationPolicies;
    }
    
    /**
     * The termination policies for this Auto Scaling group.
     *
     * @param terminationPolicies The termination policies for this Auto Scaling group.
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
     * The termination policies for this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies The termination policies for this Auto Scaling group.
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
     * The termination policies for this Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies The termination policies for this Auto Scaling group.
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
    
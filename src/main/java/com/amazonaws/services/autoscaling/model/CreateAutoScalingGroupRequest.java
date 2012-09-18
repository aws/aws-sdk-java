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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#createAutoScalingGroup(CreateAutoScalingGroupRequest) CreateAutoScalingGroup operation}.
 * <p>
 * Creates a new Auto Scaling group with the specified name and other attributes. When the creation request is completed, the Auto Scaling group is
 * ready to be used in other calls.
 * </p>
 * <p>
 * <b>NOTE:</b> The Auto Scaling group name must be unique within the scope of your AWS account, and under the quota of Auto Scaling groups allowed for
 * your account.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#createAutoScalingGroup(CreateAutoScalingGroupRequest)
 */
public class CreateAutoScalingGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of the launch configuration to use with the Auto Scaling
     * group.
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
     * The number of Amazon EC2 instances that should be running in the
     * group.
     */
    private Integer desiredCapacity;

    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     */
    private Integer defaultCooldown;

    /**
     * A list of Availability Zones for the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<String> availabilityZones;

    /**
     * A list of load balancers to use.
     */
    private java.util.List<String> loadBalancerNames;

    /**
     * The service you want the health status from, Amazon EC2 or Elastic
     * Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String healthCheckType;

    /**
     * Length of time in seconds after a new Amazon EC2 instance comes into
     * service that Auto Scaling starts checking its health.
     */
    private Integer healthCheckGracePeriod;

    /**
     * Physical location of your cluster placement group created in Amazon
     * EC2. For more information about cluster placement group, see <a
     * rvices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     * Cluster Instances</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String placementGroup;

    /**
     * A comma-separated list of subnet identifiers of Amazon Virtual Private
     * Clouds (Amazon VPCs). <p>When you specify subnets and Availability
     * Zones with this call, ensure that the subnets' Availability Zones
     * match the Availability Zones specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String vPCZoneIdentifier;

    /**
     * A standalone termination policy or a list of termination policies used
     * to select the instance to terminate. The policies are executed in the
     * order that they are listed. <p> For more information on configuring a
     * termination policy for your Auto Scaling group, go to <a
     * AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     */
    private java.util.List<String> terminationPolicies;

    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     */
    private java.util.List<Tag> tags;

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 1600<br/>
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
     * <b>Length: </b>1 - 1600<br/>
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
     * <b>Length: </b>1 - 1600<br/>
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
     * The number of Amazon EC2 instances that should be running in the
     * group.
     *
     * @return The number of Amazon EC2 instances that should be running in the
     *         group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The number of Amazon EC2 instances that should be running in the
     * group.
     *
     * @param desiredCapacity The number of Amazon EC2 instances that should be running in the
     *         group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The number of Amazon EC2 instances that should be running in the
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The number of Amazon EC2 instances that should be running in the
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withDesiredCapacity(Integer desiredCapacity) {
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
    public CreateAutoScalingGroupRequest withDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    
    
    /**
     * A list of Availability Zones for the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A list of Availability Zones for the Auto Scaling group.
     */
    public java.util.List<String> getAvailabilityZones() {
        
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * A list of Availability Zones for the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones A list of Availability Zones for the Auto Scaling group.
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
     * A list of Availability Zones for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones A list of Availability Zones for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of Availability Zones for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones A list of Availability Zones for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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
     * A list of load balancers to use.
     *
     * @return A list of load balancers to use.
     */
    public java.util.List<String> getLoadBalancerNames() {
        
        if (loadBalancerNames == null) {
            loadBalancerNames = new java.util.ArrayList<String>();
        }
        return loadBalancerNames;
    }
    
    /**
     * A list of load balancers to use.
     *
     * @param loadBalancerNames A list of load balancers to use.
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>(loadBalancerNames.size());
        loadBalancerNamesCopy.addAll(loadBalancerNames);
        this.loadBalancerNames = loadBalancerNamesCopy;
    }
    
    /**
     * A list of load balancers to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of load balancers to use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) setLoadBalancerNames(new java.util.ArrayList<String>(loadBalancerNames.length));
        for (String value : loadBalancerNames) {
            getLoadBalancerNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of load balancers to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of load balancers to use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
        } else {
            java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>(loadBalancerNames.size());
            loadBalancerNamesCopy.addAll(loadBalancerNames);
            this.loadBalancerNames = loadBalancerNamesCopy;
        }

        return this;
    }
    
    /**
     * The service you want the health status from, Amazon EC2 or Elastic
     * Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The service you want the health status from, Amazon EC2 or Elastic
     *         Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     */
    public String getHealthCheckType() {
        return healthCheckType;
    }
    
    /**
     * The service you want the health status from, Amazon EC2 or Elastic
     * Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service you want the health status from, Amazon EC2 or Elastic
     *         Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     */
    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }
    
    /**
     * The service you want the health status from, Amazon EC2 or Elastic
     * Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service you want the health status from, Amazon EC2 or Elastic
     *         Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    
    
    /**
     * Length of time in seconds after a new Amazon EC2 instance comes into
     * service that Auto Scaling starts checking its health.
     *
     * @return Length of time in seconds after a new Amazon EC2 instance comes into
     *         service that Auto Scaling starts checking its health.
     */
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }
    
    /**
     * Length of time in seconds after a new Amazon EC2 instance comes into
     * service that Auto Scaling starts checking its health.
     *
     * @param healthCheckGracePeriod Length of time in seconds after a new Amazon EC2 instance comes into
     *         service that Auto Scaling starts checking its health.
     */
    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }
    
    /**
     * Length of time in seconds after a new Amazon EC2 instance comes into
     * service that Auto Scaling starts checking its health.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheckGracePeriod Length of time in seconds after a new Amazon EC2 instance comes into
     *         service that Auto Scaling starts checking its health.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
        return this;
    }
    
    
    /**
     * Physical location of your cluster placement group created in Amazon
     * EC2. For more information about cluster placement group, see <a
     * rvices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     * Cluster Instances</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Physical location of your cluster placement group created in Amazon
     *         EC2. For more information about cluster placement group, see <a
     *         rvices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     *         Cluster Instances</a>
     */
    public String getPlacementGroup() {
        return placementGroup;
    }
    
    /**
     * Physical location of your cluster placement group created in Amazon
     * EC2. For more information about cluster placement group, see <a
     * rvices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     * Cluster Instances</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param placementGroup Physical location of your cluster placement group created in Amazon
     *         EC2. For more information about cluster placement group, see <a
     *         rvices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     *         Cluster Instances</a>
     */
    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }
    
    /**
     * Physical location of your cluster placement group created in Amazon
     * EC2. For more information about cluster placement group, see <a
     * rvices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     * Cluster Instances</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param placementGroup Physical location of your cluster placement group created in Amazon
     *         EC2. For more information about cluster placement group, see <a
     *         rvices.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     *         Cluster Instances</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }
    
    
    /**
     * A comma-separated list of subnet identifiers of Amazon Virtual Private
     * Clouds (Amazon VPCs). <p>When you specify subnets and Availability
     * Zones with this call, ensure that the subnets' Availability Zones
     * match the Availability Zones specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A comma-separated list of subnet identifiers of Amazon Virtual Private
     *         Clouds (Amazon VPCs). <p>When you specify subnets and Availability
     *         Zones with this call, ensure that the subnets' Availability Zones
     *         match the Availability Zones specified.
     */
    public String getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }
    
    /**
     * A comma-separated list of subnet identifiers of Amazon Virtual Private
     * Clouds (Amazon VPCs). <p>When you specify subnets and Availability
     * Zones with this call, ensure that the subnets' Availability Zones
     * match the Availability Zones specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier A comma-separated list of subnet identifiers of Amazon Virtual Private
     *         Clouds (Amazon VPCs). <p>When you specify subnets and Availability
     *         Zones with this call, ensure that the subnets' Availability Zones
     *         match the Availability Zones specified.
     */
    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }
    
    /**
     * A comma-separated list of subnet identifiers of Amazon Virtual Private
     * Clouds (Amazon VPCs). <p>When you specify subnets and Availability
     * Zones with this call, ensure that the subnets' Availability Zones
     * match the Availability Zones specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier A comma-separated list of subnet identifiers of Amazon Virtual Private
     *         Clouds (Amazon VPCs). <p>When you specify subnets and Availability
     *         Zones with this call, ensure that the subnets' Availability Zones
     *         match the Availability Zones specified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }
    
    
    /**
     * A standalone termination policy or a list of termination policies used
     * to select the instance to terminate. The policies are executed in the
     * order that they are listed. <p> For more information on configuring a
     * termination policy for your Auto Scaling group, go to <a
     * AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     *
     * @return A standalone termination policy or a list of termination policies used
     *         to select the instance to terminate. The policies are executed in the
     *         order that they are listed. <p> For more information on configuring a
     *         termination policy for your Auto Scaling group, go to <a
     *         AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     *         Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     *         Scaling Developer Guide</i>.
     */
    public java.util.List<String> getTerminationPolicies() {
        
        if (terminationPolicies == null) {
            terminationPolicies = new java.util.ArrayList<String>();
        }
        return terminationPolicies;
    }
    
    /**
     * A standalone termination policy or a list of termination policies used
     * to select the instance to terminate. The policies are executed in the
     * order that they are listed. <p> For more information on configuring a
     * termination policy for your Auto Scaling group, go to <a
     * AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     *
     * @param terminationPolicies A standalone termination policy or a list of termination policies used
     *         to select the instance to terminate. The policies are executed in the
     *         order that they are listed. <p> For more information on configuring a
     *         termination policy for your Auto Scaling group, go to <a
     *         AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     *         Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     *         Scaling Developer Guide</i>.
     */
    public void setTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        if (terminationPolicies == null) {
            this.terminationPolicies = null;
            return;
        }

        java.util.List<String> terminationPoliciesCopy = new java.util.ArrayList<String>(terminationPolicies.size());
        terminationPoliciesCopy.addAll(terminationPolicies);
        this.terminationPolicies = terminationPoliciesCopy;
    }
    
    /**
     * A standalone termination policy or a list of termination policies used
     * to select the instance to terminate. The policies are executed in the
     * order that they are listed. <p> For more information on configuring a
     * termination policy for your Auto Scaling group, go to <a
     * AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies A standalone termination policy or a list of termination policies used
     *         to select the instance to terminate. The policies are executed in the
     *         order that they are listed. <p> For more information on configuring a
     *         termination policy for your Auto Scaling group, go to <a
     *         AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     *         Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     *         Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withTerminationPolicies(String... terminationPolicies) {
        if (getTerminationPolicies() == null) setTerminationPolicies(new java.util.ArrayList<String>(terminationPolicies.length));
        for (String value : terminationPolicies) {
            getTerminationPolicies().add(value);
        }
        return this;
    }
    
    /**
     * A standalone termination policy or a list of termination policies used
     * to select the instance to terminate. The policies are executed in the
     * order that they are listed. <p> For more information on configuring a
     * termination policy for your Auto Scaling group, go to <a
     * AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies A standalone termination policy or a list of termination policies used
     *         to select the instance to terminate. The policies are executed in the
     *         order that they are listed. <p> For more information on configuring a
     *         termination policy for your Auto Scaling group, go to <a
     *         AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     *         Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     *         Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withTerminationPolicies(java.util.Collection<String> terminationPolicies) {
        if (terminationPolicies == null) {
            this.terminationPolicies = null;
        } else {
            java.util.List<String> terminationPoliciesCopy = new java.util.ArrayList<String>(terminationPolicies.size());
            terminationPoliciesCopy.addAll(terminationPolicies);
            this.terminationPolicies = terminationPoliciesCopy;
        }

        return this;
    }
    
    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     *
     * @return The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters.
     */
    public java.util.List<Tag> getTags() {
        
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAutoScalingGroupRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (autoScalingGroupName != null) sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        if (launchConfigurationName != null) sb.append("LaunchConfigurationName: " + launchConfigurationName + ", ");
        if (minSize != null) sb.append("MinSize: " + minSize + ", ");
        if (maxSize != null) sb.append("MaxSize: " + maxSize + ", ");
        if (desiredCapacity != null) sb.append("DesiredCapacity: " + desiredCapacity + ", ");
        if (defaultCooldown != null) sb.append("DefaultCooldown: " + defaultCooldown + ", ");
        if (availabilityZones != null) sb.append("AvailabilityZones: " + availabilityZones + ", ");
        if (loadBalancerNames != null) sb.append("LoadBalancerNames: " + loadBalancerNames + ", ");
        if (healthCheckType != null) sb.append("HealthCheckType: " + healthCheckType + ", ");
        if (healthCheckGracePeriod != null) sb.append("HealthCheckGracePeriod: " + healthCheckGracePeriod + ", ");
        if (placementGroup != null) sb.append("PlacementGroup: " + placementGroup + ", ");
        if (vPCZoneIdentifier != null) sb.append("VPCZoneIdentifier: " + vPCZoneIdentifier + ", ");
        if (terminationPolicies != null) sb.append("TerminationPolicies: " + terminationPolicies + ", ");
        if (tags != null) sb.append("Tags: " + tags + ", ");
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
        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode()); 
        hashCode = prime * hashCode + ((getHealthCheckType() == null) ? 0 : getHealthCheckType().hashCode()); 
        hashCode = prime * hashCode + ((getHealthCheckGracePeriod() == null) ? 0 : getHealthCheckGracePeriod().hashCode()); 
        hashCode = prime * hashCode + ((getPlacementGroup() == null) ? 0 : getPlacementGroup().hashCode()); 
        hashCode = prime * hashCode + ((getVPCZoneIdentifier() == null) ? 0 : getVPCZoneIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTerminationPolicies() == null) ? 0 : getTerminationPolicies().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateAutoScalingGroupRequest == false) return false;
        CreateAutoScalingGroupRequest other = (CreateAutoScalingGroupRequest)obj;
        
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
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null) return false;
        if (other.getLoadBalancerNames() != null && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false) return false; 
        if (other.getHealthCheckType() == null ^ this.getHealthCheckType() == null) return false;
        if (other.getHealthCheckType() != null && other.getHealthCheckType().equals(this.getHealthCheckType()) == false) return false; 
        if (other.getHealthCheckGracePeriod() == null ^ this.getHealthCheckGracePeriod() == null) return false;
        if (other.getHealthCheckGracePeriod() != null && other.getHealthCheckGracePeriod().equals(this.getHealthCheckGracePeriod()) == false) return false; 
        if (other.getPlacementGroup() == null ^ this.getPlacementGroup() == null) return false;
        if (other.getPlacementGroup() != null && other.getPlacementGroup().equals(this.getPlacementGroup()) == false) return false; 
        if (other.getVPCZoneIdentifier() == null ^ this.getVPCZoneIdentifier() == null) return false;
        if (other.getVPCZoneIdentifier() != null && other.getVPCZoneIdentifier().equals(this.getVPCZoneIdentifier()) == false) return false; 
        if (other.getTerminationPolicies() == null ^ this.getTerminationPolicies() == null) return false;
        if (other.getTerminationPolicies() != null && other.getTerminationPolicies().equals(this.getTerminationPolicies()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    
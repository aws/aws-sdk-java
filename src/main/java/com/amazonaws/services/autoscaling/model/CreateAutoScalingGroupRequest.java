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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#createAutoScalingGroup(CreateAutoScalingGroupRequest) CreateAutoScalingGroup operation}.
 * <p>
 * Creates a new Auto Scaling group with the specified name and other attributes. When the creation request is completed, the Auto Scaling group is
 * ready to be used in other calls.
 * </p>
 * <p>
 * <b>NOTE:</b> The Auto Scaling group name must be unique within the scope of your AWS account.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#createAutoScalingGroup(CreateAutoScalingGroupRequest)
 */
public class CreateAutoScalingGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of an existing launch configuration to use to launch new
     * instances.
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
     * group. The desired capacity must be greater than or equal to the
     * minimum size and less than or equal to the maximum size specified for
     * the Auto Scaling group.
     */
    private Integer desiredCapacity;

    /**
     * The amount of time, in seconds, between a successful scaling activity
     * and the succeeding scaling activity. <p>If a
     * <code>DefaultCooldown</code> period is not specified, Auto Scaling
     * uses the default value of 300 as the default cool down period for the
     * Auto Scaling group. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     * Period</a>
     */
    private Integer defaultCooldown;

    /**
     * A list of Availability Zones for the Auto Scaling group. This is
     * required unless you have specified subnets.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * A list of existing Elastic Load Balancing load balancers to use. The
     * load balancers must be associated with the AWS account. <p>For
     * information on using load balancers, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Use
     * Load Balancer to Load Balance Your Auto Scaling Group</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNames;

    /**
     * The service you want the health checks from, Amazon EC2 or Elastic
     * Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     * <p>By default, the Auto Scaling health check uses the results of
     * Amazon EC2 instance status checks to determine the health of an
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#healthcheck">Health
     * Check</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String healthCheckType;

    /**
     * Length of time in seconds after a new Amazon EC2 instance comes into
     * service that Auto Scaling starts checking its health. During this time
     * any health check failure for the that instance is ignored. <p>This is
     * required if you are adding <code>ELB</code> health check. Frequently,
     * new instances need to warm up, briefly, before they can pass a health
     * check. To provide ample warm-up time, set the health check grace
     * period of the group to match the expected startup period of your
     * application.
     */
    private Integer healthCheckGracePeriod;

    /**
     * Physical location of an existing cluster placement group into which
     * you want to launch your instances. For information about cluster
     * placement group, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     * Cluster Instances</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String placementGroup;

    /**
     * A comma-separated list of subnet identifiers of Amazon Virtual Private
     * Clouds (Amazon VPCs). <p>If you specify subnets and Availability Zones
     * with this call, ensure that the subnets' Availability Zones match the
     * Availability Zones specified. <p>For information on launching your
     * Auto Scaling group into Amazon VPC subnets, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Launch
     * Auto Scaling Instances into Amazon VPC</a>.
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
     * termination policy for your Auto Scaling group, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPolicies;

    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters. <p>For
     * information about using tags, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tag
     * Your Auto Scaling Groups and Amazon EC2 Instances</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

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
     * The name of an existing launch configuration to use to launch new
     * instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of an existing launch configuration to use to launch new
     *         instances.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The name of an existing launch configuration to use to launch new
     * instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of an existing launch configuration to use to launch new
     *         instances.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The name of an existing launch configuration to use to launch new
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of an existing launch configuration to use to launch new
     *         instances.
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
     * group. The desired capacity must be greater than or equal to the
     * minimum size and less than or equal to the maximum size specified for
     * the Auto Scaling group.
     *
     * @return The number of Amazon EC2 instances that should be running in the
     *         group. The desired capacity must be greater than or equal to the
     *         minimum size and less than or equal to the maximum size specified for
     *         the Auto Scaling group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The number of Amazon EC2 instances that should be running in the
     * group. The desired capacity must be greater than or equal to the
     * minimum size and less than or equal to the maximum size specified for
     * the Auto Scaling group.
     *
     * @param desiredCapacity The number of Amazon EC2 instances that should be running in the
     *         group. The desired capacity must be greater than or equal to the
     *         minimum size and less than or equal to the maximum size specified for
     *         the Auto Scaling group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The number of Amazon EC2 instances that should be running in the
     * group. The desired capacity must be greater than or equal to the
     * minimum size and less than or equal to the maximum size specified for
     * the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The number of Amazon EC2 instances that should be running in the
     *         group. The desired capacity must be greater than or equal to the
     *         minimum size and less than or equal to the maximum size specified for
     *         the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateAutoScalingGroupRequest withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * The amount of time, in seconds, between a successful scaling activity
     * and the succeeding scaling activity. <p>If a
     * <code>DefaultCooldown</code> period is not specified, Auto Scaling
     * uses the default value of 300 as the default cool down period for the
     * Auto Scaling group. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     * Period</a>
     *
     * @return The amount of time, in seconds, between a successful scaling activity
     *         and the succeeding scaling activity. <p>If a
     *         <code>DefaultCooldown</code> period is not specified, Auto Scaling
     *         uses the default value of 300 as the default cool down period for the
     *         Auto Scaling group. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     *         Period</a>
     */
    public Integer getDefaultCooldown() {
        return defaultCooldown;
    }
    
    /**
     * The amount of time, in seconds, between a successful scaling activity
     * and the succeeding scaling activity. <p>If a
     * <code>DefaultCooldown</code> period is not specified, Auto Scaling
     * uses the default value of 300 as the default cool down period for the
     * Auto Scaling group. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     * Period</a>
     *
     * @param defaultCooldown The amount of time, in seconds, between a successful scaling activity
     *         and the succeeding scaling activity. <p>If a
     *         <code>DefaultCooldown</code> period is not specified, Auto Scaling
     *         uses the default value of 300 as the default cool down period for the
     *         Auto Scaling group. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     *         Period</a>
     */
    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }
    
    /**
     * The amount of time, in seconds, between a successful scaling activity
     * and the succeeding scaling activity. <p>If a
     * <code>DefaultCooldown</code> period is not specified, Auto Scaling
     * uses the default value of 300 as the default cool down period for the
     * Auto Scaling group. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     * Period</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultCooldown The amount of time, in seconds, between a successful scaling activity
     *         and the succeeding scaling activity. <p>If a
     *         <code>DefaultCooldown</code> period is not specified, Auto Scaling
     *         uses the default value of 300 as the default cool down period for the
     *         Auto Scaling group. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     *         Period</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateAutoScalingGroupRequest withDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }

    /**
     * A list of Availability Zones for the Auto Scaling group. This is
     * required unless you have specified subnets.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A list of Availability Zones for the Auto Scaling group. This is
     *         required unless you have specified subnets.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * A list of Availability Zones for the Auto Scaling group. This is
     * required unless you have specified subnets.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones A list of Availability Zones for the Auto Scaling group. This is
     *         required unless you have specified subnets.
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
     * A list of Availability Zones for the Auto Scaling group. This is
     * required unless you have specified subnets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones A list of Availability Zones for the Auto Scaling group. This is
     *         required unless you have specified subnets.
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
     * A list of Availability Zones for the Auto Scaling group. This is
     * required unless you have specified subnets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones A list of Availability Zones for the Auto Scaling group. This is
     *         required unless you have specified subnets.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateAutoScalingGroupRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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
     * A list of existing Elastic Load Balancing load balancers to use. The
     * load balancers must be associated with the AWS account. <p>For
     * information on using load balancers, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Use
     * Load Balancer to Load Balance Your Auto Scaling Group</a>.
     *
     * @return A list of existing Elastic Load Balancing load balancers to use. The
     *         load balancers must be associated with the AWS account. <p>For
     *         information on using load balancers, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Use
     *         Load Balancer to Load Balance Your Auto Scaling Group</a>.
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
              loadBalancerNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              loadBalancerNames.setAutoConstruct(true);
        }
        return loadBalancerNames;
    }
    
    /**
     * A list of existing Elastic Load Balancing load balancers to use. The
     * load balancers must be associated with the AWS account. <p>For
     * information on using load balancers, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Use
     * Load Balancer to Load Balance Your Auto Scaling Group</a>.
     *
     * @param loadBalancerNames A list of existing Elastic Load Balancing load balancers to use. The
     *         load balancers must be associated with the AWS account. <p>For
     *         information on using load balancers, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Use
     *         Load Balancer to Load Balance Your Auto Scaling Group</a>.
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
     * A list of existing Elastic Load Balancing load balancers to use. The
     * load balancers must be associated with the AWS account. <p>For
     * information on using load balancers, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Use
     * Load Balancer to Load Balance Your Auto Scaling Group</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of existing Elastic Load Balancing load balancers to use. The
     *         load balancers must be associated with the AWS account. <p>For
     *         information on using load balancers, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Use
     *         Load Balancer to Load Balance Your Auto Scaling Group</a>.
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
     * A list of existing Elastic Load Balancing load balancers to use. The
     * load balancers must be associated with the AWS account. <p>For
     * information on using load balancers, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Use
     * Load Balancer to Load Balance Your Auto Scaling Group</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of existing Elastic Load Balancing load balancers to use. The
     *         load balancers must be associated with the AWS account. <p>For
     *         information on using load balancers, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Use
     *         Load Balancer to Load Balance Your Auto Scaling Group</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateAutoScalingGroupRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
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
     * The service you want the health checks from, Amazon EC2 or Elastic
     * Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     * <p>By default, the Auto Scaling health check uses the results of
     * Amazon EC2 instance status checks to determine the health of an
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#healthcheck">Health
     * Check</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The service you want the health checks from, Amazon EC2 or Elastic
     *         Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     *         <p>By default, the Auto Scaling health check uses the results of
     *         Amazon EC2 instance status checks to determine the health of an
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#healthcheck">Health
     *         Check</a>.
     */
    public String getHealthCheckType() {
        return healthCheckType;
    }
    
    /**
     * The service you want the health checks from, Amazon EC2 or Elastic
     * Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     * <p>By default, the Auto Scaling health check uses the results of
     * Amazon EC2 instance status checks to determine the health of an
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#healthcheck">Health
     * Check</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service you want the health checks from, Amazon EC2 or Elastic
     *         Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     *         <p>By default, the Auto Scaling health check uses the results of
     *         Amazon EC2 instance status checks to determine the health of an
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#healthcheck">Health
     *         Check</a>.
     */
    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }
    
    /**
     * The service you want the health checks from, Amazon EC2 or Elastic
     * Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     * <p>By default, the Auto Scaling health check uses the results of
     * Amazon EC2 instance status checks to determine the health of an
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#healthcheck">Health
     * Check</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service you want the health checks from, Amazon EC2 or Elastic
     *         Load Balancer. Valid values are <code>EC2</code> or <code>ELB</code>.
     *         <p>By default, the Auto Scaling health check uses the results of
     *         Amazon EC2 instance status checks to determine the health of an
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#healthcheck">Health
     *         Check</a>.
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
     * service that Auto Scaling starts checking its health. During this time
     * any health check failure for the that instance is ignored. <p>This is
     * required if you are adding <code>ELB</code> health check. Frequently,
     * new instances need to warm up, briefly, before they can pass a health
     * check. To provide ample warm-up time, set the health check grace
     * period of the group to match the expected startup period of your
     * application.
     *
     * @return Length of time in seconds after a new Amazon EC2 instance comes into
     *         service that Auto Scaling starts checking its health. During this time
     *         any health check failure for the that instance is ignored. <p>This is
     *         required if you are adding <code>ELB</code> health check. Frequently,
     *         new instances need to warm up, briefly, before they can pass a health
     *         check. To provide ample warm-up time, set the health check grace
     *         period of the group to match the expected startup period of your
     *         application.
     */
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }
    
    /**
     * Length of time in seconds after a new Amazon EC2 instance comes into
     * service that Auto Scaling starts checking its health. During this time
     * any health check failure for the that instance is ignored. <p>This is
     * required if you are adding <code>ELB</code> health check. Frequently,
     * new instances need to warm up, briefly, before they can pass a health
     * check. To provide ample warm-up time, set the health check grace
     * period of the group to match the expected startup period of your
     * application.
     *
     * @param healthCheckGracePeriod Length of time in seconds after a new Amazon EC2 instance comes into
     *         service that Auto Scaling starts checking its health. During this time
     *         any health check failure for the that instance is ignored. <p>This is
     *         required if you are adding <code>ELB</code> health check. Frequently,
     *         new instances need to warm up, briefly, before they can pass a health
     *         check. To provide ample warm-up time, set the health check grace
     *         period of the group to match the expected startup period of your
     *         application.
     */
    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }
    
    /**
     * Length of time in seconds after a new Amazon EC2 instance comes into
     * service that Auto Scaling starts checking its health. During this time
     * any health check failure for the that instance is ignored. <p>This is
     * required if you are adding <code>ELB</code> health check. Frequently,
     * new instances need to warm up, briefly, before they can pass a health
     * check. To provide ample warm-up time, set the health check grace
     * period of the group to match the expected startup period of your
     * application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheckGracePeriod Length of time in seconds after a new Amazon EC2 instance comes into
     *         service that Auto Scaling starts checking its health. During this time
     *         any health check failure for the that instance is ignored. <p>This is
     *         required if you are adding <code>ELB</code> health check. Frequently,
     *         new instances need to warm up, briefly, before they can pass a health
     *         check. To provide ample warm-up time, set the health check grace
     *         period of the group to match the expected startup period of your
     *         application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
        return this;
    }

    /**
     * Physical location of an existing cluster placement group into which
     * you want to launch your instances. For information about cluster
     * placement group, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     * Cluster Instances</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Physical location of an existing cluster placement group into which
     *         you want to launch your instances. For information about cluster
     *         placement group, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     *         Cluster Instances</a>
     */
    public String getPlacementGroup() {
        return placementGroup;
    }
    
    /**
     * Physical location of an existing cluster placement group into which
     * you want to launch your instances. For information about cluster
     * placement group, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     * Cluster Instances</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param placementGroup Physical location of an existing cluster placement group into which
     *         you want to launch your instances. For information about cluster
     *         placement group, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     *         Cluster Instances</a>
     */
    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }
    
    /**
     * Physical location of an existing cluster placement group into which
     * you want to launch your instances. For information about cluster
     * placement group, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
     * Cluster Instances</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param placementGroup Physical location of an existing cluster placement group into which
     *         you want to launch your instances. For information about cluster
     *         placement group, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html">Using
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
     * Clouds (Amazon VPCs). <p>If you specify subnets and Availability Zones
     * with this call, ensure that the subnets' Availability Zones match the
     * Availability Zones specified. <p>For information on launching your
     * Auto Scaling group into Amazon VPC subnets, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Launch
     * Auto Scaling Instances into Amazon VPC</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A comma-separated list of subnet identifiers of Amazon Virtual Private
     *         Clouds (Amazon VPCs). <p>If you specify subnets and Availability Zones
     *         with this call, ensure that the subnets' Availability Zones match the
     *         Availability Zones specified. <p>For information on launching your
     *         Auto Scaling group into Amazon VPC subnets, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Launch
     *         Auto Scaling Instances into Amazon VPC</a>.
     */
    public String getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }
    
    /**
     * A comma-separated list of subnet identifiers of Amazon Virtual Private
     * Clouds (Amazon VPCs). <p>If you specify subnets and Availability Zones
     * with this call, ensure that the subnets' Availability Zones match the
     * Availability Zones specified. <p>For information on launching your
     * Auto Scaling group into Amazon VPC subnets, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Launch
     * Auto Scaling Instances into Amazon VPC</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier A comma-separated list of subnet identifiers of Amazon Virtual Private
     *         Clouds (Amazon VPCs). <p>If you specify subnets and Availability Zones
     *         with this call, ensure that the subnets' Availability Zones match the
     *         Availability Zones specified. <p>For information on launching your
     *         Auto Scaling group into Amazon VPC subnets, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Launch
     *         Auto Scaling Instances into Amazon VPC</a>.
     */
    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }
    
    /**
     * A comma-separated list of subnet identifiers of Amazon Virtual Private
     * Clouds (Amazon VPCs). <p>If you specify subnets and Availability Zones
     * with this call, ensure that the subnets' Availability Zones match the
     * Availability Zones specified. <p>For information on launching your
     * Auto Scaling group into Amazon VPC subnets, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Launch
     * Auto Scaling Instances into Amazon VPC</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier A comma-separated list of subnet identifiers of Amazon Virtual Private
     *         Clouds (Amazon VPCs). <p>If you specify subnets and Availability Zones
     *         with this call, ensure that the subnets' Availability Zones match the
     *         Availability Zones specified. <p>For information on launching your
     *         Auto Scaling group into Amazon VPC subnets, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Launch
     *         Auto Scaling Instances into Amazon VPC</a>.
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
     * termination policy for your Auto Scaling group, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     *
     * @return A standalone termination policy or a list of termination policies used
     *         to select the instance to terminate. The policies are executed in the
     *         order that they are listed. <p> For more information on configuring a
     *         termination policy for your Auto Scaling group, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     *         Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     *         Scaling Developer Guide</i>.
     */
    public java.util.List<String> getTerminationPolicies() {
        if (terminationPolicies == null) {
              terminationPolicies = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              terminationPolicies.setAutoConstruct(true);
        }
        return terminationPolicies;
    }
    
    /**
     * A standalone termination policy or a list of termination policies used
     * to select the instance to terminate. The policies are executed in the
     * order that they are listed. <p> For more information on configuring a
     * termination policy for your Auto Scaling group, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     *
     * @param terminationPolicies A standalone termination policy or a list of termination policies used
     *         to select the instance to terminate. The policies are executed in the
     *         order that they are listed. <p> For more information on configuring a
     *         termination policy for your Auto Scaling group, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     *         Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     *         Scaling Developer Guide</i>.
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
     * A standalone termination policy or a list of termination policies used
     * to select the instance to terminate. The policies are executed in the
     * order that they are listed. <p> For more information on configuring a
     * termination policy for your Auto Scaling group, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies A standalone termination policy or a list of termination policies used
     *         to select the instance to terminate. The policies are executed in the
     *         order that they are listed. <p> For more information on configuring a
     *         termination policy for your Auto Scaling group, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
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
     * termination policy for your Auto Scaling group, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
     * Termination Policy for Your Auto Scaling Group</a> in the the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies A standalone termination policy or a list of termination policies used
     *         to select the instance to terminate. The policies are executed in the
     *         order that they are listed. <p> For more information on configuring a
     *         termination policy for your Auto Scaling group, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Instance
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
            com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(terminationPolicies.size());
            terminationPoliciesCopy.addAll(terminationPolicies);
            this.terminationPolicies = terminationPoliciesCopy;
        }

        return this;
    }

    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters. <p>For
     * information about using tags, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tag
     * Your Auto Scaling Groups and Amazon EC2 Instances</a>.
     *
     * @return The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters. <p>For
     *         information about using tags, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tag
     *         Your Auto Scaling Groups and Amazon EC2 Instances</a>.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters. <p>For
     * information about using tags, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tag
     * Your Auto Scaling Groups and Amazon EC2 Instances</a>.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters. <p>For
     *         information about using tags, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tag
     *         Your Auto Scaling Groups and Amazon EC2 Instances</a>.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters. <p>For
     * information about using tags, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tag
     * Your Auto Scaling Groups and Amazon EC2 Instances</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters. <p>For
     *         information about using tags, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tag
     *         Your Auto Scaling Groups and Amazon EC2 Instances</a>.
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
     * <i>false</i>. Value and propagate are optional parameters. <p>For
     * information about using tags, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tag
     * Your Auto Scaling Groups and Amazon EC2 Instances</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters. <p>For
     *         information about using tags, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tag
     *         Your Auto Scaling Groups and Amazon EC2 Instances</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateAutoScalingGroupRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLaunchConfigurationName() != null) sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() + ",");
        if (getMinSize() != null) sb.append("MinSize: " + getMinSize() + ",");
        if (getMaxSize() != null) sb.append("MaxSize: " + getMaxSize() + ",");
        if (getDesiredCapacity() != null) sb.append("DesiredCapacity: " + getDesiredCapacity() + ",");
        if (getDefaultCooldown() != null) sb.append("DefaultCooldown: " + getDefaultCooldown() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getLoadBalancerNames() != null) sb.append("LoadBalancerNames: " + getLoadBalancerNames() + ",");
        if (getHealthCheckType() != null) sb.append("HealthCheckType: " + getHealthCheckType() + ",");
        if (getHealthCheckGracePeriod() != null) sb.append("HealthCheckGracePeriod: " + getHealthCheckGracePeriod() + ",");
        if (getPlacementGroup() != null) sb.append("PlacementGroup: " + getPlacementGroup() + ",");
        if (getVPCZoneIdentifier() != null) sb.append("VPCZoneIdentifier: " + getVPCZoneIdentifier() + ",");
        if (getTerminationPolicies() != null) sb.append("TerminationPolicies: " + getTerminationPolicies() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
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
    
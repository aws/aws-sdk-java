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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#createAutoScalingGroup(CreateAutoScalingGroupRequest) CreateAutoScalingGroup operation}.
 * <p>
 * Creates an Auto Scaling group with the specified name and attributes.
 * </p>
 * <p>
 * If you exceed your maximum limit of Auto Scaling groups, which by
 * default is 20 per region, the call fails. For information about
 * viewing and updating these limits, see DescribeAccountLimits.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#createAutoScalingGroup(CreateAutoScalingGroupRequest)
 */
public class CreateAutoScalingGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the group. This name must be unique within the scope of
     * your AWS account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of the launch configuration. Alternatively, use the
     * <code>InstanceId</code> parameter to specify an EC2 instance instead
     * of a launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * The ID of the EC2 instance used to create a launch configuration for
     * the group. Alternatively, use the <code>LaunchConfigurationName</code>
     * parameter to specify a launch configuration instead of an EC2
     * instance. <p>When you specify an ID of an instance, Auto Scaling
     * creates a new launch configuration and associates it with the group.
     * This launch configuration derives its attributes from the specified
     * instance, with the exception of the block device mapping. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html">Create
     * an Auto Scaling Group Using an EC2 Instance ID</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String instanceId;

    /**
     * The minimum size of the group.
     */
    private Integer minSize;

    /**
     * The maximum size of the group.
     */
    private Integer maxSize;

    /**
     * The number of EC2 instances that should be running in the group. This
     * value must be greater than or equal to the minimum size of the group
     * and less than or equal to the maximum size of the group.
     */
    private Integer desiredCapacity;

    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before another scaling activity can start. <p>If
     * <code>DefaultCooldown</code> is not specified, the default value is
     * 300. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    private Integer defaultCooldown;

    /**
     * One or more Availability Zones for the group. This parameter is
     * optional if you specify subnets using the
     * <code>VPCZoneIdentifier</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * One or more load balancers. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Load
     * Balance Your Auto Scaling Group</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNames;

    /**
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>. <p>By default, health checks
     * use Amazon EC2 instance status checks to determine the health of an
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health
     * Checks</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String healthCheckType;

    /**
     * The amount of time, in seconds, after an EC2 instance comes into
     * service that Auto Scaling starts checking its health. During this
     * time, any health check failures for the instance are ignored. <p>This
     * parameter is required if you are adding an <code>ELB</code> health
     * check. Frequently, new instances need to warm up, briefly, before they
     * can pass a health check. To provide ample warm-up time, set the health
     * check grace period of the group to match the expected startup period
     * of your application. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-add-elb-healthcheck.html">Add
     * an Elastic Load Balancing Health Check to Your Auto Scaling Group</a>
     * in the <i>Auto Scaling Developer Guide</i>.
     */
    private Integer healthCheckGracePeriod;

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
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC). <p>If you specify subnets and Availability Zones with
     * this call, ensure that the subnets' Availability Zones match the
     * Availability Zones specified. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String vPCZoneIdentifier;

    /**
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are
     * listed. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Choosing
     * a Termination Policy for Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> terminationPolicies;

    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Add,
     * Modify, or Remove Auto Scaling Group Tags</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name of the group. This name must be unique within the scope of
     * your AWS account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the group. This name must be unique within the scope of
     *         your AWS account.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the group. This name must be unique within the scope of
     * your AWS account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group. This name must be unique within the scope of
     *         your AWS account.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the group. This name must be unique within the scope of
     * your AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group. This name must be unique within the scope of
     *         your AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The name of the launch configuration. Alternatively, use the
     * <code>InstanceId</code> parameter to specify an EC2 instance instead
     * of a launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the launch configuration. Alternatively, use the
     *         <code>InstanceId</code> parameter to specify an EC2 instance instead
     *         of a launch configuration.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration. Alternatively, use the
     * <code>InstanceId</code> parameter to specify an EC2 instance instead
     * of a launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration. Alternatively, use the
     *         <code>InstanceId</code> parameter to specify an EC2 instance instead
     *         of a launch configuration.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration. Alternatively, use the
     * <code>InstanceId</code> parameter to specify an EC2 instance instead
     * of a launch configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration. Alternatively, use the
     *         <code>InstanceId</code> parameter to specify an EC2 instance instead
     *         of a launch configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAutoScalingGroupRequest withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * The ID of the EC2 instance used to create a launch configuration for
     * the group. Alternatively, use the <code>LaunchConfigurationName</code>
     * parameter to specify a launch configuration instead of an EC2
     * instance. <p>When you specify an ID of an instance, Auto Scaling
     * creates a new launch configuration and associates it with the group.
     * This launch configuration derives its attributes from the specified
     * instance, with the exception of the block device mapping. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html">Create
     * an Auto Scaling Group Using an EC2 Instance ID</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the EC2 instance used to create a launch configuration for
     *         the group. Alternatively, use the <code>LaunchConfigurationName</code>
     *         parameter to specify a launch configuration instead of an EC2
     *         instance. <p>When you specify an ID of an instance, Auto Scaling
     *         creates a new launch configuration and associates it with the group.
     *         This launch configuration derives its attributes from the specified
     *         instance, with the exception of the block device mapping. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html">Create
     *         an Auto Scaling Group Using an EC2 Instance ID</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the EC2 instance used to create a launch configuration for
     * the group. Alternatively, use the <code>LaunchConfigurationName</code>
     * parameter to specify a launch configuration instead of an EC2
     * instance. <p>When you specify an ID of an instance, Auto Scaling
     * creates a new launch configuration and associates it with the group.
     * This launch configuration derives its attributes from the specified
     * instance, with the exception of the block device mapping. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html">Create
     * an Auto Scaling Group Using an EC2 Instance ID</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the EC2 instance used to create a launch configuration for
     *         the group. Alternatively, use the <code>LaunchConfigurationName</code>
     *         parameter to specify a launch configuration instead of an EC2
     *         instance. <p>When you specify an ID of an instance, Auto Scaling
     *         creates a new launch configuration and associates it with the group.
     *         This launch configuration derives its attributes from the specified
     *         instance, with the exception of the block device mapping. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html">Create
     *         an Auto Scaling Group Using an EC2 Instance ID</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the EC2 instance used to create a launch configuration for
     * the group. Alternatively, use the <code>LaunchConfigurationName</code>
     * parameter to specify a launch configuration instead of an EC2
     * instance. <p>When you specify an ID of an instance, Auto Scaling
     * creates a new launch configuration and associates it with the group.
     * This launch configuration derives its attributes from the specified
     * instance, with the exception of the block device mapping. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html">Create
     * an Auto Scaling Group Using an EC2 Instance ID</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the EC2 instance used to create a launch configuration for
     *         the group. Alternatively, use the <code>LaunchConfigurationName</code>
     *         parameter to specify a launch configuration instead of an EC2
     *         instance. <p>When you specify an ID of an instance, Auto Scaling
     *         creates a new launch configuration and associates it with the group.
     *         This launch configuration derives its attributes from the specified
     *         instance, with the exception of the block device mapping. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html">Create
     *         an Auto Scaling Group Using an EC2 Instance ID</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAutoScalingGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
    public CreateAutoScalingGroupRequest withMinSize(Integer minSize) {
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
    public CreateAutoScalingGroupRequest withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * The number of EC2 instances that should be running in the group. This
     * value must be greater than or equal to the minimum size of the group
     * and less than or equal to the maximum size of the group.
     *
     * @return The number of EC2 instances that should be running in the group. This
     *         value must be greater than or equal to the minimum size of the group
     *         and less than or equal to the maximum size of the group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The number of EC2 instances that should be running in the group. This
     * value must be greater than or equal to the minimum size of the group
     * and less than or equal to the maximum size of the group.
     *
     * @param desiredCapacity The number of EC2 instances that should be running in the group. This
     *         value must be greater than or equal to the minimum size of the group
     *         and less than or equal to the maximum size of the group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The number of EC2 instances that should be running in the group. This
     * value must be greater than or equal to the minimum size of the group
     * and less than or equal to the maximum size of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The number of EC2 instances that should be running in the group. This
     *         value must be greater than or equal to the minimum size of the group
     *         and less than or equal to the maximum size of the group.
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
     * before another scaling activity can start. <p>If
     * <code>DefaultCooldown</code> is not specified, the default value is
     * 300. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return The amount of time, in seconds, after a scaling activity completes
     *         before another scaling activity can start. <p>If
     *         <code>DefaultCooldown</code> is not specified, the default value is
     *         300. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public Integer getDefaultCooldown() {
        return defaultCooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before another scaling activity can start. <p>If
     * <code>DefaultCooldown</code> is not specified, the default value is
     * 300. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @param defaultCooldown The amount of time, in seconds, after a scaling activity completes
     *         before another scaling activity can start. <p>If
     *         <code>DefaultCooldown</code> is not specified, the default value is
     *         300. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before another scaling activity can start. <p>If
     * <code>DefaultCooldown</code> is not specified, the default value is
     * 300. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultCooldown The amount of time, in seconds, after a scaling activity completes
     *         before another scaling activity can start. <p>If
     *         <code>DefaultCooldown</code> is not specified, the default value is
     *         300. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAutoScalingGroupRequest withDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }

    /**
     * One or more Availability Zones for the group. This parameter is
     * optional if you specify subnets using the
     * <code>VPCZoneIdentifier</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return One or more Availability Zones for the group. This parameter is
     *         optional if you specify subnets using the
     *         <code>VPCZoneIdentifier</code> parameter.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * One or more Availability Zones for the group. This parameter is
     * optional if you specify subnets using the
     * <code>VPCZoneIdentifier</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones One or more Availability Zones for the group. This parameter is
     *         optional if you specify subnets using the
     *         <code>VPCZoneIdentifier</code> parameter.
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
     * One or more Availability Zones for the group. This parameter is
     * optional if you specify subnets using the
     * <code>VPCZoneIdentifier</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones One or more Availability Zones for the group. This parameter is
     *         optional if you specify subnets using the
     *         <code>VPCZoneIdentifier</code> parameter.
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
     * One or more Availability Zones for the group. This parameter is
     * optional if you specify subnets using the
     * <code>VPCZoneIdentifier</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param availabilityZones One or more Availability Zones for the group. This parameter is
     *         optional if you specify subnets using the
     *         <code>VPCZoneIdentifier</code> parameter.
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
     * One or more load balancers. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Load
     * Balance Your Auto Scaling Group</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     *
     * @return One or more load balancers. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Load
     *         Balance Your Auto Scaling Group</a> in the <i>Auto Scaling Developer
     *         Guide</i>.
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
              loadBalancerNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              loadBalancerNames.setAutoConstruct(true);
        }
        return loadBalancerNames;
    }
    
    /**
     * One or more load balancers. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Load
     * Balance Your Auto Scaling Group</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     *
     * @param loadBalancerNames One or more load balancers. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Load
     *         Balance Your Auto Scaling Group</a> in the <i>Auto Scaling Developer
     *         Guide</i>.
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
     * One or more load balancers. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Load
     * Balance Your Auto Scaling Group</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames One or more load balancers. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Load
     *         Balance Your Auto Scaling Group</a> in the <i>Auto Scaling Developer
     *         Guide</i>.
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
     * One or more load balancers. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Load
     * Balance Your Auto Scaling Group</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames One or more load balancers. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html">Load
     *         Balance Your Auto Scaling Group</a> in the <i>Auto Scaling Developer
     *         Guide</i>.
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
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>. <p>By default, health checks
     * use Amazon EC2 instance status checks to determine the health of an
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health
     * Checks</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The service to use for the health checks. The valid values are
     *         <code>EC2</code> and <code>ELB</code>. <p>By default, health checks
     *         use Amazon EC2 instance status checks to determine the health of an
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health
     *         Checks</a>.
     */
    public String getHealthCheckType() {
        return healthCheckType;
    }
    
    /**
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>. <p>By default, health checks
     * use Amazon EC2 instance status checks to determine the health of an
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health
     * Checks</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service to use for the health checks. The valid values are
     *         <code>EC2</code> and <code>ELB</code>. <p>By default, health checks
     *         use Amazon EC2 instance status checks to determine the health of an
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health
     *         Checks</a>.
     */
    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }
    
    /**
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>. <p>By default, health checks
     * use Amazon EC2 instance status checks to determine the health of an
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health
     * Checks</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param healthCheckType The service to use for the health checks. The valid values are
     *         <code>EC2</code> and <code>ELB</code>. <p>By default, health checks
     *         use Amazon EC2 instance status checks to determine the health of an
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health
     *         Checks</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAutoScalingGroupRequest withHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    /**
     * The amount of time, in seconds, after an EC2 instance comes into
     * service that Auto Scaling starts checking its health. During this
     * time, any health check failures for the instance are ignored. <p>This
     * parameter is required if you are adding an <code>ELB</code> health
     * check. Frequently, new instances need to warm up, briefly, before they
     * can pass a health check. To provide ample warm-up time, set the health
     * check grace period of the group to match the expected startup period
     * of your application. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-add-elb-healthcheck.html">Add
     * an Elastic Load Balancing Health Check to Your Auto Scaling Group</a>
     * in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return The amount of time, in seconds, after an EC2 instance comes into
     *         service that Auto Scaling starts checking its health. During this
     *         time, any health check failures for the instance are ignored. <p>This
     *         parameter is required if you are adding an <code>ELB</code> health
     *         check. Frequently, new instances need to warm up, briefly, before they
     *         can pass a health check. To provide ample warm-up time, set the health
     *         check grace period of the group to match the expected startup period
     *         of your application. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-add-elb-healthcheck.html">Add
     *         an Elastic Load Balancing Health Check to Your Auto Scaling Group</a>
     *         in the <i>Auto Scaling Developer Guide</i>.
     */
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }
    
    /**
     * The amount of time, in seconds, after an EC2 instance comes into
     * service that Auto Scaling starts checking its health. During this
     * time, any health check failures for the instance are ignored. <p>This
     * parameter is required if you are adding an <code>ELB</code> health
     * check. Frequently, new instances need to warm up, briefly, before they
     * can pass a health check. To provide ample warm-up time, set the health
     * check grace period of the group to match the expected startup period
     * of your application. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-add-elb-healthcheck.html">Add
     * an Elastic Load Balancing Health Check to Your Auto Scaling Group</a>
     * in the <i>Auto Scaling Developer Guide</i>.
     *
     * @param healthCheckGracePeriod The amount of time, in seconds, after an EC2 instance comes into
     *         service that Auto Scaling starts checking its health. During this
     *         time, any health check failures for the instance are ignored. <p>This
     *         parameter is required if you are adding an <code>ELB</code> health
     *         check. Frequently, new instances need to warm up, briefly, before they
     *         can pass a health check. To provide ample warm-up time, set the health
     *         check grace period of the group to match the expected startup period
     *         of your application. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-add-elb-healthcheck.html">Add
     *         an Elastic Load Balancing Health Check to Your Auto Scaling Group</a>
     *         in the <i>Auto Scaling Developer Guide</i>.
     */
    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }
    
    /**
     * The amount of time, in seconds, after an EC2 instance comes into
     * service that Auto Scaling starts checking its health. During this
     * time, any health check failures for the instance are ignored. <p>This
     * parameter is required if you are adding an <code>ELB</code> health
     * check. Frequently, new instances need to warm up, briefly, before they
     * can pass a health check. To provide ample warm-up time, set the health
     * check grace period of the group to match the expected startup period
     * of your application. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-add-elb-healthcheck.html">Add
     * an Elastic Load Balancing Health Check to Your Auto Scaling Group</a>
     * in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheckGracePeriod The amount of time, in seconds, after an EC2 instance comes into
     *         service that Auto Scaling starts checking its health. During this
     *         time, any health check failures for the instance are ignored. <p>This
     *         parameter is required if you are adding an <code>ELB</code> health
     *         check. Frequently, new instances need to warm up, briefly, before they
     *         can pass a health check. To provide ample warm-up time, set the health
     *         check grace period of the group to match the expected startup period
     *         of your application. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-add-elb-healthcheck.html">Add
     *         an Elastic Load Balancing Health Check to Your Auto Scaling Group</a>
     *         in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAutoScalingGroupRequest withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
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
    public CreateAutoScalingGroupRequest withPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }

    /**
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC). <p>If you specify subnets and Availability Zones with
     * this call, ensure that the subnets' Availability Zones match the
     * Availability Zones specified. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return A comma-separated list of subnet identifiers for your virtual private
     *         cloud (VPC). <p>If you specify subnets and Availability Zones with
     *         this call, ensure that the subnets' Availability Zones match the
     *         Availability Zones specified. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public String getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }
    
    /**
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC). <p>If you specify subnets and Availability Zones with
     * this call, ensure that the subnets' Availability Zones match the
     * Availability Zones specified. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier A comma-separated list of subnet identifiers for your virtual private
     *         cloud (VPC). <p>If you specify subnets and Availability Zones with
     *         this call, ensure that the subnets' Availability Zones match the
     *         Availability Zones specified. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }
    
    /**
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC). <p>If you specify subnets and Availability Zones with
     * this call, ensure that the subnets' Availability Zones match the
     * Availability Zones specified. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param vPCZoneIdentifier A comma-separated list of subnet identifiers for your virtual private
     *         cloud (VPC). <p>If you specify subnets and Availability Zones with
     *         this call, ensure that the subnets' Availability Zones match the
     *         Availability Zones specified. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAutoScalingGroupRequest withVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }

    /**
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are
     * listed. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Choosing
     * a Termination Policy for Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     *
     * @return One or more termination policies used to select the instance to
     *         terminate. These policies are executed in the order that they are
     *         listed. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Choosing
     *         a Termination Policy for Your Auto Scaling Group</a> in the <i>Auto
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
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are
     * listed. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Choosing
     * a Termination Policy for Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     *
     * @param terminationPolicies One or more termination policies used to select the instance to
     *         terminate. These policies are executed in the order that they are
     *         listed. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Choosing
     *         a Termination Policy for Your Auto Scaling Group</a> in the <i>Auto
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
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are
     * listed. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Choosing
     * a Termination Policy for Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies One or more termination policies used to select the instance to
     *         terminate. These policies are executed in the order that they are
     *         listed. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Choosing
     *         a Termination Policy for Your Auto Scaling Group</a> in the <i>Auto
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
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are
     * listed. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Choosing
     * a Termination Policy for Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationPolicies One or more termination policies used to select the instance to
     *         terminate. These policies are executed in the order that they are
     *         listed. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html">Choosing
     *         a Termination Policy for Your Auto Scaling Group</a> in the <i>Auto
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
     * <i>false</i>. Value and propagate are optional parameters. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Add,
     * Modify, or Remove Auto Scaling Group Tags</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     *
     * @return The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Add,
     *         Modify, or Remove Auto Scaling Group Tags</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
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
     * <i>false</i>. Value and propagate are optional parameters. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Add,
     * Modify, or Remove Auto Scaling Group Tags</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Add,
     *         Modify, or Remove Auto Scaling Group Tags</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
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
     * <i>false</i>. Value and propagate are optional parameters. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Add,
     * Modify, or Remove Auto Scaling Group Tags</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Add,
     *         Modify, or Remove Auto Scaling Group Tags</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
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
     * <i>false</i>. Value and propagate are optional parameters. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Add,
     * Modify, or Remove Auto Scaling Group Tags</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. Valid
     *         values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>. Value and propagate are optional parameters. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Add,
     *         Modify, or Remove Auto Scaling Group Tags</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
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
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
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
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
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
    
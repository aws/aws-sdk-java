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
 * The AutoScalingInstanceDetails data type.
 * </p>
 */
public class AutoScalingInstanceDetails {

    /**
     * The instance's Amazon EC2 instance ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceId;

    /**
     * The name of the Auto Scaling group associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The availability zone in which this instance resides.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String availabilityZone;

    /**
     * The life cycle state of this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String lifecycleState;

    /**
     * The health status of this instance. "Healthy" means that the instance
     * is healthy and should remain in service. "Unhealthy" means that the
     * instance is unhealthy. Auto Scaling should terminate and replace it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String healthStatus;

    /**
     * The launch configuration associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * The instance's Amazon EC2 instance ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The instance's Amazon EC2 instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance's Amazon EC2 instance ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The instance's Amazon EC2 instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance's Amazon EC2 instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The instance's Amazon EC2 instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingInstanceDetails withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The name of the Auto Scaling group associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group associated with this instance.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group associated with this instance.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group associated with this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group associated with this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingInstanceDetails withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The availability zone in which this instance resides.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The availability zone in which this instance resides.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The availability zone in which this instance resides.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param availabilityZone The availability zone in which this instance resides.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The availability zone in which this instance resides.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param availabilityZone The availability zone in which this instance resides.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingInstanceDetails withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The life cycle state of this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The life cycle state of this instance.
     */
    public String getLifecycleState() {
        return lifecycleState;
    }
    
    /**
     * The life cycle state of this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lifecycleState The life cycle state of this instance.
     */
    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }
    
    /**
     * The life cycle state of this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lifecycleState The life cycle state of this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingInstanceDetails withLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
    }
    
    
    /**
     * The health status of this instance. "Healthy" means that the instance
     * is healthy and should remain in service. "Unhealthy" means that the
     * instance is unhealthy. Auto Scaling should terminate and replace it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The health status of this instance. "Healthy" means that the instance
     *         is healthy and should remain in service. "Unhealthy" means that the
     *         instance is unhealthy. Auto Scaling should terminate and replace it.
     */
    public String getHealthStatus() {
        return healthStatus;
    }
    
    /**
     * The health status of this instance. "Healthy" means that the instance
     * is healthy and should remain in service. "Unhealthy" means that the
     * instance is unhealthy. Auto Scaling should terminate and replace it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The health status of this instance. "Healthy" means that the instance
     *         is healthy and should remain in service. "Unhealthy" means that the
     *         instance is unhealthy. Auto Scaling should terminate and replace it.
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    /**
     * The health status of this instance. "Healthy" means that the instance
     * is healthy and should remain in service. "Unhealthy" means that the
     * instance is unhealthy. Auto Scaling should terminate and replace it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The health status of this instance. "Healthy" means that the instance
     *         is healthy and should remain in service. "Unhealthy" means that the
     *         instance is unhealthy. Auto Scaling should terminate and replace it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingInstanceDetails withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    
    
    /**
     * The launch configuration associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The launch configuration associated with this instance.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The launch configuration associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The launch configuration associated with this instance.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The launch configuration associated with this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The launch configuration associated with this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AutoScalingInstanceDetails withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("LifecycleState: " + lifecycleState + ", ");
        sb.append("HealthStatus: " + healthStatus + ", ");
        sb.append("LaunchConfigurationName: " + launchConfigurationName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
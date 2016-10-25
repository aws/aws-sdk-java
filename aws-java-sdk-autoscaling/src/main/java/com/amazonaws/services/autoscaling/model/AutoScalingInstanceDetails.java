/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an EC2 instance associated with an Auto Scaling group.
 * </p>
 */
public class AutoScalingInstanceDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the Auto Scaling group associated with the instance.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The lifecycle state for the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     */
    private String lifecycleState;
    /**
     * <p>
     * The last reported health status of this instance. "Healthy" means that the instance is healthy and should remain
     * in service. "Unhealthy" means that the instance is unhealthy and Auto Scaling should terminate and replace it.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * The launch configuration associated with the instance.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * Indicates whether the instance is protected from termination by Auto Scaling when scaling in.
     * </p>
     */
    private Boolean protectedFromScaleIn;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingInstanceDetails withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group associated with the instance.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group associated with the instance.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group associated with the instance.
     * </p>
     * 
     * @return The name of the Auto Scaling group associated with the instance.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group associated with the instance.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingInstanceDetails withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the instance.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * 
     * @return The Availability Zone for the instance.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingInstanceDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The lifecycle state for the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param lifecycleState
     *        The lifecycle state for the instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroupLifecycle.html">Auto Scaling
     *        Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     */

    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    /**
     * <p>
     * The lifecycle state for the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The lifecycle state for the instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroupLifecycle.html">Auto
     *         Scaling Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     */

    public String getLifecycleState() {
        return this.lifecycleState;
    }

    /**
     * <p>
     * The lifecycle state for the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param lifecycleState
     *        The lifecycle state for the instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroupLifecycle.html">Auto Scaling
     *        Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingInstanceDetails withLifecycleState(String lifecycleState) {
        setLifecycleState(lifecycleState);
        return this;
    }

    /**
     * <p>
     * The last reported health status of this instance. "Healthy" means that the instance is healthy and should remain
     * in service. "Unhealthy" means that the instance is unhealthy and Auto Scaling should terminate and replace it.
     * </p>
     * 
     * @param healthStatus
     *        The last reported health status of this instance. "Healthy" means that the instance is healthy and should
     *        remain in service. "Unhealthy" means that the instance is unhealthy and Auto Scaling should terminate and
     *        replace it.
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The last reported health status of this instance. "Healthy" means that the instance is healthy and should remain
     * in service. "Unhealthy" means that the instance is unhealthy and Auto Scaling should terminate and replace it.
     * </p>
     * 
     * @return The last reported health status of this instance. "Healthy" means that the instance is healthy and should
     *         remain in service. "Unhealthy" means that the instance is unhealthy and Auto Scaling should terminate and
     *         replace it.
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The last reported health status of this instance. "Healthy" means that the instance is healthy and should remain
     * in service. "Unhealthy" means that the instance is unhealthy and Auto Scaling should terminate and replace it.
     * </p>
     * 
     * @param healthStatus
     *        The last reported health status of this instance. "Healthy" means that the instance is healthy and should
     *        remain in service. "Unhealthy" means that the instance is unhealthy and Auto Scaling should terminate and
     *        replace it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingInstanceDetails withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The launch configuration associated with the instance.
     * </p>
     * 
     * @param launchConfigurationName
     *        The launch configuration associated with the instance.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The launch configuration associated with the instance.
     * </p>
     * 
     * @return The launch configuration associated with the instance.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The launch configuration associated with the instance.
     * </p>
     * 
     * @param launchConfigurationName
     *        The launch configuration associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingInstanceDetails withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Auto Scaling when scaling in.
     * </p>
     * 
     * @param protectedFromScaleIn
     *        Indicates whether the instance is protected from termination by Auto Scaling when scaling in.
     */

    public void setProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        this.protectedFromScaleIn = protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether the instance is protected from termination by Auto Scaling when scaling in.
     */

    public Boolean getProtectedFromScaleIn() {
        return this.protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Auto Scaling when scaling in.
     * </p>
     * 
     * @param protectedFromScaleIn
     *        Indicates whether the instance is protected from termination by Auto Scaling when scaling in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingInstanceDetails withProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        setProtectedFromScaleIn(protectedFromScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether the instance is protected from termination by Auto Scaling when scaling in.
     */

    public Boolean isProtectedFromScaleIn() {
        return this.protectedFromScaleIn;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getLifecycleState() != null)
            sb.append("LifecycleState: " + getLifecycleState() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() + ",");
        if (getProtectedFromScaleIn() != null)
            sb.append("ProtectedFromScaleIn: " + getProtectedFromScaleIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingInstanceDetails == false)
            return false;
        AutoScalingInstanceDetails other = (AutoScalingInstanceDetails) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getLifecycleState() == null ^ this.getLifecycleState() == null)
            return false;
        if (other.getLifecycleState() != null && other.getLifecycleState().equals(this.getLifecycleState()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false)
            return false;
        if (other.getProtectedFromScaleIn() == null ^ this.getProtectedFromScaleIn() == null)
            return false;
        if (other.getProtectedFromScaleIn() != null && other.getProtectedFromScaleIn().equals(this.getProtectedFromScaleIn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getLifecycleState() == null) ? 0 : getLifecycleState().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getProtectedFromScaleIn() == null) ? 0 : getProtectedFromScaleIn().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingInstanceDetails clone() {
        try {
            return (AutoScalingInstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

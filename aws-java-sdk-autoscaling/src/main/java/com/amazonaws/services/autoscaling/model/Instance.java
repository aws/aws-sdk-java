/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * Describes an EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/Instance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Instance implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The Availability Zone in which the instance is running.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * </p>
     */
    private String lifecycleState;
    /**
     * <p>
     * The last reported health status of the instance. "Healthy" means that the instance is healthy and should remain
     * in service. "Unhealthy" means that the instance is unhealthy and that Amazon EC2 Auto Scaling should terminate
     * and replace it.
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
     * The launch template for the instance.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
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

    public Instance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the instance is running.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the instance is running.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the instance is running.
     * </p>
     * 
     * @return The Availability Zone in which the instance is running.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the instance is running.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the instance is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @param lifecycleState
     *        A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * @see LifecycleState
     */

    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    /**
     * <p>
     * A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @return A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * @see LifecycleState
     */

    public String getLifecycleState() {
        return this.lifecycleState;
    }

    /**
     * <p>
     * A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @param lifecycleState
     *        A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleState
     */

    public Instance withLifecycleState(String lifecycleState) {
        setLifecycleState(lifecycleState);
        return this;
    }

    /**
     * <p>
     * A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @param lifecycleState
     *        A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * @see LifecycleState
     */

    public void setLifecycleState(LifecycleState lifecycleState) {
        withLifecycleState(lifecycleState);
    }

    /**
     * <p>
     * A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * </p>
     * 
     * @param lifecycleState
     *        A description of the current lifecycle state. The <code>Quarantined</code> state is not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleState
     */

    public Instance withLifecycleState(LifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState.toString();
        return this;
    }

    /**
     * <p>
     * The last reported health status of the instance. "Healthy" means that the instance is healthy and should remain
     * in service. "Unhealthy" means that the instance is unhealthy and that Amazon EC2 Auto Scaling should terminate
     * and replace it.
     * </p>
     * 
     * @param healthStatus
     *        The last reported health status of the instance. "Healthy" means that the instance is healthy and should
     *        remain in service. "Unhealthy" means that the instance is unhealthy and that Amazon EC2 Auto Scaling
     *        should terminate and replace it.
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The last reported health status of the instance. "Healthy" means that the instance is healthy and should remain
     * in service. "Unhealthy" means that the instance is unhealthy and that Amazon EC2 Auto Scaling should terminate
     * and replace it.
     * </p>
     * 
     * @return The last reported health status of the instance. "Healthy" means that the instance is healthy and should
     *         remain in service. "Unhealthy" means that the instance is unhealthy and that Amazon EC2 Auto Scaling
     *         should terminate and replace it.
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The last reported health status of the instance. "Healthy" means that the instance is healthy and should remain
     * in service. "Unhealthy" means that the instance is unhealthy and that Amazon EC2 Auto Scaling should terminate
     * and replace it.
     * </p>
     * 
     * @param healthStatus
     *        The last reported health status of the instance. "Healthy" means that the instance is healthy and should
     *        remain in service. "Unhealthy" means that the instance is unhealthy and that Amazon EC2 Auto Scaling
     *        should terminate and replace it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withHealthStatus(String healthStatus) {
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

    public Instance withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The launch template for the instance.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template for the instance.
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template for the instance.
     * </p>
     * 
     * @return The launch template for the instance.
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template for the instance.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * </p>
     * 
     * @param protectedFromScaleIn
     *        Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     */

    public void setProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        this.protectedFromScaleIn = protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     */

    public Boolean getProtectedFromScaleIn() {
        return this.protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * </p>
     * 
     * @param protectedFromScaleIn
     *        Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        setProtectedFromScaleIn(protectedFromScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     */

    public Boolean isProtectedFromScaleIn() {
        return this.protectedFromScaleIn;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getLifecycleState() != null)
            sb.append("LifecycleState: ").append(getLifecycleState()).append(",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: ").append(getLaunchConfigurationName()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getProtectedFromScaleIn() != null)
            sb.append("ProtectedFromScaleIn: ").append(getProtectedFromScaleIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
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
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getLifecycleState() == null) ? 0 : getLifecycleState().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getProtectedFromScaleIn() == null) ? 0 : getProtectedFromScaleIn().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

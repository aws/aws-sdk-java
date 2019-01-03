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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetInstanceHealthRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The health status of the instance. Set to <code>Healthy</code> to have the instance remain in service. Set to
     * <code>Unhealthy</code> to have the instance be out of service. Amazon EC2 Auto Scaling terminates and replaces
     * the unhealthy instance.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a <code>HealthCheckGracePeriod</code> specified for the
     * group, by default, this call respects the grace period. Set this to <code>False</code>, to have the call not
     * respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see <a>CreateAutoScalingGroup</a>.
     * </p>
     */
    private Boolean shouldRespectGracePeriod;

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

    public SetInstanceHealthRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The health status of the instance. Set to <code>Healthy</code> to have the instance remain in service. Set to
     * <code>Unhealthy</code> to have the instance be out of service. Amazon EC2 Auto Scaling terminates and replaces
     * the unhealthy instance.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the instance. Set to <code>Healthy</code> to have the instance remain in service. Set
     *        to <code>Unhealthy</code> to have the instance be out of service. Amazon EC2 Auto Scaling terminates and
     *        replaces the unhealthy instance.
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status of the instance. Set to <code>Healthy</code> to have the instance remain in service. Set to
     * <code>Unhealthy</code> to have the instance be out of service. Amazon EC2 Auto Scaling terminates and replaces
     * the unhealthy instance.
     * </p>
     * 
     * @return The health status of the instance. Set to <code>Healthy</code> to have the instance remain in service.
     *         Set to <code>Unhealthy</code> to have the instance be out of service. Amazon EC2 Auto Scaling terminates
     *         and replaces the unhealthy instance.
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The health status of the instance. Set to <code>Healthy</code> to have the instance remain in service. Set to
     * <code>Unhealthy</code> to have the instance be out of service. Amazon EC2 Auto Scaling terminates and replaces
     * the unhealthy instance.
     * </p>
     * 
     * @param healthStatus
     *        The health status of the instance. Set to <code>Healthy</code> to have the instance remain in service. Set
     *        to <code>Unhealthy</code> to have the instance be out of service. Amazon EC2 Auto Scaling terminates and
     *        replaces the unhealthy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetInstanceHealthRequest withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a <code>HealthCheckGracePeriod</code> specified for the
     * group, by default, this call respects the grace period. Set this to <code>False</code>, to have the call not
     * respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see <a>CreateAutoScalingGroup</a>.
     * </p>
     * 
     * @param shouldRespectGracePeriod
     *        If the Auto Scaling group of the specified instance has a <code>HealthCheckGracePeriod</code> specified
     *        for the group, by default, this call respects the grace period. Set this to <code>False</code>, to have
     *        the call not respect the grace period associated with the group.</p>
     *        <p>
     *        For more information about the health check grace period, see <a>CreateAutoScalingGroup</a>.
     */

    public void setShouldRespectGracePeriod(Boolean shouldRespectGracePeriod) {
        this.shouldRespectGracePeriod = shouldRespectGracePeriod;
    }

    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a <code>HealthCheckGracePeriod</code> specified for the
     * group, by default, this call respects the grace period. Set this to <code>False</code>, to have the call not
     * respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see <a>CreateAutoScalingGroup</a>.
     * </p>
     * 
     * @return If the Auto Scaling group of the specified instance has a <code>HealthCheckGracePeriod</code> specified
     *         for the group, by default, this call respects the grace period. Set this to <code>False</code>, to have
     *         the call not respect the grace period associated with the group.</p>
     *         <p>
     *         For more information about the health check grace period, see <a>CreateAutoScalingGroup</a>.
     */

    public Boolean getShouldRespectGracePeriod() {
        return this.shouldRespectGracePeriod;
    }

    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a <code>HealthCheckGracePeriod</code> specified for the
     * group, by default, this call respects the grace period. Set this to <code>False</code>, to have the call not
     * respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see <a>CreateAutoScalingGroup</a>.
     * </p>
     * 
     * @param shouldRespectGracePeriod
     *        If the Auto Scaling group of the specified instance has a <code>HealthCheckGracePeriod</code> specified
     *        for the group, by default, this call respects the grace period. Set this to <code>False</code>, to have
     *        the call not respect the grace period associated with the group.</p>
     *        <p>
     *        For more information about the health check grace period, see <a>CreateAutoScalingGroup</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetInstanceHealthRequest withShouldRespectGracePeriod(Boolean shouldRespectGracePeriod) {
        setShouldRespectGracePeriod(shouldRespectGracePeriod);
        return this;
    }

    /**
     * <p>
     * If the Auto Scaling group of the specified instance has a <code>HealthCheckGracePeriod</code> specified for the
     * group, by default, this call respects the grace period. Set this to <code>False</code>, to have the call not
     * respect the grace period associated with the group.
     * </p>
     * <p>
     * For more information about the health check grace period, see <a>CreateAutoScalingGroup</a>.
     * </p>
     * 
     * @return If the Auto Scaling group of the specified instance has a <code>HealthCheckGracePeriod</code> specified
     *         for the group, by default, this call respects the grace period. Set this to <code>False</code>, to have
     *         the call not respect the grace period associated with the group.</p>
     *         <p>
     *         For more information about the health check grace period, see <a>CreateAutoScalingGroup</a>.
     */

    public Boolean isShouldRespectGracePeriod() {
        return this.shouldRespectGracePeriod;
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
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
        if (getShouldRespectGracePeriod() != null)
            sb.append("ShouldRespectGracePeriod: ").append(getShouldRespectGracePeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetInstanceHealthRequest == false)
            return false;
        SetInstanceHealthRequest other = (SetInstanceHealthRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getShouldRespectGracePeriod() == null ^ this.getShouldRespectGracePeriod() == null)
            return false;
        if (other.getShouldRespectGracePeriod() != null && other.getShouldRespectGracePeriod().equals(this.getShouldRespectGracePeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getShouldRespectGracePeriod() == null) ? 0 : getShouldRespectGracePeriod().hashCode());
        return hashCode;
    }

    @Override
    public SetInstanceHealthRequest clone() {
        return (SetInstanceHealthRequest) super.clone();
    }

}

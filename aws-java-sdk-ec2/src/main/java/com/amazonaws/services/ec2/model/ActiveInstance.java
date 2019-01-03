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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a running instance in a Spot Fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ActiveInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveInstance implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     */
    private String spotInstanceRequestId;
    /**
     * <p>
     * The health status of the instance. If the status of either the instance status check or the system status check
     * is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise, the health
     * status is <code>healthy</code>.
     * </p>
     */
    private String instanceHealth;

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

    public ActiveInstance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveInstance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     * 
     * @param spotInstanceRequestId
     *        The ID of the Spot Instance request.
     */

    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     * 
     * @return The ID of the Spot Instance request.
     */

    public String getSpotInstanceRequestId() {
        return this.spotInstanceRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     * 
     * @param spotInstanceRequestId
     *        The ID of the Spot Instance request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveInstance withSpotInstanceRequestId(String spotInstanceRequestId) {
        setSpotInstanceRequestId(spotInstanceRequestId);
        return this;
    }

    /**
     * <p>
     * The health status of the instance. If the status of either the instance status check or the system status check
     * is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise, the health
     * status is <code>healthy</code>.
     * </p>
     * 
     * @param instanceHealth
     *        The health status of the instance. If the status of either the instance status check or the system status
     *        check is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise,
     *        the health status is <code>healthy</code>.
     * @see InstanceHealthStatus
     */

    public void setInstanceHealth(String instanceHealth) {
        this.instanceHealth = instanceHealth;
    }

    /**
     * <p>
     * The health status of the instance. If the status of either the instance status check or the system status check
     * is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise, the health
     * status is <code>healthy</code>.
     * </p>
     * 
     * @return The health status of the instance. If the status of either the instance status check or the system status
     *         check is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise,
     *         the health status is <code>healthy</code>.
     * @see InstanceHealthStatus
     */

    public String getInstanceHealth() {
        return this.instanceHealth;
    }

    /**
     * <p>
     * The health status of the instance. If the status of either the instance status check or the system status check
     * is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise, the health
     * status is <code>healthy</code>.
     * </p>
     * 
     * @param instanceHealth
     *        The health status of the instance. If the status of either the instance status check or the system status
     *        check is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise,
     *        the health status is <code>healthy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthStatus
     */

    public ActiveInstance withInstanceHealth(String instanceHealth) {
        setInstanceHealth(instanceHealth);
        return this;
    }

    /**
     * <p>
     * The health status of the instance. If the status of either the instance status check or the system status check
     * is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise, the health
     * status is <code>healthy</code>.
     * </p>
     * 
     * @param instanceHealth
     *        The health status of the instance. If the status of either the instance status check or the system status
     *        check is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise,
     *        the health status is <code>healthy</code>.
     * @see InstanceHealthStatus
     */

    public void setInstanceHealth(InstanceHealthStatus instanceHealth) {
        withInstanceHealth(instanceHealth);
    }

    /**
     * <p>
     * The health status of the instance. If the status of either the instance status check or the system status check
     * is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise, the health
     * status is <code>healthy</code>.
     * </p>
     * 
     * @param instanceHealth
     *        The health status of the instance. If the status of either the instance status check or the system status
     *        check is <code>impaired</code>, the health status of the instance is <code>unhealthy</code>. Otherwise,
     *        the health status is <code>healthy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthStatus
     */

    public ActiveInstance withInstanceHealth(InstanceHealthStatus instanceHealth) {
        this.instanceHealth = instanceHealth.toString();
        return this;
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getSpotInstanceRequestId() != null)
            sb.append("SpotInstanceRequestId: ").append(getSpotInstanceRequestId()).append(",");
        if (getInstanceHealth() != null)
            sb.append("InstanceHealth: ").append(getInstanceHealth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveInstance == false)
            return false;
        ActiveInstance other = (ActiveInstance) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getSpotInstanceRequestId() == null ^ this.getSpotInstanceRequestId() == null)
            return false;
        if (other.getSpotInstanceRequestId() != null && other.getSpotInstanceRequestId().equals(this.getSpotInstanceRequestId()) == false)
            return false;
        if (other.getInstanceHealth() == null ^ this.getInstanceHealth() == null)
            return false;
        if (other.getInstanceHealth() != null && other.getInstanceHealth().equals(this.getInstanceHealth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSpotInstanceRequestId() == null) ? 0 : getSpotInstanceRequestId().hashCode());
        hashCode = prime * hashCode + ((getInstanceHealth() == null) ? 0 : getInstanceHealth().hashCode());
        return hashCode;
    }

    @Override
    public ActiveInstance clone() {
        try {
            return (ActiveInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

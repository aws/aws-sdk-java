/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes information about the health of the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstanceHealthSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceHealthSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Lightsail instance for which you are requesting health check data.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     */
    private String instanceHealth;
    /**
     * <p>
     * More information about the instance health. Valid values are below.
     * </p>
     */
    private String instanceHealthReason;

    /**
     * <p>
     * The name of the Lightsail instance for which you are requesting health check data.
     * </p>
     * 
     * @param instanceName
     *        The name of the Lightsail instance for which you are requesting health check data.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance for which you are requesting health check data.
     * </p>
     * 
     * @return The name of the Lightsail instance for which you are requesting health check data.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance for which you are requesting health check data.
     * </p>
     * 
     * @param instanceName
     *        The name of the Lightsail instance for which you are requesting health check data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthSummary withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * 
     * @param instanceHealth
     *        Describes the overall instance health. Valid values are below.
     * @see InstanceHealthState
     */

    public void setInstanceHealth(String instanceHealth) {
        this.instanceHealth = instanceHealth;
    }

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * 
     * @return Describes the overall instance health. Valid values are below.
     * @see InstanceHealthState
     */

    public String getInstanceHealth() {
        return this.instanceHealth;
    }

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * 
     * @param instanceHealth
     *        Describes the overall instance health. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthState
     */

    public InstanceHealthSummary withInstanceHealth(String instanceHealth) {
        setInstanceHealth(instanceHealth);
        return this;
    }

    /**
     * <p>
     * Describes the overall instance health. Valid values are below.
     * </p>
     * 
     * @param instanceHealth
     *        Describes the overall instance health. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthState
     */

    public InstanceHealthSummary withInstanceHealth(InstanceHealthState instanceHealth) {
        this.instanceHealth = instanceHealth.toString();
        return this;
    }

    /**
     * <p>
     * More information about the instance health. Valid values are below.
     * </p>
     * 
     * @param instanceHealthReason
     *        More information about the instance health. Valid values are below.
     * @see InstanceHealthReason
     */

    public void setInstanceHealthReason(String instanceHealthReason) {
        this.instanceHealthReason = instanceHealthReason;
    }

    /**
     * <p>
     * More information about the instance health. Valid values are below.
     * </p>
     * 
     * @return More information about the instance health. Valid values are below.
     * @see InstanceHealthReason
     */

    public String getInstanceHealthReason() {
        return this.instanceHealthReason;
    }

    /**
     * <p>
     * More information about the instance health. Valid values are below.
     * </p>
     * 
     * @param instanceHealthReason
     *        More information about the instance health. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthReason
     */

    public InstanceHealthSummary withInstanceHealthReason(String instanceHealthReason) {
        setInstanceHealthReason(instanceHealthReason);
        return this;
    }

    /**
     * <p>
     * More information about the instance health. Valid values are below.
     * </p>
     * 
     * @param instanceHealthReason
     *        More information about the instance health. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthReason
     */

    public InstanceHealthSummary withInstanceHealthReason(InstanceHealthReason instanceHealthReason) {
        this.instanceHealthReason = instanceHealthReason.toString();
        return this;
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getInstanceHealth() != null)
            sb.append("InstanceHealth: ").append(getInstanceHealth()).append(",");
        if (getInstanceHealthReason() != null)
            sb.append("InstanceHealthReason: ").append(getInstanceHealthReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceHealthSummary == false)
            return false;
        InstanceHealthSummary other = (InstanceHealthSummary) obj;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getInstanceHealth() == null ^ this.getInstanceHealth() == null)
            return false;
        if (other.getInstanceHealth() != null && other.getInstanceHealth().equals(this.getInstanceHealth()) == false)
            return false;
        if (other.getInstanceHealthReason() == null ^ this.getInstanceHealthReason() == null)
            return false;
        if (other.getInstanceHealthReason() != null && other.getInstanceHealthReason().equals(this.getInstanceHealthReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getInstanceHealth() == null) ? 0 : getInstanceHealth().hashCode());
        hashCode = prime * hashCode + ((getInstanceHealthReason() == null) ? 0 : getInstanceHealthReason().hashCode());
        return hashCode;
    }

    @Override
    public InstanceHealthSummary clone() {
        try {
            return (InstanceHealthSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstanceHealthSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

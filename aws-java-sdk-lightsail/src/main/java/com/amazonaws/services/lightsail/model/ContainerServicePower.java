/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the powers that can be specified for an Amazon Lightsail container service.
 * </p>
 * <p>
 * The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerServicePower" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerServicePower implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the power (e.g., <code>nano-1</code>).
     * </p>
     */
    private String powerId;
    /**
     * <p>
     * The monthly price of the power in USD.
     * </p>
     */
    private Float price;
    /**
     * <p>
     * The number of vCPUs included in the power.
     * </p>
     */
    private Float cpuCount;
    /**
     * <p>
     * The amount of RAM (in GB) of the power.
     * </p>
     */
    private Float ramSizeInGb;
    /**
     * <p>
     * The friendly name of the power (e.g., <code>nano</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * A Boolean value indicating whether the power is active and can be specified for container services.
     * </p>
     */
    private Boolean isActive;

    /**
     * <p>
     * The ID of the power (e.g., <code>nano-1</code>).
     * </p>
     * 
     * @param powerId
     *        The ID of the power (e.g., <code>nano-1</code>).
     */

    public void setPowerId(String powerId) {
        this.powerId = powerId;
    }

    /**
     * <p>
     * The ID of the power (e.g., <code>nano-1</code>).
     * </p>
     * 
     * @return The ID of the power (e.g., <code>nano-1</code>).
     */

    public String getPowerId() {
        return this.powerId;
    }

    /**
     * <p>
     * The ID of the power (e.g., <code>nano-1</code>).
     * </p>
     * 
     * @param powerId
     *        The ID of the power (e.g., <code>nano-1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServicePower withPowerId(String powerId) {
        setPowerId(powerId);
        return this;
    }

    /**
     * <p>
     * The monthly price of the power in USD.
     * </p>
     * 
     * @param price
     *        The monthly price of the power in USD.
     */

    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * <p>
     * The monthly price of the power in USD.
     * </p>
     * 
     * @return The monthly price of the power in USD.
     */

    public Float getPrice() {
        return this.price;
    }

    /**
     * <p>
     * The monthly price of the power in USD.
     * </p>
     * 
     * @param price
     *        The monthly price of the power in USD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServicePower withPrice(Float price) {
        setPrice(price);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs included in the power.
     * </p>
     * 
     * @param cpuCount
     *        The number of vCPUs included in the power.
     */

    public void setCpuCount(Float cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs included in the power.
     * </p>
     * 
     * @return The number of vCPUs included in the power.
     */

    public Float getCpuCount() {
        return this.cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs included in the power.
     * </p>
     * 
     * @param cpuCount
     *        The number of vCPUs included in the power.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServicePower withCpuCount(Float cpuCount) {
        setCpuCount(cpuCount);
        return this;
    }

    /**
     * <p>
     * The amount of RAM (in GB) of the power.
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM (in GB) of the power.
     */

    public void setRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM (in GB) of the power.
     * </p>
     * 
     * @return The amount of RAM (in GB) of the power.
     */

    public Float getRamSizeInGb() {
        return this.ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM (in GB) of the power.
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM (in GB) of the power.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServicePower withRamSizeInGb(Float ramSizeInGb) {
        setRamSizeInGb(ramSizeInGb);
        return this;
    }

    /**
     * <p>
     * The friendly name of the power (e.g., <code>nano</code>).
     * </p>
     * 
     * @param name
     *        The friendly name of the power (e.g., <code>nano</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the power (e.g., <code>nano</code>).
     * </p>
     * 
     * @return The friendly name of the power (e.g., <code>nano</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the power (e.g., <code>nano</code>).
     * </p>
     * 
     * @param name
     *        The friendly name of the power (e.g., <code>nano</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServicePower withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the power is active and can be specified for container services.
     * </p>
     * 
     * @param isActive
     *        A Boolean value indicating whether the power is active and can be specified for container services.
     */

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the power is active and can be specified for container services.
     * </p>
     * 
     * @return A Boolean value indicating whether the power is active and can be specified for container services.
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the power is active and can be specified for container services.
     * </p>
     * 
     * @param isActive
     *        A Boolean value indicating whether the power is active and can be specified for container services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServicePower withIsActive(Boolean isActive) {
        setIsActive(isActive);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the power is active and can be specified for container services.
     * </p>
     * 
     * @return A Boolean value indicating whether the power is active and can be specified for container services.
     */

    public Boolean isActive() {
        return this.isActive;
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
        if (getPowerId() != null)
            sb.append("PowerId: ").append(getPowerId()).append(",");
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice()).append(",");
        if (getCpuCount() != null)
            sb.append("CpuCount: ").append(getCpuCount()).append(",");
        if (getRamSizeInGb() != null)
            sb.append("RamSizeInGb: ").append(getRamSizeInGb()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIsActive() != null)
            sb.append("IsActive: ").append(getIsActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerServicePower == false)
            return false;
        ContainerServicePower other = (ContainerServicePower) obj;
        if (other.getPowerId() == null ^ this.getPowerId() == null)
            return false;
        if (other.getPowerId() != null && other.getPowerId().equals(this.getPowerId()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getCpuCount() == null ^ this.getCpuCount() == null)
            return false;
        if (other.getCpuCount() != null && other.getCpuCount().equals(this.getCpuCount()) == false)
            return false;
        if (other.getRamSizeInGb() == null ^ this.getRamSizeInGb() == null)
            return false;
        if (other.getRamSizeInGb() != null && other.getRamSizeInGb().equals(this.getRamSizeInGb()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIsActive() == null ^ this.getIsActive() == null)
            return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPowerId() == null) ? 0 : getPowerId().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getCpuCount() == null) ? 0 : getCpuCount().hashCode());
        hashCode = prime * hashCode + ((getRamSizeInGb() == null) ? 0 : getRamSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        return hashCode;
    }

    @Override
    public ContainerServicePower clone() {
        try {
            return (ContainerServicePower) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerServicePowerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

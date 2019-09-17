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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the hardware for the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstanceHardware" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceHardware implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of vCPUs the instance has.
     * </p>
     */
    private Integer cpuCount;
    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     */
    private java.util.List<Disk> disks;
    /**
     * <p>
     * The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     * </p>
     */
    private Float ramSizeInGb;

    /**
     * <p>
     * The number of vCPUs the instance has.
     * </p>
     * 
     * @param cpuCount
     *        The number of vCPUs the instance has.
     */

    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs the instance has.
     * </p>
     * 
     * @return The number of vCPUs the instance has.
     */

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs the instance has.
     * </p>
     * 
     * @param cpuCount
     *        The number of vCPUs the instance has.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHardware withCpuCount(Integer cpuCount) {
        setCpuCount(cpuCount);
        return this;
    }

    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     * 
     * @return The disks attached to the instance.
     */

    public java.util.List<Disk> getDisks() {
        return disks;
    }

    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     * 
     * @param disks
     *        The disks attached to the instance.
     */

    public void setDisks(java.util.Collection<Disk> disks) {
        if (disks == null) {
            this.disks = null;
            return;
        }

        this.disks = new java.util.ArrayList<Disk>(disks);
    }

    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisks(java.util.Collection)} or {@link #withDisks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param disks
     *        The disks attached to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHardware withDisks(Disk... disks) {
        if (this.disks == null) {
            setDisks(new java.util.ArrayList<Disk>(disks.length));
        }
        for (Disk ele : disks) {
            this.disks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     * 
     * @param disks
     *        The disks attached to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHardware withDisks(java.util.Collection<Disk> disks) {
        setDisks(disks);
        return this;
    }

    /**
     * <p>
     * The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     */

    public void setRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     * </p>
     * 
     * @return The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     */

    public Float getRamSizeInGb() {
        return this.ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHardware withRamSizeInGb(Float ramSizeInGb) {
        setRamSizeInGb(ramSizeInGb);
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
        if (getCpuCount() != null)
            sb.append("CpuCount: ").append(getCpuCount()).append(",");
        if (getDisks() != null)
            sb.append("Disks: ").append(getDisks()).append(",");
        if (getRamSizeInGb() != null)
            sb.append("RamSizeInGb: ").append(getRamSizeInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceHardware == false)
            return false;
        InstanceHardware other = (InstanceHardware) obj;
        if (other.getCpuCount() == null ^ this.getCpuCount() == null)
            return false;
        if (other.getCpuCount() != null && other.getCpuCount().equals(this.getCpuCount()) == false)
            return false;
        if (other.getDisks() == null ^ this.getDisks() == null)
            return false;
        if (other.getDisks() != null && other.getDisks().equals(this.getDisks()) == false)
            return false;
        if (other.getRamSizeInGb() == null ^ this.getRamSizeInGb() == null)
            return false;
        if (other.getRamSizeInGb() != null && other.getRamSizeInGb().equals(this.getRamSizeInGb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuCount() == null) ? 0 : getCpuCount().hashCode());
        hashCode = prime * hashCode + ((getDisks() == null) ? 0 : getDisks().hashCode());
        hashCode = prime * hashCode + ((getRamSizeInGb() == null) ? 0 : getRamSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public InstanceHardware clone() {
        try {
            return (InstanceHardware) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstanceHardwareMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

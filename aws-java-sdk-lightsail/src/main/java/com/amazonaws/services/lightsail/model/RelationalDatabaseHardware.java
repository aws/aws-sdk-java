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
 * Describes the hardware of a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RelationalDatabaseHardware"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseHardware implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of vCPUs for the database.
     * </p>
     */
    private Integer cpuCount;
    /**
     * <p>
     * The size of the disk for the database.
     * </p>
     */
    private Integer diskSizeInGb;
    /**
     * <p>
     * The amount of RAM in GB for the database.
     * </p>
     */
    private Float ramSizeInGb;

    /**
     * <p>
     * The number of vCPUs for the database.
     * </p>
     * 
     * @param cpuCount
     *        The number of vCPUs for the database.
     */

    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs for the database.
     * </p>
     * 
     * @return The number of vCPUs for the database.
     */

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs for the database.
     * </p>
     * 
     * @param cpuCount
     *        The number of vCPUs for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseHardware withCpuCount(Integer cpuCount) {
        setCpuCount(cpuCount);
        return this;
    }

    /**
     * <p>
     * The size of the disk for the database.
     * </p>
     * 
     * @param diskSizeInGb
     *        The size of the disk for the database.
     */

    public void setDiskSizeInGb(Integer diskSizeInGb) {
        this.diskSizeInGb = diskSizeInGb;
    }

    /**
     * <p>
     * The size of the disk for the database.
     * </p>
     * 
     * @return The size of the disk for the database.
     */

    public Integer getDiskSizeInGb() {
        return this.diskSizeInGb;
    }

    /**
     * <p>
     * The size of the disk for the database.
     * </p>
     * 
     * @param diskSizeInGb
     *        The size of the disk for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseHardware withDiskSizeInGb(Integer diskSizeInGb) {
        setDiskSizeInGb(diskSizeInGb);
        return this;
    }

    /**
     * <p>
     * The amount of RAM in GB for the database.
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM in GB for the database.
     */

    public void setRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB for the database.
     * </p>
     * 
     * @return The amount of RAM in GB for the database.
     */

    public Float getRamSizeInGb() {
        return this.ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB for the database.
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM in GB for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseHardware withRamSizeInGb(Float ramSizeInGb) {
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
        if (getDiskSizeInGb() != null)
            sb.append("DiskSizeInGb: ").append(getDiskSizeInGb()).append(",");
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

        if (obj instanceof RelationalDatabaseHardware == false)
            return false;
        RelationalDatabaseHardware other = (RelationalDatabaseHardware) obj;
        if (other.getCpuCount() == null ^ this.getCpuCount() == null)
            return false;
        if (other.getCpuCount() != null && other.getCpuCount().equals(this.getCpuCount()) == false)
            return false;
        if (other.getDiskSizeInGb() == null ^ this.getDiskSizeInGb() == null)
            return false;
        if (other.getDiskSizeInGb() != null && other.getDiskSizeInGb().equals(this.getDiskSizeInGb()) == false)
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
        hashCode = prime * hashCode + ((getDiskSizeInGb() == null) ? 0 : getDiskSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getRamSizeInGb() == null) ? 0 : getRamSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public RelationalDatabaseHardware clone() {
        try {
            return (RelationalDatabaseHardware) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RelationalDatabaseHardwareMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

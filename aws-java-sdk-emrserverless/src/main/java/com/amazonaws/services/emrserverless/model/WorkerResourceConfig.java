/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The cumulative configuration requirements for every worker instance of the worker type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/WorkerResourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerResourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CPU requirements for every worker instance of the worker type.
     * </p>
     */
    private String cpu;
    /**
     * <p>
     * The memory requirements for every worker instance of the worker type.
     * </p>
     */
    private String memory;
    /**
     * <p>
     * The disk requirements for every worker instance of the worker type.
     * </p>
     */
    private String disk;
    /**
     * <p>
     * The disk type for every worker instance of the work type. Shuffle optimized disks have higher performance
     * characteristics and are better for shuffle heavy workloads. Default is <code>STANDARD</code>.
     * </p>
     */
    private String diskType;

    /**
     * <p>
     * The CPU requirements for every worker instance of the worker type.
     * </p>
     * 
     * @param cpu
     *        The CPU requirements for every worker instance of the worker type.
     */

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The CPU requirements for every worker instance of the worker type.
     * </p>
     * 
     * @return The CPU requirements for every worker instance of the worker type.
     */

    public String getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The CPU requirements for every worker instance of the worker type.
     * </p>
     * 
     * @param cpu
     *        The CPU requirements for every worker instance of the worker type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerResourceConfig withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The memory requirements for every worker instance of the worker type.
     * </p>
     * 
     * @param memory
     *        The memory requirements for every worker instance of the worker type.
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The memory requirements for every worker instance of the worker type.
     * </p>
     * 
     * @return The memory requirements for every worker instance of the worker type.
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The memory requirements for every worker instance of the worker type.
     * </p>
     * 
     * @param memory
     *        The memory requirements for every worker instance of the worker type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerResourceConfig withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The disk requirements for every worker instance of the worker type.
     * </p>
     * 
     * @param disk
     *        The disk requirements for every worker instance of the worker type.
     */

    public void setDisk(String disk) {
        this.disk = disk;
    }

    /**
     * <p>
     * The disk requirements for every worker instance of the worker type.
     * </p>
     * 
     * @return The disk requirements for every worker instance of the worker type.
     */

    public String getDisk() {
        return this.disk;
    }

    /**
     * <p>
     * The disk requirements for every worker instance of the worker type.
     * </p>
     * 
     * @param disk
     *        The disk requirements for every worker instance of the worker type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerResourceConfig withDisk(String disk) {
        setDisk(disk);
        return this;
    }

    /**
     * <p>
     * The disk type for every worker instance of the work type. Shuffle optimized disks have higher performance
     * characteristics and are better for shuffle heavy workloads. Default is <code>STANDARD</code>.
     * </p>
     * 
     * @param diskType
     *        The disk type for every worker instance of the work type. Shuffle optimized disks have higher performance
     *        characteristics and are better for shuffle heavy workloads. Default is <code>STANDARD</code>.
     */

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    /**
     * <p>
     * The disk type for every worker instance of the work type. Shuffle optimized disks have higher performance
     * characteristics and are better for shuffle heavy workloads. Default is <code>STANDARD</code>.
     * </p>
     * 
     * @return The disk type for every worker instance of the work type. Shuffle optimized disks have higher performance
     *         characteristics and are better for shuffle heavy workloads. Default is <code>STANDARD</code>.
     */

    public String getDiskType() {
        return this.diskType;
    }

    /**
     * <p>
     * The disk type for every worker instance of the work type. Shuffle optimized disks have higher performance
     * characteristics and are better for shuffle heavy workloads. Default is <code>STANDARD</code>.
     * </p>
     * 
     * @param diskType
     *        The disk type for every worker instance of the work type. Shuffle optimized disks have higher performance
     *        characteristics and are better for shuffle heavy workloads. Default is <code>STANDARD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerResourceConfig withDiskType(String diskType) {
        setDiskType(diskType);
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
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getDisk() != null)
            sb.append("Disk: ").append(getDisk()).append(",");
        if (getDiskType() != null)
            sb.append("DiskType: ").append(getDiskType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkerResourceConfig == false)
            return false;
        WorkerResourceConfig other = (WorkerResourceConfig) obj;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getDisk() == null ^ this.getDisk() == null)
            return false;
        if (other.getDisk() != null && other.getDisk().equals(this.getDisk()) == false)
            return false;
        if (other.getDiskType() == null ^ this.getDiskType() == null)
            return false;
        if (other.getDiskType() != null && other.getDiskType().equals(this.getDiskType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getDisk() == null) ? 0 : getDisk().hashCode());
        hashCode = prime * hashCode + ((getDiskType() == null) ? 0 : getDiskType().hashCode());
        return hashCode;
    }

    @Override
    public WorkerResourceConfig clone() {
        try {
            return (WorkerResourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.WorkerResourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

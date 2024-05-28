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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the GPU accelerators for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/Gpu" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Gpu implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of GPUs for the instance type.
     * </p>
     */
    private Integer gpuCount;
    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance type, in MiB.
     * </p>
     */
    private Integer gpuMemorySizeInMiB;

    /**
     * <p>
     * The number of GPUs for the instance type.
     * </p>
     * 
     * @param gpuCount
     *        The number of GPUs for the instance type.
     */

    public void setGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
    }

    /**
     * <p>
     * The number of GPUs for the instance type.
     * </p>
     * 
     * @return The number of GPUs for the instance type.
     */

    public Integer getGpuCount() {
        return this.gpuCount;
    }

    /**
     * <p>
     * The number of GPUs for the instance type.
     * </p>
     * 
     * @param gpuCount
     *        The number of GPUs for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gpu withGpuCount(Integer gpuCount) {
        setGpuCount(gpuCount);
        return this;
    }

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance type, in MiB.
     * </p>
     * 
     * @param gpuMemorySizeInMiB
     *        The total size of the memory for the GPU accelerators for the instance type, in MiB.
     */

    public void setGpuMemorySizeInMiB(Integer gpuMemorySizeInMiB) {
        this.gpuMemorySizeInMiB = gpuMemorySizeInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance type, in MiB.
     * </p>
     * 
     * @return The total size of the memory for the GPU accelerators for the instance type, in MiB.
     */

    public Integer getGpuMemorySizeInMiB() {
        return this.gpuMemorySizeInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance type, in MiB.
     * </p>
     * 
     * @param gpuMemorySizeInMiB
     *        The total size of the memory for the GPU accelerators for the instance type, in MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gpu withGpuMemorySizeInMiB(Integer gpuMemorySizeInMiB) {
        setGpuMemorySizeInMiB(gpuMemorySizeInMiB);
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
        if (getGpuCount() != null)
            sb.append("GpuCount: ").append(getGpuCount()).append(",");
        if (getGpuMemorySizeInMiB() != null)
            sb.append("GpuMemorySizeInMiB: ").append(getGpuMemorySizeInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Gpu == false)
            return false;
        Gpu other = (Gpu) obj;
        if (other.getGpuCount() == null ^ this.getGpuCount() == null)
            return false;
        if (other.getGpuCount() != null && other.getGpuCount().equals(this.getGpuCount()) == false)
            return false;
        if (other.getGpuMemorySizeInMiB() == null ^ this.getGpuMemorySizeInMiB() == null)
            return false;
        if (other.getGpuMemorySizeInMiB() != null && other.getGpuMemorySizeInMiB().equals(this.getGpuMemorySizeInMiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGpuCount() == null) ? 0 : getGpuCount().hashCode());
        hashCode = prime * hashCode + ((getGpuMemorySizeInMiB() == null) ? 0 : getGpuMemorySizeInMiB().hashCode());
        return hashCode;
    }

    @Override
    public Gpu clone() {
        try {
            return (Gpu) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.GpuMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

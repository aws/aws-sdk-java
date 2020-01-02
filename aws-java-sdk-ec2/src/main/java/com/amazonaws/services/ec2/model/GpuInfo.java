/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the GPU accelerators for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GpuInfo" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GpuInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GpuDeviceInfo> gpus;
    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance type.
     * </p>
     */
    private Integer totalGpuMemoryInMiB;

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     * 
     * @return Describes the GPU accelerators for the instance type.
     */

    public java.util.List<GpuDeviceInfo> getGpus() {
        if (gpus == null) {
            gpus = new com.amazonaws.internal.SdkInternalList<GpuDeviceInfo>();
        }
        return gpus;
    }

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     * 
     * @param gpus
     *        Describes the GPU accelerators for the instance type.
     */

    public void setGpus(java.util.Collection<GpuDeviceInfo> gpus) {
        if (gpus == null) {
            this.gpus = null;
            return;
        }

        this.gpus = new com.amazonaws.internal.SdkInternalList<GpuDeviceInfo>(gpus);
    }

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGpus(java.util.Collection)} or {@link #withGpus(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param gpus
     *        Describes the GPU accelerators for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GpuInfo withGpus(GpuDeviceInfo... gpus) {
        if (this.gpus == null) {
            setGpus(new com.amazonaws.internal.SdkInternalList<GpuDeviceInfo>(gpus.length));
        }
        for (GpuDeviceInfo ele : gpus) {
            this.gpus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     * 
     * @param gpus
     *        Describes the GPU accelerators for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GpuInfo withGpus(java.util.Collection<GpuDeviceInfo> gpus) {
        setGpus(gpus);
        return this;
    }

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance type.
     * </p>
     * 
     * @param totalGpuMemoryInMiB
     *        The total size of the memory for the GPU accelerators for the instance type.
     */

    public void setTotalGpuMemoryInMiB(Integer totalGpuMemoryInMiB) {
        this.totalGpuMemoryInMiB = totalGpuMemoryInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance type.
     * </p>
     * 
     * @return The total size of the memory for the GPU accelerators for the instance type.
     */

    public Integer getTotalGpuMemoryInMiB() {
        return this.totalGpuMemoryInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance type.
     * </p>
     * 
     * @param totalGpuMemoryInMiB
     *        The total size of the memory for the GPU accelerators for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GpuInfo withTotalGpuMemoryInMiB(Integer totalGpuMemoryInMiB) {
        setTotalGpuMemoryInMiB(totalGpuMemoryInMiB);
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
        if (getGpus() != null)
            sb.append("Gpus: ").append(getGpus()).append(",");
        if (getTotalGpuMemoryInMiB() != null)
            sb.append("TotalGpuMemoryInMiB: ").append(getTotalGpuMemoryInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GpuInfo == false)
            return false;
        GpuInfo other = (GpuInfo) obj;
        if (other.getGpus() == null ^ this.getGpus() == null)
            return false;
        if (other.getGpus() != null && other.getGpus().equals(this.getGpus()) == false)
            return false;
        if (other.getTotalGpuMemoryInMiB() == null ^ this.getTotalGpuMemoryInMiB() == null)
            return false;
        if (other.getTotalGpuMemoryInMiB() != null && other.getTotalGpuMemoryInMiB().equals(this.getTotalGpuMemoryInMiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGpus() == null) ? 0 : getGpus().hashCode());
        hashCode = prime * hashCode + ((getTotalGpuMemoryInMiB() == null) ? 0 : getTotalGpuMemoryInMiB().hashCode());
        return hashCode;
    }

    @Override
    public GpuInfo clone() {
        try {
            return (GpuInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

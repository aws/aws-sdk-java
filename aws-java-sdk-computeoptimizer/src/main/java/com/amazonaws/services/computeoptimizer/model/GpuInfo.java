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
 * Describes the GPU accelerator settings for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GpuInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GpuInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     */
    private java.util.List<Gpu> gpus;

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     * 
     * @return Describes the GPU accelerators for the instance type.
     */

    public java.util.List<Gpu> getGpus() {
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

    public void setGpus(java.util.Collection<Gpu> gpus) {
        if (gpus == null) {
            this.gpus = null;
            return;
        }

        this.gpus = new java.util.ArrayList<Gpu>(gpus);
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

    public GpuInfo withGpus(Gpu... gpus) {
        if (this.gpus == null) {
            setGpus(new java.util.ArrayList<Gpu>(gpus.length));
        }
        for (Gpu ele : gpus) {
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

    public GpuInfo withGpus(java.util.Collection<Gpu> gpus) {
        setGpus(gpus);
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
            sb.append("Gpus: ").append(getGpus());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGpus() == null) ? 0 : getGpus().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.GpuInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

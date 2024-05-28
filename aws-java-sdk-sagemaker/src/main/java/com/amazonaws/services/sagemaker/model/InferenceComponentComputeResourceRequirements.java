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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the compute resources to allocate to run a model that you assign to an inference component. These resources
 * include CPU cores, accelerators, and memory.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceComponentComputeResourceRequirements"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceComponentComputeResourceRequirements implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of CPU cores to allocate to run a model that you assign to an inference component.
     * </p>
     */
    private Float numberOfCpuCoresRequired;
    /**
     * <p>
     * The number of accelerators to allocate to run a model that you assign to an inference component. Accelerators
     * include GPUs and Amazon Web Services Inferentia.
     * </p>
     */
    private Float numberOfAcceleratorDevicesRequired;
    /**
     * <p>
     * The minimum MB of memory to allocate to run a model that you assign to an inference component.
     * </p>
     */
    private Integer minMemoryRequiredInMb;
    /**
     * <p>
     * The maximum MB of memory to allocate to run a model that you assign to an inference component.
     * </p>
     */
    private Integer maxMemoryRequiredInMb;

    /**
     * <p>
     * The number of CPU cores to allocate to run a model that you assign to an inference component.
     * </p>
     * 
     * @param numberOfCpuCoresRequired
     *        The number of CPU cores to allocate to run a model that you assign to an inference component.
     */

    public void setNumberOfCpuCoresRequired(Float numberOfCpuCoresRequired) {
        this.numberOfCpuCoresRequired = numberOfCpuCoresRequired;
    }

    /**
     * <p>
     * The number of CPU cores to allocate to run a model that you assign to an inference component.
     * </p>
     * 
     * @return The number of CPU cores to allocate to run a model that you assign to an inference component.
     */

    public Float getNumberOfCpuCoresRequired() {
        return this.numberOfCpuCoresRequired;
    }

    /**
     * <p>
     * The number of CPU cores to allocate to run a model that you assign to an inference component.
     * </p>
     * 
     * @param numberOfCpuCoresRequired
     *        The number of CPU cores to allocate to run a model that you assign to an inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentComputeResourceRequirements withNumberOfCpuCoresRequired(Float numberOfCpuCoresRequired) {
        setNumberOfCpuCoresRequired(numberOfCpuCoresRequired);
        return this;
    }

    /**
     * <p>
     * The number of accelerators to allocate to run a model that you assign to an inference component. Accelerators
     * include GPUs and Amazon Web Services Inferentia.
     * </p>
     * 
     * @param numberOfAcceleratorDevicesRequired
     *        The number of accelerators to allocate to run a model that you assign to an inference component.
     *        Accelerators include GPUs and Amazon Web Services Inferentia.
     */

    public void setNumberOfAcceleratorDevicesRequired(Float numberOfAcceleratorDevicesRequired) {
        this.numberOfAcceleratorDevicesRequired = numberOfAcceleratorDevicesRequired;
    }

    /**
     * <p>
     * The number of accelerators to allocate to run a model that you assign to an inference component. Accelerators
     * include GPUs and Amazon Web Services Inferentia.
     * </p>
     * 
     * @return The number of accelerators to allocate to run a model that you assign to an inference component.
     *         Accelerators include GPUs and Amazon Web Services Inferentia.
     */

    public Float getNumberOfAcceleratorDevicesRequired() {
        return this.numberOfAcceleratorDevicesRequired;
    }

    /**
     * <p>
     * The number of accelerators to allocate to run a model that you assign to an inference component. Accelerators
     * include GPUs and Amazon Web Services Inferentia.
     * </p>
     * 
     * @param numberOfAcceleratorDevicesRequired
     *        The number of accelerators to allocate to run a model that you assign to an inference component.
     *        Accelerators include GPUs and Amazon Web Services Inferentia.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentComputeResourceRequirements withNumberOfAcceleratorDevicesRequired(Float numberOfAcceleratorDevicesRequired) {
        setNumberOfAcceleratorDevicesRequired(numberOfAcceleratorDevicesRequired);
        return this;
    }

    /**
     * <p>
     * The minimum MB of memory to allocate to run a model that you assign to an inference component.
     * </p>
     * 
     * @param minMemoryRequiredInMb
     *        The minimum MB of memory to allocate to run a model that you assign to an inference component.
     */

    public void setMinMemoryRequiredInMb(Integer minMemoryRequiredInMb) {
        this.minMemoryRequiredInMb = minMemoryRequiredInMb;
    }

    /**
     * <p>
     * The minimum MB of memory to allocate to run a model that you assign to an inference component.
     * </p>
     * 
     * @return The minimum MB of memory to allocate to run a model that you assign to an inference component.
     */

    public Integer getMinMemoryRequiredInMb() {
        return this.minMemoryRequiredInMb;
    }

    /**
     * <p>
     * The minimum MB of memory to allocate to run a model that you assign to an inference component.
     * </p>
     * 
     * @param minMemoryRequiredInMb
     *        The minimum MB of memory to allocate to run a model that you assign to an inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentComputeResourceRequirements withMinMemoryRequiredInMb(Integer minMemoryRequiredInMb) {
        setMinMemoryRequiredInMb(minMemoryRequiredInMb);
        return this;
    }

    /**
     * <p>
     * The maximum MB of memory to allocate to run a model that you assign to an inference component.
     * </p>
     * 
     * @param maxMemoryRequiredInMb
     *        The maximum MB of memory to allocate to run a model that you assign to an inference component.
     */

    public void setMaxMemoryRequiredInMb(Integer maxMemoryRequiredInMb) {
        this.maxMemoryRequiredInMb = maxMemoryRequiredInMb;
    }

    /**
     * <p>
     * The maximum MB of memory to allocate to run a model that you assign to an inference component.
     * </p>
     * 
     * @return The maximum MB of memory to allocate to run a model that you assign to an inference component.
     */

    public Integer getMaxMemoryRequiredInMb() {
        return this.maxMemoryRequiredInMb;
    }

    /**
     * <p>
     * The maximum MB of memory to allocate to run a model that you assign to an inference component.
     * </p>
     * 
     * @param maxMemoryRequiredInMb
     *        The maximum MB of memory to allocate to run a model that you assign to an inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentComputeResourceRequirements withMaxMemoryRequiredInMb(Integer maxMemoryRequiredInMb) {
        setMaxMemoryRequiredInMb(maxMemoryRequiredInMb);
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
        if (getNumberOfCpuCoresRequired() != null)
            sb.append("NumberOfCpuCoresRequired: ").append(getNumberOfCpuCoresRequired()).append(",");
        if (getNumberOfAcceleratorDevicesRequired() != null)
            sb.append("NumberOfAcceleratorDevicesRequired: ").append(getNumberOfAcceleratorDevicesRequired()).append(",");
        if (getMinMemoryRequiredInMb() != null)
            sb.append("MinMemoryRequiredInMb: ").append(getMinMemoryRequiredInMb()).append(",");
        if (getMaxMemoryRequiredInMb() != null)
            sb.append("MaxMemoryRequiredInMb: ").append(getMaxMemoryRequiredInMb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceComponentComputeResourceRequirements == false)
            return false;
        InferenceComponentComputeResourceRequirements other = (InferenceComponentComputeResourceRequirements) obj;
        if (other.getNumberOfCpuCoresRequired() == null ^ this.getNumberOfCpuCoresRequired() == null)
            return false;
        if (other.getNumberOfCpuCoresRequired() != null && other.getNumberOfCpuCoresRequired().equals(this.getNumberOfCpuCoresRequired()) == false)
            return false;
        if (other.getNumberOfAcceleratorDevicesRequired() == null ^ this.getNumberOfAcceleratorDevicesRequired() == null)
            return false;
        if (other.getNumberOfAcceleratorDevicesRequired() != null
                && other.getNumberOfAcceleratorDevicesRequired().equals(this.getNumberOfAcceleratorDevicesRequired()) == false)
            return false;
        if (other.getMinMemoryRequiredInMb() == null ^ this.getMinMemoryRequiredInMb() == null)
            return false;
        if (other.getMinMemoryRequiredInMb() != null && other.getMinMemoryRequiredInMb().equals(this.getMinMemoryRequiredInMb()) == false)
            return false;
        if (other.getMaxMemoryRequiredInMb() == null ^ this.getMaxMemoryRequiredInMb() == null)
            return false;
        if (other.getMaxMemoryRequiredInMb() != null && other.getMaxMemoryRequiredInMb().equals(this.getMaxMemoryRequiredInMb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfCpuCoresRequired() == null) ? 0 : getNumberOfCpuCoresRequired().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAcceleratorDevicesRequired() == null) ? 0 : getNumberOfAcceleratorDevicesRequired().hashCode());
        hashCode = prime * hashCode + ((getMinMemoryRequiredInMb() == null) ? 0 : getMinMemoryRequiredInMb().hashCode());
        hashCode = prime * hashCode + ((getMaxMemoryRequiredInMb() == null) ? 0 : getMaxMemoryRequiredInMb().hashCode());
        return hashCode;
    }

    @Override
    public InferenceComponentComputeResourceRequirements clone() {
        try {
            return (InferenceComponentComputeResourceRequirements) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceComponentComputeResourceRequirementsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

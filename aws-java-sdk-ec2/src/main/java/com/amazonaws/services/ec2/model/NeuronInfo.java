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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the neuron accelerators for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NeuronInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NeuronInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the neuron accelerators for the instance type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NeuronDeviceInfo> neuronDevices;
    /**
     * <p>
     * The total size of the memory for the neuron accelerators for the instance type, in MiB.
     * </p>
     */
    private Integer totalNeuronDeviceMemoryInMiB;

    /**
     * <p>
     * Describes the neuron accelerators for the instance type.
     * </p>
     * 
     * @return Describes the neuron accelerators for the instance type.
     */

    public java.util.List<NeuronDeviceInfo> getNeuronDevices() {
        if (neuronDevices == null) {
            neuronDevices = new com.amazonaws.internal.SdkInternalList<NeuronDeviceInfo>();
        }
        return neuronDevices;
    }

    /**
     * <p>
     * Describes the neuron accelerators for the instance type.
     * </p>
     * 
     * @param neuronDevices
     *        Describes the neuron accelerators for the instance type.
     */

    public void setNeuronDevices(java.util.Collection<NeuronDeviceInfo> neuronDevices) {
        if (neuronDevices == null) {
            this.neuronDevices = null;
            return;
        }

        this.neuronDevices = new com.amazonaws.internal.SdkInternalList<NeuronDeviceInfo>(neuronDevices);
    }

    /**
     * <p>
     * Describes the neuron accelerators for the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNeuronDevices(java.util.Collection)} or {@link #withNeuronDevices(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param neuronDevices
     *        Describes the neuron accelerators for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeuronInfo withNeuronDevices(NeuronDeviceInfo... neuronDevices) {
        if (this.neuronDevices == null) {
            setNeuronDevices(new com.amazonaws.internal.SdkInternalList<NeuronDeviceInfo>(neuronDevices.length));
        }
        for (NeuronDeviceInfo ele : neuronDevices) {
            this.neuronDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the neuron accelerators for the instance type.
     * </p>
     * 
     * @param neuronDevices
     *        Describes the neuron accelerators for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeuronInfo withNeuronDevices(java.util.Collection<NeuronDeviceInfo> neuronDevices) {
        setNeuronDevices(neuronDevices);
        return this;
    }

    /**
     * <p>
     * The total size of the memory for the neuron accelerators for the instance type, in MiB.
     * </p>
     * 
     * @param totalNeuronDeviceMemoryInMiB
     *        The total size of the memory for the neuron accelerators for the instance type, in MiB.
     */

    public void setTotalNeuronDeviceMemoryInMiB(Integer totalNeuronDeviceMemoryInMiB) {
        this.totalNeuronDeviceMemoryInMiB = totalNeuronDeviceMemoryInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the neuron accelerators for the instance type, in MiB.
     * </p>
     * 
     * @return The total size of the memory for the neuron accelerators for the instance type, in MiB.
     */

    public Integer getTotalNeuronDeviceMemoryInMiB() {
        return this.totalNeuronDeviceMemoryInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the neuron accelerators for the instance type, in MiB.
     * </p>
     * 
     * @param totalNeuronDeviceMemoryInMiB
     *        The total size of the memory for the neuron accelerators for the instance type, in MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeuronInfo withTotalNeuronDeviceMemoryInMiB(Integer totalNeuronDeviceMemoryInMiB) {
        setTotalNeuronDeviceMemoryInMiB(totalNeuronDeviceMemoryInMiB);
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
        if (getNeuronDevices() != null)
            sb.append("NeuronDevices: ").append(getNeuronDevices()).append(",");
        if (getTotalNeuronDeviceMemoryInMiB() != null)
            sb.append("TotalNeuronDeviceMemoryInMiB: ").append(getTotalNeuronDeviceMemoryInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NeuronInfo == false)
            return false;
        NeuronInfo other = (NeuronInfo) obj;
        if (other.getNeuronDevices() == null ^ this.getNeuronDevices() == null)
            return false;
        if (other.getNeuronDevices() != null && other.getNeuronDevices().equals(this.getNeuronDevices()) == false)
            return false;
        if (other.getTotalNeuronDeviceMemoryInMiB() == null ^ this.getTotalNeuronDeviceMemoryInMiB() == null)
            return false;
        if (other.getTotalNeuronDeviceMemoryInMiB() != null && other.getTotalNeuronDeviceMemoryInMiB().equals(this.getTotalNeuronDeviceMemoryInMiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNeuronDevices() == null) ? 0 : getNeuronDevices().hashCode());
        hashCode = prime * hashCode + ((getTotalNeuronDeviceMemoryInMiB() == null) ? 0 : getTotalNeuronDeviceMemoryInMiB().hashCode());
        return hashCode;
    }

    @Override
    public NeuronInfo clone() {
        try {
            return (NeuronInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

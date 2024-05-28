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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NeuronDeviceInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NeuronDeviceInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The number of neuron accelerators for the instance type.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The name of the neuron accelerator.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the cores available to each neuron accelerator.
     * </p>
     */
    private NeuronDeviceCoreInfo coreInfo;
    /**
     * <p>
     * Describes the memory available to each neuron accelerator.
     * </p>
     */
    private NeuronDeviceMemoryInfo memoryInfo;

    /**
     * <p>
     * The number of neuron accelerators for the instance type.
     * </p>
     * 
     * @param count
     *        The number of neuron accelerators for the instance type.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of neuron accelerators for the instance type.
     * </p>
     * 
     * @return The number of neuron accelerators for the instance type.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of neuron accelerators for the instance type.
     * </p>
     * 
     * @param count
     *        The number of neuron accelerators for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeuronDeviceInfo withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The name of the neuron accelerator.
     * </p>
     * 
     * @param name
     *        The name of the neuron accelerator.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the neuron accelerator.
     * </p>
     * 
     * @return The name of the neuron accelerator.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the neuron accelerator.
     * </p>
     * 
     * @param name
     *        The name of the neuron accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeuronDeviceInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the cores available to each neuron accelerator.
     * </p>
     * 
     * @param coreInfo
     *        Describes the cores available to each neuron accelerator.
     */

    public void setCoreInfo(NeuronDeviceCoreInfo coreInfo) {
        this.coreInfo = coreInfo;
    }

    /**
     * <p>
     * Describes the cores available to each neuron accelerator.
     * </p>
     * 
     * @return Describes the cores available to each neuron accelerator.
     */

    public NeuronDeviceCoreInfo getCoreInfo() {
        return this.coreInfo;
    }

    /**
     * <p>
     * Describes the cores available to each neuron accelerator.
     * </p>
     * 
     * @param coreInfo
     *        Describes the cores available to each neuron accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeuronDeviceInfo withCoreInfo(NeuronDeviceCoreInfo coreInfo) {
        setCoreInfo(coreInfo);
        return this;
    }

    /**
     * <p>
     * Describes the memory available to each neuron accelerator.
     * </p>
     * 
     * @param memoryInfo
     *        Describes the memory available to each neuron accelerator.
     */

    public void setMemoryInfo(NeuronDeviceMemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    /**
     * <p>
     * Describes the memory available to each neuron accelerator.
     * </p>
     * 
     * @return Describes the memory available to each neuron accelerator.
     */

    public NeuronDeviceMemoryInfo getMemoryInfo() {
        return this.memoryInfo;
    }

    /**
     * <p>
     * Describes the memory available to each neuron accelerator.
     * </p>
     * 
     * @param memoryInfo
     *        Describes the memory available to each neuron accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeuronDeviceInfo withMemoryInfo(NeuronDeviceMemoryInfo memoryInfo) {
        setMemoryInfo(memoryInfo);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCoreInfo() != null)
            sb.append("CoreInfo: ").append(getCoreInfo()).append(",");
        if (getMemoryInfo() != null)
            sb.append("MemoryInfo: ").append(getMemoryInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NeuronDeviceInfo == false)
            return false;
        NeuronDeviceInfo other = (NeuronDeviceInfo) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCoreInfo() == null ^ this.getCoreInfo() == null)
            return false;
        if (other.getCoreInfo() != null && other.getCoreInfo().equals(this.getCoreInfo()) == false)
            return false;
        if (other.getMemoryInfo() == null ^ this.getMemoryInfo() == null)
            return false;
        if (other.getMemoryInfo() != null && other.getMemoryInfo().equals(this.getMemoryInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCoreInfo() == null) ? 0 : getCoreInfo().hashCode());
        hashCode = prime * hashCode + ((getMemoryInfo() == null) ? 0 : getMemoryInfo().hashCode());
        return hashCode;
    }

    @Override
    public NeuronDeviceInfo clone() {
        try {
            return (NeuronDeviceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

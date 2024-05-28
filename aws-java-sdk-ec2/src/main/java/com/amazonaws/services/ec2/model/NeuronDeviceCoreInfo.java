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
 * Describes the cores available to the neuron accelerator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NeuronDeviceCoreInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NeuronDeviceCoreInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The number of cores available to the neuron accelerator.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The version of the neuron accelerator.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The number of cores available to the neuron accelerator.
     * </p>
     * 
     * @param count
     *        The number of cores available to the neuron accelerator.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of cores available to the neuron accelerator.
     * </p>
     * 
     * @return The number of cores available to the neuron accelerator.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of cores available to the neuron accelerator.
     * </p>
     * 
     * @param count
     *        The number of cores available to the neuron accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeuronDeviceCoreInfo withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The version of the neuron accelerator.
     * </p>
     * 
     * @param version
     *        The version of the neuron accelerator.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the neuron accelerator.
     * </p>
     * 
     * @return The version of the neuron accelerator.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the neuron accelerator.
     * </p>
     * 
     * @param version
     *        The version of the neuron accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeuronDeviceCoreInfo withVersion(Integer version) {
        setVersion(version);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NeuronDeviceCoreInfo == false)
            return false;
        NeuronDeviceCoreInfo other = (NeuronDeviceCoreInfo) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public NeuronDeviceCoreInfo clone() {
        try {
            return (NeuronDeviceCoreInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

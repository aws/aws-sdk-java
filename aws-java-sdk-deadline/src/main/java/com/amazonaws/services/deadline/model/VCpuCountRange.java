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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The allowable range of vCPU processing power for the fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/VCpuCountRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VCpuCountRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum amount of vCPU.
     * </p>
     */
    private Integer max;
    /**
     * <p>
     * The minimum amount of vCPU.
     * </p>
     */
    private Integer min;

    /**
     * <p>
     * The maximum amount of vCPU.
     * </p>
     * 
     * @param max
     *        The maximum amount of vCPU.
     */

    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum amount of vCPU.
     * </p>
     * 
     * @return The maximum amount of vCPU.
     */

    public Integer getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum amount of vCPU.
     * </p>
     * 
     * @param max
     *        The maximum amount of vCPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VCpuCountRange withMax(Integer max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The minimum amount of vCPU.
     * </p>
     * 
     * @param min
     *        The minimum amount of vCPU.
     */

    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum amount of vCPU.
     * </p>
     * 
     * @return The minimum amount of vCPU.
     */

    public Integer getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum amount of vCPU.
     * </p>
     * 
     * @param min
     *        The minimum amount of vCPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VCpuCountRange withMin(Integer min) {
        setMin(min);
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
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getMin() != null)
            sb.append("Min: ").append(getMin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VCpuCountRange == false)
            return false;
        VCpuCountRange other = (VCpuCountRange) obj;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        return hashCode;
    }

    @Override
    public VCpuCountRange clone() {
        try {
            return (VCpuCountRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.VCpuCountRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The fleet amount and attribute capabilities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/FleetAmountCapability" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetAmountCapability implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum amount of the fleet worker capability.
     * </p>
     */
    private Float max;
    /**
     * <p>
     * The minimum amount of fleet worker capability.
     * </p>
     */
    private Float min;
    /**
     * <p>
     * The name of the fleet capability.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The maximum amount of the fleet worker capability.
     * </p>
     * 
     * @param max
     *        The maximum amount of the fleet worker capability.
     */

    public void setMax(Float max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum amount of the fleet worker capability.
     * </p>
     * 
     * @return The maximum amount of the fleet worker capability.
     */

    public Float getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum amount of the fleet worker capability.
     * </p>
     * 
     * @param max
     *        The maximum amount of the fleet worker capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAmountCapability withMax(Float max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The minimum amount of fleet worker capability.
     * </p>
     * 
     * @param min
     *        The minimum amount of fleet worker capability.
     */

    public void setMin(Float min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum amount of fleet worker capability.
     * </p>
     * 
     * @return The minimum amount of fleet worker capability.
     */

    public Float getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum amount of fleet worker capability.
     * </p>
     * 
     * @param min
     *        The minimum amount of fleet worker capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAmountCapability withMin(Float min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The name of the fleet capability.
     * </p>
     * 
     * @param name
     *        The name of the fleet capability.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the fleet capability.
     * </p>
     * 
     * @return The name of the fleet capability.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the fleet capability.
     * </p>
     * 
     * @param name
     *        The name of the fleet capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAmountCapability withName(String name) {
        setName(name);
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
            sb.append("Min: ").append(getMin()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetAmountCapability == false)
            return false;
        FleetAmountCapability other = (FleetAmountCapability) obj;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public FleetAmountCapability clone() {
        try {
            return (FleetAmountCapability) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.FleetAmountCapabilityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

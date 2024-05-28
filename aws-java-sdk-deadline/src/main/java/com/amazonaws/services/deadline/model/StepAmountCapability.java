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
 * The details outlining the minimum and maximum capability of a step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StepAmountCapability" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepAmountCapability implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum amount.
     * </p>
     */
    private Double max;
    /**
     * <p>
     * The minimum amount.
     * </p>
     */
    private Double min;
    /**
     * <p>
     * The name of the step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The amount value.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The maximum amount.
     * </p>
     * 
     * @param max
     *        The maximum amount.
     */

    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum amount.
     * </p>
     * 
     * @return The maximum amount.
     */

    public Double getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum amount.
     * </p>
     * 
     * @param max
     *        The maximum amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAmountCapability withMax(Double max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The minimum amount.
     * </p>
     * 
     * @param min
     *        The minimum amount.
     */

    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum amount.
     * </p>
     * 
     * @return The minimum amount.
     */

    public Double getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum amount.
     * </p>
     * 
     * @param min
     *        The minimum amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAmountCapability withMin(Double min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param name
     *        The name of the step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @return The name of the step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param name
     *        The name of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAmountCapability withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The amount value.
     * </p>
     * 
     * @param value
     *        The amount value.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The amount value.
     * </p>
     * 
     * @return The amount value.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The amount value.
     * </p>
     * 
     * @param value
     *        The amount value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAmountCapability withValue(Double value) {
        setValue(value);
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
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepAmountCapability == false)
            return false;
        StepAmountCapability other = (StepAmountCapability) obj;
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
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
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
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public StepAmountCapability clone() {
        try {
            return (StepAmountCapability) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.StepAmountCapabilityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

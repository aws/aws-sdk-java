/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The scale setup options for a numeric axis display.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AxisScale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisScale implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The linear axis scale setup.
     * </p>
     */
    private AxisLinearScale linear;
    /**
     * <p>
     * The logarithmic axis scale setup.
     * </p>
     */
    private AxisLogarithmicScale logarithmic;

    /**
     * <p>
     * The linear axis scale setup.
     * </p>
     * 
     * @param linear
     *        The linear axis scale setup.
     */

    public void setLinear(AxisLinearScale linear) {
        this.linear = linear;
    }

    /**
     * <p>
     * The linear axis scale setup.
     * </p>
     * 
     * @return The linear axis scale setup.
     */

    public AxisLinearScale getLinear() {
        return this.linear;
    }

    /**
     * <p>
     * The linear axis scale setup.
     * </p>
     * 
     * @param linear
     *        The linear axis scale setup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisScale withLinear(AxisLinearScale linear) {
        setLinear(linear);
        return this;
    }

    /**
     * <p>
     * The logarithmic axis scale setup.
     * </p>
     * 
     * @param logarithmic
     *        The logarithmic axis scale setup.
     */

    public void setLogarithmic(AxisLogarithmicScale logarithmic) {
        this.logarithmic = logarithmic;
    }

    /**
     * <p>
     * The logarithmic axis scale setup.
     * </p>
     * 
     * @return The logarithmic axis scale setup.
     */

    public AxisLogarithmicScale getLogarithmic() {
        return this.logarithmic;
    }

    /**
     * <p>
     * The logarithmic axis scale setup.
     * </p>
     * 
     * @param logarithmic
     *        The logarithmic axis scale setup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisScale withLogarithmic(AxisLogarithmicScale logarithmic) {
        setLogarithmic(logarithmic);
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
        if (getLinear() != null)
            sb.append("Linear: ").append(getLinear()).append(",");
        if (getLogarithmic() != null)
            sb.append("Logarithmic: ").append(getLogarithmic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AxisScale == false)
            return false;
        AxisScale other = (AxisScale) obj;
        if (other.getLinear() == null ^ this.getLinear() == null)
            return false;
        if (other.getLinear() != null && other.getLinear().equals(this.getLinear()) == false)
            return false;
        if (other.getLogarithmic() == null ^ this.getLogarithmic() == null)
            return false;
        if (other.getLogarithmic() != null && other.getLogarithmic().equals(this.getLogarithmic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinear() == null) ? 0 : getLinear().hashCode());
        hashCode = prime * hashCode + ((getLogarithmic() == null) ? 0 : getLogarithmic().hashCode());
        return hashCode;
    }

    @Override
    public AxisScale clone() {
        try {
            return (AxisScale) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AxisScaleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

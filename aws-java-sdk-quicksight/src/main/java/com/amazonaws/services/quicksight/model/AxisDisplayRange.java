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
 * The range setup of a numeric axis display range.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AxisDisplayRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisDisplayRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum and maximum setup of an axis display range.
     * </p>
     */
    private AxisDisplayMinMaxRange minMax;
    /**
     * <p>
     * The data-driven setup of an axis display range.
     * </p>
     */
    private AxisDisplayDataDrivenRange dataDriven;

    /**
     * <p>
     * The minimum and maximum setup of an axis display range.
     * </p>
     * 
     * @param minMax
     *        The minimum and maximum setup of an axis display range.
     */

    public void setMinMax(AxisDisplayMinMaxRange minMax) {
        this.minMax = minMax;
    }

    /**
     * <p>
     * The minimum and maximum setup of an axis display range.
     * </p>
     * 
     * @return The minimum and maximum setup of an axis display range.
     */

    public AxisDisplayMinMaxRange getMinMax() {
        return this.minMax;
    }

    /**
     * <p>
     * The minimum and maximum setup of an axis display range.
     * </p>
     * 
     * @param minMax
     *        The minimum and maximum setup of an axis display range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDisplayRange withMinMax(AxisDisplayMinMaxRange minMax) {
        setMinMax(minMax);
        return this;
    }

    /**
     * <p>
     * The data-driven setup of an axis display range.
     * </p>
     * 
     * @param dataDriven
     *        The data-driven setup of an axis display range.
     */

    public void setDataDriven(AxisDisplayDataDrivenRange dataDriven) {
        this.dataDriven = dataDriven;
    }

    /**
     * <p>
     * The data-driven setup of an axis display range.
     * </p>
     * 
     * @return The data-driven setup of an axis display range.
     */

    public AxisDisplayDataDrivenRange getDataDriven() {
        return this.dataDriven;
    }

    /**
     * <p>
     * The data-driven setup of an axis display range.
     * </p>
     * 
     * @param dataDriven
     *        The data-driven setup of an axis display range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDisplayRange withDataDriven(AxisDisplayDataDrivenRange dataDriven) {
        setDataDriven(dataDriven);
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
        if (getMinMax() != null)
            sb.append("MinMax: ").append(getMinMax()).append(",");
        if (getDataDriven() != null)
            sb.append("DataDriven: ").append(getDataDriven());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AxisDisplayRange == false)
            return false;
        AxisDisplayRange other = (AxisDisplayRange) obj;
        if (other.getMinMax() == null ^ this.getMinMax() == null)
            return false;
        if (other.getMinMax() != null && other.getMinMax().equals(this.getMinMax()) == false)
            return false;
        if (other.getDataDriven() == null ^ this.getDataDriven() == null)
            return false;
        if (other.getDataDriven() != null && other.getDataDriven().equals(this.getDataDriven()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinMax() == null) ? 0 : getMinMax().hashCode());
        hashCode = prime * hashCode + ((getDataDriven() == null) ? 0 : getDataDriven().hashCode());
        return hashCode;
    }

    @Override
    public AxisDisplayRange clone() {
        try {
            return (AxisDisplayRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AxisDisplayRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

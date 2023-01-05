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
 * The arc axis range of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ArcAxisDisplayRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArcAxisDisplayRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum value of the arc axis range.
     * </p>
     */
    private Double min;
    /**
     * <p>
     * The maximum value of the arc axis range.
     * </p>
     */
    private Double max;

    /**
     * <p>
     * The minimum value of the arc axis range.
     * </p>
     * 
     * @param min
     *        The minimum value of the arc axis range.
     */

    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum value of the arc axis range.
     * </p>
     * 
     * @return The minimum value of the arc axis range.
     */

    public Double getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum value of the arc axis range.
     * </p>
     * 
     * @param min
     *        The minimum value of the arc axis range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArcAxisDisplayRange withMin(Double min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The maximum value of the arc axis range.
     * </p>
     * 
     * @param max
     *        The maximum value of the arc axis range.
     */

    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum value of the arc axis range.
     * </p>
     * 
     * @return The maximum value of the arc axis range.
     */

    public Double getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum value of the arc axis range.
     * </p>
     * 
     * @param max
     *        The maximum value of the arc axis range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArcAxisDisplayRange withMax(Double max) {
        setMax(max);
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
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArcAxisDisplayRange == false)
            return false;
        ArcAxisDisplayRange other = (ArcAxisDisplayRange) obj;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public ArcAxisDisplayRange clone() {
        try {
            return (ArcAxisDisplayRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ArcAxisDisplayRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The arc axis configuration of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ArcAxisConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArcAxisConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The arc axis range of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private ArcAxisDisplayRange range;
    /**
     * <p>
     * The reserved range of the arc axis.
     * </p>
     */
    private Integer reserveRange;

    /**
     * <p>
     * The arc axis range of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param range
     *        The arc axis range of a <code>GaugeChartVisual</code>.
     */

    public void setRange(ArcAxisDisplayRange range) {
        this.range = range;
    }

    /**
     * <p>
     * The arc axis range of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The arc axis range of a <code>GaugeChartVisual</code>.
     */

    public ArcAxisDisplayRange getRange() {
        return this.range;
    }

    /**
     * <p>
     * The arc axis range of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param range
     *        The arc axis range of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArcAxisConfiguration withRange(ArcAxisDisplayRange range) {
        setRange(range);
        return this;
    }

    /**
     * <p>
     * The reserved range of the arc axis.
     * </p>
     * 
     * @param reserveRange
     *        The reserved range of the arc axis.
     */

    public void setReserveRange(Integer reserveRange) {
        this.reserveRange = reserveRange;
    }

    /**
     * <p>
     * The reserved range of the arc axis.
     * </p>
     * 
     * @return The reserved range of the arc axis.
     */

    public Integer getReserveRange() {
        return this.reserveRange;
    }

    /**
     * <p>
     * The reserved range of the arc axis.
     * </p>
     * 
     * @param reserveRange
     *        The reserved range of the arc axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArcAxisConfiguration withReserveRange(Integer reserveRange) {
        setReserveRange(reserveRange);
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
        if (getRange() != null)
            sb.append("Range: ").append(getRange()).append(",");
        if (getReserveRange() != null)
            sb.append("ReserveRange: ").append(getReserveRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArcAxisConfiguration == false)
            return false;
        ArcAxisConfiguration other = (ArcAxisConfiguration) obj;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        if (other.getReserveRange() == null ^ this.getReserveRange() == null)
            return false;
        if (other.getReserveRange() != null && other.getReserveRange().equals(this.getReserveRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        hashCode = prime * hashCode + ((getReserveRange() == null) ? 0 : getReserveRange().hashCode());
        return hashCode;
    }

    @Override
    public ArcAxisConfiguration clone() {
        try {
            return (ArcAxisConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ArcAxisConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

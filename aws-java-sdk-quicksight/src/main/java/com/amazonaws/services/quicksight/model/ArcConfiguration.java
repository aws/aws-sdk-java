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
 * The arc configuration of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ArcConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArcConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The option that determines the arc angle of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private Double arcAngle;
    /**
     * <p>
     * The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private String arcThickness;

    /**
     * <p>
     * The option that determines the arc angle of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arcAngle
     *        The option that determines the arc angle of a <code>GaugeChartVisual</code>.
     */

    public void setArcAngle(Double arcAngle) {
        this.arcAngle = arcAngle;
    }

    /**
     * <p>
     * The option that determines the arc angle of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The option that determines the arc angle of a <code>GaugeChartVisual</code>.
     */

    public Double getArcAngle() {
        return this.arcAngle;
    }

    /**
     * <p>
     * The option that determines the arc angle of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arcAngle
     *        The option that determines the arc angle of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArcConfiguration withArcAngle(Double arcAngle) {
        setArcAngle(arcAngle);
        return this;
    }

    /**
     * <p>
     * The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arcThickness
     *        The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
     * @see ArcThicknessOptions
     */

    public void setArcThickness(String arcThickness) {
        this.arcThickness = arcThickness;
    }

    /**
     * <p>
     * The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
     * @see ArcThicknessOptions
     */

    public String getArcThickness() {
        return this.arcThickness;
    }

    /**
     * <p>
     * The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arcThickness
     *        The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArcThicknessOptions
     */

    public ArcConfiguration withArcThickness(String arcThickness) {
        setArcThickness(arcThickness);
        return this;
    }

    /**
     * <p>
     * The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arcThickness
     *        The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArcThicknessOptions
     */

    public ArcConfiguration withArcThickness(ArcThicknessOptions arcThickness) {
        this.arcThickness = arcThickness.toString();
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
        if (getArcAngle() != null)
            sb.append("ArcAngle: ").append(getArcAngle()).append(",");
        if (getArcThickness() != null)
            sb.append("ArcThickness: ").append(getArcThickness());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArcConfiguration == false)
            return false;
        ArcConfiguration other = (ArcConfiguration) obj;
        if (other.getArcAngle() == null ^ this.getArcAngle() == null)
            return false;
        if (other.getArcAngle() != null && other.getArcAngle().equals(this.getArcAngle()) == false)
            return false;
        if (other.getArcThickness() == null ^ this.getArcThickness() == null)
            return false;
        if (other.getArcThickness() != null && other.getArcThickness().equals(this.getArcThickness()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArcAngle() == null) ? 0 : getArcAngle().hashCode());
        hashCode = prime * hashCode + ((getArcThickness() == null) ? 0 : getArcThickness().hashCode());
        return hashCode;
    }

    @Override
    public ArcConfiguration clone() {
        try {
            return (ArcConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ArcConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

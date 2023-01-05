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
 * The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ArcOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArcOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private String arcThickness;

    /**
     * <p>
     * The arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arcThickness
     *        The arc thickness of a <code>GaugeChartVisual</code>.
     * @see ArcThickness
     */

    public void setArcThickness(String arcThickness) {
        this.arcThickness = arcThickness;
    }

    /**
     * <p>
     * The arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The arc thickness of a <code>GaugeChartVisual</code>.
     * @see ArcThickness
     */

    public String getArcThickness() {
        return this.arcThickness;
    }

    /**
     * <p>
     * The arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arcThickness
     *        The arc thickness of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArcThickness
     */

    public ArcOptions withArcThickness(String arcThickness) {
        setArcThickness(arcThickness);
        return this;
    }

    /**
     * <p>
     * The arc thickness of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arcThickness
     *        The arc thickness of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArcThickness
     */

    public ArcOptions withArcThickness(ArcThickness arcThickness) {
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

        if (obj instanceof ArcOptions == false)
            return false;
        ArcOptions other = (ArcOptions) obj;
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

        hashCode = prime * hashCode + ((getArcThickness() == null) ? 0 : getArcThickness().hashCode());
        return hashCode;
    }

    @Override
    public ArcOptions clone() {
        try {
            return (ArcOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ArcOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

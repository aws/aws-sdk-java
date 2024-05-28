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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The color configuration of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GaugeChartColorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GaugeChartColorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The foreground color configuration of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private String foregroundColor;
    /**
     * <p>
     * The background color configuration of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private String backgroundColor;

    /**
     * <p>
     * The foreground color configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param foregroundColor
     *        The foreground color configuration of a <code>GaugeChartVisual</code>.
     */

    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    /**
     * <p>
     * The foreground color configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The foreground color configuration of a <code>GaugeChartVisual</code>.
     */

    public String getForegroundColor() {
        return this.foregroundColor;
    }

    /**
     * <p>
     * The foreground color configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param foregroundColor
     *        The foreground color configuration of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartColorConfiguration withForegroundColor(String foregroundColor) {
        setForegroundColor(foregroundColor);
        return this;
    }

    /**
     * <p>
     * The background color configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param backgroundColor
     *        The background color configuration of a <code>GaugeChartVisual</code>.
     */

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * <p>
     * The background color configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The background color configuration of a <code>GaugeChartVisual</code>.
     */

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * <p>
     * The background color configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param backgroundColor
     *        The background color configuration of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartColorConfiguration withBackgroundColor(String backgroundColor) {
        setBackgroundColor(backgroundColor);
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
        if (getForegroundColor() != null)
            sb.append("ForegroundColor: ").append(getForegroundColor()).append(",");
        if (getBackgroundColor() != null)
            sb.append("BackgroundColor: ").append(getBackgroundColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GaugeChartColorConfiguration == false)
            return false;
        GaugeChartColorConfiguration other = (GaugeChartColorConfiguration) obj;
        if (other.getForegroundColor() == null ^ this.getForegroundColor() == null)
            return false;
        if (other.getForegroundColor() != null && other.getForegroundColor().equals(this.getForegroundColor()) == false)
            return false;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForegroundColor() == null) ? 0 : getForegroundColor().hashCode());
        hashCode = prime * hashCode + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        return hashCode;
    }

    @Override
    public GaugeChartColorConfiguration clone() {
        try {
            return (GaugeChartColorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GaugeChartColorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

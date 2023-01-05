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
 * The options that determine the presentation of the arc of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GaugeChartArcConditionalFormatting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GaugeChartArcConditionalFormatting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conditional formatting of the arc foreground color.
     * </p>
     */
    private ConditionalFormattingColor foregroundColor;

    /**
     * <p>
     * The conditional formatting of the arc foreground color.
     * </p>
     * 
     * @param foregroundColor
     *        The conditional formatting of the arc foreground color.
     */

    public void setForegroundColor(ConditionalFormattingColor foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    /**
     * <p>
     * The conditional formatting of the arc foreground color.
     * </p>
     * 
     * @return The conditional formatting of the arc foreground color.
     */

    public ConditionalFormattingColor getForegroundColor() {
        return this.foregroundColor;
    }

    /**
     * <p>
     * The conditional formatting of the arc foreground color.
     * </p>
     * 
     * @param foregroundColor
     *        The conditional formatting of the arc foreground color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartArcConditionalFormatting withForegroundColor(ConditionalFormattingColor foregroundColor) {
        setForegroundColor(foregroundColor);
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
            sb.append("ForegroundColor: ").append(getForegroundColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GaugeChartArcConditionalFormatting == false)
            return false;
        GaugeChartArcConditionalFormatting other = (GaugeChartArcConditionalFormatting) obj;
        if (other.getForegroundColor() == null ^ this.getForegroundColor() == null)
            return false;
        if (other.getForegroundColor() != null && other.getForegroundColor().equals(this.getForegroundColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForegroundColor() == null) ? 0 : getForegroundColor().hashCode());
        return hashCode;
    }

    @Override
    public GaugeChartArcConditionalFormatting clone() {
        try {
            return (GaugeChartArcConditionalFormatting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GaugeChartArcConditionalFormattingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The conditional formatting for the primary value of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GaugeChartPrimaryValueConditionalFormatting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GaugeChartPrimaryValueConditionalFormatting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conditional formatting of the primary value text color.
     * </p>
     */
    private ConditionalFormattingColor textColor;
    /**
     * <p>
     * The conditional formatting of the primary value icon.
     * </p>
     */
    private ConditionalFormattingIcon icon;

    /**
     * <p>
     * The conditional formatting of the primary value text color.
     * </p>
     * 
     * @param textColor
     *        The conditional formatting of the primary value text color.
     */

    public void setTextColor(ConditionalFormattingColor textColor) {
        this.textColor = textColor;
    }

    /**
     * <p>
     * The conditional formatting of the primary value text color.
     * </p>
     * 
     * @return The conditional formatting of the primary value text color.
     */

    public ConditionalFormattingColor getTextColor() {
        return this.textColor;
    }

    /**
     * <p>
     * The conditional formatting of the primary value text color.
     * </p>
     * 
     * @param textColor
     *        The conditional formatting of the primary value text color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartPrimaryValueConditionalFormatting withTextColor(ConditionalFormattingColor textColor) {
        setTextColor(textColor);
        return this;
    }

    /**
     * <p>
     * The conditional formatting of the primary value icon.
     * </p>
     * 
     * @param icon
     *        The conditional formatting of the primary value icon.
     */

    public void setIcon(ConditionalFormattingIcon icon) {
        this.icon = icon;
    }

    /**
     * <p>
     * The conditional formatting of the primary value icon.
     * </p>
     * 
     * @return The conditional formatting of the primary value icon.
     */

    public ConditionalFormattingIcon getIcon() {
        return this.icon;
    }

    /**
     * <p>
     * The conditional formatting of the primary value icon.
     * </p>
     * 
     * @param icon
     *        The conditional formatting of the primary value icon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartPrimaryValueConditionalFormatting withIcon(ConditionalFormattingIcon icon) {
        setIcon(icon);
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
        if (getTextColor() != null)
            sb.append("TextColor: ").append(getTextColor()).append(",");
        if (getIcon() != null)
            sb.append("Icon: ").append(getIcon());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GaugeChartPrimaryValueConditionalFormatting == false)
            return false;
        GaugeChartPrimaryValueConditionalFormatting other = (GaugeChartPrimaryValueConditionalFormatting) obj;
        if (other.getTextColor() == null ^ this.getTextColor() == null)
            return false;
        if (other.getTextColor() != null && other.getTextColor().equals(this.getTextColor()) == false)
            return false;
        if (other.getIcon() == null ^ this.getIcon() == null)
            return false;
        if (other.getIcon() != null && other.getIcon().equals(this.getIcon()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextColor() == null) ? 0 : getTextColor().hashCode());
        hashCode = prime * hashCode + ((getIcon() == null) ? 0 : getIcon().hashCode());
        return hashCode;
    }

    @Override
    public GaugeChartPrimaryValueConditionalFormatting clone() {
        try {
            return (GaugeChartPrimaryValueConditionalFormatting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GaugeChartPrimaryValueConditionalFormattingMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}

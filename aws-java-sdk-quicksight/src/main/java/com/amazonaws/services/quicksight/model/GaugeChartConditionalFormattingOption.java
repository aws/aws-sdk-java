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
 * Conditional formatting options of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GaugeChartConditionalFormattingOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GaugeChartConditionalFormattingOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conditional formatting for the primary value of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private GaugeChartPrimaryValueConditionalFormatting primaryValue;
    /**
     * <p>
     * The options that determine the presentation of the arc of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private GaugeChartArcConditionalFormatting arc;

    /**
     * <p>
     * The conditional formatting for the primary value of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param primaryValue
     *        The conditional formatting for the primary value of a <code>GaugeChartVisual</code>.
     */

    public void setPrimaryValue(GaugeChartPrimaryValueConditionalFormatting primaryValue) {
        this.primaryValue = primaryValue;
    }

    /**
     * <p>
     * The conditional formatting for the primary value of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The conditional formatting for the primary value of a <code>GaugeChartVisual</code>.
     */

    public GaugeChartPrimaryValueConditionalFormatting getPrimaryValue() {
        return this.primaryValue;
    }

    /**
     * <p>
     * The conditional formatting for the primary value of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param primaryValue
     *        The conditional formatting for the primary value of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartConditionalFormattingOption withPrimaryValue(GaugeChartPrimaryValueConditionalFormatting primaryValue) {
        setPrimaryValue(primaryValue);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the arc of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arc
     *        The options that determine the presentation of the arc of a <code>GaugeChartVisual</code>.
     */

    public void setArc(GaugeChartArcConditionalFormatting arc) {
        this.arc = arc;
    }

    /**
     * <p>
     * The options that determine the presentation of the arc of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The options that determine the presentation of the arc of a <code>GaugeChartVisual</code>.
     */

    public GaugeChartArcConditionalFormatting getArc() {
        return this.arc;
    }

    /**
     * <p>
     * The options that determine the presentation of the arc of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param arc
     *        The options that determine the presentation of the arc of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartConditionalFormattingOption withArc(GaugeChartArcConditionalFormatting arc) {
        setArc(arc);
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
        if (getPrimaryValue() != null)
            sb.append("PrimaryValue: ").append(getPrimaryValue()).append(",");
        if (getArc() != null)
            sb.append("Arc: ").append(getArc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GaugeChartConditionalFormattingOption == false)
            return false;
        GaugeChartConditionalFormattingOption other = (GaugeChartConditionalFormattingOption) obj;
        if (other.getPrimaryValue() == null ^ this.getPrimaryValue() == null)
            return false;
        if (other.getPrimaryValue() != null && other.getPrimaryValue().equals(this.getPrimaryValue()) == false)
            return false;
        if (other.getArc() == null ^ this.getArc() == null)
            return false;
        if (other.getArc() != null && other.getArc().equals(this.getArc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryValue() == null) ? 0 : getPrimaryValue().hashCode());
        hashCode = prime * hashCode + ((getArc() == null) ? 0 : getArc().hashCode());
        return hashCode;
    }

    @Override
    public GaugeChartConditionalFormattingOption clone() {
        try {
            return (GaugeChartConditionalFormattingOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GaugeChartConditionalFormattingOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

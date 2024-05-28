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
 * The color configuration for individual groups within a waterfall visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WaterfallChartGroupColorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaterfallChartGroupColorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the color for the positive bars of a waterfall chart.
     * </p>
     */
    private String positiveBarColor;
    /**
     * <p>
     * Defines the color for the negative bars of a waterfall chart.
     * </p>
     */
    private String negativeBarColor;
    /**
     * <p>
     * Defines the color for the total bars of a waterfall chart.
     * </p>
     */
    private String totalBarColor;

    /**
     * <p>
     * Defines the color for the positive bars of a waterfall chart.
     * </p>
     * 
     * @param positiveBarColor
     *        Defines the color for the positive bars of a waterfall chart.
     */

    public void setPositiveBarColor(String positiveBarColor) {
        this.positiveBarColor = positiveBarColor;
    }

    /**
     * <p>
     * Defines the color for the positive bars of a waterfall chart.
     * </p>
     * 
     * @return Defines the color for the positive bars of a waterfall chart.
     */

    public String getPositiveBarColor() {
        return this.positiveBarColor;
    }

    /**
     * <p>
     * Defines the color for the positive bars of a waterfall chart.
     * </p>
     * 
     * @param positiveBarColor
     *        Defines the color for the positive bars of a waterfall chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartGroupColorConfiguration withPositiveBarColor(String positiveBarColor) {
        setPositiveBarColor(positiveBarColor);
        return this;
    }

    /**
     * <p>
     * Defines the color for the negative bars of a waterfall chart.
     * </p>
     * 
     * @param negativeBarColor
     *        Defines the color for the negative bars of a waterfall chart.
     */

    public void setNegativeBarColor(String negativeBarColor) {
        this.negativeBarColor = negativeBarColor;
    }

    /**
     * <p>
     * Defines the color for the negative bars of a waterfall chart.
     * </p>
     * 
     * @return Defines the color for the negative bars of a waterfall chart.
     */

    public String getNegativeBarColor() {
        return this.negativeBarColor;
    }

    /**
     * <p>
     * Defines the color for the negative bars of a waterfall chart.
     * </p>
     * 
     * @param negativeBarColor
     *        Defines the color for the negative bars of a waterfall chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartGroupColorConfiguration withNegativeBarColor(String negativeBarColor) {
        setNegativeBarColor(negativeBarColor);
        return this;
    }

    /**
     * <p>
     * Defines the color for the total bars of a waterfall chart.
     * </p>
     * 
     * @param totalBarColor
     *        Defines the color for the total bars of a waterfall chart.
     */

    public void setTotalBarColor(String totalBarColor) {
        this.totalBarColor = totalBarColor;
    }

    /**
     * <p>
     * Defines the color for the total bars of a waterfall chart.
     * </p>
     * 
     * @return Defines the color for the total bars of a waterfall chart.
     */

    public String getTotalBarColor() {
        return this.totalBarColor;
    }

    /**
     * <p>
     * Defines the color for the total bars of a waterfall chart.
     * </p>
     * 
     * @param totalBarColor
     *        Defines the color for the total bars of a waterfall chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartGroupColorConfiguration withTotalBarColor(String totalBarColor) {
        setTotalBarColor(totalBarColor);
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
        if (getPositiveBarColor() != null)
            sb.append("PositiveBarColor: ").append(getPositiveBarColor()).append(",");
        if (getNegativeBarColor() != null)
            sb.append("NegativeBarColor: ").append(getNegativeBarColor()).append(",");
        if (getTotalBarColor() != null)
            sb.append("TotalBarColor: ").append(getTotalBarColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaterfallChartGroupColorConfiguration == false)
            return false;
        WaterfallChartGroupColorConfiguration other = (WaterfallChartGroupColorConfiguration) obj;
        if (other.getPositiveBarColor() == null ^ this.getPositiveBarColor() == null)
            return false;
        if (other.getPositiveBarColor() != null && other.getPositiveBarColor().equals(this.getPositiveBarColor()) == false)
            return false;
        if (other.getNegativeBarColor() == null ^ this.getNegativeBarColor() == null)
            return false;
        if (other.getNegativeBarColor() != null && other.getNegativeBarColor().equals(this.getNegativeBarColor()) == false)
            return false;
        if (other.getTotalBarColor() == null ^ this.getTotalBarColor() == null)
            return false;
        if (other.getTotalBarColor() != null && other.getTotalBarColor().equals(this.getTotalBarColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPositiveBarColor() == null) ? 0 : getPositiveBarColor().hashCode());
        hashCode = prime * hashCode + ((getNegativeBarColor() == null) ? 0 : getNegativeBarColor().hashCode());
        hashCode = prime * hashCode + ((getTotalBarColor() == null) ? 0 : getTotalBarColor().hashCode());
        return hashCode;
    }

    @Override
    public WaterfallChartGroupColorConfiguration clone() {
        try {
            return (WaterfallChartGroupColorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WaterfallChartGroupColorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

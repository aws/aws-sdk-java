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
 * The visual display options for the visual palette.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/VisualPalette" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisualPalette implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The chart color options for the visual palette.
     * </p>
     */
    private String chartColor;
    /**
     * <p>
     * The color map options for the visual palette.
     * </p>
     */
    private java.util.List<DataPathColor> colorMap;

    /**
     * <p>
     * The chart color options for the visual palette.
     * </p>
     * 
     * @param chartColor
     *        The chart color options for the visual palette.
     */

    public void setChartColor(String chartColor) {
        this.chartColor = chartColor;
    }

    /**
     * <p>
     * The chart color options for the visual palette.
     * </p>
     * 
     * @return The chart color options for the visual palette.
     */

    public String getChartColor() {
        return this.chartColor;
    }

    /**
     * <p>
     * The chart color options for the visual palette.
     * </p>
     * 
     * @param chartColor
     *        The chart color options for the visual palette.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualPalette withChartColor(String chartColor) {
        setChartColor(chartColor);
        return this;
    }

    /**
     * <p>
     * The color map options for the visual palette.
     * </p>
     * 
     * @return The color map options for the visual palette.
     */

    public java.util.List<DataPathColor> getColorMap() {
        return colorMap;
    }

    /**
     * <p>
     * The color map options for the visual palette.
     * </p>
     * 
     * @param colorMap
     *        The color map options for the visual palette.
     */

    public void setColorMap(java.util.Collection<DataPathColor> colorMap) {
        if (colorMap == null) {
            this.colorMap = null;
            return;
        }

        this.colorMap = new java.util.ArrayList<DataPathColor>(colorMap);
    }

    /**
     * <p>
     * The color map options for the visual palette.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColorMap(java.util.Collection)} or {@link #withColorMap(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param colorMap
     *        The color map options for the visual palette.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualPalette withColorMap(DataPathColor... colorMap) {
        if (this.colorMap == null) {
            setColorMap(new java.util.ArrayList<DataPathColor>(colorMap.length));
        }
        for (DataPathColor ele : colorMap) {
            this.colorMap.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The color map options for the visual palette.
     * </p>
     * 
     * @param colorMap
     *        The color map options for the visual palette.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualPalette withColorMap(java.util.Collection<DataPathColor> colorMap) {
        setColorMap(colorMap);
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
        if (getChartColor() != null)
            sb.append("ChartColor: ").append(getChartColor()).append(",");
        if (getColorMap() != null)
            sb.append("ColorMap: ").append(getColorMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VisualPalette == false)
            return false;
        VisualPalette other = (VisualPalette) obj;
        if (other.getChartColor() == null ^ this.getChartColor() == null)
            return false;
        if (other.getChartColor() != null && other.getChartColor().equals(this.getChartColor()) == false)
            return false;
        if (other.getColorMap() == null ^ this.getColorMap() == null)
            return false;
        if (other.getColorMap() != null && other.getColorMap().equals(this.getColorMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChartColor() == null) ? 0 : getChartColor().hashCode());
        hashCode = prime * hashCode + ((getColorMap() == null) ? 0 : getColorMap().hashCode());
        return hashCode;
    }

    @Override
    public VisualPalette clone() {
        try {
            return (VisualPalette) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.VisualPaletteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

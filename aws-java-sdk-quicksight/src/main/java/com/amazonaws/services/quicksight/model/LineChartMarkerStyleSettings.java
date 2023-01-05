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
 * Marker styles options for a line series in <code>LineChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LineChartMarkerStyleSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineChartMarkerStyleSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration option that determines whether to show the markers in the series.
     * </p>
     */
    private String markerVisibility;
    /**
     * <p>
     * Shape option for markers in the series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CIRCLE</code>: Show marker as a circle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIANGLE</code>: Show marker as a triangle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQUARE</code>: Show marker as a square.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIAMOND</code>: Show marker as a diamond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUNDED_SQUARE</code>: Show marker as a rounded square.
     * </p>
     * </li>
     * </ul>
     */
    private String markerShape;
    /**
     * <p>
     * Size of marker in the series.
     * </p>
     */
    private String markerSize;
    /**
     * <p>
     * Color of marker in the series.
     * </p>
     */
    private String markerColor;

    /**
     * <p>
     * Configuration option that determines whether to show the markers in the series.
     * </p>
     * 
     * @param markerVisibility
     *        Configuration option that determines whether to show the markers in the series.
     * @see Visibility
     */

    public void setMarkerVisibility(String markerVisibility) {
        this.markerVisibility = markerVisibility;
    }

    /**
     * <p>
     * Configuration option that determines whether to show the markers in the series.
     * </p>
     * 
     * @return Configuration option that determines whether to show the markers in the series.
     * @see Visibility
     */

    public String getMarkerVisibility() {
        return this.markerVisibility;
    }

    /**
     * <p>
     * Configuration option that determines whether to show the markers in the series.
     * </p>
     * 
     * @param markerVisibility
     *        Configuration option that determines whether to show the markers in the series.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public LineChartMarkerStyleSettings withMarkerVisibility(String markerVisibility) {
        setMarkerVisibility(markerVisibility);
        return this;
    }

    /**
     * <p>
     * Configuration option that determines whether to show the markers in the series.
     * </p>
     * 
     * @param markerVisibility
     *        Configuration option that determines whether to show the markers in the series.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public LineChartMarkerStyleSettings withMarkerVisibility(Visibility markerVisibility) {
        this.markerVisibility = markerVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Shape option for markers in the series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CIRCLE</code>: Show marker as a circle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIANGLE</code>: Show marker as a triangle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQUARE</code>: Show marker as a square.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIAMOND</code>: Show marker as a diamond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUNDED_SQUARE</code>: Show marker as a rounded square.
     * </p>
     * </li>
     * </ul>
     * 
     * @param markerShape
     *        Shape option for markers in the series.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CIRCLE</code>: Show marker as a circle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIANGLE</code>: Show marker as a triangle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SQUARE</code>: Show marker as a square.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIAMOND</code>: Show marker as a diamond.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROUNDED_SQUARE</code>: Show marker as a rounded square.
     *        </p>
     *        </li>
     * @see LineChartMarkerShape
     */

    public void setMarkerShape(String markerShape) {
        this.markerShape = markerShape;
    }

    /**
     * <p>
     * Shape option for markers in the series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CIRCLE</code>: Show marker as a circle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIANGLE</code>: Show marker as a triangle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQUARE</code>: Show marker as a square.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIAMOND</code>: Show marker as a diamond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUNDED_SQUARE</code>: Show marker as a rounded square.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Shape option for markers in the series.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CIRCLE</code>: Show marker as a circle.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRIANGLE</code>: Show marker as a triangle.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SQUARE</code>: Show marker as a square.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIAMOND</code>: Show marker as a diamond.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ROUNDED_SQUARE</code>: Show marker as a rounded square.
     *         </p>
     *         </li>
     * @see LineChartMarkerShape
     */

    public String getMarkerShape() {
        return this.markerShape;
    }

    /**
     * <p>
     * Shape option for markers in the series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CIRCLE</code>: Show marker as a circle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIANGLE</code>: Show marker as a triangle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQUARE</code>: Show marker as a square.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIAMOND</code>: Show marker as a diamond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUNDED_SQUARE</code>: Show marker as a rounded square.
     * </p>
     * </li>
     * </ul>
     * 
     * @param markerShape
     *        Shape option for markers in the series.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CIRCLE</code>: Show marker as a circle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIANGLE</code>: Show marker as a triangle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SQUARE</code>: Show marker as a square.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIAMOND</code>: Show marker as a diamond.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROUNDED_SQUARE</code>: Show marker as a rounded square.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineChartMarkerShape
     */

    public LineChartMarkerStyleSettings withMarkerShape(String markerShape) {
        setMarkerShape(markerShape);
        return this;
    }

    /**
     * <p>
     * Shape option for markers in the series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CIRCLE</code>: Show marker as a circle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIANGLE</code>: Show marker as a triangle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQUARE</code>: Show marker as a square.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIAMOND</code>: Show marker as a diamond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROUNDED_SQUARE</code>: Show marker as a rounded square.
     * </p>
     * </li>
     * </ul>
     * 
     * @param markerShape
     *        Shape option for markers in the series.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CIRCLE</code>: Show marker as a circle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIANGLE</code>: Show marker as a triangle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SQUARE</code>: Show marker as a square.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIAMOND</code>: Show marker as a diamond.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROUNDED_SQUARE</code>: Show marker as a rounded square.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineChartMarkerShape
     */

    public LineChartMarkerStyleSettings withMarkerShape(LineChartMarkerShape markerShape) {
        this.markerShape = markerShape.toString();
        return this;
    }

    /**
     * <p>
     * Size of marker in the series.
     * </p>
     * 
     * @param markerSize
     *        Size of marker in the series.
     */

    public void setMarkerSize(String markerSize) {
        this.markerSize = markerSize;
    }

    /**
     * <p>
     * Size of marker in the series.
     * </p>
     * 
     * @return Size of marker in the series.
     */

    public String getMarkerSize() {
        return this.markerSize;
    }

    /**
     * <p>
     * Size of marker in the series.
     * </p>
     * 
     * @param markerSize
     *        Size of marker in the series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartMarkerStyleSettings withMarkerSize(String markerSize) {
        setMarkerSize(markerSize);
        return this;
    }

    /**
     * <p>
     * Color of marker in the series.
     * </p>
     * 
     * @param markerColor
     *        Color of marker in the series.
     */

    public void setMarkerColor(String markerColor) {
        this.markerColor = markerColor;
    }

    /**
     * <p>
     * Color of marker in the series.
     * </p>
     * 
     * @return Color of marker in the series.
     */

    public String getMarkerColor() {
        return this.markerColor;
    }

    /**
     * <p>
     * Color of marker in the series.
     * </p>
     * 
     * @param markerColor
     *        Color of marker in the series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartMarkerStyleSettings withMarkerColor(String markerColor) {
        setMarkerColor(markerColor);
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
        if (getMarkerVisibility() != null)
            sb.append("MarkerVisibility: ").append(getMarkerVisibility()).append(",");
        if (getMarkerShape() != null)
            sb.append("MarkerShape: ").append(getMarkerShape()).append(",");
        if (getMarkerSize() != null)
            sb.append("MarkerSize: ").append(getMarkerSize()).append(",");
        if (getMarkerColor() != null)
            sb.append("MarkerColor: ").append(getMarkerColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineChartMarkerStyleSettings == false)
            return false;
        LineChartMarkerStyleSettings other = (LineChartMarkerStyleSettings) obj;
        if (other.getMarkerVisibility() == null ^ this.getMarkerVisibility() == null)
            return false;
        if (other.getMarkerVisibility() != null && other.getMarkerVisibility().equals(this.getMarkerVisibility()) == false)
            return false;
        if (other.getMarkerShape() == null ^ this.getMarkerShape() == null)
            return false;
        if (other.getMarkerShape() != null && other.getMarkerShape().equals(this.getMarkerShape()) == false)
            return false;
        if (other.getMarkerSize() == null ^ this.getMarkerSize() == null)
            return false;
        if (other.getMarkerSize() != null && other.getMarkerSize().equals(this.getMarkerSize()) == false)
            return false;
        if (other.getMarkerColor() == null ^ this.getMarkerColor() == null)
            return false;
        if (other.getMarkerColor() != null && other.getMarkerColor().equals(this.getMarkerColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarkerVisibility() == null) ? 0 : getMarkerVisibility().hashCode());
        hashCode = prime * hashCode + ((getMarkerShape() == null) ? 0 : getMarkerShape().hashCode());
        hashCode = prime * hashCode + ((getMarkerSize() == null) ? 0 : getMarkerSize().hashCode());
        hashCode = prime * hashCode + ((getMarkerColor() == null) ? 0 : getMarkerColor().hashCode());
        return hashCode;
    }

    @Override
    public LineChartMarkerStyleSettings clone() {
        try {
            return (LineChartMarkerStyleSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LineChartMarkerStyleSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

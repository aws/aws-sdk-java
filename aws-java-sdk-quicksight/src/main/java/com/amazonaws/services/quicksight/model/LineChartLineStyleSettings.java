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
 * Line styles options for a line series in <code>LineChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LineChartLineStyleSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineChartLineStyleSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration option that determines whether to show the line for the series.
     * </p>
     */
    private String lineVisibility;
    /**
     * <p>
     * Interpolation style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINEAR</code>: Show as default, linear style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMOOTH</code>: Show as a smooth curve.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STEPPED</code>: Show steps in line.
     * </p>
     * </li>
     * </ul>
     */
    private String lineInterpolation;
    /**
     * <p>
     * Line style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>: Show as a solid line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>: Show as a dotted line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>: Show as a dashed line.
     * </p>
     * </li>
     * </ul>
     */
    private String lineStyle;
    /**
     * <p>
     * Width that determines the line thickness.
     * </p>
     */
    private String lineWidth;

    /**
     * <p>
     * Configuration option that determines whether to show the line for the series.
     * </p>
     * 
     * @param lineVisibility
     *        Configuration option that determines whether to show the line for the series.
     * @see Visibility
     */

    public void setLineVisibility(String lineVisibility) {
        this.lineVisibility = lineVisibility;
    }

    /**
     * <p>
     * Configuration option that determines whether to show the line for the series.
     * </p>
     * 
     * @return Configuration option that determines whether to show the line for the series.
     * @see Visibility
     */

    public String getLineVisibility() {
        return this.lineVisibility;
    }

    /**
     * <p>
     * Configuration option that determines whether to show the line for the series.
     * </p>
     * 
     * @param lineVisibility
     *        Configuration option that determines whether to show the line for the series.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public LineChartLineStyleSettings withLineVisibility(String lineVisibility) {
        setLineVisibility(lineVisibility);
        return this;
    }

    /**
     * <p>
     * Configuration option that determines whether to show the line for the series.
     * </p>
     * 
     * @param lineVisibility
     *        Configuration option that determines whether to show the line for the series.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public LineChartLineStyleSettings withLineVisibility(Visibility lineVisibility) {
        this.lineVisibility = lineVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Interpolation style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINEAR</code>: Show as default, linear style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMOOTH</code>: Show as a smooth curve.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STEPPED</code>: Show steps in line.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lineInterpolation
     *        Interpolation style for line series.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINEAR</code>: Show as default, linear style.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMOOTH</code>: Show as a smooth curve.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STEPPED</code>: Show steps in line.
     *        </p>
     *        </li>
     * @see LineInterpolation
     */

    public void setLineInterpolation(String lineInterpolation) {
        this.lineInterpolation = lineInterpolation;
    }

    /**
     * <p>
     * Interpolation style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINEAR</code>: Show as default, linear style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMOOTH</code>: Show as a smooth curve.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STEPPED</code>: Show steps in line.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Interpolation style for line series.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LINEAR</code>: Show as default, linear style.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SMOOTH</code>: Show as a smooth curve.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STEPPED</code>: Show steps in line.
     *         </p>
     *         </li>
     * @see LineInterpolation
     */

    public String getLineInterpolation() {
        return this.lineInterpolation;
    }

    /**
     * <p>
     * Interpolation style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINEAR</code>: Show as default, linear style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMOOTH</code>: Show as a smooth curve.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STEPPED</code>: Show steps in line.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lineInterpolation
     *        Interpolation style for line series.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINEAR</code>: Show as default, linear style.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMOOTH</code>: Show as a smooth curve.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STEPPED</code>: Show steps in line.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineInterpolation
     */

    public LineChartLineStyleSettings withLineInterpolation(String lineInterpolation) {
        setLineInterpolation(lineInterpolation);
        return this;
    }

    /**
     * <p>
     * Interpolation style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINEAR</code>: Show as default, linear style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMOOTH</code>: Show as a smooth curve.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STEPPED</code>: Show steps in line.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lineInterpolation
     *        Interpolation style for line series.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINEAR</code>: Show as default, linear style.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMOOTH</code>: Show as a smooth curve.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STEPPED</code>: Show steps in line.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineInterpolation
     */

    public LineChartLineStyleSettings withLineInterpolation(LineInterpolation lineInterpolation) {
        this.lineInterpolation = lineInterpolation.toString();
        return this;
    }

    /**
     * <p>
     * Line style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>: Show as a solid line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>: Show as a dotted line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>: Show as a dashed line.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lineStyle
     *        Line style for line series.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SOLID</code>: Show as a solid line.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOTTED</code>: Show as a dotted line.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DASHED</code>: Show as a dashed line.
     *        </p>
     *        </li>
     * @see LineChartLineStyle
     */

    public void setLineStyle(String lineStyle) {
        this.lineStyle = lineStyle;
    }

    /**
     * <p>
     * Line style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>: Show as a solid line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>: Show as a dotted line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>: Show as a dashed line.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Line style for line series.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SOLID</code>: Show as a solid line.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DOTTED</code>: Show as a dotted line.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DASHED</code>: Show as a dashed line.
     *         </p>
     *         </li>
     * @see LineChartLineStyle
     */

    public String getLineStyle() {
        return this.lineStyle;
    }

    /**
     * <p>
     * Line style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>: Show as a solid line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>: Show as a dotted line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>: Show as a dashed line.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lineStyle
     *        Line style for line series.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SOLID</code>: Show as a solid line.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOTTED</code>: Show as a dotted line.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DASHED</code>: Show as a dashed line.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineChartLineStyle
     */

    public LineChartLineStyleSettings withLineStyle(String lineStyle) {
        setLineStyle(lineStyle);
        return this;
    }

    /**
     * <p>
     * Line style for line series.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>: Show as a solid line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>: Show as a dotted line.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>: Show as a dashed line.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lineStyle
     *        Line style for line series.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SOLID</code>: Show as a solid line.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOTTED</code>: Show as a dotted line.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DASHED</code>: Show as a dashed line.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineChartLineStyle
     */

    public LineChartLineStyleSettings withLineStyle(LineChartLineStyle lineStyle) {
        this.lineStyle = lineStyle.toString();
        return this;
    }

    /**
     * <p>
     * Width that determines the line thickness.
     * </p>
     * 
     * @param lineWidth
     *        Width that determines the line thickness.
     */

    public void setLineWidth(String lineWidth) {
        this.lineWidth = lineWidth;
    }

    /**
     * <p>
     * Width that determines the line thickness.
     * </p>
     * 
     * @return Width that determines the line thickness.
     */

    public String getLineWidth() {
        return this.lineWidth;
    }

    /**
     * <p>
     * Width that determines the line thickness.
     * </p>
     * 
     * @param lineWidth
     *        Width that determines the line thickness.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartLineStyleSettings withLineWidth(String lineWidth) {
        setLineWidth(lineWidth);
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
        if (getLineVisibility() != null)
            sb.append("LineVisibility: ").append(getLineVisibility()).append(",");
        if (getLineInterpolation() != null)
            sb.append("LineInterpolation: ").append(getLineInterpolation()).append(",");
        if (getLineStyle() != null)
            sb.append("LineStyle: ").append(getLineStyle()).append(",");
        if (getLineWidth() != null)
            sb.append("LineWidth: ").append(getLineWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineChartLineStyleSettings == false)
            return false;
        LineChartLineStyleSettings other = (LineChartLineStyleSettings) obj;
        if (other.getLineVisibility() == null ^ this.getLineVisibility() == null)
            return false;
        if (other.getLineVisibility() != null && other.getLineVisibility().equals(this.getLineVisibility()) == false)
            return false;
        if (other.getLineInterpolation() == null ^ this.getLineInterpolation() == null)
            return false;
        if (other.getLineInterpolation() != null && other.getLineInterpolation().equals(this.getLineInterpolation()) == false)
            return false;
        if (other.getLineStyle() == null ^ this.getLineStyle() == null)
            return false;
        if (other.getLineStyle() != null && other.getLineStyle().equals(this.getLineStyle()) == false)
            return false;
        if (other.getLineWidth() == null ^ this.getLineWidth() == null)
            return false;
        if (other.getLineWidth() != null && other.getLineWidth().equals(this.getLineWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineVisibility() == null) ? 0 : getLineVisibility().hashCode());
        hashCode = prime * hashCode + ((getLineInterpolation() == null) ? 0 : getLineInterpolation().hashCode());
        hashCode = prime * hashCode + ((getLineStyle() == null) ? 0 : getLineStyle().hashCode());
        hashCode = prime * hashCode + ((getLineWidth() == null) ? 0 : getLineWidth().hashCode());
        return hashCode;
    }

    @Override
    public LineChartLineStyleSettings clone() {
        try {
            return (LineChartLineStyleSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LineChartLineStyleSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

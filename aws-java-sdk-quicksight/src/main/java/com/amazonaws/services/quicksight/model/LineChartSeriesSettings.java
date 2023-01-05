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
 * The options that determine the presentation of a line series in the visual
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LineChartSeriesSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineChartSeriesSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Line styles options for a line series in <code>LineChartVisual</code>.
     * </p>
     */
    private LineChartLineStyleSettings lineStyleSettings;
    /**
     * <p>
     * Marker styles options for a line series in <code>LineChartVisual</code>.
     * </p>
     */
    private LineChartMarkerStyleSettings markerStyleSettings;

    /**
     * <p>
     * Line styles options for a line series in <code>LineChartVisual</code>.
     * </p>
     * 
     * @param lineStyleSettings
     *        Line styles options for a line series in <code>LineChartVisual</code>.
     */

    public void setLineStyleSettings(LineChartLineStyleSettings lineStyleSettings) {
        this.lineStyleSettings = lineStyleSettings;
    }

    /**
     * <p>
     * Line styles options for a line series in <code>LineChartVisual</code>.
     * </p>
     * 
     * @return Line styles options for a line series in <code>LineChartVisual</code>.
     */

    public LineChartLineStyleSettings getLineStyleSettings() {
        return this.lineStyleSettings;
    }

    /**
     * <p>
     * Line styles options for a line series in <code>LineChartVisual</code>.
     * </p>
     * 
     * @param lineStyleSettings
     *        Line styles options for a line series in <code>LineChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartSeriesSettings withLineStyleSettings(LineChartLineStyleSettings lineStyleSettings) {
        setLineStyleSettings(lineStyleSettings);
        return this;
    }

    /**
     * <p>
     * Marker styles options for a line series in <code>LineChartVisual</code>.
     * </p>
     * 
     * @param markerStyleSettings
     *        Marker styles options for a line series in <code>LineChartVisual</code>.
     */

    public void setMarkerStyleSettings(LineChartMarkerStyleSettings markerStyleSettings) {
        this.markerStyleSettings = markerStyleSettings;
    }

    /**
     * <p>
     * Marker styles options for a line series in <code>LineChartVisual</code>.
     * </p>
     * 
     * @return Marker styles options for a line series in <code>LineChartVisual</code>.
     */

    public LineChartMarkerStyleSettings getMarkerStyleSettings() {
        return this.markerStyleSettings;
    }

    /**
     * <p>
     * Marker styles options for a line series in <code>LineChartVisual</code>.
     * </p>
     * 
     * @param markerStyleSettings
     *        Marker styles options for a line series in <code>LineChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartSeriesSettings withMarkerStyleSettings(LineChartMarkerStyleSettings markerStyleSettings) {
        setMarkerStyleSettings(markerStyleSettings);
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
        if (getLineStyleSettings() != null)
            sb.append("LineStyleSettings: ").append(getLineStyleSettings()).append(",");
        if (getMarkerStyleSettings() != null)
            sb.append("MarkerStyleSettings: ").append(getMarkerStyleSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineChartSeriesSettings == false)
            return false;
        LineChartSeriesSettings other = (LineChartSeriesSettings) obj;
        if (other.getLineStyleSettings() == null ^ this.getLineStyleSettings() == null)
            return false;
        if (other.getLineStyleSettings() != null && other.getLineStyleSettings().equals(this.getLineStyleSettings()) == false)
            return false;
        if (other.getMarkerStyleSettings() == null ^ this.getMarkerStyleSettings() == null)
            return false;
        if (other.getMarkerStyleSettings() != null && other.getMarkerStyleSettings().equals(this.getMarkerStyleSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineStyleSettings() == null) ? 0 : getLineStyleSettings().hashCode());
        hashCode = prime * hashCode + ((getMarkerStyleSettings() == null) ? 0 : getMarkerStyleSettings().hashCode());
        return hashCode;
    }

    @Override
    public LineChartSeriesSettings clone() {
        try {
            return (LineChartSeriesSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LineChartSeriesSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

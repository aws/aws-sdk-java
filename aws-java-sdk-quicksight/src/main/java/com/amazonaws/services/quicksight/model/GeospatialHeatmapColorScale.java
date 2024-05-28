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
 * The color scale specification for the heatmap point style.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GeospatialHeatmapColorScale"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeospatialHeatmapColorScale implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of colors to be used in heatmap point style.
     * </p>
     */
    private java.util.List<GeospatialHeatmapDataColor> colors;

    /**
     * <p>
     * The list of colors to be used in heatmap point style.
     * </p>
     * 
     * @return The list of colors to be used in heatmap point style.
     */

    public java.util.List<GeospatialHeatmapDataColor> getColors() {
        return colors;
    }

    /**
     * <p>
     * The list of colors to be used in heatmap point style.
     * </p>
     * 
     * @param colors
     *        The list of colors to be used in heatmap point style.
     */

    public void setColors(java.util.Collection<GeospatialHeatmapDataColor> colors) {
        if (colors == null) {
            this.colors = null;
            return;
        }

        this.colors = new java.util.ArrayList<GeospatialHeatmapDataColor>(colors);
    }

    /**
     * <p>
     * The list of colors to be used in heatmap point style.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColors(java.util.Collection)} or {@link #withColors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param colors
     *        The list of colors to be used in heatmap point style.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialHeatmapColorScale withColors(GeospatialHeatmapDataColor... colors) {
        if (this.colors == null) {
            setColors(new java.util.ArrayList<GeospatialHeatmapDataColor>(colors.length));
        }
        for (GeospatialHeatmapDataColor ele : colors) {
            this.colors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of colors to be used in heatmap point style.
     * </p>
     * 
     * @param colors
     *        The list of colors to be used in heatmap point style.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialHeatmapColorScale withColors(java.util.Collection<GeospatialHeatmapDataColor> colors) {
        setColors(colors);
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
        if (getColors() != null)
            sb.append("Colors: ").append(getColors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeospatialHeatmapColorScale == false)
            return false;
        GeospatialHeatmapColorScale other = (GeospatialHeatmapColorScale) obj;
        if (other.getColors() == null ^ this.getColors() == null)
            return false;
        if (other.getColors() != null && other.getColors().equals(this.getColors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColors() == null) ? 0 : getColors().hashCode());
        return hashCode;
    }

    @Override
    public GeospatialHeatmapColorScale clone() {
        try {
            return (GeospatialHeatmapColorScale) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GeospatialHeatmapColorScaleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

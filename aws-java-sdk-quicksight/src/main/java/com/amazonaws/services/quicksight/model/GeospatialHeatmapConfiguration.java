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
 * The heatmap configuration of the geospatial point style.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GeospatialHeatmapConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeospatialHeatmapConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The color scale specification for the heatmap point style.
     * </p>
     */
    private GeospatialHeatmapColorScale heatmapColor;

    /**
     * <p>
     * The color scale specification for the heatmap point style.
     * </p>
     * 
     * @param heatmapColor
     *        The color scale specification for the heatmap point style.
     */

    public void setHeatmapColor(GeospatialHeatmapColorScale heatmapColor) {
        this.heatmapColor = heatmapColor;
    }

    /**
     * <p>
     * The color scale specification for the heatmap point style.
     * </p>
     * 
     * @return The color scale specification for the heatmap point style.
     */

    public GeospatialHeatmapColorScale getHeatmapColor() {
        return this.heatmapColor;
    }

    /**
     * <p>
     * The color scale specification for the heatmap point style.
     * </p>
     * 
     * @param heatmapColor
     *        The color scale specification for the heatmap point style.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialHeatmapConfiguration withHeatmapColor(GeospatialHeatmapColorScale heatmapColor) {
        setHeatmapColor(heatmapColor);
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
        if (getHeatmapColor() != null)
            sb.append("HeatmapColor: ").append(getHeatmapColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeospatialHeatmapConfiguration == false)
            return false;
        GeospatialHeatmapConfiguration other = (GeospatialHeatmapConfiguration) obj;
        if (other.getHeatmapColor() == null ^ this.getHeatmapColor() == null)
            return false;
        if (other.getHeatmapColor() != null && other.getHeatmapColor().equals(this.getHeatmapColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeatmapColor() == null) ? 0 : getHeatmapColor().hashCode());
        return hashCode;
    }

    @Override
    public GeospatialHeatmapConfiguration clone() {
        try {
            return (GeospatialHeatmapConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GeospatialHeatmapConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

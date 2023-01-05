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
 * The configuration for a <code>FilledMapVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilledMapConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilledMapConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private FilledMapFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a <code>FilledMapVisual</code>.
     * </p>
     */
    private FilledMapSortConfiguration sortConfiguration;
    /**
     * <p>
     * The legend display setup of the visual.
     * </p>
     */
    private LegendOptions legend;
    /**
     * <p>
     * The tooltip display setup of the visual.
     * </p>
     */
    private TooltipOptions tooltip;
    /**
     * <p>
     * The window options of the filled map visual.
     * </p>
     */
    private GeospatialWindowOptions windowOptions;
    /**
     * <p>
     * The map style options of the filled map visual.
     * </p>
     */
    private GeospatialMapStyleOptions mapStyleOptions;

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     */

    public void setFieldWells(FilledMapFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public FilledMapFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapConfiguration withFieldWells(FilledMapFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a <code>FilledMapVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>FilledMapVisual</code>.
     */

    public void setSortConfiguration(FilledMapSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>FilledMapVisual</code>.
     * </p>
     * 
     * @return The sort configuration of a <code>FilledMapVisual</code>.
     */

    public FilledMapSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>FilledMapVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>FilledMapVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapConfiguration withSortConfiguration(FilledMapSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The legend display setup of the visual.
     * </p>
     * 
     * @param legend
     *        The legend display setup of the visual.
     */

    public void setLegend(LegendOptions legend) {
        this.legend = legend;
    }

    /**
     * <p>
     * The legend display setup of the visual.
     * </p>
     * 
     * @return The legend display setup of the visual.
     */

    public LegendOptions getLegend() {
        return this.legend;
    }

    /**
     * <p>
     * The legend display setup of the visual.
     * </p>
     * 
     * @param legend
     *        The legend display setup of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapConfiguration withLegend(LegendOptions legend) {
        setLegend(legend);
        return this;
    }

    /**
     * <p>
     * The tooltip display setup of the visual.
     * </p>
     * 
     * @param tooltip
     *        The tooltip display setup of the visual.
     */

    public void setTooltip(TooltipOptions tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * <p>
     * The tooltip display setup of the visual.
     * </p>
     * 
     * @return The tooltip display setup of the visual.
     */

    public TooltipOptions getTooltip() {
        return this.tooltip;
    }

    /**
     * <p>
     * The tooltip display setup of the visual.
     * </p>
     * 
     * @param tooltip
     *        The tooltip display setup of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapConfiguration withTooltip(TooltipOptions tooltip) {
        setTooltip(tooltip);
        return this;
    }

    /**
     * <p>
     * The window options of the filled map visual.
     * </p>
     * 
     * @param windowOptions
     *        The window options of the filled map visual.
     */

    public void setWindowOptions(GeospatialWindowOptions windowOptions) {
        this.windowOptions = windowOptions;
    }

    /**
     * <p>
     * The window options of the filled map visual.
     * </p>
     * 
     * @return The window options of the filled map visual.
     */

    public GeospatialWindowOptions getWindowOptions() {
        return this.windowOptions;
    }

    /**
     * <p>
     * The window options of the filled map visual.
     * </p>
     * 
     * @param windowOptions
     *        The window options of the filled map visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapConfiguration withWindowOptions(GeospatialWindowOptions windowOptions) {
        setWindowOptions(windowOptions);
        return this;
    }

    /**
     * <p>
     * The map style options of the filled map visual.
     * </p>
     * 
     * @param mapStyleOptions
     *        The map style options of the filled map visual.
     */

    public void setMapStyleOptions(GeospatialMapStyleOptions mapStyleOptions) {
        this.mapStyleOptions = mapStyleOptions;
    }

    /**
     * <p>
     * The map style options of the filled map visual.
     * </p>
     * 
     * @return The map style options of the filled map visual.
     */

    public GeospatialMapStyleOptions getMapStyleOptions() {
        return this.mapStyleOptions;
    }

    /**
     * <p>
     * The map style options of the filled map visual.
     * </p>
     * 
     * @param mapStyleOptions
     *        The map style options of the filled map visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapConfiguration withMapStyleOptions(GeospatialMapStyleOptions mapStyleOptions) {
        setMapStyleOptions(mapStyleOptions);
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
        if (getFieldWells() != null)
            sb.append("FieldWells: ").append(getFieldWells()).append(",");
        if (getSortConfiguration() != null)
            sb.append("SortConfiguration: ").append(getSortConfiguration()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getTooltip() != null)
            sb.append("Tooltip: ").append(getTooltip()).append(",");
        if (getWindowOptions() != null)
            sb.append("WindowOptions: ").append(getWindowOptions()).append(",");
        if (getMapStyleOptions() != null)
            sb.append("MapStyleOptions: ").append(getMapStyleOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilledMapConfiguration == false)
            return false;
        FilledMapConfiguration other = (FilledMapConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getLegend() == null ^ this.getLegend() == null)
            return false;
        if (other.getLegend() != null && other.getLegend().equals(this.getLegend()) == false)
            return false;
        if (other.getTooltip() == null ^ this.getTooltip() == null)
            return false;
        if (other.getTooltip() != null && other.getTooltip().equals(this.getTooltip()) == false)
            return false;
        if (other.getWindowOptions() == null ^ this.getWindowOptions() == null)
            return false;
        if (other.getWindowOptions() != null && other.getWindowOptions().equals(this.getWindowOptions()) == false)
            return false;
        if (other.getMapStyleOptions() == null ^ this.getMapStyleOptions() == null)
            return false;
        if (other.getMapStyleOptions() != null && other.getMapStyleOptions().equals(this.getMapStyleOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldWells() == null) ? 0 : getFieldWells().hashCode());
        hashCode = prime * hashCode + ((getSortConfiguration() == null) ? 0 : getSortConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        hashCode = prime * hashCode + ((getWindowOptions() == null) ? 0 : getWindowOptions().hashCode());
        hashCode = prime * hashCode + ((getMapStyleOptions() == null) ? 0 : getMapStyleOptions().hashCode());
        return hashCode;
    }

    @Override
    public FilledMapConfiguration clone() {
        try {
            return (FilledMapConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilledMapConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

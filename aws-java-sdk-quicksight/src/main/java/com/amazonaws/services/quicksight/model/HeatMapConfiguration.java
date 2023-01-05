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
 * The configuration of a heat map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/HeatMapConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeatMapConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private HeatMapFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a heat map.
     * </p>
     */
    private HeatMapSortConfiguration sortConfiguration;
    /**
     * <p>
     * The label options of the row that is displayed in a <code>heat map</code>.
     * </p>
     */
    private ChartAxisLabelOptions rowLabelOptions;
    /**
     * <p>
     * The label options of the column that is displayed in a heat map.
     * </p>
     */
    private ChartAxisLabelOptions columnLabelOptions;
    /**
     * <p>
     * The color options (gradient color, point of divergence) in a heat map.
     * </p>
     */
    private ColorScale colorScale;
    /**
     * <p>
     * The legend display setup of the visual.
     * </p>
     */
    private LegendOptions legend;
    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     */
    private DataLabelOptions dataLabels;
    /**
     * <p>
     * The tooltip display setup of the visual.
     * </p>
     */
    private TooltipOptions tooltip;

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     */

    public void setFieldWells(HeatMapFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public HeatMapFieldWells getFieldWells() {
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

    public HeatMapConfiguration withFieldWells(HeatMapFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a heat map.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a heat map.
     */

    public void setSortConfiguration(HeatMapSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a heat map.
     * </p>
     * 
     * @return The sort configuration of a heat map.
     */

    public HeatMapSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a heat map.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapConfiguration withSortConfiguration(HeatMapSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The label options of the row that is displayed in a <code>heat map</code>.
     * </p>
     * 
     * @param rowLabelOptions
     *        The label options of the row that is displayed in a <code>heat map</code>.
     */

    public void setRowLabelOptions(ChartAxisLabelOptions rowLabelOptions) {
        this.rowLabelOptions = rowLabelOptions;
    }

    /**
     * <p>
     * The label options of the row that is displayed in a <code>heat map</code>.
     * </p>
     * 
     * @return The label options of the row that is displayed in a <code>heat map</code>.
     */

    public ChartAxisLabelOptions getRowLabelOptions() {
        return this.rowLabelOptions;
    }

    /**
     * <p>
     * The label options of the row that is displayed in a <code>heat map</code>.
     * </p>
     * 
     * @param rowLabelOptions
     *        The label options of the row that is displayed in a <code>heat map</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapConfiguration withRowLabelOptions(ChartAxisLabelOptions rowLabelOptions) {
        setRowLabelOptions(rowLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label options of the column that is displayed in a heat map.
     * </p>
     * 
     * @param columnLabelOptions
     *        The label options of the column that is displayed in a heat map.
     */

    public void setColumnLabelOptions(ChartAxisLabelOptions columnLabelOptions) {
        this.columnLabelOptions = columnLabelOptions;
    }

    /**
     * <p>
     * The label options of the column that is displayed in a heat map.
     * </p>
     * 
     * @return The label options of the column that is displayed in a heat map.
     */

    public ChartAxisLabelOptions getColumnLabelOptions() {
        return this.columnLabelOptions;
    }

    /**
     * <p>
     * The label options of the column that is displayed in a heat map.
     * </p>
     * 
     * @param columnLabelOptions
     *        The label options of the column that is displayed in a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapConfiguration withColumnLabelOptions(ChartAxisLabelOptions columnLabelOptions) {
        setColumnLabelOptions(columnLabelOptions);
        return this;
    }

    /**
     * <p>
     * The color options (gradient color, point of divergence) in a heat map.
     * </p>
     * 
     * @param colorScale
     *        The color options (gradient color, point of divergence) in a heat map.
     */

    public void setColorScale(ColorScale colorScale) {
        this.colorScale = colorScale;
    }

    /**
     * <p>
     * The color options (gradient color, point of divergence) in a heat map.
     * </p>
     * 
     * @return The color options (gradient color, point of divergence) in a heat map.
     */

    public ColorScale getColorScale() {
        return this.colorScale;
    }

    /**
     * <p>
     * The color options (gradient color, point of divergence) in a heat map.
     * </p>
     * 
     * @param colorScale
     *        The color options (gradient color, point of divergence) in a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapConfiguration withColorScale(ColorScale colorScale) {
        setColorScale(colorScale);
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

    public HeatMapConfiguration withLegend(LegendOptions legend) {
        setLegend(legend);
        return this;
    }

    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * 
     * @param dataLabels
     *        The options that determine if visual data labels are displayed.
     */

    public void setDataLabels(DataLabelOptions dataLabels) {
        this.dataLabels = dataLabels;
    }

    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * 
     * @return The options that determine if visual data labels are displayed.
     */

    public DataLabelOptions getDataLabels() {
        return this.dataLabels;
    }

    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * 
     * @param dataLabels
     *        The options that determine if visual data labels are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapConfiguration withDataLabels(DataLabelOptions dataLabels) {
        setDataLabels(dataLabels);
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

    public HeatMapConfiguration withTooltip(TooltipOptions tooltip) {
        setTooltip(tooltip);
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
        if (getRowLabelOptions() != null)
            sb.append("RowLabelOptions: ").append(getRowLabelOptions()).append(",");
        if (getColumnLabelOptions() != null)
            sb.append("ColumnLabelOptions: ").append(getColumnLabelOptions()).append(",");
        if (getColorScale() != null)
            sb.append("ColorScale: ").append(getColorScale()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getDataLabels() != null)
            sb.append("DataLabels: ").append(getDataLabels()).append(",");
        if (getTooltip() != null)
            sb.append("Tooltip: ").append(getTooltip());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeatMapConfiguration == false)
            return false;
        HeatMapConfiguration other = (HeatMapConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getRowLabelOptions() == null ^ this.getRowLabelOptions() == null)
            return false;
        if (other.getRowLabelOptions() != null && other.getRowLabelOptions().equals(this.getRowLabelOptions()) == false)
            return false;
        if (other.getColumnLabelOptions() == null ^ this.getColumnLabelOptions() == null)
            return false;
        if (other.getColumnLabelOptions() != null && other.getColumnLabelOptions().equals(this.getColumnLabelOptions()) == false)
            return false;
        if (other.getColorScale() == null ^ this.getColorScale() == null)
            return false;
        if (other.getColorScale() != null && other.getColorScale().equals(this.getColorScale()) == false)
            return false;
        if (other.getLegend() == null ^ this.getLegend() == null)
            return false;
        if (other.getLegend() != null && other.getLegend().equals(this.getLegend()) == false)
            return false;
        if (other.getDataLabels() == null ^ this.getDataLabels() == null)
            return false;
        if (other.getDataLabels() != null && other.getDataLabels().equals(this.getDataLabels()) == false)
            return false;
        if (other.getTooltip() == null ^ this.getTooltip() == null)
            return false;
        if (other.getTooltip() != null && other.getTooltip().equals(this.getTooltip()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldWells() == null) ? 0 : getFieldWells().hashCode());
        hashCode = prime * hashCode + ((getSortConfiguration() == null) ? 0 : getSortConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRowLabelOptions() == null) ? 0 : getRowLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getColumnLabelOptions() == null) ? 0 : getColumnLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getColorScale() == null) ? 0 : getColorScale().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getDataLabels() == null) ? 0 : getDataLabels().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        return hashCode;
    }

    @Override
    public HeatMapConfiguration clone() {
        try {
            return (HeatMapConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.HeatMapConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

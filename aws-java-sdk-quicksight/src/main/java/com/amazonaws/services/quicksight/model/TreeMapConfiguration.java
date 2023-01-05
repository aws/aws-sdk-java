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
 * The configuration of a tree map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TreeMapConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TreeMapConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private TreeMapFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a tree map.
     * </p>
     */
    private TreeMapSortConfiguration sortConfiguration;
    /**
     * <p>
     * The label options (label text, label visibility) of the groups that are displayed in a tree map.
     * </p>
     */
    private ChartAxisLabelOptions groupLabelOptions;
    /**
     * <p>
     * The label options (label text, label visibility) of the sizes that are displayed in a tree map.
     * </p>
     */
    private ChartAxisLabelOptions sizeLabelOptions;
    /**
     * <p>
     * The label options (label text, label visibility) for the colors displayed in a tree map.
     * </p>
     */
    private ChartAxisLabelOptions colorLabelOptions;
    /**
     * <p>
     * The color options (gradient color, point of divergence) of a tree map.
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

    public void setFieldWells(TreeMapFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public TreeMapFieldWells getFieldWells() {
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

    public TreeMapConfiguration withFieldWells(TreeMapFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a tree map.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a tree map.
     */

    public void setSortConfiguration(TreeMapSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a tree map.
     * </p>
     * 
     * @return The sort configuration of a tree map.
     */

    public TreeMapSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a tree map.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a tree map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapConfiguration withSortConfiguration(TreeMapSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility) of the groups that are displayed in a tree map.
     * </p>
     * 
     * @param groupLabelOptions
     *        The label options (label text, label visibility) of the groups that are displayed in a tree map.
     */

    public void setGroupLabelOptions(ChartAxisLabelOptions groupLabelOptions) {
        this.groupLabelOptions = groupLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility) of the groups that are displayed in a tree map.
     * </p>
     * 
     * @return The label options (label text, label visibility) of the groups that are displayed in a tree map.
     */

    public ChartAxisLabelOptions getGroupLabelOptions() {
        return this.groupLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility) of the groups that are displayed in a tree map.
     * </p>
     * 
     * @param groupLabelOptions
     *        The label options (label text, label visibility) of the groups that are displayed in a tree map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapConfiguration withGroupLabelOptions(ChartAxisLabelOptions groupLabelOptions) {
        setGroupLabelOptions(groupLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility) of the sizes that are displayed in a tree map.
     * </p>
     * 
     * @param sizeLabelOptions
     *        The label options (label text, label visibility) of the sizes that are displayed in a tree map.
     */

    public void setSizeLabelOptions(ChartAxisLabelOptions sizeLabelOptions) {
        this.sizeLabelOptions = sizeLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility) of the sizes that are displayed in a tree map.
     * </p>
     * 
     * @return The label options (label text, label visibility) of the sizes that are displayed in a tree map.
     */

    public ChartAxisLabelOptions getSizeLabelOptions() {
        return this.sizeLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility) of the sizes that are displayed in a tree map.
     * </p>
     * 
     * @param sizeLabelOptions
     *        The label options (label text, label visibility) of the sizes that are displayed in a tree map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapConfiguration withSizeLabelOptions(ChartAxisLabelOptions sizeLabelOptions) {
        setSizeLabelOptions(sizeLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility) for the colors displayed in a tree map.
     * </p>
     * 
     * @param colorLabelOptions
     *        The label options (label text, label visibility) for the colors displayed in a tree map.
     */

    public void setColorLabelOptions(ChartAxisLabelOptions colorLabelOptions) {
        this.colorLabelOptions = colorLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility) for the colors displayed in a tree map.
     * </p>
     * 
     * @return The label options (label text, label visibility) for the colors displayed in a tree map.
     */

    public ChartAxisLabelOptions getColorLabelOptions() {
        return this.colorLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility) for the colors displayed in a tree map.
     * </p>
     * 
     * @param colorLabelOptions
     *        The label options (label text, label visibility) for the colors displayed in a tree map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapConfiguration withColorLabelOptions(ChartAxisLabelOptions colorLabelOptions) {
        setColorLabelOptions(colorLabelOptions);
        return this;
    }

    /**
     * <p>
     * The color options (gradient color, point of divergence) of a tree map.
     * </p>
     * 
     * @param colorScale
     *        The color options (gradient color, point of divergence) of a tree map.
     */

    public void setColorScale(ColorScale colorScale) {
        this.colorScale = colorScale;
    }

    /**
     * <p>
     * The color options (gradient color, point of divergence) of a tree map.
     * </p>
     * 
     * @return The color options (gradient color, point of divergence) of a tree map.
     */

    public ColorScale getColorScale() {
        return this.colorScale;
    }

    /**
     * <p>
     * The color options (gradient color, point of divergence) of a tree map.
     * </p>
     * 
     * @param colorScale
     *        The color options (gradient color, point of divergence) of a tree map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapConfiguration withColorScale(ColorScale colorScale) {
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

    public TreeMapConfiguration withLegend(LegendOptions legend) {
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

    public TreeMapConfiguration withDataLabels(DataLabelOptions dataLabels) {
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

    public TreeMapConfiguration withTooltip(TooltipOptions tooltip) {
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
        if (getGroupLabelOptions() != null)
            sb.append("GroupLabelOptions: ").append(getGroupLabelOptions()).append(",");
        if (getSizeLabelOptions() != null)
            sb.append("SizeLabelOptions: ").append(getSizeLabelOptions()).append(",");
        if (getColorLabelOptions() != null)
            sb.append("ColorLabelOptions: ").append(getColorLabelOptions()).append(",");
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

        if (obj instanceof TreeMapConfiguration == false)
            return false;
        TreeMapConfiguration other = (TreeMapConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getGroupLabelOptions() == null ^ this.getGroupLabelOptions() == null)
            return false;
        if (other.getGroupLabelOptions() != null && other.getGroupLabelOptions().equals(this.getGroupLabelOptions()) == false)
            return false;
        if (other.getSizeLabelOptions() == null ^ this.getSizeLabelOptions() == null)
            return false;
        if (other.getSizeLabelOptions() != null && other.getSizeLabelOptions().equals(this.getSizeLabelOptions()) == false)
            return false;
        if (other.getColorLabelOptions() == null ^ this.getColorLabelOptions() == null)
            return false;
        if (other.getColorLabelOptions() != null && other.getColorLabelOptions().equals(this.getColorLabelOptions()) == false)
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
        hashCode = prime * hashCode + ((getGroupLabelOptions() == null) ? 0 : getGroupLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getSizeLabelOptions() == null) ? 0 : getSizeLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getColorLabelOptions() == null) ? 0 : getColorLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getColorScale() == null) ? 0 : getColorScale().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getDataLabels() == null) ? 0 : getDataLabels().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        return hashCode;
    }

    @Override
    public TreeMapConfiguration clone() {
        try {
            return (TreeMapConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TreeMapConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

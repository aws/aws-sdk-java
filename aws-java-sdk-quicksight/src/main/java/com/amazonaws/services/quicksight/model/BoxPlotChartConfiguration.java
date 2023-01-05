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
 * The configuration of a <code>BoxPlotVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BoxPlotChartConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BoxPlotChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private BoxPlotFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a <code>BoxPlotVisual</code>.
     * </p>
     */
    private BoxPlotSortConfiguration sortConfiguration;
    /**
     * <p>
     * The box plot chart options for a box plot visual
     * </p>
     */
    private BoxPlotOptions boxPlotOptions;
    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a box plot category.
     * </p>
     */
    private AxisDisplayOptions categoryAxis;
    /**
     * <p>
     * The label options (label text, label visibility and sort Icon visibility) of a box plot category.
     * </p>
     */
    private ChartAxisLabelOptions categoryLabelOptions;
    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a box plot category.
     * </p>
     */
    private AxisDisplayOptions primaryYAxisDisplayOptions;
    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) of a box plot value.
     * </p>
     */
    private ChartAxisLabelOptions primaryYAxisLabelOptions;

    private LegendOptions legend;
    /**
     * <p>
     * The tooltip display setup of the visual.
     * </p>
     */
    private TooltipOptions tooltip;
    /**
     * <p>
     * The reference line setup of the visual.
     * </p>
     */
    private java.util.List<ReferenceLine> referenceLines;
    /**
     * <p>
     * The palette (chart color) display setup of the visual.
     * </p>
     */
    private VisualPalette visualPalette;

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     */

    public void setFieldWells(BoxPlotFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public BoxPlotFieldWells getFieldWells() {
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

    public BoxPlotChartConfiguration withFieldWells(BoxPlotFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a <code>BoxPlotVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>BoxPlotVisual</code>.
     */

    public void setSortConfiguration(BoxPlotSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>BoxPlotVisual</code>.
     * </p>
     * 
     * @return The sort configuration of a <code>BoxPlotVisual</code>.
     */

    public BoxPlotSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>BoxPlotVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>BoxPlotVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withSortConfiguration(BoxPlotSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The box plot chart options for a box plot visual
     * </p>
     * 
     * @param boxPlotOptions
     *        The box plot chart options for a box plot visual
     */

    public void setBoxPlotOptions(BoxPlotOptions boxPlotOptions) {
        this.boxPlotOptions = boxPlotOptions;
    }

    /**
     * <p>
     * The box plot chart options for a box plot visual
     * </p>
     * 
     * @return The box plot chart options for a box plot visual
     */

    public BoxPlotOptions getBoxPlotOptions() {
        return this.boxPlotOptions;
    }

    /**
     * <p>
     * The box plot chart options for a box plot visual
     * </p>
     * 
     * @param boxPlotOptions
     *        The box plot chart options for a box plot visual
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withBoxPlotOptions(BoxPlotOptions boxPlotOptions) {
        setBoxPlotOptions(boxPlotOptions);
        return this;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a box plot category.
     * </p>
     * 
     * @param categoryAxis
     *        The label display options (grid line, range, scale, axis step) of a box plot category.
     */

    public void setCategoryAxis(AxisDisplayOptions categoryAxis) {
        this.categoryAxis = categoryAxis;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a box plot category.
     * </p>
     * 
     * @return The label display options (grid line, range, scale, axis step) of a box plot category.
     */

    public AxisDisplayOptions getCategoryAxis() {
        return this.categoryAxis;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a box plot category.
     * </p>
     * 
     * @param categoryAxis
     *        The label display options (grid line, range, scale, axis step) of a box plot category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withCategoryAxis(AxisDisplayOptions categoryAxis) {
        setCategoryAxis(categoryAxis);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort Icon visibility) of a box plot category.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options (label text, label visibility and sort Icon visibility) of a box plot category.
     */

    public void setCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        this.categoryLabelOptions = categoryLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort Icon visibility) of a box plot category.
     * </p>
     * 
     * @return The label options (label text, label visibility and sort Icon visibility) of a box plot category.
     */

    public ChartAxisLabelOptions getCategoryLabelOptions() {
        return this.categoryLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort Icon visibility) of a box plot category.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options (label text, label visibility and sort Icon visibility) of a box plot category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        setCategoryLabelOptions(categoryLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a box plot category.
     * </p>
     * 
     * @param primaryYAxisDisplayOptions
     *        The label display options (grid line, range, scale, axis step) of a box plot category.
     */

    public void setPrimaryYAxisDisplayOptions(AxisDisplayOptions primaryYAxisDisplayOptions) {
        this.primaryYAxisDisplayOptions = primaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a box plot category.
     * </p>
     * 
     * @return The label display options (grid line, range, scale, axis step) of a box plot category.
     */

    public AxisDisplayOptions getPrimaryYAxisDisplayOptions() {
        return this.primaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a box plot category.
     * </p>
     * 
     * @param primaryYAxisDisplayOptions
     *        The label display options (grid line, range, scale, axis step) of a box plot category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withPrimaryYAxisDisplayOptions(AxisDisplayOptions primaryYAxisDisplayOptions) {
        setPrimaryYAxisDisplayOptions(primaryYAxisDisplayOptions);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) of a box plot value.
     * </p>
     * 
     * @param primaryYAxisLabelOptions
     *        The label options (label text, label visibility and sort icon visibility) of a box plot value.
     */

    public void setPrimaryYAxisLabelOptions(ChartAxisLabelOptions primaryYAxisLabelOptions) {
        this.primaryYAxisLabelOptions = primaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) of a box plot value.
     * </p>
     * 
     * @return The label options (label text, label visibility and sort icon visibility) of a box plot value.
     */

    public ChartAxisLabelOptions getPrimaryYAxisLabelOptions() {
        return this.primaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) of a box plot value.
     * </p>
     * 
     * @param primaryYAxisLabelOptions
     *        The label options (label text, label visibility and sort icon visibility) of a box plot value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withPrimaryYAxisLabelOptions(ChartAxisLabelOptions primaryYAxisLabelOptions) {
        setPrimaryYAxisLabelOptions(primaryYAxisLabelOptions);
        return this;
    }

    /**
     * @param legend
     */

    public void setLegend(LegendOptions legend) {
        this.legend = legend;
    }

    /**
     * @return
     */

    public LegendOptions getLegend() {
        return this.legend;
    }

    /**
     * @param legend
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withLegend(LegendOptions legend) {
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

    public BoxPlotChartConfiguration withTooltip(TooltipOptions tooltip) {
        setTooltip(tooltip);
        return this;
    }

    /**
     * <p>
     * The reference line setup of the visual.
     * </p>
     * 
     * @return The reference line setup of the visual.
     */

    public java.util.List<ReferenceLine> getReferenceLines() {
        return referenceLines;
    }

    /**
     * <p>
     * The reference line setup of the visual.
     * </p>
     * 
     * @param referenceLines
     *        The reference line setup of the visual.
     */

    public void setReferenceLines(java.util.Collection<ReferenceLine> referenceLines) {
        if (referenceLines == null) {
            this.referenceLines = null;
            return;
        }

        this.referenceLines = new java.util.ArrayList<ReferenceLine>(referenceLines);
    }

    /**
     * <p>
     * The reference line setup of the visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceLines(java.util.Collection)} or {@link #withReferenceLines(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param referenceLines
     *        The reference line setup of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withReferenceLines(ReferenceLine... referenceLines) {
        if (this.referenceLines == null) {
            setReferenceLines(new java.util.ArrayList<ReferenceLine>(referenceLines.length));
        }
        for (ReferenceLine ele : referenceLines) {
            this.referenceLines.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reference line setup of the visual.
     * </p>
     * 
     * @param referenceLines
     *        The reference line setup of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withReferenceLines(java.util.Collection<ReferenceLine> referenceLines) {
        setReferenceLines(referenceLines);
        return this;
    }

    /**
     * <p>
     * The palette (chart color) display setup of the visual.
     * </p>
     * 
     * @param visualPalette
     *        The palette (chart color) display setup of the visual.
     */

    public void setVisualPalette(VisualPalette visualPalette) {
        this.visualPalette = visualPalette;
    }

    /**
     * <p>
     * The palette (chart color) display setup of the visual.
     * </p>
     * 
     * @return The palette (chart color) display setup of the visual.
     */

    public VisualPalette getVisualPalette() {
        return this.visualPalette;
    }

    /**
     * <p>
     * The palette (chart color) display setup of the visual.
     * </p>
     * 
     * @param visualPalette
     *        The palette (chart color) display setup of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotChartConfiguration withVisualPalette(VisualPalette visualPalette) {
        setVisualPalette(visualPalette);
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
        if (getBoxPlotOptions() != null)
            sb.append("BoxPlotOptions: ").append(getBoxPlotOptions()).append(",");
        if (getCategoryAxis() != null)
            sb.append("CategoryAxis: ").append(getCategoryAxis()).append(",");
        if (getCategoryLabelOptions() != null)
            sb.append("CategoryLabelOptions: ").append(getCategoryLabelOptions()).append(",");
        if (getPrimaryYAxisDisplayOptions() != null)
            sb.append("PrimaryYAxisDisplayOptions: ").append(getPrimaryYAxisDisplayOptions()).append(",");
        if (getPrimaryYAxisLabelOptions() != null)
            sb.append("PrimaryYAxisLabelOptions: ").append(getPrimaryYAxisLabelOptions()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getTooltip() != null)
            sb.append("Tooltip: ").append(getTooltip()).append(",");
        if (getReferenceLines() != null)
            sb.append("ReferenceLines: ").append(getReferenceLines()).append(",");
        if (getVisualPalette() != null)
            sb.append("VisualPalette: ").append(getVisualPalette());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BoxPlotChartConfiguration == false)
            return false;
        BoxPlotChartConfiguration other = (BoxPlotChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getBoxPlotOptions() == null ^ this.getBoxPlotOptions() == null)
            return false;
        if (other.getBoxPlotOptions() != null && other.getBoxPlotOptions().equals(this.getBoxPlotOptions()) == false)
            return false;
        if (other.getCategoryAxis() == null ^ this.getCategoryAxis() == null)
            return false;
        if (other.getCategoryAxis() != null && other.getCategoryAxis().equals(this.getCategoryAxis()) == false)
            return false;
        if (other.getCategoryLabelOptions() == null ^ this.getCategoryLabelOptions() == null)
            return false;
        if (other.getCategoryLabelOptions() != null && other.getCategoryLabelOptions().equals(this.getCategoryLabelOptions()) == false)
            return false;
        if (other.getPrimaryYAxisDisplayOptions() == null ^ this.getPrimaryYAxisDisplayOptions() == null)
            return false;
        if (other.getPrimaryYAxisDisplayOptions() != null && other.getPrimaryYAxisDisplayOptions().equals(this.getPrimaryYAxisDisplayOptions()) == false)
            return false;
        if (other.getPrimaryYAxisLabelOptions() == null ^ this.getPrimaryYAxisLabelOptions() == null)
            return false;
        if (other.getPrimaryYAxisLabelOptions() != null && other.getPrimaryYAxisLabelOptions().equals(this.getPrimaryYAxisLabelOptions()) == false)
            return false;
        if (other.getLegend() == null ^ this.getLegend() == null)
            return false;
        if (other.getLegend() != null && other.getLegend().equals(this.getLegend()) == false)
            return false;
        if (other.getTooltip() == null ^ this.getTooltip() == null)
            return false;
        if (other.getTooltip() != null && other.getTooltip().equals(this.getTooltip()) == false)
            return false;
        if (other.getReferenceLines() == null ^ this.getReferenceLines() == null)
            return false;
        if (other.getReferenceLines() != null && other.getReferenceLines().equals(this.getReferenceLines()) == false)
            return false;
        if (other.getVisualPalette() == null ^ this.getVisualPalette() == null)
            return false;
        if (other.getVisualPalette() != null && other.getVisualPalette().equals(this.getVisualPalette()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldWells() == null) ? 0 : getFieldWells().hashCode());
        hashCode = prime * hashCode + ((getSortConfiguration() == null) ? 0 : getSortConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBoxPlotOptions() == null) ? 0 : getBoxPlotOptions().hashCode());
        hashCode = prime * hashCode + ((getCategoryAxis() == null) ? 0 : getCategoryAxis().hashCode());
        hashCode = prime * hashCode + ((getCategoryLabelOptions() == null) ? 0 : getCategoryLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getPrimaryYAxisDisplayOptions() == null) ? 0 : getPrimaryYAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getPrimaryYAxisLabelOptions() == null) ? 0 : getPrimaryYAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        hashCode = prime * hashCode + ((getReferenceLines() == null) ? 0 : getReferenceLines().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        return hashCode;
    }

    @Override
    public BoxPlotChartConfiguration clone() {
        try {
            return (BoxPlotChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BoxPlotChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

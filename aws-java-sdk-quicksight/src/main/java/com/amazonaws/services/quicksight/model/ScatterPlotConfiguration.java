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
 * The configuration of a scatter plot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ScatterPlotConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScatterPlotConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private ScatterPlotFieldWells fieldWells;
    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's x-axis.
     * </p>
     */
    private ChartAxisLabelOptions xAxisLabelOptions;
    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of the scatter plot's x-axis.
     * </p>
     */
    private AxisDisplayOptions xAxisDisplayOptions;
    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's y-axis.
     * </p>
     */
    private ChartAxisLabelOptions yAxisLabelOptions;
    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of the scatter plot's y-axis.
     * </p>
     */
    private AxisDisplayOptions yAxisDisplayOptions;
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
     * The legend display setup of the visual.
     * </p>
     */
    private TooltipOptions tooltip;
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

    public void setFieldWells(ScatterPlotFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public ScatterPlotFieldWells getFieldWells() {
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

    public ScatterPlotConfiguration withFieldWells(ScatterPlotFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's x-axis.
     * </p>
     * 
     * @param xAxisLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of the scatter plot's x-axis.
     */

    public void setXAxisLabelOptions(ChartAxisLabelOptions xAxisLabelOptions) {
        this.xAxisLabelOptions = xAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's x-axis.
     * </p>
     * 
     * @return The label options (label text, label visibility, and sort icon visibility) of the scatter plot's x-axis.
     */

    public ChartAxisLabelOptions getXAxisLabelOptions() {
        return this.xAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's x-axis.
     * </p>
     * 
     * @param xAxisLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of the scatter plot's x-axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotConfiguration withXAxisLabelOptions(ChartAxisLabelOptions xAxisLabelOptions) {
        setXAxisLabelOptions(xAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of the scatter plot's x-axis.
     * </p>
     * 
     * @param xAxisDisplayOptions
     *        The label display options (grid line, range, scale, and axis step) of the scatter plot's x-axis.
     */

    public void setXAxisDisplayOptions(AxisDisplayOptions xAxisDisplayOptions) {
        this.xAxisDisplayOptions = xAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of the scatter plot's x-axis.
     * </p>
     * 
     * @return The label display options (grid line, range, scale, and axis step) of the scatter plot's x-axis.
     */

    public AxisDisplayOptions getXAxisDisplayOptions() {
        return this.xAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of the scatter plot's x-axis.
     * </p>
     * 
     * @param xAxisDisplayOptions
     *        The label display options (grid line, range, scale, and axis step) of the scatter plot's x-axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotConfiguration withXAxisDisplayOptions(AxisDisplayOptions xAxisDisplayOptions) {
        setXAxisDisplayOptions(xAxisDisplayOptions);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's y-axis.
     * </p>
     * 
     * @param yAxisLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of the scatter plot's y-axis.
     */

    public void setYAxisLabelOptions(ChartAxisLabelOptions yAxisLabelOptions) {
        this.yAxisLabelOptions = yAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's y-axis.
     * </p>
     * 
     * @return The label options (label text, label visibility, and sort icon visibility) of the scatter plot's y-axis.
     */

    public ChartAxisLabelOptions getYAxisLabelOptions() {
        return this.yAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's y-axis.
     * </p>
     * 
     * @param yAxisLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of the scatter plot's y-axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotConfiguration withYAxisLabelOptions(ChartAxisLabelOptions yAxisLabelOptions) {
        setYAxisLabelOptions(yAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of the scatter plot's y-axis.
     * </p>
     * 
     * @param yAxisDisplayOptions
     *        The label display options (grid line, range, scale, and axis step) of the scatter plot's y-axis.
     */

    public void setYAxisDisplayOptions(AxisDisplayOptions yAxisDisplayOptions) {
        this.yAxisDisplayOptions = yAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of the scatter plot's y-axis.
     * </p>
     * 
     * @return The label display options (grid line, range, scale, and axis step) of the scatter plot's y-axis.
     */

    public AxisDisplayOptions getYAxisDisplayOptions() {
        return this.yAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of the scatter plot's y-axis.
     * </p>
     * 
     * @param yAxisDisplayOptions
     *        The label display options (grid line, range, scale, and axis step) of the scatter plot's y-axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotConfiguration withYAxisDisplayOptions(AxisDisplayOptions yAxisDisplayOptions) {
        setYAxisDisplayOptions(yAxisDisplayOptions);
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

    public ScatterPlotConfiguration withLegend(LegendOptions legend) {
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

    public ScatterPlotConfiguration withDataLabels(DataLabelOptions dataLabels) {
        setDataLabels(dataLabels);
        return this;
    }

    /**
     * <p>
     * The legend display setup of the visual.
     * </p>
     * 
     * @param tooltip
     *        The legend display setup of the visual.
     */

    public void setTooltip(TooltipOptions tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * <p>
     * The legend display setup of the visual.
     * </p>
     * 
     * @return The legend display setup of the visual.
     */

    public TooltipOptions getTooltip() {
        return this.tooltip;
    }

    /**
     * <p>
     * The legend display setup of the visual.
     * </p>
     * 
     * @param tooltip
     *        The legend display setup of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotConfiguration withTooltip(TooltipOptions tooltip) {
        setTooltip(tooltip);
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

    public ScatterPlotConfiguration withVisualPalette(VisualPalette visualPalette) {
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
        if (getXAxisLabelOptions() != null)
            sb.append("XAxisLabelOptions: ").append(getXAxisLabelOptions()).append(",");
        if (getXAxisDisplayOptions() != null)
            sb.append("XAxisDisplayOptions: ").append(getXAxisDisplayOptions()).append(",");
        if (getYAxisLabelOptions() != null)
            sb.append("YAxisLabelOptions: ").append(getYAxisLabelOptions()).append(",");
        if (getYAxisDisplayOptions() != null)
            sb.append("YAxisDisplayOptions: ").append(getYAxisDisplayOptions()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getDataLabels() != null)
            sb.append("DataLabels: ").append(getDataLabels()).append(",");
        if (getTooltip() != null)
            sb.append("Tooltip: ").append(getTooltip()).append(",");
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

        if (obj instanceof ScatterPlotConfiguration == false)
            return false;
        ScatterPlotConfiguration other = (ScatterPlotConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getXAxisLabelOptions() == null ^ this.getXAxisLabelOptions() == null)
            return false;
        if (other.getXAxisLabelOptions() != null && other.getXAxisLabelOptions().equals(this.getXAxisLabelOptions()) == false)
            return false;
        if (other.getXAxisDisplayOptions() == null ^ this.getXAxisDisplayOptions() == null)
            return false;
        if (other.getXAxisDisplayOptions() != null && other.getXAxisDisplayOptions().equals(this.getXAxisDisplayOptions()) == false)
            return false;
        if (other.getYAxisLabelOptions() == null ^ this.getYAxisLabelOptions() == null)
            return false;
        if (other.getYAxisLabelOptions() != null && other.getYAxisLabelOptions().equals(this.getYAxisLabelOptions()) == false)
            return false;
        if (other.getYAxisDisplayOptions() == null ^ this.getYAxisDisplayOptions() == null)
            return false;
        if (other.getYAxisDisplayOptions() != null && other.getYAxisDisplayOptions().equals(this.getYAxisDisplayOptions()) == false)
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
        hashCode = prime * hashCode + ((getXAxisLabelOptions() == null) ? 0 : getXAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getXAxisDisplayOptions() == null) ? 0 : getXAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getYAxisLabelOptions() == null) ? 0 : getYAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getYAxisDisplayOptions() == null) ? 0 : getYAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getDataLabels() == null) ? 0 : getDataLabels().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        return hashCode;
    }

    @Override
    public ScatterPlotConfiguration clone() {
        try {
            return (ScatterPlotConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ScatterPlotConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

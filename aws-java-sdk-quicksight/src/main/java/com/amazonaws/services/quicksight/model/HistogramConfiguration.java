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
 * The configuration for a <code>HistogramVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/HistogramConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistogramConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field well configuration of a histogram.
     * </p>
     */
    private HistogramFieldWells fieldWells;
    /**
     * <p>
     * The options that determine the presentation of the x-axis.
     * </p>
     */
    private AxisDisplayOptions xAxisDisplayOptions;
    /**
     * <p>
     * The options that determine the presentation of the x-axis label.
     * </p>
     */
    private ChartAxisLabelOptions xAxisLabelOptions;
    /**
     * <p>
     * The options that determine the presentation of the y-axis.
     * </p>
     */
    private AxisDisplayOptions yAxisDisplayOptions;
    /**
     * <p>
     * The options that determine the presentation of histogram bins.
     * </p>
     */
    private HistogramBinOptions binOptions;
    /**
     * <p>
     * The data label configuration of a histogram.
     * </p>
     */
    private DataLabelOptions dataLabels;
    /**
     * <p>
     * The tooltip configuration of a histogram.
     * </p>
     */
    private TooltipOptions tooltip;
    /**
     * <p>
     * The visual palette configuration of a histogram.
     * </p>
     */
    private VisualPalette visualPalette;

    /**
     * <p>
     * The field well configuration of a histogram.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a histogram.
     */

    public void setFieldWells(HistogramFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a histogram.
     * </p>
     * 
     * @return The field well configuration of a histogram.
     */

    public HistogramFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a histogram.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a histogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramConfiguration withFieldWells(HistogramFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the x-axis.
     * </p>
     * 
     * @param xAxisDisplayOptions
     *        The options that determine the presentation of the x-axis.
     */

    public void setXAxisDisplayOptions(AxisDisplayOptions xAxisDisplayOptions) {
        this.xAxisDisplayOptions = xAxisDisplayOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the x-axis.
     * </p>
     * 
     * @return The options that determine the presentation of the x-axis.
     */

    public AxisDisplayOptions getXAxisDisplayOptions() {
        return this.xAxisDisplayOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the x-axis.
     * </p>
     * 
     * @param xAxisDisplayOptions
     *        The options that determine the presentation of the x-axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramConfiguration withXAxisDisplayOptions(AxisDisplayOptions xAxisDisplayOptions) {
        setXAxisDisplayOptions(xAxisDisplayOptions);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the x-axis label.
     * </p>
     * 
     * @param xAxisLabelOptions
     *        The options that determine the presentation of the x-axis label.
     */

    public void setXAxisLabelOptions(ChartAxisLabelOptions xAxisLabelOptions) {
        this.xAxisLabelOptions = xAxisLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the x-axis label.
     * </p>
     * 
     * @return The options that determine the presentation of the x-axis label.
     */

    public ChartAxisLabelOptions getXAxisLabelOptions() {
        return this.xAxisLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the x-axis label.
     * </p>
     * 
     * @param xAxisLabelOptions
     *        The options that determine the presentation of the x-axis label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramConfiguration withXAxisLabelOptions(ChartAxisLabelOptions xAxisLabelOptions) {
        setXAxisLabelOptions(xAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the y-axis.
     * </p>
     * 
     * @param yAxisDisplayOptions
     *        The options that determine the presentation of the y-axis.
     */

    public void setYAxisDisplayOptions(AxisDisplayOptions yAxisDisplayOptions) {
        this.yAxisDisplayOptions = yAxisDisplayOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the y-axis.
     * </p>
     * 
     * @return The options that determine the presentation of the y-axis.
     */

    public AxisDisplayOptions getYAxisDisplayOptions() {
        return this.yAxisDisplayOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the y-axis.
     * </p>
     * 
     * @param yAxisDisplayOptions
     *        The options that determine the presentation of the y-axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramConfiguration withYAxisDisplayOptions(AxisDisplayOptions yAxisDisplayOptions) {
        setYAxisDisplayOptions(yAxisDisplayOptions);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of histogram bins.
     * </p>
     * 
     * @param binOptions
     *        The options that determine the presentation of histogram bins.
     */

    public void setBinOptions(HistogramBinOptions binOptions) {
        this.binOptions = binOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of histogram bins.
     * </p>
     * 
     * @return The options that determine the presentation of histogram bins.
     */

    public HistogramBinOptions getBinOptions() {
        return this.binOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of histogram bins.
     * </p>
     * 
     * @param binOptions
     *        The options that determine the presentation of histogram bins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramConfiguration withBinOptions(HistogramBinOptions binOptions) {
        setBinOptions(binOptions);
        return this;
    }

    /**
     * <p>
     * The data label configuration of a histogram.
     * </p>
     * 
     * @param dataLabels
     *        The data label configuration of a histogram.
     */

    public void setDataLabels(DataLabelOptions dataLabels) {
        this.dataLabels = dataLabels;
    }

    /**
     * <p>
     * The data label configuration of a histogram.
     * </p>
     * 
     * @return The data label configuration of a histogram.
     */

    public DataLabelOptions getDataLabels() {
        return this.dataLabels;
    }

    /**
     * <p>
     * The data label configuration of a histogram.
     * </p>
     * 
     * @param dataLabels
     *        The data label configuration of a histogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramConfiguration withDataLabels(DataLabelOptions dataLabels) {
        setDataLabels(dataLabels);
        return this;
    }

    /**
     * <p>
     * The tooltip configuration of a histogram.
     * </p>
     * 
     * @param tooltip
     *        The tooltip configuration of a histogram.
     */

    public void setTooltip(TooltipOptions tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * <p>
     * The tooltip configuration of a histogram.
     * </p>
     * 
     * @return The tooltip configuration of a histogram.
     */

    public TooltipOptions getTooltip() {
        return this.tooltip;
    }

    /**
     * <p>
     * The tooltip configuration of a histogram.
     * </p>
     * 
     * @param tooltip
     *        The tooltip configuration of a histogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramConfiguration withTooltip(TooltipOptions tooltip) {
        setTooltip(tooltip);
        return this;
    }

    /**
     * <p>
     * The visual palette configuration of a histogram.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a histogram.
     */

    public void setVisualPalette(VisualPalette visualPalette) {
        this.visualPalette = visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a histogram.
     * </p>
     * 
     * @return The visual palette configuration of a histogram.
     */

    public VisualPalette getVisualPalette() {
        return this.visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a histogram.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a histogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramConfiguration withVisualPalette(VisualPalette visualPalette) {
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
        if (getXAxisDisplayOptions() != null)
            sb.append("XAxisDisplayOptions: ").append(getXAxisDisplayOptions()).append(",");
        if (getXAxisLabelOptions() != null)
            sb.append("XAxisLabelOptions: ").append(getXAxisLabelOptions()).append(",");
        if (getYAxisDisplayOptions() != null)
            sb.append("YAxisDisplayOptions: ").append(getYAxisDisplayOptions()).append(",");
        if (getBinOptions() != null)
            sb.append("BinOptions: ").append(getBinOptions()).append(",");
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

        if (obj instanceof HistogramConfiguration == false)
            return false;
        HistogramConfiguration other = (HistogramConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getXAxisDisplayOptions() == null ^ this.getXAxisDisplayOptions() == null)
            return false;
        if (other.getXAxisDisplayOptions() != null && other.getXAxisDisplayOptions().equals(this.getXAxisDisplayOptions()) == false)
            return false;
        if (other.getXAxisLabelOptions() == null ^ this.getXAxisLabelOptions() == null)
            return false;
        if (other.getXAxisLabelOptions() != null && other.getXAxisLabelOptions().equals(this.getXAxisLabelOptions()) == false)
            return false;
        if (other.getYAxisDisplayOptions() == null ^ this.getYAxisDisplayOptions() == null)
            return false;
        if (other.getYAxisDisplayOptions() != null && other.getYAxisDisplayOptions().equals(this.getYAxisDisplayOptions()) == false)
            return false;
        if (other.getBinOptions() == null ^ this.getBinOptions() == null)
            return false;
        if (other.getBinOptions() != null && other.getBinOptions().equals(this.getBinOptions()) == false)
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
        hashCode = prime * hashCode + ((getXAxisDisplayOptions() == null) ? 0 : getXAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getXAxisLabelOptions() == null) ? 0 : getXAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getYAxisDisplayOptions() == null) ? 0 : getYAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getBinOptions() == null) ? 0 : getBinOptions().hashCode());
        hashCode = prime * hashCode + ((getDataLabels() == null) ? 0 : getDataLabels().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        return hashCode;
    }

    @Override
    public HistogramConfiguration clone() {
        try {
            return (HistogramConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.HistogramConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

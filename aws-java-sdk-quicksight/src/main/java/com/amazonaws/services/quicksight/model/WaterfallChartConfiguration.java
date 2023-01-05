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
 * The configuration for a waterfall visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WaterfallChartConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaterfallChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field well configuration of a waterfall visual.
     * </p>
     */
    private WaterfallChartFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a waterfall visual.
     * </p>
     */
    private WaterfallChartSortConfiguration sortConfiguration;
    /**
     * <p>
     * The options that determine the presentation of a waterfall visual.
     * </p>
     */
    private WaterfallChartOptions waterfallChartOptions;
    /**
     * <p>
     * The options that determine the presentation of the category axis label.
     * </p>
     */
    private ChartAxisLabelOptions categoryAxisLabelOptions;
    /**
     * <p>
     * The options that determine the presentation of the category axis.
     * </p>
     */
    private AxisDisplayOptions categoryAxisDisplayOptions;
    /**
     * <p>
     * The options that determine the presentation of the y-axis label.
     * </p>
     */
    private ChartAxisLabelOptions primaryYAxisLabelOptions;
    /**
     * <p>
     * The options that determine the presentation of the y-axis.
     * </p>
     */
    private AxisDisplayOptions primaryYAxisDisplayOptions;
    /**
     * <p>
     * The legend configuration of a waterfall visual.
     * </p>
     */
    private LegendOptions legend;
    /**
     * <p>
     * The data label configuration of a waterfall visual.
     * </p>
     */
    private DataLabelOptions dataLabels;
    /**
     * <p>
     * The visual palette configuration of a waterfall visual.
     * </p>
     */
    private VisualPalette visualPalette;

    /**
     * <p>
     * The field well configuration of a waterfall visual.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a waterfall visual.
     */

    public void setFieldWells(WaterfallChartFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a waterfall visual.
     * </p>
     * 
     * @return The field well configuration of a waterfall visual.
     */

    public WaterfallChartFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a waterfall visual.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withFieldWells(WaterfallChartFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a waterfall visual.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a waterfall visual.
     */

    public void setSortConfiguration(WaterfallChartSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a waterfall visual.
     * </p>
     * 
     * @return The sort configuration of a waterfall visual.
     */

    public WaterfallChartSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a waterfall visual.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withSortConfiguration(WaterfallChartSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of a waterfall visual.
     * </p>
     * 
     * @param waterfallChartOptions
     *        The options that determine the presentation of a waterfall visual.
     */

    public void setWaterfallChartOptions(WaterfallChartOptions waterfallChartOptions) {
        this.waterfallChartOptions = waterfallChartOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of a waterfall visual.
     * </p>
     * 
     * @return The options that determine the presentation of a waterfall visual.
     */

    public WaterfallChartOptions getWaterfallChartOptions() {
        return this.waterfallChartOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of a waterfall visual.
     * </p>
     * 
     * @param waterfallChartOptions
     *        The options that determine the presentation of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withWaterfallChartOptions(WaterfallChartOptions waterfallChartOptions) {
        setWaterfallChartOptions(waterfallChartOptions);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the category axis label.
     * </p>
     * 
     * @param categoryAxisLabelOptions
     *        The options that determine the presentation of the category axis label.
     */

    public void setCategoryAxisLabelOptions(ChartAxisLabelOptions categoryAxisLabelOptions) {
        this.categoryAxisLabelOptions = categoryAxisLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the category axis label.
     * </p>
     * 
     * @return The options that determine the presentation of the category axis label.
     */

    public ChartAxisLabelOptions getCategoryAxisLabelOptions() {
        return this.categoryAxisLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the category axis label.
     * </p>
     * 
     * @param categoryAxisLabelOptions
     *        The options that determine the presentation of the category axis label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withCategoryAxisLabelOptions(ChartAxisLabelOptions categoryAxisLabelOptions) {
        setCategoryAxisLabelOptions(categoryAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the category axis.
     * </p>
     * 
     * @param categoryAxisDisplayOptions
     *        The options that determine the presentation of the category axis.
     */

    public void setCategoryAxisDisplayOptions(AxisDisplayOptions categoryAxisDisplayOptions) {
        this.categoryAxisDisplayOptions = categoryAxisDisplayOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the category axis.
     * </p>
     * 
     * @return The options that determine the presentation of the category axis.
     */

    public AxisDisplayOptions getCategoryAxisDisplayOptions() {
        return this.categoryAxisDisplayOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the category axis.
     * </p>
     * 
     * @param categoryAxisDisplayOptions
     *        The options that determine the presentation of the category axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withCategoryAxisDisplayOptions(AxisDisplayOptions categoryAxisDisplayOptions) {
        setCategoryAxisDisplayOptions(categoryAxisDisplayOptions);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the y-axis label.
     * </p>
     * 
     * @param primaryYAxisLabelOptions
     *        The options that determine the presentation of the y-axis label.
     */

    public void setPrimaryYAxisLabelOptions(ChartAxisLabelOptions primaryYAxisLabelOptions) {
        this.primaryYAxisLabelOptions = primaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the y-axis label.
     * </p>
     * 
     * @return The options that determine the presentation of the y-axis label.
     */

    public ChartAxisLabelOptions getPrimaryYAxisLabelOptions() {
        return this.primaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the y-axis label.
     * </p>
     * 
     * @param primaryYAxisLabelOptions
     *        The options that determine the presentation of the y-axis label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withPrimaryYAxisLabelOptions(ChartAxisLabelOptions primaryYAxisLabelOptions) {
        setPrimaryYAxisLabelOptions(primaryYAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the y-axis.
     * </p>
     * 
     * @param primaryYAxisDisplayOptions
     *        The options that determine the presentation of the y-axis.
     */

    public void setPrimaryYAxisDisplayOptions(AxisDisplayOptions primaryYAxisDisplayOptions) {
        this.primaryYAxisDisplayOptions = primaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the y-axis.
     * </p>
     * 
     * @return The options that determine the presentation of the y-axis.
     */

    public AxisDisplayOptions getPrimaryYAxisDisplayOptions() {
        return this.primaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the y-axis.
     * </p>
     * 
     * @param primaryYAxisDisplayOptions
     *        The options that determine the presentation of the y-axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withPrimaryYAxisDisplayOptions(AxisDisplayOptions primaryYAxisDisplayOptions) {
        setPrimaryYAxisDisplayOptions(primaryYAxisDisplayOptions);
        return this;
    }

    /**
     * <p>
     * The legend configuration of a waterfall visual.
     * </p>
     * 
     * @param legend
     *        The legend configuration of a waterfall visual.
     */

    public void setLegend(LegendOptions legend) {
        this.legend = legend;
    }

    /**
     * <p>
     * The legend configuration of a waterfall visual.
     * </p>
     * 
     * @return The legend configuration of a waterfall visual.
     */

    public LegendOptions getLegend() {
        return this.legend;
    }

    /**
     * <p>
     * The legend configuration of a waterfall visual.
     * </p>
     * 
     * @param legend
     *        The legend configuration of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withLegend(LegendOptions legend) {
        setLegend(legend);
        return this;
    }

    /**
     * <p>
     * The data label configuration of a waterfall visual.
     * </p>
     * 
     * @param dataLabels
     *        The data label configuration of a waterfall visual.
     */

    public void setDataLabels(DataLabelOptions dataLabels) {
        this.dataLabels = dataLabels;
    }

    /**
     * <p>
     * The data label configuration of a waterfall visual.
     * </p>
     * 
     * @return The data label configuration of a waterfall visual.
     */

    public DataLabelOptions getDataLabels() {
        return this.dataLabels;
    }

    /**
     * <p>
     * The data label configuration of a waterfall visual.
     * </p>
     * 
     * @param dataLabels
     *        The data label configuration of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withDataLabels(DataLabelOptions dataLabels) {
        setDataLabels(dataLabels);
        return this;
    }

    /**
     * <p>
     * The visual palette configuration of a waterfall visual.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a waterfall visual.
     */

    public void setVisualPalette(VisualPalette visualPalette) {
        this.visualPalette = visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a waterfall visual.
     * </p>
     * 
     * @return The visual palette configuration of a waterfall visual.
     */

    public VisualPalette getVisualPalette() {
        return this.visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a waterfall visual.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartConfiguration withVisualPalette(VisualPalette visualPalette) {
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
        if (getWaterfallChartOptions() != null)
            sb.append("WaterfallChartOptions: ").append(getWaterfallChartOptions()).append(",");
        if (getCategoryAxisLabelOptions() != null)
            sb.append("CategoryAxisLabelOptions: ").append(getCategoryAxisLabelOptions()).append(",");
        if (getCategoryAxisDisplayOptions() != null)
            sb.append("CategoryAxisDisplayOptions: ").append(getCategoryAxisDisplayOptions()).append(",");
        if (getPrimaryYAxisLabelOptions() != null)
            sb.append("PrimaryYAxisLabelOptions: ").append(getPrimaryYAxisLabelOptions()).append(",");
        if (getPrimaryYAxisDisplayOptions() != null)
            sb.append("PrimaryYAxisDisplayOptions: ").append(getPrimaryYAxisDisplayOptions()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getDataLabels() != null)
            sb.append("DataLabels: ").append(getDataLabels()).append(",");
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

        if (obj instanceof WaterfallChartConfiguration == false)
            return false;
        WaterfallChartConfiguration other = (WaterfallChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getWaterfallChartOptions() == null ^ this.getWaterfallChartOptions() == null)
            return false;
        if (other.getWaterfallChartOptions() != null && other.getWaterfallChartOptions().equals(this.getWaterfallChartOptions()) == false)
            return false;
        if (other.getCategoryAxisLabelOptions() == null ^ this.getCategoryAxisLabelOptions() == null)
            return false;
        if (other.getCategoryAxisLabelOptions() != null && other.getCategoryAxisLabelOptions().equals(this.getCategoryAxisLabelOptions()) == false)
            return false;
        if (other.getCategoryAxisDisplayOptions() == null ^ this.getCategoryAxisDisplayOptions() == null)
            return false;
        if (other.getCategoryAxisDisplayOptions() != null && other.getCategoryAxisDisplayOptions().equals(this.getCategoryAxisDisplayOptions()) == false)
            return false;
        if (other.getPrimaryYAxisLabelOptions() == null ^ this.getPrimaryYAxisLabelOptions() == null)
            return false;
        if (other.getPrimaryYAxisLabelOptions() != null && other.getPrimaryYAxisLabelOptions().equals(this.getPrimaryYAxisLabelOptions()) == false)
            return false;
        if (other.getPrimaryYAxisDisplayOptions() == null ^ this.getPrimaryYAxisDisplayOptions() == null)
            return false;
        if (other.getPrimaryYAxisDisplayOptions() != null && other.getPrimaryYAxisDisplayOptions().equals(this.getPrimaryYAxisDisplayOptions()) == false)
            return false;
        if (other.getLegend() == null ^ this.getLegend() == null)
            return false;
        if (other.getLegend() != null && other.getLegend().equals(this.getLegend()) == false)
            return false;
        if (other.getDataLabels() == null ^ this.getDataLabels() == null)
            return false;
        if (other.getDataLabels() != null && other.getDataLabels().equals(this.getDataLabels()) == false)
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
        hashCode = prime * hashCode + ((getWaterfallChartOptions() == null) ? 0 : getWaterfallChartOptions().hashCode());
        hashCode = prime * hashCode + ((getCategoryAxisLabelOptions() == null) ? 0 : getCategoryAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getCategoryAxisDisplayOptions() == null) ? 0 : getCategoryAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getPrimaryYAxisLabelOptions() == null) ? 0 : getPrimaryYAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getPrimaryYAxisDisplayOptions() == null) ? 0 : getPrimaryYAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getDataLabels() == null) ? 0 : getDataLabels().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        return hashCode;
    }

    @Override
    public WaterfallChartConfiguration clone() {
        try {
            return (WaterfallChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WaterfallChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

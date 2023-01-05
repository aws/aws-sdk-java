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
 * The configuration of a pie chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PieChartConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PieChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private PieChartFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a pie chart.
     * </p>
     */
    private PieChartSortConfiguration sortConfiguration;
    /**
     * <p>
     * The options that determine the shape of the chart. This option determines whether the chart is a pie chart or a
     * donut chart.
     * </p>
     */
    private DonutOptions donutOptions;
    /**
     * <p>
     * The small multiples setup for the visual.
     * </p>
     */
    private SmallMultiplesOptions smallMultiplesOptions;
    /**
     * <p>
     * The label options of the group/color that is displayed in a pie chart.
     * </p>
     */
    private ChartAxisLabelOptions categoryLabelOptions;
    /**
     * <p>
     * The label options for the value that is displayed in a pie chart.
     * </p>
     */
    private ChartAxisLabelOptions valueLabelOptions;
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
     * The palette (chart color) display setup of the visual.
     * </p>
     */
    private VisualPalette visualPalette;
    /**
     * <p>
     * The contribution analysis (anomaly configuration) setup of the visual.
     * </p>
     */
    private java.util.List<ContributionAnalysisDefault> contributionAnalysisDefaults;

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     */

    public void setFieldWells(PieChartFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public PieChartFieldWells getFieldWells() {
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

    public PieChartConfiguration withFieldWells(PieChartFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a pie chart.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a pie chart.
     */

    public void setSortConfiguration(PieChartSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a pie chart.
     * </p>
     * 
     * @return The sort configuration of a pie chart.
     */

    public PieChartSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a pie chart.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a pie chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PieChartConfiguration withSortConfiguration(PieChartSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The options that determine the shape of the chart. This option determines whether the chart is a pie chart or a
     * donut chart.
     * </p>
     * 
     * @param donutOptions
     *        The options that determine the shape of the chart. This option determines whether the chart is a pie chart
     *        or a donut chart.
     */

    public void setDonutOptions(DonutOptions donutOptions) {
        this.donutOptions = donutOptions;
    }

    /**
     * <p>
     * The options that determine the shape of the chart. This option determines whether the chart is a pie chart or a
     * donut chart.
     * </p>
     * 
     * @return The options that determine the shape of the chart. This option determines whether the chart is a pie
     *         chart or a donut chart.
     */

    public DonutOptions getDonutOptions() {
        return this.donutOptions;
    }

    /**
     * <p>
     * The options that determine the shape of the chart. This option determines whether the chart is a pie chart or a
     * donut chart.
     * </p>
     * 
     * @param donutOptions
     *        The options that determine the shape of the chart. This option determines whether the chart is a pie chart
     *        or a donut chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PieChartConfiguration withDonutOptions(DonutOptions donutOptions) {
        setDonutOptions(donutOptions);
        return this;
    }

    /**
     * <p>
     * The small multiples setup for the visual.
     * </p>
     * 
     * @param smallMultiplesOptions
     *        The small multiples setup for the visual.
     */

    public void setSmallMultiplesOptions(SmallMultiplesOptions smallMultiplesOptions) {
        this.smallMultiplesOptions = smallMultiplesOptions;
    }

    /**
     * <p>
     * The small multiples setup for the visual.
     * </p>
     * 
     * @return The small multiples setup for the visual.
     */

    public SmallMultiplesOptions getSmallMultiplesOptions() {
        return this.smallMultiplesOptions;
    }

    /**
     * <p>
     * The small multiples setup for the visual.
     * </p>
     * 
     * @param smallMultiplesOptions
     *        The small multiples setup for the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PieChartConfiguration withSmallMultiplesOptions(SmallMultiplesOptions smallMultiplesOptions) {
        setSmallMultiplesOptions(smallMultiplesOptions);
        return this;
    }

    /**
     * <p>
     * The label options of the group/color that is displayed in a pie chart.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options of the group/color that is displayed in a pie chart.
     */

    public void setCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        this.categoryLabelOptions = categoryLabelOptions;
    }

    /**
     * <p>
     * The label options of the group/color that is displayed in a pie chart.
     * </p>
     * 
     * @return The label options of the group/color that is displayed in a pie chart.
     */

    public ChartAxisLabelOptions getCategoryLabelOptions() {
        return this.categoryLabelOptions;
    }

    /**
     * <p>
     * The label options of the group/color that is displayed in a pie chart.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options of the group/color that is displayed in a pie chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PieChartConfiguration withCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        setCategoryLabelOptions(categoryLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label options for the value that is displayed in a pie chart.
     * </p>
     * 
     * @param valueLabelOptions
     *        The label options for the value that is displayed in a pie chart.
     */

    public void setValueLabelOptions(ChartAxisLabelOptions valueLabelOptions) {
        this.valueLabelOptions = valueLabelOptions;
    }

    /**
     * <p>
     * The label options for the value that is displayed in a pie chart.
     * </p>
     * 
     * @return The label options for the value that is displayed in a pie chart.
     */

    public ChartAxisLabelOptions getValueLabelOptions() {
        return this.valueLabelOptions;
    }

    /**
     * <p>
     * The label options for the value that is displayed in a pie chart.
     * </p>
     * 
     * @param valueLabelOptions
     *        The label options for the value that is displayed in a pie chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PieChartConfiguration withValueLabelOptions(ChartAxisLabelOptions valueLabelOptions) {
        setValueLabelOptions(valueLabelOptions);
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

    public PieChartConfiguration withLegend(LegendOptions legend) {
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

    public PieChartConfiguration withDataLabels(DataLabelOptions dataLabels) {
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

    public PieChartConfiguration withTooltip(TooltipOptions tooltip) {
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

    public PieChartConfiguration withVisualPalette(VisualPalette visualPalette) {
        setVisualPalette(visualPalette);
        return this;
    }

    /**
     * <p>
     * The contribution analysis (anomaly configuration) setup of the visual.
     * </p>
     * 
     * @return The contribution analysis (anomaly configuration) setup of the visual.
     */

    public java.util.List<ContributionAnalysisDefault> getContributionAnalysisDefaults() {
        return contributionAnalysisDefaults;
    }

    /**
     * <p>
     * The contribution analysis (anomaly configuration) setup of the visual.
     * </p>
     * 
     * @param contributionAnalysisDefaults
     *        The contribution analysis (anomaly configuration) setup of the visual.
     */

    public void setContributionAnalysisDefaults(java.util.Collection<ContributionAnalysisDefault> contributionAnalysisDefaults) {
        if (contributionAnalysisDefaults == null) {
            this.contributionAnalysisDefaults = null;
            return;
        }

        this.contributionAnalysisDefaults = new java.util.ArrayList<ContributionAnalysisDefault>(contributionAnalysisDefaults);
    }

    /**
     * <p>
     * The contribution analysis (anomaly configuration) setup of the visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContributionAnalysisDefaults(java.util.Collection)} or
     * {@link #withContributionAnalysisDefaults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param contributionAnalysisDefaults
     *        The contribution analysis (anomaly configuration) setup of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PieChartConfiguration withContributionAnalysisDefaults(ContributionAnalysisDefault... contributionAnalysisDefaults) {
        if (this.contributionAnalysisDefaults == null) {
            setContributionAnalysisDefaults(new java.util.ArrayList<ContributionAnalysisDefault>(contributionAnalysisDefaults.length));
        }
        for (ContributionAnalysisDefault ele : contributionAnalysisDefaults) {
            this.contributionAnalysisDefaults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contribution analysis (anomaly configuration) setup of the visual.
     * </p>
     * 
     * @param contributionAnalysisDefaults
     *        The contribution analysis (anomaly configuration) setup of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PieChartConfiguration withContributionAnalysisDefaults(java.util.Collection<ContributionAnalysisDefault> contributionAnalysisDefaults) {
        setContributionAnalysisDefaults(contributionAnalysisDefaults);
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
        if (getDonutOptions() != null)
            sb.append("DonutOptions: ").append(getDonutOptions()).append(",");
        if (getSmallMultiplesOptions() != null)
            sb.append("SmallMultiplesOptions: ").append(getSmallMultiplesOptions()).append(",");
        if (getCategoryLabelOptions() != null)
            sb.append("CategoryLabelOptions: ").append(getCategoryLabelOptions()).append(",");
        if (getValueLabelOptions() != null)
            sb.append("ValueLabelOptions: ").append(getValueLabelOptions()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getDataLabels() != null)
            sb.append("DataLabels: ").append(getDataLabels()).append(",");
        if (getTooltip() != null)
            sb.append("Tooltip: ").append(getTooltip()).append(",");
        if (getVisualPalette() != null)
            sb.append("VisualPalette: ").append(getVisualPalette()).append(",");
        if (getContributionAnalysisDefaults() != null)
            sb.append("ContributionAnalysisDefaults: ").append(getContributionAnalysisDefaults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PieChartConfiguration == false)
            return false;
        PieChartConfiguration other = (PieChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getDonutOptions() == null ^ this.getDonutOptions() == null)
            return false;
        if (other.getDonutOptions() != null && other.getDonutOptions().equals(this.getDonutOptions()) == false)
            return false;
        if (other.getSmallMultiplesOptions() == null ^ this.getSmallMultiplesOptions() == null)
            return false;
        if (other.getSmallMultiplesOptions() != null && other.getSmallMultiplesOptions().equals(this.getSmallMultiplesOptions()) == false)
            return false;
        if (other.getCategoryLabelOptions() == null ^ this.getCategoryLabelOptions() == null)
            return false;
        if (other.getCategoryLabelOptions() != null && other.getCategoryLabelOptions().equals(this.getCategoryLabelOptions()) == false)
            return false;
        if (other.getValueLabelOptions() == null ^ this.getValueLabelOptions() == null)
            return false;
        if (other.getValueLabelOptions() != null && other.getValueLabelOptions().equals(this.getValueLabelOptions()) == false)
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
        if (other.getContributionAnalysisDefaults() == null ^ this.getContributionAnalysisDefaults() == null)
            return false;
        if (other.getContributionAnalysisDefaults() != null && other.getContributionAnalysisDefaults().equals(this.getContributionAnalysisDefaults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldWells() == null) ? 0 : getFieldWells().hashCode());
        hashCode = prime * hashCode + ((getSortConfiguration() == null) ? 0 : getSortConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDonutOptions() == null) ? 0 : getDonutOptions().hashCode());
        hashCode = prime * hashCode + ((getSmallMultiplesOptions() == null) ? 0 : getSmallMultiplesOptions().hashCode());
        hashCode = prime * hashCode + ((getCategoryLabelOptions() == null) ? 0 : getCategoryLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getValueLabelOptions() == null) ? 0 : getValueLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getDataLabels() == null) ? 0 : getDataLabels().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        hashCode = prime * hashCode + ((getContributionAnalysisDefaults() == null) ? 0 : getContributionAnalysisDefaults().hashCode());
        return hashCode;
    }

    @Override
    public PieChartConfiguration clone() {
        try {
            return (PieChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PieChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The configuration of a <code>ComboChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ComboChartConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComboChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private ComboChartFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a <code>ComboChartVisual</code>.
     * </p>
     */
    private ComboChartSortConfiguration sortConfiguration;
    /**
     * <p>
     * Determines the bar arrangement in a combo chart. The following are valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTERED</code>: For clustered bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED</code>: For stacked bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED_PERCENT</code>: Do not use. If you use this value, the operation returns a validation error.
     * </p>
     * </li>
     * </ul>
     */
    private String barsArrangement;
    /**
     * <p>
     * The category axis of a combo chart.
     * </p>
     */
    private AxisDisplayOptions categoryAxis;
    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart category
     * (group/color) field well.
     * </p>
     */
    private ChartAxisLabelOptions categoryLabelOptions;
    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of a combo chart's primary y-axis (bar) field
     * well.
     * </p>
     */
    private AxisDisplayOptions primaryYAxisDisplayOptions;
    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's primary y-axis
     * (bar) field well.
     * </p>
     */
    private ChartAxisLabelOptions primaryYAxisLabelOptions;
    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a combo chart's secondary y-axis (line) field
     * well.
     * </p>
     */
    private AxisDisplayOptions secondaryYAxisDisplayOptions;
    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's secondary
     * y-axis(line) field well.
     * </p>
     */
    private ChartAxisLabelOptions secondaryYAxisLabelOptions;
    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's color field well.
     * </p>
     */
    private ChartAxisLabelOptions colorLabelOptions;
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
     * <p>
     * The data label options for a bar in a combo chart.
     * </p>
     */
    private DataLabelOptions barDataLabels;
    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * <p>
     * The data label options for a line in a combo chart.
     * </p>
     */
    private DataLabelOptions lineDataLabels;
    /**
     * <p>
     * The legend display setup of the visual.
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

    public void setFieldWells(ComboChartFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public ComboChartFieldWells getFieldWells() {
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

    public ComboChartConfiguration withFieldWells(ComboChartFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a <code>ComboChartVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>ComboChartVisual</code>.
     */

    public void setSortConfiguration(ComboChartSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>ComboChartVisual</code>.
     * </p>
     * 
     * @return The sort configuration of a <code>ComboChartVisual</code>.
     */

    public ComboChartSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>ComboChartVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>ComboChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withSortConfiguration(ComboChartSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * Determines the bar arrangement in a combo chart. The following are valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTERED</code>: For clustered bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED</code>: For stacked bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED_PERCENT</code>: Do not use. If you use this value, the operation returns a validation error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param barsArrangement
     *        Determines the bar arrangement in a combo chart. The following are valid values in this structure:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLUSTERED</code>: For clustered bar combo charts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STACKED</code>: For stacked bar combo charts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STACKED_PERCENT</code>: Do not use. If you use this value, the operation returns a validation error.
     *        </p>
     *        </li>
     * @see BarsArrangement
     */

    public void setBarsArrangement(String barsArrangement) {
        this.barsArrangement = barsArrangement;
    }

    /**
     * <p>
     * Determines the bar arrangement in a combo chart. The following are valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTERED</code>: For clustered bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED</code>: For stacked bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED_PERCENT</code>: Do not use. If you use this value, the operation returns a validation error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines the bar arrangement in a combo chart. The following are valid values in this structure:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CLUSTERED</code>: For clustered bar combo charts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STACKED</code>: For stacked bar combo charts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STACKED_PERCENT</code>: Do not use. If you use this value, the operation returns a validation
     *         error.
     *         </p>
     *         </li>
     * @see BarsArrangement
     */

    public String getBarsArrangement() {
        return this.barsArrangement;
    }

    /**
     * <p>
     * Determines the bar arrangement in a combo chart. The following are valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTERED</code>: For clustered bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED</code>: For stacked bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED_PERCENT</code>: Do not use. If you use this value, the operation returns a validation error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param barsArrangement
     *        Determines the bar arrangement in a combo chart. The following are valid values in this structure:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLUSTERED</code>: For clustered bar combo charts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STACKED</code>: For stacked bar combo charts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STACKED_PERCENT</code>: Do not use. If you use this value, the operation returns a validation error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BarsArrangement
     */

    public ComboChartConfiguration withBarsArrangement(String barsArrangement) {
        setBarsArrangement(barsArrangement);
        return this;
    }

    /**
     * <p>
     * Determines the bar arrangement in a combo chart. The following are valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTERED</code>: For clustered bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED</code>: For stacked bar combo charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKED_PERCENT</code>: Do not use. If you use this value, the operation returns a validation error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param barsArrangement
     *        Determines the bar arrangement in a combo chart. The following are valid values in this structure:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLUSTERED</code>: For clustered bar combo charts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STACKED</code>: For stacked bar combo charts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STACKED_PERCENT</code>: Do not use. If you use this value, the operation returns a validation error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BarsArrangement
     */

    public ComboChartConfiguration withBarsArrangement(BarsArrangement barsArrangement) {
        this.barsArrangement = barsArrangement.toString();
        return this;
    }

    /**
     * <p>
     * The category axis of a combo chart.
     * </p>
     * 
     * @param categoryAxis
     *        The category axis of a combo chart.
     */

    public void setCategoryAxis(AxisDisplayOptions categoryAxis) {
        this.categoryAxis = categoryAxis;
    }

    /**
     * <p>
     * The category axis of a combo chart.
     * </p>
     * 
     * @return The category axis of a combo chart.
     */

    public AxisDisplayOptions getCategoryAxis() {
        return this.categoryAxis;
    }

    /**
     * <p>
     * The category axis of a combo chart.
     * </p>
     * 
     * @param categoryAxis
     *        The category axis of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withCategoryAxis(AxisDisplayOptions categoryAxis) {
        setCategoryAxis(categoryAxis);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart category
     * (group/color) field well.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of a combo chart category
     *        (group/color) field well.
     */

    public void setCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        this.categoryLabelOptions = categoryLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart category
     * (group/color) field well.
     * </p>
     * 
     * @return The label options (label text, label visibility, and sort icon visibility) of a combo chart category
     *         (group/color) field well.
     */

    public ChartAxisLabelOptions getCategoryLabelOptions() {
        return this.categoryLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart category
     * (group/color) field well.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of a combo chart category
     *        (group/color) field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        setCategoryLabelOptions(categoryLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of a combo chart's primary y-axis (bar) field
     * well.
     * </p>
     * 
     * @param primaryYAxisDisplayOptions
     *        The label display options (grid line, range, scale, and axis step) of a combo chart's primary y-axis (bar)
     *        field well.
     */

    public void setPrimaryYAxisDisplayOptions(AxisDisplayOptions primaryYAxisDisplayOptions) {
        this.primaryYAxisDisplayOptions = primaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of a combo chart's primary y-axis (bar) field
     * well.
     * </p>
     * 
     * @return The label display options (grid line, range, scale, and axis step) of a combo chart's primary y-axis
     *         (bar) field well.
     */

    public AxisDisplayOptions getPrimaryYAxisDisplayOptions() {
        return this.primaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, and axis step) of a combo chart's primary y-axis (bar) field
     * well.
     * </p>
     * 
     * @param primaryYAxisDisplayOptions
     *        The label display options (grid line, range, scale, and axis step) of a combo chart's primary y-axis (bar)
     *        field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withPrimaryYAxisDisplayOptions(AxisDisplayOptions primaryYAxisDisplayOptions) {
        setPrimaryYAxisDisplayOptions(primaryYAxisDisplayOptions);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's primary y-axis
     * (bar) field well.
     * </p>
     * 
     * @param primaryYAxisLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of a combo chart's primary
     *        y-axis (bar) field well.
     */

    public void setPrimaryYAxisLabelOptions(ChartAxisLabelOptions primaryYAxisLabelOptions) {
        this.primaryYAxisLabelOptions = primaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's primary y-axis
     * (bar) field well.
     * </p>
     * 
     * @return The label options (label text, label visibility, and sort icon visibility) of a combo chart's primary
     *         y-axis (bar) field well.
     */

    public ChartAxisLabelOptions getPrimaryYAxisLabelOptions() {
        return this.primaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's primary y-axis
     * (bar) field well.
     * </p>
     * 
     * @param primaryYAxisLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of a combo chart's primary
     *        y-axis (bar) field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withPrimaryYAxisLabelOptions(ChartAxisLabelOptions primaryYAxisLabelOptions) {
        setPrimaryYAxisLabelOptions(primaryYAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a combo chart's secondary y-axis (line) field
     * well.
     * </p>
     * 
     * @param secondaryYAxisDisplayOptions
     *        The label display options (grid line, range, scale, axis step) of a combo chart's secondary y-axis (line)
     *        field well.
     */

    public void setSecondaryYAxisDisplayOptions(AxisDisplayOptions secondaryYAxisDisplayOptions) {
        this.secondaryYAxisDisplayOptions = secondaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a combo chart's secondary y-axis (line) field
     * well.
     * </p>
     * 
     * @return The label display options (grid line, range, scale, axis step) of a combo chart's secondary y-axis (line)
     *         field well.
     */

    public AxisDisplayOptions getSecondaryYAxisDisplayOptions() {
        return this.secondaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) of a combo chart's secondary y-axis (line) field
     * well.
     * </p>
     * 
     * @param secondaryYAxisDisplayOptions
     *        The label display options (grid line, range, scale, axis step) of a combo chart's secondary y-axis (line)
     *        field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withSecondaryYAxisDisplayOptions(AxisDisplayOptions secondaryYAxisDisplayOptions) {
        setSecondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's secondary
     * y-axis(line) field well.
     * </p>
     * 
     * @param secondaryYAxisLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of a combo chart's secondary
     *        y-axis(line) field well.
     */

    public void setSecondaryYAxisLabelOptions(ChartAxisLabelOptions secondaryYAxisLabelOptions) {
        this.secondaryYAxisLabelOptions = secondaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's secondary
     * y-axis(line) field well.
     * </p>
     * 
     * @return The label options (label text, label visibility, and sort icon visibility) of a combo chart's secondary
     *         y-axis(line) field well.
     */

    public ChartAxisLabelOptions getSecondaryYAxisLabelOptions() {
        return this.secondaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's secondary
     * y-axis(line) field well.
     * </p>
     * 
     * @param secondaryYAxisLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of a combo chart's secondary
     *        y-axis(line) field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withSecondaryYAxisLabelOptions(ChartAxisLabelOptions secondaryYAxisLabelOptions) {
        setSecondaryYAxisLabelOptions(secondaryYAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's color field well.
     * </p>
     * 
     * @param colorLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of a combo chart's color field
     *        well.
     */

    public void setColorLabelOptions(ChartAxisLabelOptions colorLabelOptions) {
        this.colorLabelOptions = colorLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's color field well.
     * </p>
     * 
     * @return The label options (label text, label visibility, and sort icon visibility) of a combo chart's color field
     *         well.
     */

    public ChartAxisLabelOptions getColorLabelOptions() {
        return this.colorLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) of a combo chart's color field well.
     * </p>
     * 
     * @param colorLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) of a combo chart's color field
     *        well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withColorLabelOptions(ChartAxisLabelOptions colorLabelOptions) {
        setColorLabelOptions(colorLabelOptions);
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

    public ComboChartConfiguration withLegend(LegendOptions legend) {
        setLegend(legend);
        return this;
    }

    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * <p>
     * The data label options for a bar in a combo chart.
     * </p>
     * 
     * @param barDataLabels
     *        The options that determine if visual data labels are displayed.</p>
     *        <p>
     *        The data label options for a bar in a combo chart.
     */

    public void setBarDataLabels(DataLabelOptions barDataLabels) {
        this.barDataLabels = barDataLabels;
    }

    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * <p>
     * The data label options for a bar in a combo chart.
     * </p>
     * 
     * @return The options that determine if visual data labels are displayed.</p>
     *         <p>
     *         The data label options for a bar in a combo chart.
     */

    public DataLabelOptions getBarDataLabels() {
        return this.barDataLabels;
    }

    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * <p>
     * The data label options for a bar in a combo chart.
     * </p>
     * 
     * @param barDataLabels
     *        The options that determine if visual data labels are displayed.</p>
     *        <p>
     *        The data label options for a bar in a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withBarDataLabels(DataLabelOptions barDataLabels) {
        setBarDataLabels(barDataLabels);
        return this;
    }

    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * <p>
     * The data label options for a line in a combo chart.
     * </p>
     * 
     * @param lineDataLabels
     *        The options that determine if visual data labels are displayed.</p>
     *        <p>
     *        The data label options for a line in a combo chart.
     */

    public void setLineDataLabels(DataLabelOptions lineDataLabels) {
        this.lineDataLabels = lineDataLabels;
    }

    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * <p>
     * The data label options for a line in a combo chart.
     * </p>
     * 
     * @return The options that determine if visual data labels are displayed.</p>
     *         <p>
     *         The data label options for a line in a combo chart.
     */

    public DataLabelOptions getLineDataLabels() {
        return this.lineDataLabels;
    }

    /**
     * <p>
     * The options that determine if visual data labels are displayed.
     * </p>
     * <p>
     * The data label options for a line in a combo chart.
     * </p>
     * 
     * @param lineDataLabels
     *        The options that determine if visual data labels are displayed.</p>
     *        <p>
     *        The data label options for a line in a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartConfiguration withLineDataLabels(DataLabelOptions lineDataLabels) {
        setLineDataLabels(lineDataLabels);
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

    public ComboChartConfiguration withTooltip(TooltipOptions tooltip) {
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

    public ComboChartConfiguration withReferenceLines(ReferenceLine... referenceLines) {
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

    public ComboChartConfiguration withReferenceLines(java.util.Collection<ReferenceLine> referenceLines) {
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

    public ComboChartConfiguration withVisualPalette(VisualPalette visualPalette) {
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
        if (getBarsArrangement() != null)
            sb.append("BarsArrangement: ").append(getBarsArrangement()).append(",");
        if (getCategoryAxis() != null)
            sb.append("CategoryAxis: ").append(getCategoryAxis()).append(",");
        if (getCategoryLabelOptions() != null)
            sb.append("CategoryLabelOptions: ").append(getCategoryLabelOptions()).append(",");
        if (getPrimaryYAxisDisplayOptions() != null)
            sb.append("PrimaryYAxisDisplayOptions: ").append(getPrimaryYAxisDisplayOptions()).append(",");
        if (getPrimaryYAxisLabelOptions() != null)
            sb.append("PrimaryYAxisLabelOptions: ").append(getPrimaryYAxisLabelOptions()).append(",");
        if (getSecondaryYAxisDisplayOptions() != null)
            sb.append("SecondaryYAxisDisplayOptions: ").append(getSecondaryYAxisDisplayOptions()).append(",");
        if (getSecondaryYAxisLabelOptions() != null)
            sb.append("SecondaryYAxisLabelOptions: ").append(getSecondaryYAxisLabelOptions()).append(",");
        if (getColorLabelOptions() != null)
            sb.append("ColorLabelOptions: ").append(getColorLabelOptions()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getBarDataLabels() != null)
            sb.append("BarDataLabels: ").append(getBarDataLabels()).append(",");
        if (getLineDataLabels() != null)
            sb.append("LineDataLabels: ").append(getLineDataLabels()).append(",");
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

        if (obj instanceof ComboChartConfiguration == false)
            return false;
        ComboChartConfiguration other = (ComboChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getBarsArrangement() == null ^ this.getBarsArrangement() == null)
            return false;
        if (other.getBarsArrangement() != null && other.getBarsArrangement().equals(this.getBarsArrangement()) == false)
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
        if (other.getSecondaryYAxisDisplayOptions() == null ^ this.getSecondaryYAxisDisplayOptions() == null)
            return false;
        if (other.getSecondaryYAxisDisplayOptions() != null && other.getSecondaryYAxisDisplayOptions().equals(this.getSecondaryYAxisDisplayOptions()) == false)
            return false;
        if (other.getSecondaryYAxisLabelOptions() == null ^ this.getSecondaryYAxisLabelOptions() == null)
            return false;
        if (other.getSecondaryYAxisLabelOptions() != null && other.getSecondaryYAxisLabelOptions().equals(this.getSecondaryYAxisLabelOptions()) == false)
            return false;
        if (other.getColorLabelOptions() == null ^ this.getColorLabelOptions() == null)
            return false;
        if (other.getColorLabelOptions() != null && other.getColorLabelOptions().equals(this.getColorLabelOptions()) == false)
            return false;
        if (other.getLegend() == null ^ this.getLegend() == null)
            return false;
        if (other.getLegend() != null && other.getLegend().equals(this.getLegend()) == false)
            return false;
        if (other.getBarDataLabels() == null ^ this.getBarDataLabels() == null)
            return false;
        if (other.getBarDataLabels() != null && other.getBarDataLabels().equals(this.getBarDataLabels()) == false)
            return false;
        if (other.getLineDataLabels() == null ^ this.getLineDataLabels() == null)
            return false;
        if (other.getLineDataLabels() != null && other.getLineDataLabels().equals(this.getLineDataLabels()) == false)
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
        hashCode = prime * hashCode + ((getBarsArrangement() == null) ? 0 : getBarsArrangement().hashCode());
        hashCode = prime * hashCode + ((getCategoryAxis() == null) ? 0 : getCategoryAxis().hashCode());
        hashCode = prime * hashCode + ((getCategoryLabelOptions() == null) ? 0 : getCategoryLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getPrimaryYAxisDisplayOptions() == null) ? 0 : getPrimaryYAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getPrimaryYAxisLabelOptions() == null) ? 0 : getPrimaryYAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getSecondaryYAxisDisplayOptions() == null) ? 0 : getSecondaryYAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getSecondaryYAxisLabelOptions() == null) ? 0 : getSecondaryYAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getColorLabelOptions() == null) ? 0 : getColorLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getBarDataLabels() == null) ? 0 : getBarDataLabels().hashCode());
        hashCode = prime * hashCode + ((getLineDataLabels() == null) ? 0 : getLineDataLabels().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        hashCode = prime * hashCode + ((getReferenceLines() == null) ? 0 : getReferenceLines().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        return hashCode;
    }

    @Override
    public ComboChartConfiguration clone() {
        try {
            return (ComboChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ComboChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

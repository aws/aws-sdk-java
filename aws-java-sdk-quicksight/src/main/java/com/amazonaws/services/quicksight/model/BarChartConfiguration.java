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
 * The configuration of a <code>BarChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BarChartConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BarChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private BarChartFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a <code>BarChartVisual</code>.
     * </p>
     */
    private BarChartSortConfiguration sortConfiguration;
    /**
     * <p>
     * The orientation of the bars in a bar chart visual. There are two valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HORIZONTAL</code>: Used for charts that have horizontal bars. Visuals that use this value are horizontal
     * bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERTICAL</code>: Used for charts that have vertical bars. Visuals that use this value are vertical bar
     * charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
     * </p>
     * </li>
     * </ul>
     */
    private String orientation;
    /**
     * <p>
     * Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar that is
     * used in the visual.
     * </p>
     */
    private String barsArrangement;
    /**
     * <p>
     * The palette (chart color) display setup of the visual.
     * </p>
     */
    private VisualPalette visualPalette;
    /**
     * <p>
     * The small multiples setup for the visual.
     * </p>
     */
    private SmallMultiplesOptions smallMultiplesOptions;
    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) for bar chart category.
     * </p>
     */
    private AxisDisplayOptions categoryAxis;
    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a bar chart.
     * </p>
     */
    private ChartAxisLabelOptions categoryLabelOptions;
    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) for a bar chart value.
     * </p>
     */
    private AxisDisplayOptions valueAxis;
    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a bar chart value.
     * </p>
     */
    private ChartAxisLabelOptions valueLabelOptions;
    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a color that is used in a bar
     * chart.
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
     * The reference line setup of the visual.
     * </p>
     */
    private java.util.List<ReferenceLine> referenceLines;
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

    public void setFieldWells(BarChartFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public BarChartFieldWells getFieldWells() {
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

    public BarChartConfiguration withFieldWells(BarChartFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a <code>BarChartVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>BarChartVisual</code>.
     */

    public void setSortConfiguration(BarChartSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>BarChartVisual</code>.
     * </p>
     * 
     * @return The sort configuration of a <code>BarChartVisual</code>.
     */

    public BarChartSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>BarChartVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>BarChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartConfiguration withSortConfiguration(BarChartSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The orientation of the bars in a bar chart visual. There are two valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HORIZONTAL</code>: Used for charts that have horizontal bars. Visuals that use this value are horizontal
     * bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERTICAL</code>: Used for charts that have vertical bars. Visuals that use this value are vertical bar
     * charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
     * </p>
     * </li>
     * </ul>
     * 
     * @param orientation
     *        The orientation of the bars in a bar chart visual. There are two valid values in this structure:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HORIZONTAL</code>: Used for charts that have horizontal bars. Visuals that use this value are
     *        horizontal bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERTICAL</code>: Used for charts that have vertical bars. Visuals that use this value are vertical
     *        bar charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
     *        </p>
     *        </li>
     * @see BarChartOrientation
     */

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * <p>
     * The orientation of the bars in a bar chart visual. There are two valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HORIZONTAL</code>: Used for charts that have horizontal bars. Visuals that use this value are horizontal
     * bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERTICAL</code>: Used for charts that have vertical bars. Visuals that use this value are vertical bar
     * charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The orientation of the bars in a bar chart visual. There are two valid values in this structure:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HORIZONTAL</code>: Used for charts that have horizontal bars. Visuals that use this value are
     *         horizontal bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VERTICAL</code>: Used for charts that have vertical bars. Visuals that use this value are vertical
     *         bar charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
     *         </p>
     *         </li>
     * @see BarChartOrientation
     */

    public String getOrientation() {
        return this.orientation;
    }

    /**
     * <p>
     * The orientation of the bars in a bar chart visual. There are two valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HORIZONTAL</code>: Used for charts that have horizontal bars. Visuals that use this value are horizontal
     * bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERTICAL</code>: Used for charts that have vertical bars. Visuals that use this value are vertical bar
     * charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
     * </p>
     * </li>
     * </ul>
     * 
     * @param orientation
     *        The orientation of the bars in a bar chart visual. There are two valid values in this structure:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HORIZONTAL</code>: Used for charts that have horizontal bars. Visuals that use this value are
     *        horizontal bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERTICAL</code>: Used for charts that have vertical bars. Visuals that use this value are vertical
     *        bar charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BarChartOrientation
     */

    public BarChartConfiguration withOrientation(String orientation) {
        setOrientation(orientation);
        return this;
    }

    /**
     * <p>
     * The orientation of the bars in a bar chart visual. There are two valid values in this structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HORIZONTAL</code>: Used for charts that have horizontal bars. Visuals that use this value are horizontal
     * bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERTICAL</code>: Used for charts that have vertical bars. Visuals that use this value are vertical bar
     * charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
     * </p>
     * </li>
     * </ul>
     * 
     * @param orientation
     *        The orientation of the bars in a bar chart visual. There are two valid values in this structure:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HORIZONTAL</code>: Used for charts that have horizontal bars. Visuals that use this value are
     *        horizontal bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERTICAL</code>: Used for charts that have vertical bars. Visuals that use this value are vertical
     *        bar charts, vertical stacked bar charts, and vertical stacked 100% bar charts.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BarChartOrientation
     */

    public BarChartConfiguration withOrientation(BarChartOrientation orientation) {
        this.orientation = orientation.toString();
        return this;
    }

    /**
     * <p>
     * Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar that is
     * used in the visual.
     * </p>
     * 
     * @param barsArrangement
     *        Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar
     *        that is used in the visual.
     * @see BarsArrangement
     */

    public void setBarsArrangement(String barsArrangement) {
        this.barsArrangement = barsArrangement;
    }

    /**
     * <p>
     * Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar that is
     * used in the visual.
     * </p>
     * 
     * @return Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar
     *         that is used in the visual.
     * @see BarsArrangement
     */

    public String getBarsArrangement() {
        return this.barsArrangement;
    }

    /**
     * <p>
     * Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar that is
     * used in the visual.
     * </p>
     * 
     * @param barsArrangement
     *        Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar
     *        that is used in the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BarsArrangement
     */

    public BarChartConfiguration withBarsArrangement(String barsArrangement) {
        setBarsArrangement(barsArrangement);
        return this;
    }

    /**
     * <p>
     * Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar that is
     * used in the visual.
     * </p>
     * 
     * @param barsArrangement
     *        Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar
     *        that is used in the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BarsArrangement
     */

    public BarChartConfiguration withBarsArrangement(BarsArrangement barsArrangement) {
        this.barsArrangement = barsArrangement.toString();
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

    public BarChartConfiguration withVisualPalette(VisualPalette visualPalette) {
        setVisualPalette(visualPalette);
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

    public BarChartConfiguration withSmallMultiplesOptions(SmallMultiplesOptions smallMultiplesOptions) {
        setSmallMultiplesOptions(smallMultiplesOptions);
        return this;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) for bar chart category.
     * </p>
     * 
     * @param categoryAxis
     *        The label display options (grid line, range, scale, axis step) for bar chart category.
     */

    public void setCategoryAxis(AxisDisplayOptions categoryAxis) {
        this.categoryAxis = categoryAxis;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) for bar chart category.
     * </p>
     * 
     * @return The label display options (grid line, range, scale, axis step) for bar chart category.
     */

    public AxisDisplayOptions getCategoryAxis() {
        return this.categoryAxis;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) for bar chart category.
     * </p>
     * 
     * @param categoryAxis
     *        The label display options (grid line, range, scale, axis step) for bar chart category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartConfiguration withCategoryAxis(AxisDisplayOptions categoryAxis) {
        setCategoryAxis(categoryAxis);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a bar chart.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options (label text, label visibility and sort icon visibility) for a bar chart.
     */

    public void setCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        this.categoryLabelOptions = categoryLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a bar chart.
     * </p>
     * 
     * @return The label options (label text, label visibility and sort icon visibility) for a bar chart.
     */

    public ChartAxisLabelOptions getCategoryLabelOptions() {
        return this.categoryLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a bar chart.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options (label text, label visibility and sort icon visibility) for a bar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartConfiguration withCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        setCategoryLabelOptions(categoryLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) for a bar chart value.
     * </p>
     * 
     * @param valueAxis
     *        The label display options (grid line, range, scale, axis step) for a bar chart value.
     */

    public void setValueAxis(AxisDisplayOptions valueAxis) {
        this.valueAxis = valueAxis;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) for a bar chart value.
     * </p>
     * 
     * @return The label display options (grid line, range, scale, axis step) for a bar chart value.
     */

    public AxisDisplayOptions getValueAxis() {
        return this.valueAxis;
    }

    /**
     * <p>
     * The label display options (grid line, range, scale, axis step) for a bar chart value.
     * </p>
     * 
     * @param valueAxis
     *        The label display options (grid line, range, scale, axis step) for a bar chart value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartConfiguration withValueAxis(AxisDisplayOptions valueAxis) {
        setValueAxis(valueAxis);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a bar chart value.
     * </p>
     * 
     * @param valueLabelOptions
     *        The label options (label text, label visibility and sort icon visibility) for a bar chart value.
     */

    public void setValueLabelOptions(ChartAxisLabelOptions valueLabelOptions) {
        this.valueLabelOptions = valueLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a bar chart value.
     * </p>
     * 
     * @return The label options (label text, label visibility and sort icon visibility) for a bar chart value.
     */

    public ChartAxisLabelOptions getValueLabelOptions() {
        return this.valueLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a bar chart value.
     * </p>
     * 
     * @param valueLabelOptions
     *        The label options (label text, label visibility and sort icon visibility) for a bar chart value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartConfiguration withValueLabelOptions(ChartAxisLabelOptions valueLabelOptions) {
        setValueLabelOptions(valueLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a color that is used in a bar
     * chart.
     * </p>
     * 
     * @param colorLabelOptions
     *        The label options (label text, label visibility and sort icon visibility) for a color that is used in a
     *        bar chart.
     */

    public void setColorLabelOptions(ChartAxisLabelOptions colorLabelOptions) {
        this.colorLabelOptions = colorLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a color that is used in a bar
     * chart.
     * </p>
     * 
     * @return The label options (label text, label visibility and sort icon visibility) for a color that is used in a
     *         bar chart.
     */

    public ChartAxisLabelOptions getColorLabelOptions() {
        return this.colorLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility and sort icon visibility) for a color that is used in a bar
     * chart.
     * </p>
     * 
     * @param colorLabelOptions
     *        The label options (label text, label visibility and sort icon visibility) for a color that is used in a
     *        bar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartConfiguration withColorLabelOptions(ChartAxisLabelOptions colorLabelOptions) {
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

    public BarChartConfiguration withLegend(LegendOptions legend) {
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

    public BarChartConfiguration withDataLabels(DataLabelOptions dataLabels) {
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

    public BarChartConfiguration withTooltip(TooltipOptions tooltip) {
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

    public BarChartConfiguration withReferenceLines(ReferenceLine... referenceLines) {
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

    public BarChartConfiguration withReferenceLines(java.util.Collection<ReferenceLine> referenceLines) {
        setReferenceLines(referenceLines);
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

    public BarChartConfiguration withContributionAnalysisDefaults(ContributionAnalysisDefault... contributionAnalysisDefaults) {
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

    public BarChartConfiguration withContributionAnalysisDefaults(java.util.Collection<ContributionAnalysisDefault> contributionAnalysisDefaults) {
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
        if (getOrientation() != null)
            sb.append("Orientation: ").append(getOrientation()).append(",");
        if (getBarsArrangement() != null)
            sb.append("BarsArrangement: ").append(getBarsArrangement()).append(",");
        if (getVisualPalette() != null)
            sb.append("VisualPalette: ").append(getVisualPalette()).append(",");
        if (getSmallMultiplesOptions() != null)
            sb.append("SmallMultiplesOptions: ").append(getSmallMultiplesOptions()).append(",");
        if (getCategoryAxis() != null)
            sb.append("CategoryAxis: ").append(getCategoryAxis()).append(",");
        if (getCategoryLabelOptions() != null)
            sb.append("CategoryLabelOptions: ").append(getCategoryLabelOptions()).append(",");
        if (getValueAxis() != null)
            sb.append("ValueAxis: ").append(getValueAxis()).append(",");
        if (getValueLabelOptions() != null)
            sb.append("ValueLabelOptions: ").append(getValueLabelOptions()).append(",");
        if (getColorLabelOptions() != null)
            sb.append("ColorLabelOptions: ").append(getColorLabelOptions()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getDataLabels() != null)
            sb.append("DataLabels: ").append(getDataLabels()).append(",");
        if (getTooltip() != null)
            sb.append("Tooltip: ").append(getTooltip()).append(",");
        if (getReferenceLines() != null)
            sb.append("ReferenceLines: ").append(getReferenceLines()).append(",");
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

        if (obj instanceof BarChartConfiguration == false)
            return false;
        BarChartConfiguration other = (BarChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getOrientation() == null ^ this.getOrientation() == null)
            return false;
        if (other.getOrientation() != null && other.getOrientation().equals(this.getOrientation()) == false)
            return false;
        if (other.getBarsArrangement() == null ^ this.getBarsArrangement() == null)
            return false;
        if (other.getBarsArrangement() != null && other.getBarsArrangement().equals(this.getBarsArrangement()) == false)
            return false;
        if (other.getVisualPalette() == null ^ this.getVisualPalette() == null)
            return false;
        if (other.getVisualPalette() != null && other.getVisualPalette().equals(this.getVisualPalette()) == false)
            return false;
        if (other.getSmallMultiplesOptions() == null ^ this.getSmallMultiplesOptions() == null)
            return false;
        if (other.getSmallMultiplesOptions() != null && other.getSmallMultiplesOptions().equals(this.getSmallMultiplesOptions()) == false)
            return false;
        if (other.getCategoryAxis() == null ^ this.getCategoryAxis() == null)
            return false;
        if (other.getCategoryAxis() != null && other.getCategoryAxis().equals(this.getCategoryAxis()) == false)
            return false;
        if (other.getCategoryLabelOptions() == null ^ this.getCategoryLabelOptions() == null)
            return false;
        if (other.getCategoryLabelOptions() != null && other.getCategoryLabelOptions().equals(this.getCategoryLabelOptions()) == false)
            return false;
        if (other.getValueAxis() == null ^ this.getValueAxis() == null)
            return false;
        if (other.getValueAxis() != null && other.getValueAxis().equals(this.getValueAxis()) == false)
            return false;
        if (other.getValueLabelOptions() == null ^ this.getValueLabelOptions() == null)
            return false;
        if (other.getValueLabelOptions() != null && other.getValueLabelOptions().equals(this.getValueLabelOptions()) == false)
            return false;
        if (other.getColorLabelOptions() == null ^ this.getColorLabelOptions() == null)
            return false;
        if (other.getColorLabelOptions() != null && other.getColorLabelOptions().equals(this.getColorLabelOptions()) == false)
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
        if (other.getReferenceLines() == null ^ this.getReferenceLines() == null)
            return false;
        if (other.getReferenceLines() != null && other.getReferenceLines().equals(this.getReferenceLines()) == false)
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
        hashCode = prime * hashCode + ((getOrientation() == null) ? 0 : getOrientation().hashCode());
        hashCode = prime * hashCode + ((getBarsArrangement() == null) ? 0 : getBarsArrangement().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        hashCode = prime * hashCode + ((getSmallMultiplesOptions() == null) ? 0 : getSmallMultiplesOptions().hashCode());
        hashCode = prime * hashCode + ((getCategoryAxis() == null) ? 0 : getCategoryAxis().hashCode());
        hashCode = prime * hashCode + ((getCategoryLabelOptions() == null) ? 0 : getCategoryLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getValueAxis() == null) ? 0 : getValueAxis().hashCode());
        hashCode = prime * hashCode + ((getValueLabelOptions() == null) ? 0 : getValueLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getColorLabelOptions() == null) ? 0 : getColorLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getDataLabels() == null) ? 0 : getDataLabels().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        hashCode = prime * hashCode + ((getReferenceLines() == null) ? 0 : getReferenceLines().hashCode());
        hashCode = prime * hashCode + ((getContributionAnalysisDefaults() == null) ? 0 : getContributionAnalysisDefaults().hashCode());
        return hashCode;
    }

    @Override
    public BarChartConfiguration clone() {
        try {
            return (BarChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BarChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

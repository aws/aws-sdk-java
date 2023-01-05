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
 * The configuration of a line chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LineChartConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field well configuration of a line chart.
     * </p>
     */
    private LineChartFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a line chart.
     * </p>
     */
    private LineChartSortConfiguration sortConfiguration;
    /**
     * <p>
     * The forecast configuration of a line chart.
     * </p>
     */
    private java.util.List<ForecastConfiguration> forecastConfigurations;
    /**
     * <p>
     * Determines the type of the line chart.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The small multiples setup for the visual.
     * </p>
     */
    private SmallMultiplesOptions smallMultiplesOptions;
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
     * The series axis configuration of a line chart.
     * </p>
     */
    private LineSeriesAxisDisplayOptions primaryYAxisDisplayOptions;
    /**
     * <p>
     * The options that determine the presentation of the y-axis label.
     * </p>
     */
    private ChartAxisLabelOptions primaryYAxisLabelOptions;
    /**
     * <p>
     * The series axis configuration of a line chart.
     * </p>
     */
    private LineSeriesAxisDisplayOptions secondaryYAxisDisplayOptions;
    /**
     * <p>
     * The options that determine the presentation of the secondary y-axis label.
     * </p>
     */
    private ChartAxisLabelOptions secondaryYAxisLabelOptions;
    /**
     * <p>
     * The options that determine the default presentation of all line series in <code>LineChartVisual</code>.
     * </p>
     */
    private LineChartDefaultSeriesSettings defaultSeriesSettings;
    /**
     * <p>
     * The series item configuration of a line chart.
     * </p>
     */
    private java.util.List<SeriesItem> series;
    /**
     * <p>
     * The legend configuration of a line chart.
     * </p>
     */
    private LegendOptions legend;
    /**
     * <p>
     * The data label configuration of a line chart.
     * </p>
     */
    private DataLabelOptions dataLabels;
    /**
     * <p>
     * The reference lines configuration of a line chart.
     * </p>
     */
    private java.util.List<ReferenceLine> referenceLines;
    /**
     * <p>
     * The tooltip configuration of a line chart.
     * </p>
     */
    private TooltipOptions tooltip;
    /**
     * <p>
     * The default configuration of a line chart's contribution analysis.
     * </p>
     */
    private java.util.List<ContributionAnalysisDefault> contributionAnalysisDefaults;
    /**
     * <p>
     * The visual palette configuration of a line chart.
     * </p>
     */
    private VisualPalette visualPalette;

    /**
     * <p>
     * The field well configuration of a line chart.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a line chart.
     */

    public void setFieldWells(LineChartFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a line chart.
     * </p>
     * 
     * @return The field well configuration of a line chart.
     */

    public LineChartFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a line chart.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withFieldWells(LineChartFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a line chart.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a line chart.
     */

    public void setSortConfiguration(LineChartSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a line chart.
     * </p>
     * 
     * @return The sort configuration of a line chart.
     */

    public LineChartSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a line chart.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withSortConfiguration(LineChartSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The forecast configuration of a line chart.
     * </p>
     * 
     * @return The forecast configuration of a line chart.
     */

    public java.util.List<ForecastConfiguration> getForecastConfigurations() {
        return forecastConfigurations;
    }

    /**
     * <p>
     * The forecast configuration of a line chart.
     * </p>
     * 
     * @param forecastConfigurations
     *        The forecast configuration of a line chart.
     */

    public void setForecastConfigurations(java.util.Collection<ForecastConfiguration> forecastConfigurations) {
        if (forecastConfigurations == null) {
            this.forecastConfigurations = null;
            return;
        }

        this.forecastConfigurations = new java.util.ArrayList<ForecastConfiguration>(forecastConfigurations);
    }

    /**
     * <p>
     * The forecast configuration of a line chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastConfigurations(java.util.Collection)} or
     * {@link #withForecastConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param forecastConfigurations
     *        The forecast configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withForecastConfigurations(ForecastConfiguration... forecastConfigurations) {
        if (this.forecastConfigurations == null) {
            setForecastConfigurations(new java.util.ArrayList<ForecastConfiguration>(forecastConfigurations.length));
        }
        for (ForecastConfiguration ele : forecastConfigurations) {
            this.forecastConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The forecast configuration of a line chart.
     * </p>
     * 
     * @param forecastConfigurations
     *        The forecast configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withForecastConfigurations(java.util.Collection<ForecastConfiguration> forecastConfigurations) {
        setForecastConfigurations(forecastConfigurations);
        return this;
    }

    /**
     * <p>
     * Determines the type of the line chart.
     * </p>
     * 
     * @param type
     *        Determines the type of the line chart.
     * @see LineChartType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Determines the type of the line chart.
     * </p>
     * 
     * @return Determines the type of the line chart.
     * @see LineChartType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Determines the type of the line chart.
     * </p>
     * 
     * @param type
     *        Determines the type of the line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineChartType
     */

    public LineChartConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Determines the type of the line chart.
     * </p>
     * 
     * @param type
     *        Determines the type of the line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineChartType
     */

    public LineChartConfiguration withType(LineChartType type) {
        this.type = type.toString();
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

    public LineChartConfiguration withSmallMultiplesOptions(SmallMultiplesOptions smallMultiplesOptions) {
        setSmallMultiplesOptions(smallMultiplesOptions);
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

    public LineChartConfiguration withXAxisDisplayOptions(AxisDisplayOptions xAxisDisplayOptions) {
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

    public LineChartConfiguration withXAxisLabelOptions(ChartAxisLabelOptions xAxisLabelOptions) {
        setXAxisLabelOptions(xAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The series axis configuration of a line chart.
     * </p>
     * 
     * @param primaryYAxisDisplayOptions
     *        The series axis configuration of a line chart.
     */

    public void setPrimaryYAxisDisplayOptions(LineSeriesAxisDisplayOptions primaryYAxisDisplayOptions) {
        this.primaryYAxisDisplayOptions = primaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The series axis configuration of a line chart.
     * </p>
     * 
     * @return The series axis configuration of a line chart.
     */

    public LineSeriesAxisDisplayOptions getPrimaryYAxisDisplayOptions() {
        return this.primaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The series axis configuration of a line chart.
     * </p>
     * 
     * @param primaryYAxisDisplayOptions
     *        The series axis configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withPrimaryYAxisDisplayOptions(LineSeriesAxisDisplayOptions primaryYAxisDisplayOptions) {
        setPrimaryYAxisDisplayOptions(primaryYAxisDisplayOptions);
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

    public LineChartConfiguration withPrimaryYAxisLabelOptions(ChartAxisLabelOptions primaryYAxisLabelOptions) {
        setPrimaryYAxisLabelOptions(primaryYAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The series axis configuration of a line chart.
     * </p>
     * 
     * @param secondaryYAxisDisplayOptions
     *        The series axis configuration of a line chart.
     */

    public void setSecondaryYAxisDisplayOptions(LineSeriesAxisDisplayOptions secondaryYAxisDisplayOptions) {
        this.secondaryYAxisDisplayOptions = secondaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The series axis configuration of a line chart.
     * </p>
     * 
     * @return The series axis configuration of a line chart.
     */

    public LineSeriesAxisDisplayOptions getSecondaryYAxisDisplayOptions() {
        return this.secondaryYAxisDisplayOptions;
    }

    /**
     * <p>
     * The series axis configuration of a line chart.
     * </p>
     * 
     * @param secondaryYAxisDisplayOptions
     *        The series axis configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withSecondaryYAxisDisplayOptions(LineSeriesAxisDisplayOptions secondaryYAxisDisplayOptions) {
        setSecondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the secondary y-axis label.
     * </p>
     * 
     * @param secondaryYAxisLabelOptions
     *        The options that determine the presentation of the secondary y-axis label.
     */

    public void setSecondaryYAxisLabelOptions(ChartAxisLabelOptions secondaryYAxisLabelOptions) {
        this.secondaryYAxisLabelOptions = secondaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the secondary y-axis label.
     * </p>
     * 
     * @return The options that determine the presentation of the secondary y-axis label.
     */

    public ChartAxisLabelOptions getSecondaryYAxisLabelOptions() {
        return this.secondaryYAxisLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the secondary y-axis label.
     * </p>
     * 
     * @param secondaryYAxisLabelOptions
     *        The options that determine the presentation of the secondary y-axis label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withSecondaryYAxisLabelOptions(ChartAxisLabelOptions secondaryYAxisLabelOptions) {
        setSecondaryYAxisLabelOptions(secondaryYAxisLabelOptions);
        return this;
    }

    /**
     * <p>
     * The options that determine the default presentation of all line series in <code>LineChartVisual</code>.
     * </p>
     * 
     * @param defaultSeriesSettings
     *        The options that determine the default presentation of all line series in <code>LineChartVisual</code>.
     */

    public void setDefaultSeriesSettings(LineChartDefaultSeriesSettings defaultSeriesSettings) {
        this.defaultSeriesSettings = defaultSeriesSettings;
    }

    /**
     * <p>
     * The options that determine the default presentation of all line series in <code>LineChartVisual</code>.
     * </p>
     * 
     * @return The options that determine the default presentation of all line series in <code>LineChartVisual</code>.
     */

    public LineChartDefaultSeriesSettings getDefaultSeriesSettings() {
        return this.defaultSeriesSettings;
    }

    /**
     * <p>
     * The options that determine the default presentation of all line series in <code>LineChartVisual</code>.
     * </p>
     * 
     * @param defaultSeriesSettings
     *        The options that determine the default presentation of all line series in <code>LineChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withDefaultSeriesSettings(LineChartDefaultSeriesSettings defaultSeriesSettings) {
        setDefaultSeriesSettings(defaultSeriesSettings);
        return this;
    }

    /**
     * <p>
     * The series item configuration of a line chart.
     * </p>
     * 
     * @return The series item configuration of a line chart.
     */

    public java.util.List<SeriesItem> getSeries() {
        return series;
    }

    /**
     * <p>
     * The series item configuration of a line chart.
     * </p>
     * 
     * @param series
     *        The series item configuration of a line chart.
     */

    public void setSeries(java.util.Collection<SeriesItem> series) {
        if (series == null) {
            this.series = null;
            return;
        }

        this.series = new java.util.ArrayList<SeriesItem>(series);
    }

    /**
     * <p>
     * The series item configuration of a line chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSeries(java.util.Collection)} or {@link #withSeries(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param series
     *        The series item configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withSeries(SeriesItem... series) {
        if (this.series == null) {
            setSeries(new java.util.ArrayList<SeriesItem>(series.length));
        }
        for (SeriesItem ele : series) {
            this.series.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The series item configuration of a line chart.
     * </p>
     * 
     * @param series
     *        The series item configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withSeries(java.util.Collection<SeriesItem> series) {
        setSeries(series);
        return this;
    }

    /**
     * <p>
     * The legend configuration of a line chart.
     * </p>
     * 
     * @param legend
     *        The legend configuration of a line chart.
     */

    public void setLegend(LegendOptions legend) {
        this.legend = legend;
    }

    /**
     * <p>
     * The legend configuration of a line chart.
     * </p>
     * 
     * @return The legend configuration of a line chart.
     */

    public LegendOptions getLegend() {
        return this.legend;
    }

    /**
     * <p>
     * The legend configuration of a line chart.
     * </p>
     * 
     * @param legend
     *        The legend configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withLegend(LegendOptions legend) {
        setLegend(legend);
        return this;
    }

    /**
     * <p>
     * The data label configuration of a line chart.
     * </p>
     * 
     * @param dataLabels
     *        The data label configuration of a line chart.
     */

    public void setDataLabels(DataLabelOptions dataLabels) {
        this.dataLabels = dataLabels;
    }

    /**
     * <p>
     * The data label configuration of a line chart.
     * </p>
     * 
     * @return The data label configuration of a line chart.
     */

    public DataLabelOptions getDataLabels() {
        return this.dataLabels;
    }

    /**
     * <p>
     * The data label configuration of a line chart.
     * </p>
     * 
     * @param dataLabels
     *        The data label configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withDataLabels(DataLabelOptions dataLabels) {
        setDataLabels(dataLabels);
        return this;
    }

    /**
     * <p>
     * The reference lines configuration of a line chart.
     * </p>
     * 
     * @return The reference lines configuration of a line chart.
     */

    public java.util.List<ReferenceLine> getReferenceLines() {
        return referenceLines;
    }

    /**
     * <p>
     * The reference lines configuration of a line chart.
     * </p>
     * 
     * @param referenceLines
     *        The reference lines configuration of a line chart.
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
     * The reference lines configuration of a line chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceLines(java.util.Collection)} or {@link #withReferenceLines(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param referenceLines
     *        The reference lines configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withReferenceLines(ReferenceLine... referenceLines) {
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
     * The reference lines configuration of a line chart.
     * </p>
     * 
     * @param referenceLines
     *        The reference lines configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withReferenceLines(java.util.Collection<ReferenceLine> referenceLines) {
        setReferenceLines(referenceLines);
        return this;
    }

    /**
     * <p>
     * The tooltip configuration of a line chart.
     * </p>
     * 
     * @param tooltip
     *        The tooltip configuration of a line chart.
     */

    public void setTooltip(TooltipOptions tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * <p>
     * The tooltip configuration of a line chart.
     * </p>
     * 
     * @return The tooltip configuration of a line chart.
     */

    public TooltipOptions getTooltip() {
        return this.tooltip;
    }

    /**
     * <p>
     * The tooltip configuration of a line chart.
     * </p>
     * 
     * @param tooltip
     *        The tooltip configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withTooltip(TooltipOptions tooltip) {
        setTooltip(tooltip);
        return this;
    }

    /**
     * <p>
     * The default configuration of a line chart's contribution analysis.
     * </p>
     * 
     * @return The default configuration of a line chart's contribution analysis.
     */

    public java.util.List<ContributionAnalysisDefault> getContributionAnalysisDefaults() {
        return contributionAnalysisDefaults;
    }

    /**
     * <p>
     * The default configuration of a line chart's contribution analysis.
     * </p>
     * 
     * @param contributionAnalysisDefaults
     *        The default configuration of a line chart's contribution analysis.
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
     * The default configuration of a line chart's contribution analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContributionAnalysisDefaults(java.util.Collection)} or
     * {@link #withContributionAnalysisDefaults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param contributionAnalysisDefaults
     *        The default configuration of a line chart's contribution analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withContributionAnalysisDefaults(ContributionAnalysisDefault... contributionAnalysisDefaults) {
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
     * The default configuration of a line chart's contribution analysis.
     * </p>
     * 
     * @param contributionAnalysisDefaults
     *        The default configuration of a line chart's contribution analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withContributionAnalysisDefaults(java.util.Collection<ContributionAnalysisDefault> contributionAnalysisDefaults) {
        setContributionAnalysisDefaults(contributionAnalysisDefaults);
        return this;
    }

    /**
     * <p>
     * The visual palette configuration of a line chart.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a line chart.
     */

    public void setVisualPalette(VisualPalette visualPalette) {
        this.visualPalette = visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a line chart.
     * </p>
     * 
     * @return The visual palette configuration of a line chart.
     */

    public VisualPalette getVisualPalette() {
        return this.visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a line chart.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartConfiguration withVisualPalette(VisualPalette visualPalette) {
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
        if (getForecastConfigurations() != null)
            sb.append("ForecastConfigurations: ").append(getForecastConfigurations()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSmallMultiplesOptions() != null)
            sb.append("SmallMultiplesOptions: ").append(getSmallMultiplesOptions()).append(",");
        if (getXAxisDisplayOptions() != null)
            sb.append("XAxisDisplayOptions: ").append(getXAxisDisplayOptions()).append(",");
        if (getXAxisLabelOptions() != null)
            sb.append("XAxisLabelOptions: ").append(getXAxisLabelOptions()).append(",");
        if (getPrimaryYAxisDisplayOptions() != null)
            sb.append("PrimaryYAxisDisplayOptions: ").append(getPrimaryYAxisDisplayOptions()).append(",");
        if (getPrimaryYAxisLabelOptions() != null)
            sb.append("PrimaryYAxisLabelOptions: ").append(getPrimaryYAxisLabelOptions()).append(",");
        if (getSecondaryYAxisDisplayOptions() != null)
            sb.append("SecondaryYAxisDisplayOptions: ").append(getSecondaryYAxisDisplayOptions()).append(",");
        if (getSecondaryYAxisLabelOptions() != null)
            sb.append("SecondaryYAxisLabelOptions: ").append(getSecondaryYAxisLabelOptions()).append(",");
        if (getDefaultSeriesSettings() != null)
            sb.append("DefaultSeriesSettings: ").append(getDefaultSeriesSettings()).append(",");
        if (getSeries() != null)
            sb.append("Series: ").append(getSeries()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getDataLabels() != null)
            sb.append("DataLabels: ").append(getDataLabels()).append(",");
        if (getReferenceLines() != null)
            sb.append("ReferenceLines: ").append(getReferenceLines()).append(",");
        if (getTooltip() != null)
            sb.append("Tooltip: ").append(getTooltip()).append(",");
        if (getContributionAnalysisDefaults() != null)
            sb.append("ContributionAnalysisDefaults: ").append(getContributionAnalysisDefaults()).append(",");
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

        if (obj instanceof LineChartConfiguration == false)
            return false;
        LineChartConfiguration other = (LineChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getForecastConfigurations() == null ^ this.getForecastConfigurations() == null)
            return false;
        if (other.getForecastConfigurations() != null && other.getForecastConfigurations().equals(this.getForecastConfigurations()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSmallMultiplesOptions() == null ^ this.getSmallMultiplesOptions() == null)
            return false;
        if (other.getSmallMultiplesOptions() != null && other.getSmallMultiplesOptions().equals(this.getSmallMultiplesOptions()) == false)
            return false;
        if (other.getXAxisDisplayOptions() == null ^ this.getXAxisDisplayOptions() == null)
            return false;
        if (other.getXAxisDisplayOptions() != null && other.getXAxisDisplayOptions().equals(this.getXAxisDisplayOptions()) == false)
            return false;
        if (other.getXAxisLabelOptions() == null ^ this.getXAxisLabelOptions() == null)
            return false;
        if (other.getXAxisLabelOptions() != null && other.getXAxisLabelOptions().equals(this.getXAxisLabelOptions()) == false)
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
        if (other.getDefaultSeriesSettings() == null ^ this.getDefaultSeriesSettings() == null)
            return false;
        if (other.getDefaultSeriesSettings() != null && other.getDefaultSeriesSettings().equals(this.getDefaultSeriesSettings()) == false)
            return false;
        if (other.getSeries() == null ^ this.getSeries() == null)
            return false;
        if (other.getSeries() != null && other.getSeries().equals(this.getSeries()) == false)
            return false;
        if (other.getLegend() == null ^ this.getLegend() == null)
            return false;
        if (other.getLegend() != null && other.getLegend().equals(this.getLegend()) == false)
            return false;
        if (other.getDataLabels() == null ^ this.getDataLabels() == null)
            return false;
        if (other.getDataLabels() != null && other.getDataLabels().equals(this.getDataLabels()) == false)
            return false;
        if (other.getReferenceLines() == null ^ this.getReferenceLines() == null)
            return false;
        if (other.getReferenceLines() != null && other.getReferenceLines().equals(this.getReferenceLines()) == false)
            return false;
        if (other.getTooltip() == null ^ this.getTooltip() == null)
            return false;
        if (other.getTooltip() != null && other.getTooltip().equals(this.getTooltip()) == false)
            return false;
        if (other.getContributionAnalysisDefaults() == null ^ this.getContributionAnalysisDefaults() == null)
            return false;
        if (other.getContributionAnalysisDefaults() != null && other.getContributionAnalysisDefaults().equals(this.getContributionAnalysisDefaults()) == false)
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
        hashCode = prime * hashCode + ((getForecastConfigurations() == null) ? 0 : getForecastConfigurations().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSmallMultiplesOptions() == null) ? 0 : getSmallMultiplesOptions().hashCode());
        hashCode = prime * hashCode + ((getXAxisDisplayOptions() == null) ? 0 : getXAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getXAxisLabelOptions() == null) ? 0 : getXAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getPrimaryYAxisDisplayOptions() == null) ? 0 : getPrimaryYAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getPrimaryYAxisLabelOptions() == null) ? 0 : getPrimaryYAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getSecondaryYAxisDisplayOptions() == null) ? 0 : getSecondaryYAxisDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getSecondaryYAxisLabelOptions() == null) ? 0 : getSecondaryYAxisLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getDefaultSeriesSettings() == null) ? 0 : getDefaultSeriesSettings().hashCode());
        hashCode = prime * hashCode + ((getSeries() == null) ? 0 : getSeries().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getDataLabels() == null) ? 0 : getDataLabels().hashCode());
        hashCode = prime * hashCode + ((getReferenceLines() == null) ? 0 : getReferenceLines().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        hashCode = prime * hashCode + ((getContributionAnalysisDefaults() == null) ? 0 : getContributionAnalysisDefaults().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        return hashCode;
    }

    @Override
    public LineChartConfiguration clone() {
        try {
            return (LineChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LineChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

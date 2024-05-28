/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The configuration of a <code>RadarChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RadarChartConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RadarChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field well configuration of a <code>RadarChartVisual</code>.
     * </p>
     */
    private RadarChartFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a <code>RadarChartVisual</code>.
     * </p>
     */
    private RadarChartSortConfiguration sortConfiguration;
    /**
     * <p>
     * The shape of the radar chart.
     * </p>
     */
    private String shape;
    /**
     * <p>
     * The base sreies settings of a radar chart.
     * </p>
     */
    private RadarChartSeriesSettings baseSeriesSettings;
    /**
     * <p>
     * The start angle of a radar chart's axis.
     * </p>
     */
    private Double startAngle;
    /**
     * <p>
     * The palette (chart color) display setup of the visual.
     * </p>
     */
    private VisualPalette visualPalette;
    /**
     * <p>
     * Determines the visibility of the colors of alternatign bands in a radar chart.
     * </p>
     */
    private String alternateBandColorsVisibility;
    /**
     * <p>
     * The color of the even-numbered alternate bands of a radar chart.
     * </p>
     */
    private String alternateBandEvenColor;
    /**
     * <p>
     * The color of the odd-numbered alternate bands of a radar chart.
     * </p>
     */
    private String alternateBandOddColor;
    /**
     * <p>
     * The category axis of a radar chart.
     * </p>
     */
    private AxisDisplayOptions categoryAxis;
    /**
     * <p>
     * The category label options of a radar chart.
     * </p>
     */
    private ChartAxisLabelOptions categoryLabelOptions;
    /**
     * <p>
     * The color axis of a radar chart.
     * </p>
     */
    private AxisDisplayOptions colorAxis;
    /**
     * <p>
     * The color label options of a radar chart.
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
     * The axis behavior options of a radar chart.
     * </p>
     */
    private String axesRangeScale;
    /**
     * <p>
     * The general visual interactions setup for a visual.
     * </p>
     */
    private VisualInteractionOptions interactions;

    /**
     * <p>
     * The field well configuration of a <code>RadarChartVisual</code>.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a <code>RadarChartVisual</code>.
     */

    public void setFieldWells(RadarChartFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a <code>RadarChartVisual</code>.
     * </p>
     * 
     * @return The field well configuration of a <code>RadarChartVisual</code>.
     */

    public RadarChartFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a <code>RadarChartVisual</code>.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a <code>RadarChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withFieldWells(RadarChartFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a <code>RadarChartVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>RadarChartVisual</code>.
     */

    public void setSortConfiguration(RadarChartSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>RadarChartVisual</code>.
     * </p>
     * 
     * @return The sort configuration of a <code>RadarChartVisual</code>.
     */

    public RadarChartSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>RadarChartVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>RadarChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withSortConfiguration(RadarChartSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The shape of the radar chart.
     * </p>
     * 
     * @param shape
     *        The shape of the radar chart.
     * @see RadarChartShape
     */

    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * <p>
     * The shape of the radar chart.
     * </p>
     * 
     * @return The shape of the radar chart.
     * @see RadarChartShape
     */

    public String getShape() {
        return this.shape;
    }

    /**
     * <p>
     * The shape of the radar chart.
     * </p>
     * 
     * @param shape
     *        The shape of the radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadarChartShape
     */

    public RadarChartConfiguration withShape(String shape) {
        setShape(shape);
        return this;
    }

    /**
     * <p>
     * The shape of the radar chart.
     * </p>
     * 
     * @param shape
     *        The shape of the radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadarChartShape
     */

    public RadarChartConfiguration withShape(RadarChartShape shape) {
        this.shape = shape.toString();
        return this;
    }

    /**
     * <p>
     * The base sreies settings of a radar chart.
     * </p>
     * 
     * @param baseSeriesSettings
     *        The base sreies settings of a radar chart.
     */

    public void setBaseSeriesSettings(RadarChartSeriesSettings baseSeriesSettings) {
        this.baseSeriesSettings = baseSeriesSettings;
    }

    /**
     * <p>
     * The base sreies settings of a radar chart.
     * </p>
     * 
     * @return The base sreies settings of a radar chart.
     */

    public RadarChartSeriesSettings getBaseSeriesSettings() {
        return this.baseSeriesSettings;
    }

    /**
     * <p>
     * The base sreies settings of a radar chart.
     * </p>
     * 
     * @param baseSeriesSettings
     *        The base sreies settings of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withBaseSeriesSettings(RadarChartSeriesSettings baseSeriesSettings) {
        setBaseSeriesSettings(baseSeriesSettings);
        return this;
    }

    /**
     * <p>
     * The start angle of a radar chart's axis.
     * </p>
     * 
     * @param startAngle
     *        The start angle of a radar chart's axis.
     */

    public void setStartAngle(Double startAngle) {
        this.startAngle = startAngle;
    }

    /**
     * <p>
     * The start angle of a radar chart's axis.
     * </p>
     * 
     * @return The start angle of a radar chart's axis.
     */

    public Double getStartAngle() {
        return this.startAngle;
    }

    /**
     * <p>
     * The start angle of a radar chart's axis.
     * </p>
     * 
     * @param startAngle
     *        The start angle of a radar chart's axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withStartAngle(Double startAngle) {
        setStartAngle(startAngle);
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

    public RadarChartConfiguration withVisualPalette(VisualPalette visualPalette) {
        setVisualPalette(visualPalette);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the colors of alternatign bands in a radar chart.
     * </p>
     * 
     * @param alternateBandColorsVisibility
     *        Determines the visibility of the colors of alternatign bands in a radar chart.
     * @see Visibility
     */

    public void setAlternateBandColorsVisibility(String alternateBandColorsVisibility) {
        this.alternateBandColorsVisibility = alternateBandColorsVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the colors of alternatign bands in a radar chart.
     * </p>
     * 
     * @return Determines the visibility of the colors of alternatign bands in a radar chart.
     * @see Visibility
     */

    public String getAlternateBandColorsVisibility() {
        return this.alternateBandColorsVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the colors of alternatign bands in a radar chart.
     * </p>
     * 
     * @param alternateBandColorsVisibility
     *        Determines the visibility of the colors of alternatign bands in a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public RadarChartConfiguration withAlternateBandColorsVisibility(String alternateBandColorsVisibility) {
        setAlternateBandColorsVisibility(alternateBandColorsVisibility);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the colors of alternatign bands in a radar chart.
     * </p>
     * 
     * @param alternateBandColorsVisibility
     *        Determines the visibility of the colors of alternatign bands in a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public RadarChartConfiguration withAlternateBandColorsVisibility(Visibility alternateBandColorsVisibility) {
        this.alternateBandColorsVisibility = alternateBandColorsVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The color of the even-numbered alternate bands of a radar chart.
     * </p>
     * 
     * @param alternateBandEvenColor
     *        The color of the even-numbered alternate bands of a radar chart.
     */

    public void setAlternateBandEvenColor(String alternateBandEvenColor) {
        this.alternateBandEvenColor = alternateBandEvenColor;
    }

    /**
     * <p>
     * The color of the even-numbered alternate bands of a radar chart.
     * </p>
     * 
     * @return The color of the even-numbered alternate bands of a radar chart.
     */

    public String getAlternateBandEvenColor() {
        return this.alternateBandEvenColor;
    }

    /**
     * <p>
     * The color of the even-numbered alternate bands of a radar chart.
     * </p>
     * 
     * @param alternateBandEvenColor
     *        The color of the even-numbered alternate bands of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withAlternateBandEvenColor(String alternateBandEvenColor) {
        setAlternateBandEvenColor(alternateBandEvenColor);
        return this;
    }

    /**
     * <p>
     * The color of the odd-numbered alternate bands of a radar chart.
     * </p>
     * 
     * @param alternateBandOddColor
     *        The color of the odd-numbered alternate bands of a radar chart.
     */

    public void setAlternateBandOddColor(String alternateBandOddColor) {
        this.alternateBandOddColor = alternateBandOddColor;
    }

    /**
     * <p>
     * The color of the odd-numbered alternate bands of a radar chart.
     * </p>
     * 
     * @return The color of the odd-numbered alternate bands of a radar chart.
     */

    public String getAlternateBandOddColor() {
        return this.alternateBandOddColor;
    }

    /**
     * <p>
     * The color of the odd-numbered alternate bands of a radar chart.
     * </p>
     * 
     * @param alternateBandOddColor
     *        The color of the odd-numbered alternate bands of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withAlternateBandOddColor(String alternateBandOddColor) {
        setAlternateBandOddColor(alternateBandOddColor);
        return this;
    }

    /**
     * <p>
     * The category axis of a radar chart.
     * </p>
     * 
     * @param categoryAxis
     *        The category axis of a radar chart.
     */

    public void setCategoryAxis(AxisDisplayOptions categoryAxis) {
        this.categoryAxis = categoryAxis;
    }

    /**
     * <p>
     * The category axis of a radar chart.
     * </p>
     * 
     * @return The category axis of a radar chart.
     */

    public AxisDisplayOptions getCategoryAxis() {
        return this.categoryAxis;
    }

    /**
     * <p>
     * The category axis of a radar chart.
     * </p>
     * 
     * @param categoryAxis
     *        The category axis of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withCategoryAxis(AxisDisplayOptions categoryAxis) {
        setCategoryAxis(categoryAxis);
        return this;
    }

    /**
     * <p>
     * The category label options of a radar chart.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The category label options of a radar chart.
     */

    public void setCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        this.categoryLabelOptions = categoryLabelOptions;
    }

    /**
     * <p>
     * The category label options of a radar chart.
     * </p>
     * 
     * @return The category label options of a radar chart.
     */

    public ChartAxisLabelOptions getCategoryLabelOptions() {
        return this.categoryLabelOptions;
    }

    /**
     * <p>
     * The category label options of a radar chart.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The category label options of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        setCategoryLabelOptions(categoryLabelOptions);
        return this;
    }

    /**
     * <p>
     * The color axis of a radar chart.
     * </p>
     * 
     * @param colorAxis
     *        The color axis of a radar chart.
     */

    public void setColorAxis(AxisDisplayOptions colorAxis) {
        this.colorAxis = colorAxis;
    }

    /**
     * <p>
     * The color axis of a radar chart.
     * </p>
     * 
     * @return The color axis of a radar chart.
     */

    public AxisDisplayOptions getColorAxis() {
        return this.colorAxis;
    }

    /**
     * <p>
     * The color axis of a radar chart.
     * </p>
     * 
     * @param colorAxis
     *        The color axis of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withColorAxis(AxisDisplayOptions colorAxis) {
        setColorAxis(colorAxis);
        return this;
    }

    /**
     * <p>
     * The color label options of a radar chart.
     * </p>
     * 
     * @param colorLabelOptions
     *        The color label options of a radar chart.
     */

    public void setColorLabelOptions(ChartAxisLabelOptions colorLabelOptions) {
        this.colorLabelOptions = colorLabelOptions;
    }

    /**
     * <p>
     * The color label options of a radar chart.
     * </p>
     * 
     * @return The color label options of a radar chart.
     */

    public ChartAxisLabelOptions getColorLabelOptions() {
        return this.colorLabelOptions;
    }

    /**
     * <p>
     * The color label options of a radar chart.
     * </p>
     * 
     * @param colorLabelOptions
     *        The color label options of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withColorLabelOptions(ChartAxisLabelOptions colorLabelOptions) {
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

    public RadarChartConfiguration withLegend(LegendOptions legend) {
        setLegend(legend);
        return this;
    }

    /**
     * <p>
     * The axis behavior options of a radar chart.
     * </p>
     * 
     * @param axesRangeScale
     *        The axis behavior options of a radar chart.
     * @see RadarChartAxesRangeScale
     */

    public void setAxesRangeScale(String axesRangeScale) {
        this.axesRangeScale = axesRangeScale;
    }

    /**
     * <p>
     * The axis behavior options of a radar chart.
     * </p>
     * 
     * @return The axis behavior options of a radar chart.
     * @see RadarChartAxesRangeScale
     */

    public String getAxesRangeScale() {
        return this.axesRangeScale;
    }

    /**
     * <p>
     * The axis behavior options of a radar chart.
     * </p>
     * 
     * @param axesRangeScale
     *        The axis behavior options of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadarChartAxesRangeScale
     */

    public RadarChartConfiguration withAxesRangeScale(String axesRangeScale) {
        setAxesRangeScale(axesRangeScale);
        return this;
    }

    /**
     * <p>
     * The axis behavior options of a radar chart.
     * </p>
     * 
     * @param axesRangeScale
     *        The axis behavior options of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadarChartAxesRangeScale
     */

    public RadarChartConfiguration withAxesRangeScale(RadarChartAxesRangeScale axesRangeScale) {
        this.axesRangeScale = axesRangeScale.toString();
        return this;
    }

    /**
     * <p>
     * The general visual interactions setup for a visual.
     * </p>
     * 
     * @param interactions
     *        The general visual interactions setup for a visual.
     */

    public void setInteractions(VisualInteractionOptions interactions) {
        this.interactions = interactions;
    }

    /**
     * <p>
     * The general visual interactions setup for a visual.
     * </p>
     * 
     * @return The general visual interactions setup for a visual.
     */

    public VisualInteractionOptions getInteractions() {
        return this.interactions;
    }

    /**
     * <p>
     * The general visual interactions setup for a visual.
     * </p>
     * 
     * @param interactions
     *        The general visual interactions setup for a visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartConfiguration withInteractions(VisualInteractionOptions interactions) {
        setInteractions(interactions);
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
        if (getShape() != null)
            sb.append("Shape: ").append(getShape()).append(",");
        if (getBaseSeriesSettings() != null)
            sb.append("BaseSeriesSettings: ").append(getBaseSeriesSettings()).append(",");
        if (getStartAngle() != null)
            sb.append("StartAngle: ").append(getStartAngle()).append(",");
        if (getVisualPalette() != null)
            sb.append("VisualPalette: ").append(getVisualPalette()).append(",");
        if (getAlternateBandColorsVisibility() != null)
            sb.append("AlternateBandColorsVisibility: ").append(getAlternateBandColorsVisibility()).append(",");
        if (getAlternateBandEvenColor() != null)
            sb.append("AlternateBandEvenColor: ").append(getAlternateBandEvenColor()).append(",");
        if (getAlternateBandOddColor() != null)
            sb.append("AlternateBandOddColor: ").append(getAlternateBandOddColor()).append(",");
        if (getCategoryAxis() != null)
            sb.append("CategoryAxis: ").append(getCategoryAxis()).append(",");
        if (getCategoryLabelOptions() != null)
            sb.append("CategoryLabelOptions: ").append(getCategoryLabelOptions()).append(",");
        if (getColorAxis() != null)
            sb.append("ColorAxis: ").append(getColorAxis()).append(",");
        if (getColorLabelOptions() != null)
            sb.append("ColorLabelOptions: ").append(getColorLabelOptions()).append(",");
        if (getLegend() != null)
            sb.append("Legend: ").append(getLegend()).append(",");
        if (getAxesRangeScale() != null)
            sb.append("AxesRangeScale: ").append(getAxesRangeScale()).append(",");
        if (getInteractions() != null)
            sb.append("Interactions: ").append(getInteractions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RadarChartConfiguration == false)
            return false;
        RadarChartConfiguration other = (RadarChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getShape() == null ^ this.getShape() == null)
            return false;
        if (other.getShape() != null && other.getShape().equals(this.getShape()) == false)
            return false;
        if (other.getBaseSeriesSettings() == null ^ this.getBaseSeriesSettings() == null)
            return false;
        if (other.getBaseSeriesSettings() != null && other.getBaseSeriesSettings().equals(this.getBaseSeriesSettings()) == false)
            return false;
        if (other.getStartAngle() == null ^ this.getStartAngle() == null)
            return false;
        if (other.getStartAngle() != null && other.getStartAngle().equals(this.getStartAngle()) == false)
            return false;
        if (other.getVisualPalette() == null ^ this.getVisualPalette() == null)
            return false;
        if (other.getVisualPalette() != null && other.getVisualPalette().equals(this.getVisualPalette()) == false)
            return false;
        if (other.getAlternateBandColorsVisibility() == null ^ this.getAlternateBandColorsVisibility() == null)
            return false;
        if (other.getAlternateBandColorsVisibility() != null
                && other.getAlternateBandColorsVisibility().equals(this.getAlternateBandColorsVisibility()) == false)
            return false;
        if (other.getAlternateBandEvenColor() == null ^ this.getAlternateBandEvenColor() == null)
            return false;
        if (other.getAlternateBandEvenColor() != null && other.getAlternateBandEvenColor().equals(this.getAlternateBandEvenColor()) == false)
            return false;
        if (other.getAlternateBandOddColor() == null ^ this.getAlternateBandOddColor() == null)
            return false;
        if (other.getAlternateBandOddColor() != null && other.getAlternateBandOddColor().equals(this.getAlternateBandOddColor()) == false)
            return false;
        if (other.getCategoryAxis() == null ^ this.getCategoryAxis() == null)
            return false;
        if (other.getCategoryAxis() != null && other.getCategoryAxis().equals(this.getCategoryAxis()) == false)
            return false;
        if (other.getCategoryLabelOptions() == null ^ this.getCategoryLabelOptions() == null)
            return false;
        if (other.getCategoryLabelOptions() != null && other.getCategoryLabelOptions().equals(this.getCategoryLabelOptions()) == false)
            return false;
        if (other.getColorAxis() == null ^ this.getColorAxis() == null)
            return false;
        if (other.getColorAxis() != null && other.getColorAxis().equals(this.getColorAxis()) == false)
            return false;
        if (other.getColorLabelOptions() == null ^ this.getColorLabelOptions() == null)
            return false;
        if (other.getColorLabelOptions() != null && other.getColorLabelOptions().equals(this.getColorLabelOptions()) == false)
            return false;
        if (other.getLegend() == null ^ this.getLegend() == null)
            return false;
        if (other.getLegend() != null && other.getLegend().equals(this.getLegend()) == false)
            return false;
        if (other.getAxesRangeScale() == null ^ this.getAxesRangeScale() == null)
            return false;
        if (other.getAxesRangeScale() != null && other.getAxesRangeScale().equals(this.getAxesRangeScale()) == false)
            return false;
        if (other.getInteractions() == null ^ this.getInteractions() == null)
            return false;
        if (other.getInteractions() != null && other.getInteractions().equals(this.getInteractions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldWells() == null) ? 0 : getFieldWells().hashCode());
        hashCode = prime * hashCode + ((getSortConfiguration() == null) ? 0 : getSortConfiguration().hashCode());
        hashCode = prime * hashCode + ((getShape() == null) ? 0 : getShape().hashCode());
        hashCode = prime * hashCode + ((getBaseSeriesSettings() == null) ? 0 : getBaseSeriesSettings().hashCode());
        hashCode = prime * hashCode + ((getStartAngle() == null) ? 0 : getStartAngle().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        hashCode = prime * hashCode + ((getAlternateBandColorsVisibility() == null) ? 0 : getAlternateBandColorsVisibility().hashCode());
        hashCode = prime * hashCode + ((getAlternateBandEvenColor() == null) ? 0 : getAlternateBandEvenColor().hashCode());
        hashCode = prime * hashCode + ((getAlternateBandOddColor() == null) ? 0 : getAlternateBandOddColor().hashCode());
        hashCode = prime * hashCode + ((getCategoryAxis() == null) ? 0 : getCategoryAxis().hashCode());
        hashCode = prime * hashCode + ((getCategoryLabelOptions() == null) ? 0 : getCategoryLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getColorAxis() == null) ? 0 : getColorAxis().hashCode());
        hashCode = prime * hashCode + ((getColorLabelOptions() == null) ? 0 : getColorLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getLegend() == null) ? 0 : getLegend().hashCode());
        hashCode = prime * hashCode + ((getAxesRangeScale() == null) ? 0 : getAxesRangeScale().hashCode());
        hashCode = prime * hashCode + ((getInteractions() == null) ? 0 : getInteractions().hashCode());
        return hashCode;
    }

    @Override
    public RadarChartConfiguration clone() {
        try {
            return (RadarChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RadarChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

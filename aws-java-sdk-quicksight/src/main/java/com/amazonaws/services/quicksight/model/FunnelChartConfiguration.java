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
 * The configuration of a <code>FunnelChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FunnelChartConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunnelChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field well configuration of a <code>FunnelChartVisual</code>.
     * </p>
     */
    private FunnelChartFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a <code>FunnelChartVisual</code>.
     * </p>
     */
    private FunnelChartSortConfiguration sortConfiguration;
    /**
     * <p>
     * The label options of the categories that are displayed in a <code>FunnelChartVisual</code>.
     * </p>
     */
    private ChartAxisLabelOptions categoryLabelOptions;
    /**
     * <p>
     * The label options for the values that are displayed in a <code>FunnelChartVisual</code>.
     * </p>
     */
    private ChartAxisLabelOptions valueLabelOptions;
    /**
     * <p>
     * The tooltip configuration of a <code>FunnelChartVisual</code>.
     * </p>
     */
    private TooltipOptions tooltip;
    /**
     * <p>
     * The options that determine the presentation of the data labels.
     * </p>
     */
    private FunnelChartDataLabelOptions dataLabelOptions;
    /**
     * <p>
     * The visual palette configuration of a <code>FunnelChartVisual</code>.
     * </p>
     */
    private VisualPalette visualPalette;

    /**
     * <p>
     * The field well configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a <code>FunnelChartVisual</code>.
     */

    public void setFieldWells(FunnelChartFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @return The field well configuration of a <code>FunnelChartVisual</code>.
     */

    public FunnelChartFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a <code>FunnelChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunnelChartConfiguration withFieldWells(FunnelChartFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>FunnelChartVisual</code>.
     */

    public void setSortConfiguration(FunnelChartSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @return The sort configuration of a <code>FunnelChartVisual</code>.
     */

    public FunnelChartSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a <code>FunnelChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunnelChartConfiguration withSortConfiguration(FunnelChartSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The label options of the categories that are displayed in a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options of the categories that are displayed in a <code>FunnelChartVisual</code>.
     */

    public void setCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        this.categoryLabelOptions = categoryLabelOptions;
    }

    /**
     * <p>
     * The label options of the categories that are displayed in a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @return The label options of the categories that are displayed in a <code>FunnelChartVisual</code>.
     */

    public ChartAxisLabelOptions getCategoryLabelOptions() {
        return this.categoryLabelOptions;
    }

    /**
     * <p>
     * The label options of the categories that are displayed in a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options of the categories that are displayed in a <code>FunnelChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunnelChartConfiguration withCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        setCategoryLabelOptions(categoryLabelOptions);
        return this;
    }

    /**
     * <p>
     * The label options for the values that are displayed in a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param valueLabelOptions
     *        The label options for the values that are displayed in a <code>FunnelChartVisual</code>.
     */

    public void setValueLabelOptions(ChartAxisLabelOptions valueLabelOptions) {
        this.valueLabelOptions = valueLabelOptions;
    }

    /**
     * <p>
     * The label options for the values that are displayed in a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @return The label options for the values that are displayed in a <code>FunnelChartVisual</code>.
     */

    public ChartAxisLabelOptions getValueLabelOptions() {
        return this.valueLabelOptions;
    }

    /**
     * <p>
     * The label options for the values that are displayed in a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param valueLabelOptions
     *        The label options for the values that are displayed in a <code>FunnelChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunnelChartConfiguration withValueLabelOptions(ChartAxisLabelOptions valueLabelOptions) {
        setValueLabelOptions(valueLabelOptions);
        return this;
    }

    /**
     * <p>
     * The tooltip configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param tooltip
     *        The tooltip configuration of a <code>FunnelChartVisual</code>.
     */

    public void setTooltip(TooltipOptions tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * <p>
     * The tooltip configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @return The tooltip configuration of a <code>FunnelChartVisual</code>.
     */

    public TooltipOptions getTooltip() {
        return this.tooltip;
    }

    /**
     * <p>
     * The tooltip configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param tooltip
     *        The tooltip configuration of a <code>FunnelChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunnelChartConfiguration withTooltip(TooltipOptions tooltip) {
        setTooltip(tooltip);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the data labels.
     * </p>
     * 
     * @param dataLabelOptions
     *        The options that determine the presentation of the data labels.
     */

    public void setDataLabelOptions(FunnelChartDataLabelOptions dataLabelOptions) {
        this.dataLabelOptions = dataLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the data labels.
     * </p>
     * 
     * @return The options that determine the presentation of the data labels.
     */

    public FunnelChartDataLabelOptions getDataLabelOptions() {
        return this.dataLabelOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the data labels.
     * </p>
     * 
     * @param dataLabelOptions
     *        The options that determine the presentation of the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunnelChartConfiguration withDataLabelOptions(FunnelChartDataLabelOptions dataLabelOptions) {
        setDataLabelOptions(dataLabelOptions);
        return this;
    }

    /**
     * <p>
     * The visual palette configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a <code>FunnelChartVisual</code>.
     */

    public void setVisualPalette(VisualPalette visualPalette) {
        this.visualPalette = visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @return The visual palette configuration of a <code>FunnelChartVisual</code>.
     */

    public VisualPalette getVisualPalette() {
        return this.visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a <code>FunnelChartVisual</code>.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a <code>FunnelChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunnelChartConfiguration withVisualPalette(VisualPalette visualPalette) {
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
        if (getCategoryLabelOptions() != null)
            sb.append("CategoryLabelOptions: ").append(getCategoryLabelOptions()).append(",");
        if (getValueLabelOptions() != null)
            sb.append("ValueLabelOptions: ").append(getValueLabelOptions()).append(",");
        if (getTooltip() != null)
            sb.append("Tooltip: ").append(getTooltip()).append(",");
        if (getDataLabelOptions() != null)
            sb.append("DataLabelOptions: ").append(getDataLabelOptions()).append(",");
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

        if (obj instanceof FunnelChartConfiguration == false)
            return false;
        FunnelChartConfiguration other = (FunnelChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getCategoryLabelOptions() == null ^ this.getCategoryLabelOptions() == null)
            return false;
        if (other.getCategoryLabelOptions() != null && other.getCategoryLabelOptions().equals(this.getCategoryLabelOptions()) == false)
            return false;
        if (other.getValueLabelOptions() == null ^ this.getValueLabelOptions() == null)
            return false;
        if (other.getValueLabelOptions() != null && other.getValueLabelOptions().equals(this.getValueLabelOptions()) == false)
            return false;
        if (other.getTooltip() == null ^ this.getTooltip() == null)
            return false;
        if (other.getTooltip() != null && other.getTooltip().equals(this.getTooltip()) == false)
            return false;
        if (other.getDataLabelOptions() == null ^ this.getDataLabelOptions() == null)
            return false;
        if (other.getDataLabelOptions() != null && other.getDataLabelOptions().equals(this.getDataLabelOptions()) == false)
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
        hashCode = prime * hashCode + ((getCategoryLabelOptions() == null) ? 0 : getCategoryLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getValueLabelOptions() == null) ? 0 : getValueLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        hashCode = prime * hashCode + ((getDataLabelOptions() == null) ? 0 : getDataLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        return hashCode;
    }

    @Override
    public FunnelChartConfiguration clone() {
        try {
            return (FunnelChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FunnelChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The configuration of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GaugeChartConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GaugeChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field well configuration of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private GaugeChartFieldWells fieldWells;
    /**
     * <p>
     * The options that determine the presentation of the <code>GaugeChartVisual</code>.
     * </p>
     */
    private GaugeChartOptions gaugeChartOptions;
    /**
     * <p>
     * The data label configuration of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private DataLabelOptions dataLabels;
    /**
     * <p>
     * The tooltip configuration of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private TooltipOptions tooltipOptions;
    /**
     * <p>
     * The visual palette configuration of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private VisualPalette visualPalette;

    /**
     * <p>
     * The field well configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a <code>GaugeChartVisual</code>.
     */

    public void setFieldWells(GaugeChartFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The field well configuration of a <code>GaugeChartVisual</code>.
     */

    public GaugeChartFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field well configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param fieldWells
     *        The field well configuration of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartConfiguration withFieldWells(GaugeChartFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param gaugeChartOptions
     *        The options that determine the presentation of the <code>GaugeChartVisual</code>.
     */

    public void setGaugeChartOptions(GaugeChartOptions gaugeChartOptions) {
        this.gaugeChartOptions = gaugeChartOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The options that determine the presentation of the <code>GaugeChartVisual</code>.
     */

    public GaugeChartOptions getGaugeChartOptions() {
        return this.gaugeChartOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param gaugeChartOptions
     *        The options that determine the presentation of the <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartConfiguration withGaugeChartOptions(GaugeChartOptions gaugeChartOptions) {
        setGaugeChartOptions(gaugeChartOptions);
        return this;
    }

    /**
     * <p>
     * The data label configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param dataLabels
     *        The data label configuration of a <code>GaugeChartVisual</code>.
     */

    public void setDataLabels(DataLabelOptions dataLabels) {
        this.dataLabels = dataLabels;
    }

    /**
     * <p>
     * The data label configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The data label configuration of a <code>GaugeChartVisual</code>.
     */

    public DataLabelOptions getDataLabels() {
        return this.dataLabels;
    }

    /**
     * <p>
     * The data label configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param dataLabels
     *        The data label configuration of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartConfiguration withDataLabels(DataLabelOptions dataLabels) {
        setDataLabels(dataLabels);
        return this;
    }

    /**
     * <p>
     * The tooltip configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param tooltipOptions
     *        The tooltip configuration of a <code>GaugeChartVisual</code>.
     */

    public void setTooltipOptions(TooltipOptions tooltipOptions) {
        this.tooltipOptions = tooltipOptions;
    }

    /**
     * <p>
     * The tooltip configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The tooltip configuration of a <code>GaugeChartVisual</code>.
     */

    public TooltipOptions getTooltipOptions() {
        return this.tooltipOptions;
    }

    /**
     * <p>
     * The tooltip configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param tooltipOptions
     *        The tooltip configuration of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartConfiguration withTooltipOptions(TooltipOptions tooltipOptions) {
        setTooltipOptions(tooltipOptions);
        return this;
    }

    /**
     * <p>
     * The visual palette configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a <code>GaugeChartVisual</code>.
     */

    public void setVisualPalette(VisualPalette visualPalette) {
        this.visualPalette = visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The visual palette configuration of a <code>GaugeChartVisual</code>.
     */

    public VisualPalette getVisualPalette() {
        return this.visualPalette;
    }

    /**
     * <p>
     * The visual palette configuration of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param visualPalette
     *        The visual palette configuration of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartConfiguration withVisualPalette(VisualPalette visualPalette) {
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
        if (getGaugeChartOptions() != null)
            sb.append("GaugeChartOptions: ").append(getGaugeChartOptions()).append(",");
        if (getDataLabels() != null)
            sb.append("DataLabels: ").append(getDataLabels()).append(",");
        if (getTooltipOptions() != null)
            sb.append("TooltipOptions: ").append(getTooltipOptions()).append(",");
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

        if (obj instanceof GaugeChartConfiguration == false)
            return false;
        GaugeChartConfiguration other = (GaugeChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getGaugeChartOptions() == null ^ this.getGaugeChartOptions() == null)
            return false;
        if (other.getGaugeChartOptions() != null && other.getGaugeChartOptions().equals(this.getGaugeChartOptions()) == false)
            return false;
        if (other.getDataLabels() == null ^ this.getDataLabels() == null)
            return false;
        if (other.getDataLabels() != null && other.getDataLabels().equals(this.getDataLabels()) == false)
            return false;
        if (other.getTooltipOptions() == null ^ this.getTooltipOptions() == null)
            return false;
        if (other.getTooltipOptions() != null && other.getTooltipOptions().equals(this.getTooltipOptions()) == false)
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
        hashCode = prime * hashCode + ((getGaugeChartOptions() == null) ? 0 : getGaugeChartOptions().hashCode());
        hashCode = prime * hashCode + ((getDataLabels() == null) ? 0 : getDataLabels().hashCode());
        hashCode = prime * hashCode + ((getTooltipOptions() == null) ? 0 : getTooltipOptions().hashCode());
        hashCode = prime * hashCode + ((getVisualPalette() == null) ? 0 : getVisualPalette().hashCode());
        return hashCode;
    }

    @Override
    public GaugeChartConfiguration clone() {
        try {
            return (GaugeChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GaugeChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

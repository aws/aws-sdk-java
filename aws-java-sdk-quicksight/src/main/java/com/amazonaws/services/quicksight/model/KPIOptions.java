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
 * The options that determine the presentation of a KPI visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/KPIOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KPIOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options that determine the presentation of the progress bar of a KPI visual.
     * </p>
     */
    private ProgressBarOptions progressBar;
    /**
     * <p>
     * The options that determine the presentation of trend arrows in a KPI visual.
     * </p>
     */
    private TrendArrowOptions trendArrows;
    /**
     * <p>
     * The options that determine the presentation of the secondary value of a KPI visual.
     * </p>
     */
    private SecondaryValueOptions secondaryValue;
    /**
     * <p>
     * The comparison configuration of a KPI visual.
     * </p>
     */
    private ComparisonConfiguration comparison;
    /**
     * <p>
     * The options that determine the primary value display type.
     * </p>
     */
    private String primaryValueDisplayType;
    /**
     * <p>
     * The options that determine the primary value font configuration.
     * </p>
     */
    private FontConfiguration primaryValueFontConfiguration;
    /**
     * <p>
     * The options that determine the secondary value font configuration.
     * </p>
     */
    private FontConfiguration secondaryValueFontConfiguration;

    /**
     * <p>
     * The options that determine the presentation of the progress bar of a KPI visual.
     * </p>
     * 
     * @param progressBar
     *        The options that determine the presentation of the progress bar of a KPI visual.
     */

    public void setProgressBar(ProgressBarOptions progressBar) {
        this.progressBar = progressBar;
    }

    /**
     * <p>
     * The options that determine the presentation of the progress bar of a KPI visual.
     * </p>
     * 
     * @return The options that determine the presentation of the progress bar of a KPI visual.
     */

    public ProgressBarOptions getProgressBar() {
        return this.progressBar;
    }

    /**
     * <p>
     * The options that determine the presentation of the progress bar of a KPI visual.
     * </p>
     * 
     * @param progressBar
     *        The options that determine the presentation of the progress bar of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIOptions withProgressBar(ProgressBarOptions progressBar) {
        setProgressBar(progressBar);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of trend arrows in a KPI visual.
     * </p>
     * 
     * @param trendArrows
     *        The options that determine the presentation of trend arrows in a KPI visual.
     */

    public void setTrendArrows(TrendArrowOptions trendArrows) {
        this.trendArrows = trendArrows;
    }

    /**
     * <p>
     * The options that determine the presentation of trend arrows in a KPI visual.
     * </p>
     * 
     * @return The options that determine the presentation of trend arrows in a KPI visual.
     */

    public TrendArrowOptions getTrendArrows() {
        return this.trendArrows;
    }

    /**
     * <p>
     * The options that determine the presentation of trend arrows in a KPI visual.
     * </p>
     * 
     * @param trendArrows
     *        The options that determine the presentation of trend arrows in a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIOptions withTrendArrows(TrendArrowOptions trendArrows) {
        setTrendArrows(trendArrows);
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of the secondary value of a KPI visual.
     * </p>
     * 
     * @param secondaryValue
     *        The options that determine the presentation of the secondary value of a KPI visual.
     */

    public void setSecondaryValue(SecondaryValueOptions secondaryValue) {
        this.secondaryValue = secondaryValue;
    }

    /**
     * <p>
     * The options that determine the presentation of the secondary value of a KPI visual.
     * </p>
     * 
     * @return The options that determine the presentation of the secondary value of a KPI visual.
     */

    public SecondaryValueOptions getSecondaryValue() {
        return this.secondaryValue;
    }

    /**
     * <p>
     * The options that determine the presentation of the secondary value of a KPI visual.
     * </p>
     * 
     * @param secondaryValue
     *        The options that determine the presentation of the secondary value of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIOptions withSecondaryValue(SecondaryValueOptions secondaryValue) {
        setSecondaryValue(secondaryValue);
        return this;
    }

    /**
     * <p>
     * The comparison configuration of a KPI visual.
     * </p>
     * 
     * @param comparison
     *        The comparison configuration of a KPI visual.
     */

    public void setComparison(ComparisonConfiguration comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The comparison configuration of a KPI visual.
     * </p>
     * 
     * @return The comparison configuration of a KPI visual.
     */

    public ComparisonConfiguration getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * The comparison configuration of a KPI visual.
     * </p>
     * 
     * @param comparison
     *        The comparison configuration of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIOptions withComparison(ComparisonConfiguration comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * The options that determine the primary value display type.
     * </p>
     * 
     * @param primaryValueDisplayType
     *        The options that determine the primary value display type.
     * @see PrimaryValueDisplayType
     */

    public void setPrimaryValueDisplayType(String primaryValueDisplayType) {
        this.primaryValueDisplayType = primaryValueDisplayType;
    }

    /**
     * <p>
     * The options that determine the primary value display type.
     * </p>
     * 
     * @return The options that determine the primary value display type.
     * @see PrimaryValueDisplayType
     */

    public String getPrimaryValueDisplayType() {
        return this.primaryValueDisplayType;
    }

    /**
     * <p>
     * The options that determine the primary value display type.
     * </p>
     * 
     * @param primaryValueDisplayType
     *        The options that determine the primary value display type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrimaryValueDisplayType
     */

    public KPIOptions withPrimaryValueDisplayType(String primaryValueDisplayType) {
        setPrimaryValueDisplayType(primaryValueDisplayType);
        return this;
    }

    /**
     * <p>
     * The options that determine the primary value display type.
     * </p>
     * 
     * @param primaryValueDisplayType
     *        The options that determine the primary value display type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrimaryValueDisplayType
     */

    public KPIOptions withPrimaryValueDisplayType(PrimaryValueDisplayType primaryValueDisplayType) {
        this.primaryValueDisplayType = primaryValueDisplayType.toString();
        return this;
    }

    /**
     * <p>
     * The options that determine the primary value font configuration.
     * </p>
     * 
     * @param primaryValueFontConfiguration
     *        The options that determine the primary value font configuration.
     */

    public void setPrimaryValueFontConfiguration(FontConfiguration primaryValueFontConfiguration) {
        this.primaryValueFontConfiguration = primaryValueFontConfiguration;
    }

    /**
     * <p>
     * The options that determine the primary value font configuration.
     * </p>
     * 
     * @return The options that determine the primary value font configuration.
     */

    public FontConfiguration getPrimaryValueFontConfiguration() {
        return this.primaryValueFontConfiguration;
    }

    /**
     * <p>
     * The options that determine the primary value font configuration.
     * </p>
     * 
     * @param primaryValueFontConfiguration
     *        The options that determine the primary value font configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIOptions withPrimaryValueFontConfiguration(FontConfiguration primaryValueFontConfiguration) {
        setPrimaryValueFontConfiguration(primaryValueFontConfiguration);
        return this;
    }

    /**
     * <p>
     * The options that determine the secondary value font configuration.
     * </p>
     * 
     * @param secondaryValueFontConfiguration
     *        The options that determine the secondary value font configuration.
     */

    public void setSecondaryValueFontConfiguration(FontConfiguration secondaryValueFontConfiguration) {
        this.secondaryValueFontConfiguration = secondaryValueFontConfiguration;
    }

    /**
     * <p>
     * The options that determine the secondary value font configuration.
     * </p>
     * 
     * @return The options that determine the secondary value font configuration.
     */

    public FontConfiguration getSecondaryValueFontConfiguration() {
        return this.secondaryValueFontConfiguration;
    }

    /**
     * <p>
     * The options that determine the secondary value font configuration.
     * </p>
     * 
     * @param secondaryValueFontConfiguration
     *        The options that determine the secondary value font configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIOptions withSecondaryValueFontConfiguration(FontConfiguration secondaryValueFontConfiguration) {
        setSecondaryValueFontConfiguration(secondaryValueFontConfiguration);
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
        if (getProgressBar() != null)
            sb.append("ProgressBar: ").append(getProgressBar()).append(",");
        if (getTrendArrows() != null)
            sb.append("TrendArrows: ").append(getTrendArrows()).append(",");
        if (getSecondaryValue() != null)
            sb.append("SecondaryValue: ").append(getSecondaryValue()).append(",");
        if (getComparison() != null)
            sb.append("Comparison: ").append(getComparison()).append(",");
        if (getPrimaryValueDisplayType() != null)
            sb.append("PrimaryValueDisplayType: ").append(getPrimaryValueDisplayType()).append(",");
        if (getPrimaryValueFontConfiguration() != null)
            sb.append("PrimaryValueFontConfiguration: ").append(getPrimaryValueFontConfiguration()).append(",");
        if (getSecondaryValueFontConfiguration() != null)
            sb.append("SecondaryValueFontConfiguration: ").append(getSecondaryValueFontConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KPIOptions == false)
            return false;
        KPIOptions other = (KPIOptions) obj;
        if (other.getProgressBar() == null ^ this.getProgressBar() == null)
            return false;
        if (other.getProgressBar() != null && other.getProgressBar().equals(this.getProgressBar()) == false)
            return false;
        if (other.getTrendArrows() == null ^ this.getTrendArrows() == null)
            return false;
        if (other.getTrendArrows() != null && other.getTrendArrows().equals(this.getTrendArrows()) == false)
            return false;
        if (other.getSecondaryValue() == null ^ this.getSecondaryValue() == null)
            return false;
        if (other.getSecondaryValue() != null && other.getSecondaryValue().equals(this.getSecondaryValue()) == false)
            return false;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null && other.getComparison().equals(this.getComparison()) == false)
            return false;
        if (other.getPrimaryValueDisplayType() == null ^ this.getPrimaryValueDisplayType() == null)
            return false;
        if (other.getPrimaryValueDisplayType() != null && other.getPrimaryValueDisplayType().equals(this.getPrimaryValueDisplayType()) == false)
            return false;
        if (other.getPrimaryValueFontConfiguration() == null ^ this.getPrimaryValueFontConfiguration() == null)
            return false;
        if (other.getPrimaryValueFontConfiguration() != null
                && other.getPrimaryValueFontConfiguration().equals(this.getPrimaryValueFontConfiguration()) == false)
            return false;
        if (other.getSecondaryValueFontConfiguration() == null ^ this.getSecondaryValueFontConfiguration() == null)
            return false;
        if (other.getSecondaryValueFontConfiguration() != null
                && other.getSecondaryValueFontConfiguration().equals(this.getSecondaryValueFontConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressBar() == null) ? 0 : getProgressBar().hashCode());
        hashCode = prime * hashCode + ((getTrendArrows() == null) ? 0 : getTrendArrows().hashCode());
        hashCode = prime * hashCode + ((getSecondaryValue() == null) ? 0 : getSecondaryValue().hashCode());
        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        hashCode = prime * hashCode + ((getPrimaryValueDisplayType() == null) ? 0 : getPrimaryValueDisplayType().hashCode());
        hashCode = prime * hashCode + ((getPrimaryValueFontConfiguration() == null) ? 0 : getPrimaryValueFontConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSecondaryValueFontConfiguration() == null) ? 0 : getSecondaryValueFontConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public KPIOptions clone() {
        try {
            return (KPIOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.KPIOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

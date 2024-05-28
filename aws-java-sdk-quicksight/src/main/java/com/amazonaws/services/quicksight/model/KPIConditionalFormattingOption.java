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
 * The conditional formatting options of a KPI visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/KPIConditionalFormattingOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KPIConditionalFormattingOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conditional formatting for the primary value of a KPI visual.
     * </p>
     */
    private KPIPrimaryValueConditionalFormatting primaryValue;
    /**
     * <p>
     * The conditional formatting for the progress bar of a KPI visual.
     * </p>
     */
    private KPIProgressBarConditionalFormatting progressBar;
    /**
     * <p>
     * The conditional formatting for the actual value of a KPI visual.
     * </p>
     */
    private KPIActualValueConditionalFormatting actualValue;
    /**
     * <p>
     * The conditional formatting for the comparison value of a KPI visual.
     * </p>
     */
    private KPIComparisonValueConditionalFormatting comparisonValue;

    /**
     * <p>
     * The conditional formatting for the primary value of a KPI visual.
     * </p>
     * 
     * @param primaryValue
     *        The conditional formatting for the primary value of a KPI visual.
     */

    public void setPrimaryValue(KPIPrimaryValueConditionalFormatting primaryValue) {
        this.primaryValue = primaryValue;
    }

    /**
     * <p>
     * The conditional formatting for the primary value of a KPI visual.
     * </p>
     * 
     * @return The conditional formatting for the primary value of a KPI visual.
     */

    public KPIPrimaryValueConditionalFormatting getPrimaryValue() {
        return this.primaryValue;
    }

    /**
     * <p>
     * The conditional formatting for the primary value of a KPI visual.
     * </p>
     * 
     * @param primaryValue
     *        The conditional formatting for the primary value of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIConditionalFormattingOption withPrimaryValue(KPIPrimaryValueConditionalFormatting primaryValue) {
        setPrimaryValue(primaryValue);
        return this;
    }

    /**
     * <p>
     * The conditional formatting for the progress bar of a KPI visual.
     * </p>
     * 
     * @param progressBar
     *        The conditional formatting for the progress bar of a KPI visual.
     */

    public void setProgressBar(KPIProgressBarConditionalFormatting progressBar) {
        this.progressBar = progressBar;
    }

    /**
     * <p>
     * The conditional formatting for the progress bar of a KPI visual.
     * </p>
     * 
     * @return The conditional formatting for the progress bar of a KPI visual.
     */

    public KPIProgressBarConditionalFormatting getProgressBar() {
        return this.progressBar;
    }

    /**
     * <p>
     * The conditional formatting for the progress bar of a KPI visual.
     * </p>
     * 
     * @param progressBar
     *        The conditional formatting for the progress bar of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIConditionalFormattingOption withProgressBar(KPIProgressBarConditionalFormatting progressBar) {
        setProgressBar(progressBar);
        return this;
    }

    /**
     * <p>
     * The conditional formatting for the actual value of a KPI visual.
     * </p>
     * 
     * @param actualValue
     *        The conditional formatting for the actual value of a KPI visual.
     */

    public void setActualValue(KPIActualValueConditionalFormatting actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * <p>
     * The conditional formatting for the actual value of a KPI visual.
     * </p>
     * 
     * @return The conditional formatting for the actual value of a KPI visual.
     */

    public KPIActualValueConditionalFormatting getActualValue() {
        return this.actualValue;
    }

    /**
     * <p>
     * The conditional formatting for the actual value of a KPI visual.
     * </p>
     * 
     * @param actualValue
     *        The conditional formatting for the actual value of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIConditionalFormattingOption withActualValue(KPIActualValueConditionalFormatting actualValue) {
        setActualValue(actualValue);
        return this;
    }

    /**
     * <p>
     * The conditional formatting for the comparison value of a KPI visual.
     * </p>
     * 
     * @param comparisonValue
     *        The conditional formatting for the comparison value of a KPI visual.
     */

    public void setComparisonValue(KPIComparisonValueConditionalFormatting comparisonValue) {
        this.comparisonValue = comparisonValue;
    }

    /**
     * <p>
     * The conditional formatting for the comparison value of a KPI visual.
     * </p>
     * 
     * @return The conditional formatting for the comparison value of a KPI visual.
     */

    public KPIComparisonValueConditionalFormatting getComparisonValue() {
        return this.comparisonValue;
    }

    /**
     * <p>
     * The conditional formatting for the comparison value of a KPI visual.
     * </p>
     * 
     * @param comparisonValue
     *        The conditional formatting for the comparison value of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIConditionalFormattingOption withComparisonValue(KPIComparisonValueConditionalFormatting comparisonValue) {
        setComparisonValue(comparisonValue);
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
        if (getPrimaryValue() != null)
            sb.append("PrimaryValue: ").append(getPrimaryValue()).append(",");
        if (getProgressBar() != null)
            sb.append("ProgressBar: ").append(getProgressBar()).append(",");
        if (getActualValue() != null)
            sb.append("ActualValue: ").append(getActualValue()).append(",");
        if (getComparisonValue() != null)
            sb.append("ComparisonValue: ").append(getComparisonValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KPIConditionalFormattingOption == false)
            return false;
        KPIConditionalFormattingOption other = (KPIConditionalFormattingOption) obj;
        if (other.getPrimaryValue() == null ^ this.getPrimaryValue() == null)
            return false;
        if (other.getPrimaryValue() != null && other.getPrimaryValue().equals(this.getPrimaryValue()) == false)
            return false;
        if (other.getProgressBar() == null ^ this.getProgressBar() == null)
            return false;
        if (other.getProgressBar() != null && other.getProgressBar().equals(this.getProgressBar()) == false)
            return false;
        if (other.getActualValue() == null ^ this.getActualValue() == null)
            return false;
        if (other.getActualValue() != null && other.getActualValue().equals(this.getActualValue()) == false)
            return false;
        if (other.getComparisonValue() == null ^ this.getComparisonValue() == null)
            return false;
        if (other.getComparisonValue() != null && other.getComparisonValue().equals(this.getComparisonValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryValue() == null) ? 0 : getPrimaryValue().hashCode());
        hashCode = prime * hashCode + ((getProgressBar() == null) ? 0 : getProgressBar().hashCode());
        hashCode = prime * hashCode + ((getActualValue() == null) ? 0 : getActualValue().hashCode());
        hashCode = prime * hashCode + ((getComparisonValue() == null) ? 0 : getComparisonValue().hashCode());
        return hashCode;
    }

    @Override
    public KPIConditionalFormattingOption clone() {
        try {
            return (KPIConditionalFormattingOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.KPIConditionalFormattingOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

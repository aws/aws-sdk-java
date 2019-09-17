/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of rightsizing recommendations
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/RightsizingRecommendationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RightsizingRecommendationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total number of instance recommendations.
     * </p>
     */
    private String totalRecommendationCount;
    /**
     * <p>
     * Estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     */
    private String estimatedTotalMonthlySavingsAmount;
    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the savings.
     * </p>
     */
    private String savingsCurrencyCode;
    /**
     * <p>
     * Savings percentage based on the recommended modifications, relative to the total On Demand costs associated with
     * these instances.
     * </p>
     */
    private String savingsPercentage;

    /**
     * <p>
     * Total number of instance recommendations.
     * </p>
     * 
     * @param totalRecommendationCount
     *        Total number of instance recommendations.
     */

    public void setTotalRecommendationCount(String totalRecommendationCount) {
        this.totalRecommendationCount = totalRecommendationCount;
    }

    /**
     * <p>
     * Total number of instance recommendations.
     * </p>
     * 
     * @return Total number of instance recommendations.
     */

    public String getTotalRecommendationCount() {
        return this.totalRecommendationCount;
    }

    /**
     * <p>
     * Total number of instance recommendations.
     * </p>
     * 
     * @param totalRecommendationCount
     *        Total number of instance recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendationSummary withTotalRecommendationCount(String totalRecommendationCount) {
        setTotalRecommendationCount(totalRecommendationCount);
        return this;
    }

    /**
     * <p>
     * Estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * 
     * @param estimatedTotalMonthlySavingsAmount
     *        Estimated total savings resulting from modifications, on a monthly basis.
     */

    public void setEstimatedTotalMonthlySavingsAmount(String estimatedTotalMonthlySavingsAmount) {
        this.estimatedTotalMonthlySavingsAmount = estimatedTotalMonthlySavingsAmount;
    }

    /**
     * <p>
     * Estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * 
     * @return Estimated total savings resulting from modifications, on a monthly basis.
     */

    public String getEstimatedTotalMonthlySavingsAmount() {
        return this.estimatedTotalMonthlySavingsAmount;
    }

    /**
     * <p>
     * Estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * 
     * @param estimatedTotalMonthlySavingsAmount
     *        Estimated total savings resulting from modifications, on a monthly basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendationSummary withEstimatedTotalMonthlySavingsAmount(String estimatedTotalMonthlySavingsAmount) {
        setEstimatedTotalMonthlySavingsAmount(estimatedTotalMonthlySavingsAmount);
        return this;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the savings.
     * </p>
     * 
     * @param savingsCurrencyCode
     *        The currency code that Amazon Web Services used to calculate the savings.
     */

    public void setSavingsCurrencyCode(String savingsCurrencyCode) {
        this.savingsCurrencyCode = savingsCurrencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the savings.
     * </p>
     * 
     * @return The currency code that Amazon Web Services used to calculate the savings.
     */

    public String getSavingsCurrencyCode() {
        return this.savingsCurrencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the savings.
     * </p>
     * 
     * @param savingsCurrencyCode
     *        The currency code that Amazon Web Services used to calculate the savings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendationSummary withSavingsCurrencyCode(String savingsCurrencyCode) {
        setSavingsCurrencyCode(savingsCurrencyCode);
        return this;
    }

    /**
     * <p>
     * Savings percentage based on the recommended modifications, relative to the total On Demand costs associated with
     * these instances.
     * </p>
     * 
     * @param savingsPercentage
     *        Savings percentage based on the recommended modifications, relative to the total On Demand costs
     *        associated with these instances.
     */

    public void setSavingsPercentage(String savingsPercentage) {
        this.savingsPercentage = savingsPercentage;
    }

    /**
     * <p>
     * Savings percentage based on the recommended modifications, relative to the total On Demand costs associated with
     * these instances.
     * </p>
     * 
     * @return Savings percentage based on the recommended modifications, relative to the total On Demand costs
     *         associated with these instances.
     */

    public String getSavingsPercentage() {
        return this.savingsPercentage;
    }

    /**
     * <p>
     * Savings percentage based on the recommended modifications, relative to the total On Demand costs associated with
     * these instances.
     * </p>
     * 
     * @param savingsPercentage
     *        Savings percentage based on the recommended modifications, relative to the total On Demand costs
     *        associated with these instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendationSummary withSavingsPercentage(String savingsPercentage) {
        setSavingsPercentage(savingsPercentage);
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
        if (getTotalRecommendationCount() != null)
            sb.append("TotalRecommendationCount: ").append(getTotalRecommendationCount()).append(",");
        if (getEstimatedTotalMonthlySavingsAmount() != null)
            sb.append("EstimatedTotalMonthlySavingsAmount: ").append(getEstimatedTotalMonthlySavingsAmount()).append(",");
        if (getSavingsCurrencyCode() != null)
            sb.append("SavingsCurrencyCode: ").append(getSavingsCurrencyCode()).append(",");
        if (getSavingsPercentage() != null)
            sb.append("SavingsPercentage: ").append(getSavingsPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RightsizingRecommendationSummary == false)
            return false;
        RightsizingRecommendationSummary other = (RightsizingRecommendationSummary) obj;
        if (other.getTotalRecommendationCount() == null ^ this.getTotalRecommendationCount() == null)
            return false;
        if (other.getTotalRecommendationCount() != null && other.getTotalRecommendationCount().equals(this.getTotalRecommendationCount()) == false)
            return false;
        if (other.getEstimatedTotalMonthlySavingsAmount() == null ^ this.getEstimatedTotalMonthlySavingsAmount() == null)
            return false;
        if (other.getEstimatedTotalMonthlySavingsAmount() != null
                && other.getEstimatedTotalMonthlySavingsAmount().equals(this.getEstimatedTotalMonthlySavingsAmount()) == false)
            return false;
        if (other.getSavingsCurrencyCode() == null ^ this.getSavingsCurrencyCode() == null)
            return false;
        if (other.getSavingsCurrencyCode() != null && other.getSavingsCurrencyCode().equals(this.getSavingsCurrencyCode()) == false)
            return false;
        if (other.getSavingsPercentage() == null ^ this.getSavingsPercentage() == null)
            return false;
        if (other.getSavingsPercentage() != null && other.getSavingsPercentage().equals(this.getSavingsPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalRecommendationCount() == null) ? 0 : getTotalRecommendationCount().hashCode());
        hashCode = prime * hashCode + ((getEstimatedTotalMonthlySavingsAmount() == null) ? 0 : getEstimatedTotalMonthlySavingsAmount().hashCode());
        hashCode = prime * hashCode + ((getSavingsCurrencyCode() == null) ? 0 : getSavingsCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getSavingsPercentage() == null) ? 0 : getSavingsPercentage().hashCode());
        return hashCode;
    }

    @Override
    public RightsizingRecommendationSummary clone() {
        try {
            return (RightsizingRecommendationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.RightsizingRecommendationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

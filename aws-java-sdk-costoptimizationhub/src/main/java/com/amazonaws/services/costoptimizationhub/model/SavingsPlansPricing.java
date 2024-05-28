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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Pricing information about a Savings Plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/SavingsPlansPricing"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansPricing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Estimated monthly commitment for the Savings Plan.
     * </p>
     */
    private Double estimatedMonthlyCommitment;
    /**
     * <p>
     * Estimated On-Demand cost you will pay after buying the Savings Plan.
     * </p>
     */
    private Double estimatedOnDemandCost;
    /**
     * <p>
     * The cost of paying for the recommended Savings Plan monthly.
     * </p>
     */
    private Double monthlySavingsPlansEligibleCost;
    /**
     * <p>
     * Estimated savings as a percentage of your overall costs after buying the Savings Plan.
     * </p>
     */
    private Double savingsPercentage;

    /**
     * <p>
     * Estimated monthly commitment for the Savings Plan.
     * </p>
     * 
     * @param estimatedMonthlyCommitment
     *        Estimated monthly commitment for the Savings Plan.
     */

    public void setEstimatedMonthlyCommitment(Double estimatedMonthlyCommitment) {
        this.estimatedMonthlyCommitment = estimatedMonthlyCommitment;
    }

    /**
     * <p>
     * Estimated monthly commitment for the Savings Plan.
     * </p>
     * 
     * @return Estimated monthly commitment for the Savings Plan.
     */

    public Double getEstimatedMonthlyCommitment() {
        return this.estimatedMonthlyCommitment;
    }

    /**
     * <p>
     * Estimated monthly commitment for the Savings Plan.
     * </p>
     * 
     * @param estimatedMonthlyCommitment
     *        Estimated monthly commitment for the Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPricing withEstimatedMonthlyCommitment(Double estimatedMonthlyCommitment) {
        setEstimatedMonthlyCommitment(estimatedMonthlyCommitment);
        return this;
    }

    /**
     * <p>
     * Estimated On-Demand cost you will pay after buying the Savings Plan.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        Estimated On-Demand cost you will pay after buying the Savings Plan.
     */

    public void setEstimatedOnDemandCost(Double estimatedOnDemandCost) {
        this.estimatedOnDemandCost = estimatedOnDemandCost;
    }

    /**
     * <p>
     * Estimated On-Demand cost you will pay after buying the Savings Plan.
     * </p>
     * 
     * @return Estimated On-Demand cost you will pay after buying the Savings Plan.
     */

    public Double getEstimatedOnDemandCost() {
        return this.estimatedOnDemandCost;
    }

    /**
     * <p>
     * Estimated On-Demand cost you will pay after buying the Savings Plan.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        Estimated On-Demand cost you will pay after buying the Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPricing withEstimatedOnDemandCost(Double estimatedOnDemandCost) {
        setEstimatedOnDemandCost(estimatedOnDemandCost);
        return this;
    }

    /**
     * <p>
     * The cost of paying for the recommended Savings Plan monthly.
     * </p>
     * 
     * @param monthlySavingsPlansEligibleCost
     *        The cost of paying for the recommended Savings Plan monthly.
     */

    public void setMonthlySavingsPlansEligibleCost(Double monthlySavingsPlansEligibleCost) {
        this.monthlySavingsPlansEligibleCost = monthlySavingsPlansEligibleCost;
    }

    /**
     * <p>
     * The cost of paying for the recommended Savings Plan monthly.
     * </p>
     * 
     * @return The cost of paying for the recommended Savings Plan monthly.
     */

    public Double getMonthlySavingsPlansEligibleCost() {
        return this.monthlySavingsPlansEligibleCost;
    }

    /**
     * <p>
     * The cost of paying for the recommended Savings Plan monthly.
     * </p>
     * 
     * @param monthlySavingsPlansEligibleCost
     *        The cost of paying for the recommended Savings Plan monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPricing withMonthlySavingsPlansEligibleCost(Double monthlySavingsPlansEligibleCost) {
        setMonthlySavingsPlansEligibleCost(monthlySavingsPlansEligibleCost);
        return this;
    }

    /**
     * <p>
     * Estimated savings as a percentage of your overall costs after buying the Savings Plan.
     * </p>
     * 
     * @param savingsPercentage
     *        Estimated savings as a percentage of your overall costs after buying the Savings Plan.
     */

    public void setSavingsPercentage(Double savingsPercentage) {
        this.savingsPercentage = savingsPercentage;
    }

    /**
     * <p>
     * Estimated savings as a percentage of your overall costs after buying the Savings Plan.
     * </p>
     * 
     * @return Estimated savings as a percentage of your overall costs after buying the Savings Plan.
     */

    public Double getSavingsPercentage() {
        return this.savingsPercentage;
    }

    /**
     * <p>
     * Estimated savings as a percentage of your overall costs after buying the Savings Plan.
     * </p>
     * 
     * @param savingsPercentage
     *        Estimated savings as a percentage of your overall costs after buying the Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPricing withSavingsPercentage(Double savingsPercentage) {
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
        if (getEstimatedMonthlyCommitment() != null)
            sb.append("EstimatedMonthlyCommitment: ").append(getEstimatedMonthlyCommitment()).append(",");
        if (getEstimatedOnDemandCost() != null)
            sb.append("EstimatedOnDemandCost: ").append(getEstimatedOnDemandCost()).append(",");
        if (getMonthlySavingsPlansEligibleCost() != null)
            sb.append("MonthlySavingsPlansEligibleCost: ").append(getMonthlySavingsPlansEligibleCost()).append(",");
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

        if (obj instanceof SavingsPlansPricing == false)
            return false;
        SavingsPlansPricing other = (SavingsPlansPricing) obj;
        if (other.getEstimatedMonthlyCommitment() == null ^ this.getEstimatedMonthlyCommitment() == null)
            return false;
        if (other.getEstimatedMonthlyCommitment() != null && other.getEstimatedMonthlyCommitment().equals(this.getEstimatedMonthlyCommitment()) == false)
            return false;
        if (other.getEstimatedOnDemandCost() == null ^ this.getEstimatedOnDemandCost() == null)
            return false;
        if (other.getEstimatedOnDemandCost() != null && other.getEstimatedOnDemandCost().equals(this.getEstimatedOnDemandCost()) == false)
            return false;
        if (other.getMonthlySavingsPlansEligibleCost() == null ^ this.getMonthlySavingsPlansEligibleCost() == null)
            return false;
        if (other.getMonthlySavingsPlansEligibleCost() != null
                && other.getMonthlySavingsPlansEligibleCost().equals(this.getMonthlySavingsPlansEligibleCost()) == false)
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

        hashCode = prime * hashCode + ((getEstimatedMonthlyCommitment() == null) ? 0 : getEstimatedMonthlyCommitment().hashCode());
        hashCode = prime * hashCode + ((getEstimatedOnDemandCost() == null) ? 0 : getEstimatedOnDemandCost().hashCode());
        hashCode = prime * hashCode + ((getMonthlySavingsPlansEligibleCost() == null) ? 0 : getMonthlySavingsPlansEligibleCost().hashCode());
        hashCode = prime * hashCode + ((getSavingsPercentage() == null) ? 0 : getSavingsPercentage().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansPricing clone() {
        try {
            return (SavingsPlansPricing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.SavingsPlansPricingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * Pricing details for your recommended reserved instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ReservedInstancesPricing"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstancesPricing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The estimated cost of your recurring monthly fees for the recommended reserved instance across the month.
     * </p>
     */
    private Double estimatedMonthlyAmortizedReservationCost;
    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended reserved instance, over the length of
     * the lookback period.
     * </p>
     */
    private Double estimatedOnDemandCost;
    /**
     * <p>
     * The cost of paying for the recommended reserved instance monthly.
     * </p>
     */
    private Double monthlyReservationEligibleCost;
    /**
     * <p>
     * The savings percentage relative to the total On-Demand costs that are associated with this instance.
     * </p>
     */
    private Double savingsPercentage;

    /**
     * <p>
     * The estimated cost of your recurring monthly fees for the recommended reserved instance across the month.
     * </p>
     * 
     * @param estimatedMonthlyAmortizedReservationCost
     *        The estimated cost of your recurring monthly fees for the recommended reserved instance across the month.
     */

    public void setEstimatedMonthlyAmortizedReservationCost(Double estimatedMonthlyAmortizedReservationCost) {
        this.estimatedMonthlyAmortizedReservationCost = estimatedMonthlyAmortizedReservationCost;
    }

    /**
     * <p>
     * The estimated cost of your recurring monthly fees for the recommended reserved instance across the month.
     * </p>
     * 
     * @return The estimated cost of your recurring monthly fees for the recommended reserved instance across the month.
     */

    public Double getEstimatedMonthlyAmortizedReservationCost() {
        return this.estimatedMonthlyAmortizedReservationCost;
    }

    /**
     * <p>
     * The estimated cost of your recurring monthly fees for the recommended reserved instance across the month.
     * </p>
     * 
     * @param estimatedMonthlyAmortizedReservationCost
     *        The estimated cost of your recurring monthly fees for the recommended reserved instance across the month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesPricing withEstimatedMonthlyAmortizedReservationCost(Double estimatedMonthlyAmortizedReservationCost) {
        setEstimatedMonthlyAmortizedReservationCost(estimatedMonthlyAmortizedReservationCost);
        return this;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended reserved instance, over the length of
     * the lookback period.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        The remaining On-Demand cost estimated to not be covered by the recommended reserved instance, over the
     *        length of the lookback period.
     */

    public void setEstimatedOnDemandCost(Double estimatedOnDemandCost) {
        this.estimatedOnDemandCost = estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended reserved instance, over the length of
     * the lookback period.
     * </p>
     * 
     * @return The remaining On-Demand cost estimated to not be covered by the recommended reserved instance, over the
     *         length of the lookback period.
     */

    public Double getEstimatedOnDemandCost() {
        return this.estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended reserved instance, over the length of
     * the lookback period.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        The remaining On-Demand cost estimated to not be covered by the recommended reserved instance, over the
     *        length of the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesPricing withEstimatedOnDemandCost(Double estimatedOnDemandCost) {
        setEstimatedOnDemandCost(estimatedOnDemandCost);
        return this;
    }

    /**
     * <p>
     * The cost of paying for the recommended reserved instance monthly.
     * </p>
     * 
     * @param monthlyReservationEligibleCost
     *        The cost of paying for the recommended reserved instance monthly.
     */

    public void setMonthlyReservationEligibleCost(Double monthlyReservationEligibleCost) {
        this.monthlyReservationEligibleCost = monthlyReservationEligibleCost;
    }

    /**
     * <p>
     * The cost of paying for the recommended reserved instance monthly.
     * </p>
     * 
     * @return The cost of paying for the recommended reserved instance monthly.
     */

    public Double getMonthlyReservationEligibleCost() {
        return this.monthlyReservationEligibleCost;
    }

    /**
     * <p>
     * The cost of paying for the recommended reserved instance monthly.
     * </p>
     * 
     * @param monthlyReservationEligibleCost
     *        The cost of paying for the recommended reserved instance monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesPricing withMonthlyReservationEligibleCost(Double monthlyReservationEligibleCost) {
        setMonthlyReservationEligibleCost(monthlyReservationEligibleCost);
        return this;
    }

    /**
     * <p>
     * The savings percentage relative to the total On-Demand costs that are associated with this instance.
     * </p>
     * 
     * @param savingsPercentage
     *        The savings percentage relative to the total On-Demand costs that are associated with this instance.
     */

    public void setSavingsPercentage(Double savingsPercentage) {
        this.savingsPercentage = savingsPercentage;
    }

    /**
     * <p>
     * The savings percentage relative to the total On-Demand costs that are associated with this instance.
     * </p>
     * 
     * @return The savings percentage relative to the total On-Demand costs that are associated with this instance.
     */

    public Double getSavingsPercentage() {
        return this.savingsPercentage;
    }

    /**
     * <p>
     * The savings percentage relative to the total On-Demand costs that are associated with this instance.
     * </p>
     * 
     * @param savingsPercentage
     *        The savings percentage relative to the total On-Demand costs that are associated with this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesPricing withSavingsPercentage(Double savingsPercentage) {
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
        if (getEstimatedMonthlyAmortizedReservationCost() != null)
            sb.append("EstimatedMonthlyAmortizedReservationCost: ").append(getEstimatedMonthlyAmortizedReservationCost()).append(",");
        if (getEstimatedOnDemandCost() != null)
            sb.append("EstimatedOnDemandCost: ").append(getEstimatedOnDemandCost()).append(",");
        if (getMonthlyReservationEligibleCost() != null)
            sb.append("MonthlyReservationEligibleCost: ").append(getMonthlyReservationEligibleCost()).append(",");
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

        if (obj instanceof ReservedInstancesPricing == false)
            return false;
        ReservedInstancesPricing other = (ReservedInstancesPricing) obj;
        if (other.getEstimatedMonthlyAmortizedReservationCost() == null ^ this.getEstimatedMonthlyAmortizedReservationCost() == null)
            return false;
        if (other.getEstimatedMonthlyAmortizedReservationCost() != null
                && other.getEstimatedMonthlyAmortizedReservationCost().equals(this.getEstimatedMonthlyAmortizedReservationCost()) == false)
            return false;
        if (other.getEstimatedOnDemandCost() == null ^ this.getEstimatedOnDemandCost() == null)
            return false;
        if (other.getEstimatedOnDemandCost() != null && other.getEstimatedOnDemandCost().equals(this.getEstimatedOnDemandCost()) == false)
            return false;
        if (other.getMonthlyReservationEligibleCost() == null ^ this.getMonthlyReservationEligibleCost() == null)
            return false;
        if (other.getMonthlyReservationEligibleCost() != null
                && other.getMonthlyReservationEligibleCost().equals(this.getMonthlyReservationEligibleCost()) == false)
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

        hashCode = prime * hashCode + ((getEstimatedMonthlyAmortizedReservationCost() == null) ? 0 : getEstimatedMonthlyAmortizedReservationCost().hashCode());
        hashCode = prime * hashCode + ((getEstimatedOnDemandCost() == null) ? 0 : getEstimatedOnDemandCost().hashCode());
        hashCode = prime * hashCode + ((getMonthlyReservationEligibleCost() == null) ? 0 : getMonthlyReservationEligibleCost().hashCode());
        hashCode = prime * hashCode + ((getSavingsPercentage() == null) ? 0 : getSavingsPercentage().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstancesPricing clone() {
        try {
            return (ReservedInstancesPricing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.ReservedInstancesPricingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the savings opportunity for Amazon ECS service recommendations after applying Savings Plans discounts.
 * </p>
 * <p>
 * Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You can achieve
 * this by implementing a given Compute Optimizer recommendation.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ECSSavingsOpportunityAfterDiscounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSSavingsOpportunityAfterDiscounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer’s Amazon ECS
     * service recommendations. This includes any applicable Savings Plans discounts.
     * </p>
     */
    private Double savingsOpportunityPercentage;
    /**
     * <p>
     * The estimated monthly savings possible by adopting Compute Optimizer’s Amazon ECS service recommendations. This
     * includes any applicable Savings Plans discounts.
     * </p>
     */
    private ECSEstimatedMonthlySavings estimatedMonthlySavings;

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer’s Amazon ECS
     * service recommendations. This includes any applicable Savings Plans discounts.
     * </p>
     * 
     * @param savingsOpportunityPercentage
     *        The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer’s
     *        Amazon ECS service recommendations. This includes any applicable Savings Plans discounts.
     */

    public void setSavingsOpportunityPercentage(Double savingsOpportunityPercentage) {
        this.savingsOpportunityPercentage = savingsOpportunityPercentage;
    }

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer’s Amazon ECS
     * service recommendations. This includes any applicable Savings Plans discounts.
     * </p>
     * 
     * @return The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer’s
     *         Amazon ECS service recommendations. This includes any applicable Savings Plans discounts.
     */

    public Double getSavingsOpportunityPercentage() {
        return this.savingsOpportunityPercentage;
    }

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer’s Amazon ECS
     * service recommendations. This includes any applicable Savings Plans discounts.
     * </p>
     * 
     * @param savingsOpportunityPercentage
     *        The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer’s
     *        Amazon ECS service recommendations. This includes any applicable Savings Plans discounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSSavingsOpportunityAfterDiscounts withSavingsOpportunityPercentage(Double savingsOpportunityPercentage) {
        setSavingsOpportunityPercentage(savingsOpportunityPercentage);
        return this;
    }

    /**
     * <p>
     * The estimated monthly savings possible by adopting Compute Optimizer’s Amazon ECS service recommendations. This
     * includes any applicable Savings Plans discounts.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        The estimated monthly savings possible by adopting Compute Optimizer’s Amazon ECS service recommendations.
     *        This includes any applicable Savings Plans discounts.
     */

    public void setEstimatedMonthlySavings(ECSEstimatedMonthlySavings estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * The estimated monthly savings possible by adopting Compute Optimizer’s Amazon ECS service recommendations. This
     * includes any applicable Savings Plans discounts.
     * </p>
     * 
     * @return The estimated monthly savings possible by adopting Compute Optimizer’s Amazon ECS service
     *         recommendations. This includes any applicable Savings Plans discounts.
     */

    public ECSEstimatedMonthlySavings getEstimatedMonthlySavings() {
        return this.estimatedMonthlySavings;
    }

    /**
     * <p>
     * The estimated monthly savings possible by adopting Compute Optimizer’s Amazon ECS service recommendations. This
     * includes any applicable Savings Plans discounts.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        The estimated monthly savings possible by adopting Compute Optimizer’s Amazon ECS service recommendations.
     *        This includes any applicable Savings Plans discounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSSavingsOpportunityAfterDiscounts withEstimatedMonthlySavings(ECSEstimatedMonthlySavings estimatedMonthlySavings) {
        setEstimatedMonthlySavings(estimatedMonthlySavings);
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
        if (getSavingsOpportunityPercentage() != null)
            sb.append("SavingsOpportunityPercentage: ").append(getSavingsOpportunityPercentage()).append(",");
        if (getEstimatedMonthlySavings() != null)
            sb.append("EstimatedMonthlySavings: ").append(getEstimatedMonthlySavings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSSavingsOpportunityAfterDiscounts == false)
            return false;
        ECSSavingsOpportunityAfterDiscounts other = (ECSSavingsOpportunityAfterDiscounts) obj;
        if (other.getSavingsOpportunityPercentage() == null ^ this.getSavingsOpportunityPercentage() == null)
            return false;
        if (other.getSavingsOpportunityPercentage() != null && other.getSavingsOpportunityPercentage().equals(this.getSavingsOpportunityPercentage()) == false)
            return false;
        if (other.getEstimatedMonthlySavings() == null ^ this.getEstimatedMonthlySavings() == null)
            return false;
        if (other.getEstimatedMonthlySavings() != null && other.getEstimatedMonthlySavings().equals(this.getEstimatedMonthlySavings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSavingsOpportunityPercentage() == null) ? 0 : getSavingsOpportunityPercentage().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlySavings() == null) ? 0 : getEstimatedMonthlySavings().hashCode());
        return hashCode;
    }

    @Override
    public ECSSavingsOpportunityAfterDiscounts clone() {
        try {
            return (ECSSavingsOpportunityAfterDiscounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ECSSavingsOpportunityAfterDiscountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

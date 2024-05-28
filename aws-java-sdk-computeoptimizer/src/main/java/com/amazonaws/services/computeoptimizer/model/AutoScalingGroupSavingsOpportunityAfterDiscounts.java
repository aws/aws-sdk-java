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
 * Describes the savings opportunity for Auto Scaling group recommendations after applying the Savings Plans and
 * Reserved Instances discounts.
 * </p>
 * <p>
 * Savings opportunity represents the estimated monthly savings you can achieve by implementing Compute Optimizer
 * recommendations.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/AutoScalingGroupSavingsOpportunityAfterDiscounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingGroupSavingsOpportunityAfterDiscounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost after applying the Savings Plans and
     * Reserved Instances discounts. This saving can be achieved by adopting Compute Optimizer’s Auto Scaling group
     * recommendations.
     * </p>
     */
    private Double savingsOpportunityPercentage;
    /**
     * <p>
     * An object that describes the estimated monthly savings possible by adopting Compute Optimizer’s Auto Scaling
     * group recommendations. This is based on the Savings Plans and Reserved Instances pricing discounts.
     * </p>
     */
    private AutoScalingGroupEstimatedMonthlySavings estimatedMonthlySavings;

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost after applying the Savings Plans and
     * Reserved Instances discounts. This saving can be achieved by adopting Compute Optimizer’s Auto Scaling group
     * recommendations.
     * </p>
     * 
     * @param savingsOpportunityPercentage
     *        The estimated monthly savings possible as a percentage of monthly cost after applying the Savings Plans
     *        and Reserved Instances discounts. This saving can be achieved by adopting Compute Optimizer’s Auto Scaling
     *        group recommendations.
     */

    public void setSavingsOpportunityPercentage(Double savingsOpportunityPercentage) {
        this.savingsOpportunityPercentage = savingsOpportunityPercentage;
    }

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost after applying the Savings Plans and
     * Reserved Instances discounts. This saving can be achieved by adopting Compute Optimizer’s Auto Scaling group
     * recommendations.
     * </p>
     * 
     * @return The estimated monthly savings possible as a percentage of monthly cost after applying the Savings Plans
     *         and Reserved Instances discounts. This saving can be achieved by adopting Compute Optimizer’s Auto
     *         Scaling group recommendations.
     */

    public Double getSavingsOpportunityPercentage() {
        return this.savingsOpportunityPercentage;
    }

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost after applying the Savings Plans and
     * Reserved Instances discounts. This saving can be achieved by adopting Compute Optimizer’s Auto Scaling group
     * recommendations.
     * </p>
     * 
     * @param savingsOpportunityPercentage
     *        The estimated monthly savings possible as a percentage of monthly cost after applying the Savings Plans
     *        and Reserved Instances discounts. This saving can be achieved by adopting Compute Optimizer’s Auto Scaling
     *        group recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupSavingsOpportunityAfterDiscounts withSavingsOpportunityPercentage(Double savingsOpportunityPercentage) {
        setSavingsOpportunityPercentage(savingsOpportunityPercentage);
        return this;
    }

    /**
     * <p>
     * An object that describes the estimated monthly savings possible by adopting Compute Optimizer’s Auto Scaling
     * group recommendations. This is based on the Savings Plans and Reserved Instances pricing discounts.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        An object that describes the estimated monthly savings possible by adopting Compute Optimizer’s Auto
     *        Scaling group recommendations. This is based on the Savings Plans and Reserved Instances pricing
     *        discounts.
     */

    public void setEstimatedMonthlySavings(AutoScalingGroupEstimatedMonthlySavings estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * An object that describes the estimated monthly savings possible by adopting Compute Optimizer’s Auto Scaling
     * group recommendations. This is based on the Savings Plans and Reserved Instances pricing discounts.
     * </p>
     * 
     * @return An object that describes the estimated monthly savings possible by adopting Compute Optimizer’s Auto
     *         Scaling group recommendations. This is based on the Savings Plans and Reserved Instances pricing
     *         discounts.
     */

    public AutoScalingGroupEstimatedMonthlySavings getEstimatedMonthlySavings() {
        return this.estimatedMonthlySavings;
    }

    /**
     * <p>
     * An object that describes the estimated monthly savings possible by adopting Compute Optimizer’s Auto Scaling
     * group recommendations. This is based on the Savings Plans and Reserved Instances pricing discounts.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        An object that describes the estimated monthly savings possible by adopting Compute Optimizer’s Auto
     *        Scaling group recommendations. This is based on the Savings Plans and Reserved Instances pricing
     *        discounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupSavingsOpportunityAfterDiscounts withEstimatedMonthlySavings(AutoScalingGroupEstimatedMonthlySavings estimatedMonthlySavings) {
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

        if (obj instanceof AutoScalingGroupSavingsOpportunityAfterDiscounts == false)
            return false;
        AutoScalingGroupSavingsOpportunityAfterDiscounts other = (AutoScalingGroupSavingsOpportunityAfterDiscounts) obj;
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
    public AutoScalingGroupSavingsOpportunityAfterDiscounts clone() {
        try {
            return (AutoScalingGroupSavingsOpportunityAfterDiscounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.AutoScalingGroupSavingsOpportunityAfterDiscountsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the savings opportunity for recommendations of a given resource type or for the recommendation option of an
 * individual resource.
 * </p>
 * <p>
 * Savings opportunity represents the estimated monthly savings you can achieve by implementing a given Compute
 * Optimizer recommendation.
 * </p>
 * <important>
 * <p>
 * Savings opportunity data requires that you opt in to Cost Explorer, as well as activate <b>Receive Amazon EC2
 * resource recommendations</b> in the Cost Explorer preferences page. That creates a connection between Cost Explorer
 * and Compute Optimizer. With this connection, Cost Explorer generates savings estimates considering the price of
 * existing resources, the price of recommended resources, and historical usage data. Estimated monthly savings reflects
 * the projected dollar savings associated with each of the recommendations generated. For more information, see <a
 * href="https://docs.aws.amazon.com/cost-management/latest/userguide/ce-enable.html">Enabling Cost Explorer</a> and <a
 * href="https://docs.aws.amazon.com/cost-management/latest/userguide/ce-rightsizing.html">Optimizing your cost with
 * Rightsizing Recommendations</a> in the <i>Cost Management User Guide</i>.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/SavingsOpportunity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsOpportunity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer
     * recommendations for a given resource.
     * </p>
     */
    private Double savingsOpportunityPercentage;
    /**
     * <p>
     * An object that describes the estimated monthly savings amount possible, based on On-Demand instance pricing, by
     * adopting Compute Optimizer recommendations for a given resource.
     * </p>
     */
    private EstimatedMonthlySavings estimatedMonthlySavings;

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer
     * recommendations for a given resource.
     * </p>
     * 
     * @param savingsOpportunityPercentage
     *        The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer
     *        recommendations for a given resource.
     */

    public void setSavingsOpportunityPercentage(Double savingsOpportunityPercentage) {
        this.savingsOpportunityPercentage = savingsOpportunityPercentage;
    }

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer
     * recommendations for a given resource.
     * </p>
     * 
     * @return The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer
     *         recommendations for a given resource.
     */

    public Double getSavingsOpportunityPercentage() {
        return this.savingsOpportunityPercentage;
    }

    /**
     * <p>
     * The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer
     * recommendations for a given resource.
     * </p>
     * 
     * @param savingsOpportunityPercentage
     *        The estimated monthly savings possible as a percentage of monthly cost by adopting Compute Optimizer
     *        recommendations for a given resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsOpportunity withSavingsOpportunityPercentage(Double savingsOpportunityPercentage) {
        setSavingsOpportunityPercentage(savingsOpportunityPercentage);
        return this;
    }

    /**
     * <p>
     * An object that describes the estimated monthly savings amount possible, based on On-Demand instance pricing, by
     * adopting Compute Optimizer recommendations for a given resource.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        An object that describes the estimated monthly savings amount possible, based on On-Demand instance
     *        pricing, by adopting Compute Optimizer recommendations for a given resource.
     */

    public void setEstimatedMonthlySavings(EstimatedMonthlySavings estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * An object that describes the estimated monthly savings amount possible, based on On-Demand instance pricing, by
     * adopting Compute Optimizer recommendations for a given resource.
     * </p>
     * 
     * @return An object that describes the estimated monthly savings amount possible, based on On-Demand instance
     *         pricing, by adopting Compute Optimizer recommendations for a given resource.
     */

    public EstimatedMonthlySavings getEstimatedMonthlySavings() {
        return this.estimatedMonthlySavings;
    }

    /**
     * <p>
     * An object that describes the estimated monthly savings amount possible, based on On-Demand instance pricing, by
     * adopting Compute Optimizer recommendations for a given resource.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        An object that describes the estimated monthly savings amount possible, based on On-Demand instance
     *        pricing, by adopting Compute Optimizer recommendations for a given resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsOpportunity withEstimatedMonthlySavings(EstimatedMonthlySavings estimatedMonthlySavings) {
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

        if (obj instanceof SavingsOpportunity == false)
            return false;
        SavingsOpportunity other = (SavingsOpportunity) obj;
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
    public SavingsOpportunity clone() {
        try {
            return (SavingsOpportunity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.SavingsOpportunityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

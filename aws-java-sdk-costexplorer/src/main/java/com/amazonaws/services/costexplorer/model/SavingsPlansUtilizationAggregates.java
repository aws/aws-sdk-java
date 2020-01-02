/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The aggregated utilization metrics for your Savings Plans usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansUtilizationAggregates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansUtilizationAggregates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans
     * eligible.
     * </p>
     */
    private SavingsPlansUtilization utilization;
    /**
     * <p>
     * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as well as
     * the <code>onDemandCostEquivalent</code> of the Savings Plans when considering the utilization rate.
     * </p>
     */
    private SavingsPlansSavings savings;
    /**
     * <p>
     * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings
     * Plans fees.
     * </p>
     */
    private SavingsPlansAmortizedCommitment amortizedCommitment;

    /**
     * <p>
     * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans
     * eligible.
     * </p>
     * 
     * @param utilization
     *        A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans
     *        eligible.
     */

    public void setUtilization(SavingsPlansUtilization utilization) {
        this.utilization = utilization;
    }

    /**
     * <p>
     * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans
     * eligible.
     * </p>
     * 
     * @return A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings
     *         Plans eligible.
     */

    public SavingsPlansUtilization getUtilization() {
        return this.utilization;
    }

    /**
     * <p>
     * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans
     * eligible.
     * </p>
     * 
     * @param utilization
     *        A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans
     *        eligible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansUtilizationAggregates withUtilization(SavingsPlansUtilization utilization) {
        setUtilization(utilization);
        return this;
    }

    /**
     * <p>
     * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as well as
     * the <code>onDemandCostEquivalent</code> of the Savings Plans when considering the utilization rate.
     * </p>
     * 
     * @param savings
     *        The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as
     *        well as the <code>onDemandCostEquivalent</code> of the Savings Plans when considering the utilization
     *        rate.
     */

    public void setSavings(SavingsPlansSavings savings) {
        this.savings = savings;
    }

    /**
     * <p>
     * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as well as
     * the <code>onDemandCostEquivalent</code> of the Savings Plans when considering the utilization rate.
     * </p>
     * 
     * @return The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as
     *         well as the <code>onDemandCostEquivalent</code> of the Savings Plans when considering the utilization
     *         rate.
     */

    public SavingsPlansSavings getSavings() {
        return this.savings;
    }

    /**
     * <p>
     * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as well as
     * the <code>onDemandCostEquivalent</code> of the Savings Plans when considering the utilization rate.
     * </p>
     * 
     * @param savings
     *        The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as
     *        well as the <code>onDemandCostEquivalent</code> of the Savings Plans when considering the utilization
     *        rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansUtilizationAggregates withSavings(SavingsPlansSavings savings) {
        setSavings(savings);
        return this;
    }

    /**
     * <p>
     * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings
     * Plans fees.
     * </p>
     * 
     * @param amortizedCommitment
     *        The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring
     *        Savings Plans fees.
     */

    public void setAmortizedCommitment(SavingsPlansAmortizedCommitment amortizedCommitment) {
        this.amortizedCommitment = amortizedCommitment;
    }

    /**
     * <p>
     * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings
     * Plans fees.
     * </p>
     * 
     * @return The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring
     *         Savings Plans fees.
     */

    public SavingsPlansAmortizedCommitment getAmortizedCommitment() {
        return this.amortizedCommitment;
    }

    /**
     * <p>
     * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings
     * Plans fees.
     * </p>
     * 
     * @param amortizedCommitment
     *        The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring
     *        Savings Plans fees.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansUtilizationAggregates withAmortizedCommitment(SavingsPlansAmortizedCommitment amortizedCommitment) {
        setAmortizedCommitment(amortizedCommitment);
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
        if (getUtilization() != null)
            sb.append("Utilization: ").append(getUtilization()).append(",");
        if (getSavings() != null)
            sb.append("Savings: ").append(getSavings()).append(",");
        if (getAmortizedCommitment() != null)
            sb.append("AmortizedCommitment: ").append(getAmortizedCommitment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansUtilizationAggregates == false)
            return false;
        SavingsPlansUtilizationAggregates other = (SavingsPlansUtilizationAggregates) obj;
        if (other.getUtilization() == null ^ this.getUtilization() == null)
            return false;
        if (other.getUtilization() != null && other.getUtilization().equals(this.getUtilization()) == false)
            return false;
        if (other.getSavings() == null ^ this.getSavings() == null)
            return false;
        if (other.getSavings() != null && other.getSavings().equals(this.getSavings()) == false)
            return false;
        if (other.getAmortizedCommitment() == null ^ this.getAmortizedCommitment() == null)
            return false;
        if (other.getAmortizedCommitment() != null && other.getAmortizedCommitment().equals(this.getAmortizedCommitment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUtilization() == null) ? 0 : getUtilization().hashCode());
        hashCode = prime * hashCode + ((getSavings() == null) ? 0 : getSavings().hashCode());
        hashCode = prime * hashCode + ((getAmortizedCommitment() == null) ? 0 : getAmortizedCommitment().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansUtilizationAggregates clone() {
        try {
            return (SavingsPlansUtilizationAggregates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansUtilizationAggregatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

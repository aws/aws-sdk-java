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
 * Specific coverage percentage, On-Demand costs, and spend covered by Savings Plans, and total Savings Plans costs for
 * an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansCoverageData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansCoverageData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of your Amazon Web Services usage that is covered by a Savings Plans.
     * </p>
     */
    private String spendCoveredBySavingsPlans;
    /**
     * <p>
     * The cost of your Amazon Web Services usage at the public On-Demand rate.
     * </p>
     */
    private String onDemandCost;
    /**
     * <p>
     * The total cost of your Amazon Web Services usage, regardless of your purchase option.
     * </p>
     */
    private String totalCost;
    /**
     * <p>
     * The percentage of your existing Savings Planscovered usage, divided by all of your eligible Savings Plans usage
     * in an account(or set of accounts).
     * </p>
     */
    private String coveragePercentage;

    /**
     * <p>
     * The amount of your Amazon Web Services usage that is covered by a Savings Plans.
     * </p>
     * 
     * @param spendCoveredBySavingsPlans
     *        The amount of your Amazon Web Services usage that is covered by a Savings Plans.
     */

    public void setSpendCoveredBySavingsPlans(String spendCoveredBySavingsPlans) {
        this.spendCoveredBySavingsPlans = spendCoveredBySavingsPlans;
    }

    /**
     * <p>
     * The amount of your Amazon Web Services usage that is covered by a Savings Plans.
     * </p>
     * 
     * @return The amount of your Amazon Web Services usage that is covered by a Savings Plans.
     */

    public String getSpendCoveredBySavingsPlans() {
        return this.spendCoveredBySavingsPlans;
    }

    /**
     * <p>
     * The amount of your Amazon Web Services usage that is covered by a Savings Plans.
     * </p>
     * 
     * @param spendCoveredBySavingsPlans
     *        The amount of your Amazon Web Services usage that is covered by a Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansCoverageData withSpendCoveredBySavingsPlans(String spendCoveredBySavingsPlans) {
        setSpendCoveredBySavingsPlans(spendCoveredBySavingsPlans);
        return this;
    }

    /**
     * <p>
     * The cost of your Amazon Web Services usage at the public On-Demand rate.
     * </p>
     * 
     * @param onDemandCost
     *        The cost of your Amazon Web Services usage at the public On-Demand rate.
     */

    public void setOnDemandCost(String onDemandCost) {
        this.onDemandCost = onDemandCost;
    }

    /**
     * <p>
     * The cost of your Amazon Web Services usage at the public On-Demand rate.
     * </p>
     * 
     * @return The cost of your Amazon Web Services usage at the public On-Demand rate.
     */

    public String getOnDemandCost() {
        return this.onDemandCost;
    }

    /**
     * <p>
     * The cost of your Amazon Web Services usage at the public On-Demand rate.
     * </p>
     * 
     * @param onDemandCost
     *        The cost of your Amazon Web Services usage at the public On-Demand rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansCoverageData withOnDemandCost(String onDemandCost) {
        setOnDemandCost(onDemandCost);
        return this;
    }

    /**
     * <p>
     * The total cost of your Amazon Web Services usage, regardless of your purchase option.
     * </p>
     * 
     * @param totalCost
     *        The total cost of your Amazon Web Services usage, regardless of your purchase option.
     */

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * <p>
     * The total cost of your Amazon Web Services usage, regardless of your purchase option.
     * </p>
     * 
     * @return The total cost of your Amazon Web Services usage, regardless of your purchase option.
     */

    public String getTotalCost() {
        return this.totalCost;
    }

    /**
     * <p>
     * The total cost of your Amazon Web Services usage, regardless of your purchase option.
     * </p>
     * 
     * @param totalCost
     *        The total cost of your Amazon Web Services usage, regardless of your purchase option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansCoverageData withTotalCost(String totalCost) {
        setTotalCost(totalCost);
        return this;
    }

    /**
     * <p>
     * The percentage of your existing Savings Planscovered usage, divided by all of your eligible Savings Plans usage
     * in an account(or set of accounts).
     * </p>
     * 
     * @param coveragePercentage
     *        The percentage of your existing Savings Planscovered usage, divided by all of your eligible Savings Plans
     *        usage in an account(or set of accounts).
     */

    public void setCoveragePercentage(String coveragePercentage) {
        this.coveragePercentage = coveragePercentage;
    }

    /**
     * <p>
     * The percentage of your existing Savings Planscovered usage, divided by all of your eligible Savings Plans usage
     * in an account(or set of accounts).
     * </p>
     * 
     * @return The percentage of your existing Savings Planscovered usage, divided by all of your eligible Savings Plans
     *         usage in an account(or set of accounts).
     */

    public String getCoveragePercentage() {
        return this.coveragePercentage;
    }

    /**
     * <p>
     * The percentage of your existing Savings Planscovered usage, divided by all of your eligible Savings Plans usage
     * in an account(or set of accounts).
     * </p>
     * 
     * @param coveragePercentage
     *        The percentage of your existing Savings Planscovered usage, divided by all of your eligible Savings Plans
     *        usage in an account(or set of accounts).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansCoverageData withCoveragePercentage(String coveragePercentage) {
        setCoveragePercentage(coveragePercentage);
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
        if (getSpendCoveredBySavingsPlans() != null)
            sb.append("SpendCoveredBySavingsPlans: ").append(getSpendCoveredBySavingsPlans()).append(",");
        if (getOnDemandCost() != null)
            sb.append("OnDemandCost: ").append(getOnDemandCost()).append(",");
        if (getTotalCost() != null)
            sb.append("TotalCost: ").append(getTotalCost()).append(",");
        if (getCoveragePercentage() != null)
            sb.append("CoveragePercentage: ").append(getCoveragePercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansCoverageData == false)
            return false;
        SavingsPlansCoverageData other = (SavingsPlansCoverageData) obj;
        if (other.getSpendCoveredBySavingsPlans() == null ^ this.getSpendCoveredBySavingsPlans() == null)
            return false;
        if (other.getSpendCoveredBySavingsPlans() != null && other.getSpendCoveredBySavingsPlans().equals(this.getSpendCoveredBySavingsPlans()) == false)
            return false;
        if (other.getOnDemandCost() == null ^ this.getOnDemandCost() == null)
            return false;
        if (other.getOnDemandCost() != null && other.getOnDemandCost().equals(this.getOnDemandCost()) == false)
            return false;
        if (other.getTotalCost() == null ^ this.getTotalCost() == null)
            return false;
        if (other.getTotalCost() != null && other.getTotalCost().equals(this.getTotalCost()) == false)
            return false;
        if (other.getCoveragePercentage() == null ^ this.getCoveragePercentage() == null)
            return false;
        if (other.getCoveragePercentage() != null && other.getCoveragePercentage().equals(this.getCoveragePercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpendCoveredBySavingsPlans() == null) ? 0 : getSpendCoveredBySavingsPlans().hashCode());
        hashCode = prime * hashCode + ((getOnDemandCost() == null) ? 0 : getOnDemandCost().hashCode());
        hashCode = prime * hashCode + ((getTotalCost() == null) ? 0 : getTotalCost().hashCode());
        hashCode = prime * hashCode + ((getCoveragePercentage() == null) ? 0 : getCoveragePercentage().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansCoverageData clone() {
        try {
            return (SavingsPlansCoverageData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansCoverageDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

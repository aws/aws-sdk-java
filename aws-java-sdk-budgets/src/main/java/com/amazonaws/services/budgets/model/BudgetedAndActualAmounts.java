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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The amount of cost or usage that you created the budget for, compared to your actual costs or usage.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BudgetedAndActualAmounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of cost or usage that you created the budget for.
     * </p>
     */
    private Spend budgetedAmount;
    /**
     * <p>
     * Your actual costs or usage for a budget period.
     * </p>
     */
    private Spend actualAmount;
    /**
     * <p>
     * The time period covered by this budget comparison.
     * </p>
     */
    private TimePeriod timePeriod;

    /**
     * <p>
     * The amount of cost or usage that you created the budget for.
     * </p>
     * 
     * @param budgetedAmount
     *        The amount of cost or usage that you created the budget for.
     */

    public void setBudgetedAmount(Spend budgetedAmount) {
        this.budgetedAmount = budgetedAmount;
    }

    /**
     * <p>
     * The amount of cost or usage that you created the budget for.
     * </p>
     * 
     * @return The amount of cost or usage that you created the budget for.
     */

    public Spend getBudgetedAmount() {
        return this.budgetedAmount;
    }

    /**
     * <p>
     * The amount of cost or usage that you created the budget for.
     * </p>
     * 
     * @param budgetedAmount
     *        The amount of cost or usage that you created the budget for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetedAndActualAmounts withBudgetedAmount(Spend budgetedAmount) {
        setBudgetedAmount(budgetedAmount);
        return this;
    }

    /**
     * <p>
     * Your actual costs or usage for a budget period.
     * </p>
     * 
     * @param actualAmount
     *        Your actual costs or usage for a budget period.
     */

    public void setActualAmount(Spend actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * <p>
     * Your actual costs or usage for a budget period.
     * </p>
     * 
     * @return Your actual costs or usage for a budget period.
     */

    public Spend getActualAmount() {
        return this.actualAmount;
    }

    /**
     * <p>
     * Your actual costs or usage for a budget period.
     * </p>
     * 
     * @param actualAmount
     *        Your actual costs or usage for a budget period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetedAndActualAmounts withActualAmount(Spend actualAmount) {
        setActualAmount(actualAmount);
        return this;
    }

    /**
     * <p>
     * The time period covered by this budget comparison.
     * </p>
     * 
     * @param timePeriod
     *        The time period covered by this budget comparison.
     */

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The time period covered by this budget comparison.
     * </p>
     * 
     * @return The time period covered by this budget comparison.
     */

    public TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The time period covered by this budget comparison.
     * </p>
     * 
     * @param timePeriod
     *        The time period covered by this budget comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetedAndActualAmounts withTimePeriod(TimePeriod timePeriod) {
        setTimePeriod(timePeriod);
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
        if (getBudgetedAmount() != null)
            sb.append("BudgetedAmount: ").append(getBudgetedAmount()).append(",");
        if (getActualAmount() != null)
            sb.append("ActualAmount: ").append(getActualAmount()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BudgetedAndActualAmounts == false)
            return false;
        BudgetedAndActualAmounts other = (BudgetedAndActualAmounts) obj;
        if (other.getBudgetedAmount() == null ^ this.getBudgetedAmount() == null)
            return false;
        if (other.getBudgetedAmount() != null && other.getBudgetedAmount().equals(this.getBudgetedAmount()) == false)
            return false;
        if (other.getActualAmount() == null ^ this.getActualAmount() == null)
            return false;
        if (other.getActualAmount() != null && other.getActualAmount().equals(this.getActualAmount()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBudgetedAmount() == null) ? 0 : getBudgetedAmount().hashCode());
        hashCode = prime * hashCode + ((getActualAmount() == null) ? 0 : getActualAmount().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        return hashCode;
    }

    @Override
    public BudgetedAndActualAmounts clone() {
        try {
            return (BudgetedAndActualAmounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.BudgetedAndActualAmountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

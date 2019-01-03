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
 * A history of the state of a budget at the end of the budget's specified time period.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BudgetPerformanceHistory implements Serializable, Cloneable, StructuredPojo {

    private String budgetName;

    private String budgetType;
    /**
     * <p>
     * The history of the cost filters for a budget during the specified time period.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> costFilters;
    /**
     * <p>
     * The history of the cost types for a budget during the specified time period.
     * </p>
     */
    private CostTypes costTypes;

    private String timeUnit;
    /**
     * <p>
     * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
     * </p>
     */
    private java.util.List<BudgetedAndActualAmounts> budgetedAndActualAmountsList;

    /**
     * @param budgetName
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * @return
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * @param budgetName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetPerformanceHistory withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * @param budgetType
     * @see BudgetType
     */

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    /**
     * @return
     * @see BudgetType
     */

    public String getBudgetType() {
        return this.budgetType;
    }

    /**
     * @param budgetType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetType
     */

    public BudgetPerformanceHistory withBudgetType(String budgetType) {
        setBudgetType(budgetType);
        return this;
    }

    /**
     * @param budgetType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetType
     */

    public BudgetPerformanceHistory withBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType.toString();
        return this;
    }

    /**
     * <p>
     * The history of the cost filters for a budget during the specified time period.
     * </p>
     * 
     * @return The history of the cost filters for a budget during the specified time period.
     */

    public java.util.Map<String, java.util.List<String>> getCostFilters() {
        return costFilters;
    }

    /**
     * <p>
     * The history of the cost filters for a budget during the specified time period.
     * </p>
     * 
     * @param costFilters
     *        The history of the cost filters for a budget during the specified time period.
     */

    public void setCostFilters(java.util.Map<String, java.util.List<String>> costFilters) {
        this.costFilters = costFilters;
    }

    /**
     * <p>
     * The history of the cost filters for a budget during the specified time period.
     * </p>
     * 
     * @param costFilters
     *        The history of the cost filters for a budget during the specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetPerformanceHistory withCostFilters(java.util.Map<String, java.util.List<String>> costFilters) {
        setCostFilters(costFilters);
        return this;
    }

    public BudgetPerformanceHistory addCostFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.costFilters) {
            this.costFilters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.costFilters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.costFilters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CostFilters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetPerformanceHistory clearCostFiltersEntries() {
        this.costFilters = null;
        return this;
    }

    /**
     * <p>
     * The history of the cost types for a budget during the specified time period.
     * </p>
     * 
     * @param costTypes
     *        The history of the cost types for a budget during the specified time period.
     */

    public void setCostTypes(CostTypes costTypes) {
        this.costTypes = costTypes;
    }

    /**
     * <p>
     * The history of the cost types for a budget during the specified time period.
     * </p>
     * 
     * @return The history of the cost types for a budget during the specified time period.
     */

    public CostTypes getCostTypes() {
        return this.costTypes;
    }

    /**
     * <p>
     * The history of the cost types for a budget during the specified time period.
     * </p>
     * 
     * @param costTypes
     *        The history of the cost types for a budget during the specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetPerformanceHistory withCostTypes(CostTypes costTypes) {
        setCostTypes(costTypes);
        return this;
    }

    /**
     * @param timeUnit
     * @see TimeUnit
     */

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * @return
     * @see TimeUnit
     */

    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * @param timeUnit
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public BudgetPerformanceHistory withTimeUnit(String timeUnit) {
        setTimeUnit(timeUnit);
        return this;
    }

    /**
     * @param timeUnit
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public BudgetPerformanceHistory withTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit.toString();
        return this;
    }

    /**
     * <p>
     * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
     * </p>
     * 
     * @return A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
     */

    public java.util.List<BudgetedAndActualAmounts> getBudgetedAndActualAmountsList() {
        return budgetedAndActualAmountsList;
    }

    /**
     * <p>
     * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
     * </p>
     * 
     * @param budgetedAndActualAmountsList
     *        A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
     */

    public void setBudgetedAndActualAmountsList(java.util.Collection<BudgetedAndActualAmounts> budgetedAndActualAmountsList) {
        if (budgetedAndActualAmountsList == null) {
            this.budgetedAndActualAmountsList = null;
            return;
        }

        this.budgetedAndActualAmountsList = new java.util.ArrayList<BudgetedAndActualAmounts>(budgetedAndActualAmountsList);
    }

    /**
     * <p>
     * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBudgetedAndActualAmountsList(java.util.Collection)} or
     * {@link #withBudgetedAndActualAmountsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param budgetedAndActualAmountsList
     *        A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetPerformanceHistory withBudgetedAndActualAmountsList(BudgetedAndActualAmounts... budgetedAndActualAmountsList) {
        if (this.budgetedAndActualAmountsList == null) {
            setBudgetedAndActualAmountsList(new java.util.ArrayList<BudgetedAndActualAmounts>(budgetedAndActualAmountsList.length));
        }
        for (BudgetedAndActualAmounts ele : budgetedAndActualAmountsList) {
            this.budgetedAndActualAmountsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
     * </p>
     * 
     * @param budgetedAndActualAmountsList
     *        A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetPerformanceHistory withBudgetedAndActualAmountsList(java.util.Collection<BudgetedAndActualAmounts> budgetedAndActualAmountsList) {
        setBudgetedAndActualAmountsList(budgetedAndActualAmountsList);
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
        if (getBudgetName() != null)
            sb.append("BudgetName: ").append(getBudgetName()).append(",");
        if (getBudgetType() != null)
            sb.append("BudgetType: ").append(getBudgetType()).append(",");
        if (getCostFilters() != null)
            sb.append("CostFilters: ").append(getCostFilters()).append(",");
        if (getCostTypes() != null)
            sb.append("CostTypes: ").append(getCostTypes()).append(",");
        if (getTimeUnit() != null)
            sb.append("TimeUnit: ").append(getTimeUnit()).append(",");
        if (getBudgetedAndActualAmountsList() != null)
            sb.append("BudgetedAndActualAmountsList: ").append(getBudgetedAndActualAmountsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BudgetPerformanceHistory == false)
            return false;
        BudgetPerformanceHistory other = (BudgetPerformanceHistory) obj;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getBudgetType() == null ^ this.getBudgetType() == null)
            return false;
        if (other.getBudgetType() != null && other.getBudgetType().equals(this.getBudgetType()) == false)
            return false;
        if (other.getCostFilters() == null ^ this.getCostFilters() == null)
            return false;
        if (other.getCostFilters() != null && other.getCostFilters().equals(this.getCostFilters()) == false)
            return false;
        if (other.getCostTypes() == null ^ this.getCostTypes() == null)
            return false;
        if (other.getCostTypes() != null && other.getCostTypes().equals(this.getCostTypes()) == false)
            return false;
        if (other.getTimeUnit() == null ^ this.getTimeUnit() == null)
            return false;
        if (other.getTimeUnit() != null && other.getTimeUnit().equals(this.getTimeUnit()) == false)
            return false;
        if (other.getBudgetedAndActualAmountsList() == null ^ this.getBudgetedAndActualAmountsList() == null)
            return false;
        if (other.getBudgetedAndActualAmountsList() != null && other.getBudgetedAndActualAmountsList().equals(this.getBudgetedAndActualAmountsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getBudgetType() == null) ? 0 : getBudgetType().hashCode());
        hashCode = prime * hashCode + ((getCostFilters() == null) ? 0 : getCostFilters().hashCode());
        hashCode = prime * hashCode + ((getCostTypes() == null) ? 0 : getCostTypes().hashCode());
        hashCode = prime * hashCode + ((getTimeUnit() == null) ? 0 : getTimeUnit().hashCode());
        hashCode = prime * hashCode + ((getBudgetedAndActualAmountsList() == null) ? 0 : getBudgetedAndActualAmountsList().hashCode());
        return hashCode;
    }

    @Override
    public BudgetPerformanceHistory clone() {
        try {
            return (BudgetPerformanceHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.BudgetPerformanceHistoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

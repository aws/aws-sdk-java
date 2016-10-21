/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * AWS Budget model
 */
public class Budget implements Serializable, Cloneable {

    private String budgetName;

    private Spend budgetLimit;

    private java.util.Map<String, java.util.List<String>> costFilters;

    private CostTypes costTypes;

    private String timeUnit;

    private TimePeriod timePeriod;

    private CalculatedSpend calculatedSpend;

    private String budgetType;

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

    public Budget withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * @param budgetLimit
     */

    public void setBudgetLimit(Spend budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    /**
     * @return
     */

    public Spend getBudgetLimit() {
        return this.budgetLimit;
    }

    /**
     * @param budgetLimit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withBudgetLimit(Spend budgetLimit) {
        setBudgetLimit(budgetLimit);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, java.util.List<String>> getCostFilters() {
        return costFilters;
    }

    /**
     * @param costFilters
     */

    public void setCostFilters(java.util.Map<String, java.util.List<String>> costFilters) {
        this.costFilters = costFilters;
    }

    /**
     * @param costFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withCostFilters(java.util.Map<String, java.util.List<String>> costFilters) {
        setCostFilters(costFilters);
        return this;
    }

    public Budget addCostFiltersEntry(String key, java.util.List<String> value) {
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

    public Budget clearCostFiltersEntries() {
        this.costFilters = null;
        return this;
    }

    /**
     * @param costTypes
     */

    public void setCostTypes(CostTypes costTypes) {
        this.costTypes = costTypes;
    }

    /**
     * @return
     */

    public CostTypes getCostTypes() {
        return this.costTypes;
    }

    /**
     * @param costTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withCostTypes(CostTypes costTypes) {
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

    public Budget withTimeUnit(String timeUnit) {
        setTimeUnit(timeUnit);
        return this;
    }

    /**
     * @param timeUnit
     * @see TimeUnit
     */

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit.toString();
    }

    /**
     * @param timeUnit
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Budget withTimeUnit(TimeUnit timeUnit) {
        setTimeUnit(timeUnit);
        return this;
    }

    /**
     * @param timePeriod
     */

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * @return
     */

    public TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * @param timePeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withTimePeriod(TimePeriod timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * @param calculatedSpend
     */

    public void setCalculatedSpend(CalculatedSpend calculatedSpend) {
        this.calculatedSpend = calculatedSpend;
    }

    /**
     * @return
     */

    public CalculatedSpend getCalculatedSpend() {
        return this.calculatedSpend;
    }

    /**
     * @param calculatedSpend
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withCalculatedSpend(CalculatedSpend calculatedSpend) {
        setCalculatedSpend(calculatedSpend);
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

    public Budget withBudgetType(String budgetType) {
        setBudgetType(budgetType);
        return this;
    }

    /**
     * @param budgetType
     * @see BudgetType
     */

    public void setBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType.toString();
    }

    /**
     * @param budgetType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetType
     */

    public Budget withBudgetType(BudgetType budgetType) {
        setBudgetType(budgetType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("BudgetName: " + getBudgetName() + ",");
        if (getBudgetLimit() != null)
            sb.append("BudgetLimit: " + getBudgetLimit() + ",");
        if (getCostFilters() != null)
            sb.append("CostFilters: " + getCostFilters() + ",");
        if (getCostTypes() != null)
            sb.append("CostTypes: " + getCostTypes() + ",");
        if (getTimeUnit() != null)
            sb.append("TimeUnit: " + getTimeUnit() + ",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod() + ",");
        if (getCalculatedSpend() != null)
            sb.append("CalculatedSpend: " + getCalculatedSpend() + ",");
        if (getBudgetType() != null)
            sb.append("BudgetType: " + getBudgetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Budget == false)
            return false;
        Budget other = (Budget) obj;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getBudgetLimit() == null ^ this.getBudgetLimit() == null)
            return false;
        if (other.getBudgetLimit() != null && other.getBudgetLimit().equals(this.getBudgetLimit()) == false)
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
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getCalculatedSpend() == null ^ this.getCalculatedSpend() == null)
            return false;
        if (other.getCalculatedSpend() != null && other.getCalculatedSpend().equals(this.getCalculatedSpend()) == false)
            return false;
        if (other.getBudgetType() == null ^ this.getBudgetType() == null)
            return false;
        if (other.getBudgetType() != null && other.getBudgetType().equals(this.getBudgetType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getBudgetLimit() == null) ? 0 : getBudgetLimit().hashCode());
        hashCode = prime * hashCode + ((getCostFilters() == null) ? 0 : getCostFilters().hashCode());
        hashCode = prime * hashCode + ((getCostTypes() == null) ? 0 : getCostTypes().hashCode());
        hashCode = prime * hashCode + ((getTimeUnit() == null) ? 0 : getTimeUnit().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getCalculatedSpend() == null) ? 0 : getCalculatedSpend().hashCode());
        hashCode = prime * hashCode + ((getBudgetType() == null) ? 0 : getBudgetType().hashCode());
        return hashCode;
    }

    @Override
    public Budget clone() {
        try {
            return (Budget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

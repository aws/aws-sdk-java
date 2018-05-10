/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the output of the <code>CreateBudget</code> operation. The content consists of the detailed metadata and
 * data file information, and the current status of the <code>budget</code>.
 * </p>
 * <p>
 * The ARN pattern for a budget is: <code>arn:aws:budgetservice::AccountId:budget/budgetName</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Budget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a budget. Unique within accounts. <code>:</code> and <code>\</code> characters are not allowed in the
     * <code>BudgetName</code>.
     * </p>
     */
    private String budgetName;
    /**
     * <p>
     * The total amount of cost, usage, or RI utilization that you want to track with your budget.
     * </p>
     * <p>
     * <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI utilization budgets. RI
     * utilization budgets default to the only valid value for RI utilization budgets, which is <code>100</code>.
     * </p>
     */
    private Spend budgetLimit;
    /**
     * <p>
     * The cost filters applied to a budget, such as service or region.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> costFilters;
    /**
     * <p>
     * The types of costs included in this budget.
     * </p>
     */
    private CostTypes costTypes;
    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     */
    private String timeUnit;
    /**
     * <p>
     * The period of time covered by a budget. Has a start date and an end date. The start date must come before the end
     * date. There are no restrictions on the end date.
     * </p>
     * <p>
     * If you created your budget and didn't specify a start date, AWS defaults to the start of your chosen time period
     * (i.e. DAILY, MONTHLY, QUARTERLY, ANNUALLY). For example, if you created your budget on January 24th 2018, chose
     * <code>DAILY</code>, and didn't set a start date, AWS set your start date to <code>01/24/18 00:00 UTC</code>. If
     * you chose <code>MONTHLY</code>, AWS set your start date to <code>01/01/18 00:00 UTC</code>. If you didn't specify
     * an end date, AWS set your end date to <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS
     * Billing and Cost Management console and the API.
     * </p>
     * <p>
     * You can change either date with the <code>UpdateBudget</code> operation.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * </p>
     */
    private TimePeriod timePeriod;
    /**
     * <p>
     * The actual and forecasted cost or usage being tracked by a budget.
     * </p>
     */
    private CalculatedSpend calculatedSpend;
    /**
     * <p>
     * Whether this budget tracks monetary costs, usage, or RI utilization.
     * </p>
     */
    private String budgetType;

    /**
     * <p>
     * The name of a budget. Unique within accounts. <code>:</code> and <code>\</code> characters are not allowed in the
     * <code>BudgetName</code>.
     * </p>
     * 
     * @param budgetName
     *        The name of a budget. Unique within accounts. <code>:</code> and <code>\</code> characters are not allowed
     *        in the <code>BudgetName</code>.
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of a budget. Unique within accounts. <code>:</code> and <code>\</code> characters are not allowed in the
     * <code>BudgetName</code>.
     * </p>
     * 
     * @return The name of a budget. Unique within accounts. <code>:</code> and <code>\</code> characters are not
     *         allowed in the <code>BudgetName</code>.
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * <p>
     * The name of a budget. Unique within accounts. <code>:</code> and <code>\</code> characters are not allowed in the
     * <code>BudgetName</code>.
     * </p>
     * 
     * @param budgetName
     *        The name of a budget. Unique within accounts. <code>:</code> and <code>\</code> characters are not allowed
     *        in the <code>BudgetName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * The total amount of cost, usage, or RI utilization that you want to track with your budget.
     * </p>
     * <p>
     * <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI utilization budgets. RI
     * utilization budgets default to the only valid value for RI utilization budgets, which is <code>100</code>.
     * </p>
     * 
     * @param budgetLimit
     *        The total amount of cost, usage, or RI utilization that you want to track with your budget.</p>
     *        <p>
     *        <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI utilization budgets.
     *        RI utilization budgets default to the only valid value for RI utilization budgets, which is
     *        <code>100</code>.
     */

    public void setBudgetLimit(Spend budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    /**
     * <p>
     * The total amount of cost, usage, or RI utilization that you want to track with your budget.
     * </p>
     * <p>
     * <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI utilization budgets. RI
     * utilization budgets default to the only valid value for RI utilization budgets, which is <code>100</code>.
     * </p>
     * 
     * @return The total amount of cost, usage, or RI utilization that you want to track with your budget.</p>
     *         <p>
     *         <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI utilization budgets.
     *         RI utilization budgets default to the only valid value for RI utilization budgets, which is
     *         <code>100</code>.
     */

    public Spend getBudgetLimit() {
        return this.budgetLimit;
    }

    /**
     * <p>
     * The total amount of cost, usage, or RI utilization that you want to track with your budget.
     * </p>
     * <p>
     * <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI utilization budgets. RI
     * utilization budgets default to the only valid value for RI utilization budgets, which is <code>100</code>.
     * </p>
     * 
     * @param budgetLimit
     *        The total amount of cost, usage, or RI utilization that you want to track with your budget.</p>
     *        <p>
     *        <code>BudgetLimit</code> is required for cost or usage budgets, but optional for RI utilization budgets.
     *        RI utilization budgets default to the only valid value for RI utilization budgets, which is
     *        <code>100</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withBudgetLimit(Spend budgetLimit) {
        setBudgetLimit(budgetLimit);
        return this;
    }

    /**
     * <p>
     * The cost filters applied to a budget, such as service or region.
     * </p>
     * 
     * @return The cost filters applied to a budget, such as service or region.
     */

    public java.util.Map<String, java.util.List<String>> getCostFilters() {
        return costFilters;
    }

    /**
     * <p>
     * The cost filters applied to a budget, such as service or region.
     * </p>
     * 
     * @param costFilters
     *        The cost filters applied to a budget, such as service or region.
     */

    public void setCostFilters(java.util.Map<String, java.util.List<String>> costFilters) {
        this.costFilters = costFilters;
    }

    /**
     * <p>
     * The cost filters applied to a budget, such as service or region.
     * </p>
     * 
     * @param costFilters
     *        The cost filters applied to a budget, such as service or region.
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
     * <p>
     * The types of costs included in this budget.
     * </p>
     * 
     * @param costTypes
     *        The types of costs included in this budget.
     */

    public void setCostTypes(CostTypes costTypes) {
        this.costTypes = costTypes;
    }

    /**
     * <p>
     * The types of costs included in this budget.
     * </p>
     * 
     * @return The types of costs included in this budget.
     */

    public CostTypes getCostTypes() {
        return this.costTypes;
    }

    /**
     * <p>
     * The types of costs included in this budget.
     * </p>
     * 
     * @param costTypes
     *        The types of costs included in this budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withCostTypes(CostTypes costTypes) {
        setCostTypes(costTypes);
        return this;
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @param timeUnit
     *        The length of time until a budget resets the actual and forecasted spend.
     * @see TimeUnit
     */

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @return The length of time until a budget resets the actual and forecasted spend.
     * @see TimeUnit
     */

    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @param timeUnit
     *        The length of time until a budget resets the actual and forecasted spend.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Budget withTimeUnit(String timeUnit) {
        setTimeUnit(timeUnit);
        return this;
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @param timeUnit
     *        The length of time until a budget resets the actual and forecasted spend.
     * @see TimeUnit
     */

    public void setTimeUnit(TimeUnit timeUnit) {
        withTimeUnit(timeUnit);
    }

    /**
     * <p>
     * The length of time until a budget resets the actual and forecasted spend.
     * </p>
     * 
     * @param timeUnit
     *        The length of time until a budget resets the actual and forecasted spend.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Budget withTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit.toString();
        return this;
    }

    /**
     * <p>
     * The period of time covered by a budget. Has a start date and an end date. The start date must come before the end
     * date. There are no restrictions on the end date.
     * </p>
     * <p>
     * If you created your budget and didn't specify a start date, AWS defaults to the start of your chosen time period
     * (i.e. DAILY, MONTHLY, QUARTERLY, ANNUALLY). For example, if you created your budget on January 24th 2018, chose
     * <code>DAILY</code>, and didn't set a start date, AWS set your start date to <code>01/24/18 00:00 UTC</code>. If
     * you chose <code>MONTHLY</code>, AWS set your start date to <code>01/01/18 00:00 UTC</code>. If you didn't specify
     * an end date, AWS set your end date to <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS
     * Billing and Cost Management console and the API.
     * </p>
     * <p>
     * You can change either date with the <code>UpdateBudget</code> operation.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * </p>
     * 
     * @param timePeriod
     *        The period of time covered by a budget. Has a start date and an end date. The start date must come before
     *        the end date. There are no restrictions on the end date. </p>
     *        <p>
     *        If you created your budget and didn't specify a start date, AWS defaults to the start of your chosen time
     *        period (i.e. DAILY, MONTHLY, QUARTERLY, ANNUALLY). For example, if you created your budget on January 24th
     *        2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     *        <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     *        <code>01/01/18 00:00 UTC</code>. If you didn't specify an end date, AWS set your end date to
     *        <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console
     *        and the API.
     *        </p>
     *        <p>
     *        You can change either date with the <code>UpdateBudget</code> operation.
     *        </p>
     *        <p>
     *        After the end date, AWS deletes the budget and all associated notifications and subscribers.
     */

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period of time covered by a budget. Has a start date and an end date. The start date must come before the end
     * date. There are no restrictions on the end date.
     * </p>
     * <p>
     * If you created your budget and didn't specify a start date, AWS defaults to the start of your chosen time period
     * (i.e. DAILY, MONTHLY, QUARTERLY, ANNUALLY). For example, if you created your budget on January 24th 2018, chose
     * <code>DAILY</code>, and didn't set a start date, AWS set your start date to <code>01/24/18 00:00 UTC</code>. If
     * you chose <code>MONTHLY</code>, AWS set your start date to <code>01/01/18 00:00 UTC</code>. If you didn't specify
     * an end date, AWS set your end date to <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS
     * Billing and Cost Management console and the API.
     * </p>
     * <p>
     * You can change either date with the <code>UpdateBudget</code> operation.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * </p>
     * 
     * @return The period of time covered by a budget. Has a start date and an end date. The start date must come before
     *         the end date. There are no restrictions on the end date. </p>
     *         <p>
     *         If you created your budget and didn't specify a start date, AWS defaults to the start of your chosen time
     *         period (i.e. DAILY, MONTHLY, QUARTERLY, ANNUALLY). For example, if you created your budget on January
     *         24th 2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     *         <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     *         <code>01/01/18 00:00 UTC</code>. If you didn't specify an end date, AWS set your end date to
     *         <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management
     *         console and the API.
     *         </p>
     *         <p>
     *         You can change either date with the <code>UpdateBudget</code> operation.
     *         </p>
     *         <p>
     *         After the end date, AWS deletes the budget and all associated notifications and subscribers.
     */

    public TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The period of time covered by a budget. Has a start date and an end date. The start date must come before the end
     * date. There are no restrictions on the end date.
     * </p>
     * <p>
     * If you created your budget and didn't specify a start date, AWS defaults to the start of your chosen time period
     * (i.e. DAILY, MONTHLY, QUARTERLY, ANNUALLY). For example, if you created your budget on January 24th 2018, chose
     * <code>DAILY</code>, and didn't set a start date, AWS set your start date to <code>01/24/18 00:00 UTC</code>. If
     * you chose <code>MONTHLY</code>, AWS set your start date to <code>01/01/18 00:00 UTC</code>. If you didn't specify
     * an end date, AWS set your end date to <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS
     * Billing and Cost Management console and the API.
     * </p>
     * <p>
     * You can change either date with the <code>UpdateBudget</code> operation.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * </p>
     * 
     * @param timePeriod
     *        The period of time covered by a budget. Has a start date and an end date. The start date must come before
     *        the end date. There are no restrictions on the end date. </p>
     *        <p>
     *        If you created your budget and didn't specify a start date, AWS defaults to the start of your chosen time
     *        period (i.e. DAILY, MONTHLY, QUARTERLY, ANNUALLY). For example, if you created your budget on January 24th
     *        2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     *        <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     *        <code>01/01/18 00:00 UTC</code>. If you didn't specify an end date, AWS set your end date to
     *        <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console
     *        and the API.
     *        </p>
     *        <p>
     *        You can change either date with the <code>UpdateBudget</code> operation.
     *        </p>
     *        <p>
     *        After the end date, AWS deletes the budget and all associated notifications and subscribers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withTimePeriod(TimePeriod timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * The actual and forecasted cost or usage being tracked by a budget.
     * </p>
     * 
     * @param calculatedSpend
     *        The actual and forecasted cost or usage being tracked by a budget.
     */

    public void setCalculatedSpend(CalculatedSpend calculatedSpend) {
        this.calculatedSpend = calculatedSpend;
    }

    /**
     * <p>
     * The actual and forecasted cost or usage being tracked by a budget.
     * </p>
     * 
     * @return The actual and forecasted cost or usage being tracked by a budget.
     */

    public CalculatedSpend getCalculatedSpend() {
        return this.calculatedSpend;
    }

    /**
     * <p>
     * The actual and forecasted cost or usage being tracked by a budget.
     * </p>
     * 
     * @param calculatedSpend
     *        The actual and forecasted cost or usage being tracked by a budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Budget withCalculatedSpend(CalculatedSpend calculatedSpend) {
        setCalculatedSpend(calculatedSpend);
        return this;
    }

    /**
     * <p>
     * Whether this budget tracks monetary costs, usage, or RI utilization.
     * </p>
     * 
     * @param budgetType
     *        Whether this budget tracks monetary costs, usage, or RI utilization.
     * @see BudgetType
     */

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    /**
     * <p>
     * Whether this budget tracks monetary costs, usage, or RI utilization.
     * </p>
     * 
     * @return Whether this budget tracks monetary costs, usage, or RI utilization.
     * @see BudgetType
     */

    public String getBudgetType() {
        return this.budgetType;
    }

    /**
     * <p>
     * Whether this budget tracks monetary costs, usage, or RI utilization.
     * </p>
     * 
     * @param budgetType
     *        Whether this budget tracks monetary costs, usage, or RI utilization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetType
     */

    public Budget withBudgetType(String budgetType) {
        setBudgetType(budgetType);
        return this;
    }

    /**
     * <p>
     * Whether this budget tracks monetary costs, usage, or RI utilization.
     * </p>
     * 
     * @param budgetType
     *        Whether this budget tracks monetary costs, usage, or RI utilization.
     * @see BudgetType
     */

    public void setBudgetType(BudgetType budgetType) {
        withBudgetType(budgetType);
    }

    /**
     * <p>
     * Whether this budget tracks monetary costs, usage, or RI utilization.
     * </p>
     * 
     * @param budgetType
     *        Whether this budget tracks monetary costs, usage, or RI utilization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetType
     */

    public Budget withBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType.toString();
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
            sb.append("BudgetName: ").append(getBudgetName()).append(",");
        if (getBudgetLimit() != null)
            sb.append("BudgetLimit: ").append(getBudgetLimit()).append(",");
        if (getCostFilters() != null)
            sb.append("CostFilters: ").append(getCostFilters()).append(",");
        if (getCostTypes() != null)
            sb.append("CostTypes: ").append(getCostTypes()).append(",");
        if (getTimeUnit() != null)
            sb.append("TimeUnit: ").append(getTimeUnit()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getCalculatedSpend() != null)
            sb.append("CalculatedSpend: ").append(getCalculatedSpend()).append(",");
        if (getBudgetType() != null)
            sb.append("BudgetType: ").append(getBudgetType());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.BudgetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

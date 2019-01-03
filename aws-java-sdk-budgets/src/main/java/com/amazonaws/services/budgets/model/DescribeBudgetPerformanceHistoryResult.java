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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBudgetPerformanceHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The history of how often the budget has gone into an <code>ALARM</code> state.
     * </p>
     * <p>
     * For <code>DAILY</code> budgets, the history saves the state of the budget for the last 60 days. For
     * <code>MONTHLY</code> budgets, the history saves the state of the budget for the current month plus the last 12
     * months. For <code>QUARTERLY</code> budgets, the history saves the state of the budget for the last four quarters.
     * </p>
     */
    private BudgetPerformanceHistory budgetPerformanceHistory;

    private String nextToken;

    /**
     * <p>
     * The history of how often the budget has gone into an <code>ALARM</code> state.
     * </p>
     * <p>
     * For <code>DAILY</code> budgets, the history saves the state of the budget for the last 60 days. For
     * <code>MONTHLY</code> budgets, the history saves the state of the budget for the current month plus the last 12
     * months. For <code>QUARTERLY</code> budgets, the history saves the state of the budget for the last four quarters.
     * </p>
     * 
     * @param budgetPerformanceHistory
     *        The history of how often the budget has gone into an <code>ALARM</code> state.</p>
     *        <p>
     *        For <code>DAILY</code> budgets, the history saves the state of the budget for the last 60 days. For
     *        <code>MONTHLY</code> budgets, the history saves the state of the budget for the current month plus the
     *        last 12 months. For <code>QUARTERLY</code> budgets, the history saves the state of the budget for the last
     *        four quarters.
     */

    public void setBudgetPerformanceHistory(BudgetPerformanceHistory budgetPerformanceHistory) {
        this.budgetPerformanceHistory = budgetPerformanceHistory;
    }

    /**
     * <p>
     * The history of how often the budget has gone into an <code>ALARM</code> state.
     * </p>
     * <p>
     * For <code>DAILY</code> budgets, the history saves the state of the budget for the last 60 days. For
     * <code>MONTHLY</code> budgets, the history saves the state of the budget for the current month plus the last 12
     * months. For <code>QUARTERLY</code> budgets, the history saves the state of the budget for the last four quarters.
     * </p>
     * 
     * @return The history of how often the budget has gone into an <code>ALARM</code> state.</p>
     *         <p>
     *         For <code>DAILY</code> budgets, the history saves the state of the budget for the last 60 days. For
     *         <code>MONTHLY</code> budgets, the history saves the state of the budget for the current month plus the
     *         last 12 months. For <code>QUARTERLY</code> budgets, the history saves the state of the budget for the
     *         last four quarters.
     */

    public BudgetPerformanceHistory getBudgetPerformanceHistory() {
        return this.budgetPerformanceHistory;
    }

    /**
     * <p>
     * The history of how often the budget has gone into an <code>ALARM</code> state.
     * </p>
     * <p>
     * For <code>DAILY</code> budgets, the history saves the state of the budget for the last 60 days. For
     * <code>MONTHLY</code> budgets, the history saves the state of the budget for the current month plus the last 12
     * months. For <code>QUARTERLY</code> budgets, the history saves the state of the budget for the last four quarters.
     * </p>
     * 
     * @param budgetPerformanceHistory
     *        The history of how often the budget has gone into an <code>ALARM</code> state.</p>
     *        <p>
     *        For <code>DAILY</code> budgets, the history saves the state of the budget for the last 60 days. For
     *        <code>MONTHLY</code> budgets, the history saves the state of the budget for the current month plus the
     *        last 12 months. For <code>QUARTERLY</code> budgets, the history saves the state of the budget for the last
     *        four quarters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetPerformanceHistoryResult withBudgetPerformanceHistory(BudgetPerformanceHistory budgetPerformanceHistory) {
        setBudgetPerformanceHistory(budgetPerformanceHistory);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetPerformanceHistoryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getBudgetPerformanceHistory() != null)
            sb.append("BudgetPerformanceHistory: ").append(getBudgetPerformanceHistory()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBudgetPerformanceHistoryResult == false)
            return false;
        DescribeBudgetPerformanceHistoryResult other = (DescribeBudgetPerformanceHistoryResult) obj;
        if (other.getBudgetPerformanceHistory() == null ^ this.getBudgetPerformanceHistory() == null)
            return false;
        if (other.getBudgetPerformanceHistory() != null && other.getBudgetPerformanceHistory().equals(this.getBudgetPerformanceHistory()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBudgetPerformanceHistory() == null) ? 0 : getBudgetPerformanceHistory().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBudgetPerformanceHistoryResult clone() {
        try {
            return (DescribeBudgetPerformanceHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

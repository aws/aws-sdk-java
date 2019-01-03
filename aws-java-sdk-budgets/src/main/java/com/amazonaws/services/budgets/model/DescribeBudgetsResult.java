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

/**
 * <p>
 * Response of DescribeBudgets
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBudgetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of budgets.
     * </p>
     */
    private java.util.List<Budget> budgets;
    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of budgets.
     * </p>
     * 
     * @return A list of budgets.
     */

    public java.util.List<Budget> getBudgets() {
        return budgets;
    }

    /**
     * <p>
     * A list of budgets.
     * </p>
     * 
     * @param budgets
     *        A list of budgets.
     */

    public void setBudgets(java.util.Collection<Budget> budgets) {
        if (budgets == null) {
            this.budgets = null;
            return;
        }

        this.budgets = new java.util.ArrayList<Budget>(budgets);
    }

    /**
     * <p>
     * A list of budgets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBudgets(java.util.Collection)} or {@link #withBudgets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param budgets
     *        A list of budgets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetsResult withBudgets(Budget... budgets) {
        if (this.budgets == null) {
            setBudgets(new java.util.ArrayList<Budget>(budgets.length));
        }
        for (Budget ele : budgets) {
            this.budgets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of budgets.
     * </p>
     * 
     * @param budgets
     *        A list of budgets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetsResult withBudgets(java.util.Collection<Budget> budgets) {
        setBudgets(budgets);
        return this;
    }

    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token in the service response that indicates the next set of results that you can retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     * 
     * @return The pagination token in the service response that indicates the next set of results that you can
     *         retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token in the service response that indicates the next set of results that you can retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetsResult withNextToken(String nextToken) {
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
        if (getBudgets() != null)
            sb.append("Budgets: ").append(getBudgets()).append(",");
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

        if (obj instanceof DescribeBudgetsResult == false)
            return false;
        DescribeBudgetsResult other = (DescribeBudgetsResult) obj;
        if (other.getBudgets() == null ^ this.getBudgets() == null)
            return false;
        if (other.getBudgets() != null && other.getBudgets().equals(this.getBudgets()) == false)
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

        hashCode = prime * hashCode + ((getBudgets() == null) ? 0 : getBudgets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBudgetsResult clone() {
        try {
            return (DescribeBudgetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

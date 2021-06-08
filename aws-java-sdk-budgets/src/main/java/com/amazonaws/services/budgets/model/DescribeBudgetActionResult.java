/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DescribeBudgetActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String accountId;

    private String budgetName;
    /**
     * <p>
     * A budget action resource.
     * </p>
     */
    private Action action;

    /**
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetActionResult withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

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

    public DescribeBudgetActionResult withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * A budget action resource.
     * </p>
     * 
     * @param action
     *        A budget action resource.
     */

    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * <p>
     * A budget action resource.
     * </p>
     * 
     * @return A budget action resource.
     */

    public Action getAction() {
        return this.action;
    }

    /**
     * <p>
     * A budget action resource.
     * </p>
     * 
     * @param action
     *        A budget action resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetActionResult withAction(Action action) {
        setAction(action);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBudgetName() != null)
            sb.append("BudgetName: ").append(getBudgetName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBudgetActionResult == false)
            return false;
        DescribeBudgetActionResult other = (DescribeBudgetActionResult) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBudgetActionResult clone() {
        try {
            return (DescribeBudgetActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

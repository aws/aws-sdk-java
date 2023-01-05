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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBudgetNotificationsForAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of budget names and associated notifications for an account.
     * </p>
     */
    private java.util.List<BudgetNotificationsForAccount> budgetNotificationsForAccount;

    private String nextToken;

    /**
     * <p>
     * A list of budget names and associated notifications for an account.
     * </p>
     * 
     * @return A list of budget names and associated notifications for an account.
     */

    public java.util.List<BudgetNotificationsForAccount> getBudgetNotificationsForAccount() {
        return budgetNotificationsForAccount;
    }

    /**
     * <p>
     * A list of budget names and associated notifications for an account.
     * </p>
     * 
     * @param budgetNotificationsForAccount
     *        A list of budget names and associated notifications for an account.
     */

    public void setBudgetNotificationsForAccount(java.util.Collection<BudgetNotificationsForAccount> budgetNotificationsForAccount) {
        if (budgetNotificationsForAccount == null) {
            this.budgetNotificationsForAccount = null;
            return;
        }

        this.budgetNotificationsForAccount = new java.util.ArrayList<BudgetNotificationsForAccount>(budgetNotificationsForAccount);
    }

    /**
     * <p>
     * A list of budget names and associated notifications for an account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBudgetNotificationsForAccount(java.util.Collection)} or
     * {@link #withBudgetNotificationsForAccount(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param budgetNotificationsForAccount
     *        A list of budget names and associated notifications for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetNotificationsForAccountResult withBudgetNotificationsForAccount(BudgetNotificationsForAccount... budgetNotificationsForAccount) {
        if (this.budgetNotificationsForAccount == null) {
            setBudgetNotificationsForAccount(new java.util.ArrayList<BudgetNotificationsForAccount>(budgetNotificationsForAccount.length));
        }
        for (BudgetNotificationsForAccount ele : budgetNotificationsForAccount) {
            this.budgetNotificationsForAccount.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of budget names and associated notifications for an account.
     * </p>
     * 
     * @param budgetNotificationsForAccount
     *        A list of budget names and associated notifications for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetNotificationsForAccountResult withBudgetNotificationsForAccount(
            java.util.Collection<BudgetNotificationsForAccount> budgetNotificationsForAccount) {
        setBudgetNotificationsForAccount(budgetNotificationsForAccount);
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

    public DescribeBudgetNotificationsForAccountResult withNextToken(String nextToken) {
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
        if (getBudgetNotificationsForAccount() != null)
            sb.append("BudgetNotificationsForAccount: ").append(getBudgetNotificationsForAccount()).append(",");
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

        if (obj instanceof DescribeBudgetNotificationsForAccountResult == false)
            return false;
        DescribeBudgetNotificationsForAccountResult other = (DescribeBudgetNotificationsForAccountResult) obj;
        if (other.getBudgetNotificationsForAccount() == null ^ this.getBudgetNotificationsForAccount() == null)
            return false;
        if (other.getBudgetNotificationsForAccount() != null
                && other.getBudgetNotificationsForAccount().equals(this.getBudgetNotificationsForAccount()) == false)
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

        hashCode = prime * hashCode + ((getBudgetNotificationsForAccount() == null) ? 0 : getBudgetNotificationsForAccount().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBudgetNotificationsForAccountResult clone() {
        try {
            return (DescribeBudgetNotificationsForAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

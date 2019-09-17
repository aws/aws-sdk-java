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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request of DeleteBudget
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBudgetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to delete.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the budget that you want to delete.
     * </p>
     */
    private String budgetName;

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to delete.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget that you want to delete.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to delete.
     * </p>
     * 
     * @return The <code>accountId</code> that is associated with the budget that you want to delete.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to delete.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBudgetRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the budget that you want to delete.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget that you want to delete.
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of the budget that you want to delete.
     * </p>
     * 
     * @return The name of the budget that you want to delete.
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * <p>
     * The name of the budget that you want to delete.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBudgetRequest withBudgetName(String budgetName) {
        setBudgetName(budgetName);
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
            sb.append("BudgetName: ").append(getBudgetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBudgetRequest == false)
            return false;
        DeleteBudgetRequest other = (DeleteBudgetRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBudgetRequest clone() {
        return (DeleteBudgetRequest) super.clone();
    }

}

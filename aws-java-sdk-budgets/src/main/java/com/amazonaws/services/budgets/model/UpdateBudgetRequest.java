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
 * Request of UpdateBudget
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBudgetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to update.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The budget that you want to update your budget to.
     * </p>
     */
    private Budget newBudget;

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to update.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget that you want to update.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to update.
     * </p>
     * 
     * @return The <code>accountId</code> that is associated with the budget that you want to update.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to update.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The budget that you want to update your budget to.
     * </p>
     * 
     * @param newBudget
     *        The budget that you want to update your budget to.
     */

    public void setNewBudget(Budget newBudget) {
        this.newBudget = newBudget;
    }

    /**
     * <p>
     * The budget that you want to update your budget to.
     * </p>
     * 
     * @return The budget that you want to update your budget to.
     */

    public Budget getNewBudget() {
        return this.newBudget;
    }

    /**
     * <p>
     * The budget that you want to update your budget to.
     * </p>
     * 
     * @param newBudget
     *        The budget that you want to update your budget to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withNewBudget(Budget newBudget) {
        setNewBudget(newBudget);
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
        if (getNewBudget() != null)
            sb.append("NewBudget: ").append(getNewBudget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBudgetRequest == false)
            return false;
        UpdateBudgetRequest other = (UpdateBudgetRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getNewBudget() == null ^ this.getNewBudget() == null)
            return false;
        if (other.getNewBudget() != null && other.getNewBudget().equals(this.getNewBudget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getNewBudget() == null) ? 0 : getNewBudget().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBudgetRequest clone() {
        return (UpdateBudgetRequest) super.clone();
    }

}

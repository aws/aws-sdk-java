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
public class UpdateBudgetActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String accountId;

    private String budgetName;
    /**
     * <p>
     * The previous action resource information.
     * </p>
     */
    private Action oldAction;
    /**
     * <p>
     * The updated action resource information.
     * </p>
     */
    private Action newAction;

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

    public UpdateBudgetActionResult withAccountId(String accountId) {
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

    public UpdateBudgetActionResult withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * The previous action resource information.
     * </p>
     * 
     * @param oldAction
     *        The previous action resource information.
     */

    public void setOldAction(Action oldAction) {
        this.oldAction = oldAction;
    }

    /**
     * <p>
     * The previous action resource information.
     * </p>
     * 
     * @return The previous action resource information.
     */

    public Action getOldAction() {
        return this.oldAction;
    }

    /**
     * <p>
     * The previous action resource information.
     * </p>
     * 
     * @param oldAction
     *        The previous action resource information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetActionResult withOldAction(Action oldAction) {
        setOldAction(oldAction);
        return this;
    }

    /**
     * <p>
     * The updated action resource information.
     * </p>
     * 
     * @param newAction
     *        The updated action resource information.
     */

    public void setNewAction(Action newAction) {
        this.newAction = newAction;
    }

    /**
     * <p>
     * The updated action resource information.
     * </p>
     * 
     * @return The updated action resource information.
     */

    public Action getNewAction() {
        return this.newAction;
    }

    /**
     * <p>
     * The updated action resource information.
     * </p>
     * 
     * @param newAction
     *        The updated action resource information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetActionResult withNewAction(Action newAction) {
        setNewAction(newAction);
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
        if (getOldAction() != null)
            sb.append("OldAction: ").append(getOldAction()).append(",");
        if (getNewAction() != null)
            sb.append("NewAction: ").append(getNewAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBudgetActionResult == false)
            return false;
        UpdateBudgetActionResult other = (UpdateBudgetActionResult) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getOldAction() == null ^ this.getOldAction() == null)
            return false;
        if (other.getOldAction() != null && other.getOldAction().equals(this.getOldAction()) == false)
            return false;
        if (other.getNewAction() == null ^ this.getNewAction() == null)
            return false;
        if (other.getNewAction() != null && other.getNewAction().equals(this.getNewAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getOldAction() == null) ? 0 : getOldAction().hashCode());
        hashCode = prime * hashCode + ((getNewAction() == null) ? 0 : getNewAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBudgetActionResult clone() {
        try {
            return (UpdateBudgetActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
public class ExecuteBudgetActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String accountId;

    private String budgetName;
    /**
     * <p>
     * A system-generated universally unique identifier (UUID) for the action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The type of execution.
     * </p>
     */
    private String executionType;

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

    public ExecuteBudgetActionResult withAccountId(String accountId) {
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

    public ExecuteBudgetActionResult withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * A system-generated universally unique identifier (UUID) for the action.
     * </p>
     * 
     * @param actionId
     *        A system-generated universally unique identifier (UUID) for the action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * A system-generated universally unique identifier (UUID) for the action.
     * </p>
     * 
     * @return A system-generated universally unique identifier (UUID) for the action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * A system-generated universally unique identifier (UUID) for the action.
     * </p>
     * 
     * @param actionId
     *        A system-generated universally unique identifier (UUID) for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteBudgetActionResult withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The type of execution.
     * </p>
     * 
     * @param executionType
     *        The type of execution.
     * @see ExecutionType
     */

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    /**
     * <p>
     * The type of execution.
     * </p>
     * 
     * @return The type of execution.
     * @see ExecutionType
     */

    public String getExecutionType() {
        return this.executionType;
    }

    /**
     * <p>
     * The type of execution.
     * </p>
     * 
     * @param executionType
     *        The type of execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionType
     */

    public ExecuteBudgetActionResult withExecutionType(String executionType) {
        setExecutionType(executionType);
        return this;
    }

    /**
     * <p>
     * The type of execution.
     * </p>
     * 
     * @param executionType
     *        The type of execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionType
     */

    public ExecuteBudgetActionResult withExecutionType(ExecutionType executionType) {
        this.executionType = executionType.toString();
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getExecutionType() != null)
            sb.append("ExecutionType: ").append(getExecutionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteBudgetActionResult == false)
            return false;
        ExecuteBudgetActionResult other = (ExecuteBudgetActionResult) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getExecutionType() == null ^ this.getExecutionType() == null)
            return false;
        if (other.getExecutionType() != null && other.getExecutionType().equals(this.getExecutionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getExecutionType() == null) ? 0 : getExecutionType().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteBudgetActionResult clone() {
        try {
            return (ExecuteBudgetActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

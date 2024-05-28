/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateBudget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBudgetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The budget actions to add. Budget actions specify what happens when the budget runs out.
     * </p>
     */
    private java.util.List<BudgetActionToAdd> actionsToAdd;
    /**
     * <p>
     * The budget actions to remove from the budget.
     * </p>
     */
    private java.util.List<BudgetActionToRemove> actionsToRemove;
    /**
     * <p>
     * The dollar limit to update on the budget. Based on consumed usage.
     * </p>
     */
    private Float approximateDollarLimit;
    /**
     * <p>
     * The budget ID to update.
     * </p>
     */
    private String budgetId;
    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description of the budget to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the budget to update.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID of the budget to update.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The schedule to update.
     * </p>
     */
    private BudgetSchedule schedule;
    /**
     * <p>
     * Updates the status of the budget.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The budget is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>–The budget is inactive. This can include Expired, Canceled, or deleted Deleted statuses.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The budget actions to add. Budget actions specify what happens when the budget runs out.
     * </p>
     * 
     * @return The budget actions to add. Budget actions specify what happens when the budget runs out.
     */

    public java.util.List<BudgetActionToAdd> getActionsToAdd() {
        return actionsToAdd;
    }

    /**
     * <p>
     * The budget actions to add. Budget actions specify what happens when the budget runs out.
     * </p>
     * 
     * @param actionsToAdd
     *        The budget actions to add. Budget actions specify what happens when the budget runs out.
     */

    public void setActionsToAdd(java.util.Collection<BudgetActionToAdd> actionsToAdd) {
        if (actionsToAdd == null) {
            this.actionsToAdd = null;
            return;
        }

        this.actionsToAdd = new java.util.ArrayList<BudgetActionToAdd>(actionsToAdd);
    }

    /**
     * <p>
     * The budget actions to add. Budget actions specify what happens when the budget runs out.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionsToAdd(java.util.Collection)} or {@link #withActionsToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param actionsToAdd
     *        The budget actions to add. Budget actions specify what happens when the budget runs out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withActionsToAdd(BudgetActionToAdd... actionsToAdd) {
        if (this.actionsToAdd == null) {
            setActionsToAdd(new java.util.ArrayList<BudgetActionToAdd>(actionsToAdd.length));
        }
        for (BudgetActionToAdd ele : actionsToAdd) {
            this.actionsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The budget actions to add. Budget actions specify what happens when the budget runs out.
     * </p>
     * 
     * @param actionsToAdd
     *        The budget actions to add. Budget actions specify what happens when the budget runs out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withActionsToAdd(java.util.Collection<BudgetActionToAdd> actionsToAdd) {
        setActionsToAdd(actionsToAdd);
        return this;
    }

    /**
     * <p>
     * The budget actions to remove from the budget.
     * </p>
     * 
     * @return The budget actions to remove from the budget.
     */

    public java.util.List<BudgetActionToRemove> getActionsToRemove() {
        return actionsToRemove;
    }

    /**
     * <p>
     * The budget actions to remove from the budget.
     * </p>
     * 
     * @param actionsToRemove
     *        The budget actions to remove from the budget.
     */

    public void setActionsToRemove(java.util.Collection<BudgetActionToRemove> actionsToRemove) {
        if (actionsToRemove == null) {
            this.actionsToRemove = null;
            return;
        }

        this.actionsToRemove = new java.util.ArrayList<BudgetActionToRemove>(actionsToRemove);
    }

    /**
     * <p>
     * The budget actions to remove from the budget.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionsToRemove(java.util.Collection)} or {@link #withActionsToRemove(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param actionsToRemove
     *        The budget actions to remove from the budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withActionsToRemove(BudgetActionToRemove... actionsToRemove) {
        if (this.actionsToRemove == null) {
            setActionsToRemove(new java.util.ArrayList<BudgetActionToRemove>(actionsToRemove.length));
        }
        for (BudgetActionToRemove ele : actionsToRemove) {
            this.actionsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The budget actions to remove from the budget.
     * </p>
     * 
     * @param actionsToRemove
     *        The budget actions to remove from the budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withActionsToRemove(java.util.Collection<BudgetActionToRemove> actionsToRemove) {
        setActionsToRemove(actionsToRemove);
        return this;
    }

    /**
     * <p>
     * The dollar limit to update on the budget. Based on consumed usage.
     * </p>
     * 
     * @param approximateDollarLimit
     *        The dollar limit to update on the budget. Based on consumed usage.
     */

    public void setApproximateDollarLimit(Float approximateDollarLimit) {
        this.approximateDollarLimit = approximateDollarLimit;
    }

    /**
     * <p>
     * The dollar limit to update on the budget. Based on consumed usage.
     * </p>
     * 
     * @return The dollar limit to update on the budget. Based on consumed usage.
     */

    public Float getApproximateDollarLimit() {
        return this.approximateDollarLimit;
    }

    /**
     * <p>
     * The dollar limit to update on the budget. Based on consumed usage.
     * </p>
     * 
     * @param approximateDollarLimit
     *        The dollar limit to update on the budget. Based on consumed usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withApproximateDollarLimit(Float approximateDollarLimit) {
        setApproximateDollarLimit(approximateDollarLimit);
        return this;
    }

    /**
     * <p>
     * The budget ID to update.
     * </p>
     * 
     * @param budgetId
     *        The budget ID to update.
     */

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    /**
     * <p>
     * The budget ID to update.
     * </p>
     * 
     * @return The budget ID to update.
     */

    public String getBudgetId() {
        return this.budgetId;
    }

    /**
     * <p>
     * The budget ID to update.
     * </p>
     * 
     * @param budgetId
     *        The budget ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withBudgetId(String budgetId) {
        setBudgetId(budgetId);
        return this;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description of the budget to update.
     * </p>
     * 
     * @param description
     *        The description of the budget to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the budget to update.
     * </p>
     * 
     * @return The description of the budget to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the budget to update.
     * </p>
     * 
     * @param description
     *        The description of the budget to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the budget to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the budget to update.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the budget to update.
     * </p>
     * 
     * @return The display name of the budget to update.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the budget to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the budget to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID of the budget to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the budget to update.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the budget to update.
     * </p>
     * 
     * @return The farm ID of the budget to update.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the budget to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the budget to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The schedule to update.
     * </p>
     * 
     * @param schedule
     *        The schedule to update.
     */

    public void setSchedule(BudgetSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule to update.
     * </p>
     * 
     * @return The schedule to update.
     */

    public BudgetSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule to update.
     * </p>
     * 
     * @param schedule
     *        The schedule to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withSchedule(BudgetSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * Updates the status of the budget.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The budget is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>–The budget is inactive. This can include Expired, Canceled, or deleted Deleted statuses.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Updates the status of the budget.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>–The budget is being evaluated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code>–The budget is inactive. This can include Expired, Canceled, or deleted Deleted
     *        statuses.
     *        </p>
     *        </li>
     * @see BudgetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Updates the status of the budget.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The budget is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>–The budget is inactive. This can include Expired, Canceled, or deleted Deleted statuses.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Updates the status of the budget.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>–The budget is being evaluated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVE</code>–The budget is inactive. This can include Expired, Canceled, or deleted Deleted
     *         statuses.
     *         </p>
     *         </li>
     * @see BudgetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Updates the status of the budget.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The budget is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>–The budget is inactive. This can include Expired, Canceled, or deleted Deleted statuses.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Updates the status of the budget.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>–The budget is being evaluated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code>–The budget is inactive. This can include Expired, Canceled, or deleted Deleted
     *        statuses.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetStatus
     */

    public UpdateBudgetRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Updates the status of the budget.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The budget is being evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>–The budget is inactive. This can include Expired, Canceled, or deleted Deleted statuses.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Updates the status of the budget.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>–The budget is being evaluated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code>–The budget is inactive. This can include Expired, Canceled, or deleted Deleted
     *        statuses.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetStatus
     */

    public UpdateBudgetRequest withStatus(BudgetStatus status) {
        this.status = status.toString();
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
        if (getActionsToAdd() != null)
            sb.append("ActionsToAdd: ").append(getActionsToAdd()).append(",");
        if (getActionsToRemove() != null)
            sb.append("ActionsToRemove: ").append(getActionsToRemove()).append(",");
        if (getApproximateDollarLimit() != null)
            sb.append("ApproximateDollarLimit: ").append(getApproximateDollarLimit()).append(",");
        if (getBudgetId() != null)
            sb.append("BudgetId: ").append(getBudgetId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
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
        if (other.getActionsToAdd() == null ^ this.getActionsToAdd() == null)
            return false;
        if (other.getActionsToAdd() != null && other.getActionsToAdd().equals(this.getActionsToAdd()) == false)
            return false;
        if (other.getActionsToRemove() == null ^ this.getActionsToRemove() == null)
            return false;
        if (other.getActionsToRemove() != null && other.getActionsToRemove().equals(this.getActionsToRemove()) == false)
            return false;
        if (other.getApproximateDollarLimit() == null ^ this.getApproximateDollarLimit() == null)
            return false;
        if (other.getApproximateDollarLimit() != null && other.getApproximateDollarLimit().equals(this.getApproximateDollarLimit()) == false)
            return false;
        if (other.getBudgetId() == null ^ this.getBudgetId() == null)
            return false;
        if (other.getBudgetId() != null && other.getBudgetId().equals(this.getBudgetId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionsToAdd() == null) ? 0 : getActionsToAdd().hashCode());
        hashCode = prime * hashCode + ((getActionsToRemove() == null) ? 0 : getActionsToRemove().hashCode());
        hashCode = prime * hashCode + ((getApproximateDollarLimit() == null) ? 0 : getApproximateDollarLimit().hashCode());
        hashCode = prime * hashCode + ((getBudgetId() == null) ? 0 : getBudgetId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBudgetRequest clone() {
        return (UpdateBudgetRequest) super.clone();
    }

}

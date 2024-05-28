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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The budget summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/BudgetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BudgetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The approximate dollar limit of the budget.
     * </p>
     */
    private Float approximateDollarLimit;
    /**
     * <p>
     * The budget ID.
     * </p>
     */
    private String budgetId;
    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description of the budget summary.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the budget summary to update.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The status of the budget.
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
     * The date and time the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     */
    private String updatedBy;
    /**
     * <p>
     * The resource used to track expenditure in the budget.
     * </p>
     */
    private UsageTrackingResource usageTrackingResource;
    /**
     * <p>
     * The consumed usage for the budget.
     * </p>
     */
    private ConsumedUsages usages;

    /**
     * <p>
     * The approximate dollar limit of the budget.
     * </p>
     * 
     * @param approximateDollarLimit
     *        The approximate dollar limit of the budget.
     */

    public void setApproximateDollarLimit(Float approximateDollarLimit) {
        this.approximateDollarLimit = approximateDollarLimit;
    }

    /**
     * <p>
     * The approximate dollar limit of the budget.
     * </p>
     * 
     * @return The approximate dollar limit of the budget.
     */

    public Float getApproximateDollarLimit() {
        return this.approximateDollarLimit;
    }

    /**
     * <p>
     * The approximate dollar limit of the budget.
     * </p>
     * 
     * @param approximateDollarLimit
     *        The approximate dollar limit of the budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withApproximateDollarLimit(Float approximateDollarLimit) {
        setApproximateDollarLimit(approximateDollarLimit);
        return this;
    }

    /**
     * <p>
     * The budget ID.
     * </p>
     * 
     * @param budgetId
     *        The budget ID.
     */

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    /**
     * <p>
     * The budget ID.
     * </p>
     * 
     * @return The budget ID.
     */

    public String getBudgetId() {
        return this.budgetId;
    }

    /**
     * <p>
     * The budget ID.
     * </p>
     * 
     * @param budgetId
     *        The budget ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withBudgetId(String budgetId) {
        setBudgetId(budgetId);
        return this;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @return The date and time the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @return The user or system that created this resource.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of the budget summary.
     * </p>
     * 
     * @param description
     *        The description of the budget summary.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the budget summary.
     * </p>
     * 
     * @return The description of the budget summary.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the budget summary.
     * </p>
     * 
     * @param description
     *        The description of the budget summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the budget summary to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the budget summary to update.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the budget summary to update.
     * </p>
     * 
     * @return The display name of the budget summary to update.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the budget summary to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the budget summary to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The status of the budget.
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
     *        The status of the budget.</p>
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
     * The status of the budget.
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
     * @return The status of the budget.</p>
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
     * The status of the budget.
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
     *        The status of the budget.</p>
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

    public BudgetSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the budget.
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
     *        The status of the budget.</p>
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

    public BudgetSummary withStatus(BudgetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @return The date and time the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @return The user or system that updated this resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    /**
     * <p>
     * The resource used to track expenditure in the budget.
     * </p>
     * 
     * @param usageTrackingResource
     *        The resource used to track expenditure in the budget.
     */

    public void setUsageTrackingResource(UsageTrackingResource usageTrackingResource) {
        this.usageTrackingResource = usageTrackingResource;
    }

    /**
     * <p>
     * The resource used to track expenditure in the budget.
     * </p>
     * 
     * @return The resource used to track expenditure in the budget.
     */

    public UsageTrackingResource getUsageTrackingResource() {
        return this.usageTrackingResource;
    }

    /**
     * <p>
     * The resource used to track expenditure in the budget.
     * </p>
     * 
     * @param usageTrackingResource
     *        The resource used to track expenditure in the budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withUsageTrackingResource(UsageTrackingResource usageTrackingResource) {
        setUsageTrackingResource(usageTrackingResource);
        return this;
    }

    /**
     * <p>
     * The consumed usage for the budget.
     * </p>
     * 
     * @param usages
     *        The consumed usage for the budget.
     */

    public void setUsages(ConsumedUsages usages) {
        this.usages = usages;
    }

    /**
     * <p>
     * The consumed usage for the budget.
     * </p>
     * 
     * @return The consumed usage for the budget.
     */

    public ConsumedUsages getUsages() {
        return this.usages;
    }

    /**
     * <p>
     * The consumed usage for the budget.
     * </p>
     * 
     * @param usages
     *        The consumed usage for the budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetSummary withUsages(ConsumedUsages usages) {
        setUsages(usages);
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
        if (getApproximateDollarLimit() != null)
            sb.append("ApproximateDollarLimit: ").append(getApproximateDollarLimit()).append(",");
        if (getBudgetId() != null)
            sb.append("BudgetId: ").append(getBudgetId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy()).append(",");
        if (getUsageTrackingResource() != null)
            sb.append("UsageTrackingResource: ").append(getUsageTrackingResource()).append(",");
        if (getUsages() != null)
            sb.append("Usages: ").append(getUsages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BudgetSummary == false)
            return false;
        BudgetSummary other = (BudgetSummary) obj;
        if (other.getApproximateDollarLimit() == null ^ this.getApproximateDollarLimit() == null)
            return false;
        if (other.getApproximateDollarLimit() != null && other.getApproximateDollarLimit().equals(this.getApproximateDollarLimit()) == false)
            return false;
        if (other.getBudgetId() == null ^ this.getBudgetId() == null)
            return false;
        if (other.getBudgetId() != null && other.getBudgetId().equals(this.getBudgetId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        if (other.getUsageTrackingResource() == null ^ this.getUsageTrackingResource() == null)
            return false;
        if (other.getUsageTrackingResource() != null && other.getUsageTrackingResource().equals(this.getUsageTrackingResource()) == false)
            return false;
        if (other.getUsages() == null ^ this.getUsages() == null)
            return false;
        if (other.getUsages() != null && other.getUsages().equals(this.getUsages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApproximateDollarLimit() == null) ? 0 : getApproximateDollarLimit().hashCode());
        hashCode = prime * hashCode + ((getBudgetId() == null) ? 0 : getBudgetId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getUsageTrackingResource() == null) ? 0 : getUsageTrackingResource().hashCode());
        hashCode = prime * hashCode + ((getUsages() == null) ? 0 : getUsages().hashCode());
        return hashCode;
    }

    @Override
    public BudgetSummary clone() {
        try {
            return (BudgetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.BudgetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

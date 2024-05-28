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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateBudget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBudgetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The budget actions to specify what happens when the budget runs out.
     * </p>
     */
    private java.util.List<BudgetActionToAdd> actions;
    /**
     * <p>
     * The dollar limit based on consumed usage.
     * </p>
     */
    private Float approximateDollarLimit;
    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description of the budget.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the budget.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID to include in this budget.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The schedule to associate with this budget.
     * </p>
     */
    private BudgetSchedule schedule;
    /**
     * <p>
     * The queue ID provided to this budget to track usage.
     * </p>
     */
    private UsageTrackingResource usageTrackingResource;

    /**
     * <p>
     * The budget actions to specify what happens when the budget runs out.
     * </p>
     * 
     * @return The budget actions to specify what happens when the budget runs out.
     */

    public java.util.List<BudgetActionToAdd> getActions() {
        return actions;
    }

    /**
     * <p>
     * The budget actions to specify what happens when the budget runs out.
     * </p>
     * 
     * @param actions
     *        The budget actions to specify what happens when the budget runs out.
     */

    public void setActions(java.util.Collection<BudgetActionToAdd> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<BudgetActionToAdd>(actions);
    }

    /**
     * <p>
     * The budget actions to specify what happens when the budget runs out.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The budget actions to specify what happens when the budget runs out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withActions(BudgetActionToAdd... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<BudgetActionToAdd>(actions.length));
        }
        for (BudgetActionToAdd ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The budget actions to specify what happens when the budget runs out.
     * </p>
     * 
     * @param actions
     *        The budget actions to specify what happens when the budget runs out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withActions(java.util.Collection<BudgetActionToAdd> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The dollar limit based on consumed usage.
     * </p>
     * 
     * @param approximateDollarLimit
     *        The dollar limit based on consumed usage.
     */

    public void setApproximateDollarLimit(Float approximateDollarLimit) {
        this.approximateDollarLimit = approximateDollarLimit;
    }

    /**
     * <p>
     * The dollar limit based on consumed usage.
     * </p>
     * 
     * @return The dollar limit based on consumed usage.
     */

    public Float getApproximateDollarLimit() {
        return this.approximateDollarLimit;
    }

    /**
     * <p>
     * The dollar limit based on consumed usage.
     * </p>
     * 
     * @param approximateDollarLimit
     *        The dollar limit based on consumed usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withApproximateDollarLimit(Float approximateDollarLimit) {
        setApproximateDollarLimit(approximateDollarLimit);
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

    public CreateBudgetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description of the budget.
     * </p>
     * 
     * @param description
     *        The description of the budget.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the budget.
     * </p>
     * 
     * @return The description of the budget.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the budget.
     * </p>
     * 
     * @param description
     *        The description of the budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the budget.
     * </p>
     * 
     * @param displayName
     *        The display name of the budget.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the budget.
     * </p>
     * 
     * @return The display name of the budget.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the budget.
     * </p>
     * 
     * @param displayName
     *        The display name of the budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID to include in this budget.
     * </p>
     * 
     * @param farmId
     *        The farm ID to include in this budget.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID to include in this budget.
     * </p>
     * 
     * @return The farm ID to include in this budget.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID to include in this budget.
     * </p>
     * 
     * @param farmId
     *        The farm ID to include in this budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The schedule to associate with this budget.
     * </p>
     * 
     * @param schedule
     *        The schedule to associate with this budget.
     */

    public void setSchedule(BudgetSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule to associate with this budget.
     * </p>
     * 
     * @return The schedule to associate with this budget.
     */

    public BudgetSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule to associate with this budget.
     * </p>
     * 
     * @param schedule
     *        The schedule to associate with this budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withSchedule(BudgetSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The queue ID provided to this budget to track usage.
     * </p>
     * 
     * @param usageTrackingResource
     *        The queue ID provided to this budget to track usage.
     */

    public void setUsageTrackingResource(UsageTrackingResource usageTrackingResource) {
        this.usageTrackingResource = usageTrackingResource;
    }

    /**
     * <p>
     * The queue ID provided to this budget to track usage.
     * </p>
     * 
     * @return The queue ID provided to this budget to track usage.
     */

    public UsageTrackingResource getUsageTrackingResource() {
        return this.usageTrackingResource;
    }

    /**
     * <p>
     * The queue ID provided to this budget to track usage.
     * </p>
     * 
     * @param usageTrackingResource
     *        The queue ID provided to this budget to track usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withUsageTrackingResource(UsageTrackingResource usageTrackingResource) {
        setUsageTrackingResource(usageTrackingResource);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getApproximateDollarLimit() != null)
            sb.append("ApproximateDollarLimit: ").append(getApproximateDollarLimit()).append(",");
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
        if (getUsageTrackingResource() != null)
            sb.append("UsageTrackingResource: ").append(getUsageTrackingResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBudgetRequest == false)
            return false;
        CreateBudgetRequest other = (CreateBudgetRequest) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getApproximateDollarLimit() == null ^ this.getApproximateDollarLimit() == null)
            return false;
        if (other.getApproximateDollarLimit() != null && other.getApproximateDollarLimit().equals(this.getApproximateDollarLimit()) == false)
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
        if (other.getUsageTrackingResource() == null ^ this.getUsageTrackingResource() == null)
            return false;
        if (other.getUsageTrackingResource() != null && other.getUsageTrackingResource().equals(this.getUsageTrackingResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getApproximateDollarLimit() == null) ? 0 : getApproximateDollarLimit().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getUsageTrackingResource() == null) ? 0 : getUsageTrackingResource().hashCode());
        return hashCode;
    }

    @Override
    public CreateBudgetRequest clone() {
        return (CreateBudgetRequest) super.clone();
    }

}

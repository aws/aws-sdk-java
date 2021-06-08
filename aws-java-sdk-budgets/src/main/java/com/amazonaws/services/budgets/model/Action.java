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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A budget action resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A system-generated universally unique identifier (UUID) for the action.
     * </p>
     */
    private String actionId;

    private String budgetName;

    private String notificationType;
    /**
     * <p>
     * The type of action. This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The trigger threshold of the action.
     * </p>
     */
    private ActionThreshold actionThreshold;
    /**
     * <p>
     * Where you specify all of the type-specific parameters.
     * </p>
     */
    private Definition definition;
    /**
     * <p>
     * The role passed for action execution and reversion. Roles and actions must be in the same account.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * This specifies if the action needs manual or automatic approval.
     * </p>
     */
    private String approvalModel;
    /**
     * <p>
     * The status of action.
     * </p>
     */
    private String status;

    private java.util.List<Subscriber> subscribers;

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

    public Action withActionId(String actionId) {
        setActionId(actionId);
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

    public Action withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * @param notificationType
     * @see NotificationType
     */

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * @return
     * @see NotificationType
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     * @param notificationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public Action withNotificationType(String notificationType) {
        setNotificationType(notificationType);
        return this;
    }

    /**
     * @param notificationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public Action withNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
        return this;
    }

    /**
     * <p>
     * The type of action. This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     * </p>
     * 
     * @param actionType
     *        The type of action. This defines the type of tasks that can be carried out by this action. This field also
     *        determines the format for definition.
     * @see ActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action. This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     * </p>
     * 
     * @return The type of action. This defines the type of tasks that can be carried out by this action. This field
     *         also determines the format for definition.
     * @see ActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of action. This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     * </p>
     * 
     * @param actionType
     *        The type of action. This defines the type of tasks that can be carried out by this action. This field also
     *        determines the format for definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Action withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of action. This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     * </p>
     * 
     * @param actionType
     *        The type of action. This defines the type of tasks that can be carried out by this action. This field also
     *        determines the format for definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Action withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The trigger threshold of the action.
     * </p>
     * 
     * @param actionThreshold
     *        The trigger threshold of the action.
     */

    public void setActionThreshold(ActionThreshold actionThreshold) {
        this.actionThreshold = actionThreshold;
    }

    /**
     * <p>
     * The trigger threshold of the action.
     * </p>
     * 
     * @return The trigger threshold of the action.
     */

    public ActionThreshold getActionThreshold() {
        return this.actionThreshold;
    }

    /**
     * <p>
     * The trigger threshold of the action.
     * </p>
     * 
     * @param actionThreshold
     *        The trigger threshold of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withActionThreshold(ActionThreshold actionThreshold) {
        setActionThreshold(actionThreshold);
        return this;
    }

    /**
     * <p>
     * Where you specify all of the type-specific parameters.
     * </p>
     * 
     * @param definition
     *        Where you specify all of the type-specific parameters.
     */

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * Where you specify all of the type-specific parameters.
     * </p>
     * 
     * @return Where you specify all of the type-specific parameters.
     */

    public Definition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * Where you specify all of the type-specific parameters.
     * </p>
     * 
     * @param definition
     *        Where you specify all of the type-specific parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withDefinition(Definition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The role passed for action execution and reversion. Roles and actions must be in the same account.
     * </p>
     * 
     * @param executionRoleArn
     *        The role passed for action execution and reversion. Roles and actions must be in the same account.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The role passed for action execution and reversion. Roles and actions must be in the same account.
     * </p>
     * 
     * @return The role passed for action execution and reversion. Roles and actions must be in the same account.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The role passed for action execution and reversion. Roles and actions must be in the same account.
     * </p>
     * 
     * @param executionRoleArn
     *        The role passed for action execution and reversion. Roles and actions must be in the same account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * This specifies if the action needs manual or automatic approval.
     * </p>
     * 
     * @param approvalModel
     *        This specifies if the action needs manual or automatic approval.
     * @see ApprovalModel
     */

    public void setApprovalModel(String approvalModel) {
        this.approvalModel = approvalModel;
    }

    /**
     * <p>
     * This specifies if the action needs manual or automatic approval.
     * </p>
     * 
     * @return This specifies if the action needs manual or automatic approval.
     * @see ApprovalModel
     */

    public String getApprovalModel() {
        return this.approvalModel;
    }

    /**
     * <p>
     * This specifies if the action needs manual or automatic approval.
     * </p>
     * 
     * @param approvalModel
     *        This specifies if the action needs manual or automatic approval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApprovalModel
     */

    public Action withApprovalModel(String approvalModel) {
        setApprovalModel(approvalModel);
        return this;
    }

    /**
     * <p>
     * This specifies if the action needs manual or automatic approval.
     * </p>
     * 
     * @param approvalModel
     *        This specifies if the action needs manual or automatic approval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApprovalModel
     */

    public Action withApprovalModel(ApprovalModel approvalModel) {
        this.approvalModel = approvalModel.toString();
        return this;
    }

    /**
     * <p>
     * The status of action.
     * </p>
     * 
     * @param status
     *        The status of action.
     * @see ActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of action.
     * </p>
     * 
     * @return The status of action.
     * @see ActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of action.
     * </p>
     * 
     * @param status
     *        The status of action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public Action withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of action.
     * </p>
     * 
     * @param status
     *        The status of action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public Action withStatus(ActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Subscriber> getSubscribers() {
        return subscribers;
    }

    /**
     * @param subscribers
     */

    public void setSubscribers(java.util.Collection<Subscriber> subscribers) {
        if (subscribers == null) {
            this.subscribers = null;
            return;
        }

        this.subscribers = new java.util.ArrayList<Subscriber>(subscribers);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribers(java.util.Collection)} or {@link #withSubscribers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscribers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSubscribers(Subscriber... subscribers) {
        if (this.subscribers == null) {
            setSubscribers(new java.util.ArrayList<Subscriber>(subscribers.length));
        }
        for (Subscriber ele : subscribers) {
            this.subscribers.add(ele);
        }
        return this;
    }

    /**
     * @param subscribers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSubscribers(java.util.Collection<Subscriber> subscribers) {
        setSubscribers(subscribers);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getBudgetName() != null)
            sb.append("BudgetName: ").append(getBudgetName()).append(",");
        if (getNotificationType() != null)
            sb.append("NotificationType: ").append(getNotificationType()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getActionThreshold() != null)
            sb.append("ActionThreshold: ").append(getActionThreshold()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getApprovalModel() != null)
            sb.append("ApprovalModel: ").append(getApprovalModel()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubscribers() != null)
            sb.append("Subscribers: ").append(getSubscribers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null)
            return false;
        if (other.getNotificationType() != null && other.getNotificationType().equals(this.getNotificationType()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getActionThreshold() == null ^ this.getActionThreshold() == null)
            return false;
        if (other.getActionThreshold() != null && other.getActionThreshold().equals(this.getActionThreshold()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getApprovalModel() == null ^ this.getApprovalModel() == null)
            return false;
        if (other.getApprovalModel() != null && other.getApprovalModel().equals(this.getApprovalModel()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubscribers() == null ^ this.getSubscribers() == null)
            return false;
        if (other.getSubscribers() != null && other.getSubscribers().equals(this.getSubscribers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getActionThreshold() == null) ? 0 : getActionThreshold().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getApprovalModel() == null) ? 0 : getApprovalModel().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubscribers() == null) ? 0 : getSubscribers().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

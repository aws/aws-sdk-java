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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The record of a completed or failed managed action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ManagedActionHistoryItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedActionHistoryItem implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The type of the managed action.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * A description of the managed action.
     * </p>
     */
    private String actionDescription;
    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     */
    private String failureType;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the action failed, a description of the failure.
     * </p>
     */
    private String failureDescription;
    /**
     * <p>
     * The date and time that the action started executing.
     * </p>
     */
    private java.util.Date executedTime;
    /**
     * <p>
     * The date and time that the action finished executing.
     * </p>
     */
    private java.util.Date finishedTime;

    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     * 
     * @param actionId
     *        A unique identifier for the managed action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     * 
     * @return A unique identifier for the managed action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     * 
     * @param actionId
     *        A unique identifier for the managed action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedActionHistoryItem withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * 
     * @param actionType
     *        The type of the managed action.
     * @see ActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * 
     * @return The type of the managed action.
     * @see ActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * 
     * @param actionType
     *        The type of the managed action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public ManagedActionHistoryItem withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * 
     * @param actionType
     *        The type of the managed action.
     * @see ActionType
     */

    public void setActionType(ActionType actionType) {
        withActionType(actionType);
    }

    /**
     * <p>
     * The type of the managed action.
     * </p>
     * 
     * @param actionType
     *        The type of the managed action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public ManagedActionHistoryItem withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * A description of the managed action.
     * </p>
     * 
     * @param actionDescription
     *        A description of the managed action.
     */

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    /**
     * <p>
     * A description of the managed action.
     * </p>
     * 
     * @return A description of the managed action.
     */

    public String getActionDescription() {
        return this.actionDescription;
    }

    /**
     * <p>
     * A description of the managed action.
     * </p>
     * 
     * @param actionDescription
     *        A description of the managed action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedActionHistoryItem withActionDescription(String actionDescription) {
        setActionDescription(actionDescription);
        return this;
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * 
     * @param failureType
     *        If the action failed, the type of failure.
     * @see FailureType
     */

    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * 
     * @return If the action failed, the type of failure.
     * @see FailureType
     */

    public String getFailureType() {
        return this.failureType;
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * 
     * @param failureType
     *        If the action failed, the type of failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureType
     */

    public ManagedActionHistoryItem withFailureType(String failureType) {
        setFailureType(failureType);
        return this;
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * 
     * @param failureType
     *        If the action failed, the type of failure.
     * @see FailureType
     */

    public void setFailureType(FailureType failureType) {
        withFailureType(failureType);
    }

    /**
     * <p>
     * If the action failed, the type of failure.
     * </p>
     * 
     * @param failureType
     *        If the action failed, the type of failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureType
     */

    public ManagedActionHistoryItem withFailureType(FailureType failureType) {
        this.failureType = failureType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see ActionHistoryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see ActionHistoryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionHistoryStatus
     */

    public ManagedActionHistoryItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see ActionHistoryStatus
     */

    public void setStatus(ActionHistoryStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionHistoryStatus
     */

    public ManagedActionHistoryItem withStatus(ActionHistoryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the action failed, a description of the failure.
     * </p>
     * 
     * @param failureDescription
     *        If the action failed, a description of the failure.
     */

    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
    }

    /**
     * <p>
     * If the action failed, a description of the failure.
     * </p>
     * 
     * @return If the action failed, a description of the failure.
     */

    public String getFailureDescription() {
        return this.failureDescription;
    }

    /**
     * <p>
     * If the action failed, a description of the failure.
     * </p>
     * 
     * @param failureDescription
     *        If the action failed, a description of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedActionHistoryItem withFailureDescription(String failureDescription) {
        setFailureDescription(failureDescription);
        return this;
    }

    /**
     * <p>
     * The date and time that the action started executing.
     * </p>
     * 
     * @param executedTime
     *        The date and time that the action started executing.
     */

    public void setExecutedTime(java.util.Date executedTime) {
        this.executedTime = executedTime;
    }

    /**
     * <p>
     * The date and time that the action started executing.
     * </p>
     * 
     * @return The date and time that the action started executing.
     */

    public java.util.Date getExecutedTime() {
        return this.executedTime;
    }

    /**
     * <p>
     * The date and time that the action started executing.
     * </p>
     * 
     * @param executedTime
     *        The date and time that the action started executing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedActionHistoryItem withExecutedTime(java.util.Date executedTime) {
        setExecutedTime(executedTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the action finished executing.
     * </p>
     * 
     * @param finishedTime
     *        The date and time that the action finished executing.
     */

    public void setFinishedTime(java.util.Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    /**
     * <p>
     * The date and time that the action finished executing.
     * </p>
     * 
     * @return The date and time that the action finished executing.
     */

    public java.util.Date getFinishedTime() {
        return this.finishedTime;
    }

    /**
     * <p>
     * The date and time that the action finished executing.
     * </p>
     * 
     * @param finishedTime
     *        The date and time that the action finished executing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedActionHistoryItem withFinishedTime(java.util.Date finishedTime) {
        setFinishedTime(finishedTime);
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
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getActionDescription() != null)
            sb.append("ActionDescription: ").append(getActionDescription()).append(",");
        if (getFailureType() != null)
            sb.append("FailureType: ").append(getFailureType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureDescription() != null)
            sb.append("FailureDescription: ").append(getFailureDescription()).append(",");
        if (getExecutedTime() != null)
            sb.append("ExecutedTime: ").append(getExecutedTime()).append(",");
        if (getFinishedTime() != null)
            sb.append("FinishedTime: ").append(getFinishedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedActionHistoryItem == false)
            return false;
        ManagedActionHistoryItem other = (ManagedActionHistoryItem) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getActionDescription() == null ^ this.getActionDescription() == null)
            return false;
        if (other.getActionDescription() != null && other.getActionDescription().equals(this.getActionDescription()) == false)
            return false;
        if (other.getFailureType() == null ^ this.getFailureType() == null)
            return false;
        if (other.getFailureType() != null && other.getFailureType().equals(this.getFailureType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureDescription() == null ^ this.getFailureDescription() == null)
            return false;
        if (other.getFailureDescription() != null && other.getFailureDescription().equals(this.getFailureDescription()) == false)
            return false;
        if (other.getExecutedTime() == null ^ this.getExecutedTime() == null)
            return false;
        if (other.getExecutedTime() != null && other.getExecutedTime().equals(this.getExecutedTime()) == false)
            return false;
        if (other.getFinishedTime() == null ^ this.getFinishedTime() == null)
            return false;
        if (other.getFinishedTime() != null && other.getFinishedTime().equals(this.getFinishedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getActionDescription() == null) ? 0 : getActionDescription().hashCode());
        hashCode = prime * hashCode + ((getFailureType() == null) ? 0 : getFailureType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureDescription() == null) ? 0 : getFailureDescription().hashCode());
        hashCode = prime * hashCode + ((getExecutedTime() == null) ? 0 : getExecutedTime().hashCode());
        hashCode = prime * hashCode + ((getFinishedTime() == null) ? 0 : getFinishedTime().hashCode());
        return hashCode;
    }

    @Override
    public ManagedActionHistoryItem clone() {
        try {
            return (ManagedActionHistoryItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

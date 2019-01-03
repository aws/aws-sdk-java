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
 * The record of an upcoming or in-progress managed action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ManagedAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedAction implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the managed action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * A description of the managed action.
     * </p>
     */
    private String actionDescription;
    /**
     * <p>
     * The type of managed action.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately with
     * <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The start time of the maintenance window in which the managed action will execute.
     * </p>
     */
    private java.util.Date windowStartTime;

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

    public ManagedAction withActionId(String actionId) {
        setActionId(actionId);
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

    public ManagedAction withActionDescription(String actionDescription) {
        setActionDescription(actionDescription);
        return this;
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * 
     * @param actionType
     *        The type of managed action.
     * @see ActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * 
     * @return The type of managed action.
     * @see ActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * 
     * @param actionType
     *        The type of managed action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public ManagedAction withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * 
     * @param actionType
     *        The type of managed action.
     * @see ActionType
     */

    public void setActionType(ActionType actionType) {
        withActionType(actionType);
    }

    /**
     * <p>
     * The type of managed action.
     * </p>
     * 
     * @param actionType
     *        The type of managed action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public ManagedAction withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately with
     * <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * 
     * @param status
     *        The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately
     *        with <a>ApplyEnvironmentManagedAction</a>.
     * @see ActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately with
     * <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * 
     * @return The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately
     *         with <a>ApplyEnvironmentManagedAction</a>.
     * @see ActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately with
     * <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * 
     * @param status
     *        The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately
     *        with <a>ApplyEnvironmentManagedAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public ManagedAction withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately with
     * <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * 
     * @param status
     *        The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately
     *        with <a>ApplyEnvironmentManagedAction</a>.
     * @see ActionStatus
     */

    public void setStatus(ActionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately with
     * <a>ApplyEnvironmentManagedAction</a>.
     * </p>
     * 
     * @param status
     *        The status of the managed action. If the action is <code>Scheduled</code>, you can apply it immediately
     *        with <a>ApplyEnvironmentManagedAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public ManagedAction withStatus(ActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the maintenance window in which the managed action will execute.
     * </p>
     * 
     * @param windowStartTime
     *        The start time of the maintenance window in which the managed action will execute.
     */

    public void setWindowStartTime(java.util.Date windowStartTime) {
        this.windowStartTime = windowStartTime;
    }

    /**
     * <p>
     * The start time of the maintenance window in which the managed action will execute.
     * </p>
     * 
     * @return The start time of the maintenance window in which the managed action will execute.
     */

    public java.util.Date getWindowStartTime() {
        return this.windowStartTime;
    }

    /**
     * <p>
     * The start time of the maintenance window in which the managed action will execute.
     * </p>
     * 
     * @param windowStartTime
     *        The start time of the maintenance window in which the managed action will execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedAction withWindowStartTime(java.util.Date windowStartTime) {
        setWindowStartTime(windowStartTime);
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
        if (getActionDescription() != null)
            sb.append("ActionDescription: ").append(getActionDescription()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getWindowStartTime() != null)
            sb.append("WindowStartTime: ").append(getWindowStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedAction == false)
            return false;
        ManagedAction other = (ManagedAction) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getActionDescription() == null ^ this.getActionDescription() == null)
            return false;
        if (other.getActionDescription() != null && other.getActionDescription().equals(this.getActionDescription()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWindowStartTime() == null ^ this.getWindowStartTime() == null)
            return false;
        if (other.getWindowStartTime() != null && other.getWindowStartTime().equals(this.getWindowStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getActionDescription() == null) ? 0 : getActionDescription().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWindowStartTime() == null) ? 0 : getWindowStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ManagedAction clone() {
        try {
            return (ManagedAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

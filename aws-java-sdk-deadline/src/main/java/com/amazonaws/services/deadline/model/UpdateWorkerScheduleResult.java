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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorkerSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkerScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The assigned sessions to update.
     * </p>
     */
    private java.util.Map<String, AssignedSession> assignedSessions;
    /**
     * <p>
     * The session actions associated with the worker schedule to cancel.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> cancelSessionActions;
    /**
     * <p>
     * The status to update the worker to.
     * </p>
     */
    private String desiredWorkerStatus;
    /**
     * <p>
     * Updates the time interval (in seconds) for the schedule.
     * </p>
     */
    private Integer updateIntervalSeconds;

    /**
     * <p>
     * The assigned sessions to update.
     * </p>
     * 
     * @return The assigned sessions to update.
     */

    public java.util.Map<String, AssignedSession> getAssignedSessions() {
        return assignedSessions;
    }

    /**
     * <p>
     * The assigned sessions to update.
     * </p>
     * 
     * @param assignedSessions
     *        The assigned sessions to update.
     */

    public void setAssignedSessions(java.util.Map<String, AssignedSession> assignedSessions) {
        this.assignedSessions = assignedSessions;
    }

    /**
     * <p>
     * The assigned sessions to update.
     * </p>
     * 
     * @param assignedSessions
     *        The assigned sessions to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleResult withAssignedSessions(java.util.Map<String, AssignedSession> assignedSessions) {
        setAssignedSessions(assignedSessions);
        return this;
    }

    /**
     * Add a single AssignedSessions entry
     *
     * @see UpdateWorkerScheduleResult#withAssignedSessions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleResult addAssignedSessionsEntry(String key, AssignedSession value) {
        if (null == this.assignedSessions) {
            this.assignedSessions = new java.util.HashMap<String, AssignedSession>();
        }
        if (this.assignedSessions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.assignedSessions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AssignedSessions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleResult clearAssignedSessionsEntries() {
        this.assignedSessions = null;
        return this;
    }

    /**
     * <p>
     * The session actions associated with the worker schedule to cancel.
     * </p>
     * 
     * @return The session actions associated with the worker schedule to cancel.
     */

    public java.util.Map<String, java.util.List<String>> getCancelSessionActions() {
        return cancelSessionActions;
    }

    /**
     * <p>
     * The session actions associated with the worker schedule to cancel.
     * </p>
     * 
     * @param cancelSessionActions
     *        The session actions associated with the worker schedule to cancel.
     */

    public void setCancelSessionActions(java.util.Map<String, java.util.List<String>> cancelSessionActions) {
        this.cancelSessionActions = cancelSessionActions;
    }

    /**
     * <p>
     * The session actions associated with the worker schedule to cancel.
     * </p>
     * 
     * @param cancelSessionActions
     *        The session actions associated with the worker schedule to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleResult withCancelSessionActions(java.util.Map<String, java.util.List<String>> cancelSessionActions) {
        setCancelSessionActions(cancelSessionActions);
        return this;
    }

    /**
     * Add a single CancelSessionActions entry
     *
     * @see UpdateWorkerScheduleResult#withCancelSessionActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleResult addCancelSessionActionsEntry(String key, java.util.List<String> value) {
        if (null == this.cancelSessionActions) {
            this.cancelSessionActions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.cancelSessionActions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.cancelSessionActions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CancelSessionActions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleResult clearCancelSessionActionsEntries() {
        this.cancelSessionActions = null;
        return this;
    }

    /**
     * <p>
     * The status to update the worker to.
     * </p>
     * 
     * @param desiredWorkerStatus
     *        The status to update the worker to.
     * @see DesiredWorkerStatus
     */

    public void setDesiredWorkerStatus(String desiredWorkerStatus) {
        this.desiredWorkerStatus = desiredWorkerStatus;
    }

    /**
     * <p>
     * The status to update the worker to.
     * </p>
     * 
     * @return The status to update the worker to.
     * @see DesiredWorkerStatus
     */

    public String getDesiredWorkerStatus() {
        return this.desiredWorkerStatus;
    }

    /**
     * <p>
     * The status to update the worker to.
     * </p>
     * 
     * @param desiredWorkerStatus
     *        The status to update the worker to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredWorkerStatus
     */

    public UpdateWorkerScheduleResult withDesiredWorkerStatus(String desiredWorkerStatus) {
        setDesiredWorkerStatus(desiredWorkerStatus);
        return this;
    }

    /**
     * <p>
     * The status to update the worker to.
     * </p>
     * 
     * @param desiredWorkerStatus
     *        The status to update the worker to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesiredWorkerStatus
     */

    public UpdateWorkerScheduleResult withDesiredWorkerStatus(DesiredWorkerStatus desiredWorkerStatus) {
        this.desiredWorkerStatus = desiredWorkerStatus.toString();
        return this;
    }

    /**
     * <p>
     * Updates the time interval (in seconds) for the schedule.
     * </p>
     * 
     * @param updateIntervalSeconds
     *        Updates the time interval (in seconds) for the schedule.
     */

    public void setUpdateIntervalSeconds(Integer updateIntervalSeconds) {
        this.updateIntervalSeconds = updateIntervalSeconds;
    }

    /**
     * <p>
     * Updates the time interval (in seconds) for the schedule.
     * </p>
     * 
     * @return Updates the time interval (in seconds) for the schedule.
     */

    public Integer getUpdateIntervalSeconds() {
        return this.updateIntervalSeconds;
    }

    /**
     * <p>
     * Updates the time interval (in seconds) for the schedule.
     * </p>
     * 
     * @param updateIntervalSeconds
     *        Updates the time interval (in seconds) for the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleResult withUpdateIntervalSeconds(Integer updateIntervalSeconds) {
        setUpdateIntervalSeconds(updateIntervalSeconds);
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
        if (getAssignedSessions() != null)
            sb.append("AssignedSessions: ").append(getAssignedSessions()).append(",");
        if (getCancelSessionActions() != null)
            sb.append("CancelSessionActions: ").append(getCancelSessionActions()).append(",");
        if (getDesiredWorkerStatus() != null)
            sb.append("DesiredWorkerStatus: ").append(getDesiredWorkerStatus()).append(",");
        if (getUpdateIntervalSeconds() != null)
            sb.append("UpdateIntervalSeconds: ").append(getUpdateIntervalSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkerScheduleResult == false)
            return false;
        UpdateWorkerScheduleResult other = (UpdateWorkerScheduleResult) obj;
        if (other.getAssignedSessions() == null ^ this.getAssignedSessions() == null)
            return false;
        if (other.getAssignedSessions() != null && other.getAssignedSessions().equals(this.getAssignedSessions()) == false)
            return false;
        if (other.getCancelSessionActions() == null ^ this.getCancelSessionActions() == null)
            return false;
        if (other.getCancelSessionActions() != null && other.getCancelSessionActions().equals(this.getCancelSessionActions()) == false)
            return false;
        if (other.getDesiredWorkerStatus() == null ^ this.getDesiredWorkerStatus() == null)
            return false;
        if (other.getDesiredWorkerStatus() != null && other.getDesiredWorkerStatus().equals(this.getDesiredWorkerStatus()) == false)
            return false;
        if (other.getUpdateIntervalSeconds() == null ^ this.getUpdateIntervalSeconds() == null)
            return false;
        if (other.getUpdateIntervalSeconds() != null && other.getUpdateIntervalSeconds().equals(this.getUpdateIntervalSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignedSessions() == null) ? 0 : getAssignedSessions().hashCode());
        hashCode = prime * hashCode + ((getCancelSessionActions() == null) ? 0 : getCancelSessionActions().hashCode());
        hashCode = prime * hashCode + ((getDesiredWorkerStatus() == null) ? 0 : getDesiredWorkerStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateIntervalSeconds() == null) ? 0 : getUpdateIntervalSeconds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkerScheduleResult clone() {
        try {
            return (UpdateWorkerScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

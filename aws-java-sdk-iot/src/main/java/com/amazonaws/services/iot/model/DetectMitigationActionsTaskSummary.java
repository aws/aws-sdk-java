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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the mitigation action tasks.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectMitigationActionsTaskSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The status of the task.
     * </p>
     */
    private String taskStatus;
    /**
     * <p>
     * The date the task started.
     * </p>
     */
    private java.util.Date taskStartTime;
    /**
     * <p>
     * The date the task ended.
     * </p>
     */
    private java.util.Date taskEndTime;
    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are applied.
     * </p>
     */
    private DetectMitigationActionsTaskTarget target;
    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     */
    private ViolationEventOccurrenceRange violationEventOccurrenceRange;
    /**
     * <p>
     * Includes only active violations.
     * </p>
     */
    private Boolean onlyActiveViolationsIncluded;
    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     */
    private Boolean suppressedAlertsIncluded;
    /**
     * <p>
     * The definition of the actions.
     * </p>
     */
    private java.util.List<MitigationAction> actionsDefinition;
    /**
     * <p>
     * The statistics of a mitigation action task.
     * </p>
     */
    private DetectMitigationActionsTaskStatistics taskStatistics;

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * 
     * @param taskId
     *        The unique identifier of the task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * 
     * @return The unique identifier of the task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * 
     * @param taskId
     *        The unique identifier of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param taskStatus
     *        The status of the task.
     * @see DetectMitigationActionsTaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @return The status of the task.
     * @see DetectMitigationActionsTaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param taskStatus
     *        The status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectMitigationActionsTaskStatus
     */

    public DetectMitigationActionsTaskSummary withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param taskStatus
     *        The status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectMitigationActionsTaskStatus
     */

    public DetectMitigationActionsTaskSummary withTaskStatus(DetectMitigationActionsTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date the task started.
     * </p>
     * 
     * @param taskStartTime
     *        The date the task started.
     */

    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * The date the task started.
     * </p>
     * 
     * @return The date the task started.
     */

    public java.util.Date getTaskStartTime() {
        return this.taskStartTime;
    }

    /**
     * <p>
     * The date the task started.
     * </p>
     * 
     * @param taskStartTime
     *        The date the task started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withTaskStartTime(java.util.Date taskStartTime) {
        setTaskStartTime(taskStartTime);
        return this;
    }

    /**
     * <p>
     * The date the task ended.
     * </p>
     * 
     * @param taskEndTime
     *        The date the task ended.
     */

    public void setTaskEndTime(java.util.Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    /**
     * <p>
     * The date the task ended.
     * </p>
     * 
     * @return The date the task ended.
     */

    public java.util.Date getTaskEndTime() {
        return this.taskEndTime;
    }

    /**
     * <p>
     * The date the task ended.
     * </p>
     * 
     * @param taskEndTime
     *        The date the task ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withTaskEndTime(java.util.Date taskEndTime) {
        setTaskEndTime(taskEndTime);
        return this;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are applied.
     * </p>
     * 
     * @param target
     *        Specifies the ML Detect findings to which the mitigation actions are applied.
     */

    public void setTarget(DetectMitigationActionsTaskTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are applied.
     * </p>
     * 
     * @return Specifies the ML Detect findings to which the mitigation actions are applied.
     */

    public DetectMitigationActionsTaskTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are applied.
     * </p>
     * 
     * @param target
     *        Specifies the ML Detect findings to which the mitigation actions are applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withTarget(DetectMitigationActionsTaskTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     * 
     * @param violationEventOccurrenceRange
     *        Specifies the time period of which violation events occurred between.
     */

    public void setViolationEventOccurrenceRange(ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        this.violationEventOccurrenceRange = violationEventOccurrenceRange;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     * 
     * @return Specifies the time period of which violation events occurred between.
     */

    public ViolationEventOccurrenceRange getViolationEventOccurrenceRange() {
        return this.violationEventOccurrenceRange;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     * 
     * @param violationEventOccurrenceRange
     *        Specifies the time period of which violation events occurred between.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withViolationEventOccurrenceRange(ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        setViolationEventOccurrenceRange(violationEventOccurrenceRange);
        return this;
    }

    /**
     * <p>
     * Includes only active violations.
     * </p>
     * 
     * @param onlyActiveViolationsIncluded
     *        Includes only active violations.
     */

    public void setOnlyActiveViolationsIncluded(Boolean onlyActiveViolationsIncluded) {
        this.onlyActiveViolationsIncluded = onlyActiveViolationsIncluded;
    }

    /**
     * <p>
     * Includes only active violations.
     * </p>
     * 
     * @return Includes only active violations.
     */

    public Boolean getOnlyActiveViolationsIncluded() {
        return this.onlyActiveViolationsIncluded;
    }

    /**
     * <p>
     * Includes only active violations.
     * </p>
     * 
     * @param onlyActiveViolationsIncluded
     *        Includes only active violations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withOnlyActiveViolationsIncluded(Boolean onlyActiveViolationsIncluded) {
        setOnlyActiveViolationsIncluded(onlyActiveViolationsIncluded);
        return this;
    }

    /**
     * <p>
     * Includes only active violations.
     * </p>
     * 
     * @return Includes only active violations.
     */

    public Boolean isOnlyActiveViolationsIncluded() {
        return this.onlyActiveViolationsIncluded;
    }

    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     * 
     * @param suppressedAlertsIncluded
     *        Includes suppressed alerts.
     */

    public void setSuppressedAlertsIncluded(Boolean suppressedAlertsIncluded) {
        this.suppressedAlertsIncluded = suppressedAlertsIncluded;
    }

    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     * 
     * @return Includes suppressed alerts.
     */

    public Boolean getSuppressedAlertsIncluded() {
        return this.suppressedAlertsIncluded;
    }

    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     * 
     * @param suppressedAlertsIncluded
     *        Includes suppressed alerts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withSuppressedAlertsIncluded(Boolean suppressedAlertsIncluded) {
        setSuppressedAlertsIncluded(suppressedAlertsIncluded);
        return this;
    }

    /**
     * <p>
     * Includes suppressed alerts.
     * </p>
     * 
     * @return Includes suppressed alerts.
     */

    public Boolean isSuppressedAlertsIncluded() {
        return this.suppressedAlertsIncluded;
    }

    /**
     * <p>
     * The definition of the actions.
     * </p>
     * 
     * @return The definition of the actions.
     */

    public java.util.List<MitigationAction> getActionsDefinition() {
        return actionsDefinition;
    }

    /**
     * <p>
     * The definition of the actions.
     * </p>
     * 
     * @param actionsDefinition
     *        The definition of the actions.
     */

    public void setActionsDefinition(java.util.Collection<MitigationAction> actionsDefinition) {
        if (actionsDefinition == null) {
            this.actionsDefinition = null;
            return;
        }

        this.actionsDefinition = new java.util.ArrayList<MitigationAction>(actionsDefinition);
    }

    /**
     * <p>
     * The definition of the actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionsDefinition(java.util.Collection)} or {@link #withActionsDefinition(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param actionsDefinition
     *        The definition of the actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withActionsDefinition(MitigationAction... actionsDefinition) {
        if (this.actionsDefinition == null) {
            setActionsDefinition(new java.util.ArrayList<MitigationAction>(actionsDefinition.length));
        }
        for (MitigationAction ele : actionsDefinition) {
            this.actionsDefinition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The definition of the actions.
     * </p>
     * 
     * @param actionsDefinition
     *        The definition of the actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withActionsDefinition(java.util.Collection<MitigationAction> actionsDefinition) {
        setActionsDefinition(actionsDefinition);
        return this;
    }

    /**
     * <p>
     * The statistics of a mitigation action task.
     * </p>
     * 
     * @param taskStatistics
     *        The statistics of a mitigation action task.
     */

    public void setTaskStatistics(DetectMitigationActionsTaskStatistics taskStatistics) {
        this.taskStatistics = taskStatistics;
    }

    /**
     * <p>
     * The statistics of a mitigation action task.
     * </p>
     * 
     * @return The statistics of a mitigation action task.
     */

    public DetectMitigationActionsTaskStatistics getTaskStatistics() {
        return this.taskStatistics;
    }

    /**
     * <p>
     * The statistics of a mitigation action task.
     * </p>
     * 
     * @param taskStatistics
     *        The statistics of a mitigation action task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionsTaskSummary withTaskStatistics(DetectMitigationActionsTaskStatistics taskStatistics) {
        setTaskStatistics(taskStatistics);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus()).append(",");
        if (getTaskStartTime() != null)
            sb.append("TaskStartTime: ").append(getTaskStartTime()).append(",");
        if (getTaskEndTime() != null)
            sb.append("TaskEndTime: ").append(getTaskEndTime()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getViolationEventOccurrenceRange() != null)
            sb.append("ViolationEventOccurrenceRange: ").append(getViolationEventOccurrenceRange()).append(",");
        if (getOnlyActiveViolationsIncluded() != null)
            sb.append("OnlyActiveViolationsIncluded: ").append(getOnlyActiveViolationsIncluded()).append(",");
        if (getSuppressedAlertsIncluded() != null)
            sb.append("SuppressedAlertsIncluded: ").append(getSuppressedAlertsIncluded()).append(",");
        if (getActionsDefinition() != null)
            sb.append("ActionsDefinition: ").append(getActionsDefinition()).append(",");
        if (getTaskStatistics() != null)
            sb.append("TaskStatistics: ").append(getTaskStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectMitigationActionsTaskSummary == false)
            return false;
        DetectMitigationActionsTaskSummary other = (DetectMitigationActionsTaskSummary) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getTaskEndTime() == null ^ this.getTaskEndTime() == null)
            return false;
        if (other.getTaskEndTime() != null && other.getTaskEndTime().equals(this.getTaskEndTime()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getViolationEventOccurrenceRange() == null ^ this.getViolationEventOccurrenceRange() == null)
            return false;
        if (other.getViolationEventOccurrenceRange() != null
                && other.getViolationEventOccurrenceRange().equals(this.getViolationEventOccurrenceRange()) == false)
            return false;
        if (other.getOnlyActiveViolationsIncluded() == null ^ this.getOnlyActiveViolationsIncluded() == null)
            return false;
        if (other.getOnlyActiveViolationsIncluded() != null && other.getOnlyActiveViolationsIncluded().equals(this.getOnlyActiveViolationsIncluded()) == false)
            return false;
        if (other.getSuppressedAlertsIncluded() == null ^ this.getSuppressedAlertsIncluded() == null)
            return false;
        if (other.getSuppressedAlertsIncluded() != null && other.getSuppressedAlertsIncluded().equals(this.getSuppressedAlertsIncluded()) == false)
            return false;
        if (other.getActionsDefinition() == null ^ this.getActionsDefinition() == null)
            return false;
        if (other.getActionsDefinition() != null && other.getActionsDefinition().equals(this.getActionsDefinition()) == false)
            return false;
        if (other.getTaskStatistics() == null ^ this.getTaskStatistics() == null)
            return false;
        if (other.getTaskStatistics() != null && other.getTaskStatistics().equals(this.getTaskStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode + ((getTaskEndTime() == null) ? 0 : getTaskEndTime().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getViolationEventOccurrenceRange() == null) ? 0 : getViolationEventOccurrenceRange().hashCode());
        hashCode = prime * hashCode + ((getOnlyActiveViolationsIncluded() == null) ? 0 : getOnlyActiveViolationsIncluded().hashCode());
        hashCode = prime * hashCode + ((getSuppressedAlertsIncluded() == null) ? 0 : getSuppressedAlertsIncluded().hashCode());
        hashCode = prime * hashCode + ((getActionsDefinition() == null) ? 0 : getActionsDefinition().hashCode());
        hashCode = prime * hashCode + ((getTaskStatistics() == null) ? 0 : getTaskStatistics().hashCode());
        return hashCode;
    }

    @Override
    public DetectMitigationActionsTaskSummary clone() {
        try {
            return (DetectMitigationActionsTaskSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.DetectMitigationActionsTaskSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

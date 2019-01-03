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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAuditTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
     * </p>
     */
    private String taskStatus;
    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     */
    private String taskType;
    /**
     * <p>
     * The time the audit started.
     * </p>
     */
    private java.util.Date taskStartTime;
    /**
     * <p>
     * Statistical information about the audit.
     * </p>
     */
    private TaskStatistics taskStatistics;
    /**
     * <p>
     * The name of the scheduled audit (only if the audit was a scheduled audit).
     * </p>
     */
    private String scheduledAuditName;
    /**
     * <p>
     * Detailed information about each check performed during this audit.
     * </p>
     */
    private java.util.Map<String, AuditCheckDetails> auditDetails;

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
     * </p>
     * 
     * @param taskStatus
     *        The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
     * @see AuditTaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
     * </p>
     * 
     * @return The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
     * @see AuditTaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
     * </p>
     * 
     * @param taskStatus
     *        The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditTaskStatus
     */

    public DescribeAuditTaskResult withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
     * </p>
     * 
     * @param taskStatus
     *        The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditTaskStatus
     */

    public DescribeAuditTaskResult withTaskStatus(AuditTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * 
     * @param taskType
     *        The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * @see AuditTaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * 
     * @return The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * @see AuditTaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * 
     * @param taskType
     *        The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditTaskType
     */

    public DescribeAuditTaskResult withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * 
     * @param taskType
     *        The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditTaskType
     */

    public DescribeAuditTaskResult withTaskType(AuditTaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     * 
     * @param taskStartTime
     *        The time the audit started.
     */

    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     * 
     * @return The time the audit started.
     */

    public java.util.Date getTaskStartTime() {
        return this.taskStartTime;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     * 
     * @param taskStartTime
     *        The time the audit started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditTaskResult withTaskStartTime(java.util.Date taskStartTime) {
        setTaskStartTime(taskStartTime);
        return this;
    }

    /**
     * <p>
     * Statistical information about the audit.
     * </p>
     * 
     * @param taskStatistics
     *        Statistical information about the audit.
     */

    public void setTaskStatistics(TaskStatistics taskStatistics) {
        this.taskStatistics = taskStatistics;
    }

    /**
     * <p>
     * Statistical information about the audit.
     * </p>
     * 
     * @return Statistical information about the audit.
     */

    public TaskStatistics getTaskStatistics() {
        return this.taskStatistics;
    }

    /**
     * <p>
     * Statistical information about the audit.
     * </p>
     * 
     * @param taskStatistics
     *        Statistical information about the audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditTaskResult withTaskStatistics(TaskStatistics taskStatistics) {
        setTaskStatistics(taskStatistics);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled audit (only if the audit was a scheduled audit).
     * </p>
     * 
     * @param scheduledAuditName
     *        The name of the scheduled audit (only if the audit was a scheduled audit).
     */

    public void setScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit (only if the audit was a scheduled audit).
     * </p>
     * 
     * @return The name of the scheduled audit (only if the audit was a scheduled audit).
     */

    public String getScheduledAuditName() {
        return this.scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit (only if the audit was a scheduled audit).
     * </p>
     * 
     * @param scheduledAuditName
     *        The name of the scheduled audit (only if the audit was a scheduled audit).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditTaskResult withScheduledAuditName(String scheduledAuditName) {
        setScheduledAuditName(scheduledAuditName);
        return this;
    }

    /**
     * <p>
     * Detailed information about each check performed during this audit.
     * </p>
     * 
     * @return Detailed information about each check performed during this audit.
     */

    public java.util.Map<String, AuditCheckDetails> getAuditDetails() {
        return auditDetails;
    }

    /**
     * <p>
     * Detailed information about each check performed during this audit.
     * </p>
     * 
     * @param auditDetails
     *        Detailed information about each check performed during this audit.
     */

    public void setAuditDetails(java.util.Map<String, AuditCheckDetails> auditDetails) {
        this.auditDetails = auditDetails;
    }

    /**
     * <p>
     * Detailed information about each check performed during this audit.
     * </p>
     * 
     * @param auditDetails
     *        Detailed information about each check performed during this audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditTaskResult withAuditDetails(java.util.Map<String, AuditCheckDetails> auditDetails) {
        setAuditDetails(auditDetails);
        return this;
    }

    public DescribeAuditTaskResult addAuditDetailsEntry(String key, AuditCheckDetails value) {
        if (null == this.auditDetails) {
            this.auditDetails = new java.util.HashMap<String, AuditCheckDetails>();
        }
        if (this.auditDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.auditDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuditDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditTaskResult clearAuditDetailsEntries() {
        this.auditDetails = null;
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
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus()).append(",");
        if (getTaskType() != null)
            sb.append("TaskType: ").append(getTaskType()).append(",");
        if (getTaskStartTime() != null)
            sb.append("TaskStartTime: ").append(getTaskStartTime()).append(",");
        if (getTaskStatistics() != null)
            sb.append("TaskStatistics: ").append(getTaskStatistics()).append(",");
        if (getScheduledAuditName() != null)
            sb.append("ScheduledAuditName: ").append(getScheduledAuditName()).append(",");
        if (getAuditDetails() != null)
            sb.append("AuditDetails: ").append(getAuditDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAuditTaskResult == false)
            return false;
        DescribeAuditTaskResult other = (DescribeAuditTaskResult) obj;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getTaskStatistics() == null ^ this.getTaskStatistics() == null)
            return false;
        if (other.getTaskStatistics() != null && other.getTaskStatistics().equals(this.getTaskStatistics()) == false)
            return false;
        if (other.getScheduledAuditName() == null ^ this.getScheduledAuditName() == null)
            return false;
        if (other.getScheduledAuditName() != null && other.getScheduledAuditName().equals(this.getScheduledAuditName()) == false)
            return false;
        if (other.getAuditDetails() == null ^ this.getAuditDetails() == null)
            return false;
        if (other.getAuditDetails() != null && other.getAuditDetails().equals(this.getAuditDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode + ((getTaskStatistics() == null) ? 0 : getTaskStatistics().hashCode());
        hashCode = prime * hashCode + ((getScheduledAuditName() == null) ? 0 : getScheduledAuditName().hashCode());
        hashCode = prime * hashCode + ((getAuditDetails() == null) ? 0 : getAuditDetails().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAuditTaskResult clone() {
        try {
            return (DescribeAuditTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

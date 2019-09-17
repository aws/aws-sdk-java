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
public class DescribeAuditMitigationActionsTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The current status of the task.
     * </p>
     */
    private String taskStatus;
    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time when the task was completed or canceled.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit mitigation
     * actions task.
     * </p>
     */
    private java.util.Map<String, TaskStatisticsForAuditCheck> taskStatistics;
    /**
     * <p>
     * Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit task,
     * or a set of findings.
     * </p>
     */
    private AuditMitigationActionsTaskTarget target;
    /**
     * <p>
     * Specifies the mitigation actions that should be applied to specific audit checks.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping;
    /**
     * <p>
     * Specifies the mitigation actions and their parameters that are applied as part of this task.
     * </p>
     */
    private java.util.List<MitigationAction> actionsDefinition;

    /**
     * <p>
     * The current status of the task.
     * </p>
     * 
     * @param taskStatus
     *        The current status of the task.
     * @see AuditMitigationActionsTaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The current status of the task.
     * </p>
     * 
     * @return The current status of the task.
     * @see AuditMitigationActionsTaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * The current status of the task.
     * </p>
     * 
     * @param taskStatus
     *        The current status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsTaskStatus
     */

    public DescribeAuditMitigationActionsTaskResult withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the task.
     * </p>
     * 
     * @param taskStatus
     *        The current status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsTaskStatus
     */

    public DescribeAuditMitigationActionsTaskResult withTaskStatus(AuditMitigationActionsTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     * 
     * @param startTime
     *        The date and time when the task was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     * 
     * @return The date and time when the task was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     * 
     * @param startTime
     *        The date and time when the task was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditMitigationActionsTaskResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled.
     * </p>
     * 
     * @param endTime
     *        The date and time when the task was completed or canceled.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled.
     * </p>
     * 
     * @return The date and time when the task was completed or canceled.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled.
     * </p>
     * 
     * @param endTime
     *        The date and time when the task was completed or canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditMitigationActionsTaskResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit mitigation
     * actions task.
     * </p>
     * 
     * @return Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit
     *         mitigation actions task.
     */

    public java.util.Map<String, TaskStatisticsForAuditCheck> getTaskStatistics() {
        return taskStatistics;
    }

    /**
     * <p>
     * Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit mitigation
     * actions task.
     * </p>
     * 
     * @param taskStatistics
     *        Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit
     *        mitigation actions task.
     */

    public void setTaskStatistics(java.util.Map<String, TaskStatisticsForAuditCheck> taskStatistics) {
        this.taskStatistics = taskStatistics;
    }

    /**
     * <p>
     * Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit mitigation
     * actions task.
     * </p>
     * 
     * @param taskStatistics
     *        Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit
     *        mitigation actions task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditMitigationActionsTaskResult withTaskStatistics(java.util.Map<String, TaskStatisticsForAuditCheck> taskStatistics) {
        setTaskStatistics(taskStatistics);
        return this;
    }

    public DescribeAuditMitigationActionsTaskResult addTaskStatisticsEntry(String key, TaskStatisticsForAuditCheck value) {
        if (null == this.taskStatistics) {
            this.taskStatistics = new java.util.HashMap<String, TaskStatisticsForAuditCheck>();
        }
        if (this.taskStatistics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.taskStatistics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TaskStatistics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditMitigationActionsTaskResult clearTaskStatisticsEntries() {
        this.taskStatistics = null;
        return this;
    }

    /**
     * <p>
     * Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit task,
     * or a set of findings.
     * </p>
     * 
     * @param target
     *        Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit
     *        task, or a set of findings.
     */

    public void setTarget(AuditMitigationActionsTaskTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit task,
     * or a set of findings.
     * </p>
     * 
     * @return Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by
     *         audit task, or a set of findings.
     */

    public AuditMitigationActionsTaskTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit task,
     * or a set of findings.
     * </p>
     * 
     * @param target
     *        Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit
     *        task, or a set of findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditMitigationActionsTaskResult withTarget(AuditMitigationActionsTaskTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Specifies the mitigation actions that should be applied to specific audit checks.
     * </p>
     * 
     * @return Specifies the mitigation actions that should be applied to specific audit checks.
     */

    public java.util.Map<String, java.util.List<String>> getAuditCheckToActionsMapping() {
        return auditCheckToActionsMapping;
    }

    /**
     * <p>
     * Specifies the mitigation actions that should be applied to specific audit checks.
     * </p>
     * 
     * @param auditCheckToActionsMapping
     *        Specifies the mitigation actions that should be applied to specific audit checks.
     */

    public void setAuditCheckToActionsMapping(java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping) {
        this.auditCheckToActionsMapping = auditCheckToActionsMapping;
    }

    /**
     * <p>
     * Specifies the mitigation actions that should be applied to specific audit checks.
     * </p>
     * 
     * @param auditCheckToActionsMapping
     *        Specifies the mitigation actions that should be applied to specific audit checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditMitigationActionsTaskResult withAuditCheckToActionsMapping(java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping) {
        setAuditCheckToActionsMapping(auditCheckToActionsMapping);
        return this;
    }

    public DescribeAuditMitigationActionsTaskResult addAuditCheckToActionsMappingEntry(String key, java.util.List<String> value) {
        if (null == this.auditCheckToActionsMapping) {
            this.auditCheckToActionsMapping = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.auditCheckToActionsMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.auditCheckToActionsMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuditCheckToActionsMapping.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditMitigationActionsTaskResult clearAuditCheckToActionsMappingEntries() {
        this.auditCheckToActionsMapping = null;
        return this;
    }

    /**
     * <p>
     * Specifies the mitigation actions and their parameters that are applied as part of this task.
     * </p>
     * 
     * @return Specifies the mitigation actions and their parameters that are applied as part of this task.
     */

    public java.util.List<MitigationAction> getActionsDefinition() {
        return actionsDefinition;
    }

    /**
     * <p>
     * Specifies the mitigation actions and their parameters that are applied as part of this task.
     * </p>
     * 
     * @param actionsDefinition
     *        Specifies the mitigation actions and their parameters that are applied as part of this task.
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
     * Specifies the mitigation actions and their parameters that are applied as part of this task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionsDefinition(java.util.Collection)} or {@link #withActionsDefinition(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param actionsDefinition
     *        Specifies the mitigation actions and their parameters that are applied as part of this task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditMitigationActionsTaskResult withActionsDefinition(MitigationAction... actionsDefinition) {
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
     * Specifies the mitigation actions and their parameters that are applied as part of this task.
     * </p>
     * 
     * @param actionsDefinition
     *        Specifies the mitigation actions and their parameters that are applied as part of this task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditMitigationActionsTaskResult withActionsDefinition(java.util.Collection<MitigationAction> actionsDefinition) {
        setActionsDefinition(actionsDefinition);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getTaskStatistics() != null)
            sb.append("TaskStatistics: ").append(getTaskStatistics()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getAuditCheckToActionsMapping() != null)
            sb.append("AuditCheckToActionsMapping: ").append(getAuditCheckToActionsMapping()).append(",");
        if (getActionsDefinition() != null)
            sb.append("ActionsDefinition: ").append(getActionsDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAuditMitigationActionsTaskResult == false)
            return false;
        DescribeAuditMitigationActionsTaskResult other = (DescribeAuditMitigationActionsTaskResult) obj;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTaskStatistics() == null ^ this.getTaskStatistics() == null)
            return false;
        if (other.getTaskStatistics() != null && other.getTaskStatistics().equals(this.getTaskStatistics()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getAuditCheckToActionsMapping() == null ^ this.getAuditCheckToActionsMapping() == null)
            return false;
        if (other.getAuditCheckToActionsMapping() != null && other.getAuditCheckToActionsMapping().equals(this.getAuditCheckToActionsMapping()) == false)
            return false;
        if (other.getActionsDefinition() == null ^ this.getActionsDefinition() == null)
            return false;
        if (other.getActionsDefinition() != null && other.getActionsDefinition().equals(this.getActionsDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTaskStatistics() == null) ? 0 : getTaskStatistics().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getAuditCheckToActionsMapping() == null) ? 0 : getAuditCheckToActionsMapping().hashCode());
        hashCode = prime * hashCode + ((getActionsDefinition() == null) ? 0 : getActionsDefinition().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAuditMitigationActionsTaskResult clone() {
        try {
            return (DescribeAuditMitigationActionsTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

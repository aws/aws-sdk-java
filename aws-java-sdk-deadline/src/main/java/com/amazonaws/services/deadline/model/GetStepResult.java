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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStep" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStepResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The number of dependencies in the step.
     * </p>
     */
    private DependencyCounts dependencyCounts;
    /**
     * <p>
     * The description of the step.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The life cycle status of the step.
     * </p>
     */
    private String lifecycleStatus;
    /**
     * <p>
     * A message that describes the lifecycle status of the step.
     * </p>
     */
    private String lifecycleStatusMessage;
    /**
     * <p>
     * The name of the step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of step parameters and the combination expression for the step.
     * </p>
     */
    private ParameterSpace parameterSpace;
    /**
     * <p>
     * The required capabilities of the step.
     * </p>
     */
    private StepRequiredCapabilities requiredCapabilities;
    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The step ID.
     * </p>
     */
    private String stepId;
    /**
     * <p>
     * The task status with which the job started.
     * </p>
     */
    private String targetTaskRunStatus;
    /**
     * <p>
     * The task run status for the job.
     * </p>
     */
    private String taskRunStatus;
    /**
     * <p>
     * The number of tasks running on the job.
     * </p>
     */
    private java.util.Map<String, Integer> taskRunStatusCounts;
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

    public GetStepResult withCreatedAt(java.util.Date createdAt) {
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

    public GetStepResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The number of dependencies in the step.
     * </p>
     * 
     * @param dependencyCounts
     *        The number of dependencies in the step.
     */

    public void setDependencyCounts(DependencyCounts dependencyCounts) {
        this.dependencyCounts = dependencyCounts;
    }

    /**
     * <p>
     * The number of dependencies in the step.
     * </p>
     * 
     * @return The number of dependencies in the step.
     */

    public DependencyCounts getDependencyCounts() {
        return this.dependencyCounts;
    }

    /**
     * <p>
     * The number of dependencies in the step.
     * </p>
     * 
     * @param dependencyCounts
     *        The number of dependencies in the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withDependencyCounts(DependencyCounts dependencyCounts) {
        setDependencyCounts(dependencyCounts);
        return this;
    }

    /**
     * <p>
     * The description of the step.
     * </p>
     * 
     * @param description
     *        The description of the step.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the step.
     * </p>
     * 
     * @return The description of the step.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the step.
     * </p>
     * 
     * @param description
     *        The description of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     * 
     * @param endedAt
     *        The date and time the resource ended running.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     * 
     * @return The date and time the resource ended running.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     * 
     * @param endedAt
     *        The date and time the resource ended running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The life cycle status of the step.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status of the step.
     * @see StepLifecycleStatus
     */

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status of the step.
     * </p>
     * 
     * @return The life cycle status of the step.
     * @see StepLifecycleStatus
     */

    public String getLifecycleStatus() {
        return this.lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status of the step.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepLifecycleStatus
     */

    public GetStepResult withLifecycleStatus(String lifecycleStatus) {
        setLifecycleStatus(lifecycleStatus);
        return this;
    }

    /**
     * <p>
     * The life cycle status of the step.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepLifecycleStatus
     */

    public GetStepResult withLifecycleStatus(StepLifecycleStatus lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message that describes the lifecycle status of the step.
     * </p>
     * 
     * @param lifecycleStatusMessage
     *        A message that describes the lifecycle status of the step.
     */

    public void setLifecycleStatusMessage(String lifecycleStatusMessage) {
        this.lifecycleStatusMessage = lifecycleStatusMessage;
    }

    /**
     * <p>
     * A message that describes the lifecycle status of the step.
     * </p>
     * 
     * @return A message that describes the lifecycle status of the step.
     */

    public String getLifecycleStatusMessage() {
        return this.lifecycleStatusMessage;
    }

    /**
     * <p>
     * A message that describes the lifecycle status of the step.
     * </p>
     * 
     * @param lifecycleStatusMessage
     *        A message that describes the lifecycle status of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withLifecycleStatusMessage(String lifecycleStatusMessage) {
        setLifecycleStatusMessage(lifecycleStatusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param name
     *        The name of the step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @return The name of the step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param name
     *        The name of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of step parameters and the combination expression for the step.
     * </p>
     * 
     * @param parameterSpace
     *        A list of step parameters and the combination expression for the step.
     */

    public void setParameterSpace(ParameterSpace parameterSpace) {
        this.parameterSpace = parameterSpace;
    }

    /**
     * <p>
     * A list of step parameters and the combination expression for the step.
     * </p>
     * 
     * @return A list of step parameters and the combination expression for the step.
     */

    public ParameterSpace getParameterSpace() {
        return this.parameterSpace;
    }

    /**
     * <p>
     * A list of step parameters and the combination expression for the step.
     * </p>
     * 
     * @param parameterSpace
     *        A list of step parameters and the combination expression for the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withParameterSpace(ParameterSpace parameterSpace) {
        setParameterSpace(parameterSpace);
        return this;
    }

    /**
     * <p>
     * The required capabilities of the step.
     * </p>
     * 
     * @param requiredCapabilities
     *        The required capabilities of the step.
     */

    public void setRequiredCapabilities(StepRequiredCapabilities requiredCapabilities) {
        this.requiredCapabilities = requiredCapabilities;
    }

    /**
     * <p>
     * The required capabilities of the step.
     * </p>
     * 
     * @return The required capabilities of the step.
     */

    public StepRequiredCapabilities getRequiredCapabilities() {
        return this.requiredCapabilities;
    }

    /**
     * <p>
     * The required capabilities of the step.
     * </p>
     * 
     * @param requiredCapabilities
     *        The required capabilities of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withRequiredCapabilities(StepRequiredCapabilities requiredCapabilities) {
        setRequiredCapabilities(requiredCapabilities);
        return this;
    }

    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     * 
     * @param startedAt
     *        The date and time the resource started running.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     * 
     * @return The date and time the resource started running.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     * 
     * @param startedAt
     *        The date and time the resource started running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @return The step ID.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * <p>
     * The task status with which the job started.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status with which the job started.
     * @see StepTargetTaskRunStatus
     */

    public void setTargetTaskRunStatus(String targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus;
    }

    /**
     * <p>
     * The task status with which the job started.
     * </p>
     * 
     * @return The task status with which the job started.
     * @see StepTargetTaskRunStatus
     */

    public String getTargetTaskRunStatus() {
        return this.targetTaskRunStatus;
    }

    /**
     * <p>
     * The task status with which the job started.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status with which the job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepTargetTaskRunStatus
     */

    public GetStepResult withTargetTaskRunStatus(String targetTaskRunStatus) {
        setTargetTaskRunStatus(targetTaskRunStatus);
        return this;
    }

    /**
     * <p>
     * The task status with which the job started.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status with which the job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepTargetTaskRunStatus
     */

    public GetStepResult withTargetTaskRunStatus(StepTargetTaskRunStatus targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The task run status for the job.
     * </p>
     * 
     * @param taskRunStatus
     *        The task run status for the job.
     * @see TaskRunStatus
     */

    public void setTaskRunStatus(String taskRunStatus) {
        this.taskRunStatus = taskRunStatus;
    }

    /**
     * <p>
     * The task run status for the job.
     * </p>
     * 
     * @return The task run status for the job.
     * @see TaskRunStatus
     */

    public String getTaskRunStatus() {
        return this.taskRunStatus;
    }

    /**
     * <p>
     * The task run status for the job.
     * </p>
     * 
     * @param taskRunStatus
     *        The task run status for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunStatus
     */

    public GetStepResult withTaskRunStatus(String taskRunStatus) {
        setTaskRunStatus(taskRunStatus);
        return this;
    }

    /**
     * <p>
     * The task run status for the job.
     * </p>
     * 
     * @param taskRunStatus
     *        The task run status for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunStatus
     */

    public GetStepResult withTaskRunStatus(TaskRunStatus taskRunStatus) {
        this.taskRunStatus = taskRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of tasks running on the job.
     * </p>
     * 
     * @return The number of tasks running on the job.
     */

    public java.util.Map<String, Integer> getTaskRunStatusCounts() {
        return taskRunStatusCounts;
    }

    /**
     * <p>
     * The number of tasks running on the job.
     * </p>
     * 
     * @param taskRunStatusCounts
     *        The number of tasks running on the job.
     */

    public void setTaskRunStatusCounts(java.util.Map<String, Integer> taskRunStatusCounts) {
        this.taskRunStatusCounts = taskRunStatusCounts;
    }

    /**
     * <p>
     * The number of tasks running on the job.
     * </p>
     * 
     * @param taskRunStatusCounts
     *        The number of tasks running on the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult withTaskRunStatusCounts(java.util.Map<String, Integer> taskRunStatusCounts) {
        setTaskRunStatusCounts(taskRunStatusCounts);
        return this;
    }

    /**
     * Add a single TaskRunStatusCounts entry
     *
     * @see GetStepResult#withTaskRunStatusCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult addTaskRunStatusCountsEntry(String key, Integer value) {
        if (null == this.taskRunStatusCounts) {
            this.taskRunStatusCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.taskRunStatusCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.taskRunStatusCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TaskRunStatusCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepResult clearTaskRunStatusCountsEntries() {
        this.taskRunStatusCounts = null;
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

    public GetStepResult withUpdatedAt(java.util.Date updatedAt) {
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

    public GetStepResult withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDependencyCounts() != null)
            sb.append("DependencyCounts: ").append(getDependencyCounts()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getLifecycleStatus() != null)
            sb.append("LifecycleStatus: ").append(getLifecycleStatus()).append(",");
        if (getLifecycleStatusMessage() != null)
            sb.append("LifecycleStatusMessage: ").append(getLifecycleStatusMessage()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParameterSpace() != null)
            sb.append("ParameterSpace: ").append(getParameterSpace()).append(",");
        if (getRequiredCapabilities() != null)
            sb.append("RequiredCapabilities: ").append(getRequiredCapabilities()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId()).append(",");
        if (getTargetTaskRunStatus() != null)
            sb.append("TargetTaskRunStatus: ").append(getTargetTaskRunStatus()).append(",");
        if (getTaskRunStatus() != null)
            sb.append("TaskRunStatus: ").append(getTaskRunStatus()).append(",");
        if (getTaskRunStatusCounts() != null)
            sb.append("TaskRunStatusCounts: ").append(getTaskRunStatusCounts()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStepResult == false)
            return false;
        GetStepResult other = (GetStepResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDependencyCounts() == null ^ this.getDependencyCounts() == null)
            return false;
        if (other.getDependencyCounts() != null && other.getDependencyCounts().equals(this.getDependencyCounts()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getLifecycleStatus() == null ^ this.getLifecycleStatus() == null)
            return false;
        if (other.getLifecycleStatus() != null && other.getLifecycleStatus().equals(this.getLifecycleStatus()) == false)
            return false;
        if (other.getLifecycleStatusMessage() == null ^ this.getLifecycleStatusMessage() == null)
            return false;
        if (other.getLifecycleStatusMessage() != null && other.getLifecycleStatusMessage().equals(this.getLifecycleStatusMessage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParameterSpace() == null ^ this.getParameterSpace() == null)
            return false;
        if (other.getParameterSpace() != null && other.getParameterSpace().equals(this.getParameterSpace()) == false)
            return false;
        if (other.getRequiredCapabilities() == null ^ this.getRequiredCapabilities() == null)
            return false;
        if (other.getRequiredCapabilities() != null && other.getRequiredCapabilities().equals(this.getRequiredCapabilities()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
        if (other.getTargetTaskRunStatus() == null ^ this.getTargetTaskRunStatus() == null)
            return false;
        if (other.getTargetTaskRunStatus() != null && other.getTargetTaskRunStatus().equals(this.getTargetTaskRunStatus()) == false)
            return false;
        if (other.getTaskRunStatus() == null ^ this.getTaskRunStatus() == null)
            return false;
        if (other.getTaskRunStatus() != null && other.getTaskRunStatus().equals(this.getTaskRunStatus()) == false)
            return false;
        if (other.getTaskRunStatusCounts() == null ^ this.getTaskRunStatusCounts() == null)
            return false;
        if (other.getTaskRunStatusCounts() != null && other.getTaskRunStatusCounts().equals(this.getTaskRunStatusCounts()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDependencyCounts() == null) ? 0 : getDependencyCounts().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatus() == null) ? 0 : getLifecycleStatus().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatusMessage() == null) ? 0 : getLifecycleStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParameterSpace() == null) ? 0 : getParameterSpace().hashCode());
        hashCode = prime * hashCode + ((getRequiredCapabilities() == null) ? 0 : getRequiredCapabilities().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        hashCode = prime * hashCode + ((getTargetTaskRunStatus() == null) ? 0 : getTargetTaskRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskRunStatus() == null) ? 0 : getTaskRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskRunStatusCounts() == null) ? 0 : getTaskRunStatusCounts().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public GetStepResult clone() {
        try {
            return (GetStepResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

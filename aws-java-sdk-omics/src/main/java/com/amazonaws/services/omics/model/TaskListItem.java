/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A workflow run task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/TaskListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The task's CPU count.
     * </p>
     */
    private Integer cpus;
    /**
     * <p>
     * When the task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The task's memory.
     * </p>
     */
    private Integer memory;
    /**
     * <p>
     * The task's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When the task started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The task's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When the task stopped.
     * </p>
     */
    private java.util.Date stopTime;
    /**
     * <p>
     * The task's ID.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The task's CPU count.
     * </p>
     * 
     * @param cpus
     *        The task's CPU count.
     */

    public void setCpus(Integer cpus) {
        this.cpus = cpus;
    }

    /**
     * <p>
     * The task's CPU count.
     * </p>
     * 
     * @return The task's CPU count.
     */

    public Integer getCpus() {
        return this.cpus;
    }

    /**
     * <p>
     * The task's CPU count.
     * </p>
     * 
     * @param cpus
     *        The task's CPU count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskListItem withCpus(Integer cpus) {
        setCpus(cpus);
        return this;
    }

    /**
     * <p>
     * When the task was created.
     * </p>
     * 
     * @param creationTime
     *        When the task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the task was created.
     * </p>
     * 
     * @return When the task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the task was created.
     * </p>
     * 
     * @param creationTime
     *        When the task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskListItem withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The task's memory.
     * </p>
     * 
     * @param memory
     *        The task's memory.
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The task's memory.
     * </p>
     * 
     * @return The task's memory.
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The task's memory.
     * </p>
     * 
     * @param memory
     *        The task's memory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskListItem withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The task's name.
     * </p>
     * 
     * @param name
     *        The task's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The task's name.
     * </p>
     * 
     * @return The task's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The task's name.
     * </p>
     * 
     * @param name
     *        The task's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskListItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When the task started.
     * </p>
     * 
     * @param startTime
     *        When the task started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the task started.
     * </p>
     * 
     * @return When the task started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * When the task started.
     * </p>
     * 
     * @param startTime
     *        When the task started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskListItem withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The task's status.
     * </p>
     * 
     * @param status
     *        The task's status.
     * @see TaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The task's status.
     * </p>
     * 
     * @return The task's status.
     * @see TaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The task's status.
     * </p>
     * 
     * @param status
     *        The task's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public TaskListItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The task's status.
     * </p>
     * 
     * @param status
     *        The task's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public TaskListItem withStatus(TaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When the task stopped.
     * </p>
     * 
     * @param stopTime
     *        When the task stopped.
     */

    public void setStopTime(java.util.Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * <p>
     * When the task stopped.
     * </p>
     * 
     * @return When the task stopped.
     */

    public java.util.Date getStopTime() {
        return this.stopTime;
    }

    /**
     * <p>
     * When the task stopped.
     * </p>
     * 
     * @param stopTime
     *        When the task stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskListItem withStopTime(java.util.Date stopTime) {
        setStopTime(stopTime);
        return this;
    }

    /**
     * <p>
     * The task's ID.
     * </p>
     * 
     * @param taskId
     *        The task's ID.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The task's ID.
     * </p>
     * 
     * @return The task's ID.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The task's ID.
     * </p>
     * 
     * @param taskId
     *        The task's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskListItem withTaskId(String taskId) {
        setTaskId(taskId);
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
        if (getCpus() != null)
            sb.append("Cpus: ").append(getCpus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStopTime() != null)
            sb.append("StopTime: ").append(getStopTime()).append(",");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskListItem == false)
            return false;
        TaskListItem other = (TaskListItem) obj;
        if (other.getCpus() == null ^ this.getCpus() == null)
            return false;
        if (other.getCpus() != null && other.getCpus().equals(this.getCpus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStopTime() == null ^ this.getStopTime() == null)
            return false;
        if (other.getStopTime() != null && other.getStopTime().equals(this.getStopTime()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpus() == null) ? 0 : getCpus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStopTime() == null) ? 0 : getStopTime().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public TaskListItem clone() {
        try {
            return (TaskListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.TaskListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

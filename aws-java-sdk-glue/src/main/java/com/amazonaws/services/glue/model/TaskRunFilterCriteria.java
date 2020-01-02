/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria that are used to filter the task runs for the machine learning transform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TaskRunFilterCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskRunFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of task run.
     * </p>
     */
    private String taskRunType;
    /**
     * <p>
     * The current status of the task run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Filter on task runs started before this date.
     * </p>
     */
    private java.util.Date startedBefore;
    /**
     * <p>
     * Filter on task runs started after this date.
     * </p>
     */
    private java.util.Date startedAfter;

    /**
     * <p>
     * The type of task run.
     * </p>
     * 
     * @param taskRunType
     *        The type of task run.
     * @see TaskType
     */

    public void setTaskRunType(String taskRunType) {
        this.taskRunType = taskRunType;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * 
     * @return The type of task run.
     * @see TaskType
     */

    public String getTaskRunType() {
        return this.taskRunType;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * 
     * @param taskRunType
     *        The type of task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskType
     */

    public TaskRunFilterCriteria withTaskRunType(String taskRunType) {
        setTaskRunType(taskRunType);
        return this;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * 
     * @param taskRunType
     *        The type of task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskType
     */

    public TaskRunFilterCriteria withTaskRunType(TaskType taskRunType) {
        this.taskRunType = taskRunType.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * 
     * @param status
     *        The current status of the task run.
     * @see TaskStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * 
     * @return The current status of the task run.
     * @see TaskStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * 
     * @param status
     *        The current status of the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatusType
     */

    public TaskRunFilterCriteria withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the task run.
     * </p>
     * 
     * @param status
     *        The current status of the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatusType
     */

    public TaskRunFilterCriteria withStatus(TaskStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Filter on task runs started before this date.
     * </p>
     * 
     * @param startedBefore
     *        Filter on task runs started before this date.
     */

    public void setStartedBefore(java.util.Date startedBefore) {
        this.startedBefore = startedBefore;
    }

    /**
     * <p>
     * Filter on task runs started before this date.
     * </p>
     * 
     * @return Filter on task runs started before this date.
     */

    public java.util.Date getStartedBefore() {
        return this.startedBefore;
    }

    /**
     * <p>
     * Filter on task runs started before this date.
     * </p>
     * 
     * @param startedBefore
     *        Filter on task runs started before this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskRunFilterCriteria withStartedBefore(java.util.Date startedBefore) {
        setStartedBefore(startedBefore);
        return this;
    }

    /**
     * <p>
     * Filter on task runs started after this date.
     * </p>
     * 
     * @param startedAfter
     *        Filter on task runs started after this date.
     */

    public void setStartedAfter(java.util.Date startedAfter) {
        this.startedAfter = startedAfter;
    }

    /**
     * <p>
     * Filter on task runs started after this date.
     * </p>
     * 
     * @return Filter on task runs started after this date.
     */

    public java.util.Date getStartedAfter() {
        return this.startedAfter;
    }

    /**
     * <p>
     * Filter on task runs started after this date.
     * </p>
     * 
     * @param startedAfter
     *        Filter on task runs started after this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskRunFilterCriteria withStartedAfter(java.util.Date startedAfter) {
        setStartedAfter(startedAfter);
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
        if (getTaskRunType() != null)
            sb.append("TaskRunType: ").append(getTaskRunType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartedBefore() != null)
            sb.append("StartedBefore: ").append(getStartedBefore()).append(",");
        if (getStartedAfter() != null)
            sb.append("StartedAfter: ").append(getStartedAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskRunFilterCriteria == false)
            return false;
        TaskRunFilterCriteria other = (TaskRunFilterCriteria) obj;
        if (other.getTaskRunType() == null ^ this.getTaskRunType() == null)
            return false;
        if (other.getTaskRunType() != null && other.getTaskRunType().equals(this.getTaskRunType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartedBefore() == null ^ this.getStartedBefore() == null)
            return false;
        if (other.getStartedBefore() != null && other.getStartedBefore().equals(this.getStartedBefore()) == false)
            return false;
        if (other.getStartedAfter() == null ^ this.getStartedAfter() == null)
            return false;
        if (other.getStartedAfter() != null && other.getStartedAfter().equals(this.getStartedAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskRunType() == null) ? 0 : getTaskRunType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartedBefore() == null) ? 0 : getStartedBefore().hashCode());
        hashCode = prime * hashCode + ((getStartedAfter() == null) ? 0 : getStartedAfter().hashCode());
        return hashCode;
    }

    @Override
    public TaskRunFilterCriteria clone() {
        try {
            return (TaskRunFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TaskRunFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a pipeline task that is assigned to a task runner.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/TaskObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An internal identifier for the task. This ID is passed to the <a>SetTaskStatus</a> and <a>ReportTaskProgress</a>
     * actions.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The ID of the pipeline that provided the task.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is
     * attempted.
     * </p>
     */
    private String attemptId;
    /**
     * <p>
     * Connection information for the location where the task runner will publish the output of the task.
     * </p>
     */
    private java.util.Map<String, PipelineObject> objects;

    /**
     * <p>
     * An internal identifier for the task. This ID is passed to the <a>SetTaskStatus</a> and <a>ReportTaskProgress</a>
     * actions.
     * </p>
     * 
     * @param taskId
     *        An internal identifier for the task. This ID is passed to the <a>SetTaskStatus</a> and
     *        <a>ReportTaskProgress</a> actions.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * An internal identifier for the task. This ID is passed to the <a>SetTaskStatus</a> and <a>ReportTaskProgress</a>
     * actions.
     * </p>
     * 
     * @return An internal identifier for the task. This ID is passed to the <a>SetTaskStatus</a> and
     *         <a>ReportTaskProgress</a> actions.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * An internal identifier for the task. This ID is passed to the <a>SetTaskStatus</a> and <a>ReportTaskProgress</a>
     * actions.
     * </p>
     * 
     * @param taskId
     *        An internal identifier for the task. This ID is passed to the <a>SetTaskStatus</a> and
     *        <a>ReportTaskProgress</a> actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskObject withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The ID of the pipeline that provided the task.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline that provided the task.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline that provided the task.
     * </p>
     * 
     * @return The ID of the pipeline that provided the task.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline that provided the task.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline that provided the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskObject withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is
     * attempted.
     * </p>
     * 
     * @param attemptId
     *        The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a
     *        task is attempted.
     */

    public void setAttemptId(String attemptId) {
        this.attemptId = attemptId;
    }

    /**
     * <p>
     * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is
     * attempted.
     * </p>
     * 
     * @return The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a
     *         task is attempted.
     */

    public String getAttemptId() {
        return this.attemptId;
    }

    /**
     * <p>
     * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is
     * attempted.
     * </p>
     * 
     * @param attemptId
     *        The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a
     *        task is attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskObject withAttemptId(String attemptId) {
        setAttemptId(attemptId);
        return this;
    }

    /**
     * <p>
     * Connection information for the location where the task runner will publish the output of the task.
     * </p>
     * 
     * @return Connection information for the location where the task runner will publish the output of the task.
     */

    public java.util.Map<String, PipelineObject> getObjects() {
        return objects;
    }

    /**
     * <p>
     * Connection information for the location where the task runner will publish the output of the task.
     * </p>
     * 
     * @param objects
     *        Connection information for the location where the task runner will publish the output of the task.
     */

    public void setObjects(java.util.Map<String, PipelineObject> objects) {
        this.objects = objects;
    }

    /**
     * <p>
     * Connection information for the location where the task runner will publish the output of the task.
     * </p>
     * 
     * @param objects
     *        Connection information for the location where the task runner will publish the output of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskObject withObjects(java.util.Map<String, PipelineObject> objects) {
        setObjects(objects);
        return this;
    }

    public TaskObject addObjectsEntry(String key, PipelineObject value) {
        if (null == this.objects) {
            this.objects = new java.util.HashMap<String, PipelineObject>();
        }
        if (this.objects.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.objects.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Objects.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskObject clearObjectsEntries() {
        this.objects = null;
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
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId()).append(",");
        if (getAttemptId() != null)
            sb.append("AttemptId: ").append(getAttemptId()).append(",");
        if (getObjects() != null)
            sb.append("Objects: ").append(getObjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskObject == false)
            return false;
        TaskObject other = (TaskObject) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getAttemptId() == null ^ this.getAttemptId() == null)
            return false;
        if (other.getAttemptId() != null && other.getAttemptId().equals(this.getAttemptId()) == false)
            return false;
        if (other.getObjects() == null ^ this.getObjects() == null)
            return false;
        if (other.getObjects() != null && other.getObjects().equals(this.getObjects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getAttemptId() == null) ? 0 : getAttemptId().hashCode());
        hashCode = prime * hashCode + ((getObjects() == null) ? 0 : getObjects().hashCode());
        return hashCode;
    }

    @Override
    public TaskObject clone() {
        try {
            return (TaskObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.TaskObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

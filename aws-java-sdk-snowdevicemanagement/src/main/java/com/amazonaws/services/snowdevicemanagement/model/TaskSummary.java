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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the task assigned to one or many devices.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/TaskSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the task assigned to one or many devices.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The task ID.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The state of the task assigned to one or many devices.
     * </p>
     * 
     * @param state
     *        The state of the task assigned to one or many devices.
     * @see TaskState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the task assigned to one or many devices.
     * </p>
     * 
     * @return The state of the task assigned to one or many devices.
     * @see TaskState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the task assigned to one or many devices.
     * </p>
     * 
     * @param state
     *        The state of the task assigned to one or many devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskState
     */

    public TaskSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the task assigned to one or many devices.
     * </p>
     * 
     * @param state
     *        The state of the task assigned to one or many devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskState
     */

    public TaskSummary withState(TaskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @return Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *         ways, such as by purpose, owner, or environment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *        ways, such as by purpose, owner, or environment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *        ways, such as by purpose, owner, or environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see TaskSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @return The task ID.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withTaskId(String taskId) {
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
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

        if (obj instanceof TaskSummary == false)
            return false;
        TaskSummary other = (TaskSummary) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
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

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public TaskSummary clone() {
        try {
            return (TaskSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowdevicemanagement.model.transform.TaskSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

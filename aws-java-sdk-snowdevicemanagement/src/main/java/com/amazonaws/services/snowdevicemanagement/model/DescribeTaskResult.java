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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When the task was completed.
     * </p>
     */
    private java.util.Date completedAt;
    /**
     * <p>
     * When the <code>CreateTask</code> operation was called.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description provided of the task and managed devices.
     * </p>
     */
    private String description;
    /**
     * <p>
     * When the state of the task was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The current state of the task.
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
     * The managed devices that the task was sent to.
     * </p>
     */
    private java.util.List<String> targets;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The ID of the task.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * When the task was completed.
     * </p>
     * 
     * @param completedAt
     *        When the task was completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * When the task was completed.
     * </p>
     * 
     * @return When the task was completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * When the task was completed.
     * </p>
     * 
     * @param completedAt
     *        When the task was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * When the <code>CreateTask</code> operation was called.
     * </p>
     * 
     * @param createdAt
     *        When the <code>CreateTask</code> operation was called.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * When the <code>CreateTask</code> operation was called.
     * </p>
     * 
     * @return When the <code>CreateTask</code> operation was called.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * When the <code>CreateTask</code> operation was called.
     * </p>
     * 
     * @param createdAt
     *        When the <code>CreateTask</code> operation was called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description provided of the task and managed devices.
     * </p>
     * 
     * @param description
     *        The description provided of the task and managed devices.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description provided of the task and managed devices.
     * </p>
     * 
     * @return The description provided of the task and managed devices.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description provided of the task and managed devices.
     * </p>
     * 
     * @param description
     *        The description provided of the task and managed devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * When the state of the task was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the state of the task was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * When the state of the task was last updated.
     * </p>
     * 
     * @return When the state of the task was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * When the state of the task was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the state of the task was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The current state of the task.
     * </p>
     * 
     * @param state
     *        The current state of the task.
     * @see TaskState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the task.
     * </p>
     * 
     * @return The current state of the task.
     * @see TaskState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the task.
     * </p>
     * 
     * @param state
     *        The current state of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskState
     */

    public DescribeTaskResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the task.
     * </p>
     * 
     * @param state
     *        The current state of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskState
     */

    public DescribeTaskResult withState(TaskState state) {
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

    public DescribeTaskResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeTaskResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult addTagsEntry(String key, String value) {
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

    public DescribeTaskResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The managed devices that the task was sent to.
     * </p>
     * 
     * @return The managed devices that the task was sent to.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The managed devices that the task was sent to.
     * </p>
     * 
     * @param targets
     *        The managed devices that the task was sent to.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * The managed devices that the task was sent to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The managed devices that the task was sent to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The managed devices that the task was sent to.
     * </p>
     * 
     * @param targets
     *        The managed devices that the task was sent to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
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

    public DescribeTaskResult withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The ID of the task.
     * </p>
     * 
     * @param taskId
     *        The ID of the task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the task.
     * </p>
     * 
     * @return The ID of the task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the task.
     * </p>
     * 
     * @param taskId
     *        The ID of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withTaskId(String taskId) {
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
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
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

        if (obj instanceof DescribeTaskResult == false)
            return false;
        DescribeTaskResult other = (DescribeTaskResult) obj;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
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

        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTaskResult clone() {
        try {
            return (DescribeTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

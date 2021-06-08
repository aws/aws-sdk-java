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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a root volume replacement task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceRootVolumeTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceRootVolumeTask implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the root volume replacement task.
     * </p>
     */
    private String replaceRootVolumeTaskId;
    /**
     * <p>
     * The ID of the instance for which the root volume replacement task was created.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The state of the task. The task can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - the replacement volume is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in-progress</code> - the original volume is being detached and the replacement volume is being attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>succeeded</code> - the replacement volume has been successfully attached to the instance and the instance
     * is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing</code> - the replacement task is in the process of failing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - the replacement task has failed but the original root volume is still attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing-detached</code> - the replacement task is in the process of failing. The instance might have no
     * root volume attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed-detached</code> - the replacement task has failed and the instance has no root volume attached.
     * </p>
     * </li>
     * </ul>
     */
    private String taskState;
    /**
     * <p>
     * The time the task was started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The time the task completed.
     * </p>
     */
    private String completeTime;
    /**
     * <p>
     * The tags assigned to the task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the root volume replacement task.
     * </p>
     * 
     * @param replaceRootVolumeTaskId
     *        The ID of the root volume replacement task.
     */

    public void setReplaceRootVolumeTaskId(String replaceRootVolumeTaskId) {
        this.replaceRootVolumeTaskId = replaceRootVolumeTaskId;
    }

    /**
     * <p>
     * The ID of the root volume replacement task.
     * </p>
     * 
     * @return The ID of the root volume replacement task.
     */

    public String getReplaceRootVolumeTaskId() {
        return this.replaceRootVolumeTaskId;
    }

    /**
     * <p>
     * The ID of the root volume replacement task.
     * </p>
     * 
     * @param replaceRootVolumeTaskId
     *        The ID of the root volume replacement task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRootVolumeTask withReplaceRootVolumeTaskId(String replaceRootVolumeTaskId) {
        setReplaceRootVolumeTaskId(replaceRootVolumeTaskId);
        return this;
    }

    /**
     * <p>
     * The ID of the instance for which the root volume replacement task was created.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance for which the root volume replacement task was created.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance for which the root volume replacement task was created.
     * </p>
     * 
     * @return The ID of the instance for which the root volume replacement task was created.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance for which the root volume replacement task was created.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance for which the root volume replacement task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRootVolumeTask withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The state of the task. The task can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - the replacement volume is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in-progress</code> - the original volume is being detached and the replacement volume is being attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>succeeded</code> - the replacement volume has been successfully attached to the instance and the instance
     * is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing</code> - the replacement task is in the process of failing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - the replacement task has failed but the original root volume is still attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing-detached</code> - the replacement task is in the process of failing. The instance might have no
     * root volume attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed-detached</code> - the replacement task has failed and the instance has no root volume attached.
     * </p>
     * </li>
     * </ul>
     * 
     * @param taskState
     *        The state of the task. The task can be in one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - the replacement volume is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>in-progress</code> - the original volume is being detached and the replacement volume is being
     *        attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>succeeded</code> - the replacement volume has been successfully attached to the instance and the
     *        instance is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failing</code> - the replacement task is in the process of failing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - the replacement task has failed but the original root volume is still attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failing-detached</code> - the replacement task is in the process of failing. The instance might have
     *        no root volume attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed-detached</code> - the replacement task has failed and the instance has no root volume
     *        attached.
     *        </p>
     *        </li>
     * @see ReplaceRootVolumeTaskState
     */

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    /**
     * <p>
     * The state of the task. The task can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - the replacement volume is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in-progress</code> - the original volume is being detached and the replacement volume is being attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>succeeded</code> - the replacement volume has been successfully attached to the instance and the instance
     * is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing</code> - the replacement task is in the process of failing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - the replacement task has failed but the original root volume is still attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing-detached</code> - the replacement task is in the process of failing. The instance might have no
     * root volume attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed-detached</code> - the replacement task has failed and the instance has no root volume attached.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the task. The task can be in one of the following states:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pending</code> - the replacement volume is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>in-progress</code> - the original volume is being detached and the replacement volume is being
     *         attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>succeeded</code> - the replacement volume has been successfully attached to the instance and the
     *         instance is available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failing</code> - the replacement task is in the process of failing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code> - the replacement task has failed but the original root volume is still attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failing-detached</code> - the replacement task is in the process of failing. The instance might
     *         have no root volume attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed-detached</code> - the replacement task has failed and the instance has no root volume
     *         attached.
     *         </p>
     *         </li>
     * @see ReplaceRootVolumeTaskState
     */

    public String getTaskState() {
        return this.taskState;
    }

    /**
     * <p>
     * The state of the task. The task can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - the replacement volume is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in-progress</code> - the original volume is being detached and the replacement volume is being attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>succeeded</code> - the replacement volume has been successfully attached to the instance and the instance
     * is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing</code> - the replacement task is in the process of failing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - the replacement task has failed but the original root volume is still attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing-detached</code> - the replacement task is in the process of failing. The instance might have no
     * root volume attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed-detached</code> - the replacement task has failed and the instance has no root volume attached.
     * </p>
     * </li>
     * </ul>
     * 
     * @param taskState
     *        The state of the task. The task can be in one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - the replacement volume is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>in-progress</code> - the original volume is being detached and the replacement volume is being
     *        attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>succeeded</code> - the replacement volume has been successfully attached to the instance and the
     *        instance is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failing</code> - the replacement task is in the process of failing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - the replacement task has failed but the original root volume is still attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failing-detached</code> - the replacement task is in the process of failing. The instance might have
     *        no root volume attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed-detached</code> - the replacement task has failed and the instance has no root volume
     *        attached.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplaceRootVolumeTaskState
     */

    public ReplaceRootVolumeTask withTaskState(String taskState) {
        setTaskState(taskState);
        return this;
    }

    /**
     * <p>
     * The state of the task. The task can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - the replacement volume is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in-progress</code> - the original volume is being detached and the replacement volume is being attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>succeeded</code> - the replacement volume has been successfully attached to the instance and the instance
     * is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing</code> - the replacement task is in the process of failing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - the replacement task has failed but the original root volume is still attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failing-detached</code> - the replacement task is in the process of failing. The instance might have no
     * root volume attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed-detached</code> - the replacement task has failed and the instance has no root volume attached.
     * </p>
     * </li>
     * </ul>
     * 
     * @param taskState
     *        The state of the task. The task can be in one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - the replacement volume is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>in-progress</code> - the original volume is being detached and the replacement volume is being
     *        attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>succeeded</code> - the replacement volume has been successfully attached to the instance and the
     *        instance is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failing</code> - the replacement task is in the process of failing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - the replacement task has failed but the original root volume is still attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failing-detached</code> - the replacement task is in the process of failing. The instance might have
     *        no root volume attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed-detached</code> - the replacement task has failed and the instance has no root volume
     *        attached.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplaceRootVolumeTaskState
     */

    public ReplaceRootVolumeTask withTaskState(ReplaceRootVolumeTaskState taskState) {
        this.taskState = taskState.toString();
        return this;
    }

    /**
     * <p>
     * The time the task was started.
     * </p>
     * 
     * @param startTime
     *        The time the task was started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the task was started.
     * </p>
     * 
     * @return The time the task was started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the task was started.
     * </p>
     * 
     * @param startTime
     *        The time the task was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRootVolumeTask withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time the task completed.
     * </p>
     * 
     * @param completeTime
     *        The time the task completed.
     */

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    /**
     * <p>
     * The time the task completed.
     * </p>
     * 
     * @return The time the task completed.
     */

    public String getCompleteTime() {
        return this.completeTime;
    }

    /**
     * <p>
     * The time the task completed.
     * </p>
     * 
     * @param completeTime
     *        The time the task completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRootVolumeTask withCompleteTime(String completeTime) {
        setCompleteTime(completeTime);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the task.
     * </p>
     * 
     * @return The tags assigned to the task.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the task.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the task.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRootVolumeTask withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the task.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRootVolumeTask withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getReplaceRootVolumeTaskId() != null)
            sb.append("ReplaceRootVolumeTaskId: ").append(getReplaceRootVolumeTaskId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTaskState() != null)
            sb.append("TaskState: ").append(getTaskState()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCompleteTime() != null)
            sb.append("CompleteTime: ").append(getCompleteTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceRootVolumeTask == false)
            return false;
        ReplaceRootVolumeTask other = (ReplaceRootVolumeTask) obj;
        if (other.getReplaceRootVolumeTaskId() == null ^ this.getReplaceRootVolumeTaskId() == null)
            return false;
        if (other.getReplaceRootVolumeTaskId() != null && other.getReplaceRootVolumeTaskId().equals(this.getReplaceRootVolumeTaskId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTaskState() == null ^ this.getTaskState() == null)
            return false;
        if (other.getTaskState() != null && other.getTaskState().equals(this.getTaskState()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCompleteTime() == null ^ this.getCompleteTime() == null)
            return false;
        if (other.getCompleteTime() != null && other.getCompleteTime().equals(this.getCompleteTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplaceRootVolumeTaskId() == null) ? 0 : getReplaceRootVolumeTaskId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTaskState() == null) ? 0 : getTaskState().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompleteTime() == null) ? 0 : getCompleteTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceRootVolumeTask clone() {
        try {
            return (ReplaceRootVolumeTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

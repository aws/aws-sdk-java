/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The overrides associated with a task.
 * </p>
 */
public class TaskOverride implements Serializable, Cloneable {

    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerOverride> containerOverrides;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role.
     * </p>
     */
    private String taskRoleArn;

    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     * 
     * @return One or more container overrides sent to a task.
     */

    public java.util.List<ContainerOverride> getContainerOverrides() {
        if (containerOverrides == null) {
            containerOverrides = new com.amazonaws.internal.SdkInternalList<ContainerOverride>();
        }
        return containerOverrides;
    }

    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     * 
     * @param containerOverrides
     *        One or more container overrides sent to a task.
     */

    public void setContainerOverrides(java.util.Collection<ContainerOverride> containerOverrides) {
        if (containerOverrides == null) {
            this.containerOverrides = null;
            return;
        }

        this.containerOverrides = new com.amazonaws.internal.SdkInternalList<ContainerOverride>(containerOverrides);
    }

    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerOverrides(java.util.Collection)} or {@link #withContainerOverrides(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerOverrides
     *        One or more container overrides sent to a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskOverride withContainerOverrides(ContainerOverride... containerOverrides) {
        if (this.containerOverrides == null) {
            setContainerOverrides(new com.amazonaws.internal.SdkInternalList<ContainerOverride>(containerOverrides.length));
        }
        for (ContainerOverride ele : containerOverrides) {
            this.containerOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     * 
     * @param containerOverrides
     *        One or more container overrides sent to a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskOverride withContainerOverrides(java.util.Collection<ContainerOverride> containerOverrides) {
        setContainerOverrides(containerOverrides);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role.
     * </p>
     * 
     * @param taskRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in
     *        this task are granted the permissions that are specified in this role.
     */

    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in
     *         this task are granted the permissions that are specified in this role.
     */

    public String getTaskRoleArn() {
        return this.taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role.
     * </p>
     * 
     * @param taskRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in
     *        this task are granted the permissions that are specified in this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskOverride withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContainerOverrides() != null)
            sb.append("ContainerOverrides: " + getContainerOverrides() + ",");
        if (getTaskRoleArn() != null)
            sb.append("TaskRoleArn: " + getTaskRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskOverride == false)
            return false;
        TaskOverride other = (TaskOverride) obj;
        if (other.getContainerOverrides() == null ^ this.getContainerOverrides() == null)
            return false;
        if (other.getContainerOverrides() != null && other.getContainerOverrides().equals(this.getContainerOverrides()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerOverrides() == null) ? 0 : getContainerOverrides().hashCode());
        hashCode = prime * hashCode + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public TaskOverride clone() {
        try {
            return (TaskOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

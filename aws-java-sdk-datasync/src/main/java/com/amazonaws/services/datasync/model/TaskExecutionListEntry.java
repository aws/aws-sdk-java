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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single entry in a list of DataSync task executions that's returned with the <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_ListTaskExecutions.html">ListTaskExecutions</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TaskExecutionListEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskExecutionListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a task execution.
     * </p>
     */
    private String taskExecutionArn;
    /**
     * <p>
     * The status of a task execution. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-execution-statuses"
     * >Task execution statuses</a>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a task execution.
     * </p>
     * 
     * @param taskExecutionArn
     *        The Amazon Resource Name (ARN) of a task execution.
     */

    public void setTaskExecutionArn(String taskExecutionArn) {
        this.taskExecutionArn = taskExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a task execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a task execution.
     */

    public String getTaskExecutionArn() {
        return this.taskExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a task execution.
     * </p>
     * 
     * @param taskExecutionArn
     *        The Amazon Resource Name (ARN) of a task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskExecutionListEntry withTaskExecutionArn(String taskExecutionArn) {
        setTaskExecutionArn(taskExecutionArn);
        return this;
    }

    /**
     * <p>
     * The status of a task execution. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-execution-statuses"
     * >Task execution statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of a task execution. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-execution-statuses"
     *        >Task execution statuses</a>.
     * @see TaskExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a task execution. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-execution-statuses"
     * >Task execution statuses</a>.
     * </p>
     * 
     * @return The status of a task execution. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-execution-statuses"
     *         >Task execution statuses</a>.
     * @see TaskExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a task execution. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-execution-statuses"
     * >Task execution statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of a task execution. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-execution-statuses"
     *        >Task execution statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskExecutionStatus
     */

    public TaskExecutionListEntry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a task execution. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-execution-statuses"
     * >Task execution statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of a task execution. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-execution-statuses"
     *        >Task execution statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskExecutionStatus
     */

    public TaskExecutionListEntry withStatus(TaskExecutionStatus status) {
        this.status = status.toString();
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
        if (getTaskExecutionArn() != null)
            sb.append("TaskExecutionArn: ").append(getTaskExecutionArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskExecutionListEntry == false)
            return false;
        TaskExecutionListEntry other = (TaskExecutionListEntry) obj;
        if (other.getTaskExecutionArn() == null ^ this.getTaskExecutionArn() == null)
            return false;
        if (other.getTaskExecutionArn() != null && other.getTaskExecutionArn().equals(this.getTaskExecutionArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskExecutionArn() == null) ? 0 : getTaskExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public TaskExecutionListEntry clone() {
        try {
            return (TaskExecutionListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.TaskExecutionListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

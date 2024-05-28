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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gets the details of a network operation.
 * </p>
 * <p>
 * A network operation is any operation that is done to your network, such as network instance instantiation or
 * termination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkOperationTaskDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolNetworkOperationTaskDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Context for the network operation task.
     * </p>
     */
    private java.util.Map<String, String> taskContext;
    /**
     * <p>
     * Task end time.
     * </p>
     */
    private java.util.Date taskEndTime;
    /**
     * <p>
     * Task error details.
     * </p>
     */
    private ErrorInfo taskErrorDetails;
    /**
     * <p>
     * Task name.
     * </p>
     */
    private String taskName;
    /**
     * <p>
     * Task start time.
     * </p>
     */
    private java.util.Date taskStartTime;
    /**
     * <p>
     * Task status.
     * </p>
     */
    private String taskStatus;

    /**
     * <p>
     * Context for the network operation task.
     * </p>
     * 
     * @return Context for the network operation task.
     */

    public java.util.Map<String, String> getTaskContext() {
        return taskContext;
    }

    /**
     * <p>
     * Context for the network operation task.
     * </p>
     * 
     * @param taskContext
     *        Context for the network operation task.
     */

    public void setTaskContext(java.util.Map<String, String> taskContext) {
        this.taskContext = taskContext;
    }

    /**
     * <p>
     * Context for the network operation task.
     * </p>
     * 
     * @param taskContext
     *        Context for the network operation task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationTaskDetails withTaskContext(java.util.Map<String, String> taskContext) {
        setTaskContext(taskContext);
        return this;
    }

    /**
     * Add a single TaskContext entry
     *
     * @see GetSolNetworkOperationTaskDetails#withTaskContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationTaskDetails addTaskContextEntry(String key, String value) {
        if (null == this.taskContext) {
            this.taskContext = new java.util.HashMap<String, String>();
        }
        if (this.taskContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.taskContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TaskContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationTaskDetails clearTaskContextEntries() {
        this.taskContext = null;
        return this;
    }

    /**
     * <p>
     * Task end time.
     * </p>
     * 
     * @param taskEndTime
     *        Task end time.
     */

    public void setTaskEndTime(java.util.Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    /**
     * <p>
     * Task end time.
     * </p>
     * 
     * @return Task end time.
     */

    public java.util.Date getTaskEndTime() {
        return this.taskEndTime;
    }

    /**
     * <p>
     * Task end time.
     * </p>
     * 
     * @param taskEndTime
     *        Task end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationTaskDetails withTaskEndTime(java.util.Date taskEndTime) {
        setTaskEndTime(taskEndTime);
        return this;
    }

    /**
     * <p>
     * Task error details.
     * </p>
     * 
     * @param taskErrorDetails
     *        Task error details.
     */

    public void setTaskErrorDetails(ErrorInfo taskErrorDetails) {
        this.taskErrorDetails = taskErrorDetails;
    }

    /**
     * <p>
     * Task error details.
     * </p>
     * 
     * @return Task error details.
     */

    public ErrorInfo getTaskErrorDetails() {
        return this.taskErrorDetails;
    }

    /**
     * <p>
     * Task error details.
     * </p>
     * 
     * @param taskErrorDetails
     *        Task error details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationTaskDetails withTaskErrorDetails(ErrorInfo taskErrorDetails) {
        setTaskErrorDetails(taskErrorDetails);
        return this;
    }

    /**
     * <p>
     * Task name.
     * </p>
     * 
     * @param taskName
     *        Task name.
     */

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * <p>
     * Task name.
     * </p>
     * 
     * @return Task name.
     */

    public String getTaskName() {
        return this.taskName;
    }

    /**
     * <p>
     * Task name.
     * </p>
     * 
     * @param taskName
     *        Task name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationTaskDetails withTaskName(String taskName) {
        setTaskName(taskName);
        return this;
    }

    /**
     * <p>
     * Task start time.
     * </p>
     * 
     * @param taskStartTime
     *        Task start time.
     */

    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * Task start time.
     * </p>
     * 
     * @return Task start time.
     */

    public java.util.Date getTaskStartTime() {
        return this.taskStartTime;
    }

    /**
     * <p>
     * Task start time.
     * </p>
     * 
     * @param taskStartTime
     *        Task start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationTaskDetails withTaskStartTime(java.util.Date taskStartTime) {
        setTaskStartTime(taskStartTime);
        return this;
    }

    /**
     * <p>
     * Task status.
     * </p>
     * 
     * @param taskStatus
     *        Task status.
     * @see TaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * Task status.
     * </p>
     * 
     * @return Task status.
     * @see TaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * Task status.
     * </p>
     * 
     * @param taskStatus
     *        Task status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public GetSolNetworkOperationTaskDetails withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * Task status.
     * </p>
     * 
     * @param taskStatus
     *        Task status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public GetSolNetworkOperationTaskDetails withTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
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
        if (getTaskContext() != null)
            sb.append("TaskContext: ").append(getTaskContext()).append(",");
        if (getTaskEndTime() != null)
            sb.append("TaskEndTime: ").append(getTaskEndTime()).append(",");
        if (getTaskErrorDetails() != null)
            sb.append("TaskErrorDetails: ").append(getTaskErrorDetails()).append(",");
        if (getTaskName() != null)
            sb.append("TaskName: ").append(getTaskName()).append(",");
        if (getTaskStartTime() != null)
            sb.append("TaskStartTime: ").append(getTaskStartTime()).append(",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolNetworkOperationTaskDetails == false)
            return false;
        GetSolNetworkOperationTaskDetails other = (GetSolNetworkOperationTaskDetails) obj;
        if (other.getTaskContext() == null ^ this.getTaskContext() == null)
            return false;
        if (other.getTaskContext() != null && other.getTaskContext().equals(this.getTaskContext()) == false)
            return false;
        if (other.getTaskEndTime() == null ^ this.getTaskEndTime() == null)
            return false;
        if (other.getTaskEndTime() != null && other.getTaskEndTime().equals(this.getTaskEndTime()) == false)
            return false;
        if (other.getTaskErrorDetails() == null ^ this.getTaskErrorDetails() == null)
            return false;
        if (other.getTaskErrorDetails() != null && other.getTaskErrorDetails().equals(this.getTaskErrorDetails()) == false)
            return false;
        if (other.getTaskName() == null ^ this.getTaskName() == null)
            return false;
        if (other.getTaskName() != null && other.getTaskName().equals(this.getTaskName()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskContext() == null) ? 0 : getTaskContext().hashCode());
        hashCode = prime * hashCode + ((getTaskEndTime() == null) ? 0 : getTaskEndTime().hashCode());
        hashCode = prime * hashCode + ((getTaskErrorDetails() == null) ? 0 : getTaskErrorDetails().hashCode());
        hashCode = prime * hashCode + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        hashCode = prime * hashCode + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetSolNetworkOperationTaskDetails clone() {
        try {
            return (GetSolNetworkOperationTaskDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.GetSolNetworkOperationTaskDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

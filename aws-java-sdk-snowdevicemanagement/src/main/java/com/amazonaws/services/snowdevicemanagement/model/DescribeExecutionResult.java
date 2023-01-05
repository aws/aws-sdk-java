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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the execution.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * When the status of the execution was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The ID of the managed device that the task is being executed on.
     * </p>
     */
    private String managedDeviceId;
    /**
     * <p>
     * When the execution began.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The current state of the execution.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ID of the task being executed on the device.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The ID of the execution.
     * </p>
     * 
     * @param executionId
     *        The ID of the execution.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The ID of the execution.
     * </p>
     * 
     * @return The ID of the execution.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The ID of the execution.
     * </p>
     * 
     * @param executionId
     *        The ID of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * When the status of the execution was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the status of the execution was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * When the status of the execution was last updated.
     * </p>
     * 
     * @return When the status of the execution was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * When the status of the execution was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the status of the execution was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The ID of the managed device that the task is being executed on.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the managed device that the task is being executed on.
     */

    public void setManagedDeviceId(String managedDeviceId) {
        this.managedDeviceId = managedDeviceId;
    }

    /**
     * <p>
     * The ID of the managed device that the task is being executed on.
     * </p>
     * 
     * @return The ID of the managed device that the task is being executed on.
     */

    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }

    /**
     * <p>
     * The ID of the managed device that the task is being executed on.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the managed device that the task is being executed on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withManagedDeviceId(String managedDeviceId) {
        setManagedDeviceId(managedDeviceId);
        return this;
    }

    /**
     * <p>
     * When the execution began.
     * </p>
     * 
     * @param startedAt
     *        When the execution began.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * When the execution began.
     * </p>
     * 
     * @return When the execution began.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * When the execution began.
     * </p>
     * 
     * @param startedAt
     *        When the execution began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The current state of the execution.
     * </p>
     * 
     * @param state
     *        The current state of the execution.
     * @see ExecutionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the execution.
     * </p>
     * 
     * @return The current state of the execution.
     * @see ExecutionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the execution.
     * </p>
     * 
     * @param state
     *        The current state of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionState
     */

    public DescribeExecutionResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the execution.
     * </p>
     * 
     * @param state
     *        The current state of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionState
     */

    public DescribeExecutionResult withState(ExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the task being executed on the device.
     * </p>
     * 
     * @param taskId
     *        The ID of the task being executed on the device.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the task being executed on the device.
     * </p>
     * 
     * @return The ID of the task being executed on the device.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the task being executed on the device.
     * </p>
     * 
     * @param taskId
     *        The ID of the task being executed on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withTaskId(String taskId) {
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
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getManagedDeviceId() != null)
            sb.append("ManagedDeviceId: ").append(getManagedDeviceId()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof DescribeExecutionResult == false)
            return false;
        DescribeExecutionResult other = (DescribeExecutionResult) obj;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getManagedDeviceId() == null ^ this.getManagedDeviceId() == null)
            return false;
        if (other.getManagedDeviceId() != null && other.getManagedDeviceId().equals(this.getManagedDeviceId()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getManagedDeviceId() == null) ? 0 : getManagedDeviceId().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExecutionResult clone() {
        try {
            return (DescribeExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

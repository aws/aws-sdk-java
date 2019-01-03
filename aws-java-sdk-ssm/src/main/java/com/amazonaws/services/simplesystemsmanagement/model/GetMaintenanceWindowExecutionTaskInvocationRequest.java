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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTaskInvocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowExecutionTaskInvocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Maintenance Window execution for which the task is a part.
     * </p>
     */
    private String windowExecutionId;
    /**
     * <p>
     * The ID of the specific task in the Maintenance Window task that should be retrieved.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The invocation ID to retrieve.
     * </p>
     */
    private String invocationId;

    /**
     * <p>
     * The ID of the Maintenance Window execution for which the task is a part.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the Maintenance Window execution for which the task is a part.
     */

    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window execution for which the task is a part.
     * </p>
     * 
     * @return The ID of the Maintenance Window execution for which the task is a part.
     */

    public String getWindowExecutionId() {
        return this.windowExecutionId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window execution for which the task is a part.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the Maintenance Window execution for which the task is a part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationRequest withWindowExecutionId(String windowExecutionId) {
        setWindowExecutionId(windowExecutionId);
        return this;
    }

    /**
     * <p>
     * The ID of the specific task in the Maintenance Window task that should be retrieved.
     * </p>
     * 
     * @param taskId
     *        The ID of the specific task in the Maintenance Window task that should be retrieved.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the specific task in the Maintenance Window task that should be retrieved.
     * </p>
     * 
     * @return The ID of the specific task in the Maintenance Window task that should be retrieved.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the specific task in the Maintenance Window task that should be retrieved.
     * </p>
     * 
     * @param taskId
     *        The ID of the specific task in the Maintenance Window task that should be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The invocation ID to retrieve.
     * </p>
     * 
     * @param invocationId
     *        The invocation ID to retrieve.
     */

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    /**
     * <p>
     * The invocation ID to retrieve.
     * </p>
     * 
     * @return The invocation ID to retrieve.
     */

    public String getInvocationId() {
        return this.invocationId;
    }

    /**
     * <p>
     * The invocation ID to retrieve.
     * </p>
     * 
     * @param invocationId
     *        The invocation ID to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationRequest withInvocationId(String invocationId) {
        setInvocationId(invocationId);
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
        if (getWindowExecutionId() != null)
            sb.append("WindowExecutionId: ").append(getWindowExecutionId()).append(",");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getInvocationId() != null)
            sb.append("InvocationId: ").append(getInvocationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMaintenanceWindowExecutionTaskInvocationRequest == false)
            return false;
        GetMaintenanceWindowExecutionTaskInvocationRequest other = (GetMaintenanceWindowExecutionTaskInvocationRequest) obj;
        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null)
            return false;
        if (other.getWindowExecutionId() != null && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getInvocationId() == null ^ this.getInvocationId() == null)
            return false;
        if (other.getInvocationId() != null && other.getInvocationId().equals(this.getInvocationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getInvocationId() == null) ? 0 : getInvocationId().hashCode());
        return hashCode;
    }

    @Override
    public GetMaintenanceWindowExecutionTaskInvocationRequest clone() {
        return (GetMaintenanceWindowExecutionTaskInvocationRequest) super.clone();
    }

}

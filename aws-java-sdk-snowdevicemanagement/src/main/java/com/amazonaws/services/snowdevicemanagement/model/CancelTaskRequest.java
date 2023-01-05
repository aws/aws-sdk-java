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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CancelTask" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the task that you are attempting to cancel. You can retrieve a task ID by using the
     * <code>ListTasks</code> operation.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The ID of the task that you are attempting to cancel. You can retrieve a task ID by using the
     * <code>ListTasks</code> operation.
     * </p>
     * 
     * @param taskId
     *        The ID of the task that you are attempting to cancel. You can retrieve a task ID by using the
     *        <code>ListTasks</code> operation.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the task that you are attempting to cancel. You can retrieve a task ID by using the
     * <code>ListTasks</code> operation.
     * </p>
     * 
     * @return The ID of the task that you are attempting to cancel. You can retrieve a task ID by using the
     *         <code>ListTasks</code> operation.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the task that you are attempting to cancel. You can retrieve a task ID by using the
     * <code>ListTasks</code> operation.
     * </p>
     * 
     * @param taskId
     *        The ID of the task that you are attempting to cancel. You can retrieve a task ID by using the
     *        <code>ListTasks</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelTaskRequest withTaskId(String taskId) {
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

        if (obj instanceof CancelTaskRequest == false)
            return false;
        CancelTaskRequest other = (CancelTaskRequest) obj;
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

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public CancelTaskRequest clone() {
        return (CancelTaskRequest) super.clone();
    }

}

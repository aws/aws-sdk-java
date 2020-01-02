/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CancelDataRepositoryTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelDataRepositoryTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycle;
    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the data repository task, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx has not started the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXECUTING</code> - Amazon FSx is processing the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the
     *        task failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information
     *        about task failures.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - FSx completed the task successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELING</code> - FSx is in process of canceling the task.
     *        </p>
     *        </li>
     * @see DataRepositoryTaskLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The lifecycle status of the data repository task, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Amazon FSx has not started the task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXECUTING</code> - Amazon FSx is processing the task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the
     *         task failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information
     *         about task failures.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - FSx completed the task successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELING</code> - FSx is in process of canceling the task.
     *         </p>
     *         </li>
     * @see DataRepositoryTaskLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the data repository task, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx has not started the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXECUTING</code> - Amazon FSx is processing the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the
     *        task failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information
     *        about task failures.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - FSx completed the task successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELING</code> - FSx is in process of canceling the task.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryTaskLifecycle
     */

    public CancelDataRepositoryTaskResult withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the data repository task, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx has not started the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXECUTING</code> - Amazon FSx is processing the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the
     *        task failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information
     *        about task failures.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - FSx completed the task successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELING</code> - FSx is in process of canceling the task.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryTaskLifecycle
     */

    public CancelDataRepositoryTaskResult withLifecycle(DataRepositoryTaskLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * 
     * @param taskId
     *        The ID of the task being canceled.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * 
     * @return The ID of the task being canceled.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the task being canceled.
     * </p>
     * 
     * @param taskId
     *        The ID of the task being canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelDataRepositoryTaskResult withTaskId(String taskId) {
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
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

        if (obj instanceof CancelDataRepositoryTaskResult == false)
            return false;
        CancelDataRepositoryTaskResult other = (CancelDataRepositoryTaskResult) obj;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
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

        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public CancelDataRepositoryTaskResult clone() {
        try {
            return (CancelDataRepositoryTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

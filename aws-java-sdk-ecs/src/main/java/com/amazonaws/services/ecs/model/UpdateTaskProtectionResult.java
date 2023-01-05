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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateTaskProtection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTaskProtectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of tasks with the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>taskArn</code>: The task ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protectionEnabled</code>: The protection status of the task. If scale-in protection is enabled for a task,
     * the value is <code>true</code>. Otherwise, it is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expirationDate</code>: The epoch time when protection for the task will expire.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<ProtectedTask> protectedTasks;
    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Failure> failures;

    /**
     * <p>
     * A list of tasks with the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>taskArn</code>: The task ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protectionEnabled</code>: The protection status of the task. If scale-in protection is enabled for a task,
     * the value is <code>true</code>. Otherwise, it is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expirationDate</code>: The epoch time when protection for the task will expire.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of tasks with the following information.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>taskArn</code>: The task ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>protectionEnabled</code>: The protection status of the task. If scale-in protection is enabled for
     *         a task, the value is <code>true</code>. Otherwise, it is <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expirationDate</code>: The epoch time when protection for the task will expire.
     *         </p>
     *         </li>
     */

    public java.util.List<ProtectedTask> getProtectedTasks() {
        if (protectedTasks == null) {
            protectedTasks = new com.amazonaws.internal.SdkInternalList<ProtectedTask>();
        }
        return protectedTasks;
    }

    /**
     * <p>
     * A list of tasks with the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>taskArn</code>: The task ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protectionEnabled</code>: The protection status of the task. If scale-in protection is enabled for a task,
     * the value is <code>true</code>. Otherwise, it is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expirationDate</code>: The epoch time when protection for the task will expire.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protectedTasks
     *        A list of tasks with the following information.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>taskArn</code>: The task ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>protectionEnabled</code>: The protection status of the task. If scale-in protection is enabled for a
     *        task, the value is <code>true</code>. Otherwise, it is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expirationDate</code>: The epoch time when protection for the task will expire.
     *        </p>
     *        </li>
     */

    public void setProtectedTasks(java.util.Collection<ProtectedTask> protectedTasks) {
        if (protectedTasks == null) {
            this.protectedTasks = null;
            return;
        }

        this.protectedTasks = new com.amazonaws.internal.SdkInternalList<ProtectedTask>(protectedTasks);
    }

    /**
     * <p>
     * A list of tasks with the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>taskArn</code>: The task ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protectionEnabled</code>: The protection status of the task. If scale-in protection is enabled for a task,
     * the value is <code>true</code>. Otherwise, it is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expirationDate</code>: The epoch time when protection for the task will expire.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtectedTasks(java.util.Collection)} or {@link #withProtectedTasks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param protectedTasks
     *        A list of tasks with the following information.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>taskArn</code>: The task ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>protectionEnabled</code>: The protection status of the task. If scale-in protection is enabled for a
     *        task, the value is <code>true</code>. Otherwise, it is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expirationDate</code>: The epoch time when protection for the task will expire.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskProtectionResult withProtectedTasks(ProtectedTask... protectedTasks) {
        if (this.protectedTasks == null) {
            setProtectedTasks(new com.amazonaws.internal.SdkInternalList<ProtectedTask>(protectedTasks.length));
        }
        for (ProtectedTask ele : protectedTasks) {
            this.protectedTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tasks with the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>taskArn</code>: The task ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protectionEnabled</code>: The protection status of the task. If scale-in protection is enabled for a task,
     * the value is <code>true</code>. Otherwise, it is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expirationDate</code>: The epoch time when protection for the task will expire.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protectedTasks
     *        A list of tasks with the following information.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>taskArn</code>: The task ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>protectionEnabled</code>: The protection status of the task. If scale-in protection is enabled for a
     *        task, the value is <code>true</code>. Otherwise, it is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expirationDate</code>: The epoch time when protection for the task will expire.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskProtectionResult withProtectedTasks(java.util.Collection<ProtectedTask> protectedTasks) {
        setProtectedTasks(protectedTasks);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @return Any failures associated with the call.
     */

    public java.util.List<Failure> getFailures() {
        if (failures == null) {
            failures = new com.amazonaws.internal.SdkInternalList<Failure>();
        }
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     */

    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new com.amazonaws.internal.SdkInternalList<Failure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskProtectionResult withFailures(Failure... failures) {
        if (this.failures == null) {
            setFailures(new com.amazonaws.internal.SdkInternalList<Failure>(failures.length));
        }
        for (Failure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskProtectionResult withFailures(java.util.Collection<Failure> failures) {
        setFailures(failures);
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
        if (getProtectedTasks() != null)
            sb.append("ProtectedTasks: ").append(getProtectedTasks()).append(",");
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTaskProtectionResult == false)
            return false;
        UpdateTaskProtectionResult other = (UpdateTaskProtectionResult) obj;
        if (other.getProtectedTasks() == null ^ this.getProtectedTasks() == null)
            return false;
        if (other.getProtectedTasks() != null && other.getProtectedTasks().equals(this.getProtectedTasks()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectedTasks() == null) ? 0 : getProtectedTasks().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTaskProtectionResult clone() {
        try {
            return (UpdateTaskProtectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

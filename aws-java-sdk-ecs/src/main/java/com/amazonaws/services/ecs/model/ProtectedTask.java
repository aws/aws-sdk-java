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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the protection status details for a task. You can set the protection status with the
 * <a>UpdateTaskProtection</a> API and get the status of tasks with the <a>GetTaskProtection</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ProtectedTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The task ARN.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The protection status of the task. If scale-in protection is enabled for a task, the value is <code>true</code>.
     * Otherwise, it is <code>false</code>.
     * </p>
     */
    private Boolean protectionEnabled;
    /**
     * <p>
     * The epoch time when protection for the task will expire.
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * The task ARN.
     * </p>
     * 
     * @param taskArn
     *        The task ARN.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The task ARN.
     * </p>
     * 
     * @return The task ARN.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The task ARN.
     * </p>
     * 
     * @param taskArn
     *        The task ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedTask withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The protection status of the task. If scale-in protection is enabled for a task, the value is <code>true</code>.
     * Otherwise, it is <code>false</code>.
     * </p>
     * 
     * @param protectionEnabled
     *        The protection status of the task. If scale-in protection is enabled for a task, the value is
     *        <code>true</code>. Otherwise, it is <code>false</code>.
     */

    public void setProtectionEnabled(Boolean protectionEnabled) {
        this.protectionEnabled = protectionEnabled;
    }

    /**
     * <p>
     * The protection status of the task. If scale-in protection is enabled for a task, the value is <code>true</code>.
     * Otherwise, it is <code>false</code>.
     * </p>
     * 
     * @return The protection status of the task. If scale-in protection is enabled for a task, the value is
     *         <code>true</code>. Otherwise, it is <code>false</code>.
     */

    public Boolean getProtectionEnabled() {
        return this.protectionEnabled;
    }

    /**
     * <p>
     * The protection status of the task. If scale-in protection is enabled for a task, the value is <code>true</code>.
     * Otherwise, it is <code>false</code>.
     * </p>
     * 
     * @param protectionEnabled
     *        The protection status of the task. If scale-in protection is enabled for a task, the value is
     *        <code>true</code>. Otherwise, it is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedTask withProtectionEnabled(Boolean protectionEnabled) {
        setProtectionEnabled(protectionEnabled);
        return this;
    }

    /**
     * <p>
     * The protection status of the task. If scale-in protection is enabled for a task, the value is <code>true</code>.
     * Otherwise, it is <code>false</code>.
     * </p>
     * 
     * @return The protection status of the task. If scale-in protection is enabled for a task, the value is
     *         <code>true</code>. Otherwise, it is <code>false</code>.
     */

    public Boolean isProtectionEnabled() {
        return this.protectionEnabled;
    }

    /**
     * <p>
     * The epoch time when protection for the task will expire.
     * </p>
     * 
     * @param expirationDate
     *        The epoch time when protection for the task will expire.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The epoch time when protection for the task will expire.
     * </p>
     * 
     * @return The epoch time when protection for the task will expire.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The epoch time when protection for the task will expire.
     * </p>
     * 
     * @param expirationDate
     *        The epoch time when protection for the task will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedTask withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
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
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getProtectionEnabled() != null)
            sb.append("ProtectionEnabled: ").append(getProtectionEnabled()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedTask == false)
            return false;
        ProtectedTask other = (ProtectedTask) obj;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getProtectionEnabled() == null ^ this.getProtectionEnabled() == null)
            return false;
        if (other.getProtectionEnabled() != null && other.getProtectionEnabled().equals(this.getProtectionEnabled()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getProtectionEnabled() == null) ? 0 : getProtectionEnabled().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedTask clone() {
        try {
            return (ProtectedTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ProtectedTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an audit mitigation actions task that is returned by <code>ListAuditMitigationActionsTasks</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditMitigationActionsTaskMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The time at which the audit mitigation actions task was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The current state of the audit mitigation actions task.
     * </p>
     */
    private String taskStatus;

    /**
     * <p>
     * The unique identifier for the task.
     * </p>
     * 
     * @param taskId
     *        The unique identifier for the task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The unique identifier for the task.
     * </p>
     * 
     * @return The unique identifier for the task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The unique identifier for the task.
     * </p>
     * 
     * @param taskId
     *        The unique identifier for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionsTaskMetadata withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The time at which the audit mitigation actions task was started.
     * </p>
     * 
     * @param startTime
     *        The time at which the audit mitigation actions task was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the audit mitigation actions task was started.
     * </p>
     * 
     * @return The time at which the audit mitigation actions task was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which the audit mitigation actions task was started.
     * </p>
     * 
     * @param startTime
     *        The time at which the audit mitigation actions task was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionsTaskMetadata withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The current state of the audit mitigation actions task.
     * </p>
     * 
     * @param taskStatus
     *        The current state of the audit mitigation actions task.
     * @see AuditMitigationActionsTaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The current state of the audit mitigation actions task.
     * </p>
     * 
     * @return The current state of the audit mitigation actions task.
     * @see AuditMitigationActionsTaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * The current state of the audit mitigation actions task.
     * </p>
     * 
     * @param taskStatus
     *        The current state of the audit mitigation actions task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsTaskStatus
     */

    public AuditMitigationActionsTaskMetadata withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the audit mitigation actions task.
     * </p>
     * 
     * @param taskStatus
     *        The current state of the audit mitigation actions task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsTaskStatus
     */

    public AuditMitigationActionsTaskMetadata withTaskStatus(AuditMitigationActionsTaskStatus taskStatus) {
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
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

        if (obj instanceof AuditMitigationActionsTaskMetadata == false)
            return false;
        AuditMitigationActionsTaskMetadata other = (AuditMitigationActionsTaskMetadata) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
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

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        return hashCode;
    }

    @Override
    public AuditMitigationActionsTaskMetadata clone() {
        try {
            return (AuditMitigationActionsTaskMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuditMitigationActionsTaskMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The audits that were performed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditTaskMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of this audit.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     */
    private String taskStatus;
    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     */
    private String taskType;

    /**
     * <p>
     * The ID of this audit.
     * </p>
     * 
     * @param taskId
     *        The ID of this audit.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of this audit.
     * </p>
     * 
     * @return The ID of this audit.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of this audit.
     * </p>
     * 
     * @param taskId
     *        The ID of this audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditTaskMetadata withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * 
     * @param taskStatus
     *        The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * @see AuditTaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * 
     * @return The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * @see AuditTaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * 
     * @param taskStatus
     *        The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditTaskStatus
     */

    public AuditTaskMetadata withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * 
     * @param taskStatus
     *        The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditTaskStatus
     */

    public AuditTaskMetadata withTaskStatus(AuditTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * 
     * @param taskType
     *        The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * @see AuditTaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * 
     * @return The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * @see AuditTaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * 
     * @param taskType
     *        The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditTaskType
     */

    public AuditTaskMetadata withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * </p>
     * 
     * @param taskType
     *        The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditTaskType
     */

    public AuditTaskMetadata withTaskType(AuditTaskType taskType) {
        this.taskType = taskType.toString();
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
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus()).append(",");
        if (getTaskType() != null)
            sb.append("TaskType: ").append(getTaskType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditTaskMetadata == false)
            return false;
        AuditTaskMetadata other = (AuditTaskMetadata) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        return hashCode;
    }

    @Override
    public AuditTaskMetadata clone() {
        try {
            return (AuditTaskMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuditTaskMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

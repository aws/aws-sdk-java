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
 * Returned by ListAuditMitigationActionsTask, this object contains information that describes a mitigation action that
 * has been started.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditMitigationActionExecutionMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the task that applies the mitigation action.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The unique identifier for the findings to which the task and associated mitigation action are applied.
     * </p>
     */
    private String findingId;
    /**
     * <p>
     * The friendly name of the mitigation action being applied by the task.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The unique identifier for the mitigation action being applied by the task.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time when the task was completed or canceled. Blank if the task is still running.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * If an error occurred, the code that indicates which type of error occurred.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * If an error occurred, a message that describes the error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The unique identifier for the task that applies the mitigation action.
     * </p>
     * 
     * @param taskId
     *        The unique identifier for the task that applies the mitigation action.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The unique identifier for the task that applies the mitigation action.
     * </p>
     * 
     * @return The unique identifier for the task that applies the mitigation action.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The unique identifier for the task that applies the mitigation action.
     * </p>
     * 
     * @param taskId
     *        The unique identifier for the task that applies the mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionExecutionMetadata withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the findings to which the task and associated mitigation action are applied.
     * </p>
     * 
     * @param findingId
     *        The unique identifier for the findings to which the task and associated mitigation action are applied.
     */

    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * The unique identifier for the findings to which the task and associated mitigation action are applied.
     * </p>
     * 
     * @return The unique identifier for the findings to which the task and associated mitigation action are applied.
     */

    public String getFindingId() {
        return this.findingId;
    }

    /**
     * <p>
     * The unique identifier for the findings to which the task and associated mitigation action are applied.
     * </p>
     * 
     * @param findingId
     *        The unique identifier for the findings to which the task and associated mitigation action are applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionExecutionMetadata withFindingId(String findingId) {
        setFindingId(findingId);
        return this;
    }

    /**
     * <p>
     * The friendly name of the mitigation action being applied by the task.
     * </p>
     * 
     * @param actionName
     *        The friendly name of the mitigation action being applied by the task.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name of the mitigation action being applied by the task.
     * </p>
     * 
     * @return The friendly name of the mitigation action being applied by the task.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The friendly name of the mitigation action being applied by the task.
     * </p>
     * 
     * @param actionName
     *        The friendly name of the mitigation action being applied by the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionExecutionMetadata withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the mitigation action being applied by the task.
     * </p>
     * 
     * @param actionId
     *        The unique identifier for the mitigation action being applied by the task.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The unique identifier for the mitigation action being applied by the task.
     * </p>
     * 
     * @return The unique identifier for the mitigation action being applied by the task.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * The unique identifier for the mitigation action being applied by the task.
     * </p>
     * 
     * @param actionId
     *        The unique identifier for the mitigation action being applied by the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionExecutionMetadata withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * 
     * @param status
     *        The current status of the task being executed.
     * @see AuditMitigationActionsExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * 
     * @return The current status of the task being executed.
     * @see AuditMitigationActionsExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * 
     * @param status
     *        The current status of the task being executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsExecutionStatus
     */

    public AuditMitigationActionExecutionMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the task being executed.
     * </p>
     * 
     * @param status
     *        The current status of the task being executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsExecutionStatus
     */

    public AuditMitigationActionExecutionMetadata withStatus(AuditMitigationActionsExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     * 
     * @param startTime
     *        The date and time when the task was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     * 
     * @return The date and time when the task was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time when the task was started.
     * </p>
     * 
     * @param startTime
     *        The date and time when the task was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionExecutionMetadata withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled. Blank if the task is still running.
     * </p>
     * 
     * @param endTime
     *        The date and time when the task was completed or canceled. Blank if the task is still running.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled. Blank if the task is still running.
     * </p>
     * 
     * @return The date and time when the task was completed or canceled. Blank if the task is still running.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time when the task was completed or canceled. Blank if the task is still running.
     * </p>
     * 
     * @param endTime
     *        The date and time when the task was completed or canceled. Blank if the task is still running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionExecutionMetadata withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * If an error occurred, the code that indicates which type of error occurred.
     * </p>
     * 
     * @param errorCode
     *        If an error occurred, the code that indicates which type of error occurred.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * If an error occurred, the code that indicates which type of error occurred.
     * </p>
     * 
     * @return If an error occurred, the code that indicates which type of error occurred.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * If an error occurred, the code that indicates which type of error occurred.
     * </p>
     * 
     * @param errorCode
     *        If an error occurred, the code that indicates which type of error occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionExecutionMetadata withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * If an error occurred, a message that describes the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, a message that describes the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If an error occurred, a message that describes the error.
     * </p>
     * 
     * @return If an error occurred, a message that describes the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If an error occurred, a message that describes the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, a message that describes the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionExecutionMetadata withMessage(String message) {
        setMessage(message);
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
        if (getFindingId() != null)
            sb.append("FindingId: ").append(getFindingId()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditMitigationActionExecutionMetadata == false)
            return false;
        AuditMitigationActionExecutionMetadata other = (AuditMitigationActionExecutionMetadata) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public AuditMitigationActionExecutionMetadata clone() {
        try {
            return (AuditMitigationActionExecutionMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuditMitigationActionExecutionMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

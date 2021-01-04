/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes which mitigation actions should be executed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectMitigationActionExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The unique identifier of the violation.
     * </p>
     */
    private String violationId;
    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The name of the thing.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The date a mitigation action was started.
     * </p>
     */
    private java.util.Date executionStartDate;
    /**
     * <p>
     * The date a mitigation action ended.
     * </p>
     */
    private java.util.Date executionEndDate;
    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The error code of a mitigation action.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The message of a mitigation action.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * 
     * @param taskId
     *        The unique identifier of the task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * 
     * @return The unique identifier of the task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * 
     * @param taskId
     *        The unique identifier of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionExecution withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the violation.
     * </p>
     * 
     * @param violationId
     *        The unique identifier of the violation.
     */

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    /**
     * <p>
     * The unique identifier of the violation.
     * </p>
     * 
     * @return The unique identifier of the violation.
     */

    public String getViolationId() {
        return this.violationId;
    }

    /**
     * <p>
     * The unique identifier of the violation.
     * </p>
     * 
     * @param violationId
     *        The unique identifier of the violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionExecution withViolationId(String violationId) {
        setViolationId(violationId);
        return this;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * 
     * @param actionName
     *        The friendly name that uniquely identifies the mitigation action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * 
     * @return The friendly name that uniquely identifies the mitigation action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * 
     * @param actionName
     *        The friendly name that uniquely identifies the mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionExecution withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @return The name of the thing.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionExecution withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The date a mitigation action was started.
     * </p>
     * 
     * @param executionStartDate
     *        The date a mitigation action was started.
     */

    public void setExecutionStartDate(java.util.Date executionStartDate) {
        this.executionStartDate = executionStartDate;
    }

    /**
     * <p>
     * The date a mitigation action was started.
     * </p>
     * 
     * @return The date a mitigation action was started.
     */

    public java.util.Date getExecutionStartDate() {
        return this.executionStartDate;
    }

    /**
     * <p>
     * The date a mitigation action was started.
     * </p>
     * 
     * @param executionStartDate
     *        The date a mitigation action was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionExecution withExecutionStartDate(java.util.Date executionStartDate) {
        setExecutionStartDate(executionStartDate);
        return this;
    }

    /**
     * <p>
     * The date a mitigation action ended.
     * </p>
     * 
     * @param executionEndDate
     *        The date a mitigation action ended.
     */

    public void setExecutionEndDate(java.util.Date executionEndDate) {
        this.executionEndDate = executionEndDate;
    }

    /**
     * <p>
     * The date a mitigation action ended.
     * </p>
     * 
     * @return The date a mitigation action ended.
     */

    public java.util.Date getExecutionEndDate() {
        return this.executionEndDate;
    }

    /**
     * <p>
     * The date a mitigation action ended.
     * </p>
     * 
     * @param executionEndDate
     *        The date a mitigation action ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionExecution withExecutionEndDate(java.util.Date executionEndDate) {
        setExecutionEndDate(executionEndDate);
        return this;
    }

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * 
     * @param status
     *        The status of a mitigation action.
     * @see DetectMitigationActionExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * 
     * @return The status of a mitigation action.
     * @see DetectMitigationActionExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * 
     * @param status
     *        The status of a mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectMitigationActionExecutionStatus
     */

    public DetectMitigationActionExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a mitigation action.
     * </p>
     * 
     * @param status
     *        The status of a mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectMitigationActionExecutionStatus
     */

    public DetectMitigationActionExecution withStatus(DetectMitigationActionExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error code of a mitigation action.
     * </p>
     * 
     * @param errorCode
     *        The error code of a mitigation action.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code of a mitigation action.
     * </p>
     * 
     * @return The error code of a mitigation action.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code of a mitigation action.
     * </p>
     * 
     * @param errorCode
     *        The error code of a mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionExecution withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The message of a mitigation action.
     * </p>
     * 
     * @param message
     *        The message of a mitigation action.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message of a mitigation action.
     * </p>
     * 
     * @return The message of a mitigation action.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message of a mitigation action.
     * </p>
     * 
     * @param message
     *        The message of a mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMitigationActionExecution withMessage(String message) {
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
        if (getViolationId() != null)
            sb.append("ViolationId: ").append(getViolationId()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getExecutionStartDate() != null)
            sb.append("ExecutionStartDate: ").append(getExecutionStartDate()).append(",");
        if (getExecutionEndDate() != null)
            sb.append("ExecutionEndDate: ").append(getExecutionEndDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof DetectMitigationActionExecution == false)
            return false;
        DetectMitigationActionExecution other = (DetectMitigationActionExecution) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getViolationId() == null ^ this.getViolationId() == null)
            return false;
        if (other.getViolationId() != null && other.getViolationId().equals(this.getViolationId()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getExecutionStartDate() == null ^ this.getExecutionStartDate() == null)
            return false;
        if (other.getExecutionStartDate() != null && other.getExecutionStartDate().equals(this.getExecutionStartDate()) == false)
            return false;
        if (other.getExecutionEndDate() == null ^ this.getExecutionEndDate() == null)
            return false;
        if (other.getExecutionEndDate() != null && other.getExecutionEndDate().equals(this.getExecutionEndDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getViolationId() == null) ? 0 : getViolationId().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartDate() == null) ? 0 : getExecutionStartDate().hashCode());
        hashCode = prime * hashCode + ((getExecutionEndDate() == null) ? 0 : getExecutionEndDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DetectMitigationActionExecution clone() {
        try {
            return (DetectMitigationActionExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.DetectMitigationActionExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

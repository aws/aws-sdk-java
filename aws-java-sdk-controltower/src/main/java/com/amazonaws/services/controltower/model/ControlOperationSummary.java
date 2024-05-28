/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of information about the specified control operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ControlOperationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlOperationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>controlIdentifier</code> of a control.
     * </p>
     */
    private String controlIdentifier;
    /**
     * <p>
     * The <code>controlIdentifier</code> of an enabled control.
     * </p>
     */
    private String enabledControlIdentifier;
    /**
     * <p>
     * The time at which the control operation was completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The unique identifier of a control operation.
     * </p>
     */
    private String operationIdentifier;
    /**
     * <p>
     * The type of operation.
     * </p>
     */
    private String operationType;
    /**
     * <p>
     * The time at which a control operation began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The status of the specified control operation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A speficic message displayed as part of the control status.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The unique identifier of the target of a control operation.
     * </p>
     */
    private String targetIdentifier;

    /**
     * <p>
     * The <code>controlIdentifier</code> of a control.
     * </p>
     * 
     * @param controlIdentifier
     *        The <code>controlIdentifier</code> of a control.
     */

    public void setControlIdentifier(String controlIdentifier) {
        this.controlIdentifier = controlIdentifier;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of a control.
     * </p>
     * 
     * @return The <code>controlIdentifier</code> of a control.
     */

    public String getControlIdentifier() {
        return this.controlIdentifier;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of a control.
     * </p>
     * 
     * @param controlIdentifier
     *        The <code>controlIdentifier</code> of a control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationSummary withControlIdentifier(String controlIdentifier) {
        setControlIdentifier(controlIdentifier);
        return this;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of an enabled control.
     * </p>
     * 
     * @param enabledControlIdentifier
     *        The <code>controlIdentifier</code> of an enabled control.
     */

    public void setEnabledControlIdentifier(String enabledControlIdentifier) {
        this.enabledControlIdentifier = enabledControlIdentifier;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of an enabled control.
     * </p>
     * 
     * @return The <code>controlIdentifier</code> of an enabled control.
     */

    public String getEnabledControlIdentifier() {
        return this.enabledControlIdentifier;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of an enabled control.
     * </p>
     * 
     * @param enabledControlIdentifier
     *        The <code>controlIdentifier</code> of an enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationSummary withEnabledControlIdentifier(String enabledControlIdentifier) {
        setEnabledControlIdentifier(enabledControlIdentifier);
        return this;
    }

    /**
     * <p>
     * The time at which the control operation was completed.
     * </p>
     * 
     * @param endTime
     *        The time at which the control operation was completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the control operation was completed.
     * </p>
     * 
     * @return The time at which the control operation was completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the control operation was completed.
     * </p>
     * 
     * @param endTime
     *        The time at which the control operation was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a control operation.
     * </p>
     * 
     * @param operationIdentifier
     *        The unique identifier of a control operation.
     */

    public void setOperationIdentifier(String operationIdentifier) {
        this.operationIdentifier = operationIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a control operation.
     * </p>
     * 
     * @return The unique identifier of a control operation.
     */

    public String getOperationIdentifier() {
        return this.operationIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a control operation.
     * </p>
     * 
     * @param operationIdentifier
     *        The unique identifier of a control operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationSummary withOperationIdentifier(String operationIdentifier) {
        setOperationIdentifier(operationIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * 
     * @param operationType
     *        The type of operation.
     * @see ControlOperationType
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * 
     * @return The type of operation.
     * @see ControlOperationType
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * 
     * @param operationType
     *        The type of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationType
     */

    public ControlOperationSummary withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * 
     * @param operationType
     *        The type of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationType
     */

    public ControlOperationSummary withOperationType(ControlOperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The time at which a control operation began.
     * </p>
     * 
     * @param startTime
     *        The time at which a control operation began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which a control operation began.
     * </p>
     * 
     * @return The time at which a control operation began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which a control operation began.
     * </p>
     * 
     * @param startTime
     *        The time at which a control operation began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The status of the specified control operation.
     * </p>
     * 
     * @param status
     *        The status of the specified control operation.
     * @see ControlOperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the specified control operation.
     * </p>
     * 
     * @return The status of the specified control operation.
     * @see ControlOperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the specified control operation.
     * </p>
     * 
     * @param status
     *        The status of the specified control operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationStatus
     */

    public ControlOperationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the specified control operation.
     * </p>
     * 
     * @param status
     *        The status of the specified control operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationStatus
     */

    public ControlOperationSummary withStatus(ControlOperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A speficic message displayed as part of the control status.
     * </p>
     * 
     * @param statusMessage
     *        A speficic message displayed as part of the control status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A speficic message displayed as part of the control status.
     * </p>
     * 
     * @return A speficic message displayed as part of the control status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A speficic message displayed as part of the control status.
     * </p>
     * 
     * @param statusMessage
     *        A speficic message displayed as part of the control status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationSummary withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the target of a control operation.
     * </p>
     * 
     * @param targetIdentifier
     *        The unique identifier of the target of a control operation.
     */

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the target of a control operation.
     * </p>
     * 
     * @return The unique identifier of the target of a control operation.
     */

    public String getTargetIdentifier() {
        return this.targetIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the target of a control operation.
     * </p>
     * 
     * @param targetIdentifier
     *        The unique identifier of the target of a control operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperationSummary withTargetIdentifier(String targetIdentifier) {
        setTargetIdentifier(targetIdentifier);
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
        if (getControlIdentifier() != null)
            sb.append("ControlIdentifier: ").append(getControlIdentifier()).append(",");
        if (getEnabledControlIdentifier() != null)
            sb.append("EnabledControlIdentifier: ").append(getEnabledControlIdentifier()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getOperationIdentifier() != null)
            sb.append("OperationIdentifier: ").append(getOperationIdentifier()).append(",");
        if (getOperationType() != null)
            sb.append("OperationType: ").append(getOperationType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getTargetIdentifier() != null)
            sb.append("TargetIdentifier: ").append(getTargetIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlOperationSummary == false)
            return false;
        ControlOperationSummary other = (ControlOperationSummary) obj;
        if (other.getControlIdentifier() == null ^ this.getControlIdentifier() == null)
            return false;
        if (other.getControlIdentifier() != null && other.getControlIdentifier().equals(this.getControlIdentifier()) == false)
            return false;
        if (other.getEnabledControlIdentifier() == null ^ this.getEnabledControlIdentifier() == null)
            return false;
        if (other.getEnabledControlIdentifier() != null && other.getEnabledControlIdentifier().equals(this.getEnabledControlIdentifier()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getOperationIdentifier() == null ^ this.getOperationIdentifier() == null)
            return false;
        if (other.getOperationIdentifier() != null && other.getOperationIdentifier().equals(this.getOperationIdentifier()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTargetIdentifier() == null ^ this.getTargetIdentifier() == null)
            return false;
        if (other.getTargetIdentifier() != null && other.getTargetIdentifier().equals(this.getTargetIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlIdentifier() == null) ? 0 : getControlIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnabledControlIdentifier() == null) ? 0 : getEnabledControlIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getOperationIdentifier() == null) ? 0 : getOperationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTargetIdentifier() == null) ? 0 : getTargetIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ControlOperationSummary clone() {
        try {
            return (ControlOperationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.ControlOperationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

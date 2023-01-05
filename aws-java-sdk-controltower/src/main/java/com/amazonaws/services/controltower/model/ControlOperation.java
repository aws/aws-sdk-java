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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An operation performed by the control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ControlOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time that the operation finished.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * One of <code>ENABLE_CONTROL</code> or <code>DISABLE_CONTROL</code>.
     * </p>
     */
    private String operationType;
    /**
     * <p>
     * The time that the operation began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * One of <code>IN_PROGRESS</code>, <code>SUCEEDED</code>, or <code>FAILED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the operation result is <code>FAILED</code>, this string contains a message explaining why the operation
     * failed.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The time that the operation finished.
     * </p>
     * 
     * @param endTime
     *        The time that the operation finished.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the operation finished.
     * </p>
     * 
     * @return The time that the operation finished.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the operation finished.
     * </p>
     * 
     * @param endTime
     *        The time that the operation finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperation withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * One of <code>ENABLE_CONTROL</code> or <code>DISABLE_CONTROL</code>.
     * </p>
     * 
     * @param operationType
     *        One of <code>ENABLE_CONTROL</code> or <code>DISABLE_CONTROL</code>.
     * @see ControlOperationType
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * One of <code>ENABLE_CONTROL</code> or <code>DISABLE_CONTROL</code>.
     * </p>
     * 
     * @return One of <code>ENABLE_CONTROL</code> or <code>DISABLE_CONTROL</code>.
     * @see ControlOperationType
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p>
     * One of <code>ENABLE_CONTROL</code> or <code>DISABLE_CONTROL</code>.
     * </p>
     * 
     * @param operationType
     *        One of <code>ENABLE_CONTROL</code> or <code>DISABLE_CONTROL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationType
     */

    public ControlOperation withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * One of <code>ENABLE_CONTROL</code> or <code>DISABLE_CONTROL</code>.
     * </p>
     * 
     * @param operationType
     *        One of <code>ENABLE_CONTROL</code> or <code>DISABLE_CONTROL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationType
     */

    public ControlOperation withOperationType(ControlOperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The time that the operation began.
     * </p>
     * 
     * @param startTime
     *        The time that the operation began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the operation began.
     * </p>
     * 
     * @return The time that the operation began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the operation began.
     * </p>
     * 
     * @param startTime
     *        The time that the operation began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperation withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * One of <code>IN_PROGRESS</code>, <code>SUCEEDED</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        One of <code>IN_PROGRESS</code>, <code>SUCEEDED</code>, or <code>FAILED</code>.
     * @see ControlOperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * One of <code>IN_PROGRESS</code>, <code>SUCEEDED</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @return One of <code>IN_PROGRESS</code>, <code>SUCEEDED</code>, or <code>FAILED</code>.
     * @see ControlOperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * One of <code>IN_PROGRESS</code>, <code>SUCEEDED</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        One of <code>IN_PROGRESS</code>, <code>SUCEEDED</code>, or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationStatus
     */

    public ControlOperation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * One of <code>IN_PROGRESS</code>, <code>SUCEEDED</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        One of <code>IN_PROGRESS</code>, <code>SUCEEDED</code>, or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlOperationStatus
     */

    public ControlOperation withStatus(ControlOperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the operation result is <code>FAILED</code>, this string contains a message explaining why the operation
     * failed.
     * </p>
     * 
     * @param statusMessage
     *        If the operation result is <code>FAILED</code>, this string contains a message explaining why the
     *        operation failed.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * If the operation result is <code>FAILED</code>, this string contains a message explaining why the operation
     * failed.
     * </p>
     * 
     * @return If the operation result is <code>FAILED</code>, this string contains a message explaining why the
     *         operation failed.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * If the operation result is <code>FAILED</code>, this string contains a message explaining why the operation
     * failed.
     * </p>
     * 
     * @param statusMessage
     *        If the operation result is <code>FAILED</code>, this string contains a message explaining why the
     *        operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlOperation withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getOperationType() != null)
            sb.append("OperationType: ").append(getOperationType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlOperation == false)
            return false;
        ControlOperation other = (ControlOperation) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ControlOperation clone() {
        try {
            return (ControlOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.ControlOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

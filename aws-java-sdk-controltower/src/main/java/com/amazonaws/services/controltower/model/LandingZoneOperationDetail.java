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
 * Information about a landing zone operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/LandingZoneOperationDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LandingZoneOperationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The landing zone operation end time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The landing zone operation type.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code>: The <code>DeleteLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE</code>: The <code>CreateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code>: The <code>UpdateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code>: The <code>ResetLandingZone</code> operation.
     * </p>
     * </li>
     * </ul>
     */
    private String operationType;
    /**
     * <p>
     * The landing zone operation start time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The landing zone operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The landing zone operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The landing zone operation failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If the operation result is FAILED, this string contains a message explaining why the operation failed.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The landing zone operation end time.
     * </p>
     * 
     * @param endTime
     *        The landing zone operation end time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The landing zone operation end time.
     * </p>
     * 
     * @return The landing zone operation end time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The landing zone operation end time.
     * </p>
     * 
     * @param endTime
     *        The landing zone operation end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LandingZoneOperationDetail withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The landing zone operation type.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code>: The <code>DeleteLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE</code>: The <code>CreateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code>: The <code>UpdateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code>: The <code>ResetLandingZone</code> operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationType
     *        The landing zone operation type. </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE</code>: The <code>DeleteLandingZone</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE</code>: The <code>CreateLandingZone</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE</code>: The <code>UpdateLandingZone</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESET</code>: The <code>ResetLandingZone</code> operation.
     *        </p>
     *        </li>
     * @see LandingZoneOperationType
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The landing zone operation type.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code>: The <code>DeleteLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE</code>: The <code>CreateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code>: The <code>UpdateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code>: The <code>ResetLandingZone</code> operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The landing zone operation type. </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETE</code>: The <code>DeleteLandingZone</code> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE</code>: The <code>CreateLandingZone</code> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE</code>: The <code>UpdateLandingZone</code> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESET</code>: The <code>ResetLandingZone</code> operation.
     *         </p>
     *         </li>
     * @see LandingZoneOperationType
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p>
     * The landing zone operation type.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code>: The <code>DeleteLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE</code>: The <code>CreateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code>: The <code>UpdateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code>: The <code>ResetLandingZone</code> operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationType
     *        The landing zone operation type. </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE</code>: The <code>DeleteLandingZone</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE</code>: The <code>CreateLandingZone</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE</code>: The <code>UpdateLandingZone</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESET</code>: The <code>ResetLandingZone</code> operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationType
     */

    public LandingZoneOperationDetail withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * The landing zone operation type.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code>: The <code>DeleteLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE</code>: The <code>CreateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code>: The <code>UpdateLandingZone</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESET</code>: The <code>ResetLandingZone</code> operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationType
     *        The landing zone operation type. </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE</code>: The <code>DeleteLandingZone</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE</code>: The <code>CreateLandingZone</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE</code>: The <code>UpdateLandingZone</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESET</code>: The <code>ResetLandingZone</code> operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationType
     */

    public LandingZoneOperationDetail withOperationType(LandingZoneOperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The landing zone operation start time.
     * </p>
     * 
     * @param startTime
     *        The landing zone operation start time.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The landing zone operation start time.
     * </p>
     * 
     * @return The landing zone operation start time.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The landing zone operation start time.
     * </p>
     * 
     * @param startTime
     *        The landing zone operation start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LandingZoneOperationDetail withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The landing zone operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The landing zone operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The landing zone operation failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Valid values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The landing zone operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The landing zone operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The landing zone operation failed.
     *        </p>
     *        </li>
     * @see LandingZoneOperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The landing zone operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The landing zone operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The landing zone operation failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Valid values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The landing zone operation succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The landing zone operation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The landing zone operation failed.
     *         </p>
     *         </li>
     * @see LandingZoneOperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The landing zone operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The landing zone operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The landing zone operation failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Valid values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The landing zone operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The landing zone operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The landing zone operation failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationStatus
     */

    public LandingZoneOperationDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The landing zone operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The landing zone operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The landing zone operation failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Valid values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The landing zone operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The landing zone operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The landing zone operation failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationStatus
     */

    public LandingZoneOperationDetail withStatus(LandingZoneOperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the operation result is FAILED, this string contains a message explaining why the operation failed.
     * </p>
     * 
     * @param statusMessage
     *        If the operation result is FAILED, this string contains a message explaining why the operation failed.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * If the operation result is FAILED, this string contains a message explaining why the operation failed.
     * </p>
     * 
     * @return If the operation result is FAILED, this string contains a message explaining why the operation failed.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * If the operation result is FAILED, this string contains a message explaining why the operation failed.
     * </p>
     * 
     * @param statusMessage
     *        If the operation result is FAILED, this string contains a message explaining why the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LandingZoneOperationDetail withStatusMessage(String statusMessage) {
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

        if (obj instanceof LandingZoneOperationDetail == false)
            return false;
        LandingZoneOperationDetail other = (LandingZoneOperationDetail) obj;
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
    public LandingZoneOperationDetail clone() {
        try {
            return (LandingZoneOperationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.LandingZoneOperationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

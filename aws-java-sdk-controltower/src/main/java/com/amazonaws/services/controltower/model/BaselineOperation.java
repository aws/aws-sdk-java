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
 * An object of shape <code>BaselineOperation</code>, returning details about the specified <code>Baseline</code>
 * operation ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/BaselineOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BaselineOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The end time of the operation (if applicable), in ISO 8601 format.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The identifier of the specified operation.
     * </p>
     */
    private String operationIdentifier;
    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>ENABLE_BASELINE</code>,
     * <code>DISABLE_BASELINE</code>, <code>UPDATE_ENABLED_BASELINE</code>, or <code>RESET_ENABLED_BASELINE</code>.
     * </p>
     */
    private String operationType;
    /**
     * <p>
     * The start time of the operation, in ISO 8601 format.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>SUCCEEDED</code>, <code>FAILED</code>, or
     * <code>IN_PROGRESS</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A status message that gives more information about the operation's status, if applicable.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The end time of the operation (if applicable), in ISO 8601 format.
     * </p>
     * 
     * @param endTime
     *        The end time of the operation (if applicable), in ISO 8601 format.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the operation (if applicable), in ISO 8601 format.
     * </p>
     * 
     * @return The end time of the operation (if applicable), in ISO 8601 format.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the operation (if applicable), in ISO 8601 format.
     * </p>
     * 
     * @param endTime
     *        The end time of the operation (if applicable), in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOperation withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The identifier of the specified operation.
     * </p>
     * 
     * @param operationIdentifier
     *        The identifier of the specified operation.
     */

    public void setOperationIdentifier(String operationIdentifier) {
        this.operationIdentifier = operationIdentifier;
    }

    /**
     * <p>
     * The identifier of the specified operation.
     * </p>
     * 
     * @return The identifier of the specified operation.
     */

    public String getOperationIdentifier() {
        return this.operationIdentifier;
    }

    /**
     * <p>
     * The identifier of the specified operation.
     * </p>
     * 
     * @param operationIdentifier
     *        The identifier of the specified operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOperation withOperationIdentifier(String operationIdentifier) {
        setOperationIdentifier(operationIdentifier);
        return this;
    }

    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>ENABLE_BASELINE</code>,
     * <code>DISABLE_BASELINE</code>, <code>UPDATE_ENABLED_BASELINE</code>, or <code>RESET_ENABLED_BASELINE</code>.
     * </p>
     * 
     * @param operationType
     *        An enumerated type (<code>enum</code>) with possible values of <code>ENABLE_BASELINE</code>,
     *        <code>DISABLE_BASELINE</code>, <code>UPDATE_ENABLED_BASELINE</code>, or
     *        <code>RESET_ENABLED_BASELINE</code>.
     * @see BaselineOperationType
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>ENABLE_BASELINE</code>,
     * <code>DISABLE_BASELINE</code>, <code>UPDATE_ENABLED_BASELINE</code>, or <code>RESET_ENABLED_BASELINE</code>.
     * </p>
     * 
     * @return An enumerated type (<code>enum</code>) with possible values of <code>ENABLE_BASELINE</code>,
     *         <code>DISABLE_BASELINE</code>, <code>UPDATE_ENABLED_BASELINE</code>, or
     *         <code>RESET_ENABLED_BASELINE</code>.
     * @see BaselineOperationType
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>ENABLE_BASELINE</code>,
     * <code>DISABLE_BASELINE</code>, <code>UPDATE_ENABLED_BASELINE</code>, or <code>RESET_ENABLED_BASELINE</code>.
     * </p>
     * 
     * @param operationType
     *        An enumerated type (<code>enum</code>) with possible values of <code>ENABLE_BASELINE</code>,
     *        <code>DISABLE_BASELINE</code>, <code>UPDATE_ENABLED_BASELINE</code>, or
     *        <code>RESET_ENABLED_BASELINE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaselineOperationType
     */

    public BaselineOperation withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>ENABLE_BASELINE</code>,
     * <code>DISABLE_BASELINE</code>, <code>UPDATE_ENABLED_BASELINE</code>, or <code>RESET_ENABLED_BASELINE</code>.
     * </p>
     * 
     * @param operationType
     *        An enumerated type (<code>enum</code>) with possible values of <code>ENABLE_BASELINE</code>,
     *        <code>DISABLE_BASELINE</code>, <code>UPDATE_ENABLED_BASELINE</code>, or
     *        <code>RESET_ENABLED_BASELINE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaselineOperationType
     */

    public BaselineOperation withOperationType(BaselineOperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the operation, in ISO 8601 format.
     * </p>
     * 
     * @param startTime
     *        The start time of the operation, in ISO 8601 format.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the operation, in ISO 8601 format.
     * </p>
     * 
     * @return The start time of the operation, in ISO 8601 format.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the operation, in ISO 8601 format.
     * </p>
     * 
     * @param startTime
     *        The start time of the operation, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOperation withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>SUCCEEDED</code>, <code>FAILED</code>, or
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param status
     *        An enumerated type (<code>enum</code>) with possible values of <code>SUCCEEDED</code>, <code>FAILED</code>
     *        , or <code>IN_PROGRESS</code>.
     * @see BaselineOperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>SUCCEEDED</code>, <code>FAILED</code>, or
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @return An enumerated type (<code>enum</code>) with possible values of <code>SUCCEEDED</code>,
     *         <code>FAILED</code>, or <code>IN_PROGRESS</code>.
     * @see BaselineOperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>SUCCEEDED</code>, <code>FAILED</code>, or
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param status
     *        An enumerated type (<code>enum</code>) with possible values of <code>SUCCEEDED</code>, <code>FAILED</code>
     *        , or <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaselineOperationStatus
     */

    public BaselineOperation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An enumerated type (<code>enum</code>) with possible values of <code>SUCCEEDED</code>, <code>FAILED</code>, or
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param status
     *        An enumerated type (<code>enum</code>) with possible values of <code>SUCCEEDED</code>, <code>FAILED</code>
     *        , or <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaselineOperationStatus
     */

    public BaselineOperation withStatus(BaselineOperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A status message that gives more information about the operation's status, if applicable.
     * </p>
     * 
     * @param statusMessage
     *        A status message that gives more information about the operation's status, if applicable.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A status message that gives more information about the operation's status, if applicable.
     * </p>
     * 
     * @return A status message that gives more information about the operation's status, if applicable.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A status message that gives more information about the operation's status, if applicable.
     * </p>
     * 
     * @param statusMessage
     *        A status message that gives more information about the operation's status, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOperation withStatusMessage(String statusMessage) {
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
        if (getOperationIdentifier() != null)
            sb.append("OperationIdentifier: ").append(getOperationIdentifier()).append(",");
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

        if (obj instanceof BaselineOperation == false)
            return false;
        BaselineOperation other = (BaselineOperation) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getOperationIdentifier() == null) ? 0 : getOperationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public BaselineOperation clone() {
        try {
            return (BaselineOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.BaselineOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

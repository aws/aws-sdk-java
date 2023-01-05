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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of an outbound cross-cluster connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutboundConnectionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VALIDATING</b> - The outbound connection request is being validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VALIDATION_FAILED</b> - Validation failed for the connection request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b>: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b> - Outbound connection has been approved by the remote domain owner for getting provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b> - Outbound connection request is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> - Outbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b> - Outbound connection rejection by remote domain owner is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b> - Outbound connection request is rejected by remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> - Outbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> - Outbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     */
    private String statusCode;
    /**
     * <p>
     * Verbose information for the outbound connection.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VALIDATING</b> - The outbound connection request is being validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VALIDATION_FAILED</b> - Validation failed for the connection request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b>: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b> - Outbound connection has been approved by the remote domain owner for getting provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b> - Outbound connection request is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> - Outbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b> - Outbound connection rejection by remote domain owner is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b> - Outbound connection request is rejected by remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> - Outbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> - Outbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status code for the outbound connection. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>VALIDATING</b> - The outbound connection request is being validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VALIDATION_FAILED</b> - Validation failed for the connection request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING_ACCEPTANCE</b>: Outbound connection request is validated and is not yet accepted by the remote
     *        domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVED</b> - Outbound connection has been approved by the remote domain owner for getting
     *        provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PROVISIONING</b> - Outbound connection request is in process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> - Outbound connection is active and ready to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTING</b> - Outbound connection rejection by remote domain owner is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTED</b> - Outbound connection request is rejected by remote domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> - Outbound connection deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> - Outbound connection is deleted and can no longer be used.
     *        </p>
     *        </li>
     * @see OutboundConnectionStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VALIDATING</b> - The outbound connection request is being validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VALIDATION_FAILED</b> - Validation failed for the connection request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b>: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b> - Outbound connection has been approved by the remote domain owner for getting provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b> - Outbound connection request is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> - Outbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b> - Outbound connection rejection by remote domain owner is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b> - Outbound connection request is rejected by remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> - Outbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> - Outbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status code for the outbound connection. Can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>VALIDATING</b> - The outbound connection request is being validated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>VALIDATION_FAILED</b> - Validation failed for the connection request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PENDING_ACCEPTANCE</b>: Outbound connection request is validated and is not yet accepted by the remote
     *         domain owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>APPROVED</b> - Outbound connection has been approved by the remote domain owner for getting
     *         provisioned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PROVISIONING</b> - Outbound connection request is in process.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b> - Outbound connection is active and ready to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>REJECTING</b> - Outbound connection rejection by remote domain owner is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>REJECTED</b> - Outbound connection request is rejected by remote domain owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETING</b> - Outbound connection deletion is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETED</b> - Outbound connection is deleted and can no longer be used.
     *         </p>
     *         </li>
     * @see OutboundConnectionStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VALIDATING</b> - The outbound connection request is being validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VALIDATION_FAILED</b> - Validation failed for the connection request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b>: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b> - Outbound connection has been approved by the remote domain owner for getting provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b> - Outbound connection request is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> - Outbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b> - Outbound connection rejection by remote domain owner is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b> - Outbound connection request is rejected by remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> - Outbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> - Outbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status code for the outbound connection. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>VALIDATING</b> - The outbound connection request is being validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VALIDATION_FAILED</b> - Validation failed for the connection request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING_ACCEPTANCE</b>: Outbound connection request is validated and is not yet accepted by the remote
     *        domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVED</b> - Outbound connection has been approved by the remote domain owner for getting
     *        provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PROVISIONING</b> - Outbound connection request is in process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> - Outbound connection is active and ready to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTING</b> - Outbound connection rejection by remote domain owner is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTED</b> - Outbound connection request is rejected by remote domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> - Outbound connection deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> - Outbound connection is deleted and can no longer be used.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutboundConnectionStatusCode
     */

    public OutboundConnectionStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>VALIDATING</b> - The outbound connection request is being validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VALIDATION_FAILED</b> - Validation failed for the connection request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b>: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b> - Outbound connection has been approved by the remote domain owner for getting provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b> - Outbound connection request is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> - Outbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b> - Outbound connection rejection by remote domain owner is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b> - Outbound connection request is rejected by remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> - Outbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> - Outbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status code for the outbound connection. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>VALIDATING</b> - The outbound connection request is being validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VALIDATION_FAILED</b> - Validation failed for the connection request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING_ACCEPTANCE</b>: Outbound connection request is validated and is not yet accepted by the remote
     *        domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVED</b> - Outbound connection has been approved by the remote domain owner for getting
     *        provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PROVISIONING</b> - Outbound connection request is in process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> - Outbound connection is active and ready to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTING</b> - Outbound connection rejection by remote domain owner is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTED</b> - Outbound connection request is rejected by remote domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> - Outbound connection deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> - Outbound connection is deleted and can no longer be used.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutboundConnectionStatusCode
     */

    public OutboundConnectionStatus withStatusCode(OutboundConnectionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * Verbose information for the outbound connection.
     * </p>
     * 
     * @param message
     *        Verbose information for the outbound connection.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Verbose information for the outbound connection.
     * </p>
     * 
     * @return Verbose information for the outbound connection.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Verbose information for the outbound connection.
     * </p>
     * 
     * @param message
     *        Verbose information for the outbound connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutboundConnectionStatus withMessage(String message) {
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
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

        if (obj instanceof OutboundConnectionStatus == false)
            return false;
        OutboundConnectionStatus other = (OutboundConnectionStatus) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
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

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public OutboundConnectionStatus clone() {
        try {
            return (OutboundConnectionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.OutboundConnectionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

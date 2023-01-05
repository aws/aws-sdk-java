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
 * The status of an inbound cross-cluster connection for OpenSearch Service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InboundConnectionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status code for the connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b> - Inbound connection is not yet accepted by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b>: Inbound connection is pending acceptance by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b>: Inbound connection is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b>: Inbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b>: Inbound connection rejection is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b>: Inbound connection is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: Inbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b>: Inbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     */
    private String statusCode;
    /**
     * <p>
     * Information about the connection.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code for the connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b> - Inbound connection is not yet accepted by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b>: Inbound connection is pending acceptance by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b>: Inbound connection is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b>: Inbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b>: Inbound connection rejection is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b>: Inbound connection is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: Inbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b>: Inbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status code for the connection. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING_ACCEPTANCE</b> - Inbound connection is not yet accepted by the remote domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVED</b>: Inbound connection is pending acceptance by the remote domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PROVISIONING</b>: Inbound connection is being provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b>: Inbound connection is active and ready to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTING</b>: Inbound connection rejection is in process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTED</b>: Inbound connection is rejected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b>: Inbound connection deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b>: Inbound connection is deleted and can no longer be used.
     *        </p>
     *        </li>
     * @see InboundConnectionStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code for the connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b> - Inbound connection is not yet accepted by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b>: Inbound connection is pending acceptance by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b>: Inbound connection is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b>: Inbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b>: Inbound connection rejection is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b>: Inbound connection is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: Inbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b>: Inbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status code for the connection. Can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>PENDING_ACCEPTANCE</b> - Inbound connection is not yet accepted by the remote domain owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>APPROVED</b>: Inbound connection is pending acceptance by the remote domain owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PROVISIONING</b>: Inbound connection is being provisioned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b>: Inbound connection is active and ready to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>REJECTING</b>: Inbound connection rejection is in process.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>REJECTED</b>: Inbound connection is rejected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETING</b>: Inbound connection deletion is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETED</b>: Inbound connection is deleted and can no longer be used.
     *         </p>
     *         </li>
     * @see InboundConnectionStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code for the connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b> - Inbound connection is not yet accepted by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b>: Inbound connection is pending acceptance by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b>: Inbound connection is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b>: Inbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b>: Inbound connection rejection is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b>: Inbound connection is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: Inbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b>: Inbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status code for the connection. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING_ACCEPTANCE</b> - Inbound connection is not yet accepted by the remote domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVED</b>: Inbound connection is pending acceptance by the remote domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PROVISIONING</b>: Inbound connection is being provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b>: Inbound connection is active and ready to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTING</b>: Inbound connection rejection is in process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTED</b>: Inbound connection is rejected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b>: Inbound connection deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b>: Inbound connection is deleted and can no longer be used.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InboundConnectionStatusCode
     */

    public InboundConnectionStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code for the connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING_ACCEPTANCE</b> - Inbound connection is not yet accepted by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVED</b>: Inbound connection is pending acceptance by the remote domain owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROVISIONING</b>: Inbound connection is being provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b>: Inbound connection is active and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTING</b>: Inbound connection rejection is in process.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECTED</b>: Inbound connection is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: Inbound connection deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b>: Inbound connection is deleted and can no longer be used.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status code for the connection. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING_ACCEPTANCE</b> - Inbound connection is not yet accepted by the remote domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVED</b>: Inbound connection is pending acceptance by the remote domain owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PROVISIONING</b>: Inbound connection is being provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b>: Inbound connection is active and ready to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTING</b>: Inbound connection rejection is in process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECTED</b>: Inbound connection is rejected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b>: Inbound connection deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b>: Inbound connection is deleted and can no longer be used.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InboundConnectionStatusCode
     */

    public InboundConnectionStatus withStatusCode(InboundConnectionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * Information about the connection.
     * </p>
     * 
     * @param message
     *        Information about the connection.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Information about the connection.
     * </p>
     * 
     * @return Information about the connection.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Information about the connection.
     * </p>
     * 
     * @param message
     *        Information about the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundConnectionStatus withMessage(String message) {
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

        if (obj instanceof InboundConnectionStatus == false)
            return false;
        InboundConnectionStatus other = (InboundConnectionStatus) obj;
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
    public InboundConnectionStatus clone() {
        try {
            return (InboundConnectionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.InboundConnectionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

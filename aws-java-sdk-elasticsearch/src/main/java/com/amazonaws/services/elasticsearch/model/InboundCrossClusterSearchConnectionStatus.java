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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the coonection status of an inbound cross-cluster search connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InboundCrossClusterSearchConnectionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state code for inbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner.</li>
     * <li>APPROVED: Inbound connection is pending acceptance by destination domain owner.</li>
     * <li>REJECTING: Inbound connection rejection is in process.</li>
     * <li>REJECTED: Inbound connection is rejected.</li>
     * <li>DELETING: Inbound connection deletion is in progress.</li>
     * <li>DELETED: Inbound connection is deleted and cannot be used further.</li>
     * </ul>
     */
    private String statusCode;
    /**
     * <p>
     * Specifies verbose information for the inbound connection status.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The state code for inbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner.</li>
     * <li>APPROVED: Inbound connection is pending acceptance by destination domain owner.</li>
     * <li>REJECTING: Inbound connection rejection is in process.</li>
     * <li>REJECTED: Inbound connection is rejected.</li>
     * <li>DELETING: Inbound connection deletion is in progress.</li>
     * <li>DELETED: Inbound connection is deleted and cannot be used further.</li>
     * </ul>
     * 
     * @param statusCode
     *        The state code for inbound connection. This can be one of the following:</p>
     *        <ul>
     *        <li>PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner.</li>
     *        <li>APPROVED: Inbound connection is pending acceptance by destination domain owner.</li>
     *        <li>REJECTING: Inbound connection rejection is in process.</li>
     *        <li>REJECTED: Inbound connection is rejected.</li>
     *        <li>DELETING: Inbound connection deletion is in progress.</li>
     *        <li>DELETED: Inbound connection is deleted and cannot be used further.</li>
     * @see InboundCrossClusterSearchConnectionStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The state code for inbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner.</li>
     * <li>APPROVED: Inbound connection is pending acceptance by destination domain owner.</li>
     * <li>REJECTING: Inbound connection rejection is in process.</li>
     * <li>REJECTED: Inbound connection is rejected.</li>
     * <li>DELETING: Inbound connection deletion is in progress.</li>
     * <li>DELETED: Inbound connection is deleted and cannot be used further.</li>
     * </ul>
     * 
     * @return The state code for inbound connection. This can be one of the following:</p>
     *         <ul>
     *         <li>PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner.</li>
     *         <li>APPROVED: Inbound connection is pending acceptance by destination domain owner.</li>
     *         <li>REJECTING: Inbound connection rejection is in process.</li>
     *         <li>REJECTED: Inbound connection is rejected.</li>
     *         <li>DELETING: Inbound connection deletion is in progress.</li>
     *         <li>DELETED: Inbound connection is deleted and cannot be used further.</li>
     * @see InboundCrossClusterSearchConnectionStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The state code for inbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner.</li>
     * <li>APPROVED: Inbound connection is pending acceptance by destination domain owner.</li>
     * <li>REJECTING: Inbound connection rejection is in process.</li>
     * <li>REJECTED: Inbound connection is rejected.</li>
     * <li>DELETING: Inbound connection deletion is in progress.</li>
     * <li>DELETED: Inbound connection is deleted and cannot be used further.</li>
     * </ul>
     * 
     * @param statusCode
     *        The state code for inbound connection. This can be one of the following:</p>
     *        <ul>
     *        <li>PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner.</li>
     *        <li>APPROVED: Inbound connection is pending acceptance by destination domain owner.</li>
     *        <li>REJECTING: Inbound connection rejection is in process.</li>
     *        <li>REJECTED: Inbound connection is rejected.</li>
     *        <li>DELETING: Inbound connection deletion is in progress.</li>
     *        <li>DELETED: Inbound connection is deleted and cannot be used further.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InboundCrossClusterSearchConnectionStatusCode
     */

    public InboundCrossClusterSearchConnectionStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The state code for inbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner.</li>
     * <li>APPROVED: Inbound connection is pending acceptance by destination domain owner.</li>
     * <li>REJECTING: Inbound connection rejection is in process.</li>
     * <li>REJECTED: Inbound connection is rejected.</li>
     * <li>DELETING: Inbound connection deletion is in progress.</li>
     * <li>DELETED: Inbound connection is deleted and cannot be used further.</li>
     * </ul>
     * 
     * @param statusCode
     *        The state code for inbound connection. This can be one of the following:</p>
     *        <ul>
     *        <li>PENDING_ACCEPTANCE: Inbound connection is not yet accepted by destination domain owner.</li>
     *        <li>APPROVED: Inbound connection is pending acceptance by destination domain owner.</li>
     *        <li>REJECTING: Inbound connection rejection is in process.</li>
     *        <li>REJECTED: Inbound connection is rejected.</li>
     *        <li>DELETING: Inbound connection deletion is in progress.</li>
     *        <li>DELETED: Inbound connection is deleted and cannot be used further.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InboundCrossClusterSearchConnectionStatusCode
     */

    public InboundCrossClusterSearchConnectionStatus withStatusCode(InboundCrossClusterSearchConnectionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies verbose information for the inbound connection status.
     * </p>
     * 
     * @param message
     *        Specifies verbose information for the inbound connection status.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Specifies verbose information for the inbound connection status.
     * </p>
     * 
     * @return Specifies verbose information for the inbound connection status.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Specifies verbose information for the inbound connection status.
     * </p>
     * 
     * @param message
     *        Specifies verbose information for the inbound connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundCrossClusterSearchConnectionStatus withMessage(String message) {
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

        if (obj instanceof InboundCrossClusterSearchConnectionStatus == false)
            return false;
        InboundCrossClusterSearchConnectionStatus other = (InboundCrossClusterSearchConnectionStatus) obj;
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
    public InboundCrossClusterSearchConnectionStatus clone() {
        try {
            return (InboundCrossClusterSearchConnectionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.InboundCrossClusterSearchConnectionStatusMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartWebRTCContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartWebRTCContactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information required for the client application (mobile application or website) to connect to the call.
     * </p>
     */
    private ConnectionData connectionData;
    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The identifier for a contact participant. The <code>ParticipantId</code> for a contact participant is the same
     * throughout the contact lifecycle.
     * </p>
     */
    private String participantId;
    /**
     * <p>
     * The token used by the contact participant to call the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API. The participant token is valid for the lifetime of a contact participant.
     * </p>
     */
    private String participantToken;

    /**
     * <p>
     * Information required for the client application (mobile application or website) to connect to the call.
     * </p>
     * 
     * @param connectionData
     *        Information required for the client application (mobile application or website) to connect to the call.
     */

    public void setConnectionData(ConnectionData connectionData) {
        this.connectionData = connectionData;
    }

    /**
     * <p>
     * Information required for the client application (mobile application or website) to connect to the call.
     * </p>
     * 
     * @return Information required for the client application (mobile application or website) to connect to the call.
     */

    public ConnectionData getConnectionData() {
        return this.connectionData;
    }

    /**
     * <p>
     * Information required for the client application (mobile application or website) to connect to the call.
     * </p>
     * 
     * @param connectionData
     *        Information required for the client application (mobile application or website) to connect to the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactResult withConnectionData(ConnectionData connectionData) {
        setConnectionData(connectionData);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @return The identifier of the contact in this instance of Amazon Connect.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactResult withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The identifier for a contact participant. The <code>ParticipantId</code> for a contact participant is the same
     * throughout the contact lifecycle.
     * </p>
     * 
     * @param participantId
     *        The identifier for a contact participant. The <code>ParticipantId</code> for a contact participant is the
     *        same throughout the contact lifecycle.
     */

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * The identifier for a contact participant. The <code>ParticipantId</code> for a contact participant is the same
     * throughout the contact lifecycle.
     * </p>
     * 
     * @return The identifier for a contact participant. The <code>ParticipantId</code> for a contact participant is the
     *         same throughout the contact lifecycle.
     */

    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * <p>
     * The identifier for a contact participant. The <code>ParticipantId</code> for a contact participant is the same
     * throughout the contact lifecycle.
     * </p>
     * 
     * @param participantId
     *        The identifier for a contact participant. The <code>ParticipantId</code> for a contact participant is the
     *        same throughout the contact lifecycle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactResult withParticipantId(String participantId) {
        setParticipantId(participantId);
        return this;
    }

    /**
     * <p>
     * The token used by the contact participant to call the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API. The participant token is valid for the lifetime of a contact participant.
     * </p>
     * 
     * @param participantToken
     *        The token used by the contact participant to call the <a href=
     *        "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *        >CreateParticipantConnection</a> API. The participant token is valid for the lifetime of a contact
     *        participant.
     */

    public void setParticipantToken(String participantToken) {
        this.participantToken = participantToken;
    }

    /**
     * <p>
     * The token used by the contact participant to call the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API. The participant token is valid for the lifetime of a contact participant.
     * </p>
     * 
     * @return The token used by the contact participant to call the <a
     *         href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *         >CreateParticipantConnection</a> API. The participant token is valid for the lifetime of a contact
     *         participant.
     */

    public String getParticipantToken() {
        return this.participantToken;
    }

    /**
     * <p>
     * The token used by the contact participant to call the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API. The participant token is valid for the lifetime of a contact participant.
     * </p>
     * 
     * @param participantToken
     *        The token used by the contact participant to call the <a href=
     *        "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *        >CreateParticipantConnection</a> API. The participant token is valid for the lifetime of a contact
     *        participant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWebRTCContactResult withParticipantToken(String participantToken) {
        setParticipantToken(participantToken);
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
        if (getConnectionData() != null)
            sb.append("ConnectionData: ").append(getConnectionData()).append(",");
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: ").append(getParticipantId()).append(",");
        if (getParticipantToken() != null)
            sb.append("ParticipantToken: ").append(getParticipantToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartWebRTCContactResult == false)
            return false;
        StartWebRTCContactResult other = (StartWebRTCContactResult) obj;
        if (other.getConnectionData() == null ^ this.getConnectionData() == null)
            return false;
        if (other.getConnectionData() != null && other.getConnectionData().equals(this.getConnectionData()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getParticipantToken() == null ^ this.getParticipantToken() == null)
            return false;
        if (other.getParticipantToken() != null && other.getParticipantToken().equals(this.getParticipantToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionData() == null) ? 0 : getConnectionData().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode + ((getParticipantToken() == null) ? 0 : getParticipantToken().hashCode());
        return hashCode;
    }

    @Override
    public StartWebRTCContactResult clone() {
        try {
            return (StartWebRTCContactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

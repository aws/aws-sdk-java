/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartChatContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartChatContactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of this contact within the Amazon Connect instance.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat
     * lifecycle.
     * </p>
     */
    private String participantId;
    /**
     * <p>
     * The token used by the chat participant to call <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a>. The participant token is valid for the lifetime of a chat participant.
     * </p>
     */
    private String participantToken;

    /**
     * <p>
     * The identifier of this contact within the Amazon Connect instance.
     * </p>
     * 
     * @param contactId
     *        The identifier of this contact within the Amazon Connect instance.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of this contact within the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of this contact within the Amazon Connect instance.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of this contact within the Amazon Connect instance.
     * </p>
     * 
     * @param contactId
     *        The identifier of this contact within the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactResult withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat
     * lifecycle.
     * </p>
     * 
     * @param participantId
     *        The identifier for a chat participant. The participantId for a chat participant is the same throughout the
     *        chat lifecycle.
     */

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat
     * lifecycle.
     * </p>
     * 
     * @return The identifier for a chat participant. The participantId for a chat participant is the same throughout
     *         the chat lifecycle.
     */

    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * <p>
     * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat
     * lifecycle.
     * </p>
     * 
     * @param participantId
     *        The identifier for a chat participant. The participantId for a chat participant is the same throughout the
     *        chat lifecycle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactResult withParticipantId(String participantId) {
        setParticipantId(participantId);
        return this;
    }

    /**
     * <p>
     * The token used by the chat participant to call <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a>. The participant token is valid for the lifetime of a chat participant.
     * </p>
     * 
     * @param participantToken
     *        The token used by the chat participant to call <a href=
     *        "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *        >CreateParticipantConnection</a>. The participant token is valid for the lifetime of a chat participant.
     */

    public void setParticipantToken(String participantToken) {
        this.participantToken = participantToken;
    }

    /**
     * <p>
     * The token used by the chat participant to call <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a>. The participant token is valid for the lifetime of a chat participant.
     * </p>
     * 
     * @return The token used by the chat participant to call <a
     *         href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *         >CreateParticipantConnection</a>. The participant token is valid for the lifetime of a chat participant.
     */

    public String getParticipantToken() {
        return this.participantToken;
    }

    /**
     * <p>
     * The token used by the chat participant to call <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a>. The participant token is valid for the lifetime of a chat participant.
     * </p>
     * 
     * @param participantToken
     *        The token used by the chat participant to call <a href=
     *        "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     *        >CreateParticipantConnection</a>. The participant token is valid for the lifetime of a chat participant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChatContactResult withParticipantToken(String participantToken) {
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

        if (obj instanceof StartChatContactResult == false)
            return false;
        StartChatContactResult other = (StartChatContactResult) obj;
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

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode + ((getParticipantToken() == null) ? 0 : getParticipantToken().hashCode());
        return hashCode;
    }

    @Override
    public StartChatContactResult clone() {
        try {
            return (StartChatContactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateParticipant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateParticipantResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token used by the chat participant to call <code>CreateParticipantConnection</code>. The participant token is
     * valid for the lifetime of a chat participant.
     * </p>
     */
    private ParticipantTokenCredentials participantCredentials;
    /**
     * <p>
     * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat
     * lifecycle.
     * </p>
     */
    private String participantId;

    /**
     * <p>
     * The token used by the chat participant to call <code>CreateParticipantConnection</code>. The participant token is
     * valid for the lifetime of a chat participant.
     * </p>
     * 
     * @param participantCredentials
     *        The token used by the chat participant to call <code>CreateParticipantConnection</code>. The participant
     *        token is valid for the lifetime of a chat participant.
     */

    public void setParticipantCredentials(ParticipantTokenCredentials participantCredentials) {
        this.participantCredentials = participantCredentials;
    }

    /**
     * <p>
     * The token used by the chat participant to call <code>CreateParticipantConnection</code>. The participant token is
     * valid for the lifetime of a chat participant.
     * </p>
     * 
     * @return The token used by the chat participant to call <code>CreateParticipantConnection</code>. The participant
     *         token is valid for the lifetime of a chat participant.
     */

    public ParticipantTokenCredentials getParticipantCredentials() {
        return this.participantCredentials;
    }

    /**
     * <p>
     * The token used by the chat participant to call <code>CreateParticipantConnection</code>. The participant token is
     * valid for the lifetime of a chat participant.
     * </p>
     * 
     * @param participantCredentials
     *        The token used by the chat participant to call <code>CreateParticipantConnection</code>. The participant
     *        token is valid for the lifetime of a chat participant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantResult withParticipantCredentials(ParticipantTokenCredentials participantCredentials) {
        setParticipantCredentials(participantCredentials);
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

    public CreateParticipantResult withParticipantId(String participantId) {
        setParticipantId(participantId);
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
        if (getParticipantCredentials() != null)
            sb.append("ParticipantCredentials: ").append(getParticipantCredentials()).append(",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: ").append(getParticipantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateParticipantResult == false)
            return false;
        CreateParticipantResult other = (CreateParticipantResult) obj;
        if (other.getParticipantCredentials() == null ^ this.getParticipantCredentials() == null)
            return false;
        if (other.getParticipantCredentials() != null && other.getParticipantCredentials().equals(this.getParticipantCredentials()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParticipantCredentials() == null) ? 0 : getParticipantCredentials().hashCode());
        hashCode = prime * hashCode + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        return hashCode;
    }

    @Override
    public CreateParticipantResult clone() {
        try {
            return (CreateParticipantResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

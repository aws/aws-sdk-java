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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The credentials used by the participant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ParticipantTokenCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParticipantTokenCredentials implements Serializable, Cloneable, StructuredPojo {

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
     * The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private String expiry;

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

    public ParticipantTokenCredentials withParticipantToken(String participantToken) {
        setParticipantToken(participantToken);
        return this;
    }

    /**
     * <p>
     * The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param expiry
     *        The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     *        2019-11-08T02:41:28.172Z.
     */

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    /**
     * <p>
     * The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @return The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     *         2019-11-08T02:41:28.172Z.
     */

    public String getExpiry() {
        return this.expiry;
    }

    /**
     * <p>
     * The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param expiry
     *        The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     *        2019-11-08T02:41:28.172Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParticipantTokenCredentials withExpiry(String expiry) {
        setExpiry(expiry);
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
        if (getParticipantToken() != null)
            sb.append("ParticipantToken: ").append(getParticipantToken()).append(",");
        if (getExpiry() != null)
            sb.append("Expiry: ").append(getExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipantTokenCredentials == false)
            return false;
        ParticipantTokenCredentials other = (ParticipantTokenCredentials) obj;
        if (other.getParticipantToken() == null ^ this.getParticipantToken() == null)
            return false;
        if (other.getParticipantToken() != null && other.getParticipantToken().equals(this.getParticipantToken()) == false)
            return false;
        if (other.getExpiry() == null ^ this.getExpiry() == null)
            return false;
        if (other.getExpiry() != null && other.getExpiry().equals(this.getExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParticipantToken() == null) ? 0 : getParticipantToken().hashCode());
        hashCode = prime * hashCode + ((getExpiry() == null) ? 0 : getExpiry().hashCode());
        return hashCode;
    }

    @Override
    public ParticipantTokenCredentials clone() {
        try {
            return (ParticipantTokenCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ParticipantTokenCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateParticipantToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateParticipantTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The participant token that was created.
     * </p>
     */
    private ParticipantToken participantToken;

    /**
     * <p>
     * The participant token that was created.
     * </p>
     * 
     * @param participantToken
     *        The participant token that was created.
     */

    public void setParticipantToken(ParticipantToken participantToken) {
        this.participantToken = participantToken;
    }

    /**
     * <p>
     * The participant token that was created.
     * </p>
     * 
     * @return The participant token that was created.
     */

    public ParticipantToken getParticipantToken() {
        return this.participantToken;
    }

    /**
     * <p>
     * The participant token that was created.
     * </p>
     * 
     * @param participantToken
     *        The participant token that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantTokenResult withParticipantToken(ParticipantToken participantToken) {
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

        if (obj instanceof CreateParticipantTokenResult == false)
            return false;
        CreateParticipantTokenResult other = (CreateParticipantTokenResult) obj;
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

        hashCode = prime * hashCode + ((getParticipantToken() == null) ? 0 : getParticipantToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateParticipantTokenResult clone() {
        try {
            return (CreateParticipantTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

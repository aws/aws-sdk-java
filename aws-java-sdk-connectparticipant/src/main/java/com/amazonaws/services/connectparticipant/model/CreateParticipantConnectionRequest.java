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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CreateParticipantConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateParticipantConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Type of connection information required.
     * </p>
     */
    private java.util.List<String> type;
    /**
     * <p>
     * Participant Token as obtained from <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContactResponse.html"
     * >StartChatContact</a> API response.
     * </p>
     */
    private String participantToken;

    /**
     * <p>
     * Type of connection information required.
     * </p>
     * 
     * @return Type of connection information required.
     * @see ConnectionType
     */

    public java.util.List<String> getType() {
        return type;
    }

    /**
     * <p>
     * Type of connection information required.
     * </p>
     * 
     * @param type
     *        Type of connection information required.
     * @see ConnectionType
     */

    public void setType(java.util.Collection<String> type) {
        if (type == null) {
            this.type = null;
            return;
        }

        this.type = new java.util.ArrayList<String>(type);
    }

    /**
     * <p>
     * Type of connection information required.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setType(java.util.Collection)} or {@link #withType(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param type
     *        Type of connection information required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public CreateParticipantConnectionRequest withType(String... type) {
        if (this.type == null) {
            setType(new java.util.ArrayList<String>(type.length));
        }
        for (String ele : type) {
            this.type.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Type of connection information required.
     * </p>
     * 
     * @param type
     *        Type of connection information required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public CreateParticipantConnectionRequest withType(java.util.Collection<String> type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of connection information required.
     * </p>
     * 
     * @param type
     *        Type of connection information required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public CreateParticipantConnectionRequest withType(ConnectionType... type) {
        java.util.ArrayList<String> typeCopy = new java.util.ArrayList<String>(type.length);
        for (ConnectionType value : type) {
            typeCopy.add(value.toString());
        }
        if (getType() == null) {
            setType(typeCopy);
        } else {
            getType().addAll(typeCopy);
        }
        return this;
    }

    /**
     * <p>
     * Participant Token as obtained from <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContactResponse.html"
     * >StartChatContact</a> API response.
     * </p>
     * 
     * @param participantToken
     *        Participant Token as obtained from <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContactResponse.html"
     *        >StartChatContact</a> API response.
     */

    public void setParticipantToken(String participantToken) {
        this.participantToken = participantToken;
    }

    /**
     * <p>
     * Participant Token as obtained from <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContactResponse.html"
     * >StartChatContact</a> API response.
     * </p>
     * 
     * @return Participant Token as obtained from <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContactResponse.html"
     *         >StartChatContact</a> API response.
     */

    public String getParticipantToken() {
        return this.participantToken;
    }

    /**
     * <p>
     * Participant Token as obtained from <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContactResponse.html"
     * >StartChatContact</a> API response.
     * </p>
     * 
     * @param participantToken
     *        Participant Token as obtained from <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContactResponse.html"
     *        >StartChatContact</a> API response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantConnectionRequest withParticipantToken(String participantToken) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof CreateParticipantConnectionRequest == false)
            return false;
        CreateParticipantConnectionRequest other = (CreateParticipantConnectionRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParticipantToken() == null) ? 0 : getParticipantToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateParticipantConnectionRequest clone() {
        return (CreateParticipantConnectionRequest) super.clone();
    }

}

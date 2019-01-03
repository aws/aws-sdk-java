/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * SMS message configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignSmsMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignSmsMessage implements Serializable, Cloneable, StructuredPojo {

    /** The SMS text body. */
    private String body;
    /** Is this is a transactional SMS message, otherwise a promotional message. */
    private String messageType;
    /** Sender ID of sent message. */
    private String senderId;

    /**
     * The SMS text body.
     * 
     * @param body
     *        The SMS text body.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The SMS text body.
     * 
     * @return The SMS text body.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * The SMS text body.
     * 
     * @param body
     *        The SMS text body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSmsMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * 
     * @param messageType
     *        Is this is a transactional SMS message, otherwise a promotional message.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * 
     * @return Is this is a transactional SMS message, otherwise a promotional message.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * 
     * @param messageType
     *        Is this is a transactional SMS message, otherwise a promotional message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public CampaignSmsMessage withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * 
     * @param messageType
     *        Is this is a transactional SMS message, otherwise a promotional message.
     * @see MessageType
     */

    public void setMessageType(MessageType messageType) {
        withMessageType(messageType);
    }

    /**
     * Is this is a transactional SMS message, otherwise a promotional message.
     * 
     * @param messageType
     *        Is this is a transactional SMS message, otherwise a promotional message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public CampaignSmsMessage withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * Sender ID of sent message.
     * 
     * @param senderId
     *        Sender ID of sent message.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * Sender ID of sent message.
     * 
     * @return Sender ID of sent message.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * Sender ID of sent message.
     * 
     * @param senderId
     *        Sender ID of sent message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSmsMessage withSenderId(String senderId) {
        setSenderId(senderId);
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getSenderId() != null)
            sb.append("SenderId: ").append(getSenderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignSmsMessage == false)
            return false;
        CampaignSmsMessage other = (CampaignSmsMessage) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        return hashCode;
    }

    @Override
    public CampaignSmsMessage clone() {
        try {
            return (CampaignSmsMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CampaignSmsMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

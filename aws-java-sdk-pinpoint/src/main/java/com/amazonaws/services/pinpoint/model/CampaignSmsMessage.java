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
 * <p>
 * Specifies the content and settings for an SMS message that's sent to recipients of a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignSmsMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignSmsMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a
     * one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * The sender ID to display on recipients' devices when they receive the SMS message.
     * </p>
     */
    private String senderId;

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     * 
     * @param body
     *        The body of the SMS message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     * 
     * @return The body of the SMS message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the SMS message.
     * </p>
     * 
     * @param body
     *        The body of the SMS message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSmsMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a
     * one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * 
     * @param messageType
     *        The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such
     *        as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical
     *        or time-sensitive, such as a marketing message.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a
     * one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * 
     * @return The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such
     *         as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical
     *         or time-sensitive, such as a marketing message.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a
     * one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * 
     * @param messageType
     *        The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such
     *        as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical
     *        or time-sensitive, such as a marketing message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public CampaignSmsMessage withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a
     * one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * 
     * @param messageType
     *        The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such
     *        as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical
     *        or time-sensitive, such as a marketing message.
     * @see MessageType
     */

    public void setMessageType(MessageType messageType) {
        withMessageType(messageType);
    }

    /**
     * <p>
     * The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a
     * one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical or
     * time-sensitive, such as a marketing message.
     * </p>
     * 
     * @param messageType
     *        The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such
     *        as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical
     *        or time-sensitive, such as a marketing message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public CampaignSmsMessage withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * The sender ID to display on recipients' devices when they receive the SMS message.
     * </p>
     * 
     * @param senderId
     *        The sender ID to display on recipients' devices when they receive the SMS message.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The sender ID to display on recipients' devices when they receive the SMS message.
     * </p>
     * 
     * @return The sender ID to display on recipients' devices when they receive the SMS message.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * <p>
     * The sender ID to display on recipients' devices when they receive the SMS message.
     * </p>
     * 
     * @param senderId
     *        The sender ID to display on recipients' devices when they receive the SMS message.
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

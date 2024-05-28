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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SendChatIntegrationEvent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendChatIntegrationEventRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * External identifier of chat customer participant, used in part to uniquely identify a chat. For SMS, this is the
     * E164 phone number of the chat customer participant.
     * </p>
     */
    private String sourceId;
    /**
     * <p>
     * Chat system identifier, used in part to uniquely identify chat. This is associated with the Amazon Connect
     * instance and flow to be used to start chats. For SMS, this is the phone number destination of inbound SMS
     * messages represented by an Amazon Pinpoint phone number ARN.
     * </p>
     */
    private String destinationId;
    /**
     * <p>
     * Classification of a channel. This is used in part to uniquely identify chat.
     * </p>
     * <p>
     * Valid value: <code>["connect:sms"]</code>
     * </p>
     */
    private String subtype;
    /**
     * <p>
     * Chat integration event payload
     * </p>
     */
    private ChatEvent event;
    /**
     * <p>
     * Contact properties to apply when starting a new chat. If the integration event is handled with an existing chat,
     * this is ignored.
     * </p>
     */
    private NewSessionDetails newSessionDetails;

    /**
     * <p>
     * External identifier of chat customer participant, used in part to uniquely identify a chat. For SMS, this is the
     * E164 phone number of the chat customer participant.
     * </p>
     * 
     * @param sourceId
     *        External identifier of chat customer participant, used in part to uniquely identify a chat. For SMS, this
     *        is the E164 phone number of the chat customer participant.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * External identifier of chat customer participant, used in part to uniquely identify a chat. For SMS, this is the
     * E164 phone number of the chat customer participant.
     * </p>
     * 
     * @return External identifier of chat customer participant, used in part to uniquely identify a chat. For SMS, this
     *         is the E164 phone number of the chat customer participant.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * External identifier of chat customer participant, used in part to uniquely identify a chat. For SMS, this is the
     * E164 phone number of the chat customer participant.
     * </p>
     * 
     * @param sourceId
     *        External identifier of chat customer participant, used in part to uniquely identify a chat. For SMS, this
     *        is the E164 phone number of the chat customer participant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChatIntegrationEventRequest withSourceId(String sourceId) {
        setSourceId(sourceId);
        return this;
    }

    /**
     * <p>
     * Chat system identifier, used in part to uniquely identify chat. This is associated with the Amazon Connect
     * instance and flow to be used to start chats. For SMS, this is the phone number destination of inbound SMS
     * messages represented by an Amazon Pinpoint phone number ARN.
     * </p>
     * 
     * @param destinationId
     *        Chat system identifier, used in part to uniquely identify chat. This is associated with the Amazon Connect
     *        instance and flow to be used to start chats. For SMS, this is the phone number destination of inbound SMS
     *        messages represented by an Amazon Pinpoint phone number ARN.
     */

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * Chat system identifier, used in part to uniquely identify chat. This is associated with the Amazon Connect
     * instance and flow to be used to start chats. For SMS, this is the phone number destination of inbound SMS
     * messages represented by an Amazon Pinpoint phone number ARN.
     * </p>
     * 
     * @return Chat system identifier, used in part to uniquely identify chat. This is associated with the Amazon
     *         Connect instance and flow to be used to start chats. For SMS, this is the phone number destination of
     *         inbound SMS messages represented by an Amazon Pinpoint phone number ARN.
     */

    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * <p>
     * Chat system identifier, used in part to uniquely identify chat. This is associated with the Amazon Connect
     * instance and flow to be used to start chats. For SMS, this is the phone number destination of inbound SMS
     * messages represented by an Amazon Pinpoint phone number ARN.
     * </p>
     * 
     * @param destinationId
     *        Chat system identifier, used in part to uniquely identify chat. This is associated with the Amazon Connect
     *        instance and flow to be used to start chats. For SMS, this is the phone number destination of inbound SMS
     *        messages represented by an Amazon Pinpoint phone number ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChatIntegrationEventRequest withDestinationId(String destinationId) {
        setDestinationId(destinationId);
        return this;
    }

    /**
     * <p>
     * Classification of a channel. This is used in part to uniquely identify chat.
     * </p>
     * <p>
     * Valid value: <code>["connect:sms"]</code>
     * </p>
     * 
     * @param subtype
     *        Classification of a channel. This is used in part to uniquely identify chat. </p>
     *        <p>
     *        Valid value: <code>["connect:sms"]</code>
     */

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     * <p>
     * Classification of a channel. This is used in part to uniquely identify chat.
     * </p>
     * <p>
     * Valid value: <code>["connect:sms"]</code>
     * </p>
     * 
     * @return Classification of a channel. This is used in part to uniquely identify chat. </p>
     *         <p>
     *         Valid value: <code>["connect:sms"]</code>
     */

    public String getSubtype() {
        return this.subtype;
    }

    /**
     * <p>
     * Classification of a channel. This is used in part to uniquely identify chat.
     * </p>
     * <p>
     * Valid value: <code>["connect:sms"]</code>
     * </p>
     * 
     * @param subtype
     *        Classification of a channel. This is used in part to uniquely identify chat. </p>
     *        <p>
     *        Valid value: <code>["connect:sms"]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChatIntegrationEventRequest withSubtype(String subtype) {
        setSubtype(subtype);
        return this;
    }

    /**
     * <p>
     * Chat integration event payload
     * </p>
     * 
     * @param event
     *        Chat integration event payload
     */

    public void setEvent(ChatEvent event) {
        this.event = event;
    }

    /**
     * <p>
     * Chat integration event payload
     * </p>
     * 
     * @return Chat integration event payload
     */

    public ChatEvent getEvent() {
        return this.event;
    }

    /**
     * <p>
     * Chat integration event payload
     * </p>
     * 
     * @param event
     *        Chat integration event payload
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChatIntegrationEventRequest withEvent(ChatEvent event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * Contact properties to apply when starting a new chat. If the integration event is handled with an existing chat,
     * this is ignored.
     * </p>
     * 
     * @param newSessionDetails
     *        Contact properties to apply when starting a new chat. If the integration event is handled with an existing
     *        chat, this is ignored.
     */

    public void setNewSessionDetails(NewSessionDetails newSessionDetails) {
        this.newSessionDetails = newSessionDetails;
    }

    /**
     * <p>
     * Contact properties to apply when starting a new chat. If the integration event is handled with an existing chat,
     * this is ignored.
     * </p>
     * 
     * @return Contact properties to apply when starting a new chat. If the integration event is handled with an
     *         existing chat, this is ignored.
     */

    public NewSessionDetails getNewSessionDetails() {
        return this.newSessionDetails;
    }

    /**
     * <p>
     * Contact properties to apply when starting a new chat. If the integration event is handled with an existing chat,
     * this is ignored.
     * </p>
     * 
     * @param newSessionDetails
     *        Contact properties to apply when starting a new chat. If the integration event is handled with an existing
     *        chat, this is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChatIntegrationEventRequest withNewSessionDetails(NewSessionDetails newSessionDetails) {
        setNewSessionDetails(newSessionDetails);
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
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId()).append(",");
        if (getDestinationId() != null)
            sb.append("DestinationId: ").append(getDestinationId()).append(",");
        if (getSubtype() != null)
            sb.append("Subtype: ").append(getSubtype()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getNewSessionDetails() != null)
            sb.append("NewSessionDetails: ").append(getNewSessionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendChatIntegrationEventRequest == false)
            return false;
        SendChatIntegrationEventRequest other = (SendChatIntegrationEventRequest) obj;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        if (other.getSubtype() == null ^ this.getSubtype() == null)
            return false;
        if (other.getSubtype() != null && other.getSubtype().equals(this.getSubtype()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getNewSessionDetails() == null ^ this.getNewSessionDetails() == null)
            return false;
        if (other.getNewSessionDetails() != null && other.getNewSessionDetails().equals(this.getNewSessionDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        hashCode = prime * hashCode + ((getSubtype() == null) ? 0 : getSubtype().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getNewSessionDetails() == null) ? 0 : getNewSessionDetails().hashCode());
        return hashCode;
    }

    @Override
    public SendChatIntegrationEventRequest clone() {
        return (SendChatIntegrationEventRequest) super.clone();
    }

}

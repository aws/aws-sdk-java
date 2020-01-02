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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about a flow event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/FlowExecutionMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowExecutionMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the message.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The type of flow event .
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The date and time when the message was last updated.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * A string containing information about the flow event.
     * </p>
     */
    private String payload;

    /**
     * <p>
     * The unique identifier of the message.
     * </p>
     * 
     * @param messageId
     *        The unique identifier of the message.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The unique identifier of the message.
     * </p>
     * 
     * @return The unique identifier of the message.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The unique identifier of the message.
     * </p>
     * 
     * @param messageId
     *        The unique identifier of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowExecutionMessage withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The type of flow event .
     * </p>
     * 
     * @param eventType
     *        The type of flow event .
     * @see FlowExecutionEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of flow event .
     * </p>
     * 
     * @return The type of flow event .
     * @see FlowExecutionEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of flow event .
     * </p>
     * 
     * @param eventType
     *        The type of flow event .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowExecutionEventType
     */

    public FlowExecutionMessage withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The type of flow event .
     * </p>
     * 
     * @param eventType
     *        The type of flow event .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowExecutionEventType
     */

    public FlowExecutionMessage withEventType(FlowExecutionEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the message was last updated.
     * </p>
     * 
     * @param timestamp
     *        The date and time when the message was last updated.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time when the message was last updated.
     * </p>
     * 
     * @return The date and time when the message was last updated.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The date and time when the message was last updated.
     * </p>
     * 
     * @param timestamp
     *        The date and time when the message was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowExecutionMessage withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * A string containing information about the flow event.
     * </p>
     * 
     * @param payload
     *        A string containing information about the flow event.
     */

    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * A string containing information about the flow event.
     * </p>
     * 
     * @return A string containing information about the flow event.
     */

    public String getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * A string containing information about the flow event.
     * </p>
     * 
     * @param payload
     *        A string containing information about the flow event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowExecutionMessage withPayload(String payload) {
        setPayload(payload);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowExecutionMessage == false)
            return false;
        FlowExecutionMessage other = (FlowExecutionMessage) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public FlowExecutionMessage clone() {
        try {
            return (FlowExecutionMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.FlowExecutionMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

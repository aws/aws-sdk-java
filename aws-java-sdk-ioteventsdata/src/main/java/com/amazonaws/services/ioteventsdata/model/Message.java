/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/Message" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID to assign to the message. Within each batch sent, each <code>"messageId"</code> must be unique.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The name of the input into which the message payload is transformed.
     * </p>
     */
    private String inputName;
    /**
     * <p>
     * The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data (in
     * which case you must decode it).
     * </p>
     */
    private java.nio.ByteBuffer payload;
    /**
     * <p>
     * The timestamp associated with the message.
     * </p>
     */
    private TimestampValue timestamp;

    /**
     * <p>
     * The ID to assign to the message. Within each batch sent, each <code>"messageId"</code> must be unique.
     * </p>
     * 
     * @param messageId
     *        The ID to assign to the message. Within each batch sent, each <code>"messageId"</code> must be unique.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID to assign to the message. Within each batch sent, each <code>"messageId"</code> must be unique.
     * </p>
     * 
     * @return The ID to assign to the message. Within each batch sent, each <code>"messageId"</code> must be unique.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The ID to assign to the message. Within each batch sent, each <code>"messageId"</code> must be unique.
     * </p>
     * 
     * @param messageId
     *        The ID to assign to the message. Within each batch sent, each <code>"messageId"</code> must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The name of the input into which the message payload is transformed.
     * </p>
     * 
     * @param inputName
     *        The name of the input into which the message payload is transformed.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the input into which the message payload is transformed.
     * </p>
     * 
     * @return The name of the input into which the message payload is transformed.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name of the input into which the message payload is transformed.
     * </p>
     * 
     * @param inputName
     *        The name of the input into which the message payload is transformed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withInputName(String inputName) {
        setInputName(inputName);
        return this;
    }

    /**
     * <p>
     * The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data (in
     * which case you must decode it).
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param payload
     *        The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data
     *        (in which case you must decode it).
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data (in
     * which case you must decode it).
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary
     *         data (in which case you must decode it).
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data (in
     * which case you must decode it).
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param payload
     *        The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data
     *        (in which case you must decode it).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * The timestamp associated with the message.
     * </p>
     * 
     * @param timestamp
     *        The timestamp associated with the message.
     */

    public void setTimestamp(TimestampValue timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp associated with the message.
     * </p>
     * 
     * @return The timestamp associated with the message.
     */

    public TimestampValue getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp associated with the message.
     * </p>
     * 
     * @param timestamp
     *        The timestamp associated with the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withTimestamp(TimestampValue timestamp) {
        setTimestamp(timestamp);
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
        if (getInputName() != null)
            sb.append("InputName: ").append(getInputName()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.MessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output from the GetRetainedMessage operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/GetRetainedMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRetainedMessageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The topic name to which the retained message was published.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The Base64-encoded message payload of the retained message body.
     * </p>
     */
    private java.nio.ByteBuffer payload;
    /**
     * <p>
     * The quality of service (QoS) level used to publish the retained message.
     * </p>
     */
    private Integer qos;
    /**
     * <p>
     * The Epoch date and time, in milliseconds, when the retained message was stored by IoT.
     * </p>
     */
    private Long lastModifiedTime;

    /**
     * <p>
     * The topic name to which the retained message was published.
     * </p>
     * 
     * @param topic
     *        The topic name to which the retained message was published.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic name to which the retained message was published.
     * </p>
     * 
     * @return The topic name to which the retained message was published.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The topic name to which the retained message was published.
     * </p>
     * 
     * @param topic
     *        The topic name to which the retained message was published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetainedMessageResult withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The Base64-encoded message payload of the retained message body.
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
     *        The Base64-encoded message payload of the retained message body.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The Base64-encoded message payload of the retained message body.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The Base64-encoded message payload of the retained message body.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The Base64-encoded message payload of the retained message body.
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
     *        The Base64-encoded message payload of the retained message body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetainedMessageResult withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * The quality of service (QoS) level used to publish the retained message.
     * </p>
     * 
     * @param qos
     *        The quality of service (QoS) level used to publish the retained message.
     */

    public void setQos(Integer qos) {
        this.qos = qos;
    }

    /**
     * <p>
     * The quality of service (QoS) level used to publish the retained message.
     * </p>
     * 
     * @return The quality of service (QoS) level used to publish the retained message.
     */

    public Integer getQos() {
        return this.qos;
    }

    /**
     * <p>
     * The quality of service (QoS) level used to publish the retained message.
     * </p>
     * 
     * @param qos
     *        The quality of service (QoS) level used to publish the retained message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetainedMessageResult withQos(Integer qos) {
        setQos(qos);
        return this;
    }

    /**
     * <p>
     * The Epoch date and time, in milliseconds, when the retained message was stored by IoT.
     * </p>
     * 
     * @param lastModifiedTime
     *        The Epoch date and time, in milliseconds, when the retained message was stored by IoT.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The Epoch date and time, in milliseconds, when the retained message was stored by IoT.
     * </p>
     * 
     * @return The Epoch date and time, in milliseconds, when the retained message was stored by IoT.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The Epoch date and time, in milliseconds, when the retained message was stored by IoT.
     * </p>
     * 
     * @param lastModifiedTime
     *        The Epoch date and time, in milliseconds, when the retained message was stored by IoT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetainedMessageResult withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload()).append(",");
        if (getQos() != null)
            sb.append("Qos: ").append(getQos()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRetainedMessageResult == false)
            return false;
        GetRetainedMessageResult other = (GetRetainedMessageResult) obj;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getQos() == null ^ this.getQos() == null)
            return false;
        if (other.getQos() != null && other.getQos().equals(this.getQos()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getQos() == null) ? 0 : getQos().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public GetRetainedMessageResult clone() {
        try {
            return (GetRetainedMessageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

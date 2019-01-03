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
package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the Publish operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The Quality of Service (QoS) level.
     * </p>
     */
    private Integer qos;
    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * 
     * @param topic
     *        The name of the MQTT topic.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * 
     * @return The name of the MQTT topic.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * 
     * @param topic
     *        The name of the MQTT topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level.
     * </p>
     * 
     * @param qos
     *        The Quality of Service (QoS) level.
     */

    public void setQos(Integer qos) {
        this.qos = qos;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level.
     * </p>
     * 
     * @return The Quality of Service (QoS) level.
     */

    public Integer getQos() {
        return this.qos;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level.
     * </p>
     * 
     * @param qos
     *        The Quality of Service (QoS) level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withQos(Integer qos) {
        setQos(qos);
        return this;
    }

    /**
     * <p>
     * The state information, in JSON format.
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
     *        The state information, in JSON format.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The state information, in JSON format.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The state information, in JSON format.
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
     *        The state information, in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishRequest withPayload(java.nio.ByteBuffer payload) {
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
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
        if (getQos() != null)
            sb.append("Qos: ").append(getQos()).append(",");
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

        if (obj instanceof PublishRequest == false)
            return false;
        PublishRequest other = (PublishRequest) obj;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getQos() == null ^ this.getQos() == null)
            return false;
        if (other.getQos() != null && other.getQos().equals(this.getQos()) == false)
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

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getQos() == null) ? 0 : getQos().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public PublishRequest clone() {
        return (PublishRequest) super.clone();
    }

}

/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class PublishRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    private String topic;

    private Integer qos;

    private java.nio.ByteBuffer payload;

    /**
     * Sets the value of the Topic property for this object.
     * 
     * @param topic
     *        The new value for the Topic property for this object.
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * Returns the value of the Topic property for this object.
     * 
     * @return The value of the Topic property for this object.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Sets the value of the Topic property for this object.
     * 
     * @param topic
     *        The new value for the Topic property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PublishRequest withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * Sets the value of the Qos property for this object.
     * 
     * @param qos
     *        The new value for the Qos property for this object.
     */
    public void setQos(Integer qos) {
        this.qos = qos;
    }

    /**
     * Returns the value of the Qos property for this object.
     * 
     * @return The value of the Qos property for this object.
     */
    public Integer getQos() {
        return this.qos;
    }

    /**
     * Sets the value of the Qos property for this object.
     * 
     * @param qos
     *        The new value for the Qos property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PublishRequest withQos(Integer qos) {
        setQos(qos);
        return this;
    }

    /**
     * Sets the value of the Payload property for this object.
     * 
     * @param payload
     *        The new value for the Payload property for this object.
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * Returns the value of the Payload property for this object.
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods
     * changes their {@code position}. We recommend using
     * {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view
     * of the buffer with an independent {@code position}, and calling
     * {@code get} methods on this rather than directly on the returned
     * {@code ByteBuffer}. Doing so will ensure that anyone else using the
     * {@code ByteBuffer} will not be affected by changes to the {@code position}
     * .
     * </p>
     * 
     * @return The value of the Payload property for this object.
     */
    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * Sets the value of the Payload property for this object.
     * 
     * @param payload
     *        The new value for the Payload property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PublishRequest withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Topic: " + getTopic() + ",");
        if (getQos() != null)
            sb.append("Qos: " + getQos() + ",");
        if (getPayload() != null)
            sb.append("Payload: " + getPayload());
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
        if (other.getTopic() != null
                && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getQos() == null ^ this.getQos() == null)
            return false;
        if (other.getQos() != null
                && other.getQos().equals(this.getQos()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null
                && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode
                + ((getQos() == null) ? 0 : getQos().hashCode());
        hashCode = prime * hashCode
                + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public PublishRequest clone() {
        return (PublishRequest) super.clone();
    }
}
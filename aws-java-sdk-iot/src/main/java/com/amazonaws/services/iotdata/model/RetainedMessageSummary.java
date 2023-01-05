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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a single retained message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/RetainedMessageSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetainedMessageSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The topic name to which the retained message was published.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The size of the retained message's payload in bytes.
     * </p>
     */
    private Long payloadSize;
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

    public RetainedMessageSummary withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The size of the retained message's payload in bytes.
     * </p>
     * 
     * @param payloadSize
     *        The size of the retained message's payload in bytes.
     */

    public void setPayloadSize(Long payloadSize) {
        this.payloadSize = payloadSize;
    }

    /**
     * <p>
     * The size of the retained message's payload in bytes.
     * </p>
     * 
     * @return The size of the retained message's payload in bytes.
     */

    public Long getPayloadSize() {
        return this.payloadSize;
    }

    /**
     * <p>
     * The size of the retained message's payload in bytes.
     * </p>
     * 
     * @param payloadSize
     *        The size of the retained message's payload in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetainedMessageSummary withPayloadSize(Long payloadSize) {
        setPayloadSize(payloadSize);
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

    public RetainedMessageSummary withQos(Integer qos) {
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

    public RetainedMessageSummary withLastModifiedTime(Long lastModifiedTime) {
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
        if (getPayloadSize() != null)
            sb.append("PayloadSize: ").append(getPayloadSize()).append(",");
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

        if (obj instanceof RetainedMessageSummary == false)
            return false;
        RetainedMessageSummary other = (RetainedMessageSummary) obj;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getPayloadSize() == null ^ this.getPayloadSize() == null)
            return false;
        if (other.getPayloadSize() != null && other.getPayloadSize().equals(this.getPayloadSize()) == false)
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
        hashCode = prime * hashCode + ((getPayloadSize() == null) ? 0 : getPayloadSize().hashCode());
        hashCode = prime * hashCode + ((getQos() == null) ? 0 : getQos().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public RetainedMessageSummary clone() {
        try {
            return (RetainedMessageSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdata.model.transform.RetainedMessageSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

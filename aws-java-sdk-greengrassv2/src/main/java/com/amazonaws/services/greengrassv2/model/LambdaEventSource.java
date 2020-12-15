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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an event source for an AWS Lambda function. The event source defines the topics on which
 * this Lambda function subscribes to receive messages that run the function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/LambdaEventSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaEventSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The topic to which to subscribe to receive event messages.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The type of event source. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUB_SUB</code> – Subscribe to local publish/subscribe messages. This event source type doesn't support MQTT
     * wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IOT_CORE</code> – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT wildcards (
     * <code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The topic to which to subscribe to receive event messages.
     * </p>
     * 
     * @param topic
     *        The topic to which to subscribe to receive event messages.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic to which to subscribe to receive event messages.
     * </p>
     * 
     * @return The topic to which to subscribe to receive event messages.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The topic to which to subscribe to receive event messages.
     * </p>
     * 
     * @param topic
     *        The topic to which to subscribe to receive event messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaEventSource withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The type of event source. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUB_SUB</code> – Subscribe to local publish/subscribe messages. This event source type doesn't support MQTT
     * wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IOT_CORE</code> – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT wildcards (
     * <code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of event source. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUB_SUB</code> – Subscribe to local publish/subscribe messages. This event source type doesn't
     *        support MQTT wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IOT_CORE</code> – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT
     *        wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     *        </p>
     *        </li>
     * @see LambdaEventSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of event source. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUB_SUB</code> – Subscribe to local publish/subscribe messages. This event source type doesn't support MQTT
     * wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IOT_CORE</code> – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT wildcards (
     * <code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of event source. Choose from the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PUB_SUB</code> – Subscribe to local publish/subscribe messages. This event source type doesn't
     *         support MQTT wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IOT_CORE</code> – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT
     *         wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     *         </p>
     *         </li>
     * @see LambdaEventSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of event source. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUB_SUB</code> – Subscribe to local publish/subscribe messages. This event source type doesn't support MQTT
     * wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IOT_CORE</code> – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT wildcards (
     * <code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of event source. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUB_SUB</code> – Subscribe to local publish/subscribe messages. This event source type doesn't
     *        support MQTT wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IOT_CORE</code> – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT
     *        wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaEventSourceType
     */

    public LambdaEventSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of event source. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUB_SUB</code> – Subscribe to local publish/subscribe messages. This event source type doesn't support MQTT
     * wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IOT_CORE</code> – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT wildcards (
     * <code>+</code> and <code>#</code>) in the event source topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of event source. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUB_SUB</code> – Subscribe to local publish/subscribe messages. This event source type doesn't
     *        support MQTT wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IOT_CORE</code> – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT
     *        wildcards (<code>+</code> and <code>#</code>) in the event source topic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaEventSourceType
     */

    public LambdaEventSource withType(LambdaEventSourceType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaEventSource == false)
            return false;
        LambdaEventSource other = (LambdaEventSource) obj;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public LambdaEventSource clone() {
        try {
            return (LambdaEventSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.LambdaEventSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

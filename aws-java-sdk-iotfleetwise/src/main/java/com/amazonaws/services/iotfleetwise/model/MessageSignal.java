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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The decoding information for a specific message which support higher order data types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/MessageSignal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageSignal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The topic name for the message signal. It corresponds to topics in ROS 2.
     * </p>
     */
    private String topicName;
    /**
     * <p>
     * The structured message for the message signal. It can be defined with either a
     * <code>primitiveMessageDefinition</code>, <code>structuredMessageListDefinition</code>, or
     * <code>structuredMessageDefinition</code> recursively.
     * </p>
     */
    private StructuredMessage structuredMessage;

    /**
     * <p>
     * The topic name for the message signal. It corresponds to topics in ROS 2.
     * </p>
     * 
     * @param topicName
     *        The topic name for the message signal. It corresponds to topics in ROS 2.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The topic name for the message signal. It corresponds to topics in ROS 2.
     * </p>
     * 
     * @return The topic name for the message signal. It corresponds to topics in ROS 2.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The topic name for the message signal. It corresponds to topics in ROS 2.
     * </p>
     * 
     * @param topicName
     *        The topic name for the message signal. It corresponds to topics in ROS 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageSignal withTopicName(String topicName) {
        setTopicName(topicName);
        return this;
    }

    /**
     * <p>
     * The structured message for the message signal. It can be defined with either a
     * <code>primitiveMessageDefinition</code>, <code>structuredMessageListDefinition</code>, or
     * <code>structuredMessageDefinition</code> recursively.
     * </p>
     * 
     * @param structuredMessage
     *        The structured message for the message signal. It can be defined with either a
     *        <code>primitiveMessageDefinition</code>, <code>structuredMessageListDefinition</code>, or
     *        <code>structuredMessageDefinition</code> recursively.
     */

    public void setStructuredMessage(StructuredMessage structuredMessage) {
        this.structuredMessage = structuredMessage;
    }

    /**
     * <p>
     * The structured message for the message signal. It can be defined with either a
     * <code>primitiveMessageDefinition</code>, <code>structuredMessageListDefinition</code>, or
     * <code>structuredMessageDefinition</code> recursively.
     * </p>
     * 
     * @return The structured message for the message signal. It can be defined with either a
     *         <code>primitiveMessageDefinition</code>, <code>structuredMessageListDefinition</code>, or
     *         <code>structuredMessageDefinition</code> recursively.
     */

    public StructuredMessage getStructuredMessage() {
        return this.structuredMessage;
    }

    /**
     * <p>
     * The structured message for the message signal. It can be defined with either a
     * <code>primitiveMessageDefinition</code>, <code>structuredMessageListDefinition</code>, or
     * <code>structuredMessageDefinition</code> recursively.
     * </p>
     * 
     * @param structuredMessage
     *        The structured message for the message signal. It can be defined with either a
     *        <code>primitiveMessageDefinition</code>, <code>structuredMessageListDefinition</code>, or
     *        <code>structuredMessageDefinition</code> recursively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageSignal withStructuredMessage(StructuredMessage structuredMessage) {
        setStructuredMessage(structuredMessage);
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
        if (getTopicName() != null)
            sb.append("TopicName: ").append(getTopicName()).append(",");
        if (getStructuredMessage() != null)
            sb.append("StructuredMessage: ").append(getStructuredMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageSignal == false)
            return false;
        MessageSignal other = (MessageSignal) obj;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        if (other.getStructuredMessage() == null ^ this.getStructuredMessage() == null)
            return false;
        if (other.getStructuredMessage() != null && other.getStructuredMessage().equals(this.getStructuredMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        hashCode = prime * hashCode + ((getStructuredMessage() == null) ? 0 : getStructuredMessage().hashCode());
        return hashCode;
    }

    @Override
    public MessageSignal clone() {
        try {
            return (MessageSignal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.MessageSignalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information required to publish the MQTT message through the AWS IoT message broker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/IotTopicPublishAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotTopicPublishAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The MQTT topic of the message. You can use a string expression that includes variables (
     * <code>$variable.&lt;variable-name&gt;</code>) and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the topic string.
     * </p>
     */
    private String mqttTopic;

    /**
     * <p>
     * The MQTT topic of the message. You can use a string expression that includes variables (
     * <code>$variable.&lt;variable-name&gt;</code>) and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the topic string.
     * </p>
     * 
     * @param mqttTopic
     *        The MQTT topic of the message. You can use a string expression that includes variables (
     *        <code>$variable.&lt;variable-name&gt;</code>) and input values (
     *        <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the topic string.
     */

    public void setMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
    }

    /**
     * <p>
     * The MQTT topic of the message. You can use a string expression that includes variables (
     * <code>$variable.&lt;variable-name&gt;</code>) and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the topic string.
     * </p>
     * 
     * @return The MQTT topic of the message. You can use a string expression that includes variables (
     *         <code>$variable.&lt;variable-name&gt;</code>) and input values (
     *         <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the topic string.
     */

    public String getMqttTopic() {
        return this.mqttTopic;
    }

    /**
     * <p>
     * The MQTT topic of the message. You can use a string expression that includes variables (
     * <code>$variable.&lt;variable-name&gt;</code>) and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the topic string.
     * </p>
     * 
     * @param mqttTopic
     *        The MQTT topic of the message. You can use a string expression that includes variables (
     *        <code>$variable.&lt;variable-name&gt;</code>) and input values (
     *        <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the topic string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotTopicPublishAction withMqttTopic(String mqttTopic) {
        setMqttTopic(mqttTopic);
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
        if (getMqttTopic() != null)
            sb.append("MqttTopic: ").append(getMqttTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotTopicPublishAction == false)
            return false;
        IotTopicPublishAction other = (IotTopicPublishAction) obj;
        if (other.getMqttTopic() == null ^ this.getMqttTopic() == null)
            return false;
        if (other.getMqttTopic() != null && other.getMqttTopic().equals(this.getMqttTopic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMqttTopic() == null) ? 0 : getMqttTopic().hashCode());
        return hashCode;
    }

    @Override
    public IotTopicPublishAction clone() {
        try {
            return (IotTopicPublishAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.IotTopicPublishActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

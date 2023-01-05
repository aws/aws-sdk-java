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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object for LoRaWAN connection status resource type event configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANConnectionStatusResourceTypeEventConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANConnectionStatusResourceTypeEventConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Denotes whether the wireless gateway connection status event topic is enabled or disabled.
     * </p>
     */
    private String wirelessGatewayEventTopic;

    /**
     * <p>
     * Denotes whether the wireless gateway connection status event topic is enabled or disabled.
     * </p>
     * 
     * @param wirelessGatewayEventTopic
     *        Denotes whether the wireless gateway connection status event topic is enabled or disabled.
     * @see EventNotificationTopicStatus
     */

    public void setWirelessGatewayEventTopic(String wirelessGatewayEventTopic) {
        this.wirelessGatewayEventTopic = wirelessGatewayEventTopic;
    }

    /**
     * <p>
     * Denotes whether the wireless gateway connection status event topic is enabled or disabled.
     * </p>
     * 
     * @return Denotes whether the wireless gateway connection status event topic is enabled or disabled.
     * @see EventNotificationTopicStatus
     */

    public String getWirelessGatewayEventTopic() {
        return this.wirelessGatewayEventTopic;
    }

    /**
     * <p>
     * Denotes whether the wireless gateway connection status event topic is enabled or disabled.
     * </p>
     * 
     * @param wirelessGatewayEventTopic
     *        Denotes whether the wireless gateway connection status event topic is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationTopicStatus
     */

    public LoRaWANConnectionStatusResourceTypeEventConfiguration withWirelessGatewayEventTopic(String wirelessGatewayEventTopic) {
        setWirelessGatewayEventTopic(wirelessGatewayEventTopic);
        return this;
    }

    /**
     * <p>
     * Denotes whether the wireless gateway connection status event topic is enabled or disabled.
     * </p>
     * 
     * @param wirelessGatewayEventTopic
     *        Denotes whether the wireless gateway connection status event topic is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationTopicStatus
     */

    public LoRaWANConnectionStatusResourceTypeEventConfiguration withWirelessGatewayEventTopic(EventNotificationTopicStatus wirelessGatewayEventTopic) {
        this.wirelessGatewayEventTopic = wirelessGatewayEventTopic.toString();
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
        if (getWirelessGatewayEventTopic() != null)
            sb.append("WirelessGatewayEventTopic: ").append(getWirelessGatewayEventTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANConnectionStatusResourceTypeEventConfiguration == false)
            return false;
        LoRaWANConnectionStatusResourceTypeEventConfiguration other = (LoRaWANConnectionStatusResourceTypeEventConfiguration) obj;
        if (other.getWirelessGatewayEventTopic() == null ^ this.getWirelessGatewayEventTopic() == null)
            return false;
        if (other.getWirelessGatewayEventTopic() != null && other.getWirelessGatewayEventTopic().equals(this.getWirelessGatewayEventTopic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWirelessGatewayEventTopic() == null) ? 0 : getWirelessGatewayEventTopic().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANConnectionStatusResourceTypeEventConfiguration clone() {
        try {
            return (LoRaWANConnectionStatusResourceTypeEventConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANConnectionStatusResourceTypeEventConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

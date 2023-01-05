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
 * Object for LoRaWAN join resource type event configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANJoinResourceTypeEventConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANJoinResourceTypeEventConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Denotes whether the wireless device join event topic is enabled or disabled.
     * </p>
     */
    private String wirelessDeviceEventTopic;

    /**
     * <p>
     * Denotes whether the wireless device join event topic is enabled or disabled.
     * </p>
     * 
     * @param wirelessDeviceEventTopic
     *        Denotes whether the wireless device join event topic is enabled or disabled.
     * @see EventNotificationTopicStatus
     */

    public void setWirelessDeviceEventTopic(String wirelessDeviceEventTopic) {
        this.wirelessDeviceEventTopic = wirelessDeviceEventTopic;
    }

    /**
     * <p>
     * Denotes whether the wireless device join event topic is enabled or disabled.
     * </p>
     * 
     * @return Denotes whether the wireless device join event topic is enabled or disabled.
     * @see EventNotificationTopicStatus
     */

    public String getWirelessDeviceEventTopic() {
        return this.wirelessDeviceEventTopic;
    }

    /**
     * <p>
     * Denotes whether the wireless device join event topic is enabled or disabled.
     * </p>
     * 
     * @param wirelessDeviceEventTopic
     *        Denotes whether the wireless device join event topic is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationTopicStatus
     */

    public LoRaWANJoinResourceTypeEventConfiguration withWirelessDeviceEventTopic(String wirelessDeviceEventTopic) {
        setWirelessDeviceEventTopic(wirelessDeviceEventTopic);
        return this;
    }

    /**
     * <p>
     * Denotes whether the wireless device join event topic is enabled or disabled.
     * </p>
     * 
     * @param wirelessDeviceEventTopic
     *        Denotes whether the wireless device join event topic is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationTopicStatus
     */

    public LoRaWANJoinResourceTypeEventConfiguration withWirelessDeviceEventTopic(EventNotificationTopicStatus wirelessDeviceEventTopic) {
        this.wirelessDeviceEventTopic = wirelessDeviceEventTopic.toString();
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
        if (getWirelessDeviceEventTopic() != null)
            sb.append("WirelessDeviceEventTopic: ").append(getWirelessDeviceEventTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANJoinResourceTypeEventConfiguration == false)
            return false;
        LoRaWANJoinResourceTypeEventConfiguration other = (LoRaWANJoinResourceTypeEventConfiguration) obj;
        if (other.getWirelessDeviceEventTopic() == null ^ this.getWirelessDeviceEventTopic() == null)
            return false;
        if (other.getWirelessDeviceEventTopic() != null && other.getWirelessDeviceEventTopic().equals(this.getWirelessDeviceEventTopic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWirelessDeviceEventTopic() == null) ? 0 : getWirelessDeviceEventTopic().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANJoinResourceTypeEventConfiguration clone() {
        try {
            return (LoRaWANJoinResourceTypeEventConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANJoinResourceTypeEventConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

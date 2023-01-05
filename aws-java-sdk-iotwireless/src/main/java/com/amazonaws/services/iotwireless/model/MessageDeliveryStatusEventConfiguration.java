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
 * Message delivery status event configuration object for enabling and disabling relevant topics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/MessageDeliveryStatusEventConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageDeliveryStatusEventConfiguration implements Serializable, Cloneable, StructuredPojo {

    private SidewalkEventNotificationConfigurations sidewalk;
    /**
     * <p>
     * Denotes whether the wireless device ID message delivery status event topic is enabled or disabled.
     * </p>
     */
    private String wirelessDeviceIdEventTopic;

    /**
     * @param sidewalk
     */

    public void setSidewalk(SidewalkEventNotificationConfigurations sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * @return
     */

    public SidewalkEventNotificationConfigurations getSidewalk() {
        return this.sidewalk;
    }

    /**
     * @param sidewalk
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageDeliveryStatusEventConfiguration withSidewalk(SidewalkEventNotificationConfigurations sidewalk) {
        setSidewalk(sidewalk);
        return this;
    }

    /**
     * <p>
     * Denotes whether the wireless device ID message delivery status event topic is enabled or disabled.
     * </p>
     * 
     * @param wirelessDeviceIdEventTopic
     *        Denotes whether the wireless device ID message delivery status event topic is enabled or disabled.
     * @see EventNotificationTopicStatus
     */

    public void setWirelessDeviceIdEventTopic(String wirelessDeviceIdEventTopic) {
        this.wirelessDeviceIdEventTopic = wirelessDeviceIdEventTopic;
    }

    /**
     * <p>
     * Denotes whether the wireless device ID message delivery status event topic is enabled or disabled.
     * </p>
     * 
     * @return Denotes whether the wireless device ID message delivery status event topic is enabled or disabled.
     * @see EventNotificationTopicStatus
     */

    public String getWirelessDeviceIdEventTopic() {
        return this.wirelessDeviceIdEventTopic;
    }

    /**
     * <p>
     * Denotes whether the wireless device ID message delivery status event topic is enabled or disabled.
     * </p>
     * 
     * @param wirelessDeviceIdEventTopic
     *        Denotes whether the wireless device ID message delivery status event topic is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationTopicStatus
     */

    public MessageDeliveryStatusEventConfiguration withWirelessDeviceIdEventTopic(String wirelessDeviceIdEventTopic) {
        setWirelessDeviceIdEventTopic(wirelessDeviceIdEventTopic);
        return this;
    }

    /**
     * <p>
     * Denotes whether the wireless device ID message delivery status event topic is enabled or disabled.
     * </p>
     * 
     * @param wirelessDeviceIdEventTopic
     *        Denotes whether the wireless device ID message delivery status event topic is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationTopicStatus
     */

    public MessageDeliveryStatusEventConfiguration withWirelessDeviceIdEventTopic(EventNotificationTopicStatus wirelessDeviceIdEventTopic) {
        this.wirelessDeviceIdEventTopic = wirelessDeviceIdEventTopic.toString();
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
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk()).append(",");
        if (getWirelessDeviceIdEventTopic() != null)
            sb.append("WirelessDeviceIdEventTopic: ").append(getWirelessDeviceIdEventTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageDeliveryStatusEventConfiguration == false)
            return false;
        MessageDeliveryStatusEventConfiguration other = (MessageDeliveryStatusEventConfiguration) obj;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        if (other.getWirelessDeviceIdEventTopic() == null ^ this.getWirelessDeviceIdEventTopic() == null)
            return false;
        if (other.getWirelessDeviceIdEventTopic() != null && other.getWirelessDeviceIdEventTopic().equals(this.getWirelessDeviceIdEventTopic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        hashCode = prime * hashCode + ((getWirelessDeviceIdEventTopic() == null) ? 0 : getWirelessDeviceIdEventTopic().hashCode());
        return hashCode;
    }

    @Override
    public MessageDeliveryStatusEventConfiguration clone() {
        try {
            return (MessageDeliveryStatusEventConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.MessageDeliveryStatusEventConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

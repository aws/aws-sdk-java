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
 * The message in the downlink queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DownlinkQueueMessage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DownlinkQueueMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message ID assigned by IoT Wireless to each downlink message, which helps identify the message.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The transmit mode to use for sending data to the wireless device. This can be <code>0</code> for UM
     * (unacknowledge mode) or <code>1</code> for AM (acknowledge mode).
     * </p>
     */
    private Integer transmitMode;
    /**
     * <p>
     * The time at which Iot Wireless received the downlink message.
     * </p>
     */
    private String receivedAt;

    private LoRaWANSendDataToDevice loRaWAN;

    /**
     * <p>
     * The message ID assigned by IoT Wireless to each downlink message, which helps identify the message.
     * </p>
     * 
     * @param messageId
     *        The message ID assigned by IoT Wireless to each downlink message, which helps identify the message.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The message ID assigned by IoT Wireless to each downlink message, which helps identify the message.
     * </p>
     * 
     * @return The message ID assigned by IoT Wireless to each downlink message, which helps identify the message.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The message ID assigned by IoT Wireless to each downlink message, which helps identify the message.
     * </p>
     * 
     * @param messageId
     *        The message ID assigned by IoT Wireless to each downlink message, which helps identify the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DownlinkQueueMessage withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The transmit mode to use for sending data to the wireless device. This can be <code>0</code> for UM
     * (unacknowledge mode) or <code>1</code> for AM (acknowledge mode).
     * </p>
     * 
     * @param transmitMode
     *        The transmit mode to use for sending data to the wireless device. This can be <code>0</code> for UM
     *        (unacknowledge mode) or <code>1</code> for AM (acknowledge mode).
     */

    public void setTransmitMode(Integer transmitMode) {
        this.transmitMode = transmitMode;
    }

    /**
     * <p>
     * The transmit mode to use for sending data to the wireless device. This can be <code>0</code> for UM
     * (unacknowledge mode) or <code>1</code> for AM (acknowledge mode).
     * </p>
     * 
     * @return The transmit mode to use for sending data to the wireless device. This can be <code>0</code> for UM
     *         (unacknowledge mode) or <code>1</code> for AM (acknowledge mode).
     */

    public Integer getTransmitMode() {
        return this.transmitMode;
    }

    /**
     * <p>
     * The transmit mode to use for sending data to the wireless device. This can be <code>0</code> for UM
     * (unacknowledge mode) or <code>1</code> for AM (acknowledge mode).
     * </p>
     * 
     * @param transmitMode
     *        The transmit mode to use for sending data to the wireless device. This can be <code>0</code> for UM
     *        (unacknowledge mode) or <code>1</code> for AM (acknowledge mode).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DownlinkQueueMessage withTransmitMode(Integer transmitMode) {
        setTransmitMode(transmitMode);
        return this;
    }

    /**
     * <p>
     * The time at which Iot Wireless received the downlink message.
     * </p>
     * 
     * @param receivedAt
     *        The time at which Iot Wireless received the downlink message.
     */

    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * <p>
     * The time at which Iot Wireless received the downlink message.
     * </p>
     * 
     * @return The time at which Iot Wireless received the downlink message.
     */

    public String getReceivedAt() {
        return this.receivedAt;
    }

    /**
     * <p>
     * The time at which Iot Wireless received the downlink message.
     * </p>
     * 
     * @param receivedAt
     *        The time at which Iot Wireless received the downlink message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DownlinkQueueMessage withReceivedAt(String receivedAt) {
        setReceivedAt(receivedAt);
        return this;
    }

    /**
     * @param loRaWAN
     */

    public void setLoRaWAN(LoRaWANSendDataToDevice loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * @return
     */

    public LoRaWANSendDataToDevice getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * @param loRaWAN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DownlinkQueueMessage withLoRaWAN(LoRaWANSendDataToDevice loRaWAN) {
        setLoRaWAN(loRaWAN);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getTransmitMode() != null)
            sb.append("TransmitMode: ").append(getTransmitMode()).append(",");
        if (getReceivedAt() != null)
            sb.append("ReceivedAt: ").append(getReceivedAt()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DownlinkQueueMessage == false)
            return false;
        DownlinkQueueMessage other = (DownlinkQueueMessage) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getTransmitMode() == null ^ this.getTransmitMode() == null)
            return false;
        if (other.getTransmitMode() != null && other.getTransmitMode().equals(this.getTransmitMode()) == false)
            return false;
        if (other.getReceivedAt() == null ^ this.getReceivedAt() == null)
            return false;
        if (other.getReceivedAt() != null && other.getReceivedAt().equals(this.getReceivedAt()) == false)
            return false;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getTransmitMode() == null) ? 0 : getTransmitMode().hashCode());
        hashCode = prime * hashCode + ((getReceivedAt() == null) ? 0 : getReceivedAt().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        return hashCode;
    }

    @Override
    public DownlinkQueueMessage clone() {
        try {
            return (DownlinkQueueMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.DownlinkQueueMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

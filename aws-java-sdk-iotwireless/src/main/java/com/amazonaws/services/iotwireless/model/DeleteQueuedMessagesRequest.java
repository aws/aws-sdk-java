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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteQueuedMessages" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteQueuedMessagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a given wireless device for which downlink messages will be deleted.
     * </p>
     */
    private String id;
    /**
     * <p>
     * If message ID is <code>"*"</code>, it cleares the entire downlink queue for a given device, specified by the
     * wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The wireless device type, which can be either Sidewalk or LoRaWAN.
     * </p>
     */
    private String wirelessDeviceType;

    /**
     * <p>
     * The ID of a given wireless device for which downlink messages will be deleted.
     * </p>
     * 
     * @param id
     *        The ID of a given wireless device for which downlink messages will be deleted.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of a given wireless device for which downlink messages will be deleted.
     * </p>
     * 
     * @return The ID of a given wireless device for which downlink messages will be deleted.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of a given wireless device for which downlink messages will be deleted.
     * </p>
     * 
     * @param id
     *        The ID of a given wireless device for which downlink messages will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueuedMessagesRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * If message ID is <code>"*"</code>, it cleares the entire downlink queue for a given device, specified by the
     * wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted.
     * </p>
     * 
     * @param messageId
     *        If message ID is <code>"*"</code>, it cleares the entire downlink queue for a given device, specified by
     *        the wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * If message ID is <code>"*"</code>, it cleares the entire downlink queue for a given device, specified by the
     * wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted.
     * </p>
     * 
     * @return If message ID is <code>"*"</code>, it cleares the entire downlink queue for a given device, specified by
     *         the wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * If message ID is <code>"*"</code>, it cleares the entire downlink queue for a given device, specified by the
     * wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted.
     * </p>
     * 
     * @param messageId
     *        If message ID is <code>"*"</code>, it cleares the entire downlink queue for a given device, specified by
     *        the wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueuedMessagesRequest withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The wireless device type, which can be either Sidewalk or LoRaWAN.
     * </p>
     * 
     * @param wirelessDeviceType
     *        The wireless device type, which can be either Sidewalk or LoRaWAN.
     * @see WirelessDeviceType
     */

    public void setWirelessDeviceType(String wirelessDeviceType) {
        this.wirelessDeviceType = wirelessDeviceType;
    }

    /**
     * <p>
     * The wireless device type, which can be either Sidewalk or LoRaWAN.
     * </p>
     * 
     * @return The wireless device type, which can be either Sidewalk or LoRaWAN.
     * @see WirelessDeviceType
     */

    public String getWirelessDeviceType() {
        return this.wirelessDeviceType;
    }

    /**
     * <p>
     * The wireless device type, which can be either Sidewalk or LoRaWAN.
     * </p>
     * 
     * @param wirelessDeviceType
     *        The wireless device type, which can be either Sidewalk or LoRaWAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public DeleteQueuedMessagesRequest withWirelessDeviceType(String wirelessDeviceType) {
        setWirelessDeviceType(wirelessDeviceType);
        return this;
    }

    /**
     * <p>
     * The wireless device type, which can be either Sidewalk or LoRaWAN.
     * </p>
     * 
     * @param wirelessDeviceType
     *        The wireless device type, which can be either Sidewalk or LoRaWAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public DeleteQueuedMessagesRequest withWirelessDeviceType(WirelessDeviceType wirelessDeviceType) {
        this.wirelessDeviceType = wirelessDeviceType.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getWirelessDeviceType() != null)
            sb.append("WirelessDeviceType: ").append(getWirelessDeviceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteQueuedMessagesRequest == false)
            return false;
        DeleteQueuedMessagesRequest other = (DeleteQueuedMessagesRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getWirelessDeviceType() == null ^ this.getWirelessDeviceType() == null)
            return false;
        if (other.getWirelessDeviceType() != null && other.getWirelessDeviceType().equals(this.getWirelessDeviceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getWirelessDeviceType() == null) ? 0 : getWirelessDeviceType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteQueuedMessagesRequest clone() {
        return (DeleteQueuedMessagesRequest) super.clone();
    }

}

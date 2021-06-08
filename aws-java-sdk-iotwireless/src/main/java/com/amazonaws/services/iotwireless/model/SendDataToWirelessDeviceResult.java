/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToWirelessDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendDataToWirelessDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the message sent to the wireless device.
     * </p>
     */
    private String messageId;

    /**
     * <p>
     * The ID of the message sent to the wireless device.
     * </p>
     * 
     * @param messageId
     *        The ID of the message sent to the wireless device.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID of the message sent to the wireless device.
     * </p>
     * 
     * @return The ID of the message sent to the wireless device.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The ID of the message sent to the wireless device.
     * </p>
     * 
     * @param messageId
     *        The ID of the message sent to the wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataToWirelessDeviceResult withMessageId(String messageId) {
        setMessageId(messageId);
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
            sb.append("MessageId: ").append(getMessageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendDataToWirelessDeviceResult == false)
            return false;
        SendDataToWirelessDeviceResult other = (SendDataToWirelessDeviceResult) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        return hashCode;
    }

    @Override
    public SendDataToWirelessDeviceResult clone() {
        try {
            return (SendDataToWirelessDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

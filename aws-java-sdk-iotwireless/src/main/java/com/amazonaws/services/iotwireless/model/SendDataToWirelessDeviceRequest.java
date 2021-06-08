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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToWirelessDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendDataToWirelessDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the wireless device to receive the data.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The transmit mode to use to send data to the wireless device. Can be: <code>0</code> for UM (unacknowledge mode)
     * or <code>1</code> for AM (acknowledge mode).
     * </p>
     */
    private Integer transmitMode;
    /**
     * <p>
     * The message payload to send.
     * </p>
     */
    private String payloadData;
    /**
     * <p>
     * Metadata about the message request.
     * </p>
     */
    private WirelessMetadata wirelessMetadata;

    /**
     * <p>
     * The ID of the wireless device to receive the data.
     * </p>
     * 
     * @param id
     *        The ID of the wireless device to receive the data.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the wireless device to receive the data.
     * </p>
     * 
     * @return The ID of the wireless device to receive the data.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the wireless device to receive the data.
     * </p>
     * 
     * @param id
     *        The ID of the wireless device to receive the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataToWirelessDeviceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The transmit mode to use to send data to the wireless device. Can be: <code>0</code> for UM (unacknowledge mode)
     * or <code>1</code> for AM (acknowledge mode).
     * </p>
     * 
     * @param transmitMode
     *        The transmit mode to use to send data to the wireless device. Can be: <code>0</code> for UM (unacknowledge
     *        mode) or <code>1</code> for AM (acknowledge mode).
     */

    public void setTransmitMode(Integer transmitMode) {
        this.transmitMode = transmitMode;
    }

    /**
     * <p>
     * The transmit mode to use to send data to the wireless device. Can be: <code>0</code> for UM (unacknowledge mode)
     * or <code>1</code> for AM (acknowledge mode).
     * </p>
     * 
     * @return The transmit mode to use to send data to the wireless device. Can be: <code>0</code> for UM
     *         (unacknowledge mode) or <code>1</code> for AM (acknowledge mode).
     */

    public Integer getTransmitMode() {
        return this.transmitMode;
    }

    /**
     * <p>
     * The transmit mode to use to send data to the wireless device. Can be: <code>0</code> for UM (unacknowledge mode)
     * or <code>1</code> for AM (acknowledge mode).
     * </p>
     * 
     * @param transmitMode
     *        The transmit mode to use to send data to the wireless device. Can be: <code>0</code> for UM (unacknowledge
     *        mode) or <code>1</code> for AM (acknowledge mode).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataToWirelessDeviceRequest withTransmitMode(Integer transmitMode) {
        setTransmitMode(transmitMode);
        return this;
    }

    /**
     * <p>
     * The message payload to send.
     * </p>
     * 
     * @param payloadData
     *        The message payload to send.
     */

    public void setPayloadData(String payloadData) {
        this.payloadData = payloadData;
    }

    /**
     * <p>
     * The message payload to send.
     * </p>
     * 
     * @return The message payload to send.
     */

    public String getPayloadData() {
        return this.payloadData;
    }

    /**
     * <p>
     * The message payload to send.
     * </p>
     * 
     * @param payloadData
     *        The message payload to send.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataToWirelessDeviceRequest withPayloadData(String payloadData) {
        setPayloadData(payloadData);
        return this;
    }

    /**
     * <p>
     * Metadata about the message request.
     * </p>
     * 
     * @param wirelessMetadata
     *        Metadata about the message request.
     */

    public void setWirelessMetadata(WirelessMetadata wirelessMetadata) {
        this.wirelessMetadata = wirelessMetadata;
    }

    /**
     * <p>
     * Metadata about the message request.
     * </p>
     * 
     * @return Metadata about the message request.
     */

    public WirelessMetadata getWirelessMetadata() {
        return this.wirelessMetadata;
    }

    /**
     * <p>
     * Metadata about the message request.
     * </p>
     * 
     * @param wirelessMetadata
     *        Metadata about the message request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataToWirelessDeviceRequest withWirelessMetadata(WirelessMetadata wirelessMetadata) {
        setWirelessMetadata(wirelessMetadata);
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
        if (getTransmitMode() != null)
            sb.append("TransmitMode: ").append(getTransmitMode()).append(",");
        if (getPayloadData() != null)
            sb.append("PayloadData: ").append(getPayloadData()).append(",");
        if (getWirelessMetadata() != null)
            sb.append("WirelessMetadata: ").append(getWirelessMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendDataToWirelessDeviceRequest == false)
            return false;
        SendDataToWirelessDeviceRequest other = (SendDataToWirelessDeviceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTransmitMode() == null ^ this.getTransmitMode() == null)
            return false;
        if (other.getTransmitMode() != null && other.getTransmitMode().equals(this.getTransmitMode()) == false)
            return false;
        if (other.getPayloadData() == null ^ this.getPayloadData() == null)
            return false;
        if (other.getPayloadData() != null && other.getPayloadData().equals(this.getPayloadData()) == false)
            return false;
        if (other.getWirelessMetadata() == null ^ this.getWirelessMetadata() == null)
            return false;
        if (other.getWirelessMetadata() != null && other.getWirelessMetadata().equals(this.getWirelessMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTransmitMode() == null) ? 0 : getTransmitMode().hashCode());
        hashCode = prime * hashCode + ((getPayloadData() == null) ? 0 : getPayloadData().hashCode());
        hashCode = prime * hashCode + ((getWirelessMetadata() == null) ? 0 : getWirelessMetadata().hashCode());
        return hashCode;
    }

    @Override
    public SendDataToWirelessDeviceRequest clone() {
        return (SendDataToWirelessDeviceRequest) super.clone();
    }

}

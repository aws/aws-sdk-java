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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * LoRaWAN device metatdata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANDeviceMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANDeviceMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DevEUI value.
     * </p>
     */
    private String devEui;
    /**
     * <p>
     * The FPort value.
     * </p>
     */
    private Integer fPort;
    /**
     * <p>
     * The DataRate value.
     * </p>
     */
    private Integer dataRate;
    /**
     * <p>
     * The device's channel frequency in Hz.
     * </p>
     */
    private Integer frequency;
    /**
     * <p>
     * The date and time of the metadata.
     * </p>
     */
    private String timestamp;
    /**
     * <p>
     * Information about the gateways accessed by the device.
     * </p>
     */
    private java.util.List<LoRaWANGatewayMetadata> gateways;

    /**
     * <p>
     * The DevEUI value.
     * </p>
     * 
     * @param devEui
     *        The DevEUI value.
     */

    public void setDevEui(String devEui) {
        this.devEui = devEui;
    }

    /**
     * <p>
     * The DevEUI value.
     * </p>
     * 
     * @return The DevEUI value.
     */

    public String getDevEui() {
        return this.devEui;
    }

    /**
     * <p>
     * The DevEUI value.
     * </p>
     * 
     * @param devEui
     *        The DevEUI value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceMetadata withDevEui(String devEui) {
        setDevEui(devEui);
        return this;
    }

    /**
     * <p>
     * The FPort value.
     * </p>
     * 
     * @param fPort
     *        The FPort value.
     */

    public void setFPort(Integer fPort) {
        this.fPort = fPort;
    }

    /**
     * <p>
     * The FPort value.
     * </p>
     * 
     * @return The FPort value.
     */

    public Integer getFPort() {
        return this.fPort;
    }

    /**
     * <p>
     * The FPort value.
     * </p>
     * 
     * @param fPort
     *        The FPort value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceMetadata withFPort(Integer fPort) {
        setFPort(fPort);
        return this;
    }

    /**
     * <p>
     * The DataRate value.
     * </p>
     * 
     * @param dataRate
     *        The DataRate value.
     */

    public void setDataRate(Integer dataRate) {
        this.dataRate = dataRate;
    }

    /**
     * <p>
     * The DataRate value.
     * </p>
     * 
     * @return The DataRate value.
     */

    public Integer getDataRate() {
        return this.dataRate;
    }

    /**
     * <p>
     * The DataRate value.
     * </p>
     * 
     * @param dataRate
     *        The DataRate value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceMetadata withDataRate(Integer dataRate) {
        setDataRate(dataRate);
        return this;
    }

    /**
     * <p>
     * The device's channel frequency in Hz.
     * </p>
     * 
     * @param frequency
     *        The device's channel frequency in Hz.
     */

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The device's channel frequency in Hz.
     * </p>
     * 
     * @return The device's channel frequency in Hz.
     */

    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The device's channel frequency in Hz.
     * </p>
     * 
     * @param frequency
     *        The device's channel frequency in Hz.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceMetadata withFrequency(Integer frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The date and time of the metadata.
     * </p>
     * 
     * @param timestamp
     *        The date and time of the metadata.
     */

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time of the metadata.
     * </p>
     * 
     * @return The date and time of the metadata.
     */

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The date and time of the metadata.
     * </p>
     * 
     * @param timestamp
     *        The date and time of the metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceMetadata withTimestamp(String timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Information about the gateways accessed by the device.
     * </p>
     * 
     * @return Information about the gateways accessed by the device.
     */

    public java.util.List<LoRaWANGatewayMetadata> getGateways() {
        return gateways;
    }

    /**
     * <p>
     * Information about the gateways accessed by the device.
     * </p>
     * 
     * @param gateways
     *        Information about the gateways accessed by the device.
     */

    public void setGateways(java.util.Collection<LoRaWANGatewayMetadata> gateways) {
        if (gateways == null) {
            this.gateways = null;
            return;
        }

        this.gateways = new java.util.ArrayList<LoRaWANGatewayMetadata>(gateways);
    }

    /**
     * <p>
     * Information about the gateways accessed by the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGateways(java.util.Collection)} or {@link #withGateways(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param gateways
     *        Information about the gateways accessed by the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceMetadata withGateways(LoRaWANGatewayMetadata... gateways) {
        if (this.gateways == null) {
            setGateways(new java.util.ArrayList<LoRaWANGatewayMetadata>(gateways.length));
        }
        for (LoRaWANGatewayMetadata ele : gateways) {
            this.gateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the gateways accessed by the device.
     * </p>
     * 
     * @param gateways
     *        Information about the gateways accessed by the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceMetadata withGateways(java.util.Collection<LoRaWANGatewayMetadata> gateways) {
        setGateways(gateways);
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
        if (getDevEui() != null)
            sb.append("DevEui: ").append(getDevEui()).append(",");
        if (getFPort() != null)
            sb.append("FPort: ").append(getFPort()).append(",");
        if (getDataRate() != null)
            sb.append("DataRate: ").append(getDataRate()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getGateways() != null)
            sb.append("Gateways: ").append(getGateways());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANDeviceMetadata == false)
            return false;
        LoRaWANDeviceMetadata other = (LoRaWANDeviceMetadata) obj;
        if (other.getDevEui() == null ^ this.getDevEui() == null)
            return false;
        if (other.getDevEui() != null && other.getDevEui().equals(this.getDevEui()) == false)
            return false;
        if (other.getFPort() == null ^ this.getFPort() == null)
            return false;
        if (other.getFPort() != null && other.getFPort().equals(this.getFPort()) == false)
            return false;
        if (other.getDataRate() == null ^ this.getDataRate() == null)
            return false;
        if (other.getDataRate() != null && other.getDataRate().equals(this.getDataRate()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getGateways() == null ^ this.getGateways() == null)
            return false;
        if (other.getGateways() != null && other.getGateways().equals(this.getGateways()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevEui() == null) ? 0 : getDevEui().hashCode());
        hashCode = prime * hashCode + ((getFPort() == null) ? 0 : getFPort().hashCode());
        hashCode = prime * hashCode + ((getDataRate() == null) ? 0 : getDataRate().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getGateways() == null) ? 0 : getGateways().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANDeviceMetadata clone() {
        try {
            return (LoRaWANDeviceMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANDeviceMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * LoRaWAN gateway metatdata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANGatewayMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANGatewayMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The gateway's EUI value.
     * </p>
     */
    private String gatewayEui;
    /**
     * <p>
     * The SNR value.
     * </p>
     */
    private Double snr;
    /**
     * <p>
     * The RSSI value.
     * </p>
     */
    private Double rssi;

    /**
     * <p>
     * The gateway's EUI value.
     * </p>
     * 
     * @param gatewayEui
     *        The gateway's EUI value.
     */

    public void setGatewayEui(String gatewayEui) {
        this.gatewayEui = gatewayEui;
    }

    /**
     * <p>
     * The gateway's EUI value.
     * </p>
     * 
     * @return The gateway's EUI value.
     */

    public String getGatewayEui() {
        return this.gatewayEui;
    }

    /**
     * <p>
     * The gateway's EUI value.
     * </p>
     * 
     * @param gatewayEui
     *        The gateway's EUI value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGatewayMetadata withGatewayEui(String gatewayEui) {
        setGatewayEui(gatewayEui);
        return this;
    }

    /**
     * <p>
     * The SNR value.
     * </p>
     * 
     * @param snr
     *        The SNR value.
     */

    public void setSnr(Double snr) {
        this.snr = snr;
    }

    /**
     * <p>
     * The SNR value.
     * </p>
     * 
     * @return The SNR value.
     */

    public Double getSnr() {
        return this.snr;
    }

    /**
     * <p>
     * The SNR value.
     * </p>
     * 
     * @param snr
     *        The SNR value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGatewayMetadata withSnr(Double snr) {
        setSnr(snr);
        return this;
    }

    /**
     * <p>
     * The RSSI value.
     * </p>
     * 
     * @param rssi
     *        The RSSI value.
     */

    public void setRssi(Double rssi) {
        this.rssi = rssi;
    }

    /**
     * <p>
     * The RSSI value.
     * </p>
     * 
     * @return The RSSI value.
     */

    public Double getRssi() {
        return this.rssi;
    }

    /**
     * <p>
     * The RSSI value.
     * </p>
     * 
     * @param rssi
     *        The RSSI value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGatewayMetadata withRssi(Double rssi) {
        setRssi(rssi);
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
        if (getGatewayEui() != null)
            sb.append("GatewayEui: ").append(getGatewayEui()).append(",");
        if (getSnr() != null)
            sb.append("Snr: ").append(getSnr()).append(",");
        if (getRssi() != null)
            sb.append("Rssi: ").append(getRssi());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANGatewayMetadata == false)
            return false;
        LoRaWANGatewayMetadata other = (LoRaWANGatewayMetadata) obj;
        if (other.getGatewayEui() == null ^ this.getGatewayEui() == null)
            return false;
        if (other.getGatewayEui() != null && other.getGatewayEui().equals(this.getGatewayEui()) == false)
            return false;
        if (other.getSnr() == null ^ this.getSnr() == null)
            return false;
        if (other.getSnr() != null && other.getSnr().equals(this.getSnr()) == false)
            return false;
        if (other.getRssi() == null ^ this.getRssi() == null)
            return false;
        if (other.getRssi() != null && other.getRssi().equals(this.getRssi()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayEui() == null) ? 0 : getGatewayEui().hashCode());
        hashCode = prime * hashCode + ((getSnr() == null) ? 0 : getSnr().hashCode());
        hashCode = prime * hashCode + ((getRssi() == null) ? 0 : getRssi().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANGatewayMetadata clone() {
        try {
            return (LoRaWANGatewayMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANGatewayMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * LoRaWAN public gateway metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANPublicGatewayMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANPublicGatewayMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the LoRaWAN public network provider.
     * </p>
     */
    private String providerNetId;
    /**
     * <p>
     * The ID of the gateways that are operated by the network provider.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The RSSI (received signal strength indicator) value.
     * </p>
     */
    private Double rssi;
    /**
     * <p>
     * The SNR (signal to noise ratio) value.
     * </p>
     */
    private Double snr;

    private String rfRegion;
    /**
     * <p>
     * Boolean that indicates whether downlink is allowed using the network.
     * </p>
     */
    private Boolean dlAllowed;

    /**
     * <p>
     * The ID of the LoRaWAN public network provider.
     * </p>
     * 
     * @param providerNetId
     *        The ID of the LoRaWAN public network provider.
     */

    public void setProviderNetId(String providerNetId) {
        this.providerNetId = providerNetId;
    }

    /**
     * <p>
     * The ID of the LoRaWAN public network provider.
     * </p>
     * 
     * @return The ID of the LoRaWAN public network provider.
     */

    public String getProviderNetId() {
        return this.providerNetId;
    }

    /**
     * <p>
     * The ID of the LoRaWAN public network provider.
     * </p>
     * 
     * @param providerNetId
     *        The ID of the LoRaWAN public network provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANPublicGatewayMetadata withProviderNetId(String providerNetId) {
        setProviderNetId(providerNetId);
        return this;
    }

    /**
     * <p>
     * The ID of the gateways that are operated by the network provider.
     * </p>
     * 
     * @param id
     *        The ID of the gateways that are operated by the network provider.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the gateways that are operated by the network provider.
     * </p>
     * 
     * @return The ID of the gateways that are operated by the network provider.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the gateways that are operated by the network provider.
     * </p>
     * 
     * @param id
     *        The ID of the gateways that are operated by the network provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANPublicGatewayMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The RSSI (received signal strength indicator) value.
     * </p>
     * 
     * @param rssi
     *        The RSSI (received signal strength indicator) value.
     */

    public void setRssi(Double rssi) {
        this.rssi = rssi;
    }

    /**
     * <p>
     * The RSSI (received signal strength indicator) value.
     * </p>
     * 
     * @return The RSSI (received signal strength indicator) value.
     */

    public Double getRssi() {
        return this.rssi;
    }

    /**
     * <p>
     * The RSSI (received signal strength indicator) value.
     * </p>
     * 
     * @param rssi
     *        The RSSI (received signal strength indicator) value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANPublicGatewayMetadata withRssi(Double rssi) {
        setRssi(rssi);
        return this;
    }

    /**
     * <p>
     * The SNR (signal to noise ratio) value.
     * </p>
     * 
     * @param snr
     *        The SNR (signal to noise ratio) value.
     */

    public void setSnr(Double snr) {
        this.snr = snr;
    }

    /**
     * <p>
     * The SNR (signal to noise ratio) value.
     * </p>
     * 
     * @return The SNR (signal to noise ratio) value.
     */

    public Double getSnr() {
        return this.snr;
    }

    /**
     * <p>
     * The SNR (signal to noise ratio) value.
     * </p>
     * 
     * @param snr
     *        The SNR (signal to noise ratio) value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANPublicGatewayMetadata withSnr(Double snr) {
        setSnr(snr);
        return this;
    }

    /**
     * @param rfRegion
     */

    public void setRfRegion(String rfRegion) {
        this.rfRegion = rfRegion;
    }

    /**
     * @return
     */

    public String getRfRegion() {
        return this.rfRegion;
    }

    /**
     * @param rfRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANPublicGatewayMetadata withRfRegion(String rfRegion) {
        setRfRegion(rfRegion);
        return this;
    }

    /**
     * <p>
     * Boolean that indicates whether downlink is allowed using the network.
     * </p>
     * 
     * @param dlAllowed
     *        Boolean that indicates whether downlink is allowed using the network.
     */

    public void setDlAllowed(Boolean dlAllowed) {
        this.dlAllowed = dlAllowed;
    }

    /**
     * <p>
     * Boolean that indicates whether downlink is allowed using the network.
     * </p>
     * 
     * @return Boolean that indicates whether downlink is allowed using the network.
     */

    public Boolean getDlAllowed() {
        return this.dlAllowed;
    }

    /**
     * <p>
     * Boolean that indicates whether downlink is allowed using the network.
     * </p>
     * 
     * @param dlAllowed
     *        Boolean that indicates whether downlink is allowed using the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANPublicGatewayMetadata withDlAllowed(Boolean dlAllowed) {
        setDlAllowed(dlAllowed);
        return this;
    }

    /**
     * <p>
     * Boolean that indicates whether downlink is allowed using the network.
     * </p>
     * 
     * @return Boolean that indicates whether downlink is allowed using the network.
     */

    public Boolean isDlAllowed() {
        return this.dlAllowed;
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
        if (getProviderNetId() != null)
            sb.append("ProviderNetId: ").append(getProviderNetId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRssi() != null)
            sb.append("Rssi: ").append(getRssi()).append(",");
        if (getSnr() != null)
            sb.append("Snr: ").append(getSnr()).append(",");
        if (getRfRegion() != null)
            sb.append("RfRegion: ").append(getRfRegion()).append(",");
        if (getDlAllowed() != null)
            sb.append("DlAllowed: ").append(getDlAllowed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANPublicGatewayMetadata == false)
            return false;
        LoRaWANPublicGatewayMetadata other = (LoRaWANPublicGatewayMetadata) obj;
        if (other.getProviderNetId() == null ^ this.getProviderNetId() == null)
            return false;
        if (other.getProviderNetId() != null && other.getProviderNetId().equals(this.getProviderNetId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRssi() == null ^ this.getRssi() == null)
            return false;
        if (other.getRssi() != null && other.getRssi().equals(this.getRssi()) == false)
            return false;
        if (other.getSnr() == null ^ this.getSnr() == null)
            return false;
        if (other.getSnr() != null && other.getSnr().equals(this.getSnr()) == false)
            return false;
        if (other.getRfRegion() == null ^ this.getRfRegion() == null)
            return false;
        if (other.getRfRegion() != null && other.getRfRegion().equals(this.getRfRegion()) == false)
            return false;
        if (other.getDlAllowed() == null ^ this.getDlAllowed() == null)
            return false;
        if (other.getDlAllowed() != null && other.getDlAllowed().equals(this.getDlAllowed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderNetId() == null) ? 0 : getProviderNetId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRssi() == null) ? 0 : getRssi().hashCode());
        hashCode = prime * hashCode + ((getSnr() == null) ? 0 : getSnr().hashCode());
        hashCode = prime * hashCode + ((getRfRegion() == null) ? 0 : getRfRegion().hashCode());
        hashCode = prime * hashCode + ((getDlAllowed() == null) ? 0 : getDlAllowed().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANPublicGatewayMetadata clone() {
        try {
            return (LoRaWANPublicGatewayMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANPublicGatewayMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

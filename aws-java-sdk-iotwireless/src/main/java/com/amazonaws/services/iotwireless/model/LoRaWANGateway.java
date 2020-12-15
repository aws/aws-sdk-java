/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * LoRaWANGateway object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANGateway implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The gateway's EUI value.
     * </p>
     */
    private String gatewayEui;
    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     */
    private String rfRegion;

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

    public LoRaWANGateway withGatewayEui(String gatewayEui) {
        setGatewayEui(gatewayEui);
        return this;
    }

    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     * 
     * @param rfRegion
     *        The frequency band (RFRegion) value.
     */

    public void setRfRegion(String rfRegion) {
        this.rfRegion = rfRegion;
    }

    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     * 
     * @return The frequency band (RFRegion) value.
     */

    public String getRfRegion() {
        return this.rfRegion;
    }

    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     * 
     * @param rfRegion
     *        The frequency band (RFRegion) value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGateway withRfRegion(String rfRegion) {
        setRfRegion(rfRegion);
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
        if (getRfRegion() != null)
            sb.append("RfRegion: ").append(getRfRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANGateway == false)
            return false;
        LoRaWANGateway other = (LoRaWANGateway) obj;
        if (other.getGatewayEui() == null ^ this.getGatewayEui() == null)
            return false;
        if (other.getGatewayEui() != null && other.getGatewayEui().equals(this.getGatewayEui()) == false)
            return false;
        if (other.getRfRegion() == null ^ this.getRfRegion() == null)
            return false;
        if (other.getRfRegion() != null && other.getRfRegion().equals(this.getRfRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayEui() == null) ? 0 : getGatewayEui().hashCode());
        hashCode = prime * hashCode + ((getRfRegion() == null) ? 0 : getRfRegion().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANGateway clone() {
        try {
            return (LoRaWANGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANGatewayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

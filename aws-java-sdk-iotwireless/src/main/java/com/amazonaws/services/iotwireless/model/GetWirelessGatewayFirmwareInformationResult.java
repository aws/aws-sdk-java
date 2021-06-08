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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayFirmwareInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessGatewayFirmwareInformationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the wireless gateway's firmware.
     * </p>
     */
    private LoRaWANGatewayCurrentVersion loRaWAN;

    /**
     * <p>
     * Information about the wireless gateway's firmware.
     * </p>
     * 
     * @param loRaWAN
     *        Information about the wireless gateway's firmware.
     */

    public void setLoRaWAN(LoRaWANGatewayCurrentVersion loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * Information about the wireless gateway's firmware.
     * </p>
     * 
     * @return Information about the wireless gateway's firmware.
     */

    public LoRaWANGatewayCurrentVersion getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * <p>
     * Information about the wireless gateway's firmware.
     * </p>
     * 
     * @param loRaWAN
     *        Information about the wireless gateway's firmware.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayFirmwareInformationResult withLoRaWAN(LoRaWANGatewayCurrentVersion loRaWAN) {
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

        if (obj instanceof GetWirelessGatewayFirmwareInformationResult == false)
            return false;
        GetWirelessGatewayFirmwareInformationResult other = (GetWirelessGatewayFirmwareInformationResult) obj;
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

        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessGatewayFirmwareInformationResult clone() {
        try {
            return (GetWirelessGatewayFirmwareInformationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

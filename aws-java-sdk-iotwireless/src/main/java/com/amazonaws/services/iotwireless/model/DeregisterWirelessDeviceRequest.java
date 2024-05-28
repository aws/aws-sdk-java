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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeregisterWirelessDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterWirelessDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the wireless device to deregister from AWS IoT Wireless.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or
     * <code>Sidewalk</code>.
     * </p>
     */
    private String wirelessDeviceType;

    /**
     * <p>
     * The identifier of the wireless device to deregister from AWS IoT Wireless.
     * </p>
     * 
     * @param identifier
     *        The identifier of the wireless device to deregister from AWS IoT Wireless.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the wireless device to deregister from AWS IoT Wireless.
     * </p>
     * 
     * @return The identifier of the wireless device to deregister from AWS IoT Wireless.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the wireless device to deregister from AWS IoT Wireless.
     * </p>
     * 
     * @param identifier
     *        The identifier of the wireless device to deregister from AWS IoT Wireless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterWirelessDeviceRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or
     * <code>Sidewalk</code>.
     * </p>
     * 
     * @param wirelessDeviceType
     *        The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or
     *        <code>Sidewalk</code>.
     * @see WirelessDeviceType
     */

    public void setWirelessDeviceType(String wirelessDeviceType) {
        this.wirelessDeviceType = wirelessDeviceType;
    }

    /**
     * <p>
     * The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or
     * <code>Sidewalk</code>.
     * </p>
     * 
     * @return The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or
     *         <code>Sidewalk</code>.
     * @see WirelessDeviceType
     */

    public String getWirelessDeviceType() {
        return this.wirelessDeviceType;
    }

    /**
     * <p>
     * The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or
     * <code>Sidewalk</code>.
     * </p>
     * 
     * @param wirelessDeviceType
     *        The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or
     *        <code>Sidewalk</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public DeregisterWirelessDeviceRequest withWirelessDeviceType(String wirelessDeviceType) {
        setWirelessDeviceType(wirelessDeviceType);
        return this;
    }

    /**
     * <p>
     * The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or
     * <code>Sidewalk</code>.
     * </p>
     * 
     * @param wirelessDeviceType
     *        The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or
     *        <code>Sidewalk</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public DeregisterWirelessDeviceRequest withWirelessDeviceType(WirelessDeviceType wirelessDeviceType) {
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
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

        if (obj instanceof DeregisterWirelessDeviceRequest == false)
            return false;
        DeregisterWirelessDeviceRequest other = (DeregisterWirelessDeviceRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getWirelessDeviceType() == null) ? 0 : getWirelessDeviceType().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterWirelessDeviceRequest clone() {
        return (DeregisterWirelessDeviceRequest) super.clone();
    }

}

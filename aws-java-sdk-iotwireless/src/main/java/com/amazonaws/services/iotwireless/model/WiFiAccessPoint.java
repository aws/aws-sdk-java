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
 * Wi-Fi access point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/WiFiAccessPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WiFiAccessPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Wi-Fi MAC Address.
     * </p>
     */
    private String macAddress;
    /**
     * <p>
     * Recived signal strength of the WLAN measurement data.
     * </p>
     */
    private Integer rss;

    /**
     * <p>
     * Wi-Fi MAC Address.
     * </p>
     * 
     * @param macAddress
     *        Wi-Fi MAC Address.
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * Wi-Fi MAC Address.
     * </p>
     * 
     * @return Wi-Fi MAC Address.
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * <p>
     * Wi-Fi MAC Address.
     * </p>
     * 
     * @param macAddress
     *        Wi-Fi MAC Address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WiFiAccessPoint withMacAddress(String macAddress) {
        setMacAddress(macAddress);
        return this;
    }

    /**
     * <p>
     * Recived signal strength of the WLAN measurement data.
     * </p>
     * 
     * @param rss
     *        Recived signal strength of the WLAN measurement data.
     */

    public void setRss(Integer rss) {
        this.rss = rss;
    }

    /**
     * <p>
     * Recived signal strength of the WLAN measurement data.
     * </p>
     * 
     * @return Recived signal strength of the WLAN measurement data.
     */

    public Integer getRss() {
        return this.rss;
    }

    /**
     * <p>
     * Recived signal strength of the WLAN measurement data.
     * </p>
     * 
     * @param rss
     *        Recived signal strength of the WLAN measurement data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WiFiAccessPoint withRss(Integer rss) {
        setRss(rss);
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
        if (getMacAddress() != null)
            sb.append("MacAddress: ").append(getMacAddress()).append(",");
        if (getRss() != null)
            sb.append("Rss: ").append(getRss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WiFiAccessPoint == false)
            return false;
        WiFiAccessPoint other = (WiFiAccessPoint) obj;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getRss() == null ^ this.getRss() == null)
            return false;
        if (other.getRss() != null && other.getRss().equals(this.getRss()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getRss() == null) ? 0 : getRss().hashCode());
        return hashCode;
    }

    @Override
    public WiFiAccessPoint clone() {
        try {
            return (WiFiAccessPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.WiFiAccessPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

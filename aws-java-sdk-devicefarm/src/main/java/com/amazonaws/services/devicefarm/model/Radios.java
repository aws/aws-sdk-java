/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the set of radios and their states on a device. Examples of radios include Wi-Fi, GPS, Bluetooth, and NFC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Radios" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Radios implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
     * </p>
     */
    private Boolean wifi;
    /**
     * <p>
     * True if Bluetooth is enabled at the beginning of the test; otherwise, false.
     * </p>
     */
    private Boolean bluetooth;
    /**
     * <p>
     * True if NFC is enabled at the beginning of the test; otherwise, false.
     * </p>
     */
    private Boolean nfc;
    /**
     * <p>
     * True if GPS is enabled at the beginning of the test; otherwise, false.
     * </p>
     */
    private Boolean gps;

    /**
     * <p>
     * True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param wifi
     *        True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
     */

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    /**
     * <p>
     * True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean getWifi() {
        return this.wifi;
    }

    /**
     * <p>
     * True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param wifi
     *        True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Radios withWifi(Boolean wifi) {
        setWifi(wifi);
        return this;
    }

    /**
     * <p>
     * True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean isWifi() {
        return this.wifi;
    }

    /**
     * <p>
     * True if Bluetooth is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param bluetooth
     *        True if Bluetooth is enabled at the beginning of the test; otherwise, false.
     */

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    /**
     * <p>
     * True if Bluetooth is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if Bluetooth is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean getBluetooth() {
        return this.bluetooth;
    }

    /**
     * <p>
     * True if Bluetooth is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param bluetooth
     *        True if Bluetooth is enabled at the beginning of the test; otherwise, false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Radios withBluetooth(Boolean bluetooth) {
        setBluetooth(bluetooth);
        return this;
    }

    /**
     * <p>
     * True if Bluetooth is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if Bluetooth is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean isBluetooth() {
        return this.bluetooth;
    }

    /**
     * <p>
     * True if NFC is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param nfc
     *        True if NFC is enabled at the beginning of the test; otherwise, false.
     */

    public void setNfc(Boolean nfc) {
        this.nfc = nfc;
    }

    /**
     * <p>
     * True if NFC is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if NFC is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean getNfc() {
        return this.nfc;
    }

    /**
     * <p>
     * True if NFC is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param nfc
     *        True if NFC is enabled at the beginning of the test; otherwise, false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Radios withNfc(Boolean nfc) {
        setNfc(nfc);
        return this;
    }

    /**
     * <p>
     * True if NFC is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if NFC is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean isNfc() {
        return this.nfc;
    }

    /**
     * <p>
     * True if GPS is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param gps
     *        True if GPS is enabled at the beginning of the test; otherwise, false.
     */

    public void setGps(Boolean gps) {
        this.gps = gps;
    }

    /**
     * <p>
     * True if GPS is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if GPS is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean getGps() {
        return this.gps;
    }

    /**
     * <p>
     * True if GPS is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param gps
     *        True if GPS is enabled at the beginning of the test; otherwise, false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Radios withGps(Boolean gps) {
        setGps(gps);
        return this;
    }

    /**
     * <p>
     * True if GPS is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if GPS is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean isGps() {
        return this.gps;
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
        if (getWifi() != null)
            sb.append("Wifi: ").append(getWifi()).append(",");
        if (getBluetooth() != null)
            sb.append("Bluetooth: ").append(getBluetooth()).append(",");
        if (getNfc() != null)
            sb.append("Nfc: ").append(getNfc()).append(",");
        if (getGps() != null)
            sb.append("Gps: ").append(getGps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Radios == false)
            return false;
        Radios other = (Radios) obj;
        if (other.getWifi() == null ^ this.getWifi() == null)
            return false;
        if (other.getWifi() != null && other.getWifi().equals(this.getWifi()) == false)
            return false;
        if (other.getBluetooth() == null ^ this.getBluetooth() == null)
            return false;
        if (other.getBluetooth() != null && other.getBluetooth().equals(this.getBluetooth()) == false)
            return false;
        if (other.getNfc() == null ^ this.getNfc() == null)
            return false;
        if (other.getNfc() != null && other.getNfc().equals(this.getNfc()) == false)
            return false;
        if (other.getGps() == null ^ this.getGps() == null)
            return false;
        if (other.getGps() != null && other.getGps().equals(this.getGps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWifi() == null) ? 0 : getWifi().hashCode());
        hashCode = prime * hashCode + ((getBluetooth() == null) ? 0 : getBluetooth().hashCode());
        hashCode = prime * hashCode + ((getNfc() == null) ? 0 : getNfc().hashCode());
        hashCode = prime * hashCode + ((getGps() == null) ? 0 : getGps().hashCode());
        return hashCode;
    }

    @Override
    public Radios clone() {
        try {
            return (Radios) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.RadiosMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

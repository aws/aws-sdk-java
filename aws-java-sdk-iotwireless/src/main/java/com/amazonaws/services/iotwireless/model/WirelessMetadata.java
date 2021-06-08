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
 * WirelessMetadata object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/WirelessMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WirelessMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * LoRaWAN device info.
     * </p>
     */
    private LoRaWANSendDataToDevice loRaWAN;
    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     */
    private SidewalkSendDataToDevice sidewalk;

    /**
     * <p>
     * LoRaWAN device info.
     * </p>
     * 
     * @param loRaWAN
     *        LoRaWAN device info.
     */

    public void setLoRaWAN(LoRaWANSendDataToDevice loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * LoRaWAN device info.
     * </p>
     * 
     * @return LoRaWAN device info.
     */

    public LoRaWANSendDataToDevice getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * <p>
     * LoRaWAN device info.
     * </p>
     * 
     * @param loRaWAN
     *        LoRaWAN device info.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessMetadata withLoRaWAN(LoRaWANSendDataToDevice loRaWAN) {
        setLoRaWAN(loRaWAN);
        return this;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk account credentials.
     */

    public void setSidewalk(SidewalkSendDataToDevice sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @return The Sidewalk account credentials.
     */

    public SidewalkSendDataToDevice getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk account credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessMetadata withSidewalk(SidewalkSendDataToDevice sidewalk) {
        setSidewalk(sidewalk);
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
            sb.append("LoRaWAN: ").append(getLoRaWAN()).append(",");
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WirelessMetadata == false)
            return false;
        WirelessMetadata other = (WirelessMetadata) obj;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        return hashCode;
    }

    @Override
    public WirelessMetadata clone() {
        try {
            return (WirelessMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.WirelessMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

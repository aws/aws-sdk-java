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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDeviceStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessDeviceStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the wireless device.
     * </p>
     */
    private String wirelessDeviceId;
    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     */
    private String lastUplinkReceivedAt;
    /**
     * <p>
     * Information about the wireless device's operations.
     * </p>
     */
    private LoRaWANDeviceMetadata loRaWAN;
    /**
     * <p>
     * MetaData for Sidewalk device.
     * </p>
     */
    private SidewalkDeviceMetadata sidewalk;

    /**
     * <p>
     * The ID of the wireless device.
     * </p>
     * 
     * @param wirelessDeviceId
     *        The ID of the wireless device.
     */

    public void setWirelessDeviceId(String wirelessDeviceId) {
        this.wirelessDeviceId = wirelessDeviceId;
    }

    /**
     * <p>
     * The ID of the wireless device.
     * </p>
     * 
     * @return The ID of the wireless device.
     */

    public String getWirelessDeviceId() {
        return this.wirelessDeviceId;
    }

    /**
     * <p>
     * The ID of the wireless device.
     * </p>
     * 
     * @param wirelessDeviceId
     *        The ID of the wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceStatisticsResult withWirelessDeviceId(String wirelessDeviceId) {
        setWirelessDeviceId(wirelessDeviceId);
        return this;
    }

    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     * 
     * @param lastUplinkReceivedAt
     *        The date and time when the most recent uplink was received.
     */

    public void setLastUplinkReceivedAt(String lastUplinkReceivedAt) {
        this.lastUplinkReceivedAt = lastUplinkReceivedAt;
    }

    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     * 
     * @return The date and time when the most recent uplink was received.
     */

    public String getLastUplinkReceivedAt() {
        return this.lastUplinkReceivedAt;
    }

    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     * 
     * @param lastUplinkReceivedAt
     *        The date and time when the most recent uplink was received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceStatisticsResult withLastUplinkReceivedAt(String lastUplinkReceivedAt) {
        setLastUplinkReceivedAt(lastUplinkReceivedAt);
        return this;
    }

    /**
     * <p>
     * Information about the wireless device's operations.
     * </p>
     * 
     * @param loRaWAN
     *        Information about the wireless device's operations.
     */

    public void setLoRaWAN(LoRaWANDeviceMetadata loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * Information about the wireless device's operations.
     * </p>
     * 
     * @return Information about the wireless device's operations.
     */

    public LoRaWANDeviceMetadata getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * <p>
     * Information about the wireless device's operations.
     * </p>
     * 
     * @param loRaWAN
     *        Information about the wireless device's operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceStatisticsResult withLoRaWAN(LoRaWANDeviceMetadata loRaWAN) {
        setLoRaWAN(loRaWAN);
        return this;
    }

    /**
     * <p>
     * MetaData for Sidewalk device.
     * </p>
     * 
     * @param sidewalk
     *        MetaData for Sidewalk device.
     */

    public void setSidewalk(SidewalkDeviceMetadata sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * MetaData for Sidewalk device.
     * </p>
     * 
     * @return MetaData for Sidewalk device.
     */

    public SidewalkDeviceMetadata getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * MetaData for Sidewalk device.
     * </p>
     * 
     * @param sidewalk
     *        MetaData for Sidewalk device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceStatisticsResult withSidewalk(SidewalkDeviceMetadata sidewalk) {
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
        if (getWirelessDeviceId() != null)
            sb.append("WirelessDeviceId: ").append(getWirelessDeviceId()).append(",");
        if (getLastUplinkReceivedAt() != null)
            sb.append("LastUplinkReceivedAt: ").append(getLastUplinkReceivedAt()).append(",");
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

        if (obj instanceof GetWirelessDeviceStatisticsResult == false)
            return false;
        GetWirelessDeviceStatisticsResult other = (GetWirelessDeviceStatisticsResult) obj;
        if (other.getWirelessDeviceId() == null ^ this.getWirelessDeviceId() == null)
            return false;
        if (other.getWirelessDeviceId() != null && other.getWirelessDeviceId().equals(this.getWirelessDeviceId()) == false)
            return false;
        if (other.getLastUplinkReceivedAt() == null ^ this.getLastUplinkReceivedAt() == null)
            return false;
        if (other.getLastUplinkReceivedAt() != null && other.getLastUplinkReceivedAt().equals(this.getLastUplinkReceivedAt()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getWirelessDeviceId() == null) ? 0 : getWirelessDeviceId().hashCode());
        hashCode = prime * hashCode + ((getLastUplinkReceivedAt() == null) ? 0 : getLastUplinkReceivedAt().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessDeviceStatisticsResult clone() {
        try {
            return (GetWirelessDeviceStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

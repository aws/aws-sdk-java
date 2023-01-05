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
 * Information about a wireless device's operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/WirelessDeviceStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WirelessDeviceStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the wireless device reporting the data.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The wireless device type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the destination to which the device is assigned.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     */
    private String lastUplinkReceivedAt;
    /**
     * <p>
     * LoRaWAN device info.
     * </p>
     */
    private LoRaWANListDevice loRaWAN;
    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     */
    private SidewalkListDevice sidewalk;

    private String fuotaDeviceStatus;
    /**
     * <p>
     * The status of the wireless device in the multicast group.
     * </p>
     */
    private String multicastDeviceStatus;

    private Integer mcGroupId;

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessDeviceStatistics withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the wireless device reporting the data.
     * </p>
     * 
     * @param id
     *        The ID of the wireless device reporting the data.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the wireless device reporting the data.
     * </p>
     * 
     * @return The ID of the wireless device reporting the data.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the wireless device reporting the data.
     * </p>
     * 
     * @param id
     *        The ID of the wireless device reporting the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessDeviceStatistics withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @see WirelessDeviceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @return The wireless device type.
     * @see WirelessDeviceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public WirelessDeviceStatistics withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public WirelessDeviceStatistics withType(WirelessDeviceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessDeviceStatistics withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the destination to which the device is assigned.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination to which the device is assigned.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the destination to which the device is assigned.
     * </p>
     * 
     * @return The name of the destination to which the device is assigned.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the destination to which the device is assigned.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination to which the device is assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessDeviceStatistics withDestinationName(String destinationName) {
        setDestinationName(destinationName);
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

    public WirelessDeviceStatistics withLastUplinkReceivedAt(String lastUplinkReceivedAt) {
        setLastUplinkReceivedAt(lastUplinkReceivedAt);
        return this;
    }

    /**
     * <p>
     * LoRaWAN device info.
     * </p>
     * 
     * @param loRaWAN
     *        LoRaWAN device info.
     */

    public void setLoRaWAN(LoRaWANListDevice loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * LoRaWAN device info.
     * </p>
     * 
     * @return LoRaWAN device info.
     */

    public LoRaWANListDevice getLoRaWAN() {
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

    public WirelessDeviceStatistics withLoRaWAN(LoRaWANListDevice loRaWAN) {
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

    public void setSidewalk(SidewalkListDevice sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @return The Sidewalk account credentials.
     */

    public SidewalkListDevice getSidewalk() {
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

    public WirelessDeviceStatistics withSidewalk(SidewalkListDevice sidewalk) {
        setSidewalk(sidewalk);
        return this;
    }

    /**
     * @param fuotaDeviceStatus
     * @see FuotaDeviceStatus
     */

    public void setFuotaDeviceStatus(String fuotaDeviceStatus) {
        this.fuotaDeviceStatus = fuotaDeviceStatus;
    }

    /**
     * @return
     * @see FuotaDeviceStatus
     */

    public String getFuotaDeviceStatus() {
        return this.fuotaDeviceStatus;
    }

    /**
     * @param fuotaDeviceStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FuotaDeviceStatus
     */

    public WirelessDeviceStatistics withFuotaDeviceStatus(String fuotaDeviceStatus) {
        setFuotaDeviceStatus(fuotaDeviceStatus);
        return this;
    }

    /**
     * @param fuotaDeviceStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FuotaDeviceStatus
     */

    public WirelessDeviceStatistics withFuotaDeviceStatus(FuotaDeviceStatus fuotaDeviceStatus) {
        this.fuotaDeviceStatus = fuotaDeviceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of the wireless device in the multicast group.
     * </p>
     * 
     * @param multicastDeviceStatus
     *        The status of the wireless device in the multicast group.
     */

    public void setMulticastDeviceStatus(String multicastDeviceStatus) {
        this.multicastDeviceStatus = multicastDeviceStatus;
    }

    /**
     * <p>
     * The status of the wireless device in the multicast group.
     * </p>
     * 
     * @return The status of the wireless device in the multicast group.
     */

    public String getMulticastDeviceStatus() {
        return this.multicastDeviceStatus;
    }

    /**
     * <p>
     * The status of the wireless device in the multicast group.
     * </p>
     * 
     * @param multicastDeviceStatus
     *        The status of the wireless device in the multicast group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessDeviceStatistics withMulticastDeviceStatus(String multicastDeviceStatus) {
        setMulticastDeviceStatus(multicastDeviceStatus);
        return this;
    }

    /**
     * @param mcGroupId
     */

    public void setMcGroupId(Integer mcGroupId) {
        this.mcGroupId = mcGroupId;
    }

    /**
     * @return
     */

    public Integer getMcGroupId() {
        return this.mcGroupId;
    }

    /**
     * @param mcGroupId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessDeviceStatistics withMcGroupId(Integer mcGroupId) {
        setMcGroupId(mcGroupId);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getLastUplinkReceivedAt() != null)
            sb.append("LastUplinkReceivedAt: ").append(getLastUplinkReceivedAt()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN()).append(",");
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk()).append(",");
        if (getFuotaDeviceStatus() != null)
            sb.append("FuotaDeviceStatus: ").append(getFuotaDeviceStatus()).append(",");
        if (getMulticastDeviceStatus() != null)
            sb.append("MulticastDeviceStatus: ").append(getMulticastDeviceStatus()).append(",");
        if (getMcGroupId() != null)
            sb.append("McGroupId: ").append(getMcGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WirelessDeviceStatistics == false)
            return false;
        WirelessDeviceStatistics other = (WirelessDeviceStatistics) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
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
        if (other.getFuotaDeviceStatus() == null ^ this.getFuotaDeviceStatus() == null)
            return false;
        if (other.getFuotaDeviceStatus() != null && other.getFuotaDeviceStatus().equals(this.getFuotaDeviceStatus()) == false)
            return false;
        if (other.getMulticastDeviceStatus() == null ^ this.getMulticastDeviceStatus() == null)
            return false;
        if (other.getMulticastDeviceStatus() != null && other.getMulticastDeviceStatus().equals(this.getMulticastDeviceStatus()) == false)
            return false;
        if (other.getMcGroupId() == null ^ this.getMcGroupId() == null)
            return false;
        if (other.getMcGroupId() != null && other.getMcGroupId().equals(this.getMcGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getLastUplinkReceivedAt() == null) ? 0 : getLastUplinkReceivedAt().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        hashCode = prime * hashCode + ((getFuotaDeviceStatus() == null) ? 0 : getFuotaDeviceStatus().hashCode());
        hashCode = prime * hashCode + ((getMulticastDeviceStatus() == null) ? 0 : getMulticastDeviceStatus().hashCode());
        hashCode = prime * hashCode + ((getMcGroupId() == null) ? 0 : getMcGroupId().hashCode());
        return hashCode;
    }

    @Override
    public WirelessDeviceStatistics clone() {
        try {
            return (WirelessDeviceStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.WirelessDeviceStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Device attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeviceData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a device.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The serial number of a device.
     * </p>
     */
    private String deviceSerialNumber;
    /**
     * <p>
     * The type of a device.
     * </p>
     */
    private String deviceType;
    /**
     * <p>
     * The name of a device.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The software version of a device.
     * </p>
     */
    private String softwareVersion;
    /**
     * <p>
     * The MAC address of a device.
     * </p>
     */
    private String macAddress;
    /**
     * <p>
     * The status of a device.
     * </p>
     */
    private String deviceStatus;
    /**
     * <p>
     * The room ARN associated with a device.
     * </p>
     */
    private String roomArn;
    /**
     * <p>
     * The name of the room associated with a device.
     * </p>
     */
    private String roomName;
    /**
     * <p>
     * Detailed information about a device's status.
     * </p>
     */
    private DeviceStatusInfo deviceStatusInfo;

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of a device.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * 
     * @return The ARN of a device.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceData withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The serial number of a device.
     * </p>
     * 
     * @param deviceSerialNumber
     *        The serial number of a device.
     */

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    /**
     * <p>
     * The serial number of a device.
     * </p>
     * 
     * @return The serial number of a device.
     */

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    /**
     * <p>
     * The serial number of a device.
     * </p>
     * 
     * @param deviceSerialNumber
     *        The serial number of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceData withDeviceSerialNumber(String deviceSerialNumber) {
        setDeviceSerialNumber(deviceSerialNumber);
        return this;
    }

    /**
     * <p>
     * The type of a device.
     * </p>
     * 
     * @param deviceType
     *        The type of a device.
     */

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The type of a device.
     * </p>
     * 
     * @return The type of a device.
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * <p>
     * The type of a device.
     * </p>
     * 
     * @param deviceType
     *        The type of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceData withDeviceType(String deviceType) {
        setDeviceType(deviceType);
        return this;
    }

    /**
     * <p>
     * The name of a device.
     * </p>
     * 
     * @param deviceName
     *        The name of a device.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of a device.
     * </p>
     * 
     * @return The name of a device.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The name of a device.
     * </p>
     * 
     * @param deviceName
     *        The name of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceData withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The software version of a device.
     * </p>
     * 
     * @param softwareVersion
     *        The software version of a device.
     */

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    /**
     * <p>
     * The software version of a device.
     * </p>
     * 
     * @return The software version of a device.
     */

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * <p>
     * The software version of a device.
     * </p>
     * 
     * @param softwareVersion
     *        The software version of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceData withSoftwareVersion(String softwareVersion) {
        setSoftwareVersion(softwareVersion);
        return this;
    }

    /**
     * <p>
     * The MAC address of a device.
     * </p>
     * 
     * @param macAddress
     *        The MAC address of a device.
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * The MAC address of a device.
     * </p>
     * 
     * @return The MAC address of a device.
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * <p>
     * The MAC address of a device.
     * </p>
     * 
     * @param macAddress
     *        The MAC address of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceData withMacAddress(String macAddress) {
        setMacAddress(macAddress);
        return this;
    }

    /**
     * <p>
     * The status of a device.
     * </p>
     * 
     * @param deviceStatus
     *        The status of a device.
     * @see DeviceStatus
     */

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    /**
     * <p>
     * The status of a device.
     * </p>
     * 
     * @return The status of a device.
     * @see DeviceStatus
     */

    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * <p>
     * The status of a device.
     * </p>
     * 
     * @param deviceStatus
     *        The status of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DeviceData withDeviceStatus(String deviceStatus) {
        setDeviceStatus(deviceStatus);
        return this;
    }

    /**
     * <p>
     * The status of a device.
     * </p>
     * 
     * @param deviceStatus
     *        The status of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DeviceData withDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The room ARN associated with a device.
     * </p>
     * 
     * @param roomArn
     *        The room ARN associated with a device.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The room ARN associated with a device.
     * </p>
     * 
     * @return The room ARN associated with a device.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The room ARN associated with a device.
     * </p>
     * 
     * @param roomArn
     *        The room ARN associated with a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceData withRoomArn(String roomArn) {
        setRoomArn(roomArn);
        return this;
    }

    /**
     * <p>
     * The name of the room associated with a device.
     * </p>
     * 
     * @param roomName
     *        The name of the room associated with a device.
     */

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * <p>
     * The name of the room associated with a device.
     * </p>
     * 
     * @return The name of the room associated with a device.
     */

    public String getRoomName() {
        return this.roomName;
    }

    /**
     * <p>
     * The name of the room associated with a device.
     * </p>
     * 
     * @param roomName
     *        The name of the room associated with a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceData withRoomName(String roomName) {
        setRoomName(roomName);
        return this;
    }

    /**
     * <p>
     * Detailed information about a device's status.
     * </p>
     * 
     * @param deviceStatusInfo
     *        Detailed information about a device's status.
     */

    public void setDeviceStatusInfo(DeviceStatusInfo deviceStatusInfo) {
        this.deviceStatusInfo = deviceStatusInfo;
    }

    /**
     * <p>
     * Detailed information about a device's status.
     * </p>
     * 
     * @return Detailed information about a device's status.
     */

    public DeviceStatusInfo getDeviceStatusInfo() {
        return this.deviceStatusInfo;
    }

    /**
     * <p>
     * Detailed information about a device's status.
     * </p>
     * 
     * @param deviceStatusInfo
     *        Detailed information about a device's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceData withDeviceStatusInfo(DeviceStatusInfo deviceStatusInfo) {
        setDeviceStatusInfo(deviceStatusInfo);
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getDeviceSerialNumber() != null)
            sb.append("DeviceSerialNumber: ").append(getDeviceSerialNumber()).append(",");
        if (getDeviceType() != null)
            sb.append("DeviceType: ").append(getDeviceType()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getSoftwareVersion() != null)
            sb.append("SoftwareVersion: ").append(getSoftwareVersion()).append(",");
        if (getMacAddress() != null)
            sb.append("MacAddress: ").append(getMacAddress()).append(",");
        if (getDeviceStatus() != null)
            sb.append("DeviceStatus: ").append(getDeviceStatus()).append(",");
        if (getRoomArn() != null)
            sb.append("RoomArn: ").append(getRoomArn()).append(",");
        if (getRoomName() != null)
            sb.append("RoomName: ").append(getRoomName()).append(",");
        if (getDeviceStatusInfo() != null)
            sb.append("DeviceStatusInfo: ").append(getDeviceStatusInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceData == false)
            return false;
        DeviceData other = (DeviceData) obj;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceSerialNumber() == null ^ this.getDeviceSerialNumber() == null)
            return false;
        if (other.getDeviceSerialNumber() != null && other.getDeviceSerialNumber().equals(this.getDeviceSerialNumber()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getSoftwareVersion() == null ^ this.getSoftwareVersion() == null)
            return false;
        if (other.getSoftwareVersion() != null && other.getSoftwareVersion().equals(this.getSoftwareVersion()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getDeviceStatus() == null ^ this.getDeviceStatus() == null)
            return false;
        if (other.getDeviceStatus() != null && other.getDeviceStatus().equals(this.getDeviceStatus()) == false)
            return false;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getRoomName() == null ^ this.getRoomName() == null)
            return false;
        if (other.getRoomName() != null && other.getRoomName().equals(this.getRoomName()) == false)
            return false;
        if (other.getDeviceStatusInfo() == null ^ this.getDeviceStatusInfo() == null)
            return false;
        if (other.getDeviceStatusInfo() != null && other.getDeviceStatusInfo().equals(this.getDeviceStatusInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceSerialNumber() == null) ? 0 : getDeviceSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getSoftwareVersion() == null) ? 0 : getSoftwareVersion().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getDeviceStatus() == null) ? 0 : getDeviceStatus().hashCode());
        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        hashCode = prime * hashCode + ((getDeviceStatusInfo() == null) ? 0 : getDeviceStatusInfo().hashCode());
        return hashCode;
    }

    @Override
    public DeviceData clone() {
        try {
            return (DeviceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.DeviceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

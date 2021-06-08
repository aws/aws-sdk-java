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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for DescribeInputDeviceResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInputDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The unique ARN of the input device. */
    private String arn;
    /** The state of the connection between the input device and AWS. */
    private String connectionState;
    /**
     * The status of the action to synchronize the device configuration. If you change the configuration of the input
     * device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not
     * update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not
     * updated its configuration.
     */
    private String deviceSettingsSyncState;
    /** The status of software on the input device. */
    private String deviceUpdateStatus;
    /** Settings that describe an input device that is type HD. */
    private InputDeviceHdSettings hdDeviceSettings;
    /** The unique ID of the input device. */
    private String id;
    /** The network MAC address of the input device. */
    private String macAddress;
    /** A name that you specify for the input device. */
    private String name;
    /** The network settings for the input device. */
    private InputDeviceNetworkSettings networkSettings;
    /** The unique serial number of the input device. */
    private String serialNumber;
    /** The type of the input device. */
    private String type;
    /** Settings that describe an input device that is type UHD. */
    private InputDeviceUhdSettings uhdDeviceSettings;

    /**
     * The unique ARN of the input device.
     * 
     * @param arn
     *        The unique ARN of the input device.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The unique ARN of the input device.
     * 
     * @return The unique ARN of the input device.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The unique ARN of the input device.
     * 
     * @param arn
     *        The unique ARN of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The state of the connection between the input device and AWS.
     * 
     * @param connectionState
     *        The state of the connection between the input device and AWS.
     * @see InputDeviceConnectionState
     */

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * The state of the connection between the input device and AWS.
     * 
     * @return The state of the connection between the input device and AWS.
     * @see InputDeviceConnectionState
     */

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * The state of the connection between the input device and AWS.
     * 
     * @param connectionState
     *        The state of the connection between the input device and AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceConnectionState
     */

    public DescribeInputDeviceResult withConnectionState(String connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * The state of the connection between the input device and AWS.
     * 
     * @param connectionState
     *        The state of the connection between the input device and AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceConnectionState
     */

    public DescribeInputDeviceResult withConnectionState(InputDeviceConnectionState connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * The status of the action to synchronize the device configuration. If you change the configuration of the input
     * device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not
     * update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not
     * updated its configuration.
     * 
     * @param deviceSettingsSyncState
     *        The status of the action to synchronize the device configuration. If you change the configuration of the
     *        input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device
     *        might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means
     *        that it has not updated its configuration.
     * @see DeviceSettingsSyncState
     */

    public void setDeviceSettingsSyncState(String deviceSettingsSyncState) {
        this.deviceSettingsSyncState = deviceSettingsSyncState;
    }

    /**
     * The status of the action to synchronize the device configuration. If you change the configuration of the input
     * device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not
     * update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not
     * updated its configuration.
     * 
     * @return The status of the action to synchronize the device configuration. If you change the configuration of the
     *         input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device
     *         might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means
     *         that it has not updated its configuration.
     * @see DeviceSettingsSyncState
     */

    public String getDeviceSettingsSyncState() {
        return this.deviceSettingsSyncState;
    }

    /**
     * The status of the action to synchronize the device configuration. If you change the configuration of the input
     * device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not
     * update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not
     * updated its configuration.
     * 
     * @param deviceSettingsSyncState
     *        The status of the action to synchronize the device configuration. If you change the configuration of the
     *        input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device
     *        might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means
     *        that it has not updated its configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceSettingsSyncState
     */

    public DescribeInputDeviceResult withDeviceSettingsSyncState(String deviceSettingsSyncState) {
        setDeviceSettingsSyncState(deviceSettingsSyncState);
        return this;
    }

    /**
     * The status of the action to synchronize the device configuration. If you change the configuration of the input
     * device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not
     * update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not
     * updated its configuration.
     * 
     * @param deviceSettingsSyncState
     *        The status of the action to synchronize the device configuration. If you change the configuration of the
     *        input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device
     *        might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means
     *        that it has not updated its configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceSettingsSyncState
     */

    public DescribeInputDeviceResult withDeviceSettingsSyncState(DeviceSettingsSyncState deviceSettingsSyncState) {
        this.deviceSettingsSyncState = deviceSettingsSyncState.toString();
        return this;
    }

    /**
     * The status of software on the input device.
     * 
     * @param deviceUpdateStatus
     *        The status of software on the input device.
     * @see DeviceUpdateStatus
     */

    public void setDeviceUpdateStatus(String deviceUpdateStatus) {
        this.deviceUpdateStatus = deviceUpdateStatus;
    }

    /**
     * The status of software on the input device.
     * 
     * @return The status of software on the input device.
     * @see DeviceUpdateStatus
     */

    public String getDeviceUpdateStatus() {
        return this.deviceUpdateStatus;
    }

    /**
     * The status of software on the input device.
     * 
     * @param deviceUpdateStatus
     *        The status of software on the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceUpdateStatus
     */

    public DescribeInputDeviceResult withDeviceUpdateStatus(String deviceUpdateStatus) {
        setDeviceUpdateStatus(deviceUpdateStatus);
        return this;
    }

    /**
     * The status of software on the input device.
     * 
     * @param deviceUpdateStatus
     *        The status of software on the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceUpdateStatus
     */

    public DescribeInputDeviceResult withDeviceUpdateStatus(DeviceUpdateStatus deviceUpdateStatus) {
        this.deviceUpdateStatus = deviceUpdateStatus.toString();
        return this;
    }

    /**
     * Settings that describe an input device that is type HD.
     * 
     * @param hdDeviceSettings
     *        Settings that describe an input device that is type HD.
     */

    public void setHdDeviceSettings(InputDeviceHdSettings hdDeviceSettings) {
        this.hdDeviceSettings = hdDeviceSettings;
    }

    /**
     * Settings that describe an input device that is type HD.
     * 
     * @return Settings that describe an input device that is type HD.
     */

    public InputDeviceHdSettings getHdDeviceSettings() {
        return this.hdDeviceSettings;
    }

    /**
     * Settings that describe an input device that is type HD.
     * 
     * @param hdDeviceSettings
     *        Settings that describe an input device that is type HD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceResult withHdDeviceSettings(InputDeviceHdSettings hdDeviceSettings) {
        setHdDeviceSettings(hdDeviceSettings);
        return this;
    }

    /**
     * The unique ID of the input device.
     * 
     * @param id
     *        The unique ID of the input device.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique ID of the input device.
     * 
     * @return The unique ID of the input device.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique ID of the input device.
     * 
     * @param id
     *        The unique ID of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The network MAC address of the input device.
     * 
     * @param macAddress
     *        The network MAC address of the input device.
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * The network MAC address of the input device.
     * 
     * @return The network MAC address of the input device.
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * The network MAC address of the input device.
     * 
     * @param macAddress
     *        The network MAC address of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceResult withMacAddress(String macAddress) {
        setMacAddress(macAddress);
        return this;
    }

    /**
     * A name that you specify for the input device.
     * 
     * @param name
     *        A name that you specify for the input device.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A name that you specify for the input device.
     * 
     * @return A name that you specify for the input device.
     */

    public String getName() {
        return this.name;
    }

    /**
     * A name that you specify for the input device.
     * 
     * @param name
     *        A name that you specify for the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The network settings for the input device.
     * 
     * @param networkSettings
     *        The network settings for the input device.
     */

    public void setNetworkSettings(InputDeviceNetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
    }

    /**
     * The network settings for the input device.
     * 
     * @return The network settings for the input device.
     */

    public InputDeviceNetworkSettings getNetworkSettings() {
        return this.networkSettings;
    }

    /**
     * The network settings for the input device.
     * 
     * @param networkSettings
     *        The network settings for the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceResult withNetworkSettings(InputDeviceNetworkSettings networkSettings) {
        setNetworkSettings(networkSettings);
        return this;
    }

    /**
     * The unique serial number of the input device.
     * 
     * @param serialNumber
     *        The unique serial number of the input device.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * The unique serial number of the input device.
     * 
     * @return The unique serial number of the input device.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * The unique serial number of the input device.
     * 
     * @param serialNumber
     *        The unique serial number of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceResult withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * The type of the input device.
     * 
     * @param type
     *        The type of the input device.
     * @see InputDeviceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The type of the input device.
     * 
     * @return The type of the input device.
     * @see InputDeviceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * The type of the input device.
     * 
     * @param type
     *        The type of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceType
     */

    public DescribeInputDeviceResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * The type of the input device.
     * 
     * @param type
     *        The type of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceType
     */

    public DescribeInputDeviceResult withType(InputDeviceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Settings that describe an input device that is type UHD.
     * 
     * @param uhdDeviceSettings
     *        Settings that describe an input device that is type UHD.
     */

    public void setUhdDeviceSettings(InputDeviceUhdSettings uhdDeviceSettings) {
        this.uhdDeviceSettings = uhdDeviceSettings;
    }

    /**
     * Settings that describe an input device that is type UHD.
     * 
     * @return Settings that describe an input device that is type UHD.
     */

    public InputDeviceUhdSettings getUhdDeviceSettings() {
        return this.uhdDeviceSettings;
    }

    /**
     * Settings that describe an input device that is type UHD.
     * 
     * @param uhdDeviceSettings
     *        Settings that describe an input device that is type UHD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceResult withUhdDeviceSettings(InputDeviceUhdSettings uhdDeviceSettings) {
        setUhdDeviceSettings(uhdDeviceSettings);
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
        if (getConnectionState() != null)
            sb.append("ConnectionState: ").append(getConnectionState()).append(",");
        if (getDeviceSettingsSyncState() != null)
            sb.append("DeviceSettingsSyncState: ").append(getDeviceSettingsSyncState()).append(",");
        if (getDeviceUpdateStatus() != null)
            sb.append("DeviceUpdateStatus: ").append(getDeviceUpdateStatus()).append(",");
        if (getHdDeviceSettings() != null)
            sb.append("HdDeviceSettings: ").append(getHdDeviceSettings()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMacAddress() != null)
            sb.append("MacAddress: ").append(getMacAddress()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkSettings() != null)
            sb.append("NetworkSettings: ").append(getNetworkSettings()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUhdDeviceSettings() != null)
            sb.append("UhdDeviceSettings: ").append(getUhdDeviceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInputDeviceResult == false)
            return false;
        DescribeInputDeviceResult other = (DescribeInputDeviceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getDeviceSettingsSyncState() == null ^ this.getDeviceSettingsSyncState() == null)
            return false;
        if (other.getDeviceSettingsSyncState() != null && other.getDeviceSettingsSyncState().equals(this.getDeviceSettingsSyncState()) == false)
            return false;
        if (other.getDeviceUpdateStatus() == null ^ this.getDeviceUpdateStatus() == null)
            return false;
        if (other.getDeviceUpdateStatus() != null && other.getDeviceUpdateStatus().equals(this.getDeviceUpdateStatus()) == false)
            return false;
        if (other.getHdDeviceSettings() == null ^ this.getHdDeviceSettings() == null)
            return false;
        if (other.getHdDeviceSettings() != null && other.getHdDeviceSettings().equals(this.getHdDeviceSettings()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkSettings() == null ^ this.getNetworkSettings() == null)
            return false;
        if (other.getNetworkSettings() != null && other.getNetworkSettings().equals(this.getNetworkSettings()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUhdDeviceSettings() == null ^ this.getUhdDeviceSettings() == null)
            return false;
        if (other.getUhdDeviceSettings() != null && other.getUhdDeviceSettings().equals(this.getUhdDeviceSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime * hashCode + ((getDeviceSettingsSyncState() == null) ? 0 : getDeviceSettingsSyncState().hashCode());
        hashCode = prime * hashCode + ((getDeviceUpdateStatus() == null) ? 0 : getDeviceUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getHdDeviceSettings() == null) ? 0 : getHdDeviceSettings().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkSettings() == null) ? 0 : getNetworkSettings().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUhdDeviceSettings() == null) ? 0 : getUhdDeviceSettings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInputDeviceResult clone() {
        try {
            return (DescribeInputDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

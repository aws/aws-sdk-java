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
 * MetaData for Sidewalk device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkDeviceMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkDeviceMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The RSSI value.
     * </p>
     */
    private Integer rssi;
    /**
     * <p>
     * Sidewalk device battery level.
     * </p>
     */
    private String batteryLevel;
    /**
     * <p>
     * Sidewalk device status notification.
     * </p>
     */
    private String event;
    /**
     * <p>
     * Device state defines the device status of sidewalk device.
     * </p>
     */
    private String deviceState;

    /**
     * <p>
     * The RSSI value.
     * </p>
     * 
     * @param rssi
     *        The RSSI value.
     */

    public void setRssi(Integer rssi) {
        this.rssi = rssi;
    }

    /**
     * <p>
     * The RSSI value.
     * </p>
     * 
     * @return The RSSI value.
     */

    public Integer getRssi() {
        return this.rssi;
    }

    /**
     * <p>
     * The RSSI value.
     * </p>
     * 
     * @param rssi
     *        The RSSI value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkDeviceMetadata withRssi(Integer rssi) {
        setRssi(rssi);
        return this;
    }

    /**
     * <p>
     * Sidewalk device battery level.
     * </p>
     * 
     * @param batteryLevel
     *        Sidewalk device battery level.
     * @see BatteryLevel
     */

    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * <p>
     * Sidewalk device battery level.
     * </p>
     * 
     * @return Sidewalk device battery level.
     * @see BatteryLevel
     */

    public String getBatteryLevel() {
        return this.batteryLevel;
    }

    /**
     * <p>
     * Sidewalk device battery level.
     * </p>
     * 
     * @param batteryLevel
     *        Sidewalk device battery level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatteryLevel
     */

    public SidewalkDeviceMetadata withBatteryLevel(String batteryLevel) {
        setBatteryLevel(batteryLevel);
        return this;
    }

    /**
     * <p>
     * Sidewalk device battery level.
     * </p>
     * 
     * @param batteryLevel
     *        Sidewalk device battery level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatteryLevel
     */

    public SidewalkDeviceMetadata withBatteryLevel(BatteryLevel batteryLevel) {
        this.batteryLevel = batteryLevel.toString();
        return this;
    }

    /**
     * <p>
     * Sidewalk device status notification.
     * </p>
     * 
     * @param event
     *        Sidewalk device status notification.
     * @see Event
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * Sidewalk device status notification.
     * </p>
     * 
     * @return Sidewalk device status notification.
     * @see Event
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * Sidewalk device status notification.
     * </p>
     * 
     * @param event
     *        Sidewalk device status notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Event
     */

    public SidewalkDeviceMetadata withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * Sidewalk device status notification.
     * </p>
     * 
     * @param event
     *        Sidewalk device status notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Event
     */

    public SidewalkDeviceMetadata withEvent(Event event) {
        this.event = event.toString();
        return this;
    }

    /**
     * <p>
     * Device state defines the device status of sidewalk device.
     * </p>
     * 
     * @param deviceState
     *        Device state defines the device status of sidewalk device.
     * @see DeviceState
     */

    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }

    /**
     * <p>
     * Device state defines the device status of sidewalk device.
     * </p>
     * 
     * @return Device state defines the device status of sidewalk device.
     * @see DeviceState
     */

    public String getDeviceState() {
        return this.deviceState;
    }

    /**
     * <p>
     * Device state defines the device status of sidewalk device.
     * </p>
     * 
     * @param deviceState
     *        Device state defines the device status of sidewalk device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceState
     */

    public SidewalkDeviceMetadata withDeviceState(String deviceState) {
        setDeviceState(deviceState);
        return this;
    }

    /**
     * <p>
     * Device state defines the device status of sidewalk device.
     * </p>
     * 
     * @param deviceState
     *        Device state defines the device status of sidewalk device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceState
     */

    public SidewalkDeviceMetadata withDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState.toString();
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
        if (getRssi() != null)
            sb.append("Rssi: ").append(getRssi()).append(",");
        if (getBatteryLevel() != null)
            sb.append("BatteryLevel: ").append(getBatteryLevel()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getDeviceState() != null)
            sb.append("DeviceState: ").append(getDeviceState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkDeviceMetadata == false)
            return false;
        SidewalkDeviceMetadata other = (SidewalkDeviceMetadata) obj;
        if (other.getRssi() == null ^ this.getRssi() == null)
            return false;
        if (other.getRssi() != null && other.getRssi().equals(this.getRssi()) == false)
            return false;
        if (other.getBatteryLevel() == null ^ this.getBatteryLevel() == null)
            return false;
        if (other.getBatteryLevel() != null && other.getBatteryLevel().equals(this.getBatteryLevel()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getDeviceState() == null ^ this.getDeviceState() == null)
            return false;
        if (other.getDeviceState() != null && other.getDeviceState().equals(this.getDeviceState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRssi() == null) ? 0 : getRssi().hashCode());
        hashCode = prime * hashCode + ((getBatteryLevel() == null) ? 0 : getBatteryLevel().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getDeviceState() == null) ? 0 : getDeviceState().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkDeviceMetadata clone() {
        try {
            return (SidewalkDeviceMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkDeviceMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of devices.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DeviceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The status of the device.
     * </p>
     */
    private String deviceStatus;

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @return The ID of the device.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @param deviceStatus
     *        The status of the device.
     * @see DeviceStatus
     */

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @return The status of the device.
     * @see DeviceStatus
     */

    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @param deviceStatus
     *        The status of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DeviceSummary withDeviceStatus(String deviceStatus) {
        setDeviceStatus(deviceStatus);
        return this;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @param deviceStatus
     *        The status of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DeviceSummary withDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus.toString();
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
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getDeviceStatus() != null)
            sb.append("DeviceStatus: ").append(getDeviceStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceSummary == false)
            return false;
        DeviceSummary other = (DeviceSummary) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getDeviceStatus() == null ^ this.getDeviceStatus() == null)
            return false;
        if (other.getDeviceStatus() != null && other.getDeviceStatus().equals(this.getDeviceStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getDeviceStatus() == null) ? 0 : getDeviceStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeviceSummary clone() {
        try {
            return (DeviceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.worklink.model.transform.DeviceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

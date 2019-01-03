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
 * Detailed information about a device's status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeviceStatusInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceStatusInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     */
    private java.util.List<DeviceStatusDetail> deviceStatusDetails;
    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     */
    private String connectionStatus;

    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     * 
     * @return One or more device status detail descriptions.
     */

    public java.util.List<DeviceStatusDetail> getDeviceStatusDetails() {
        return deviceStatusDetails;
    }

    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     * 
     * @param deviceStatusDetails
     *        One or more device status detail descriptions.
     */

    public void setDeviceStatusDetails(java.util.Collection<DeviceStatusDetail> deviceStatusDetails) {
        if (deviceStatusDetails == null) {
            this.deviceStatusDetails = null;
            return;
        }

        this.deviceStatusDetails = new java.util.ArrayList<DeviceStatusDetail>(deviceStatusDetails);
    }

    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceStatusDetails(java.util.Collection)} or {@link #withDeviceStatusDetails(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param deviceStatusDetails
     *        One or more device status detail descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceStatusInfo withDeviceStatusDetails(DeviceStatusDetail... deviceStatusDetails) {
        if (this.deviceStatusDetails == null) {
            setDeviceStatusDetails(new java.util.ArrayList<DeviceStatusDetail>(deviceStatusDetails.length));
        }
        for (DeviceStatusDetail ele : deviceStatusDetails) {
            this.deviceStatusDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more device status detail descriptions.
     * </p>
     * 
     * @param deviceStatusDetails
     *        One or more device status detail descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceStatusInfo withDeviceStatusDetails(java.util.Collection<DeviceStatusDetail> deviceStatusDetails) {
        setDeviceStatusDetails(deviceStatusDetails);
        return this;
    }

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * 
     * @param connectionStatus
     *        The latest available information about the connection status of a device.
     * @see ConnectionStatus
     */

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * 
     * @return The latest available information about the connection status of a device.
     * @see ConnectionStatus
     */

    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * 
     * @param connectionStatus
     *        The latest available information about the connection status of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public DeviceStatusInfo withConnectionStatus(String connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * The latest available information about the connection status of a device.
     * </p>
     * 
     * @param connectionStatus
     *        The latest available information about the connection status of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public DeviceStatusInfo withConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus.toString();
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
        if (getDeviceStatusDetails() != null)
            sb.append("DeviceStatusDetails: ").append(getDeviceStatusDetails()).append(",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceStatusInfo == false)
            return false;
        DeviceStatusInfo other = (DeviceStatusInfo) obj;
        if (other.getDeviceStatusDetails() == null ^ this.getDeviceStatusDetails() == null)
            return false;
        if (other.getDeviceStatusDetails() != null && other.getDeviceStatusDetails().equals(this.getDeviceStatusDetails()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceStatusDetails() == null) ? 0 : getDeviceStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeviceStatusInfo clone() {
        try {
            return (DeviceStatusInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.DeviceStatusInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

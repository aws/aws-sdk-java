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
 * LoRaWAN object for update functions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANUpdateDevice" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANUpdateDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the device profile for the wireless device.
     * </p>
     */
    private String deviceProfileId;
    /**
     * <p>
     * The ID of the service profile.
     * </p>
     */
    private String serviceProfileId;

    /**
     * <p>
     * The ID of the device profile for the wireless device.
     * </p>
     * 
     * @param deviceProfileId
     *        The ID of the device profile for the wireless device.
     */

    public void setDeviceProfileId(String deviceProfileId) {
        this.deviceProfileId = deviceProfileId;
    }

    /**
     * <p>
     * The ID of the device profile for the wireless device.
     * </p>
     * 
     * @return The ID of the device profile for the wireless device.
     */

    public String getDeviceProfileId() {
        return this.deviceProfileId;
    }

    /**
     * <p>
     * The ID of the device profile for the wireless device.
     * </p>
     * 
     * @param deviceProfileId
     *        The ID of the device profile for the wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANUpdateDevice withDeviceProfileId(String deviceProfileId) {
        setDeviceProfileId(deviceProfileId);
        return this;
    }

    /**
     * <p>
     * The ID of the service profile.
     * </p>
     * 
     * @param serviceProfileId
     *        The ID of the service profile.
     */

    public void setServiceProfileId(String serviceProfileId) {
        this.serviceProfileId = serviceProfileId;
    }

    /**
     * <p>
     * The ID of the service profile.
     * </p>
     * 
     * @return The ID of the service profile.
     */

    public String getServiceProfileId() {
        return this.serviceProfileId;
    }

    /**
     * <p>
     * The ID of the service profile.
     * </p>
     * 
     * @param serviceProfileId
     *        The ID of the service profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANUpdateDevice withServiceProfileId(String serviceProfileId) {
        setServiceProfileId(serviceProfileId);
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
        if (getDeviceProfileId() != null)
            sb.append("DeviceProfileId: ").append(getDeviceProfileId()).append(",");
        if (getServiceProfileId() != null)
            sb.append("ServiceProfileId: ").append(getServiceProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANUpdateDevice == false)
            return false;
        LoRaWANUpdateDevice other = (LoRaWANUpdateDevice) obj;
        if (other.getDeviceProfileId() == null ^ this.getDeviceProfileId() == null)
            return false;
        if (other.getDeviceProfileId() != null && other.getDeviceProfileId().equals(this.getDeviceProfileId()) == false)
            return false;
        if (other.getServiceProfileId() == null ^ this.getServiceProfileId() == null)
            return false;
        if (other.getServiceProfileId() != null && other.getServiceProfileId().equals(this.getServiceProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceProfileId() == null) ? 0 : getDeviceProfileId().hashCode());
        hashCode = prime * hashCode + ((getServiceProfileId() == null) ? 0 : getServiceProfileId().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANUpdateDevice clone() {
        try {
            return (LoRaWANUpdateDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANUpdateDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

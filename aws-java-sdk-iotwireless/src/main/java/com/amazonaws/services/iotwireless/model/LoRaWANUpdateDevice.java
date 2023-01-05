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
     * ABP device object for update APIs for v1.1
     * </p>
     */
    private UpdateAbpV11 abpV1_1;
    /**
     * <p>
     * ABP device object for update APIs for v1.0.x
     * </p>
     */
    private UpdateAbpV10X abpV1_0_x;
    /**
     * <p>
     * FPorts object for the positioning information of the device.
     * </p>
     */
    private UpdateFPorts fPorts;

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
     * <p>
     * ABP device object for update APIs for v1.1
     * </p>
     * 
     * @param abpV1_1
     *        ABP device object for update APIs for v1.1
     */

    public void setAbpV1_1(UpdateAbpV11 abpV1_1) {
        this.abpV1_1 = abpV1_1;
    }

    /**
     * <p>
     * ABP device object for update APIs for v1.1
     * </p>
     * 
     * @return ABP device object for update APIs for v1.1
     */

    public UpdateAbpV11 getAbpV1_1() {
        return this.abpV1_1;
    }

    /**
     * <p>
     * ABP device object for update APIs for v1.1
     * </p>
     * 
     * @param abpV1_1
     *        ABP device object for update APIs for v1.1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANUpdateDevice withAbpV1_1(UpdateAbpV11 abpV1_1) {
        setAbpV1_1(abpV1_1);
        return this;
    }

    /**
     * <p>
     * ABP device object for update APIs for v1.0.x
     * </p>
     * 
     * @param abpV1_0_x
     *        ABP device object for update APIs for v1.0.x
     */

    public void setAbpV1_0_x(UpdateAbpV10X abpV1_0_x) {
        this.abpV1_0_x = abpV1_0_x;
    }

    /**
     * <p>
     * ABP device object for update APIs for v1.0.x
     * </p>
     * 
     * @return ABP device object for update APIs for v1.0.x
     */

    public UpdateAbpV10X getAbpV1_0_x() {
        return this.abpV1_0_x;
    }

    /**
     * <p>
     * ABP device object for update APIs for v1.0.x
     * </p>
     * 
     * @param abpV1_0_x
     *        ABP device object for update APIs for v1.0.x
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANUpdateDevice withAbpV1_0_x(UpdateAbpV10X abpV1_0_x) {
        setAbpV1_0_x(abpV1_0_x);
        return this;
    }

    /**
     * <p>
     * FPorts object for the positioning information of the device.
     * </p>
     * 
     * @param fPorts
     *        FPorts object for the positioning information of the device.
     */

    public void setFPorts(UpdateFPorts fPorts) {
        this.fPorts = fPorts;
    }

    /**
     * <p>
     * FPorts object for the positioning information of the device.
     * </p>
     * 
     * @return FPorts object for the positioning information of the device.
     */

    public UpdateFPorts getFPorts() {
        return this.fPorts;
    }

    /**
     * <p>
     * FPorts object for the positioning information of the device.
     * </p>
     * 
     * @param fPorts
     *        FPorts object for the positioning information of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANUpdateDevice withFPorts(UpdateFPorts fPorts) {
        setFPorts(fPorts);
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
            sb.append("ServiceProfileId: ").append(getServiceProfileId()).append(",");
        if (getAbpV1_1() != null)
            sb.append("AbpV1_1: ").append(getAbpV1_1()).append(",");
        if (getAbpV1_0_x() != null)
            sb.append("AbpV1_0_x: ").append(getAbpV1_0_x()).append(",");
        if (getFPorts() != null)
            sb.append("FPorts: ").append(getFPorts());
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
        if (other.getAbpV1_1() == null ^ this.getAbpV1_1() == null)
            return false;
        if (other.getAbpV1_1() != null && other.getAbpV1_1().equals(this.getAbpV1_1()) == false)
            return false;
        if (other.getAbpV1_0_x() == null ^ this.getAbpV1_0_x() == null)
            return false;
        if (other.getAbpV1_0_x() != null && other.getAbpV1_0_x().equals(this.getAbpV1_0_x()) == false)
            return false;
        if (other.getFPorts() == null ^ this.getFPorts() == null)
            return false;
        if (other.getFPorts() != null && other.getFPorts().equals(this.getFPorts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceProfileId() == null) ? 0 : getDeviceProfileId().hashCode());
        hashCode = prime * hashCode + ((getServiceProfileId() == null) ? 0 : getServiceProfileId().hashCode());
        hashCode = prime * hashCode + ((getAbpV1_1() == null) ? 0 : getAbpV1_1().hashCode());
        hashCode = prime * hashCode + ((getAbpV1_0_x() == null) ? 0 : getAbpV1_0_x().hashCode());
        hashCode = prime * hashCode + ((getFPorts() == null) ? 0 : getFPorts().hashCode());
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

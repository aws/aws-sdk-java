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
 * LoRaWAN object for create functions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DevEUI value.
     * </p>
     */
    private String devEui;
    /**
     * <p>
     * The ID of the device profile for the new wireless device.
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
     * OTAA device object for v1.1 for create APIs
     * </p>
     */
    private OtaaV11 otaaV1_1;
    /**
     * <p>
     * OTAA device object for create APIs for v1.0.x
     * </p>
     */
    private OtaaV10X otaaV1_0_x;
    /**
     * <p>
     * ABP device object for create APIs for v1.1
     * </p>
     */
    private AbpV11 abpV1_1;
    /**
     * <p>
     * LoRaWAN object for create APIs
     * </p>
     */
    private AbpV10X abpV1_0_x;

    /**
     * <p>
     * The DevEUI value.
     * </p>
     * 
     * @param devEui
     *        The DevEUI value.
     */

    public void setDevEui(String devEui) {
        this.devEui = devEui;
    }

    /**
     * <p>
     * The DevEUI value.
     * </p>
     * 
     * @return The DevEUI value.
     */

    public String getDevEui() {
        return this.devEui;
    }

    /**
     * <p>
     * The DevEUI value.
     * </p>
     * 
     * @param devEui
     *        The DevEUI value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDevice withDevEui(String devEui) {
        setDevEui(devEui);
        return this;
    }

    /**
     * <p>
     * The ID of the device profile for the new wireless device.
     * </p>
     * 
     * @param deviceProfileId
     *        The ID of the device profile for the new wireless device.
     */

    public void setDeviceProfileId(String deviceProfileId) {
        this.deviceProfileId = deviceProfileId;
    }

    /**
     * <p>
     * The ID of the device profile for the new wireless device.
     * </p>
     * 
     * @return The ID of the device profile for the new wireless device.
     */

    public String getDeviceProfileId() {
        return this.deviceProfileId;
    }

    /**
     * <p>
     * The ID of the device profile for the new wireless device.
     * </p>
     * 
     * @param deviceProfileId
     *        The ID of the device profile for the new wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDevice withDeviceProfileId(String deviceProfileId) {
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

    public LoRaWANDevice withServiceProfileId(String serviceProfileId) {
        setServiceProfileId(serviceProfileId);
        return this;
    }

    /**
     * <p>
     * OTAA device object for v1.1 for create APIs
     * </p>
     * 
     * @param otaaV1_1
     *        OTAA device object for v1.1 for create APIs
     */

    public void setOtaaV1_1(OtaaV11 otaaV1_1) {
        this.otaaV1_1 = otaaV1_1;
    }

    /**
     * <p>
     * OTAA device object for v1.1 for create APIs
     * </p>
     * 
     * @return OTAA device object for v1.1 for create APIs
     */

    public OtaaV11 getOtaaV1_1() {
        return this.otaaV1_1;
    }

    /**
     * <p>
     * OTAA device object for v1.1 for create APIs
     * </p>
     * 
     * @param otaaV1_1
     *        OTAA device object for v1.1 for create APIs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDevice withOtaaV1_1(OtaaV11 otaaV1_1) {
        setOtaaV1_1(otaaV1_1);
        return this;
    }

    /**
     * <p>
     * OTAA device object for create APIs for v1.0.x
     * </p>
     * 
     * @param otaaV1_0_x
     *        OTAA device object for create APIs for v1.0.x
     */

    public void setOtaaV1_0_x(OtaaV10X otaaV1_0_x) {
        this.otaaV1_0_x = otaaV1_0_x;
    }

    /**
     * <p>
     * OTAA device object for create APIs for v1.0.x
     * </p>
     * 
     * @return OTAA device object for create APIs for v1.0.x
     */

    public OtaaV10X getOtaaV1_0_x() {
        return this.otaaV1_0_x;
    }

    /**
     * <p>
     * OTAA device object for create APIs for v1.0.x
     * </p>
     * 
     * @param otaaV1_0_x
     *        OTAA device object for create APIs for v1.0.x
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDevice withOtaaV1_0_x(OtaaV10X otaaV1_0_x) {
        setOtaaV1_0_x(otaaV1_0_x);
        return this;
    }

    /**
     * <p>
     * ABP device object for create APIs for v1.1
     * </p>
     * 
     * @param abpV1_1
     *        ABP device object for create APIs for v1.1
     */

    public void setAbpV1_1(AbpV11 abpV1_1) {
        this.abpV1_1 = abpV1_1;
    }

    /**
     * <p>
     * ABP device object for create APIs for v1.1
     * </p>
     * 
     * @return ABP device object for create APIs for v1.1
     */

    public AbpV11 getAbpV1_1() {
        return this.abpV1_1;
    }

    /**
     * <p>
     * ABP device object for create APIs for v1.1
     * </p>
     * 
     * @param abpV1_1
     *        ABP device object for create APIs for v1.1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDevice withAbpV1_1(AbpV11 abpV1_1) {
        setAbpV1_1(abpV1_1);
        return this;
    }

    /**
     * <p>
     * LoRaWAN object for create APIs
     * </p>
     * 
     * @param abpV1_0_x
     *        LoRaWAN object for create APIs
     */

    public void setAbpV1_0_x(AbpV10X abpV1_0_x) {
        this.abpV1_0_x = abpV1_0_x;
    }

    /**
     * <p>
     * LoRaWAN object for create APIs
     * </p>
     * 
     * @return LoRaWAN object for create APIs
     */

    public AbpV10X getAbpV1_0_x() {
        return this.abpV1_0_x;
    }

    /**
     * <p>
     * LoRaWAN object for create APIs
     * </p>
     * 
     * @param abpV1_0_x
     *        LoRaWAN object for create APIs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDevice withAbpV1_0_x(AbpV10X abpV1_0_x) {
        setAbpV1_0_x(abpV1_0_x);
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
        if (getDevEui() != null)
            sb.append("DevEui: ").append(getDevEui()).append(",");
        if (getDeviceProfileId() != null)
            sb.append("DeviceProfileId: ").append(getDeviceProfileId()).append(",");
        if (getServiceProfileId() != null)
            sb.append("ServiceProfileId: ").append(getServiceProfileId()).append(",");
        if (getOtaaV1_1() != null)
            sb.append("OtaaV1_1: ").append(getOtaaV1_1()).append(",");
        if (getOtaaV1_0_x() != null)
            sb.append("OtaaV1_0_x: ").append(getOtaaV1_0_x()).append(",");
        if (getAbpV1_1() != null)
            sb.append("AbpV1_1: ").append(getAbpV1_1()).append(",");
        if (getAbpV1_0_x() != null)
            sb.append("AbpV1_0_x: ").append(getAbpV1_0_x());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANDevice == false)
            return false;
        LoRaWANDevice other = (LoRaWANDevice) obj;
        if (other.getDevEui() == null ^ this.getDevEui() == null)
            return false;
        if (other.getDevEui() != null && other.getDevEui().equals(this.getDevEui()) == false)
            return false;
        if (other.getDeviceProfileId() == null ^ this.getDeviceProfileId() == null)
            return false;
        if (other.getDeviceProfileId() != null && other.getDeviceProfileId().equals(this.getDeviceProfileId()) == false)
            return false;
        if (other.getServiceProfileId() == null ^ this.getServiceProfileId() == null)
            return false;
        if (other.getServiceProfileId() != null && other.getServiceProfileId().equals(this.getServiceProfileId()) == false)
            return false;
        if (other.getOtaaV1_1() == null ^ this.getOtaaV1_1() == null)
            return false;
        if (other.getOtaaV1_1() != null && other.getOtaaV1_1().equals(this.getOtaaV1_1()) == false)
            return false;
        if (other.getOtaaV1_0_x() == null ^ this.getOtaaV1_0_x() == null)
            return false;
        if (other.getOtaaV1_0_x() != null && other.getOtaaV1_0_x().equals(this.getOtaaV1_0_x()) == false)
            return false;
        if (other.getAbpV1_1() == null ^ this.getAbpV1_1() == null)
            return false;
        if (other.getAbpV1_1() != null && other.getAbpV1_1().equals(this.getAbpV1_1()) == false)
            return false;
        if (other.getAbpV1_0_x() == null ^ this.getAbpV1_0_x() == null)
            return false;
        if (other.getAbpV1_0_x() != null && other.getAbpV1_0_x().equals(this.getAbpV1_0_x()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevEui() == null) ? 0 : getDevEui().hashCode());
        hashCode = prime * hashCode + ((getDeviceProfileId() == null) ? 0 : getDeviceProfileId().hashCode());
        hashCode = prime * hashCode + ((getServiceProfileId() == null) ? 0 : getServiceProfileId().hashCode());
        hashCode = prime * hashCode + ((getOtaaV1_1() == null) ? 0 : getOtaaV1_1().hashCode());
        hashCode = prime * hashCode + ((getOtaaV1_0_x() == null) ? 0 : getOtaaV1_0_x().hashCode());
        hashCode = prime * hashCode + ((getAbpV1_1() == null) ? 0 : getAbpV1_1().hashCode());
        hashCode = prime * hashCode + ((getAbpV1_0_x() == null) ? 0 : getAbpV1_0_x().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANDevice clone() {
        try {
            return (LoRaWANDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

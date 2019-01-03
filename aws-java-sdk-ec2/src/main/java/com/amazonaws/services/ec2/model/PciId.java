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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the data that identifies an Amazon FPGA image (AFI) on the PCI bus.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PciId" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PciId implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The ID of the vendor.
     * </p>
     */
    private String vendorId;
    /**
     * <p>
     * The ID of the subsystem.
     * </p>
     */
    private String subsystemId;
    /**
     * <p>
     * The ID of the vendor for the subsystem.
     * </p>
     */
    private String subsystemVendorId;

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

    public PciId withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The ID of the vendor.
     * </p>
     * 
     * @param vendorId
     *        The ID of the vendor.
     */

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * <p>
     * The ID of the vendor.
     * </p>
     * 
     * @return The ID of the vendor.
     */

    public String getVendorId() {
        return this.vendorId;
    }

    /**
     * <p>
     * The ID of the vendor.
     * </p>
     * 
     * @param vendorId
     *        The ID of the vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PciId withVendorId(String vendorId) {
        setVendorId(vendorId);
        return this;
    }

    /**
     * <p>
     * The ID of the subsystem.
     * </p>
     * 
     * @param subsystemId
     *        The ID of the subsystem.
     */

    public void setSubsystemId(String subsystemId) {
        this.subsystemId = subsystemId;
    }

    /**
     * <p>
     * The ID of the subsystem.
     * </p>
     * 
     * @return The ID of the subsystem.
     */

    public String getSubsystemId() {
        return this.subsystemId;
    }

    /**
     * <p>
     * The ID of the subsystem.
     * </p>
     * 
     * @param subsystemId
     *        The ID of the subsystem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PciId withSubsystemId(String subsystemId) {
        setSubsystemId(subsystemId);
        return this;
    }

    /**
     * <p>
     * The ID of the vendor for the subsystem.
     * </p>
     * 
     * @param subsystemVendorId
     *        The ID of the vendor for the subsystem.
     */

    public void setSubsystemVendorId(String subsystemVendorId) {
        this.subsystemVendorId = subsystemVendorId;
    }

    /**
     * <p>
     * The ID of the vendor for the subsystem.
     * </p>
     * 
     * @return The ID of the vendor for the subsystem.
     */

    public String getSubsystemVendorId() {
        return this.subsystemVendorId;
    }

    /**
     * <p>
     * The ID of the vendor for the subsystem.
     * </p>
     * 
     * @param subsystemVendorId
     *        The ID of the vendor for the subsystem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PciId withSubsystemVendorId(String subsystemVendorId) {
        setSubsystemVendorId(subsystemVendorId);
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
        if (getVendorId() != null)
            sb.append("VendorId: ").append(getVendorId()).append(",");
        if (getSubsystemId() != null)
            sb.append("SubsystemId: ").append(getSubsystemId()).append(",");
        if (getSubsystemVendorId() != null)
            sb.append("SubsystemVendorId: ").append(getSubsystemVendorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PciId == false)
            return false;
        PciId other = (PciId) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getVendorId() == null ^ this.getVendorId() == null)
            return false;
        if (other.getVendorId() != null && other.getVendorId().equals(this.getVendorId()) == false)
            return false;
        if (other.getSubsystemId() == null ^ this.getSubsystemId() == null)
            return false;
        if (other.getSubsystemId() != null && other.getSubsystemId().equals(this.getSubsystemId()) == false)
            return false;
        if (other.getSubsystemVendorId() == null ^ this.getSubsystemVendorId() == null)
            return false;
        if (other.getSubsystemVendorId() != null && other.getSubsystemVendorId().equals(this.getSubsystemVendorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getVendorId() == null) ? 0 : getVendorId().hashCode());
        hashCode = prime * hashCode + ((getSubsystemId() == null) ? 0 : getSubsystemId().hashCode());
        hashCode = prime * hashCode + ((getSubsystemVendorId() == null) ? 0 : getSubsystemVendorId().hashCode());
        return hashCode;
    }

    @Override
    public PciId clone() {
        try {
            return (PciId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

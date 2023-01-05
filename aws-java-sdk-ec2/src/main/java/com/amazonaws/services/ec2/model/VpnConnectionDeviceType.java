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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * List of customer gateway devices that have a sample configuration file available for use. You can also see the list
 * of device types with sample configuration files available under <a
 * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/your-cgw.html">Your customer gateway device</a> in the <i>Amazon
 * Web Services Site-to-Site VPN User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpnConnectionDeviceType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnConnectionDeviceType implements Serializable, Cloneable {

    /**
     * <p>
     * Customer gateway device identifier.
     * </p>
     */
    private String vpnConnectionDeviceTypeId;
    /**
     * <p>
     * Customer gateway device vendor.
     * </p>
     */
    private String vendor;
    /**
     * <p>
     * Customer gateway device platform.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * Customer gateway device software version.
     * </p>
     */
    private String software;

    /**
     * <p>
     * Customer gateway device identifier.
     * </p>
     * 
     * @param vpnConnectionDeviceTypeId
     *        Customer gateway device identifier.
     */

    public void setVpnConnectionDeviceTypeId(String vpnConnectionDeviceTypeId) {
        this.vpnConnectionDeviceTypeId = vpnConnectionDeviceTypeId;
    }

    /**
     * <p>
     * Customer gateway device identifier.
     * </p>
     * 
     * @return Customer gateway device identifier.
     */

    public String getVpnConnectionDeviceTypeId() {
        return this.vpnConnectionDeviceTypeId;
    }

    /**
     * <p>
     * Customer gateway device identifier.
     * </p>
     * 
     * @param vpnConnectionDeviceTypeId
     *        Customer gateway device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionDeviceType withVpnConnectionDeviceTypeId(String vpnConnectionDeviceTypeId) {
        setVpnConnectionDeviceTypeId(vpnConnectionDeviceTypeId);
        return this;
    }

    /**
     * <p>
     * Customer gateway device vendor.
     * </p>
     * 
     * @param vendor
     *        Customer gateway device vendor.
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * Customer gateway device vendor.
     * </p>
     * 
     * @return Customer gateway device vendor.
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * Customer gateway device vendor.
     * </p>
     * 
     * @param vendor
     *        Customer gateway device vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionDeviceType withVendor(String vendor) {
        setVendor(vendor);
        return this;
    }

    /**
     * <p>
     * Customer gateway device platform.
     * </p>
     * 
     * @param platform
     *        Customer gateway device platform.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * Customer gateway device platform.
     * </p>
     * 
     * @return Customer gateway device platform.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * Customer gateway device platform.
     * </p>
     * 
     * @param platform
     *        Customer gateway device platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionDeviceType withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * Customer gateway device software version.
     * </p>
     * 
     * @param software
     *        Customer gateway device software version.
     */

    public void setSoftware(String software) {
        this.software = software;
    }

    /**
     * <p>
     * Customer gateway device software version.
     * </p>
     * 
     * @return Customer gateway device software version.
     */

    public String getSoftware() {
        return this.software;
    }

    /**
     * <p>
     * Customer gateway device software version.
     * </p>
     * 
     * @param software
     *        Customer gateway device software version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionDeviceType withSoftware(String software) {
        setSoftware(software);
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
        if (getVpnConnectionDeviceTypeId() != null)
            sb.append("VpnConnectionDeviceTypeId: ").append(getVpnConnectionDeviceTypeId()).append(",");
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getSoftware() != null)
            sb.append("Software: ").append(getSoftware());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnConnectionDeviceType == false)
            return false;
        VpnConnectionDeviceType other = (VpnConnectionDeviceType) obj;
        if (other.getVpnConnectionDeviceTypeId() == null ^ this.getVpnConnectionDeviceTypeId() == null)
            return false;
        if (other.getVpnConnectionDeviceTypeId() != null && other.getVpnConnectionDeviceTypeId().equals(this.getVpnConnectionDeviceTypeId()) == false)
            return false;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getSoftware() == null ^ this.getSoftware() == null)
            return false;
        if (other.getSoftware() != null && other.getSoftware().equals(this.getSoftware()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionDeviceTypeId() == null) ? 0 : getVpnConnectionDeviceTypeId().hashCode());
        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getSoftware() == null) ? 0 : getSoftware().hashCode());
        return hashCode;
    }

    @Override
    public VpnConnectionDeviceType clone() {
        try {
            return (VpnConnectionDeviceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

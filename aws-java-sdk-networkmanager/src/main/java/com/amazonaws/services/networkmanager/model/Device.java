/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/Device" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Device implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The description of the device.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The device type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The device vendor.
     * </p>
     */
    private String vendor;
    /**
     * <p>
     * The device model.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The device serial number.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The site location.
     * </p>
     */
    private Location location;
    /**
     * <p>
     * The site ID.
     * </p>
     */
    private String siteId;
    /**
     * <p>
     * The date and time that the site was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The device state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags for the device.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public Device withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The description of the device.
     * </p>
     * 
     * @param description
     *        The description of the device.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the device.
     * </p>
     * 
     * @return The description of the device.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the device.
     * </p>
     * 
     * @param description
     *        The description of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The device type.
     * </p>
     * 
     * @param type
     *        The device type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The device type.
     * </p>
     * 
     * @return The device type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The device type.
     * </p>
     * 
     * @param type
     *        The device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The device vendor.
     * </p>
     * 
     * @param vendor
     *        The device vendor.
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The device vendor.
     * </p>
     * 
     * @return The device vendor.
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * The device vendor.
     * </p>
     * 
     * @param vendor
     *        The device vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withVendor(String vendor) {
        setVendor(vendor);
        return this;
    }

    /**
     * <p>
     * The device model.
     * </p>
     * 
     * @param model
     *        The device model.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The device model.
     * </p>
     * 
     * @return The device model.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The device model.
     * </p>
     * 
     * @param model
     *        The device model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The device serial number.
     * </p>
     * 
     * @param serialNumber
     *        The device serial number.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The device serial number.
     * </p>
     * 
     * @return The device serial number.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The device serial number.
     * </p>
     * 
     * @param serialNumber
     *        The device serial number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The site location.
     * </p>
     * 
     * @param location
     *        The site location.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The site location.
     * </p>
     * 
     * @return The site location.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The site location.
     * </p>
     * 
     * @param location
     *        The site location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The site ID.
     * </p>
     * 
     * @param siteId
     *        The site ID.
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * <p>
     * The site ID.
     * </p>
     * 
     * @return The site ID.
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * <p>
     * The site ID.
     * </p>
     * 
     * @param siteId
     *        The site ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withSiteId(String siteId) {
        setSiteId(siteId);
        return this;
    }

    /**
     * <p>
     * The date and time that the site was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the site was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the site was created.
     * </p>
     * 
     * @return The date and time that the site was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the site was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the site was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The device state.
     * </p>
     * 
     * @param state
     *        The device state.
     * @see DeviceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The device state.
     * </p>
     * 
     * @return The device state.
     * @see DeviceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The device state.
     * </p>
     * 
     * @param state
     *        The device state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceState
     */

    public Device withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The device state.
     * </p>
     * 
     * @param state
     *        The device state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceState
     */

    public Device withState(DeviceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags for the device.
     * </p>
     * 
     * @return The tags for the device.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the device.
     * </p>
     * 
     * @param tags
     *        The tags for the device.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the device.
     * </p>
     * 
     * @param tags
     *        The tags for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Device == false)
            return false;
        Device other = (Device) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.DeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

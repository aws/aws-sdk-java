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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/Device" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Device implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device's maker.
     * </p>
     */
    private String brand;
    /**
     * <p>
     * When the device was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * A device's current software.
     * </p>
     */
    private String currentSoftware;
    /**
     * <p>
     * A description for the device.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A device's aggregated status. Including the device's connection status, provisioning status, and lease status.
     * </p>
     */
    private String deviceAggregatedStatus;
    /**
     * <p>
     * The device's ID.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * When the device was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * A device's latest job. Includes the target image version, and the update job status.
     * </p>
     */
    private LatestDeviceJob latestDeviceJob;
    /**
     * <p>
     * The device's lease expiration time.
     * </p>
     */
    private java.util.Date leaseExpirationTime;
    /**
     * <p>
     * The device's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The device's provisioning status.
     * </p>
     */
    private String provisioningStatus;
    /**
     * <p>
     * The device's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The device's type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The device's maker.
     * </p>
     * 
     * @param brand
     *        The device's maker.
     * @see DeviceBrand
     */

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * <p>
     * The device's maker.
     * </p>
     * 
     * @return The device's maker.
     * @see DeviceBrand
     */

    public String getBrand() {
        return this.brand;
    }

    /**
     * <p>
     * The device's maker.
     * </p>
     * 
     * @param brand
     *        The device's maker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceBrand
     */

    public Device withBrand(String brand) {
        setBrand(brand);
        return this;
    }

    /**
     * <p>
     * The device's maker.
     * </p>
     * 
     * @param brand
     *        The device's maker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceBrand
     */

    public Device withBrand(DeviceBrand brand) {
        this.brand = brand.toString();
        return this;
    }

    /**
     * <p>
     * When the device was created.
     * </p>
     * 
     * @param createdTime
     *        When the device was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the device was created.
     * </p>
     * 
     * @return When the device was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the device was created.
     * </p>
     * 
     * @param createdTime
     *        When the device was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * A device's current software.
     * </p>
     * 
     * @param currentSoftware
     *        A device's current software.
     */

    public void setCurrentSoftware(String currentSoftware) {
        this.currentSoftware = currentSoftware;
    }

    /**
     * <p>
     * A device's current software.
     * </p>
     * 
     * @return A device's current software.
     */

    public String getCurrentSoftware() {
        return this.currentSoftware;
    }

    /**
     * <p>
     * A device's current software.
     * </p>
     * 
     * @param currentSoftware
     *        A device's current software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withCurrentSoftware(String currentSoftware) {
        setCurrentSoftware(currentSoftware);
        return this;
    }

    /**
     * <p>
     * A description for the device.
     * </p>
     * 
     * @param description
     *        A description for the device.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the device.
     * </p>
     * 
     * @return A description for the device.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the device.
     * </p>
     * 
     * @param description
     *        A description for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A device's aggregated status. Including the device's connection status, provisioning status, and lease status.
     * </p>
     * 
     * @param deviceAggregatedStatus
     *        A device's aggregated status. Including the device's connection status, provisioning status, and lease
     *        status.
     * @see DeviceAggregatedStatus
     */

    public void setDeviceAggregatedStatus(String deviceAggregatedStatus) {
        this.deviceAggregatedStatus = deviceAggregatedStatus;
    }

    /**
     * <p>
     * A device's aggregated status. Including the device's connection status, provisioning status, and lease status.
     * </p>
     * 
     * @return A device's aggregated status. Including the device's connection status, provisioning status, and lease
     *         status.
     * @see DeviceAggregatedStatus
     */

    public String getDeviceAggregatedStatus() {
        return this.deviceAggregatedStatus;
    }

    /**
     * <p>
     * A device's aggregated status. Including the device's connection status, provisioning status, and lease status.
     * </p>
     * 
     * @param deviceAggregatedStatus
     *        A device's aggregated status. Including the device's connection status, provisioning status, and lease
     *        status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAggregatedStatus
     */

    public Device withDeviceAggregatedStatus(String deviceAggregatedStatus) {
        setDeviceAggregatedStatus(deviceAggregatedStatus);
        return this;
    }

    /**
     * <p>
     * A device's aggregated status. Including the device's connection status, provisioning status, and lease status.
     * </p>
     * 
     * @param deviceAggregatedStatus
     *        A device's aggregated status. Including the device's connection status, provisioning status, and lease
     *        status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAggregatedStatus
     */

    public Device withDeviceAggregatedStatus(DeviceAggregatedStatus deviceAggregatedStatus) {
        this.deviceAggregatedStatus = deviceAggregatedStatus.toString();
        return this;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @return The device's ID.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * When the device was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the device was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * When the device was updated.
     * </p>
     * 
     * @return When the device was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * When the device was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the device was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * A device's latest job. Includes the target image version, and the update job status.
     * </p>
     * 
     * @param latestDeviceJob
     *        A device's latest job. Includes the target image version, and the update job status.
     */

    public void setLatestDeviceJob(LatestDeviceJob latestDeviceJob) {
        this.latestDeviceJob = latestDeviceJob;
    }

    /**
     * <p>
     * A device's latest job. Includes the target image version, and the update job status.
     * </p>
     * 
     * @return A device's latest job. Includes the target image version, and the update job status.
     */

    public LatestDeviceJob getLatestDeviceJob() {
        return this.latestDeviceJob;
    }

    /**
     * <p>
     * A device's latest job. Includes the target image version, and the update job status.
     * </p>
     * 
     * @param latestDeviceJob
     *        A device's latest job. Includes the target image version, and the update job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withLatestDeviceJob(LatestDeviceJob latestDeviceJob) {
        setLatestDeviceJob(latestDeviceJob);
        return this;
    }

    /**
     * <p>
     * The device's lease expiration time.
     * </p>
     * 
     * @param leaseExpirationTime
     *        The device's lease expiration time.
     */

    public void setLeaseExpirationTime(java.util.Date leaseExpirationTime) {
        this.leaseExpirationTime = leaseExpirationTime;
    }

    /**
     * <p>
     * The device's lease expiration time.
     * </p>
     * 
     * @return The device's lease expiration time.
     */

    public java.util.Date getLeaseExpirationTime() {
        return this.leaseExpirationTime;
    }

    /**
     * <p>
     * The device's lease expiration time.
     * </p>
     * 
     * @param leaseExpirationTime
     *        The device's lease expiration time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withLeaseExpirationTime(java.util.Date leaseExpirationTime) {
        setLeaseExpirationTime(leaseExpirationTime);
        return this;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @param name
     *        The device's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @return The device's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @param name
     *        The device's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The device's provisioning status.
     * </p>
     * 
     * @param provisioningStatus
     *        The device's provisioning status.
     * @see DeviceStatus
     */

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    /**
     * <p>
     * The device's provisioning status.
     * </p>
     * 
     * @return The device's provisioning status.
     * @see DeviceStatus
     */

    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * <p>
     * The device's provisioning status.
     * </p>
     * 
     * @param provisioningStatus
     *        The device's provisioning status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public Device withProvisioningStatus(String provisioningStatus) {
        setProvisioningStatus(provisioningStatus);
        return this;
    }

    /**
     * <p>
     * The device's provisioning status.
     * </p>
     * 
     * @param provisioningStatus
     *        The device's provisioning status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public Device withProvisioningStatus(DeviceStatus provisioningStatus) {
        this.provisioningStatus = provisioningStatus.toString();
        return this;
    }

    /**
     * <p>
     * The device's tags.
     * </p>
     * 
     * @return The device's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The device's tags.
     * </p>
     * 
     * @param tags
     *        The device's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The device's tags.
     * </p>
     * 
     * @param tags
     *        The device's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Device#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Device addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The device's type.
     * </p>
     * 
     * @param type
     *        The device's type.
     * @see DeviceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The device's type.
     * </p>
     * 
     * @return The device's type.
     * @see DeviceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The device's type.
     * </p>
     * 
     * @param type
     *        The device's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceType
     */

    public Device withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The device's type.
     * </p>
     * 
     * @param type
     *        The device's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceType
     */

    public Device withType(DeviceType type) {
        this.type = type.toString();
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
        if (getBrand() != null)
            sb.append("Brand: ").append(getBrand()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getCurrentSoftware() != null)
            sb.append("CurrentSoftware: ").append(getCurrentSoftware()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeviceAggregatedStatus() != null)
            sb.append("DeviceAggregatedStatus: ").append(getDeviceAggregatedStatus()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getLatestDeviceJob() != null)
            sb.append("LatestDeviceJob: ").append(getLatestDeviceJob()).append(",");
        if (getLeaseExpirationTime() != null)
            sb.append("LeaseExpirationTime: ").append(getLeaseExpirationTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProvisioningStatus() != null)
            sb.append("ProvisioningStatus: ").append(getProvisioningStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getBrand() == null ^ this.getBrand() == null)
            return false;
        if (other.getBrand() != null && other.getBrand().equals(this.getBrand()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getCurrentSoftware() == null ^ this.getCurrentSoftware() == null)
            return false;
        if (other.getCurrentSoftware() != null && other.getCurrentSoftware().equals(this.getCurrentSoftware()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeviceAggregatedStatus() == null ^ this.getDeviceAggregatedStatus() == null)
            return false;
        if (other.getDeviceAggregatedStatus() != null && other.getDeviceAggregatedStatus().equals(this.getDeviceAggregatedStatus()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getLatestDeviceJob() == null ^ this.getLatestDeviceJob() == null)
            return false;
        if (other.getLatestDeviceJob() != null && other.getLatestDeviceJob().equals(this.getLatestDeviceJob()) == false)
            return false;
        if (other.getLeaseExpirationTime() == null ^ this.getLeaseExpirationTime() == null)
            return false;
        if (other.getLeaseExpirationTime() != null && other.getLeaseExpirationTime().equals(this.getLeaseExpirationTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProvisioningStatus() == null ^ this.getProvisioningStatus() == null)
            return false;
        if (other.getProvisioningStatus() != null && other.getProvisioningStatus().equals(this.getProvisioningStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrand() == null) ? 0 : getBrand().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentSoftware() == null) ? 0 : getCurrentSoftware().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeviceAggregatedStatus() == null) ? 0 : getDeviceAggregatedStatus().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getLatestDeviceJob() == null) ? 0 : getLatestDeviceJob().hashCode());
        hashCode = prime * hashCode + ((getLeaseExpirationTime() == null) ? 0 : getLeaseExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvisioningStatus() == null) ? 0 : getProvisioningStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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
        com.amazonaws.services.panorama.model.transform.DeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

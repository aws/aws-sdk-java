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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Beta software releases available for the device.
     * </p>
     */
    private java.util.List<AlternateSoftwareMetadata> alternateSoftwares;
    /**
     * <p>
     * The device's ARN.
     * </p>
     */
    private String arn;
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
     * The device's networking status.
     * </p>
     */
    private NetworkStatus currentNetworkingStatus;
    /**
     * <p>
     * The device's current software version.
     * </p>
     */
    private String currentSoftware;
    /**
     * <p>
     * The device's description.
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
     * The device's connection status.
     * </p>
     */
    private String deviceConnectionStatus;
    /**
     * <p>
     * The device's ID.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The most recent beta software release.
     * </p>
     */
    private String latestAlternateSoftware;
    /**
     * <p>
     * A device's latest job. Includes the target image version, and the job status.
     * </p>
     */
    private LatestDeviceJob latestDeviceJob;
    /**
     * <p>
     * The latest software version available for the device.
     * </p>
     */
    private String latestSoftware;
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
     * The device's networking configuration.
     * </p>
     */
    private NetworkPayload networkingConfiguration;
    /**
     * <p>
     * The device's provisioning status.
     * </p>
     */
    private String provisioningStatus;
    /**
     * <p>
     * The device's serial number.
     * </p>
     */
    private String serialNumber;
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
     * Beta software releases available for the device.
     * </p>
     * 
     * @return Beta software releases available for the device.
     */

    public java.util.List<AlternateSoftwareMetadata> getAlternateSoftwares() {
        return alternateSoftwares;
    }

    /**
     * <p>
     * Beta software releases available for the device.
     * </p>
     * 
     * @param alternateSoftwares
     *        Beta software releases available for the device.
     */

    public void setAlternateSoftwares(java.util.Collection<AlternateSoftwareMetadata> alternateSoftwares) {
        if (alternateSoftwares == null) {
            this.alternateSoftwares = null;
            return;
        }

        this.alternateSoftwares = new java.util.ArrayList<AlternateSoftwareMetadata>(alternateSoftwares);
    }

    /**
     * <p>
     * Beta software releases available for the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlternateSoftwares(java.util.Collection)} or {@link #withAlternateSoftwares(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param alternateSoftwares
     *        Beta software releases available for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withAlternateSoftwares(AlternateSoftwareMetadata... alternateSoftwares) {
        if (this.alternateSoftwares == null) {
            setAlternateSoftwares(new java.util.ArrayList<AlternateSoftwareMetadata>(alternateSoftwares.length));
        }
        for (AlternateSoftwareMetadata ele : alternateSoftwares) {
            this.alternateSoftwares.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Beta software releases available for the device.
     * </p>
     * 
     * @param alternateSoftwares
     *        Beta software releases available for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withAlternateSoftwares(java.util.Collection<AlternateSoftwareMetadata> alternateSoftwares) {
        setAlternateSoftwares(alternateSoftwares);
        return this;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @param arn
     *        The device's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @return The device's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @param arn
     *        The device's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public DescribeDeviceResult withBrand(String brand) {
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

    public DescribeDeviceResult withBrand(DeviceBrand brand) {
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

    public DescribeDeviceResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The device's networking status.
     * </p>
     * 
     * @param currentNetworkingStatus
     *        The device's networking status.
     */

    public void setCurrentNetworkingStatus(NetworkStatus currentNetworkingStatus) {
        this.currentNetworkingStatus = currentNetworkingStatus;
    }

    /**
     * <p>
     * The device's networking status.
     * </p>
     * 
     * @return The device's networking status.
     */

    public NetworkStatus getCurrentNetworkingStatus() {
        return this.currentNetworkingStatus;
    }

    /**
     * <p>
     * The device's networking status.
     * </p>
     * 
     * @param currentNetworkingStatus
     *        The device's networking status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withCurrentNetworkingStatus(NetworkStatus currentNetworkingStatus) {
        setCurrentNetworkingStatus(currentNetworkingStatus);
        return this;
    }

    /**
     * <p>
     * The device's current software version.
     * </p>
     * 
     * @param currentSoftware
     *        The device's current software version.
     */

    public void setCurrentSoftware(String currentSoftware) {
        this.currentSoftware = currentSoftware;
    }

    /**
     * <p>
     * The device's current software version.
     * </p>
     * 
     * @return The device's current software version.
     */

    public String getCurrentSoftware() {
        return this.currentSoftware;
    }

    /**
     * <p>
     * The device's current software version.
     * </p>
     * 
     * @param currentSoftware
     *        The device's current software version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withCurrentSoftware(String currentSoftware) {
        setCurrentSoftware(currentSoftware);
        return this;
    }

    /**
     * <p>
     * The device's description.
     * </p>
     * 
     * @param description
     *        The device's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The device's description.
     * </p>
     * 
     * @return The device's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The device's description.
     * </p>
     * 
     * @param description
     *        The device's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withDescription(String description) {
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

    public DescribeDeviceResult withDeviceAggregatedStatus(String deviceAggregatedStatus) {
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

    public DescribeDeviceResult withDeviceAggregatedStatus(DeviceAggregatedStatus deviceAggregatedStatus) {
        this.deviceAggregatedStatus = deviceAggregatedStatus.toString();
        return this;
    }

    /**
     * <p>
     * The device's connection status.
     * </p>
     * 
     * @param deviceConnectionStatus
     *        The device's connection status.
     * @see DeviceConnectionStatus
     */

    public void setDeviceConnectionStatus(String deviceConnectionStatus) {
        this.deviceConnectionStatus = deviceConnectionStatus;
    }

    /**
     * <p>
     * The device's connection status.
     * </p>
     * 
     * @return The device's connection status.
     * @see DeviceConnectionStatus
     */

    public String getDeviceConnectionStatus() {
        return this.deviceConnectionStatus;
    }

    /**
     * <p>
     * The device's connection status.
     * </p>
     * 
     * @param deviceConnectionStatus
     *        The device's connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceConnectionStatus
     */

    public DescribeDeviceResult withDeviceConnectionStatus(String deviceConnectionStatus) {
        setDeviceConnectionStatus(deviceConnectionStatus);
        return this;
    }

    /**
     * <p>
     * The device's connection status.
     * </p>
     * 
     * @param deviceConnectionStatus
     *        The device's connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceConnectionStatus
     */

    public DescribeDeviceResult withDeviceConnectionStatus(DeviceConnectionStatus deviceConnectionStatus) {
        this.deviceConnectionStatus = deviceConnectionStatus.toString();
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

    public DescribeDeviceResult withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The most recent beta software release.
     * </p>
     * 
     * @param latestAlternateSoftware
     *        The most recent beta software release.
     */

    public void setLatestAlternateSoftware(String latestAlternateSoftware) {
        this.latestAlternateSoftware = latestAlternateSoftware;
    }

    /**
     * <p>
     * The most recent beta software release.
     * </p>
     * 
     * @return The most recent beta software release.
     */

    public String getLatestAlternateSoftware() {
        return this.latestAlternateSoftware;
    }

    /**
     * <p>
     * The most recent beta software release.
     * </p>
     * 
     * @param latestAlternateSoftware
     *        The most recent beta software release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withLatestAlternateSoftware(String latestAlternateSoftware) {
        setLatestAlternateSoftware(latestAlternateSoftware);
        return this;
    }

    /**
     * <p>
     * A device's latest job. Includes the target image version, and the job status.
     * </p>
     * 
     * @param latestDeviceJob
     *        A device's latest job. Includes the target image version, and the job status.
     */

    public void setLatestDeviceJob(LatestDeviceJob latestDeviceJob) {
        this.latestDeviceJob = latestDeviceJob;
    }

    /**
     * <p>
     * A device's latest job. Includes the target image version, and the job status.
     * </p>
     * 
     * @return A device's latest job. Includes the target image version, and the job status.
     */

    public LatestDeviceJob getLatestDeviceJob() {
        return this.latestDeviceJob;
    }

    /**
     * <p>
     * A device's latest job. Includes the target image version, and the job status.
     * </p>
     * 
     * @param latestDeviceJob
     *        A device's latest job. Includes the target image version, and the job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withLatestDeviceJob(LatestDeviceJob latestDeviceJob) {
        setLatestDeviceJob(latestDeviceJob);
        return this;
    }

    /**
     * <p>
     * The latest software version available for the device.
     * </p>
     * 
     * @param latestSoftware
     *        The latest software version available for the device.
     */

    public void setLatestSoftware(String latestSoftware) {
        this.latestSoftware = latestSoftware;
    }

    /**
     * <p>
     * The latest software version available for the device.
     * </p>
     * 
     * @return The latest software version available for the device.
     */

    public String getLatestSoftware() {
        return this.latestSoftware;
    }

    /**
     * <p>
     * The latest software version available for the device.
     * </p>
     * 
     * @param latestSoftware
     *        The latest software version available for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withLatestSoftware(String latestSoftware) {
        setLatestSoftware(latestSoftware);
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

    public DescribeDeviceResult withLeaseExpirationTime(java.util.Date leaseExpirationTime) {
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

    public DescribeDeviceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The device's networking configuration.
     * </p>
     * 
     * @param networkingConfiguration
     *        The device's networking configuration.
     */

    public void setNetworkingConfiguration(NetworkPayload networkingConfiguration) {
        this.networkingConfiguration = networkingConfiguration;
    }

    /**
     * <p>
     * The device's networking configuration.
     * </p>
     * 
     * @return The device's networking configuration.
     */

    public NetworkPayload getNetworkingConfiguration() {
        return this.networkingConfiguration;
    }

    /**
     * <p>
     * The device's networking configuration.
     * </p>
     * 
     * @param networkingConfiguration
     *        The device's networking configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withNetworkingConfiguration(NetworkPayload networkingConfiguration) {
        setNetworkingConfiguration(networkingConfiguration);
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

    public DescribeDeviceResult withProvisioningStatus(String provisioningStatus) {
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

    public DescribeDeviceResult withProvisioningStatus(DeviceStatus provisioningStatus) {
        this.provisioningStatus = provisioningStatus.toString();
        return this;
    }

    /**
     * <p>
     * The device's serial number.
     * </p>
     * 
     * @param serialNumber
     *        The device's serial number.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The device's serial number.
     * </p>
     * 
     * @return The device's serial number.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The device's serial number.
     * </p>
     * 
     * @param serialNumber
     *        The device's serial number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
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

    public DescribeDeviceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeDeviceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult addTagsEntry(String key, String value) {
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

    public DescribeDeviceResult clearTagsEntries() {
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

    public DescribeDeviceResult withType(String type) {
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

    public DescribeDeviceResult withType(DeviceType type) {
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
        if (getAlternateSoftwares() != null)
            sb.append("AlternateSoftwares: ").append(getAlternateSoftwares()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBrand() != null)
            sb.append("Brand: ").append(getBrand()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getCurrentNetworkingStatus() != null)
            sb.append("CurrentNetworkingStatus: ").append(getCurrentNetworkingStatus()).append(",");
        if (getCurrentSoftware() != null)
            sb.append("CurrentSoftware: ").append(getCurrentSoftware()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeviceAggregatedStatus() != null)
            sb.append("DeviceAggregatedStatus: ").append(getDeviceAggregatedStatus()).append(",");
        if (getDeviceConnectionStatus() != null)
            sb.append("DeviceConnectionStatus: ").append(getDeviceConnectionStatus()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getLatestAlternateSoftware() != null)
            sb.append("LatestAlternateSoftware: ").append(getLatestAlternateSoftware()).append(",");
        if (getLatestDeviceJob() != null)
            sb.append("LatestDeviceJob: ").append(getLatestDeviceJob()).append(",");
        if (getLatestSoftware() != null)
            sb.append("LatestSoftware: ").append(getLatestSoftware()).append(",");
        if (getLeaseExpirationTime() != null)
            sb.append("LeaseExpirationTime: ").append(getLeaseExpirationTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkingConfiguration() != null)
            sb.append("NetworkingConfiguration: ").append(getNetworkingConfiguration()).append(",");
        if (getProvisioningStatus() != null)
            sb.append("ProvisioningStatus: ").append(getProvisioningStatus()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
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

        if (obj instanceof DescribeDeviceResult == false)
            return false;
        DescribeDeviceResult other = (DescribeDeviceResult) obj;
        if (other.getAlternateSoftwares() == null ^ this.getAlternateSoftwares() == null)
            return false;
        if (other.getAlternateSoftwares() != null && other.getAlternateSoftwares().equals(this.getAlternateSoftwares()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBrand() == null ^ this.getBrand() == null)
            return false;
        if (other.getBrand() != null && other.getBrand().equals(this.getBrand()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getCurrentNetworkingStatus() == null ^ this.getCurrentNetworkingStatus() == null)
            return false;
        if (other.getCurrentNetworkingStatus() != null && other.getCurrentNetworkingStatus().equals(this.getCurrentNetworkingStatus()) == false)
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
        if (other.getDeviceConnectionStatus() == null ^ this.getDeviceConnectionStatus() == null)
            return false;
        if (other.getDeviceConnectionStatus() != null && other.getDeviceConnectionStatus().equals(this.getDeviceConnectionStatus()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getLatestAlternateSoftware() == null ^ this.getLatestAlternateSoftware() == null)
            return false;
        if (other.getLatestAlternateSoftware() != null && other.getLatestAlternateSoftware().equals(this.getLatestAlternateSoftware()) == false)
            return false;
        if (other.getLatestDeviceJob() == null ^ this.getLatestDeviceJob() == null)
            return false;
        if (other.getLatestDeviceJob() != null && other.getLatestDeviceJob().equals(this.getLatestDeviceJob()) == false)
            return false;
        if (other.getLatestSoftware() == null ^ this.getLatestSoftware() == null)
            return false;
        if (other.getLatestSoftware() != null && other.getLatestSoftware().equals(this.getLatestSoftware()) == false)
            return false;
        if (other.getLeaseExpirationTime() == null ^ this.getLeaseExpirationTime() == null)
            return false;
        if (other.getLeaseExpirationTime() != null && other.getLeaseExpirationTime().equals(this.getLeaseExpirationTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkingConfiguration() == null ^ this.getNetworkingConfiguration() == null)
            return false;
        if (other.getNetworkingConfiguration() != null && other.getNetworkingConfiguration().equals(this.getNetworkingConfiguration()) == false)
            return false;
        if (other.getProvisioningStatus() == null ^ this.getProvisioningStatus() == null)
            return false;
        if (other.getProvisioningStatus() != null && other.getProvisioningStatus().equals(this.getProvisioningStatus()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
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

        hashCode = prime * hashCode + ((getAlternateSoftwares() == null) ? 0 : getAlternateSoftwares().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBrand() == null) ? 0 : getBrand().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentNetworkingStatus() == null) ? 0 : getCurrentNetworkingStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentSoftware() == null) ? 0 : getCurrentSoftware().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeviceAggregatedStatus() == null) ? 0 : getDeviceAggregatedStatus().hashCode());
        hashCode = prime * hashCode + ((getDeviceConnectionStatus() == null) ? 0 : getDeviceConnectionStatus().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getLatestAlternateSoftware() == null) ? 0 : getLatestAlternateSoftware().hashCode());
        hashCode = prime * hashCode + ((getLatestDeviceJob() == null) ? 0 : getLatestDeviceJob().hashCode());
        hashCode = prime * hashCode + ((getLatestSoftware() == null) ? 0 : getLatestSoftware().hashCode());
        hashCode = prime * hashCode + ((getLeaseExpirationTime() == null) ? 0 : getLeaseExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkingConfiguration() == null) ? 0 : getNetworkingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProvisioningStatus() == null) ? 0 : getProvisioningStatus().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceResult clone() {
        try {
            return (DescribeDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

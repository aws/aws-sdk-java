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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the job used when ordering the device.
     * </p>
     */
    private String associatedWithJob;
    /**
     * <p>
     * The hardware specifications of the device.
     * </p>
     */
    private java.util.List<Capacity> deviceCapacities;
    /**
     * <p>
     * The current state of the device.
     * </p>
     */
    private String deviceState;
    /**
     * <p>
     * The type of Amazon Web Services Snow Family device.
     * </p>
     */
    private String deviceType;
    /**
     * <p>
     * When the device last contacted the Amazon Web Services Cloud. Indicates that the device is online.
     * </p>
     */
    private java.util.Date lastReachedOutAt;
    /**
     * <p>
     * When the device last pushed an update to the Amazon Web Services Cloud. Indicates when the device cache was
     * refreshed.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     */
    private String managedDeviceArn;
    /**
     * <p>
     * The ID of the device that you checked the information for.
     * </p>
     */
    private String managedDeviceId;
    /**
     * <p>
     * The network interfaces available on the device.
     * </p>
     */
    private java.util.List<PhysicalNetworkInterface> physicalNetworkInterfaces;
    /**
     * <p>
     * The software installed on the device.
     * </p>
     */
    private SoftwareInformation software;
    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the job used when ordering the device.
     * </p>
     * 
     * @param associatedWithJob
     *        The ID of the job used when ordering the device.
     */

    public void setAssociatedWithJob(String associatedWithJob) {
        this.associatedWithJob = associatedWithJob;
    }

    /**
     * <p>
     * The ID of the job used when ordering the device.
     * </p>
     * 
     * @return The ID of the job used when ordering the device.
     */

    public String getAssociatedWithJob() {
        return this.associatedWithJob;
    }

    /**
     * <p>
     * The ID of the job used when ordering the device.
     * </p>
     * 
     * @param associatedWithJob
     *        The ID of the job used when ordering the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withAssociatedWithJob(String associatedWithJob) {
        setAssociatedWithJob(associatedWithJob);
        return this;
    }

    /**
     * <p>
     * The hardware specifications of the device.
     * </p>
     * 
     * @return The hardware specifications of the device.
     */

    public java.util.List<Capacity> getDeviceCapacities() {
        return deviceCapacities;
    }

    /**
     * <p>
     * The hardware specifications of the device.
     * </p>
     * 
     * @param deviceCapacities
     *        The hardware specifications of the device.
     */

    public void setDeviceCapacities(java.util.Collection<Capacity> deviceCapacities) {
        if (deviceCapacities == null) {
            this.deviceCapacities = null;
            return;
        }

        this.deviceCapacities = new java.util.ArrayList<Capacity>(deviceCapacities);
    }

    /**
     * <p>
     * The hardware specifications of the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceCapacities(java.util.Collection)} or {@link #withDeviceCapacities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deviceCapacities
     *        The hardware specifications of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withDeviceCapacities(Capacity... deviceCapacities) {
        if (this.deviceCapacities == null) {
            setDeviceCapacities(new java.util.ArrayList<Capacity>(deviceCapacities.length));
        }
        for (Capacity ele : deviceCapacities) {
            this.deviceCapacities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The hardware specifications of the device.
     * </p>
     * 
     * @param deviceCapacities
     *        The hardware specifications of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withDeviceCapacities(java.util.Collection<Capacity> deviceCapacities) {
        setDeviceCapacities(deviceCapacities);
        return this;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * 
     * @param deviceState
     *        The current state of the device.
     * @see UnlockState
     */

    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * 
     * @return The current state of the device.
     * @see UnlockState
     */

    public String getDeviceState() {
        return this.deviceState;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * 
     * @param deviceState
     *        The current state of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnlockState
     */

    public DescribeDeviceResult withDeviceState(String deviceState) {
        setDeviceState(deviceState);
        return this;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * 
     * @param deviceState
     *        The current state of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnlockState
     */

    public DescribeDeviceResult withDeviceState(UnlockState deviceState) {
        this.deviceState = deviceState.toString();
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services Snow Family device.
     * </p>
     * 
     * @param deviceType
     *        The type of Amazon Web Services Snow Family device.
     */

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services Snow Family device.
     * </p>
     * 
     * @return The type of Amazon Web Services Snow Family device.
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services Snow Family device.
     * </p>
     * 
     * @param deviceType
     *        The type of Amazon Web Services Snow Family device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withDeviceType(String deviceType) {
        setDeviceType(deviceType);
        return this;
    }

    /**
     * <p>
     * When the device last contacted the Amazon Web Services Cloud. Indicates that the device is online.
     * </p>
     * 
     * @param lastReachedOutAt
     *        When the device last contacted the Amazon Web Services Cloud. Indicates that the device is online.
     */

    public void setLastReachedOutAt(java.util.Date lastReachedOutAt) {
        this.lastReachedOutAt = lastReachedOutAt;
    }

    /**
     * <p>
     * When the device last contacted the Amazon Web Services Cloud. Indicates that the device is online.
     * </p>
     * 
     * @return When the device last contacted the Amazon Web Services Cloud. Indicates that the device is online.
     */

    public java.util.Date getLastReachedOutAt() {
        return this.lastReachedOutAt;
    }

    /**
     * <p>
     * When the device last contacted the Amazon Web Services Cloud. Indicates that the device is online.
     * </p>
     * 
     * @param lastReachedOutAt
     *        When the device last contacted the Amazon Web Services Cloud. Indicates that the device is online.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withLastReachedOutAt(java.util.Date lastReachedOutAt) {
        setLastReachedOutAt(lastReachedOutAt);
        return this;
    }

    /**
     * <p>
     * When the device last pushed an update to the Amazon Web Services Cloud. Indicates when the device cache was
     * refreshed.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the device last pushed an update to the Amazon Web Services Cloud. Indicates when the device cache
     *        was refreshed.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * When the device last pushed an update to the Amazon Web Services Cloud. Indicates when the device cache was
     * refreshed.
     * </p>
     * 
     * @return When the device last pushed an update to the Amazon Web Services Cloud. Indicates when the device cache
     *         was refreshed.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * When the device last pushed an update to the Amazon Web Services Cloud. Indicates when the device cache was
     * refreshed.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the device last pushed an update to the Amazon Web Services Cloud. Indicates when the device cache
     *        was refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param managedDeviceArn
     *        The Amazon Resource Name (ARN) of the device.
     */

    public void setManagedDeviceArn(String managedDeviceArn) {
        this.managedDeviceArn = managedDeviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device.
     */

    public String getManagedDeviceArn() {
        return this.managedDeviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param managedDeviceArn
     *        The Amazon Resource Name (ARN) of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withManagedDeviceArn(String managedDeviceArn) {
        setManagedDeviceArn(managedDeviceArn);
        return this;
    }

    /**
     * <p>
     * The ID of the device that you checked the information for.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the device that you checked the information for.
     */

    public void setManagedDeviceId(String managedDeviceId) {
        this.managedDeviceId = managedDeviceId;
    }

    /**
     * <p>
     * The ID of the device that you checked the information for.
     * </p>
     * 
     * @return The ID of the device that you checked the information for.
     */

    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }

    /**
     * <p>
     * The ID of the device that you checked the information for.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the device that you checked the information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withManagedDeviceId(String managedDeviceId) {
        setManagedDeviceId(managedDeviceId);
        return this;
    }

    /**
     * <p>
     * The network interfaces available on the device.
     * </p>
     * 
     * @return The network interfaces available on the device.
     */

    public java.util.List<PhysicalNetworkInterface> getPhysicalNetworkInterfaces() {
        return physicalNetworkInterfaces;
    }

    /**
     * <p>
     * The network interfaces available on the device.
     * </p>
     * 
     * @param physicalNetworkInterfaces
     *        The network interfaces available on the device.
     */

    public void setPhysicalNetworkInterfaces(java.util.Collection<PhysicalNetworkInterface> physicalNetworkInterfaces) {
        if (physicalNetworkInterfaces == null) {
            this.physicalNetworkInterfaces = null;
            return;
        }

        this.physicalNetworkInterfaces = new java.util.ArrayList<PhysicalNetworkInterface>(physicalNetworkInterfaces);
    }

    /**
     * <p>
     * The network interfaces available on the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhysicalNetworkInterfaces(java.util.Collection)} or
     * {@link #withPhysicalNetworkInterfaces(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param physicalNetworkInterfaces
     *        The network interfaces available on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withPhysicalNetworkInterfaces(PhysicalNetworkInterface... physicalNetworkInterfaces) {
        if (this.physicalNetworkInterfaces == null) {
            setPhysicalNetworkInterfaces(new java.util.ArrayList<PhysicalNetworkInterface>(physicalNetworkInterfaces.length));
        }
        for (PhysicalNetworkInterface ele : physicalNetworkInterfaces) {
            this.physicalNetworkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network interfaces available on the device.
     * </p>
     * 
     * @param physicalNetworkInterfaces
     *        The network interfaces available on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withPhysicalNetworkInterfaces(java.util.Collection<PhysicalNetworkInterface> physicalNetworkInterfaces) {
        setPhysicalNetworkInterfaces(physicalNetworkInterfaces);
        return this;
    }

    /**
     * <p>
     * The software installed on the device.
     * </p>
     * 
     * @param software
     *        The software installed on the device.
     */

    public void setSoftware(SoftwareInformation software) {
        this.software = software;
    }

    /**
     * <p>
     * The software installed on the device.
     * </p>
     * 
     * @return The software installed on the device.
     */

    public SoftwareInformation getSoftware() {
        return this.software;
    }

    /**
     * <p>
     * The software installed on the device.
     * </p>
     * 
     * @param software
     *        The software installed on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withSoftware(SoftwareInformation software) {
        setSoftware(software);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @return Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *         ways, such as by purpose, owner, or environment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *        ways, such as by purpose, owner, or environment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *        ways, such as by purpose, owner, or environment.
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
        if (getAssociatedWithJob() != null)
            sb.append("AssociatedWithJob: ").append(getAssociatedWithJob()).append(",");
        if (getDeviceCapacities() != null)
            sb.append("DeviceCapacities: ").append(getDeviceCapacities()).append(",");
        if (getDeviceState() != null)
            sb.append("DeviceState: ").append(getDeviceState()).append(",");
        if (getDeviceType() != null)
            sb.append("DeviceType: ").append(getDeviceType()).append(",");
        if (getLastReachedOutAt() != null)
            sb.append("LastReachedOutAt: ").append(getLastReachedOutAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getManagedDeviceArn() != null)
            sb.append("ManagedDeviceArn: ").append(getManagedDeviceArn()).append(",");
        if (getManagedDeviceId() != null)
            sb.append("ManagedDeviceId: ").append(getManagedDeviceId()).append(",");
        if (getPhysicalNetworkInterfaces() != null)
            sb.append("PhysicalNetworkInterfaces: ").append(getPhysicalNetworkInterfaces()).append(",");
        if (getSoftware() != null)
            sb.append("Software: ").append(getSoftware()).append(",");
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

        if (obj instanceof DescribeDeviceResult == false)
            return false;
        DescribeDeviceResult other = (DescribeDeviceResult) obj;
        if (other.getAssociatedWithJob() == null ^ this.getAssociatedWithJob() == null)
            return false;
        if (other.getAssociatedWithJob() != null && other.getAssociatedWithJob().equals(this.getAssociatedWithJob()) == false)
            return false;
        if (other.getDeviceCapacities() == null ^ this.getDeviceCapacities() == null)
            return false;
        if (other.getDeviceCapacities() != null && other.getDeviceCapacities().equals(this.getDeviceCapacities()) == false)
            return false;
        if (other.getDeviceState() == null ^ this.getDeviceState() == null)
            return false;
        if (other.getDeviceState() != null && other.getDeviceState().equals(this.getDeviceState()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getLastReachedOutAt() == null ^ this.getLastReachedOutAt() == null)
            return false;
        if (other.getLastReachedOutAt() != null && other.getLastReachedOutAt().equals(this.getLastReachedOutAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getManagedDeviceArn() == null ^ this.getManagedDeviceArn() == null)
            return false;
        if (other.getManagedDeviceArn() != null && other.getManagedDeviceArn().equals(this.getManagedDeviceArn()) == false)
            return false;
        if (other.getManagedDeviceId() == null ^ this.getManagedDeviceId() == null)
            return false;
        if (other.getManagedDeviceId() != null && other.getManagedDeviceId().equals(this.getManagedDeviceId()) == false)
            return false;
        if (other.getPhysicalNetworkInterfaces() == null ^ this.getPhysicalNetworkInterfaces() == null)
            return false;
        if (other.getPhysicalNetworkInterfaces() != null && other.getPhysicalNetworkInterfaces().equals(this.getPhysicalNetworkInterfaces()) == false)
            return false;
        if (other.getSoftware() == null ^ this.getSoftware() == null)
            return false;
        if (other.getSoftware() != null && other.getSoftware().equals(this.getSoftware()) == false)
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

        hashCode = prime * hashCode + ((getAssociatedWithJob() == null) ? 0 : getAssociatedWithJob().hashCode());
        hashCode = prime * hashCode + ((getDeviceCapacities() == null) ? 0 : getDeviceCapacities().hashCode());
        hashCode = prime * hashCode + ((getDeviceState() == null) ? 0 : getDeviceState().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getLastReachedOutAt() == null) ? 0 : getLastReachedOutAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getManagedDeviceArn() == null) ? 0 : getManagedDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getManagedDeviceId() == null) ? 0 : getManagedDeviceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalNetworkInterfaces() == null) ? 0 : getPhysicalNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getSoftware() == null) ? 0 : getSoftware().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

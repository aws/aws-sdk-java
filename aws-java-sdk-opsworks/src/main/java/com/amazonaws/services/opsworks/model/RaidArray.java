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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an instance's RAID array.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RaidArray" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RaidArray implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The array ID.
     * </p>
     */
    private String raidArrayId;
    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The array name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * </p>
     */
    private Integer raidLevel;
    /**
     * <p>
     * The number of disks in the array.
     * </p>
     */
    private Integer numberOfDisks;
    /**
     * <p>
     * The array's size.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The array's Linux device. For example /dev/mdadm0.
     * </p>
     */
    private String device;
    /**
     * <p>
     * The array's mount point.
     * </p>
     */
    private String mountPoint;
    /**
     * <p>
     * The array's Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * When the RAID array was created.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The volume type, standard or PIOPS.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * For PIOPS volumes, the IOPS per disk.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The array ID.
     * </p>
     * 
     * @param raidArrayId
     *        The array ID.
     */

    public void setRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
    }

    /**
     * <p>
     * The array ID.
     * </p>
     * 
     * @return The array ID.
     */

    public String getRaidArrayId() {
        return this.raidArrayId;
    }

    /**
     * <p>
     * The array ID.
     * </p>
     * 
     * @param raidArrayId
     *        The array ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withRaidArrayId(String raidArrayId) {
        setRaidArrayId(raidArrayId);
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The array name.
     * </p>
     * 
     * @param name
     *        The array name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The array name.
     * </p>
     * 
     * @return The array name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The array name.
     * </p>
     * 
     * @param name
     *        The array name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * </p>
     * 
     * @param raidLevel
     *        The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     */

    public void setRaidLevel(Integer raidLevel) {
        this.raidLevel = raidLevel;
    }

    /**
     * <p>
     * The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * </p>
     * 
     * @return The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     */

    public Integer getRaidLevel() {
        return this.raidLevel;
    }

    /**
     * <p>
     * The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * </p>
     * 
     * @param raidLevel
     *        The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withRaidLevel(Integer raidLevel) {
        setRaidLevel(raidLevel);
        return this;
    }

    /**
     * <p>
     * The number of disks in the array.
     * </p>
     * 
     * @param numberOfDisks
     *        The number of disks in the array.
     */

    public void setNumberOfDisks(Integer numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }

    /**
     * <p>
     * The number of disks in the array.
     * </p>
     * 
     * @return The number of disks in the array.
     */

    public Integer getNumberOfDisks() {
        return this.numberOfDisks;
    }

    /**
     * <p>
     * The number of disks in the array.
     * </p>
     * 
     * @param numberOfDisks
     *        The number of disks in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withNumberOfDisks(Integer numberOfDisks) {
        setNumberOfDisks(numberOfDisks);
        return this;
    }

    /**
     * <p>
     * The array's size.
     * </p>
     * 
     * @param size
     *        The array's size.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The array's size.
     * </p>
     * 
     * @return The array's size.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The array's size.
     * </p>
     * 
     * @param size
     *        The array's size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The array's Linux device. For example /dev/mdadm0.
     * </p>
     * 
     * @param device
     *        The array's Linux device. For example /dev/mdadm0.
     */

    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The array's Linux device. For example /dev/mdadm0.
     * </p>
     * 
     * @return The array's Linux device. For example /dev/mdadm0.
     */

    public String getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The array's Linux device. For example /dev/mdadm0.
     * </p>
     * 
     * @param device
     *        The array's Linux device. For example /dev/mdadm0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withDevice(String device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * The array's mount point.
     * </p>
     * 
     * @param mountPoint
     *        The array's mount point.
     */

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    /**
     * <p>
     * The array's mount point.
     * </p>
     * 
     * @return The array's mount point.
     */

    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * <p>
     * The array's mount point.
     * </p>
     * 
     * @param mountPoint
     *        The array's mount point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withMountPoint(String mountPoint) {
        setMountPoint(mountPoint);
        return this;
    }

    /**
     * <p>
     * The array's Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The array's Availability Zone. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The array's Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @return The array's Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The array's Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The array's Availability Zone. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * When the RAID array was created.
     * </p>
     * 
     * @param createdAt
     *        When the RAID array was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * When the RAID array was created.
     * </p>
     * 
     * @return When the RAID array was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * When the RAID array was created.
     * </p>
     * 
     * @param createdAt
     *        When the RAID array was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The volume type, standard or PIOPS.
     * </p>
     * 
     * @param volumeType
     *        The volume type, standard or PIOPS.
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type, standard or PIOPS.
     * </p>
     * 
     * @return The volume type, standard or PIOPS.
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type, standard or PIOPS.
     * </p>
     * 
     * @param volumeType
     *        The volume type, standard or PIOPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * For PIOPS volumes, the IOPS per disk.
     * </p>
     * 
     * @param iops
     *        For PIOPS volumes, the IOPS per disk.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * For PIOPS volumes, the IOPS per disk.
     * </p>
     * 
     * @return For PIOPS volumes, the IOPS per disk.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * For PIOPS volumes, the IOPS per disk.
     * </p>
     * 
     * @param iops
     *        For PIOPS volumes, the IOPS per disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RaidArray withIops(Integer iops) {
        setIops(iops);
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
        if (getRaidArrayId() != null)
            sb.append("RaidArrayId: ").append(getRaidArrayId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRaidLevel() != null)
            sb.append("RaidLevel: ").append(getRaidLevel()).append(",");
        if (getNumberOfDisks() != null)
            sb.append("NumberOfDisks: ").append(getNumberOfDisks()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getMountPoint() != null)
            sb.append("MountPoint: ").append(getMountPoint()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RaidArray == false)
            return false;
        RaidArray other = (RaidArray) obj;
        if (other.getRaidArrayId() == null ^ this.getRaidArrayId() == null)
            return false;
        if (other.getRaidArrayId() != null && other.getRaidArrayId().equals(this.getRaidArrayId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRaidLevel() == null ^ this.getRaidLevel() == null)
            return false;
        if (other.getRaidLevel() != null && other.getRaidLevel().equals(this.getRaidLevel()) == false)
            return false;
        if (other.getNumberOfDisks() == null ^ this.getNumberOfDisks() == null)
            return false;
        if (other.getNumberOfDisks() != null && other.getNumberOfDisks().equals(this.getNumberOfDisks()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getMountPoint() == null ^ this.getMountPoint() == null)
            return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRaidArrayId() == null) ? 0 : getRaidArrayId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRaidLevel() == null) ? 0 : getRaidLevel().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDisks() == null) ? 0 : getNumberOfDisks().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        return hashCode;
    }

    @Override
    public RaidArray clone() {
        try {
            return (RaidArray) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.RaidArrayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

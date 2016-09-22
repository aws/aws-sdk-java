/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes an Amazon EBS volume configuration.
 * </p>
 */
public class VolumeConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The volume mount point. For example "/dev/sdh".
     * </p>
     */
    private String mountPoint;
    /**
     * <p>
     * The volume <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * </p>
     */
    private Integer raidLevel;
    /**
     * <p>
     * The number of disks in the volume.
     * </p>
     */
    private Integer numberOfDisks;
    /**
     * <p>
     * The volume size.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>standard</code> - Magnetic
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> - Provisioned IOPS (SSD)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp2</code> - General Purpose (SSD)
     * </p>
     * </li>
     * </ul>
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
     * The volume mount point. For example "/dev/sdh".
     * </p>
     * 
     * @param mountPoint
     *        The volume mount point. For example "/dev/sdh".
     */

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    /**
     * <p>
     * The volume mount point. For example "/dev/sdh".
     * </p>
     * 
     * @return The volume mount point. For example "/dev/sdh".
     */

    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * <p>
     * The volume mount point. For example "/dev/sdh".
     * </p>
     * 
     * @param mountPoint
     *        The volume mount point. For example "/dev/sdh".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withMountPoint(String mountPoint) {
        setMountPoint(mountPoint);
        return this;
    }

    /**
     * <p>
     * The volume <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * </p>
     * 
     * @param raidLevel
     *        The volume <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     */

    public void setRaidLevel(Integer raidLevel) {
        this.raidLevel = raidLevel;
    }

    /**
     * <p>
     * The volume <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * </p>
     * 
     * @return The volume <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     */

    public Integer getRaidLevel() {
        return this.raidLevel;
    }

    /**
     * <p>
     * The volume <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * </p>
     * 
     * @param raidLevel
     *        The volume <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID level</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withRaidLevel(Integer raidLevel) {
        setRaidLevel(raidLevel);
        return this;
    }

    /**
     * <p>
     * The number of disks in the volume.
     * </p>
     * 
     * @param numberOfDisks
     *        The number of disks in the volume.
     */

    public void setNumberOfDisks(Integer numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }

    /**
     * <p>
     * The number of disks in the volume.
     * </p>
     * 
     * @return The number of disks in the volume.
     */

    public Integer getNumberOfDisks() {
        return this.numberOfDisks;
    }

    /**
     * <p>
     * The number of disks in the volume.
     * </p>
     * 
     * @param numberOfDisks
     *        The number of disks in the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withNumberOfDisks(Integer numberOfDisks) {
        setNumberOfDisks(numberOfDisks);
        return this;
    }

    /**
     * <p>
     * The volume size.
     * </p>
     * 
     * @param size
     *        The volume size.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The volume size.
     * </p>
     * 
     * @return The volume size.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The volume size.
     * </p>
     * 
     * @param size
     *        The volume size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>standard</code> - Magnetic
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> - Provisioned IOPS (SSD)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp2</code> - General Purpose (SSD)
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeType
     *        The volume type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>standard</code> - Magnetic
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> - Provisioned IOPS (SSD)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>gp2</code> - General Purpose (SSD)
     *        </p>
     *        </li>
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>standard</code> - Magnetic
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> - Provisioned IOPS (SSD)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp2</code> - General Purpose (SSD)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The volume type:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>standard</code> - Magnetic
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code> - Provisioned IOPS (SSD)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>gp2</code> - General Purpose (SSD)
     *         </p>
     *         </li>
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>standard</code> - Magnetic
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> - Provisioned IOPS (SSD)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp2</code> - General Purpose (SSD)
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeType
     *        The volume type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>standard</code> - Magnetic
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> - Provisioned IOPS (SSD)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>gp2</code> - General Purpose (SSD)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withVolumeType(String volumeType) {
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

    public VolumeConfiguration withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMountPoint() != null)
            sb.append("MountPoint: " + getMountPoint() + ",");
        if (getRaidLevel() != null)
            sb.append("RaidLevel: " + getRaidLevel() + ",");
        if (getNumberOfDisks() != null)
            sb.append("NumberOfDisks: " + getNumberOfDisks() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeConfiguration == false)
            return false;
        VolumeConfiguration other = (VolumeConfiguration) obj;
        if (other.getMountPoint() == null ^ this.getMountPoint() == null)
            return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false)
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

        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode());
        hashCode = prime * hashCode + ((getRaidLevel() == null) ? 0 : getRaidLevel().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDisks() == null) ? 0 : getNumberOfDisks().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        return hashCode;
    }

    @Override
    public VolumeConfiguration clone() {
        try {
            return (VolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an Amazon EBS volume configuration.
 * </p>
 */
public class VolumeConfiguration implements Serializable {

    /**
     * The volume mount point. For example "/dev/sdh".
     */
    private String mountPoint;

    /**
     * The volume <a
     * href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     * level</a>.
     */
    private Integer raidLevel;

    /**
     * The number of disks in the volume.
     */
    private Integer numberOfDisks;

    /**
     * The volume size.
     */
    private Integer size;

    /**
     * The volume mount point. For example "/dev/sdh".
     *
     * @return The volume mount point. For example "/dev/sdh".
     */
    public String getMountPoint() {
        return mountPoint;
    }
    
    /**
     * The volume mount point. For example "/dev/sdh".
     *
     * @param mountPoint The volume mount point. For example "/dev/sdh".
     */
    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }
    
    /**
     * The volume mount point. For example "/dev/sdh".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mountPoint The volume mount point. For example "/dev/sdh".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeConfiguration withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * The volume <a
     * href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     * level</a>.
     *
     * @return The volume <a
     *         href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     *         level</a>.
     */
    public Integer getRaidLevel() {
        return raidLevel;
    }
    
    /**
     * The volume <a
     * href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     * level</a>.
     *
     * @param raidLevel The volume <a
     *         href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     *         level</a>.
     */
    public void setRaidLevel(Integer raidLevel) {
        this.raidLevel = raidLevel;
    }
    
    /**
     * The volume <a
     * href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     * level</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidLevel The volume <a
     *         href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     *         level</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeConfiguration withRaidLevel(Integer raidLevel) {
        this.raidLevel = raidLevel;
        return this;
    }

    /**
     * The number of disks in the volume.
     *
     * @return The number of disks in the volume.
     */
    public Integer getNumberOfDisks() {
        return numberOfDisks;
    }
    
    /**
     * The number of disks in the volume.
     *
     * @param numberOfDisks The number of disks in the volume.
     */
    public void setNumberOfDisks(Integer numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }
    
    /**
     * The number of disks in the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfDisks The number of disks in the volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeConfiguration withNumberOfDisks(Integer numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
        return this;
    }

    /**
     * The volume size.
     *
     * @return The volume size.
     */
    public Integer getSize() {
        return size;
    }
    
    /**
     * The volume size.
     *
     * @param size The volume size.
     */
    public void setSize(Integer size) {
        this.size = size;
    }
    
    /**
     * The volume size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The volume size.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeConfiguration withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMountPoint() != null) sb.append("MountPoint: " + getMountPoint() + ",");
        if (getRaidLevel() != null) sb.append("RaidLevel: " + getRaidLevel() + ",");
        if (getNumberOfDisks() != null) sb.append("NumberOfDisks: " + getNumberOfDisks() + ",");
        if (getSize() != null) sb.append("Size: " + getSize() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode()); 
        hashCode = prime * hashCode + ((getRaidLevel() == null) ? 0 : getRaidLevel().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfDisks() == null) ? 0 : getNumberOfDisks().hashCode()); 
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VolumeConfiguration == false) return false;
        VolumeConfiguration other = (VolumeConfiguration)obj;
        
        if (other.getMountPoint() == null ^ this.getMountPoint() == null) return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false) return false; 
        if (other.getRaidLevel() == null ^ this.getRaidLevel() == null) return false;
        if (other.getRaidLevel() != null && other.getRaidLevel().equals(this.getRaidLevel()) == false) return false; 
        if (other.getNumberOfDisks() == null ^ this.getNumberOfDisks() == null) return false;
        if (other.getNumberOfDisks() != null && other.getNumberOfDisks().equals(this.getNumberOfDisks()) == false) return false; 
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        return true;
    }
    
}
    
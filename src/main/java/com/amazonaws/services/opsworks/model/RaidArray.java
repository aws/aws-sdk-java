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
 * Describes an instance's RAID array.
 * </p>
 */
public class RaidArray implements Serializable {

    /**
     * The array ID.
     */
    private String raidArrayId;

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The array name.
     */
    private String name;

    /**
     * The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     * level</a>.
     */
    private Integer raidLevel;

    /**
     * The number of disks in the array.
     */
    private Integer numberOfDisks;

    /**
     * The array's size.
     */
    private Integer size;

    /**
     * The array's Linux device. For example /dev/mdadm0.
     */
    private String device;

    /**
     * The array's mount point.
     */
    private String mountPoint;

    /**
     * The array's Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String availabilityZone;

    /**
     * When the RAID array was created.
     */
    private String createdAt;

    /**
     * The array ID.
     *
     * @return The array ID.
     */
    public String getRaidArrayId() {
        return raidArrayId;
    }
    
    /**
     * The array ID.
     *
     * @param raidArrayId The array ID.
     */
    public void setRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
    }
    
    /**
     * The array ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrayId The array ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
        return this;
    }

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The array name.
     *
     * @return The array name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The array name.
     *
     * @param name The array name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The array name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The array name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     * level</a>.
     *
     * @return The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     *         level</a>.
     */
    public Integer getRaidLevel() {
        return raidLevel;
    }
    
    /**
     * The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     * level</a>.
     *
     * @param raidLevel The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     *         level</a>.
     */
    public void setRaidLevel(Integer raidLevel) {
        this.raidLevel = raidLevel;
    }
    
    /**
     * The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     * level</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidLevel The <a href="http://en.wikipedia.org/wiki/Standard_RAID_levels">RAID
     *         level</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withRaidLevel(Integer raidLevel) {
        this.raidLevel = raidLevel;
        return this;
    }

    /**
     * The number of disks in the array.
     *
     * @return The number of disks in the array.
     */
    public Integer getNumberOfDisks() {
        return numberOfDisks;
    }
    
    /**
     * The number of disks in the array.
     *
     * @param numberOfDisks The number of disks in the array.
     */
    public void setNumberOfDisks(Integer numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }
    
    /**
     * The number of disks in the array.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfDisks The number of disks in the array.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withNumberOfDisks(Integer numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
        return this;
    }

    /**
     * The array's size.
     *
     * @return The array's size.
     */
    public Integer getSize() {
        return size;
    }
    
    /**
     * The array's size.
     *
     * @param size The array's size.
     */
    public void setSize(Integer size) {
        this.size = size;
    }
    
    /**
     * The array's size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The array's size.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * The array's Linux device. For example /dev/mdadm0.
     *
     * @return The array's Linux device. For example /dev/mdadm0.
     */
    public String getDevice() {
        return device;
    }
    
    /**
     * The array's Linux device. For example /dev/mdadm0.
     *
     * @param device The array's Linux device. For example /dev/mdadm0.
     */
    public void setDevice(String device) {
        this.device = device;
    }
    
    /**
     * The array's Linux device. For example /dev/mdadm0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param device The array's Linux device. For example /dev/mdadm0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * The array's mount point.
     *
     * @return The array's mount point.
     */
    public String getMountPoint() {
        return mountPoint;
    }
    
    /**
     * The array's mount point.
     *
     * @param mountPoint The array's mount point.
     */
    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }
    
    /**
     * The array's mount point.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mountPoint The array's mount point.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * The array's Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The array's Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The array's Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param availabilityZone The array's Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The array's Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The array's Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * When the RAID array was created.
     *
     * @return When the RAID array was created.
     */
    public String getCreatedAt() {
        return createdAt;
    }
    
    /**
     * When the RAID array was created.
     *
     * @param createdAt When the RAID array was created.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * When the RAID array was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt When the RAID array was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RaidArray withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
        if (getRaidArrayId() != null) sb.append("RaidArrayId: " + getRaidArrayId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getRaidLevel() != null) sb.append("RaidLevel: " + getRaidLevel() + ",");
        if (getNumberOfDisks() != null) sb.append("NumberOfDisks: " + getNumberOfDisks() + ",");
        if (getSize() != null) sb.append("Size: " + getSize() + ",");
        if (getDevice() != null) sb.append("Device: " + getDevice() + ",");
        if (getMountPoint() != null) sb.append("MountPoint: " + getMountPoint() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RaidArray == false) return false;
        RaidArray other = (RaidArray)obj;
        
        if (other.getRaidArrayId() == null ^ this.getRaidArrayId() == null) return false;
        if (other.getRaidArrayId() != null && other.getRaidArrayId().equals(this.getRaidArrayId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getRaidLevel() == null ^ this.getRaidLevel() == null) return false;
        if (other.getRaidLevel() != null && other.getRaidLevel().equals(this.getRaidLevel()) == false) return false; 
        if (other.getNumberOfDisks() == null ^ this.getNumberOfDisks() == null) return false;
        if (other.getNumberOfDisks() != null && other.getNumberOfDisks().equals(this.getNumberOfDisks()) == false) return false; 
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        if (other.getDevice() == null ^ this.getDevice() == null) return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false) return false; 
        if (other.getMountPoint() == null ^ this.getMountPoint() == null) return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        return true;
    }
    
}
    
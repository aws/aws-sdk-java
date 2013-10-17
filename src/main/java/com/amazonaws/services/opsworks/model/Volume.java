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
 * Describes an instance's Amazon EBS volume.
 * </p>
 */
public class Volume implements Serializable {

    /**
     * The volume ID.
     */
    private String volumeId;

    /**
     * The Amazon EC2 volume ID.
     */
    private String ec2VolumeId;

    /**
     * The volume name.
     */
    private String name;

    /**
     * The RAID array ID.
     */
    private String raidArrayId;

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The value returned by <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html">DescribeVolumes</a>.
     */
    private String status;

    /**
     * The volume size.
     */
    private Integer size;

    /**
     * The device name.
     */
    private String device;

    /**
     * The volume mount point. For example "/dev/sdh".
     */
    private String mountPoint;

    /**
     * The AWS region. For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String region;

    /**
     * The volume Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String availabilityZone;

    /**
     * The volume ID.
     *
     * @return The volume ID.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The volume ID.
     *
     * @param volumeId The volume ID.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The volume ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The volume ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The Amazon EC2 volume ID.
     *
     * @return The Amazon EC2 volume ID.
     */
    public String getEc2VolumeId() {
        return ec2VolumeId;
    }
    
    /**
     * The Amazon EC2 volume ID.
     *
     * @param ec2VolumeId The Amazon EC2 volume ID.
     */
    public void setEc2VolumeId(String ec2VolumeId) {
        this.ec2VolumeId = ec2VolumeId;
    }
    
    /**
     * The Amazon EC2 volume ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2VolumeId The Amazon EC2 volume ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withEc2VolumeId(String ec2VolumeId) {
        this.ec2VolumeId = ec2VolumeId;
        return this;
    }

    /**
     * The volume name.
     *
     * @return The volume name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The volume name.
     *
     * @param name The volume name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The volume name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The volume name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The RAID array ID.
     *
     * @return The RAID array ID.
     */
    public String getRaidArrayId() {
        return raidArrayId;
    }
    
    /**
     * The RAID array ID.
     *
     * @param raidArrayId The RAID array ID.
     */
    public void setRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
    }
    
    /**
     * The RAID array ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrayId The RAID array ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withRaidArrayId(String raidArrayId) {
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
    public Volume withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The value returned by <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html">DescribeVolumes</a>.
     *
     * @return The value returned by <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html">DescribeVolumes</a>.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The value returned by <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html">DescribeVolumes</a>.
     *
     * @param status The value returned by <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html">DescribeVolumes</a>.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The value returned by <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html">DescribeVolumes</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The value returned by <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html">DescribeVolumes</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withStatus(String status) {
        this.status = status;
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
    public Volume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * The device name.
     *
     * @return The device name.
     */
    public String getDevice() {
        return device;
    }
    
    /**
     * The device name.
     *
     * @param device The device name.
     */
    public void setDevice(String device) {
        this.device = device;
    }
    
    /**
     * The device name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param device The device name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withDevice(String device) {
        this.device = device;
        return this;
    }

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
    public Volume withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * The AWS region. For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The AWS region. For more information about AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The AWS region. For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param region The AWS region. For more information about AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The AWS region. For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The AWS region. For more information about AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * The volume Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The volume Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The volume Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param availabilityZone The volume Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The volume Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The volume Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getEc2VolumeId() != null) sb.append("Ec2VolumeId: " + getEc2VolumeId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getRaidArrayId() != null) sb.append("RaidArrayId: " + getRaidArrayId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getSize() != null) sb.append("Size: " + getSize() + ",");
        if (getDevice() != null) sb.append("Device: " + getDevice() + ",");
        if (getMountPoint() != null) sb.append("MountPoint: " + getMountPoint() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getEc2VolumeId() == null) ? 0 : getEc2VolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getRaidArrayId() == null) ? 0 : getRaidArrayId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode()); 
        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Volume == false) return false;
        Volume other = (Volume)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getEc2VolumeId() == null ^ this.getEc2VolumeId() == null) return false;
        if (other.getEc2VolumeId() != null && other.getEc2VolumeId().equals(this.getEc2VolumeId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getRaidArrayId() == null ^ this.getRaidArrayId() == null) return false;
        if (other.getRaidArrayId() != null && other.getRaidArrayId().equals(this.getRaidArrayId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        if (other.getDevice() == null ^ this.getDevice() == null) return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false) return false; 
        if (other.getMountPoint() == null ^ this.getMountPoint() == null) return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        return true;
    }
    
}
    
/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createVolume(CreateVolumeRequest) CreateVolume operation}.
 * <p>
 * Initializes an empty volume of a given size.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVolume(CreateVolumeRequest)
 */
public class CreateVolumeRequest extends AmazonWebServiceRequest {

    /**
     * The size of the volume, in gigabytes. Required if you are not creating
     * a volume from a snapshot.
     */
    private Integer size;

    /**
     * The ID of the snapshot from which to create the new volume.
     */
    private String snapshotId;

    /**
     * The Availability Zone in which to create the new volume.
     */
    private String availabilityZone;

    private String volumeType;

    private Integer iops;

    /**
     * Default constructor for a new CreateVolumeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateVolumeRequest() {}
    
    /**
     * Constructs a new CreateVolumeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param size The size of the volume, in gigabytes. Required if you are
     * not creating a volume from a snapshot.
     * @param availabilityZone The Availability Zone in which to create the
     * new volume.
     */
    public CreateVolumeRequest(Integer size, String availabilityZone) {
        this.size = size;
        this.availabilityZone = availabilityZone;
    }

    
    
    /**
     * Constructs a new CreateVolumeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param snapshotId The ID of the snapshot from which to create the new
     * volume.
     * @param availabilityZone The Availability Zone in which to create the
     * new volume.
     */
    public CreateVolumeRequest(String snapshotId, String availabilityZone) {
        this.snapshotId = snapshotId;
        this.availabilityZone = availabilityZone;
    }

    
    
    /**
     * The size of the volume, in gigabytes. Required if you are not creating
     * a volume from a snapshot.
     *
     * @return The size of the volume, in gigabytes. Required if you are not creating
     *         a volume from a snapshot.
     */
    public Integer getSize() {
        return size;
    }
    
    /**
     * The size of the volume, in gigabytes. Required if you are not creating
     * a volume from a snapshot.
     *
     * @param size The size of the volume, in gigabytes. Required if you are not creating
     *         a volume from a snapshot.
     */
    public void setSize(Integer size) {
        this.size = size;
    }
    
    /**
     * The size of the volume, in gigabytes. Required if you are not creating
     * a volume from a snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The size of the volume, in gigabytes. Required if you are not creating
     *         a volume from a snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVolumeRequest withSize(Integer size) {
        this.size = size;
        return this;
    }
    
    
    /**
     * The ID of the snapshot from which to create the new volume.
     *
     * @return The ID of the snapshot from which to create the new volume.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot from which to create the new volume.
     *
     * @param snapshotId The ID of the snapshot from which to create the new volume.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot from which to create the new volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the snapshot from which to create the new volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVolumeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    
    
    /**
     * The Availability Zone in which to create the new volume.
     *
     * @return The Availability Zone in which to create the new volume.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which to create the new volume.
     *
     * @param availabilityZone The Availability Zone in which to create the new volume.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which to create the new volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which to create the new volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVolumeRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * Returns the value of the VolumeType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @return The value of the VolumeType property for this object.
     *
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * Sets the value of the VolumeType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @param volumeType The new value for the VolumeType property for this object.
     *
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * Sets the value of the VolumeType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @param volumeType The new value for the VolumeType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeType
     */
    public CreateVolumeRequest withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }
    
    
    /**
     * Sets the value of the VolumeType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @param volumeType The new value for the VolumeType property for this object.
     *
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }
    
    /**
     * Sets the value of the VolumeType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @param volumeType The new value for the VolumeType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VolumeType
     */
    public CreateVolumeRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }
    
    /**
     * Returns the value of the Iops property for this object.
     *
     * @return The value of the Iops property for this object.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * Sets the value of the Iops property for this object.
     *
     * @param iops The new value for the Iops property for this object.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * Sets the value of the Iops property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The new value for the Iops property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVolumeRequest withIops(Integer iops) {
        this.iops = iops;
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
        if (size != null) sb.append("Size: " + size + ", ");
        if (snapshotId != null) sb.append("SnapshotId: " + snapshotId + ", ");
        if (availabilityZone != null) sb.append("AvailabilityZone: " + availabilityZone + ", ");
        if (volumeType != null) sb.append("VolumeType: " + volumeType + ", ");
        if (iops != null) sb.append("Iops: " + iops + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateVolumeRequest == false) return false;
        CreateVolumeRequest other = (CreateVolumeRequest)obj;
        
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getVolumeType() == null ^ this.getVolumeType() == null) return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        return true;
    }
    
}
    
/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        sb.append("Size: " + size + ", ");
        sb.append("SnapshotId: " + snapshotId + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
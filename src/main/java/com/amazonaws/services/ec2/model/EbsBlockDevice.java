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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * An EBS volume backed block device.
 * </p>
 */
public class EbsBlockDevice implements Serializable {

    /**
     * The ID of the snapshot from which the volume will be created.
     */
    private String snapshotId;

    /**
     * The size of the volume, in gigabytes.
     */
    private Integer volumeSize;

    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     */
    private Boolean deleteOnTermination;

    private String volumeType;

    private Integer iops;

    /**
     * The ID of the snapshot from which the volume will be created.
     *
     * @return The ID of the snapshot from which the volume will be created.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot from which the volume will be created.
     *
     * @param snapshotId The ID of the snapshot from which the volume will be created.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot from which the volume will be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the snapshot from which the volume will be created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EbsBlockDevice withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The size of the volume, in gigabytes.
     *
     * @return The size of the volume, in gigabytes.
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }
    
    /**
     * The size of the volume, in gigabytes.
     *
     * @param volumeSize The size of the volume, in gigabytes.
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }
    
    /**
     * The size of the volume, in gigabytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSize The size of the volume, in gigabytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @return Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @param deleteOnTermination Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @return Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
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
    public EbsBlockDevice withVolumeType(String volumeType) {
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
    public EbsBlockDevice withVolumeType(VolumeType volumeType) {
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
    public EbsBlockDevice withIops(Integer iops) {
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
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeSize() != null) sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() + ",");
        if (getVolumeType() != null) sb.append("VolumeType: " + getVolumeType() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EbsBlockDevice == false) return false;
        EbsBlockDevice other = (EbsBlockDevice)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null) return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        if (other.getVolumeType() == null ^ this.getVolumeType() == null) return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        return true;
    }
    
}
    
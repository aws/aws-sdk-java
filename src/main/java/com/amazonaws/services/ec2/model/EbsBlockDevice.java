/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describe an Amazon EBS block device.
 * </p>
 */
public class EbsBlockDevice implements Serializable {

    /**
     * The ID of the snapshot.
     */
    private String snapshotId;

    /**
     * The size of the volume, in GiB. <p>Constraints: If the volume type is
     * <code>io1</code>, the minimum size of the volume is 10 GiB.
     * <p>Default: If you're creating the volume from a snapshot and don't
     * specify a volume size, the default is the snapshot size.
     */
    private Integer volumeSize;

    /**
     * Indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     */
    private Boolean deleteOnTermination;

    /**
     * The volume type. <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     */
    private String volumeType;

    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports. <p>Constraint: Range is 100 to 4000. <p>Condition: Required
     * when the volume type is <code>io1</code>; not used with
     * <code>standard</code> volumes.
     */
    private Integer iops;

    /**
     * The ID of the snapshot.
     *
     * @return The ID of the snapshot.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot.
     *
     * @param snapshotId The ID of the snapshot.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EbsBlockDevice withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The size of the volume, in GiB. <p>Constraints: If the volume type is
     * <code>io1</code>, the minimum size of the volume is 10 GiB.
     * <p>Default: If you're creating the volume from a snapshot and don't
     * specify a volume size, the default is the snapshot size.
     *
     * @return The size of the volume, in GiB. <p>Constraints: If the volume type is
     *         <code>io1</code>, the minimum size of the volume is 10 GiB.
     *         <p>Default: If you're creating the volume from a snapshot and don't
     *         specify a volume size, the default is the snapshot size.
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }
    
    /**
     * The size of the volume, in GiB. <p>Constraints: If the volume type is
     * <code>io1</code>, the minimum size of the volume is 10 GiB.
     * <p>Default: If you're creating the volume from a snapshot and don't
     * specify a volume size, the default is the snapshot size.
     *
     * @param volumeSize The size of the volume, in GiB. <p>Constraints: If the volume type is
     *         <code>io1</code>, the minimum size of the volume is 10 GiB.
     *         <p>Default: If you're creating the volume from a snapshot and don't
     *         specify a volume size, the default is the snapshot size.
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }
    
    /**
     * The size of the volume, in GiB. <p>Constraints: If the volume type is
     * <code>io1</code>, the minimum size of the volume is 10 GiB.
     * <p>Default: If you're creating the volume from a snapshot and don't
     * specify a volume size, the default is the snapshot size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSize The size of the volume, in GiB. <p>Constraints: If the volume type is
     *         <code>io1</code>, the minimum size of the volume is 10 GiB.
     *         <p>Default: If you're creating the volume from a snapshot and don't
     *         specify a volume size, the default is the snapshot size.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * Indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @return Indicates whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @param deleteOnTermination Indicates whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Indicates whether the Amazon EBS volume is deleted on instance
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
     * Indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @return Indicates whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * The volume type. <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @return The volume type. <p>Default: <code>standard</code>
     *
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * The volume type. <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @param volumeType The volume type. <p>Default: <code>standard</code>
     *
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * The volume type. <p>Default: <code>standard</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @param volumeType The volume type. <p>Default: <code>standard</code>
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
     * The volume type. <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @param volumeType The volume type. <p>Default: <code>standard</code>
     *
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }
    
    /**
     * The volume type. <p>Default: <code>standard</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1
     *
     * @param volumeType The volume type. <p>Default: <code>standard</code>
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
     * The number of I/O operations per second (IOPS) that the volume
     * supports. <p>Constraint: Range is 100 to 4000. <p>Condition: Required
     * when the volume type is <code>io1</code>; not used with
     * <code>standard</code> volumes.
     *
     * @return The number of I/O operations per second (IOPS) that the volume
     *         supports. <p>Constraint: Range is 100 to 4000. <p>Condition: Required
     *         when the volume type is <code>io1</code>; not used with
     *         <code>standard</code> volumes.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports. <p>Constraint: Range is 100 to 4000. <p>Condition: Required
     * when the volume type is <code>io1</code>; not used with
     * <code>standard</code> volumes.
     *
     * @param iops The number of I/O operations per second (IOPS) that the volume
     *         supports. <p>Constraint: Range is 100 to 4000. <p>Condition: Required
     *         when the volume type is <code>io1</code>; not used with
     *         <code>standard</code> volumes.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports. <p>Constraint: Range is 100 to 4000. <p>Condition: Required
     * when the volume type is <code>io1</code>; not used with
     * <code>standard</code> volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The number of I/O operations per second (IOPS) that the volume
     *         supports. <p>Constraint: Range is 100 to 4000. <p>Condition: Required
     *         when the volume type is <code>io1</code>; not used with
     *         <code>standard</code> volumes.
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
    
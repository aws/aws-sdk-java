/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an Amazon EBS volume. This data type maps directly to the
 * Amazon EC2
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html"> EbsBlockDevice </a>
 * data type.
 * </p>
 */
public class EbsBlockDevice implements Serializable, Cloneable {

    /**
     * The snapshot ID.
     */
    private String snapshotId;

    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */
    private Integer iops;

    /**
     * The volume size, in GiB. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */
    private Integer volumeSize;

    /**
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>gp2, io1, standard
     */
    private String volumeType;

    /**
     * Whether the volume is deleted on instance termination.
     */
    private Boolean deleteOnTermination;

    /**
     * The snapshot ID.
     *
     * @return The snapshot ID.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The snapshot ID.
     *
     * @param snapshotId The snapshot ID.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The snapshot ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The snapshot ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EbsBlockDevice withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     *
     * @return The number of I/O operations per second (IOPS) that the volume
     *         supports. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     *
     * @param iops The number of I/O operations per second (IOPS) that the volume
     *         supports. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The number of I/O operations per second (IOPS) that the volume
     *         supports. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EbsBlockDevice withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * The volume size, in GiB. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     *
     * @return The volume size, in GiB. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }
    
    /**
     * The volume size, in GiB. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     *
     * @param volumeSize The volume size, in GiB. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }
    
    /**
     * The volume size, in GiB. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSize The volume size, in GiB. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>gp2, io1, standard
     *
     * @return The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *         <code>standard</code> for Magnetic volumes.
     *
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>gp2, io1, standard
     *
     * @param volumeType The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *         <code>standard</code> for Magnetic volumes.
     *
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>gp2, io1, standard
     *
     * @param volumeType The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *         <code>standard</code> for Magnetic volumes.
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
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>gp2, io1, standard
     *
     * @param volumeType The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *         <code>standard</code> for Magnetic volumes.
     *
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }
    
    /**
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>gp2, io1, standard
     *
     * @param volumeType The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *         <code>standard</code> for Magnetic volumes.
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
     * Whether the volume is deleted on instance termination.
     *
     * @return Whether the volume is deleted on instance termination.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Whether the volume is deleted on instance termination.
     *
     * @param deleteOnTermination Whether the volume is deleted on instance termination.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Whether the volume is deleted on instance termination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Whether the volume is deleted on instance termination.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Whether the volume is deleted on instance termination.
     *
     * @return Whether the volume is deleted on instance termination.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
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
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getVolumeSize() != null) sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getVolumeType() != null) sb.append("VolumeType: " + getVolumeType() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
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
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null) return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false) return false; 
        if (other.getVolumeType() == null ^ this.getVolumeType() == null) return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        return true;
    }
    
    @Override
    public EbsBlockDevice clone() {
        try {
            return (EbsBlockDevice) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
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
 * Describes a volume.
 * </p>
 */
public class Volume implements Serializable {

    /**
     * The ID of the volume.
     */
    private String volumeId;

    /**
     * The size of the volume, in GiBs.
     */
    private Integer size;

    /**
     * The snapshot from which the volume was created, if applicable.
     */
    private String snapshotId;

    /**
     * The Availability Zone for the volume.
     */
    private String availabilityZone;

    /**
     * The volume state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     */
    private String state;

    /**
     * The time stamp when volume creation was initiated.
     */
    private java.util.Date createTime;

    /**
     * 
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeAttachment> attachments;

    /**
     * Any tags assigned to the volume.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The volume type. This can be <code>gp2</code> for General Purpose
     * (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2
     */
    private String volumeType;

    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports.
     */
    private Integer iops;

    /**
     * Indicates whether the volume is encrypted.
     */
    private Boolean encrypted;

    /**
     * The ID of the volume.
     *
     * @return The ID of the volume.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the volume.
     *
     * @param volumeId The ID of the volume.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The size of the volume, in GiBs.
     *
     * @return The size of the volume, in GiBs.
     */
    public Integer getSize() {
        return size;
    }
    
    /**
     * The size of the volume, in GiBs.
     *
     * @param size The size of the volume, in GiBs.
     */
    public void setSize(Integer size) {
        this.size = size;
    }
    
    /**
     * The size of the volume, in GiBs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The size of the volume, in GiBs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * The snapshot from which the volume was created, if applicable.
     *
     * @return The snapshot from which the volume was created, if applicable.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The snapshot from which the volume was created, if applicable.
     *
     * @param snapshotId The snapshot from which the volume was created, if applicable.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The snapshot from which the volume was created, if applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The snapshot from which the volume was created, if applicable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The Availability Zone for the volume.
     *
     * @return The Availability Zone for the volume.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone for the volume.
     *
     * @param availabilityZone The Availability Zone for the volume.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone for the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone for the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The volume state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @return The volume state.
     *
     * @see VolumeState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The volume state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @param state The volume state.
     *
     * @see VolumeState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The volume state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @param state The volume state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VolumeState
     */
    public Volume withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The volume state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @param state The volume state.
     *
     * @see VolumeState
     */
    public void setState(VolumeState state) {
        this.state = state.toString();
    }
    
    /**
     * The volume state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @param state The volume state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VolumeState
     */
    public Volume withState(VolumeState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The time stamp when volume creation was initiated.
     *
     * @return The time stamp when volume creation was initiated.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * The time stamp when volume creation was initiated.
     *
     * @param createTime The time stamp when volume creation was initiated.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * The time stamp when volume creation was initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime The time stamp when volume creation was initiated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public java.util.List<VolumeAttachment> getAttachments() {
        if (attachments == null) {
              attachments = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeAttachment>();
              attachments.setAutoConstruct(true);
        }
        return attachments;
    }
    
    /**
     * 
     *
     * @param attachments 
     */
    public void setAttachments(java.util.Collection<VolumeAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeAttachment> attachmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeAttachment>(attachments.size());
        attachmentsCopy.addAll(attachments);
        this.attachments = attachmentsCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withAttachments(VolumeAttachment... attachments) {
        if (getAttachments() == null) setAttachments(new java.util.ArrayList<VolumeAttachment>(attachments.length));
        for (VolumeAttachment value : attachments) {
            getAttachments().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withAttachments(java.util.Collection<VolumeAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeAttachment> attachmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeAttachment>(attachments.size());
            attachmentsCopy.addAll(attachments);
            this.attachments = attachmentsCopy;
        }

        return this;
    }

    /**
     * Any tags assigned to the volume.
     *
     * @return Any tags assigned to the volume.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the volume.
     *
     * @param tags Any tags assigned to the volume.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * The volume type. This can be <code>gp2</code> for General Purpose
     * (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2
     *
     * @return The volume type. This can be <code>gp2</code> for General Purpose
     *         (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes.
     *
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * The volume type. This can be <code>gp2</code> for General Purpose
     * (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2
     *
     * @param volumeType The volume type. This can be <code>gp2</code> for General Purpose
     *         (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes.
     *
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * The volume type. This can be <code>gp2</code> for General Purpose
     * (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2
     *
     * @param volumeType The volume type. This can be <code>gp2</code> for General Purpose
     *         (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VolumeType
     */
    public Volume withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * The volume type. This can be <code>gp2</code> for General Purpose
     * (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2
     *
     * @param volumeType The volume type. This can be <code>gp2</code> for General Purpose
     *         (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes.
     *
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }
    
    /**
     * The volume type. This can be <code>gp2</code> for General Purpose
     * (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2
     *
     * @param volumeType The volume type. This can be <code>gp2</code> for General Purpose
     *         (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VolumeType
     */
    public Volume withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports.
     *
     * @return The number of I/O operations per second (IOPS) that the volume
     *         supports.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports.
     *
     * @param iops The number of I/O operations per second (IOPS) that the volume
     *         supports.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The number of I/O operations per second (IOPS) that the volume
     * supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The number of I/O operations per second (IOPS) that the volume
     *         supports.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Indicates whether the volume is encrypted.
     *
     * @return Indicates whether the volume is encrypted.
     */
    public Boolean isEncrypted() {
        return encrypted;
    }
    
    /**
     * Indicates whether the volume is encrypted.
     *
     * @param encrypted Indicates whether the volume is encrypted.
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    /**
     * Indicates whether the volume is encrypted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encrypted Indicates whether the volume is encrypted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * Indicates whether the volume is encrypted.
     *
     * @return Indicates whether the volume is encrypted.
     */
    public Boolean getEncrypted() {
        return encrypted;
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
        if (getSize() != null) sb.append("Size: " + getSize() + ",");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() + ",");
        if (getAttachments() != null) sb.append("Attachments: " + getAttachments() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getVolumeType() != null) sb.append("VolumeType: " + getVolumeType() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (isEncrypted() != null) sb.append("Encrypted: " + isEncrypted() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((isEncrypted() == null) ? 0 : isEncrypted().hashCode()); 
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
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getCreateTime() == null ^ this.getCreateTime() == null) return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false) return false; 
        if (other.getAttachments() == null ^ this.getAttachments() == null) return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getVolumeType() == null ^ this.getVolumeType() == null) return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.isEncrypted() == null ^ this.isEncrypted() == null) return false;
        if (other.isEncrypted() != null && other.isEncrypted().equals(this.isEncrypted()) == false) return false; 
        return true;
    }
    
}
    
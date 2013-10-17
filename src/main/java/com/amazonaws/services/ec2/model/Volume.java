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
 * Represents an Amazon <i>Elastic Block Storage</i> (EBS) volume.
 * </p>
 */
public class Volume implements Serializable {

    /**
     * The unique ID of this volume.
     */
    private String volumeId;

    /**
     * The size of this volume, in gigabytes.
     */
    private Integer size;

    /**
     * Optional snapshot from which this volume was created.
     */
    private String snapshotId;

    /**
     * Availability zone in which this volume was created.
     */
    private String availabilityZone;

    /**
     * State of this volume (e.g., creating, available).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     */
    private String state;

    /**
     * Timestamp when volume creation was initiated.
     */
    private java.util.Date createTime;

    /**
     * Information on what this volume is attached to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeAttachment> attachments;

    /**
     * A list of tags for the Volume.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    private String volumeType;

    private Integer iops;

    /**
     * The unique ID of this volume.
     *
     * @return The unique ID of this volume.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The unique ID of this volume.
     *
     * @param volumeId The unique ID of this volume.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The unique ID of this volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The unique ID of this volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The size of this volume, in gigabytes.
     *
     * @return The size of this volume, in gigabytes.
     */
    public Integer getSize() {
        return size;
    }
    
    /**
     * The size of this volume, in gigabytes.
     *
     * @param size The size of this volume, in gigabytes.
     */
    public void setSize(Integer size) {
        this.size = size;
    }
    
    /**
     * The size of this volume, in gigabytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The size of this volume, in gigabytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Optional snapshot from which this volume was created.
     *
     * @return Optional snapshot from which this volume was created.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * Optional snapshot from which this volume was created.
     *
     * @param snapshotId Optional snapshot from which this volume was created.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * Optional snapshot from which this volume was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId Optional snapshot from which this volume was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * Availability zone in which this volume was created.
     *
     * @return Availability zone in which this volume was created.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Availability zone in which this volume was created.
     *
     * @param availabilityZone Availability zone in which this volume was created.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Availability zone in which this volume was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone Availability zone in which this volume was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * State of this volume (e.g., creating, available).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @return State of this volume (e.g., creating, available).
     *
     * @see VolumeState
     */
    public String getState() {
        return state;
    }
    
    /**
     * State of this volume (e.g., creating, available).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @param state State of this volume (e.g., creating, available).
     *
     * @see VolumeState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * State of this volume (e.g., creating, available).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @param state State of this volume (e.g., creating, available).
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
     * State of this volume (e.g., creating, available).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @param state State of this volume (e.g., creating, available).
     *
     * @see VolumeState
     */
    public void setState(VolumeState state) {
        this.state = state.toString();
    }
    
    /**
     * State of this volume (e.g., creating, available).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, in-use, deleting, deleted, error
     *
     * @param state State of this volume (e.g., creating, available).
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
     * Timestamp when volume creation was initiated.
     *
     * @return Timestamp when volume creation was initiated.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * Timestamp when volume creation was initiated.
     *
     * @param createTime Timestamp when volume creation was initiated.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * Timestamp when volume creation was initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime Timestamp when volume creation was initiated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Volume withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Information on what this volume is attached to.
     *
     * @return Information on what this volume is attached to.
     */
    public java.util.List<VolumeAttachment> getAttachments() {
        if (attachments == null) {
              attachments = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeAttachment>();
              attachments.setAutoConstruct(true);
        }
        return attachments;
    }
    
    /**
     * Information on what this volume is attached to.
     *
     * @param attachments Information on what this volume is attached to.
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
     * Information on what this volume is attached to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments Information on what this volume is attached to.
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
     * Information on what this volume is attached to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments Information on what this volume is attached to.
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
     * A list of tags for the Volume.
     *
     * @return A list of tags for the Volume.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags for the Volume.
     *
     * @param tags A list of tags for the Volume.
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
     * A list of tags for the Volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Volume.
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
     * A list of tags for the Volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Volume.
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
    public Volume withVolumeType(String volumeType) {
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
    public Volume withVolumeType(VolumeType volumeType) {
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
    public Volume withIops(Integer iops) {
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getSize() != null) sb.append("Size: " + getSize() + ",");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() + ",");
        if (getAttachments() != null) sb.append("Attachments: " + getAttachments() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getVolumeType() != null) sb.append("VolumeType: " + getVolumeType() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() );
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
        return true;
    }
    
}
    
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
 * Describes a snapshot.
 * </p>
 */
public class Snapshot implements Serializable {

    /**
     * The ID of the snapshot.
     */
    private String snapshotId;

    /**
     * The ID of the volume.
     */
    private String volumeId;

    /**
     * The snapshot state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     */
    private String state;

    /**
     * The time stamp when the snapshot was initiated.
     */
    private java.util.Date startTime;

    /**
     * The progress of the snapshot, as a percentage.
     */
    private String progress;

    /**
     * The AWS account ID of the Amazon EBS snapshot owner.
     */
    private String ownerId;

    /**
     * The description for the snapshot.
     */
    private String description;

    /**
     * The size of the volume, in GiB.
     */
    private Integer volumeSize;

    /**
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or AWS account ID that owns the snapshot.
     */
    private String ownerAlias;

    /**
     * Any tags assigned to the snapshot.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Indicates whether the snapshot is encrypted.
     */
    private Boolean encrypted;

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
    public Snapshot withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

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
    public Snapshot withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The snapshot state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @return The snapshot state.
     *
     * @see SnapshotState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The snapshot state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state The snapshot state.
     *
     * @see SnapshotState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The snapshot state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state The snapshot state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SnapshotState
     */
    public Snapshot withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The snapshot state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state The snapshot state.
     *
     * @see SnapshotState
     */
    public void setState(SnapshotState state) {
        this.state = state.toString();
    }
    
    /**
     * The snapshot state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state The snapshot state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SnapshotState
     */
    public Snapshot withState(SnapshotState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The time stamp when the snapshot was initiated.
     *
     * @return The time stamp when the snapshot was initiated.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The time stamp when the snapshot was initiated.
     *
     * @param startTime The time stamp when the snapshot was initiated.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The time stamp when the snapshot was initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The time stamp when the snapshot was initiated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The progress of the snapshot, as a percentage.
     *
     * @return The progress of the snapshot, as a percentage.
     */
    public String getProgress() {
        return progress;
    }
    
    /**
     * The progress of the snapshot, as a percentage.
     *
     * @param progress The progress of the snapshot, as a percentage.
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    /**
     * The progress of the snapshot, as a percentage.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progress The progress of the snapshot, as a percentage.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * The AWS account ID of the Amazon EBS snapshot owner.
     *
     * @return The AWS account ID of the Amazon EBS snapshot owner.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The AWS account ID of the Amazon EBS snapshot owner.
     *
     * @param ownerId The AWS account ID of the Amazon EBS snapshot owner.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The AWS account ID of the Amazon EBS snapshot owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The AWS account ID of the Amazon EBS snapshot owner.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * The description for the snapshot.
     *
     * @return The description for the snapshot.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the snapshot.
     *
     * @param description The description for the snapshot.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description for the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The size of the volume, in GiB.
     *
     * @return The size of the volume, in GiB.
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }
    
    /**
     * The size of the volume, in GiB.
     *
     * @param volumeSize The size of the volume, in GiB.
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }
    
    /**
     * The size of the volume, in GiB.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSize The size of the volume, in GiB.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or AWS account ID that owns the snapshot.
     *
     * @return The AWS account alias (for example, <code>amazon</code>,
     *         <code>self</code>) or AWS account ID that owns the snapshot.
     */
    public String getOwnerAlias() {
        return ownerAlias;
    }
    
    /**
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or AWS account ID that owns the snapshot.
     *
     * @param ownerAlias The AWS account alias (for example, <code>amazon</code>,
     *         <code>self</code>) or AWS account ID that owns the snapshot.
     */
    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }
    
    /**
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or AWS account ID that owns the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAlias The AWS account alias (for example, <code>amazon</code>,
     *         <code>self</code>) or AWS account ID that owns the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
        return this;
    }

    /**
     * Any tags assigned to the snapshot.
     *
     * @return Any tags assigned to the snapshot.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the snapshot.
     *
     * @param tags Any tags assigned to the snapshot.
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
     * Any tags assigned to the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withTags(java.util.Collection<Tag> tags) {
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
     * Indicates whether the snapshot is encrypted.
     *
     * @return Indicates whether the snapshot is encrypted.
     */
    public Boolean isEncrypted() {
        return encrypted;
    }
    
    /**
     * Indicates whether the snapshot is encrypted.
     *
     * @param encrypted Indicates whether the snapshot is encrypted.
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    /**
     * Indicates whether the snapshot is encrypted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encrypted Indicates whether the snapshot is encrypted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * Indicates whether the snapshot is encrypted.
     *
     * @return Indicates whether the snapshot is encrypted.
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
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getProgress() != null) sb.append("Progress: " + getProgress() + ",");
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getVolumeSize() != null) sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getOwnerAlias() != null) sb.append("OwnerAlias: " + getOwnerAlias() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (isEncrypted() != null) sb.append("Encrypted: " + isEncrypted() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((isEncrypted() == null) ? 0 : isEncrypted().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Snapshot == false) return false;
        Snapshot other = (Snapshot)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getProgress() == null ^ this.getProgress() == null) return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false) return false; 
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null) return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false) return false; 
        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null) return false;
        if (other.getOwnerAlias() != null && other.getOwnerAlias().equals(this.getOwnerAlias()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.isEncrypted() == null ^ this.isEncrypted() == null) return false;
        if (other.isEncrypted() != null && other.isEncrypted().equals(this.isEncrypted()) == false) return false; 
        return true;
    }
    
}
    
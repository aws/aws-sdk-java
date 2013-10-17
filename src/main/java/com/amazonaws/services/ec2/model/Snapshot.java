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
 * Represents a snapshot of an Amazon EC2 EBS volume.
 * </p>
 */
public class Snapshot implements Serializable {

    /**
     * The unique ID of this snapshot.
     */
    private String snapshotId;

    /**
     * The ID of the volume from which this snapshot was created.
     */
    private String volumeId;

    /**
     * Snapshot state (e.g., pending, completed, or error).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     */
    private String state;

    /**
     * Time stamp when the snapshot was initiated.
     */
    private java.util.Date startTime;

    /**
     * The progress of the snapshot, in percentage.
     */
    private String progress;

    /**
     * AWS Access Key ID of the user who owns the snapshot.
     */
    private String ownerId;

    /**
     * Description of the snapshot.
     */
    private String description;

    /**
     * The size of the volume, in gigabytes.
     */
    private Integer volumeSize;

    /**
     * The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     * account ID that owns the AMI.
     */
    private String ownerAlias;

    /**
     * A list of tags for the Snapshot.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The unique ID of this snapshot.
     *
     * @return The unique ID of this snapshot.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The unique ID of this snapshot.
     *
     * @param snapshotId The unique ID of this snapshot.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The unique ID of this snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The unique ID of this snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The ID of the volume from which this snapshot was created.
     *
     * @return The ID of the volume from which this snapshot was created.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the volume from which this snapshot was created.
     *
     * @param volumeId The ID of the volume from which this snapshot was created.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the volume from which this snapshot was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the volume from which this snapshot was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * Snapshot state (e.g., pending, completed, or error).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @return Snapshot state (e.g., pending, completed, or error).
     *
     * @see SnapshotState
     */
    public String getState() {
        return state;
    }
    
    /**
     * Snapshot state (e.g., pending, completed, or error).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state Snapshot state (e.g., pending, completed, or error).
     *
     * @see SnapshotState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Snapshot state (e.g., pending, completed, or error).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state Snapshot state (e.g., pending, completed, or error).
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
     * Snapshot state (e.g., pending, completed, or error).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state Snapshot state (e.g., pending, completed, or error).
     *
     * @see SnapshotState
     */
    public void setState(SnapshotState state) {
        this.state = state.toString();
    }
    
    /**
     * Snapshot state (e.g., pending, completed, or error).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state Snapshot state (e.g., pending, completed, or error).
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
     * Time stamp when the snapshot was initiated.
     *
     * @return Time stamp when the snapshot was initiated.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * Time stamp when the snapshot was initiated.
     *
     * @param startTime Time stamp when the snapshot was initiated.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * Time stamp when the snapshot was initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime Time stamp when the snapshot was initiated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The progress of the snapshot, in percentage.
     *
     * @return The progress of the snapshot, in percentage.
     */
    public String getProgress() {
        return progress;
    }
    
    /**
     * The progress of the snapshot, in percentage.
     *
     * @param progress The progress of the snapshot, in percentage.
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    /**
     * The progress of the snapshot, in percentage.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progress The progress of the snapshot, in percentage.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * AWS Access Key ID of the user who owns the snapshot.
     *
     * @return AWS Access Key ID of the user who owns the snapshot.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * AWS Access Key ID of the user who owns the snapshot.
     *
     * @param ownerId AWS Access Key ID of the user who owns the snapshot.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * AWS Access Key ID of the user who owns the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId AWS Access Key ID of the user who owns the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Description of the snapshot.
     *
     * @return Description of the snapshot.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Description of the snapshot.
     *
     * @param description Description of the snapshot.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Description of the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Description of the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withDescription(String description) {
        this.description = description;
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
    public Snapshot withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     * account ID that owns the AMI.
     *
     * @return The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     *         account ID that owns the AMI.
     */
    public String getOwnerAlias() {
        return ownerAlias;
    }
    
    /**
     * The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     * account ID that owns the AMI.
     *
     * @param ownerAlias The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     *         account ID that owns the AMI.
     */
    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }
    
    /**
     * The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     * account ID that owns the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAlias The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     *         account ID that owns the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
        return this;
    }

    /**
     * A list of tags for the Snapshot.
     *
     * @return A list of tags for the Snapshot.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags for the Snapshot.
     *
     * @param tags A list of tags for the Snapshot.
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
     * A list of tags for the Snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Snapshot.
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
     * A list of tags for the Snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Snapshot.
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
        if (getTags() != null) sb.append("Tags: " + getTags() );
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
        return true;
    }
    
}
    
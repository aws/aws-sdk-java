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

/**
 * <p>
 * Represents a snapshot of an Amazon EC2 EBS volume.
 * </p>
 */
public class Snapshot {

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
    private java.util.List<Tag> tags;

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
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * A list of tags for the Snapshot.
     *
     * @param tags A list of tags for the Snapshot.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
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
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;

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
        sb.append("SnapshotId: " + snapshotId + ", ");
        sb.append("VolumeId: " + volumeId + ", ");
        sb.append("State: " + state + ", ");
        sb.append("StartTime: " + startTime + ", ");
        sb.append("Progress: " + progress + ", ");
        sb.append("OwnerId: " + ownerId + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("VolumeSize: " + volumeSize + ", ");
        sb.append("OwnerAlias: " + ownerAlias + ", ");
        sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
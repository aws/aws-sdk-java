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
 * Represents an Amazon <i>Elastic Block Storage</i> (EBS) volume.
 * </p>
 */
public class Volume {

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
     * <b>Allowed Values: </b>creating, available, in-use, deleting, error
     */
    private String state;

    /**
     * Timestamp when volume creation was initiated.
     */
    private java.util.Date createTime;

    /**
     * Information on what this volume is attached to.
     */
    private java.util.List<VolumeAttachment> attachments;

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
     * <b>Allowed Values: </b>creating, available, in-use, deleting, error
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
     * <b>Allowed Values: </b>creating, available, in-use, deleting, error
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
     * <b>Allowed Values: </b>creating, available, in-use, deleting, error
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
            attachments = new java.util.ArrayList<VolumeAttachment>();
        }
        return attachments;
    }
    
    /**
     * Information on what this volume is attached to.
     *
     * @param attachments Information on what this volume is attached to.
     */
    public void setAttachments(java.util.Collection<VolumeAttachment> attachments) {
        java.util.List<VolumeAttachment> attachmentsCopy = new java.util.ArrayList<VolumeAttachment>();
        if (attachments != null) {
            attachmentsCopy.addAll(attachments);
        }
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
        java.util.List<VolumeAttachment> attachmentsCopy = new java.util.ArrayList<VolumeAttachment>();
        if (attachments != null) {
            attachmentsCopy.addAll(attachments);
        }
        this.attachments = attachmentsCopy;

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
        sb.append("VolumeId: " + volumeId + ", ");
        sb.append("Size: " + size + ", ");
        sb.append("SnapshotId: " + snapshotId + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("State: " + state + ", ");
        sb.append("CreateTime: " + createTime + ", ");
        sb.append("Attachments: " + attachments + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
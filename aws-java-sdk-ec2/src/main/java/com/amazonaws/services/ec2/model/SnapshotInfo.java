/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SnapshotInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * Source volume from which this snapshot was created.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Size of the volume from which this snapshot was created.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * Time this snapshot was started. This is the same for all snapshots initiated by the same request.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Progress this snapshot has made towards completing.
     * </p>
     */
    private String progress;
    /**
     * <p>
     * Account id used when creating this snapshot.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Snapshot id that can be used to describe this snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
     * </p>
     * 
     * @param description
     *        Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
     * </p>
     * 
     * @return Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
     * </p>
     * 
     * @param description
     *        Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     * 
     * @return Tags associated with this snapshot.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     * 
     * @param tags
     *        Tags associated with this snapshot.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags associated with this snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     * 
     * @param tags
     *        Tags associated with this snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the snapshot is encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     * 
     * @return Indicates whether the snapshot is encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the snapshot is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     * 
     * @return Indicates whether the snapshot is encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Source volume from which this snapshot was created.
     * </p>
     * 
     * @param volumeId
     *        Source volume from which this snapshot was created.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * Source volume from which this snapshot was created.
     * </p>
     * 
     * @return Source volume from which this snapshot was created.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * Source volume from which this snapshot was created.
     * </p>
     * 
     * @param volumeId
     *        Source volume from which this snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * 
     * @param state
     *        Current state of the snapshot.
     * @see SnapshotState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * 
     * @return Current state of the snapshot.
     * @see SnapshotState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * 
     * @param state
     *        Current state of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotState
     */

    public SnapshotInfo withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * 
     * @param state
     *        Current state of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotState
     */

    public SnapshotInfo withState(SnapshotState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Size of the volume from which this snapshot was created.
     * </p>
     * 
     * @param volumeSize
     *        Size of the volume from which this snapshot was created.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * Size of the volume from which this snapshot was created.
     * </p>
     * 
     * @return Size of the volume from which this snapshot was created.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * Size of the volume from which this snapshot was created.
     * </p>
     * 
     * @param volumeSize
     *        Size of the volume from which this snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * Time this snapshot was started. This is the same for all snapshots initiated by the same request.
     * </p>
     * 
     * @param startTime
     *        Time this snapshot was started. This is the same for all snapshots initiated by the same request.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Time this snapshot was started. This is the same for all snapshots initiated by the same request.
     * </p>
     * 
     * @return Time this snapshot was started. This is the same for all snapshots initiated by the same request.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Time this snapshot was started. This is the same for all snapshots initiated by the same request.
     * </p>
     * 
     * @param startTime
     *        Time this snapshot was started. This is the same for all snapshots initiated by the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Progress this snapshot has made towards completing.
     * </p>
     * 
     * @param progress
     *        Progress this snapshot has made towards completing.
     */

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * Progress this snapshot has made towards completing.
     * </p>
     * 
     * @return Progress this snapshot has made towards completing.
     */

    public String getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * Progress this snapshot has made towards completing.
     * </p>
     * 
     * @param progress
     *        Progress this snapshot has made towards completing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * Account id used when creating this snapshot.
     * </p>
     * 
     * @param ownerId
     *        Account id used when creating this snapshot.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Account id used when creating this snapshot.
     * </p>
     * 
     * @return Account id used when creating this snapshot.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * Account id used when creating this snapshot.
     * </p>
     * 
     * @param ownerId
     *        Account id used when creating this snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Snapshot id that can be used to describe this snapshot.
     * </p>
     * 
     * @param snapshotId
     *        Snapshot id that can be used to describe this snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * Snapshot id that can be used to describe this snapshot.
     * </p>
     * 
     * @return Snapshot id that can be used to describe this snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * Snapshot id that can be used to describe this snapshot.
     * </p>
     * 
     * @param snapshotId
     *        Snapshot id that can be used to describe this snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotInfo withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotInfo == false)
            return false;
        SnapshotInfo other = (SnapshotInfo) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotInfo clone() {
        try {
            return (SnapshotInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

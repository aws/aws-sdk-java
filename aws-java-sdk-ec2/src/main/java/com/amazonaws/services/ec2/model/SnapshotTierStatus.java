/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about a snapshot's storage tier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SnapshotTierStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotTierStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The ID of the volume from which the snapshot was created.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The state of the snapshot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the snapshot.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The tags that are assigned to the snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The storage tier in which the snapshot is stored. <code>standard</code> indicates that the snapshot is stored in
     * the standard snapshot storage tier and that it is ready for use. <code>archive</code> indicates that the snapshot
     * is currently archived and that it must be restored before it can be used.
     * </p>
     */
    private String storageTier;
    /**
     * <p>
     * The date and time when the last archive or restore process was started.
     * </p>
     */
    private java.util.Date lastTieringStartTime;
    /**
     * <p>
     * The progress of the last archive or restore process, as a percentage.
     * </p>
     */
    private Integer lastTieringProgress;
    /**
     * <p>
     * The status of the last archive or restore process.
     * </p>
     */
    private String lastTieringOperationStatus;
    /**
     * <p>
     * A message describing the status of the last archive or restore process.
     * </p>
     */
    private String lastTieringOperationStatusDetail;
    /**
     * <p>
     * The date and time when the last archive process was completed.
     * </p>
     */
    private java.util.Date archivalCompleteTime;
    /**
     * <p>
     * Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily
     * restored snapshot will be automatically re-archived.
     * </p>
     */
    private java.util.Date restoreExpiryTime;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The ID of the volume from which the snapshot was created.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume from which the snapshot was created.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume from which the snapshot was created.
     * </p>
     * 
     * @return The ID of the volume from which the snapshot was created.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume from which the snapshot was created.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume from which the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The state of the snapshot.
     * </p>
     * 
     * @param status
     *        The state of the snapshot.
     * @see SnapshotState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the snapshot.
     * </p>
     * 
     * @return The state of the snapshot.
     * @see SnapshotState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the snapshot.
     * </p>
     * 
     * @param status
     *        The state of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotState
     */

    public SnapshotTierStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the snapshot.
     * </p>
     * 
     * @param status
     *        The state of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotState
     */

    public SnapshotTierStatus withStatus(SnapshotState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the snapshot.
     * </p>
     * 
     * @param ownerId
     *        The ID of the Amazon Web Services account that owns the snapshot.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the snapshot.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that owns the snapshot.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the snapshot.
     * </p>
     * 
     * @param ownerId
     *        The ID of the Amazon Web Services account that owns the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The tags that are assigned to the snapshot.
     * </p>
     * 
     * @return The tags that are assigned to the snapshot.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags that are assigned to the snapshot.
     * </p>
     * 
     * @param tags
     *        The tags that are assigned to the snapshot.
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
     * The tags that are assigned to the snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags that are assigned to the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withTags(Tag... tags) {
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
     * The tags that are assigned to the snapshot.
     * </p>
     * 
     * @param tags
     *        The tags that are assigned to the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The storage tier in which the snapshot is stored. <code>standard</code> indicates that the snapshot is stored in
     * the standard snapshot storage tier and that it is ready for use. <code>archive</code> indicates that the snapshot
     * is currently archived and that it must be restored before it can be used.
     * </p>
     * 
     * @param storageTier
     *        The storage tier in which the snapshot is stored. <code>standard</code> indicates that the snapshot is
     *        stored in the standard snapshot storage tier and that it is ready for use. <code>archive</code> indicates
     *        that the snapshot is currently archived and that it must be restored before it can be used.
     * @see StorageTier
     */

    public void setStorageTier(String storageTier) {
        this.storageTier = storageTier;
    }

    /**
     * <p>
     * The storage tier in which the snapshot is stored. <code>standard</code> indicates that the snapshot is stored in
     * the standard snapshot storage tier and that it is ready for use. <code>archive</code> indicates that the snapshot
     * is currently archived and that it must be restored before it can be used.
     * </p>
     * 
     * @return The storage tier in which the snapshot is stored. <code>standard</code> indicates that the snapshot is
     *         stored in the standard snapshot storage tier and that it is ready for use. <code>archive</code> indicates
     *         that the snapshot is currently archived and that it must be restored before it can be used.
     * @see StorageTier
     */

    public String getStorageTier() {
        return this.storageTier;
    }

    /**
     * <p>
     * The storage tier in which the snapshot is stored. <code>standard</code> indicates that the snapshot is stored in
     * the standard snapshot storage tier and that it is ready for use. <code>archive</code> indicates that the snapshot
     * is currently archived and that it must be restored before it can be used.
     * </p>
     * 
     * @param storageTier
     *        The storage tier in which the snapshot is stored. <code>standard</code> indicates that the snapshot is
     *        stored in the standard snapshot storage tier and that it is ready for use. <code>archive</code> indicates
     *        that the snapshot is currently archived and that it must be restored before it can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageTier
     */

    public SnapshotTierStatus withStorageTier(String storageTier) {
        setStorageTier(storageTier);
        return this;
    }

    /**
     * <p>
     * The storage tier in which the snapshot is stored. <code>standard</code> indicates that the snapshot is stored in
     * the standard snapshot storage tier and that it is ready for use. <code>archive</code> indicates that the snapshot
     * is currently archived and that it must be restored before it can be used.
     * </p>
     * 
     * @param storageTier
     *        The storage tier in which the snapshot is stored. <code>standard</code> indicates that the snapshot is
     *        stored in the standard snapshot storage tier and that it is ready for use. <code>archive</code> indicates
     *        that the snapshot is currently archived and that it must be restored before it can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageTier
     */

    public SnapshotTierStatus withStorageTier(StorageTier storageTier) {
        this.storageTier = storageTier.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the last archive or restore process was started.
     * </p>
     * 
     * @param lastTieringStartTime
     *        The date and time when the last archive or restore process was started.
     */

    public void setLastTieringStartTime(java.util.Date lastTieringStartTime) {
        this.lastTieringStartTime = lastTieringStartTime;
    }

    /**
     * <p>
     * The date and time when the last archive or restore process was started.
     * </p>
     * 
     * @return The date and time when the last archive or restore process was started.
     */

    public java.util.Date getLastTieringStartTime() {
        return this.lastTieringStartTime;
    }

    /**
     * <p>
     * The date and time when the last archive or restore process was started.
     * </p>
     * 
     * @param lastTieringStartTime
     *        The date and time when the last archive or restore process was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withLastTieringStartTime(java.util.Date lastTieringStartTime) {
        setLastTieringStartTime(lastTieringStartTime);
        return this;
    }

    /**
     * <p>
     * The progress of the last archive or restore process, as a percentage.
     * </p>
     * 
     * @param lastTieringProgress
     *        The progress of the last archive or restore process, as a percentage.
     */

    public void setLastTieringProgress(Integer lastTieringProgress) {
        this.lastTieringProgress = lastTieringProgress;
    }

    /**
     * <p>
     * The progress of the last archive or restore process, as a percentage.
     * </p>
     * 
     * @return The progress of the last archive or restore process, as a percentage.
     */

    public Integer getLastTieringProgress() {
        return this.lastTieringProgress;
    }

    /**
     * <p>
     * The progress of the last archive or restore process, as a percentage.
     * </p>
     * 
     * @param lastTieringProgress
     *        The progress of the last archive or restore process, as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withLastTieringProgress(Integer lastTieringProgress) {
        setLastTieringProgress(lastTieringProgress);
        return this;
    }

    /**
     * <p>
     * The status of the last archive or restore process.
     * </p>
     * 
     * @param lastTieringOperationStatus
     *        The status of the last archive or restore process.
     * @see TieringOperationStatus
     */

    public void setLastTieringOperationStatus(String lastTieringOperationStatus) {
        this.lastTieringOperationStatus = lastTieringOperationStatus;
    }

    /**
     * <p>
     * The status of the last archive or restore process.
     * </p>
     * 
     * @return The status of the last archive or restore process.
     * @see TieringOperationStatus
     */

    public String getLastTieringOperationStatus() {
        return this.lastTieringOperationStatus;
    }

    /**
     * <p>
     * The status of the last archive or restore process.
     * </p>
     * 
     * @param lastTieringOperationStatus
     *        The status of the last archive or restore process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TieringOperationStatus
     */

    public SnapshotTierStatus withLastTieringOperationStatus(String lastTieringOperationStatus) {
        setLastTieringOperationStatus(lastTieringOperationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the last archive or restore process.
     * </p>
     * 
     * @param lastTieringOperationStatus
     *        The status of the last archive or restore process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TieringOperationStatus
     */

    public SnapshotTierStatus withLastTieringOperationStatus(TieringOperationStatus lastTieringOperationStatus) {
        this.lastTieringOperationStatus = lastTieringOperationStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message describing the status of the last archive or restore process.
     * </p>
     * 
     * @param lastTieringOperationStatusDetail
     *        A message describing the status of the last archive or restore process.
     */

    public void setLastTieringOperationStatusDetail(String lastTieringOperationStatusDetail) {
        this.lastTieringOperationStatusDetail = lastTieringOperationStatusDetail;
    }

    /**
     * <p>
     * A message describing the status of the last archive or restore process.
     * </p>
     * 
     * @return A message describing the status of the last archive or restore process.
     */

    public String getLastTieringOperationStatusDetail() {
        return this.lastTieringOperationStatusDetail;
    }

    /**
     * <p>
     * A message describing the status of the last archive or restore process.
     * </p>
     * 
     * @param lastTieringOperationStatusDetail
     *        A message describing the status of the last archive or restore process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withLastTieringOperationStatusDetail(String lastTieringOperationStatusDetail) {
        setLastTieringOperationStatusDetail(lastTieringOperationStatusDetail);
        return this;
    }

    /**
     * <p>
     * The date and time when the last archive process was completed.
     * </p>
     * 
     * @param archivalCompleteTime
     *        The date and time when the last archive process was completed.
     */

    public void setArchivalCompleteTime(java.util.Date archivalCompleteTime) {
        this.archivalCompleteTime = archivalCompleteTime;
    }

    /**
     * <p>
     * The date and time when the last archive process was completed.
     * </p>
     * 
     * @return The date and time when the last archive process was completed.
     */

    public java.util.Date getArchivalCompleteTime() {
        return this.archivalCompleteTime;
    }

    /**
     * <p>
     * The date and time when the last archive process was completed.
     * </p>
     * 
     * @param archivalCompleteTime
     *        The date and time when the last archive process was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withArchivalCompleteTime(java.util.Date archivalCompleteTime) {
        setArchivalCompleteTime(archivalCompleteTime);
        return this;
    }

    /**
     * <p>
     * Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily
     * restored snapshot will be automatically re-archived.
     * </p>
     * 
     * @param restoreExpiryTime
     *        Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily
     *        restored snapshot will be automatically re-archived.
     */

    public void setRestoreExpiryTime(java.util.Date restoreExpiryTime) {
        this.restoreExpiryTime = restoreExpiryTime;
    }

    /**
     * <p>
     * Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily
     * restored snapshot will be automatically re-archived.
     * </p>
     * 
     * @return Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily
     *         restored snapshot will be automatically re-archived.
     */

    public java.util.Date getRestoreExpiryTime() {
        return this.restoreExpiryTime;
    }

    /**
     * <p>
     * Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily
     * restored snapshot will be automatically re-archived.
     * </p>
     * 
     * @param restoreExpiryTime
     *        Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily
     *        restored snapshot will be automatically re-archived.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTierStatus withRestoreExpiryTime(java.util.Date restoreExpiryTime) {
        setRestoreExpiryTime(restoreExpiryTime);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStorageTier() != null)
            sb.append("StorageTier: ").append(getStorageTier()).append(",");
        if (getLastTieringStartTime() != null)
            sb.append("LastTieringStartTime: ").append(getLastTieringStartTime()).append(",");
        if (getLastTieringProgress() != null)
            sb.append("LastTieringProgress: ").append(getLastTieringProgress()).append(",");
        if (getLastTieringOperationStatus() != null)
            sb.append("LastTieringOperationStatus: ").append(getLastTieringOperationStatus()).append(",");
        if (getLastTieringOperationStatusDetail() != null)
            sb.append("LastTieringOperationStatusDetail: ").append(getLastTieringOperationStatusDetail()).append(",");
        if (getArchivalCompleteTime() != null)
            sb.append("ArchivalCompleteTime: ").append(getArchivalCompleteTime()).append(",");
        if (getRestoreExpiryTime() != null)
            sb.append("RestoreExpiryTime: ").append(getRestoreExpiryTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotTierStatus == false)
            return false;
        SnapshotTierStatus other = (SnapshotTierStatus) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStorageTier() == null ^ this.getStorageTier() == null)
            return false;
        if (other.getStorageTier() != null && other.getStorageTier().equals(this.getStorageTier()) == false)
            return false;
        if (other.getLastTieringStartTime() == null ^ this.getLastTieringStartTime() == null)
            return false;
        if (other.getLastTieringStartTime() != null && other.getLastTieringStartTime().equals(this.getLastTieringStartTime()) == false)
            return false;
        if (other.getLastTieringProgress() == null ^ this.getLastTieringProgress() == null)
            return false;
        if (other.getLastTieringProgress() != null && other.getLastTieringProgress().equals(this.getLastTieringProgress()) == false)
            return false;
        if (other.getLastTieringOperationStatus() == null ^ this.getLastTieringOperationStatus() == null)
            return false;
        if (other.getLastTieringOperationStatus() != null && other.getLastTieringOperationStatus().equals(this.getLastTieringOperationStatus()) == false)
            return false;
        if (other.getLastTieringOperationStatusDetail() == null ^ this.getLastTieringOperationStatusDetail() == null)
            return false;
        if (other.getLastTieringOperationStatusDetail() != null
                && other.getLastTieringOperationStatusDetail().equals(this.getLastTieringOperationStatusDetail()) == false)
            return false;
        if (other.getArchivalCompleteTime() == null ^ this.getArchivalCompleteTime() == null)
            return false;
        if (other.getArchivalCompleteTime() != null && other.getArchivalCompleteTime().equals(this.getArchivalCompleteTime()) == false)
            return false;
        if (other.getRestoreExpiryTime() == null ^ this.getRestoreExpiryTime() == null)
            return false;
        if (other.getRestoreExpiryTime() != null && other.getRestoreExpiryTime().equals(this.getRestoreExpiryTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStorageTier() == null) ? 0 : getStorageTier().hashCode());
        hashCode = prime * hashCode + ((getLastTieringStartTime() == null) ? 0 : getLastTieringStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastTieringProgress() == null) ? 0 : getLastTieringProgress().hashCode());
        hashCode = prime * hashCode + ((getLastTieringOperationStatus() == null) ? 0 : getLastTieringOperationStatus().hashCode());
        hashCode = prime * hashCode + ((getLastTieringOperationStatusDetail() == null) ? 0 : getLastTieringOperationStatusDetail().hashCode());
        hashCode = prime * hashCode + ((getArchivalCompleteTime() == null) ? 0 : getArchivalCompleteTime().hashCode());
        hashCode = prime * hashCode + ((getRestoreExpiryTime() == null) ? 0 : getRestoreExpiryTime().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotTierStatus clone() {
        try {
            return (SnapshotTierStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreSnapshotFromRecycleBinResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The ARN of the Outpost on which the snapshot is stored. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local snapshots on
     * Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * The description for the snapshot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the EBS snapshot.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The progress of the snapshot, as a percentage.
     * </p>
     */
    private String progress;
    /**
     * <p>
     * The time stamp when the snapshot was initiated.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The state of the snapshot.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ID of the volume that was used to create the snapshot.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     */
    private Integer volumeSize;

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

    public RestoreSnapshotFromRecycleBinResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The ARN of the Outpost on which the snapshot is stored. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local snapshots on
     * Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param outpostArn
     *        The ARN of the Outpost on which the snapshot is stored. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local
     *        snapshots on Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The ARN of the Outpost on which the snapshot is stored. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local snapshots on
     * Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The ARN of the Outpost on which the snapshot is stored. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local
     *         snapshots on Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The ARN of the Outpost on which the snapshot is stored. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local snapshots on
     * Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param outpostArn
     *        The ARN of the Outpost on which the snapshot is stored. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html">Amazon EBS local
     *        snapshots on Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotFromRecycleBinResult withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     * 
     * @param description
     *        The description for the snapshot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     * 
     * @return The description for the snapshot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     * 
     * @param description
     *        The description for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotFromRecycleBinResult withDescription(String description) {
        setDescription(description);
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

    public RestoreSnapshotFromRecycleBinResult withEncrypted(Boolean encrypted) {
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
     * The ID of the Amazon Web Services account that owns the EBS snapshot.
     * </p>
     * 
     * @param ownerId
     *        The ID of the Amazon Web Services account that owns the EBS snapshot.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the EBS snapshot.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that owns the EBS snapshot.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the EBS snapshot.
     * </p>
     * 
     * @param ownerId
     *        The ID of the Amazon Web Services account that owns the EBS snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotFromRecycleBinResult withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The progress of the snapshot, as a percentage.
     * </p>
     * 
     * @param progress
     *        The progress of the snapshot, as a percentage.
     */

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the snapshot, as a percentage.
     * </p>
     * 
     * @return The progress of the snapshot, as a percentage.
     */

    public String getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The progress of the snapshot, as a percentage.
     * </p>
     * 
     * @param progress
     *        The progress of the snapshot, as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotFromRecycleBinResult withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The time stamp when the snapshot was initiated.
     * </p>
     * 
     * @param startTime
     *        The time stamp when the snapshot was initiated.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time stamp when the snapshot was initiated.
     * </p>
     * 
     * @return The time stamp when the snapshot was initiated.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time stamp when the snapshot was initiated.
     * </p>
     * 
     * @param startTime
     *        The time stamp when the snapshot was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotFromRecycleBinResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The state of the snapshot.
     * </p>
     * 
     * @param state
     *        The state of the snapshot.
     * @see SnapshotState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the snapshot.
     * </p>
     * 
     * @return The state of the snapshot.
     * @see SnapshotState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the snapshot.
     * </p>
     * 
     * @param state
     *        The state of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotState
     */

    public RestoreSnapshotFromRecycleBinResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the snapshot.
     * </p>
     * 
     * @param state
     *        The state of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotState
     */

    public RestoreSnapshotFromRecycleBinResult withState(SnapshotState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that was used to create the snapshot.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot.
     * </p>
     * 
     * @return The ID of the volume that was used to create the snapshot.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that was used to create the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotFromRecycleBinResult withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * 
     * @return The size of the volume, in GiB.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotFromRecycleBinResult withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
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
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreSnapshotFromRecycleBinResult == false)
            return false;
        RestoreSnapshotFromRecycleBinResult other = (RestoreSnapshotFromRecycleBinResult) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        return hashCode;
    }

    @Override
    public RestoreSnapshotFromRecycleBinResult clone() {
        try {
            return (RestoreSnapshotFromRecycleBinResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

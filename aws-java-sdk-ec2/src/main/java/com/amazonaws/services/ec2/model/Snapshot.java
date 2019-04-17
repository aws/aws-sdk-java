/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Snapshot" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Snapshot implements Serializable, Cloneable {

    /**
     * <p>
     * The data encryption key identifier for the snapshot. This value is a unique identifier that corresponds to the
     * data encryption key that was used to encrypt the original volume or snapshot copy. Because data encryption keys
     * are inherited by volumes created from snapshots, and vice versa, if snapshots share the same data encryption key
     * identifier, then they belong to the same volume/snapshot lineage. This parameter is only returned by the
     * <a>DescribeSnapshots</a> API operation.
     * </p>
     */
    private String dataEncryptionKeyId;
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
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * volume encryption key for the parent volume.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The AWS account ID of the EBS snapshot owner.
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
     * The ID of the snapshot. Each snapshot receives a unique identifier when it is created.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The time stamp when the snapshot was initiated.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The snapshot state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot copy operation fails (for example, if the
     * proper AWS Key Management Service (AWS KMS) permissions are not obtained) this field displays error state details
     * to help you diagnose why the error occurred. This parameter is only returned by the <a>DescribeSnapshots</a> API
     * operation.
     * </p>
     */
    private String stateMessage;
    /**
     * <p>
     * The ID of the volume that was used to create the snapshot. Snapshots created by the <a>CopySnapshot</a> action
     * have an arbitrary volume ID that should not be used for any purpose.
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
     * Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> | <code>all</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     */
    private String ownerAlias;
    /**
     * <p>
     * Any tags assigned to the snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The data encryption key identifier for the snapshot. This value is a unique identifier that corresponds to the
     * data encryption key that was used to encrypt the original volume or snapshot copy. Because data encryption keys
     * are inherited by volumes created from snapshots, and vice versa, if snapshots share the same data encryption key
     * identifier, then they belong to the same volume/snapshot lineage. This parameter is only returned by the
     * <a>DescribeSnapshots</a> API operation.
     * </p>
     * 
     * @param dataEncryptionKeyId
     *        The data encryption key identifier for the snapshot. This value is a unique identifier that corresponds to
     *        the data encryption key that was used to encrypt the original volume or snapshot copy. Because data
     *        encryption keys are inherited by volumes created from snapshots, and vice versa, if snapshots share the
     *        same data encryption key identifier, then they belong to the same volume/snapshot lineage. This parameter
     *        is only returned by the <a>DescribeSnapshots</a> API operation.
     */

    public void setDataEncryptionKeyId(String dataEncryptionKeyId) {
        this.dataEncryptionKeyId = dataEncryptionKeyId;
    }

    /**
     * <p>
     * The data encryption key identifier for the snapshot. This value is a unique identifier that corresponds to the
     * data encryption key that was used to encrypt the original volume or snapshot copy. Because data encryption keys
     * are inherited by volumes created from snapshots, and vice versa, if snapshots share the same data encryption key
     * identifier, then they belong to the same volume/snapshot lineage. This parameter is only returned by the
     * <a>DescribeSnapshots</a> API operation.
     * </p>
     * 
     * @return The data encryption key identifier for the snapshot. This value is a unique identifier that corresponds
     *         to the data encryption key that was used to encrypt the original volume or snapshot copy. Because data
     *         encryption keys are inherited by volumes created from snapshots, and vice versa, if snapshots share the
     *         same data encryption key identifier, then they belong to the same volume/snapshot lineage. This parameter
     *         is only returned by the <a>DescribeSnapshots</a> API operation.
     */

    public String getDataEncryptionKeyId() {
        return this.dataEncryptionKeyId;
    }

    /**
     * <p>
     * The data encryption key identifier for the snapshot. This value is a unique identifier that corresponds to the
     * data encryption key that was used to encrypt the original volume or snapshot copy. Because data encryption keys
     * are inherited by volumes created from snapshots, and vice versa, if snapshots share the same data encryption key
     * identifier, then they belong to the same volume/snapshot lineage. This parameter is only returned by the
     * <a>DescribeSnapshots</a> API operation.
     * </p>
     * 
     * @param dataEncryptionKeyId
     *        The data encryption key identifier for the snapshot. This value is a unique identifier that corresponds to
     *        the data encryption key that was used to encrypt the original volume or snapshot copy. Because data
     *        encryption keys are inherited by volumes created from snapshots, and vice versa, if snapshots share the
     *        same data encryption key identifier, then they belong to the same volume/snapshot lineage. This parameter
     *        is only returned by the <a>DescribeSnapshots</a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withDataEncryptionKeyId(String dataEncryptionKeyId) {
        setDataEncryptionKeyId(dataEncryptionKeyId);
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

    public Snapshot withDescription(String description) {
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

    public Snapshot withEncrypted(Boolean encrypted) {
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
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * volume encryption key for the parent volume.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to
     *        protect the volume encryption key for the parent volume.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * volume encryption key for the parent volume.
     * </p>
     * 
     * @return The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to
     *         protect the volume encryption key for the parent volume.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * volume encryption key for the parent volume.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to
     *        protect the volume encryption key for the parent volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the EBS snapshot owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the EBS snapshot owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the EBS snapshot owner.
     * </p>
     * 
     * @return The AWS account ID of the EBS snapshot owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the EBS snapshot owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the EBS snapshot owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withOwnerId(String ownerId) {
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

    public Snapshot withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot. Each snapshot receives a unique identifier when it is created.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot. Each snapshot receives a unique identifier when it is created.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot. Each snapshot receives a unique identifier when it is created.
     * </p>
     * 
     * @return The ID of the snapshot. Each snapshot receives a unique identifier when it is created.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot. Each snapshot receives a unique identifier when it is created.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot. Each snapshot receives a unique identifier when it is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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

    public Snapshot withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * 
     * @param state
     *        The snapshot state.
     * @see SnapshotState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * 
     * @return The snapshot state.
     * @see SnapshotState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * 
     * @param state
     *        The snapshot state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotState
     */

    public Snapshot withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * 
     * @param state
     *        The snapshot state.
     * @see SnapshotState
     */

    public void setState(SnapshotState state) {
        withState(state);
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * 
     * @param state
     *        The snapshot state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotState
     */

    public Snapshot withState(SnapshotState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot copy operation fails (for example, if the
     * proper AWS Key Management Service (AWS KMS) permissions are not obtained) this field displays error state details
     * to help you diagnose why the error occurred. This parameter is only returned by the <a>DescribeSnapshots</a> API
     * operation.
     * </p>
     * 
     * @param stateMessage
     *        Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot copy operation fails (for example,
     *        if the proper AWS Key Management Service (AWS KMS) permissions are not obtained) this field displays error
     *        state details to help you diagnose why the error occurred. This parameter is only returned by the
     *        <a>DescribeSnapshots</a> API operation.
     */

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    /**
     * <p>
     * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot copy operation fails (for example, if the
     * proper AWS Key Management Service (AWS KMS) permissions are not obtained) this field displays error state details
     * to help you diagnose why the error occurred. This parameter is only returned by the <a>DescribeSnapshots</a> API
     * operation.
     * </p>
     * 
     * @return Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot copy operation fails (for
     *         example, if the proper AWS Key Management Service (AWS KMS) permissions are not obtained) this field
     *         displays error state details to help you diagnose why the error occurred. This parameter is only returned
     *         by the <a>DescribeSnapshots</a> API operation.
     */

    public String getStateMessage() {
        return this.stateMessage;
    }

    /**
     * <p>
     * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot copy operation fails (for example, if the
     * proper AWS Key Management Service (AWS KMS) permissions are not obtained) this field displays error state details
     * to help you diagnose why the error occurred. This parameter is only returned by the <a>DescribeSnapshots</a> API
     * operation.
     * </p>
     * 
     * @param stateMessage
     *        Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot copy operation fails (for example,
     *        if the proper AWS Key Management Service (AWS KMS) permissions are not obtained) this field displays error
     *        state details to help you diagnose why the error occurred. This parameter is only returned by the
     *        <a>DescribeSnapshots</a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withStateMessage(String stateMessage) {
        setStateMessage(stateMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot. Snapshots created by the <a>CopySnapshot</a> action
     * have an arbitrary volume ID that should not be used for any purpose.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that was used to create the snapshot. Snapshots created by the <a>CopySnapshot</a>
     *        action have an arbitrary volume ID that should not be used for any purpose.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot. Snapshots created by the <a>CopySnapshot</a> action
     * have an arbitrary volume ID that should not be used for any purpose.
     * </p>
     * 
     * @return The ID of the volume that was used to create the snapshot. Snapshots created by the <a>CopySnapshot</a>
     *         action have an arbitrary volume ID that should not be used for any purpose.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot. Snapshots created by the <a>CopySnapshot</a> action
     * have an arbitrary volume ID that should not be used for any purpose.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that was used to create the snapshot. Snapshots created by the <a>CopySnapshot</a>
     *        action have an arbitrary volume ID that should not be used for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withVolumeId(String volumeId) {
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

    public Snapshot withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> | <code>all</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * 
     * @param ownerAlias
     *        Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> | <code>all</code> |
     *        <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     *        user-configured AWS account alias, which is set from the IAM console.
     */

    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }

    /**
     * <p>
     * Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> | <code>all</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * 
     * @return Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> | <code>all</code> |
     *         <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     *         user-configured AWS account alias, which is set from the IAM console.
     */

    public String getOwnerAlias() {
        return this.ownerAlias;
    }

    /**
     * <p>
     * Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> | <code>all</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * 
     * @param ownerAlias
     *        Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> | <code>all</code> |
     *        <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     *        user-configured AWS account alias, which is set from the IAM console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withOwnerAlias(String ownerAlias) {
        setOwnerAlias(ownerAlias);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the snapshot.
     * </p>
     * 
     * @return Any tags assigned to the snapshot.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the snapshot.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the snapshot.
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
     * Any tags assigned to the snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withTags(Tag... tags) {
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
     * Any tags assigned to the snapshot.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDataEncryptionKeyId() != null)
            sb.append("DataEncryptionKeyId: ").append(getDataEncryptionKeyId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateMessage() != null)
            sb.append("StateMessage: ").append(getStateMessage()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getOwnerAlias() != null)
            sb.append("OwnerAlias: ").append(getOwnerAlias()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Snapshot == false)
            return false;
        Snapshot other = (Snapshot) obj;
        if (other.getDataEncryptionKeyId() == null ^ this.getDataEncryptionKeyId() == null)
            return false;
        if (other.getDataEncryptionKeyId() != null && other.getDataEncryptionKeyId().equals(this.getDataEncryptionKeyId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateMessage() == null ^ this.getStateMessage() == null)
            return false;
        if (other.getStateMessage() != null && other.getStateMessage().equals(this.getStateMessage()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null)
            return false;
        if (other.getOwnerAlias() != null && other.getOwnerAlias().equals(this.getOwnerAlias()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataEncryptionKeyId() == null) ? 0 : getDataEncryptionKeyId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateMessage() == null) ? 0 : getStateMessage().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Snapshot clone() {
        try {
            return (Snapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

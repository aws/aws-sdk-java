/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes a volume.
 * </p>
 */
public class Volume implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The volume state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeAttachment> attachments;
    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes, this
     * represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes, this
     * represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for
     * bursting. For more information on General Purpose SSD baseline performance, I/O credits, and bursting, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for io1 volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Indicates whether the volume will be encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * volume encryption key for the volume.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * 
     * @param size
     *        The size of the volume, in GiBs.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * 
     * @return The size of the volume, in GiBs.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * 
     * @param size
     *        The size of the volume, in GiBs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which the volume was created, if applicable.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     * 
     * @return The snapshot from which the volume was created, if applicable.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot from which the volume was created, if applicable.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which the volume was created, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the volume.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     * 
     * @return The Availability Zone for the volume.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param state
     *        The volume state.
     * @see VolumeState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @return The volume state.
     * @see VolumeState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param state
     *        The volume state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeState
     */

    public Volume withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param state
     *        The volume state.
     * @see VolumeState
     */

    public void setState(VolumeState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param state
     *        The volume state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeState
     */

    public Volume withState(VolumeState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     * 
     * @param createTime
     *        The time stamp when volume creation was initiated.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     * 
     * @return The time stamp when volume creation was initiated.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time stamp when volume creation was initiated.
     * </p>
     * 
     * @param createTime
     *        The time stamp when volume creation was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * 
     * @return Information about the volume attachments.
     */

    public java.util.List<VolumeAttachment> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<VolumeAttachment>();
        }
        return attachments;
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * 
     * @param attachments
     *        Information about the volume attachments.
     */

    public void setAttachments(java.util.Collection<VolumeAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<VolumeAttachment>(attachments);
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        Information about the volume attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withAttachments(VolumeAttachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<VolumeAttachment>(attachments.length));
        }
        for (VolumeAttachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the volume attachments.
     * </p>
     * 
     * @param attachments
     *        Information about the volume attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withAttachments(java.util.Collection<VolumeAttachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     * 
     * @return Any tags assigned to the volume.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the volume.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the volume.
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
     * Any tags assigned to the volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withTags(Tag... tags) {
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
     * Any tags assigned to the volume.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * 
     * @return The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *         IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public Volume withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public Volume withVolumeType(VolumeType volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes, this
     * represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes, this
     * represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for
     * bursting. For more information on General Purpose SSD baseline performance, I/O credits, and bursting, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for io1 volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes,
     *        this represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes,
     *        this represents the baseline performance of the volume and the rate at which the volume accumulates I/O
     *        credits for bursting. For more information on General Purpose SSD baseline performance, I/O credits, and
     *        bursting, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS
     *        Volume Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Constraint: Range is 100-20000 IOPS for io1 volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     *        </p>
     *        <p>
     *        Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in
     *        requests to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes, this
     * represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes, this
     * represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for
     * bursting. For more information on General Purpose SSD baseline performance, I/O credits, and bursting, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for io1 volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD
     *         volumes, this represents the number of IOPS that are provisioned for the volume. For General Purpose SSD
     *         volumes, this represents the baseline performance of the volume and the rate at which the volume
     *         accumulates I/O credits for bursting. For more information on General Purpose SSD baseline performance,
     *         I/O credits, and bursting, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Constraint: Range is 100-20000 IOPS for io1 volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     *         </p>
     *         <p>
     *         Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in
     *         requests to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code>
     *         volumes.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes, this
     * represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes, this
     * represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for
     * bursting. For more information on General Purpose SSD baseline performance, I/O credits, and bursting, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for io1 volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes,
     *        this represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes,
     *        this represents the baseline performance of the volume and the rate at which the volume accumulates I/O
     *        credits for bursting. For more information on General Purpose SSD baseline performance, I/O credits, and
     *        bursting, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS
     *        Volume Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Constraint: Range is 100-20000 IOPS for io1 volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     *        </p>
     *        <p>
     *        Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in
     *        requests to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume will be encrypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume will be encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume will be encrypted.
     * </p>
     * 
     * @return Indicates whether the volume will be encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume will be encrypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume will be encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume will be encrypted.
     * </p>
     * 
     * @return Indicates whether the volume will be encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * volume encryption key for the volume.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to
     *        protect the volume encryption key for the volume.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * volume encryption key for the volume.
     * </p>
     * 
     * @return The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to
     *         protect the volume encryption key for the volume.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * volume encryption key for the volume.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to
     *        protect the volume encryption key for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getAttachments() != null)
            sb.append("Attachments: " + getAttachments() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Volume == false)
            return false;
        Volume other = (Volume) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public Volume clone() {
        try {
            return (Volume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

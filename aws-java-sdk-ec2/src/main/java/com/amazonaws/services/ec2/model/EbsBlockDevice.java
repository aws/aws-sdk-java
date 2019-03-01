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
 * Describes a block device for an EBS volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EbsBlockDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsBlockDevice implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For <code>io1</code> volumes, this
     * represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents
     * the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     * EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and 100 to 64,000IOPS for <code>io1</code>
     * volumes, in most Regions. The maximum IOPS for <code>io1</code> of 64,000 is guaranteed only on <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instances</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384 for Provisioned IOPS SSD (
     * <code>io1</code>), 500-16384 for Throughput Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     * <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>) volumes. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code>
     * .
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption.
     * </p>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. This is because only blank
     * volumes can be encrypted on creation. If you are creating a snapshot from an existing EBS volume, you cannot
     * specify an encryption value that differs from that of the EBS volume. We recommend that you omit the encryption
     * value from the block device mappings when creating an image from an instance.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a user-managed CMK under which the EBS volume is
     * encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>, and
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     * RequestSpotInstances</a>.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance termination.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance termination.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance termination.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For <code>io1</code> volumes, this
     * represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents
     * the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     * EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and 100 to 64,000IOPS for <code>io1</code>
     * volumes, in most Regions. The maximum IOPS for <code>io1</code> of 64,000 is guaranteed only on <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instances</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For <code>io1</code> volumes,
     *        this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this
     *        represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     *        for bursting. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and 100 to 64,000IOPS for
     *        <code>io1</code> volumes, in most Regions. The maximum IOPS for <code>io1</code> of 64,000 is guaranteed
     *        only on <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Nitro-based instances</a>. Other instance families guarantee performance up to 32,000 IOPS.
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
     * The number of I/O operations per second (IOPS) that the volume supports. For <code>io1</code> volumes, this
     * represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents
     * the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     * EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and 100 to 64,000IOPS for <code>io1</code>
     * volumes, in most Regions. The maximum IOPS for <code>io1</code> of 64,000 is guaranteed only on <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instances</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS) that the volume supports. For <code>io1</code> volumes,
     *         this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     *         this represents the baseline performance of the volume and the rate at which the volume accumulates I/O
     *         credits for bursting. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and 100 to 64,000IOPS for
     *         <code>io1</code> volumes, in most Regions. The maximum IOPS for <code>io1</code> of 64,000 is guaranteed
     *         only on <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instances</a>. Other instance families guarantee performance up to 32,000 IOPS.
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
     * The number of I/O operations per second (IOPS) that the volume supports. For <code>io1</code> volumes, this
     * represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this represents
     * the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     * EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and 100 to 64,000IOPS for <code>io1</code>
     * volumes, in most Regions. The maximum IOPS for <code>io1</code> of 64,000 is guaranteed only on <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instances</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in requests
     * to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For <code>io1</code> volumes,
     *        this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes, this
     *        represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     *        for bursting. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Constraints: Range is 100-16,000 IOPS for <code>gp2</code> volumes and 100 to 64,000IOPS for
     *        <code>io1</code> volumes, in most Regions. The maximum IOPS for <code>io1</code> of 64,000 is guaranteed
     *        only on <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Nitro-based instances</a>. Other instance families guarantee performance up to 32,000 IOPS.
     *        </p>
     *        <p>
     *        Condition: This parameter is required for requests to create <code>io1</code> volumes; it is not used in
     *        requests to create <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withIops(Integer iops) {
        setIops(iops);
        return this;
    }

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

    public EbsBlockDevice withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384 for Provisioned IOPS SSD (
     * <code>io1</code>), 500-16384 for Throughput Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     * <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>) volumes. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.</p>
     *        <p>
     *        Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384 for Provisioned IOPS SSD (
     *        <code>io1</code>), 500-16384 for Throughput Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     *        <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>) volumes. If you specify a snapshot, the
     *        volume size must be equal to or larger than the snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384 for Provisioned IOPS SSD (
     * <code>io1</code>), 500-16384 for Throughput Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     * <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>) volumes. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * 
     * @return The size of the volume, in GiB.</p>
     *         <p>
     *         Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384 for Provisioned IOPS SSD (
     *         <code>io1</code>), 500-16384 for Throughput Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     *         <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>) volumes. If you specify a snapshot,
     *         the volume size must be equal to or larger than the snapshot size.
     *         </p>
     *         <p>
     *         Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is
     *         the snapshot size.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384 for Provisioned IOPS SSD (
     * <code>io1</code>), 500-16384 for Throughput Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     * <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>) volumes. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.</p>
     *        <p>
     *        Constraints: 1-16384 for General Purpose SSD (<code>gp2</code>), 4-16384 for Provisioned IOPS SSD (
     *        <code>io1</code>), 500-16384 for Throughput Optimized HDD (<code>st1</code>), 500-16384 for Cold HDD (
     *        <code>sc1</code>), and 1-1024 for Magnetic (<code>standard</code>) volumes. If you specify a snapshot, the
     *        volume size must be equal to or larger than the snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code>
     * .
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or
     *        <code>standard</code>.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code>
     * .
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @return The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or
     *         <code>standard</code>.</p>
     *         <p>
     *         Default: <code>standard</code>
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code>
     * .
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or
     *        <code>standard</code>.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EbsBlockDevice withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code>
     * .
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or
     *        <code>standard</code>.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        withVolumeType(volumeType);
    }

    /**
     * <p>
     * The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or <code>standard</code>
     * .
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type: <code>gp2</code>, <code>io1</code>, <code>st1</code>, <code>sc1</code>, or
     *        <code>standard</code>.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EbsBlockDevice withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption.
     * </p>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. This is because only blank
     * volumes can be encrypted on creation. If you are creating a snapshot from an existing EBS volume, you cannot
     * specify an encryption value that differs from that of the EBS volume. We recommend that you omit the encryption
     * value from the block device mappings when creating an image from an instance.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *        support Amazon EBS encryption.</p>
     *        <p>
     *        If you are creating a volume from a snapshot, you cannot specify an encryption value. This is because only
     *        blank volumes can be encrypted on creation. If you are creating a snapshot from an existing EBS volume,
     *        you cannot specify an encryption value that differs from that of the EBS volume. We recommend that you
     *        omit the encryption value from the block device mappings when creating an image from an instance.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption.
     * </p>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. This is because only blank
     * volumes can be encrypted on creation. If you are creating a snapshot from an existing EBS volume, you cannot
     * specify an encryption value that differs from that of the EBS volume. We recommend that you omit the encryption
     * value from the block device mappings when creating an image from an instance.
     * </p>
     * 
     * @return Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *         support Amazon EBS encryption.</p>
     *         <p>
     *         If you are creating a volume from a snapshot, you cannot specify an encryption value. This is because
     *         only blank volumes can be encrypted on creation. If you are creating a snapshot from an existing EBS
     *         volume, you cannot specify an encryption value that differs from that of the EBS volume. We recommend
     *         that you omit the encryption value from the block device mappings when creating an image from an
     *         instance.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption.
     * </p>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. This is because only blank
     * volumes can be encrypted on creation. If you are creating a snapshot from an existing EBS volume, you cannot
     * specify an encryption value that differs from that of the EBS volume. We recommend that you omit the encryption
     * value from the block device mappings when creating an image from an instance.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *        support Amazon EBS encryption.</p>
     *        <p>
     *        If you are creating a volume from a snapshot, you cannot specify an encryption value. This is because only
     *        blank volumes can be encrypted on creation. If you are creating a snapshot from an existing EBS volume,
     *        you cannot specify an encryption value that differs from that of the EBS volume. We recommend that you
     *        omit the encryption value from the block device mappings when creating an image from an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support
     * Amazon EBS encryption.
     * </p>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. This is because only blank
     * volumes can be encrypted on creation. If you are creating a snapshot from an existing EBS volume, you cannot
     * specify an encryption value that differs from that of the EBS volume. We recommend that you omit the encryption
     * value from the block device mappings when creating an image from an instance.
     * </p>
     * 
     * @return Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that
     *         support Amazon EBS encryption.</p>
     *         <p>
     *         If you are creating a volume from a snapshot, you cannot specify an encryption value. This is because
     *         only blank volumes can be encrypted on creation. If you are creating a snapshot from an existing EBS
     *         volume, you cannot specify an encryption value that differs from that of the EBS volume. We recommend
     *         that you omit the encryption value from the block device mappings when creating an image from an
     *         instance.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a user-managed CMK under which the EBS volume is
     * encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>, and
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     * RequestSpotInstances</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        Identifier (key ID, key alias, ID ARN, or alias ARN) for a user-managed CMK under which the EBS volume is
     *        encrypted.</p>
     *        <p>
     *        This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     *        href
     *        ="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>,
     *        and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     *        RequestSpotInstances</a>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a user-managed CMK under which the EBS volume is
     * encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>, and
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     * RequestSpotInstances</a>.
     * </p>
     * 
     * @return Identifier (key ID, key alias, ID ARN, or alias ARN) for a user-managed CMK under which the EBS volume is
     *         encrypted.</p>
     *         <p>
     *         This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     *         href
     *         ="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>,
     *         and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     *         RequestSpotInstances</a>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a user-managed CMK under which the EBS volume is
     * encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>, and
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     * RequestSpotInstances</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        Identifier (key ID, key alias, ID ARN, or alias ARN) for a user-managed CMK under which the EBS volume is
     *        encrypted.</p>
     *        <p>
     *        This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     *        href
     *        ="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>,
     *        and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     *        RequestSpotInstances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsBlockDevice == false)
            return false;
        EbsBlockDevice other = (EbsBlockDevice) obj;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
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

        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public EbsBlockDevice clone() {
        try {
            return (EbsBlockDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVolumeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateVolume.
 * </p>
 */
public class CreateVolumeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVolumeRequest> {

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Constraints: 1-16384 for <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for <code>st1</code>,
     * 500-16384 for <code>sc1</code>, and 1-1024 for <code>standard</code>. If you specify a snapshot, the volume size
     * must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The snapshot from which to create the volume.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     * Availability Zones that are currently available to you.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * Only valid for Provisioned IOPS SSD volumes. The number of I/O operations per second (IOPS) to provision for the
     * volume, with a maximum ratio of 30 IOPS/GiB.
     * </p>
     * <p>
     * Constraint: Range is 100 to 20000 for Provisioned IOPS SSD volumes
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to instances
     * that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     * encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or vice versa. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted volume. This parameter is only required if you want to use a non-default CMK; if this parameter is not
     * specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by
     * the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID.
     * For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. If
     * a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     * </p>
     */
    private String kmsKeyId;

    /**
     * Default constructor for CreateVolumeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateVolumeRequest() {
    }

    /**
     * Constructs a new CreateVolumeRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param size
     *        The size of the volume, in GiBs.</p>
     *        <p>
     *        Constraints: 1-16384 for <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for <code>st1</code>,
     *        500-16384 for <code>sc1</code>, and 1-1024 for <code>standard</code>. If you specify a snapshot, the
     *        volume size must be equal to or larger than the snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     * @param availabilityZone
     *        The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     *        Availability Zones that are currently available to you.
     */
    public CreateVolumeRequest(Integer size, String availabilityZone) {
        setSize(size);
        setAvailabilityZone(availabilityZone);
    }

    /**
     * Constructs a new CreateVolumeRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param snapshotId
     *        The snapshot from which to create the volume.
     * @param availabilityZone
     *        The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     *        Availability Zones that are currently available to you.
     */
    public CreateVolumeRequest(String snapshotId, String availabilityZone) {
        setSnapshotId(snapshotId);
        setAvailabilityZone(availabilityZone);
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Constraints: 1-16384 for <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for <code>st1</code>,
     * 500-16384 for <code>sc1</code>, and 1-1024 for <code>standard</code>. If you specify a snapshot, the volume size
     * must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * 
     * @param size
     *        The size of the volume, in GiBs.</p>
     *        <p>
     *        Constraints: 1-16384 for <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for <code>st1</code>,
     *        500-16384 for <code>sc1</code>, and 1-1024 for <code>standard</code>. If you specify a snapshot, the
     *        volume size must be equal to or larger than the snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Constraints: 1-16384 for <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for <code>st1</code>,
     * 500-16384 for <code>sc1</code>, and 1-1024 for <code>standard</code>. If you specify a snapshot, the volume size
     * must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * 
     * @return The size of the volume, in GiBs.</p>
     *         <p>
     *         Constraints: 1-16384 for <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for <code>st1</code>,
     *         500-16384 for <code>sc1</code>, and 1-1024 for <code>standard</code>. If you specify a snapshot, the
     *         volume size must be equal to or larger than the snapshot size.
     *         </p>
     *         <p>
     *         Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is
     *         the snapshot size.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Constraints: 1-16384 for <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for <code>st1</code>,
     * 500-16384 for <code>sc1</code>, and 1-1024 for <code>standard</code>. If you specify a snapshot, the volume size
     * must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * 
     * @param size
     *        The size of the volume, in GiBs.</p>
     *        <p>
     *        Constraints: 1-16384 for <code>gp2</code>, 4-16384 for <code>io1</code>, 500-16384 for <code>st1</code>,
     *        500-16384 for <code>sc1</code>, and 1-1024 for <code>standard</code>. If you specify a snapshot, the
     *        volume size must be equal to or larger than the snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The snapshot from which to create the volume.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which to create the volume.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot from which to create the volume.
     * </p>
     * 
     * @return The snapshot from which to create the volume.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot from which to create the volume.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which to create the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     * Availability Zones that are currently available to you.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     *        Availability Zones that are currently available to you.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     * Availability Zones that are currently available to you.
     * </p>
     * 
     * @return The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     *         Availability Zones that are currently available to you.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     * Availability Zones that are currently available to you.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     *        Availability Zones that are currently available to you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Default: <code>standard</code>
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
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @return The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *         IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes.</p>
     *         <p>
     *         Default: <code>standard</code>
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
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public CreateVolumeRequest withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Default: <code>standard</code>
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
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public CreateVolumeRequest withVolumeType(VolumeType volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * Only valid for Provisioned IOPS SSD volumes. The number of I/O operations per second (IOPS) to provision for the
     * volume, with a maximum ratio of 30 IOPS/GiB.
     * </p>
     * <p>
     * Constraint: Range is 100 to 20000 for Provisioned IOPS SSD volumes
     * </p>
     * 
     * @param iops
     *        Only valid for Provisioned IOPS SSD volumes. The number of I/O operations per second (IOPS) to provision
     *        for the volume, with a maximum ratio of 30 IOPS/GiB.</p>
     *        <p>
     *        Constraint: Range is 100 to 20000 for Provisioned IOPS SSD volumes
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Only valid for Provisioned IOPS SSD volumes. The number of I/O operations per second (IOPS) to provision for the
     * volume, with a maximum ratio of 30 IOPS/GiB.
     * </p>
     * <p>
     * Constraint: Range is 100 to 20000 for Provisioned IOPS SSD volumes
     * </p>
     * 
     * @return Only valid for Provisioned IOPS SSD volumes. The number of I/O operations per second (IOPS) to provision
     *         for the volume, with a maximum ratio of 30 IOPS/GiB.</p>
     *         <p>
     *         Constraint: Range is 100 to 20000 for Provisioned IOPS SSD volumes
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * Only valid for Provisioned IOPS SSD volumes. The number of I/O operations per second (IOPS) to provision for the
     * volume, with a maximum ratio of 30 IOPS/GiB.
     * </p>
     * <p>
     * Constraint: Range is 100 to 20000 for Provisioned IOPS SSD volumes
     * </p>
     * 
     * @param iops
     *        Only valid for Provisioned IOPS SSD volumes. The number of I/O operations per second (IOPS) to provision
     *        for the volume, with a maximum ratio of 30 IOPS/GiB.</p>
     *        <p>
     *        Constraint: Range is 100 to 20000 for Provisioned IOPS SSD volumes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to instances
     * that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     * encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or vice versa. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to
     *        instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are
     *        automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or
     *        vice versa. If your AMI uses encrypted volumes, you can only launch it on supported instance types. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to instances
     * that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     * encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or vice versa. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to
     *         instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or
     *         vice versa. If your AMI uses encrypted volumes, you can only launch it on supported instance types. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to instances
     * that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     * encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or vice versa. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to
     *        instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are
     *        automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or
     *        vice versa. If your AMI uses encrypted volumes, you can only launch it on supported instance types. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to instances
     * that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     * encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or vice versa. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to
     *         instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or
     *         vice versa. If your AMI uses encrypted volumes, you can only launch it on supported instance types. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted volume. This parameter is only required if you want to use a non-default CMK; if this parameter is not
     * specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by
     * the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID.
     * For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. If
     * a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating
     *        the encrypted volume. This parameter is only required if you want to use a non-default CMK; if this
     *        parameter is not specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code>
     *        namespace, followed by the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code>
     *        namespace, and then the CMK ID. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. If a
     *        <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted volume. This parameter is only required if you want to use a non-default CMK; if this parameter is not
     * specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by
     * the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID.
     * For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. If
     * a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     * </p>
     * 
     * @return The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating
     *         the encrypted volume. This parameter is only required if you want to use a non-default CMK; if this
     *         parameter is not specified, the default CMK for EBS is used. The ARN contains the
     *         <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the AWS account ID of the CMK
     *         owner, the <code>key</code> namespace, and then the CMK ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. If a
     *         <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted volume. This parameter is only required if you want to use a non-default CMK; if this parameter is not
     * specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code> namespace, followed by
     * the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID.
     * For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. If
     * a <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     * </p>
     * 
     * @param kmsKeyId
     *        The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating
     *        the encrypted volume. This parameter is only required if you want to use a non-default CMK; if this
     *        parameter is not specified, the default CMK for EBS is used. The ARN contains the <code>arn:aws:kms</code>
     *        namespace, followed by the region of the CMK, the AWS account ID of the CMK owner, the <code>key</code>
     *        namespace, and then the CMK ID. For example,
     *        arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>. If a
     *        <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must also be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVolumeRequest> getDryRunRequest() {
        Request<CreateVolumeRequest> request = new CreateVolumeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
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

        if (obj instanceof CreateVolumeRequest == false)
            return false;
        CreateVolumeRequest other = (CreateVolumeRequest) obj;
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

        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateVolumeRequest clone() {
        return (CreateVolumeRequest) super.clone();
    }
}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes information used to set up an Amazon EBS volume specified in a block device mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/Ebs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ebs implements Serializable, Cloneable {

    /**
     * <p>
     * The snapshot ID of the volume to use.
     * </p>
     * <p>
     * You must specify either a <code>VolumeSize</code> or a <code>SnapshotId</code>.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify either a <code>SnapshotId</code> or a <code>VolumeSize</code>. If you specify both
     * <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the size of
     * the snapshot.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Valid Values: <code>standard</code> | <code>io1</code> | <code>gp2</code> | <code>st1</code> | <code>sc1</code> |
     * <code>gp3</code>
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default value
     * is <code>true</code>.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume. For <code>gp3</code>
     * and <code>io1</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     * <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * For <code>io1</code> volumes, we guarantee 64,000 IOPS only for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * <code>Iops</code> is supported when the volume type is <code>gp3</code> or <code>io1</code> and required only
     * when the volume type is <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     * <code>st1</code>, or <code>sc1</code> volumes.)
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances that
     * support Amazon EBS encryption. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>. If your AMI uses encrypted volumes, you can also only launch it on supported
     * instance types.
     * </p>
     * <note>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are created
     * from encrypted snapshots are automatically encrypted, and volumes that are created from unencrypted snapshots are
     * automatically unencrypted. By default, encrypted snapshots use the AWS managed CMK that is used for EBS
     * encryption, but you can specify a custom CMK when you create the snapshot. The ability to encrypt a snapshot
     * during copying also allows you to apply a new CMK to an already-encrypted snapshot. Volumes restored from the
     * resulting copy are only accessible using the new CMK.
     * </p>
     * <p>
     * Enabling <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">encryption by
     * default</a> results in all EBS volumes being encrypted with the AWS managed CMK or a customer managed CMK,
     * whether or not the snapshot was encrypted.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Using
     * Encryption with EBS-Backed AMIs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/key-policy-requirements-EBS-encryption.html">Required
     * CMK key policy for use with encrypted volumes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The throughput to provision for a <code>gp3</code> volume.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     */
    private Integer throughput;

    /**
     * <p>
     * The snapshot ID of the volume to use.
     * </p>
     * <p>
     * You must specify either a <code>VolumeSize</code> or a <code>SnapshotId</code>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID of the volume to use.</p>
     *        <p>
     *        You must specify either a <code>VolumeSize</code> or a <code>SnapshotId</code>.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot ID of the volume to use.
     * </p>
     * <p>
     * You must specify either a <code>VolumeSize</code> or a <code>SnapshotId</code>.
     * </p>
     * 
     * @return The snapshot ID of the volume to use.</p>
     *         <p>
     *         You must specify either a <code>VolumeSize</code> or a <code>SnapshotId</code>.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot ID of the volume to use.
     * </p>
     * <p>
     * You must specify either a <code>VolumeSize</code> or a <code>SnapshotId</code>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID of the volume to use.</p>
     *        <p>
     *        You must specify either a <code>VolumeSize</code> or a <code>SnapshotId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify either a <code>SnapshotId</code> or a <code>VolumeSize</code>. If you specify both
     * <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the size of
     * the snapshot.
     * </p>
     * 
     * @param volumeSize
     *        The volume size, in GiBs. The following are the supported volumes sizes for each volume type: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 4-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code> and <code>sc1</code>: 125-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>standard</code>: 1-1,024
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You must specify either a <code>SnapshotId</code> or a <code>VolumeSize</code>. If you specify both
     *        <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the
     *        size of the snapshot.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify either a <code>SnapshotId</code> or a <code>VolumeSize</code>. If you specify both
     * <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the size of
     * the snapshot.
     * </p>
     * 
     * @return The volume size, in GiBs. The following are the supported volumes sizes for each volume type: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gp2</code> and <code>gp3</code>: 1-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code>: 4-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>st1</code> and <code>sc1</code>: 125-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>standard</code>: 1-1,024
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You must specify either a <code>SnapshotId</code> or a <code>VolumeSize</code>. If you specify both
     *         <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the
     *         size of the snapshot.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must specify either a <code>SnapshotId</code> or a <code>VolumeSize</code>. If you specify both
     * <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the size of
     * the snapshot.
     * </p>
     * 
     * @param volumeSize
     *        The volume size, in GiBs. The following are the supported volumes sizes for each volume type: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 4-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code> and <code>sc1</code>: 125-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>standard</code>: 1-1,024
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You must specify either a <code>SnapshotId</code> or a <code>VolumeSize</code>. If you specify both
     *        <code>SnapshotId</code> and <code>VolumeSize</code>, the volume size must be equal or greater than the
     *        size of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Valid Values: <code>standard</code> | <code>io1</code> | <code>gp2</code> | <code>st1</code> | <code>sc1</code> |
     * <code>gp3</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *        in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Valid Values: <code>standard</code> | <code>io1</code> | <code>gp2</code> | <code>st1</code> |
     *        <code>sc1</code> | <code>gp3</code>
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Valid Values: <code>standard</code> | <code>io1</code> | <code>gp2</code> | <code>st1</code> | <code>sc1</code> |
     * <code>gp3</code>
     * </p>
     * 
     * @return The volume type. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume
     *         Types</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *         <p>
     *         Valid Values: <code>standard</code> | <code>io1</code> | <code>gp2</code> | <code>st1</code> |
     *         <code>sc1</code> | <code>gp3</code>
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Valid Values: <code>standard</code> | <code>io1</code> | <code>gp2</code> | <code>st1</code> | <code>sc1</code> |
     * <code>gp3</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>
     *        in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Valid Values: <code>standard</code> | <code>io1</code> | <code>gp2</code> | <code>st1</code> |
     *        <code>sc1</code> | <code>gp3</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default value
     * is <code>true</code>.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default
     *        value is <code>true</code>.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default value
     * is <code>true</code>.
     * </p>
     * 
     * @return Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default
     *         value is <code>true</code>.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default value
     * is <code>true</code>.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default
     *        value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default value
     * is <code>true</code>.
     * </p>
     * 
     * @return Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default
     *         value is <code>true</code>.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume. For <code>gp3</code>
     * and <code>io1</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     * <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * For <code>io1</code> volumes, we guarantee 64,000 IOPS only for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * <code>Iops</code> is supported when the volume type is <code>gp3</code> or <code>io1</code> and required only
     * when the volume type is <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     * <code>st1</code>, or <code>sc1</code> volumes.)
     * </p>
     * 
     * @param iops
     *        The number of input/output (I/O) operations per second (IOPS) to provision for the volume. For
     *        <code>gp3</code> and <code>io1</code> volumes, this represents the number of IOPS that are provisioned for
     *        the volume. For <code>gp2</code> volumes, this represents the baseline performance of the volume and the
     *        rate at which the volume accumulates I/O credits for bursting. </p>
     *        <p>
     *        The following are the supported values for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp3</code>: 3,000-16,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For <code>io1</code> volumes, we guarantee 64,000 IOPS only for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     *        </p>
     *        <p>
     *        <code>Iops</code> is supported when the volume type is <code>gp3</code> or <code>io1</code> and required
     *        only when the volume type is <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     *        <code>st1</code>, or <code>sc1</code> volumes.)
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume. For <code>gp3</code>
     * and <code>io1</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     * <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * For <code>io1</code> volumes, we guarantee 64,000 IOPS only for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * <code>Iops</code> is supported when the volume type is <code>gp3</code> or <code>io1</code> and required only
     * when the volume type is <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     * <code>st1</code>, or <code>sc1</code> volumes.)
     * </p>
     * 
     * @return The number of input/output (I/O) operations per second (IOPS) to provision for the volume. For
     *         <code>gp3</code> and <code>io1</code> volumes, this represents the number of IOPS that are provisioned
     *         for the volume. For <code>gp2</code> volumes, this represents the baseline performance of the volume and
     *         the rate at which the volume accumulates I/O credits for bursting. </p>
     *         <p>
     *         The following are the supported values for each volume type:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gp3</code>: 3,000-16,000 IOPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code>: 100-64,000 IOPS
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For <code>io1</code> volumes, we guarantee 64,000 IOPS only for <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Instances built on the Nitro System</a>. Other instance families guarantee performance up to 32,000
     *         IOPS.
     *         </p>
     *         <p>
     *         <code>Iops</code> is supported when the volume type is <code>gp3</code> or <code>io1</code> and required
     *         only when the volume type is <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     *         <code>st1</code>, or <code>sc1</code> volumes.)
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume. For <code>gp3</code>
     * and <code>io1</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     * <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * For <code>io1</code> volumes, we guarantee 64,000 IOPS only for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * <code>Iops</code> is supported when the volume type is <code>gp3</code> or <code>io1</code> and required only
     * when the volume type is <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     * <code>st1</code>, or <code>sc1</code> volumes.)
     * </p>
     * 
     * @param iops
     *        The number of input/output (I/O) operations per second (IOPS) to provision for the volume. For
     *        <code>gp3</code> and <code>io1</code> volumes, this represents the number of IOPS that are provisioned for
     *        the volume. For <code>gp2</code> volumes, this represents the baseline performance of the volume and the
     *        rate at which the volume accumulates I/O credits for bursting. </p>
     *        <p>
     *        The following are the supported values for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp3</code>: 3,000-16,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For <code>io1</code> volumes, we guarantee 64,000 IOPS only for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     *        </p>
     *        <p>
     *        <code>Iops</code> is supported when the volume type is <code>gp3</code> or <code>io1</code> and required
     *        only when the volume type is <code>io1</code>. (Not used with <code>standard</code>, <code>gp2</code>,
     *        <code>st1</code>, or <code>sc1</code> volumes.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances that
     * support Amazon EBS encryption. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>. If your AMI uses encrypted volumes, you can also only launch it on supported
     * instance types.
     * </p>
     * <note>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are created
     * from encrypted snapshots are automatically encrypted, and volumes that are created from unencrypted snapshots are
     * automatically unencrypted. By default, encrypted snapshots use the AWS managed CMK that is used for EBS
     * encryption, but you can specify a custom CMK when you create the snapshot. The ability to encrypt a snapshot
     * during copying also allows you to apply a new CMK to an already-encrypted snapshot. Volumes restored from the
     * resulting copy are only accessible using the new CMK.
     * </p>
     * <p>
     * Enabling <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">encryption by
     * default</a> results in all EBS volumes being encrypted with the AWS managed CMK or a customer managed CMK,
     * whether or not the snapshot was encrypted.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Using
     * Encryption with EBS-Backed AMIs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/key-policy-requirements-EBS-encryption.html">Required
     * CMK key policy for use with encrypted volumes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances
     *        that support Amazon EBS encryption. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *        >Supported Instance Types</a>. If your AMI uses encrypted volumes, you can also only launch it on
     *        supported instance types.</p> <note>
     *        <p>
     *        If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are
     *        created from encrypted snapshots are automatically encrypted, and volumes that are created from
     *        unencrypted snapshots are automatically unencrypted. By default, encrypted snapshots use the AWS managed
     *        CMK that is used for EBS encryption, but you can specify a custom CMK when you create the snapshot. The
     *        ability to encrypt a snapshot during copying also allows you to apply a new CMK to an already-encrypted
     *        snapshot. Volumes restored from the resulting copy are only accessible using the new CMK.
     *        </p>
     *        <p>
     *        Enabling <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *        >encryption by default</a> results in all EBS volumes being encrypted with the AWS managed CMK or a
     *        customer managed CMK, whether or not the snapshot was encrypted.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Using Encryption with
     *        EBS-Backed AMIs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/key-policy-requirements-EBS-encryption.html"
     *        >Required CMK key policy for use with encrypted volumes</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances that
     * support Amazon EBS encryption. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>. If your AMI uses encrypted volumes, you can also only launch it on supported
     * instance types.
     * </p>
     * <note>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are created
     * from encrypted snapshots are automatically encrypted, and volumes that are created from unencrypted snapshots are
     * automatically unencrypted. By default, encrypted snapshots use the AWS managed CMK that is used for EBS
     * encryption, but you can specify a custom CMK when you create the snapshot. The ability to encrypt a snapshot
     * during copying also allows you to apply a new CMK to an already-encrypted snapshot. Volumes restored from the
     * resulting copy are only accessible using the new CMK.
     * </p>
     * <p>
     * Enabling <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">encryption by
     * default</a> results in all EBS volumes being encrypted with the AWS managed CMK or a customer managed CMK,
     * whether or not the snapshot was encrypted.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Using
     * Encryption with EBS-Backed AMIs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/key-policy-requirements-EBS-encryption.html">Required
     * CMK key policy for use with encrypted volumes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances
     *         that support Amazon EBS encryption. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported Instance Types</a>. If your AMI uses encrypted volumes, you can also only launch it on
     *         supported instance types.</p> <note>
     *         <p>
     *         If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are
     *         created from encrypted snapshots are automatically encrypted, and volumes that are created from
     *         unencrypted snapshots are automatically unencrypted. By default, encrypted snapshots use the AWS managed
     *         CMK that is used for EBS encryption, but you can specify a custom CMK when you create the snapshot. The
     *         ability to encrypt a snapshot during copying also allows you to apply a new CMK to an already-encrypted
     *         snapshot. Volumes restored from the resulting copy are only accessible using the new CMK.
     *         </p>
     *         <p>
     *         Enabling <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *         >encryption by default</a> results in all EBS volumes being encrypted with the AWS managed CMK or a
     *         customer managed CMK, whether or not the snapshot was encrypted.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Using Encryption with
     *         EBS-Backed AMIs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> and <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/key-policy-requirements-EBS-encryption.html"
     *         >Required CMK key policy for use with encrypted volumes</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances that
     * support Amazon EBS encryption. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>. If your AMI uses encrypted volumes, you can also only launch it on supported
     * instance types.
     * </p>
     * <note>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are created
     * from encrypted snapshots are automatically encrypted, and volumes that are created from unencrypted snapshots are
     * automatically unencrypted. By default, encrypted snapshots use the AWS managed CMK that is used for EBS
     * encryption, but you can specify a custom CMK when you create the snapshot. The ability to encrypt a snapshot
     * during copying also allows you to apply a new CMK to an already-encrypted snapshot. Volumes restored from the
     * resulting copy are only accessible using the new CMK.
     * </p>
     * <p>
     * Enabling <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">encryption by
     * default</a> results in all EBS volumes being encrypted with the AWS managed CMK or a customer managed CMK,
     * whether or not the snapshot was encrypted.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Using
     * Encryption with EBS-Backed AMIs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/key-policy-requirements-EBS-encryption.html">Required
     * CMK key policy for use with encrypted volumes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances
     *        that support Amazon EBS encryption. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *        >Supported Instance Types</a>. If your AMI uses encrypted volumes, you can also only launch it on
     *        supported instance types.</p> <note>
     *        <p>
     *        If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are
     *        created from encrypted snapshots are automatically encrypted, and volumes that are created from
     *        unencrypted snapshots are automatically unencrypted. By default, encrypted snapshots use the AWS managed
     *        CMK that is used for EBS encryption, but you can specify a custom CMK when you create the snapshot. The
     *        ability to encrypt a snapshot during copying also allows you to apply a new CMK to an already-encrypted
     *        snapshot. Volumes restored from the resulting copy are only accessible using the new CMK.
     *        </p>
     *        <p>
     *        Enabling <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *        >encryption by default</a> results in all EBS volumes being encrypted with the AWS managed CMK or a
     *        customer managed CMK, whether or not the snapshot was encrypted.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Using Encryption with
     *        EBS-Backed AMIs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/key-policy-requirements-EBS-encryption.html"
     *        >Required CMK key policy for use with encrypted volumes</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances that
     * support Amazon EBS encryption. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>. If your AMI uses encrypted volumes, you can also only launch it on supported
     * instance types.
     * </p>
     * <note>
     * <p>
     * If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are created
     * from encrypted snapshots are automatically encrypted, and volumes that are created from unencrypted snapshots are
     * automatically unencrypted. By default, encrypted snapshots use the AWS managed CMK that is used for EBS
     * encryption, but you can specify a custom CMK when you create the snapshot. The ability to encrypt a snapshot
     * during copying also allows you to apply a new CMK to an already-encrypted snapshot. Volumes restored from the
     * resulting copy are only accessible using the new CMK.
     * </p>
     * <p>
     * Enabling <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">encryption by
     * default</a> results in all EBS volumes being encrypted with the AWS managed CMK or a customer managed CMK,
     * whether or not the snapshot was encrypted.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Using
     * Encryption with EBS-Backed AMIs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/key-policy-requirements-EBS-encryption.html">Required
     * CMK key policy for use with encrypted volumes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances
     *         that support Amazon EBS encryption. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported Instance Types</a>. If your AMI uses encrypted volumes, you can also only launch it on
     *         supported instance types.</p> <note>
     *         <p>
     *         If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are
     *         created from encrypted snapshots are automatically encrypted, and volumes that are created from
     *         unencrypted snapshots are automatically unencrypted. By default, encrypted snapshots use the AWS managed
     *         CMK that is used for EBS encryption, but you can specify a custom CMK when you create the snapshot. The
     *         ability to encrypt a snapshot during copying also allows you to apply a new CMK to an already-encrypted
     *         snapshot. Volumes restored from the resulting copy are only accessible using the new CMK.
     *         </p>
     *         <p>
     *         Enabling <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *         >encryption by default</a> results in all EBS volumes being encrypted with the AWS managed CMK or a
     *         customer managed CMK, whether or not the snapshot was encrypted.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Using Encryption with
     *         EBS-Backed AMIs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i> and <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/key-policy-requirements-EBS-encryption.html"
     *         >Required CMK key policy for use with encrypted volumes</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The throughput to provision for a <code>gp3</code> volume.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @param throughput
     *        The throughput to provision for a <code>gp3</code> volume.</p>
     *        <p>
     *        Valid Range: Minimum value of 125. Maximum value of 1000.
     */

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput to provision for a <code>gp3</code> volume.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @return The throughput to provision for a <code>gp3</code> volume.</p>
     *         <p>
     *         Valid Range: Minimum value of 125. Maximum value of 1000.
     */

    public Integer getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput to provision for a <code>gp3</code> volume.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @param throughput
     *        The throughput to provision for a <code>gp3</code> volume.</p>
     *        <p>
     *        Valid Range: Minimum value of 125. Maximum value of 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ebs withThroughput(Integer throughput) {
        setThroughput(throughput);
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
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ebs == false)
            return false;
        Ebs other = (Ebs) obj;
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
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        return hashCode;
    }

    @Override
    public Ebs clone() {
        try {
            return (Ebs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

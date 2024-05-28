/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. These settings are
 * used to create each Amazon EBS volume, with one volume created for each task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/TaskManagedEBSVolumeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskManagedEBSVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the volume should be encrypted. If no value is specified, encryption is turned on by default.
     * This parameter maps 1:1 with the <code>Encrypted</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The Amazon Resource Name (ARN) identifier of the Amazon Web Services Key Management Service key to use for Amazon
     * EBS encryption. When encryption is turned on and no Amazon Web Services Key Management Service key is specified,
     * the default Amazon Web Services managed key for Amazon EBS volumes is used. This parameter maps 1:1 with the
     * <code>KmsKeyId</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <important>
     * <p>
     * Amazon Web Services authenticates the Amazon Web Services Key Management Service key asynchronously. Therefore,
     * if you specify an ID, alias, or ARN that is invalid, the action can appear to complete, but eventually fails.
     * </p>
     * </important>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The volume type. This parameter maps 1:1 with the <code>VolumeType</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">Amazon EBS volume types</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * The following are the supported volume types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code>|<code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code>|<code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * <note>
     * <p>
     * The magnetic volume type is not supported on Fargate.
     * </p>
     * </note></li>
     * </ul>
     */
    private String volumeType;
    /**
     * <p>
     * The size of the volume in GiB. You must specify either a volume size or a snapshot ID. If you specify a snapshot
     * ID, the snapshot size is used for the volume size by default. You can optionally specify a volume size greater
     * than or equal to the snapshot size. This parameter maps 1:1 with the <code>Size</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <p>
     * The following are the supported volume size values for each volume type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
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
     */
    private Integer sizeInGiB;
    /**
     * <p>
     * The snapshot that Amazon ECS uses to create the volume. You must specify either a snapshot ID or a volume size.
     * This parameter maps 1:1 with the <code>SnapshotId</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000 - 16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100 - 64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100 - 256,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is required for <code>io1</code> and <code>io2</code> volume types. The default for
     * <code>gp3</code> volumes is <code>3,000 IOPS</code>. This parameter is not supported for <code>st1</code>,
     * <code>sc1</code>, or <code>standard</code> volume types.
     * </p>
     * <p>
     * This parameter maps 1:1 with the <code>Iops</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s. This parameter maps 1:1 with
     * the <code>Throughput</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <important>
     * <p>
     * This parameter is only supported for the <code>gp3</code> volume type.
     * </p>
     * </important>
     */
    private Integer throughput;
    /**
     * <p>
     * The tags to apply to the volume. Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with
     * the <code>TagSpecifications.N</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EBSTagSpecification> tagSpecifications;
    /**
     * <p>
     * The ARN of the IAM role to associate with this volume. This is the Amazon ECS infrastructure IAM role that is
     * used to manage your Amazon Web Services infrastructure. We recommend using the Amazon ECS-managed
     * <code>AmazonECSInfrastructureRolePolicyForVolumes</code> IAM policy with this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html">Amazon ECS
     * infrastructure IAM role</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The termination policy for the volume when the task exits. This provides a way to control whether Amazon ECS
     * terminates the Amazon EBS volume when the task stops.
     * </p>
     */
    private TaskManagedEBSVolumeTerminationPolicy terminationPolicy;
    /**
     * <p>
     * The Linux filesystem type for the volume. For volumes created from a snapshot, you must specify the same
     * filesystem type that the volume was using when the snapshot was created. If there is a filesystem type mismatch,
     * the task will fail to start.
     * </p>
     * <p>
     * The available filesystem types are&#x2028; <code>ext3</code>, <code>ext4</code>, and <code>xfs</code>. If no
     * value is specified, the <code>xfs</code> filesystem type is used by default.
     * </p>
     */
    private String filesystemType;

    /**
     * <p>
     * Indicates whether the volume should be encrypted. If no value is specified, encryption is turned on by default.
     * This parameter maps 1:1 with the <code>Encrypted</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume should be encrypted. If no value is specified, encryption is turned on by
     *        default. This parameter maps 1:1 with the <code>Encrypted</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. If no value is specified, encryption is turned on by default.
     * This parameter maps 1:1 with the <code>Encrypted</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return Indicates whether the volume should be encrypted. If no value is specified, encryption is turned on by
     *         default. This parameter maps 1:1 with the <code>Encrypted</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *         in the <i>Amazon EC2 API Reference</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. If no value is specified, encryption is turned on by default.
     * This parameter maps 1:1 with the <code>Encrypted</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume should be encrypted. If no value is specified, encryption is turned on by
     *        default. This parameter maps 1:1 with the <code>Encrypted</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. If no value is specified, encryption is turned on by default.
     * This parameter maps 1:1 with the <code>Encrypted</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return Indicates whether the volume should be encrypted. If no value is specified, encryption is turned on by
     *         default. This parameter maps 1:1 with the <code>Encrypted</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *         in the <i>Amazon EC2 API Reference</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifier of the Amazon Web Services Key Management Service key to use for Amazon
     * EBS encryption. When encryption is turned on and no Amazon Web Services Key Management Service key is specified,
     * the default Amazon Web Services managed key for Amazon EBS volumes is used. This parameter maps 1:1 with the
     * <code>KmsKeyId</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <important>
     * <p>
     * Amazon Web Services authenticates the Amazon Web Services Key Management Service key asynchronously. Therefore,
     * if you specify an ID, alias, or ARN that is invalid, the action can appear to complete, but eventually fails.
     * </p>
     * </important>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) identifier of the Amazon Web Services Key Management Service key to use for
     *        Amazon EBS encryption. When encryption is turned on and no Amazon Web Services Key Management Service key
     *        is specified, the default Amazon Web Services managed key for Amazon EBS volumes is used. This parameter
     *        maps 1:1 with the <code>KmsKeyId</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.</p> <important>
     *        <p>
     *        Amazon Web Services authenticates the Amazon Web Services Key Management Service key asynchronously.
     *        Therefore, if you specify an ID, alias, or ARN that is invalid, the action can appear to complete, but
     *        eventually fails.
     *        </p>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifier of the Amazon Web Services Key Management Service key to use for Amazon
     * EBS encryption. When encryption is turned on and no Amazon Web Services Key Management Service key is specified,
     * the default Amazon Web Services managed key for Amazon EBS volumes is used. This parameter maps 1:1 with the
     * <code>KmsKeyId</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <important>
     * <p>
     * Amazon Web Services authenticates the Amazon Web Services Key Management Service key asynchronously. Therefore,
     * if you specify an ID, alias, or ARN that is invalid, the action can appear to complete, but eventually fails.
     * </p>
     * </important>
     * 
     * @return The Amazon Resource Name (ARN) identifier of the Amazon Web Services Key Management Service key to use
     *         for Amazon EBS encryption. When encryption is turned on and no Amazon Web Services Key Management Service
     *         key is specified, the default Amazon Web Services managed key for Amazon EBS volumes is used. This
     *         parameter maps 1:1 with the <code>KmsKeyId</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *         in the <i>Amazon EC2 API Reference</i>.</p> <important>
     *         <p>
     *         Amazon Web Services authenticates the Amazon Web Services Key Management Service key asynchronously.
     *         Therefore, if you specify an ID, alias, or ARN that is invalid, the action can appear to complete, but
     *         eventually fails.
     *         </p>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifier of the Amazon Web Services Key Management Service key to use for Amazon
     * EBS encryption. When encryption is turned on and no Amazon Web Services Key Management Service key is specified,
     * the default Amazon Web Services managed key for Amazon EBS volumes is used. This parameter maps 1:1 with the
     * <code>KmsKeyId</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <important>
     * <p>
     * Amazon Web Services authenticates the Amazon Web Services Key Management Service key asynchronously. Therefore,
     * if you specify an ID, alias, or ARN that is invalid, the action can appear to complete, but eventually fails.
     * </p>
     * </important>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) identifier of the Amazon Web Services Key Management Service key to use for
     *        Amazon EBS encryption. When encryption is turned on and no Amazon Web Services Key Management Service key
     *        is specified, the default Amazon Web Services managed key for Amazon EBS volumes is used. This parameter
     *        maps 1:1 with the <code>KmsKeyId</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.</p> <important>
     *        <p>
     *        Amazon Web Services authenticates the Amazon Web Services Key Management Service key asynchronously.
     *        Therefore, if you specify an ID, alias, or ARN that is invalid, the action can appear to complete, but
     *        eventually fails.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The volume type. This parameter maps 1:1 with the <code>VolumeType</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">Amazon EBS volume types</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * The following are the supported volume types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code>|<code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code>|<code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * <note>
     * <p>
     * The magnetic volume type is not supported on Fargate.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param volumeType
     *        The volume type. This parameter maps 1:1 with the <code>VolumeType</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">Amazon EBS volume
     *        types</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        The following are the supported volume types.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose SSD: <code>gp2</code>|<code>gp3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS SSD: <code>io1</code>|<code>io2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Throughput Optimized HDD: <code>st1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cold HDD: <code>sc1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic: <code>standard</code>
     *        </p>
     *        <note>
     *        <p>
     *        The magnetic volume type is not supported on Fargate.
     *        </p>
     *        </note></li>
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. This parameter maps 1:1 with the <code>VolumeType</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">Amazon EBS volume types</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * The following are the supported volume types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code>|<code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code>|<code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * <note>
     * <p>
     * The magnetic volume type is not supported on Fargate.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return The volume type. This parameter maps 1:1 with the <code>VolumeType</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *         in the <i>Amazon EC2 API Reference</i>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">Amazon EBS volume
     *         types</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *         <p>
     *         The following are the supported volume types.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose SSD: <code>gp2</code>|<code>gp3</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS SSD: <code>io1</code>|<code>io2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Throughput Optimized HDD: <code>st1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cold HDD: <code>sc1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic: <code>standard</code>
     *         </p>
     *         <note>
     *         <p>
     *         The magnetic volume type is not supported on Fargate.
     *         </p>
     *         </note></li>
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. This parameter maps 1:1 with the <code>VolumeType</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">Amazon EBS volume types</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * The following are the supported volume types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code>|<code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code>|<code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * <note>
     * <p>
     * The magnetic volume type is not supported on Fargate.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param volumeType
     *        The volume type. This parameter maps 1:1 with the <code>VolumeType</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">Amazon EBS volume
     *        types</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        The following are the supported volume types.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose SSD: <code>gp2</code>|<code>gp3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS SSD: <code>io1</code>|<code>io2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Throughput Optimized HDD: <code>st1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cold HDD: <code>sc1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic: <code>standard</code>
     *        </p>
     *        <note>
     *        <p>
     *        The magnetic volume type is not supported on Fargate.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The size of the volume in GiB. You must specify either a volume size or a snapshot ID. If you specify a snapshot
     * ID, the snapshot size is used for the volume size by default. You can optionally specify a volume size greater
     * than or equal to the snapshot size. This parameter maps 1:1 with the <code>Size</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <p>
     * The following are the supported volume size values for each volume type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
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
     * 
     * @param sizeInGiB
     *        The size of the volume in GiB. You must specify either a volume size or a snapshot ID. If you specify a
     *        snapshot ID, the snapshot size is used for the volume size by default. You can optionally specify a volume
     *        size greater than or equal to the snapshot size. This parameter maps 1:1 with the <code>Size</code>
     *        parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.</p>
     *        <p>
     *        The following are the supported volume size values for each volume type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> and <code>io2</code>: 4-16,384
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
     */

    public void setSizeInGiB(Integer sizeInGiB) {
        this.sizeInGiB = sizeInGiB;
    }

    /**
     * <p>
     * The size of the volume in GiB. You must specify either a volume size or a snapshot ID. If you specify a snapshot
     * ID, the snapshot size is used for the volume size by default. You can optionally specify a volume size greater
     * than or equal to the snapshot size. This parameter maps 1:1 with the <code>Size</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <p>
     * The following are the supported volume size values for each volume type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
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
     * 
     * @return The size of the volume in GiB. You must specify either a volume size or a snapshot ID. If you specify a
     *         snapshot ID, the snapshot size is used for the volume size by default. You can optionally specify a
     *         volume size greater than or equal to the snapshot size. This parameter maps 1:1 with the
     *         <code>Size</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *         in the <i>Amazon EC2 API Reference</i>.</p>
     *         <p>
     *         The following are the supported volume size values for each volume type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gp2</code> and <code>gp3</code>: 1-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code> and <code>io2</code>: 4-16,384
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
     */

    public Integer getSizeInGiB() {
        return this.sizeInGiB;
    }

    /**
     * <p>
     * The size of the volume in GiB. You must specify either a volume size or a snapshot ID. If you specify a snapshot
     * ID, the snapshot size is used for the volume size by default. You can optionally specify a volume size greater
     * than or equal to the snapshot size. This parameter maps 1:1 with the <code>Size</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <p>
     * The following are the supported volume size values for each volume type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
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
     * 
     * @param sizeInGiB
     *        The size of the volume in GiB. You must specify either a volume size or a snapshot ID. If you specify a
     *        snapshot ID, the snapshot size is used for the volume size by default. You can optionally specify a volume
     *        size greater than or equal to the snapshot size. This parameter maps 1:1 with the <code>Size</code>
     *        parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.</p>
     *        <p>
     *        The following are the supported volume size values for each volume type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> and <code>io2</code>: 4-16,384
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withSizeInGiB(Integer sizeInGiB) {
        setSizeInGiB(sizeInGiB);
        return this;
    }

    /**
     * <p>
     * The snapshot that Amazon ECS uses to create the volume. You must specify either a snapshot ID or a volume size.
     * This parameter maps 1:1 with the <code>SnapshotId</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot that Amazon ECS uses to create the volume. You must specify either a snapshot ID or a volume
     *        size. This parameter maps 1:1 with the <code>SnapshotId</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot that Amazon ECS uses to create the volume. You must specify either a snapshot ID or a volume size.
     * This parameter maps 1:1 with the <code>SnapshotId</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return The snapshot that Amazon ECS uses to create the volume. You must specify either a snapshot ID or a volume
     *         size. This parameter maps 1:1 with the <code>SnapshotId</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *         in the <i>Amazon EC2 API Reference</i>.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot that Amazon ECS uses to create the volume. You must specify either a snapshot ID or a volume size.
     * This parameter maps 1:1 with the <code>SnapshotId</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot that Amazon ECS uses to create the volume. You must specify either a snapshot ID or a volume
     *        size. This parameter maps 1:1 with the <code>SnapshotId</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000 - 16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100 - 64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100 - 256,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is required for <code>io1</code> and <code>io2</code> volume types. The default for
     * <code>gp3</code> volumes is <code>3,000 IOPS</code>. This parameter is not supported for <code>st1</code>,
     * <code>sc1</code>, or <code>standard</code> volume types.
     * </p>
     * <p>
     * This parameter maps 1:1 with the <code>Iops</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and
     *        <code>io2</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     *        <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the
     *        volume accumulates I/O credits for bursting.</p>
     *        <p>
     *        The following are the supported values for each volume type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp3</code>: 3,000 - 16,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 100 - 64,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io2</code>: 100 - 256,000 IOPS
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is required for <code>io1</code> and <code>io2</code> volume types. The default for
     *        <code>gp3</code> volumes is <code>3,000 IOPS</code>. This parameter is not supported for <code>st1</code>,
     *        <code>sc1</code>, or <code>standard</code> volume types.
     *        </p>
     *        <p>
     *        This parameter maps 1:1 with the <code>Iops</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000 - 16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100 - 64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100 - 256,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is required for <code>io1</code> and <code>io2</code> volume types. The default for
     * <code>gp3</code> volumes is <code>3,000 IOPS</code>. This parameter is not supported for <code>st1</code>,
     * <code>sc1</code>, or <code>standard</code> volume types.
     * </p>
     * <p>
     * This parameter maps 1:1 with the <code>Iops</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and
     *         <code>io2</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     *         <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which
     *         the volume accumulates I/O credits for bursting.</p>
     *         <p>
     *         The following are the supported values for each volume type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gp3</code>: 3,000 - 16,000 IOPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code>: 100 - 64,000 IOPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io2</code>: 100 - 256,000 IOPS
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This parameter is required for <code>io1</code> and <code>io2</code> volume types. The default for
     *         <code>gp3</code> volumes is <code>3,000 IOPS</code>. This parameter is not supported for <code>st1</code>, <code>sc1</code>, or <code>standard</code> volume types.
     *         </p>
     *         <p>
     *         This parameter maps 1:1 with the <code>Iops</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *         in the <i>Amazon EC2 API Reference</i>.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000 - 16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100 - 64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100 - 256,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is required for <code>io1</code> and <code>io2</code> volume types. The default for
     * <code>gp3</code> volumes is <code>3,000 IOPS</code>. This parameter is not supported for <code>st1</code>,
     * <code>sc1</code>, or <code>standard</code> volume types.
     * </p>
     * <p>
     * This parameter maps 1:1 with the <code>Iops</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and
     *        <code>io2</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     *        <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the
     *        volume accumulates I/O credits for bursting.</p>
     *        <p>
     *        The following are the supported values for each volume type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp3</code>: 3,000 - 16,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 100 - 64,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io2</code>: 100 - 256,000 IOPS
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is required for <code>io1</code> and <code>io2</code> volume types. The default for
     *        <code>gp3</code> volumes is <code>3,000 IOPS</code>. This parameter is not supported for <code>st1</code>,
     *        <code>sc1</code>, or <code>standard</code> volume types.
     *        </p>
     *        <p>
     *        This parameter maps 1:1 with the <code>Iops</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s. This parameter maps 1:1 with
     * the <code>Throughput</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <important>
     * <p>
     * This parameter is only supported for the <code>gp3</code> volume type.
     * </p>
     * </important>
     * 
     * @param throughput
     *        The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s. This parameter maps 1:1
     *        with the <code>Throughput</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.</p> <important>
     *        <p>
     *        This parameter is only supported for the <code>gp3</code> volume type.
     *        </p>
     */

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s. This parameter maps 1:1 with
     * the <code>Throughput</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <important>
     * <p>
     * This parameter is only supported for the <code>gp3</code> volume type.
     * </p>
     * </important>
     * 
     * @return The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s. This parameter maps
     *         1:1 with the <code>Throughput</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *         in the <i>Amazon EC2 API Reference</i>.</p> <important>
     *         <p>
     *         This parameter is only supported for the <code>gp3</code> volume type.
     *         </p>
     */

    public Integer getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s. This parameter maps 1:1 with
     * the <code>Throughput</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <important>
     * <p>
     * This parameter is only supported for the <code>gp3</code> volume type.
     * </p>
     * </important>
     * 
     * @param throughput
     *        The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s. This parameter maps 1:1
     *        with the <code>Throughput</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.</p> <important>
     *        <p>
     *        This parameter is only supported for the <code>gp3</code> volume type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withThroughput(Integer throughput) {
        setThroughput(throughput);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the volume. Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with
     * the <code>TagSpecifications.N</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return The tags to apply to the volume. Amazon ECS applies service-managed tags by default. This parameter maps
     *         1:1 with the <code>TagSpecifications.N</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *         in the <i>Amazon EC2 API Reference</i>.
     */

    public java.util.List<EBSTagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<EBSTagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the volume. Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with
     * the <code>TagSpecifications.N</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the volume. Amazon ECS applies service-managed tags by default. This parameter maps
     *        1:1 with the <code>TagSpecifications.N</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.
     */

    public void setTagSpecifications(java.util.Collection<EBSTagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<EBSTagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the volume. Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with
     * the <code>TagSpecifications.N</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the volume. Amazon ECS applies service-managed tags by default. This parameter maps
     *        1:1 with the <code>TagSpecifications.N</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withTagSpecifications(EBSTagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<EBSTagSpecification>(tagSpecifications.length));
        }
        for (EBSTagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the volume. Amazon ECS applies service-managed tags by default. This parameter maps 1:1 with
     * the <code>TagSpecifications.N</code> parameter of the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a> in the
     * <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the volume. Amazon ECS applies service-managed tags by default. This parameter maps
     *        1:1 with the <code>TagSpecifications.N</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html">CreateVolume API</a>
     *        in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withTagSpecifications(java.util.Collection<EBSTagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role to associate with this volume. This is the Amazon ECS infrastructure IAM role that is
     * used to manage your Amazon Web Services infrastructure. We recommend using the Amazon ECS-managed
     * <code>AmazonECSInfrastructureRolePolicyForVolumes</code> IAM policy with this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html">Amazon ECS
     * infrastructure IAM role</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to associate with this volume. This is the Amazon ECS infrastructure IAM role that
     *        is used to manage your Amazon Web Services infrastructure. We recommend using the Amazon ECS-managed
     *        <code>AmazonECSInfrastructureRolePolicyForVolumes</code> IAM policy with this role. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html">Amazon ECS
     *        infrastructure IAM role</a> in the <i>Amazon ECS Developer Guide</i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to associate with this volume. This is the Amazon ECS infrastructure IAM role that is
     * used to manage your Amazon Web Services infrastructure. We recommend using the Amazon ECS-managed
     * <code>AmazonECSInfrastructureRolePolicyForVolumes</code> IAM policy with this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html">Amazon ECS
     * infrastructure IAM role</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * 
     * @return The ARN of the IAM role to associate with this volume. This is the Amazon ECS infrastructure IAM role
     *         that is used to manage your Amazon Web Services infrastructure. We recommend using the Amazon ECS-managed
     *         <code>AmazonECSInfrastructureRolePolicyForVolumes</code> IAM policy with this role. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html">Amazon
     *         ECS infrastructure IAM role</a> in the <i>Amazon ECS Developer Guide</i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to associate with this volume. This is the Amazon ECS infrastructure IAM role that is
     * used to manage your Amazon Web Services infrastructure. We recommend using the Amazon ECS-managed
     * <code>AmazonECSInfrastructureRolePolicyForVolumes</code> IAM policy with this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html">Amazon ECS
     * infrastructure IAM role</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to associate with this volume. This is the Amazon ECS infrastructure IAM role that
     *        is used to manage your Amazon Web Services infrastructure. We recommend using the Amazon ECS-managed
     *        <code>AmazonECSInfrastructureRolePolicyForVolumes</code> IAM policy with this role. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/infrastructure_IAM_role.html">Amazon ECS
     *        infrastructure IAM role</a> in the <i>Amazon ECS Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The termination policy for the volume when the task exits. This provides a way to control whether Amazon ECS
     * terminates the Amazon EBS volume when the task stops.
     * </p>
     * 
     * @param terminationPolicy
     *        The termination policy for the volume when the task exits. This provides a way to control whether Amazon
     *        ECS terminates the Amazon EBS volume when the task stops.
     */

    public void setTerminationPolicy(TaskManagedEBSVolumeTerminationPolicy terminationPolicy) {
        this.terminationPolicy = terminationPolicy;
    }

    /**
     * <p>
     * The termination policy for the volume when the task exits. This provides a way to control whether Amazon ECS
     * terminates the Amazon EBS volume when the task stops.
     * </p>
     * 
     * @return The termination policy for the volume when the task exits. This provides a way to control whether Amazon
     *         ECS terminates the Amazon EBS volume when the task stops.
     */

    public TaskManagedEBSVolumeTerminationPolicy getTerminationPolicy() {
        return this.terminationPolicy;
    }

    /**
     * <p>
     * The termination policy for the volume when the task exits. This provides a way to control whether Amazon ECS
     * terminates the Amazon EBS volume when the task stops.
     * </p>
     * 
     * @param terminationPolicy
     *        The termination policy for the volume when the task exits. This provides a way to control whether Amazon
     *        ECS terminates the Amazon EBS volume when the task stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeConfiguration withTerminationPolicy(TaskManagedEBSVolumeTerminationPolicy terminationPolicy) {
        setTerminationPolicy(terminationPolicy);
        return this;
    }

    /**
     * <p>
     * The Linux filesystem type for the volume. For volumes created from a snapshot, you must specify the same
     * filesystem type that the volume was using when the snapshot was created. If there is a filesystem type mismatch,
     * the task will fail to start.
     * </p>
     * <p>
     * The available filesystem types are&#x2028; <code>ext3</code>, <code>ext4</code>, and <code>xfs</code>. If no
     * value is specified, the <code>xfs</code> filesystem type is used by default.
     * </p>
     * 
     * @param filesystemType
     *        The Linux filesystem type for the volume. For volumes created from a snapshot, you must specify the same
     *        filesystem type that the volume was using when the snapshot was created. If there is a filesystem type
     *        mismatch, the task will fail to start.</p>
     *        <p>
     *        The available filesystem types are&#x2028; <code>ext3</code>, <code>ext4</code>, and <code>xfs</code>. If
     *        no value is specified, the <code>xfs</code> filesystem type is used by default.
     * @see TaskFilesystemType
     */

    public void setFilesystemType(String filesystemType) {
        this.filesystemType = filesystemType;
    }

    /**
     * <p>
     * The Linux filesystem type for the volume. For volumes created from a snapshot, you must specify the same
     * filesystem type that the volume was using when the snapshot was created. If there is a filesystem type mismatch,
     * the task will fail to start.
     * </p>
     * <p>
     * The available filesystem types are&#x2028; <code>ext3</code>, <code>ext4</code>, and <code>xfs</code>. If no
     * value is specified, the <code>xfs</code> filesystem type is used by default.
     * </p>
     * 
     * @return The Linux filesystem type for the volume. For volumes created from a snapshot, you must specify the same
     *         filesystem type that the volume was using when the snapshot was created. If there is a filesystem type
     *         mismatch, the task will fail to start.</p>
     *         <p>
     *         The available filesystem types are&#x2028; <code>ext3</code>, <code>ext4</code>, and <code>xfs</code>. If
     *         no value is specified, the <code>xfs</code> filesystem type is used by default.
     * @see TaskFilesystemType
     */

    public String getFilesystemType() {
        return this.filesystemType;
    }

    /**
     * <p>
     * The Linux filesystem type for the volume. For volumes created from a snapshot, you must specify the same
     * filesystem type that the volume was using when the snapshot was created. If there is a filesystem type mismatch,
     * the task will fail to start.
     * </p>
     * <p>
     * The available filesystem types are&#x2028; <code>ext3</code>, <code>ext4</code>, and <code>xfs</code>. If no
     * value is specified, the <code>xfs</code> filesystem type is used by default.
     * </p>
     * 
     * @param filesystemType
     *        The Linux filesystem type for the volume. For volumes created from a snapshot, you must specify the same
     *        filesystem type that the volume was using when the snapshot was created. If there is a filesystem type
     *        mismatch, the task will fail to start.</p>
     *        <p>
     *        The available filesystem types are&#x2028; <code>ext3</code>, <code>ext4</code>, and <code>xfs</code>. If
     *        no value is specified, the <code>xfs</code> filesystem type is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskFilesystemType
     */

    public TaskManagedEBSVolumeConfiguration withFilesystemType(String filesystemType) {
        setFilesystemType(filesystemType);
        return this;
    }

    /**
     * <p>
     * The Linux filesystem type for the volume. For volumes created from a snapshot, you must specify the same
     * filesystem type that the volume was using when the snapshot was created. If there is a filesystem type mismatch,
     * the task will fail to start.
     * </p>
     * <p>
     * The available filesystem types are&#x2028; <code>ext3</code>, <code>ext4</code>, and <code>xfs</code>. If no
     * value is specified, the <code>xfs</code> filesystem type is used by default.
     * </p>
     * 
     * @param filesystemType
     *        The Linux filesystem type for the volume. For volumes created from a snapshot, you must specify the same
     *        filesystem type that the volume was using when the snapshot was created. If there is a filesystem type
     *        mismatch, the task will fail to start.</p>
     *        <p>
     *        The available filesystem types are&#x2028; <code>ext3</code>, <code>ext4</code>, and <code>xfs</code>. If
     *        no value is specified, the <code>xfs</code> filesystem type is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskFilesystemType
     */

    public TaskManagedEBSVolumeConfiguration withFilesystemType(TaskFilesystemType filesystemType) {
        this.filesystemType = filesystemType.toString();
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
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getSizeInGiB() != null)
            sb.append("SizeInGiB: ").append(getSizeInGiB()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTerminationPolicy() != null)
            sb.append("TerminationPolicy: ").append(getTerminationPolicy()).append(",");
        if (getFilesystemType() != null)
            sb.append("FilesystemType: ").append(getFilesystemType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskManagedEBSVolumeConfiguration == false)
            return false;
        TaskManagedEBSVolumeConfiguration other = (TaskManagedEBSVolumeConfiguration) obj;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getSizeInGiB() == null ^ this.getSizeInGiB() == null)
            return false;
        if (other.getSizeInGiB() != null && other.getSizeInGiB().equals(this.getSizeInGiB()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTerminationPolicy() == null ^ this.getTerminationPolicy() == null)
            return false;
        if (other.getTerminationPolicy() != null && other.getTerminationPolicy().equals(this.getTerminationPolicy()) == false)
            return false;
        if (other.getFilesystemType() == null ^ this.getFilesystemType() == null)
            return false;
        if (other.getFilesystemType() != null && other.getFilesystemType().equals(this.getFilesystemType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getSizeInGiB() == null) ? 0 : getSizeInGiB().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTerminationPolicy() == null) ? 0 : getTerminationPolicy().hashCode());
        hashCode = prime * hashCode + ((getFilesystemType() == null) ? 0 : getFilesystemType().hashCode());
        return hashCode;
    }

    @Override
    public TaskManagedEBSVolumeConfiguration clone() {
        try {
            return (TaskManagedEBSVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.TaskManagedEBSVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

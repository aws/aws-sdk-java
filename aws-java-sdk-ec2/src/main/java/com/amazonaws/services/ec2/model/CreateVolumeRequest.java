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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVolumeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateVolume.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVolumeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVolumeRequest> {

    /**
     * <p>
     * The Availability Zone in which to create the volume. Use <a>DescribeAvailabilityZones</a> to list the
     * Availability Zones that are currently available to you.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to instances
     * that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     * encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or vice versa. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the volume, with a maximum ratio of 50 IOPS/GiB.
     * Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instances</a>. Other instance families guarantee performance up to 32,000 IOPS. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted volume. This parameter is only required if you want to use a non-default CMK; if this parameter is not
     * specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     * flag must also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the
     * AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     * CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete even
     * though you provided an invalid identifier. The action will eventually fail.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>, 500-16,384 for <code>st1</code>,
     * 500-16,384 for <code>sc1</code>, and 1-1,024 for <code>standard</code>. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * <note>
     * <p>
     * At least one of Size or SnapshotId are required.
     * </p>
     * </note>
     */
    private Integer size;
    /**
     * <p>
     * The snapshot from which to create the volume.
     * </p>
     * <note>
     * <p>
     * At least one of Size or SnapshotId are required.
     * </p>
     * </note>
     */
    private String snapshotId;
    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * <p>
     * Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     * eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1, ap-southeast-2,
     * ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to <code>gp2</code>.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

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
     *        Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>, 500-16,384 for <code>st1</code>
     *        , 500-16,384 for <code>sc1</code>, and 1-1,024 for <code>standard</code>. If you specify a snapshot, the
     *        volume size must be equal to or larger than the snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     *        </p>
     *        <note>
     *        <p>
     *        At least one of Size or SnapshotId are required.
     *        </p>
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
     *        The snapshot from which to create the volume.</p> <note>
     *        <p>
     *        At least one of Size or SnapshotId are required.
     *        </p>
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
     * Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to instances
     * that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically
     * encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or vice versa. If your AMI
     * uses encrypted volumes, you can only launch it on supported instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to
     *        instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are
     *        automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or
     *        vice versa. If your AMI uses encrypted volumes, you can only launch it on supported instance types. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to
     *         instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or
     *         vice versa. If your AMI uses encrypted volumes, you can only launch it on supported instance types. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to
     *        instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are
     *        automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or
     *        vice versa. If your AMI uses encrypted volumes, you can only launch it on supported instance types. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the volume should be encrypted. Encrypted Amazon EBS volumes may only be attached to
     *         instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are
     *         automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or
     *         vice versa. If your AMI uses encrypted volumes, you can only launch it on supported instance types. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the volume, with a maximum ratio of 50 IOPS/GiB.
     * Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instances</a>. Other instance families guarantee performance up to 32,000 IOPS. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) to provision for the volume, with a maximum ratio of 50
     *        IOPS/GiB. Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed
     *        only on <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Nitro-based instances</a>. Other instance families guarantee performance up to 32,000 IOPS. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     *        EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the volume, with a maximum ratio of 50 IOPS/GiB.
     * Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instances</a>. Other instance families guarantee performance up to 32,000 IOPS. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS) to provision for the volume, with a maximum ratio of 50
     *         IOPS/GiB. Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed
     *         only on <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instances</a>. Other instance families guarantee performance up to 32,000 IOPS. For more
     *         information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     *         EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) to provision for the volume, with a maximum ratio of 50 IOPS/GiB.
     * Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Nitro-based
     * instances</a>. Other instance families guarantee performance up to 32,000 IOPS. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) to provision for the volume, with a maximum ratio of 50
     *        IOPS/GiB. Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed
     *        only on <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Nitro-based instances</a>. Other instance families guarantee performance up to 32,000 IOPS. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon
     *        EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted volume. This parameter is only required if you want to use a non-default CMK; if this parameter is not
     * specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     * flag must also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the
     * AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     * CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete even
     * though you provided an invalid identifier. The action will eventually fail.
     * </p>
     * 
     * @param kmsKeyId
     *        An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating
     *        the encrypted volume. This parameter is only required if you want to use a non-default CMK; if this
     *        parameter is not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     *        <code>Encrypted</code> flag must also be set. </p>
     *        <p>
     *        The CMK identifier may be provided in any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     *        CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     *        example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of
     *        the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     *        example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region
     *        of the CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias.
     *        For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete
     *        even though you provided an invalid identifier. The action will eventually fail.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted volume. This parameter is only required if you want to use a non-default CMK; if this parameter is not
     * specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     * flag must also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the
     * AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     * CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete even
     * though you provided an invalid identifier. The action will eventually fail.
     * </p>
     * 
     * @return An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating
     *         the encrypted volume. This parameter is only required if you want to use a non-default CMK; if this
     *         parameter is not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     *         <code>Encrypted</code> flag must also be set. </p>
     *         <p>
     *         The CMK identifier may be provided in any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     *         CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     *         example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of
     *         the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     *         example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the
     *         region of the CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the
     *         CMK alias. For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete
     *         even though you provided an invalid identifier. The action will eventually fail.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the
     * encrypted volume. This parameter is only required if you want to use a non-default CMK; if this parameter is not
     * specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     * flag must also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK, the
     * AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     * CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete even
     * though you provided an invalid identifier. The action will eventually fail.
     * </p>
     * 
     * @param kmsKeyId
     *        An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating
     *        the encrypted volume. This parameter is only required if you want to use a non-default CMK; if this
     *        parameter is not specified, the default CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     *        <code>Encrypted</code> flag must also be set. </p>
     *        <p>
     *        The CMK identifier may be provided in any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of the
     *        CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     *        example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code> namespace, followed by the region of
     *        the CMK, the AWS account ID of the CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     *        example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace, followed by the region
     *        of the CMK, the AWS account ID of the CMK owner, the <code>alias</code> namespace, and then the CMK alias.
     *        For example, arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action you call may appear to complete
     *        even though you provided an invalid identifier. The action will eventually fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>, 500-16,384 for <code>st1</code>,
     * 500-16,384 for <code>sc1</code>, and 1-1,024 for <code>standard</code>. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * <note>
     * <p>
     * At least one of Size or SnapshotId are required.
     * </p>
     * </note>
     * 
     * @param size
     *        The size of the volume, in GiBs.</p>
     *        <p>
     *        Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>, 500-16,384 for <code>st1</code>
     *        , 500-16,384 for <code>sc1</code>, and 1-1,024 for <code>standard</code>. If you specify a snapshot, the
     *        volume size must be equal to or larger than the snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     *        </p>
     *        <note>
     *        <p>
     *        At least one of Size or SnapshotId are required.
     *        </p>
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>, 500-16,384 for <code>st1</code>,
     * 500-16,384 for <code>sc1</code>, and 1-1,024 for <code>standard</code>. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * <note>
     * <p>
     * At least one of Size or SnapshotId are required.
     * </p>
     * </note>
     * 
     * @return The size of the volume, in GiBs.</p>
     *         <p>
     *         Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>, 500-16,384 for
     *         <code>st1</code>, 500-16,384 for <code>sc1</code>, and 1-1,024 for <code>standard</code>. If you specify
     *         a snapshot, the volume size must be equal to or larger than the snapshot size.
     *         </p>
     *         <p>
     *         Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is
     *         the snapshot size.
     *         </p>
     *         <note>
     *         <p>
     *         At least one of Size or SnapshotId are required.
     *         </p>
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>, 500-16,384 for <code>st1</code>,
     * 500-16,384 for <code>sc1</code>, and 1-1,024 for <code>standard</code>. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     * snapshot size.
     * </p>
     * <note>
     * <p>
     * At least one of Size or SnapshotId are required.
     * </p>
     * </note>
     * 
     * @param size
     *        The size of the volume, in GiBs.</p>
     *        <p>
     *        Constraints: 1-16,384 for <code>gp2</code>, 4-16,384 for <code>io1</code>, 500-16,384 for <code>st1</code>
     *        , 500-16,384 for <code>sc1</code>, and 1-1,024 for <code>standard</code>. If you specify a snapshot, the
     *        volume size must be equal to or larger than the snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the
     *        snapshot size.
     *        </p>
     *        <note>
     *        <p>
     *        At least one of Size or SnapshotId are required.
     *        </p>
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
     * <note>
     * <p>
     * At least one of Size or SnapshotId are required.
     * </p>
     * </note>
     * 
     * @param snapshotId
     *        The snapshot from which to create the volume.</p> <note>
     *        <p>
     *        At least one of Size or SnapshotId are required.
     *        </p>
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot from which to create the volume.
     * </p>
     * <note>
     * <p>
     * At least one of Size or SnapshotId are required.
     * </p>
     * </note>
     * 
     * @return The snapshot from which to create the volume.</p> <note>
     *         <p>
     *         At least one of Size or SnapshotId are required.
     *         </p>
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot from which to create the volume.
     * </p>
     * <note>
     * <p>
     * At least one of Size or SnapshotId are required.
     * </p>
     * </note>
     * 
     * @param snapshotId
     *        The snapshot from which to create the volume.</p> <note>
     *        <p>
     *        At least one of Size or SnapshotId are required.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * <p>
     * Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     * eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1, ap-southeast-2,
     * ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to <code>gp2</code>.
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     *        eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1,
     *        ap-southeast-2, ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to
     *        <code>gp2</code>.
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
     * Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     * eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1, ap-southeast-2,
     * ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to <code>gp2</code>.
     * </p>
     * 
     * @return The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *         IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes.</p>
     *         <p>
     *         Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     *         eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1,
     *         ap-southeast-2, ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to
     *         <code>gp2</code>.
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
     * Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     * eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1, ap-southeast-2,
     * ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to <code>gp2</code>.
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     *        eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1,
     *        ap-southeast-2, ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to
     *        <code>gp2</code>.
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
     * Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     * eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1, ap-southeast-2,
     * ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to <code>gp2</code>.
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     *        eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1,
     *        ap-southeast-2, ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to
     *        <code>gp2</code>.
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        withVolumeType(volumeType);
    }

    /**
     * <p>
     * The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD,
     * <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * <p>
     * Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     * eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1, ap-southeast-2,
     * ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to <code>gp2</code>.
     * </p>
     * 
     * @param volumeType
     *        The volume type. This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Defaults: If no volume type is specified, the default is <code>standard</code> in us-east-1, eu-west-1,
     *        eu-central-1, us-west-2, us-west-1, sa-east-1, ap-northeast-1, ap-northeast-2, ap-southeast-1,
     *        ap-southeast-2, ap-south-1, us-gov-west-1, and cn-north-1. In all other Regions, EBS defaults to
     *        <code>gp2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public CreateVolumeRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * 
     * @return The tags to apply to the volume during creation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the volume during creation.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the volume during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the volume during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
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
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateVolumeRequest clone() {
        return (CreateVolumeRequest) super.clone();
    }
}

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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A JSON object containing one or more of the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateStorediSCSIVolumeInput$DiskId</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateStorediSCSIVolumeInput$PreserveExistingData</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateStorediSCSIVolumeInput$SnapshotId</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateStorediSCSIVolumeInput$TargetName</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateStorediSCSIVolume"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStorediSCSIVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html">ListLocalDisks</a> to
     * list disk IDs for a gateway.
     * </p>
     */
    private String diskId;
    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this field if
     * you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list
     * snapshots for your account use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this field
     * as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     */
    private Boolean preserveExistingData;
    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN.
     * For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new
     * target name.
     * </p>
     */
    private String targetName;
    /**
     * <p>
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use
     * <a>DescribeGatewayInformation</a> to get a list of the network interfaces available on a gateway.
     * </p>
     * <p>
     * Valid Values: A valid IP address.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     */
    private Boolean kMSEncrypted;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can only be
     * set when KMSEncrypted is true. Optional.
     * </p>
     */
    private String kMSKey;
    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html">ListLocalDisks</a> to
     * list disk IDs for a gateway.
     * </p>
     * 
     * @param diskId
     *        The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     *        href="https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     *        >ListLocalDisks</a> to list disk IDs for a gateway.
     */

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html">ListLocalDisks</a> to
     * list disk IDs for a gateway.
     * </p>
     * 
     * @return The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     *         href="https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     *         >ListLocalDisks</a> to list disk IDs for a gateway.
     */

    public String getDiskId() {
        return this.diskId;
    }

    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html">ListLocalDisks</a> to
     * list disk IDs for a gateway.
     * </p>
     * 
     * @param diskId
     *        The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     *        href="https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     *        >ListLocalDisks</a> to list disk IDs for a gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withDiskId(String diskId) {
        setDiskId(diskId);
        return this;
    }

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this field if
     * you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list
     * snapshots for your account use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this
     *        field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field.
     *        To list snapshots for your account use <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     *        >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this field if
     * you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list
     * snapshots for your account use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * 
     * @return The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this
     *         field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field.
     *         To list snapshots for your account use <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     *         >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this field if
     * you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list
     * snapshots for your account use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this
     *        field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field.
     *        To list snapshots for your account use <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     *        >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this field
     * as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * 
     * @param preserveExistingData
     *        Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this
     *        field as false creates an empty volume.</p>
     *        <p>
     *        Valid Values: true, false
     */

    public void setPreserveExistingData(Boolean preserveExistingData) {
        this.preserveExistingData = preserveExistingData;
    }

    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this field
     * as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * 
     * @return Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this
     *         field as false creates an empty volume.</p>
     *         <p>
     *         Valid Values: true, false
     */

    public Boolean getPreserveExistingData() {
        return this.preserveExistingData;
    }

    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this field
     * as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * 
     * @param preserveExistingData
     *        Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this
     *        field as false creates an empty volume.</p>
     *        <p>
     *        Valid Values: true, false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withPreserveExistingData(Boolean preserveExistingData) {
        setPreserveExistingData(preserveExistingData);
        return this;
    }

    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this field
     * as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * 
     * @return Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this
     *         field as false creates an empty volume.</p>
     *         <p>
     *         Valid Values: true, false
     */

    public Boolean isPreserveExistingData() {
        return this.preserveExistingData;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN.
     * For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new
     * target name.
     * </p>
     * 
     * @param targetName
     *        The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the
     *        target ARN. For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     *        of
     *        <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *        . The target name must be unique across all volumes on a gateway.</p>
     *        <p>
     *        If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as
     *        the new target name.
     */

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN.
     * For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new
     * target name.
     * </p>
     * 
     * @return The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the
     *         target ARN. For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     *         of
     *         <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *         . The target name must be unique across all volumes on a gateway.</p>
     *         <p>
     *         If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as
     *         the new target name.
     */

    public String getTargetName() {
        return this.targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN.
     * For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new
     * target name.
     * </p>
     * 
     * @param targetName
     *        The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the
     *        target ARN. For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     *        of
     *        <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *        . The target name must be unique across all volumes on a gateway.</p>
     *        <p>
     *        If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as
     *        the new target name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withTargetName(String targetName) {
        setTargetName(targetName);
        return this;
    }

    /**
     * <p>
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use
     * <a>DescribeGatewayInformation</a> to get a list of the network interfaces available on a gateway.
     * </p>
     * <p>
     * Valid Values: A valid IP address.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are
     *        accepted. Use <a>DescribeGatewayInformation</a> to get a list of the network interfaces available on a
     *        gateway.</p>
     *        <p>
     *        Valid Values: A valid IP address.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use
     * <a>DescribeGatewayInformation</a> to get a list of the network interfaces available on a gateway.
     * </p>
     * <p>
     * Valid Values: A valid IP address.
     * </p>
     * 
     * @return The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are
     *         accepted. Use <a>DescribeGatewayInformation</a> to get a list of the network interfaces available on a
     *         gateway.</p>
     *         <p>
     *         Valid Values: A valid IP address.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use
     * <a>DescribeGatewayInformation</a> to get a list of the network interfaces available on a gateway.
     * </p>
     * <p>
     * Valid Values: A valid IP address.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are
     *        accepted. Use <a>DescribeGatewayInformation</a> to get a list of the network interfaces available on a
     *        gateway.</p>
     *        <p>
     *        Valid Values: A valid IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     */

    public void setKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean getKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withKMSEncrypted(Boolean kMSEncrypted) {
        setKMSEncrypted(kMSEncrypted);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean isKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can only be
     * set when KMSEncrypted is true. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can
     *        only be set when KMSEncrypted is true. Optional.
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can only be
     * set when KMSEncrypted is true. Optional.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can
     *         only be set when KMSEncrypted is true. Optional.
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can only be
     * set when KMSEncrypted is true. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can
     *        only be set when KMSEncrypted is true. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @return A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.</p> <note>
     *         <p>
     *         Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and
     *         the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters,
     *         and the maximum length for a tag's value is 256.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
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
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withTags(Tag... tags) {
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
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorediSCSIVolumeRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getDiskId() != null)
            sb.append("DiskId: ").append(getDiskId()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getPreserveExistingData() != null)
            sb.append("PreserveExistingData: ").append(getPreserveExistingData()).append(",");
        if (getTargetName() != null)
            sb.append("TargetName: ").append(getTargetName()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
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

        if (obj instanceof CreateStorediSCSIVolumeRequest == false)
            return false;
        CreateStorediSCSIVolumeRequest other = (CreateStorediSCSIVolumeRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskId() == null ^ this.getDiskId() == null)
            return false;
        if (other.getDiskId() != null && other.getDiskId().equals(this.getDiskId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getPreserveExistingData() == null ^ this.getPreserveExistingData() == null)
            return false;
        if (other.getPreserveExistingData() != null && other.getPreserveExistingData().equals(this.getPreserveExistingData()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getKMSEncrypted() == null ^ this.getKMSEncrypted() == null)
            return false;
        if (other.getKMSEncrypted() != null && other.getKMSEncrypted().equals(this.getKMSEncrypted()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
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

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDiskId() == null) ? 0 : getDiskId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getPreserveExistingData() == null) ? 0 : getPreserveExistingData().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStorediSCSIVolumeRequest clone() {
        return (CreateStorediSCSIVolumeRequest) super.clone();
    }

}

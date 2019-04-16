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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateCachediSCSIVolume"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCachediSCSIVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     */
    private Long volumeSizeInBytes;
    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this field if
     * you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list
     * snapshots for your account use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     */
    private String snapshotId;
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
     * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified
     * existing volume's latest recovery point. The <code>VolumeSizeInBytes</code> value for this new volume must be
     * equal to or larger than the size of the existing volume, in bytes.
     * </p>
     */
    private String sourceVolumeARN;
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
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon
     * S3. Optional.
     * </p>
     */
    private Boolean kMSEncrypted;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only
     * be set when KMSEncrypted is true. Optional.
     * </p>
     */
    private String kMSKey;
    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a cached volume. Each tag is a key-value pair.
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

    public CreateCachediSCSIVolumeRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size of the volume in bytes.
     */

    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * 
     * @return The size of the volume in bytes.
     */

    public Long getVolumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * 
     * @param volumeSizeInBytes
     *        The size of the volume in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withVolumeSizeInBytes(Long volumeSizeInBytes) {
        setVolumeSizeInBytes(volumeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this field if
     * you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list
     * snapshots for your account use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this
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
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this field if
     * you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list
     * snapshots for your account use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * 
     * @return The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this
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
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this field if
     * you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list
     * snapshots for your account use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this
     *        field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field.
     *        To list snapshots for your account use <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     *        >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
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

    public CreateCachediSCSIVolumeRequest withTargetName(String targetName) {
        setTargetName(targetName);
        return this;
    }

    /**
     * <p>
     * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified
     * existing volume's latest recovery point. The <code>VolumeSizeInBytes</code> value for this new volume must be
     * equal to or larger than the size of the existing volume, in bytes.
     * </p>
     * 
     * @param sourceVolumeARN
     *        The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the
     *        specified existing volume's latest recovery point. The <code>VolumeSizeInBytes</code> value for this new
     *        volume must be equal to or larger than the size of the existing volume, in bytes.
     */

    public void setSourceVolumeARN(String sourceVolumeARN) {
        this.sourceVolumeARN = sourceVolumeARN;
    }

    /**
     * <p>
     * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified
     * existing volume's latest recovery point. The <code>VolumeSizeInBytes</code> value for this new volume must be
     * equal to or larger than the size of the existing volume, in bytes.
     * </p>
     * 
     * @return The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the
     *         specified existing volume's latest recovery point. The <code>VolumeSizeInBytes</code> value for this new
     *         volume must be equal to or larger than the size of the existing volume, in bytes.
     */

    public String getSourceVolumeARN() {
        return this.sourceVolumeARN;
    }

    /**
     * <p>
     * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified
     * existing volume's latest recovery point. The <code>VolumeSizeInBytes</code> value for this new volume must be
     * equal to or larger than the size of the existing volume, in bytes.
     * </p>
     * 
     * @param sourceVolumeARN
     *        The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the
     *        specified existing volume's latest recovery point. The <code>VolumeSizeInBytes</code> value for this new
     *        volume must be equal to or larger than the size of the existing volume, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withSourceVolumeARN(String sourceVolumeARN) {
        setSourceVolumeARN(sourceVolumeARN);
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

    public CreateCachediSCSIVolumeRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you use to retry a request. If you retry a request, use the same
     *        <code>ClientToken</code> you specified in the initial request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * 
     * @return A unique identifier that you use to retry a request. If you retry a request, use the same
     *         <code>ClientToken</code> you specified in the initial request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you use to retry a request. If you retry a request, use the same
     *        <code>ClientToken</code> you specified in the initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateCachediSCSIVolumeRequest withKMSEncrypted(Boolean kMSEncrypted) {
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
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only
     * be set when KMSEncrypted is true. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value
     *        can only be set when KMSEncrypted is true. Optional.
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only
     * be set when KMSEncrypted is true. Optional.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value
     *         can only be set when KMSEncrypted is true. Optional.
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only
     * be set when KMSEncrypted is true. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value
     *        can only be set when KMSEncrypted is true. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a cached volume. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @return A list of up to 50 tags that can be assigned to a cached volume. Each tag is a key-value pair.</p> <note>
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
     * A list of up to 50 tags that can be assigned to a cached volume. Each tag is a key-value pair.
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
     *        A list of up to 50 tags that can be assigned to a cached volume. Each tag is a key-value pair.</p> <note>
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
     * A list of up to 50 tags that can be assigned to a cached volume. Each tag is a key-value pair.
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
     *        A list of up to 50 tags that can be assigned to a cached volume. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withTags(Tag... tags) {
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
     * A list of up to 50 tags that can be assigned to a cached volume. Each tag is a key-value pair.
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
     *        A list of up to 50 tags that can be assigned to a cached volume. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: ").append(getVolumeSizeInBytes()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getTargetName() != null)
            sb.append("TargetName: ").append(getTargetName()).append(",");
        if (getSourceVolumeARN() != null)
            sb.append("SourceVolumeARN: ").append(getSourceVolumeARN()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateCachediSCSIVolumeRequest == false)
            return false;
        CreateCachediSCSIVolumeRequest other = (CreateCachediSCSIVolumeRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null)
            return false;
        if (other.getVolumeSizeInBytes() != null && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        if (other.getSourceVolumeARN() == null ^ this.getSourceVolumeARN() == null)
            return false;
        if (other.getSourceVolumeARN() != null && other.getSourceVolumeARN().equals(this.getSourceVolumeARN()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        hashCode = prime * hashCode + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        hashCode = prime * hashCode + ((getSourceVolumeARN() == null) ? 0 : getSourceVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCachediSCSIVolumeRequest clone() {
        return (CreateCachediSCSIVolumeRequest) super.clone();
    }

}

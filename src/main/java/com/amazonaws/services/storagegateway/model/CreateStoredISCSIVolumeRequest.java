/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#createStorediSCSIVolume(CreateStorediSCSIVolumeRequest) CreateStorediSCSIVolume operation}.
 * <p>
 * This operation creates a volume on a specified gateway. The size of the volume is inferred from the disk size. You can choose to preserve existing
 * data on the disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty gateway volume, then any
 * existing data on the disk is erased.
 * </p>
 * <p>
 * In the request you must specify the gateway and the disk information on which you are creating the volume. In response, AWS Storage Gateway creates
 * the volume and returns volume information such as the volume ARN, size and the iSCSI target ARN that initiators can use to connect to the volume
 * target.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#createStorediSCSIVolume(CreateStorediSCSIVolumeRequest)
 */
public class CreateStorediSCSIVolumeRequest extends AmazonWebServiceRequest {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * The unique identifier for the gateway local disk that is configured as
     * a stored volume. Use <a>ListLocalDisks</a> to list disk IDs for a
     * gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String diskId;

    /**
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as
     * the new stored volume. Specify this field if you want to create the
     * iSCSI storage volume from a snapshot otherwise do not include this
     * field. To list snapshots for your account use <a
     * rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     * in the <i>Amazon Elastic Compute Cloud API Reference</i>. <p>Length:
     * 13 <p><i>Valid Values</i>: Must be a valid snapshot ID, "snap-"
     * followed by eight hexadecimal characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     */
    private String snapshotId;

    /**
     * Specify this field as true if you want to preserve the data on the
     * local disk. Otherwise, specifying this field as false creates an empty
     * volume. <p><i>Valid Values</i>: true, false
     */
    private Boolean preserveExistingData;

    /**
     * The name of the iSCSI target used by initiators to connect to the
     * target and as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     * of
     * 111122223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume.
     * The target name must be unique across all volumes of a gateway.
     * <p>Length: Minimum length of 1. Maximum length of 200. <p>Constraints:
     * The name can contain lower case letters, numbers, periods (.), and
     * hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     */
    private String targetName;

    /**
     * The network interface of the gateway on which to expose the iSCSI
     * target. Only IPv4 addresses are accepted. Use
     * <a>DescribeGatewayInformation</a> to get a list of the network
     * interfaces available on a gateway. <p><i>Valid Values</i>: A valid IP
     * address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     */
    private String networkInterfaceId;

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStorediSCSIVolumeRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }
    
    
    /**
     * The unique identifier for the gateway local disk that is configured as
     * a stored volume. Use <a>ListLocalDisks</a> to list disk IDs for a
     * gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return The unique identifier for the gateway local disk that is configured as
     *         a stored volume. Use <a>ListLocalDisks</a> to list disk IDs for a
     *         gateway.
     */
    public String getDiskId() {
        return diskId;
    }
    
    /**
     * The unique identifier for the gateway local disk that is configured as
     * a stored volume. Use <a>ListLocalDisks</a> to list disk IDs for a
     * gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId The unique identifier for the gateway local disk that is configured as
     *         a stored volume. Use <a>ListLocalDisks</a> to list disk IDs for a
     *         gateway.
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }
    
    /**
     * The unique identifier for the gateway local disk that is configured as
     * a stored volume. Use <a>ListLocalDisks</a> to list disk IDs for a
     * gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId The unique identifier for the gateway local disk that is configured as
     *         a stored volume. Use <a>ListLocalDisks</a> to list disk IDs for a
     *         gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStorediSCSIVolumeRequest withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    
    
    /**
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as
     * the new stored volume. Specify this field if you want to create the
     * iSCSI storage volume from a snapshot otherwise do not include this
     * field. To list snapshots for your account use <a
     * rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     * in the <i>Amazon Elastic Compute Cloud API Reference</i>. <p>Length:
     * 13 <p><i>Valid Values</i>: Must be a valid snapshot ID, "snap-"
     * followed by eight hexadecimal characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @return The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as
     *         the new stored volume. Specify this field if you want to create the
     *         iSCSI storage volume from a snapshot otherwise do not include this
     *         field. To list snapshots for your account use <a
     *         rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     *         in the <i>Amazon Elastic Compute Cloud API Reference</i>. <p>Length:
     *         13 <p><i>Valid Values</i>: Must be a valid snapshot ID, "snap-"
     *         followed by eight hexadecimal characters.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as
     * the new stored volume. Specify this field if you want to create the
     * iSCSI storage volume from a snapshot otherwise do not include this
     * field. To list snapshots for your account use <a
     * rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     * in the <i>Amazon Elastic Compute Cloud API Reference</i>. <p>Length:
     * 13 <p><i>Valid Values</i>: Must be a valid snapshot ID, "snap-"
     * followed by eight hexadecimal characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param snapshotId The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as
     *         the new stored volume. Specify this field if you want to create the
     *         iSCSI storage volume from a snapshot otherwise do not include this
     *         field. To list snapshots for your account use <a
     *         rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     *         in the <i>Amazon Elastic Compute Cloud API Reference</i>. <p>Length:
     *         13 <p><i>Valid Values</i>: Must be a valid snapshot ID, "snap-"
     *         followed by eight hexadecimal characters.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as
     * the new stored volume. Specify this field if you want to create the
     * iSCSI storage volume from a snapshot otherwise do not include this
     * field. To list snapshots for your account use <a
     * rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     * in the <i>Amazon Elastic Compute Cloud API Reference</i>. <p>Length:
     * 13 <p><i>Valid Values</i>: Must be a valid snapshot ID, "snap-"
     * followed by eight hexadecimal characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param snapshotId The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as
     *         the new stored volume. Specify this field if you want to create the
     *         iSCSI storage volume from a snapshot otherwise do not include this
     *         field. To list snapshots for your account use <a
     *         rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     *         in the <i>Amazon Elastic Compute Cloud API Reference</i>. <p>Length:
     *         13 <p><i>Valid Values</i>: Must be a valid snapshot ID, "snap-"
     *         followed by eight hexadecimal characters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStorediSCSIVolumeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    
    
    /**
     * Specify this field as true if you want to preserve the data on the
     * local disk. Otherwise, specifying this field as false creates an empty
     * volume. <p><i>Valid Values</i>: true, false
     *
     * @return Specify this field as true if you want to preserve the data on the
     *         local disk. Otherwise, specifying this field as false creates an empty
     *         volume. <p><i>Valid Values</i>: true, false
     */
    public Boolean isPreserveExistingData() {
        return preserveExistingData;
    }
    
    /**
     * Specify this field as true if you want to preserve the data on the
     * local disk. Otherwise, specifying this field as false creates an empty
     * volume. <p><i>Valid Values</i>: true, false
     *
     * @param preserveExistingData Specify this field as true if you want to preserve the data on the
     *         local disk. Otherwise, specifying this field as false creates an empty
     *         volume. <p><i>Valid Values</i>: true, false
     */
    public void setPreserveExistingData(Boolean preserveExistingData) {
        this.preserveExistingData = preserveExistingData;
    }
    
    /**
     * Specify this field as true if you want to preserve the data on the
     * local disk. Otherwise, specifying this field as false creates an empty
     * volume. <p><i>Valid Values</i>: true, false
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preserveExistingData Specify this field as true if you want to preserve the data on the
     *         local disk. Otherwise, specifying this field as false creates an empty
     *         volume. <p><i>Valid Values</i>: true, false
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStorediSCSIVolumeRequest withPreserveExistingData(Boolean preserveExistingData) {
        this.preserveExistingData = preserveExistingData;
        return this;
    }
    
    
    /**
     * Specify this field as true if you want to preserve the data on the
     * local disk. Otherwise, specifying this field as false creates an empty
     * volume. <p><i>Valid Values</i>: true, false
     *
     * @return Specify this field as true if you want to preserve the data on the
     *         local disk. Otherwise, specifying this field as false creates an empty
     *         volume. <p><i>Valid Values</i>: true, false
     */
    public Boolean getPreserveExistingData() {
        return preserveExistingData;
    }
    
    /**
     * The name of the iSCSI target used by initiators to connect to the
     * target and as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     * of
     * 111122223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume.
     * The target name must be unique across all volumes of a gateway.
     * <p>Length: Minimum length of 1. Maximum length of 200. <p>Constraints:
     * The name can contain lower case letters, numbers, periods (.), and
     * hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @return The name of the iSCSI target used by initiators to connect to the
     *         target and as a suffix for the target ARN. For example, specifying
     *         <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     *         of
     *         111122223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume.
     *         The target name must be unique across all volumes of a gateway.
     *         <p>Length: Minimum length of 1. Maximum length of 200. <p>Constraints:
     *         The name can contain lower case letters, numbers, periods (.), and
     *         hyphens (-).
     */
    public String getTargetName() {
        return targetName;
    }
    
    /**
     * The name of the iSCSI target used by initiators to connect to the
     * target and as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     * of
     * 111122223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume.
     * The target name must be unique across all volumes of a gateway.
     * <p>Length: Minimum length of 1. Maximum length of 200. <p>Constraints:
     * The name can contain lower case letters, numbers, periods (.), and
     * hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @param targetName The name of the iSCSI target used by initiators to connect to the
     *         target and as a suffix for the target ARN. For example, specifying
     *         <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     *         of
     *         111122223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume.
     *         The target name must be unique across all volumes of a gateway.
     *         <p>Length: Minimum length of 1. Maximum length of 200. <p>Constraints:
     *         The name can contain lower case letters, numbers, periods (.), and
     *         hyphens (-).
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
    
    /**
     * The name of the iSCSI target used by initiators to connect to the
     * target and as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     * of
     * 111122223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume.
     * The target name must be unique across all volumes of a gateway.
     * <p>Length: Minimum length of 1. Maximum length of 200. <p>Constraints:
     * The name can contain lower case letters, numbers, periods (.), and
     * hyphens (-).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @param targetName The name of the iSCSI target used by initiators to connect to the
     *         target and as a suffix for the target ARN. For example, specifying
     *         <code>TargetName</code> as <i>myvolume</i> results in the target ARN
     *         of
     *         111122223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume.
     *         The target name must be unique across all volumes of a gateway.
     *         <p>Length: Minimum length of 1. Maximum length of 200. <p>Constraints:
     *         The name can contain lower case letters, numbers, periods (.), and
     *         hyphens (-).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStorediSCSIVolumeRequest withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    
    
    /**
     * The network interface of the gateway on which to expose the iSCSI
     * target. Only IPv4 addresses are accepted. Use
     * <a>DescribeGatewayInformation</a> to get a list of the network
     * interfaces available on a gateway. <p><i>Valid Values</i>: A valid IP
     * address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     *
     * @return The network interface of the gateway on which to expose the iSCSI
     *         target. Only IPv4 addresses are accepted. Use
     *         <a>DescribeGatewayInformation</a> to get a list of the network
     *         interfaces available on a gateway. <p><i>Valid Values</i>: A valid IP
     *         address.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * The network interface of the gateway on which to expose the iSCSI
     * target. Only IPv4 addresses are accepted. Use
     * <a>DescribeGatewayInformation</a> to get a list of the network
     * interfaces available on a gateway. <p><i>Valid Values</i>: A valid IP
     * address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId The network interface of the gateway on which to expose the iSCSI
     *         target. Only IPv4 addresses are accepted. Use
     *         <a>DescribeGatewayInformation</a> to get a list of the network
     *         interfaces available on a gateway. <p><i>Valid Values</i>: A valid IP
     *         address.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * The network interface of the gateway on which to expose the iSCSI
     * target. Only IPv4 addresses are accepted. Use
     * <a>DescribeGatewayInformation</a> to get a list of the network
     * interfaces available on a gateway. <p><i>Valid Values</i>: A valid IP
     * address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId The network interface of the gateway on which to expose the iSCSI
     *         target. Only IPv4 addresses are accepted. Use
     *         <a>DescribeGatewayInformation</a> to get a list of the network
     *         interfaces available on a gateway. <p><i>Valid Values</i>: A valid IP
     *         address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStorediSCSIVolumeRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (gatewayARN != null) sb.append("GatewayARN: " + gatewayARN + ", ");
        if (diskId != null) sb.append("DiskId: " + diskId + ", ");
        if (snapshotId != null) sb.append("SnapshotId: " + snapshotId + ", ");
        if (preserveExistingData != null) sb.append("PreserveExistingData: " + preserveExistingData + ", ");
        if (targetName != null) sb.append("TargetName: " + targetName + ", ");
        if (networkInterfaceId != null) sb.append("NetworkInterfaceId: " + networkInterfaceId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getDiskId() == null) ? 0 : getDiskId().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((isPreserveExistingData() == null) ? 0 : isPreserveExistingData().hashCode()); 
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateStorediSCSIVolumeRequest == false) return false;
        CreateStorediSCSIVolumeRequest other = (CreateStorediSCSIVolumeRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getDiskId() == null ^ this.getDiskId() == null) return false;
        if (other.getDiskId() != null && other.getDiskId().equals(this.getDiskId()) == false) return false; 
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.isPreserveExistingData() == null ^ this.isPreserveExistingData() == null) return false;
        if (other.isPreserveExistingData() != null && other.isPreserveExistingData().equals(this.isPreserveExistingData()) == false) return false; 
        if (other.getTargetName() == null ^ this.getTargetName() == null) return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false) return false; 
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        return true;
    }
    
}
    
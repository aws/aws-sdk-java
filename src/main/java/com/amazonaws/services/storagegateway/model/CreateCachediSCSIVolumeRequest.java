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
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#createCachediSCSIVolume(CreateCachediSCSIVolumeRequest) CreateCachediSCSIVolume operation}.
 * <p>
 * This operation creates a cached volume on a specified cached gateway. This operation is supported only for the gateway-cached volume architecture.
 * </p>
 * <p>
 * <b>NOTE:</b>Cache storage must be allocated to the gateway before you can create a cached volume. Use the AddCache operation to add cache storage to a
 * gateway.
 * </p>
 * <p>
 * In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address on which to expose the target, and a
 * unique client token. In response, AWS Storage Gateway creates the volume and returns information about it such as the volume Amazon Resource Name
 * (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#createCachediSCSIVolume(CreateCachediSCSIVolumeRequest)
 */
public class CreateCachediSCSIVolumeRequest extends AmazonWebServiceRequest {

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
     * The size of the cached volume.
     */
    private Long volumeSizeInBytes;

    /**
     * The snapshot ID (e.g., "snap-1122aabb") of the snapshot to restore as
     * the new stored volume. Specify this field if you want to create the
     * iSCSI cached volume from a snapshot; otherwise, do not include this
     * field. To list snapshots for your account, use <a
     * rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     * in Amazon Elastic Compute Cloud API Reference.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     */
    private String snapshotId;

    /**
     * The name of the iSCSI target used by initiators to connect to the
     * target and as a suffix for the target ARN. For example, specifying
     * <b>TargetName</b> as <i>myvolume</i> results in the target ARN of
     * 22223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume</i>.
     * The target name must be unique across all volumes of a gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     */
    private String targetName;

    /**
     * The network interface of the gateway on which to expose the iSCSI
     * target. Only IPv4 addresses are accepted. Use the
     * <a>DescribeGatewayInformation</a> operation to get a list of the
     * network interfaces available on the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     */
    private String networkInterfaceId;

    /**
     * A unique identifying string for the cached volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     */
    private String clientToken;

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
    public CreateCachediSCSIVolumeRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }
    
    
    /**
     * The size of the cached volume.
     *
     * @return The size of the cached volume.
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }
    
    /**
     * The size of the cached volume.
     *
     * @param volumeSizeInBytes The size of the cached volume.
     */
    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }
    
    /**
     * The size of the cached volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSizeInBytes The size of the cached volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCachediSCSIVolumeRequest withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }
    
    
    /**
     * The snapshot ID (e.g., "snap-1122aabb") of the snapshot to restore as
     * the new stored volume. Specify this field if you want to create the
     * iSCSI cached volume from a snapshot; otherwise, do not include this
     * field. To list snapshots for your account, use <a
     * rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     * in Amazon Elastic Compute Cloud API Reference.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @return The snapshot ID (e.g., "snap-1122aabb") of the snapshot to restore as
     *         the new stored volume. Specify this field if you want to create the
     *         iSCSI cached volume from a snapshot; otherwise, do not include this
     *         field. To list snapshots for your account, use <a
     *         rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     *         in Amazon Elastic Compute Cloud API Reference.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The snapshot ID (e.g., "snap-1122aabb") of the snapshot to restore as
     * the new stored volume. Specify this field if you want to create the
     * iSCSI cached volume from a snapshot; otherwise, do not include this
     * field. To list snapshots for your account, use <a
     * rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     * in Amazon Elastic Compute Cloud API Reference.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param snapshotId The snapshot ID (e.g., "snap-1122aabb") of the snapshot to restore as
     *         the new stored volume. Specify this field if you want to create the
     *         iSCSI cached volume from a snapshot; otherwise, do not include this
     *         field. To list snapshots for your account, use <a
     *         rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     *         in Amazon Elastic Compute Cloud API Reference.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The snapshot ID (e.g., "snap-1122aabb") of the snapshot to restore as
     * the new stored volume. Specify this field if you want to create the
     * iSCSI cached volume from a snapshot; otherwise, do not include this
     * field. To list snapshots for your account, use <a
     * rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     * in Amazon Elastic Compute Cloud API Reference.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param snapshotId The snapshot ID (e.g., "snap-1122aabb") of the snapshot to restore as
     *         the new stored volume. Specify this field if you want to create the
     *         iSCSI cached volume from a snapshot; otherwise, do not include this
     *         field. To list snapshots for your account, use <a
     *         rence/ApiReference-query-DescribeSnapshots.html">DescribeSnapshots</a>
     *         in Amazon Elastic Compute Cloud API Reference.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCachediSCSIVolumeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    
    
    /**
     * The name of the iSCSI target used by initiators to connect to the
     * target and as a suffix for the target ARN. For example, specifying
     * <b>TargetName</b> as <i>myvolume</i> results in the target ARN of
     * 22223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume</i>.
     * The target name must be unique across all volumes of a gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @return The name of the iSCSI target used by initiators to connect to the
     *         target and as a suffix for the target ARN. For example, specifying
     *         <b>TargetName</b> as <i>myvolume</i> results in the target ARN of
     *         22223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume</i>.
     *         The target name must be unique across all volumes of a gateway.
     */
    public String getTargetName() {
        return targetName;
    }
    
    /**
     * The name of the iSCSI target used by initiators to connect to the
     * target and as a suffix for the target ARN. For example, specifying
     * <b>TargetName</b> as <i>myvolume</i> results in the target ARN of
     * 22223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume</i>.
     * The target name must be unique across all volumes of a gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @param targetName The name of the iSCSI target used by initiators to connect to the
     *         target and as a suffix for the target ARN. For example, specifying
     *         <b>TargetName</b> as <i>myvolume</i> results in the target ARN of
     *         22223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume</i>.
     *         The target name must be unique across all volumes of a gateway.
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
    
    /**
     * The name of the iSCSI target used by initiators to connect to the
     * target and as a suffix for the target ARN. For example, specifying
     * <b>TargetName</b> as <i>myvolume</i> results in the target ARN of
     * 22223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume</i>.
     * The target name must be unique across all volumes of a gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @param targetName The name of the iSCSI target used by initiators to connect to the
     *         target and as a suffix for the target ARN. For example, specifying
     *         <b>TargetName</b> as <i>myvolume</i> results in the target ARN of
     *         22223333:gateway/mygateway/target/iqn.1997-05.com.amazon:myvolume</i>.
     *         The target name must be unique across all volumes of a gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCachediSCSIVolumeRequest withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    
    
    /**
     * The network interface of the gateway on which to expose the iSCSI
     * target. Only IPv4 addresses are accepted. Use the
     * <a>DescribeGatewayInformation</a> operation to get a list of the
     * network interfaces available on the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     *
     * @return The network interface of the gateway on which to expose the iSCSI
     *         target. Only IPv4 addresses are accepted. Use the
     *         <a>DescribeGatewayInformation</a> operation to get a list of the
     *         network interfaces available on the gateway.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * The network interface of the gateway on which to expose the iSCSI
     * target. Only IPv4 addresses are accepted. Use the
     * <a>DescribeGatewayInformation</a> operation to get a list of the
     * network interfaces available on the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId The network interface of the gateway on which to expose the iSCSI
     *         target. Only IPv4 addresses are accepted. Use the
     *         <a>DescribeGatewayInformation</a> operation to get a list of the
     *         network interfaces available on the gateway.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * The network interface of the gateway on which to expose the iSCSI
     * target. Only IPv4 addresses are accepted. Use the
     * <a>DescribeGatewayInformation</a> operation to get a list of the
     * network interfaces available on the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId The network interface of the gateway on which to expose the iSCSI
     *         target. Only IPv4 addresses are accepted. Use the
     *         <a>DescribeGatewayInformation</a> operation to get a list of the
     *         network interfaces available on the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCachediSCSIVolumeRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    
    
    /**
     * A unique identifying string for the cached volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @return A unique identifying string for the cached volume.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * A unique identifying string for the cached volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken A unique identifying string for the cached volume.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * A unique identifying string for the cached volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken A unique identifying string for the cached volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCachediSCSIVolumeRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (volumeSizeInBytes != null) sb.append("VolumeSizeInBytes: " + volumeSizeInBytes + ", ");
        if (snapshotId != null) sb.append("SnapshotId: " + snapshotId + ", ");
        if (targetName != null) sb.append("TargetName: " + targetName + ", ");
        if (networkInterfaceId != null) sb.append("NetworkInterfaceId: " + networkInterfaceId + ", ");
        if (clientToken != null) sb.append("ClientToken: " + clientToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateCachediSCSIVolumeRequest == false) return false;
        CreateCachediSCSIVolumeRequest other = (CreateCachediSCSIVolumeRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null) return false;
        if (other.getVolumeSizeInBytes() != null && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false) return false; 
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getTargetName() == null ^ this.getTargetName() == null) return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false) return false; 
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
}
    
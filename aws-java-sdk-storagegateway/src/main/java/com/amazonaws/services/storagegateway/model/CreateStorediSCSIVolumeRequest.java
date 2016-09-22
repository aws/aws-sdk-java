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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
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
 */
public class CreateStorediSCSIVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     * href="http://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html">ListLocalDisks</a> to
     * list disk IDs for a gateway.
     * </p>
     */
    private String diskId;
    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this field if
     * you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list
     * snapshots for your account use <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
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
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. For
     * example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The
     * target name must be unique across all volumes of a gateway.
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
     * href="http://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html">ListLocalDisks</a> to
     * list disk IDs for a gateway.
     * </p>
     * 
     * @param diskId
     *        The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     *        href="http://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     *        >ListLocalDisks</a> to list disk IDs for a gateway.
     */

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     * href="http://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html">ListLocalDisks</a> to
     * list disk IDs for a gateway.
     * </p>
     * 
     * @return The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     *         href="http://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     *         >ListLocalDisks</a> to list disk IDs for a gateway.
     */

    public String getDiskId() {
        return this.diskId;
    }

    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     * href="http://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html">ListLocalDisks</a> to
     * list disk IDs for a gateway.
     * </p>
     * 
     * @param diskId
     *        The unique identifier for the gateway local disk that is configured as a stored volume. Use <a
     *        href="http://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
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
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this
     *        field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field.
     *        To list snapshots for your account use <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
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
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * 
     * @return The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this
     *         field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field.
     *         To list snapshots for your account use <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
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
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this
     *        field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field.
     *        To list snapshots for your account use <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
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
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. For
     * example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The
     * target name must be unique across all volumes of a gateway.
     * </p>
     * 
     * @param targetName
     *        The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target
     *        ARN. For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     *        arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume.
     *        The target name must be unique across all volumes of a gateway.
     */

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. For
     * example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The
     * target name must be unique across all volumes of a gateway.
     * </p>
     * 
     * @return The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target
     *         ARN. For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     *         arn:aws
     *         :storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The
     *         target name must be unique across all volumes of a gateway.
     */

    public String getTargetName() {
        return this.targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. For
     * example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The
     * target name must be unique across all volumes of a gateway.
     * </p>
     * 
     * @param targetName
     *        The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target
     *        ARN. For example, specifying <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     *        arn:aws:storagegateway:us-east-1:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume.
     *        The target name must be unique across all volumes of a gateway.
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getDiskId() != null)
            sb.append("DiskId: " + getDiskId() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getPreserveExistingData() != null)
            sb.append("PreserveExistingData: " + getPreserveExistingData() + ",");
        if (getTargetName() != null)
            sb.append("TargetName: " + getTargetName() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId());
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
        return hashCode;
    }

    @Override
    public CreateStorediSCSIVolumeRequest clone() {
        return (CreateStorediSCSIVolumeRequest) super.clone();
    }
}

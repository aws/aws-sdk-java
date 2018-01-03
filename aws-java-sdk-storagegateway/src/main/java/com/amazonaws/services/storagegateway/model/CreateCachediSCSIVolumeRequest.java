/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    private Long volumeSizeInBytes;

    private String snapshotId;

    private String targetName;
    /**
     * <p>
     * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified
     * existing volume's latest recovery point. The <code>VolumeSizeInBytes</code> value for this new volume must be
     * equal to or larger than the size of the existing volume, in bytes.
     * </p>
     */
    private String sourceVolumeARN;

    private String networkInterfaceId;

    private String clientToken;

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
     * @param volumeSizeInBytes
     */

    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * @return
     */

    public Long getVolumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }

    /**
     * @param volumeSizeInBytes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withVolumeSizeInBytes(Long volumeSizeInBytes) {
        setVolumeSizeInBytes(volumeSizeInBytes);
        return this;
    }

    /**
     * @param snapshotId
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * @return
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @param snapshotId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * @param targetName
     */

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * @return
     */

    public String getTargetName() {
        return this.targetName;
    }

    /**
     * @param targetName
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
     * @param networkInterfaceId
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * @return
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @param networkInterfaceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * @param clientToken
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * @return
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @param clientToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
            sb.append("ClientToken: ").append(getClientToken());
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
        return hashCode;
    }

    @Override
    public CreateCachediSCSIVolumeRequest clone() {
        return (CreateCachediSCSIVolumeRequest) super.clone();
    }

}

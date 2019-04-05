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
 * AttachVolumeInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AttachVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway that you want to attach the volume to.
     * </p>
     */
    private String gatewayARN;
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
     * The Amazon Resource Name (ARN) of the volume to attach to the specified gateway.
     * </p>
     */
    private String volumeARN;
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
     * The unique device ID or other distinguishing data that identifies the local disk used to create the volume. This
     * value is only required when you are attaching a stored volume.
     * </p>
     */
    private String diskId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway that you want to attach the volume to.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway that you want to attach the volume to.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway that you want to attach the volume to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway that you want to attach the volume to.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway that you want to attach the volume to.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway that you want to attach the volume to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachVolumeRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
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

    public AttachVolumeRequest withTargetName(String targetName) {
        setTargetName(targetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to attach to the specified gateway.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume to attach to the specified gateway.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to attach to the specified gateway.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volume to attach to the specified gateway.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to attach to the specified gateway.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume to attach to the specified gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachVolumeRequest withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
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

    public AttachVolumeRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies the local disk used to create the volume. This
     * value is only required when you are attaching a stored volume.
     * </p>
     * 
     * @param diskId
     *        The unique device ID or other distinguishing data that identifies the local disk used to create the
     *        volume. This value is only required when you are attaching a stored volume.
     */

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies the local disk used to create the volume. This
     * value is only required when you are attaching a stored volume.
     * </p>
     * 
     * @return The unique device ID or other distinguishing data that identifies the local disk used to create the
     *         volume. This value is only required when you are attaching a stored volume.
     */

    public String getDiskId() {
        return this.diskId;
    }

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies the local disk used to create the volume. This
     * value is only required when you are attaching a stored volume.
     * </p>
     * 
     * @param diskId
     *        The unique device ID or other distinguishing data that identifies the local disk used to create the
     *        volume. This value is only required when you are attaching a stored volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachVolumeRequest withDiskId(String diskId) {
        setDiskId(diskId);
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
        if (getTargetName() != null)
            sb.append("TargetName: ").append(getTargetName()).append(",");
        if (getVolumeARN() != null)
            sb.append("VolumeARN: ").append(getVolumeARN()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getDiskId() != null)
            sb.append("DiskId: ").append(getDiskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachVolumeRequest == false)
            return false;
        AttachVolumeRequest other = (AttachVolumeRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getDiskId() == null ^ this.getDiskId() == null)
            return false;
        if (other.getDiskId() != null && other.getDiskId().equals(this.getDiskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getDiskId() == null) ? 0 : getDiskId().hashCode());
        return hashCode;
    }

    @Override
    public AttachVolumeRequest clone() {
        return (AttachVolumeRequest) super.clone();
    }

}

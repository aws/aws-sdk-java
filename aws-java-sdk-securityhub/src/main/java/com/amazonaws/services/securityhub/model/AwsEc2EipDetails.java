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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Elastic IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2EipDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2EipDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the EC2 instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A public IP address that is associated with the EC2 instance.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The identifier that AWS assigns to represent the allocation of the Elastic IP address for use with Amazon VPC.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The identifier that represents the association of the Elastic IP address with an EC2 instance.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The domain in which to allocate the address.
     * </p>
     * <p>
     * If the address is for use with EC2 instances in a VPC, then <code>Domain</code> is <code>vpc</code>. Otherwise,
     * <code>Domain</code> is <code>standard</code>.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The identifier of an IP address pool. This parameter allows Amazon EC2 to select an IP address from the address
     * pool.
     * </p>
     */
    private String publicIpv4Pool;
    /**
     * <p>
     * The name of the location from which the Elastic IP address is advertised.
     * </p>
     */
    private String networkBorderGroup;
    /**
     * <p>
     * The identifier of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The AWS account ID of the owner of the network interface.
     * </p>
     */
    private String networkInterfaceOwnerId;
    /**
     * <p>
     * The private IP address that is associated with the Elastic IP address.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * The identifier of the EC2 instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the EC2 instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the EC2 instance.
     * </p>
     * 
     * @return The identifier of the EC2 instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the EC2 instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A public IP address that is associated with the EC2 instance.
     * </p>
     * 
     * @param publicIp
     *        A public IP address that is associated with the EC2 instance.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * A public IP address that is associated with the EC2 instance.
     * </p>
     * 
     * @return A public IP address that is associated with the EC2 instance.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * A public IP address that is associated with the EC2 instance.
     * </p>
     * 
     * @param publicIp
     *        A public IP address that is associated with the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The identifier that AWS assigns to represent the allocation of the Elastic IP address for use with Amazon VPC.
     * </p>
     * 
     * @param allocationId
     *        The identifier that AWS assigns to represent the allocation of the Elastic IP address for use with Amazon
     *        VPC.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The identifier that AWS assigns to represent the allocation of the Elastic IP address for use with Amazon VPC.
     * </p>
     * 
     * @return The identifier that AWS assigns to represent the allocation of the Elastic IP address for use with Amazon
     *         VPC.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The identifier that AWS assigns to represent the allocation of the Elastic IP address for use with Amazon VPC.
     * </p>
     * 
     * @param allocationId
     *        The identifier that AWS assigns to represent the allocation of the Elastic IP address for use with Amazon
     *        VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The identifier that represents the association of the Elastic IP address with an EC2 instance.
     * </p>
     * 
     * @param associationId
     *        The identifier that represents the association of the Elastic IP address with an EC2 instance.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The identifier that represents the association of the Elastic IP address with an EC2 instance.
     * </p>
     * 
     * @return The identifier that represents the association of the Elastic IP address with an EC2 instance.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The identifier that represents the association of the Elastic IP address with an EC2 instance.
     * </p>
     * 
     * @param associationId
     *        The identifier that represents the association of the Elastic IP address with an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The domain in which to allocate the address.
     * </p>
     * <p>
     * If the address is for use with EC2 instances in a VPC, then <code>Domain</code> is <code>vpc</code>. Otherwise,
     * <code>Domain</code> is <code>standard</code>.
     * </p>
     * 
     * @param domain
     *        The domain in which to allocate the address.</p>
     *        <p>
     *        If the address is for use with EC2 instances in a VPC, then <code>Domain</code> is <code>vpc</code>.
     *        Otherwise, <code>Domain</code> is <code>standard</code>.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain in which to allocate the address.
     * </p>
     * <p>
     * If the address is for use with EC2 instances in a VPC, then <code>Domain</code> is <code>vpc</code>. Otherwise,
     * <code>Domain</code> is <code>standard</code>.
     * </p>
     * 
     * @return The domain in which to allocate the address.</p>
     *         <p>
     *         If the address is for use with EC2 instances in a VPC, then <code>Domain</code> is <code>vpc</code>.
     *         Otherwise, <code>Domain</code> is <code>standard</code>.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain in which to allocate the address.
     * </p>
     * <p>
     * If the address is for use with EC2 instances in a VPC, then <code>Domain</code> is <code>vpc</code>. Otherwise,
     * <code>Domain</code> is <code>standard</code>.
     * </p>
     * 
     * @param domain
     *        The domain in which to allocate the address.</p>
     *        <p>
     *        If the address is for use with EC2 instances in a VPC, then <code>Domain</code> is <code>vpc</code>.
     *        Otherwise, <code>Domain</code> is <code>standard</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The identifier of an IP address pool. This parameter allows Amazon EC2 to select an IP address from the address
     * pool.
     * </p>
     * 
     * @param publicIpv4Pool
     *        The identifier of an IP address pool. This parameter allows Amazon EC2 to select an IP address from the
     *        address pool.
     */

    public void setPublicIpv4Pool(String publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
    }

    /**
     * <p>
     * The identifier of an IP address pool. This parameter allows Amazon EC2 to select an IP address from the address
     * pool.
     * </p>
     * 
     * @return The identifier of an IP address pool. This parameter allows Amazon EC2 to select an IP address from the
     *         address pool.
     */

    public String getPublicIpv4Pool() {
        return this.publicIpv4Pool;
    }

    /**
     * <p>
     * The identifier of an IP address pool. This parameter allows Amazon EC2 to select an IP address from the address
     * pool.
     * </p>
     * 
     * @param publicIpv4Pool
     *        The identifier of an IP address pool. This parameter allows Amazon EC2 to select an IP address from the
     *        address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withPublicIpv4Pool(String publicIpv4Pool) {
        setPublicIpv4Pool(publicIpv4Pool);
        return this;
    }

    /**
     * <p>
     * The name of the location from which the Elastic IP address is advertised.
     * </p>
     * 
     * @param networkBorderGroup
     *        The name of the location from which the Elastic IP address is advertised.
     */

    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the Elastic IP address is advertised.
     * </p>
     * 
     * @return The name of the location from which the Elastic IP address is advertised.
     */

    public String getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the Elastic IP address is advertised.
     * </p>
     * 
     * @param networkBorderGroup
     *        The name of the location from which the Elastic IP address is advertised.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withNetworkBorderGroup(String networkBorderGroup) {
        setNetworkBorderGroup(networkBorderGroup);
        return this;
    }

    /**
     * <p>
     * The identifier of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The identifier of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The identifier of the network interface.
     * </p>
     * 
     * @return The identifier of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The identifier of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The identifier of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the network interface.
     * </p>
     * 
     * @param networkInterfaceOwnerId
     *        The AWS account ID of the owner of the network interface.
     */

    public void setNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        this.networkInterfaceOwnerId = networkInterfaceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the network interface.
     * </p>
     * 
     * @return The AWS account ID of the owner of the network interface.
     */

    public String getNetworkInterfaceOwnerId() {
        return this.networkInterfaceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the network interface.
     * </p>
     * 
     * @param networkInterfaceOwnerId
     *        The AWS account ID of the owner of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        setNetworkInterfaceOwnerId(networkInterfaceOwnerId);
        return this;
    }

    /**
     * <p>
     * The private IP address that is associated with the Elastic IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address that is associated with the Elastic IP address.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address that is associated with the Elastic IP address.
     * </p>
     * 
     * @return The private IP address that is associated with the Elastic IP address.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP address that is associated with the Elastic IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address that is associated with the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2EipDetails withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getAllocationId() != null)
            sb.append("AllocationId: ").append(getAllocationId()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getPublicIpv4Pool() != null)
            sb.append("PublicIpv4Pool: ").append(getPublicIpv4Pool()).append(",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: ").append(getNetworkBorderGroup()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getNetworkInterfaceOwnerId() != null)
            sb.append("NetworkInterfaceOwnerId: ").append(getNetworkInterfaceOwnerId()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2EipDetails == false)
            return false;
        AwsEc2EipDetails other = (AwsEc2EipDetails) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getPublicIpv4Pool() == null ^ this.getPublicIpv4Pool() == null)
            return false;
        if (other.getPublicIpv4Pool() != null && other.getPublicIpv4Pool().equals(this.getPublicIpv4Pool()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNetworkInterfaceOwnerId() == null ^ this.getNetworkInterfaceOwnerId() == null)
            return false;
        if (other.getNetworkInterfaceOwnerId() != null && other.getNetworkInterfaceOwnerId().equals(this.getNetworkInterfaceOwnerId()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getPublicIpv4Pool() == null) ? 0 : getPublicIpv4Pool().hashCode());
        hashCode = prime * hashCode + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceOwnerId() == null) ? 0 : getNetworkInterfaceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2EipDetails clone() {
        try {
            return (AwsEc2EipDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2EipDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

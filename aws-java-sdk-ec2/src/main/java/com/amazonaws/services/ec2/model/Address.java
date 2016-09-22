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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Elastic IP address.
 * </p>
 */
public class Address implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The Elastic IP address.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The ID representing the association of the address with an instance in a VPC.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     */
    private String networkInterfaceOwnerId;
    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that the address is associated with (if any).
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     * 
     * @return The ID of the instance that the address is associated with (if any).
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance that the address is associated with (if any).
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that the address is associated with (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @return The Elastic IP address.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     * 
     * @param allocationId
     *        The ID representing the allocation of the address for use with EC2-VPC.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     * 
     * @return The ID representing the allocation of the address for use with EC2-VPC.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The ID representing the allocation of the address for use with EC2-VPC.
     * </p>
     * 
     * @param allocationId
     *        The ID representing the allocation of the address for use with EC2-VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The ID representing the association of the address with an instance in a VPC.
     * </p>
     * 
     * @param associationId
     *        The ID representing the association of the address with an instance in a VPC.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID representing the association of the address with an instance in a VPC.
     * </p>
     * 
     * @return The ID representing the association of the address with an instance in a VPC.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID representing the association of the address with an instance in a VPC.
     * </p>
     * 
     * @param associationId
     *        The ID representing the association of the address with an instance in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @param domain
     *        Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>)
     *        or instances in a VPC (<code>vpc</code>).
     * @see DomainType
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @return Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>
     *         ) or instances in a VPC (<code>vpc</code>).
     * @see DomainType
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @param domain
     *        Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>)
     *        or instances in a VPC (<code>vpc</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainType
     */

    public Address withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @param domain
     *        Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>)
     *        or instances in a VPC (<code>vpc</code>).
     * @see DomainType
     */

    public void setDomain(DomainType domain) {
        this.domain = domain.toString();
    }

    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     * 
     * @param domain
     *        Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>)
     *        or instances in a VPC (<code>vpc</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainType
     */

    public Address withDomain(DomainType domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     * 
     * @param networkInterfaceOwnerId
     *        The ID of the AWS account that owns the network interface.
     */

    public void setNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        this.networkInterfaceOwnerId = networkInterfaceOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     * 
     * @return The ID of the AWS account that owns the network interface.
     */

    public String getNetworkInterfaceOwnerId() {
        return this.networkInterfaceOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network interface.
     * </p>
     * 
     * @param networkInterfaceOwnerId
     *        The ID of the AWS account that owns the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        setNetworkInterfaceOwnerId(networkInterfaceOwnerId);
        return this;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address associated with the Elastic IP address.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * 
     * @return The private IP address associated with the Elastic IP address.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP address associated with the Elastic IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address associated with the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getAllocationId() != null)
            sb.append("AllocationId: " + getAllocationId() + ",");
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getNetworkInterfaceOwnerId() != null)
            sb.append("NetworkInterfaceOwnerId: " + getNetworkInterfaceOwnerId() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Address == false)
            return false;
        Address other = (Address) obj;
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
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceOwnerId() == null) ? 0 : getNetworkInterfaceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Elastic IP address.
 * </p>
 */
public class Address implements Serializable {

    /**
     * The ID of the instance the address is associated with (if any).
     */
    private String instanceId;

    /**
     * The Elastic IP address.
     */
    private String publicIp;

    /**
     * The ID representing the allocation of the address for use with
     * EC2-VPC.
     */
    private String allocationId;

    /**
     * The ID representing the association of the address with an instance in
     * a VPC.
     */
    private String associationId;

    /**
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC
     * (<code>vpc</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     */
    private String domain;

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * The ID of the AWS account that owns the network interface.
     */
    private String networkInterfaceOwnerId;

    /**
     * The private IP address associated with the Elastic IP address.
     */
    private String privateIpAddress;

    /**
     * The ID of the instance the address is associated with (if any).
     *
     * @return The ID of the instance the address is associated with (if any).
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance the address is associated with (if any).
     *
     * @param instanceId The ID of the instance the address is associated with (if any).
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance the address is associated with (if any).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance the address is associated with (if any).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Address withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The Elastic IP address.
     *
     * @return The Elastic IP address.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The Elastic IP address.
     *
     * @param publicIp The Elastic IP address.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Address withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * The ID representing the allocation of the address for use with
     * EC2-VPC.
     *
     * @return The ID representing the allocation of the address for use with
     *         EC2-VPC.
     */
    public String getAllocationId() {
        return allocationId;
    }
    
    /**
     * The ID representing the allocation of the address for use with
     * EC2-VPC.
     *
     * @param allocationId The ID representing the allocation of the address for use with
     *         EC2-VPC.
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }
    
    /**
     * The ID representing the allocation of the address for use with
     * EC2-VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationId The ID representing the allocation of the address for use with
     *         EC2-VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Address withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * The ID representing the association of the address with an instance in
     * a VPC.
     *
     * @return The ID representing the association of the address with an instance in
     *         a VPC.
     */
    public String getAssociationId() {
        return associationId;
    }
    
    /**
     * The ID representing the association of the address with an instance in
     * a VPC.
     *
     * @param associationId The ID representing the association of the address with an instance in
     *         a VPC.
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }
    
    /**
     * The ID representing the association of the address with an instance in
     * a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationId The ID representing the association of the address with an instance in
     *         a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Address withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC
     * (<code>vpc</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @return Indicates whether this Elastic IP address is for use with instances in
     *         EC2-Classic (<code>standard</code>) or instances in a VPC
     *         (<code>vpc</code>).
     *
     * @see DomainType
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC
     * (<code>vpc</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain Indicates whether this Elastic IP address is for use with instances in
     *         EC2-Classic (<code>standard</code>) or instances in a VPC
     *         (<code>vpc</code>).
     *
     * @see DomainType
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC
     * (<code>vpc</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain Indicates whether this Elastic IP address is for use with instances in
     *         EC2-Classic (<code>standard</code>) or instances in a VPC
     *         (<code>vpc</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DomainType
     */
    public Address withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC
     * (<code>vpc</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain Indicates whether this Elastic IP address is for use with instances in
     *         EC2-Classic (<code>standard</code>) or instances in a VPC
     *         (<code>vpc</code>).
     *
     * @see DomainType
     */
    public void setDomain(DomainType domain) {
        this.domain = domain.toString();
    }
    
    /**
     * Indicates whether this Elastic IP address is for use with instances in
     * EC2-Classic (<code>standard</code>) or instances in a VPC
     * (<code>vpc</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain Indicates whether this Elastic IP address is for use with instances in
     *         EC2-Classic (<code>standard</code>) or instances in a VPC
     *         (<code>vpc</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DomainType
     */
    public Address withDomain(DomainType domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * The ID of the network interface.
     *
     * @return The ID of the network interface.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * The ID of the network interface.
     *
     * @param networkInterfaceId The ID of the network interface.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * The ID of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId The ID of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Address withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The ID of the AWS account that owns the network interface.
     *
     * @return The ID of the AWS account that owns the network interface.
     */
    public String getNetworkInterfaceOwnerId() {
        return networkInterfaceOwnerId;
    }
    
    /**
     * The ID of the AWS account that owns the network interface.
     *
     * @param networkInterfaceOwnerId The ID of the AWS account that owns the network interface.
     */
    public void setNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        this.networkInterfaceOwnerId = networkInterfaceOwnerId;
    }
    
    /**
     * The ID of the AWS account that owns the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceOwnerId The ID of the AWS account that owns the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Address withNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
        this.networkInterfaceOwnerId = networkInterfaceOwnerId;
        return this;
    }

    /**
     * The private IP address associated with the Elastic IP address.
     *
     * @return The private IP address associated with the Elastic IP address.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * The private IP address associated with the Elastic IP address.
     *
     * @param privateIpAddress The private IP address associated with the Elastic IP address.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * The private IP address associated with the Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The private IP address associated with the Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Address withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getAllocationId() != null) sb.append("AllocationId: " + getAllocationId() + ",");
        if (getAssociationId() != null) sb.append("AssociationId: " + getAssociationId() + ",");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getNetworkInterfaceOwnerId() != null) sb.append("NetworkInterfaceOwnerId: " + getNetworkInterfaceOwnerId() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Address == false) return false;
        Address other = (Address)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getAllocationId() == null ^ this.getAllocationId() == null) return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false) return false; 
        if (other.getAssociationId() == null ^ this.getAssociationId() == null) return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false) return false; 
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getNetworkInterfaceOwnerId() == null ^ this.getNetworkInterfaceOwnerId() == null) return false;
        if (other.getNetworkInterfaceOwnerId() != null && other.getNetworkInterfaceOwnerId().equals(this.getNetworkInterfaceOwnerId()) == false) return false; 
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        return true;
    }
    
}
    
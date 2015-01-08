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
 * 
 */
public class AllocateAddressResult implements Serializable {

    /**
     * The Elastic IP address.
     */
    private String publicIp;

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
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     * Elastic IP address for use with instances in a VPC.
     */
    private String allocationId;

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
    public AllocateAddressResult withPublicIp(String publicIp) {
        this.publicIp = publicIp;
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
    public AllocateAddressResult withDomain(String domain) {
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
    public AllocateAddressResult withDomain(DomainType domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     * Elastic IP address for use with instances in a VPC.
     *
     * @return [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     *         Elastic IP address for use with instances in a VPC.
     */
    public String getAllocationId() {
        return allocationId;
    }
    
    /**
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     * Elastic IP address for use with instances in a VPC.
     *
     * @param allocationId [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     *         Elastic IP address for use with instances in a VPC.
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }
    
    /**
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     * Elastic IP address for use with instances in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationId [EC2-VPC] The ID that AWS assigns to represent the allocation of the
     *         Elastic IP address for use with instances in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllocateAddressResult withAllocationId(String allocationId) {
        this.allocationId = allocationId;
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
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (getAllocationId() != null) sb.append("AllocationId: " + getAllocationId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode()); 
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AllocateAddressResult == false) return false;
        AllocateAddressResult other = (AllocateAddressResult)obj;
        
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getAllocationId() == null ^ this.getAllocationId() == null) return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false) return false; 
        return true;
    }
    
}
    
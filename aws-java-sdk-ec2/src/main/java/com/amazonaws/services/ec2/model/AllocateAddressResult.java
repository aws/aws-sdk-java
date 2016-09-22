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
import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of AllocateAddress.
 * </p>
 */
public class AllocateAddressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (<code>standard</code>) or
     * instances in a VPC (<code>vpc</code>).
     * </p>
     */
    private String domain;
    /**
     * <p>
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in
     * a VPC.
     * </p>
     */
    private String allocationId;

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

    public AllocateAddressResult withPublicIp(String publicIp) {
        setPublicIp(publicIp);
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

    public AllocateAddressResult withDomain(String domain) {
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

    public AllocateAddressResult withDomain(DomainType domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in
     * a VPC.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with
     *        instances in a VPC.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in
     * a VPC.
     * </p>
     * 
     * @return [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with
     *         instances in a VPC.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in
     * a VPC.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with
     *        instances in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateAddressResult withAllocationId(String allocationId) {
        setAllocationId(allocationId);
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
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getAllocationId() != null)
            sb.append("AllocationId: " + getAllocationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateAddressResult == false)
            return false;
        AllocateAddressResult other = (AllocateAddressResult) obj;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        return true;
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
    public AllocateAddressResult clone() {
        try {
            return (AllocateAddressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

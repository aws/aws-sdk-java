/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * In IPAM, an allocation is a CIDR assignment from an IPAM pool to another resource or IPAM pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamPoolAllocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamPoolAllocation implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask (or
     * netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An IPv6 CIDR
     * example is <code>2001:DB8::/32</code>.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The ID of an allocation.
     * </p>
     */
    private String ipamPoolAllocationId;
    /**
     * <p>
     * A description of the pool allocation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     */
    private String resourceRegion;
    /**
     * <p>
     * The owner of the resource.
     * </p>
     */
    private String resourceOwner;

    /**
     * <p>
     * The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask (or
     * netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An IPv6 CIDR
     * example is <code>2001:DB8::/32</code>.
     * </p>
     * 
     * @param cidr
     *        The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask
     *        (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An
     *        IPv6 CIDR example is <code>2001:DB8::/32</code>.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask (or
     * netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An IPv6 CIDR
     * example is <code>2001:DB8::/32</code>.
     * </p>
     * 
     * @return The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask
     *         (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>.
     *         An IPv6 CIDR example is <code>2001:DB8::/32</code>.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask (or
     * netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An IPv6 CIDR
     * example is <code>2001:DB8::/32</code>.
     * </p>
     * 
     * @param cidr
     *        The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask
     *        (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An
     *        IPv6 CIDR example is <code>2001:DB8::/32</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolAllocation withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The ID of an allocation.
     * </p>
     * 
     * @param ipamPoolAllocationId
     *        The ID of an allocation.
     */

    public void setIpamPoolAllocationId(String ipamPoolAllocationId) {
        this.ipamPoolAllocationId = ipamPoolAllocationId;
    }

    /**
     * <p>
     * The ID of an allocation.
     * </p>
     * 
     * @return The ID of an allocation.
     */

    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    /**
     * <p>
     * The ID of an allocation.
     * </p>
     * 
     * @param ipamPoolAllocationId
     *        The ID of an allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolAllocation withIpamPoolAllocationId(String ipamPoolAllocationId) {
        setIpamPoolAllocationId(ipamPoolAllocationId);
        return this;
    }

    /**
     * <p>
     * A description of the pool allocation.
     * </p>
     * 
     * @param description
     *        A description of the pool allocation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the pool allocation.
     * </p>
     * 
     * @return A description of the pool allocation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the pool allocation.
     * </p>
     * 
     * @param description
     *        A description of the pool allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolAllocation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolAllocation withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @see IpamPoolAllocationResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @return The type of the resource.
     * @see IpamPoolAllocationResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolAllocationResourceType
     */

    public IpamPoolAllocation withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolAllocationResourceType
     */

    public IpamPoolAllocation withResourceType(IpamPoolAllocationResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region of the resource.
     */

    public void setResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @return The Amazon Web Services Region of the resource.
     */

    public String getResourceRegion() {
        return this.resourceRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the resource.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolAllocation withResourceRegion(String resourceRegion) {
        setResourceRegion(resourceRegion);
        return this;
    }

    /**
     * <p>
     * The owner of the resource.
     * </p>
     * 
     * @param resourceOwner
     *        The owner of the resource.
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The owner of the resource.
     * </p>
     * 
     * @return The owner of the resource.
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The owner of the resource.
     * </p>
     * 
     * @param resourceOwner
     *        The owner of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolAllocation withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getIpamPoolAllocationId() != null)
            sb.append("IpamPoolAllocationId: ").append(getIpamPoolAllocationId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceRegion() != null)
            sb.append("ResourceRegion: ").append(getResourceRegion()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamPoolAllocation == false)
            return false;
        IpamPoolAllocation other = (IpamPoolAllocation) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getIpamPoolAllocationId() == null ^ this.getIpamPoolAllocationId() == null)
            return false;
        if (other.getIpamPoolAllocationId() != null && other.getIpamPoolAllocationId().equals(this.getIpamPoolAllocationId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceRegion() == null ^ this.getResourceRegion() == null)
            return false;
        if (other.getResourceRegion() != null && other.getResourceRegion().equals(this.getResourceRegion()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getIpamPoolAllocationId() == null) ? 0 : getIpamPoolAllocationId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceRegion() == null) ? 0 : getResourceRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        return hashCode;
    }

    @Override
    public IpamPoolAllocation clone() {
        try {
            return (IpamPoolAllocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

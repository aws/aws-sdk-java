/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An IPAM discovered resource CIDR. A discovered resource is a resource CIDR monitored under a resource discovery. The
 * following resources can be discovered: VPCs, Public IPv4 pools, VPC subnets, and Elastic IP addresses. The discovered
 * resource CIDR is the IP address range in CIDR notation that is associated with the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamDiscoveredResourceCidr" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamDiscoveredResourceCidr implements Serializable, Cloneable {

    /**
     * <p>
     * The resource discovery ID.
     * </p>
     */
    private String ipamResourceDiscoveryId;
    /**
     * <p>
     * The resource Region.
     * </p>
     */
    private String resourceRegion;
    /**
     * <p>
     * The resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource owner ID.
     * </p>
     */
    private String resourceOwnerId;
    /**
     * <p>
     * The resource CIDR.
     * </p>
     */
    private String resourceCidr;
    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The resource tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamResourceTag> resourceTags;
    /**
     * <p>
     * The percentage of IP address space in use. To convert the decimal to a percentage, multiply the decimal by 100.
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet
     * CIDRs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resources that are subnets, if the subnet has an IPv4 CIDR provisioned to it, this is the percentage of IPv4
     * address space in the subnet that's in use. If the subnet has an IPv6 CIDR provisioned to it, the percentage of
     * IPv6 address space in use is not represented. The percentage of IPv6 address space in use cannot currently be
     * calculated.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resources that are public IPv4 pools, this is the percentage of IP address space in the pool that's been
     * allocated to Elastic IP addresses (EIPs).
     * </p>
     * </li>
     * </ul>
     */
    private Double ipUsage;
    /**
     * <p>
     * The VPC ID.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The last successful resource discovery time.
     * </p>
     */
    private java.util.Date sampleTime;

    /**
     * <p>
     * The resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        The resource discovery ID.
     */

    public void setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * The resource discovery ID.
     * </p>
     * 
     * @return The resource discovery ID.
     */

    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * The resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        The resource discovery ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        setIpamResourceDiscoveryId(ipamResourceDiscoveryId);
        return this;
    }

    /**
     * <p>
     * The resource Region.
     * </p>
     * 
     * @param resourceRegion
     *        The resource Region.
     */

    public void setResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
    }

    /**
     * <p>
     * The resource Region.
     * </p>
     * 
     * @return The resource Region.
     */

    public String getResourceRegion() {
        return this.resourceRegion;
    }

    /**
     * <p>
     * The resource Region.
     * </p>
     * 
     * @param resourceRegion
     *        The resource Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withResourceRegion(String resourceRegion) {
        setResourceRegion(resourceRegion);
        return this;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * 
     * @param resourceId
     *        The resource ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * 
     * @return The resource ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * 
     * @param resourceId
     *        The resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource owner ID.
     * </p>
     * 
     * @param resourceOwnerId
     *        The resource owner ID.
     */

    public void setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
    }

    /**
     * <p>
     * The resource owner ID.
     * </p>
     * 
     * @return The resource owner ID.
     */

    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * <p>
     * The resource owner ID.
     * </p>
     * 
     * @param resourceOwnerId
     *        The resource owner ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withResourceOwnerId(String resourceOwnerId) {
        setResourceOwnerId(resourceOwnerId);
        return this;
    }

    /**
     * <p>
     * The resource CIDR.
     * </p>
     * 
     * @param resourceCidr
     *        The resource CIDR.
     */

    public void setResourceCidr(String resourceCidr) {
        this.resourceCidr = resourceCidr;
    }

    /**
     * <p>
     * The resource CIDR.
     * </p>
     * 
     * @return The resource CIDR.
     */

    public String getResourceCidr() {
        return this.resourceCidr;
    }

    /**
     * <p>
     * The resource CIDR.
     * </p>
     * 
     * @param resourceCidr
     *        The resource CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withResourceCidr(String resourceCidr) {
        setResourceCidr(resourceCidr);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @see IpamResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     * @see IpamResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceType
     */

    public IpamDiscoveredResourceCidr withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceType
     */

    public IpamDiscoveredResourceCidr withResourceType(IpamResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The resource tags.
     * </p>
     * 
     * @return The resource tags.
     */

    public java.util.List<IpamResourceTag> getResourceTags() {
        if (resourceTags == null) {
            resourceTags = new com.amazonaws.internal.SdkInternalList<IpamResourceTag>();
        }
        return resourceTags;
    }

    /**
     * <p>
     * The resource tags.
     * </p>
     * 
     * @param resourceTags
     *        The resource tags.
     */

    public void setResourceTags(java.util.Collection<IpamResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new com.amazonaws.internal.SdkInternalList<IpamResourceTag>(resourceTags);
    }

    /**
     * <p>
     * The resource tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        The resource tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withResourceTags(IpamResourceTag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new com.amazonaws.internal.SdkInternalList<IpamResourceTag>(resourceTags.length));
        }
        for (IpamResourceTag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource tags.
     * </p>
     * 
     * @param resourceTags
     *        The resource tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withResourceTags(java.util.Collection<IpamResourceTag> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * The percentage of IP address space in use. To convert the decimal to a percentage, multiply the decimal by 100.
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet
     * CIDRs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resources that are subnets, if the subnet has an IPv4 CIDR provisioned to it, this is the percentage of IPv4
     * address space in the subnet that's in use. If the subnet has an IPv6 CIDR provisioned to it, the percentage of
     * IPv6 address space in use is not represented. The percentage of IPv6 address space in use cannot currently be
     * calculated.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resources that are public IPv4 pools, this is the percentage of IP address space in the pool that's been
     * allocated to Elastic IP addresses (EIPs).
     * </p>
     * </li>
     * </ul>
     * 
     * @param ipUsage
     *        The percentage of IP address space in use. To convert the decimal to a percentage, multiply the decimal by
     *        100. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by
     *        subnet CIDRs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resources that are subnets, if the subnet has an IPv4 CIDR provisioned to it, this is the percentage
     *        of IPv4 address space in the subnet that's in use. If the subnet has an IPv6 CIDR provisioned to it, the
     *        percentage of IPv6 address space in use is not represented. The percentage of IPv6 address space in use
     *        cannot currently be calculated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resources that are public IPv4 pools, this is the percentage of IP address space in the pool that's
     *        been allocated to Elastic IP addresses (EIPs).
     *        </p>
     *        </li>
     */

    public void setIpUsage(Double ipUsage) {
        this.ipUsage = ipUsage;
    }

    /**
     * <p>
     * The percentage of IP address space in use. To convert the decimal to a percentage, multiply the decimal by 100.
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet
     * CIDRs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resources that are subnets, if the subnet has an IPv4 CIDR provisioned to it, this is the percentage of IPv4
     * address space in the subnet that's in use. If the subnet has an IPv6 CIDR provisioned to it, the percentage of
     * IPv6 address space in use is not represented. The percentage of IPv6 address space in use cannot currently be
     * calculated.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resources that are public IPv4 pools, this is the percentage of IP address space in the pool that's been
     * allocated to Elastic IP addresses (EIPs).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The percentage of IP address space in use. To convert the decimal to a percentage, multiply the decimal
     *         by 100. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by
     *         subnet CIDRs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For resources that are subnets, if the subnet has an IPv4 CIDR provisioned to it, this is the percentage
     *         of IPv4 address space in the subnet that's in use. If the subnet has an IPv6 CIDR provisioned to it, the
     *         percentage of IPv6 address space in use is not represented. The percentage of IPv6 address space in use
     *         cannot currently be calculated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For resources that are public IPv4 pools, this is the percentage of IP address space in the pool that's
     *         been allocated to Elastic IP addresses (EIPs).
     *         </p>
     *         </li>
     */

    public Double getIpUsage() {
        return this.ipUsage;
    }

    /**
     * <p>
     * The percentage of IP address space in use. To convert the decimal to a percentage, multiply the decimal by 100.
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet
     * CIDRs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resources that are subnets, if the subnet has an IPv4 CIDR provisioned to it, this is the percentage of IPv4
     * address space in the subnet that's in use. If the subnet has an IPv6 CIDR provisioned to it, the percentage of
     * IPv6 address space in use is not represented. The percentage of IPv6 address space in use cannot currently be
     * calculated.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resources that are public IPv4 pools, this is the percentage of IP address space in the pool that's been
     * allocated to Elastic IP addresses (EIPs).
     * </p>
     * </li>
     * </ul>
     * 
     * @param ipUsage
     *        The percentage of IP address space in use. To convert the decimal to a percentage, multiply the decimal by
     *        100. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by
     *        subnet CIDRs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resources that are subnets, if the subnet has an IPv4 CIDR provisioned to it, this is the percentage
     *        of IPv4 address space in the subnet that's in use. If the subnet has an IPv6 CIDR provisioned to it, the
     *        percentage of IPv6 address space in use is not represented. The percentage of IPv6 address space in use
     *        cannot currently be calculated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resources that are public IPv4 pools, this is the percentage of IP address space in the pool that's
     *        been allocated to Elastic IP addresses (EIPs).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withIpUsage(Double ipUsage) {
        setIpUsage(ipUsage);
        return this;
    }

    /**
     * <p>
     * The VPC ID.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID.
     * </p>
     * 
     * @return The VPC ID.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The last successful resource discovery time.
     * </p>
     * 
     * @param sampleTime
     *        The last successful resource discovery time.
     */

    public void setSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
    }

    /**
     * <p>
     * The last successful resource discovery time.
     * </p>
     * 
     * @return The last successful resource discovery time.
     */

    public java.util.Date getSampleTime() {
        return this.sampleTime;
    }

    /**
     * <p>
     * The last successful resource discovery time.
     * </p>
     * 
     * @param sampleTime
     *        The last successful resource discovery time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredResourceCidr withSampleTime(java.util.Date sampleTime) {
        setSampleTime(sampleTime);
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
        if (getIpamResourceDiscoveryId() != null)
            sb.append("IpamResourceDiscoveryId: ").append(getIpamResourceDiscoveryId()).append(",");
        if (getResourceRegion() != null)
            sb.append("ResourceRegion: ").append(getResourceRegion()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceOwnerId() != null)
            sb.append("ResourceOwnerId: ").append(getResourceOwnerId()).append(",");
        if (getResourceCidr() != null)
            sb.append("ResourceCidr: ").append(getResourceCidr()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getIpUsage() != null)
            sb.append("IpUsage: ").append(getIpUsage()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSampleTime() != null)
            sb.append("SampleTime: ").append(getSampleTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamDiscoveredResourceCidr == false)
            return false;
        IpamDiscoveredResourceCidr other = (IpamDiscoveredResourceCidr) obj;
        if (other.getIpamResourceDiscoveryId() == null ^ this.getIpamResourceDiscoveryId() == null)
            return false;
        if (other.getIpamResourceDiscoveryId() != null && other.getIpamResourceDiscoveryId().equals(this.getIpamResourceDiscoveryId()) == false)
            return false;
        if (other.getResourceRegion() == null ^ this.getResourceRegion() == null)
            return false;
        if (other.getResourceRegion() != null && other.getResourceRegion().equals(this.getResourceRegion()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceOwnerId() == null ^ this.getResourceOwnerId() == null)
            return false;
        if (other.getResourceOwnerId() != null && other.getResourceOwnerId().equals(this.getResourceOwnerId()) == false)
            return false;
        if (other.getResourceCidr() == null ^ this.getResourceCidr() == null)
            return false;
        if (other.getResourceCidr() != null && other.getResourceCidr().equals(this.getResourceCidr()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getIpUsage() == null ^ this.getIpUsage() == null)
            return false;
        if (other.getIpUsage() != null && other.getIpUsage().equals(this.getIpUsage()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSampleTime() == null ^ this.getSampleTime() == null)
            return false;
        if (other.getSampleTime() != null && other.getSampleTime().equals(this.getSampleTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamResourceDiscoveryId() == null) ? 0 : getIpamResourceDiscoveryId().hashCode());
        hashCode = prime * hashCode + ((getResourceRegion() == null) ? 0 : getResourceRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceOwnerId() == null) ? 0 : getResourceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getResourceCidr() == null) ? 0 : getResourceCidr().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getIpUsage() == null) ? 0 : getIpUsage().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSampleTime() == null) ? 0 : getSampleTime().hashCode());
        return hashCode;
    }

    @Override
    public IpamDiscoveredResourceCidr clone() {
        try {
            return (IpamDiscoveredResourceCidr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

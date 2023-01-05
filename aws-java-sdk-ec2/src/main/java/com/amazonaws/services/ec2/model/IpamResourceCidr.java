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
 * The CIDR for an IPAM resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamResourceCidr" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamResourceCidr implements Serializable, Cloneable {

    /**
     * <p>
     * The IPAM ID for an IPAM resource.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * The scope ID for an IPAM resource.
     * </p>
     */
    private String ipamScopeId;
    /**
     * <p>
     * The pool ID for an IPAM resource.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The Amazon Web Services Region for an IPAM resource.
     * </p>
     */
    private String resourceRegion;
    /**
     * <p>
     * The Amazon Web Services account number of the owner of an IPAM resource.
     * </p>
     */
    private String resourceOwnerId;
    /**
     * <p>
     * The ID of an IPAM resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The name of an IPAM resource.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The CIDR for an IPAM resource.
     * </p>
     */
    private String resourceCidr;
    /**
     * <p>
     * The type of IPAM resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tags for an IPAM resource.
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
     * For a resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet
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
     * The compliance status of the IPAM resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     */
    private String complianceStatus;
    /**
     * <p>
     * The management state of the resource. For more information about management states, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     */
    private String managementState;
    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     */
    private String overlapStatus;
    /**
     * <p>
     * The ID of a VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The IPAM ID for an IPAM resource.
     * </p>
     * 
     * @param ipamId
     *        The IPAM ID for an IPAM resource.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * The IPAM ID for an IPAM resource.
     * </p>
     * 
     * @return The IPAM ID for an IPAM resource.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * The IPAM ID for an IPAM resource.
     * </p>
     * 
     * @param ipamId
     *        The IPAM ID for an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * The scope ID for an IPAM resource.
     * </p>
     * 
     * @param ipamScopeId
     *        The scope ID for an IPAM resource.
     */

    public void setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
    }

    /**
     * <p>
     * The scope ID for an IPAM resource.
     * </p>
     * 
     * @return The scope ID for an IPAM resource.
     */

    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * <p>
     * The scope ID for an IPAM resource.
     * </p>
     * 
     * @param ipamScopeId
     *        The scope ID for an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withIpamScopeId(String ipamScopeId) {
        setIpamScopeId(ipamScopeId);
        return this;
    }

    /**
     * <p>
     * The pool ID for an IPAM resource.
     * </p>
     * 
     * @param ipamPoolId
     *        The pool ID for an IPAM resource.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The pool ID for an IPAM resource.
     * </p>
     * 
     * @return The pool ID for an IPAM resource.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The pool ID for an IPAM resource.
     * </p>
     * 
     * @param ipamPoolId
     *        The pool ID for an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region for an IPAM resource.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region for an IPAM resource.
     */

    public void setResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region for an IPAM resource.
     * </p>
     * 
     * @return The Amazon Web Services Region for an IPAM resource.
     */

    public String getResourceRegion() {
        return this.resourceRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region for an IPAM resource.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region for an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withResourceRegion(String resourceRegion) {
        setResourceRegion(resourceRegion);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account number of the owner of an IPAM resource.
     * </p>
     * 
     * @param resourceOwnerId
     *        The Amazon Web Services account number of the owner of an IPAM resource.
     */

    public void setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
    }

    /**
     * <p>
     * The Amazon Web Services account number of the owner of an IPAM resource.
     * </p>
     * 
     * @return The Amazon Web Services account number of the owner of an IPAM resource.
     */

    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * <p>
     * The Amazon Web Services account number of the owner of an IPAM resource.
     * </p>
     * 
     * @param resourceOwnerId
     *        The Amazon Web Services account number of the owner of an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withResourceOwnerId(String resourceOwnerId) {
        setResourceOwnerId(resourceOwnerId);
        return this;
    }

    /**
     * <p>
     * The ID of an IPAM resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of an IPAM resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of an IPAM resource.
     * </p>
     * 
     * @return The ID of an IPAM resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of an IPAM resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The name of an IPAM resource.
     * </p>
     * 
     * @param resourceName
     *        The name of an IPAM resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of an IPAM resource.
     * </p>
     * 
     * @return The name of an IPAM resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of an IPAM resource.
     * </p>
     * 
     * @param resourceName
     *        The name of an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The CIDR for an IPAM resource.
     * </p>
     * 
     * @param resourceCidr
     *        The CIDR for an IPAM resource.
     */

    public void setResourceCidr(String resourceCidr) {
        this.resourceCidr = resourceCidr;
    }

    /**
     * <p>
     * The CIDR for an IPAM resource.
     * </p>
     * 
     * @return The CIDR for an IPAM resource.
     */

    public String getResourceCidr() {
        return this.resourceCidr;
    }

    /**
     * <p>
     * The CIDR for an IPAM resource.
     * </p>
     * 
     * @param resourceCidr
     *        The CIDR for an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withResourceCidr(String resourceCidr) {
        setResourceCidr(resourceCidr);
        return this;
    }

    /**
     * <p>
     * The type of IPAM resource.
     * </p>
     * 
     * @param resourceType
     *        The type of IPAM resource.
     * @see IpamResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of IPAM resource.
     * </p>
     * 
     * @return The type of IPAM resource.
     * @see IpamResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of IPAM resource.
     * </p>
     * 
     * @param resourceType
     *        The type of IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceType
     */

    public IpamResourceCidr withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of IPAM resource.
     * </p>
     * 
     * @param resourceType
     *        The type of IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceType
     */

    public IpamResourceCidr withResourceType(IpamResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tags for an IPAM resource.
     * </p>
     * 
     * @return The tags for an IPAM resource.
     */

    public java.util.List<IpamResourceTag> getResourceTags() {
        if (resourceTags == null) {
            resourceTags = new com.amazonaws.internal.SdkInternalList<IpamResourceTag>();
        }
        return resourceTags;
    }

    /**
     * <p>
     * The tags for an IPAM resource.
     * </p>
     * 
     * @param resourceTags
     *        The tags for an IPAM resource.
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
     * The tags for an IPAM resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        The tags for an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withResourceTags(IpamResourceTag... resourceTags) {
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
     * The tags for an IPAM resource.
     * </p>
     * 
     * @param resourceTags
     *        The tags for an IPAM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withResourceTags(java.util.Collection<IpamResourceTag> resourceTags) {
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
     * For a resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet
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
     *        For a resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by
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
     * For a resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet
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
     *         For a resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by
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
     * For a resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet
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
     *        For a resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by
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

    public IpamResourceCidr withIpUsage(Double ipUsage) {
        setIpUsage(ipUsage);
        return this;
    }

    /**
     * <p>
     * The compliance status of the IPAM resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param complianceStatus
     *        The compliance status of the IPAM resource. For more information on compliance statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamComplianceStatus
     */

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * The compliance status of the IPAM resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @return The compliance status of the IPAM resource. For more information on compliance statuses, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage
     *         by resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamComplianceStatus
     */

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * <p>
     * The compliance status of the IPAM resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param complianceStatus
     *        The compliance status of the IPAM resource. For more information on compliance statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamComplianceStatus
     */

    public IpamResourceCidr withComplianceStatus(String complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * The compliance status of the IPAM resource. For more information on compliance statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param complianceStatus
     *        The compliance status of the IPAM resource. For more information on compliance statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamComplianceStatus
     */

    public IpamResourceCidr withComplianceStatus(IpamComplianceStatus complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The management state of the resource. For more information about management states, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param managementState
     *        The management state of the resource. For more information about management states, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamManagementState
     */

    public void setManagementState(String managementState) {
        this.managementState = managementState;
    }

    /**
     * <p>
     * The management state of the resource. For more information about management states, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @return The management state of the resource. For more information about management states, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage
     *         by resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamManagementState
     */

    public String getManagementState() {
        return this.managementState;
    }

    /**
     * <p>
     * The management state of the resource. For more information about management states, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param managementState
     *        The management state of the resource. For more information about management states, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamManagementState
     */

    public IpamResourceCidr withManagementState(String managementState) {
        setManagementState(managementState);
        return this;
    }

    /**
     * <p>
     * The management state of the resource. For more information about management states, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param managementState
     *        The management state of the resource. For more information about management states, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamManagementState
     */

    public IpamResourceCidr withManagementState(IpamManagementState managementState) {
        this.managementState = managementState.toString();
        return this;
    }

    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param overlapStatus
     *        The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps
     *        with another CIDR in the scope. For more information on overlap statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamOverlapStatus
     */

    public void setOverlapStatus(String overlapStatus) {
        this.overlapStatus = overlapStatus;
    }

    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @return The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps
     *         with another CIDR in the scope. For more information on overlap statuses, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage
     *         by resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @see IpamOverlapStatus
     */

    public String getOverlapStatus() {
        return this.overlapStatus;
    }

    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param overlapStatus
     *        The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps
     *        with another CIDR in the scope. For more information on overlap statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamOverlapStatus
     */

    public IpamResourceCidr withOverlapStatus(String overlapStatus) {
        setOverlapStatus(overlapStatus);
        return this;
    }

    /**
     * <p>
     * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with
     * another CIDR in the scope. For more information on overlap statuses, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     * resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param overlapStatus
     *        The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps
     *        with another CIDR in the scope. For more information on overlap statuses, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/monitor-cidr-compliance-ipam.html">Monitor CIDR usage by
     *        resource</a> in the <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamOverlapStatus
     */

    public IpamResourceCidr withOverlapStatus(IpamOverlapStatus overlapStatus) {
        this.overlapStatus = overlapStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ID of a VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of a VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of a VPC.
     * </p>
     * 
     * @return The ID of a VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of a VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceCidr withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getIpamId() != null)
            sb.append("IpamId: ").append(getIpamId()).append(",");
        if (getIpamScopeId() != null)
            sb.append("IpamScopeId: ").append(getIpamScopeId()).append(",");
        if (getIpamPoolId() != null)
            sb.append("IpamPoolId: ").append(getIpamPoolId()).append(",");
        if (getResourceRegion() != null)
            sb.append("ResourceRegion: ").append(getResourceRegion()).append(",");
        if (getResourceOwnerId() != null)
            sb.append("ResourceOwnerId: ").append(getResourceOwnerId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResourceCidr() != null)
            sb.append("ResourceCidr: ").append(getResourceCidr()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getIpUsage() != null)
            sb.append("IpUsage: ").append(getIpUsage()).append(",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus()).append(",");
        if (getManagementState() != null)
            sb.append("ManagementState: ").append(getManagementState()).append(",");
        if (getOverlapStatus() != null)
            sb.append("OverlapStatus: ").append(getOverlapStatus()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamResourceCidr == false)
            return false;
        IpamResourceCidr other = (IpamResourceCidr) obj;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
            return false;
        if (other.getIpamScopeId() == null ^ this.getIpamScopeId() == null)
            return false;
        if (other.getIpamScopeId() != null && other.getIpamScopeId().equals(this.getIpamScopeId()) == false)
            return false;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getResourceRegion() == null ^ this.getResourceRegion() == null)
            return false;
        if (other.getResourceRegion() != null && other.getResourceRegion().equals(this.getResourceRegion()) == false)
            return false;
        if (other.getResourceOwnerId() == null ^ this.getResourceOwnerId() == null)
            return false;
        if (other.getResourceOwnerId() != null && other.getResourceOwnerId().equals(this.getResourceOwnerId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
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
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        if (other.getManagementState() == null ^ this.getManagementState() == null)
            return false;
        if (other.getManagementState() != null && other.getManagementState().equals(this.getManagementState()) == false)
            return false;
        if (other.getOverlapStatus() == null ^ this.getOverlapStatus() == null)
            return false;
        if (other.getOverlapStatus() != null && other.getOverlapStatus().equals(this.getOverlapStatus()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getIpamScopeId() == null) ? 0 : getIpamScopeId().hashCode());
        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getResourceRegion() == null) ? 0 : getResourceRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceOwnerId() == null) ? 0 : getResourceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResourceCidr() == null) ? 0 : getResourceCidr().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getIpUsage() == null) ? 0 : getIpUsage().hashCode());
        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getManagementState() == null) ? 0 : getManagementState().hashCode());
        hashCode = prime * hashCode + ((getOverlapStatus() == null) ? 0 : getOverlapStatus().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public IpamResourceCidr clone() {
        try {
            return (IpamResourceCidr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

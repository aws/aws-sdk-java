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
 * A public IP Address discovered by IPAM.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamDiscoveredPublicAddress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamDiscoveredPublicAddress implements Serializable, Cloneable {

    /**
     * <p>
     * The resource discovery ID.
     * </p>
     */
    private String ipamResourceDiscoveryId;
    /**
     * <p>
     * The Region of the resource the IP address is assigned to.
     * </p>
     */
    private String addressRegion;
    /**
     * <p>
     * The IP address.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The ID of the owner of the resource the IP address is assigned to.
     * </p>
     */
    private String addressOwnerId;
    /**
     * <p>
     * The allocation ID of the resource the IP address is assigned to.
     * </p>
     */
    private String addressAllocationId;
    /**
     * <p>
     * The association status.
     * </p>
     */
    private String associationStatus;
    /**
     * <p>
     * The IP address type.
     * </p>
     */
    private String addressType;
    /**
     * <p>
     * The Amazon Web Services service associated with the IP address.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The resource ARN or ID.
     * </p>
     */
    private String serviceResource;
    /**
     * <p>
     * The ID of the VPC that the resource with the assigned IP address is in.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the subnet that the resource with the assigned IP address is in.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The ID of the public IPv4 pool that the resource with the assigned IP address is from.
     * </p>
     */
    private String publicIpv4PoolId;
    /**
     * <p>
     * The network interface ID of the resource with the assigned IP address.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The description of the network interface that IP address is assigned to.
     * </p>
     */
    private String networkInterfaceDescription;
    /**
     * <p>
     * The instance ID of the instance the assigned IP address is assigned to.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Tags associated with the IP address.
     * </p>
     */
    private IpamPublicAddressTags tags;
    /**
     * <p>
     * The network border group that the resource that the IP address is assigned to is in.
     * </p>
     */
    private String networkBorderGroup;
    /**
     * <p>
     * Security groups associated with the resource that the IP address is assigned to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamPublicAddressSecurityGroup> securityGroups;
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

    public IpamDiscoveredPublicAddress withIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        setIpamResourceDiscoveryId(ipamResourceDiscoveryId);
        return this;
    }

    /**
     * <p>
     * The Region of the resource the IP address is assigned to.
     * </p>
     * 
     * @param addressRegion
     *        The Region of the resource the IP address is assigned to.
     */

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    /**
     * <p>
     * The Region of the resource the IP address is assigned to.
     * </p>
     * 
     * @return The Region of the resource the IP address is assigned to.
     */

    public String getAddressRegion() {
        return this.addressRegion;
    }

    /**
     * <p>
     * The Region of the resource the IP address is assigned to.
     * </p>
     * 
     * @param addressRegion
     *        The Region of the resource the IP address is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withAddressRegion(String addressRegion) {
        setAddressRegion(addressRegion);
        return this;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param address
     *        The IP address.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @return The IP address.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param address
     *        The IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The ID of the owner of the resource the IP address is assigned to.
     * </p>
     * 
     * @param addressOwnerId
     *        The ID of the owner of the resource the IP address is assigned to.
     */

    public void setAddressOwnerId(String addressOwnerId) {
        this.addressOwnerId = addressOwnerId;
    }

    /**
     * <p>
     * The ID of the owner of the resource the IP address is assigned to.
     * </p>
     * 
     * @return The ID of the owner of the resource the IP address is assigned to.
     */

    public String getAddressOwnerId() {
        return this.addressOwnerId;
    }

    /**
     * <p>
     * The ID of the owner of the resource the IP address is assigned to.
     * </p>
     * 
     * @param addressOwnerId
     *        The ID of the owner of the resource the IP address is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withAddressOwnerId(String addressOwnerId) {
        setAddressOwnerId(addressOwnerId);
        return this;
    }

    /**
     * <p>
     * The allocation ID of the resource the IP address is assigned to.
     * </p>
     * 
     * @param addressAllocationId
     *        The allocation ID of the resource the IP address is assigned to.
     */

    public void setAddressAllocationId(String addressAllocationId) {
        this.addressAllocationId = addressAllocationId;
    }

    /**
     * <p>
     * The allocation ID of the resource the IP address is assigned to.
     * </p>
     * 
     * @return The allocation ID of the resource the IP address is assigned to.
     */

    public String getAddressAllocationId() {
        return this.addressAllocationId;
    }

    /**
     * <p>
     * The allocation ID of the resource the IP address is assigned to.
     * </p>
     * 
     * @param addressAllocationId
     *        The allocation ID of the resource the IP address is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withAddressAllocationId(String addressAllocationId) {
        setAddressAllocationId(addressAllocationId);
        return this;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @param associationStatus
     *        The association status.
     * @see IpamPublicAddressAssociationStatus
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @return The association status.
     * @see IpamPublicAddressAssociationStatus
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @param associationStatus
     *        The association status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPublicAddressAssociationStatus
     */

    public IpamDiscoveredPublicAddress withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @param associationStatus
     *        The association status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPublicAddressAssociationStatus
     */

    public IpamDiscoveredPublicAddress withAssociationStatus(IpamPublicAddressAssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The IP address type.
     * </p>
     * 
     * @param addressType
     *        The IP address type.
     * @see IpamPublicAddressType
     */

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    /**
     * <p>
     * The IP address type.
     * </p>
     * 
     * @return The IP address type.
     * @see IpamPublicAddressType
     */

    public String getAddressType() {
        return this.addressType;
    }

    /**
     * <p>
     * The IP address type.
     * </p>
     * 
     * @param addressType
     *        The IP address type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPublicAddressType
     */

    public IpamDiscoveredPublicAddress withAddressType(String addressType) {
        setAddressType(addressType);
        return this;
    }

    /**
     * <p>
     * The IP address type.
     * </p>
     * 
     * @param addressType
     *        The IP address type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPublicAddressType
     */

    public IpamDiscoveredPublicAddress withAddressType(IpamPublicAddressType addressType) {
        this.addressType = addressType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service associated with the IP address.
     * </p>
     * 
     * @param service
     *        The Amazon Web Services service associated with the IP address.
     * @see IpamPublicAddressAwsService
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The Amazon Web Services service associated with the IP address.
     * </p>
     * 
     * @return The Amazon Web Services service associated with the IP address.
     * @see IpamPublicAddressAwsService
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The Amazon Web Services service associated with the IP address.
     * </p>
     * 
     * @param service
     *        The Amazon Web Services service associated with the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPublicAddressAwsService
     */

    public IpamDiscoveredPublicAddress withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service associated with the IP address.
     * </p>
     * 
     * @param service
     *        The Amazon Web Services service associated with the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPublicAddressAwsService
     */

    public IpamDiscoveredPublicAddress withService(IpamPublicAddressAwsService service) {
        this.service = service.toString();
        return this;
    }

    /**
     * <p>
     * The resource ARN or ID.
     * </p>
     * 
     * @param serviceResource
     *        The resource ARN or ID.
     */

    public void setServiceResource(String serviceResource) {
        this.serviceResource = serviceResource;
    }

    /**
     * <p>
     * The resource ARN or ID.
     * </p>
     * 
     * @return The resource ARN or ID.
     */

    public String getServiceResource() {
        return this.serviceResource;
    }

    /**
     * <p>
     * The resource ARN or ID.
     * </p>
     * 
     * @param serviceResource
     *        The resource ARN or ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withServiceResource(String serviceResource) {
        setServiceResource(serviceResource);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC that the resource with the assigned IP address is in.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC that the resource with the assigned IP address is in.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC that the resource with the assigned IP address is in.
     * </p>
     * 
     * @return The ID of the VPC that the resource with the assigned IP address is in.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC that the resource with the assigned IP address is in.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC that the resource with the assigned IP address is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet that the resource with the assigned IP address is in.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet that the resource with the assigned IP address is in.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet that the resource with the assigned IP address is in.
     * </p>
     * 
     * @return The ID of the subnet that the resource with the assigned IP address is in.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet that the resource with the assigned IP address is in.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet that the resource with the assigned IP address is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The ID of the public IPv4 pool that the resource with the assigned IP address is from.
     * </p>
     * 
     * @param publicIpv4PoolId
     *        The ID of the public IPv4 pool that the resource with the assigned IP address is from.
     */

    public void setPublicIpv4PoolId(String publicIpv4PoolId) {
        this.publicIpv4PoolId = publicIpv4PoolId;
    }

    /**
     * <p>
     * The ID of the public IPv4 pool that the resource with the assigned IP address is from.
     * </p>
     * 
     * @return The ID of the public IPv4 pool that the resource with the assigned IP address is from.
     */

    public String getPublicIpv4PoolId() {
        return this.publicIpv4PoolId;
    }

    /**
     * <p>
     * The ID of the public IPv4 pool that the resource with the assigned IP address is from.
     * </p>
     * 
     * @param publicIpv4PoolId
     *        The ID of the public IPv4 pool that the resource with the assigned IP address is from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withPublicIpv4PoolId(String publicIpv4PoolId) {
        setPublicIpv4PoolId(publicIpv4PoolId);
        return this;
    }

    /**
     * <p>
     * The network interface ID of the resource with the assigned IP address.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID of the resource with the assigned IP address.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID of the resource with the assigned IP address.
     * </p>
     * 
     * @return The network interface ID of the resource with the assigned IP address.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID of the resource with the assigned IP address.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID of the resource with the assigned IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The description of the network interface that IP address is assigned to.
     * </p>
     * 
     * @param networkInterfaceDescription
     *        The description of the network interface that IP address is assigned to.
     */

    public void setNetworkInterfaceDescription(String networkInterfaceDescription) {
        this.networkInterfaceDescription = networkInterfaceDescription;
    }

    /**
     * <p>
     * The description of the network interface that IP address is assigned to.
     * </p>
     * 
     * @return The description of the network interface that IP address is assigned to.
     */

    public String getNetworkInterfaceDescription() {
        return this.networkInterfaceDescription;
    }

    /**
     * <p>
     * The description of the network interface that IP address is assigned to.
     * </p>
     * 
     * @param networkInterfaceDescription
     *        The description of the network interface that IP address is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withNetworkInterfaceDescription(String networkInterfaceDescription) {
        setNetworkInterfaceDescription(networkInterfaceDescription);
        return this;
    }

    /**
     * <p>
     * The instance ID of the instance the assigned IP address is assigned to.
     * </p>
     * 
     * @param instanceId
     *        The instance ID of the instance the assigned IP address is assigned to.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID of the instance the assigned IP address is assigned to.
     * </p>
     * 
     * @return The instance ID of the instance the assigned IP address is assigned to.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID of the instance the assigned IP address is assigned to.
     * </p>
     * 
     * @param instanceId
     *        The instance ID of the instance the assigned IP address is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Tags associated with the IP address.
     * </p>
     * 
     * @param tags
     *        Tags associated with the IP address.
     */

    public void setTags(IpamPublicAddressTags tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the IP address.
     * </p>
     * 
     * @return Tags associated with the IP address.
     */

    public IpamPublicAddressTags getTags() {
        return this.tags;
    }

    /**
     * <p>
     * Tags associated with the IP address.
     * </p>
     * 
     * @param tags
     *        Tags associated with the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withTags(IpamPublicAddressTags tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The network border group that the resource that the IP address is assigned to is in.
     * </p>
     * 
     * @param networkBorderGroup
     *        The network border group that the resource that the IP address is assigned to is in.
     */

    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The network border group that the resource that the IP address is assigned to is in.
     * </p>
     * 
     * @return The network border group that the resource that the IP address is assigned to is in.
     */

    public String getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }

    /**
     * <p>
     * The network border group that the resource that the IP address is assigned to is in.
     * </p>
     * 
     * @param networkBorderGroup
     *        The network border group that the resource that the IP address is assigned to is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withNetworkBorderGroup(String networkBorderGroup) {
        setNetworkBorderGroup(networkBorderGroup);
        return this;
    }

    /**
     * <p>
     * Security groups associated with the resource that the IP address is assigned to.
     * </p>
     * 
     * @return Security groups associated with the resource that the IP address is assigned to.
     */

    public java.util.List<IpamPublicAddressSecurityGroup> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<IpamPublicAddressSecurityGroup>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * Security groups associated with the resource that the IP address is assigned to.
     * </p>
     * 
     * @param securityGroups
     *        Security groups associated with the resource that the IP address is assigned to.
     */

    public void setSecurityGroups(java.util.Collection<IpamPublicAddressSecurityGroup> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<IpamPublicAddressSecurityGroup>(securityGroups);
    }

    /**
     * <p>
     * Security groups associated with the resource that the IP address is assigned to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        Security groups associated with the resource that the IP address is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withSecurityGroups(IpamPublicAddressSecurityGroup... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<IpamPublicAddressSecurityGroup>(securityGroups.length));
        }
        for (IpamPublicAddressSecurityGroup ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Security groups associated with the resource that the IP address is assigned to.
     * </p>
     * 
     * @param securityGroups
     *        Security groups associated with the resource that the IP address is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredPublicAddress withSecurityGroups(java.util.Collection<IpamPublicAddressSecurityGroup> securityGroups) {
        setSecurityGroups(securityGroups);
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

    public IpamDiscoveredPublicAddress withSampleTime(java.util.Date sampleTime) {
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
        if (getAddressRegion() != null)
            sb.append("AddressRegion: ").append(getAddressRegion()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getAddressOwnerId() != null)
            sb.append("AddressOwnerId: ").append(getAddressOwnerId()).append(",");
        if (getAddressAllocationId() != null)
            sb.append("AddressAllocationId: ").append(getAddressAllocationId()).append(",");
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus()).append(",");
        if (getAddressType() != null)
            sb.append("AddressType: ").append(getAddressType()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getServiceResource() != null)
            sb.append("ServiceResource: ").append(getServiceResource()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getPublicIpv4PoolId() != null)
            sb.append("PublicIpv4PoolId: ").append(getPublicIpv4PoolId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getNetworkInterfaceDescription() != null)
            sb.append("NetworkInterfaceDescription: ").append(getNetworkInterfaceDescription()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: ").append(getNetworkBorderGroup()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
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

        if (obj instanceof IpamDiscoveredPublicAddress == false)
            return false;
        IpamDiscoveredPublicAddress other = (IpamDiscoveredPublicAddress) obj;
        if (other.getIpamResourceDiscoveryId() == null ^ this.getIpamResourceDiscoveryId() == null)
            return false;
        if (other.getIpamResourceDiscoveryId() != null && other.getIpamResourceDiscoveryId().equals(this.getIpamResourceDiscoveryId()) == false)
            return false;
        if (other.getAddressRegion() == null ^ this.getAddressRegion() == null)
            return false;
        if (other.getAddressRegion() != null && other.getAddressRegion().equals(this.getAddressRegion()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getAddressOwnerId() == null ^ this.getAddressOwnerId() == null)
            return false;
        if (other.getAddressOwnerId() != null && other.getAddressOwnerId().equals(this.getAddressOwnerId()) == false)
            return false;
        if (other.getAddressAllocationId() == null ^ this.getAddressAllocationId() == null)
            return false;
        if (other.getAddressAllocationId() != null && other.getAddressAllocationId().equals(this.getAddressAllocationId()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        if (other.getAddressType() == null ^ this.getAddressType() == null)
            return false;
        if (other.getAddressType() != null && other.getAddressType().equals(this.getAddressType()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getServiceResource() == null ^ this.getServiceResource() == null)
            return false;
        if (other.getServiceResource() != null && other.getServiceResource().equals(this.getServiceResource()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getPublicIpv4PoolId() == null ^ this.getPublicIpv4PoolId() == null)
            return false;
        if (other.getPublicIpv4PoolId() != null && other.getPublicIpv4PoolId().equals(this.getPublicIpv4PoolId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNetworkInterfaceDescription() == null ^ this.getNetworkInterfaceDescription() == null)
            return false;
        if (other.getNetworkInterfaceDescription() != null && other.getNetworkInterfaceDescription().equals(this.getNetworkInterfaceDescription()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
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
        hashCode = prime * hashCode + ((getAddressRegion() == null) ? 0 : getAddressRegion().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getAddressOwnerId() == null) ? 0 : getAddressOwnerId().hashCode());
        hashCode = prime * hashCode + ((getAddressAllocationId() == null) ? 0 : getAddressAllocationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getAddressType() == null) ? 0 : getAddressType().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getServiceResource() == null) ? 0 : getServiceResource().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getPublicIpv4PoolId() == null) ? 0 : getPublicIpv4PoolId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceDescription() == null) ? 0 : getNetworkInterfaceDescription().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSampleTime() == null) ? 0 : getSampleTime().hashCode());
        return hashCode;
    }

    @Override
    public IpamDiscoveredPublicAddress clone() {
        try {
            return (IpamDiscoveredPublicAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The parameters for a network interface.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateInstanceNetworkInterfaceSpecificationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateInstanceNetworkInterfaceSpecificationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Associates a public IPv4 address with eth0 for a new network interface.
     * </p>
     */
    private Boolean associatePublicIpAddress;
    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * A description for the network interface.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The device index for the network interface attachment.
     * </p>
     */
    private Integer deviceIndex;
    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groups;
    /**
     * <p>
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6
     * addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * </p>
     */
    private Integer ipv6AddressCount;
    /**
     * <p>
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if
     * you're specifying a number of IPv6 addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceIpv6AddressRequest> ipv6Addresses;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The primary private IPv4 address of the network interface.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * One or more private IPv4 addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> privateIpAddresses;
    /**
     * <p>
     * The number of secondary private IPv4 addresses to assign to a network interface.
     * </p>
     */
    private Integer secondaryPrivateIpAddressCount;
    /**
     * <p>
     * The ID of the subnet for the network interface.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * Associates a public IPv4 address with eth0 for a new network interface.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Associates a public IPv4 address with eth0 for a new network interface.
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * Associates a public IPv4 address with eth0 for a new network interface.
     * </p>
     * 
     * @return Associates a public IPv4 address with eth0 for a new network interface.
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Associates a public IPv4 address with eth0 for a new network interface.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Associates a public IPv4 address with eth0 for a new network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * Associates a public IPv4 address with eth0 for a new network interface.
     * </p>
     * 
     * @return Associates a public IPv4 address with eth0 for a new network interface.
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the network interface is deleted when the instance is terminated.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     * 
     * @return Indicates whether the network interface is deleted when the instance is terminated.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the network interface is deleted when the instance is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     * 
     * @return Indicates whether the network interface is deleted when the instance is terminated.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @param description
     *        A description for the network interface.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @return A description for the network interface.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @param description
     *        A description for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The device index for the network interface attachment.
     * </p>
     * 
     * @param deviceIndex
     *        The device index for the network interface attachment.
     */

    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    /**
     * <p>
     * The device index for the network interface attachment.
     * </p>
     * 
     * @return The device index for the network interface attachment.
     */

    public Integer getDeviceIndex() {
        return this.deviceIndex;
    }

    /**
     * <p>
     * The device index for the network interface attachment.
     * </p>
     * 
     * @param deviceIndex
     *        The device index for the network interface attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withDeviceIndex(Integer deviceIndex) {
        setDeviceIndex(deviceIndex);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * 
     * @return The IDs of one or more security groups.
     */

    public java.util.List<String> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groups;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * 
     * @param groups
     *        The IDs of one or more security groups.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<String>(groups);
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The IDs of one or more security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * 
     * @param groups
     *        The IDs of one or more security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6
     * addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * </p>
     * 
     * @param ipv6AddressCount
     *        The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6
     *        addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     */

    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6
     * addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * </p>
     * 
     * @return The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6
     *         addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     */

    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6
     * addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * </p>
     * 
     * @param ipv6AddressCount
     *        The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6
     *        addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withIpv6AddressCount(Integer ipv6AddressCount) {
        setIpv6AddressCount(ipv6AddressCount);
        return this;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if
     * you're specifying a number of IPv6 addresses.
     * </p>
     * 
     * @return One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this
     *         option if you're specifying a number of IPv6 addresses.
     */

    public java.util.List<InstanceIpv6AddressRequest> getIpv6Addresses() {
        if (ipv6Addresses == null) {
            ipv6Addresses = new com.amazonaws.internal.SdkInternalList<InstanceIpv6AddressRequest>();
        }
        return ipv6Addresses;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if
     * you're specifying a number of IPv6 addresses.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this
     *        option if you're specifying a number of IPv6 addresses.
     */

    public void setIpv6Addresses(java.util.Collection<InstanceIpv6AddressRequest> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new com.amazonaws.internal.SdkInternalList<InstanceIpv6AddressRequest>(ipv6Addresses);
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if
     * you're specifying a number of IPv6 addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Addresses(java.util.Collection)} or {@link #withIpv6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this
     *        option if you're specifying a number of IPv6 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withIpv6Addresses(InstanceIpv6AddressRequest... ipv6Addresses) {
        if (this.ipv6Addresses == null) {
            setIpv6Addresses(new com.amazonaws.internal.SdkInternalList<InstanceIpv6AddressRequest>(ipv6Addresses.length));
        }
        for (InstanceIpv6AddressRequest ele : ipv6Addresses) {
            this.ipv6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if
     * you're specifying a number of IPv6 addresses.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this
     *        option if you're specifying a number of IPv6 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withIpv6Addresses(java.util.Collection<InstanceIpv6AddressRequest> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
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

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The primary private IPv4 address of the network interface.
     * </p>
     * 
     * @param privateIpAddress
     *        The primary private IPv4 address of the network interface.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The primary private IPv4 address of the network interface.
     * </p>
     * 
     * @return The primary private IPv4 address of the network interface.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The primary private IPv4 address of the network interface.
     * </p>
     * 
     * @param privateIpAddress
     *        The primary private IPv4 address of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * One or more private IPv4 addresses.
     * </p>
     * 
     * @return One or more private IPv4 addresses.
     */

    public java.util.List<PrivateIpAddressSpecification> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
            privateIpAddresses = new com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>();
        }
        return privateIpAddresses;
    }

    /**
     * <p>
     * One or more private IPv4 addresses.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IPv4 addresses.
     */

    public void setPrivateIpAddresses(java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>(privateIpAddresses);
    }

    /**
     * <p>
     * One or more private IPv4 addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IPv4 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withPrivateIpAddresses(PrivateIpAddressSpecification... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>(privateIpAddresses.length));
        }
        for (PrivateIpAddressSpecification ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more private IPv4 addresses.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IPv4 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withPrivateIpAddresses(
            java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses to assign to a network interface.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary private IPv4 addresses to assign to a network interface.
     */

    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses to assign to a network interface.
     * </p>
     * 
     * @return The number of secondary private IPv4 addresses to assign to a network interface.
     */

    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses to assign to a network interface.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary private IPv4 addresses to assign to a network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        setSecondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet for the network interface.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet for the network interface.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet for the network interface.
     * </p>
     * 
     * @return The ID of the subnet for the network interface.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet for the network interface.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
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
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: ").append(getAssociatePublicIpAddress()).append(",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeviceIndex() != null)
            sb.append("DeviceIndex: ").append(getDeviceIndex()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getIpv6AddressCount() != null)
            sb.append("Ipv6AddressCount: ").append(getIpv6AddressCount()).append(",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: ").append(getIpv6Addresses()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: ").append(getPrivateIpAddresses()).append(",");
        if (getSecondaryPrivateIpAddressCount() != null)
            sb.append("SecondaryPrivateIpAddressCount: ").append(getSecondaryPrivateIpAddressCount()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateInstanceNetworkInterfaceSpecificationRequest == false)
            return false;
        LaunchTemplateInstanceNetworkInterfaceSpecificationRequest other = (LaunchTemplateInstanceNetworkInterfaceSpecificationRequest) obj;
        if (other.getAssociatePublicIpAddress() == null ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null && other.getAssociatePublicIpAddress().equals(this.getAssociatePublicIpAddress()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeviceIndex() == null ^ this.getDeviceIndex() == null)
            return false;
        if (other.getDeviceIndex() != null && other.getDeviceIndex().equals(this.getDeviceIndex()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getIpv6AddressCount() == null ^ this.getIpv6AddressCount() == null)
            return false;
        if (other.getIpv6AddressCount() != null && other.getIpv6AddressCount().equals(this.getIpv6AddressCount()) == false)
            return false;
        if (other.getIpv6Addresses() == null ^ this.getIpv6Addresses() == null)
            return false;
        if (other.getIpv6Addresses() != null && other.getIpv6Addresses().equals(this.getIpv6Addresses()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() == null ^ this.getSecondaryPrivateIpAddressCount() == null)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() != null
                && other.getSecondaryPrivateIpAddressCount().equals(this.getSecondaryPrivateIpAddressCount()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeviceIndex() == null) ? 0 : getDeviceIndex().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getIpv6AddressCount() == null) ? 0 : getIpv6AddressCount().hashCode());
        hashCode = prime * hashCode + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getSecondaryPrivateIpAddressCount() == null) ? 0 : getSecondaryPrivateIpAddressCount().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest clone() {
        try {
            return (LaunchTemplateInstanceNetworkInterfaceSpecificationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

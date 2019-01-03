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
 * Describes a network interface for a Scheduled Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ScheduledInstancesNetworkInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstancesNetworkInterface implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address can
     * only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an
     * existing one. You cannot specify more than one network interface in the request. If launching into a default
     * subnet, the default value is <code>true</code>.
     * </p>
     */
    private Boolean associatePublicIpAddress;
    /**
     * <p>
     * Indicates whether to delete the interface when the instance is terminated.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The index of the device for the network interface attachment.
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
     * The number of IPv6 addresses to assign to the network interface. The IPv6 addresses are automatically selected
     * from the subnet range.
     * </p>
     */
    private Integer ipv6AddressCount;
    /**
     * <p>
     * One or more specific IPv6 addresses from the subnet range.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledInstancesIpv6Address> ipv6Addresses;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs;
    /**
     * <p>
     * The number of secondary private IPv4 addresses.
     * </p>
     */
    private Integer secondaryPrivateIpAddressCount;
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address can
     * only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an
     * existing one. You cannot specify more than one network interface in the request. If launching into a default
     * subnet, the default value is <code>true</code>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address
     *        can only be assigned to a network interface for eth0, and can only be assigned to a new network interface,
     *        not an existing one. You cannot specify more than one network interface in the request. If launching into
     *        a default subnet, the default value is <code>true</code>.
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address can
     * only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an
     * existing one. You cannot specify more than one network interface in the request. If launching into a default
     * subnet, the default value is <code>true</code>.
     * </p>
     * 
     * @return Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address
     *         can only be assigned to a network interface for eth0, and can only be assigned to a new network
     *         interface, not an existing one. You cannot specify more than one network interface in the request. If
     *         launching into a default subnet, the default value is <code>true</code>.
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address can
     * only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an
     * existing one. You cannot specify more than one network interface in the request. If launching into a default
     * subnet, the default value is <code>true</code>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address
     *        can only be assigned to a network interface for eth0, and can only be assigned to a new network interface,
     *        not an existing one. You cannot specify more than one network interface in the request. If launching into
     *        a default subnet, the default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address can
     * only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an
     * existing one. You cannot specify more than one network interface in the request. If launching into a default
     * subnet, the default value is <code>true</code>.
     * </p>
     * 
     * @return Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address
     *         can only be assigned to a network interface for eth0, and can only be assigned to a new network
     *         interface, not an existing one. You cannot specify more than one network interface in the request. If
     *         launching into a default subnet, the default value is <code>true</code>.
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to delete the interface when the instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether to delete the interface when the instance is terminated.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether to delete the interface when the instance is terminated.
     * </p>
     * 
     * @return Indicates whether to delete the interface when the instance is terminated.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether to delete the interface when the instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether to delete the interface when the instance is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether to delete the interface when the instance is terminated.
     * </p>
     * 
     * @return Indicates whether to delete the interface when the instance is terminated.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The index of the device for the network interface attachment.
     * </p>
     * 
     * @param deviceIndex
     *        The index of the device for the network interface attachment.
     */

    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    /**
     * <p>
     * The index of the device for the network interface attachment.
     * </p>
     * 
     * @return The index of the device for the network interface attachment.
     */

    public Integer getDeviceIndex() {
        return this.deviceIndex;
    }

    /**
     * <p>
     * The index of the device for the network interface attachment.
     * </p>
     * 
     * @param deviceIndex
     *        The index of the device for the network interface attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withDeviceIndex(Integer deviceIndex) {
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

    public ScheduledInstancesNetworkInterface withGroups(String... groups) {
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

    public ScheduledInstancesNetworkInterface withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. The IPv6 addresses are automatically selected
     * from the subnet range.
     * </p>
     * 
     * @param ipv6AddressCount
     *        The number of IPv6 addresses to assign to the network interface. The IPv6 addresses are automatically
     *        selected from the subnet range.
     */

    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. The IPv6 addresses are automatically selected
     * from the subnet range.
     * </p>
     * 
     * @return The number of IPv6 addresses to assign to the network interface. The IPv6 addresses are automatically
     *         selected from the subnet range.
     */

    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. The IPv6 addresses are automatically selected
     * from the subnet range.
     * </p>
     * 
     * @param ipv6AddressCount
     *        The number of IPv6 addresses to assign to the network interface. The IPv6 addresses are automatically
     *        selected from the subnet range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withIpv6AddressCount(Integer ipv6AddressCount) {
        setIpv6AddressCount(ipv6AddressCount);
        return this;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the subnet range.
     * </p>
     * 
     * @return One or more specific IPv6 addresses from the subnet range.
     */

    public java.util.List<ScheduledInstancesIpv6Address> getIpv6Addresses() {
        if (ipv6Addresses == null) {
            ipv6Addresses = new com.amazonaws.internal.SdkInternalList<ScheduledInstancesIpv6Address>();
        }
        return ipv6Addresses;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the subnet range.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more specific IPv6 addresses from the subnet range.
     */

    public void setIpv6Addresses(java.util.Collection<ScheduledInstancesIpv6Address> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new com.amazonaws.internal.SdkInternalList<ScheduledInstancesIpv6Address>(ipv6Addresses);
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the subnet range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Addresses(java.util.Collection)} or {@link #withIpv6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more specific IPv6 addresses from the subnet range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withIpv6Addresses(ScheduledInstancesIpv6Address... ipv6Addresses) {
        if (this.ipv6Addresses == null) {
            setIpv6Addresses(new com.amazonaws.internal.SdkInternalList<ScheduledInstancesIpv6Address>(ipv6Addresses.length));
        }
        for (ScheduledInstancesIpv6Address ele : ipv6Addresses) {
            this.ipv6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses from the subnet range.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more specific IPv6 addresses from the subnet range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withIpv6Addresses(java.util.Collection<ScheduledInstancesIpv6Address> ipv6Addresses) {
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

    public ScheduledInstancesNetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     * 
     * @param privateIpAddress
     *        The IPv4 address of the network interface within the subnet.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     * 
     * @return The IPv4 address of the network interface within the subnet.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     * 
     * @param privateIpAddress
     *        The IPv4 address of the network interface within the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     * 
     * @return The private IPv4 addresses.
     */

    public java.util.List<ScheduledInstancesPrivateIpAddressConfig> getPrivateIpAddressConfigs() {
        if (privateIpAddressConfigs == null) {
            privateIpAddressConfigs = new com.amazonaws.internal.SdkInternalList<ScheduledInstancesPrivateIpAddressConfig>();
        }
        return privateIpAddressConfigs;
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     * 
     * @param privateIpAddressConfigs
     *        The private IPv4 addresses.
     */

    public void setPrivateIpAddressConfigs(java.util.Collection<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs) {
        if (privateIpAddressConfigs == null) {
            this.privateIpAddressConfigs = null;
            return;
        }

        this.privateIpAddressConfigs = new com.amazonaws.internal.SdkInternalList<ScheduledInstancesPrivateIpAddressConfig>(privateIpAddressConfigs);
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddressConfigs(java.util.Collection)} or
     * {@link #withPrivateIpAddressConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddressConfigs
     *        The private IPv4 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withPrivateIpAddressConfigs(ScheduledInstancesPrivateIpAddressConfig... privateIpAddressConfigs) {
        if (this.privateIpAddressConfigs == null) {
            setPrivateIpAddressConfigs(new com.amazonaws.internal.SdkInternalList<ScheduledInstancesPrivateIpAddressConfig>(privateIpAddressConfigs.length));
        }
        for (ScheduledInstancesPrivateIpAddressConfig ele : privateIpAddressConfigs) {
            this.privateIpAddressConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     * 
     * @param privateIpAddressConfigs
     *        The private IPv4 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withPrivateIpAddressConfigs(java.util.Collection<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs) {
        setPrivateIpAddressConfigs(privateIpAddressConfigs);
        return this;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary private IPv4 addresses.
     */

    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses.
     * </p>
     * 
     * @return The number of secondary private IPv4 addresses.
     */

    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IPv4 addresses.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary private IPv4 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        setSecondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesNetworkInterface withSubnetId(String subnetId) {
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
        if (getPrivateIpAddressConfigs() != null)
            sb.append("PrivateIpAddressConfigs: ").append(getPrivateIpAddressConfigs()).append(",");
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

        if (obj instanceof ScheduledInstancesNetworkInterface == false)
            return false;
        ScheduledInstancesNetworkInterface other = (ScheduledInstancesNetworkInterface) obj;
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
        if (other.getPrivateIpAddressConfigs() == null ^ this.getPrivateIpAddressConfigs() == null)
            return false;
        if (other.getPrivateIpAddressConfigs() != null && other.getPrivateIpAddressConfigs().equals(this.getPrivateIpAddressConfigs()) == false)
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
        hashCode = prime * hashCode + ((getPrivateIpAddressConfigs() == null) ? 0 : getPrivateIpAddressConfigs().hashCode());
        hashCode = prime * hashCode + ((getSecondaryPrivateIpAddressCount() == null) ? 0 : getSecondaryPrivateIpAddressCount().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledInstancesNetworkInterface clone() {
        try {
            return (ScheduledInstancesNetworkInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * Describes a network interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceNetworkInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceNetworkInterface implements Serializable, Cloneable {

    /**
     * <p>
     * The association information for an Elastic IPv4 associated with the network interface.
     * </p>
     */
    private InstanceNetworkInterfaceAssociation association;
    /**
     * <p>
     * The network interface attachment.
     * </p>
     */
    private InstanceNetworkInterfaceAttachment attachment;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * One or more security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupIdentifier> groups;
    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceIpv6Address> ipv6Addresses;
    /**
     * <p>
     * The MAC address.
     * </p>
     */
    private String macAddress;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The ID of the AWS account that created the network interface.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The private DNS name.
     * </p>
     */
    private String privateDnsName;
    /**
     * <p>
     * The IPv4 address of the network interface within the subnet.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstancePrivateIpAddress> privateIpAddresses;
    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network interface.
     * </p>
     */
    private Boolean sourceDestCheck;
    /**
     * <p>
     * The status of the network interface.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The association information for an Elastic IPv4 associated with the network interface.
     * </p>
     * 
     * @param association
     *        The association information for an Elastic IPv4 associated with the network interface.
     */

    public void setAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
    }

    /**
     * <p>
     * The association information for an Elastic IPv4 associated with the network interface.
     * </p>
     * 
     * @return The association information for an Elastic IPv4 associated with the network interface.
     */

    public InstanceNetworkInterfaceAssociation getAssociation() {
        return this.association;
    }

    /**
     * <p>
     * The association information for an Elastic IPv4 associated with the network interface.
     * </p>
     * 
     * @param association
     *        The association information for an Elastic IPv4 associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withAssociation(InstanceNetworkInterfaceAssociation association) {
        setAssociation(association);
        return this;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     * 
     * @param attachment
     *        The network interface attachment.
     */

    public void setAttachment(InstanceNetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     * 
     * @return The network interface attachment.
     */

    public InstanceNetworkInterfaceAttachment getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     * 
     * @param attachment
     *        The network interface attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withAttachment(InstanceNetworkInterfaceAttachment attachment) {
        setAttachment(attachment);
        return this;
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

    public InstanceNetworkInterface withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * One or more security groups.
     * </p>
     * 
     * @return One or more security groups.
     */

    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>();
        }
        return groups;
    }

    /**
     * <p>
     * One or more security groups.
     * </p>
     * 
     * @param groups
     *        One or more security groups.
     */

    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(groups);
    }

    /**
     * <p>
     * One or more security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        One or more security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withGroups(GroupIdentifier... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(groups.length));
        }
        for (GroupIdentifier ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security groups.
     * </p>
     * 
     * @param groups
     *        One or more security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withGroups(java.util.Collection<GroupIdentifier> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     * 
     * @return One or more IPv6 addresses associated with the network interface.
     */

    public java.util.List<InstanceIpv6Address> getIpv6Addresses() {
        if (ipv6Addresses == null) {
            ipv6Addresses = new com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>();
        }
        return ipv6Addresses;
    }

    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more IPv6 addresses associated with the network interface.
     */

    public void setIpv6Addresses(java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>(ipv6Addresses);
    }

    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Addresses(java.util.Collection)} or {@link #withIpv6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more IPv6 addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withIpv6Addresses(InstanceIpv6Address... ipv6Addresses) {
        if (this.ipv6Addresses == null) {
            setIpv6Addresses(new com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>(ipv6Addresses.length));
        }
        for (InstanceIpv6Address ele : ipv6Addresses) {
            this.ipv6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more IPv6 addresses associated with the network interface.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more IPv6 addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withIpv6Addresses(java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
        return this;
    }

    /**
     * <p>
     * The MAC address.
     * </p>
     * 
     * @param macAddress
     *        The MAC address.
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * The MAC address.
     * </p>
     * 
     * @return The MAC address.
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * <p>
     * The MAC address.
     * </p>
     * 
     * @param macAddress
     *        The MAC address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withMacAddress(String macAddress) {
        setMacAddress(macAddress);
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

    public InstanceNetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that created the network interface.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that created the network interface.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that created the network interface.
     * </p>
     * 
     * @return The ID of the AWS account that created the network interface.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that created the network interface.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that created the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The private DNS name.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name.
     */

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name.
     * </p>
     * 
     * @return The private DNS name.
     */

    public String getPrivateDnsName() {
        return this.privateDnsName;
    }

    /**
     * <p>
     * The private DNS name.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
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

    public InstanceNetworkInterface withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     * 
     * @return One or more private IPv4 addresses associated with the network interface.
     */

    public java.util.List<InstancePrivateIpAddress> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
            privateIpAddresses = new com.amazonaws.internal.SdkInternalList<InstancePrivateIpAddress>();
        }
        return privateIpAddresses;
    }

    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IPv4 addresses associated with the network interface.
     */

    public void setPrivateIpAddresses(java.util.Collection<InstancePrivateIpAddress> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new com.amazonaws.internal.SdkInternalList<InstancePrivateIpAddress>(privateIpAddresses);
    }

    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IPv4 addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withPrivateIpAddresses(InstancePrivateIpAddress... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new com.amazonaws.internal.SdkInternalList<InstancePrivateIpAddress>(privateIpAddresses.length));
        }
        for (InstancePrivateIpAddress ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more private IPv4 addresses associated with the network interface.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IPv4 addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withPrivateIpAddresses(java.util.Collection<InstancePrivateIpAddress> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network interface.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether to validate network traffic to or from this network interface.
     */

    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network interface.
     * </p>
     * 
     * @return Indicates whether to validate network traffic to or from this network interface.
     */

    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network interface.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether to validate network traffic to or from this network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withSourceDestCheck(Boolean sourceDestCheck) {
        setSourceDestCheck(sourceDestCheck);
        return this;
    }

    /**
     * <p>
     * Indicates whether to validate network traffic to or from this network interface.
     * </p>
     * 
     * @return Indicates whether to validate network traffic to or from this network interface.
     */

    public Boolean isSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * 
     * @param status
     *        The status of the network interface.
     * @see NetworkInterfaceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * 
     * @return The status of the network interface.
     * @see NetworkInterfaceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * 
     * @param status
     *        The status of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceStatus
     */

    public InstanceNetworkInterface withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * 
     * @param status
     *        The status of the network interface.
     * @see NetworkInterfaceStatus
     */

    public void setStatus(NetworkInterfaceStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * 
     * @param status
     *        The status of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceStatus
     */

    public InstanceNetworkInterface withStatus(NetworkInterfaceStatus status) {
        this.status = status.toString();
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

    public InstanceNetworkInterface withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworkInterface withVpcId(String vpcId) {
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
        if (getAssociation() != null)
            sb.append("Association: ").append(getAssociation()).append(",");
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: ").append(getIpv6Addresses()).append(",");
        if (getMacAddress() != null)
            sb.append("MacAddress: ").append(getMacAddress()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: ").append(getPrivateDnsName()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: ").append(getPrivateIpAddresses()).append(",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: ").append(getSourceDestCheck()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
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

        if (obj instanceof InstanceNetworkInterface == false)
            return false;
        InstanceNetworkInterface other = (InstanceNetworkInterface) obj;
        if (other.getAssociation() == null ^ this.getAssociation() == null)
            return false;
        if (other.getAssociation() != null && other.getAssociation().equals(this.getAssociation()) == false)
            return false;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getIpv6Addresses() == null ^ this.getIpv6Addresses() == null)
            return false;
        if (other.getIpv6Addresses() != null && other.getIpv6Addresses().equals(this.getIpv6Addresses()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
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

        hashCode = prime * hashCode + ((getAssociation() == null) ? 0 : getAssociation().hashCode());
        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public InstanceNetworkInterface clone() {
        try {
            return (InstanceNetworkInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

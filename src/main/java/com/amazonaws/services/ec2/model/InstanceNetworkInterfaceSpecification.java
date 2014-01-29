/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a network interface.
 * </p>
 */
public class InstanceNetworkInterfaceSpecification implements Serializable {

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * The index of the device on the instance for the network interface
     * attachment.
     */
    private Integer deviceIndex;

    /**
     * The ID of the subnet associated with the network string.
     */
    private String subnetId;

    /**
     * The description of the network interface.
     */
    private String description;

    /**
     * The private IP address of the network interface.
     */
    private String privateIpAddress;

    /**
     * The IDs of the security groups for the network interface.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groups;

    /**
     * If set to <code>true</code>, the interface is deleted when the
     * instance is terminated.
     */
    private Boolean deleteOnTermination;

    /**
     * One or more private IP addresses to assign to the network interface.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification> privateIpAddresses;

    /**
     * The number of secondary private IP addresses.
     */
    private Integer secondaryPrivateIpAddressCount;

    /**
     * Indicates whether to auto-assign a public IP address to an instance in
     * a VPC. This public IP address can be assigned to the network interface
     * for eth0 only when you launch the instance. You must create the
     * network interface instead of using an existing network interface for
     * eth0, and you must not specify more than one network interface.
     */
    private Boolean associatePublicIpAddress;

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
    public InstanceNetworkInterfaceSpecification withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The index of the device on the instance for the network interface
     * attachment.
     *
     * @return The index of the device on the instance for the network interface
     *         attachment.
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }
    
    /**
     * The index of the device on the instance for the network interface
     * attachment.
     *
     * @param deviceIndex The index of the device on the instance for the network interface
     *         attachment.
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }
    
    /**
     * The index of the device on the instance for the network interface
     * attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceIndex The index of the device on the instance for the network interface
     *         attachment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * The ID of the subnet associated with the network string.
     *
     * @return The ID of the subnet associated with the network string.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet associated with the network string.
     *
     * @param subnetId The ID of the subnet associated with the network string.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet associated with the network string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet associated with the network string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The description of the network interface.
     *
     * @return The description of the network interface.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the network interface.
     *
     * @param description The description of the network interface.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The private IP address of the network interface.
     *
     * @return The private IP address of the network interface.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * The private IP address of the network interface.
     *
     * @param privateIpAddress The private IP address of the network interface.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * The private IP address of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The private IP address of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * The IDs of the security groups for the network interface.
     *
     * @return The IDs of the security groups for the network interface.
     */
    public java.util.List<String> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * The IDs of the security groups for the network interface.
     *
     * @param groups The IDs of the security groups for the network interface.
     */
    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groups.size());
        groupsCopy.addAll(groups);
        this.groups = groupsCopy;
    }
    
    /**
     * The IDs of the security groups for the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The IDs of the security groups for the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withGroups(String... groups) {
        if (getGroups() == null) setGroups(new java.util.ArrayList<String>(groups.length));
        for (String value : groups) {
            getGroups().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the security groups for the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The IDs of the security groups for the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groups.size());
            groupsCopy.addAll(groups);
            this.groups = groupsCopy;
        }

        return this;
    }

    /**
     * If set to <code>true</code>, the interface is deleted when the
     * instance is terminated.
     *
     * @return If set to <code>true</code>, the interface is deleted when the
     *         instance is terminated.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * If set to <code>true</code>, the interface is deleted when the
     * instance is terminated.
     *
     * @param deleteOnTermination If set to <code>true</code>, the interface is deleted when the
     *         instance is terminated.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * If set to <code>true</code>, the interface is deleted when the
     * instance is terminated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination If set to <code>true</code>, the interface is deleted when the
     *         instance is terminated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * If set to <code>true</code>, the interface is deleted when the
     * instance is terminated.
     *
     * @return If set to <code>true</code>, the interface is deleted when the
     *         instance is terminated.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * One or more private IP addresses to assign to the network interface.
     *
     * @return One or more private IP addresses to assign to the network interface.
     */
    public java.util.List<PrivateIpAddressSpecification> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
              privateIpAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification>();
              privateIpAddresses.setAutoConstruct(true);
        }
        return privateIpAddresses;
    }
    
    /**
     * One or more private IP addresses to assign to the network interface.
     *
     * @param privateIpAddresses One or more private IP addresses to assign to the network interface.
     */
    public void setPrivateIpAddresses(java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification> privateIpAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification>(privateIpAddresses.size());
        privateIpAddressesCopy.addAll(privateIpAddresses);
        this.privateIpAddresses = privateIpAddressesCopy;
    }
    
    /**
     * One or more private IP addresses to assign to the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses One or more private IP addresses to assign to the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withPrivateIpAddresses(PrivateIpAddressSpecification... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) setPrivateIpAddresses(new java.util.ArrayList<PrivateIpAddressSpecification>(privateIpAddresses.length));
        for (PrivateIpAddressSpecification value : privateIpAddresses) {
            getPrivateIpAddresses().add(value);
        }
        return this;
    }
    
    /**
     * One or more private IP addresses to assign to the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses One or more private IP addresses to assign to the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withPrivateIpAddresses(java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification> privateIpAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification>(privateIpAddresses.size());
            privateIpAddressesCopy.addAll(privateIpAddresses);
            this.privateIpAddresses = privateIpAddressesCopy;
        }

        return this;
    }

    /**
     * The number of secondary private IP addresses.
     *
     * @return The number of secondary private IP addresses.
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }
    
    /**
     * The number of secondary private IP addresses.
     *
     * @param secondaryPrivateIpAddressCount The number of secondary private IP addresses.
     */
    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }
    
    /**
     * The number of secondary private IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secondaryPrivateIpAddressCount The number of secondary private IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * Indicates whether to auto-assign a public IP address to an instance in
     * a VPC. This public IP address can be assigned to the network interface
     * for eth0 only when you launch the instance. You must create the
     * network interface instead of using an existing network interface for
     * eth0, and you must not specify more than one network interface.
     *
     * @return Indicates whether to auto-assign a public IP address to an instance in
     *         a VPC. This public IP address can be assigned to the network interface
     *         for eth0 only when you launch the instance. You must create the
     *         network interface instead of using an existing network interface for
     *         eth0, and you must not specify more than one network interface.
     */
    public Boolean isAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }
    
    /**
     * Indicates whether to auto-assign a public IP address to an instance in
     * a VPC. This public IP address can be assigned to the network interface
     * for eth0 only when you launch the instance. You must create the
     * network interface instead of using an existing network interface for
     * eth0, and you must not specify more than one network interface.
     *
     * @param associatePublicIpAddress Indicates whether to auto-assign a public IP address to an instance in
     *         a VPC. This public IP address can be assigned to the network interface
     *         for eth0 only when you launch the instance. You must create the
     *         network interface instead of using an existing network interface for
     *         eth0, and you must not specify more than one network interface.
     */
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }
    
    /**
     * Indicates whether to auto-assign a public IP address to an instance in
     * a VPC. This public IP address can be assigned to the network interface
     * for eth0 only when you launch the instance. You must create the
     * network interface instead of using an existing network interface for
     * eth0, and you must not specify more than one network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associatePublicIpAddress Indicates whether to auto-assign a public IP address to an instance in
     *         a VPC. This public IP address can be assigned to the network interface
     *         for eth0 only when you launch the instance. You must create the
     *         network interface instead of using an existing network interface for
     *         eth0, and you must not specify more than one network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * Indicates whether to auto-assign a public IP address to an instance in
     * a VPC. This public IP address can be assigned to the network interface
     * for eth0 only when you launch the instance. You must create the
     * network interface instead of using an existing network interface for
     * eth0, and you must not specify more than one network interface.
     *
     * @return Indicates whether to auto-assign a public IP address to an instance in
     *         a VPC. This public IP address can be assigned to the network interface
     *         for eth0 only when you launch the instance. You must create the
     *         network interface instead of using an existing network interface for
     *         eth0, and you must not specify more than one network interface.
     */
    public Boolean getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
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
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getDeviceIndex() != null) sb.append("DeviceIndex: " + getDeviceIndex() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() + ",");
        if (getPrivateIpAddresses() != null) sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getSecondaryPrivateIpAddressCount() != null) sb.append("SecondaryPrivateIpAddressCount: " + getSecondaryPrivateIpAddressCount() + ",");
        if (isAssociatePublicIpAddress() != null) sb.append("AssociatePublicIpAddress: " + isAssociatePublicIpAddress() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getDeviceIndex() == null) ? 0 : getDeviceIndex().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode()); 
        hashCode = prime * hashCode + ((getSecondaryPrivateIpAddressCount() == null) ? 0 : getSecondaryPrivateIpAddressCount().hashCode()); 
        hashCode = prime * hashCode + ((isAssociatePublicIpAddress() == null) ? 0 : isAssociatePublicIpAddress().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceNetworkInterfaceSpecification == false) return false;
        InstanceNetworkInterfaceSpecification other = (InstanceNetworkInterfaceSpecification)obj;
        
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getDeviceIndex() == null ^ this.getDeviceIndex() == null) return false;
        if (other.getDeviceIndex() != null && other.getDeviceIndex().equals(this.getDeviceIndex()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null) return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false) return false; 
        if (other.getSecondaryPrivateIpAddressCount() == null ^ this.getSecondaryPrivateIpAddressCount() == null) return false;
        if (other.getSecondaryPrivateIpAddressCount() != null && other.getSecondaryPrivateIpAddressCount().equals(this.getSecondaryPrivateIpAddressCount()) == false) return false; 
        if (other.isAssociatePublicIpAddress() == null ^ this.isAssociatePublicIpAddress() == null) return false;
        if (other.isAssociatePublicIpAddress() != null && other.isAssociatePublicIpAddress().equals(this.isAssociatePublicIpAddress()) == false) return false; 
        return true;
    }
    
}
    
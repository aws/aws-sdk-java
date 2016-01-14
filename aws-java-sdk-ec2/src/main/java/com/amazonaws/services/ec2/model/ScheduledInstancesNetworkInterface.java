/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a network interface for a Scheduled Instance.
 * </p>
 */
public class ScheduledInstancesNetworkInterface implements Serializable, Cloneable {

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * The index of the device for the network interface attachment.
     */
    private Integer deviceIndex;

    /**
     * The ID of the subnet.
     */
    private String subnetId;

    /**
     * The description.
     */
    private String description;

    /**
     * The IP address of the network interface within the subnet.
     */
    private String privateIpAddress;

    /**
     * The private IP addresses.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs;

    /**
     * The number of secondary private IP addresses.
     */
    private Integer secondaryPrivateIpAddressCount;

    /**
     * Indicates whether to assign a public IP address to instances launched
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network
     * interface, not an existing one. You cannot specify more than one
     * network interface in the request. If launching into a default subnet,
     * the default value is <code>true</code>.
     */
    private Boolean associatePublicIpAddress;

    /**
     * The IDs of one or more security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groups;

    /**
     * Indicates whether to delete the interface when the instance is
     * terminated.
     */
    private Boolean deleteOnTermination;

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
    public ScheduledInstancesNetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The index of the device for the network interface attachment.
     *
     * @return The index of the device for the network interface attachment.
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }
    
    /**
     * The index of the device for the network interface attachment.
     *
     * @param deviceIndex The index of the device for the network interface attachment.
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }
    
    /**
     * The index of the device for the network interface attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceIndex The index of the device for the network interface attachment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * The ID of the subnet.
     *
     * @return The ID of the subnet.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet.
     *
     * @param subnetId The ID of the subnet.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The description.
     *
     * @return The description.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description.
     *
     * @param description The description.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The IP address of the network interface within the subnet.
     *
     * @return The IP address of the network interface within the subnet.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * The IP address of the network interface within the subnet.
     *
     * @param privateIpAddress The IP address of the network interface within the subnet.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * The IP address of the network interface within the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The IP address of the network interface within the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * The private IP addresses.
     *
     * @return The private IP addresses.
     */
    public java.util.List<ScheduledInstancesPrivateIpAddressConfig> getPrivateIpAddressConfigs() {
        if (privateIpAddressConfigs == null) {
              privateIpAddressConfigs = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesPrivateIpAddressConfig>();
              privateIpAddressConfigs.setAutoConstruct(true);
        }
        return privateIpAddressConfigs;
    }
    
    /**
     * The private IP addresses.
     *
     * @param privateIpAddressConfigs The private IP addresses.
     */
    public void setPrivateIpAddressConfigs(java.util.Collection<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs) {
        if (privateIpAddressConfigs == null) {
            this.privateIpAddressConfigs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesPrivateIpAddressConfig>(privateIpAddressConfigs.size());
        privateIpAddressConfigsCopy.addAll(privateIpAddressConfigs);
        this.privateIpAddressConfigs = privateIpAddressConfigsCopy;
    }
    
    /**
     * The private IP addresses.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPrivateIpAddressConfigs(java.util.Collection)} or
     * {@link #withPrivateIpAddressConfigs(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddressConfigs The private IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withPrivateIpAddressConfigs(ScheduledInstancesPrivateIpAddressConfig... privateIpAddressConfigs) {
        if (getPrivateIpAddressConfigs() == null) setPrivateIpAddressConfigs(new java.util.ArrayList<ScheduledInstancesPrivateIpAddressConfig>(privateIpAddressConfigs.length));
        for (ScheduledInstancesPrivateIpAddressConfig value : privateIpAddressConfigs) {
            getPrivateIpAddressConfigs().add(value);
        }
        return this;
    }
    
    /**
     * The private IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddressConfigs The private IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withPrivateIpAddressConfigs(java.util.Collection<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigs) {
        if (privateIpAddressConfigs == null) {
            this.privateIpAddressConfigs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesPrivateIpAddressConfig>(privateIpAddressConfigs.size());
            privateIpAddressConfigsCopy.addAll(privateIpAddressConfigs);
            this.privateIpAddressConfigs = privateIpAddressConfigsCopy;
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
    public ScheduledInstancesNetworkInterface withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * Indicates whether to assign a public IP address to instances launched
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network
     * interface, not an existing one. You cannot specify more than one
     * network interface in the request. If launching into a default subnet,
     * the default value is <code>true</code>.
     *
     * @return Indicates whether to assign a public IP address to instances launched
     *         in a VPC. The public IP address can only be assigned to a network
     *         interface for eth0, and can only be assigned to a new network
     *         interface, not an existing one. You cannot specify more than one
     *         network interface in the request. If launching into a default subnet,
     *         the default value is <code>true</code>.
     */
    public Boolean isAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }
    
    /**
     * Indicates whether to assign a public IP address to instances launched
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network
     * interface, not an existing one. You cannot specify more than one
     * network interface in the request. If launching into a default subnet,
     * the default value is <code>true</code>.
     *
     * @param associatePublicIpAddress Indicates whether to assign a public IP address to instances launched
     *         in a VPC. The public IP address can only be assigned to a network
     *         interface for eth0, and can only be assigned to a new network
     *         interface, not an existing one. You cannot specify more than one
     *         network interface in the request. If launching into a default subnet,
     *         the default value is <code>true</code>.
     */
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }
    
    /**
     * Indicates whether to assign a public IP address to instances launched
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network
     * interface, not an existing one. You cannot specify more than one
     * network interface in the request. If launching into a default subnet,
     * the default value is <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associatePublicIpAddress Indicates whether to assign a public IP address to instances launched
     *         in a VPC. The public IP address can only be assigned to a network
     *         interface for eth0, and can only be assigned to a new network
     *         interface, not an existing one. You cannot specify more than one
     *         network interface in the request. If launching into a default subnet,
     *         the default value is <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * Indicates whether to assign a public IP address to instances launched
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network
     * interface, not an existing one. You cannot specify more than one
     * network interface in the request. If launching into a default subnet,
     * the default value is <code>true</code>.
     *
     * @return Indicates whether to assign a public IP address to instances launched
     *         in a VPC. The public IP address can only be assigned to a network
     *         interface for eth0, and can only be assigned to a new network
     *         interface, not an existing one. You cannot specify more than one
     *         network interface in the request. If launching into a default subnet,
     *         the default value is <code>true</code>.
     */
    public Boolean getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * The IDs of one or more security groups.
     *
     * @return The IDs of one or more security groups.
     */
    public java.util.List<String> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * The IDs of one or more security groups.
     *
     * @param groups The IDs of one or more security groups.
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
     * The IDs of one or more security groups.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGroups(java.util.Collection)} or {@link
     * #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The IDs of one or more security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withGroups(String... groups) {
        if (getGroups() == null) setGroups(new java.util.ArrayList<String>(groups.length));
        for (String value : groups) {
            getGroups().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of one or more security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The IDs of one or more security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withGroups(java.util.Collection<String> groups) {
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
     * Indicates whether to delete the interface when the instance is
     * terminated.
     *
     * @return Indicates whether to delete the interface when the instance is
     *         terminated.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Indicates whether to delete the interface when the instance is
     * terminated.
     *
     * @param deleteOnTermination Indicates whether to delete the interface when the instance is
     *         terminated.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Indicates whether to delete the interface when the instance is
     * terminated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Indicates whether to delete the interface when the instance is
     *         terminated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesNetworkInterface withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Indicates whether to delete the interface when the instance is
     * terminated.
     *
     * @return Indicates whether to delete the interface when the instance is
     *         terminated.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
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
        if (getPrivateIpAddressConfigs() != null) sb.append("PrivateIpAddressConfigs: " + getPrivateIpAddressConfigs() + ",");
        if (getSecondaryPrivateIpAddressCount() != null) sb.append("SecondaryPrivateIpAddressCount: " + getSecondaryPrivateIpAddressCount() + ",");
        if (isAssociatePublicIpAddress() != null) sb.append("AssociatePublicIpAddress: " + isAssociatePublicIpAddress() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() );
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
        hashCode = prime * hashCode + ((getPrivateIpAddressConfigs() == null) ? 0 : getPrivateIpAddressConfigs().hashCode()); 
        hashCode = prime * hashCode + ((getSecondaryPrivateIpAddressCount() == null) ? 0 : getSecondaryPrivateIpAddressCount().hashCode()); 
        hashCode = prime * hashCode + ((isAssociatePublicIpAddress() == null) ? 0 : isAssociatePublicIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledInstancesNetworkInterface == false) return false;
        ScheduledInstancesNetworkInterface other = (ScheduledInstancesNetworkInterface)obj;
        
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
        if (other.getPrivateIpAddressConfigs() == null ^ this.getPrivateIpAddressConfigs() == null) return false;
        if (other.getPrivateIpAddressConfigs() != null && other.getPrivateIpAddressConfigs().equals(this.getPrivateIpAddressConfigs()) == false) return false; 
        if (other.getSecondaryPrivateIpAddressCount() == null ^ this.getSecondaryPrivateIpAddressCount() == null) return false;
        if (other.getSecondaryPrivateIpAddressCount() != null && other.getSecondaryPrivateIpAddressCount().equals(this.getSecondaryPrivateIpAddressCount()) == false) return false; 
        if (other.isAssociatePublicIpAddress() == null ^ this.isAssociatePublicIpAddress() == null) return false;
        if (other.isAssociatePublicIpAddress() != null && other.isAssociatePublicIpAddress().equals(this.isAssociatePublicIpAddress()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        return true;
    }
    
    @Override
    public ScheduledInstancesNetworkInterface clone() {
        try {
            return (ScheduledInstancesNetworkInterface) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
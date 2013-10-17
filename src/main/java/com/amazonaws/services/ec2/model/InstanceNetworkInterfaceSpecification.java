/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Instance Network Interface Specification
 */
public class InstanceNetworkInterfaceSpecification implements Serializable {

    /**
     * An existing interface to attach to a single instance. Requires n=1
     * instances.
     */
    private String networkInterfaceId;

    /**
     * The device index. Applies to both attaching an existing network
     * interface and when creating a network interface. <p>Condition: If you
     * are specifying a network interface in the request, you must provide
     * the device index.
     */
    private Integer deviceIndex;

    /**
     * The subnet ID. Applies only when creating a network interface.
     */
    private String subnetId;

    /**
     * A description. Applies only when creating a network interface.
     */
    private String description;

    /**
     * The primary private IP address. Applies only when creating a network
     * interface. Requires n=1 network interfaces in launch. <p>
     */
    private String privateIpAddress;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groups;

    private Boolean deleteOnTermination;

    private com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification> privateIpAddresses;

    private Integer secondaryPrivateIpAddressCount;

    /**
     * Indicates whether to assign a public IP address to an instance in a
     * VPC. The public IP address is associated with a specific network
     * interface. If set to <code>true</code>, the following rules apply:
     * <ol> <li> <p>Can only be associated with a single network interface
     * with the device index of 0. You can't associate a public IP address
     * with a second network interface, and you can't associate a public IP
     * address if you are launching more than one network interface. </li>
     * <li> <p>Can only be associated with a new network interface, not an
     * existing one. </li> </ol> <p> Default: If launching into a default
     * subnet, the default value is <code>true</code>. If launching into a
     * nondefault subnet, the default value is <code>false</code>.
     */
    private Boolean associatePublicIpAddress;

    /**
     * An existing interface to attach to a single instance. Requires n=1
     * instances.
     *
     * @return An existing interface to attach to a single instance. Requires n=1
     *         instances.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * An existing interface to attach to a single instance. Requires n=1
     * instances.
     *
     * @param networkInterfaceId An existing interface to attach to a single instance. Requires n=1
     *         instances.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * An existing interface to attach to a single instance. Requires n=1
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId An existing interface to attach to a single instance. Requires n=1
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The device index. Applies to both attaching an existing network
     * interface and when creating a network interface. <p>Condition: If you
     * are specifying a network interface in the request, you must provide
     * the device index.
     *
     * @return The device index. Applies to both attaching an existing network
     *         interface and when creating a network interface. <p>Condition: If you
     *         are specifying a network interface in the request, you must provide
     *         the device index.
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }
    
    /**
     * The device index. Applies to both attaching an existing network
     * interface and when creating a network interface. <p>Condition: If you
     * are specifying a network interface in the request, you must provide
     * the device index.
     *
     * @param deviceIndex The device index. Applies to both attaching an existing network
     *         interface and when creating a network interface. <p>Condition: If you
     *         are specifying a network interface in the request, you must provide
     *         the device index.
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }
    
    /**
     * The device index. Applies to both attaching an existing network
     * interface and when creating a network interface. <p>Condition: If you
     * are specifying a network interface in the request, you must provide
     * the device index.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceIndex The device index. Applies to both attaching an existing network
     *         interface and when creating a network interface. <p>Condition: If you
     *         are specifying a network interface in the request, you must provide
     *         the device index.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * The subnet ID. Applies only when creating a network interface.
     *
     * @return The subnet ID. Applies only when creating a network interface.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The subnet ID. Applies only when creating a network interface.
     *
     * @param subnetId The subnet ID. Applies only when creating a network interface.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The subnet ID. Applies only when creating a network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The subnet ID. Applies only when creating a network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * A description. Applies only when creating a network interface.
     *
     * @return A description. Applies only when creating a network interface.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description. Applies only when creating a network interface.
     *
     * @param description A description. Applies only when creating a network interface.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description. Applies only when creating a network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description. Applies only when creating a network interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The primary private IP address. Applies only when creating a network
     * interface. Requires n=1 network interfaces in launch. <p>
     *
     * @return The primary private IP address. Applies only when creating a network
     *         interface. Requires n=1 network interfaces in launch. <p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * The primary private IP address. Applies only when creating a network
     * interface. Requires n=1 network interfaces in launch. <p>
     *
     * @param privateIpAddress The primary private IP address. Applies only when creating a network
     *         interface. Requires n=1 network interfaces in launch. <p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * The primary private IP address. Applies only when creating a network
     * interface. Requires n=1 network interfaces in launch. <p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The primary private IP address. Applies only when creating a network
     *         interface. Requires n=1 network interfaces in launch. <p>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Returns the value of the Groups property for this object.
     *
     * @return The value of the Groups property for this object.
     */
    public java.util.List<String> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * Sets the value of the Groups property for this object.
     *
     * @param groups The new value for the Groups property for this object.
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
     * Sets the value of the Groups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The new value for the Groups property for this object.
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
     * Sets the value of the Groups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The new value for the Groups property for this object.
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
     * Returns the value of the DeleteOnTermination property for this object.
     *
     * @return The value of the DeleteOnTermination property for this object.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Sets the value of the DeleteOnTermination property for this object.
     *
     * @param deleteOnTermination The new value for the DeleteOnTermination property for this object.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Sets the value of the DeleteOnTermination property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination The new value for the DeleteOnTermination property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Returns the value of the DeleteOnTermination property for this object.
     *
     * @return The value of the DeleteOnTermination property for this object.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * Returns the value of the PrivateIpAddresses property for this object.
     *
     * @return The value of the PrivateIpAddresses property for this object.
     */
    public java.util.List<PrivateIpAddressSpecification> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
              privateIpAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification>();
              privateIpAddresses.setAutoConstruct(true);
        }
        return privateIpAddresses;
    }
    
    /**
     * Sets the value of the PrivateIpAddresses property for this object.
     *
     * @param privateIpAddresses The new value for the PrivateIpAddresses property for this object.
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
     * Sets the value of the PrivateIpAddresses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses The new value for the PrivateIpAddresses property for this object.
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
     * Sets the value of the PrivateIpAddresses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses The new value for the PrivateIpAddresses property for this object.
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
     * Returns the value of the SecondaryPrivateIpAddressCount property for
     * this object.
     *
     * @return The value of the SecondaryPrivateIpAddressCount property for this
     *         object.
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }
    
    /**
     * Sets the value of the SecondaryPrivateIpAddressCount property for this
     * object.
     *
     * @param secondaryPrivateIpAddressCount The new value for the SecondaryPrivateIpAddressCount property for this
     *         object.
     */
    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }
    
    /**
     * Sets the value of the SecondaryPrivateIpAddressCount property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secondaryPrivateIpAddressCount The new value for the SecondaryPrivateIpAddressCount property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * Indicates whether to assign a public IP address to an instance in a
     * VPC. The public IP address is associated with a specific network
     * interface. If set to <code>true</code>, the following rules apply:
     * <ol> <li> <p>Can only be associated with a single network interface
     * with the device index of 0. You can't associate a public IP address
     * with a second network interface, and you can't associate a public IP
     * address if you are launching more than one network interface. </li>
     * <li> <p>Can only be associated with a new network interface, not an
     * existing one. </li> </ol> <p> Default: If launching into a default
     * subnet, the default value is <code>true</code>. If launching into a
     * nondefault subnet, the default value is <code>false</code>.
     *
     * @return Indicates whether to assign a public IP address to an instance in a
     *         VPC. The public IP address is associated with a specific network
     *         interface. If set to <code>true</code>, the following rules apply:
     *         <ol> <li> <p>Can only be associated with a single network interface
     *         with the device index of 0. You can't associate a public IP address
     *         with a second network interface, and you can't associate a public IP
     *         address if you are launching more than one network interface. </li>
     *         <li> <p>Can only be associated with a new network interface, not an
     *         existing one. </li> </ol> <p> Default: If launching into a default
     *         subnet, the default value is <code>true</code>. If launching into a
     *         nondefault subnet, the default value is <code>false</code>.
     */
    public Boolean isAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }
    
    /**
     * Indicates whether to assign a public IP address to an instance in a
     * VPC. The public IP address is associated with a specific network
     * interface. If set to <code>true</code>, the following rules apply:
     * <ol> <li> <p>Can only be associated with a single network interface
     * with the device index of 0. You can't associate a public IP address
     * with a second network interface, and you can't associate a public IP
     * address if you are launching more than one network interface. </li>
     * <li> <p>Can only be associated with a new network interface, not an
     * existing one. </li> </ol> <p> Default: If launching into a default
     * subnet, the default value is <code>true</code>. If launching into a
     * nondefault subnet, the default value is <code>false</code>.
     *
     * @param associatePublicIpAddress Indicates whether to assign a public IP address to an instance in a
     *         VPC. The public IP address is associated with a specific network
     *         interface. If set to <code>true</code>, the following rules apply:
     *         <ol> <li> <p>Can only be associated with a single network interface
     *         with the device index of 0. You can't associate a public IP address
     *         with a second network interface, and you can't associate a public IP
     *         address if you are launching more than one network interface. </li>
     *         <li> <p>Can only be associated with a new network interface, not an
     *         existing one. </li> </ol> <p> Default: If launching into a default
     *         subnet, the default value is <code>true</code>. If launching into a
     *         nondefault subnet, the default value is <code>false</code>.
     */
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }
    
    /**
     * Indicates whether to assign a public IP address to an instance in a
     * VPC. The public IP address is associated with a specific network
     * interface. If set to <code>true</code>, the following rules apply:
     * <ol> <li> <p>Can only be associated with a single network interface
     * with the device index of 0. You can't associate a public IP address
     * with a second network interface, and you can't associate a public IP
     * address if you are launching more than one network interface. </li>
     * <li> <p>Can only be associated with a new network interface, not an
     * existing one. </li> </ol> <p> Default: If launching into a default
     * subnet, the default value is <code>true</code>. If launching into a
     * nondefault subnet, the default value is <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associatePublicIpAddress Indicates whether to assign a public IP address to an instance in a
     *         VPC. The public IP address is associated with a specific network
     *         interface. If set to <code>true</code>, the following rules apply:
     *         <ol> <li> <p>Can only be associated with a single network interface
     *         with the device index of 0. You can't associate a public IP address
     *         with a second network interface, and you can't associate a public IP
     *         address if you are launching more than one network interface. </li>
     *         <li> <p>Can only be associated with a new network interface, not an
     *         existing one. </li> </ol> <p> Default: If launching into a default
     *         subnet, the default value is <code>true</code>. If launching into a
     *         nondefault subnet, the default value is <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceSpecification withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * Indicates whether to assign a public IP address to an instance in a
     * VPC. The public IP address is associated with a specific network
     * interface. If set to <code>true</code>, the following rules apply:
     * <ol> <li> <p>Can only be associated with a single network interface
     * with the device index of 0. You can't associate a public IP address
     * with a second network interface, and you can't associate a public IP
     * address if you are launching more than one network interface. </li>
     * <li> <p>Can only be associated with a new network interface, not an
     * existing one. </li> </ol> <p> Default: If launching into a default
     * subnet, the default value is <code>true</code>. If launching into a
     * nondefault subnet, the default value is <code>false</code>.
     *
     * @return Indicates whether to assign a public IP address to an instance in a
     *         VPC. The public IP address is associated with a specific network
     *         interface. If set to <code>true</code>, the following rules apply:
     *         <ol> <li> <p>Can only be associated with a single network interface
     *         with the device index of 0. You can't associate a public IP address
     *         with a second network interface, and you can't associate a public IP
     *         address if you are launching more than one network interface. </li>
     *         <li> <p>Can only be associated with a new network interface, not an
     *         existing one. </li> </ol> <p> Default: If launching into a default
     *         subnet, the default value is <code>true</code>. If launching into a
     *         nondefault subnet, the default value is <code>false</code>.
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
    
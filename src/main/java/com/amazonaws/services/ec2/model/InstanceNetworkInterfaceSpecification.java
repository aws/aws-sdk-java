/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Instance Network Interface Specification
 */
public class InstanceNetworkInterfaceSpecification {

    private String networkInterfaceId;

    private Integer deviceIndex;

    private String subnetId;

    private String description;

    private String privateIpAddress;

    private java.util.List<String> groups;

    private Boolean deleteOnTermination;

    private java.util.List<PrivateIpAddressSpecification> privateIpAddresses;

    private Integer secondaryPrivateIpAddressCount;

    /**
     * Returns the value of the NetworkInterfaceId property for this object.
     *
     * @return The value of the NetworkInterfaceId property for this object.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * Sets the value of the NetworkInterfaceId property for this object.
     *
     * @param networkInterfaceId The new value for the NetworkInterfaceId property for this object.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * Sets the value of the NetworkInterfaceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId The new value for the NetworkInterfaceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceNetworkInterfaceSpecification withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    
    
    /**
     * Returns the value of the DeviceIndex property for this object.
     *
     * @return The value of the DeviceIndex property for this object.
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }
    
    /**
     * Sets the value of the DeviceIndex property for this object.
     *
     * @param deviceIndex The new value for the DeviceIndex property for this object.
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }
    
    /**
     * Sets the value of the DeviceIndex property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceIndex The new value for the DeviceIndex property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceNetworkInterfaceSpecification withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }
    
    
    /**
     * Returns the value of the SubnetId property for this object.
     *
     * @return The value of the SubnetId property for this object.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * Sets the value of the SubnetId property for this object.
     *
     * @param subnetId The new value for the SubnetId property for this object.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * Sets the value of the SubnetId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The new value for the SubnetId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceNetworkInterfaceSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    
    
    /**
     * Returns the value of the Description property for this object.
     *
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     *
     * @param description The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The new value for the Description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceNetworkInterfaceSpecification withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Returns the value of the PrivateIpAddress property for this object.
     *
     * @return The value of the PrivateIpAddress property for this object.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * Sets the value of the PrivateIpAddress property for this object.
     *
     * @param privateIpAddress The new value for the PrivateIpAddress property for this object.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * Sets the value of the PrivateIpAddress property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The new value for the PrivateIpAddress property for this object.
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
            groups = new java.util.ArrayList<String>();
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

        java.util.List<String> groupsCopy = new java.util.ArrayList<String>(groups.size());
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
            java.util.List<String> groupsCopy = new java.util.ArrayList<String>(groups.size());
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
            privateIpAddresses = new java.util.ArrayList<PrivateIpAddressSpecification>();
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

        java.util.List<PrivateIpAddressSpecification> privateIpAddressesCopy = new java.util.ArrayList<PrivateIpAddressSpecification>(privateIpAddresses.size());
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
            java.util.List<PrivateIpAddressSpecification> privateIpAddressesCopy = new java.util.ArrayList<PrivateIpAddressSpecification>(privateIpAddresses.size());
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
        if (networkInterfaceId != null) sb.append("NetworkInterfaceId: " + networkInterfaceId + ", ");
        if (deviceIndex != null) sb.append("DeviceIndex: " + deviceIndex + ", ");
        if (subnetId != null) sb.append("SubnetId: " + subnetId + ", ");
        if (description != null) sb.append("Description: " + description + ", ");
        if (privateIpAddress != null) sb.append("PrivateIpAddress: " + privateIpAddress + ", ");
        if (groups != null) sb.append("Groups: " + groups + ", ");
        if (deleteOnTermination != null) sb.append("DeleteOnTermination: " + deleteOnTermination + ", ");
        if (privateIpAddresses != null) sb.append("PrivateIpAddresses: " + privateIpAddresses + ", ");
        if (secondaryPrivateIpAddressCount != null) sb.append("SecondaryPrivateIpAddressCount: " + secondaryPrivateIpAddressCount + ", ");
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
        return true;
    }
    
}
    
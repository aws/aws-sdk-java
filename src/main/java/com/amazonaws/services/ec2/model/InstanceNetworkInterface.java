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
 * Instance Network Interface
 */
public class InstanceNetworkInterface implements Serializable {

    private String networkInterfaceId;

    private String subnetId;

    private String vpcId;

    private String description;

    private String ownerId;

    private String status;

    private String privateIpAddress;

    private String privateDnsName;

    private Boolean sourceDestCheck;

    private com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groups;

    private InstanceNetworkInterfaceAttachment attachment;

    private InstanceNetworkInterfaceAssociation association;

    private com.amazonaws.internal.ListWithAutoConstructFlag<InstancePrivateIpAddress> privateIpAddresses;

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
    public InstanceNetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
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
    public InstanceNetworkInterface withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Returns the value of the VpcId property for this object.
     *
     * @return The value of the VpcId property for this object.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Sets the value of the VpcId property for this object.
     *
     * @param vpcId The new value for the VpcId property for this object.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Sets the value of the VpcId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The new value for the VpcId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterface withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
    public InstanceNetworkInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns the value of the OwnerId property for this object.
     *
     * @return The value of the OwnerId property for this object.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * Sets the value of the OwnerId property for this object.
     *
     * @param ownerId The new value for the OwnerId property for this object.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * Sets the value of the OwnerId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The new value for the OwnerId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterface withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Returns the value of the Status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @return The value of the Status property for this object.
     *
     * @see NetworkInterfaceStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @param status The new value for the Status property for this object.
     *
     * @see NetworkInterfaceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @param status The new value for the Status property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see NetworkInterfaceStatus
     */
    public InstanceNetworkInterface withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Sets the value of the Status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @param status The new value for the Status property for this object.
     *
     * @see NetworkInterfaceStatus
     */
    public void setStatus(NetworkInterfaceStatus status) {
        this.status = status.toString();
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @param status The new value for the Status property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see NetworkInterfaceStatus
     */
    public InstanceNetworkInterface withStatus(NetworkInterfaceStatus status) {
        this.status = status.toString();
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
    public InstanceNetworkInterface withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Returns the value of the PrivateDnsName property for this object.
     *
     * @return The value of the PrivateDnsName property for this object.
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }
    
    /**
     * Sets the value of the PrivateDnsName property for this object.
     *
     * @param privateDnsName The new value for the PrivateDnsName property for this object.
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }
    
    /**
     * Sets the value of the PrivateDnsName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateDnsName The new value for the PrivateDnsName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterface withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * Returns the value of the SourceDestCheck property for this object.
     *
     * @return The value of the SourceDestCheck property for this object.
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Sets the value of the SourceDestCheck property for this object.
     *
     * @param sourceDestCheck The new value for the SourceDestCheck property for this object.
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Sets the value of the SourceDestCheck property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck The new value for the SourceDestCheck property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterface withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * Returns the value of the SourceDestCheck property for this object.
     *
     * @return The value of the SourceDestCheck property for this object.
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * Returns the value of the Groups property for this object.
     *
     * @return The value of the Groups property for this object.
     */
    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * Sets the value of the Groups property for this object.
     *
     * @param groups The new value for the Groups property for this object.
     */
    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(groups.size());
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
    public InstanceNetworkInterface withGroups(GroupIdentifier... groups) {
        if (getGroups() == null) setGroups(new java.util.ArrayList<GroupIdentifier>(groups.length));
        for (GroupIdentifier value : groups) {
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
    public InstanceNetworkInterface withGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(groups.size());
            groupsCopy.addAll(groups);
            this.groups = groupsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Attachment property for this object.
     *
     * @return The value of the Attachment property for this object.
     */
    public InstanceNetworkInterfaceAttachment getAttachment() {
        return attachment;
    }
    
    /**
     * Sets the value of the Attachment property for this object.
     *
     * @param attachment The new value for the Attachment property for this object.
     */
    public void setAttachment(InstanceNetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
    }
    
    /**
     * Sets the value of the Attachment property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachment The new value for the Attachment property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterface withAttachment(InstanceNetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * Returns the value of the Association property for this object.
     *
     * @return The value of the Association property for this object.
     */
    public InstanceNetworkInterfaceAssociation getAssociation() {
        return association;
    }
    
    /**
     * Sets the value of the Association property for this object.
     *
     * @param association The new value for the Association property for this object.
     */
    public void setAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
    }
    
    /**
     * Sets the value of the Association property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param association The new value for the Association property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterface withAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
        return this;
    }

    /**
     * Returns the value of the PrivateIpAddresses property for this object.
     *
     * @return The value of the PrivateIpAddresses property for this object.
     */
    public java.util.List<InstancePrivateIpAddress> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
              privateIpAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<InstancePrivateIpAddress>();
              privateIpAddresses.setAutoConstruct(true);
        }
        return privateIpAddresses;
    }
    
    /**
     * Sets the value of the PrivateIpAddresses property for this object.
     *
     * @param privateIpAddresses The new value for the PrivateIpAddresses property for this object.
     */
    public void setPrivateIpAddresses(java.util.Collection<InstancePrivateIpAddress> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstancePrivateIpAddress> privateIpAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstancePrivateIpAddress>(privateIpAddresses.size());
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
    public InstanceNetworkInterface withPrivateIpAddresses(InstancePrivateIpAddress... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) setPrivateIpAddresses(new java.util.ArrayList<InstancePrivateIpAddress>(privateIpAddresses.length));
        for (InstancePrivateIpAddress value : privateIpAddresses) {
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
    public InstanceNetworkInterface withPrivateIpAddresses(java.util.Collection<InstancePrivateIpAddress> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstancePrivateIpAddress> privateIpAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstancePrivateIpAddress>(privateIpAddresses.size());
            privateIpAddressesCopy.addAll(privateIpAddresses);
            this.privateIpAddresses = privateIpAddressesCopy;
        }

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
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPrivateDnsName() != null) sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (isSourceDestCheck() != null) sb.append("SourceDestCheck: " + isSourceDestCheck() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() + ",");
        if (getAttachment() != null) sb.append("Attachment: " + getAttachment() + ",");
        if (getAssociation() != null) sb.append("Association: " + getAssociation() + ",");
        if (getPrivateIpAddresses() != null) sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode()); 
        hashCode = prime * hashCode + ((isSourceDestCheck() == null) ? 0 : isSourceDestCheck().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode()); 
        hashCode = prime * hashCode + ((getAssociation() == null) ? 0 : getAssociation().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceNetworkInterface == false) return false;
        InstanceNetworkInterface other = (InstanceNetworkInterface)obj;
        
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null) return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false) return false; 
        if (other.isSourceDestCheck() == null ^ this.isSourceDestCheck() == null) return false;
        if (other.isSourceDestCheck() != null && other.isSourceDestCheck().equals(this.isSourceDestCheck()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        if (other.getAttachment() == null ^ this.getAttachment() == null) return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false) return false; 
        if (other.getAssociation() == null ^ this.getAssociation() == null) return false;
        if (other.getAssociation() != null && other.getAssociation().equals(this.getAssociation()) == false) return false; 
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null) return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false) return false; 
        return true;
    }
    
}
    
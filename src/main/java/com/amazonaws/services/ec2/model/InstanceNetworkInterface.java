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
public class InstanceNetworkInterface implements Serializable {

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * The ID of the subnet.
     */
    private String subnetId;

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * The description.
     */
    private String description;

    /**
     * The ID of the AWS account that created the network interface.
     */
    private String ownerId;

    /**
     * The status of the network interface.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     */
    private String status;

    /**
     * The IP address of the network interface within the subnet.
     */
    private String privateIpAddress;

    /**
     * The private DNS name.
     */
    private String privateDnsName;

    /**
     * Indicates whether to validate network traffic to or from this network
     * interface.
     */
    private Boolean sourceDestCheck;

    /**
     * One or more security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groups;

    /**
     * The network interface attachment.
     */
    private InstanceNetworkInterfaceAttachment attachment;

    /**
     * The association information for an Elastic IP associated with the
     * network interface.
     */
    private InstanceNetworkInterfaceAssociation association;

    /**
     * The private IP addresses associated with the network interface.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstancePrivateIpAddress> privateIpAddresses;

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
    public InstanceNetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
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
    public InstanceNetworkInterface withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the VPC.
     *
     * @return The ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC.
     *
     * @param vpcId The ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterface withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
    public InstanceNetworkInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The ID of the AWS account that created the network interface.
     *
     * @return The ID of the AWS account that created the network interface.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The ID of the AWS account that created the network interface.
     *
     * @param ownerId The ID of the AWS account that created the network interface.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The ID of the AWS account that created the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The ID of the AWS account that created the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterface withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * The status of the network interface.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @return The status of the network interface.
     *
     * @see NetworkInterfaceStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the network interface.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @param status The status of the network interface.
     *
     * @see NetworkInterfaceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @param status The status of the network interface.
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
     * The status of the network interface.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @param status The status of the network interface.
     *
     * @see NetworkInterfaceStatus
     */
    public void setStatus(NetworkInterfaceStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, attaching, in-use, detaching
     *
     * @param status The status of the network interface.
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
    public InstanceNetworkInterface withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * The private DNS name.
     *
     * @return The private DNS name.
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }
    
    /**
     * The private DNS name.
     *
     * @param privateDnsName The private DNS name.
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }
    
    /**
     * The private DNS name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateDnsName The private DNS name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterface withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * Indicates whether to validate network traffic to or from this network
     * interface.
     *
     * @return Indicates whether to validate network traffic to or from this network
     *         interface.
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Indicates whether to validate network traffic to or from this network
     * interface.
     *
     * @param sourceDestCheck Indicates whether to validate network traffic to or from this network
     *         interface.
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Indicates whether to validate network traffic to or from this network
     * interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck Indicates whether to validate network traffic to or from this network
     *         interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterface withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * Indicates whether to validate network traffic to or from this network
     * interface.
     *
     * @return Indicates whether to validate network traffic to or from this network
     *         interface.
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * One or more security groups.
     *
     * @return One or more security groups.
     */
    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * One or more security groups.
     *
     * @param groups One or more security groups.
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
     * One or more security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups One or more security groups.
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
     * One or more security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups One or more security groups.
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
     * The network interface attachment.
     *
     * @return The network interface attachment.
     */
    public InstanceNetworkInterfaceAttachment getAttachment() {
        return attachment;
    }
    
    /**
     * The network interface attachment.
     *
     * @param attachment The network interface attachment.
     */
    public void setAttachment(InstanceNetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
    }
    
    /**
     * The network interface attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachment The network interface attachment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterface withAttachment(InstanceNetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * The association information for an Elastic IP associated with the
     * network interface.
     *
     * @return The association information for an Elastic IP associated with the
     *         network interface.
     */
    public InstanceNetworkInterfaceAssociation getAssociation() {
        return association;
    }
    
    /**
     * The association information for an Elastic IP associated with the
     * network interface.
     *
     * @param association The association information for an Elastic IP associated with the
     *         network interface.
     */
    public void setAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
    }
    
    /**
     * The association information for an Elastic IP associated with the
     * network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param association The association information for an Elastic IP associated with the
     *         network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceNetworkInterface withAssociation(InstanceNetworkInterfaceAssociation association) {
        this.association = association;
        return this;
    }

    /**
     * The private IP addresses associated with the network interface.
     *
     * @return The private IP addresses associated with the network interface.
     */
    public java.util.List<InstancePrivateIpAddress> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
              privateIpAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<InstancePrivateIpAddress>();
              privateIpAddresses.setAutoConstruct(true);
        }
        return privateIpAddresses;
    }
    
    /**
     * The private IP addresses associated with the network interface.
     *
     * @param privateIpAddresses The private IP addresses associated with the network interface.
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
     * The private IP addresses associated with the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses The private IP addresses associated with the network interface.
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
     * The private IP addresses associated with the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses The private IP addresses associated with the network interface.
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
    
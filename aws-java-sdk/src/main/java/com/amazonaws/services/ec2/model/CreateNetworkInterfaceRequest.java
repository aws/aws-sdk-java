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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateNetworkInterfaceRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createNetworkInterface(CreateNetworkInterfaceRequest) CreateNetworkInterface operation}.
 * <p>
 * Creates a network interface in the specified subnet.
 * </p>
 * <p>
 * For more information about network interfaces, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"> Elastic Network Interfaces </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createNetworkInterface(CreateNetworkInterfaceRequest)
 */
public class CreateNetworkInterfaceRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateNetworkInterfaceRequest> {

    /**
     * The ID of the subnet to associate with the network interface.
     */
    private String subnetId;

    /**
     * A description for the network interface.
     */
    private String description;

    /**
     * The primary private IP address of the network interface. If you don't
     * specify an IP address, Amazon EC2 selects one for you from the subnet
     * range.
     */
    private String privateIpAddress;

    /**
     * The IDs of one or more security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groups;

    /**
     * One or more private IP addresses.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification> privateIpAddresses;

    /**
     * The number of secondary private IP addresses to assign to a network
     * interface. When you specify a number of secondary IP addresses, Amazon
     * EC2 selects these IP addresses within the subnet range. <p>The number
     * of IP addresses you can assign to a network interface varies by
     * instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private
     * IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     */
    private Integer secondaryPrivateIpAddressCount;

    /**
     * The ID of the subnet to associate with the network interface.
     *
     * @return The ID of the subnet to associate with the network interface.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet to associate with the network interface.
     *
     * @param subnetId The ID of the subnet to associate with the network interface.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet to associate with the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet to associate with the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkInterfaceRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * A description for the network interface.
     *
     * @return A description for the network interface.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the network interface.
     *
     * @param description A description for the network interface.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkInterfaceRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The primary private IP address of the network interface. If you don't
     * specify an IP address, Amazon EC2 selects one for you from the subnet
     * range.
     *
     * @return The primary private IP address of the network interface. If you don't
     *         specify an IP address, Amazon EC2 selects one for you from the subnet
     *         range.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * The primary private IP address of the network interface. If you don't
     * specify an IP address, Amazon EC2 selects one for you from the subnet
     * range.
     *
     * @param privateIpAddress The primary private IP address of the network interface. If you don't
     *         specify an IP address, Amazon EC2 selects one for you from the subnet
     *         range.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * The primary private IP address of the network interface. If you don't
     * specify an IP address, Amazon EC2 selects one for you from the subnet
     * range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The primary private IP address of the network interface. If you don't
     *         specify an IP address, Amazon EC2 selects one for you from the subnet
     *         range.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkInterfaceRequest withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
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
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The IDs of one or more security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkInterfaceRequest withGroups(String... groups) {
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
    public CreateNetworkInterfaceRequest withGroups(java.util.Collection<String> groups) {
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
     * One or more private IP addresses.
     *
     * @return One or more private IP addresses.
     */
    public java.util.List<PrivateIpAddressSpecification> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
              privateIpAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<PrivateIpAddressSpecification>();
              privateIpAddresses.setAutoConstruct(true);
        }
        return privateIpAddresses;
    }
    
    /**
     * One or more private IP addresses.
     *
     * @param privateIpAddresses One or more private IP addresses.
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
     * One or more private IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses One or more private IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkInterfaceRequest withPrivateIpAddresses(PrivateIpAddressSpecification... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) setPrivateIpAddresses(new java.util.ArrayList<PrivateIpAddressSpecification>(privateIpAddresses.length));
        for (PrivateIpAddressSpecification value : privateIpAddresses) {
            getPrivateIpAddresses().add(value);
        }
        return this;
    }
    
    /**
     * One or more private IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses One or more private IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkInterfaceRequest withPrivateIpAddresses(java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
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
     * The number of secondary private IP addresses to assign to a network
     * interface. When you specify a number of secondary IP addresses, Amazon
     * EC2 selects these IP addresses within the subnet range. <p>The number
     * of IP addresses you can assign to a network interface varies by
     * instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private
     * IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     *
     * @return The number of secondary private IP addresses to assign to a network
     *         interface. When you specify a number of secondary IP addresses, Amazon
     *         EC2 selects these IP addresses within the subnet range. <p>The number
     *         of IP addresses you can assign to a network interface varies by
     *         instance type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private
     *         IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }
    
    /**
     * The number of secondary private IP addresses to assign to a network
     * interface. When you specify a number of secondary IP addresses, Amazon
     * EC2 selects these IP addresses within the subnet range. <p>The number
     * of IP addresses you can assign to a network interface varies by
     * instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private
     * IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     *
     * @param secondaryPrivateIpAddressCount The number of secondary private IP addresses to assign to a network
     *         interface. When you specify a number of secondary IP addresses, Amazon
     *         EC2 selects these IP addresses within the subnet range. <p>The number
     *         of IP addresses you can assign to a network interface varies by
     *         instance type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private
     *         IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     */
    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }
    
    /**
     * The number of secondary private IP addresses to assign to a network
     * interface. When you specify a number of secondary IP addresses, Amazon
     * EC2 selects these IP addresses within the subnet range. <p>The number
     * of IP addresses you can assign to a network interface varies by
     * instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private
     * IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secondaryPrivateIpAddressCount The number of secondary private IP addresses to assign to a network
     *         interface. When you specify a number of secondary IP addresses, Amazon
     *         EC2 selects these IP addresses within the subnet range. <p>The number
     *         of IP addresses you can assign to a network interface varies by
     *         instance type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private
     *         IP Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkInterfaceRequest withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateNetworkInterfaceRequest> getDryRunRequest() {
        Request<CreateNetworkInterfaceRequest> request = new CreateNetworkInterfaceRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() + ",");
        if (getPrivateIpAddresses() != null) sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getSecondaryPrivateIpAddressCount() != null) sb.append("SecondaryPrivateIpAddressCount: " + getSecondaryPrivateIpAddressCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode()); 
        hashCode = prime * hashCode + ((getSecondaryPrivateIpAddressCount() == null) ? 0 : getSecondaryPrivateIpAddressCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateNetworkInterfaceRequest == false) return false;
        CreateNetworkInterfaceRequest other = (CreateNetworkInterfaceRequest)obj;
        
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null) return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false) return false; 
        if (other.getSecondaryPrivateIpAddressCount() == null ^ this.getSecondaryPrivateIpAddressCount() == null) return false;
        if (other.getSecondaryPrivateIpAddressCount() != null && other.getSecondaryPrivateIpAddressCount().equals(this.getSecondaryPrivateIpAddressCount()) == false) return false; 
        return true;
    }
    
}
    
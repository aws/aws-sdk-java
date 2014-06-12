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

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#assignPrivateIpAddresses(AssignPrivateIpAddressesRequest) AssignPrivateIpAddresses operation}.
 * <p>
 * Assigns one or more secondary private IP addresses to the specified
 * network interface. You can specify one or more specific secondary IP
 * addresses, or you can specify the number of secondary IP addresses to
 * be automatically assigned within the subnet's CIDR block range. The
 * number of secondary IP addresses that you can assign to an instance
 * varies by instance type. For information about instance types, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"> Instance Types </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> . For more information about Elastic IP addresses, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * AssignPrivateIpAddresses is available only in EC2-VPC.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#assignPrivateIpAddresses(AssignPrivateIpAddressesRequest)
 */
public class AssignPrivateIpAddressesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * One or more IP addresses to be assigned as a secondary private IP
     * address to the network interface. <p>If you don't specify an IP
     * address, Amazon EC2 automatically selects an IP address within the
     * subnet range.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> privateIpAddresses;

    /**
     * The number of secondary IP addresses to assign to the network
     * interface.
     */
    private Integer secondaryPrivateIpAddressCount;

    /**
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the
     * specified network interface.
     */
    private Boolean allowReassignment;

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
    public AssignPrivateIpAddressesRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * One or more IP addresses to be assigned as a secondary private IP
     * address to the network interface. <p>If you don't specify an IP
     * address, Amazon EC2 automatically selects an IP address within the
     * subnet range.
     *
     * @return One or more IP addresses to be assigned as a secondary private IP
     *         address to the network interface. <p>If you don't specify an IP
     *         address, Amazon EC2 automatically selects an IP address within the
     *         subnet range.
     */
    public java.util.List<String> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
              privateIpAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              privateIpAddresses.setAutoConstruct(true);
        }
        return privateIpAddresses;
    }
    
    /**
     * One or more IP addresses to be assigned as a secondary private IP
     * address to the network interface. <p>If you don't specify an IP
     * address, Amazon EC2 automatically selects an IP address within the
     * subnet range.
     *
     * @param privateIpAddresses One or more IP addresses to be assigned as a secondary private IP
     *         address to the network interface. <p>If you don't specify an IP
     *         address, Amazon EC2 automatically selects an IP address within the
     *         subnet range.
     */
    public void setPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> privateIpAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(privateIpAddresses.size());
        privateIpAddressesCopy.addAll(privateIpAddresses);
        this.privateIpAddresses = privateIpAddressesCopy;
    }
    
    /**
     * One or more IP addresses to be assigned as a secondary private IP
     * address to the network interface. <p>If you don't specify an IP
     * address, Amazon EC2 automatically selects an IP address within the
     * subnet range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses One or more IP addresses to be assigned as a secondary private IP
     *         address to the network interface. <p>If you don't specify an IP
     *         address, Amazon EC2 automatically selects an IP address within the
     *         subnet range.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssignPrivateIpAddressesRequest withPrivateIpAddresses(String... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) setPrivateIpAddresses(new java.util.ArrayList<String>(privateIpAddresses.length));
        for (String value : privateIpAddresses) {
            getPrivateIpAddresses().add(value);
        }
        return this;
    }
    
    /**
     * One or more IP addresses to be assigned as a secondary private IP
     * address to the network interface. <p>If you don't specify an IP
     * address, Amazon EC2 automatically selects an IP address within the
     * subnet range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses One or more IP addresses to be assigned as a secondary private IP
     *         address to the network interface. <p>If you don't specify an IP
     *         address, Amazon EC2 automatically selects an IP address within the
     *         subnet range.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssignPrivateIpAddressesRequest withPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> privateIpAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(privateIpAddresses.size());
            privateIpAddressesCopy.addAll(privateIpAddresses);
            this.privateIpAddresses = privateIpAddressesCopy;
        }

        return this;
    }

    /**
     * The number of secondary IP addresses to assign to the network
     * interface.
     *
     * @return The number of secondary IP addresses to assign to the network
     *         interface.
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }
    
    /**
     * The number of secondary IP addresses to assign to the network
     * interface.
     *
     * @param secondaryPrivateIpAddressCount The number of secondary IP addresses to assign to the network
     *         interface.
     */
    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }
    
    /**
     * The number of secondary IP addresses to assign to the network
     * interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secondaryPrivateIpAddressCount The number of secondary IP addresses to assign to the network
     *         interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssignPrivateIpAddressesRequest withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the
     * specified network interface.
     *
     * @return Indicates whether to allow an IP address that is already assigned to
     *         another network interface or instance to be reassigned to the
     *         specified network interface.
     */
    public Boolean isAllowReassignment() {
        return allowReassignment;
    }
    
    /**
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the
     * specified network interface.
     *
     * @param allowReassignment Indicates whether to allow an IP address that is already assigned to
     *         another network interface or instance to be reassigned to the
     *         specified network interface.
     */
    public void setAllowReassignment(Boolean allowReassignment) {
        this.allowReassignment = allowReassignment;
    }
    
    /**
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the
     * specified network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowReassignment Indicates whether to allow an IP address that is already assigned to
     *         another network interface or instance to be reassigned to the
     *         specified network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssignPrivateIpAddressesRequest withAllowReassignment(Boolean allowReassignment) {
        this.allowReassignment = allowReassignment;
        return this;
    }

    /**
     * Indicates whether to allow an IP address that is already assigned to
     * another network interface or instance to be reassigned to the
     * specified network interface.
     *
     * @return Indicates whether to allow an IP address that is already assigned to
     *         another network interface or instance to be reassigned to the
     *         specified network interface.
     */
    public Boolean getAllowReassignment() {
        return allowReassignment;
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
        if (getPrivateIpAddresses() != null) sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getSecondaryPrivateIpAddressCount() != null) sb.append("SecondaryPrivateIpAddressCount: " + getSecondaryPrivateIpAddressCount() + ",");
        if (isAllowReassignment() != null) sb.append("AllowReassignment: " + isAllowReassignment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode()); 
        hashCode = prime * hashCode + ((getSecondaryPrivateIpAddressCount() == null) ? 0 : getSecondaryPrivateIpAddressCount().hashCode()); 
        hashCode = prime * hashCode + ((isAllowReassignment() == null) ? 0 : isAllowReassignment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssignPrivateIpAddressesRequest == false) return false;
        AssignPrivateIpAddressesRequest other = (AssignPrivateIpAddressesRequest)obj;
        
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null) return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false) return false; 
        if (other.getSecondaryPrivateIpAddressCount() == null ^ this.getSecondaryPrivateIpAddressCount() == null) return false;
        if (other.getSecondaryPrivateIpAddressCount() != null && other.getSecondaryPrivateIpAddressCount().equals(this.getSecondaryPrivateIpAddressCount()) == false) return false; 
        if (other.isAllowReassignment() == null ^ this.isAllowReassignment() == null) return false;
        if (other.isAllowReassignment() != null && other.isAllowReassignment().equals(this.isAllowReassignment()) == false) return false; 
        return true;
    }
    
}
    
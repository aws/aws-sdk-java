/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest) UnassignPrivateIpAddresses operation}.
 * <p>
 * Unassigns one or more secondary private IP addresses from a network
 * interface.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest)
 */
public class UnassignPrivateIpAddressesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * The secondary private IP addresses to unassign from the network
     * interface. You can specify this option multiple times to unassign more
     * than one IP address.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> privateIpAddresses;

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
    public UnassignPrivateIpAddressesRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The secondary private IP addresses to unassign from the network
     * interface. You can specify this option multiple times to unassign more
     * than one IP address.
     *
     * @return The secondary private IP addresses to unassign from the network
     *         interface. You can specify this option multiple times to unassign more
     *         than one IP address.
     */
    public java.util.List<String> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
              privateIpAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              privateIpAddresses.setAutoConstruct(true);
        }
        return privateIpAddresses;
    }
    
    /**
     * The secondary private IP addresses to unassign from the network
     * interface. You can specify this option multiple times to unassign more
     * than one IP address.
     *
     * @param privateIpAddresses The secondary private IP addresses to unassign from the network
     *         interface. You can specify this option multiple times to unassign more
     *         than one IP address.
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
     * The secondary private IP addresses to unassign from the network
     * interface. You can specify this option multiple times to unassign more
     * than one IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses The secondary private IP addresses to unassign from the network
     *         interface. You can specify this option multiple times to unassign more
     *         than one IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UnassignPrivateIpAddressesRequest withPrivateIpAddresses(String... privateIpAddresses) {
        if (getPrivateIpAddresses() == null) setPrivateIpAddresses(new java.util.ArrayList<String>(privateIpAddresses.length));
        for (String value : privateIpAddresses) {
            getPrivateIpAddresses().add(value);
        }
        return this;
    }
    
    /**
     * The secondary private IP addresses to unassign from the network
     * interface. You can specify this option multiple times to unassign more
     * than one IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses The secondary private IP addresses to unassign from the network
     *         interface. You can specify this option multiple times to unassign more
     *         than one IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UnassignPrivateIpAddressesRequest withPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
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
        if (getPrivateIpAddresses() != null) sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UnassignPrivateIpAddressesRequest == false) return false;
        UnassignPrivateIpAddressesRequest other = (UnassignPrivateIpAddressesRequest)obj;
        
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null) return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false) return false; 
        return true;
    }
    
}
    
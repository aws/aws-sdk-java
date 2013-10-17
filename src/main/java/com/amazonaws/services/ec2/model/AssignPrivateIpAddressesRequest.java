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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#assignPrivateIpAddresses(AssignPrivateIpAddressesRequest) AssignPrivateIpAddresses operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#assignPrivateIpAddresses(AssignPrivateIpAddressesRequest)
 */
public class AssignPrivateIpAddressesRequest extends AmazonWebServiceRequest implements Serializable {

    private String networkInterfaceId;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> privateIpAddresses;

    private Integer secondaryPrivateIpAddressCount;

    private Boolean allowReassignment;

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
    public AssignPrivateIpAddressesRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * Returns the value of the PrivateIpAddresses property for this object.
     *
     * @return The value of the PrivateIpAddresses property for this object.
     */
    public java.util.List<String> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
              privateIpAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              privateIpAddresses.setAutoConstruct(true);
        }
        return privateIpAddresses;
    }
    
    /**
     * Sets the value of the PrivateIpAddresses property for this object.
     *
     * @param privateIpAddresses The new value for the PrivateIpAddresses property for this object.
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
     * Sets the value of the PrivateIpAddresses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses The new value for the PrivateIpAddresses property for this object.
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
     * Sets the value of the PrivateIpAddresses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddresses The new value for the PrivateIpAddresses property for this object.
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
    public AssignPrivateIpAddressesRequest withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * Returns the value of the AllowReassignment property for this object.
     *
     * @return The value of the AllowReassignment property for this object.
     */
    public Boolean isAllowReassignment() {
        return allowReassignment;
    }
    
    /**
     * Sets the value of the AllowReassignment property for this object.
     *
     * @param allowReassignment The new value for the AllowReassignment property for this object.
     */
    public void setAllowReassignment(Boolean allowReassignment) {
        this.allowReassignment = allowReassignment;
    }
    
    /**
     * Sets the value of the AllowReassignment property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowReassignment The new value for the AllowReassignment property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssignPrivateIpAddressesRequest withAllowReassignment(Boolean allowReassignment) {
        this.allowReassignment = allowReassignment;
        return this;
    }

    /**
     * Returns the value of the AllowReassignment property for this object.
     *
     * @return The value of the AllowReassignment property for this object.
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
    
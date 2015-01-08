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

/**
 * <p>
 * Describes the private IP address of a network interface.
 * </p>
 */
public class NetworkInterfacePrivateIpAddress implements Serializable {

    /**
     * The private IP address.
     */
    private String privateIpAddress;

    /**
     * The private DNS name.
     */
    private String privateDnsName;

    /**
     * Indicates whether this IP address is the primary private IP address of
     * the network interface.
     */
    private Boolean primary;

    /**
     * The association information for an Elastic IP address associated with
     * the network interface.
     */
    private NetworkInterfaceAssociation association;

    /**
     * The private IP address.
     *
     * @return The private IP address.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * The private IP address.
     *
     * @param privateIpAddress The private IP address.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * The private IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The private IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkInterfacePrivateIpAddress withPrivateIpAddress(String privateIpAddress) {
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
    public NetworkInterfacePrivateIpAddress withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * Indicates whether this IP address is the primary private IP address of
     * the network interface.
     *
     * @return Indicates whether this IP address is the primary private IP address of
     *         the network interface.
     */
    public Boolean isPrimary() {
        return primary;
    }
    
    /**
     * Indicates whether this IP address is the primary private IP address of
     * the network interface.
     *
     * @param primary Indicates whether this IP address is the primary private IP address of
     *         the network interface.
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }
    
    /**
     * Indicates whether this IP address is the primary private IP address of
     * the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param primary Indicates whether this IP address is the primary private IP address of
     *         the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkInterfacePrivateIpAddress withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Indicates whether this IP address is the primary private IP address of
     * the network interface.
     *
     * @return Indicates whether this IP address is the primary private IP address of
     *         the network interface.
     */
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * The association information for an Elastic IP address associated with
     * the network interface.
     *
     * @return The association information for an Elastic IP address associated with
     *         the network interface.
     */
    public NetworkInterfaceAssociation getAssociation() {
        return association;
    }
    
    /**
     * The association information for an Elastic IP address associated with
     * the network interface.
     *
     * @param association The association information for an Elastic IP address associated with
     *         the network interface.
     */
    public void setAssociation(NetworkInterfaceAssociation association) {
        this.association = association;
    }
    
    /**
     * The association information for an Elastic IP address associated with
     * the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param association The association information for an Elastic IP address associated with
     *         the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkInterfacePrivateIpAddress withAssociation(NetworkInterfaceAssociation association) {
        this.association = association;
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
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPrivateDnsName() != null) sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (isPrimary() != null) sb.append("Primary: " + isPrimary() + ",");
        if (getAssociation() != null) sb.append("Association: " + getAssociation() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode()); 
        hashCode = prime * hashCode + ((isPrimary() == null) ? 0 : isPrimary().hashCode()); 
        hashCode = prime * hashCode + ((getAssociation() == null) ? 0 : getAssociation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NetworkInterfacePrivateIpAddress == false) return false;
        NetworkInterfacePrivateIpAddress other = (NetworkInterfacePrivateIpAddress)obj;
        
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null) return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false) return false; 
        if (other.isPrimary() == null ^ this.isPrimary() == null) return false;
        if (other.isPrimary() != null && other.isPrimary().equals(this.isPrimary()) == false) return false; 
        if (other.getAssociation() == null ^ this.getAssociation() == null) return false;
        if (other.getAssociation() != null && other.getAssociation().equals(this.getAssociation()) == false) return false; 
        return true;
    }
    
}
    
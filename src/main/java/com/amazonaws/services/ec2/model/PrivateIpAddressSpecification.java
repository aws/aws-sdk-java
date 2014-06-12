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
 * Describes a secondary private IP address for a network interface.
 * </p>
 */
public class PrivateIpAddressSpecification implements Serializable {

    /**
     * The private IP addresses.
     */
    private String privateIpAddress;

    /**
     * Indicates whether the private IP address is the primary private IP
     * address.
     */
    private Boolean primary;

    /**
     * The private IP addresses.
     *
     * @return The private IP addresses.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * The private IP addresses.
     *
     * @param privateIpAddress The private IP addresses.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * The private IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The private IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PrivateIpAddressSpecification withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Indicates whether the private IP address is the primary private IP
     * address.
     *
     * @return Indicates whether the private IP address is the primary private IP
     *         address.
     */
    public Boolean isPrimary() {
        return primary;
    }
    
    /**
     * Indicates whether the private IP address is the primary private IP
     * address.
     *
     * @param primary Indicates whether the private IP address is the primary private IP
     *         address.
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }
    
    /**
     * Indicates whether the private IP address is the primary private IP
     * address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param primary Indicates whether the private IP address is the primary private IP
     *         address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PrivateIpAddressSpecification withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Indicates whether the private IP address is the primary private IP
     * address.
     *
     * @return Indicates whether the private IP address is the primary private IP
     *         address.
     */
    public Boolean getPrimary() {
        return primary;
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
        if (isPrimary() != null) sb.append("Primary: " + isPrimary() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((isPrimary() == null) ? 0 : isPrimary().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PrivateIpAddressSpecification == false) return false;
        PrivateIpAddressSpecification other = (PrivateIpAddressSpecification)obj;
        
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.isPrimary() == null ^ this.isPrimary() == null) return false;
        if (other.isPrimary() != null && other.isPrimary().equals(this.isPrimary()) == false) return false; 
        return true;
    }
    
}
    
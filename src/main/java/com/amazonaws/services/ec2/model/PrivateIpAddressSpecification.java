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
 * Private Ip Address Specification
 */
public class PrivateIpAddressSpecification implements Serializable {

    private String privateIpAddress;

    private Boolean primary;

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
    public PrivateIpAddressSpecification withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Returns the value of the Primary property for this object.
     *
     * @return The value of the Primary property for this object.
     */
    public Boolean isPrimary() {
        return primary;
    }
    
    /**
     * Sets the value of the Primary property for this object.
     *
     * @param primary The new value for the Primary property for this object.
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }
    
    /**
     * Sets the value of the Primary property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param primary The new value for the Primary property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PrivateIpAddressSpecification withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Returns the value of the Primary property for this object.
     *
     * @return The value of the Primary property for this object.
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
    
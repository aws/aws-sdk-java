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
 * Instance Private Ip Address
 */
public class InstancePrivateIpAddress implements Serializable {

    private String privateIpAddress;

    private String privateDnsName;

    private Boolean primary;

    private InstanceNetworkInterfaceAssociation association;

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
    public InstancePrivateIpAddress withPrivateIpAddress(String privateIpAddress) {
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
    public InstancePrivateIpAddress withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
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
    public InstancePrivateIpAddress withPrimary(Boolean primary) {
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
    public InstancePrivateIpAddress withAssociation(InstanceNetworkInterfaceAssociation association) {
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

        if (obj instanceof InstancePrivateIpAddress == false) return false;
        InstancePrivateIpAddress other = (InstancePrivateIpAddress)obj;
        
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
    
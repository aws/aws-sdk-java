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
 * Network Interface Association
 */
public class NetworkInterfaceAssociation implements Serializable {

    private String publicIp;

    private String ipOwnerId;

    private String allocationId;

    private String associationId;

    /**
     * Returns the value of the PublicIp property for this object.
     *
     * @return The value of the PublicIp property for this object.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * Sets the value of the PublicIp property for this object.
     *
     * @param publicIp The new value for the PublicIp property for this object.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * Sets the value of the PublicIp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The new value for the PublicIp property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkInterfaceAssociation withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * Returns the value of the IpOwnerId property for this object.
     *
     * @return The value of the IpOwnerId property for this object.
     */
    public String getIpOwnerId() {
        return ipOwnerId;
    }
    
    /**
     * Sets the value of the IpOwnerId property for this object.
     *
     * @param ipOwnerId The new value for the IpOwnerId property for this object.
     */
    public void setIpOwnerId(String ipOwnerId) {
        this.ipOwnerId = ipOwnerId;
    }
    
    /**
     * Sets the value of the IpOwnerId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipOwnerId The new value for the IpOwnerId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkInterfaceAssociation withIpOwnerId(String ipOwnerId) {
        this.ipOwnerId = ipOwnerId;
        return this;
    }

    /**
     * Returns the value of the AllocationId property for this object.
     *
     * @return The value of the AllocationId property for this object.
     */
    public String getAllocationId() {
        return allocationId;
    }
    
    /**
     * Sets the value of the AllocationId property for this object.
     *
     * @param allocationId The new value for the AllocationId property for this object.
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }
    
    /**
     * Sets the value of the AllocationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationId The new value for the AllocationId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkInterfaceAssociation withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * Returns the value of the AssociationId property for this object.
     *
     * @return The value of the AssociationId property for this object.
     */
    public String getAssociationId() {
        return associationId;
    }
    
    /**
     * Sets the value of the AssociationId property for this object.
     *
     * @param associationId The new value for the AssociationId property for this object.
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }
    
    /**
     * Sets the value of the AssociationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationId The new value for the AssociationId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkInterfaceAssociation withAssociationId(String associationId) {
        this.associationId = associationId;
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
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getIpOwnerId() != null) sb.append("IpOwnerId: " + getIpOwnerId() + ",");
        if (getAllocationId() != null) sb.append("AllocationId: " + getAllocationId() + ",");
        if (getAssociationId() != null) sb.append("AssociationId: " + getAssociationId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode()); 
        hashCode = prime * hashCode + ((getIpOwnerId() == null) ? 0 : getIpOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode()); 
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NetworkInterfaceAssociation == false) return false;
        NetworkInterfaceAssociation other = (NetworkInterfaceAssociation)obj;
        
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getIpOwnerId() == null ^ this.getIpOwnerId() == null) return false;
        if (other.getIpOwnerId() != null && other.getIpOwnerId().equals(this.getIpOwnerId()) == false) return false; 
        if (other.getAllocationId() == null ^ this.getAllocationId() == null) return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false) return false; 
        if (other.getAssociationId() == null ^ this.getAssociationId() == null) return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false) return false; 
        return true;
    }
    
}
    
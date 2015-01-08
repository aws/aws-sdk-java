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
 * Describes association information for an Elastic IP address.
 * </p>
 */
public class NetworkInterfaceAssociation implements Serializable {

    /**
     * The address of the Elastic IP address bound to the network interface.
     */
    private String publicIp;

    /**
     * The public DNS name.
     */
    private String publicDnsName;

    /**
     * The ID of the Elastic IP address owner.
     */
    private String ipOwnerId;

    /**
     * The allocation ID.
     */
    private String allocationId;

    /**
     * The association ID.
     */
    private String associationId;

    /**
     * The address of the Elastic IP address bound to the network interface.
     *
     * @return The address of the Elastic IP address bound to the network interface.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The address of the Elastic IP address bound to the network interface.
     *
     * @param publicIp The address of the Elastic IP address bound to the network interface.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The address of the Elastic IP address bound to the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The address of the Elastic IP address bound to the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkInterfaceAssociation withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * The public DNS name.
     *
     * @return The public DNS name.
     */
    public String getPublicDnsName() {
        return publicDnsName;
    }
    
    /**
     * The public DNS name.
     *
     * @param publicDnsName The public DNS name.
     */
    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }
    
    /**
     * The public DNS name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicDnsName The public DNS name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkInterfaceAssociation withPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
        return this;
    }

    /**
     * The ID of the Elastic IP address owner.
     *
     * @return The ID of the Elastic IP address owner.
     */
    public String getIpOwnerId() {
        return ipOwnerId;
    }
    
    /**
     * The ID of the Elastic IP address owner.
     *
     * @param ipOwnerId The ID of the Elastic IP address owner.
     */
    public void setIpOwnerId(String ipOwnerId) {
        this.ipOwnerId = ipOwnerId;
    }
    
    /**
     * The ID of the Elastic IP address owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipOwnerId The ID of the Elastic IP address owner.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkInterfaceAssociation withIpOwnerId(String ipOwnerId) {
        this.ipOwnerId = ipOwnerId;
        return this;
    }

    /**
     * The allocation ID.
     *
     * @return The allocation ID.
     */
    public String getAllocationId() {
        return allocationId;
    }
    
    /**
     * The allocation ID.
     *
     * @param allocationId The allocation ID.
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }
    
    /**
     * The allocation ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationId The allocation ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkInterfaceAssociation withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * The association ID.
     *
     * @return The association ID.
     */
    public String getAssociationId() {
        return associationId;
    }
    
    /**
     * The association ID.
     *
     * @param associationId The association ID.
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }
    
    /**
     * The association ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationId The association ID.
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
        if (getPublicDnsName() != null) sb.append("PublicDnsName: " + getPublicDnsName() + ",");
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
        hashCode = prime * hashCode + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode()); 
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
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null) return false;
        if (other.getPublicDnsName() != null && other.getPublicDnsName().equals(this.getPublicDnsName()) == false) return false; 
        if (other.getIpOwnerId() == null ^ this.getIpOwnerId() == null) return false;
        if (other.getIpOwnerId() != null && other.getIpOwnerId().equals(this.getIpOwnerId()) == false) return false; 
        if (other.getAllocationId() == null ^ this.getAllocationId() == null) return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false) return false; 
        if (other.getAssociationId() == null ^ this.getAssociationId() == null) return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false) return false; 
        return true;
    }
    
}
    
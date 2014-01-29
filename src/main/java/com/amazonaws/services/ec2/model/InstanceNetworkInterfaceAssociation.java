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
 * Describes association information for an Elastic IP address.
 * </p>
 */
public class InstanceNetworkInterfaceAssociation implements Serializable {

    /**
     * The address of the Elastic IP address bound to the network interface.
     */
    private String publicIp;

    /**
     * The public DNS name.
     */
    private String publicDnsName;

    /**
     * The ID of the owner of the Elastic IP address.
     */
    private String ipOwnerId;

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
    public InstanceNetworkInterfaceAssociation withPublicIp(String publicIp) {
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
    public InstanceNetworkInterfaceAssociation withPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
        return this;
    }

    /**
     * The ID of the owner of the Elastic IP address.
     *
     * @return The ID of the owner of the Elastic IP address.
     */
    public String getIpOwnerId() {
        return ipOwnerId;
    }
    
    /**
     * The ID of the owner of the Elastic IP address.
     *
     * @param ipOwnerId The ID of the owner of the Elastic IP address.
     */
    public void setIpOwnerId(String ipOwnerId) {
        this.ipOwnerId = ipOwnerId;
    }
    
    /**
     * The ID of the owner of the Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipOwnerId The ID of the owner of the Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceNetworkInterfaceAssociation withIpOwnerId(String ipOwnerId) {
        this.ipOwnerId = ipOwnerId;
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
        if (getIpOwnerId() != null) sb.append("IpOwnerId: " + getIpOwnerId() );
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceNetworkInterfaceAssociation == false) return false;
        InstanceNetworkInterfaceAssociation other = (InstanceNetworkInterfaceAssociation)obj;
        
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null) return false;
        if (other.getPublicDnsName() != null && other.getPublicDnsName().equals(this.getPublicDnsName()) == false) return false; 
        if (other.getIpOwnerId() == null ^ this.getIpOwnerId() == null) return false;
        if (other.getIpOwnerId() != null && other.getIpOwnerId().equals(this.getIpOwnerId()) == false) return false; 
        return true;
    }
    
}
    
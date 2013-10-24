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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#allocateConnectionOnInterconnect(AllocateConnectionOnInterconnectRequest) AllocateConnectionOnInterconnect operation}.
 * <p>
 * Creates a hosted connection on an interconnect.
 * </p>
 * <p>
 * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the given interconnect.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#allocateConnectionOnInterconnect(AllocateConnectionOnInterconnectRequest)
 */
public class AllocateConnectionOnInterconnectRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     */
    private String bandwidth;

    /**
     * Name of the provisioned connection. <p>Example: "<i>500M Connection to
     * AWS</i>" <p>Default: None
     */
    private String connectionName;

    /**
     * Numeric account Id of the customer for whom the connection will be
     * provisioned. <p>Example: 123443215678 <p>Default: None
     */
    private String ownerAccount;

    /**
     * ID of the interconnect on which the connection will be provisioned.
     * <p>Example: dxcon-456abc78 <p>Default: None
     */
    private String interconnectId;

    /**
     * The dedicated VLAN provisioned to the connection. <p>Example: 101
     * <p>Default: None
     */
    private Integer vlan;

    /**
     * Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     *
     * @return Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     */
    public String getBandwidth() {
        return bandwidth;
    }
    
    /**
     * Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     *
     * @param bandwidth Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     */
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }
    
    /**
     * Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bandwidth Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AllocateConnectionOnInterconnectRequest withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * Name of the provisioned connection. <p>Example: "<i>500M Connection to
     * AWS</i>" <p>Default: None
     *
     * @return Name of the provisioned connection. <p>Example: "<i>500M Connection to
     *         AWS</i>" <p>Default: None
     */
    public String getConnectionName() {
        return connectionName;
    }
    
    /**
     * Name of the provisioned connection. <p>Example: "<i>500M Connection to
     * AWS</i>" <p>Default: None
     *
     * @param connectionName Name of the provisioned connection. <p>Example: "<i>500M Connection to
     *         AWS</i>" <p>Default: None
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }
    
    /**
     * Name of the provisioned connection. <p>Example: "<i>500M Connection to
     * AWS</i>" <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionName Name of the provisioned connection. <p>Example: "<i>500M Connection to
     *         AWS</i>" <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AllocateConnectionOnInterconnectRequest withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Numeric account Id of the customer for whom the connection will be
     * provisioned. <p>Example: 123443215678 <p>Default: None
     *
     * @return Numeric account Id of the customer for whom the connection will be
     *         provisioned. <p>Example: 123443215678 <p>Default: None
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }
    
    /**
     * Numeric account Id of the customer for whom the connection will be
     * provisioned. <p>Example: 123443215678 <p>Default: None
     *
     * @param ownerAccount Numeric account Id of the customer for whom the connection will be
     *         provisioned. <p>Example: 123443215678 <p>Default: None
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }
    
    /**
     * Numeric account Id of the customer for whom the connection will be
     * provisioned. <p>Example: 123443215678 <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAccount Numeric account Id of the customer for whom the connection will be
     *         provisioned. <p>Example: 123443215678 <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AllocateConnectionOnInterconnectRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * ID of the interconnect on which the connection will be provisioned.
     * <p>Example: dxcon-456abc78 <p>Default: None
     *
     * @return ID of the interconnect on which the connection will be provisioned.
     *         <p>Example: dxcon-456abc78 <p>Default: None
     */
    public String getInterconnectId() {
        return interconnectId;
    }
    
    /**
     * ID of the interconnect on which the connection will be provisioned.
     * <p>Example: dxcon-456abc78 <p>Default: None
     *
     * @param interconnectId ID of the interconnect on which the connection will be provisioned.
     *         <p>Example: dxcon-456abc78 <p>Default: None
     */
    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }
    
    /**
     * ID of the interconnect on which the connection will be provisioned.
     * <p>Example: dxcon-456abc78 <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interconnectId ID of the interconnect on which the connection will be provisioned.
     *         <p>Example: dxcon-456abc78 <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AllocateConnectionOnInterconnectRequest withInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
        return this;
    }

    /**
     * The dedicated VLAN provisioned to the connection. <p>Example: 101
     * <p>Default: None
     *
     * @return The dedicated VLAN provisioned to the connection. <p>Example: 101
     *         <p>Default: None
     */
    public Integer getVlan() {
        return vlan;
    }
    
    /**
     * The dedicated VLAN provisioned to the connection. <p>Example: 101
     * <p>Default: None
     *
     * @param vlan The dedicated VLAN provisioned to the connection. <p>Example: 101
     *         <p>Default: None
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }
    
    /**
     * The dedicated VLAN provisioned to the connection. <p>Example: 101
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vlan The dedicated VLAN provisioned to the connection. <p>Example: 101
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AllocateConnectionOnInterconnectRequest withVlan(Integer vlan) {
        this.vlan = vlan;
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
        if (getBandwidth() != null) sb.append("Bandwidth: " + getBandwidth() + ",");
        if (getConnectionName() != null) sb.append("ConnectionName: " + getConnectionName() + ",");
        if (getOwnerAccount() != null) sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getInterconnectId() != null) sb.append("InterconnectId: " + getInterconnectId() + ",");
        if (getVlan() != null) sb.append("Vlan: " + getVlan() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode()); 
        hashCode = prime * hashCode + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode()); 
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AllocateConnectionOnInterconnectRequest == false) return false;
        AllocateConnectionOnInterconnectRequest other = (AllocateConnectionOnInterconnectRequest)obj;
        
        if (other.getBandwidth() == null ^ this.getBandwidth() == null) return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false) return false; 
        if (other.getConnectionName() == null ^ this.getConnectionName() == null) return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false) return false; 
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null) return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false) return false; 
        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null) return false;
        if (other.getInterconnectId() != null && other.getInterconnectId().equals(this.getInterconnectId()) == false) return false; 
        if (other.getVlan() == null ^ this.getVlan() == null) return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false) return false; 
        return true;
    }
    
}
    
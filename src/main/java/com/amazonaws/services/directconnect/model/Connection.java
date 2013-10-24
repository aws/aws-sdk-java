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


/**
 * <p>
 * A connection represents the physical network connection between the AWS Direct Connect location and the customer.
 * </p>
 */
public class Connection implements Serializable {

    private String ownerAccount;

    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    private String connectionId;

    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     */
    private String connectionName;

    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     */
    private String connectionState;

    /**
     * The AWS region where the connection is located. <p>Example: us-east-1
     * <p>Default: None
     */
    private String region;

    /**
     * Where the connection is located. <p>Example: EqSV5 <p>Default: None
     */
    private String location;

    /**
     * Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     */
    private String bandwidth;

    /**
     * The VLAN ID. <p>Example: 101
     */
    private Integer vlan;

    private String partnerName;

    /**
     * Returns the value of the OwnerAccount property for this object.
     *
     * @return The value of the OwnerAccount property for this object.
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }
    
    /**
     * Sets the value of the OwnerAccount property for this object.
     *
     * @param ownerAccount The new value for the OwnerAccount property for this object.
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }
    
    /**
     * Sets the value of the OwnerAccount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAccount The new value for the OwnerAccount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Connection withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @return ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    public String getConnectionId() {
        return connectionId;
    }
    
    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @param connectionId ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    
    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionId ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Connection withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     *
     * @return The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     *         <p>Default: None
     */
    public String getConnectionName() {
        return connectionName;
    }
    
    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     *
     * @param connectionName The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     *         <p>Default: None
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }
    
    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionName The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Connection withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @return State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @see ConnectionState
     */
    public String getConnectionState() {
        return connectionState;
    }
    
    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @param connectionState State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @see ConnectionState
     */
    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }
    
    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @param connectionState State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConnectionState
     */
    public Connection withConnectionState(String connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @param connectionState State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @see ConnectionState
     */
    public void setConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
    }
    
    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @param connectionState State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConnectionState
     */
    public Connection withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * The AWS region where the connection is located. <p>Example: us-east-1
     * <p>Default: None
     *
     * @return The AWS region where the connection is located. <p>Example: us-east-1
     *         <p>Default: None
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The AWS region where the connection is located. <p>Example: us-east-1
     * <p>Default: None
     *
     * @param region The AWS region where the connection is located. <p>Example: us-east-1
     *         <p>Default: None
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The AWS region where the connection is located. <p>Example: us-east-1
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The AWS region where the connection is located. <p>Example: us-east-1
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Connection withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Where the connection is located. <p>Example: EqSV5 <p>Default: None
     *
     * @return Where the connection is located. <p>Example: EqSV5 <p>Default: None
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Where the connection is located. <p>Example: EqSV5 <p>Default: None
     *
     * @param location Where the connection is located. <p>Example: EqSV5 <p>Default: None
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * Where the connection is located. <p>Example: EqSV5 <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location Where the connection is located. <p>Example: EqSV5 <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Connection withLocation(String location) {
        this.location = location;
        return this;
    }

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
    public Connection withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * The VLAN ID. <p>Example: 101
     *
     * @return The VLAN ID. <p>Example: 101
     */
    public Integer getVlan() {
        return vlan;
    }
    
    /**
     * The VLAN ID. <p>Example: 101
     *
     * @param vlan The VLAN ID. <p>Example: 101
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }
    
    /**
     * The VLAN ID. <p>Example: 101
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vlan The VLAN ID. <p>Example: 101
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Connection withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * Returns the value of the PartnerName property for this object.
     *
     * @return The value of the PartnerName property for this object.
     */
    public String getPartnerName() {
        return partnerName;
    }
    
    /**
     * Sets the value of the PartnerName property for this object.
     *
     * @param partnerName The new value for the PartnerName property for this object.
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }
    
    /**
     * Sets the value of the PartnerName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partnerName The new value for the PartnerName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Connection withPartnerName(String partnerName) {
        this.partnerName = partnerName;
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
        if (getOwnerAccount() != null) sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getConnectionId() != null) sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getConnectionName() != null) sb.append("ConnectionName: " + getConnectionName() + ",");
        if (getConnectionState() != null) sb.append("ConnectionState: " + getConnectionState() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation() + ",");
        if (getBandwidth() != null) sb.append("Bandwidth: " + getBandwidth() + ",");
        if (getVlan() != null) sb.append("Vlan: " + getVlan() + ",");
        if (getPartnerName() != null) sb.append("PartnerName: " + getPartnerName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode()); 
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode()); 
        hashCode = prime * hashCode + ((getPartnerName() == null) ? 0 : getPartnerName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Connection == false) return false;
        Connection other = (Connection)obj;
        
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null) return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false) return false; 
        if (other.getConnectionId() == null ^ this.getConnectionId() == null) return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false) return false; 
        if (other.getConnectionName() == null ^ this.getConnectionName() == null) return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false) return false; 
        if (other.getConnectionState() == null ^ this.getConnectionState() == null) return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getBandwidth() == null ^ this.getBandwidth() == null) return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false) return false; 
        if (other.getVlan() == null ^ this.getVlan() == null) return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false) return false; 
        if (other.getPartnerName() == null ^ this.getPartnerName() == null) return false;
        if (other.getPartnerName() != null && other.getPartnerName().equals(this.getPartnerName()) == false) return false; 
        return true;
    }
    
}
    
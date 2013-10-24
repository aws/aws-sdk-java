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
 * An interconnect is a connection that can host other connections.
 * </p>
 * <p>
 * Like a standard AWS Direct Connect connection, an interconnect represents the physical connection between an AWS Direct Connect partner's network and
 * a specific Direct Connect location. An AWS Direct Connect partner who owns an interconnect can provision hosted connections on the interconnect for
 * their end customers, thereby providing the end customers with connectivity to AWS services.
 * </p>
 * <p>
 * The resources of the interconnect, including bandwidth and VLAN numbers, are shared by all of the hosted connections on the interconnect, and the
 * owner of the interconnect determines how these resources are assigned.
 * </p>
 */
public class CreateInterconnectResult implements Serializable {

    /**
     * The ID of the interconnect. <p>Example: dxcon-abc123
     */
    private String interconnectId;

    /**
     * The name of the interconnect. <p>Example: "<i>1G Interconnect to
     * AWS</i>"
     */
    private String interconnectName;

    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     */
    private String interconnectState;

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
     * The ID of the interconnect. <p>Example: dxcon-abc123
     *
     * @return The ID of the interconnect. <p>Example: dxcon-abc123
     */
    public String getInterconnectId() {
        return interconnectId;
    }
    
    /**
     * The ID of the interconnect. <p>Example: dxcon-abc123
     *
     * @param interconnectId The ID of the interconnect. <p>Example: dxcon-abc123
     */
    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }
    
    /**
     * The ID of the interconnect. <p>Example: dxcon-abc123
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interconnectId The ID of the interconnect. <p>Example: dxcon-abc123
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInterconnectResult withInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
        return this;
    }

    /**
     * The name of the interconnect. <p>Example: "<i>1G Interconnect to
     * AWS</i>"
     *
     * @return The name of the interconnect. <p>Example: "<i>1G Interconnect to
     *         AWS</i>"
     */
    public String getInterconnectName() {
        return interconnectName;
    }
    
    /**
     * The name of the interconnect. <p>Example: "<i>1G Interconnect to
     * AWS</i>"
     *
     * @param interconnectName The name of the interconnect. <p>Example: "<i>1G Interconnect to
     *         AWS</i>"
     */
    public void setInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
    }
    
    /**
     * The name of the interconnect. <p>Example: "<i>1G Interconnect to
     * AWS</i>"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interconnectName The name of the interconnect. <p>Example: "<i>1G Interconnect to
     *         AWS</i>"
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInterconnectResult withInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
        return this;
    }

    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @return State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @see InterconnectState
     */
    public String getInterconnectState() {
        return interconnectState;
    }
    
    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @param interconnectState State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @see InterconnectState
     */
    public void setInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
    }
    
    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @param interconnectState State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InterconnectState
     */
    public CreateInterconnectResult withInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
        return this;
    }

    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @param interconnectState State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @see InterconnectState
     */
    public void setInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
    }
    
    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @param interconnectState State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InterconnectState
     */
    public CreateInterconnectResult withInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
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
    public CreateInterconnectResult withRegion(String region) {
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
    public CreateInterconnectResult withLocation(String location) {
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
    public CreateInterconnectResult withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
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
        if (getInterconnectId() != null) sb.append("InterconnectId: " + getInterconnectId() + ",");
        if (getInterconnectName() != null) sb.append("InterconnectName: " + getInterconnectName() + ",");
        if (getInterconnectState() != null) sb.append("InterconnectState: " + getInterconnectState() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation() + ",");
        if (getBandwidth() != null) sb.append("Bandwidth: " + getBandwidth() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode()); 
        hashCode = prime * hashCode + ((getInterconnectName() == null) ? 0 : getInterconnectName().hashCode()); 
        hashCode = prime * hashCode + ((getInterconnectState() == null) ? 0 : getInterconnectState().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateInterconnectResult == false) return false;
        CreateInterconnectResult other = (CreateInterconnectResult)obj;
        
        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null) return false;
        if (other.getInterconnectId() != null && other.getInterconnectId().equals(this.getInterconnectId()) == false) return false; 
        if (other.getInterconnectName() == null ^ this.getInterconnectName() == null) return false;
        if (other.getInterconnectName() != null && other.getInterconnectName().equals(this.getInterconnectName()) == false) return false; 
        if (other.getInterconnectState() == null ^ this.getInterconnectState() == null) return false;
        if (other.getInterconnectState() != null && other.getInterconnectState().equals(this.getInterconnectState()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getBandwidth() == null ^ this.getBandwidth() == null) return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false) return false; 
        return true;
    }
    
}
    
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
 * You can create one or more AWS Direct Connect private virtual interfaces linking to your virtual private gateway.
 * </p>
 * <p>
 * Virtual private gateways can be managed using the Amazon Virtual Private Cloud (Amazon VPC) console or the <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html"> Amazon EC2 CreateVpnGateway action </a> .
 * </p>
 */
public class VirtualGateway implements Serializable {

    /**
     * The ID of the virtual private gateway to a VPC. This only applies to
     * private virtual interfaces. <p>Example: vgw-123er56
     */
    private String virtualGatewayId;

    /**
     * State of the virtual private gateway. <ul> <li><b>Pending</b>: This is
     * the initial state after calling <i>CreateVpnGateway</i>.</li>
     * <li><b>Available</b>: Ready for use by a private virtual
     * interface.</li> <li><b>Deleting</b>: This is the initial state after
     * calling <i>DeleteVpnGateway</i>.</li> <li><b>Deleted</b>: In this
     * state, a private virtual interface is unable to send traffic over this
     * gateway.</li> </ul>
     */
    private String virtualGatewayState;

    /**
     * The ID of the virtual private gateway to a VPC. This only applies to
     * private virtual interfaces. <p>Example: vgw-123er56
     *
     * @return The ID of the virtual private gateway to a VPC. This only applies to
     *         private virtual interfaces. <p>Example: vgw-123er56
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway to a VPC. This only applies to
     * private virtual interfaces. <p>Example: vgw-123er56
     *
     * @param virtualGatewayId The ID of the virtual private gateway to a VPC. This only applies to
     *         private virtual interfaces. <p>Example: vgw-123er56
     */
    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway to a VPC. This only applies to
     * private virtual interfaces. <p>Example: vgw-123er56
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualGatewayId The ID of the virtual private gateway to a VPC. This only applies to
     *         private virtual interfaces. <p>Example: vgw-123er56
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VirtualGateway withVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
        return this;
    }

    /**
     * State of the virtual private gateway. <ul> <li><b>Pending</b>: This is
     * the initial state after calling <i>CreateVpnGateway</i>.</li>
     * <li><b>Available</b>: Ready for use by a private virtual
     * interface.</li> <li><b>Deleting</b>: This is the initial state after
     * calling <i>DeleteVpnGateway</i>.</li> <li><b>Deleted</b>: In this
     * state, a private virtual interface is unable to send traffic over this
     * gateway.</li> </ul>
     *
     * @return State of the virtual private gateway. <ul> <li><b>Pending</b>: This is
     *         the initial state after calling <i>CreateVpnGateway</i>.</li>
     *         <li><b>Available</b>: Ready for use by a private virtual
     *         interface.</li> <li><b>Deleting</b>: This is the initial state after
     *         calling <i>DeleteVpnGateway</i>.</li> <li><b>Deleted</b>: In this
     *         state, a private virtual interface is unable to send traffic over this
     *         gateway.</li> </ul>
     */
    public String getVirtualGatewayState() {
        return virtualGatewayState;
    }
    
    /**
     * State of the virtual private gateway. <ul> <li><b>Pending</b>: This is
     * the initial state after calling <i>CreateVpnGateway</i>.</li>
     * <li><b>Available</b>: Ready for use by a private virtual
     * interface.</li> <li><b>Deleting</b>: This is the initial state after
     * calling <i>DeleteVpnGateway</i>.</li> <li><b>Deleted</b>: In this
     * state, a private virtual interface is unable to send traffic over this
     * gateway.</li> </ul>
     *
     * @param virtualGatewayState State of the virtual private gateway. <ul> <li><b>Pending</b>: This is
     *         the initial state after calling <i>CreateVpnGateway</i>.</li>
     *         <li><b>Available</b>: Ready for use by a private virtual
     *         interface.</li> <li><b>Deleting</b>: This is the initial state after
     *         calling <i>DeleteVpnGateway</i>.</li> <li><b>Deleted</b>: In this
     *         state, a private virtual interface is unable to send traffic over this
     *         gateway.</li> </ul>
     */
    public void setVirtualGatewayState(String virtualGatewayState) {
        this.virtualGatewayState = virtualGatewayState;
    }
    
    /**
     * State of the virtual private gateway. <ul> <li><b>Pending</b>: This is
     * the initial state after calling <i>CreateVpnGateway</i>.</li>
     * <li><b>Available</b>: Ready for use by a private virtual
     * interface.</li> <li><b>Deleting</b>: This is the initial state after
     * calling <i>DeleteVpnGateway</i>.</li> <li><b>Deleted</b>: In this
     * state, a private virtual interface is unable to send traffic over this
     * gateway.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualGatewayState State of the virtual private gateway. <ul> <li><b>Pending</b>: This is
     *         the initial state after calling <i>CreateVpnGateway</i>.</li>
     *         <li><b>Available</b>: Ready for use by a private virtual
     *         interface.</li> <li><b>Deleting</b>: This is the initial state after
     *         calling <i>DeleteVpnGateway</i>.</li> <li><b>Deleted</b>: In this
     *         state, a private virtual interface is unable to send traffic over this
     *         gateway.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VirtualGateway withVirtualGatewayState(String virtualGatewayState) {
        this.virtualGatewayState = virtualGatewayState;
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
        if (getVirtualGatewayId() != null) sb.append("VirtualGatewayId: " + getVirtualGatewayId() + ",");
        if (getVirtualGatewayState() != null) sb.append("VirtualGatewayState: " + getVirtualGatewayState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualGatewayState() == null) ? 0 : getVirtualGatewayState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VirtualGateway == false) return false;
        VirtualGateway other = (VirtualGateway)obj;
        
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null) return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false) return false; 
        if (other.getVirtualGatewayState() == null ^ this.getVirtualGatewayState() == null) return false;
        if (other.getVirtualGatewayState() != null && other.getVirtualGatewayState().equals(this.getVirtualGatewayState()) == false) return false; 
        return true;
    }
    
}
    
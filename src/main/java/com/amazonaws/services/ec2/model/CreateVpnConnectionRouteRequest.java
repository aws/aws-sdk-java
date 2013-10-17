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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createVpnConnectionRoute(CreateVpnConnectionRouteRequest) CreateVpnConnectionRoute operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVpnConnectionRoute(CreateVpnConnectionRouteRequest)
 */
public class CreateVpnConnectionRouteRequest extends AmazonWebServiceRequest implements Serializable {

    private String vpnConnectionId;

    private String destinationCidrBlock;

    /**
     * Returns the value of the VpnConnectionId property for this object.
     *
     * @return The value of the VpnConnectionId property for this object.
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }
    
    /**
     * Sets the value of the VpnConnectionId property for this object.
     *
     * @param vpnConnectionId The new value for the VpnConnectionId property for this object.
     */
    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }
    
    /**
     * Sets the value of the VpnConnectionId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionId The new value for the VpnConnectionId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpnConnectionRouteRequest withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    /**
     * Returns the value of the DestinationCidrBlock property for this
     * object.
     *
     * @return The value of the DestinationCidrBlock property for this object.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * Sets the value of the DestinationCidrBlock property for this object.
     *
     * @param destinationCidrBlock The new value for the DestinationCidrBlock property for this object.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * Sets the value of the DestinationCidrBlock property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The new value for the DestinationCidrBlock property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpnConnectionRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
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
        if (getVpnConnectionId() != null) sb.append("VpnConnectionId: " + getVpnConnectionId() + ",");
        if (getDestinationCidrBlock() != null) sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVpnConnectionRouteRequest == false) return false;
        CreateVpnConnectionRouteRequest other = (CreateVpnConnectionRouteRequest)obj;
        
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null) return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false) return false; 
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null) return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false) return false; 
        return true;
    }
    
}
    
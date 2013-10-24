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
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#describeVirtualInterfaces(DescribeVirtualInterfacesRequest) DescribeVirtualInterfaces operation}.
 * <p>
 * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before DescribeVirtualInterfaces is called are
 * also returned. If a connection ID is included then only virtual interfaces associated with this connection will be returned. If a virtual interface
 * ID is included then only a single virtual interface will be returned.
 * </p>
 * <p>
 * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer.
 * </p>
 * <p>
 * If a connection ID is provided, only virtual interfaces provisioned on the specified connection will be returned. If a virtual interface ID is
 * provided, only this particular virtual interface will be returned.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#describeVirtualInterfaces(DescribeVirtualInterfacesRequest)
 */
public class DescribeVirtualInterfacesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    private String connectionId;

    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     */
    private String virtualInterfaceId;

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
    public DescribeVirtualInterfacesRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     *
     * @return ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     *         None
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }
    
    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     *
     * @param virtualInterfaceId ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     *         None
     */
    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }
    
    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualInterfaceId ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     *         None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVirtualInterfacesRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
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
        if (getConnectionId() != null) sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getVirtualInterfaceId() != null) sb.append("VirtualInterfaceId: " + getVirtualInterfaceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVirtualInterfacesRequest == false) return false;
        DescribeVirtualInterfacesRequest other = (DescribeVirtualInterfacesRequest)obj;
        
        if (other.getConnectionId() == null ^ this.getConnectionId() == null) return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false) return false; 
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null) return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false) return false; 
        return true;
    }
    
}
    
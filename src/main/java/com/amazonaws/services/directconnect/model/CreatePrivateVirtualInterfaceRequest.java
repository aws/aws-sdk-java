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
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#createPrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest) CreatePrivateVirtualInterface operation}.
 * <p>
 * Creates a new private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface
 * supports sending traffic to a single virtual private cloud (VPC).
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#createPrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest)
 */
public class CreatePrivateVirtualInterfaceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    private String connectionId;

    /**
     * Detailed information for the private virtual interface to be created.
     * <p>Default: None
     */
    private NewPrivateVirtualInterface newPrivateVirtualInterface;

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
    public CreatePrivateVirtualInterfaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Detailed information for the private virtual interface to be created.
     * <p>Default: None
     *
     * @return Detailed information for the private virtual interface to be created.
     *         <p>Default: None
     */
    public NewPrivateVirtualInterface getNewPrivateVirtualInterface() {
        return newPrivateVirtualInterface;
    }
    
    /**
     * Detailed information for the private virtual interface to be created.
     * <p>Default: None
     *
     * @param newPrivateVirtualInterface Detailed information for the private virtual interface to be created.
     *         <p>Default: None
     */
    public void setNewPrivateVirtualInterface(NewPrivateVirtualInterface newPrivateVirtualInterface) {
        this.newPrivateVirtualInterface = newPrivateVirtualInterface;
    }
    
    /**
     * Detailed information for the private virtual interface to be created.
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newPrivateVirtualInterface Detailed information for the private virtual interface to be created.
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceRequest withNewPrivateVirtualInterface(NewPrivateVirtualInterface newPrivateVirtualInterface) {
        this.newPrivateVirtualInterface = newPrivateVirtualInterface;
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
        if (getNewPrivateVirtualInterface() != null) sb.append("NewPrivateVirtualInterface: " + getNewPrivateVirtualInterface() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getNewPrivateVirtualInterface() == null) ? 0 : getNewPrivateVirtualInterface().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePrivateVirtualInterfaceRequest == false) return false;
        CreatePrivateVirtualInterfaceRequest other = (CreatePrivateVirtualInterfaceRequest)obj;
        
        if (other.getConnectionId() == null ^ this.getConnectionId() == null) return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false) return false; 
        if (other.getNewPrivateVirtualInterface() == null ^ this.getNewPrivateVirtualInterface() == null) return false;
        if (other.getNewPrivateVirtualInterface() != null && other.getNewPrivateVirtualInterface().equals(this.getNewPrivateVirtualInterface()) == false) return false; 
        return true;
    }
    
}
    
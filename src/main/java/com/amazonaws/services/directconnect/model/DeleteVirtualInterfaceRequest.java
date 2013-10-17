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
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#deleteVirtualInterface(DeleteVirtualInterfaceRequest) DeleteVirtualInterface operation}.
 * <p>
 * Deletes a virtual interface.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#deleteVirtualInterface(DeleteVirtualInterfaceRequest)
 */
public class DeleteVirtualInterfaceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     */
    private String virtualInterfaceId;

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
    public DeleteVirtualInterfaceRequest withVirtualInterfaceId(String virtualInterfaceId) {
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
        if (getVirtualInterfaceId() != null) sb.append("VirtualInterfaceId: " + getVirtualInterfaceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteVirtualInterfaceRequest == false) return false;
        DeleteVirtualInterfaceRequest other = (DeleteVirtualInterfaceRequest)obj;
        
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null) return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false) return false; 
        return true;
    }
    
}
    
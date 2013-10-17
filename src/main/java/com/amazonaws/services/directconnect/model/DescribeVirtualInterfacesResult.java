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
 * A structure containing a list of virtual interfaces.
 * </p>
 */
public class DescribeVirtualInterfacesResult implements Serializable {

    /**
     * A list of virtual interfaces.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VirtualInterface> virtualInterfaces;

    /**
     * A list of virtual interfaces.
     *
     * @return A list of virtual interfaces.
     */
    public java.util.List<VirtualInterface> getVirtualInterfaces() {
        if (virtualInterfaces == null) {
              virtualInterfaces = new com.amazonaws.internal.ListWithAutoConstructFlag<VirtualInterface>();
              virtualInterfaces.setAutoConstruct(true);
        }
        return virtualInterfaces;
    }
    
    /**
     * A list of virtual interfaces.
     *
     * @param virtualInterfaces A list of virtual interfaces.
     */
    public void setVirtualInterfaces(java.util.Collection<VirtualInterface> virtualInterfaces) {
        if (virtualInterfaces == null) {
            this.virtualInterfaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VirtualInterface> virtualInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VirtualInterface>(virtualInterfaces.size());
        virtualInterfacesCopy.addAll(virtualInterfaces);
        this.virtualInterfaces = virtualInterfacesCopy;
    }
    
    /**
     * A list of virtual interfaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualInterfaces A list of virtual interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVirtualInterfacesResult withVirtualInterfaces(VirtualInterface... virtualInterfaces) {
        if (getVirtualInterfaces() == null) setVirtualInterfaces(new java.util.ArrayList<VirtualInterface>(virtualInterfaces.length));
        for (VirtualInterface value : virtualInterfaces) {
            getVirtualInterfaces().add(value);
        }
        return this;
    }
    
    /**
     * A list of virtual interfaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualInterfaces A list of virtual interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVirtualInterfacesResult withVirtualInterfaces(java.util.Collection<VirtualInterface> virtualInterfaces) {
        if (virtualInterfaces == null) {
            this.virtualInterfaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VirtualInterface> virtualInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VirtualInterface>(virtualInterfaces.size());
            virtualInterfacesCopy.addAll(virtualInterfaces);
            this.virtualInterfaces = virtualInterfacesCopy;
        }

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
        if (getVirtualInterfaces() != null) sb.append("VirtualInterfaces: " + getVirtualInterfaces() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVirtualInterfaces() == null) ? 0 : getVirtualInterfaces().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVirtualInterfacesResult == false) return false;
        DescribeVirtualInterfacesResult other = (DescribeVirtualInterfacesResult)obj;
        
        if (other.getVirtualInterfaces() == null ^ this.getVirtualInterfaces() == null) return false;
        if (other.getVirtualInterfaces() != null && other.getVirtualInterfaces().equals(this.getVirtualInterfaces()) == false) return false; 
        return true;
    }
    
}
    
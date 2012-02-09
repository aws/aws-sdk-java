/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Create Network Interface Result
 */
public class CreateNetworkInterfaceResult {

    private NetworkInterface networkInterface;

    /**
     * Returns the value of the NetworkInterface property for this object.
     *
     * @return The value of the NetworkInterface property for this object.
     */
    public NetworkInterface getNetworkInterface() {
        return networkInterface;
    }
    
    /**
     * Sets the value of the NetworkInterface property for this object.
     *
     * @param networkInterface The new value for the NetworkInterface property for this object.
     */
    public void setNetworkInterface(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
    }
    
    /**
     * Sets the value of the NetworkInterface property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterface The new value for the NetworkInterface property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateNetworkInterfaceResult withNetworkInterface(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
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
        if (networkInterface != null) sb.append("NetworkInterface: " + networkInterface + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterface() == null) ? 0 : getNetworkInterface().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateNetworkInterfaceResult == false) return false;
        CreateNetworkInterfaceResult other = (CreateNetworkInterfaceResult)obj;
        
        if (other.getNetworkInterface() == null ^ this.getNetworkInterface() == null) return false;
        if (other.getNetworkInterface() != null && other.getNetworkInterface().equals(this.getNetworkInterface()) == false) return false; 
        return true;
    }
    
}
    
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


/**
 * <p>
 * 
 * </p>
 */
public class CreateDhcpOptionsResult implements Serializable {

    /**
     * A set of one or more DHCP options.
     */
    private DhcpOptions dhcpOptions;

    /**
     * A set of one or more DHCP options.
     *
     * @return A set of one or more DHCP options.
     */
    public DhcpOptions getDhcpOptions() {
        return dhcpOptions;
    }
    
    /**
     * A set of one or more DHCP options.
     *
     * @param dhcpOptions A set of one or more DHCP options.
     */
    public void setDhcpOptions(DhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
    }
    
    /**
     * A set of one or more DHCP options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptions A set of one or more DHCP options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDhcpOptionsResult withDhcpOptions(DhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
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
        if (getDhcpOptions() != null) sb.append("DhcpOptions: " + getDhcpOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDhcpOptions() == null) ? 0 : getDhcpOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDhcpOptionsResult == false) return false;
        CreateDhcpOptionsResult other = (CreateDhcpOptionsResult)obj;
        
        if (other.getDhcpOptions() == null ^ this.getDhcpOptions() == null) return false;
        if (other.getDhcpOptions() != null && other.getDhcpOptions().equals(this.getDhcpOptions()) == false) return false; 
        return true;
    }
    
}
    
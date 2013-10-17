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
 * Describe Dhcp Options Result
 */
public class DescribeDhcpOptionsResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<DhcpOptions> dhcpOptions;

    /**
     * Returns the value of the DhcpOptions property for this object.
     *
     * @return The value of the DhcpOptions property for this object.
     */
    public java.util.List<DhcpOptions> getDhcpOptions() {
        if (dhcpOptions == null) {
              dhcpOptions = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpOptions>();
              dhcpOptions.setAutoConstruct(true);
        }
        return dhcpOptions;
    }
    
    /**
     * Sets the value of the DhcpOptions property for this object.
     *
     * @param dhcpOptions The new value for the DhcpOptions property for this object.
     */
    public void setDhcpOptions(java.util.Collection<DhcpOptions> dhcpOptions) {
        if (dhcpOptions == null) {
            this.dhcpOptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DhcpOptions> dhcpOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpOptions>(dhcpOptions.size());
        dhcpOptionsCopy.addAll(dhcpOptions);
        this.dhcpOptions = dhcpOptionsCopy;
    }
    
    /**
     * Sets the value of the DhcpOptions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptions The new value for the DhcpOptions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDhcpOptionsResult withDhcpOptions(DhcpOptions... dhcpOptions) {
        if (getDhcpOptions() == null) setDhcpOptions(new java.util.ArrayList<DhcpOptions>(dhcpOptions.length));
        for (DhcpOptions value : dhcpOptions) {
            getDhcpOptions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the DhcpOptions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptions The new value for the DhcpOptions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDhcpOptionsResult withDhcpOptions(java.util.Collection<DhcpOptions> dhcpOptions) {
        if (dhcpOptions == null) {
            this.dhcpOptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DhcpOptions> dhcpOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpOptions>(dhcpOptions.size());
            dhcpOptionsCopy.addAll(dhcpOptions);
            this.dhcpOptions = dhcpOptionsCopy;
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

        if (obj instanceof DescribeDhcpOptionsResult == false) return false;
        DescribeDhcpOptionsResult other = (DescribeDhcpOptionsResult)obj;
        
        if (other.getDhcpOptions() == null ^ this.getDhcpOptions() == null) return false;
        if (other.getDhcpOptions() != null && other.getDhcpOptions().equals(this.getDhcpOptions()) == false) return false; 
        return true;
    }
    
}
    
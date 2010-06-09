/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * The DhcpOptions data type.
 * </p>
 */
public class DhcpOptions {

    /**
     * Specifies the ID of the set of DHCP options.
     */
    private String dhcpOptionsId;

    /**
     * Contains information about the set of DHCP options.
     */
    private java.util.List<DhcpConfiguration> dhcpConfigurations;

    /**
     * Specifies the ID of the set of DHCP options.
     *
     * @return Specifies the ID of the set of DHCP options.
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }
    
    /**
     * Specifies the ID of the set of DHCP options.
     *
     * @param dhcpOptionsId Specifies the ID of the set of DHCP options.
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }
    
    /**
     * Specifies the ID of the set of DHCP options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsId Specifies the ID of the set of DHCP options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DhcpOptions withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }
    
    
    /**
     * Contains information about the set of DHCP options.
     *
     * @return Contains information about the set of DHCP options.
     */
    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        if (dhcpConfigurations == null) {
            dhcpConfigurations = new java.util.ArrayList<DhcpConfiguration>();
        }
        return dhcpConfigurations;
    }
    
    /**
     * Contains information about the set of DHCP options.
     *
     * @param dhcpConfigurations Contains information about the set of DHCP options.
     */
    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        java.util.List<DhcpConfiguration> dhcpConfigurationsCopy = new java.util.ArrayList<DhcpConfiguration>();
        if (dhcpConfigurations != null) {
            dhcpConfigurationsCopy.addAll(dhcpConfigurations);
        }
        this.dhcpConfigurations = dhcpConfigurationsCopy;
    }
    
    /**
     * Contains information about the set of DHCP options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations Contains information about the set of DHCP options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DhcpOptions withDhcpConfigurations(DhcpConfiguration... dhcpConfigurations) {
        for (DhcpConfiguration value : dhcpConfigurations) {
            getDhcpConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * Contains information about the set of DHCP options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations Contains information about the set of DHCP options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DhcpOptions withDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        java.util.List<DhcpConfiguration> dhcpConfigurationsCopy = new java.util.ArrayList<DhcpConfiguration>();
        if (dhcpConfigurations != null) {
            dhcpConfigurationsCopy.addAll(dhcpConfigurations);
        }
        this.dhcpConfigurations = dhcpConfigurationsCopy;

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
        
        sb.append("DhcpOptionsId: " + dhcpOptionsId + ", ");
        sb.append("DhcpConfigurations: " + dhcpConfigurations + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
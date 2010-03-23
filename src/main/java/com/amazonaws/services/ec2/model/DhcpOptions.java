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
 * Dhcp Options
 */
public class DhcpOptions {
        
    private String dhcpOptionsId;

    private java.util.List<DhcpConfiguration> dhcpConfigurations;

    /**
     * Returns the value of the DhcpOptionsId property for this object.
     *
     * @return The value of the DhcpOptionsId property for this object.
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }
    
    /**
     * Sets the value of the DhcpOptionsId property for this object.
     *
     * @param dhcpOptionsId The new value for the DhcpOptionsId property for this object.
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }
    
    /**
     * Sets the value of the DhcpOptionsId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsId The new value for the DhcpOptionsId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DhcpOptions withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }
    
    
    /**
     * Returns the value of the DhcpConfigurations property for this object.
     *
     * @return The value of the DhcpConfigurations property for this object.
     */
    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        if (dhcpConfigurations == null) {
            dhcpConfigurations = new java.util.ArrayList<DhcpConfiguration>();
        }
        return dhcpConfigurations;
    }
    
    /**
     * Sets the value of the DhcpConfigurations property for this object.
     *
     * @param dhcpConfigurations The new value for the DhcpConfigurations property for this object.
     */
    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        java.util.List<DhcpConfiguration> dhcpConfigurationsCopy = new java.util.ArrayList<DhcpConfiguration>();
        if (dhcpConfigurations != null) {
            dhcpConfigurationsCopy.addAll(dhcpConfigurations);
        }
        this.dhcpConfigurations = dhcpConfigurationsCopy;
    }
    
    /**
     * Sets the value of the DhcpConfigurations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations The new value for the DhcpConfigurations property for this object.
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
     * Sets the value of the DhcpConfigurations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations The new value for the DhcpConfigurations property for this object.
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
    
}
    
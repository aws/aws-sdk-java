/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createDhcpOptions(CreateDhcpOptionsRequest) CreateDhcpOptions operation}.
 * <p>
 * Creates a set of DHCP options that you can then associate with one or
 * more VPCs, causing all existing and new instances that you launch in
 * those VPCs to use the set of DHCP options. The following table lists
 * the individual DHCP options you can specify. For more information
 * about the options, go to <a
 * href="http://www.ietf.org/rfc/rfc2132.txt">
 * http://www.ietf.org/rfc/rfc2132.txt </a>
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createDhcpOptions(CreateDhcpOptionsRequest)
 */
public class CreateDhcpOptionsRequest extends AmazonWebServiceRequest {

    /**
     * A set of one or more DHCP configurations.
     */
    private java.util.List<DhcpConfiguration> dhcpConfigurations;

    /**
     * Default constructor for a new CreateDhcpOptionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDhcpOptionsRequest() {}
    
    /**
     * Constructs a new CreateDhcpOptionsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dhcpConfigurations A set of one or more DHCP configurations.
     */
    public CreateDhcpOptionsRequest(java.util.List<DhcpConfiguration> dhcpConfigurations) {
        this.dhcpConfigurations = dhcpConfigurations;
    }
    
    /**
     * A set of one or more DHCP configurations.
     *
     * @return A set of one or more DHCP configurations.
     */
    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        if (dhcpConfigurations == null) {
            dhcpConfigurations = new java.util.ArrayList<DhcpConfiguration>();
        }
        return dhcpConfigurations;
    }
    
    /**
     * A set of one or more DHCP configurations.
     *
     * @param dhcpConfigurations A set of one or more DHCP configurations.
     */
    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        java.util.List<DhcpConfiguration> dhcpConfigurationsCopy = new java.util.ArrayList<DhcpConfiguration>();
        if (dhcpConfigurations != null) {
            dhcpConfigurationsCopy.addAll(dhcpConfigurations);
        }
        this.dhcpConfigurations = dhcpConfigurationsCopy;
    }
    
    /**
     * A set of one or more DHCP configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations A set of one or more DHCP configurations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDhcpOptionsRequest withDhcpConfigurations(DhcpConfiguration... dhcpConfigurations) {
        for (DhcpConfiguration value : dhcpConfigurations) {
            getDhcpConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * A set of one or more DHCP configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations A set of one or more DHCP configurations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDhcpOptionsRequest withDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
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
        sb.append("DhcpConfigurations: " + dhcpConfigurations + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
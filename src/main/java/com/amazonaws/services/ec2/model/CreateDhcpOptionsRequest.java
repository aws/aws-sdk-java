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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createDhcpOptions(CreateDhcpOptionsRequest) CreateDhcpOptions operation}.
 * <p>
 * Creates a set of DHCP options that you can then associate with one or
 * more VPCs, causing all existing and new instances that you launch in
 * those VPCs to use the set of DHCP options. The following table lists
 * the individual DHCP options you can specify. For more information
 * about the options, go to http://www.ietf.org/rfc/rfc2132.txt
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createDhcpOptions(CreateDhcpOptionsRequest)
 */
public class CreateDhcpOptionsRequest extends AmazonWebServiceRequest {

    /**
     * A set of one or more DHCP configurations.
     */
    private DhcpConfiguration dhcpConfiguration;

    /**
     * A set of one or more DHCP configurations.
     *
     * @return A set of one or more DHCP configurations.
     */
    public DhcpConfiguration getDhcpConfiguration() {
        return dhcpConfiguration;
    }
    
    /**
     * A set of one or more DHCP configurations.
     *
     * @param dhcpConfiguration A set of one or more DHCP configurations.
     */
    public void setDhcpConfiguration(DhcpConfiguration dhcpConfiguration) {
        this.dhcpConfiguration = dhcpConfiguration;
    }
    
    /**
     * A set of one or more DHCP configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfiguration A set of one or more DHCP configurations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDhcpOptionsRequest withDhcpConfiguration(DhcpConfiguration dhcpConfiguration) {
        this.dhcpConfiguration = dhcpConfiguration;
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
        sb.append("DhcpConfiguration: " + dhcpConfiguration + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
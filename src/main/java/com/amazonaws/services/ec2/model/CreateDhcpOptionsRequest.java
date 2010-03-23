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
 * Create Dhcp Options Request
 */
public class CreateDhcpOptionsRequest extends AmazonWebServiceRequest {
        
    private DhcpConfiguration dhcpConfiguration;

    /**
     * Returns the value of the DhcpConfiguration property for this object.
     *
     * @return The value of the DhcpConfiguration property for this object.
     */
    public DhcpConfiguration getDhcpConfiguration() {
        return dhcpConfiguration;
    }
    
    /**
     * Sets the value of the DhcpConfiguration property for this object.
     *
     * @param dhcpConfiguration The new value for the DhcpConfiguration property for this object.
     */
    public void setDhcpConfiguration(DhcpConfiguration dhcpConfiguration) {
        this.dhcpConfiguration = dhcpConfiguration;
    }
    
    /**
     * Sets the value of the DhcpConfiguration property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfiguration The new value for the DhcpConfiguration property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDhcpOptionsRequest withDhcpConfiguration(DhcpConfiguration dhcpConfiguration) {
        this.dhcpConfiguration = dhcpConfiguration;
        return this;
    }
    
    
}
    
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
 * Describe Dhcp Options Request
 */
public class DescribeDhcpOptionsRequest extends AmazonWebServiceRequest {

    private java.util.List<String> dhcpOptionsIds;

    /**
     * Returns the value of the DhcpOptionsIds property for this object.
     *
     * @return The value of the DhcpOptionsIds property for this object.
     */
    public java.util.List<String> getDhcpOptionsIds() {
        if (dhcpOptionsIds == null) {
            dhcpOptionsIds = new java.util.ArrayList<String>();
        }
        return dhcpOptionsIds;
    }
    
    /**
     * Sets the value of the DhcpOptionsIds property for this object.
     *
     * @param dhcpOptionsIds The new value for the DhcpOptionsIds property for this object.
     */
    public void setDhcpOptionsIds(java.util.Collection<String> dhcpOptionsIds) {
        java.util.List<String> dhcpOptionsIdsCopy = new java.util.ArrayList<String>();
        if (dhcpOptionsIds != null) {
            dhcpOptionsIdsCopy.addAll(dhcpOptionsIds);
        }
        this.dhcpOptionsIds = dhcpOptionsIdsCopy;
    }
    
    /**
     * Sets the value of the DhcpOptionsIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsIds The new value for the DhcpOptionsIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDhcpOptionsRequest withDhcpOptionsIds(String... dhcpOptionsIds) {
        for (String value : dhcpOptionsIds) {
            getDhcpOptionsIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the DhcpOptionsIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsIds The new value for the DhcpOptionsIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDhcpOptionsRequest withDhcpOptionsIds(java.util.Collection<String> dhcpOptionsIds) {
        java.util.List<String> dhcpOptionsIdsCopy = new java.util.ArrayList<String>();
        if (dhcpOptionsIds != null) {
            dhcpOptionsIdsCopy.addAll(dhcpOptionsIds);
        }
        this.dhcpOptionsIds = dhcpOptionsIdsCopy;

        return this;
    }
    
}
    
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
 * Describe Vpn Gateways Request
 */
public class DescribeVpnGatewaysRequest extends AmazonWebServiceRequest {
        
    private java.util.List<String> vpnGatewayIds;

    private java.util.List<Filter> filters;

    /**
     * Returns the value of the VpnGatewayIds property for this object.
     *
     * @return The value of the VpnGatewayIds property for this object.
     */
    public java.util.List<String> getVpnGatewayIds() {
        if (vpnGatewayIds == null) {
            vpnGatewayIds = new java.util.ArrayList<String>();
        }
        return vpnGatewayIds;
    }
    
    /**
     * Sets the value of the VpnGatewayIds property for this object.
     *
     * @param vpnGatewayIds The new value for the VpnGatewayIds property for this object.
     */
    public void setVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        java.util.List<String> vpnGatewayIdsCopy = new java.util.ArrayList<String>();
        if (vpnGatewayIds != null) {
            vpnGatewayIdsCopy.addAll(vpnGatewayIds);
        }
        this.vpnGatewayIds = vpnGatewayIdsCopy;
    }
    
    /**
     * Sets the value of the VpnGatewayIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayIds The new value for the VpnGatewayIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysRequest withVpnGatewayIds(String... vpnGatewayIds) {
        for (String value : vpnGatewayIds) {
            getVpnGatewayIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VpnGatewayIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayIds The new value for the VpnGatewayIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysRequest withVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        java.util.List<String> vpnGatewayIdsCopy = new java.util.ArrayList<String>();
        if (vpnGatewayIds != null) {
            vpnGatewayIdsCopy.addAll(vpnGatewayIds);
        }
        this.vpnGatewayIds = vpnGatewayIdsCopy;

        return this;
    }
    
    /**
     * Returns the value of the Filters property for this object.
     *
     * @return The value of the Filters property for this object.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     *
     * @param filters The new value for the Filters property for this object.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysRequest withFilters(Filter... filters) {
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;

        return this;
    }
    
}
    
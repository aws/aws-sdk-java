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
 * <p>
 * 
 * </p>
 */
public class DescribeVpnGatewaysRequest extends AmazonWebServiceRequest {

    /**
     * A set of one or more VPN Gateway IDs.
     */
    private java.util.List<String> vpnGatewayIds;

    /**
     * 
     */
    private java.util.List<Filter> filters;

    /**
     * A set of one or more VPN Gateway IDs.
     *
     * @return A set of one or more VPN Gateway IDs.
     */
    public java.util.List<String> getVpnGatewayIds() {
        if (vpnGatewayIds == null) {
            vpnGatewayIds = new java.util.ArrayList<String>();
        }
        return vpnGatewayIds;
    }
    
    /**
     * A set of one or more VPN Gateway IDs.
     *
     * @param vpnGatewayIds A set of one or more VPN Gateway IDs.
     */
    public void setVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        java.util.List<String> vpnGatewayIdsCopy = new java.util.ArrayList<String>();
        if (vpnGatewayIds != null) {
            vpnGatewayIdsCopy.addAll(vpnGatewayIds);
        }
        this.vpnGatewayIds = vpnGatewayIdsCopy;
    }
    
    /**
     * A set of one or more VPN Gateway IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayIds A set of one or more VPN Gateway IDs.
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
     * A set of one or more VPN Gateway IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayIds A set of one or more VPN Gateway IDs.
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
     * 
     *
     * @return 
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * 
     *
     * @param filters 
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters 
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
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters 
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("VpnGatewayIds: " + vpnGatewayIds + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
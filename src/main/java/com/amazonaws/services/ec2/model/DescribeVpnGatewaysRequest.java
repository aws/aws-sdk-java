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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpnGateways(DescribeVpnGatewaysRequest) DescribeVpnGateways operation}.
 * <p>
 * Gives you information about your VPN gateways. You can filter the
 * results to return information only about VPN gateways that match
 * criteria you specify. For example, you could ask to get information
 * about a particular VPN gateway (or all) only if the gateway's state is
 * pending or available. You can specify multiple filters (e.g., the VPN
 * gateway is in a particular Availability Zone and the gateway's state
 * is pending or available). The result includes information for a
 * particular VPN gateway only if the gateway matches all your filters.
 * If there's no match, no special message is returned; the response is
 * simply empty. The following table shows the available filters.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpnGateways(DescribeVpnGatewaysRequest)
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
        
        sb.append("VpnGatewayIds: " + vpnGatewayIds + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    
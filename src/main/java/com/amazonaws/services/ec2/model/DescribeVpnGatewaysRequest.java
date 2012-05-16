/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Gives you information about your VPN gateways. You can filter the results to return information only about VPN gateways that match criteria you
 * specify.
 * </p>
 * <p>
 * For example, you could ask to get information about a particular VPN gateway (or all) only if the gateway's state is pending or available. You can
 * specify multiple filters (e.g., the VPN gateway is in a particular Availability Zone and the gateway's state is pending or available).
 * </p>
 * <p>
 * The result includes information for a particular VPN gateway only if the gateway matches all your filters. If there's no match, no special message is
 * returned; the response is simply empty. The following table shows the available filters.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpnGateways(DescribeVpnGatewaysRequest)
 */
public class DescribeVpnGatewaysRequest extends AmazonWebServiceRequest {

    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<String> vpnGatewayIds;

    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for VPN Gateways. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<String> getVpnGatewayIds() {
        
        if (vpnGatewayIds == null) {
            vpnGatewayIds = new java.util.ArrayList<String>();
        }
        return vpnGatewayIds;
    }
    
    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param vpnGatewayIds A list of filters used to match properties for VPN Gateways. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        if (vpnGatewayIds == null) {
            this.vpnGatewayIds = null;
            return;
        }

        java.util.List<String> vpnGatewayIdsCopy = new java.util.ArrayList<String>(vpnGatewayIds.size());
        vpnGatewayIdsCopy.addAll(vpnGatewayIds);
        this.vpnGatewayIds = vpnGatewayIdsCopy;
    }
    
    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayIds A list of filters used to match properties for VPN Gateways. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysRequest withVpnGatewayIds(String... vpnGatewayIds) {
        if (getVpnGatewayIds() == null) setVpnGatewayIds(new java.util.ArrayList<String>(vpnGatewayIds.length));
        for (String value : vpnGatewayIds) {
            getVpnGatewayIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayIds A list of filters used to match properties for VPN Gateways. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysRequest withVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        if (vpnGatewayIds == null) {
            this.vpnGatewayIds = null;
        } else {
            java.util.List<String> vpnGatewayIdsCopy = new java.util.ArrayList<String>(vpnGatewayIds.size());
            vpnGatewayIdsCopy.addAll(vpnGatewayIds);
            this.vpnGatewayIds = vpnGatewayIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for VPN Gateways. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for VPN Gateways. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for VPN Gateways. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for VPN Gateways. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for VPN Gateways. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
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
        if (vpnGatewayIds != null) sb.append("VpnGatewayIds: " + vpnGatewayIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnGatewayIds() == null) ? 0 : getVpnGatewayIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeVpnGatewaysRequest == false) return false;
        DescribeVpnGatewaysRequest other = (DescribeVpnGatewaysRequest)obj;
        
        if (other.getVpnGatewayIds() == null ^ this.getVpnGatewayIds() == null) return false;
        if (other.getVpnGatewayIds() != null && other.getVpnGatewayIds().equals(this.getVpnGatewayIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    
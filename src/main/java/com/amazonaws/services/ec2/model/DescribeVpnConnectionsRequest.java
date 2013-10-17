/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVpnConnectionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpnConnections(DescribeVpnConnectionsRequest) DescribeVpnConnections operation}.
 * <p>
 * Gives you information about your VPN connections.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> We strongly recommend you use HTTPS when calling this operation because the response contains sensitive cryptographic information
 * for configuring your customer gateway. You can filter the results to return information only about VPN connections that match criteria you specify.
 * For example, you could ask to get information about a particular VPN connection (or all) only if the VPN's state is pending or available. You can
 * specify multiple filters (e.g., the VPN connection is associated with a particular VPN gateway, and the gateway's state is pending or available). The
 * result includes information for a particular VPN connection only if the VPN connection matches all your filters. If there's no match, no special
 * message is returned; the response is simply empty. The following table shows the available filters.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpnConnections(DescribeVpnConnectionsRequest)
 */
public class DescribeVpnConnectionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeVpnConnectionsRequest> {

    /**
     * A VPN connection ID. More than one may be specified per request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpnConnectionIds;

    /**
     * A list of filters used to match properties for VPN Connections. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * A VPN connection ID. More than one may be specified per request.
     *
     * @return A VPN connection ID. More than one may be specified per request.
     */
    public java.util.List<String> getVpnConnectionIds() {
        if (vpnConnectionIds == null) {
              vpnConnectionIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpnConnectionIds.setAutoConstruct(true);
        }
        return vpnConnectionIds;
    }
    
    /**
     * A VPN connection ID. More than one may be specified per request.
     *
     * @param vpnConnectionIds A VPN connection ID. More than one may be specified per request.
     */
    public void setVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        if (vpnConnectionIds == null) {
            this.vpnConnectionIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpnConnectionIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpnConnectionIds.size());
        vpnConnectionIdsCopy.addAll(vpnConnectionIds);
        this.vpnConnectionIds = vpnConnectionIdsCopy;
    }
    
    /**
     * A VPN connection ID. More than one may be specified per request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds A VPN connection ID. More than one may be specified per request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVpnConnectionsRequest withVpnConnectionIds(String... vpnConnectionIds) {
        if (getVpnConnectionIds() == null) setVpnConnectionIds(new java.util.ArrayList<String>(vpnConnectionIds.length));
        for (String value : vpnConnectionIds) {
            getVpnConnectionIds().add(value);
        }
        return this;
    }
    
    /**
     * A VPN connection ID. More than one may be specified per request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds A VPN connection ID. More than one may be specified per request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVpnConnectionsRequest withVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        if (vpnConnectionIds == null) {
            this.vpnConnectionIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpnConnectionIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpnConnectionIds.size());
            vpnConnectionIdsCopy.addAll(vpnConnectionIds);
            this.vpnConnectionIds = vpnConnectionIdsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for VPN Connections. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for VPN Connections. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for VPN Connections. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for VPN Connections. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for VPN Connections. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for VPN Connections. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVpnConnectionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for VPN Connections. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for VPN Connections. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVpnConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeVpnConnectionsRequest> getDryRunRequest() {
        Request<DescribeVpnConnectionsRequest> request = new DescribeVpnConnectionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVpnConnectionIds() != null) sb.append("VpnConnectionIds: " + getVpnConnectionIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnConnectionIds() == null) ? 0 : getVpnConnectionIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpnConnectionsRequest == false) return false;
        DescribeVpnConnectionsRequest other = (DescribeVpnConnectionsRequest)obj;
        
        if (other.getVpnConnectionIds() == null ^ this.getVpnConnectionIds() == null) return false;
        if (other.getVpnConnectionIds() != null && other.getVpnConnectionIds().equals(this.getVpnConnectionIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    
/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeVpnGatewaysRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpnGateways(DescribeVpnGatewaysRequest) DescribeVpnGateways operation}.
 * <p>
 * Describes one or more of your virtual private gateways.
 * </p>
 * <p>
 * For more information about virtual private gateways, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding an IPsec Hardware VPN to Your VPC </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpnGateways(DescribeVpnGatewaysRequest)
 */
public class DescribeVpnGatewaysRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeVpnGatewaysRequest> {

    /**
     * One or more virtual private gateway IDs. <p>Default: Describes all
     * your virtual private gateways.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpnGatewayIds;

    /**
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>availability-zone</code> - The Availability Zone for the
     * virtual private gateway. </li> <li> <p><code>state</code> - The state
     * of the virtual private gateway (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>type</code> - The type of virtual private
     * gateway. Currently the only supported type is <code>ipsec.1</code>.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of the virtual
     * private gateway. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more virtual private gateway IDs. <p>Default: Describes all
     * your virtual private gateways.
     *
     * @return One or more virtual private gateway IDs. <p>Default: Describes all
     *         your virtual private gateways.
     */
    public java.util.List<String> getVpnGatewayIds() {
        if (vpnGatewayIds == null) {
              vpnGatewayIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpnGatewayIds.setAutoConstruct(true);
        }
        return vpnGatewayIds;
    }
    
    /**
     * One or more virtual private gateway IDs. <p>Default: Describes all
     * your virtual private gateways.
     *
     * @param vpnGatewayIds One or more virtual private gateway IDs. <p>Default: Describes all
     *         your virtual private gateways.
     */
    public void setVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        if (vpnGatewayIds == null) {
            this.vpnGatewayIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpnGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpnGatewayIds.size());
        vpnGatewayIdsCopy.addAll(vpnGatewayIds);
        this.vpnGatewayIds = vpnGatewayIdsCopy;
    }
    
    /**
     * One or more virtual private gateway IDs. <p>Default: Describes all
     * your virtual private gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayIds One or more virtual private gateway IDs. <p>Default: Describes all
     *         your virtual private gateways.
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
     * One or more virtual private gateway IDs. <p>Default: Describes all
     * your virtual private gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayIds One or more virtual private gateway IDs. <p>Default: Describes all
     *         your virtual private gateways.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpnGatewaysRequest withVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        if (vpnGatewayIds == null) {
            this.vpnGatewayIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpnGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpnGatewayIds.size());
            vpnGatewayIdsCopy.addAll(vpnGatewayIds);
            this.vpnGatewayIds = vpnGatewayIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>availability-zone</code> - The Availability Zone for the
     * virtual private gateway. </li> <li> <p><code>state</code> - The state
     * of the virtual private gateway (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>type</code> - The type of virtual private
     * gateway. Currently the only supported type is <code>ipsec.1</code>.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of the virtual
     * private gateway. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     *         current state of the attachment between the gateway and the VPC
     *         (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     *         <li> <p><code>availability-zone</code> - The Availability Zone for the
     *         virtual private gateway. </li> <li> <p><code>state</code> - The state
     *         of the virtual private gateway (<code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>type</code> - The type of virtual private
     *         gateway. Currently the only supported type is <code>ipsec.1</code>.
     *         </li> <li> <p><code>vpn-gateway-id</code> - The ID of the virtual
     *         private gateway. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>availability-zone</code> - The Availability Zone for the
     * virtual private gateway. </li> <li> <p><code>state</code> - The state
     * of the virtual private gateway (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>type</code> - The type of virtual private
     * gateway. Currently the only supported type is <code>ipsec.1</code>.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of the virtual
     * private gateway. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     *         current state of the attachment between the gateway and the VPC
     *         (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     *         <li> <p><code>availability-zone</code> - The Availability Zone for the
     *         virtual private gateway. </li> <li> <p><code>state</code> - The state
     *         of the virtual private gateway (<code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>type</code> - The type of virtual private
     *         gateway. Currently the only supported type is <code>ipsec.1</code>.
     *         </li> <li> <p><code>vpn-gateway-id</code> - The ID of the virtual
     *         private gateway. </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>availability-zone</code> - The Availability Zone for the
     * virtual private gateway. </li> <li> <p><code>state</code> - The state
     * of the virtual private gateway (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>type</code> - The type of virtual private
     * gateway. Currently the only supported type is <code>ipsec.1</code>.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of the virtual
     * private gateway. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     *         current state of the attachment between the gateway and the VPC
     *         (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     *         <li> <p><code>availability-zone</code> - The Availability Zone for the
     *         virtual private gateway. </li> <li> <p><code>state</code> - The state
     *         of the virtual private gateway (<code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>type</code> - The type of virtual private
     *         gateway. Currently the only supported type is <code>ipsec.1</code>.
     *         </li> <li> <p><code>vpn-gateway-id</code> - The ID of the virtual
     *         private gateway. </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC
     * (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>availability-zone</code> - The Availability Zone for the
     * virtual private gateway. </li> <li> <p><code>state</code> - The state
     * of the virtual private gateway (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>type</code> - The type of virtual private
     * gateway. Currently the only supported type is <code>ipsec.1</code>.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of the virtual
     * private gateway. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     *         current state of the attachment between the gateway and the VPC
     *         (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     *         <li> <p><code>availability-zone</code> - The Availability Zone for the
     *         virtual private gateway. </li> <li> <p><code>state</code> - The state
     *         of the virtual private gateway (<code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>type</code> - The type of virtual private
     *         gateway. Currently the only supported type is <code>ipsec.1</code>.
     *         </li> <li> <p><code>vpn-gateway-id</code> - The ID of the virtual
     *         private gateway. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpnGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeVpnGatewaysRequest> getDryRunRequest() {
        Request<DescribeVpnGatewaysRequest> request = new DescribeVpnGatewaysRequestMarshaller().marshall(this);
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
        if (getVpnGatewayIds() != null) sb.append("VpnGatewayIds: " + getVpnGatewayIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
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
    
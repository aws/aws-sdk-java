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
import com.amazonaws.services.ec2.model.transform.DescribeVpnConnectionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpnConnections(DescribeVpnConnectionsRequest) DescribeVpnConnections operation}.
 * <p>
 * Describes one or more of your VPN connections.
 * </p>
 * <p>
 * For more information about VPN connections, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpnConnections(DescribeVpnConnectionsRequest)
 */
public class DescribeVpnConnectionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeVpnConnectionsRequest> {

    /**
     * One or more VPN connection IDs. <p>Default: Describes your VPN
     * connections.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpnConnectionIds;

    /**
     * One or more filters. <ul> <li>
     * <p><code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway. </li> <li>
     * <p><code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection. </li> <li> <p><code>state</code> -
     * The state of the VPN connection (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>option.static-routes-only</code> - Indicates whether the
     * connection has static routes only. Used for devices that do not
     * support Border Gateway Protocol (BGP). </li> <li>
     * <p><code>route.destination-cidr-block</code> - The destination CIDR
     * block. This corresponds to the subnet used in a customer data center.
     * </li> <li> <p><code>bgp-asn</code> - The BGP Autonomous System Number
     * (ASN) associated with a BGP device. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of VPN connection.
     * Currently the only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>vpn-connection-id</code> - The ID of the VPN connection.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of a virtual
     * private gateway associated with the VPN connection. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more VPN connection IDs. <p>Default: Describes your VPN
     * connections.
     *
     * @return One or more VPN connection IDs. <p>Default: Describes your VPN
     *         connections.
     */
    public java.util.List<String> getVpnConnectionIds() {
        if (vpnConnectionIds == null) {
              vpnConnectionIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpnConnectionIds.setAutoConstruct(true);
        }
        return vpnConnectionIds;
    }
    
    /**
     * One or more VPN connection IDs. <p>Default: Describes your VPN
     * connections.
     *
     * @param vpnConnectionIds One or more VPN connection IDs. <p>Default: Describes your VPN
     *         connections.
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
     * One or more VPN connection IDs. <p>Default: Describes your VPN
     * connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds One or more VPN connection IDs. <p>Default: Describes your VPN
     *         connections.
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
     * One or more VPN connection IDs. <p>Default: Describes your VPN
     * connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds One or more VPN connection IDs. <p>Default: Describes your VPN
     *         connections.
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
     * One or more filters. <ul> <li>
     * <p><code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway. </li> <li>
     * <p><code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection. </li> <li> <p><code>state</code> -
     * The state of the VPN connection (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>option.static-routes-only</code> - Indicates whether the
     * connection has static routes only. Used for devices that do not
     * support Border Gateway Protocol (BGP). </li> <li>
     * <p><code>route.destination-cidr-block</code> - The destination CIDR
     * block. This corresponds to the subnet used in a customer data center.
     * </li> <li> <p><code>bgp-asn</code> - The BGP Autonomous System Number
     * (ASN) associated with a BGP device. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of VPN connection.
     * Currently the only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>vpn-connection-id</code> - The ID of the VPN connection.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of a virtual
     * private gateway associated with the VPN connection. </li> </ul>
     *
     * @return One or more filters. <ul> <li>
     *         <p><code>customer-gateway-configuration</code> - The configuration
     *         information for the customer gateway. </li> <li>
     *         <p><code>customer-gateway-id</code> - The ID of a customer gateway
     *         associated with the VPN connection. </li> <li> <p><code>state</code> -
     *         The state of the VPN connection (<code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li>
     *         <p><code>option.static-routes-only</code> - Indicates whether the
     *         connection has static routes only. Used for devices that do not
     *         support Border Gateway Protocol (BGP). </li> <li>
     *         <p><code>route.destination-cidr-block</code> - The destination CIDR
     *         block. This corresponds to the subnet used in a customer data center.
     *         </li> <li> <p><code>bgp-asn</code> - The BGP Autonomous System Number
     *         (ASN) associated with a BGP device. </li> <li>
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
     *         filter. </li> <li> <p><code>type</code> - The type of VPN connection.
     *         Currently the only supported type is <code>ipsec.1</code>. </li> <li>
     *         <p><code>vpn-connection-id</code> - The ID of the VPN connection.
     *         </li> <li> <p><code>vpn-gateway-id</code> - The ID of a virtual
     *         private gateway associated with the VPN connection. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li>
     * <p><code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway. </li> <li>
     * <p><code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection. </li> <li> <p><code>state</code> -
     * The state of the VPN connection (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>option.static-routes-only</code> - Indicates whether the
     * connection has static routes only. Used for devices that do not
     * support Border Gateway Protocol (BGP). </li> <li>
     * <p><code>route.destination-cidr-block</code> - The destination CIDR
     * block. This corresponds to the subnet used in a customer data center.
     * </li> <li> <p><code>bgp-asn</code> - The BGP Autonomous System Number
     * (ASN) associated with a BGP device. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of VPN connection.
     * Currently the only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>vpn-connection-id</code> - The ID of the VPN connection.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of a virtual
     * private gateway associated with the VPN connection. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>customer-gateway-configuration</code> - The configuration
     *         information for the customer gateway. </li> <li>
     *         <p><code>customer-gateway-id</code> - The ID of a customer gateway
     *         associated with the VPN connection. </li> <li> <p><code>state</code> -
     *         The state of the VPN connection (<code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li>
     *         <p><code>option.static-routes-only</code> - Indicates whether the
     *         connection has static routes only. Used for devices that do not
     *         support Border Gateway Protocol (BGP). </li> <li>
     *         <p><code>route.destination-cidr-block</code> - The destination CIDR
     *         block. This corresponds to the subnet used in a customer data center.
     *         </li> <li> <p><code>bgp-asn</code> - The BGP Autonomous System Number
     *         (ASN) associated with a BGP device. </li> <li>
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
     *         filter. </li> <li> <p><code>type</code> - The type of VPN connection.
     *         Currently the only supported type is <code>ipsec.1</code>. </li> <li>
     *         <p><code>vpn-connection-id</code> - The ID of the VPN connection.
     *         </li> <li> <p><code>vpn-gateway-id</code> - The ID of a virtual
     *         private gateway associated with the VPN connection. </li> </ul>
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
     * One or more filters. <ul> <li>
     * <p><code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway. </li> <li>
     * <p><code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection. </li> <li> <p><code>state</code> -
     * The state of the VPN connection (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>option.static-routes-only</code> - Indicates whether the
     * connection has static routes only. Used for devices that do not
     * support Border Gateway Protocol (BGP). </li> <li>
     * <p><code>route.destination-cidr-block</code> - The destination CIDR
     * block. This corresponds to the subnet used in a customer data center.
     * </li> <li> <p><code>bgp-asn</code> - The BGP Autonomous System Number
     * (ASN) associated with a BGP device. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of VPN connection.
     * Currently the only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>vpn-connection-id</code> - The ID of the VPN connection.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of a virtual
     * private gateway associated with the VPN connection. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>customer-gateway-configuration</code> - The configuration
     *         information for the customer gateway. </li> <li>
     *         <p><code>customer-gateway-id</code> - The ID of a customer gateway
     *         associated with the VPN connection. </li> <li> <p><code>state</code> -
     *         The state of the VPN connection (<code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li>
     *         <p><code>option.static-routes-only</code> - Indicates whether the
     *         connection has static routes only. Used for devices that do not
     *         support Border Gateway Protocol (BGP). </li> <li>
     *         <p><code>route.destination-cidr-block</code> - The destination CIDR
     *         block. This corresponds to the subnet used in a customer data center.
     *         </li> <li> <p><code>bgp-asn</code> - The BGP Autonomous System Number
     *         (ASN) associated with a BGP device. </li> <li>
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
     *         filter. </li> <li> <p><code>type</code> - The type of VPN connection.
     *         Currently the only supported type is <code>ipsec.1</code>. </li> <li>
     *         <p><code>vpn-connection-id</code> - The ID of the VPN connection.
     *         </li> <li> <p><code>vpn-gateway-id</code> - The ID of a virtual
     *         private gateway associated with the VPN connection. </li> </ul>
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
     * One or more filters. <ul> <li>
     * <p><code>customer-gateway-configuration</code> - The configuration
     * information for the customer gateway. </li> <li>
     * <p><code>customer-gateway-id</code> - The ID of a customer gateway
     * associated with the VPN connection. </li> <li> <p><code>state</code> -
     * The state of the VPN connection (<code>pending</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li>
     * <p><code>option.static-routes-only</code> - Indicates whether the
     * connection has static routes only. Used for devices that do not
     * support Border Gateway Protocol (BGP). </li> <li>
     * <p><code>route.destination-cidr-block</code> - The destination CIDR
     * block. This corresponds to the subnet used in a customer data center.
     * </li> <li> <p><code>bgp-asn</code> - The BGP Autonomous System Number
     * (ASN) associated with a BGP device. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of VPN connection.
     * Currently the only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>vpn-connection-id</code> - The ID of the VPN connection.
     * </li> <li> <p><code>vpn-gateway-id</code> - The ID of a virtual
     * private gateway associated with the VPN connection. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>customer-gateway-configuration</code> - The configuration
     *         information for the customer gateway. </li> <li>
     *         <p><code>customer-gateway-id</code> - The ID of a customer gateway
     *         associated with the VPN connection. </li> <li> <p><code>state</code> -
     *         The state of the VPN connection (<code>pending</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li>
     *         <p><code>option.static-routes-only</code> - Indicates whether the
     *         connection has static routes only. Used for devices that do not
     *         support Border Gateway Protocol (BGP). </li> <li>
     *         <p><code>route.destination-cidr-block</code> - The destination CIDR
     *         block. This corresponds to the subnet used in a customer data center.
     *         </li> <li> <p><code>bgp-asn</code> - The BGP Autonomous System Number
     *         (ASN) associated with a BGP device. </li> <li>
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
     *         filter. </li> <li> <p><code>type</code> - The type of VPN connection.
     *         Currently the only supported type is <code>ipsec.1</code>. </li> <li>
     *         <p><code>vpn-connection-id</code> - The ID of the VPN connection.
     *         </li> <li> <p><code>vpn-gateway-id</code> - The ID of a virtual
     *         private gateway associated with the VPN connection. </li> </ul>
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
    
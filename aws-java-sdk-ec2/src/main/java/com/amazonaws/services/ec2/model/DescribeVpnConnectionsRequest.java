/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVpnConnectionsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVpnConnections.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpnConnectionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVpnConnectionsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection has static routes only. Used for
     * devices that do not support Border Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block. This corresponds to the subnet used in a
     * customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway associated with the VPN connection.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpnConnectionIds;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection has static routes only. Used for
     * devices that do not support Border Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block. This corresponds to the subnet used in a
     * customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway associated with the VPN connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>customer-gateway-configuration</code> - The configuration information for the customer gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>customer-gateway-id</code> - The ID of a customer gateway associated with the VPN connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the VPN connection (<code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>option.static-routes-only</code> - Indicates whether the connection has static routes only. Used
     *         for devices that do not support Border Gateway Protocol (BGP).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.destination-cidr-block</code> - The destination CIDR block. This corresponds to the subnet
     *         used in a customer data center.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated with a BGP device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *         key in the filter name and the tag value as the filter value. For example, to find all resources that
     *         have a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify
     *         <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *         assigned a tag with a specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code> - The type of VPN connection. Currently the only supported type is <code>ipsec.1</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpn-connection-id</code> - The ID of the VPN connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpn-gateway-id</code> - The ID of a virtual private gateway associated with the VPN connection.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection has static routes only. Used for
     * devices that do not support Border Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block. This corresponds to the subnet used in a
     * customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway associated with the VPN connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>customer-gateway-configuration</code> - The configuration information for the customer gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>customer-gateway-id</code> - The ID of a customer gateway associated with the VPN connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the VPN connection (<code>pending</code> | <code>available</code> |
     *        <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>option.static-routes-only</code> - Indicates whether the connection has static routes only. Used for
     *        devices that do not support Border Gateway Protocol (BGP).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-cidr-block</code> - The destination CIDR block. This corresponds to the subnet
     *        used in a customer data center.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated with a BGP device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of VPN connection. Currently the only supported type is <code>ipsec.1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-connection-id</code> - The ID of the VPN connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-gateway-id</code> - The ID of a virtual private gateway associated with the VPN connection.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection has static routes only. Used for
     * devices that do not support Border Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block. This corresponds to the subnet used in a
     * customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway associated with the VPN connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>customer-gateway-configuration</code> - The configuration information for the customer gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>customer-gateway-id</code> - The ID of a customer gateway associated with the VPN connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the VPN connection (<code>pending</code> | <code>available</code> |
     *        <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>option.static-routes-only</code> - Indicates whether the connection has static routes only. Used for
     *        devices that do not support Border Gateway Protocol (BGP).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-cidr-block</code> - The destination CIDR block. This corresponds to the subnet
     *        used in a customer data center.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated with a BGP device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of VPN connection. Currently the only supported type is <code>ipsec.1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-connection-id</code> - The ID of the VPN connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-gateway-id</code> - The ID of a virtual private gateway associated with the VPN connection.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnConnectionsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway-configuration</code> - The configuration information for the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of a customer gateway associated with the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPN connection (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>option.static-routes-only</code> - Indicates whether the connection has static routes only. Used for
     * devices that do not support Border Gateway Protocol (BGP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The destination CIDR block. This corresponds to the subnet used in a
     * customer data center.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated with a BGP device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of VPN connection. Currently the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of a virtual private gateway associated with the VPN connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>customer-gateway-configuration</code> - The configuration information for the customer gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>customer-gateway-id</code> - The ID of a customer gateway associated with the VPN connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the VPN connection (<code>pending</code> | <code>available</code> |
     *        <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>option.static-routes-only</code> - Indicates whether the connection has static routes only. Used for
     *        devices that do not support Border Gateway Protocol (BGP).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-cidr-block</code> - The destination CIDR block. This corresponds to the subnet
     *        used in a customer data center.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bgp-asn</code> - The BGP Autonomous System Number (ASN) associated with a BGP device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of VPN connection. Currently the only supported type is <code>ipsec.1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-connection-id</code> - The ID of the VPN connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-gateway-id</code> - The ID of a virtual private gateway associated with the VPN connection.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     * 
     * @return One or more VPN connection IDs.</p>
     *         <p>
     *         Default: Describes your VPN connections.
     */

    public java.util.List<String> getVpnConnectionIds() {
        if (vpnConnectionIds == null) {
            vpnConnectionIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpnConnectionIds;
    }

    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     * 
     * @param vpnConnectionIds
     *        One or more VPN connection IDs.</p>
     *        <p>
     *        Default: Describes your VPN connections.
     */

    public void setVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        if (vpnConnectionIds == null) {
            this.vpnConnectionIds = null;
            return;
        }

        this.vpnConnectionIds = new com.amazonaws.internal.SdkInternalList<String>(vpnConnectionIds);
    }

    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpnConnectionIds(java.util.Collection)} or {@link #withVpnConnectionIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param vpnConnectionIds
     *        One or more VPN connection IDs.</p>
     *        <p>
     *        Default: Describes your VPN connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnConnectionsRequest withVpnConnectionIds(String... vpnConnectionIds) {
        if (this.vpnConnectionIds == null) {
            setVpnConnectionIds(new com.amazonaws.internal.SdkInternalList<String>(vpnConnectionIds.length));
        }
        for (String ele : vpnConnectionIds) {
            this.vpnConnectionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more VPN connection IDs.
     * </p>
     * <p>
     * Default: Describes your VPN connections.
     * </p>
     * 
     * @param vpnConnectionIds
     *        One or more VPN connection IDs.</p>
     *        <p>
     *        Default: Describes your VPN connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnConnectionsRequest withVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        setVpnConnectionIds(vpnConnectionIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVpnConnectionsRequest> getDryRunRequest() {
        Request<DescribeVpnConnectionsRequest> request = new DescribeVpnConnectionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getVpnConnectionIds() != null)
            sb.append("VpnConnectionIds: ").append(getVpnConnectionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpnConnectionsRequest == false)
            return false;
        DescribeVpnConnectionsRequest other = (DescribeVpnConnectionsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getVpnConnectionIds() == null ^ this.getVpnConnectionIds() == null)
            return false;
        if (other.getVpnConnectionIds() != null && other.getVpnConnectionIds().equals(this.getVpnConnectionIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getVpnConnectionIds() == null) ? 0 : getVpnConnectionIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpnConnectionsRequest clone() {
        return (DescribeVpnConnectionsRequest) super.clone();
    }
}

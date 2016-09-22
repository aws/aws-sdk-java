/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVpnGatewaysRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVpnGateways.
 * </p>
 */
public class DescribeVpnGatewaysRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeVpnGatewaysRequest> {

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpnGatewayIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.state</code> - The current state of the attachment between the gateway and the VPC (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of virtual private gateway. Currently the only supported type is
     * <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     * 
     * @return One or more virtual private gateway IDs.</p>
     *         <p>
     *         Default: Describes all your virtual private gateways.
     */

    public java.util.List<String> getVpnGatewayIds() {
        if (vpnGatewayIds == null) {
            vpnGatewayIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpnGatewayIds;
    }

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     * 
     * @param vpnGatewayIds
     *        One or more virtual private gateway IDs.</p>
     *        <p>
     *        Default: Describes all your virtual private gateways.
     */

    public void setVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        if (vpnGatewayIds == null) {
            this.vpnGatewayIds = null;
            return;
        }

        this.vpnGatewayIds = new com.amazonaws.internal.SdkInternalList<String>(vpnGatewayIds);
    }

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpnGatewayIds(java.util.Collection)} or {@link #withVpnGatewayIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vpnGatewayIds
     *        One or more virtual private gateway IDs.</p>
     *        <p>
     *        Default: Describes all your virtual private gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnGatewaysRequest withVpnGatewayIds(String... vpnGatewayIds) {
        if (this.vpnGatewayIds == null) {
            setVpnGatewayIds(new com.amazonaws.internal.SdkInternalList<String>(vpnGatewayIds.length));
        }
        for (String ele : vpnGatewayIds) {
            this.vpnGatewayIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more virtual private gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your virtual private gateways.
     * </p>
     * 
     * @param vpnGatewayIds
     *        One or more virtual private gateway IDs.</p>
     *        <p>
     *        Default: Describes all your virtual private gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnGatewaysRequest withVpnGatewayIds(java.util.Collection<String> vpnGatewayIds) {
        setVpnGatewayIds(vpnGatewayIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.state</code> - The current state of the attachment between the gateway and the VPC (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of virtual private gateway. Currently the only supported type is
     * <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>attachment.state</code> - The current state of the attachment between the gateway and the VPC (
     *         <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone for the virtual private gateway (if applicable).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the virtual private gateway (<code>pending</code> |
     *         <code>available</code> | <code>deleting</code> | <code>deleted</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *         <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's
     *         value is), and the tag value X (regardless of what the tag's key is). If you want to list only resources
     *         where Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *         <code>tag-key</code> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code> - The type of virtual private gateway. Currently the only supported type is
     *         <code>ipsec.1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
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
     * <code>attachment.state</code> - The current state of the attachment between the gateway and the VPC (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of virtual private gateway. Currently the only supported type is
     * <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.state</code> - The current state of the attachment between the gateway and the VPC (
     *        <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone for the virtual private gateway (if applicable).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the virtual private gateway (<code>pending</code> |
     *        <code>available</code> | <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of virtual private gateway. Currently the only supported type is
     *        <code>ipsec.1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
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
     * <code>attachment.state</code> - The current state of the attachment between the gateway and the VPC (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of virtual private gateway. Currently the only supported type is
     * <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
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
     *        <code>attachment.state</code> - The current state of the attachment between the gateway and the VPC (
     *        <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone for the virtual private gateway (if applicable).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the virtual private gateway (<code>pending</code> |
     *        <code>available</code> | <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of virtual private gateway. Currently the only supported type is
     *        <code>ipsec.1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnGatewaysRequest withFilters(Filter... filters) {
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
     * <code>attachment.state</code> - The current state of the attachment between the gateway and the VPC (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the virtual private gateway (if applicable).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the virtual private gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of virtual private gateway. Currently the only supported type is
     * <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.state</code> - The current state of the attachment between the gateway and the VPC (
     *        <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone for the virtual private gateway (if applicable).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the virtual private gateway (<code>pending</code> |
     *        <code>available</code> | <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of virtual private gateway. Currently the only supported type is
     *        <code>ipsec.1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-gateway-id</code> - The ID of the virtual private gateway.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVpnGatewaysRequest> getDryRunRequest() {
        Request<DescribeVpnGatewaysRequest> request = new DescribeVpnGatewaysRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpnGatewayIds() != null)
            sb.append("VpnGatewayIds: " + getVpnGatewayIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpnGatewaysRequest == false)
            return false;
        DescribeVpnGatewaysRequest other = (DescribeVpnGatewaysRequest) obj;
        if (other.getVpnGatewayIds() == null ^ this.getVpnGatewayIds() == null)
            return false;
        if (other.getVpnGatewayIds() != null && other.getVpnGatewayIds().equals(this.getVpnGatewayIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
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
    public DescribeVpnGatewaysRequest clone() {
        return (DescribeVpnGatewaysRequest) super.clone();
    }
}

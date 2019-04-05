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
import com.amazonaws.services.ec2.model.transform.DescribeTransitGatewaysRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewaysRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeTransitGatewaysRequest> {

    /**
     * <p>
     * The IDs of the transit gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> transitGatewayIds;
    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether there is automatic acceptance of
     * attachment requests (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether resource attachments are automatically
     * associated with the default association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether resource attachments automatically
     * propagate routes to the default propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost Multipath Protocol support is enabled (
     * <code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code> | <code>deleted</code> |
     * <code>deleting</code> | <code>failed</code> | <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> | <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the transit gateways.
     * </p>
     * 
     * @return The IDs of the transit gateways.
     */

    public java.util.List<String> getTransitGatewayIds() {
        if (transitGatewayIds == null) {
            transitGatewayIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return transitGatewayIds;
    }

    /**
     * <p>
     * The IDs of the transit gateways.
     * </p>
     * 
     * @param transitGatewayIds
     *        The IDs of the transit gateways.
     */

    public void setTransitGatewayIds(java.util.Collection<String> transitGatewayIds) {
        if (transitGatewayIds == null) {
            this.transitGatewayIds = null;
            return;
        }

        this.transitGatewayIds = new com.amazonaws.internal.SdkInternalList<String>(transitGatewayIds);
    }

    /**
     * <p>
     * The IDs of the transit gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayIds(java.util.Collection)} or {@link #withTransitGatewayIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayIds
     *        The IDs of the transit gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewaysRequest withTransitGatewayIds(String... transitGatewayIds) {
        if (this.transitGatewayIds == null) {
            setTransitGatewayIds(new com.amazonaws.internal.SdkInternalList<String>(transitGatewayIds.length));
        }
        for (String ele : transitGatewayIds) {
            this.transitGatewayIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the transit gateways.
     * </p>
     * 
     * @param transitGatewayIds
     *        The IDs of the transit gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewaysRequest withTransitGatewayIds(java.util.Collection<String> transitGatewayIds) {
        setTransitGatewayIds(transitGatewayIds);
        return this;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether there is automatic acceptance of
     * attachment requests (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether resource attachments are automatically
     * associated with the default association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether resource attachments automatically
     * propagate routes to the default propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost Multipath Protocol support is enabled (
     * <code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code> | <code>deleted</code> |
     * <code>deleting</code> | <code>failed</code> | <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> | <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>options.propagation-default-route-table-id</code> - The ID of the default propagation route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.amazon-side-asn</code> - The private ASN for the Amazon side of a BGP session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.association-default-route-table-id</code> - The ID of the default association route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.auto-accept-shared-attachments</code> - Indicates whether there is automatic acceptance of
     *         attachment requests (<code>enable</code> | <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.default-route-table-association</code> - Indicates whether resource attachments are
     *         automatically associated with the default association route table (<code>enable</code> |
     *         <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.default-route-table-propagation</code> - Indicates whether resource attachments
     *         automatically propagate routes to the default propagation route table (<code>enable</code> |
     *         <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.dns-support</code> - Indicates whether DNS support is enabled (<code>enable</code> |
     *         <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost Multipath Protocol support is
     *         enabled (<code>enable</code> | <code>disable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the transit gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the attachment (<code>available</code> | <code>deleted</code> |
     *         <code>deleting</code> | <code>failed</code> | <code>modifying</code> | <code>pendingAcceptance</code> |
     *         <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> | <code>rejecting</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-id</code> - The ID of the transit gateway.
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
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether there is automatic acceptance of
     * attachment requests (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether resource attachments are automatically
     * associated with the default association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether resource attachments automatically
     * propagate routes to the default propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost Multipath Protocol support is enabled (
     * <code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code> | <code>deleted</code> |
     * <code>deleting</code> | <code>failed</code> | <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> | <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>options.propagation-default-route-table-id</code> - The ID of the default propagation route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.amazon-side-asn</code> - The private ASN for the Amazon side of a BGP session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.association-default-route-table-id</code> - The ID of the default association route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.auto-accept-shared-attachments</code> - Indicates whether there is automatic acceptance of
     *        attachment requests (<code>enable</code> | <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.default-route-table-association</code> - Indicates whether resource attachments are
     *        automatically associated with the default association route table (<code>enable</code> |
     *        <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.default-route-table-propagation</code> - Indicates whether resource attachments
     *        automatically propagate routes to the default propagation route table (<code>enable</code> |
     *        <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.dns-support</code> - Indicates whether DNS support is enabled (<code>enable</code> |
     *        <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost Multipath Protocol support is enabled
     *        (<code>enable</code> | <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the attachment (<code>available</code> | <code>deleted</code> |
     *        <code>deleting</code> | <code>failed</code> | <code>modifying</code> | <code>pendingAcceptance</code> |
     *        <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> | <code>rejecting</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-id</code> - The ID of the transit gateway.
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
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether there is automatic acceptance of
     * attachment requests (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether resource attachments are automatically
     * associated with the default association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether resource attachments automatically
     * propagate routes to the default propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost Multipath Protocol support is enabled (
     * <code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code> | <code>deleted</code> |
     * <code>deleting</code> | <code>failed</code> | <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> | <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
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
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>options.propagation-default-route-table-id</code> - The ID of the default propagation route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.amazon-side-asn</code> - The private ASN for the Amazon side of a BGP session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.association-default-route-table-id</code> - The ID of the default association route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.auto-accept-shared-attachments</code> - Indicates whether there is automatic acceptance of
     *        attachment requests (<code>enable</code> | <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.default-route-table-association</code> - Indicates whether resource attachments are
     *        automatically associated with the default association route table (<code>enable</code> |
     *        <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.default-route-table-propagation</code> - Indicates whether resource attachments
     *        automatically propagate routes to the default propagation route table (<code>enable</code> |
     *        <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.dns-support</code> - Indicates whether DNS support is enabled (<code>enable</code> |
     *        <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost Multipath Protocol support is enabled
     *        (<code>enable</code> | <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the attachment (<code>available</code> | <code>deleted</code> |
     *        <code>deleting</code> | <code>failed</code> | <code>modifying</code> | <code>pendingAcceptance</code> |
     *        <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> | <code>rejecting</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-id</code> - The ID of the transit gateway.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewaysRequest withFilters(Filter... filters) {
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
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>options.propagation-default-route-table-id</code> - The ID of the default propagation route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.amazon-side-asn</code> - The private ASN for the Amazon side of a BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.association-default-route-table-id</code> - The ID of the default association route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.auto-accept-shared-attachments</code> - Indicates whether there is automatic acceptance of
     * attachment requests (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-association</code> - Indicates whether resource attachments are automatically
     * associated with the default association route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.default-route-table-propagation</code> - Indicates whether resource attachments automatically
     * propagate routes to the default propagation route table (<code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.dns-support</code> - Indicates whether DNS support is enabled (<code>enable</code> |
     * <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost Multipath Protocol support is enabled (
     * <code>enable</code> | <code>disable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the attachment (<code>available</code> | <code>deleted</code> |
     * <code>deleting</code> | <code>failed</code> | <code>modifying</code> | <code>pendingAcceptance</code> |
     * <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> | <code>rejecting</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>options.propagation-default-route-table-id</code> - The ID of the default propagation route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.amazon-side-asn</code> - The private ASN for the Amazon side of a BGP session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.association-default-route-table-id</code> - The ID of the default association route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.auto-accept-shared-attachments</code> - Indicates whether there is automatic acceptance of
     *        attachment requests (<code>enable</code> | <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.default-route-table-association</code> - Indicates whether resource attachments are
     *        automatically associated with the default association route table (<code>enable</code> |
     *        <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.default-route-table-propagation</code> - Indicates whether resource attachments
     *        automatically propagate routes to the default propagation route table (<code>enable</code> |
     *        <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.dns-support</code> - Indicates whether DNS support is enabled (<code>enable</code> |
     *        <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>options.vpn-ecmp-support</code> - Indicates whether Equal Cost Multipath Protocol support is enabled
     *        (<code>enable</code> | <code>disable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the attachment (<code>available</code> | <code>deleted</code> |
     *        <code>deleting</code> | <code>failed</code> | <code>modifying</code> | <code>pendingAcceptance</code> |
     *        <code>pending</code> | <code>rollingBack</code> | <code>rejected</code> | <code>rejecting</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-id</code> - The ID of the transit gateway.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewaysRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewaysRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeTransitGatewaysRequest> getDryRunRequest() {
        Request<DescribeTransitGatewaysRequest> request = new DescribeTransitGatewaysRequestMarshaller().marshall(this);
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
        if (getTransitGatewayIds() != null)
            sb.append("TransitGatewayIds: ").append(getTransitGatewayIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTransitGatewaysRequest == false)
            return false;
        DescribeTransitGatewaysRequest other = (DescribeTransitGatewaysRequest) obj;
        if (other.getTransitGatewayIds() == null ^ this.getTransitGatewayIds() == null)
            return false;
        if (other.getTransitGatewayIds() != null && other.getTransitGatewayIds().equals(this.getTransitGatewayIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayIds() == null) ? 0 : getTransitGatewayIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTransitGatewaysRequest clone() {
        return (DescribeTransitGatewaysRequest) super.clone();
    }
}

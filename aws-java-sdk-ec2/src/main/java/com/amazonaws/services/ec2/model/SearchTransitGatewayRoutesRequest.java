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
import com.amazonaws.services.ec2.model.transform.SearchTransitGatewayRoutesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTransitGatewayRoutesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<SearchTransitGatewayRoutesRequest> {

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     */
    private String transitGatewayRouteTableId;
    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-type</code> - The attachment resource type (<code>vpc</code> | <code>vpn</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that encompass the CIDR filter. For example,
     * if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as
     * 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>type</code> - The type of roue (<code>active</code> | <code>blackhole</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of routes to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     */

    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @return The ID of the transit gateway route table.
     */

    public String getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTransitGatewayRoutesRequest withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        setTransitGatewayRouteTableId(transitGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-type</code> - The attachment resource type (<code>vpc</code> | <code>vpn</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that encompass the CIDR filter. For example,
     * if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as
     * 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>type</code> - The type of roue (<code>active</code> | <code>blackhole</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>attachment.transit-gateway-attachment-id</code>- The id of the transit gateway attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.resource-id</code> - The resource id of the transit gateway attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.resource-type</code> - The attachment resource type (<code>vpc</code> | <code>vpn</code>
     *         ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-search.exact-match</code> - The exact match of the specified filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-search.longest-prefix-match</code> - The longest prefix that matches the route.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-search.subnet-of-match</code> - The routes with a subnet that match the specified CIDR
     *         filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-search.supernet-of-match</code> - The routes with a CIDR that encompass the CIDR filter. For
     *         example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify
     *         supernet-of-match as 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     *         <code>type</code> - The type of roue (<code>active</code> | <code>blackhole</code>).
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
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-type</code> - The attachment resource type (<code>vpc</code> | <code>vpn</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that encompass the CIDR filter. For example,
     * if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as
     * 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>type</code> - The type of roue (<code>active</code> | <code>blackhole</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.transit-gateway-attachment-id</code>- The id of the transit gateway attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.resource-id</code> - The resource id of the transit gateway attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.resource-type</code> - The attachment resource type (<code>vpc</code> | <code>vpn</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.exact-match</code> - The exact match of the specified filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.longest-prefix-match</code> - The longest prefix that matches the route.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.subnet-of-match</code> - The routes with a subnet that match the specified CIDR filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.supernet-of-match</code> - The routes with a CIDR that encompass the CIDR filter. For
     *        example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify
     *        supernet-of-match as 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     *        <code>type</code> - The type of roue (<code>active</code> | <code>blackhole</code>).
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
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-type</code> - The attachment resource type (<code>vpc</code> | <code>vpn</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that encompass the CIDR filter. For example,
     * if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as
     * 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>type</code> - The type of roue (<code>active</code> | <code>blackhole</code>).
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
     *        <code>attachment.transit-gateway-attachment-id</code>- The id of the transit gateway attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.resource-id</code> - The resource id of the transit gateway attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.resource-type</code> - The attachment resource type (<code>vpc</code> | <code>vpn</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.exact-match</code> - The exact match of the specified filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.longest-prefix-match</code> - The longest prefix that matches the route.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.subnet-of-match</code> - The routes with a subnet that match the specified CIDR filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.supernet-of-match</code> - The routes with a CIDR that encompass the CIDR filter. For
     *        example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify
     *        supernet-of-match as 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     *        <code>type</code> - The type of roue (<code>active</code> | <code>blackhole</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTransitGatewayRoutesRequest withFilters(Filter... filters) {
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
     * <code>attachment.transit-gateway-attachment-id</code>- The id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-id</code> - The resource id of the transit gateway attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.resource-type</code> - The attachment resource type (<code>vpc</code> | <code>vpn</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.exact-match</code> - The exact match of the specified filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.longest-prefix-match</code> - The longest prefix that matches the route.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.subnet-of-match</code> - The routes with a subnet that match the specified CIDR filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-search.supernet-of-match</code> - The routes with a CIDR that encompass the CIDR filter. For example,
     * if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as
     * 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     * <code>type</code> - The type of roue (<code>active</code> | <code>blackhole</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.transit-gateway-attachment-id</code>- The id of the transit gateway attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.resource-id</code> - The resource id of the transit gateway attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.resource-type</code> - The attachment resource type (<code>vpc</code> | <code>vpn</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.exact-match</code> - The exact match of the specified filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.longest-prefix-match</code> - The longest prefix that matches the route.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.subnet-of-match</code> - The routes with a subnet that match the specified CIDR filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-search.supernet-of-match</code> - The routes with a CIDR that encompass the CIDR filter. For
     *        example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify
     *        supernet-of-match as 10.0.1.0/30, then the result returns 10.0.1.0/29.
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
     *        <code>type</code> - The type of roue (<code>active</code> | <code>blackhole</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTransitGatewayRoutesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of routes to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of routes to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of routes to return.
     * </p>
     * 
     * @return The maximum number of routes to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of routes to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of routes to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTransitGatewayRoutesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<SearchTransitGatewayRoutesRequest> getDryRunRequest() {
        Request<SearchTransitGatewayRoutesRequest> request = new SearchTransitGatewayRoutesRequestMarshaller().marshall(this);
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
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: ").append(getTransitGatewayRouteTableId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTransitGatewayRoutesRequest == false)
            return false;
        SearchTransitGatewayRoutesRequest other = (SearchTransitGatewayRoutesRequest) obj;
        if (other.getTransitGatewayRouteTableId() == null ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null && other.getTransitGatewayRouteTableId().equals(this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchTransitGatewayRoutesRequest clone() {
        return (SearchTransitGatewayRoutesRequest) super.clone();
    }
}

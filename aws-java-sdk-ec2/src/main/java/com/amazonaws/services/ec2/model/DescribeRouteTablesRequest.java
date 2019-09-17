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
import com.amazonaws.services.ec2.model.transform.DescribeRouteTablesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRouteTablesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeRouteTablesRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>association.route-table-association-id</code> - The ID of an association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the main route table for the VPC (
     * <code>true</code> | <code>false</code>). Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the AWS service specified in a route in the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an egress-only Internet gateway specified in a
     * route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created. <code>CreateRouteTable</code> indicates that the
     * route was automatically created when the route table was created; <code>CreateRoute</code> indicates that the
     * route was manually added to the route table; <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (<code>active</code> | <code>blackhole</code>
     * ). The blackhole state indicates that the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, the specified NAT instance has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering connection specified in a route in the
     * table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> routeTableIds;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>association.route-table-association-id</code> - The ID of an association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the main route table for the VPC (
     * <code>true</code> | <code>false</code>). Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the AWS service specified in a route in the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an egress-only Internet gateway specified in a
     * route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created. <code>CreateRouteTable</code> indicates that the
     * route was automatically created when the route table was created; <code>CreateRoute</code> indicates that the
     * route was manually added to the route table; <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (<code>active</code> | <code>blackhole</code>
     * ). The blackhole state indicates that the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, the specified NAT instance has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering connection specified in a route in the
     * table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>association.route-table-association-id</code> - The ID of an association ID for the route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.route-table-id</code> - The ID of the route table involved in the association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.main</code> - Indicates whether the route table is the main route table for the VPC (
     *         <code>true</code> | <code>false</code>). Route tables that do not have an association ID are not returned
     *         in the response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route-table-id</code> - The ID of the route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified in a route in the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range specified in a route in the route
     *         table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.destination-prefix-list-id</code> - The ID (prefix) of the AWS service specified in a route
     *         in the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.egress-only-internet-gateway-id</code> - The ID of an egress-only Internet gateway specified
     *         in a route in the route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.gateway-id</code> - The ID of a gateway specified in a route in the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.instance-id</code> - The ID of an instance specified in a route in the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.origin</code> - Describes how the route was created. <code>CreateRouteTable</code> indicates
     *         that the route was automatically created when the route table was created; <code>CreateRoute</code>
     *         indicates that the route was manually added to the route table; <code>EnableVgwRoutePropagation</code>
     *         indicates that the route was propagated by route propagation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.state</code> - The state of a route in the route table (<code>active</code> |
     *         <code>blackhole</code>). The blackhole state indicates that the route's target isn't available (for
     *         example, the specified gateway isn't attached to the VPC, the specified NAT instance has been terminated,
     *         and so on).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering connection specified in a route in
     *         the table.
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
     *         <code>transit-gateway-id</code> - The ID of a transit gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-id</code> - The ID of the VPC for the route table.
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
     * <code>association.route-table-association-id</code> - The ID of an association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the main route table for the VPC (
     * <code>true</code> | <code>false</code>). Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the AWS service specified in a route in the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an egress-only Internet gateway specified in a
     * route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created. <code>CreateRouteTable</code> indicates that the
     * route was automatically created when the route table was created; <code>CreateRoute</code> indicates that the
     * route was manually added to the route table; <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (<code>active</code> | <code>blackhole</code>
     * ). The blackhole state indicates that the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, the specified NAT instance has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering connection specified in a route in the
     * table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>association.route-table-association-id</code> - The ID of an association ID for the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.route-table-id</code> - The ID of the route table involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.main</code> - Indicates whether the route table is the main route table for the VPC (
     *        <code>true</code> | <code>false</code>). Route tables that do not have an association ID are not returned
     *        in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-table-id</code> - The ID of the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified in a route in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range specified in a route in the route
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-prefix-list-id</code> - The ID (prefix) of the AWS service specified in a route in
     *        the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.egress-only-internet-gateway-id</code> - The ID of an egress-only Internet gateway specified
     *        in a route in the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.gateway-id</code> - The ID of a gateway specified in a route in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.instance-id</code> - The ID of an instance specified in a route in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.origin</code> - Describes how the route was created. <code>CreateRouteTable</code> indicates
     *        that the route was automatically created when the route table was created; <code>CreateRoute</code>
     *        indicates that the route was manually added to the route table; <code>EnableVgwRoutePropagation</code>
     *        indicates that the route was propagated by route propagation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.state</code> - The state of a route in the route table (<code>active</code> |
     *        <code>blackhole</code>). The blackhole state indicates that the route's target isn't available (for
     *        example, the specified gateway isn't attached to the VPC, the specified NAT instance has been terminated,
     *        and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering connection specified in a route in
     *        the table.
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
     *        <code>transit-gateway-id</code> - The ID of a transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC for the route table.
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
     * <code>association.route-table-association-id</code> - The ID of an association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the main route table for the VPC (
     * <code>true</code> | <code>false</code>). Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the AWS service specified in a route in the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an egress-only Internet gateway specified in a
     * route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created. <code>CreateRouteTable</code> indicates that the
     * route was automatically created when the route table was created; <code>CreateRoute</code> indicates that the
     * route was manually added to the route table; <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (<code>active</code> | <code>blackhole</code>
     * ). The blackhole state indicates that the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, the specified NAT instance has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering connection specified in a route in the
     * table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
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
     *        <code>association.route-table-association-id</code> - The ID of an association ID for the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.route-table-id</code> - The ID of the route table involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.main</code> - Indicates whether the route table is the main route table for the VPC (
     *        <code>true</code> | <code>false</code>). Route tables that do not have an association ID are not returned
     *        in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-table-id</code> - The ID of the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified in a route in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range specified in a route in the route
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-prefix-list-id</code> - The ID (prefix) of the AWS service specified in a route in
     *        the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.egress-only-internet-gateway-id</code> - The ID of an egress-only Internet gateway specified
     *        in a route in the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.gateway-id</code> - The ID of a gateway specified in a route in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.instance-id</code> - The ID of an instance specified in a route in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.origin</code> - Describes how the route was created. <code>CreateRouteTable</code> indicates
     *        that the route was automatically created when the route table was created; <code>CreateRoute</code>
     *        indicates that the route was manually added to the route table; <code>EnableVgwRoutePropagation</code>
     *        indicates that the route was propagated by route propagation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.state</code> - The state of a route in the route table (<code>active</code> |
     *        <code>blackhole</code>). The blackhole state indicates that the route's target isn't available (for
     *        example, the specified gateway isn't attached to the VPC, the specified NAT instance has been terminated,
     *        and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering connection specified in a route in
     *        the table.
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
     *        <code>transit-gateway-id</code> - The ID of a transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC for the route table.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteTablesRequest withFilters(Filter... filters) {
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
     * <code>association.route-table-association-id</code> - The ID of an association ID for the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.route-table-id</code> - The ID of the route table involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.main</code> - Indicates whether the route table is the main route table for the VPC (
     * <code>true</code> | <code>false</code>). Route tables that do not have an association ID are not returned in the
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route-table-id</code> - The ID of the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range specified in a route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.destination-prefix-list-id</code> - The ID (prefix) of the AWS service specified in a route in the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.egress-only-internet-gateway-id</code> - The ID of an egress-only Internet gateway specified in a
     * route in the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.gateway-id</code> - The ID of a gateway specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.instance-id</code> - The ID of an instance specified in a route in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.origin</code> - Describes how the route was created. <code>CreateRouteTable</code> indicates that the
     * route was automatically created when the route table was created; <code>CreateRoute</code> indicates that the
     * route was manually added to the route table; <code>EnableVgwRoutePropagation</code> indicates that the route was
     * propagated by route propagation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.state</code> - The state of a route in the route table (<code>active</code> | <code>blackhole</code>
     * ). The blackhole state indicates that the route's target isn't available (for example, the specified gateway
     * isn't attached to the VPC, the specified NAT instance has been terminated, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering connection specified in a route in the
     * table.
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
     * <code>transit-gateway-id</code> - The ID of a transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the route table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>association.route-table-association-id</code> - The ID of an association ID for the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.route-table-id</code> - The ID of the route table involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.main</code> - Indicates whether the route table is the main route table for the VPC (
     *        <code>true</code> | <code>false</code>). Route tables that do not have an association ID are not returned
     *        in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route-table-id</code> - The ID of the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-cidr-block</code> - The IPv4 CIDR range specified in a route in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-ipv6-cidr-block</code> - The IPv6 CIDR range specified in a route in the route
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.destination-prefix-list-id</code> - The ID (prefix) of the AWS service specified in a route in
     *        the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.egress-only-internet-gateway-id</code> - The ID of an egress-only Internet gateway specified
     *        in a route in the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.gateway-id</code> - The ID of a gateway specified in a route in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.instance-id</code> - The ID of an instance specified in a route in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.nat-gateway-id</code> - The ID of a NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.transit-gateway-id</code> - The ID of a transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.origin</code> - Describes how the route was created. <code>CreateRouteTable</code> indicates
     *        that the route was automatically created when the route table was created; <code>CreateRoute</code>
     *        indicates that the route was manually added to the route table; <code>EnableVgwRoutePropagation</code>
     *        indicates that the route was propagated by route propagation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.state</code> - The state of a route in the route table (<code>active</code> |
     *        <code>blackhole</code>). The blackhole state indicates that the route's target isn't available (for
     *        example, the specified gateway isn't attached to the VPC, the specified NAT instance has been terminated,
     *        and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route.vpc-peering-connection-id</code> - The ID of a VPC peering connection specified in a route in
     *        the table.
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
     *        <code>transit-gateway-id</code> - The ID of a transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC for the route table.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteTablesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     * 
     * @return One or more route table IDs.</p>
     *         <p>
     *         Default: Describes all your route tables.
     */

    public java.util.List<String> getRouteTableIds() {
        if (routeTableIds == null) {
            routeTableIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return routeTableIds;
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     * 
     * @param routeTableIds
     *        One or more route table IDs.</p>
     *        <p>
     *        Default: Describes all your route tables.
     */

    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new com.amazonaws.internal.SdkInternalList<String>(routeTableIds);
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteTableIds(java.util.Collection)} or {@link #withRouteTableIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param routeTableIds
     *        One or more route table IDs.</p>
     *        <p>
     *        Default: Describes all your route tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteTablesRequest withRouteTableIds(String... routeTableIds) {
        if (this.routeTableIds == null) {
            setRouteTableIds(new com.amazonaws.internal.SdkInternalList<String>(routeTableIds.length));
        }
        for (String ele : routeTableIds) {
            this.routeTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * Default: Describes all your route tables.
     * </p>
     * 
     * @param routeTableIds
     *        One or more route table IDs.</p>
     *        <p>
     *        Default: Describes all your route tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteTablesRequest withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
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

    public DescribeRouteTablesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public DescribeRouteTablesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeRouteTablesRequest> getDryRunRequest() {
        Request<DescribeRouteTablesRequest> request = new DescribeRouteTablesRequestMarshaller().marshall(this);
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
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: ").append(getRouteTableIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof DescribeRouteTablesRequest == false)
            return false;
        DescribeRouteTablesRequest other = (DescribeRouteTablesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRouteTablesRequest clone() {
        return (DescribeRouteTablesRequest) super.clone();
    }
}

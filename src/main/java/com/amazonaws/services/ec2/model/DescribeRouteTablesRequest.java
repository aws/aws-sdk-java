/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeRouteTablesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeRouteTables(DescribeRouteTablesRequest) DescribeRouteTables operation}.
 * <p>
 * Describes one or more of your route tables.
 * </p>
 * <p>
 * For more information about route tables, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeRouteTables(DescribeRouteTablesRequest)
 */
public class DescribeRouteTablesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeRouteTablesRequest> {

    /**
     * One or more route table IDs. <p>Default: Describes all your route
     * tables.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> routeTableIds;

    /**
     * One or more filters. <ul> <li>
     * <p><code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table. </li> <li>
     * <p><code>association.route-table-id</code> - The ID of the route table
     * involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>association.main</code> -
     * Indicates whether the route table is the main route table for the VPC.
     * </li> <li> <p><code>route-table-id</code> - The ID of the route table.
     * </li> <li> <p><code>route.destination-cidr-block</code> - The CIDR
     * range specified in a route in the table. </li> <li>
     * <p><code>route.gateway-id</code> - The ID of a gateway specified in a
     * route in the table. </li> <li> <p><code>route.instance-id</code> - The
     * ID of an instance specified in a route in the table. </li> <li>
     * <p><code>route.origin</code> - Describes how the route was created
     * (<code>CreateRouteTable</code> | <code>CreateRoute</code> |
     * <code>EnableVgwRoutePropagation</code>). </li> <li>
     * <p><code>route.state</code> - The state of a route in the route table
     * (<code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT
     * instance has been terminated, and so on). </li> <li>
     * <p><code>route.vpc-peering-connection-id</code> - The ID of a VPC
     * peering connection specified in a route in the table. </li> <li>
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
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * route table. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more route table IDs. <p>Default: Describes all your route
     * tables.
     *
     * @return One or more route table IDs. <p>Default: Describes all your route
     *         tables.
     */
    public java.util.List<String> getRouteTableIds() {
        if (routeTableIds == null) {
              routeTableIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              routeTableIds.setAutoConstruct(true);
        }
        return routeTableIds;
    }
    
    /**
     * One or more route table IDs. <p>Default: Describes all your route
     * tables.
     *
     * @param routeTableIds One or more route table IDs. <p>Default: Describes all your route
     *         tables.
     */
    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> routeTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(routeTableIds.size());
        routeTableIdsCopy.addAll(routeTableIds);
        this.routeTableIds = routeTableIdsCopy;
    }
    
    /**
     * One or more route table IDs. <p>Default: Describes all your route
     * tables.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableIds One or more route table IDs. <p>Default: Describes all your route
     *         tables.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRouteTablesRequest withRouteTableIds(String... routeTableIds) {
        if (getRouteTableIds() == null) setRouteTableIds(new java.util.ArrayList<String>(routeTableIds.length));
        for (String value : routeTableIds) {
            getRouteTableIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more route table IDs. <p>Default: Describes all your route
     * tables.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableIds One or more route table IDs. <p>Default: Describes all your route
     *         tables.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRouteTablesRequest withRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> routeTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(routeTableIds.size());
            routeTableIdsCopy.addAll(routeTableIds);
            this.routeTableIds = routeTableIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li>
     * <p><code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table. </li> <li>
     * <p><code>association.route-table-id</code> - The ID of the route table
     * involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>association.main</code> -
     * Indicates whether the route table is the main route table for the VPC.
     * </li> <li> <p><code>route-table-id</code> - The ID of the route table.
     * </li> <li> <p><code>route.destination-cidr-block</code> - The CIDR
     * range specified in a route in the table. </li> <li>
     * <p><code>route.gateway-id</code> - The ID of a gateway specified in a
     * route in the table. </li> <li> <p><code>route.instance-id</code> - The
     * ID of an instance specified in a route in the table. </li> <li>
     * <p><code>route.origin</code> - Describes how the route was created
     * (<code>CreateRouteTable</code> | <code>CreateRoute</code> |
     * <code>EnableVgwRoutePropagation</code>). </li> <li>
     * <p><code>route.state</code> - The state of a route in the route table
     * (<code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT
     * instance has been terminated, and so on). </li> <li>
     * <p><code>route.vpc-peering-connection-id</code> - The ID of a VPC
     * peering connection specified in a route in the table. </li> <li>
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
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * route table. </li> </ul>
     *
     * @return One or more filters. <ul> <li>
     *         <p><code>association.route-table-association-id</code> - The ID of an
     *         association ID for the route table. </li> <li>
     *         <p><code>association.route-table-id</code> - The ID of the route table
     *         involved in the association. </li> <li>
     *         <p><code>association.subnet-id</code> - The ID of the subnet involved
     *         in the association. </li> <li> <p><code>association.main</code> -
     *         Indicates whether the route table is the main route table for the VPC.
     *         </li> <li> <p><code>route-table-id</code> - The ID of the route table.
     *         </li> <li> <p><code>route.destination-cidr-block</code> - The CIDR
     *         range specified in a route in the table. </li> <li>
     *         <p><code>route.gateway-id</code> - The ID of a gateway specified in a
     *         route in the table. </li> <li> <p><code>route.instance-id</code> - The
     *         ID of an instance specified in a route in the table. </li> <li>
     *         <p><code>route.origin</code> - Describes how the route was created
     *         (<code>CreateRouteTable</code> | <code>CreateRoute</code> |
     *         <code>EnableVgwRoutePropagation</code>). </li> <li>
     *         <p><code>route.state</code> - The state of a route in the route table
     *         (<code>active</code> | <code>blackhole</code>). The blackhole state
     *         indicates that the route's target isn't available (for example, the
     *         specified gateway isn't attached to the VPC, the specified NAT
     *         instance has been terminated, and so on). </li> <li>
     *         <p><code>route.vpc-peering-connection-id</code> - The ID of a VPC
     *         peering connection specified in a route in the table. </li> <li>
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
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     *         route table. </li> </ul>
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
     * <p><code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table. </li> <li>
     * <p><code>association.route-table-id</code> - The ID of the route table
     * involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>association.main</code> -
     * Indicates whether the route table is the main route table for the VPC.
     * </li> <li> <p><code>route-table-id</code> - The ID of the route table.
     * </li> <li> <p><code>route.destination-cidr-block</code> - The CIDR
     * range specified in a route in the table. </li> <li>
     * <p><code>route.gateway-id</code> - The ID of a gateway specified in a
     * route in the table. </li> <li> <p><code>route.instance-id</code> - The
     * ID of an instance specified in a route in the table. </li> <li>
     * <p><code>route.origin</code> - Describes how the route was created
     * (<code>CreateRouteTable</code> | <code>CreateRoute</code> |
     * <code>EnableVgwRoutePropagation</code>). </li> <li>
     * <p><code>route.state</code> - The state of a route in the route table
     * (<code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT
     * instance has been terminated, and so on). </li> <li>
     * <p><code>route.vpc-peering-connection-id</code> - The ID of a VPC
     * peering connection specified in a route in the table. </li> <li>
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
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * route table. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>association.route-table-association-id</code> - The ID of an
     *         association ID for the route table. </li> <li>
     *         <p><code>association.route-table-id</code> - The ID of the route table
     *         involved in the association. </li> <li>
     *         <p><code>association.subnet-id</code> - The ID of the subnet involved
     *         in the association. </li> <li> <p><code>association.main</code> -
     *         Indicates whether the route table is the main route table for the VPC.
     *         </li> <li> <p><code>route-table-id</code> - The ID of the route table.
     *         </li> <li> <p><code>route.destination-cidr-block</code> - The CIDR
     *         range specified in a route in the table. </li> <li>
     *         <p><code>route.gateway-id</code> - The ID of a gateway specified in a
     *         route in the table. </li> <li> <p><code>route.instance-id</code> - The
     *         ID of an instance specified in a route in the table. </li> <li>
     *         <p><code>route.origin</code> - Describes how the route was created
     *         (<code>CreateRouteTable</code> | <code>CreateRoute</code> |
     *         <code>EnableVgwRoutePropagation</code>). </li> <li>
     *         <p><code>route.state</code> - The state of a route in the route table
     *         (<code>active</code> | <code>blackhole</code>). The blackhole state
     *         indicates that the route's target isn't available (for example, the
     *         specified gateway isn't attached to the VPC, the specified NAT
     *         instance has been terminated, and so on). </li> <li>
     *         <p><code>route.vpc-peering-connection-id</code> - The ID of a VPC
     *         peering connection specified in a route in the table. </li> <li>
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
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     *         route table. </li> </ul>
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
     * <p><code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table. </li> <li>
     * <p><code>association.route-table-id</code> - The ID of the route table
     * involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>association.main</code> -
     * Indicates whether the route table is the main route table for the VPC.
     * </li> <li> <p><code>route-table-id</code> - The ID of the route table.
     * </li> <li> <p><code>route.destination-cidr-block</code> - The CIDR
     * range specified in a route in the table. </li> <li>
     * <p><code>route.gateway-id</code> - The ID of a gateway specified in a
     * route in the table. </li> <li> <p><code>route.instance-id</code> - The
     * ID of an instance specified in a route in the table. </li> <li>
     * <p><code>route.origin</code> - Describes how the route was created
     * (<code>CreateRouteTable</code> | <code>CreateRoute</code> |
     * <code>EnableVgwRoutePropagation</code>). </li> <li>
     * <p><code>route.state</code> - The state of a route in the route table
     * (<code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT
     * instance has been terminated, and so on). </li> <li>
     * <p><code>route.vpc-peering-connection-id</code> - The ID of a VPC
     * peering connection specified in a route in the table. </li> <li>
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
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * route table. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>association.route-table-association-id</code> - The ID of an
     *         association ID for the route table. </li> <li>
     *         <p><code>association.route-table-id</code> - The ID of the route table
     *         involved in the association. </li> <li>
     *         <p><code>association.subnet-id</code> - The ID of the subnet involved
     *         in the association. </li> <li> <p><code>association.main</code> -
     *         Indicates whether the route table is the main route table for the VPC.
     *         </li> <li> <p><code>route-table-id</code> - The ID of the route table.
     *         </li> <li> <p><code>route.destination-cidr-block</code> - The CIDR
     *         range specified in a route in the table. </li> <li>
     *         <p><code>route.gateway-id</code> - The ID of a gateway specified in a
     *         route in the table. </li> <li> <p><code>route.instance-id</code> - The
     *         ID of an instance specified in a route in the table. </li> <li>
     *         <p><code>route.origin</code> - Describes how the route was created
     *         (<code>CreateRouteTable</code> | <code>CreateRoute</code> |
     *         <code>EnableVgwRoutePropagation</code>). </li> <li>
     *         <p><code>route.state</code> - The state of a route in the route table
     *         (<code>active</code> | <code>blackhole</code>). The blackhole state
     *         indicates that the route's target isn't available (for example, the
     *         specified gateway isn't attached to the VPC, the specified NAT
     *         instance has been terminated, and so on). </li> <li>
     *         <p><code>route.vpc-peering-connection-id</code> - The ID of a VPC
     *         peering connection specified in a route in the table. </li> <li>
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
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     *         route table. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRouteTablesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li>
     * <p><code>association.route-table-association-id</code> - The ID of an
     * association ID for the route table. </li> <li>
     * <p><code>association.route-table-id</code> - The ID of the route table
     * involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>association.main</code> -
     * Indicates whether the route table is the main route table for the VPC.
     * </li> <li> <p><code>route-table-id</code> - The ID of the route table.
     * </li> <li> <p><code>route.destination-cidr-block</code> - The CIDR
     * range specified in a route in the table. </li> <li>
     * <p><code>route.gateway-id</code> - The ID of a gateway specified in a
     * route in the table. </li> <li> <p><code>route.instance-id</code> - The
     * ID of an instance specified in a route in the table. </li> <li>
     * <p><code>route.origin</code> - Describes how the route was created
     * (<code>CreateRouteTable</code> | <code>CreateRoute</code> |
     * <code>EnableVgwRoutePropagation</code>). </li> <li>
     * <p><code>route.state</code> - The state of a route in the route table
     * (<code>active</code> | <code>blackhole</code>). The blackhole state
     * indicates that the route's target isn't available (for example, the
     * specified gateway isn't attached to the VPC, the specified NAT
     * instance has been terminated, and so on). </li> <li>
     * <p><code>route.vpc-peering-connection-id</code> - The ID of a VPC
     * peering connection specified in a route in the table. </li> <li>
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
     * filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     * route table. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>association.route-table-association-id</code> - The ID of an
     *         association ID for the route table. </li> <li>
     *         <p><code>association.route-table-id</code> - The ID of the route table
     *         involved in the association. </li> <li>
     *         <p><code>association.subnet-id</code> - The ID of the subnet involved
     *         in the association. </li> <li> <p><code>association.main</code> -
     *         Indicates whether the route table is the main route table for the VPC.
     *         </li> <li> <p><code>route-table-id</code> - The ID of the route table.
     *         </li> <li> <p><code>route.destination-cidr-block</code> - The CIDR
     *         range specified in a route in the table. </li> <li>
     *         <p><code>route.gateway-id</code> - The ID of a gateway specified in a
     *         route in the table. </li> <li> <p><code>route.instance-id</code> - The
     *         ID of an instance specified in a route in the table. </li> <li>
     *         <p><code>route.origin</code> - Describes how the route was created
     *         (<code>CreateRouteTable</code> | <code>CreateRoute</code> |
     *         <code>EnableVgwRoutePropagation</code>). </li> <li>
     *         <p><code>route.state</code> - The state of a route in the route table
     *         (<code>active</code> | <code>blackhole</code>). The blackhole state
     *         indicates that the route's target isn't available (for example, the
     *         specified gateway isn't attached to the VPC, the specified NAT
     *         instance has been terminated, and so on). </li> <li>
     *         <p><code>route.vpc-peering-connection-id</code> - The ID of a VPC
     *         peering connection specified in a route in the table. </li> <li>
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
     *         filter. </li> <li> <p><code>vpc-id</code> - The ID of the VPC for the
     *         route table. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRouteTablesRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeRouteTablesRequest> getDryRunRequest() {
        Request<DescribeRouteTablesRequest> request = new DescribeRouteTablesRequestMarshaller().marshall(this);
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
        if (getRouteTableIds() != null) sb.append("RouteTableIds: " + getRouteTableIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRouteTablesRequest == false) return false;
        DescribeRouteTablesRequest other = (DescribeRouteTablesRequest)obj;
        
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null) return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    
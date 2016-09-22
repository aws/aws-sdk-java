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
import com.amazonaws.services.ec2.model.transform.DescribeVpcPeeringConnectionsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVpcPeeringConnections.
 * </p>
 */
public class DescribeVpcPeeringConnectionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVpcPeeringConnectionsRequest> {

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcPeeringConnectionIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepter-vpc-info.cidr-block</code> - The CIDR block of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The CIDR block of the requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information about the status of the VPC peering
     * connection, if applicable.
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
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     * 
     * @return One or more VPC peering connection IDs.</p>
     *         <p>
     *         Default: Describes all your VPC peering connections.
     */

    public java.util.List<String> getVpcPeeringConnectionIds() {
        if (vpcPeeringConnectionIds == null) {
            vpcPeeringConnectionIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcPeeringConnectionIds;
    }

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     * 
     * @param vpcPeeringConnectionIds
     *        One or more VPC peering connection IDs.</p>
     *        <p>
     *        Default: Describes all your VPC peering connections.
     */

    public void setVpcPeeringConnectionIds(java.util.Collection<String> vpcPeeringConnectionIds) {
        if (vpcPeeringConnectionIds == null) {
            this.vpcPeeringConnectionIds = null;
            return;
        }

        this.vpcPeeringConnectionIds = new com.amazonaws.internal.SdkInternalList<String>(vpcPeeringConnectionIds);
    }

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcPeeringConnectionIds(java.util.Collection)} or
     * {@link #withVpcPeeringConnectionIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcPeeringConnectionIds
     *        One or more VPC peering connection IDs.</p>
     *        <p>
     *        Default: Describes all your VPC peering connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringConnectionsRequest withVpcPeeringConnectionIds(String... vpcPeeringConnectionIds) {
        if (this.vpcPeeringConnectionIds == null) {
            setVpcPeeringConnectionIds(new com.amazonaws.internal.SdkInternalList<String>(vpcPeeringConnectionIds.length));
        }
        for (String ele : vpcPeeringConnectionIds) {
            this.vpcPeeringConnectionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more VPC peering connection IDs.
     * </p>
     * <p>
     * Default: Describes all your VPC peering connections.
     * </p>
     * 
     * @param vpcPeeringConnectionIds
     *        One or more VPC peering connection IDs.</p>
     *        <p>
     *        Default: Describes all your VPC peering connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringConnectionsRequest withVpcPeeringConnectionIds(java.util.Collection<String> vpcPeeringConnectionIds) {
        setVpcPeeringConnectionIds(vpcPeeringConnectionIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepter-vpc-info.cidr-block</code> - The CIDR block of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The CIDR block of the requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information about the status of the VPC peering
     * connection, if applicable.
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
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>accepter-vpc-info.cidr-block</code> - The CIDR block of the peer VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the peer VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-vpc-info.cidr-block</code> - The CIDR block of the requester's VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-vpc-info.owner-id</code> - The AWS account ID of the owner of the requester VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-code</code> - The status of the VPC peering connection (<code>pending-acceptance</code> |
     *         <code>failed</code> | <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     *         <code>deleted</code> | <code>rejected</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-message</code> - A message that provides more information about the status of the VPC
     *         peering connection, if applicable.
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
     *         <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
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
     * <code>accepter-vpc-info.cidr-block</code> - The CIDR block of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The CIDR block of the requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information about the status of the VPC peering
     * connection, if applicable.
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
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.cidr-block</code> - The CIDR block of the peer VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the peer VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.cidr-block</code> - The CIDR block of the requester's VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.owner-id</code> - The AWS account ID of the owner of the requester VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-code</code> - The status of the VPC peering connection (<code>pending-acceptance</code> |
     *        <code>failed</code> | <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     *        <code>deleted</code> | <code>rejected</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - A message that provides more information about the status of the VPC peering
     *        connection, if applicable.
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
     *        <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
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
     * <code>accepter-vpc-info.cidr-block</code> - The CIDR block of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The CIDR block of the requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information about the status of the VPC peering
     * connection, if applicable.
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
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
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
     *        <code>accepter-vpc-info.cidr-block</code> - The CIDR block of the peer VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the peer VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.cidr-block</code> - The CIDR block of the requester's VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.owner-id</code> - The AWS account ID of the owner of the requester VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-code</code> - The status of the VPC peering connection (<code>pending-acceptance</code> |
     *        <code>failed</code> | <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     *        <code>deleted</code> | <code>rejected</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - A message that provides more information about the status of the VPC peering
     *        connection, if applicable.
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
     *        <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringConnectionsRequest withFilters(Filter... filters) {
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
     * <code>accepter-vpc-info.cidr-block</code> - The CIDR block of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The CIDR block of the requester's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.owner-id</code> - The AWS account ID of the owner of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The status of the VPC peering connection (<code>pending-acceptance</code> |
     * <code>failed</code> | <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     * <code>deleted</code> | <code>rejected</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - A message that provides more information about the status of the VPC peering
     * connection, if applicable.
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
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.cidr-block</code> - The CIDR block of the peer VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the peer VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.vpc-id</code> - The ID of the peer VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.cidr-block</code> - The CIDR block of the requester's VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.owner-id</code> - The AWS account ID of the owner of the requester VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.vpc-id</code> - The ID of the requester VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-code</code> - The status of the VPC peering connection (<code>pending-acceptance</code> |
     *        <code>failed</code> | <code>expired</code> | <code>provisioning</code> | <code>active</code> |
     *        <code>deleted</code> | <code>rejected</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - A message that provides more information about the status of the VPC peering
     *        connection, if applicable.
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
     *        <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcPeeringConnectionsRequest> getDryRunRequest() {
        Request<DescribeVpcPeeringConnectionsRequest> request = new DescribeVpcPeeringConnectionsRequestMarshaller().marshall(this);
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
        if (getVpcPeeringConnectionIds() != null)
            sb.append("VpcPeeringConnectionIds: " + getVpcPeeringConnectionIds() + ",");
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

        if (obj instanceof DescribeVpcPeeringConnectionsRequest == false)
            return false;
        DescribeVpcPeeringConnectionsRequest other = (DescribeVpcPeeringConnectionsRequest) obj;
        if (other.getVpcPeeringConnectionIds() == null ^ this.getVpcPeeringConnectionIds() == null)
            return false;
        if (other.getVpcPeeringConnectionIds() != null && other.getVpcPeeringConnectionIds().equals(this.getVpcPeeringConnectionIds()) == false)
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

        hashCode = prime * hashCode + ((getVpcPeeringConnectionIds() == null) ? 0 : getVpcPeeringConnectionIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcPeeringConnectionsRequest clone() {
        return (DescribeVpcPeeringConnectionsRequest) super.clone();
    }
}

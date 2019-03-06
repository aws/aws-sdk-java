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
import com.amazonaws.services.ec2.model.transform.DescribeVpcPeeringConnectionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcPeeringConnectionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVpcPeeringConnectionsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the requester's VPC.
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
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
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
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcPeeringConnectionIds;
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
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the requester's VPC.
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
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
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
     * <code>vpc-peering-connection-id</code> - The ID of the VPC peering connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the accepter VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the accepter VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the requester's VPC.
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
     *         <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
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
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the requester's VPC.
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
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
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
     *        <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the accepter VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the accepter VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the requester's VPC.
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
     *        <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
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
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the requester's VPC.
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
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
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
     *        <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the accepter VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the accepter VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the requester's VPC.
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
     *        <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
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
     * <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the requester's VPC.
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
     * <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
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
     *        <code>accepter-vpc-info.cidr-block</code> - The IPv4 CIDR block of the accepter VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.owner-id</code> - The AWS account ID of the owner of the accepter VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>accepter-vpc-info.vpc-id</code> - The ID of the accepter VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expiration-time</code> - The expiration date and time for the VPC peering connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-vpc-info.cidr-block</code> - The IPv4 CIDR block of the requester's VPC.
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
     *        <code>deleting</code> | <code>deleted</code> | <code>rejected</code>).
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

    public DescribeVpcPeeringConnectionsRequest withNextToken(String nextToken) {
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

    public DescribeVpcPeeringConnectionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getVpcPeeringConnectionIds() != null)
            sb.append("VpcPeeringConnectionIds: ").append(getVpcPeeringConnectionIds()).append(",");
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

        if (obj instanceof DescribeVpcPeeringConnectionsRequest == false)
            return false;
        DescribeVpcPeeringConnectionsRequest other = (DescribeVpcPeeringConnectionsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getVpcPeeringConnectionIds() == null ^ this.getVpcPeeringConnectionIds() == null)
            return false;
        if (other.getVpcPeeringConnectionIds() != null && other.getVpcPeeringConnectionIds().equals(this.getVpcPeeringConnectionIds()) == false)
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
        hashCode = prime * hashCode + ((getVpcPeeringConnectionIds() == null) ? 0 : getVpcPeeringConnectionIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcPeeringConnectionsRequest clone() {
        return (DescribeVpcPeeringConnectionsRequest) super.clone();
    }
}

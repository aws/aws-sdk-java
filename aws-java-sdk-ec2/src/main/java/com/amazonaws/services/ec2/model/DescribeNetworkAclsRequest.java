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
import com.amazonaws.services.ec2.model.transform.DescribeNetworkAclsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkAclsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeNetworkAclsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>association.association-id</code> - The ID of an association ID for the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (<code>tcp</code> | <code>udp</code> |
     * <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (<code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkAclIds;
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
     * <code>association.association-id</code> - The ID of an association ID for the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (<code>tcp</code> | <code>udp</code> |
     * <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (<code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>association.association-id</code> - The ID of an association ID for the ACL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.network-acl-id</code> - The ID of the network ACL involved in the association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>default</code> - Indicates whether the ACL is the default network ACL for the VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.icmp.code</code> - The ICMP code specified in the entry, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.icmp.type</code> - The ICMP type specified in the entry, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the entry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.port-range.from</code> - The start of the port range specified in the entry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.port-range.to</code> - The end of the port range specified in the entry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.protocol</code> - The protocol specified in the entry (<code>tcp</code> | <code>udp</code> |
     *         <code>icmp</code> or a protocol number).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.rule-action</code> - Allows or denies the matching traffic (<code>allow</code> |
     *         <code>deny</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the set of ACL entries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-acl-id</code> - The ID of the network ACL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the network ACL.
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
     *         <code>vpc-id</code> - The ID of the VPC for the network ACL.
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
     * <code>association.association-id</code> - The ID of an association ID for the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (<code>tcp</code> | <code>udp</code> |
     * <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (<code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>association.association-id</code> - The ID of an association ID for the ACL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.network-acl-id</code> - The ID of the network ACL involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default</code> - Indicates whether the ACL is the default network ACL for the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.icmp.code</code> - The ICMP code specified in the entry, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.icmp.type</code> - The ICMP type specified in the entry, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.port-range.from</code> - The start of the port range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.port-range.to</code> - The end of the port range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.protocol</code> - The protocol specified in the entry (<code>tcp</code> | <code>udp</code> |
     *        <code>icmp</code> or a protocol number).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.rule-action</code> - Allows or denies the matching traffic (<code>allow</code> |
     *        <code>deny</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the set of ACL entries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-acl-id</code> - The ID of the network ACL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the network ACL.
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
     *        <code>vpc-id</code> - The ID of the VPC for the network ACL.
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
     * <code>association.association-id</code> - The ID of an association ID for the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (<code>tcp</code> | <code>udp</code> |
     * <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (<code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
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
     *        <code>association.association-id</code> - The ID of an association ID for the ACL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.network-acl-id</code> - The ID of the network ACL involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default</code> - Indicates whether the ACL is the default network ACL for the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.icmp.code</code> - The ICMP code specified in the entry, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.icmp.type</code> - The ICMP type specified in the entry, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.port-range.from</code> - The start of the port range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.port-range.to</code> - The end of the port range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.protocol</code> - The protocol specified in the entry (<code>tcp</code> | <code>udp</code> |
     *        <code>icmp</code> or a protocol number).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.rule-action</code> - Allows or denies the matching traffic (<code>allow</code> |
     *        <code>deny</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the set of ACL entries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-acl-id</code> - The ID of the network ACL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the network ACL.
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
     *        <code>vpc-id</code> - The ID of the VPC for the network ACL.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkAclsRequest withFilters(Filter... filters) {
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
     * <code>association.association-id</code> - The ID of an association ID for the ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.network-acl-id</code> - The ID of the network ACL involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default</code> - Indicates whether the ACL is the default network ACL for the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.code</code> - The ICMP code specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.icmp.type</code> - The ICMP type specified in the entry, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.from</code> - The start of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.port-range.to</code> - The end of the port range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.protocol</code> - The protocol specified in the entry (<code>tcp</code> | <code>udp</code> |
     * <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-action</code> - Allows or denies the matching traffic (<code>allow</code> | <code>deny</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the set of ACL entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the network ACL.
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
     * <code>vpc-id</code> - The ID of the VPC for the network ACL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>association.association-id</code> - The ID of an association ID for the ACL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.network-acl-id</code> - The ID of the network ACL involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.subnet-id</code> - The ID of the subnet involved in the association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default</code> - Indicates whether the ACL is the default network ACL for the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.cidr</code> - The IPv4 CIDR range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.icmp.code</code> - The ICMP code specified in the entry, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.icmp.type</code> - The ICMP type specified in the entry, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.ipv6-cidr</code> - The IPv6 CIDR range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.port-range.from</code> - The start of the port range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.port-range.to</code> - The end of the port range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.protocol</code> - The protocol specified in the entry (<code>tcp</code> | <code>udp</code> |
     *        <code>icmp</code> or a protocol number).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.rule-action</code> - Allows or denies the matching traffic (<code>allow</code> |
     *        <code>deny</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the set of ACL entries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-acl-id</code> - The ID of the network ACL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the network ACL.
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
     *        <code>vpc-id</code> - The ID of the VPC for the network ACL.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkAclsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     * 
     * @return One or more network ACL IDs.</p>
     *         <p>
     *         Default: Describes all your network ACLs.
     */

    public java.util.List<String> getNetworkAclIds() {
        if (networkAclIds == null) {
            networkAclIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkAclIds;
    }

    /**
     * <p>
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     * 
     * @param networkAclIds
     *        One or more network ACL IDs.</p>
     *        <p>
     *        Default: Describes all your network ACLs.
     */

    public void setNetworkAclIds(java.util.Collection<String> networkAclIds) {
        if (networkAclIds == null) {
            this.networkAclIds = null;
            return;
        }

        this.networkAclIds = new com.amazonaws.internal.SdkInternalList<String>(networkAclIds);
    }

    /**
     * <p>
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkAclIds(java.util.Collection)} or {@link #withNetworkAclIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param networkAclIds
     *        One or more network ACL IDs.</p>
     *        <p>
     *        Default: Describes all your network ACLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkAclsRequest withNetworkAclIds(String... networkAclIds) {
        if (this.networkAclIds == null) {
            setNetworkAclIds(new com.amazonaws.internal.SdkInternalList<String>(networkAclIds.length));
        }
        for (String ele : networkAclIds) {
            this.networkAclIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more network ACL IDs.
     * </p>
     * <p>
     * Default: Describes all your network ACLs.
     * </p>
     * 
     * @param networkAclIds
     *        One or more network ACL IDs.</p>
     *        <p>
     *        Default: Describes all your network ACLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkAclsRequest withNetworkAclIds(java.util.Collection<String> networkAclIds) {
        setNetworkAclIds(networkAclIds);
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

    public DescribeNetworkAclsRequest withNextToken(String nextToken) {
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

    public DescribeNetworkAclsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkAclsRequest> getDryRunRequest() {
        Request<DescribeNetworkAclsRequest> request = new DescribeNetworkAclsRequestMarshaller().marshall(this);
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
        if (getNetworkAclIds() != null)
            sb.append("NetworkAclIds: ").append(getNetworkAclIds()).append(",");
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

        if (obj instanceof DescribeNetworkAclsRequest == false)
            return false;
        DescribeNetworkAclsRequest other = (DescribeNetworkAclsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNetworkAclIds() == null ^ this.getNetworkAclIds() == null)
            return false;
        if (other.getNetworkAclIds() != null && other.getNetworkAclIds().equals(this.getNetworkAclIds()) == false)
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
        hashCode = prime * hashCode + ((getNetworkAclIds() == null) ? 0 : getNetworkAclIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkAclsRequest clone() {
        return (DescribeNetworkAclsRequest) super.clone();
    }
}

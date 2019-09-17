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
import com.amazonaws.services.ec2.model.transform.DescribeSecurityGroupsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecurityGroupsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeSecurityGroupsRequest> {

    /**
     * <p>
     * The filters. If using multiple filters for rules, the results include security groups for which any combination
     * of rules - not necessarily a single rule - match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.cidr</code> - An IPv4 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.from-port</code> - For an outbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-id</code> - The ID of a security group that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-name</code> - The name of a security group that has been referenced in an
     * outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service to which a security group
     * rule allows outbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.protocol</code> - The IP protocol for an outbound security group rule (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.to-port</code> - For an outbound rule, the end of port range for the TCP and UDP
     * protocols, or an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.cidr</code> - An IPv4 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.from-port</code> - For an inbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-id</code> - The ID of a security group that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-name</code> - The name of a security group that has been referenced in an inbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service from which a security group rule
     * allows inbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.protocol</code> - The IP protocol for an inbound security group rule (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.to-port</code> - For an inbound rule, the end of port range for the TCP and UDP protocols, or
     * an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the owner of the security group.
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
     * <code>vpc-id</code> - The ID of the VPC specified when the security group was created.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The IDs of the security groups. Required for security groups in a nondefault VPC.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupIds;
    /**
     * <p>
     * [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security group
     * name or the security group ID. For security groups in a nondefault VPC, use the <code>group-name</code> filter to
     * describe security groups by name.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupNames;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another request
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000. If this parameter is not
     * specified, then all results are returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The filters. If using multiple filters for rules, the results include security groups for which any combination
     * of rules - not necessarily a single rule - match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.cidr</code> - An IPv4 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.from-port</code> - For an outbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-id</code> - The ID of a security group that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-name</code> - The name of a security group that has been referenced in an
     * outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service to which a security group
     * rule allows outbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.protocol</code> - The IP protocol for an outbound security group rule (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.to-port</code> - For an outbound rule, the end of port range for the TCP and UDP
     * protocols, or an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.cidr</code> - An IPv4 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.from-port</code> - For an inbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-id</code> - The ID of a security group that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-name</code> - The name of a security group that has been referenced in an inbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service from which a security group rule
     * allows inbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.protocol</code> - The IP protocol for an inbound security group rule (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.to-port</code> - For an inbound rule, the end of port range for the TCP and UDP protocols, or
     * an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the owner of the security group.
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
     * <code>vpc-id</code> - The ID of the VPC specified when the security group was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters. If using multiple filters for rules, the results include security groups for which any
     *         combination of rules - not necessarily a single rule - match all filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>description</code> - The description of the security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>egress.ip-permission.cidr</code> - An IPv4 CIDR block for an outbound security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>egress.ip-permission.from-port</code> - For an outbound rule, the start of port range for the TCP
     *         and UDP protocols, or an ICMP type number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>egress.ip-permission.group-id</code> - The ID of a security group that has been referenced in an
     *         outbound security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>egress.ip-permission.group-name</code> - The name of a security group that has been referenced in
     *         an outbound security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>egress.ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an outbound security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>egress.ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service to which a security
     *         group rule allows outbound access.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>egress.ip-permission.protocol</code> - The IP protocol for an outbound security group rule (
     *         <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>egress.ip-permission.to-port</code> - For an outbound rule, the end of port range for the TCP and
     *         UDP protocols, or an ICMP code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>egress.ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an
     *         outbound security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-id</code> - The ID of the security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-name</code> - The name of the security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-permission.cidr</code> - An IPv4 CIDR block for an inbound security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-permission.from-port</code> - For an inbound rule, the start of port range for the TCP and UDP
     *         protocols, or an ICMP type number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-permission.group-id</code> - The ID of a security group that has been referenced in an inbound
     *         security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-permission.group-name</code> - The name of a security group that has been referenced in an
     *         inbound security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an inbound security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service from which a security
     *         group rule allows inbound access.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-permission.protocol</code> - The IP protocol for an inbound security group rule (
     *         <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-permission.to-port</code> - For an inbound rule, the end of port range for the TCP and UDP
     *         protocols, or an ICMP code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an inbound
     *         security group rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The AWS account ID of the owner of the security group.
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
     *         <code>vpc-id</code> - The ID of the VPC specified when the security group was created.
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
     * The filters. If using multiple filters for rules, the results include security groups for which any combination
     * of rules - not necessarily a single rule - match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.cidr</code> - An IPv4 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.from-port</code> - For an outbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-id</code> - The ID of a security group that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-name</code> - The name of a security group that has been referenced in an
     * outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service to which a security group
     * rule allows outbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.protocol</code> - The IP protocol for an outbound security group rule (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.to-port</code> - For an outbound rule, the end of port range for the TCP and UDP
     * protocols, or an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.cidr</code> - An IPv4 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.from-port</code> - For an inbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-id</code> - The ID of a security group that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-name</code> - The name of a security group that has been referenced in an inbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service from which a security group rule
     * allows inbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.protocol</code> - The IP protocol for an inbound security group rule (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.to-port</code> - For an inbound rule, the end of port range for the TCP and UDP protocols, or
     * an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the owner of the security group.
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
     * <code>vpc-id</code> - The ID of the VPC specified when the security group was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. If using multiple filters for rules, the results include security groups for which any
     *        combination of rules - not necessarily a single rule - match all filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.cidr</code> - An IPv4 CIDR block for an outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.from-port</code> - For an outbound rule, the start of port range for the TCP
     *        and UDP protocols, or an ICMP type number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.group-id</code> - The ID of a security group that has been referenced in an
     *        outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.group-name</code> - The name of a security group that has been referenced in an
     *        outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service to which a security
     *        group rule allows outbound access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.protocol</code> - The IP protocol for an outbound security group rule (
     *        <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.to-port</code> - For an outbound rule, the end of port range for the TCP and
     *        UDP protocols, or an ICMP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an
     *        outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-name</code> - The name of the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.cidr</code> - An IPv4 CIDR block for an inbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.from-port</code> - For an inbound rule, the start of port range for the TCP and UDP
     *        protocols, or an ICMP type number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.group-id</code> - The ID of a security group that has been referenced in an inbound
     *        security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.group-name</code> - The name of a security group that has been referenced in an
     *        inbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an inbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service from which a security group
     *        rule allows inbound access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.protocol</code> - The IP protocol for an inbound security group rule (<code>tcp</code>
     *        | <code>udp</code> | <code>icmp</code> or a protocol number).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.to-port</code> - For an inbound rule, the end of port range for the TCP and UDP
     *        protocols, or an ICMP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an inbound
     *        security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the owner of the security group.
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
     *        <code>vpc-id</code> - The ID of the VPC specified when the security group was created.
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
     * The filters. If using multiple filters for rules, the results include security groups for which any combination
     * of rules - not necessarily a single rule - match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.cidr</code> - An IPv4 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.from-port</code> - For an outbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-id</code> - The ID of a security group that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-name</code> - The name of a security group that has been referenced in an
     * outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service to which a security group
     * rule allows outbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.protocol</code> - The IP protocol for an outbound security group rule (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.to-port</code> - For an outbound rule, the end of port range for the TCP and UDP
     * protocols, or an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.cidr</code> - An IPv4 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.from-port</code> - For an inbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-id</code> - The ID of a security group that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-name</code> - The name of a security group that has been referenced in an inbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service from which a security group rule
     * allows inbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.protocol</code> - The IP protocol for an inbound security group rule (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.to-port</code> - For an inbound rule, the end of port range for the TCP and UDP protocols, or
     * an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the owner of the security group.
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
     * <code>vpc-id</code> - The ID of the VPC specified when the security group was created.
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
     *        The filters. If using multiple filters for rules, the results include security groups for which any
     *        combination of rules - not necessarily a single rule - match all filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.cidr</code> - An IPv4 CIDR block for an outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.from-port</code> - For an outbound rule, the start of port range for the TCP
     *        and UDP protocols, or an ICMP type number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.group-id</code> - The ID of a security group that has been referenced in an
     *        outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.group-name</code> - The name of a security group that has been referenced in an
     *        outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service to which a security
     *        group rule allows outbound access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.protocol</code> - The IP protocol for an outbound security group rule (
     *        <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.to-port</code> - For an outbound rule, the end of port range for the TCP and
     *        UDP protocols, or an ICMP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an
     *        outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-name</code> - The name of the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.cidr</code> - An IPv4 CIDR block for an inbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.from-port</code> - For an inbound rule, the start of port range for the TCP and UDP
     *        protocols, or an ICMP type number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.group-id</code> - The ID of a security group that has been referenced in an inbound
     *        security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.group-name</code> - The name of a security group that has been referenced in an
     *        inbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an inbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service from which a security group
     *        rule allows inbound access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.protocol</code> - The IP protocol for an inbound security group rule (<code>tcp</code>
     *        | <code>udp</code> | <code>icmp</code> or a protocol number).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.to-port</code> - For an inbound rule, the end of port range for the TCP and UDP
     *        protocols, or an ICMP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an inbound
     *        security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the owner of the security group.
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
     *        <code>vpc-id</code> - The ID of the VPC specified when the security group was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupsRequest withFilters(Filter... filters) {
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
     * The filters. If using multiple filters for rules, the results include security groups for which any combination
     * of rules - not necessarily a single rule - match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - The description of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.cidr</code> - An IPv4 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.from-port</code> - For an outbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-id</code> - The ID of a security group that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.group-name</code> - The name of a security group that has been referenced in an
     * outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an outbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service to which a security group
     * rule allows outbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.protocol</code> - The IP protocol for an outbound security group rule (
     * <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.to-port</code> - For an outbound rule, the end of port range for the TCP and UDP
     * protocols, or an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>egress.ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an outbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.cidr</code> - An IPv4 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.from-port</code> - For an inbound rule, the start of port range for the TCP and UDP
     * protocols, or an ICMP type number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-id</code> - The ID of a security group that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.group-name</code> - The name of a security group that has been referenced in an inbound
     * security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an inbound security group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service from which a security group rule
     * allows inbound access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.protocol</code> - The IP protocol for an inbound security group rule (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.to-port</code> - For an inbound rule, the end of port range for the TCP and UDP protocols, or
     * an ICMP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an inbound security
     * group rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the owner of the security group.
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
     * <code>vpc-id</code> - The ID of the VPC specified when the security group was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. If using multiple filters for rules, the results include security groups for which any
     *        combination of rules - not necessarily a single rule - match all filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.cidr</code> - An IPv4 CIDR block for an outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.from-port</code> - For an outbound rule, the start of port range for the TCP
     *        and UDP protocols, or an ICMP type number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.group-id</code> - The ID of a security group that has been referenced in an
     *        outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.group-name</code> - The name of a security group that has been referenced in an
     *        outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service to which a security
     *        group rule allows outbound access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.protocol</code> - The IP protocol for an outbound security group rule (
     *        <code>tcp</code> | <code>udp</code> | <code>icmp</code> or a protocol number).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.to-port</code> - For an outbound rule, the end of port range for the TCP and
     *        UDP protocols, or an ICMP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>egress.ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an
     *        outbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-name</code> - The name of the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.cidr</code> - An IPv4 CIDR block for an inbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.from-port</code> - For an inbound rule, the start of port range for the TCP and UDP
     *        protocols, or an ICMP type number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.group-id</code> - The ID of a security group that has been referenced in an inbound
     *        security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.group-name</code> - The name of a security group that has been referenced in an
     *        inbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.ipv6-cidr</code> - An IPv6 CIDR block for an inbound security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.prefix-list-id</code> - The ID (prefix) of the AWS service from which a security group
     *        rule allows inbound access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.protocol</code> - The IP protocol for an inbound security group rule (<code>tcp</code>
     *        | <code>udp</code> | <code>icmp</code> or a protocol number).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.to-port</code> - For an inbound rule, the end of port range for the TCP and UDP
     *        protocols, or an ICMP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-permission.user-id</code> - The ID of an AWS account that has been referenced in an inbound
     *        security group rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the owner of the security group.
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
     *        <code>vpc-id</code> - The ID of the VPC specified when the security group was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups. Required for security groups in a nondefault VPC.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     * 
     * @return The IDs of the security groups. Required for security groups in a nondefault VPC.</p>
     *         <p>
     *         Default: Describes all your security groups.
     */

    public java.util.List<String> getGroupIds() {
        if (groupIds == null) {
            groupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupIds;
    }

    /**
     * <p>
     * The IDs of the security groups. Required for security groups in a nondefault VPC.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     * 
     * @param groupIds
     *        The IDs of the security groups. Required for security groups in a nondefault VPC.</p>
     *        <p>
     *        Default: Describes all your security groups.
     */

    public void setGroupIds(java.util.Collection<String> groupIds) {
        if (groupIds == null) {
            this.groupIds = null;
            return;
        }

        this.groupIds = new com.amazonaws.internal.SdkInternalList<String>(groupIds);
    }

    /**
     * <p>
     * The IDs of the security groups. Required for security groups in a nondefault VPC.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupIds(java.util.Collection)} or {@link #withGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupIds
     *        The IDs of the security groups. Required for security groups in a nondefault VPC.</p>
     *        <p>
     *        Default: Describes all your security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupsRequest withGroupIds(String... groupIds) {
        if (this.groupIds == null) {
            setGroupIds(new com.amazonaws.internal.SdkInternalList<String>(groupIds.length));
        }
        for (String ele : groupIds) {
            this.groupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups. Required for security groups in a nondefault VPC.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     * 
     * @param groupIds
     *        The IDs of the security groups. Required for security groups in a nondefault VPC.</p>
     *        <p>
     *        Default: Describes all your security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupsRequest withGroupIds(java.util.Collection<String> groupIds) {
        setGroupIds(groupIds);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security group
     * name or the security group ID. For security groups in a nondefault VPC, use the <code>group-name</code> filter to
     * describe security groups by name.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     * 
     * @return [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security
     *         group name or the security group ID. For security groups in a nondefault VPC, use the
     *         <code>group-name</code> filter to describe security groups by name.</p>
     *         <p>
     *         Default: Describes all your security groups.
     */

    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupNames;
    }

    /**
     * <p>
     * [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security group
     * name or the security group ID. For security groups in a nondefault VPC, use the <code>group-name</code> filter to
     * describe security groups by name.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     * 
     * @param groupNames
     *        [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security
     *        group name or the security group ID. For security groups in a nondefault VPC, use the
     *        <code>group-name</code> filter to describe security groups by name.</p>
     *        <p>
     *        Default: Describes all your security groups.
     */

    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        this.groupNames = new com.amazonaws.internal.SdkInternalList<String>(groupNames);
    }

    /**
     * <p>
     * [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security group
     * name or the security group ID. For security groups in a nondefault VPC, use the <code>group-name</code> filter to
     * describe security groups by name.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupNames(java.util.Collection)} or {@link #withGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupNames
     *        [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security
     *        group name or the security group ID. For security groups in a nondefault VPC, use the
     *        <code>group-name</code> filter to describe security groups by name.</p>
     *        <p>
     *        Default: Describes all your security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupsRequest withGroupNames(String... groupNames) {
        if (this.groupNames == null) {
            setGroupNames(new com.amazonaws.internal.SdkInternalList<String>(groupNames.length));
        }
        for (String ele : groupNames) {
            this.groupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security group
     * name or the security group ID. For security groups in a nondefault VPC, use the <code>group-name</code> filter to
     * describe security groups by name.
     * </p>
     * <p>
     * Default: Describes all your security groups.
     * </p>
     * 
     * @param groupNames
     *        [EC2-Classic and default VPC only] The names of the security groups. You can specify either the security
     *        group name or the security group ID. For security groups in a nondefault VPC, use the
     *        <code>group-name</code> filter to describe security groups by name.</p>
     *        <p>
     *        Default: Describes all your security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupsRequest withGroupNames(java.util.Collection<String> groupNames) {
        setGroupNames(groupNames);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another request
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000. If this parameter is not
     * specified, then all results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        request with the returned <code>NextToken</code> value. This value can be between 5 and 1000. If this
     *        parameter is not specified, then all results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another request
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000. If this parameter is not
     * specified, then all results are returned.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         request with the returned <code>NextToken</code> value. This value can be between 5 and 1000. If this
     *         parameter is not specified, then all results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another request
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000. If this parameter is not
     * specified, then all results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        request with the returned <code>NextToken</code> value. This value can be between 5 and 1000. If this
     *        parameter is not specified, then all results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeSecurityGroupsRequest> getDryRunRequest() {
        Request<DescribeSecurityGroupsRequest> request = new DescribeSecurityGroupsRequestMarshaller().marshall(this);
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
        if (getGroupIds() != null)
            sb.append("GroupIds: ").append(getGroupIds()).append(",");
        if (getGroupNames() != null)
            sb.append("GroupNames: ").append(getGroupNames()).append(",");
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

        if (obj instanceof DescribeSecurityGroupsRequest == false)
            return false;
        DescribeSecurityGroupsRequest other = (DescribeSecurityGroupsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getGroupIds() == null ^ this.getGroupIds() == null)
            return false;
        if (other.getGroupIds() != null && other.getGroupIds().equals(this.getGroupIds()) == false)
            return false;
        if (other.getGroupNames() == null ^ this.getGroupNames() == null)
            return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false)
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
        hashCode = prime * hashCode + ((getGroupIds() == null) ? 0 : getGroupIds().hashCode());
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSecurityGroupsRequest clone() {
        return (DescribeSecurityGroupsRequest) super.clone();
    }
}

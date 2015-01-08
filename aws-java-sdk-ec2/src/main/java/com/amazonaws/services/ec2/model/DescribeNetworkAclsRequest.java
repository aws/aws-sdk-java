/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeNetworkAclsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeNetworkAcls(DescribeNetworkAclsRequest) DescribeNetworkAcls operation}.
 * <p>
 * Describes one or more of your network ACLs.
 * </p>
 * <p>
 * For more information about network ACLs, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeNetworkAcls(DescribeNetworkAclsRequest)
 */
public class DescribeNetworkAclsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeNetworkAclsRequest> {

    /**
     * One or more network ACL IDs. <p>Default: Describes all your network
     * ACLs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> networkAclIds;

    /**
     * One or more filters. <ul> <li>
     * <p><code>association.association-id</code> - The ID of an association
     * ID for the ACL. </li> <li> <p><code>association.network-acl-id</code>
     * - The ID of the network ACL involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>default</code> - Indicates
     * whether the ACL is the default network ACL for the VPC. </li> <li>
     * <p><code>entry.cidr</code> - The CIDR range specified in the entry.
     * </li> <li> <p><code>entry.egress</code> - Indicates whether the entry
     * applies to egress traffic. </li> <li> <p><code>entry.icmp.code</code>
     * - The ICMP code specified in the entry, if any. </li> <li>
     * <p><code>entry.icmp.type</code> - The ICMP type specified in the
     * entry, if any. </li> <li> <p><code>entry.port-range.from</code> - The
     * start of the port range specified in the entry. </li> <li>
     * <p><code>entry.port-range.to</code> - The end of the port range
     * specified in the entry. </li> <li> <p><code>entry.protocol</code> -
     * The protocol specified in the entry (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number). </li> <li>
     * <p><code>entry.rule-action</code> - Allows or denies the matching
     * traffic (<code>allow</code> | <code>deny</code>). </li> <li>
     * <p><code>entry.rule-number</code> - The number of an entry (in other
     * words, rule) in the ACL's set of entries. </li> <li>
     * <p><code>network-acl-id</code> - The ID of the network ACL. </li> <li>
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
     * network ACL. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more network ACL IDs. <p>Default: Describes all your network
     * ACLs.
     *
     * @return One or more network ACL IDs. <p>Default: Describes all your network
     *         ACLs.
     */
    public java.util.List<String> getNetworkAclIds() {
        if (networkAclIds == null) {
              networkAclIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              networkAclIds.setAutoConstruct(true);
        }
        return networkAclIds;
    }
    
    /**
     * One or more network ACL IDs. <p>Default: Describes all your network
     * ACLs.
     *
     * @param networkAclIds One or more network ACL IDs. <p>Default: Describes all your network
     *         ACLs.
     */
    public void setNetworkAclIds(java.util.Collection<String> networkAclIds) {
        if (networkAclIds == null) {
            this.networkAclIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> networkAclIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(networkAclIds.size());
        networkAclIdsCopy.addAll(networkAclIds);
        this.networkAclIds = networkAclIdsCopy;
    }
    
    /**
     * One or more network ACL IDs. <p>Default: Describes all your network
     * ACLs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclIds One or more network ACL IDs. <p>Default: Describes all your network
     *         ACLs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkAclsRequest withNetworkAclIds(String... networkAclIds) {
        if (getNetworkAclIds() == null) setNetworkAclIds(new java.util.ArrayList<String>(networkAclIds.length));
        for (String value : networkAclIds) {
            getNetworkAclIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more network ACL IDs. <p>Default: Describes all your network
     * ACLs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclIds One or more network ACL IDs. <p>Default: Describes all your network
     *         ACLs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkAclsRequest withNetworkAclIds(java.util.Collection<String> networkAclIds) {
        if (networkAclIds == null) {
            this.networkAclIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> networkAclIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(networkAclIds.size());
            networkAclIdsCopy.addAll(networkAclIds);
            this.networkAclIds = networkAclIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li>
     * <p><code>association.association-id</code> - The ID of an association
     * ID for the ACL. </li> <li> <p><code>association.network-acl-id</code>
     * - The ID of the network ACL involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>default</code> - Indicates
     * whether the ACL is the default network ACL for the VPC. </li> <li>
     * <p><code>entry.cidr</code> - The CIDR range specified in the entry.
     * </li> <li> <p><code>entry.egress</code> - Indicates whether the entry
     * applies to egress traffic. </li> <li> <p><code>entry.icmp.code</code>
     * - The ICMP code specified in the entry, if any. </li> <li>
     * <p><code>entry.icmp.type</code> - The ICMP type specified in the
     * entry, if any. </li> <li> <p><code>entry.port-range.from</code> - The
     * start of the port range specified in the entry. </li> <li>
     * <p><code>entry.port-range.to</code> - The end of the port range
     * specified in the entry. </li> <li> <p><code>entry.protocol</code> -
     * The protocol specified in the entry (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number). </li> <li>
     * <p><code>entry.rule-action</code> - Allows or denies the matching
     * traffic (<code>allow</code> | <code>deny</code>). </li> <li>
     * <p><code>entry.rule-number</code> - The number of an entry (in other
     * words, rule) in the ACL's set of entries. </li> <li>
     * <p><code>network-acl-id</code> - The ID of the network ACL. </li> <li>
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
     * network ACL. </li> </ul>
     *
     * @return One or more filters. <ul> <li>
     *         <p><code>association.association-id</code> - The ID of an association
     *         ID for the ACL. </li> <li> <p><code>association.network-acl-id</code>
     *         - The ID of the network ACL involved in the association. </li> <li>
     *         <p><code>association.subnet-id</code> - The ID of the subnet involved
     *         in the association. </li> <li> <p><code>default</code> - Indicates
     *         whether the ACL is the default network ACL for the VPC. </li> <li>
     *         <p><code>entry.cidr</code> - The CIDR range specified in the entry.
     *         </li> <li> <p><code>entry.egress</code> - Indicates whether the entry
     *         applies to egress traffic. </li> <li> <p><code>entry.icmp.code</code>
     *         - The ICMP code specified in the entry, if any. </li> <li>
     *         <p><code>entry.icmp.type</code> - The ICMP type specified in the
     *         entry, if any. </li> <li> <p><code>entry.port-range.from</code> - The
     *         start of the port range specified in the entry. </li> <li>
     *         <p><code>entry.port-range.to</code> - The end of the port range
     *         specified in the entry. </li> <li> <p><code>entry.protocol</code> -
     *         The protocol specified in the entry (<code>tcp</code> |
     *         <code>udp</code> | <code>icmp</code> or a protocol number). </li> <li>
     *         <p><code>entry.rule-action</code> - Allows or denies the matching
     *         traffic (<code>allow</code> | <code>deny</code>). </li> <li>
     *         <p><code>entry.rule-number</code> - The number of an entry (in other
     *         words, rule) in the ACL's set of entries. </li> <li>
     *         <p><code>network-acl-id</code> - The ID of the network ACL. </li> <li>
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
     *         network ACL. </li> </ul>
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
     * <p><code>association.association-id</code> - The ID of an association
     * ID for the ACL. </li> <li> <p><code>association.network-acl-id</code>
     * - The ID of the network ACL involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>default</code> - Indicates
     * whether the ACL is the default network ACL for the VPC. </li> <li>
     * <p><code>entry.cidr</code> - The CIDR range specified in the entry.
     * </li> <li> <p><code>entry.egress</code> - Indicates whether the entry
     * applies to egress traffic. </li> <li> <p><code>entry.icmp.code</code>
     * - The ICMP code specified in the entry, if any. </li> <li>
     * <p><code>entry.icmp.type</code> - The ICMP type specified in the
     * entry, if any. </li> <li> <p><code>entry.port-range.from</code> - The
     * start of the port range specified in the entry. </li> <li>
     * <p><code>entry.port-range.to</code> - The end of the port range
     * specified in the entry. </li> <li> <p><code>entry.protocol</code> -
     * The protocol specified in the entry (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number). </li> <li>
     * <p><code>entry.rule-action</code> - Allows or denies the matching
     * traffic (<code>allow</code> | <code>deny</code>). </li> <li>
     * <p><code>entry.rule-number</code> - The number of an entry (in other
     * words, rule) in the ACL's set of entries. </li> <li>
     * <p><code>network-acl-id</code> - The ID of the network ACL. </li> <li>
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
     * network ACL. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>association.association-id</code> - The ID of an association
     *         ID for the ACL. </li> <li> <p><code>association.network-acl-id</code>
     *         - The ID of the network ACL involved in the association. </li> <li>
     *         <p><code>association.subnet-id</code> - The ID of the subnet involved
     *         in the association. </li> <li> <p><code>default</code> - Indicates
     *         whether the ACL is the default network ACL for the VPC. </li> <li>
     *         <p><code>entry.cidr</code> - The CIDR range specified in the entry.
     *         </li> <li> <p><code>entry.egress</code> - Indicates whether the entry
     *         applies to egress traffic. </li> <li> <p><code>entry.icmp.code</code>
     *         - The ICMP code specified in the entry, if any. </li> <li>
     *         <p><code>entry.icmp.type</code> - The ICMP type specified in the
     *         entry, if any. </li> <li> <p><code>entry.port-range.from</code> - The
     *         start of the port range specified in the entry. </li> <li>
     *         <p><code>entry.port-range.to</code> - The end of the port range
     *         specified in the entry. </li> <li> <p><code>entry.protocol</code> -
     *         The protocol specified in the entry (<code>tcp</code> |
     *         <code>udp</code> | <code>icmp</code> or a protocol number). </li> <li>
     *         <p><code>entry.rule-action</code> - Allows or denies the matching
     *         traffic (<code>allow</code> | <code>deny</code>). </li> <li>
     *         <p><code>entry.rule-number</code> - The number of an entry (in other
     *         words, rule) in the ACL's set of entries. </li> <li>
     *         <p><code>network-acl-id</code> - The ID of the network ACL. </li> <li>
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
     *         network ACL. </li> </ul>
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
     * <p><code>association.association-id</code> - The ID of an association
     * ID for the ACL. </li> <li> <p><code>association.network-acl-id</code>
     * - The ID of the network ACL involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>default</code> - Indicates
     * whether the ACL is the default network ACL for the VPC. </li> <li>
     * <p><code>entry.cidr</code> - The CIDR range specified in the entry.
     * </li> <li> <p><code>entry.egress</code> - Indicates whether the entry
     * applies to egress traffic. </li> <li> <p><code>entry.icmp.code</code>
     * - The ICMP code specified in the entry, if any. </li> <li>
     * <p><code>entry.icmp.type</code> - The ICMP type specified in the
     * entry, if any. </li> <li> <p><code>entry.port-range.from</code> - The
     * start of the port range specified in the entry. </li> <li>
     * <p><code>entry.port-range.to</code> - The end of the port range
     * specified in the entry. </li> <li> <p><code>entry.protocol</code> -
     * The protocol specified in the entry (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number). </li> <li>
     * <p><code>entry.rule-action</code> - Allows or denies the matching
     * traffic (<code>allow</code> | <code>deny</code>). </li> <li>
     * <p><code>entry.rule-number</code> - The number of an entry (in other
     * words, rule) in the ACL's set of entries. </li> <li>
     * <p><code>network-acl-id</code> - The ID of the network ACL. </li> <li>
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
     * network ACL. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>association.association-id</code> - The ID of an association
     *         ID for the ACL. </li> <li> <p><code>association.network-acl-id</code>
     *         - The ID of the network ACL involved in the association. </li> <li>
     *         <p><code>association.subnet-id</code> - The ID of the subnet involved
     *         in the association. </li> <li> <p><code>default</code> - Indicates
     *         whether the ACL is the default network ACL for the VPC. </li> <li>
     *         <p><code>entry.cidr</code> - The CIDR range specified in the entry.
     *         </li> <li> <p><code>entry.egress</code> - Indicates whether the entry
     *         applies to egress traffic. </li> <li> <p><code>entry.icmp.code</code>
     *         - The ICMP code specified in the entry, if any. </li> <li>
     *         <p><code>entry.icmp.type</code> - The ICMP type specified in the
     *         entry, if any. </li> <li> <p><code>entry.port-range.from</code> - The
     *         start of the port range specified in the entry. </li> <li>
     *         <p><code>entry.port-range.to</code> - The end of the port range
     *         specified in the entry. </li> <li> <p><code>entry.protocol</code> -
     *         The protocol specified in the entry (<code>tcp</code> |
     *         <code>udp</code> | <code>icmp</code> or a protocol number). </li> <li>
     *         <p><code>entry.rule-action</code> - Allows or denies the matching
     *         traffic (<code>allow</code> | <code>deny</code>). </li> <li>
     *         <p><code>entry.rule-number</code> - The number of an entry (in other
     *         words, rule) in the ACL's set of entries. </li> <li>
     *         <p><code>network-acl-id</code> - The ID of the network ACL. </li> <li>
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
     *         network ACL. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkAclsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li>
     * <p><code>association.association-id</code> - The ID of an association
     * ID for the ACL. </li> <li> <p><code>association.network-acl-id</code>
     * - The ID of the network ACL involved in the association. </li> <li>
     * <p><code>association.subnet-id</code> - The ID of the subnet involved
     * in the association. </li> <li> <p><code>default</code> - Indicates
     * whether the ACL is the default network ACL for the VPC. </li> <li>
     * <p><code>entry.cidr</code> - The CIDR range specified in the entry.
     * </li> <li> <p><code>entry.egress</code> - Indicates whether the entry
     * applies to egress traffic. </li> <li> <p><code>entry.icmp.code</code>
     * - The ICMP code specified in the entry, if any. </li> <li>
     * <p><code>entry.icmp.type</code> - The ICMP type specified in the
     * entry, if any. </li> <li> <p><code>entry.port-range.from</code> - The
     * start of the port range specified in the entry. </li> <li>
     * <p><code>entry.port-range.to</code> - The end of the port range
     * specified in the entry. </li> <li> <p><code>entry.protocol</code> -
     * The protocol specified in the entry (<code>tcp</code> |
     * <code>udp</code> | <code>icmp</code> or a protocol number). </li> <li>
     * <p><code>entry.rule-action</code> - Allows or denies the matching
     * traffic (<code>allow</code> | <code>deny</code>). </li> <li>
     * <p><code>entry.rule-number</code> - The number of an entry (in other
     * words, rule) in the ACL's set of entries. </li> <li>
     * <p><code>network-acl-id</code> - The ID of the network ACL. </li> <li>
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
     * network ACL. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li>
     *         <p><code>association.association-id</code> - The ID of an association
     *         ID for the ACL. </li> <li> <p><code>association.network-acl-id</code>
     *         - The ID of the network ACL involved in the association. </li> <li>
     *         <p><code>association.subnet-id</code> - The ID of the subnet involved
     *         in the association. </li> <li> <p><code>default</code> - Indicates
     *         whether the ACL is the default network ACL for the VPC. </li> <li>
     *         <p><code>entry.cidr</code> - The CIDR range specified in the entry.
     *         </li> <li> <p><code>entry.egress</code> - Indicates whether the entry
     *         applies to egress traffic. </li> <li> <p><code>entry.icmp.code</code>
     *         - The ICMP code specified in the entry, if any. </li> <li>
     *         <p><code>entry.icmp.type</code> - The ICMP type specified in the
     *         entry, if any. </li> <li> <p><code>entry.port-range.from</code> - The
     *         start of the port range specified in the entry. </li> <li>
     *         <p><code>entry.port-range.to</code> - The end of the port range
     *         specified in the entry. </li> <li> <p><code>entry.protocol</code> -
     *         The protocol specified in the entry (<code>tcp</code> |
     *         <code>udp</code> | <code>icmp</code> or a protocol number). </li> <li>
     *         <p><code>entry.rule-action</code> - Allows or denies the matching
     *         traffic (<code>allow</code> | <code>deny</code>). </li> <li>
     *         <p><code>entry.rule-number</code> - The number of an entry (in other
     *         words, rule) in the ACL's set of entries. </li> <li>
     *         <p><code>network-acl-id</code> - The ID of the network ACL. </li> <li>
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
     *         network ACL. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkAclsRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeNetworkAclsRequest> getDryRunRequest() {
        Request<DescribeNetworkAclsRequest> request = new DescribeNetworkAclsRequestMarshaller().marshall(this);
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
        if (getNetworkAclIds() != null) sb.append("NetworkAclIds: " + getNetworkAclIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkAclIds() == null) ? 0 : getNetworkAclIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNetworkAclsRequest == false) return false;
        DescribeNetworkAclsRequest other = (DescribeNetworkAclsRequest)obj;
        
        if (other.getNetworkAclIds() == null ^ this.getNetworkAclIds() == null) return false;
        if (other.getNetworkAclIds() != null && other.getNetworkAclIds().equals(this.getNetworkAclIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    
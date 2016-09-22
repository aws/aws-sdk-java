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
import com.amazonaws.services.ec2.model.transform.DescribeNetworkAclsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeNetworkAcls.
 * </p>
 */
public class DescribeNetworkAclsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeNetworkAclsRequest> {

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
     * <code>entry.cidr</code> - The CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.egress</code> - Indicates whether the entry applies to egress traffic.
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
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the ACL's set of entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
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
     * <code>entry.cidr</code> - The CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.egress</code> - Indicates whether the entry applies to egress traffic.
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
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the ACL's set of entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
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
     *         <code>entry.cidr</code> - The CIDR range specified in the entry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>entry.egress</code> - Indicates whether the entry applies to egress traffic.
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
     *         <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the ACL's set of
     *         entries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-acl-id</code> - The ID of the network ACL.
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
     * <code>entry.cidr</code> - The CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.egress</code> - Indicates whether the entry applies to egress traffic.
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
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the ACL's set of entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
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
     *        <code>entry.cidr</code> - The CIDR range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.egress</code> - Indicates whether the entry applies to egress traffic.
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
     *        <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the ACL's set of
     *        entries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-acl-id</code> - The ID of the network ACL.
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
     * <code>entry.cidr</code> - The CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.egress</code> - Indicates whether the entry applies to egress traffic.
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
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the ACL's set of entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
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
     *        <code>entry.cidr</code> - The CIDR range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.egress</code> - Indicates whether the entry applies to egress traffic.
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
     *        <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the ACL's set of
     *        entries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-acl-id</code> - The ID of the network ACL.
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
     * <code>entry.cidr</code> - The CIDR range specified in the entry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>entry.egress</code> - Indicates whether the entry applies to egress traffic.
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
     * <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the ACL's set of entries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-acl-id</code> - The ID of the network ACL.
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
     *        <code>entry.cidr</code> - The CIDR range specified in the entry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>entry.egress</code> - Indicates whether the entry applies to egress traffic.
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
     *        <code>entry.rule-number</code> - The number of an entry (in other words, rule) in the ACL's set of
     *        entries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-acl-id</code> - The ID of the network ACL.
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
        if (getNetworkAclIds() != null)
            sb.append("NetworkAclIds: " + getNetworkAclIds() + ",");
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

        if (obj instanceof DescribeNetworkAclsRequest == false)
            return false;
        DescribeNetworkAclsRequest other = (DescribeNetworkAclsRequest) obj;
        if (other.getNetworkAclIds() == null ^ this.getNetworkAclIds() == null)
            return false;
        if (other.getNetworkAclIds() != null && other.getNetworkAclIds().equals(this.getNetworkAclIds()) == false)
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

        hashCode = prime * hashCode + ((getNetworkAclIds() == null) ? 0 : getNetworkAclIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkAclsRequest clone() {
        return (DescribeNetworkAclsRequest) super.clone();
    }
}

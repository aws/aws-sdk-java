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
import com.amazonaws.services.ec2.model.transform.DescribeSubnetsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSubnetsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeSubnetsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the subnet. You can also use
     * <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for the subnet. You can also use
     * <code>availabilityZoneId</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match the
     * subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default subnet for the Availability Zone. You can
     * also use <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association ID for an IPv6 CIDR block associated
     * with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for the subnet. You can also use
     * <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for the subnet. You can also use
     * <code>availabilityZoneId</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match the
     * subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default subnet for the Availability Zone. You can
     * also use <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association ID for an IPv6 CIDR block associated
     * with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone for the subnet. You can also use
     *         <code>availabilityZone</code> as the filter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone-id</code> - The ID of the Availability Zone for the subnet. You can also use
     *         <code>availabilityZoneId</code> as the filter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available-ip-address-count</code> - The number of IPv4 addresses in the subnet that are available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly
     *         match the subnet's CIDR block for information to be returned for the subnet. You can also use
     *         <code>cidr</code> or <code>cidrBlock</code> as the filter names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>default-for-az</code> - Indicates whether this is the default subnet for the Availability Zone. You
     *         can also use <code>defaultForAz</code> as the filter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-cidr-block-association.association-id</code> - An association ID for an IPv6 CIDR block
     *         associated with the subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the
     *         subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-id</code> - The ID of the subnet.
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
     *         <code>vpc-id</code> - The ID of the VPC for the subnet.
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
     * <code>availability-zone</code> - The Availability Zone for the subnet. You can also use
     * <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for the subnet. You can also use
     * <code>availabilityZoneId</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match the
     * subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default subnet for the Availability Zone. You can
     * also use <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association ID for an IPv6 CIDR block associated
     * with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone for the subnet. You can also use
     *        <code>availabilityZone</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone-id</code> - The ID of the Availability Zone for the subnet. You can also use
     *        <code>availabilityZoneId</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available-ip-address-count</code> - The number of IPv4 addresses in the subnet that are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match
     *        the subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code>
     *        or <code>cidrBlock</code> as the filter names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default-for-az</code> - Indicates whether this is the default subnet for the Availability Zone. You
     *        can also use <code>defaultForAz</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.association-id</code> - An association ID for an IPv6 CIDR block
     *        associated with the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the
     *        subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet.
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
     *        <code>vpc-id</code> - The ID of the VPC for the subnet.
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
     * <code>availability-zone</code> - The Availability Zone for the subnet. You can also use
     * <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for the subnet. You can also use
     * <code>availabilityZoneId</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match the
     * subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default subnet for the Availability Zone. You can
     * also use <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association ID for an IPv6 CIDR block associated
     * with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
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
     *        <code>availability-zone</code> - The Availability Zone for the subnet. You can also use
     *        <code>availabilityZone</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone-id</code> - The ID of the Availability Zone for the subnet. You can also use
     *        <code>availabilityZoneId</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available-ip-address-count</code> - The number of IPv4 addresses in the subnet that are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match
     *        the subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code>
     *        or <code>cidrBlock</code> as the filter names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default-for-az</code> - Indicates whether this is the default subnet for the Availability Zone. You
     *        can also use <code>defaultForAz</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.association-id</code> - An association ID for an IPv6 CIDR block
     *        associated with the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the
     *        subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet.
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
     *        <code>vpc-id</code> - The ID of the VPC for the subnet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubnetsRequest withFilters(Filter... filters) {
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
     * <code>availability-zone</code> - The Availability Zone for the subnet. You can also use
     * <code>availabilityZone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The ID of the Availability Zone for the subnet. You can also use
     * <code>availabilityZoneId</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IPv4 addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match the
     * subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidrBlock</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-for-az</code> - Indicates whether this is the default subnet for the Availability Zone. You can
     * also use <code>defaultForAz</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - An association ID for an IPv6 CIDR block associated
     * with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone for the subnet. You can also use
     *        <code>availabilityZone</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone-id</code> - The ID of the Availability Zone for the subnet. You can also use
     *        <code>availabilityZoneId</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available-ip-address-count</code> - The number of IPv4 addresses in the subnet that are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block</code> - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match
     *        the subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code>
     *        or <code>cidrBlock</code> as the filter names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default-for-az</code> - Indicates whether this is the default subnet for the Availability Zone. You
     *        can also use <code>defaultForAz</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.association-id</code> - An association ID for an IPv6 CIDR block
     *        associated with the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the
     *        subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-arn</code> - The Amazon Resource Name (ARN) of the subnet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet.
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
     *        <code>vpc-id</code> - The ID of the VPC for the subnet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubnetsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     * 
     * @return One or more subnet IDs.</p>
     *         <p>
     *         Default: Describes all your subnets.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     * 
     * @param subnetIds
     *        One or more subnet IDs.</p>
     *        <p>
     *        Default: Describes all your subnets.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        One or more subnet IDs.</p>
     *        <p>
     *        Default: Describes all your subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubnetsRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more subnet IDs.
     * </p>
     * <p>
     * Default: Describes all your subnets.
     * </p>
     * 
     * @param subnetIds
     *        One or more subnet IDs.</p>
     *        <p>
     *        Default: Describes all your subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubnetsRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeSubnetsRequest> getDryRunRequest() {
        Request<DescribeSubnetsRequest> request = new DescribeSubnetsRequestMarshaller().marshall(this);
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSubnetsRequest == false)
            return false;
        DescribeSubnetsRequest other = (DescribeSubnetsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubnetsRequest clone() {
        return (DescribeSubnetsRequest) super.clone();
    }
}

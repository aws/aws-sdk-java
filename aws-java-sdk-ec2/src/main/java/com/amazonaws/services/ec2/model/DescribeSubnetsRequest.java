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
import com.amazonaws.services.ec2.model.transform.DescribeSubnetsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeSubnets.
 * </p>
 */
public class DescribeSubnetsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeSubnetsRequest> {

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
     * <code>availabilityZone</code> - The Availability Zone for the subnet. You can also use
     * <code>availability-zone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IP addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidrBlock</code> - The CIDR block of the subnet. The CIDR block you specify must exactly match the subnet's
     * CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidr-block</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>defaultForAz</code> - Indicates whether this is the default subnet for the Availability Zone. You can also
     * use <code>default-for-az</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availabilityZone</code> - The Availability Zone for the subnet. You can also use
     * <code>availability-zone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IP addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidrBlock</code> - The CIDR block of the subnet. The CIDR block you specify must exactly match the subnet's
     * CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidr-block</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>defaultForAz</code> - Indicates whether this is the default subnet for the Availability Zone. You can also
     * use <code>default-for-az</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     * <code>vpc-id</code> - The ID of the VPC for the subnet.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availabilityZone</code> - The Availability Zone for the subnet. You can also use
     *         <code>availability-zone</code> as the filter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available-ip-address-count</code> - The number of IP addresses in the subnet that are available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cidrBlock</code> - The CIDR block of the subnet. The CIDR block you specify must exactly match the
     *         subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     *         <code>cidr-block</code> as the filter names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>defaultForAz</code> - Indicates whether this is the default subnet for the Availability Zone. You
     *         can also use <code>default-for-az</code> as the filter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-id</code> - The ID of the subnet.
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
     * <code>availabilityZone</code> - The Availability Zone for the subnet. You can also use
     * <code>availability-zone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IP addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidrBlock</code> - The CIDR block of the subnet. The CIDR block you specify must exactly match the subnet's
     * CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidr-block</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>defaultForAz</code> - Indicates whether this is the default subnet for the Availability Zone. You can also
     * use <code>default-for-az</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     *        <code>availabilityZone</code> - The Availability Zone for the subnet. You can also use
     *        <code>availability-zone</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available-ip-address-count</code> - The number of IP addresses in the subnet that are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidrBlock</code> - The CIDR block of the subnet. The CIDR block you specify must exactly match the
     *        subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     *        <code>cidr-block</code> as the filter names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>defaultForAz</code> - Indicates whether this is the default subnet for the Availability Zone. You
     *        can also use <code>default-for-az</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet.
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
     * <code>availabilityZone</code> - The Availability Zone for the subnet. You can also use
     * <code>availability-zone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IP addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidrBlock</code> - The CIDR block of the subnet. The CIDR block you specify must exactly match the subnet's
     * CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidr-block</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>defaultForAz</code> - Indicates whether this is the default subnet for the Availability Zone. You can also
     * use <code>default-for-az</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     *        <code>availabilityZone</code> - The Availability Zone for the subnet. You can also use
     *        <code>availability-zone</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available-ip-address-count</code> - The number of IP addresses in the subnet that are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidrBlock</code> - The CIDR block of the subnet. The CIDR block you specify must exactly match the
     *        subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     *        <code>cidr-block</code> as the filter names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>defaultForAz</code> - Indicates whether this is the default subnet for the Availability Zone. You
     *        can also use <code>default-for-az</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet.
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
     * <code>availabilityZone</code> - The Availability Zone for the subnet. You can also use
     * <code>availability-zone</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available-ip-address-count</code> - The number of IP addresses in the subnet that are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidrBlock</code> - The CIDR block of the subnet. The CIDR block you specify must exactly match the subnet's
     * CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     * <code>cidr-block</code> as the filter names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>defaultForAz</code> - Indicates whether this is the default subnet for the Availability Zone. You can also
     * use <code>default-for-az</code> as the filter name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet.
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
     *        <code>availabilityZone</code> - The Availability Zone for the subnet. You can also use
     *        <code>availability-zone</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available-ip-address-count</code> - The number of IP addresses in the subnet that are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidrBlock</code> - The CIDR block of the subnet. The CIDR block you specify must exactly match the
     *        subnet's CIDR block for information to be returned for the subnet. You can also use <code>cidr</code> or
     *        <code>cidr-block</code> as the filter names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>defaultForAz</code> - Indicates whether this is the default subnet for the Availability Zone. You
     *        can also use <code>default-for-az</code> as the filter name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the subnet (<code>pending</code> | <code>available</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet.
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
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

        if (obj instanceof DescribeSubnetsRequest == false)
            return false;
        DescribeSubnetsRequest other = (DescribeSubnetsRequest) obj;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
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

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubnetsRequest clone() {
        return (DescribeSubnetsRequest) super.clone();
    }
}

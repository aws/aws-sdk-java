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
import com.amazonaws.services.ec2.model.transform.DescribeReservedInstancesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeReservedInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeReservedInstancesRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone where the Reserved Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year or three years), in seconds (
     * <code>31536000</code> | <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase request was placed (for example,
     * 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (<code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     */
    private String offeringClass;
    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise specified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> reservedInstancesIds;
    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only
     * have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     */
    private String offeringType;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone where the Reserved Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year or three years), in seconds (
     * <code>31536000</code> | <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase request was placed (for example,
     * 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (<code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone where the Reserved Instance can be used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>duration</code> - The duration of the Reserved Instance (one year or three years), in seconds (
     *         <code>31536000</code> | <code>94608000</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>end</code> - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fixed-price</code> - The purchase price of the Reserved Instance (for example, 9800.0).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type that is covered by the reservation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>scope</code> - The scope of the Reserved Instance (<code>Region</code> or
     *         <code>Availability Zone</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-description</code> - The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the product platform description will only be displayed to
     *         EC2-Classic account holders and are for use with Amazon VPC (<code>Linux/UNIX</code> |
     *         <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *         <code>Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *         <code>Windows</code> | <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server Standard</code>
     *         | <code>Windows with SQL Server Standard (Amazon VPC)</code> | <code>Windows with SQL Server Web</code> |
     *         <code>Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with SQL Server Enterprise</code> |
     *         <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start</code> - The time at which the Reserved Instance purchase request was placed (for example,
     *         2014-08-07T11:54:42.000Z).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the Reserved Instance (<code>payment-pending</code> |
     *         <code>active</code> | <code>payment-failed</code> | <code>retired</code>).
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
     *         <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
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
     * <code>availability-zone</code> - The Availability Zone where the Reserved Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year or three years), in seconds (
     * <code>31536000</code> | <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase request was placed (for example,
     * 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (<code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone where the Reserved Instance can be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>duration</code> - The duration of the Reserved Instance (one year or three years), in seconds (
     *        <code>31536000</code> | <code>94608000</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end</code> - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fixed-price</code> - The purchase price of the Reserved Instance (for example, 9800.0).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type that is covered by the reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scope</code> - The scope of the Reserved Instance (<code>Region</code> or
     *        <code>Availability Zone</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The Reserved Instance product platform description. Instances that
     *        include <code>(Amazon VPC)</code> in the product platform description will only be displayed to
     *        EC2-Classic account holders and are for use with Amazon VPC (<code>Linux/UNIX</code> |
     *        <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *        <code>Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *        <code>Windows</code> | <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server Standard</code> |
     *        <code>Windows with SQL Server Standard (Amazon VPC)</code> | <code>Windows with SQL Server Web</code> |
     *        <code>Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with SQL Server Enterprise</code> |
     *        <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start</code> - The time at which the Reserved Instance purchase request was placed (for example,
     *        2014-08-07T11:54:42.000Z).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Reserved Instance (<code>payment-pending</code> |
     *        <code>active</code> | <code>payment-failed</code> | <code>retired</code>).
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
     *        <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
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
     * <code>availability-zone</code> - The Availability Zone where the Reserved Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year or three years), in seconds (
     * <code>31536000</code> | <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase request was placed (for example,
     * 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (<code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
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
     *        <code>availability-zone</code> - The Availability Zone where the Reserved Instance can be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>duration</code> - The duration of the Reserved Instance (one year or three years), in seconds (
     *        <code>31536000</code> | <code>94608000</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end</code> - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fixed-price</code> - The purchase price of the Reserved Instance (for example, 9800.0).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type that is covered by the reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scope</code> - The scope of the Reserved Instance (<code>Region</code> or
     *        <code>Availability Zone</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The Reserved Instance product platform description. Instances that
     *        include <code>(Amazon VPC)</code> in the product platform description will only be displayed to
     *        EC2-Classic account holders and are for use with Amazon VPC (<code>Linux/UNIX</code> |
     *        <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *        <code>Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *        <code>Windows</code> | <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server Standard</code> |
     *        <code>Windows with SQL Server Standard (Amazon VPC)</code> | <code>Windows with SQL Server Web</code> |
     *        <code>Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with SQL Server Enterprise</code> |
     *        <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start</code> - The time at which the Reserved Instance purchase request was placed (for example,
     *        2014-08-07T11:54:42.000Z).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Reserved Instance (<code>payment-pending</code> |
     *        <code>active</code> | <code>payment-failed</code> | <code>retired</code>).
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
     *        <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withFilters(Filter... filters) {
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
     * <code>availability-zone</code> - The Availability Zone where the Reserved Instance can be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>duration</code> - The duration of the Reserved Instance (one year or three years), in seconds (
     * <code>31536000</code> | <code>94608000</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end</code> - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fixed-price</code> - The purchase price of the Reserved Instance (for example, 9800.0).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type that is covered by the reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Region</code> or <code>Availability Zone</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code>Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start</code> - The time at which the Reserved Instance purchase request was placed (for example,
     * 2014-08-07T11:54:42.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Reserved Instance (<code>payment-pending</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>).
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
     * <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone where the Reserved Instance can be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>duration</code> - The duration of the Reserved Instance (one year or three years), in seconds (
     *        <code>31536000</code> | <code>94608000</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end</code> - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fixed-price</code> - The purchase price of the Reserved Instance (for example, 9800.0).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type that is covered by the reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scope</code> - The scope of the Reserved Instance (<code>Region</code> or
     *        <code>Availability Zone</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The Reserved Instance product platform description. Instances that
     *        include <code>(Amazon VPC)</code> in the product platform description will only be displayed to
     *        EC2-Classic account holders and are for use with Amazon VPC (<code>Linux/UNIX</code> |
     *        <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *        <code>Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *        <code>Windows</code> | <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server Standard</code> |
     *        <code>Windows with SQL Server Standard (Amazon VPC)</code> | <code>Windows with SQL Server Web</code> |
     *        <code>Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with SQL Server Enterprise</code> |
     *        <code>Windows with SQL Server Enterprise (Amazon VPC)</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-id</code> - The ID of the Reserved Instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start</code> - The time at which the Reserved Instance purchase request was placed (for example,
     *        2014-08-07T11:54:42.000Z).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Reserved Instance (<code>payment-pending</code> |
     *        <code>active</code> | <code>payment-failed</code> | <code>retired</code>).
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
     *        <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * 
     * @param offeringClass
     *        Describes whether the Reserved Instance is Standard or Convertible.
     * @see OfferingClassType
     */

    public void setOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * 
     * @return Describes whether the Reserved Instance is Standard or Convertible.
     * @see OfferingClassType
     */

    public String getOfferingClass() {
        return this.offeringClass;
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * 
     * @param offeringClass
     *        Describes whether the Reserved Instance is Standard or Convertible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClassType
     */

    public DescribeReservedInstancesRequest withOfferingClass(String offeringClass) {
        setOfferingClass(offeringClass);
        return this;
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * 
     * @param offeringClass
     *        Describes whether the Reserved Instance is Standard or Convertible.
     * @see OfferingClassType
     */

    public void setOfferingClass(OfferingClassType offeringClass) {
        withOfferingClass(offeringClass);
    }

    /**
     * <p>
     * Describes whether the Reserved Instance is Standard or Convertible.
     * </p>
     * 
     * @param offeringClass
     *        Describes whether the Reserved Instance is Standard or Convertible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClassType
     */

    public DescribeReservedInstancesRequest withOfferingClass(OfferingClassType offeringClass) {
        this.offeringClass = offeringClass.toString();
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise specified.
     * </p>
     * 
     * @return One or more Reserved Instance IDs.</p>
     *         <p>
     *         Default: Describes all your Reserved Instances, or only those otherwise specified.
     */

    public java.util.List<String> getReservedInstancesIds() {
        if (reservedInstancesIds == null) {
            reservedInstancesIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return reservedInstancesIds;
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise specified.
     * </p>
     * 
     * @param reservedInstancesIds
     *        One or more Reserved Instance IDs.</p>
     *        <p>
     *        Default: Describes all your Reserved Instances, or only those otherwise specified.
     */

    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }

        this.reservedInstancesIds = new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesIds);
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstancesIds(java.util.Collection)} or {@link #withReservedInstancesIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstancesIds
     *        One or more Reserved Instance IDs.</p>
     *        <p>
     *        Default: Describes all your Reserved Instances, or only those otherwise specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        if (this.reservedInstancesIds == null) {
            setReservedInstancesIds(new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesIds.length));
        }
        for (String ele : reservedInstancesIds) {
            this.reservedInstancesIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * <p>
     * Default: Describes all your Reserved Instances, or only those otherwise specified.
     * </p>
     * 
     * @param reservedInstancesIds
     *        One or more Reserved Instance IDs.</p>
     *        <p>
     *        Default: Describes all your Reserved Instances, or only those otherwise specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        setReservedInstancesIds(reservedInstancesIds);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only
     * have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you
     *        only have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * @see OfferingTypeValues
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only
     * have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * 
     * @return The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you
     *         only have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * @see OfferingTypeValues
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only
     * have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you
     *        only have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingTypeValues
     */

    public DescribeReservedInstancesRequest withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only
     * have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you
     *        only have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * @see OfferingTypeValues
     */

    public void setOfferingType(OfferingTypeValues offeringType) {
        withOfferingType(offeringType);
    }

    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only
     * have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you
     *        only have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingTypeValues
     */

    public DescribeReservedInstancesRequest withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeReservedInstancesRequest> getDryRunRequest() {
        Request<DescribeReservedInstancesRequest> request = new DescribeReservedInstancesRequestMarshaller().marshall(this);
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
        if (getOfferingClass() != null)
            sb.append("OfferingClass: ").append(getOfferingClass()).append(",");
        if (getReservedInstancesIds() != null)
            sb.append("ReservedInstancesIds: ").append(getReservedInstancesIds()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstancesRequest == false)
            return false;
        DescribeReservedInstancesRequest other = (DescribeReservedInstancesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getOfferingClass() == null ^ this.getOfferingClass() == null)
            return false;
        if (other.getOfferingClass() != null && other.getOfferingClass().equals(this.getOfferingClass()) == false)
            return false;
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null)
            return false;
        if (other.getReservedInstancesIds() != null && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getOfferingClass() == null) ? 0 : getOfferingClass().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesRequest clone() {
        return (DescribeReservedInstancesRequest) super.clone();
    }
}

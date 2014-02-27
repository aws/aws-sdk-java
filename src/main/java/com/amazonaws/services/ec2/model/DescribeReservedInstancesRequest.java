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
import com.amazonaws.services.ec2.model.transform.DescribeReservedInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstances(DescribeReservedInstancesRequest) DescribeReservedInstances operation}.
 * <p>
 * Describes one or more of the Reserved Instances that you purchased.
 * </p>
 * <p>
 * For more information about Reserved Instances, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"> Reserved Instances </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstances(DescribeReservedInstancesRequest)
 */
public class DescribeReservedInstancesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeReservedInstancesRequest> {

    /**
     * One or more Reserved Instance IDs. <p>Default: Describes all your
     * Reserved Instances, or only those otherwise specified.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesIds;

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (one
     * year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>end</code> - The time when
     * the Reserved Instance expires. </li> <li> <p><code>fixed-price</code>
     * - The purchase price of the Reserved Instance (for example, 9800.0).
     * </li> <li> <p><code>instance-type</code> - The instance type on which
     * the Reserved Instance can be used. </li> <li>
     * <p><code>product-description</code> - The product description of the
     * Reserved Instance (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>Windows</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>reserved-instances-id</code> - The
     * ID of the Reserved Instance. </li> <li> <p><code>start</code> - The
     * time at which the Reserved Instance purchase request was placed. </li>
     * <li> <p><code>state</code> - The state of the Reserved Instance
     * (<code>pending-payment</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>). </li> <li>
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
     * filter. </li> <li> <p><code>usage-price</code> - The usage price of
     * the Reserved Instance, per hour (for example, 0.84). </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     */
    private String offeringType;

    /**
     * One or more Reserved Instance IDs. <p>Default: Describes all your
     * Reserved Instances, or only those otherwise specified.
     *
     * @return One or more Reserved Instance IDs. <p>Default: Describes all your
     *         Reserved Instances, or only those otherwise specified.
     */
    public java.util.List<String> getReservedInstancesIds() {
        if (reservedInstancesIds == null) {
              reservedInstancesIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              reservedInstancesIds.setAutoConstruct(true);
        }
        return reservedInstancesIds;
    }
    
    /**
     * One or more Reserved Instance IDs. <p>Default: Describes all your
     * Reserved Instances, or only those otherwise specified.
     *
     * @param reservedInstancesIds One or more Reserved Instance IDs. <p>Default: Describes all your
     *         Reserved Instances, or only those otherwise specified.
     */
    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesIds.size());
        reservedInstancesIdsCopy.addAll(reservedInstancesIds);
        this.reservedInstancesIds = reservedInstancesIdsCopy;
    }
    
    /**
     * One or more Reserved Instance IDs. <p>Default: Describes all your
     * Reserved Instances, or only those otherwise specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds One or more Reserved Instance IDs. <p>Default: Describes all your
     *         Reserved Instances, or only those otherwise specified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        if (getReservedInstancesIds() == null) setReservedInstancesIds(new java.util.ArrayList<String>(reservedInstancesIds.length));
        for (String value : reservedInstancesIds) {
            getReservedInstancesIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more Reserved Instance IDs. <p>Default: Describes all your
     * Reserved Instances, or only those otherwise specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds One or more Reserved Instance IDs. <p>Default: Describes all your
     *         Reserved Instances, or only those otherwise specified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesIds.size());
            reservedInstancesIdsCopy.addAll(reservedInstancesIds);
            this.reservedInstancesIds = reservedInstancesIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (one
     * year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>end</code> - The time when
     * the Reserved Instance expires. </li> <li> <p><code>fixed-price</code>
     * - The purchase price of the Reserved Instance (for example, 9800.0).
     * </li> <li> <p><code>instance-type</code> - The instance type on which
     * the Reserved Instance can be used. </li> <li>
     * <p><code>product-description</code> - The product description of the
     * Reserved Instance (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>Windows</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>reserved-instances-id</code> - The
     * ID of the Reserved Instance. </li> <li> <p><code>start</code> - The
     * time at which the Reserved Instance purchase request was placed. </li>
     * <li> <p><code>state</code> - The state of the Reserved Instance
     * (<code>pending-payment</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>). </li> <li>
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
     * filter. </li> <li> <p><code>usage-price</code> - The usage price of
     * the Reserved Instance, per hour (for example, 0.84). </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone where the Reserved Instance can be used. </li> <li>
     *         <p><code>duration</code> - The duration of the Reserved Instance (one
     *         year or three years), in seconds (<code>31536000</code> |
     *         <code>94608000</code>). </li> <li> <p><code>end</code> - The time when
     *         the Reserved Instance expires. </li> <li> <p><code>fixed-price</code>
     *         - The purchase price of the Reserved Instance (for example, 9800.0).
     *         </li> <li> <p><code>instance-type</code> - The instance type on which
     *         the Reserved Instance can be used. </li> <li>
     *         <p><code>product-description</code> - The product description of the
     *         Reserved Instance (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     *         VPC)</code> | <code>Windows</code> | <code>Windows (Amazon
     *         VPC)</code>). </li> <li> <p><code>reserved-instances-id</code> - The
     *         ID of the Reserved Instance. </li> <li> <p><code>start</code> - The
     *         time at which the Reserved Instance purchase request was placed. </li>
     *         <li> <p><code>state</code> - The state of the Reserved Instance
     *         (<code>pending-payment</code> | <code>active</code> |
     *         <code>payment-failed</code> | <code>retired</code>). </li> <li>
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
     *         filter. </li> <li> <p><code>usage-price</code> - The usage price of
     *         the Reserved Instance, per hour (for example, 0.84). </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (one
     * year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>end</code> - The time when
     * the Reserved Instance expires. </li> <li> <p><code>fixed-price</code>
     * - The purchase price of the Reserved Instance (for example, 9800.0).
     * </li> <li> <p><code>instance-type</code> - The instance type on which
     * the Reserved Instance can be used. </li> <li>
     * <p><code>product-description</code> - The product description of the
     * Reserved Instance (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>Windows</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>reserved-instances-id</code> - The
     * ID of the Reserved Instance. </li> <li> <p><code>start</code> - The
     * time at which the Reserved Instance purchase request was placed. </li>
     * <li> <p><code>state</code> - The state of the Reserved Instance
     * (<code>pending-payment</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>). </li> <li>
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
     * filter. </li> <li> <p><code>usage-price</code> - The usage price of
     * the Reserved Instance, per hour (for example, 0.84). </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone where the Reserved Instance can be used. </li> <li>
     *         <p><code>duration</code> - The duration of the Reserved Instance (one
     *         year or three years), in seconds (<code>31536000</code> |
     *         <code>94608000</code>). </li> <li> <p><code>end</code> - The time when
     *         the Reserved Instance expires. </li> <li> <p><code>fixed-price</code>
     *         - The purchase price of the Reserved Instance (for example, 9800.0).
     *         </li> <li> <p><code>instance-type</code> - The instance type on which
     *         the Reserved Instance can be used. </li> <li>
     *         <p><code>product-description</code> - The product description of the
     *         Reserved Instance (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     *         VPC)</code> | <code>Windows</code> | <code>Windows (Amazon
     *         VPC)</code>). </li> <li> <p><code>reserved-instances-id</code> - The
     *         ID of the Reserved Instance. </li> <li> <p><code>start</code> - The
     *         time at which the Reserved Instance purchase request was placed. </li>
     *         <li> <p><code>state</code> - The state of the Reserved Instance
     *         (<code>pending-payment</code> | <code>active</code> |
     *         <code>payment-failed</code> | <code>retired</code>). </li> <li>
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
     *         filter. </li> <li> <p><code>usage-price</code> - The usage price of
     *         the Reserved Instance, per hour (for example, 0.84). </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (one
     * year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>end</code> - The time when
     * the Reserved Instance expires. </li> <li> <p><code>fixed-price</code>
     * - The purchase price of the Reserved Instance (for example, 9800.0).
     * </li> <li> <p><code>instance-type</code> - The instance type on which
     * the Reserved Instance can be used. </li> <li>
     * <p><code>product-description</code> - The product description of the
     * Reserved Instance (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>Windows</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>reserved-instances-id</code> - The
     * ID of the Reserved Instance. </li> <li> <p><code>start</code> - The
     * time at which the Reserved Instance purchase request was placed. </li>
     * <li> <p><code>state</code> - The state of the Reserved Instance
     * (<code>pending-payment</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>). </li> <li>
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
     * filter. </li> <li> <p><code>usage-price</code> - The usage price of
     * the Reserved Instance, per hour (for example, 0.84). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone where the Reserved Instance can be used. </li> <li>
     *         <p><code>duration</code> - The duration of the Reserved Instance (one
     *         year or three years), in seconds (<code>31536000</code> |
     *         <code>94608000</code>). </li> <li> <p><code>end</code> - The time when
     *         the Reserved Instance expires. </li> <li> <p><code>fixed-price</code>
     *         - The purchase price of the Reserved Instance (for example, 9800.0).
     *         </li> <li> <p><code>instance-type</code> - The instance type on which
     *         the Reserved Instance can be used. </li> <li>
     *         <p><code>product-description</code> - The product description of the
     *         Reserved Instance (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     *         VPC)</code> | <code>Windows</code> | <code>Windows (Amazon
     *         VPC)</code>). </li> <li> <p><code>reserved-instances-id</code> - The
     *         ID of the Reserved Instance. </li> <li> <p><code>start</code> - The
     *         time at which the Reserved Instance purchase request was placed. </li>
     *         <li> <p><code>state</code> - The state of the Reserved Instance
     *         (<code>pending-payment</code> | <code>active</code> |
     *         <code>payment-failed</code> | <code>retired</code>). </li> <li>
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
     *         filter. </li> <li> <p><code>usage-price</code> - The usage price of
     *         the Reserved Instance, per hour (for example, 0.84). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (one
     * year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>end</code> - The time when
     * the Reserved Instance expires. </li> <li> <p><code>fixed-price</code>
     * - The purchase price of the Reserved Instance (for example, 9800.0).
     * </li> <li> <p><code>instance-type</code> - The instance type on which
     * the Reserved Instance can be used. </li> <li>
     * <p><code>product-description</code> - The product description of the
     * Reserved Instance (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>Windows</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>reserved-instances-id</code> - The
     * ID of the Reserved Instance. </li> <li> <p><code>start</code> - The
     * time at which the Reserved Instance purchase request was placed. </li>
     * <li> <p><code>state</code> - The state of the Reserved Instance
     * (<code>pending-payment</code> | <code>active</code> |
     * <code>payment-failed</code> | <code>retired</code>). </li> <li>
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
     * filter. </li> <li> <p><code>usage-price</code> - The usage price of
     * the Reserved Instance, per hour (for example, 0.84). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone where the Reserved Instance can be used. </li> <li>
     *         <p><code>duration</code> - The duration of the Reserved Instance (one
     *         year or three years), in seconds (<code>31536000</code> |
     *         <code>94608000</code>). </li> <li> <p><code>end</code> - The time when
     *         the Reserved Instance expires. </li> <li> <p><code>fixed-price</code>
     *         - The purchase price of the Reserved Instance (for example, 9800.0).
     *         </li> <li> <p><code>instance-type</code> - The instance type on which
     *         the Reserved Instance can be used. </li> <li>
     *         <p><code>product-description</code> - The product description of the
     *         Reserved Instance (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     *         VPC)</code> | <code>Windows</code> | <code>Windows (Amazon
     *         VPC)</code>). </li> <li> <p><code>reserved-instances-id</code> - The
     *         ID of the Reserved Instance. </li> <li> <p><code>start</code> - The
     *         time at which the Reserved Instance purchase request was placed. </li>
     *         <li> <p><code>state</code> - The state of the Reserved Instance
     *         (<code>pending-payment</code> | <code>active</code> |
     *         <code>payment-failed</code> | <code>retired</code>). </li> <li>
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
     *         filter. </li> <li> <p><code>usage-price</code> - The usage price of
     *         the Reserved Instance, per hour (for example, 0.84). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @return The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OfferingTypeValues
     */
    public DescribeReservedInstancesRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OfferingTypeValues
     */
    public DescribeReservedInstancesRequest withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeReservedInstancesRequest> getDryRunRequest() {
        Request<DescribeReservedInstancesRequest> request = new DescribeReservedInstancesRequestMarshaller().marshall(this);
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
        if (getReservedInstancesIds() != null) sb.append("ReservedInstancesIds: " + getReservedInstancesIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedInstancesRequest == false) return false;
        DescribeReservedInstancesRequest other = (DescribeReservedInstancesRequest)obj;
        
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null) return false;
        if (other.getReservedInstancesIds() != null && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        return true;
    }
    
}
    
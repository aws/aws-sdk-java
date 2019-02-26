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
import com.amazonaws.services.ec2.model.transform.DescribeReservedInstancesOfferingsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeReservedInstancesOfferings.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesOfferingsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeReservedInstancesOfferingsRequest> {

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     */
    private String availabilityZone;
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
     * <code>duration</code> - The duration of the Reserved Instance (for example, one year or three years), in seconds
     * (<code>31536000</code> | <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved Instance Marketplace offerings. When
     * this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Availability Zone</code> or <code>Region</code>).
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
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     */
    private Boolean includeMarketplace;
    /**
     * <p>
     * The instance type that the reservation will cover (for example, <code>m1.small</code>). For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The maximum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 94608000 (3 years)
     * </p>
     */
    private Long maxDuration;
    /**
     * <p>
     * The maximum number of instances to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 20
     * </p>
     */
    private Integer maxInstanceCount;
    /**
     * <p>
     * The minimum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 2592000 (1 month)
     * </p>
     */
    private Long minDuration;
    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * </p>
     */
    private String offeringClass;
    /**
     * <p>
     * The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in the
     * description are for use with Amazon VPC.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> reservedInstancesOfferingIds;
    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     * <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     */
    private String instanceTenancy;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. The maximum is
     * 100.
     * </p>
     * <p>
     * Default: 100
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only
     * have access to the <code>Medium Utilization</code> Reserved Instance offering type.
     * </p>
     */
    private String offeringType;

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Reserved Instance can be used.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * 
     * @return The Availability Zone in which the Reserved Instance can be used.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Reserved Instance can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
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
     * <code>duration</code> - The duration of the Reserved Instance (for example, one year or three years), in seconds
     * (<code>31536000</code> | <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved Instance Marketplace offerings. When
     * this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Availability Zone</code> or <code>Region</code>).
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
     *         <code>duration</code> - The duration of the Reserved Instance (for example, one year or three years), in
     *         seconds (<code>31536000</code> | <code>94608000</code>).
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
     *         <code>marketplace</code> - Set to <code>true</code> to show only Reserved Instance Marketplace offerings.
     *         When this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved
     *         Instance Marketplace are listed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-description</code> - The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the product platform description will only be displayed to
     *         EC2-Classic account holders and are for use with Amazon VPC. (<code>Linux/UNIX</code> |
     *         <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *         <code>Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *         <code>Windows</code> | <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server Standard</code>
     *         | <code>Windows with SQL Server Standard (Amazon VPC)</code> | <code>Windows with SQL Server Web</code> |
     *         <code> Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with SQL Server Enterprise</code>
     *         | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reserved-instances-offering-id</code> - The Reserved Instances offering ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>scope</code> - The scope of the Reserved Instance (<code>Availability Zone</code> or
     *         <code>Region</code>).
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
     * <code>duration</code> - The duration of the Reserved Instance (for example, one year or three years), in seconds
     * (<code>31536000</code> | <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved Instance Marketplace offerings. When
     * this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Availability Zone</code> or <code>Region</code>).
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
     *        <code>duration</code> - The duration of the Reserved Instance (for example, one year or three years), in
     *        seconds (<code>31536000</code> | <code>94608000</code>).
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
     *        <code>marketplace</code> - Set to <code>true</code> to show only Reserved Instance Marketplace offerings.
     *        When this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved
     *        Instance Marketplace are listed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The Reserved Instance product platform description. Instances that
     *        include <code>(Amazon VPC)</code> in the product platform description will only be displayed to
     *        EC2-Classic account holders and are for use with Amazon VPC. (<code>Linux/UNIX</code> |
     *        <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *        <code>Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *        <code>Windows</code> | <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server Standard</code> |
     *        <code>Windows with SQL Server Standard (Amazon VPC)</code> | <code>Windows with SQL Server Web</code> |
     *        <code> Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with SQL Server Enterprise</code> |
     *        <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-offering-id</code> - The Reserved Instances offering ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scope</code> - The scope of the Reserved Instance (<code>Availability Zone</code> or
     *        <code>Region</code>).
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
     * <code>duration</code> - The duration of the Reserved Instance (for example, one year or three years), in seconds
     * (<code>31536000</code> | <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved Instance Marketplace offerings. When
     * this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Availability Zone</code> or <code>Region</code>).
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
     *        <code>duration</code> - The duration of the Reserved Instance (for example, one year or three years), in
     *        seconds (<code>31536000</code> | <code>94608000</code>).
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
     *        <code>marketplace</code> - Set to <code>true</code> to show only Reserved Instance Marketplace offerings.
     *        When this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved
     *        Instance Marketplace are listed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The Reserved Instance product platform description. Instances that
     *        include <code>(Amazon VPC)</code> in the product platform description will only be displayed to
     *        EC2-Classic account holders and are for use with Amazon VPC. (<code>Linux/UNIX</code> |
     *        <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *        <code>Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *        <code>Windows</code> | <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server Standard</code> |
     *        <code>Windows with SQL Server Standard (Amazon VPC)</code> | <code>Windows with SQL Server Web</code> |
     *        <code> Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with SQL Server Enterprise</code> |
     *        <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-offering-id</code> - The Reserved Instances offering ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scope</code> - The scope of the Reserved Instance (<code>Availability Zone</code> or
     *        <code>Region</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withFilters(Filter... filters) {
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
     * <code>duration</code> - The duration of the Reserved Instance (for example, one year or three years), in seconds
     * (<code>31536000</code> | <code>94608000</code>).
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
     * <code>marketplace</code> - Set to <code>true</code> to show only Reserved Instance Marketplace offerings. When
     * this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The Reserved Instance product platform description. Instances that include
     * <code>(Amazon VPC)</code> in the product platform description will only be displayed to EC2-Classic account
     * holders and are for use with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> | <code>Red Hat Enterprise Linux</code> |
     * <code>Red Hat Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> | <code>Windows (Amazon VPC)</code> |
     * <code>Windows with SQL Server Standard</code> | <code>Windows with SQL Server Standard (Amazon VPC)</code> |
     * <code>Windows with SQL Server Web</code> | <code> Windows with SQL Server Web (Amazon VPC)</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-offering-id</code> - The Reserved Instances offering ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scope</code> - The scope of the Reserved Instance (<code>Availability Zone</code> or <code>Region</code>).
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
     *        <code>duration</code> - The duration of the Reserved Instance (for example, one year or three years), in
     *        seconds (<code>31536000</code> | <code>94608000</code>).
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
     *        <code>marketplace</code> - Set to <code>true</code> to show only Reserved Instance Marketplace offerings.
     *        When this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved
     *        Instance Marketplace are listed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The Reserved Instance product platform description. Instances that
     *        include <code>(Amazon VPC)</code> in the product platform description will only be displayed to
     *        EC2-Classic account holders and are for use with Amazon VPC. (<code>Linux/UNIX</code> |
     *        <code>Linux/UNIX (Amazon VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *        <code>Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux (Amazon VPC)</code> |
     *        <code>Windows</code> | <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server Standard</code> |
     *        <code>Windows with SQL Server Standard (Amazon VPC)</code> | <code>Windows with SQL Server Web</code> |
     *        <code> Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with SQL Server Enterprise</code> |
     *        <code>Windows with SQL Server Enterprise (Amazon VPC)</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-offering-id</code> - The Reserved Instances offering ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scope</code> - The scope of the Reserved Instance (<code>Availability Zone</code> or
     *        <code>Region</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usage-price</code> - The usage price of the Reserved Instance, per hour (for example, 0.84).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     * 
     * @param includeMarketplace
     *        Include Reserved Instance Marketplace offerings in the response.
     */

    public void setIncludeMarketplace(Boolean includeMarketplace) {
        this.includeMarketplace = includeMarketplace;
    }

    /**
     * <p>
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     * 
     * @return Include Reserved Instance Marketplace offerings in the response.
     */

    public Boolean getIncludeMarketplace() {
        return this.includeMarketplace;
    }

    /**
     * <p>
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     * 
     * @param includeMarketplace
     *        Include Reserved Instance Marketplace offerings in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withIncludeMarketplace(Boolean includeMarketplace) {
        setIncludeMarketplace(includeMarketplace);
        return this;
    }

    /**
     * <p>
     * Include Reserved Instance Marketplace offerings in the response.
     * </p>
     * 
     * @return Include Reserved Instance Marketplace offerings in the response.
     */

    public Boolean isIncludeMarketplace() {
        return this.includeMarketplace;
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example, <code>m1.small</code>). For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type that the reservation will cover (for example, <code>m1.small</code>). For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example, <code>m1.small</code>). For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The instance type that the reservation will cover (for example, <code>m1.small</code>). For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example, <code>m1.small</code>). For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type that the reservation will cover (for example, <code>m1.small</code>). For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeReservedInstancesOfferingsRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example, <code>m1.small</code>). For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type that the reservation will cover (for example, <code>m1.small</code>). For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The instance type that the reservation will cover (for example, <code>m1.small</code>). For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type that the reservation will cover (for example, <code>m1.small</code>). For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeReservedInstancesOfferingsRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 94608000 (3 years)
     * </p>
     * 
     * @param maxDuration
     *        The maximum duration (in seconds) to filter when searching for offerings.</p>
     *        <p>
     *        Default: 94608000 (3 years)
     */

    public void setMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * <p>
     * The maximum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 94608000 (3 years)
     * </p>
     * 
     * @return The maximum duration (in seconds) to filter when searching for offerings.</p>
     *         <p>
     *         Default: 94608000 (3 years)
     */

    public Long getMaxDuration() {
        return this.maxDuration;
    }

    /**
     * <p>
     * The maximum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 94608000 (3 years)
     * </p>
     * 
     * @param maxDuration
     *        The maximum duration (in seconds) to filter when searching for offerings.</p>
     *        <p>
     *        Default: 94608000 (3 years)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withMaxDuration(Long maxDuration) {
        setMaxDuration(maxDuration);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @param maxInstanceCount
     *        The maximum number of instances to filter when searching for offerings.</p>
     *        <p>
     *        Default: 20
     */

    public void setMaxInstanceCount(Integer maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
    }

    /**
     * <p>
     * The maximum number of instances to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @return The maximum number of instances to filter when searching for offerings.</p>
     *         <p>
     *         Default: 20
     */

    public Integer getMaxInstanceCount() {
        return this.maxInstanceCount;
    }

    /**
     * <p>
     * The maximum number of instances to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @param maxInstanceCount
     *        The maximum number of instances to filter when searching for offerings.</p>
     *        <p>
     *        Default: 20
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withMaxInstanceCount(Integer maxInstanceCount) {
        setMaxInstanceCount(maxInstanceCount);
        return this;
    }

    /**
     * <p>
     * The minimum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 2592000 (1 month)
     * </p>
     * 
     * @param minDuration
     *        The minimum duration (in seconds) to filter when searching for offerings.</p>
     *        <p>
     *        Default: 2592000 (1 month)
     */

    public void setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
    }

    /**
     * <p>
     * The minimum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 2592000 (1 month)
     * </p>
     * 
     * @return The minimum duration (in seconds) to filter when searching for offerings.</p>
     *         <p>
     *         Default: 2592000 (1 month)
     */

    public Long getMinDuration() {
        return this.minDuration;
    }

    /**
     * <p>
     * The minimum duration (in seconds) to filter when searching for offerings.
     * </p>
     * <p>
     * Default: 2592000 (1 month)
     * </p>
     * 
     * @param minDuration
     *        The minimum duration (in seconds) to filter when searching for offerings.</p>
     *        <p>
     *        Default: 2592000 (1 month)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withMinDuration(Long minDuration) {
        setMinDuration(minDuration);
        return this;
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * </p>
     * 
     * @param offeringClass
     *        The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * @see OfferingClassType
     */

    public void setOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * </p>
     * 
     * @return The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * @see OfferingClassType
     */

    public String getOfferingClass() {
        return this.offeringClass;
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * </p>
     * 
     * @param offeringClass
     *        The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClassType
     */

    public DescribeReservedInstancesOfferingsRequest withOfferingClass(String offeringClass) {
        setOfferingClass(offeringClass);
        return this;
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * </p>
     * 
     * @param offeringClass
     *        The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * @see OfferingClassType
     */

    public void setOfferingClass(OfferingClassType offeringClass) {
        withOfferingClass(offeringClass);
    }

    /**
     * <p>
     * The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * </p>
     * 
     * @param offeringClass
     *        The offering class of the Reserved Instance. Can be <code>standard</code> or <code>convertible</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClassType
     */

    public DescribeReservedInstancesOfferingsRequest withOfferingClass(OfferingClassType offeringClass) {
        this.offeringClass = offeringClass.toString();
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in the
     * description are for use with Amazon VPC.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in
     *        the description are for use with Amazon VPC.
     * @see RIProductDescription
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in the
     * description are for use with Amazon VPC.
     * </p>
     * 
     * @return The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in
     *         the description are for use with Amazon VPC.
     * @see RIProductDescription
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in the
     * description are for use with Amazon VPC.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in
     *        the description are for use with Amazon VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RIProductDescription
     */

    public DescribeReservedInstancesOfferingsRequest withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in the
     * description are for use with Amazon VPC.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in
     *        the description are for use with Amazon VPC.
     * @see RIProductDescription
     */

    public void setProductDescription(RIProductDescription productDescription) {
        withProductDescription(productDescription);
    }

    /**
     * <p>
     * The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in the
     * description are for use with Amazon VPC.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description. Instances that include <code>(Amazon VPC)</code> in
     *        the description are for use with Amazon VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RIProductDescription
     */

    public DescribeReservedInstancesOfferingsRequest withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     * 
     * @return One or more Reserved Instances offering IDs.
     */

    public java.util.List<String> getReservedInstancesOfferingIds() {
        if (reservedInstancesOfferingIds == null) {
            reservedInstancesOfferingIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return reservedInstancesOfferingIds;
    }

    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     * 
     * @param reservedInstancesOfferingIds
     *        One or more Reserved Instances offering IDs.
     */

    public void setReservedInstancesOfferingIds(java.util.Collection<String> reservedInstancesOfferingIds) {
        if (reservedInstancesOfferingIds == null) {
            this.reservedInstancesOfferingIds = null;
            return;
        }

        this.reservedInstancesOfferingIds = new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesOfferingIds);
    }

    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstancesOfferingIds(java.util.Collection)} or
     * {@link #withReservedInstancesOfferingIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstancesOfferingIds
     *        One or more Reserved Instances offering IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withReservedInstancesOfferingIds(String... reservedInstancesOfferingIds) {
        if (this.reservedInstancesOfferingIds == null) {
            setReservedInstancesOfferingIds(new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesOfferingIds.length));
        }
        for (String ele : reservedInstancesOfferingIds) {
            this.reservedInstancesOfferingIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instances offering IDs.
     * </p>
     * 
     * @param reservedInstancesOfferingIds
     *        One or more Reserved Instances offering IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withReservedInstancesOfferingIds(java.util.Collection<String> reservedInstancesOfferingIds) {
        setReservedInstancesOfferingIds(reservedInstancesOfferingIds);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     * <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     *        <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e.,
     *        Dedicated Instances).</p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @see Tenancy
     */

    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     * <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @return The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     *         <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e.,
     *         Dedicated Instances).</p>
     *         <p>
     *         <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *         <code>default</code> or <code>dedicated</code> values only.
     *         </p>
     *         <p>
     *         Default: <code>default</code>
     * @see Tenancy
     */

    public String getInstanceTenancy() {
        return this.instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     * <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     *        <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e.,
     *        Dedicated Instances).</p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public DescribeReservedInstancesOfferingsRequest withInstanceTenancy(String instanceTenancy) {
        setInstanceTenancy(instanceTenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     * <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     *        <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e.,
     *        Dedicated Instances).</p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @see Tenancy
     */

    public void setInstanceTenancy(Tenancy instanceTenancy) {
        withInstanceTenancy(instanceTenancy);
    }

    /**
     * <p>
     * The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     * <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances).
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the <code>default</code> or
     * <code>dedicated</code> values only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of
     *        <code>dedicated</code> is applied to instances that run in a VPC on single-tenant hardware (i.e.,
     *        Dedicated Instances).</p>
     *        <p>
     *        <b>Important:</b> The <code>host</code> value cannot be used with this parameter. Use the
     *        <code>default</code> or <code>dedicated</code> values only.
     *        </p>
     *        <p>
     *        Default: <code>default</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public DescribeReservedInstancesOfferingsRequest withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. The maximum is
     * 100.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results of the
     *        initial request can be seen by sending another request with the returned <code>NextToken</code> value. The
     *        maximum is 100.</p>
     *        <p>
     *        Default: 100
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. The maximum is
     * 100.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results of the
     *         initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *         The maximum is 100.</p>
     *         <p>
     *         Default: 100
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. The maximum is
     * 100.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results of the
     *        initial request can be seen by sending another request with the returned <code>NextToken</code> value. The
     *        maximum is 100.</p>
     *        <p>
     *        Default: 100
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public DescribeReservedInstancesOfferingsRequest withOfferingType(String offeringType) {
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

    public DescribeReservedInstancesOfferingsRequest withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeReservedInstancesOfferingsRequest> getDryRunRequest() {
        Request<DescribeReservedInstancesOfferingsRequest> request = new DescribeReservedInstancesOfferingsRequestMarshaller().marshall(this);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getIncludeMarketplace() != null)
            sb.append("IncludeMarketplace: ").append(getIncludeMarketplace()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getMaxDuration() != null)
            sb.append("MaxDuration: ").append(getMaxDuration()).append(",");
        if (getMaxInstanceCount() != null)
            sb.append("MaxInstanceCount: ").append(getMaxInstanceCount()).append(",");
        if (getMinDuration() != null)
            sb.append("MinDuration: ").append(getMinDuration()).append(",");
        if (getOfferingClass() != null)
            sb.append("OfferingClass: ").append(getOfferingClass()).append(",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: ").append(getProductDescription()).append(",");
        if (getReservedInstancesOfferingIds() != null)
            sb.append("ReservedInstancesOfferingIds: ").append(getReservedInstancesOfferingIds()).append(",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: ").append(getInstanceTenancy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof DescribeReservedInstancesOfferingsRequest == false)
            return false;
        DescribeReservedInstancesOfferingsRequest other = (DescribeReservedInstancesOfferingsRequest) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getIncludeMarketplace() == null ^ this.getIncludeMarketplace() == null)
            return false;
        if (other.getIncludeMarketplace() != null && other.getIncludeMarketplace().equals(this.getIncludeMarketplace()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getMaxDuration() == null ^ this.getMaxDuration() == null)
            return false;
        if (other.getMaxDuration() != null && other.getMaxDuration().equals(this.getMaxDuration()) == false)
            return false;
        if (other.getMaxInstanceCount() == null ^ this.getMaxInstanceCount() == null)
            return false;
        if (other.getMaxInstanceCount() != null && other.getMaxInstanceCount().equals(this.getMaxInstanceCount()) == false)
            return false;
        if (other.getMinDuration() == null ^ this.getMinDuration() == null)
            return false;
        if (other.getMinDuration() != null && other.getMinDuration().equals(this.getMinDuration()) == false)
            return false;
        if (other.getOfferingClass() == null ^ this.getOfferingClass() == null)
            return false;
        if (other.getOfferingClass() != null && other.getOfferingClass().equals(this.getOfferingClass()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getReservedInstancesOfferingIds() == null ^ this.getReservedInstancesOfferingIds() == null)
            return false;
        if (other.getReservedInstancesOfferingIds() != null && other.getReservedInstancesOfferingIds().equals(this.getReservedInstancesOfferingIds()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getIncludeMarketplace() == null) ? 0 : getIncludeMarketplace().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getMaxDuration() == null) ? 0 : getMaxDuration().hashCode());
        hashCode = prime * hashCode + ((getMaxInstanceCount() == null) ? 0 : getMaxInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getMinDuration() == null) ? 0 : getMinDuration().hashCode());
        hashCode = prime * hashCode + ((getOfferingClass() == null) ? 0 : getOfferingClass().hashCode());
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesOfferingIds() == null) ? 0 : getReservedInstancesOfferingIds().hashCode());
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesOfferingsRequest clone() {
        return (DescribeReservedInstancesOfferingsRequest) super.clone();
    }
}

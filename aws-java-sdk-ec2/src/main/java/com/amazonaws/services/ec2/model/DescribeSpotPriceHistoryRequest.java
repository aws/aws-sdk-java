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
import com.amazonaws.services.ec2.model.transform.DescribeSpotPriceHistoryRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeSpotPriceHistory.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpotPriceHistoryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeSpotPriceHistoryRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for which prices should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot price (<code>Linux/UNIX</code> |
     * <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (* and ?). Greater than or
     * less than comparison is not supported.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * Filters the results by the specified Availability Zone.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The date and time, up to the current date, from which to stop retrieving the price history data, in UTC format
     * (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceTypes;
    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Filters the results by the specified basic product descriptions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> productDescriptions;
    /**
     * <p>
     * The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC format
     * (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone for which prices should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot price (<code>Linux/UNIX</code> |
     * <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (* and ?). Greater than or
     * less than comparison is not supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone for which prices should be returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-description</code> - The product description for the Spot price (<code>Linux/UNIX</code> |
     *         <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     *         <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spot-price</code> - The Spot price. The value must match exactly (or use wildcards; greater than or
     *         less than comparison is not supported).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>timestamp</code> - The time stamp of the Spot price history, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (* and ?). Greater
     *         than or less than comparison is not supported.
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
     * <code>availability-zone</code> - The Availability Zone for which prices should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot price (<code>Linux/UNIX</code> |
     * <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (* and ?). Greater than or
     * less than comparison is not supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone for which prices should be returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The product description for the Spot price (<code>Linux/UNIX</code> |
     *        <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     *        <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-price</code> - The Spot price. The value must match exactly (or use wildcards; greater than or
     *        less than comparison is not supported).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>timestamp</code> - The time stamp of the Spot price history, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (* and ?). Greater
     *        than or less than comparison is not supported.
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
     * <code>availability-zone</code> - The Availability Zone for which prices should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot price (<code>Linux/UNIX</code> |
     * <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (* and ?). Greater than or
     * less than comparison is not supported.
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
     *        <code>availability-zone</code> - The Availability Zone for which prices should be returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The product description for the Spot price (<code>Linux/UNIX</code> |
     *        <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     *        <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-price</code> - The Spot price. The value must match exactly (or use wildcards; greater than or
     *        less than comparison is not supported).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>timestamp</code> - The time stamp of the Spot price history, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (* and ?). Greater
     *        than or less than comparison is not supported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryRequest withFilters(Filter... filters) {
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
     * <code>availability-zone</code> - The Availability Zone for which prices should be returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description for the Spot price (<code>Linux/UNIX</code> |
     * <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The Spot price. The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code> - The time stamp of the Spot price history, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (* and ?). Greater than or
     * less than comparison is not supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone for which prices should be returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The product description for the Spot price (<code>Linux/UNIX</code> |
     *        <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     *        <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon VPC)</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-price</code> - The Spot price. The value must match exactly (or use wildcards; greater than or
     *        less than comparison is not supported).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>timestamp</code> - The time stamp of the Spot price history, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You can use wildcards (* and ?). Greater
     *        than or less than comparison is not supported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        Filters the results by the specified Availability Zone.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * Filters the results by the specified Availability Zone.
     * </p>
     * 
     * @return Filters the results by the specified Availability Zone.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * Filters the results by the specified Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        Filters the results by the specified Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The date and time, up to the current date, from which to stop retrieving the price history data, in UTC format
     * (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param endTime
     *        The date and time, up to the current date, from which to stop retrieving the price history data, in UTC
     *        format (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time, up to the current date, from which to stop retrieving the price history data, in UTC format
     * (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @return The date and time, up to the current date, from which to stop retrieving the price history data, in UTC
     *         format (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time, up to the current date, from which to stop retrieving the price history data, in UTC format
     * (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param endTime
     *        The date and time, up to the current date, from which to stop retrieving the price history data, in UTC
     *        format (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     * 
     * @return Filters the results by the specified instance types.
     * @see InstanceType
     */

    public java.util.List<String> getInstanceTypes() {
        if (instanceTypes == null) {
            instanceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceTypes;
    }

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     * 
     * @param instanceTypes
     *        Filters the results by the specified instance types.
     * @see InstanceType
     */

    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new com.amazonaws.internal.SdkInternalList<String>(instanceTypes);
    }

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        Filters the results by the specified instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeSpotPriceHistoryRequest withInstanceTypes(String... instanceTypes) {
        if (this.instanceTypes == null) {
            setInstanceTypes(new com.amazonaws.internal.SdkInternalList<String>(instanceTypes.length));
        }
        for (String ele : instanceTypes) {
            this.instanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     * 
     * @param instanceTypes
     *        Filters the results by the specified instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeSpotPriceHistoryRequest withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified instance types.
     * </p>
     * 
     * @param instanceTypes
     *        Filters the results by the specified instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeSpotPriceHistoryRequest withInstanceTypes(InstanceType... instanceTypes) {
        com.amazonaws.internal.SdkInternalList<String> instanceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(instanceTypes.length);
        for (InstanceType value : instanceTypes) {
            instanceTypesCopy.add(value.toString());
        }
        if (getInstanceTypes() == null) {
            setInstanceTypes(instanceTypesCopy);
        } else {
            getInstanceTypes().addAll(instanceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default
     *        value is 1000. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default
     *         value is 1000. To retrieve the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default
     *        value is 1000. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified basic product descriptions.
     * </p>
     * 
     * @return Filters the results by the specified basic product descriptions.
     */

    public java.util.List<String> getProductDescriptions() {
        if (productDescriptions == null) {
            productDescriptions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return productDescriptions;
    }

    /**
     * <p>
     * Filters the results by the specified basic product descriptions.
     * </p>
     * 
     * @param productDescriptions
     *        Filters the results by the specified basic product descriptions.
     */

    public void setProductDescriptions(java.util.Collection<String> productDescriptions) {
        if (productDescriptions == null) {
            this.productDescriptions = null;
            return;
        }

        this.productDescriptions = new com.amazonaws.internal.SdkInternalList<String>(productDescriptions);
    }

    /**
     * <p>
     * Filters the results by the specified basic product descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductDescriptions(java.util.Collection)} or {@link #withProductDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param productDescriptions
     *        Filters the results by the specified basic product descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryRequest withProductDescriptions(String... productDescriptions) {
        if (this.productDescriptions == null) {
            setProductDescriptions(new com.amazonaws.internal.SdkInternalList<String>(productDescriptions.length));
        }
        for (String ele : productDescriptions) {
            this.productDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by the specified basic product descriptions.
     * </p>
     * 
     * @param productDescriptions
     *        Filters the results by the specified basic product descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryRequest withProductDescriptions(java.util.Collection<String> productDescriptions) {
        setProductDescriptions(productDescriptions);
        return this;
    }

    /**
     * <p>
     * The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC format
     * (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param startTime
     *        The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC
     *        format (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC format
     * (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @return The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC
     *         format (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC format
     * (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param startTime
     *        The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC
     *        format (for example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotPriceHistoryRequest> getDryRunRequest() {
        Request<DescribeSpotPriceHistoryRequest> request = new DescribeSpotPriceHistoryRequestMarshaller().marshall(this);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProductDescriptions() != null)
            sb.append("ProductDescriptions: ").append(getProductDescriptions()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotPriceHistoryRequest == false)
            return false;
        DescribeSpotPriceHistoryRequest other = (DescribeSpotPriceHistoryRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProductDescriptions() == null ^ this.getProductDescriptions() == null)
            return false;
        if (other.getProductDescriptions() != null && other.getProductDescriptions().equals(this.getProductDescriptions()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProductDescriptions() == null) ? 0 : getProductDescriptions().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpotPriceHistoryRequest clone() {
        return (DescribeSpotPriceHistoryRequest) super.clone();
    }
}

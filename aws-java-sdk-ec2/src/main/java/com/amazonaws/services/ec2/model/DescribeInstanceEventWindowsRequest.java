/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeInstanceEventWindowsRequestMarshaller;

/**
 * <para>Describe instance event windows by InstanceEventWindow.</para>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceEventWindowsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeInstanceEventWindowsRequest> {

    /**
     * <p>
     * The IDs of the event windows.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceEventWindowIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dedicated-host-id</code> - The event windows associated with the specified Dedicated Host ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event-window-name</code> - The event windows associated with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The event windows associated with the specified instance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag</code> - The event windows associated with the specified tag and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-key</code> - The event windows associated with the specified tag key, regardless of the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-value</code> - The event windows associated with the specified tag value, regardless of the
     * key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the event window. Use the tag key
     * in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>CMX</code>, specify <code>tag:Owner</code> for the filter name and
     * <code>CMX</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the event window. Use this filter to find all event windows
     * that have a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the event window. Use this filter to find all event
     * windows that have a tag with a specific value, regardless of the tag key.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 20 and 500. You cannot specify this
     * parameter and the event window IDs parameter in the same call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the event windows.
     * </p>
     * 
     * @return The IDs of the event windows.
     */

    public java.util.List<String> getInstanceEventWindowIds() {
        if (instanceEventWindowIds == null) {
            instanceEventWindowIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceEventWindowIds;
    }

    /**
     * <p>
     * The IDs of the event windows.
     * </p>
     * 
     * @param instanceEventWindowIds
     *        The IDs of the event windows.
     */

    public void setInstanceEventWindowIds(java.util.Collection<String> instanceEventWindowIds) {
        if (instanceEventWindowIds == null) {
            this.instanceEventWindowIds = null;
            return;
        }

        this.instanceEventWindowIds = new com.amazonaws.internal.SdkInternalList<String>(instanceEventWindowIds);
    }

    /**
     * <p>
     * The IDs of the event windows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceEventWindowIds(java.util.Collection)} or
     * {@link #withInstanceEventWindowIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceEventWindowIds
     *        The IDs of the event windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceEventWindowsRequest withInstanceEventWindowIds(String... instanceEventWindowIds) {
        if (this.instanceEventWindowIds == null) {
            setInstanceEventWindowIds(new com.amazonaws.internal.SdkInternalList<String>(instanceEventWindowIds.length));
        }
        for (String ele : instanceEventWindowIds) {
            this.instanceEventWindowIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the event windows.
     * </p>
     * 
     * @param instanceEventWindowIds
     *        The IDs of the event windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceEventWindowsRequest withInstanceEventWindowIds(java.util.Collection<String> instanceEventWindowIds) {
        setInstanceEventWindowIds(instanceEventWindowIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dedicated-host-id</code> - The event windows associated with the specified Dedicated Host ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event-window-name</code> - The event windows associated with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The event windows associated with the specified instance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag</code> - The event windows associated with the specified tag and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-key</code> - The event windows associated with the specified tag key, regardless of the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-value</code> - The event windows associated with the specified tag value, regardless of the
     * key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the event window. Use the tag key
     * in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>CMX</code>, specify <code>tag:Owner</code> for the filter name and
     * <code>CMX</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the event window. Use this filter to find all event windows
     * that have a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the event window. Use this filter to find all event
     * windows that have a tag with a specific value, regardless of the tag key.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>dedicated-host-id</code> - The event windows associated with the specified Dedicated Host ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event-window-name</code> - The event windows associated with the specified names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The event windows associated with the specified instance ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-tag</code> - The event windows associated with the specified tag and value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-tag-key</code> - The event windows associated with the specified tag key, regardless of
     *         the value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-tag-value</code> - The event windows associated with the specified tag value, regardless
     *         of the key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the event window. Use the
     *         tag key in the filter name and the tag value as the filter value. For example, to find all resources that
     *         have a tag with the key <code>Owner</code> and the value <code>CMX</code>, specify <code>tag:Owner</code>
     *         for the filter name and <code>CMX</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the event window. Use this filter to find all event
     *         windows that have a tag with a specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-value</code> - The value of a tag assigned to the event window. Use this filter to find all
     *         event windows that have a tag with a specific value, regardless of the tag key.
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
     * <code>dedicated-host-id</code> - The event windows associated with the specified Dedicated Host ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event-window-name</code> - The event windows associated with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The event windows associated with the specified instance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag</code> - The event windows associated with the specified tag and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-key</code> - The event windows associated with the specified tag key, regardless of the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-value</code> - The event windows associated with the specified tag value, regardless of the
     * key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the event window. Use the tag key
     * in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>CMX</code>, specify <code>tag:Owner</code> for the filter name and
     * <code>CMX</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the event window. Use this filter to find all event windows
     * that have a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the event window. Use this filter to find all event
     * windows that have a tag with a specific value, regardless of the tag key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dedicated-host-id</code> - The event windows associated with the specified Dedicated Host ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event-window-name</code> - The event windows associated with the specified names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The event windows associated with the specified instance ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-tag</code> - The event windows associated with the specified tag and value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-tag-key</code> - The event windows associated with the specified tag key, regardless of the
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-tag-value</code> - The event windows associated with the specified tag value, regardless of
     *        the key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the event window. Use the
     *        tag key in the filter name and the tag value as the filter value. For example, to find all resources that
     *        have a tag with the key <code>Owner</code> and the value <code>CMX</code>, specify <code>tag:Owner</code>
     *        for the filter name and <code>CMX</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the event window. Use this filter to find all event
     *        windows that have a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the event window. Use this filter to find all
     *        event windows that have a tag with a specific value, regardless of the tag key.
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
     * <code>dedicated-host-id</code> - The event windows associated with the specified Dedicated Host ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event-window-name</code> - The event windows associated with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The event windows associated with the specified instance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag</code> - The event windows associated with the specified tag and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-key</code> - The event windows associated with the specified tag key, regardless of the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-value</code> - The event windows associated with the specified tag value, regardless of the
     * key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the event window. Use the tag key
     * in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>CMX</code>, specify <code>tag:Owner</code> for the filter name and
     * <code>CMX</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the event window. Use this filter to find all event windows
     * that have a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the event window. Use this filter to find all event
     * windows that have a tag with a specific value, regardless of the tag key.
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
     *        <code>dedicated-host-id</code> - The event windows associated with the specified Dedicated Host ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event-window-name</code> - The event windows associated with the specified names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The event windows associated with the specified instance ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-tag</code> - The event windows associated with the specified tag and value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-tag-key</code> - The event windows associated with the specified tag key, regardless of the
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-tag-value</code> - The event windows associated with the specified tag value, regardless of
     *        the key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the event window. Use the
     *        tag key in the filter name and the tag value as the filter value. For example, to find all resources that
     *        have a tag with the key <code>Owner</code> and the value <code>CMX</code>, specify <code>tag:Owner</code>
     *        for the filter name and <code>CMX</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the event window. Use this filter to find all event
     *        windows that have a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the event window. Use this filter to find all
     *        event windows that have a tag with a specific value, regardless of the tag key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceEventWindowsRequest withFilters(Filter... filters) {
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
     * <code>dedicated-host-id</code> - The event windows associated with the specified Dedicated Host ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event-window-name</code> - The event windows associated with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The event windows associated with the specified instance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag</code> - The event windows associated with the specified tag and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-key</code> - The event windows associated with the specified tag key, regardless of the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-tag-value</code> - The event windows associated with the specified tag value, regardless of the
     * key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the event window. Use the tag key
     * in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>CMX</code>, specify <code>tag:Owner</code> for the filter name and
     * <code>CMX</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the event window. Use this filter to find all event windows
     * that have a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the event window. Use this filter to find all event
     * windows that have a tag with a specific value, regardless of the tag key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dedicated-host-id</code> - The event windows associated with the specified Dedicated Host ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event-window-name</code> - The event windows associated with the specified names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The event windows associated with the specified instance ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-tag</code> - The event windows associated with the specified tag and value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-tag-key</code> - The event windows associated with the specified tag key, regardless of the
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-tag-value</code> - The event windows associated with the specified tag value, regardless of
     *        the key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the event window. Use the
     *        tag key in the filter name and the tag value as the filter value. For example, to find all resources that
     *        have a tag with the key <code>Owner</code> and the value <code>CMX</code>, specify <code>tag:Owner</code>
     *        for the filter name and <code>CMX</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the event window. Use this filter to find all event
     *        windows that have a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the event window. Use this filter to find all
     *        event windows that have a tag with a specific value, regardless of the tag key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceEventWindowsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 20 and 500. You cannot specify this
     * parameter and the event window IDs parameter in the same call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 20 and 500. You cannot
     *        specify this parameter and the event window IDs parameter in the same call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 20 and 500. You cannot specify this
     * parameter and the event window IDs parameter in the same call.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned <code>NextToken</code> value. This value can be between 20 and 500. You cannot
     *         specify this parameter and the event window IDs parameter in the same call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 20 and 500. You cannot specify this
     * parameter and the event window IDs parameter in the same call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 20 and 500. You cannot
     *        specify this parameter and the event window IDs parameter in the same call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceEventWindowsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public DescribeInstanceEventWindowsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeInstanceEventWindowsRequest> getDryRunRequest() {
        Request<DescribeInstanceEventWindowsRequest> request = new DescribeInstanceEventWindowsRequestMarshaller().marshall(this);
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
        if (getInstanceEventWindowIds() != null)
            sb.append("InstanceEventWindowIds: ").append(getInstanceEventWindowIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceEventWindowsRequest == false)
            return false;
        DescribeInstanceEventWindowsRequest other = (DescribeInstanceEventWindowsRequest) obj;
        if (other.getInstanceEventWindowIds() == null ^ this.getInstanceEventWindowIds() == null)
            return false;
        if (other.getInstanceEventWindowIds() != null && other.getInstanceEventWindowIds().equals(this.getInstanceEventWindowIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceEventWindowIds() == null) ? 0 : getInstanceEventWindowIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceEventWindowsRequest clone() {
        return (DescribeInstanceEventWindowsRequest) super.clone();
    }
}

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
import com.amazonaws.services.ec2.model.transform.DescribeVolumeStatusRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumeStatusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVolumeStatusRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example, <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for <code>io-enabled</code>: <code>passed</code> |
     * <code>failed</code>; for <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> | <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for <code>volume-status.status</code> (
     * <code>io-enabled</code> | <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of <code>volume-status.details-name</code> (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for <code>io-performance</code>:
     * <code>normal</code> | <code>degraded</code> | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned. If this parameter is
     * not used, then <code>DescribeVolumeStatus</code> returns all results. You cannot specify this parameter and the
     * volume IDs parameter in the same request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>DescribeVolumeStatus</code> request. When the
     * results of the request exceed <code>MaxResults</code>, this value can be used to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> volumeIds;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example, <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for <code>io-enabled</code>: <code>passed</code> |
     * <code>failed</code>; for <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> | <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for <code>volume-status.status</code> (
     * <code>io-enabled</code> | <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of <code>volume-status.details-name</code> (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for <code>io-performance</code>:
     * <code>normal</code> | <code>degraded</code> | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>action.code</code> - The action code for the event (for example, <code>enable-volume-io</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>action.description</code> - A description of the action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>action.event-id</code> - The event ID associated with the action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.description</code> - A description of the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.event-id</code> - The event ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.event-type</code> - The event type (for <code>io-enabled</code>: <code>passed</code> |
     *         <code>failed</code>; for <code>io-performance</code>: <code>io-performance:degraded</code> |
     *         <code>io-performance:severely-degraded</code> | <code>io-performance:stalled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-after</code> - The latest end time for the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-before</code> - The earliest start time for the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-status.details-name</code> - The cause for <code>volume-status.status</code> (
     *         <code>io-enabled</code> | <code>io-performance</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-status.details-status</code> - The status of <code>volume-status.details-name</code> (for
     *         <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for <code>io-performance</code>:
     *         <code>normal</code> | <code>degraded</code> | <code>severely-degraded</code> | <code>stalled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-status.status</code> - The status of the volume (<code>ok</code> | <code>impaired</code> |
     *         <code>warning</code> | <code>insufficient-data</code>).
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example, <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for <code>io-enabled</code>: <code>passed</code> |
     * <code>failed</code>; for <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> | <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for <code>volume-status.status</code> (
     * <code>io-enabled</code> | <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of <code>volume-status.details-name</code> (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for <code>io-performance</code>:
     * <code>normal</code> | <code>degraded</code> | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>action.code</code> - The action code for the event (for example, <code>enable-volume-io</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>action.description</code> - A description of the action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>action.event-id</code> - The event ID associated with the action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.description</code> - A description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.event-id</code> - The event ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.event-type</code> - The event type (for <code>io-enabled</code>: <code>passed</code> |
     *        <code>failed</code>; for <code>io-performance</code>: <code>io-performance:degraded</code> |
     *        <code>io-performance:severely-degraded</code> | <code>io-performance:stalled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-after</code> - The latest end time for the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-before</code> - The earliest start time for the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-status.details-name</code> - The cause for <code>volume-status.status</code> (
     *        <code>io-enabled</code> | <code>io-performance</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-status.details-status</code> - The status of <code>volume-status.details-name</code> (for
     *        <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for <code>io-performance</code>:
     *        <code>normal</code> | <code>degraded</code> | <code>severely-degraded</code> | <code>stalled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-status.status</code> - The status of the volume (<code>ok</code> | <code>impaired</code> |
     *        <code>warning</code> | <code>insufficient-data</code>).
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example, <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for <code>io-enabled</code>: <code>passed</code> |
     * <code>failed</code>; for <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> | <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for <code>volume-status.status</code> (
     * <code>io-enabled</code> | <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of <code>volume-status.details-name</code> (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for <code>io-performance</code>:
     * <code>normal</code> | <code>degraded</code> | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>).
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
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>action.code</code> - The action code for the event (for example, <code>enable-volume-io</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>action.description</code> - A description of the action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>action.event-id</code> - The event ID associated with the action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.description</code> - A description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.event-id</code> - The event ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.event-type</code> - The event type (for <code>io-enabled</code>: <code>passed</code> |
     *        <code>failed</code>; for <code>io-performance</code>: <code>io-performance:degraded</code> |
     *        <code>io-performance:severely-degraded</code> | <code>io-performance:stalled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-after</code> - The latest end time for the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-before</code> - The earliest start time for the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-status.details-name</code> - The cause for <code>volume-status.status</code> (
     *        <code>io-enabled</code> | <code>io-performance</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-status.details-status</code> - The status of <code>volume-status.details-name</code> (for
     *        <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for <code>io-performance</code>:
     *        <code>normal</code> | <code>degraded</code> | <code>severely-degraded</code> | <code>stalled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-status.status</code> - The status of the volume (<code>ok</code> | <code>impaired</code> |
     *        <code>warning</code> | <code>insufficient-data</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeStatusRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>action.code</code> - The action code for the event (for example, <code>enable-volume-io</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.description</code> - A description of the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>action.event-id</code> - The event ID associated with the action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-id</code> - The event ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.event-type</code> - The event type (for <code>io-enabled</code>: <code>passed</code> |
     * <code>failed</code>; for <code>io-performance</code>: <code>io-performance:degraded</code> |
     * <code>io-performance:severely-degraded</code> | <code>io-performance:stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-name</code> - The cause for <code>volume-status.status</code> (
     * <code>io-enabled</code> | <code>io-performance</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.details-status</code> - The status of <code>volume-status.details-name</code> (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for <code>io-performance</code>:
     * <code>normal</code> | <code>degraded</code> | <code>severely-degraded</code> | <code>stalled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-status.status</code> - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>action.code</code> - The action code for the event (for example, <code>enable-volume-io</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>action.description</code> - A description of the action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>action.event-id</code> - The event ID associated with the action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.description</code> - A description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.event-id</code> - The event ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.event-type</code> - The event type (for <code>io-enabled</code>: <code>passed</code> |
     *        <code>failed</code>; for <code>io-performance</code>: <code>io-performance:degraded</code> |
     *        <code>io-performance:severely-degraded</code> | <code>io-performance:stalled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-after</code> - The latest end time for the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-before</code> - The earliest start time for the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-status.details-name</code> - The cause for <code>volume-status.status</code> (
     *        <code>io-enabled</code> | <code>io-performance</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-status.details-status</code> - The status of <code>volume-status.details-name</code> (for
     *        <code>io-enabled</code>: <code>passed</code> | <code>failed</code>; for <code>io-performance</code>:
     *        <code>normal</code> | <code>degraded</code> | <code>severely-degraded</code> | <code>stalled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-status.status</code> - The status of the volume (<code>ok</code> | <code>impaired</code> |
     *        <code>warning</code> | <code>insufficient-data</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeStatusRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned. If this parameter is
     * not used, then <code>DescribeVolumeStatus</code> returns all results. You cannot specify this parameter and the
     * volume IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by <code>DescribeVolumeStatus</code> in paginated output.
     *        When this parameter is used, the request only returns <code>MaxResults</code> results in a single page
     *        along with a <code>NextToken</code> response element. The remaining results of the initial request can be
     *        seen by sending another request with the returned <code>NextToken</code> value. This value can be between
     *        5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     *        If this parameter is not used, then <code>DescribeVolumeStatus</code> returns all results. You cannot
     *        specify this parameter and the volume IDs parameter in the same request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned. If this parameter is
     * not used, then <code>DescribeVolumeStatus</code> returns all results. You cannot specify this parameter and the
     * volume IDs parameter in the same request.
     * </p>
     * 
     * @return The maximum number of volume results returned by <code>DescribeVolumeStatus</code> in paginated output.
     *         When this parameter is used, the request only returns <code>MaxResults</code> results in a single page
     *         along with a <code>NextToken</code> response element. The remaining results of the initial request can be
     *         seen by sending another request with the returned <code>NextToken</code> value. This value can be between
     *         5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     *         If this parameter is not used, then <code>DescribeVolumeStatus</code> returns all results. You cannot
     *         specify this parameter and the volume IDs parameter in the same request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another request with the returned <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned. If this parameter is
     * not used, then <code>DescribeVolumeStatus</code> returns all results. You cannot specify this parameter and the
     * volume IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by <code>DescribeVolumeStatus</code> in paginated output.
     *        When this parameter is used, the request only returns <code>MaxResults</code> results in a single page
     *        along with a <code>NextToken</code> response element. The remaining results of the initial request can be
     *        seen by sending another request with the returned <code>NextToken</code> value. This value can be between
     *        5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     *        If this parameter is not used, then <code>DescribeVolumeStatus</code> returns all results. You cannot
     *        specify this parameter and the volume IDs parameter in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeStatusRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>DescribeVolumeStatus</code> request. When the
     * results of the request exceed <code>MaxResults</code>, this value can be used to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future <code>DescribeVolumeStatus</code> request. When
     *        the results of the request exceed <code>MaxResults</code>, this value can be used to retrieve the next
     *        page of results. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>DescribeVolumeStatus</code> request. When the
     * results of the request exceed <code>MaxResults</code>, this value can be used to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value to include in a future <code>DescribeVolumeStatus</code> request. When
     *         the results of the request exceed <code>MaxResults</code>, this value can be used to retrieve the next
     *         page of results. This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>DescribeVolumeStatus</code> request. When the
     * results of the request exceed <code>MaxResults</code>, this value can be used to retrieve the next page of
     * results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future <code>DescribeVolumeStatus</code> request. When
     *        the results of the request exceed <code>MaxResults</code>, this value can be used to retrieve the next
     *        page of results. This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeStatusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     * 
     * @return The IDs of the volumes.</p>
     *         <p>
     *         Default: Describes all your volumes.
     */

    public java.util.List<String> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return volumeIds;
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     * 
     * @param volumeIds
     *        The IDs of the volumes.</p>
     *        <p>
     *        Default: Describes all your volumes.
     */

    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }

        this.volumeIds = new com.amazonaws.internal.SdkInternalList<String>(volumeIds);
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeIds(java.util.Collection)} or {@link #withVolumeIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeIds
     *        The IDs of the volumes.</p>
     *        <p>
     *        Default: Describes all your volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeStatusRequest withVolumeIds(String... volumeIds) {
        if (this.volumeIds == null) {
            setVolumeIds(new com.amazonaws.internal.SdkInternalList<String>(volumeIds.length));
        }
        for (String ele : volumeIds) {
            this.volumeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * <p>
     * Default: Describes all your volumes.
     * </p>
     * 
     * @param volumeIds
     *        The IDs of the volumes.</p>
     *        <p>
     *        Default: Describes all your volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeStatusRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVolumeStatusRequest> getDryRunRequest() {
        Request<DescribeVolumeStatusRequest> request = new DescribeVolumeStatusRequestMarshaller().marshall(this);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVolumeIds() != null)
            sb.append("VolumeIds: ").append(getVolumeIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumeStatusRequest == false)
            return false;
        DescribeVolumeStatusRequest other = (DescribeVolumeStatusRequest) obj;
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
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null && other.getVolumeIds().equals(this.getVolumeIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumeStatusRequest clone() {
        return (DescribeVolumeStatusRequest) super.clone();
    }
}

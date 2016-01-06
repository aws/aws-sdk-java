/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeVolumeStatusRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVolumeStatus(DescribeVolumeStatusRequest) DescribeVolumeStatus operation}.
 * <p>
 * Describes the status of the specified volumes. Volume status provides
 * the result of the checks performed on your volumes to determine events
 * that can impair the performance of your volumes. The performance of a
 * volume can be affected if an issue occurs on the volume's underlying
 * host. If the volume's underlying host experiences a power outage or
 * system issue, after the system is restored, there could be data
 * inconsistencies on the volume. Volume events notify you if this
 * occurs. Volume actions notify you if any action needs to be taken in
 * response to the event.
 * </p>
 * <p>
 * The <code>DescribeVolumeStatus</code> operation provides the following
 * information about the specified volumes:
 * </p>
 * <p>
 * <i>Status</i> : Reflects the current status of the volume. The
 * possible values are <code>ok</code> ,
 * <code>impaired</code> ,
 * <code>warning</code> , or
 * <code>insufficient-data</code> . If all checks pass, the overall
 * status of the volume is <code>ok</code> . If the check fails, the
 * overall status is <code>impaired</code> . If the status is
 * <code>insufficient-data</code> , then the checks may still be taking
 * place on your volume at the time. We recommend that you retry the
 * request. For more information on volume status, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-volume-status.html"> Monitoring the Status of Your Volumes </a>
 * .
 * </p>
 * <p>
 * <i>Events</i> : Reflect the cause of a volume status and may require
 * you to take action. For example, if your volume returns an
 * <code>impaired</code> status, then the volume event might be
 * <code>potential-data-inconsistency</code> . This means that your
 * volume has been affected by an issue with the underlying host, has all
 * I/O operations disabled, and may have inconsistent data.
 * </p>
 * <p>
 * <i>Actions</i> : Reflect the actions you may have to take in response
 * to an event. For example, if the status of the volume is
 * <code>impaired</code> and the volume event shows
 * <code>potential-data-inconsistency</code> , then the action shows
 * <code>enable-volume-io</code> . This means that you may want to enable
 * the I/O operations for the volume by calling the EnableVolumeIO action
 * and then check the volume for data consistency.
 * </p>
 * <p>
 * <b>NOTE:</b> Volume status is based on the volume status checks, and
 * does not reflect the volume state. Therefore, volume status does not
 * indicate volumes in the error state (for example, when a volume is
 * incapable of accepting I/O.)
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVolumeStatus(DescribeVolumeStatusRequest)
 */
public class DescribeVolumeStatusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeVolumeStatusRequest> {

    /**
     * One or more volume IDs. <p>Default: Describes all your volumes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> volumeIds;

    /**
     * One or more filters. <ul> <li> <p><code>action.code</code> - The
     * action code for the event (for example,
     * <code>enable-volume-io</code>). </li> <li>
     * <p><code>action.description</code> - A description of the action.
     * </li> <li> <p><code>action.event-id</code> - The event ID associated
     * with the action. </li> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.event-id</code> - The event ID. </li> <li>
     * <p><code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>;
     * for <code>io-performance</code>: <code>io-performance:degraded</code>
     * | <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>). </li> <li>
     * <p><code>event.not-after</code> - The latest end time for the event.
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the event. </li> <li> <p><code>volume-status.details-name</code> -
     * The cause for <code>volume-status.status</code>
     * (<code>io-enabled</code> | <code>io-performance</code>). </li> <li>
     * <p><code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> |
     * <code>degraded</code> | <code>severely-degraded</code> |
     * <code>stalled</code>). </li> <li> <p><code>volume-status.status</code>
     * - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>). </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumeStatus</code> request. When the results of the
     * request exceed <code>MaxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code>
     * when there are no more results to return.
     */
    private String nextToken;

    /**
     * The maximum number of volume results returned by
     * <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumeStatus</code> returns all results. You cannot
     * specify this parameter and the volume IDs parameter in the same
     * request.
     */
    private Integer maxResults;

    /**
     * One or more volume IDs. <p>Default: Describes all your volumes.
     *
     * @return One or more volume IDs. <p>Default: Describes all your volumes.
     */
    public java.util.List<String> getVolumeIds() {
        if (volumeIds == null) {
              volumeIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              volumeIds.setAutoConstruct(true);
        }
        return volumeIds;
    }
    
    /**
     * One or more volume IDs. <p>Default: Describes all your volumes.
     *
     * @param volumeIds One or more volume IDs. <p>Default: Describes all your volumes.
     */
    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> volumeIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(volumeIds.size());
        volumeIdsCopy.addAll(volumeIds);
        this.volumeIds = volumeIdsCopy;
    }
    
    /**
     * One or more volume IDs. <p>Default: Describes all your volumes.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVolumeIds(java.util.Collection)} or {@link
     * #withVolumeIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds One or more volume IDs. <p>Default: Describes all your volumes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeStatusRequest withVolumeIds(String... volumeIds) {
        if (getVolumeIds() == null) setVolumeIds(new java.util.ArrayList<String>(volumeIds.length));
        for (String value : volumeIds) {
            getVolumeIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more volume IDs. <p>Default: Describes all your volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds One or more volume IDs. <p>Default: Describes all your volumes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeStatusRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> volumeIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(volumeIds.size());
            volumeIdsCopy.addAll(volumeIds);
            this.volumeIds = volumeIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>action.code</code> - The
     * action code for the event (for example,
     * <code>enable-volume-io</code>). </li> <li>
     * <p><code>action.description</code> - A description of the action.
     * </li> <li> <p><code>action.event-id</code> - The event ID associated
     * with the action. </li> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.event-id</code> - The event ID. </li> <li>
     * <p><code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>;
     * for <code>io-performance</code>: <code>io-performance:degraded</code>
     * | <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>). </li> <li>
     * <p><code>event.not-after</code> - The latest end time for the event.
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the event. </li> <li> <p><code>volume-status.details-name</code> -
     * The cause for <code>volume-status.status</code>
     * (<code>io-enabled</code> | <code>io-performance</code>). </li> <li>
     * <p><code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> |
     * <code>degraded</code> | <code>severely-degraded</code> |
     * <code>stalled</code>). </li> <li> <p><code>volume-status.status</code>
     * - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>). </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>action.code</code> - The
     *         action code for the event (for example,
     *         <code>enable-volume-io</code>). </li> <li>
     *         <p><code>action.description</code> - A description of the action.
     *         </li> <li> <p><code>action.event-id</code> - The event ID associated
     *         with the action. </li> <li> <p><code>availability-zone</code> - The
     *         Availability Zone of the instance. </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.event-id</code> - The event ID. </li> <li>
     *         <p><code>event.event-type</code> - The event type (for
     *         <code>io-enabled</code>: <code>passed</code> | <code>failed</code>;
     *         for <code>io-performance</code>: <code>io-performance:degraded</code>
     *         | <code>io-performance:severely-degraded</code> |
     *         <code>io-performance:stalled</code>). </li> <li>
     *         <p><code>event.not-after</code> - The latest end time for the event.
     *         </li> <li> <p><code>event.not-before</code> - The earliest start time
     *         for the event. </li> <li> <p><code>volume-status.details-name</code> -
     *         The cause for <code>volume-status.status</code>
     *         (<code>io-enabled</code> | <code>io-performance</code>). </li> <li>
     *         <p><code>volume-status.details-status</code> - The status of
     *         <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     *         <code>passed</code> | <code>failed</code>; for
     *         <code>io-performance</code>: <code>normal</code> |
     *         <code>degraded</code> | <code>severely-degraded</code> |
     *         <code>stalled</code>). </li> <li> <p><code>volume-status.status</code>
     *         - The status of the volume (<code>ok</code> | <code>impaired</code> |
     *         <code>warning</code> | <code>insufficient-data</code>). </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>action.code</code> - The
     * action code for the event (for example,
     * <code>enable-volume-io</code>). </li> <li>
     * <p><code>action.description</code> - A description of the action.
     * </li> <li> <p><code>action.event-id</code> - The event ID associated
     * with the action. </li> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.event-id</code> - The event ID. </li> <li>
     * <p><code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>;
     * for <code>io-performance</code>: <code>io-performance:degraded</code>
     * | <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>). </li> <li>
     * <p><code>event.not-after</code> - The latest end time for the event.
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the event. </li> <li> <p><code>volume-status.details-name</code> -
     * The cause for <code>volume-status.status</code>
     * (<code>io-enabled</code> | <code>io-performance</code>). </li> <li>
     * <p><code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> |
     * <code>degraded</code> | <code>severely-degraded</code> |
     * <code>stalled</code>). </li> <li> <p><code>volume-status.status</code>
     * - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>). </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>action.code</code> - The
     *         action code for the event (for example,
     *         <code>enable-volume-io</code>). </li> <li>
     *         <p><code>action.description</code> - A description of the action.
     *         </li> <li> <p><code>action.event-id</code> - The event ID associated
     *         with the action. </li> <li> <p><code>availability-zone</code> - The
     *         Availability Zone of the instance. </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.event-id</code> - The event ID. </li> <li>
     *         <p><code>event.event-type</code> - The event type (for
     *         <code>io-enabled</code>: <code>passed</code> | <code>failed</code>;
     *         for <code>io-performance</code>: <code>io-performance:degraded</code>
     *         | <code>io-performance:severely-degraded</code> |
     *         <code>io-performance:stalled</code>). </li> <li>
     *         <p><code>event.not-after</code> - The latest end time for the event.
     *         </li> <li> <p><code>event.not-before</code> - The earliest start time
     *         for the event. </li> <li> <p><code>volume-status.details-name</code> -
     *         The cause for <code>volume-status.status</code>
     *         (<code>io-enabled</code> | <code>io-performance</code>). </li> <li>
     *         <p><code>volume-status.details-status</code> - The status of
     *         <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     *         <code>passed</code> | <code>failed</code>; for
     *         <code>io-performance</code>: <code>normal</code> |
     *         <code>degraded</code> | <code>severely-degraded</code> |
     *         <code>stalled</code>). </li> <li> <p><code>volume-status.status</code>
     *         - The status of the volume (<code>ok</code> | <code>impaired</code> |
     *         <code>warning</code> | <code>insufficient-data</code>). </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>action.code</code> - The
     * action code for the event (for example,
     * <code>enable-volume-io</code>). </li> <li>
     * <p><code>action.description</code> - A description of the action.
     * </li> <li> <p><code>action.event-id</code> - The event ID associated
     * with the action. </li> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.event-id</code> - The event ID. </li> <li>
     * <p><code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>;
     * for <code>io-performance</code>: <code>io-performance:degraded</code>
     * | <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>). </li> <li>
     * <p><code>event.not-after</code> - The latest end time for the event.
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the event. </li> <li> <p><code>volume-status.details-name</code> -
     * The cause for <code>volume-status.status</code>
     * (<code>io-enabled</code> | <code>io-performance</code>). </li> <li>
     * <p><code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> |
     * <code>degraded</code> | <code>severely-degraded</code> |
     * <code>stalled</code>). </li> <li> <p><code>volume-status.status</code>
     * - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>). </li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>action.code</code> - The
     *         action code for the event (for example,
     *         <code>enable-volume-io</code>). </li> <li>
     *         <p><code>action.description</code> - A description of the action.
     *         </li> <li> <p><code>action.event-id</code> - The event ID associated
     *         with the action. </li> <li> <p><code>availability-zone</code> - The
     *         Availability Zone of the instance. </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.event-id</code> - The event ID. </li> <li>
     *         <p><code>event.event-type</code> - The event type (for
     *         <code>io-enabled</code>: <code>passed</code> | <code>failed</code>;
     *         for <code>io-performance</code>: <code>io-performance:degraded</code>
     *         | <code>io-performance:severely-degraded</code> |
     *         <code>io-performance:stalled</code>). </li> <li>
     *         <p><code>event.not-after</code> - The latest end time for the event.
     *         </li> <li> <p><code>event.not-before</code> - The earliest start time
     *         for the event. </li> <li> <p><code>volume-status.details-name</code> -
     *         The cause for <code>volume-status.status</code>
     *         (<code>io-enabled</code> | <code>io-performance</code>). </li> <li>
     *         <p><code>volume-status.details-status</code> - The status of
     *         <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     *         <code>passed</code> | <code>failed</code>; for
     *         <code>io-performance</code>: <code>normal</code> |
     *         <code>degraded</code> | <code>severely-degraded</code> |
     *         <code>stalled</code>). </li> <li> <p><code>volume-status.status</code>
     *         - The status of the volume (<code>ok</code> | <code>impaired</code> |
     *         <code>warning</code> | <code>insufficient-data</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeStatusRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>action.code</code> - The
     * action code for the event (for example,
     * <code>enable-volume-io</code>). </li> <li>
     * <p><code>action.description</code> - A description of the action.
     * </li> <li> <p><code>action.event-id</code> - The event ID associated
     * with the action. </li> <li> <p><code>availability-zone</code> - The
     * Availability Zone of the instance. </li> <li>
     * <p><code>event.description</code> - A description of the event. </li>
     * <li> <p><code>event.event-id</code> - The event ID. </li> <li>
     * <p><code>event.event-type</code> - The event type (for
     * <code>io-enabled</code>: <code>passed</code> | <code>failed</code>;
     * for <code>io-performance</code>: <code>io-performance:degraded</code>
     * | <code>io-performance:severely-degraded</code> |
     * <code>io-performance:stalled</code>). </li> <li>
     * <p><code>event.not-after</code> - The latest end time for the event.
     * </li> <li> <p><code>event.not-before</code> - The earliest start time
     * for the event. </li> <li> <p><code>volume-status.details-name</code> -
     * The cause for <code>volume-status.status</code>
     * (<code>io-enabled</code> | <code>io-performance</code>). </li> <li>
     * <p><code>volume-status.details-status</code> - The status of
     * <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     * <code>passed</code> | <code>failed</code>; for
     * <code>io-performance</code>: <code>normal</code> |
     * <code>degraded</code> | <code>severely-degraded</code> |
     * <code>stalled</code>). </li> <li> <p><code>volume-status.status</code>
     * - The status of the volume (<code>ok</code> | <code>impaired</code> |
     * <code>warning</code> | <code>insufficient-data</code>). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>action.code</code> - The
     *         action code for the event (for example,
     *         <code>enable-volume-io</code>). </li> <li>
     *         <p><code>action.description</code> - A description of the action.
     *         </li> <li> <p><code>action.event-id</code> - The event ID associated
     *         with the action. </li> <li> <p><code>availability-zone</code> - The
     *         Availability Zone of the instance. </li> <li>
     *         <p><code>event.description</code> - A description of the event. </li>
     *         <li> <p><code>event.event-id</code> - The event ID. </li> <li>
     *         <p><code>event.event-type</code> - The event type (for
     *         <code>io-enabled</code>: <code>passed</code> | <code>failed</code>;
     *         for <code>io-performance</code>: <code>io-performance:degraded</code>
     *         | <code>io-performance:severely-degraded</code> |
     *         <code>io-performance:stalled</code>). </li> <li>
     *         <p><code>event.not-after</code> - The latest end time for the event.
     *         </li> <li> <p><code>event.not-before</code> - The earliest start time
     *         for the event. </li> <li> <p><code>volume-status.details-name</code> -
     *         The cause for <code>volume-status.status</code>
     *         (<code>io-enabled</code> | <code>io-performance</code>). </li> <li>
     *         <p><code>volume-status.details-status</code> - The status of
     *         <code>volume-status.details-name</code> (for <code>io-enabled</code>:
     *         <code>passed</code> | <code>failed</code>; for
     *         <code>io-performance</code>: <code>normal</code> |
     *         <code>degraded</code> | <code>severely-degraded</code> |
     *         <code>stalled</code>). </li> <li> <p><code>volume-status.status</code>
     *         - The status of the volume (<code>ok</code> | <code>impaired</code> |
     *         <code>warning</code> | <code>insufficient-data</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeStatusRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumeStatus</code> request. When the results of the
     * request exceed <code>MaxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code>
     * when there are no more results to return.
     *
     * @return The <code>NextToken</code> value to include in a future
     *         <code>DescribeVolumeStatus</code> request. When the results of the
     *         request exceed <code>MaxResults</code>, this value can be used to
     *         retrieve the next page of results. This value is <code>null</code>
     *         when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumeStatus</code> request. When the results of the
     * request exceed <code>MaxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code>
     * when there are no more results to return.
     *
     * @param nextToken The <code>NextToken</code> value to include in a future
     *         <code>DescribeVolumeStatus</code> request. When the results of the
     *         request exceed <code>MaxResults</code>, this value can be used to
     *         retrieve the next page of results. This value is <code>null</code>
     *         when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumeStatus</code> request. When the results of the
     * request exceed <code>MaxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code>
     * when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <code>NextToken</code> value to include in a future
     *         <code>DescribeVolumeStatus</code> request. When the results of the
     *         request exceed <code>MaxResults</code>, this value can be used to
     *         retrieve the next page of results. This value is <code>null</code>
     *         when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeStatusRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of volume results returned by
     * <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumeStatus</code> returns all results. You cannot
     * specify this parameter and the volume IDs parameter in the same
     * request.
     *
     * @return The maximum number of volume results returned by
     *         <code>DescribeVolumeStatus</code> in paginated output. When this
     *         parameter is used, the request only returns <code>MaxResults</code>
     *         results in a single page along with a <code>NextToken</code> response
     *         element. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value larger than 1000, only 1000
     *         results are returned. If this parameter is not used, then
     *         <code>DescribeVolumeStatus</code> returns all results. You cannot
     *         specify this parameter and the volume IDs parameter in the same
     *         request.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of volume results returned by
     * <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumeStatus</code> returns all results. You cannot
     * specify this parameter and the volume IDs parameter in the same
     * request.
     *
     * @param maxResults The maximum number of volume results returned by
     *         <code>DescribeVolumeStatus</code> in paginated output. When this
     *         parameter is used, the request only returns <code>MaxResults</code>
     *         results in a single page along with a <code>NextToken</code> response
     *         element. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value larger than 1000, only 1000
     *         results are returned. If this parameter is not used, then
     *         <code>DescribeVolumeStatus</code> returns all results. You cannot
     *         specify this parameter and the volume IDs parameter in the same
     *         request.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of volume results returned by
     * <code>DescribeVolumeStatus</code> in paginated output. When this
     * parameter is used, the request only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumeStatus</code> returns all results. You cannot
     * specify this parameter and the volume IDs parameter in the same
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of volume results returned by
     *         <code>DescribeVolumeStatus</code> in paginated output. When this
     *         parameter is used, the request only returns <code>MaxResults</code>
     *         results in a single page along with a <code>NextToken</code> response
     *         element. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value larger than 1000, only 1000
     *         results are returned. If this parameter is not used, then
     *         <code>DescribeVolumeStatus</code> returns all results. You cannot
     *         specify this parameter and the volume IDs parameter in the same
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumeStatusRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeVolumeStatusRequest> getDryRunRequest() {
        Request<DescribeVolumeStatusRequest> request = new DescribeVolumeStatusRequestMarshaller().marshall(this);
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
        if (getVolumeIds() != null) sb.append("VolumeIds: " + getVolumeIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVolumeStatusRequest == false) return false;
        DescribeVolumeStatusRequest other = (DescribeVolumeStatusRequest)obj;
        
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null) return false;
        if (other.getVolumeIds() != null && other.getVolumeIds().equals(this.getVolumeIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeVolumeStatusRequest clone() {
        
            return (DescribeVolumeStatusRequest) super.clone();
    }

}
    
/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeEvents(DescribeEventsRequest) DescribeEvents operation}.
 * <p>
 * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events specific to a particular cluster,
 * security group, snapshot or parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeEvents(DescribeEventsRequest)
 */
public class DescribeEventsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the event source for which events will be returned.
     * If this parameter is not specified, then all sources are included in
     * the response. <p>Constraints: <p>If <i>SourceIdentifier</i> is
     * supplied, <i>SourceType</i> must also be provided. <ul> <li>Specify a
     * cluster identifier when <i>SourceType</i> is
     * <code>cluster</code>.</li> <li>Specify a cluster security group name
     * when <i>SourceType</i> is <code>cluster-security-group</code>.</li>
     * <li>Specify a cluster parameter group name when <i>SourceType</i> is
     * <code>cluster-parameter-group</code>.</li> <li>Specify a cluster
     * snapshot identifier when <i>SourceType</i> is
     * <code>cluster-snapshot</code>.</li> </ul>
     */
    private String sourceIdentifier;

    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     * supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     * <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     * cluster identifier.</li> <li>Specify
     * <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     * cluster security group name.</li> <li>Specify
     * <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     * cluster parameter group name.</li> <li>Specify
     * <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     * cluster snapshot identifier.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     */
    private String sourceType;

    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     */
    private java.util.Date startTime;

    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     */
    private java.util.Date endTime;

    /**
     * The number of minutes prior to the time of the request for which to
     * retrieve events. For example, if the request is sent at 18:00 and you
     * specify a duration of 60, then only events which have occurred after
     * 17:00 will be returned. <p>Default: <code>60</code>
     */
    private Integer duration;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: Value must
     * be at least 20 and no more than 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned from a previous <b>DescribeEvents</b>
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * The identifier of the event source for which events will be returned.
     * If this parameter is not specified, then all sources are included in
     * the response. <p>Constraints: <p>If <i>SourceIdentifier</i> is
     * supplied, <i>SourceType</i> must also be provided. <ul> <li>Specify a
     * cluster identifier when <i>SourceType</i> is
     * <code>cluster</code>.</li> <li>Specify a cluster security group name
     * when <i>SourceType</i> is <code>cluster-security-group</code>.</li>
     * <li>Specify a cluster parameter group name when <i>SourceType</i> is
     * <code>cluster-parameter-group</code>.</li> <li>Specify a cluster
     * snapshot identifier when <i>SourceType</i> is
     * <code>cluster-snapshot</code>.</li> </ul>
     *
     * @return The identifier of the event source for which events will be returned.
     *         If this parameter is not specified, then all sources are included in
     *         the response. <p>Constraints: <p>If <i>SourceIdentifier</i> is
     *         supplied, <i>SourceType</i> must also be provided. <ul> <li>Specify a
     *         cluster identifier when <i>SourceType</i> is
     *         <code>cluster</code>.</li> <li>Specify a cluster security group name
     *         when <i>SourceType</i> is <code>cluster-security-group</code>.</li>
     *         <li>Specify a cluster parameter group name when <i>SourceType</i> is
     *         <code>cluster-parameter-group</code>.</li> <li>Specify a cluster
     *         snapshot identifier when <i>SourceType</i> is
     *         <code>cluster-snapshot</code>.</li> </ul>
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }
    
    /**
     * The identifier of the event source for which events will be returned.
     * If this parameter is not specified, then all sources are included in
     * the response. <p>Constraints: <p>If <i>SourceIdentifier</i> is
     * supplied, <i>SourceType</i> must also be provided. <ul> <li>Specify a
     * cluster identifier when <i>SourceType</i> is
     * <code>cluster</code>.</li> <li>Specify a cluster security group name
     * when <i>SourceType</i> is <code>cluster-security-group</code>.</li>
     * <li>Specify a cluster parameter group name when <i>SourceType</i> is
     * <code>cluster-parameter-group</code>.</li> <li>Specify a cluster
     * snapshot identifier when <i>SourceType</i> is
     * <code>cluster-snapshot</code>.</li> </ul>
     *
     * @param sourceIdentifier The identifier of the event source for which events will be returned.
     *         If this parameter is not specified, then all sources are included in
     *         the response. <p>Constraints: <p>If <i>SourceIdentifier</i> is
     *         supplied, <i>SourceType</i> must also be provided. <ul> <li>Specify a
     *         cluster identifier when <i>SourceType</i> is
     *         <code>cluster</code>.</li> <li>Specify a cluster security group name
     *         when <i>SourceType</i> is <code>cluster-security-group</code>.</li>
     *         <li>Specify a cluster parameter group name when <i>SourceType</i> is
     *         <code>cluster-parameter-group</code>.</li> <li>Specify a cluster
     *         snapshot identifier when <i>SourceType</i> is
     *         <code>cluster-snapshot</code>.</li> </ul>
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }
    
    /**
     * The identifier of the event source for which events will be returned.
     * If this parameter is not specified, then all sources are included in
     * the response. <p>Constraints: <p>If <i>SourceIdentifier</i> is
     * supplied, <i>SourceType</i> must also be provided. <ul> <li>Specify a
     * cluster identifier when <i>SourceType</i> is
     * <code>cluster</code>.</li> <li>Specify a cluster security group name
     * when <i>SourceType</i> is <code>cluster-security-group</code>.</li>
     * <li>Specify a cluster parameter group name when <i>SourceType</i> is
     * <code>cluster-parameter-group</code>.</li> <li>Specify a cluster
     * snapshot identifier when <i>SourceType</i> is
     * <code>cluster-snapshot</code>.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdentifier The identifier of the event source for which events will be returned.
     *         If this parameter is not specified, then all sources are included in
     *         the response. <p>Constraints: <p>If <i>SourceIdentifier</i> is
     *         supplied, <i>SourceType</i> must also be provided. <ul> <li>Specify a
     *         cluster identifier when <i>SourceType</i> is
     *         <code>cluster</code>.</li> <li>Specify a cluster security group name
     *         when <i>SourceType</i> is <code>cluster-security-group</code>.</li>
     *         <li>Specify a cluster parameter group name when <i>SourceType</i> is
     *         <code>cluster-parameter-group</code>.</li> <li>Specify a cluster
     *         snapshot identifier when <i>SourceType</i> is
     *         <code>cluster-snapshot</code>.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     * supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     * <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     * cluster identifier.</li> <li>Specify
     * <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     * cluster security group name.</li> <li>Specify
     * <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     * cluster parameter group name.</li> <li>Specify
     * <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     * cluster snapshot identifier.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @return The event source to retrieve events for. If no value is specified, all
     *         events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     *         supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     *         <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     *         cluster identifier.</li> <li>Specify
     *         <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     *         cluster security group name.</li> <li>Specify
     *         <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     *         cluster parameter group name.</li> <li>Specify
     *         <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     *         cluster snapshot identifier.</li> </ul>
     *
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     * supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     * <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     * cluster identifier.</li> <li>Specify
     * <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     * cluster security group name.</li> <li>Specify
     * <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     * cluster parameter group name.</li> <li>Specify
     * <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     * cluster snapshot identifier.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @param sourceType The event source to retrieve events for. If no value is specified, all
     *         events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     *         supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     *         <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     *         cluster identifier.</li> <li>Specify
     *         <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     *         cluster security group name.</li> <li>Specify
     *         <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     *         cluster parameter group name.</li> <li>Specify
     *         <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     *         cluster snapshot identifier.</li> </ul>
     *
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     * supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     * <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     * cluster identifier.</li> <li>Specify
     * <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     * cluster security group name.</li> <li>Specify
     * <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     * cluster parameter group name.</li> <li>Specify
     * <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     * cluster snapshot identifier.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @param sourceType The event source to retrieve events for. If no value is specified, all
     *         events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     *         supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     *         <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     *         cluster identifier.</li> <li>Specify
     *         <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     *         cluster security group name.</li> <li>Specify
     *         <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     *         cluster parameter group name.</li> <li>Specify
     *         <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     *         cluster snapshot identifier.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceType
     */
    public DescribeEventsRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     * supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     * <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     * cluster identifier.</li> <li>Specify
     * <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     * cluster security group name.</li> <li>Specify
     * <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     * cluster parameter group name.</li> <li>Specify
     * <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     * cluster snapshot identifier.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @param sourceType The event source to retrieve events for. If no value is specified, all
     *         events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     *         supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     *         <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     *         cluster identifier.</li> <li>Specify
     *         <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     *         cluster security group name.</li> <li>Specify
     *         <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     *         cluster parameter group name.</li> <li>Specify
     *         <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     *         cluster snapshot identifier.</li> </ul>
     *
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }
    
    /**
     * The event source to retrieve events for. If no value is specified, all
     * events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     * supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     * <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     * cluster identifier.</li> <li>Specify
     * <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     * cluster security group name.</li> <li>Specify
     * <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     * cluster parameter group name.</li> <li>Specify
     * <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     * cluster snapshot identifier.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @param sourceType The event source to retrieve events for. If no value is specified, all
     *         events are returned. <p>Constraints: <p>If <i>SourceType</i> is
     *         supplied, <i>SourceIdentifier</i> must also be provided. <ul>
     *         <li>Specify <code>cluster</code> when <i>SourceIdentifier</i> is a
     *         cluster identifier.</li> <li>Specify
     *         <code>cluster-security-group</code> when <i>SourceIdentifier</i> is a
     *         cluster security group name.</li> <li>Specify
     *         <code>cluster-parameter-group</code> when <i>SourceIdentifier</i> is a
     *         cluster parameter group name.</li> <li>Specify
     *         <code>cluster-snapshot</code> when <i>SourceIdentifier</i> is a
     *         cluster snapshot identifier.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceType
     */
    public DescribeEventsRequest withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     *
     * @return The beginning of the time interval to retrieve events for, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     *
     * @param startTime The beginning of the time interval to retrieve events for, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The beginning of the time interval to retrieve events for, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The beginning of the time interval to retrieve events for, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     *
     * @return The end of the time interval for which to retrieve events, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     *
     * @param endTime The end of the time interval for which to retrieve events, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The end of the time interval for which to retrieve events, specified
     * in ISO 8601 format. For more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The end of the time interval for which to retrieve events, specified
     *         in ISO 8601 format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2009-07-08T18:00Z</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The number of minutes prior to the time of the request for which to
     * retrieve events. For example, if the request is sent at 18:00 and you
     * specify a duration of 60, then only events which have occurred after
     * 17:00 will be returned. <p>Default: <code>60</code>
     *
     * @return The number of minutes prior to the time of the request for which to
     *         retrieve events. For example, if the request is sent at 18:00 and you
     *         specify a duration of 60, then only events which have occurred after
     *         17:00 will be returned. <p>Default: <code>60</code>
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * The number of minutes prior to the time of the request for which to
     * retrieve events. For example, if the request is sent at 18:00 and you
     * specify a duration of 60, then only events which have occurred after
     * 17:00 will be returned. <p>Default: <code>60</code>
     *
     * @param duration The number of minutes prior to the time of the request for which to
     *         retrieve events. For example, if the request is sent at 18:00 and you
     *         specify a duration of 60, then only events which have occurred after
     *         17:00 will be returned. <p>Default: <code>60</code>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * The number of minutes prior to the time of the request for which to
     * retrieve events. For example, if the request is sent at 18:00 and you
     * specify a duration of 60, then only events which have occurred after
     * 17:00 will be returned. <p>Default: <code>60</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The number of minutes prior to the time of the request for which to
     *         retrieve events. For example, if the request is sent at 18:00 and you
     *         specify a duration of 60, then only events which have occurred after
     *         17:00 will be returned. <p>Default: <code>60</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: Value must
     * be at least 20 and no more than 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: Value must
     *         be at least 20 and no more than 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: Value must
     * be at least 20 and no more than 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: Value must
     *         be at least 20 and no more than 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: Value must
     * be at least 20 and no more than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: Value must
     *         be at least 20 and no more than 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned from a previous <b>DescribeEvents</b>
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     *
     * @return An optional marker returned from a previous <b>DescribeEvents</b>
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned from a previous <b>DescribeEvents</b>
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     *
     * @param marker An optional marker returned from a previous <b>DescribeEvents</b>
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned from a previous <b>DescribeEvents</b>
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned from a previous <b>DescribeEvents</b>
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
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
        if (getSourceIdentifier() != null) sb.append("SourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceType() != null) sb.append("SourceType: " + getSourceType() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEventsRequest == false) return false;
        DescribeEventsRequest other = (DescribeEventsRequest)obj;
        
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null) return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false) return false; 
        if (other.getSourceType() == null ^ this.getSourceType() == null) return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    